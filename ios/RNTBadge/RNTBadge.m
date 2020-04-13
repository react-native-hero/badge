#import "RNTBadge.h"

@implementation RNTBadge

- (dispatch_queue_t)methodQueue {
  return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE(RNTBadge);

RCT_EXPORT_METHOD(getBadge:(RCTPromiseResolveBlock)resolve reject:(RCTPromiseRejectBlock)reject) {
    resolve(@{
        @"badge": @(UIApplication.sharedApplication.applicationIconBadgeNumber),
    });
}

RCT_EXPORT_METHOD(setBadge:(int)value) {
    UIApplication.sharedApplication.applicationIconBadgeNumber = value;
}

@end
