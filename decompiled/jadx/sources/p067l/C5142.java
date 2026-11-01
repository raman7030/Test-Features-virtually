package p067l;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۗ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: WB13 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5142 implements InterfaceC1736 {
    @Override // p067l.InterfaceC1736
    /* JADX INFO: renamed from: ֫ */
    public final C1028 mo10982(View view, C1028 c1028) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            C12826.toString(c1028);
        }
        if (c1028.m13310() == 2) {
            return c1028;
        }
        ClipData clipDataM13308 = c1028.m13308();
        int iM13309 = c1028.m13309();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataM13308.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataM13308.getItemAt(i);
            if ((iM13309 & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
