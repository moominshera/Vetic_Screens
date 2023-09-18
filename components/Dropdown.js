import React, {useState} from 'react';
import {View, Text, Image, TouchableOpacity} from 'react-native';
import OpenDropdown from './OpenDropdown';
const data = [
  {
    label: 'Total Usage',
    key: '1',
    value: '1',

    percentage: '89%',
  },
  {label: 'Bathroom', key: '2', value: '2', percentage: '42%'},
  {label: 'Item 3', key: '3', value: '3', percentage: '42%'},
  {label: 'Item 4', key: '4', value: '4', percentage: '42%'},
  {label: 'Item 5', key: '5', value: '5', percentage: '42%'},
  {label: 'Item 6', key: '6', value: '6', percentage: '42%'},
  {label: 'Item 7', key: '7', value: '7', percentage: '42%'},
  {label: 'Item 8', key: '8', value: '8', percentage: '42%'},
];

export default function DropdownComponent() {
  const [isDropdownVisible, setIsDropdownVisible] = useState(false);
  const [selectedItem, setSelectedItem] = useState(data[0]);

  const openDropdown = () => {
    setIsDropdownVisible(true);
  };

  const closeDropdown = () => {
    setIsDropdownVisible(false);
  };
  const handleSelect = item => {
    setSelectedItem(item);
  };

  return (
    <View className="flex justify-center  items-end mx-6 my-5  bg-white">
      <TouchableOpacity onPress={openDropdown}>
        <View className="flex-row items-center ">
          {/* <Text className="mr-4 text-blue-500  font-bold text-sm">
            {selectedItem ? selectedItem.label : 'Select Item'}
          </Text> */}
          <Text style={{color: '#66ADFF', fontWeight: '700'}}>
            {selectedItem ? selectedItem.label : 'Select an item'}
          </Text>
          <Image
            className="ml-2"
            source={
              isDropdownVisible
                ? require('../assests/ArrowUp.png')
                : require('../assests/ArrowDown.png')
            }
          />
        </View>
      </TouchableOpacity>

      <OpenDropdown
        isVisible={isDropdownVisible}
        onClose={closeDropdown}
        onSelect={handleSelect}
        data={data}
        selectedKey={selectedItem.key}
      />
    </View>
  );
}
