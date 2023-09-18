import {View, Text, Image, TouchableOpacity} from 'react-native';
import React, {useState} from 'react';
import DrawerNavigation from '../screens/Drawer/DrawerNavigation';

const AdminDashboard = () => {
  const [isModalVisible, setModalVisible] = useState(false);

  const toggleModal = () => {
    setModalVisible(!isModalVisible);
    console.log('clicked');
  };

  // useFocusEffect(() => {
  //   setModalVisible(true); // Open the modal when the screen gains focus
  // }, []);

  // const openModalOnFocus = React.useCallback(() => {
  //   setModalVisible(true); // Open the modal when the screen gains focus
  // }, []);

  // useFocusEffect(openModalOnFocus);

  return (
    <>
      <View className="bg-white">
        <View className="border-b" style={{borderColor: '#CBCBCB'}}>
          <View className="flex-row justify-between  pb-5 mt-5 px-5">
            <View className="flex-row space-x-3 justify-center items-center">
              <TouchableOpacity onPress={toggleModal}>
                <Image
                  className=""
                  source={require('../assests/adminIcon.png')}
                  resizeMode="contain"
                />
              </TouchableOpacity>

              <View>
                <Text
                  className="font-bold text-base"
                  style={{color: '#242424'}}>
                  Sa’ad Al Hameed
                </Text>
                <Text className="text-neutral-500">Device ID : 96GF0X1</Text>
              </View>
            </View>
            <View>
              <Image source={require('../assests/logoDash.png')} />
            </View>
          </View>
        </View>
        {isModalVisible && (
          <DrawerNavigation visible={isModalVisible} onClose={toggleModal} />
        )}
      </View>
    </>
  );
};

export default AdminDashboard;
