package p067l;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩵ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB20 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20997 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ֫ */
    public final C20326 f65914;

    /* JADX INFO: renamed from: ۧ */
    public final EditText f65915;

    public C20997(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C20326 c20326 = new C20326();
        super(inputConnection, false);
        this.f65915 = editText;
        this.f65914 = c20326;
        if (C8946.m20665()) {
            C8946.m20666().m20669(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f65915.getEditableText();
        this.f65914.getClass();
        return C8946.m20663(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f65915.getEditableText();
        this.f65914.getClass();
        return C8946.m20663(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
