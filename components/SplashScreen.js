// import {View, Text, Image} from 'react-native';
// import React from 'react';

// const SplashScreen = () => {
//   return (
//     <View className="bg-primary w-full h-full flex-row ">
//       <Image resizeMode="contain" source={require('../assests/logo.png')} />
//       <Image source={require('../assests/logotext.png')} />
//     </View>
//   );
// };

// export default SplashScreen;
import React, {useEffect, useRef} from 'react';
import {View, Image, StyleSheet, Animated, Text} from 'react-native';

const SplashScreen = ({onAnimationComplete}) => {
  const fadeAnim = useRef(new Animated.Value(0)).current;

  useEffect(() => {
    Animated.timing(fadeAnim, {
      toValue: 1,
      duration: 1500, // Adjust the duration as needed
      useNativeDriver: true, // Use the native driver for better performance
    }).start(() => {
      // Call the provided callback when the animation is complete
      if (onAnimationComplete) onAnimationComplete();
    });
  }, [fadeAnim, onAnimationComplete]);

  return (
    <View className=" bg-primary h-full w-full ">
      <Animated.View
        className="mt-14"
        style={[styles.imageContainer, {opacity: fadeAnim}]}>
        <Image
          resizeMode="contain"
          source={require('../assests/logo.png')}
          style={styles.logoImage}
        />
        <Image
          source={require('../assests/logotext.png')}
          style={styles.logoTextImage}
        />
        <Text className="mt-4 font-normal text-base text-neutral-700">
          Energy Usage Monitoring
        </Text>
        <Text> & Managment</Text>
      </Animated.View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,

    justifyContent: 'center',
    alignItems: 'center',
  },
  imageContainer: {
    alignItems: 'center',
  },
});

export default SplashScreen;
