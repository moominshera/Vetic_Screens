import {View, Text, Animated, StyleSheet} from 'react-native';
import React, {useLayoutEffect, useEffect} from 'react';

const GhostScreen = ({navigation}) => {
  useEffect(() => {
    setTimeout(() => {
      navigation.navigate('Dashboard');
    }, 2000);
  });
  const position = new Animated.ValueXY({x: -100, y: 100});
  Animated.timing(position, {
    toValue: {x: 100, y: 350},

    duration: 4000,
    useNativeDriver: true,
  }).start();
  useLayoutEffect(() => {
    navigation.setOptions({
      headerShown: false, // Hide the header for this screen
    });
  }, [navigation]);
  return (
    <>
      <View className="flex-1 px-4">
        <View className="mt-20 flex-row items-center">
          <View className=" h-12 w-12 rounded-full mr-2.5 bg-languageBarNotSelected "></View>
          <View>
            <View className="w-36 h-4 bg-languageBarNotSelected mb-2.5"></View>
            <View className="w-32 h-2.5 bg-languageBarNotSelected"></View>
          </View>
        </View>
        <View className="w-full h-12 bg-languageBarNotSelected mt-7"></View>
        <View className="flex-row mt-7">
          <View className="flex-1 h-20 bg-languageBarNotSelected mr-4"></View>
          <View className="flex-1 h-20 bg-languageBarNotSelected"></View>
        </View>
        <View className="mt-10 w-48 h-56 bg-languageBarNotSelected"></View>
      </View>
      <Animated.View
        style={{
          boxShadow: '5px 5px 5px rgb(255,0,0)',
          transform: [
            {translateX: position.x},
            {translateY: position.y},
            {rotate: '-45deg'},
          ],
        }}
        className="w-full bg-ghostBackground h-5 absolute blur-md drop-shadow-2xl scroll-smooth"></Animated.View>
      {/* <View style={styles.shadowProp}></View> */}
    </>
  );
};

const styles = StyleSheet.create({
  shadowProp: {
    shadowOffset: {width: 2, height: 3},
    shadowColor: 'black',
    shadowOpacity: 0.8,
    shadowRadius: 2,
    elevation: 20,
    height: 100,
    width: 100,
    backgroundColor: 'red',
  },
});
export default GhostScreen;
