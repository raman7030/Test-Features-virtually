package l;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: renamed from: l.ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P54R */
/* JADX INFO: loaded from: classes3.dex */
public class WindowCallbackC14348 implements Window.Callback {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Window.Callback f43266;

    public WindowCallbackC14348(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f43266 = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f43266.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f43266.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f43266.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f43266.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f43266.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f43266.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f43266.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f43266.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f43266.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f43266.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f43266.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f43266.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f43266.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f43266.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f43266.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f43266.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return C16465.m38768(this.f43266, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f43266.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f43266.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C16465.m38767(this.f43266, callback, i);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f43266.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f43266.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C17877.m41844(this.f43266, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        C17171.m40374(this.f43266, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Window.Callback m34245() {
        return this.f43266;
    }
}
