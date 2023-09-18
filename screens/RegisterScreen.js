import {View, Text, StyleSheet} from 'react-native';
import React, {useLayoutEffect} from 'react';
import {SafeAreaView} from 'react-native-safe-area-context';
import Form from '../components/Form';

const RegisterScreen = ({route, navigation}) => {
  showForm = route.params.showForm;
  arabic = route.params.arabic;
  useLayoutEffect(() => {
    navigation.setOptions({
      headerShown: false, // Hide the header for this screen
    });
  }, [navigation]);

  return (
    <SafeAreaView>
      <View className="h-full px-6">
        <View className="w-full flex-row mt-16 justify-between">
          <View className="flex-row justify-between items-center w-full">
            <View
              className="h-1 w-1/2 mr-1  rounded-full"
              style={{backgroundColor: '#424242'}}></View>
            <View
              className="h-1 w-1/2 mr-1  rounded-full"
              style={{backgroundColor: '#424242'}}></View>
          </View>
          <View
            className="h-1 flex-1 ml-1"
            style={showForm && styles.barBackground}></View>
        </View>
        <View className="mt-9 mb-7">
          <Text className="text-base font-semibold text-languageHeadingText">
            {arabic ? 'التسجيل' : 'Registration'}
          </Text>
        </View>
        <View className="flex-1 justify-between">
          <Form arabic={arabic} navigation={navigation} />
        </View>
      </View>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  barBackground: {
    backgroundColor: '#424242',
  },
});

export default RegisterScreen;
