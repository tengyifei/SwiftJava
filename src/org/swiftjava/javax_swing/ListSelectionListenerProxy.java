
/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// interface javax.swing.event.ListSelectionListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class ListSelectionListenerProxy implements javax.swing.event.ListSelectionListener {

    // address of proxy object
    long __swiftObject;

    ListSelectionListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.ListSelectionListener.valueChanged(javax.swing.event.ListSelectionEvent)

    public native void __valueChanged( long __swiftObject, javax.swing.event.ListSelectionEvent e );

    public void valueChanged( javax.swing.event.ListSelectionEvent e ) {
        __valueChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
