package l;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩵ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB20 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19601 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18895 f63296;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EditText f63297;

    public C19601(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C18895 c18895 = new C18895();
        super(inputConnection, false);
        this.f63297 = editText;
        this.f63296 = c18895;
        if (C6921.m18716()) {
            C6921.m18717().m18720(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f63297.getEditableText();
        this.f63296.getClass();
        return C6921.m18714(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f63297.getEditableText();
        this.f63296.getClass();
        return C6921.m18714(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
