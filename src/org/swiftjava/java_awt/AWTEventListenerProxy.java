
/// interface java.awt.event.AWTEventListener ///

package org.swiftjava.java_awt;

@SuppressWarnings("JniMissingFunction")
public class AWTEventListenerProxy implements java.awt.event.AWTEventListener {

    long __swiftObject;

    AWTEventListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void java.awt.event.AWTEventListener.eventDispatched(java.awt.AWTEvent)

    public native void __eventDispatched( long __swiftObject, java.awt.AWTEvent event );

    public void eventDispatched( java.awt.AWTEvent event ) {
        __eventDispatched( __swiftObject, event );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}