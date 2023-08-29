// import { View, Text , SafeAreaView } from 'react-native'
// import BarChart from './components/BarChart'
// // import StartScreen from './components/StartScreen'
// export default function App() {
//   return (
//     <SafeAreaView >
//       <BarChart></BarChart>
//       {/* <StartScreen/> */}
//     {/* <View>
//       <Text>App</Text>
//     </View> */}
//     </SafeAreaView>
//   )
// }
import { View, Text} from 'react-native';
import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import StartScreen from './screens/StartScreen'
import Home from './screens/Home';
import BarChart from './screens/BarChart';

const Stack = createNativeStackNavigator();


export default function App() {
  return (
    <NavigationContainer>
        <Stack.Navigator>
          <Stack.Screen name="StartScreen" component={StartScreen} />
          <Stack.Screen name="Home" component={Home} />
          <Stack.Screen name="BarChart" component={BarChart} />
            {/* <View>
              <Text>App</Text>
            </View> */}
          </Stack.Navigator>
        </NavigationContainer>
  )
}