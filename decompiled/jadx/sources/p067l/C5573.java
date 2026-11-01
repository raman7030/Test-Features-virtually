package p067l;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۗܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB2C */
/* JADX INFO: loaded from: classes2.dex */
public final class C5573 implements TextWatcher {

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC18333 f13474;

    /* JADX INFO: renamed from: ᩸ */
    public final EditText f13475;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f13476 = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C5573(EditText editText) {
        this.f13475 = editText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f13475;
        if (!editText.isInEditMode() && this.f13476 && C8946.m20665() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM20667 = C8946.m20666().m20667();
            if (iM20667 != 0) {
                if (iM20667 == 1) {
                    C8946.m20666().m20668(i, i3 + i, (Spannable) charSequence);
                    return;
                } else if (iM20667 != 3) {
                    return;
                }
            }
            C8946 c8946M20666 = C8946.m20666();
            if (this.f13474 == null) {
                this.f13474 = new C6914(editText);
            }
            c8946M20666.m20671(this.f13474);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12341() {
        return this.f13476;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12340(boolean z) {
        if (this.f13476 != z) {
            if (this.f13474 != null) {
                C8946.m20666().m20673(this.f13474);
            }
            this.f13476 = z;
            if (z) {
                m12339(this.f13475, C8946.m20666().m20667());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12339(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C8946 c8946M20666 = C8946.m20666();
            if (editableText == null) {
                length = 0;
            } else {
                c8946M20666.getClass();
                length = editableText.length();
            }
            c8946M20666.m20668(0, length, editableText);
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
