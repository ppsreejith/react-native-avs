
# react-native-avs

## Getting started

`$ npm install react-native-avs --save`

### Mostly automatic installation

`$ react-native link react-native-avs`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-avs` and add `RNAvs.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNAvs.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNAvs.sln` in `node_modules/react-native-avs/windows/RNAvs.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNAvs;` to the usings at the top of the file
  - Add `new RNAvsPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNAvs from 'react-native-avs';

// TODO: What to do with the module?
RNAvs;
```
  