import React, {useState} from 'react';
import {
  View,
  Text,
  StyleSheet,
  ScrollView,
  Dimensions,
  ImageBackground,
} from 'react-native';
const scaleMultplier = 42;
const scrollViewPaddingBottom = 40;
const numberOfBarsToShow = 9;
const BarChart = () => {
  const [highlightedIndex, setHighlightedIndex] = useState(0);
  const barMargin = 10; // Adjust as needed
  const yAxisValuePanelWidth = 70;
  const yAxisValuesFontSize = 14;
  const barTopLabelWidth = 112;
  const windowHeight = Dimensions.get('window').height;
  const windowWidth = Dimensions.get('window').width;
  console.log(windowWidth, 'windowwidth');

  const barWidth =
    (windowWidth - yAxisValuePanelWidth - 2 * barMargin * numberOfBarsToShow) /
    numberOfBarsToShow;
  const centerOfChartIndex = Math.floor(
    (windowWidth - yAxisValuePanelWidth) / (barWidth + 2 * barMargin) / 2,
  );
  const data = [
    12345, 54321, 98765, 67890, 23456873, 87654, 34567, 76543, 45678, 34567,
    11111, 22222, 33333, 44444, 55555, 66666, 7777798, 88888, 99999, 10101,
    12121, 13131, 14141, 15151, 16161, 17171, 18181, 19191, 20202, 21212, 22222,
    23232, 24242, 25252, 2626292, 27272, 50, 29292, 30303, 505, 32323, 33333,
    34343, 35353, 36363, 5, 38383, 39393, 40404763, 41414, 42424, 43434, 44444,
    45454, 46464, 47474, 48484, 49494, 50505877, 51515, 52525, 53535, 54545,
    55555, 56565, 57575, 58585, 59595, 60606, 61616, 62626, 63636, 64646, 65656,
    66666, 67676, 68686, 69696, 70707, 71717, 72727, 73737, 7474766, 75757,
    76767, 77777, 78787, 79797, 80808, 81818, 82828, 83838, 84848, 85858, 86868,
    87878, 88888, 89898, 90909, 91919, 92929, 93939, 94949, 95959, 96969, 97979,
    98989, 99999, 10000, 20000,
  ];

  function createIntervals(value, intervalSize) {
    if (value + intervalSize <= 0 || intervalSize <= 0) {
      return [];
    }

    const intervals = [];
    for (let i = 0; i <= value + intervalSize; i += intervalSize) {
      intervals.push(i);
    }
    intervals.reverse();
    return intervals;
  }

  function formatNumber(num) {
    if (num >= 1000) {
      return (num / 1000).toFixed(1) + 'K';
    } else {
      return num.toString();
    }
  }

  const handleScroll = event => {
    const offsetX = event.nativeEvent.contentOffset.x;
    // console.log(offsetX);
    const barIndex = Math.floor(offsetX / (barWidth + 2 * barMargin));
    console.log(barIndex);

    if (barIndex >= 0 && barIndex < data.length) {
      setHighlightedIndex(barIndex);
    } else {
      setHighlightedIndex(null);
    }
  };

  const maxValue = Math.max(...data);
  console.log(maxValue);
  const digits = Math.floor(maxValue).toString().length;
  const yAxisIntervalSize = Math.floor(maxValue / 4);
  const yAxixValueArray = [];

  for (let i = 0; i <= digits; i++) {
    arrayItem = maxValue / 10 ** (digits - i);
    yAxixValueArray.push(Math.floor(arrayItem));
  }

  const shortenedYAxixValueArray = yAxixValueArray.map(item =>
    formatNumber(item),
  );
  console.log(shortenedYAxixValueArray);

  console.log(yAxixValueArray, 'yaxisvaluearray');
  const scaledYAxixValueArray = yAxixValueArray.map(item =>
    item == 0 ? 0 : Math.log10(item) * scaleMultplier,
  );
  console.log(scaledYAxixValueArray);

  const logScaledData = data.map(value => (value == 0 ? 0 : Math.log10(value)));
  // console.log(logScaledData);​

  return (
    <View
      className="flex-row bg-white"
      style={{
        // maxHeight: windowHeight * 2,
        marginBottom: 10,
        // minHeight: 370,
        // height: 400,
      }}>
      <View style={{width: yAxisValuePanelWidth}} className="relative ">
        {scaledYAxixValueArray.map((value, index) => (
          <View
            key={index}
            style={{
              position: 'absolute',
              bottom: value + scrollViewPaddingBottom,
              right: 0,
              marginHorizontal: 4,
            }}>
            <View className="h-full w-full relative justify-center items-center">
              <Text
                style={{
                  fontSize: yAxisValuesFontSize,
                  color: '#4B4B4B',
                  backgroundColor: '#FFFFFF',
                }}>
                {shortenedYAxixValueArray[index]}
              </Text>
              <View
                className="border h-0 absolute left-12"
                style={{
                  width: windowWidth + windowWidth,
                  borderColor: '#EDEDED',
                  zIndex: -20,
                }}></View>
            </View>
          </View>
        ))}
      </View>
      <ScrollView
        horizontal
        contentContainerStyle={styles.chartContainer}
        showsHorizontalScrollIndicator={false}
        onScroll={handleScroll}>
        {logScaledData.map((value, index) => (
          <View
            key={index}
            style={[
              styles.bar,
              {
                height: value * scaleMultplier, //(12 is the font-size of y-axis values) Adjust multiplier for better visualization
                width: barWidth,
                position: 'relative',
                marginBottom: yAxisValuesFontSize / 2,
                marginHorizontal: barMargin, // marginLeft: index === 0 ? 0 : barMargin,
              },
              highlightedIndex + centerOfChartIndex === index &&
                styles.highlightedBar,
            ]}>
            <Text style={styles.barLabel}>{data[index]}</Text>
            <View
              style={{
                width: 30,
                position: 'absolute',
                top: value * scaleMultplier + 22,
                color: 'red',
              }}>
              <Text style={{color: '#4B4B4B'}}>5pm</Text>
            </View>
          </View>
        ))}
      </ScrollView>
      <ImageBackground
        source={require('../assests/UnionUmair.png')}
        className="h-14 absolute top-4"
        style={{
          right:
            (windowWidth - yAxisValuePanelWidth) / 2 - barTopLabelWidth / 2.15,
          width: barTopLabelWidth,
        }}>
        <View className="relative h-full w-full flex-row justify-center p-2">
          <Text style={styles.toolTip}>
            {data[highlightedIndex + centerOfChartIndex]}
          </Text>
          <View
            style={{
              zIndex: -10,
              borderColor: '#BFC3FF',
              borderWidth: 2,
              borderStyle: 'dashed',
            }}
            className="absolute h-64 w-0 top-14"></View>
        </View>
      </ImageBackground>
    </View>
  );
};

const styles = StyleSheet.create({
  chartContainer: {
    alignItems: 'flex-end',
    // height: '100%',
    paddingBottom: scrollViewPaddingBottom,
  },
  bar: {
    backgroundColor: '#DBDBDB', // Customize bar color
    alignItems: 'center',
    justifyContent: 'flex-end',
    borderTopLeftRadius: 2,
    borderTopRightRadius: 2,
  },
  barLabel: {
    color: 'white', // Customize label color
    fontSize: 12, // Customize label font size
    marginTop: 5, // Adjust as needed
  },
  highlightedBar: {
    backgroundColor: '#FFCC00',
  },
  toolTip: {
    color: '#FFFFFF',
    fontSize: 12,
    fontWeight: '700',
  },
});

export default BarChart;
