
/// generated by: genswift.java 'java/lang|java/util|java/sql|java/awt|javax/swing' ///

/// interface javax.swing.event.MenuDragMouseListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class MenuDragMouseListenerProxy implements javax.swing.event.MenuDragMouseListener {

    // address of proxy object
    long __swiftObject;

    MenuDragMouseListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.MenuDragMouseListener.menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent)

    public native void __menuDragMouseDragged( long __swiftObject, javax.swing.event.MenuDragMouseEvent e );

    public void menuDragMouseDragged( javax.swing.event.MenuDragMouseEvent e ) {
        __menuDragMouseDragged( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.MenuDragMouseListener.menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent)

    public native void __menuDragMouseEntered( long __swiftObject, javax.swing.event.MenuDragMouseEvent e );

    public void menuDragMouseEntered( javax.swing.event.MenuDragMouseEvent e ) {
        __menuDragMouseEntered( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.MenuDragMouseListener.menuDragMouseExited(javax.swing.event.MenuDragMouseEvent)

    public native void __menuDragMouseExited( long __swiftObject, javax.swing.event.MenuDragMouseEvent e );

    public void menuDragMouseExited( javax.swing.event.MenuDragMouseEvent e ) {
        __menuDragMouseExited( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.MenuDragMouseListener.menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent)

    public native void __menuDragMouseReleased( long __swiftObject, javax.swing.event.MenuDragMouseEvent e );

    public void menuDragMouseReleased( javax.swing.event.MenuDragMouseEvent e ) {
        __menuDragMouseReleased( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}
