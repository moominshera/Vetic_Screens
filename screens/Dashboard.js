import React, {useLayoutEffect} from 'react';
import {View, TouchableOpacity, Text} from 'react-native';
import {createMaterialTopTabNavigator} from '@react-navigation/material-top-tabs';
import Daily from './NavScreen/Daily';
import Today from './NavScreen/Today';
import AdminDashboard from '../components/AdminDashboard';
import Weekly from './NavScreen/Weekly';
import Monthly from './NavScreen/Monthly';
import Dropdown from '../components/Dropdown';
import BarChart from '../components/BarChart';
const Tab = createMaterialTopTabNavigator();

const CustomTabBar = ({state, navigation}) => {
  return (
    <View
      style={{
        flexDirection: 'row',
        backgroundColor: '#E9E9E9',
        borderRadius: 100,
        padding: 5,
        marginHorizontal: 9,
      }}>
      {state.routes.map((route, index) => {
        const isFocused = state.index === index;
        const onPress = () => {
          const event = navigation.emit({
            type: 'tabPress',
            target: route.key,
          });

          if (!isFocused && !event.defaultPrevented) {
            navigation.navigate(route.name);
          }
        };

        const tabStyle = {
          flex: 1,
          alignItems: 'center',
          justifyContent: 'center',
          padding: 12,
          backgroundColor: isFocused ? '#66ADFF' : '#E9E9E9',
          borderRadius: 40,
          marginHorizontal: 5,
        };

        const textStyle = {
          color: isFocused ? '#FFFFFF' : '#919191',
          fontSize: 14,
          fontWeight: isFocused ? '700' : '400',
        };

        return (
          <TouchableOpacity
            key={route.key}
            onPress={onPress}
            style={tabStyle}
            className="bg-white">
            <Text style={textStyle}>{route.name}</Text>
          </TouchableOpacity>
        );
      })}
    </View>
  );
};

function TabNavigator() {
  return (
    <Tab.Navigator
      className="  border-none bg-white "
      tabBar={props => <CustomTabBar {...props} />}
      initialRouteName="Daily"
      screenOptions={{
        indicatorStyle: {backgroundColor: 'transparent'},
        style: {backgroundColor: '#000000', borderRadius: 40},

        contentStyle: {
          backgroundColor: '#FFFFFF',
        },

        lazy: true,
        swipeEnabled: false, // Disable swiping to navigate
      }}>
      <Tab.Screen name="Daily" component={Daily} />
      <Tab.Screen name="Today" component={Today} />
      <Tab.Screen name="Weekly" component={Weekly} />
      <Tab.Screen name="Monthly" component={Monthly} />
    </Tab.Navigator>
  );
}

export default function Dashboard({navigation, route}) {
  useLayoutEffect(() => {
    navigation.setOptions({
      headerShown: false, // Hide the header for this screen
    });
  }, [navigation]);

  return (
    <>
      {/* <View className="bg-white"> */}
      <AdminDashboard />
      <Dropdown />
      <TabNavigator />
      <BarChart />
      {/* </View> */}
    </>
  );
}
