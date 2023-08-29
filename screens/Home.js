import { View, Text } from 'react-native'
import React, {useLayoutEffect} from 'react'

const Home = ({navigation}) => {
useLayoutEffect(() => {
        navigation.setOptions({
          headerShown: false, // Hide the header for this screen
        });
      }, [navigation]);

  return (
    <View>
      <Text>Home</Text>
    </View>
  )
}

export default Home