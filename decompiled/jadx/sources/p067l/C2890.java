package p067l;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AZT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2890 extends AbstractC18333 {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f4996;

    /* JADX INFO: renamed from: ۧ */
    public final WeakReference f4997;

    public C2890(TextView textView, C7585 c7585) {
        this.f4997 = new WeakReference(textView);
        this.f4996 = new WeakReference(c7585);
    }

    @Override // p067l.AbstractC18333
    /* JADX INFO: renamed from: ۧ */
    public final void mo4663() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f4997.get();
        InputFilter inputFilter = (InputFilter) this.f4996.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C8946 c8946M20666 = C8946.m20666();
                    if (text == null) {
                        length = 0;
                    } else {
                        c8946M20666.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM20668 = c8946M20666.m20668(0, length, text);
                    if (text == charSequenceM20668) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM20668);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM20668);
                    textView.setText(charSequenceM20668);
                    if (charSequenceM20668 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM20668;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
