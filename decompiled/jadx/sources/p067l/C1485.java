package p067l;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.۬۟ */
/* JADX INFO: compiled from: 33S4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1485 {
    /* JADX INFO: renamed from: ֫ */
    public static InputConnection m33612(C1978 c1978, InputConnection inputConnection, EditorInfo editorInfo) {
        C4183 c4183 = new C4183(c1978);
        if (Build.VERSION.SDK_INT >= 25) {
            return new C1065(inputConnection, c4183);
        }
        return C1835.m48469(editorInfo).length == 0 ? inputConnection : new C0995(inputConnection, c4183);
    }
}
