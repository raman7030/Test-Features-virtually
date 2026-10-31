package l;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AZT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0549 extends AbstractC16798 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f2222;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f2223;

    public C0549(TextView textView, C5489 c5489) {
        this.f2223 = new WeakReference(textView);
        this.f2222 = new WeakReference(c5489);
    }

    @Override // l.AbstractC16798
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2295() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f2223.get();
        InputFilter inputFilter = (InputFilter) this.f2222.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C6921 c6921M18717 = C6921.m18717();
                    if (text == null) {
                        length = 0;
                    } else {
                        c6921M18717.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM18719 = c6921M18717.m18719(0, length, text);
                    if (text == charSequenceM18719) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM18719);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM18719);
                    textView.setText(charSequenceM18719);
                    if (charSequenceM18719 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM18719;
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
