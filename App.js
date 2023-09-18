// // import {View, Text} from 'react-native';
// import * as React from 'react';
// import {NavigationContainer} from '@react-navigation/native';
// import {createNativeStackNavigator} from '@react-navigation/native-stack';
// import StartScreen from './screens/StartScreen';

// import Dashboard from './screens/Dashboard';
// import About from './screens/About';
// import PrivacyPolicy from './screens/PrivacyPolicy';
// import SplashScreen from './components/SplashScreen';

// const Stack = createNativeStackNavigator();

// const App = () => {
//   return (
//     <NavigationContainer>
//       <Stack.Navigator>
//         <Stack.Screen name="StartScreen" component={StartScreen} />
//         <Stack.Screen name="Dashboard" component={Dashboard} />

//         <Stack.Screen name="About" component={About} />
//         <Stack.Screen name="PrivacyPolicy" component={PrivacyPolicy} />
//       </Stack.Navigator>
//     </NavigationContainer>
//   );
// };

// export default App;
import {View} from 'react-native';
import * as React from 'react';
import {NavigationContainer} from '@react-navigation/native';
import {createNativeStackNavigator} from '@react-navigation/native-stack';
import StartScreen from './screens/StartScreen';
import Dashboard from './screens/Dashboard';
import About from './screens/About';
import PrivacyPolicy from './screens/PrivacyPolicy';
import SplashScreen from './components/SplashScreen';
import DrawerNavigation from './screens/Drawer/DrawerNavigation';
const Stack = createNativeStackNavigator();

const App = () => {
  const [isLoading, setIsLoading] = React.useState(false);

  React.useEffect(() => {
    setTimeout(() => {
      setIsLoading(true);
    }, 3000);
  }, []);

  return (
    <NavigationContainer>
      {!isLoading ? (
        <SplashScreen />
      ) : (
        <Stack.Navigator
          screenOptions={{
            contentStyle: {
              backgroundColor: '#FFFFFF',
            },
          }}>
          <Stack.Screen
            screenOptions={{
              contentStyle: {
                backgroundColor: '#FFFFFF',
              },
            }}
            name="StartScreen"
            component={StartScreen}
          />
          <Stack.Screen
            screenOptions={{
              contentStyle: {
                backgroundColor: '#FFFFFF',
              },
            }}
            name="Dashboard"
            component={Dashboard}
          />
          <Stack.Screen
            screenOptions={{
              contentStyle: {
                backgroundColor: '#FFFFFF',
              },
            }}
            name="DrawerNavigation"
            component={DrawerNavigation}
          />
          <Stack.Screen
            screenOptions={{
              contentStyle: {
                backgroundColor: '#FFFFFF',
              },
            }}
            name="About"
            component={About}
          />
          <Stack.Screen
            screenOptions={{
              contentStyle: {
                backgroundColor: '#FFFFFF',
              },
            }}
            name="PrivacyPolicy"
            component={PrivacyPolicy}
          />
        </Stack.Navigator>
      )}
    </NavigationContainer>
  );
};

export default App;
