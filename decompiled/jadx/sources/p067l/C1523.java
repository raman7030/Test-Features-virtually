package p067l;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ܰۢ */
/* JADX INFO: compiled from: FAZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C1523 {

    /* JADX INFO: renamed from: ֫ */
    public final C4903 f44075;

    /* JADX INFO: renamed from: ۧ */
    public final EditText f44076;

    public C1523(EditText editText) {
        this.f44076 = editText;
        this.f44075 = new C4903(editText);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35138(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f44076.getContext().obtainStyledAttributes(attributeSet, C1010.f13513, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m35139(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final KeyListener m35136(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener) ? this.f44075.m10402(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35139(boolean z) {
        this.f44075.m10404(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35140() {
        return this.f44075.m10405();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputConnection m35137(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f44075.m10403(inputConnection, editorInfo);
    }
}
