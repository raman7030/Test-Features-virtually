package p067l;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۡܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B23 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10938 extends C17642 {

    /* JADX INFO: renamed from: ֫ */
    public final EditText f30313;

    /* JADX INFO: renamed from: ۧ */
    public final C5573 f30314;

    public C10938(EditText editText) {
        this.f30313 = editText;
        C5573 c5573 = new C5573(editText);
        this.f30314 = c5573;
        editText.addTextChangedListener(c5573);
        editText.setEditableFactory(C6244.getInstance());
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputConnection m25209(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof C20997 ? inputConnection : new C20997(this.f30313, inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25210(boolean z) {
        this.f30314.m12340(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25211() {
        return this.f30314.m12341();
    }
}
