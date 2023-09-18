import React, {useState} from 'react';
import {
  Modal,
  View,
  Text,
  TouchableOpacity,
  Image,
  TouchableWithoutFeedback,
  StyleSheet,
} from 'react-native';

const LanguageModal = ({visible, onClose}) => {
  return (
    <Modal visible={visible} transparent={true} onRequestClose={onClose}>
      <TouchableWithoutFeedback onPress={onClose}>
        <View
          className="flex-1 justify-center items-center"
          style={styles.modalBackground}>
          <Image
            style={styles.modalArrow}
            className="absolute"
            source={require('../assests/ArrorHelp.png')}
            // style={{width: 16, height: 16, top: '10%', left: '38%'}}
          />
          <TouchableWithoutFeedback>
            <View
              className="bg-white w-48 h-28 p-5 absolute  rounded-lg right-10  "
              style={styles.modalContent}>
              <View className="px-3  ">
                <TouchableOpacity disabled={true}>
                  <View
                    className="flex-row  space-x-3 border-b pb-3"
                    style={{borderColor: '#B3B3B3'}}>
                    <Image
                      source={require('../assests/AmericanIcon.png')}
                      style={{width: 18, height: 18}}
                    />
                    <Text
                      className="text-sm font-normal "
                      style={{color: '#4B4B4B'}}>
                      English
                    </Text>
                  </View>
                </TouchableOpacity>
                <TouchableOpacity
                  onPress={onClose}
                  className="flex-row mt-3  space-x-3">
                  <Image
                    source={require('../assests/ArabicIcon.png')}
                    style={{width: 18, height: 18}}
                  />
                  <Text
                    className="text-sm font-normal"
                    style={{color: '#4B4B4B'}}>
                    اتصل بـ "فيتك"
                  </Text>
                </TouchableOpacity>
              </View>
            </View>
          </TouchableWithoutFeedback>
        </View>
      </TouchableWithoutFeedback>
    </Modal>
  );
};

const styles = StyleSheet.create({
  modalBackground: {
    // flex: 1,
    // justifyContent: 'center',
    // alignItems: 'center',
    backgroundColor: 'rgba(0, 0, 0, 0.3)',
    position: 'relative',
  },
  modalContent: {
    // backgroundColor: 'white',
    // padding: 20,
    // width: 195,
    // height: 118,
    // position: 'absolute',
    bottom: 136,
    left: '40%',
    transform: [{translateY: -40}],
  },
  modalArrow: {
    width: 16,
    height: 16,
    bottom: 160,
    left: '38%',
    transform: [{translateY: -70}],
  },
});

export default LanguageModal;
