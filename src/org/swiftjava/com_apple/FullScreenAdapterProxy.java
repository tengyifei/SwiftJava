
/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// class com.apple.eawt.FullScreenAdapter ///

package org.swiftjava.com_apple;

@SuppressWarnings("JniMissingFunction")
public class FullScreenAdapterProxy extends com.apple.eawt.FullScreenAdapter {

    // address of proxy object
    long __swiftObject;

    /// public com.apple.eawt.FullScreenAdapter()

    FullScreenAdapterProxy( long __swiftObject ) {
        super( );
        this.__swiftObject = __swiftObject;
    }

    /// public boolean java.lang.Object.equals(java.lang.Object)

    public native boolean __equals( long __swiftObject, java.lang.Object arg0 );

    boolean entered_equals_0;

    public boolean equals( java.lang.Object arg0 ) {
        if ( !entered_equals_0 ) {
            entered_equals_0 = true;
            boolean __return = __equals( __swiftObject, arg0);
            entered_equals_0 = false;
            return __return;
        }
        else
            return super.equals( arg0 );
    }

    /// public native int java.lang.Object.hashCode()

    public native int __hashCode( long __swiftObject );

    boolean entered_hashCode_1;

    public int hashCode() {
        if ( !entered_hashCode_1 ) {
            entered_hashCode_1 = true;
            int __return = __hashCode( __swiftObject );
            entered_hashCode_1 = false;
            return __return;
        }
        else
            return super.hashCode( );
    }

    /// public java.lang.String java.lang.Object.toString()

    public native java.lang.String __toString( long __swiftObject );

    boolean entered_toString_2;

    public java.lang.String toString() {
        if ( !entered_toString_2 ) {
            entered_toString_2 = true;
            java.lang.String __return = __toString( __swiftObject );
            entered_toString_2 = false;
            return __return;
        }
        else
            return super.toString( );
    }

    /// public void com.apple.eawt.FullScreenAdapter.windowEnteredFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowEnteredFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    boolean entered_windowEnteredFullScreen_3;

    public void windowEnteredFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        if ( !entered_windowEnteredFullScreen_3 ) {
            entered_windowEnteredFullScreen_3 = true;
            __windowEnteredFullScreen( __swiftObject, arg0);
            entered_windowEnteredFullScreen_3 = false;
        }
        else
            super.windowEnteredFullScreen( arg0 );
    }

    /// public void com.apple.eawt.FullScreenAdapter.windowEnteringFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowEnteringFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    boolean entered_windowEnteringFullScreen_4;

    public void windowEnteringFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        if ( !entered_windowEnteringFullScreen_4 ) {
            entered_windowEnteringFullScreen_4 = true;
            __windowEnteringFullScreen( __swiftObject, arg0);
            entered_windowEnteringFullScreen_4 = false;
        }
        else
            super.windowEnteringFullScreen( arg0 );
    }

    /// public void com.apple.eawt.FullScreenAdapter.windowExitedFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowExitedFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    boolean entered_windowExitedFullScreen_5;

    public void windowExitedFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        if ( !entered_windowExitedFullScreen_5 ) {
            entered_windowExitedFullScreen_5 = true;
            __windowExitedFullScreen( __swiftObject, arg0);
            entered_windowExitedFullScreen_5 = false;
        }
        else
            super.windowExitedFullScreen( arg0 );
    }

    /// public void com.apple.eawt.FullScreenAdapter.windowExitingFullScreen(com.apple.eawt.AppEvent$FullScreenEvent)

    public native void __windowExitingFullScreen( long __swiftObject, com.apple.eawt.AppEvent.FullScreenEvent arg0 );

    boolean entered_windowExitingFullScreen_6;

    public void windowExitingFullScreen( com.apple.eawt.AppEvent.FullScreenEvent arg0 ) {
        if ( !entered_windowExitingFullScreen_6 ) {
            entered_windowExitingFullScreen_6 = true;
            __windowExitingFullScreen( __swiftObject, arg0);
            entered_windowExitingFullScreen_6 = false;
        }
        else
            super.windowExitingFullScreen( arg0 );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
