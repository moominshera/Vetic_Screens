import {View, Text} from 'react-native';
import React, {useLayoutEffect} from 'react';
// import {useFocusEffect} from '@react-navigation/native';
import HeaderNav from '../components/HeaderNav';
// import BackIcon from '../components/HeaderIcon';
const PrivacyPolicy = ({navigation}) => {
  useLayoutEffect(() => {
    navigation.setOptions({
      headerShown: true, // Hide the header for this screen
      header: props => <HeaderNav {...props} />,

      headerStyle: {
        backgroundColor: '#FFCC00',
      },
    });
  }, [navigation]);

  return (
    <View className="mx-2 mt-8">
      <Text className="text-base font-bold px-7">
        Effective Date: 05-08-2023
      </Text>
      <Text className="text-sm mt-2 px-7 font-normal">
        Vetic. We are committed to safeguarding your privacy and ensuring the
        security of your personal information. This Privacy Policy outlines how
        we collect, use, disclose, and protect your information when you use our
        App.
      </Text>
      <Text className="text-base font-bold mt-8 px-7">
        Information We Collect
      </Text>
      <Text className="text-sm mt-1 px-7 font-normal">
        We may collect the following types of information when you use our App:
      </Text>
      <View className="ml-3">
        <Text className="text-sm  px-7 font-normal">
          <Text className="text-lg font-extrabold ">. </Text> Personal
          Information: When you create an account, we may collect your name,
          email address, and other contact information.
        </Text>
        <Text className="text-sm  px-7 font-normal">
          <Text className="text-lg font-extrabold ">. </Text>Device Information:
          We may collect information about the devices you use to access the
          App, including device type, operating system, and unique device
          identifiers.
        </Text>
        <Text className="text-sm  px-7 font-normal">
          <Text className="text-lg font-extrabold  ">. </Text>Energy Consumption
          Data: Our App gathers data related to your energy consumption,
          including usage patterns of electronic devices connected to our
          monitoring device.
        </Text>
      </View>
    </View>
  );
};

export default PrivacyPolicy;
