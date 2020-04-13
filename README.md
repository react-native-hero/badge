# @react-native-hero/badge

## Getting started

Install the library using either Yarn:

```
yarn add @react-native-hero/badge
```

or npm:

```
npm install --save @react-native-hero/badge
```

## Link

- React Native v0.60+

For iOS, use `cocoapods` to link the package.

run the following command:

```
$ cd ios && pod install
```

For android, the package will be linked automatically on build.

- React Native <= 0.59

run the following command to link the package:

```
$ react-native link @react-native-hero/badge
```

## Example

```js
import {
  getBadge,
  setBadge,
} from '@react-native-hero/badge'

// set the badge
// make sure you have the notifications permission on ios.
setBadge(1)

// clear the badge
// make sure you have the notifications permission on ios.
setBadge(0)

// read the badge
getBadge().then(data => {
  // ios works
  // but android can't read the badge, so it is always 0
  data.badge
})
```

