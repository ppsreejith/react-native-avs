
# react-native-avs

## Getting started

`$ npm install react-native-avs --save`

### Mostly automatic installation

`$ react-native link react-native-avs`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAvsPackage;` to the imports at the top of the file
  - Add `new RNAvsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-avs'
  	project(':react-native-avs').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-avs/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-avs')
  	```

### Post Installation
1. Currently, we'll have to increase the min-sdk version of andorid to 21 from 16 which involves changing the android/app/src/main/AndroidManifest.xml file. Edit the
`android:minSdkVersion="16"` line from 16 to 21.
2. Add the `multiDexEnabled true` line to android/app/build.gradle file
```
android {
    defaultConfig {
        multiDexEnabled true
        ...
    }
    ...
}
```

3. Follow the process for creating a connected device detailed in https://developer.amazon.com/appsandservices/solutions/alexa/alexa-voice-service/getting-started-with-the-alexa-voice-service
4. Follow the instructions for adding your key and preparing the Login with Amazon activity from the 'Login with Amazon' Android Project guide
5. Add your api_key.txt file (part of the Login with Amazon process detailed in the link above) to the app/src/main/assets folder.
6. Start integration and testing!


## Usage
```javascript
import RNAvs from 'react-native-avs';

// TODO: What to do with the module?
RNAvs;
```
  