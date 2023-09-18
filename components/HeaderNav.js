import React from 'react';
import {View, Text, Image, TouchableOpacity} from 'react-native';

const HeaderNav = ({navigation}) => {
  return (
    <View className=" flex-row items-center  px-2 py-5 bg-primary ">
      <TouchableOpacity className="mr-16" onPress={() => navigation.goBack()}>
        <Image
          style={{
            width: 85,
            height: 42,
          }}
          resizeMode="contain"
          source={require('../assests/BackIcon.png')}
        />
      </TouchableOpacity>

      <Image
        className=""
        style={{
          width: 85,
          height: 42,
        }}
        resizeMode="contain"
        source={require('../assests/imgHead.png')}
      />
      {/* <Image source={require('../assests/logotext.png')} /> */}
    </View>
  );
};

export default HeaderNav;
