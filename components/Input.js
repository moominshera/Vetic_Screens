import { View, Text, TextInput, StyleSheet } from 'react-native'
import React, { useState } from 'react'

const Input = ({label, placeholder, language, formData, setFormData}) => {


  const onChangeHandler = (text) => {
    setFormData({...formData, [label]: text})
    console.log(formData);
  }

  return (
    <View className="mb-5">
      <Text className="mb-2" style={[styles.headingColor, (language=="arabic") && styles.arabicLang]}>{label}</Text>
      <View className="border border-languageBtnBorder rounded-md" >
        <TextInput placeholder={placeholder} style={(language=="arabic") && styles.arabicLang} onChangeText={onChangeHandler}/>
      </View>
    </View>
  )
}

const styles = StyleSheet.create({
  headingColor: {
    color: "rgba(3, 24, 13, 0.70)",
    fontSize: 14,
    fontWeight: "700",
  },
  arabicLang: {
    textAlign: "right",
  }

})

export default Input;