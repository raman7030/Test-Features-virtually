package l;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC4927 extends Activity implements InterfaceC23586, InterfaceC7979 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20765 f15533;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C11233.m27805(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C11233.m27803(decorView, "window.decorView");
        if (C15033.m35557(decorView, keyEvent)) {
            return true;
        }
        return C15033.m35558(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C11233.m27805(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C11233.m27803(decorView, "window.decorView");
        if (C15033.m35557(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C11233.m27805(bundle, "outState");
        this.f15533.m47437(EnumC13728.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // l.InterfaceC7979
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3966(KeyEvent keyEvent) {
        C11233.m27805(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public ActivityC4927() {
        new C3432();
        this.f15533 = new C20765(this);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC13707.f40903;
        C5947.m16675(this);
    }

    @Override // l.InterfaceC23586
    public AbstractC7379 getLifecycle() {
        return this.f15533;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        onPostResume();
    }
}
