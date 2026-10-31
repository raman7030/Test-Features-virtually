package l;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 33S4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12958 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputConnection m31526(C22898 c22898, InputConnection inputConnection, EditorInfo editorInfo) {
        C1909 c1909 = new C1909(c22898);
        if (Build.VERSION.SDK_INT >= 25) {
            return new C4492(inputConnection, c1909);
        }
        return C20015.m46154(editorInfo).length == 0 ? inputConnection : new C3081(inputConnection, c1909);
    }
}
