// import { View, Text , Image , TouchableOpacity } from 'react-native'
// import React from 'react'


// export default function StartScreen() {
//   return (
//     <View className="bg-primary h-full">
//       <View className="flex-column h-full justify-between items-center">
//       <View className="flex-column justify-center items-center mt-14">
//       <Image resizeMode="contain" source={require('../assests/logo.png')} />
//       <Image  source={require('../assests/logotext.png')}/>
//       <Text className="mt-4 font-normal text-base text-neutral-700">Energy Usage Monitoring</Text>
//       <Text > & Managment</Text>
//       </View>
//       <TouchableOpacity>

//       <View className="bg-white px-20 py-4 mb-8">
//         <Text className="font-bold text-base rounded-md">Get Started</Text>
//       </View>
//       </TouchableOpacity>
//       </View>
//     </View>
//   )
// }

import { View, Text , Image , TouchableOpacity } from 'react-native'
// import { commonStyles } from '../CommonStyles'
import React, {useLayoutEffect} from 'react'
import { SafeAreaView } from 'react-native-safe-area-context';


export default function StartScreen({navigation}) {



  useLayoutEffect(() => {
    navigation.setOptions({
      headerShown: false, // Hide the header for this screen
    });
  }, [navigation]);

  
  return (
    <SafeAreaView>
    <View className="bg-primary h-full">
      <View className="flex-column h-full justify-between items-center">
      <View className="flex-column justify-center items-center mt-14">
      <Image resizeMode="contain" source={require('../assests/logo.png')} />
      <Image  source={require('../assests/logotext.png')}/>
      <Text className="mt-4 font-normal text-base text-neutral-700">Energy Usage Monitoring</Text>
      <Text > & Managment</Text>
      </View>
      <TouchableOpacity onPress={() => navigation.navigate('BarChart')}>
      <View className="bg-white px-20 py-4 mb-8">
        <Text className="font-bold text-base rounded-md">Get Started</Text>
      </View>
      </TouchableOpacity>
      </View>
    </View>
    </SafeAreaView>
  )
}