#import "com_codename1_ext_jailbreak_JailbreakDetectNativeImpl.h"
#import <DTTJailbreakDetection/DTTJailbreakDetection.h>
@implementation com_codename1_ext_jailbreak_JailbreakDetectNativeImpl

-(BOOL)isJailbroken{
    return [DTTJailbreakDetection isJailbroken];
}

-(BOOL)isSupported{
    return YES;
}

@end
