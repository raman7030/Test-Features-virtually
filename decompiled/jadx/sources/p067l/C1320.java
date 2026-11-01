package p067l;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: l.ۢܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1320 extends WindowCallbackC1554 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f32145;

    /* JADX INFO: renamed from: ۙ */
    public boolean f32146;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f32147;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f32148;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC0935 f32149;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1320(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110, Window.Callback callback) {
        super(callback);
        this.f32147 = layoutInflaterFactory2C1110;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26568(InterfaceC0935 interfaceC0935) {
        this.f32149 = interfaceC0935;
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f32148) {
            return m36378().dispatchKeyEvent(keyEvent);
        }
        return this.f32147.m17355(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f32147.m17354(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C0994)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        InterfaceC0935 interfaceC0935 = this.f32149;
        if (interfaceC0935 != null) {
            View view = i == 0 ? new View(((C1145) interfaceC0935).f21580.f38079.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f32146) {
            m36378().onContentChanged();
        }
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C0994 c0994 = menu instanceof C0994 ? (C0994) menu : null;
        if (i == 0 && c0994 == null) {
            return false;
        }
        if (c0994 != null) {
            c0994.setOverrideVisibleItems(true);
        }
        InterfaceC0935 interfaceC0935 = this.f32149;
        if (interfaceC0935 != null) {
            C1425 c1425 = ((C1145) interfaceC0935).f21580;
            if (i == 0 && !c1425.f38086) {
                c1425.f38079.mo4556();
                c1425.f38086 = true;
            }
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (c0994 != null) {
            c0994.setOverrideVisibleItems(false);
        }
        return zOnPreparePanel;
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f32147.m17380(i);
        return true;
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f32145) {
            m36378().onPanelClosed(i, menu);
        } else {
            super.onPanelClosed(i, menu);
            this.f32147.m17364(i);
        }
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f32147;
        if (!layoutInflaterFactory2C1110.m17381()) {
            return super.onWindowStartingActionMode(callback);
        }
        C1158 c1158 = new C1158(layoutInflaterFactory2C1110.f19660, callback);
        AbstractC1018 abstractC1018M17344 = layoutInflaterFactory2C1110.m17344(c1158);
        if (abstractC1018M17344 != null) {
            return c1158.m19645(abstractC1018M17344);
        }
        return null;
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f32147;
        if (layoutInflaterFactory2C1110.m17381() && i == 0) {
            C1158 c1158 = new C1158(layoutInflaterFactory2C1110.f19660, callback);
            AbstractC1018 abstractC1018M17344 = layoutInflaterFactory2C1110.m17344(c1158);
            if (abstractC1018M17344 != null) {
                return c1158.m19645(abstractC1018M17344);
            }
            return null;
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // p067l.WindowCallbackC1554, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C0994 c0994 = this.f32147.m17359(0).f65686;
        if (c0994 != null) {
            super.onProvideKeyboardShortcuts(list, c0994, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26566(Window.Callback callback) {
        try {
            this.f32146 = true;
            callback.onContentChanged();
        } finally {
            this.f32146 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26569(Window.Callback callback, KeyEvent keyEvent) {
        try {
            this.f32148 = true;
            return callback.dispatchKeyEvent(keyEvent);
        } finally {
            this.f32148 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26567(Window.Callback callback, int i, Menu menu) {
        try {
            this.f32145 = true;
            callback.onPanelClosed(i, menu);
        } finally {
            this.f32145 = false;
        }
    }
}
