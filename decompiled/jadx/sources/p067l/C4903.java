package p067l;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۖܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B23 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4903 {

    /* JADX INFO: renamed from: ֫ */
    public final C10938 f11166;

    public C4903(EditText editText) {
        this.f11166 = new C10938(editText);
    }

    /* JADX INFO: renamed from: ֫ */
    public final KeyListener m10402(KeyListener keyListener) {
        this.f11166.getClass();
        if (keyListener instanceof C10267) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C10267(keyListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputConnection m10403(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f11166.m25209(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10405() {
        return this.f11166.m25211();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10404(boolean z) {
        this.f11166.m25210(z);
    }
}
