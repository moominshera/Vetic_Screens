import React, {useState, useEffect} from 'react';
import {
  StyleSheet,
  View,
  Text,
  TouchableOpacity,
  Modal,
  TouchableWithoutFeedback,
  Dimensions,
} from 'react-native';

const OpenDropdown = ({isVisible, onClose, onSelect, selectedKey, data}) => {
  const [selectedItem, setSelectedItem] = useState(
    data.find(item => item.key === selectedKey),
  );

  const handleItemSelect = item => {
    setSelectedItem(item);
    onSelect(item);
    onClose();
  };

  useEffect(() => {
    // Set the selectedItem based on the selectedKey prop
    setSelectedItem(data.find(item => item.key === selectedKey));
  }, [isVisible, selectedKey]);

  const renderCustomItem = item => (
    <TouchableOpacity
      key={item.key}
      style={[
        styles.customItemContainer,
        {
          backgroundColor: item.key === selectedItem.key ? '#CAE2FF' : 'white',
        },
        // {fontSize: item.key === selectedItem.key ? '14' : '10'},
        // {fontWeight: item.key === selectedItem.key ? '700' : '400'},
      ]}
      onPress={() => handleItemSelect(item)}>
      <Text
        style={[
          styles.label,
          {
            fontSize: item.label === selectedItem.label ? 16 : 14,
            fontWeight: item.label === selectedItem.label ? 700 : 400,
          },
        ]}
        // Increase font size for the selected item
      >
        {item.label}
      </Text>
      <Text
        style={[
          styles.value,
          {
            fontSize: item.value === selectedItem.value ? 16 : 14,
            fontWeight: item.value === selectedItem.value ? 700 : 400,
          },
        ]}
        // Increase font size
      >
        {item.value}
      </Text>
      <Text
        style={[
          styles.percentage,
          {
            fontSize: item.value === selectedItem.value ? 16 : 14,
            fontWeight: item.value === selectedItem.value ? 700 : 400,
          },
        ]}>
        {item.percentage}
      </Text>
    </TouchableOpacity>
  );

  const handleModalPress = () => {
    onClose();
  };

  return (
    <Modal className="" transparent={true} visible={isVisible}>
      <TouchableWithoutFeedback onPress={handleModalPress}>
        <View className=" " style={styles.modalBackground}>
          <View className="absolute top-36 " style={styles.modalContent}>
            {data.map(item => renderCustomItem(item))}
          </View>
        </View>
      </TouchableWithoutFeedback>
    </Modal>
  );
};

const {width} = Dimensions.get('window');

const styles = StyleSheet.create({
  modalBackground: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'rgba(0, 0, 0, 0.5)', // Semi-transparent background
    width: width,
  },
  modalContent: {
    backgroundColor: 'white',
    paddingVertical: 10,
    borderRadius: 5,
    width: width - 30,
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  customItemContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingHorizontal: 10,
    paddingVertical: 8,
    borderBottomColor: 'gray',
    borderRadius: 5,
    fontWeight: '400',
    width: width - 50,
    position: 'relative',
    marginHorizontal: 'auto',
  },
  label: {
    flex: 2,
    fontSize: 16,
    fontWeight: '400',
  },
  value: {
    flex: 1,
    fontSize: 16,
    fontWeight: '400',
    color: '#03180D',
  },
  percentage: {
    flex: 1,
    fontSize: 14,
    fontWeight: '400',
    textAlign: 'right',
    // display: 'none',
  },
});

export default OpenDropdown;
