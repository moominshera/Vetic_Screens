// import React, {useState} from 'react';
// import {
//   Modal,
//   View,
//   Text,
//   TouchableOpacity,
//   TouchableWithoutFeedback,
// } from 'react-native';

// const DrawerNavigation = ({visible, onClose}) => {
//   return (
//     <Modal visible={visible} transparent={true} onRequestClose={onClose}>
//       <TouchableWithoutFeedback onPress={onClose}>
//         <View
//           style={{
//             flex: 1,

//             justifyContent: 'center',
//             alignItems: 'center',
//             backgroundColor: 'rgba(0, 0, 0, 0.3)',
//           }}>
//           <View
//             style={{
//               backgroundColor: 'white',
//               padding: 20,
//               width: 200,
//               height: '100%',
//             }}>
//             <Text>This is your modal content</Text>
//           </View>
//         </View>
//       </TouchableWithoutFeedback>
//     </Modal>
//   );
// };

// export default DrawerNavigation;
import React, {useState, useLayoutEffect, useEffect} from 'react';
import {
  Image,
  Modal,
  View,
  Text,
  TouchableOpacity,
  TouchableWithoutFeedback,
  Dimensions,
} from 'react-native';
import {useNavigation} from '@react-navigation/native';
import HelpModal from '../../components/HelpModal';
import LanguageModal from '../../components/LanguageMdal';

const DrawerNavigation = ({visible, onClose}) => {
  const navigation = useNavigation();
  useLayoutEffect(() => {
    navigation.setOptions({
      headerShown: false, // Hide the header for this screen
    });
  }, [navigation]);

  const [isHelpModalVisible, setIsHelpModalVisible] = useState(false);

  const [isLangModalVisible, setIsLangModalVisible] = useState(false);

  // const handleModalContentTap = e => {
  //   // Prevent the tap event from propagating to the parent container (TouchableWithoutFeedback).
  //   e.stopPropagation();
  // };

  const width = Dimensions.get('window').width;

  const adjustWidth = width / 1.5;

  return (
    <View className="relative">
      <Modal visible={visible} transparent={true} onRequestClose={onClose}>
        <TouchableWithoutFeedback onPress={onClose}>
          <View
            style={{
              flex: 1,
              justifyContent: 'flex-start',
              alignItems: 'baseline',
              backgroundColor: 'rgba(0, 0, 0, 0.3)',
            }}>
            <TouchableWithoutFeedback>
              <View
                className=" justify-between py-4"
                style={{
                  backgroundColor: 'white',
                  padding: 20,
                  width: adjustWidth,

                  height: '100%',
                }}>
                <View className="flex-row space-x-4 items-center mt-3">
                  <TouchableOpacity onPress={onClose}>
                    <Image
                      className=""
                      source={require('../../assests/adminIcon.png')}
                      resizeMode="contain"
                    />
                  </TouchableOpacity>
                  <View>
                    <Text
                      className="font-bold text-base"
                      style={{color: '#242424'}}>
                      Sa’ad Al Hameed
                    </Text>
                    <Text className="text-neutral-500">
                      Device ID : 96GF0X1
                    </Text>
                  </View>
                </View>
                <View className="mb-10 flex space-y-8 ">
                  <TouchableOpacity
                    onPress={() => setIsLangModalVisible(!isLangModalVisible)}>
                    <View className="flex-row justify-between items-center">
                      <View className="flex-row space-x-3 items-center">
                        <Image
                          source={require('../../assests/AmericanIcon.png')}
                        />
                        <Text className="text-neutral-700 text-base">
                          English
                        </Text>
                      </View>
                      <Image
                        source={require('../../assests/ArrowRightHelp.png')}
                        style={{width: 7, height: 12}}
                      />
                    </View>
                  </TouchableOpacity>

                  <TouchableOpacity
                    onPress={() => setIsHelpModalVisible(!isHelpModalVisible)}>
                    <View className="flex-row justify-between items-center">
                      <View className="flex-row space-x-3 items-center">
                        <Image source={require('../../assests/help.png')} />
                        <Text className="text-neutral-700 text-base">Help</Text>
                      </View>
                      <Image
                        source={require('../../assests/ArrowRightHelp.png')}
                        style={{width: 7, height: 12}}
                      />
                    </View>
                  </TouchableOpacity>
                  <TouchableOpacity
                    onPress={() => navigation.navigate('PrivacyPolicy')}>
                    <View className="flex-row space-x-3 items-center">
                      <Image source={require('../../assests/shield.png')} />
                      <Text className="text-neutral-700 text-base">
                        Privacy Policy
                      </Text>
                    </View>
                  </TouchableOpacity>
                  <TouchableOpacity
                    onPress={() => navigation.navigate('About')}>
                    <View className="flex-row space-x-3 items-center">
                      <Image source={require('../../assests/helpCircle.png')} />
                      <Text className="text-neutral-700 text-base">
                        About Us
                      </Text>
                    </View>
                  </TouchableOpacity>
                </View>
              </View>
            </TouchableWithoutFeedback>
          </View>
        </TouchableWithoutFeedback>
      </Modal>
      <HelpModal
        className="absolute top-0"
        visible={isHelpModalVisible}
        onClose={() => setIsHelpModalVisible(false)}
      />
      <LanguageModal
        styles={{}}
        visible={isLangModalVisible}
        onClose={() => setIsLangModalVisible(false)}
      />
    </View>
  );
};

export default DrawerNavigation;
