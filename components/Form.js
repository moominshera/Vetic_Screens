import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';
import React, { useState } from 'react';
import Input from './Input';



const Form = ({arabic, navigation}) => {

  const [formData, setFormData] = useState({
    "Your Name": "HI THERE",
    "Device ID": "",
    "Email": "",
    "Phone Number": "",
  })

  const onPressHandler = () => {
    console.log(formData["Your Name"]);
    navigation.navigate("GhostScreen");
  }

  return (<View className="flex-1 justify-between">
  <View>
    <Input formData={formData} setFormData={setFormData} label= {arabic? "اسم المستخدم" :"Your Name"} placeholder="Sa’ad Al Hame" language={arabic ? "arabic" :"english"}/>
    <Input formData={formData} setFormData={setFormData} label= {arabic? "معرف الجهاز" :"Device ID"} placeholder="PFYK426" language={arabic ? "arabic" :"english"}/>
    <Input formData={formData} setFormData={setFormData} label= {arabic? "البريد الإلكتروني" :"Email"} placeholder="saadalhameed@gmail.com" language={arabic ? "arabic" :"english"}/>
    <Input formData={formData} setFormData={setFormData} label= {arabic? "رقم الهاتف" :"Phone Number"} placeholder="+966 4585 2366" language={arabic ? "arabic" :"english"}/>
  </View>
  <View>
    <TouchableOpacity onPress={onPressHandler}>
        <View className="px-4 py-3 mb-12 items-center justify-center rounded-md h-14" style={styles.btnBackground}>
            <Text className="text-sm font-bold rounded-md ml-2 text-languageBtnText">{arabic ? "تسجيل" :"Register"}</Text>
        </View>
    </TouchableOpacity>
  </View>
  </View>
  )
}

const styles = StyleSheet.create({
  btnBackground: {
    backgroundColor: "#CACACA",
  }
})

export default Form;