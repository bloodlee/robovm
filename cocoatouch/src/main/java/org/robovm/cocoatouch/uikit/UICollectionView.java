/*
 * Copyright (C) 2012 RoboVM
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
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html">UICollectionView Class Reference</a>
 *   @since Available in iOS 6.0 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UICollectionView /*</name>*/ 
    extends /*<extends>*/ UIScrollView /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UICollectionView /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UICollectionView /*</name>*/.class);

    /*<constructors>*/
    protected UICollectionView(SkipInit skipInit) { super(skipInit); }
    public UICollectionView() {}
    
    private static final Selector initWithFrame$collectionViewLayout$ = Selector.register("initWithFrame:collectionViewLayout:");
    @Bridge(symbol = "objc_msgSend") private native static NSObject objc_initWithFrame(UICollectionView __self__, Selector __cmd__, CGRect frame, UICollectionViewLayout layout);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/initWithFrame:collectionViewLayout:">- (id)initWithFrame:(CGRect)frame  collectionViewLayout:(UICollectionViewLayout *)layout</a>
     * @since Available in iOS 6.0 and later.
     */
    public UICollectionView(CGRect frame, UICollectionViewLayout layout) {
        super((SkipInit) null);
        objc_initWithFrame(this, initWithFrame$collectionViewLayout$, frame, layout);
    }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/allowsMultipleSelection">@property (nonatomic) BOOL allowsMultipleSelection</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("allowsMultipleSelection") public native boolean isAllowsMultipleSelection();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/allowsMultipleSelection">@property (nonatomic) BOOL allowsMultipleSelection</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("setAllowsMultipleSelection:") public native void setAllowsMultipleSelection(boolean v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/allowsSelection">@property (nonatomic) BOOL allowsSelection</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("allowsSelection") public native boolean isAllowsSelection();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/allowsSelection">@property (nonatomic) BOOL allowsSelection</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("setAllowsSelection:") public native void setAllowsSelection(boolean v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/backgroundView">@property (nonatomic, retain) UIView *backgroundView;</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("backgroundView") public native UIView getBackgroundView();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/backgroundView">@property (nonatomic, retain) UIView *backgroundView;</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("setBackgroundView:") public native void setBackgroundView(UIView v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/collectionViewLayout">@property (nonatomic, retain) UICollectionViewLayout *collectionViewLayout;</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("collectionViewLayout") public native UICollectionViewLayout getCollectionViewLayout();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/collectionViewLayout">@property (nonatomic, retain) UICollectionViewLayout *collectionViewLayout;</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("setCollectionViewLayout:") public native void setCollectionViewLayout(UICollectionViewLayout v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/dataSource">@property (nonatomic, assign) id &amp;lt;UICollectionViewDataSource&amp;gt; dataSource;</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("dataSource") public native UICollectionViewDataSource getDataSource();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/dataSource">@property (nonatomic, assign) id &amp;lt;UICollectionViewDataSource&amp;gt; dataSource;</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("setDataSource:") public native void setDataSource(UICollectionViewDataSource v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/delegate">@property (nonatomic, assign) id &amp;lt;UICollectionViewDelegate&amp;gt; delegate;</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("delegate") public native UICollectionViewDelegate getDelegate();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instp/UICollectionView/delegate">@property (nonatomic, assign) id &amp;lt;UICollectionViewDelegate&amp;gt; delegate;</a>
     * @since Available in iOS 6.0 and later.
     */
    @Bind("setDelegate:") public native void setDelegate(UICollectionViewDelegate v);
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector deleteItemsAtIndexPaths$ = Selector.register("deleteItemsAtIndexPaths:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_deleteItems(UICollectionView __self__, Selector __cmd__, NSArray indexPaths);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_deleteItemsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSArray indexPaths);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/deleteItemsAtIndexPaths:">- (void)deleteItemsAtIndexPaths:(NSArray *)indexPaths</a>
     * @since Available in iOS 6.0 and later.
     */
    public void deleteItems(NSArray indexPaths) {
        if (customClass) { objc_deleteItemsSuper(getSuper(), this, deleteItemsAtIndexPaths$, indexPaths); } else { objc_deleteItems(this, deleteItemsAtIndexPaths$, indexPaths); }
    }
    
    private static final Selector deleteSections$ = Selector.register("deleteSections:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_deleteSections(UICollectionView __self__, Selector __cmd__, NSIndexSet sections);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_deleteSectionsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexSet sections);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/deleteSections:">- (void)deleteSections:(NSIndexSet *)sections</a>
     * @since Available in iOS 6.0 and later.
     */
    public void deleteSections(NSIndexSet sections) {
        if (customClass) { objc_deleteSectionsSuper(getSuper(), this, deleteSections$, sections); } else { objc_deleteSections(this, deleteSections$, sections); }
    }
    
    private static final Selector dequeueReusableCellWithReuseIdentifier$forIndexPath$ = Selector.register("dequeueReusableCellWithReuseIdentifier:forIndexPath:");
    @Bridge(symbol = "objc_msgSend") private native static NSObject objc_dequeueReusableCell(UICollectionView __self__, Selector __cmd__, String identifier, NSIndexPath indexPath);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSObject objc_dequeueReusableCellSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, String identifier, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/dequeueReusableCellWithReuseIdentifier:forIndexPath:">- (id)dequeueReusableCellWithReuseIdentifier:(NSString *)identifier forIndexPath:(NSIndexPath*)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    public NSObject dequeueReusableCell(String identifier, NSIndexPath indexPath) {
        if (customClass) { return objc_dequeueReusableCellSuper(getSuper(), this, dequeueReusableCellWithReuseIdentifier$forIndexPath$, identifier, indexPath); } else { return objc_dequeueReusableCell(this, dequeueReusableCellWithReuseIdentifier$forIndexPath$, identifier, indexPath); }
    }
    
    private static final Selector dequeueReusableSupplementaryViewOfKind$withReuseIdentifier$forIndexPath$ = Selector.register("dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:");
    @Bridge(symbol = "objc_msgSend") private native static NSObject objc_dequeueReusableSupplementaryView(UICollectionView __self__, Selector __cmd__, String elementKind, String identifier, NSIndexPath indexPath);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSObject objc_dequeueReusableSupplementaryViewSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, String elementKind, String identifier, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:">- (id)dequeueReusableSupplementaryViewOfKind:(NSString*)elementKind withReuseIdentifier:(NSString *)identifier forIndexPath:(NSIndexPath*)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    public NSObject dequeueReusableSupplementaryView(String elementKind, String identifier, NSIndexPath indexPath) {
        if (customClass) { return objc_dequeueReusableSupplementaryViewSuper(getSuper(), this, dequeueReusableSupplementaryViewOfKind$withReuseIdentifier$forIndexPath$, elementKind, identifier, indexPath); } else { return objc_dequeueReusableSupplementaryView(this, dequeueReusableSupplementaryViewOfKind$withReuseIdentifier$forIndexPath$, elementKind, identifier, indexPath); }
    }
    
    private static final Selector deselectItemAtIndexPath$animated$ = Selector.register("deselectItemAtIndexPath:animated:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_deselectItem(UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath, boolean animated);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_deselectItemSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath, boolean animated);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/deselectItemAtIndexPath:animated:">- (void)deselectItemAtIndexPath:(NSIndexPath *)indexPath animated:(BOOL)animated</a>
     * @since Available in iOS 6.0 and later.
     */
    public void deselectItem(NSIndexPath indexPath, boolean animated) {
        if (customClass) { objc_deselectItemSuper(getSuper(), this, deselectItemAtIndexPath$animated$, indexPath, animated); } else { objc_deselectItem(this, deselectItemAtIndexPath$animated$, indexPath, animated); }
    }
    
    private static final Selector indexPathForCell$ = Selector.register("indexPathForCell:");
    @Bridge(symbol = "objc_msgSend") private native static NSIndexPath objc_getCellIndexPath(UICollectionView __self__, Selector __cmd__, UICollectionViewCell cell);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSIndexPath objc_getCellIndexPathSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, UICollectionViewCell cell);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/indexPathForCell:">- (NSIndexPath *)indexPathForCell:(UICollectionViewCell *)cell</a>
     * @since Available in iOS 6.0 and later.
     */
    public NSIndexPath getCellIndexPath(UICollectionViewCell cell) {
        if (customClass) { return objc_getCellIndexPathSuper(getSuper(), this, indexPathForCell$, cell); } else { return objc_getCellIndexPath(this, indexPathForCell$, cell); }
    }
    
    private static final Selector cellForItemAtIndexPath$ = Selector.register("cellForItemAtIndexPath:");
    @Bridge(symbol = "objc_msgSend") private native static UICollectionViewCell objc_getItemCell(UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath);
    @Bridge(symbol = "objc_msgSendSuper") private native static UICollectionViewCell objc_getItemCellSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/cellForItemAtIndexPath:">- (UICollectionViewCell *)cellForItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    public UICollectionViewCell getItemCell(NSIndexPath indexPath) {
        if (customClass) { return objc_getItemCellSuper(getSuper(), this, cellForItemAtIndexPath$, indexPath); } else { return objc_getItemCell(this, cellForItemAtIndexPath$, indexPath); }
    }
    
    private static final Selector indexPathForItemAtPoint$ = Selector.register("indexPathForItemAtPoint:");
    @Bridge(symbol = "objc_msgSend") private native static NSIndexPath objc_getItemIndexPath(UICollectionView __self__, Selector __cmd__, CGPoint point);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSIndexPath objc_getItemIndexPathSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, CGPoint point);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/indexPathForItemAtPoint:">- (NSIndexPath *)indexPathForItemAtPoint:(CGPoint)point</a>
     * @since Available in iOS 6.0 and later.
     */
    public NSIndexPath getItemIndexPath(CGPoint point) {
        if (customClass) { return objc_getItemIndexPathSuper(getSuper(), this, indexPathForItemAtPoint$, point); } else { return objc_getItemIndexPath(this, indexPathForItemAtPoint$, point); }
    }
    
    private static final Selector layoutAttributesForItemAtIndexPath$ = Selector.register("layoutAttributesForItemAtIndexPath:");
    @Bridge(symbol = "objc_msgSend") private native static UICollectionViewLayoutAttributes objc_getItemLayoutAttributes(UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath);
    @Bridge(symbol = "objc_msgSendSuper") private native static UICollectionViewLayoutAttributes objc_getItemLayoutAttributesSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/layoutAttributesForItemAtIndexPath:">- (UICollectionViewLayoutAttributes *)layoutAttributesForItemAtIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    public UICollectionViewLayoutAttributes getItemLayoutAttributes(NSIndexPath indexPath) {
        if (customClass) { return objc_getItemLayoutAttributesSuper(getSuper(), this, layoutAttributesForItemAtIndexPath$, indexPath); } else { return objc_getItemLayoutAttributes(this, layoutAttributesForItemAtIndexPath$, indexPath); }
    }
    
    private static final Selector numberOfItemsInSection$ = Selector.register("numberOfItemsInSection:");
    @Bridge(symbol = "objc_msgSend") private native static int objc_getNumberOfItemsInSection(UICollectionView __self__, Selector __cmd__, int section);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_getNumberOfItemsInSectionSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, int section);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/numberOfItemsInSection:">- (NSInteger)numberOfItemsInSection:(NSInteger)section</a>
     * @since Available in iOS 6.0 and later.
     */
    public int getNumberOfItemsInSection(int section) {
        if (customClass) { return objc_getNumberOfItemsInSectionSuper(getSuper(), this, numberOfItemsInSection$, section); } else { return objc_getNumberOfItemsInSection(this, numberOfItemsInSection$, section); }
    }
    
    private static final Selector numberOfSections = Selector.register("numberOfSections");
    @Bridge(symbol = "objc_msgSend") private native static int objc_getNumberOfSections(UICollectionView __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static int objc_getNumberOfSectionsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/numberOfSections">- (NSInteger)numberOfSections</a>
     * @since Available in iOS 6.0 and later.
     */
    public int getNumberOfSections() {
        if (customClass) { return objc_getNumberOfSectionsSuper(getSuper(), this, numberOfSections); } else { return objc_getNumberOfSections(this, numberOfSections); }
    }
    
    private static final Selector indexPathsForSelectedItems = Selector.register("indexPathsForSelectedItems");
    @Bridge(symbol = "objc_msgSend") private native static NSArray objc_getSelectedItemsIndexPaths(UICollectionView __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSArray objc_getSelectedItemsIndexPathsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/indexPathsForSelectedItems">- (NSArray *)indexPathsForSelectedItems</a>
     * @since Available in iOS 6.0 and later.
     */
    public NSArray getSelectedItemsIndexPaths() {
        if (customClass) { return objc_getSelectedItemsIndexPathsSuper(getSuper(), this, indexPathsForSelectedItems); } else { return objc_getSelectedItemsIndexPaths(this, indexPathsForSelectedItems); }
    }
    
    private static final Selector layoutAttributesForSupplementaryElementOfKind$atIndexPath$ = Selector.register("layoutAttributesForSupplementaryElementOfKind:atIndexPath:");
    @Bridge(symbol = "objc_msgSend") private native static UICollectionViewLayoutAttributes objc_getSupplementaryElementLayoutAttributes(UICollectionView __self__, Selector __cmd__, String kind, NSIndexPath indexPath);
    @Bridge(symbol = "objc_msgSendSuper") private native static UICollectionViewLayoutAttributes objc_getSupplementaryElementLayoutAttributesSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, String kind, NSIndexPath indexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/layoutAttributesForSupplementaryElementOfKind:atIndexPath:">- (UICollectionViewLayoutAttributes *)layoutAttributesForSupplementaryElementOfKind:(NSString *)kind atIndexPath:(NSIndexPath *)indexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    public UICollectionViewLayoutAttributes getSupplementaryElementLayoutAttributes(String kind, NSIndexPath indexPath) {
        if (customClass) { return objc_getSupplementaryElementLayoutAttributesSuper(getSuper(), this, layoutAttributesForSupplementaryElementOfKind$atIndexPath$, kind, indexPath); } else { return objc_getSupplementaryElementLayoutAttributes(this, layoutAttributesForSupplementaryElementOfKind$atIndexPath$, kind, indexPath); }
    }
    
    private static final Selector visibleCells = Selector.register("visibleCells");
    @Bridge(symbol = "objc_msgSend") private native static NSArray objc_getVisibleCells(UICollectionView __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSArray objc_getVisibleCellsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/visibleCells">- (NSArray *)visibleCells</a>
     * @since Available in iOS 6.0 and later.
     */
    public NSArray getVisibleCells() {
        if (customClass) { return objc_getVisibleCellsSuper(getSuper(), this, visibleCells); } else { return objc_getVisibleCells(this, visibleCells); }
    }
    
    private static final Selector indexPathsForVisibleItems = Selector.register("indexPathsForVisibleItems");
    @Bridge(symbol = "objc_msgSend") private native static NSArray objc_getVisibleItemsIndexPaths(UICollectionView __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static NSArray objc_getVisibleItemsIndexPathsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/indexPathsForVisibleItems">- (NSArray *)indexPathsForVisibleItems</a>
     * @since Available in iOS 6.0 and later.
     */
    public NSArray getVisibleItemsIndexPaths() {
        if (customClass) { return objc_getVisibleItemsIndexPathsSuper(getSuper(), this, indexPathsForVisibleItems); } else { return objc_getVisibleItemsIndexPaths(this, indexPathsForVisibleItems); }
    }
    
    private static final Selector insertItemsAtIndexPaths$ = Selector.register("insertItemsAtIndexPaths:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_insertItems(UICollectionView __self__, Selector __cmd__, NSArray indexPaths);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_insertItemsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSArray indexPaths);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/insertItemsAtIndexPaths:">- (void)insertItemsAtIndexPaths:(NSArray *)indexPaths</a>
     * @since Available in iOS 6.0 and later.
     */
    public void insertItems(NSArray indexPaths) {
        if (customClass) { objc_insertItemsSuper(getSuper(), this, insertItemsAtIndexPaths$, indexPaths); } else { objc_insertItems(this, insertItemsAtIndexPaths$, indexPaths); }
    }
    
    private static final Selector insertSections$ = Selector.register("insertSections:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_insertSections(UICollectionView __self__, Selector __cmd__, NSIndexSet sections);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_insertSectionsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexSet sections);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/insertSections:">- (void)insertSections:(NSIndexSet *)sections</a>
     * @since Available in iOS 6.0 and later.
     */
    public void insertSections(NSIndexSet sections) {
        if (customClass) { objc_insertSectionsSuper(getSuper(), this, insertSections$, sections); } else { objc_insertSections(this, insertSections$, sections); }
    }
    
    private static final Selector moveItemAtIndexPath$toIndexPath$ = Selector.register("moveItemAtIndexPath:toIndexPath:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_moveItem(UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath, NSIndexPath newIndexPath);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_moveItemSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath, NSIndexPath newIndexPath);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/moveItemAtIndexPath:toIndexPath:">- (void)moveItemAtIndexPath:(NSIndexPath *)indexPath toIndexPath:(NSIndexPath *)newIndexPath</a>
     * @since Available in iOS 6.0 and later.
     */
    public void moveItem(NSIndexPath indexPath, NSIndexPath newIndexPath) {
        if (customClass) { objc_moveItemSuper(getSuper(), this, moveItemAtIndexPath$toIndexPath$, indexPath, newIndexPath); } else { objc_moveItem(this, moveItemAtIndexPath$toIndexPath$, indexPath, newIndexPath); }
    }
    
    private static final Selector moveSection$toSection$ = Selector.register("moveSection:toSection:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_moveSection(UICollectionView __self__, Selector __cmd__, int section, int newSection);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_moveSectionSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, int section, int newSection);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/moveSection:toSection:">- (void)moveSection:(NSInteger)section toSection:(NSInteger)newSection</a>
     * @since Available in iOS 6.0 and later.
     */
    public void moveSection(int section, int newSection) {
        if (customClass) { objc_moveSectionSuper(getSuper(), this, moveSection$toSection$, section, newSection); } else { objc_moveSection(this, moveSection$toSection$, section, newSection); }
    }
    
    private static final Selector performBatchUpdates$completion$ = Selector.register("performBatchUpdates:completion:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_performBatchUpdates(UICollectionView __self__, Selector __cmd__, VoidBlock updates, VoidBooleanBlock completion);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_performBatchUpdatesSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, VoidBlock updates, VoidBooleanBlock completion);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/performBatchUpdates:completion:">- (void)performBatchUpdates:(void (^)(void))updates completion:(void (^)(BOOL finished))completion</a>
     * @since Available in iOS 6.0 and later.
     */
    public void performBatchUpdates(VoidBlock updates, VoidBooleanBlock completion) {
        if (customClass) { objc_performBatchUpdatesSuper(getSuper(), this, performBatchUpdates$completion$, updates, completion); } else { objc_performBatchUpdates(this, performBatchUpdates$completion$, updates, completion); }
    }
    
    private static final Selector registerClass$forCellWithReuseIdentifier$ = Selector.register("registerClass:forCellWithReuseIdentifier:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_registerReusableCellClass(UICollectionView __self__, Selector __cmd__, ObjCClass cellClass, String identifier);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_registerReusableCellClassSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, ObjCClass cellClass, String identifier);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/registerClass:forCellWithReuseIdentifier:">- (void)registerClass:(Class)cellClass forCellWithReuseIdentifier:(NSString *)identifier</a>
     * @since Available in iOS 6.0 and later.
     */
    public void registerReusableCellClass(ObjCClass cellClass, String identifier) {
        if (customClass) { objc_registerReusableCellClassSuper(getSuper(), this, registerClass$forCellWithReuseIdentifier$, cellClass, identifier); } else { objc_registerReusableCellClass(this, registerClass$forCellWithReuseIdentifier$, cellClass, identifier); }
    }
    
    private static final Selector registerNib$forCellWithReuseIdentifier$ = Selector.register("registerNib:forCellWithReuseIdentifier:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_registerReusableCellNib(UICollectionView __self__, Selector __cmd__, UINib nib, String identifier);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_registerReusableCellNibSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, UINib nib, String identifier);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/registerNib:forCellWithReuseIdentifier:">- (void)registerNib:(UINib *)nib forCellWithReuseIdentifier:(NSString *)identifier</a>
     * @since Available in iOS 6.0 and later.
     */
    public void registerReusableCellNib(UINib nib, String identifier) {
        if (customClass) { objc_registerReusableCellNibSuper(getSuper(), this, registerNib$forCellWithReuseIdentifier$, nib, identifier); } else { objc_registerReusableCellNib(this, registerNib$forCellWithReuseIdentifier$, nib, identifier); }
    }
    
    private static final Selector registerClass$forSupplementaryViewOfKind$withReuseIdentifier$ = Selector.register("registerClass:forSupplementaryViewOfKind:withReuseIdentifier:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_registerReusableSupplementaryViewClass(UICollectionView __self__, Selector __cmd__, ObjCClass viewClass, String elementKind, String identifier);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_registerReusableSupplementaryViewClassSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, ObjCClass viewClass, String elementKind, String identifier);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/registerClass:forSupplementaryViewOfKind:withReuseIdentifier:">- (void)registerClass:(Class)viewClass forSupplementaryViewOfKind:(NSString *)elementKind withReuseIdentifier:(NSString *)identifier</a>
     * @since Available in iOS 6.0 and later.
     */
    public void registerReusableSupplementaryViewClass(ObjCClass viewClass, String elementKind, String identifier) {
        if (customClass) { objc_registerReusableSupplementaryViewClassSuper(getSuper(), this, registerClass$forSupplementaryViewOfKind$withReuseIdentifier$, viewClass, elementKind, identifier); } else { objc_registerReusableSupplementaryViewClass(this, registerClass$forSupplementaryViewOfKind$withReuseIdentifier$, viewClass, elementKind, identifier); }
    }
    
    private static final Selector registerNib$forSupplementaryViewOfKind$withReuseIdentifier$ = Selector.register("registerNib:forSupplementaryViewOfKind:withReuseIdentifier:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_registerReusableSupplementaryViewNib(UICollectionView __self__, Selector __cmd__, UINib nib, String kind, String identifier);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_registerReusableSupplementaryViewNibSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, UINib nib, String kind, String identifier);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/registerNib:forSupplementaryViewOfKind:withReuseIdentifier:">- (void)registerNib:(UINib *)nib forSupplementaryViewOfKind:(NSString *)kind withReuseIdentifier:(NSString *)identifier</a>
     * @since Available in iOS 6.0 and later.
     */
    public void registerReusableSupplementaryViewNib(UINib nib, String kind, String identifier) {
        if (customClass) { objc_registerReusableSupplementaryViewNibSuper(getSuper(), this, registerNib$forSupplementaryViewOfKind$withReuseIdentifier$, nib, kind, identifier); } else { objc_registerReusableSupplementaryViewNib(this, registerNib$forSupplementaryViewOfKind$withReuseIdentifier$, nib, kind, identifier); }
    }
    
    private static final Selector reloadData = Selector.register("reloadData");
    @Bridge(symbol = "objc_msgSend") private native static void objc_reloadData(UICollectionView __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_reloadDataSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/reloadData">- (void)reloadData</a>
     * @since Available in iOS 6.0 and later.
     */
    public void reloadData() {
        if (customClass) { objc_reloadDataSuper(getSuper(), this, reloadData); } else { objc_reloadData(this, reloadData); }
    }
    
    private static final Selector reloadItemsAtIndexPaths$ = Selector.register("reloadItemsAtIndexPaths:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_reloadItems(UICollectionView __self__, Selector __cmd__, NSArray indexPaths);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_reloadItemsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSArray indexPaths);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/reloadItemsAtIndexPaths:">- (void)reloadItemsAtIndexPaths:(NSArray *)indexPaths</a>
     * @since Available in iOS 6.0 and later.
     */
    public void reloadItems(NSArray indexPaths) {
        if (customClass) { objc_reloadItemsSuper(getSuper(), this, reloadItemsAtIndexPaths$, indexPaths); } else { objc_reloadItems(this, reloadItemsAtIndexPaths$, indexPaths); }
    }
    
    private static final Selector reloadSections$ = Selector.register("reloadSections:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_reloadSections(UICollectionView __self__, Selector __cmd__, NSIndexSet sections);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_reloadSectionsSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexSet sections);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/reloadSections:">- (void)reloadSections:(NSIndexSet *)sections</a>
     * @since Available in iOS 6.0 and later.
     */
    public void reloadSections(NSIndexSet sections) {
        if (customClass) { objc_reloadSectionsSuper(getSuper(), this, reloadSections$, sections); } else { objc_reloadSections(this, reloadSections$, sections); }
    }
    
    private static final Selector scrollToItemAtIndexPath$atScrollPosition$animated$ = Selector.register("scrollToItemAtIndexPath:atScrollPosition:animated:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_scrollToItem(UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath, UICollectionViewScrollPosition scrollPosition, boolean animated);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_scrollToItemSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath, UICollectionViewScrollPosition scrollPosition, boolean animated);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/scrollToItemAtIndexPath:atScrollPosition:animated:">- (void)scrollToItemAtIndexPath:(NSIndexPath *)indexPath atScrollPosition:(UICollectionViewScrollPosition)scrollPosition animated:(BOOL)animated</a>
     * @since Available in iOS 6.0 and later.
     */
    public void scrollToItem(NSIndexPath indexPath, UICollectionViewScrollPosition scrollPosition, boolean animated) {
        if (customClass) { objc_scrollToItemSuper(getSuper(), this, scrollToItemAtIndexPath$atScrollPosition$animated$, indexPath, scrollPosition, animated); } else { objc_scrollToItem(this, scrollToItemAtIndexPath$atScrollPosition$animated$, indexPath, scrollPosition, animated); }
    }
    
    private static final Selector selectItemAtIndexPath$animated$scrollPosition$ = Selector.register("selectItemAtIndexPath:animated:scrollPosition:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_selectItem(UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath, boolean animated, UICollectionViewScrollPosition scrollPosition);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_selectItemSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, NSIndexPath indexPath, boolean animated, UICollectionViewScrollPosition scrollPosition);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/selectItemAtIndexPath:animated:scrollPosition:">- (void)selectItemAtIndexPath:(NSIndexPath *)indexPath animated:(BOOL)animated scrollPosition:(UICollectionViewScrollPosition)scrollPosition</a>
     * @since Available in iOS 6.0 and later.
     */
    public void selectItem(NSIndexPath indexPath, boolean animated, UICollectionViewScrollPosition scrollPosition) {
        if (customClass) { objc_selectItemSuper(getSuper(), this, selectItemAtIndexPath$animated$scrollPosition$, indexPath, animated, scrollPosition); } else { objc_selectItem(this, selectItemAtIndexPath$animated$scrollPosition$, indexPath, animated, scrollPosition); }
    }
    
    private static final Selector setCollectionViewLayout$animated$ = Selector.register("setCollectionViewLayout:animated:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_setCollectionViewLayout(UICollectionView __self__, Selector __cmd__, UICollectionViewLayout layout, boolean animated);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_setCollectionViewLayoutSuper(ObjCSuper __super__, UICollectionView __self__, Selector __cmd__, UICollectionViewLayout layout, boolean animated);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UICollectionView_class/Reference/Reference.html#//apple_ref/occ/instm/UICollectionView/setCollectionViewLayout:animated:">- (void)setCollectionViewLayout:(UICollectionViewLayout *)layout animated:(BOOL)animated</a>
     * @since Available in iOS 6.0 and later.
     */
    public void setCollectionViewLayout(UICollectionViewLayout layout, boolean animated) {
        if (customClass) { objc_setCollectionViewLayoutSuper(getSuper(), this, setCollectionViewLayout$animated$, layout, animated); } else { objc_setCollectionViewLayout(this, setCollectionViewLayout$animated$, layout, animated); }
    }
    /*</methods>*/

}