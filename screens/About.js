import {View, Text} from 'react-native';
import React, {useLayoutEffect} from 'react';
import HeaderNav from '../components/HeaderNav';
const About = ({navigation}) => {
  useLayoutEffect(() => {
    navigation.setOptions({
      headerShown: true,
      header: props => <HeaderNav {...props} />,

      headerStyle: {
        backgroundColor: '#FFCC00',
      },
    });
  }, [navigation]);

  return (
    <View className="mx-2 mt-8">
      <Text className="text-base font-bold px-7">About Us</Text>
      <Text className="text-sm mt-2 px-7 font-normal">
        Welcome to Vetic, your trusted partner in energy monitoring solutions.
        Established in 2004 and headquartered in Saudi Arabia, Vetic has been at
        the forefront of innovative technology, committed to empowering homes
        and businesses with intelligent energy management tools. Our
        cutting-edge mobile application provides you with the means to
        effortlessly monitor and control your energy consumption, making
        informed decisions for a sustainable future.
      </Text>
      <Text className="text-base font-bold mt-8 px-7">Our Mission</Text>
      <Text className="text-sm mt-2 px-7 font-normal">
        At Vetic, we are driven by a clear and inspiring mission: to
        revolutionize the way you manage and understand your energy usage. Our
        goal is to empower you with real-time insights, enabling you to optimize
        your consumption, reduce waste, and contribute to a greener environment.
      </Text>
    </View>
  );
};

export default About;
