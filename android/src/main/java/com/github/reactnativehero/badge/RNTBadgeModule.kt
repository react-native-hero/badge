package com.github.reactnativehero.badge

import com.facebook.react.bridge.*
import me.leolin.shortcutbadger.ShortcutBadger

class RNTBadgeModule(private val reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "RNTBadge"
    }

    @ReactMethod
    fun getBadge(promise: Promise) {

        // 安卓读不到这个值，模拟一下
        val map = Arguments.createMap()
        map.putInt("badge", 0)

        promise.resolve(map)

    }

    @ReactMethod
    fun setBadge(value: Int) {
        ShortcutBadger.applyCount(reactContext, value)
    }

}