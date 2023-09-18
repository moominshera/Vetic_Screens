import {View, Text, TouchableOpacity, Image, StyleSheet} from 'react-native';
import React from 'react';

const SelectLanguageButtons = ({
  arabicBtnPressHandler,
  englishBtnPressHandler,
  showForm,
  arabic,
  english,
  navigation,
  setShowForm,
}) => {
  const nextPageHandler = () => {
    if (arabic || english) {
      navigation.navigate('RegisterScreen', {
        showForm: showForm,
        arabic: arabic,
      });
    }
  };

  return (
    <View className="flex-1 justify-between">
      <View>
        <TouchableOpacity onPress={arabicBtnPressHandler}>
          <View
            className="bg-white px-4 py-3 mb-4 flex-row justify-start items-center rounded-md"
            style={arabic ? styles.btnBorderPressed : styles.btnBorder}>
            <Image source={require('../assests/arabic.png')} />
            <Text
              className="text-sm rounded-md ml-2 font-light "
              style={{color: '#6F6F6F'}}>
              العربية
            </Text>
          </View>
        </TouchableOpacity>
        <TouchableOpacity onPress={englishBtnPressHandler}>
          <View
            className="bg-white px-4 py-3 mb-8 flex-row justify-start items-center rounded-md"
            style={english ? styles.btnBorderPressed : styles.btnBorder}>
            <Image source={require('../assests/english.png')} />
            <Text
              className="text-sm rounded-md ml-2 font-light"
              style={{color: '#6F6F6F'}}>
              English
            </Text>
          </View>
        </TouchableOpacity>
      </View>
      <TouchableOpacity onPress={nextPageHandler}>
        <View
          className="px-4 py-3 mb-12 items-center justify-center rounded-md h-14"
          style={english || arabic ? styles.pressed : styles.btnBackground}>
          <Text
            className="text-sm font-bold rounded-md ml-2 "
            style={{color: '#787878'}}>
            {arabic ? 'متابعة' : 'Next'}
          </Text>
        </View>
      </TouchableOpacity>
    </View>
  );
};

const styles = StyleSheet.create({
  pressed: {
    backgroundColor: '#FFCC00',
  },
  btnBorder: {
    borderWidth: 1,
    borderColor: 'rgba(3, 24, 13, 0.32)',
  },
  btnBackground: {
    backgroundColor: '#CACACA',
  },
  btnBorderPressed: {
    borderWidth: 1,
    borderColor: '#FFCC00',
  },
});

export default SelectLanguageButtons;
