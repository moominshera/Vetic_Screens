import {View, Text} from 'react-native';
import React from 'react';

const ConsumptionCard = props => {
  return (
    <View className="bg-primary p-6   rounded-md flex-1 mx-3">
      <Text className="text-neutral-700  text-sm">{props.title}</Text>
      <View className="flex-row justify-start items-end mt-2 ">
        <Text style={{color: '#242424'}} className="font-bold   text-2xl">
          {props.value}{' '}
        </Text>
        <Text className=" text-neutral-700 text-sm">{props.watt}</Text>
      </View>
    </View>
  );
};

export default ConsumptionCard;
