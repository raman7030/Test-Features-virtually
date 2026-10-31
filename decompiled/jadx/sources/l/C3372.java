package l;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۗܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C3372 implements TextWatcher {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC16798 f10667;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EditText f10668;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f10669 = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3372(EditText editText) {
        this.f10668 = editText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f10668;
        if (!editText.isInEditMode() && this.f10669 && C6921.m18716() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM18718 = C6921.m18717().m18718();
            if (iM18718 != 0) {
                if (iM18718 == 1) {
                    C6921.m18717().m18719(i, i3 + i, (Spannable) charSequence);
                    return;
                } else if (iM18718 != 3) {
                    return;
                }
            }
            C6921 c6921M18717 = C6921.m18717();
            if (this.f10667 == null) {
                this.f10667 = new C4783(editText);
            }
            c6921M18717.m18722(this.f10667);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10304() {
        return this.f10669;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10303(boolean z) {
        if (this.f10669 != z) {
            if (this.f10667 != null) {
                C6921.m18717().m18724(this.f10667);
            }
            this.f10669 = z;
            if (z) {
                m10302(this.f10668, C6921.m18717().m18718());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10302(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C6921 c6921M18717 = C6921.m18717();
            if (editableText == null) {
                length = 0;
            } else {
                c6921M18717.getClass();
                length = editableText.length();
            }
            c6921M18717.m18719(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }
}
