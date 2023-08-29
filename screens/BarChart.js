import React from 'react';
import { View, StyleSheet } from 'react-native';
import { BarChart } from 'react-native-chart-kit';

const data = {
  labels: ['January', 'February', 'March', 'April', 'May'],
  datasets: [
    {
      data: [20, 45, 28, 80, 99],
    },
  ],
};

const chartConfig = {
  backgroundColor: '#e26a00',
  backgroundGradientFrom: '#fb8c00',
  backgroundGradientTo: '#ffa726',
  decimalPlaces: 2,
  color: (opacity = 1) => `rgba(255, 255, 255, ${opacity})`,
};

const BarChartExample = () => {
  return (
    <View style={styles.container}>
      <BarChart
        data={data}
        width={300}
        height={220}
        yAxisLabel={'$'}
        chartConfig={chartConfig}
        verticalLabelRotation={30}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});

export default BarChartExample;
