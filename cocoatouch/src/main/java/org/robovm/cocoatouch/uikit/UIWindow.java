/*
 * Copyright (C) 2012 Trillian AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html">UIWindow Class Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
@NativeClass public class /*<name>*/ UIWindow /*</name>*/ 
    extends /*<extends>*/ UIView /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIWindow /*</name>*/.class);
    }

    private static final boolean X86 = Bro.IS_X86;
    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIWindow /*</name>*/.class);

    public UIWindow(CGRect aRect) {
        super(aRect);
    }
    /*<constructors>*/
    protected UIWindow(SkipInit skipInit) { super(skipInit); }
    public UIWindow() {}
    
    /*</constructors>*/
    /*<properties>*/
    
    private static final Selector isKeyWindow = Selector.register("isKeyWindow");
    @Bridge(symbol = "objc_msgSend") private native static boolean objc_isKeyWindow(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static boolean objc_isKeyWindowSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/keyWindow">@property(nonatomic, readonly, getter=isKeyWindow) BOOL keyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    public boolean isKeyWindow() {
        if (customClass) { return objc_isKeyWindowSuper(getSuper(), isKeyWindow); } else { return objc_isKeyWindow(this, isKeyWindow); }
    }
    
    private static final Selector rootViewController = Selector.register("rootViewController");
    @Bridge(symbol = "objc_msgSend") private native static UIViewController objc_getRootViewController(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIViewController objc_getRootViewControllerSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/rootViewController">@property(nonatomic, retain) UIViewController *rootViewController</a>
     * @since Available in iOS 4.0 and later.
     */
    public UIViewController getRootViewController() {
        if (customClass) { return objc_getRootViewControllerSuper(getSuper(), rootViewController); } else { return objc_getRootViewController(this, rootViewController); }
    }
    
    private static final Selector setRootViewController$ = Selector.register("setRootViewController:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setRootViewController(UIWindow __self__, Selector __cmd__, UIViewController rootViewController);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setRootViewControllerSuper(ObjCSuper __super__, Selector __cmd__, UIViewController rootViewController);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/rootViewController">@property(nonatomic, retain) UIViewController *rootViewController</a>
     * @since Available in iOS 4.0 and later.
     */
    public void setRootViewController(UIViewController rootViewController) {
        if (customClass) { objc_setRootViewControllerSuper(getSuper(), setRootViewController$, rootViewController); } else { objc_setRootViewController(this, setRootViewController$, rootViewController); }
    }
    
    private static final Selector screen = Selector.register("screen");
    @Bridge(symbol = "objc_msgSend") private native static UIScreen objc_getScreen(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static UIScreen objc_getScreenSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/screen">@property(nonatomic, retain) UIScreen *screen</a>
     * @since Available in iOS 3.2 and later.
     */
    public UIScreen getScreen() {
        if (customClass) { return objc_getScreenSuper(getSuper(), screen); } else { return objc_getScreen(this, screen); }
    }
    
    private static final Selector setScreen$ = Selector.register("setScreen:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setScreen(UIWindow __self__, Selector __cmd__, UIScreen screen);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setScreenSuper(ObjCSuper __super__, Selector __cmd__, UIScreen screen);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/screen">@property(nonatomic, retain) UIScreen *screen</a>
     * @since Available in iOS 3.2 and later.
     */
    public void setScreen(UIScreen screen) {
        if (customClass) { objc_setScreenSuper(getSuper(), setScreen$, screen); } else { objc_setScreen(this, setScreen$, screen); }
    }
    
    private static final Selector windowLevel = Selector.register("windowLevel");
    @Bridge(symbol = "objc_msgSend") private native static float objc_getWindowLevel(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static float objc_getWindowLevelSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/windowLevel">@property(nonatomic) UIWindowLevel windowLevel</a>
     * @since Available in iOS 2.0 and later.
     */
    public float getWindowLevel() {
        if (customClass) { return objc_getWindowLevelSuper(getSuper(), windowLevel); } else { return objc_getWindowLevel(this, windowLevel); }
    }
    
    private static final Selector setWindowLevel$ = Selector.register("setWindowLevel:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setWindowLevel(UIWindow __self__, Selector __cmd__, float windowLevel);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setWindowLevelSuper(ObjCSuper __super__, Selector __cmd__, float windowLevel);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/windowLevel">@property(nonatomic) UIWindowLevel windowLevel</a>
     * @since Available in iOS 2.0 and later.
     */
    public void setWindowLevel(float windowLevel) {
        if (customClass) { objc_setWindowLevelSuper(getSuper(), setWindowLevel$, windowLevel); } else { objc_setWindowLevel(this, setWindowLevel$, windowLevel); }
    }
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector becomeKeyWindow = Selector.register("becomeKeyWindow");
    @Bridge(symbol = "objc_msgSend") private native static void objc_becomeKeyWindow(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_becomeKeyWindowSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/becomeKeyWindow">- (void)becomeKeyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    public void becomeKeyWindow() {
        if (customClass) { objc_becomeKeyWindowSuper(getSuper(), becomeKeyWindow); } else { objc_becomeKeyWindow(this, becomeKeyWindow); }
    }
    
    private static final Selector convertPoint$fromWindow$ = Selector.register("convertPoint:fromWindow:");
    @Bridge(symbol = "objc_msgSend") private native static @ByVal CGPoint objc_convertPointFromWindow(UIWindow __self__, Selector __cmd__, @ByVal CGPoint point, UIWindow window);
    @Bridge(symbol = "objc_msgSend_stret") private native static void objc_convertPointFromWindow_stret(@StructRet CGPoint __ret__, UIWindow __self__, Selector __cmd__, @ByVal CGPoint point, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper") private native static @ByVal CGPoint objc_convertPointFromWindowSuper(ObjCSuper __super__, Selector __cmd__, @ByVal CGPoint point, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper_stret") private native static void objc_convertPointFromWindowSuper_stret(@StructRet CGPoint __ret__, ObjCSuper __super__, Selector __cmd__, @ByVal CGPoint point, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/convertPoint:fromWindow:">- (CGPoint)convertPoint:(CGPoint)point fromWindow:(UIWindow *)window</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGPoint convertPointFromWindow(CGPoint point, UIWindow window) {
        if (X86) { if (customClass) { return objc_convertPointFromWindowSuper(getSuper(), convertPoint$fromWindow$, point, window); } else { return objc_convertPointFromWindow(this, convertPoint$fromWindow$, point, window); } } else { CGPoint __ret__ = new CGPoint(); if (customClass) { objc_convertPointFromWindowSuper_stret(__ret__, getSuper(), convertPoint$fromWindow$, point, window); } else { objc_convertPointFromWindow_stret(__ret__, this, convertPoint$fromWindow$, point, window); } return __ret__; }
    }
    
    private static final Selector convertPoint$toWindow$ = Selector.register("convertPoint:toWindow:");
    @Bridge(symbol = "objc_msgSend") private native static @ByVal CGPoint objc_convertPointToWindow(UIWindow __self__, Selector __cmd__, @ByVal CGPoint point, UIWindow window);
    @Bridge(symbol = "objc_msgSend_stret") private native static void objc_convertPointToWindow_stret(@StructRet CGPoint __ret__, UIWindow __self__, Selector __cmd__, @ByVal CGPoint point, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper") private native static @ByVal CGPoint objc_convertPointToWindowSuper(ObjCSuper __super__, Selector __cmd__, @ByVal CGPoint point, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper_stret") private native static void objc_convertPointToWindowSuper_stret(@StructRet CGPoint __ret__, ObjCSuper __super__, Selector __cmd__, @ByVal CGPoint point, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/convertPoint:toWindow:">- (CGPoint)convertPoint:(CGPoint)point toWindow:(UIWindow *)window</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGPoint convertPointToWindow(CGPoint point, UIWindow window) {
        if (X86) { if (customClass) { return objc_convertPointToWindowSuper(getSuper(), convertPoint$toWindow$, point, window); } else { return objc_convertPointToWindow(this, convertPoint$toWindow$, point, window); } } else { CGPoint __ret__ = new CGPoint(); if (customClass) { objc_convertPointToWindowSuper_stret(__ret__, getSuper(), convertPoint$toWindow$, point, window); } else { objc_convertPointToWindow_stret(__ret__, this, convertPoint$toWindow$, point, window); } return __ret__; }
    }
    
    private static final Selector convertRect$fromWindow$ = Selector.register("convertRect:fromWindow:");
    @Bridge(symbol = "objc_msgSend_stret") private native static void objc_convertRectFromWindow_stret(@StructRet CGRect __ret__, UIWindow __self__, Selector __cmd__, @ByVal CGRect rect, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper_stret") private native static void objc_convertRectFromWindowSuper_stret(@StructRet CGRect __ret__, ObjCSuper __super__, Selector __cmd__, @ByVal CGRect rect, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/convertRect:fromWindow:">- (CGRect)convertRect:(CGRect)rect fromWindow:(UIWindow *)window</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGRect convertRectFromWindow(CGRect rect, UIWindow window) {
        CGRect __ret__ = new CGRect(); if (customClass) { objc_convertRectFromWindowSuper_stret(__ret__, getSuper(), convertRect$fromWindow$, rect, window); } else { objc_convertRectFromWindow_stret(__ret__, this, convertRect$fromWindow$, rect, window); } return __ret__;
    }
    
    private static final Selector convertRect$toWindow$ = Selector.register("convertRect:toWindow:");
    @Bridge(symbol = "objc_msgSend_stret") private native static void objc_convertRectToWindow_stret(@StructRet CGRect __ret__, UIWindow __self__, Selector __cmd__, @ByVal CGRect rect, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper_stret") private native static void objc_convertRectToWindowSuper_stret(@StructRet CGRect __ret__, ObjCSuper __super__, Selector __cmd__, @ByVal CGRect rect, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/convertRect:toWindow:">- (CGRect)convertRect:(CGRect)rect toWindow:(UIWindow *)window</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGRect convertRectToWindow(CGRect rect, UIWindow window) {
        CGRect __ret__ = new CGRect(); if (customClass) { objc_convertRectToWindowSuper_stret(__ret__, getSuper(), convertRect$toWindow$, rect, window); } else { objc_convertRectToWindow_stret(__ret__, this, convertRect$toWindow$, rect, window); } return __ret__;
    }
    
    private static final Selector makeKeyAndVisible = Selector.register("makeKeyAndVisible");
    @Bridge(symbol = "objc_msgSend") private native static void objc_makeKeyAndVisible(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_makeKeyAndVisibleSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/makeKeyAndVisible">- (void)makeKeyAndVisible</a>
     * @since Available in iOS 2.0 and later.
     */
    public void makeKeyAndVisible() {
        if (customClass) { objc_makeKeyAndVisibleSuper(getSuper(), makeKeyAndVisible); } else { objc_makeKeyAndVisible(this, makeKeyAndVisible); }
    }
    
    private static final Selector makeKeyWindow = Selector.register("makeKeyWindow");
    @Bridge(symbol = "objc_msgSend") private native static void objc_makeKeyWindow(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_makeKeyWindowSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/makeKeyWindow">- (void)makeKeyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    public void makeKeyWindow() {
        if (customClass) { objc_makeKeyWindowSuper(getSuper(), makeKeyWindow); } else { objc_makeKeyWindow(this, makeKeyWindow); }
    }
    
    private static final Selector resignKeyWindow = Selector.register("resignKeyWindow");
    @Bridge(symbol = "objc_msgSend") private native static void objc_resignKeyWindow(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_resignKeyWindowSuper(ObjCSuper __super__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/resignKeyWindow">- (void)resignKeyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    public void resignKeyWindow() {
        if (customClass) { objc_resignKeyWindowSuper(getSuper(), resignKeyWindow); } else { objc_resignKeyWindow(this, resignKeyWindow); }
    }
    
    private static final Selector sendEvent$ = Selector.register("sendEvent:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_sendEvent(UIWindow __self__, Selector __cmd__, UIEvent event);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_sendEventSuper(ObjCSuper __super__, Selector __cmd__, UIEvent event);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/sendEvent:">- (void)sendEvent:(UIEvent *)event</a>
     * @since Available in iOS 2.0 and later.
     */
    public void sendEvent(UIEvent event) {
        if (customClass) { objc_sendEventSuper(getSuper(), sendEvent$, event); } else { objc_sendEvent(this, sendEvent$, event); }
    }
    /*</methods>*/
    /*<callbacks>*/
    static class Callbacks {
        @Callback @BindSelector("isKeyWindow") public static boolean isKeyWindow(UIWindow __self__, Selector __cmd__) { return __self__.isKeyWindow(); }
        @Callback @BindSelector("rootViewController") public static UIViewController getRootViewController(UIWindow __self__, Selector __cmd__) { return __self__.getRootViewController(); }
        @Callback @BindSelector("setRootViewController:") public static void setRootViewController(UIWindow __self__, Selector __cmd__, UIViewController rootViewController) { __self__.setRootViewController(rootViewController); }
        @Callback @BindSelector("screen") public static UIScreen getScreen(UIWindow __self__, Selector __cmd__) { return __self__.getScreen(); }
        @Callback @BindSelector("setScreen:") public static void setScreen(UIWindow __self__, Selector __cmd__, UIScreen screen) { __self__.setScreen(screen); }
        @Callback @BindSelector("windowLevel") public static float getWindowLevel(UIWindow __self__, Selector __cmd__) { return __self__.getWindowLevel(); }
        @Callback @BindSelector("setWindowLevel:") public static void setWindowLevel(UIWindow __self__, Selector __cmd__, float windowLevel) { __self__.setWindowLevel(windowLevel); }
        @Callback @BindSelector("becomeKeyWindow") public static void becomeKeyWindow(UIWindow __self__, Selector __cmd__) { __self__.becomeKeyWindow(); }
        @Callback @BindSelector("convertPoint:fromWindow:") public static @ByVal CGPoint convertPointFromWindow(UIWindow __self__, Selector __cmd__, @ByVal CGPoint point, UIWindow window) { return __self__.convertPointFromWindow(point, window); }
        @Callback @BindSelector("convertPoint:toWindow:") public static @ByVal CGPoint convertPointToWindow(UIWindow __self__, Selector __cmd__, @ByVal CGPoint point, UIWindow window) { return __self__.convertPointToWindow(point, window); }
        @Callback @BindSelector("convertRect:fromWindow:") public static @ByVal CGRect convertRectFromWindow(UIWindow __self__, Selector __cmd__, @ByVal CGRect rect, UIWindow window) { return __self__.convertRectFromWindow(rect, window); }
        @Callback @BindSelector("convertRect:toWindow:") public static @ByVal CGRect convertRectToWindow(UIWindow __self__, Selector __cmd__, @ByVal CGRect rect, UIWindow window) { return __self__.convertRectToWindow(rect, window); }
        @Callback @BindSelector("makeKeyAndVisible") public static void makeKeyAndVisible(UIWindow __self__, Selector __cmd__) { __self__.makeKeyAndVisible(); }
        @Callback @BindSelector("makeKeyWindow") public static void makeKeyWindow(UIWindow __self__, Selector __cmd__) { __self__.makeKeyWindow(); }
        @Callback @BindSelector("resignKeyWindow") public static void resignKeyWindow(UIWindow __self__, Selector __cmd__) { __self__.resignKeyWindow(); }
        @Callback @BindSelector("sendEvent:") public static void sendEvent(UIWindow __self__, Selector __cmd__, UIEvent event) { __self__.sendEvent(event); }
    }
    /*</callbacks>*/

}
