import {View, Text} from 'react-native';
import React from 'react';
import ConsumptionCard from '../../components/ConsumptionCard';

const Daily = () => {
  return (
    <View className="bg-white flex-1">
      <View className="flex-row mt-8 bg-white">
        <ConsumptionCard title=" Consumption" value="8.1" watt="KWH" />
        <ConsumptionCard title=" Last 15 Minutes" value="0.4" watt="KWH" />
      </View>
    </View>
  );
};

export default Daily;
