package p067l;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۙ᩹ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC1086 extends Activity implements InterfaceC24784, InterfaceC1238 {

    /* JADX INFO: renamed from: ᩸ */
    public final C22103 f18365;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C13045.m29867(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C13045.m29865(decorView, "window.decorView");
        if (C1588.m37714(decorView, keyEvent)) {
            return true;
        }
        return C1588.m37715(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C13045.m29867(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C13045.m29865(decorView, "window.decorView");
        if (C1588.m37714(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C13045.m29867(bundle, "outState");
        this.f18365.m49765(EnumC15415.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // p067l.InterfaceC1238
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6208(KeyEvent keyEvent) {
        C13045.m29867(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public ActivityC1086() {
        new C1012();
        this.f18365 = new C22103(this);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC15395.f43984;
        C8020.m18601(this);
    }

    @Override // p067l.InterfaceC24784
    public AbstractC9381 getLifecycle() {
        return this.f18365;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        onPostResume();
    }
}
