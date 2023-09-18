import {View, Text, TouchableOpacity, Image, StyleSheet} from 'react-native';
import React, {useLayoutEffect, useState} from 'react';
import {SafeAreaView} from 'react-native-safe-area-context';
import Form from '../components/Form';
import SelectLanguageButtons from '../components/SelectLanguageButtons';

const Language = ({navigation}) => {
  useLayoutEffect(() => {
    navigation.setOptions({
      headerShown: false, // Hide the header for this screen
    });
  }, [navigation]);

  const [english, setEnglish] = useState(false);
  const [arabic, setArabic] = useState(false);
  const [showForm, setShowForm] = useState(false);

  const englishBtnPressHandler = () => {
    setArabic(false);
    setEnglish(true);
  };

  const arabicBtnPressHandler = () => {
    setEnglish(false);
    setArabic(true);
  };

  const showFormHandler = () => {
    if (english || arabic) {
      setShowForm(true);
    }
  };

  return (
    <SafeAreaView>
      <View className="h-full px-6">
        <View className="w-full flex-row mt-16 justify-between">
          <View
            className="h-1 flex-1 mr-1  rounded-full"
            style={{backgroundColor: '#424242'}}></View>
          <View
            className="h-1 flex-1 ml-1"
            style={showForm && styles.barBackground}></View>
        </View>
        <View className="mt-9 mb-7">
          <Text className="text-base font-semibold text-languageHeadingText">
            {showForm
              ? arabic
                ? 'التسجيل'
                : 'Registration'
              : 'Choose Language'}
          </Text>
        </View>
        <View className="flex-1 justify-between">
          <SelectLanguageButtons
            setShowForm={setShowForm}
            showForm={showForm}
            navigation={navigation}
            arabicBtnPressHandler={arabicBtnPressHandler}
            englishBtnPressHandler={englishBtnPressHandler}
            showFormHandler={showFormHandler}
            arabic={arabic}
            english={english}
          />
        </View>
      </View>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  pressed: {
    backgroundColor: '#FFCC00',
  },
  barBackground: {
    backgroundColor: '#424242',
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

export default Language;
