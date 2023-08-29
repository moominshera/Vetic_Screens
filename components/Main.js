import {Text, Pressable, View, StyleSheet, SafeAreaView,  TextInput} from 'react-native';
import ClientConnector from './clientConnector/ClientConnector';
import {useState} from 'react';

const Main = function () {
  const [authToken, setAuthToken] = useState(() => {
    return '';
  });
  const [deviceId, setDeviceId] = useState(() => {
    return 'A2251A05B5C4DEE230905C';
  });
  const [deviceStatus, setDeviceStatus] = useState(() => {
    return '';
  });
  const [deviceUsage, setDeviceUsage] = useState(() => {
    return '';
  });
  const clientConnectorFunction = function () {
    ClientConnector.authenticateMethod(returnedCallbackValue => {
      setAuthToken(returnedCallbackValue);
    });
  };
  const deviceStatusFunction = function () {
    ClientConnector.deviceRegistrationStatus(
      deviceId,
      returnedCallbackValue => {
        setDeviceStatus(returnedCallbackValue);
      },
    );
  };
  const deviceUsageFunction = function () {
    ClientConnector.deviceDailyUsage(returnedCallbackValue => {
      setDeviceUsage(returnedCallbackValue);
    });
  };

  return (
    <>
    <SafeAreaView className="p-3">
      <View style={styles.fetchDataView}>
      {/* <View className="mt-5"> */}
        <Pressable
          android_ripple={{color: 'gray'}}
          style={styles.fetchDataPressable}
          onPress={clientConnectorFunction}>
          <Text className="text-blue-700">Generate authToken</Text>
        </Pressable>
      </View>
      <TextInput
        placeholder="Enter Device Id"
        onChangeText={txt => {
          setDeviceId(txt);
        }}
        value={deviceId}
      />
      <View style={styles.fetchDataView}>
        <Pressable
          android_ripple={{color: 'gray'}}
          style={styles.fetchDataPressable}
          onPress={deviceStatusFunction}>
          <Text style={styles.fetchDataText}>Check Device Registration</Text>
        </Pressable>
      </View>
      <View style={styles.fetchDataView}>
        <Pressable
          android_ripple={{color: 'gray'}}
          style={styles.fetchDataPressable}
          onPress={deviceUsageFunction}>
          <Text style={styles.fetchDataText}>Check Device Usage</Text>
        </Pressable>
      </View>
      {/* <Text>Auth Token : {authToken}</Text> */}
      <Text>{deviceStatus}</Text>
      <Text>Device Usage : {deviceUsage}</Text>
      </SafeAreaView>
    </>
  );
};
export default Main;

const styles = StyleSheet.create({
  fetchDataView: {
    backgroundColor: 'red',
    marginLeft: 'auto',
    marginRight: 'auto',
    height: 100,
  },
  fetchDataPressable: {
    width: 150,
    height: 50,
    backgroundColor: 'green',
    marginTop: 'auto',
    marginBottom: 'auto',
  },
  fetchDataText: {
    marginTop: 'auto',
    marginBottom: 'auto',
    marginLeft: 'auto',
    marginRight: 'auto',
    color: 'white',
    fontSize: 20,
  },
});
