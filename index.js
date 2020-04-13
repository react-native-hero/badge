
import { NativeModules } from 'react-native'

const { RNTBadge } = NativeModules

export function getBadge() {
  return RNTBadge.getBadge()
}

export function setBadge(value) {
  RNTBadge.setBadge(value)
}