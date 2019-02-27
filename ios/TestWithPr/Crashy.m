//
//  Crashy.m
//  TestWithPr
//
//  Created by Pavlos Vinieratos on 26/02/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "Crashy.h"
#import <React/RCTBridgeModule.h>


@implementation Crashy

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(doIt)
{
  NSArray *a = @[@"wow"];
  NSString *b = [a objectAtIndex:21];
  NSLog(@"%@", b);
}

@end
