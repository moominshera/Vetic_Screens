import React from 'react';
import {View, Text} from 'react-native';

const MyComponent = () => {
  return (
    <View>
      <View className="bg-blue-700">
        <View className="flex-row">
          <Text>Flex Text 1</Text>
          <Text>Flex Text 2</Text>
        </View>
        <Text>Normal Text</Text>
      </View>
      <View />
    </View>
  );
};

export default MyComponent;
