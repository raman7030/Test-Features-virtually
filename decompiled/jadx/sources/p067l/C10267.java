package p067l;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: l.۠ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B11 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10267 implements KeyListener {

    /* JADX INFO: renamed from: ᩸ */
    public final KeyListener f28424;

    public C10267(KeyListener keyListener) {
        this.f28424 = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f28424.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f28424.onKeyUp(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f28424.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f28424.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return C8946.m20662(editable, i, keyEvent) || this.f28424.onKeyDown(view, editable, i, keyEvent);
    }
}
