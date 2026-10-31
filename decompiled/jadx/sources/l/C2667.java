package l;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۖܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B23 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2667 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9017 f8371;

    public C2667(EditText editText) {
        this.f8371 = new C9017(editText);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final KeyListener m8356(KeyListener keyListener) {
        this.f8371.getClass();
        if (keyListener instanceof C8311) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C8311(keyListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputConnection m8357(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f8371.m23265(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8359() {
        return this.f8371.m23267();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8358(boolean z) {
        this.f8371.m23266(z);
    }
}
