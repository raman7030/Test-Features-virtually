package l;

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
public final class C2919 implements InterfaceC18022 {
    @Override // l.InterfaceC18022
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3746 mo8914(View view, C3746 c3746) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            C11003.toString(c3746);
        }
        if (c3746.m11374() == 2) {
            return c3746;
        }
        ClipData clipDataM11372 = c3746.m11372();
        int iM11373 = c3746.m11373();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataM11372.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataM11372.getItemAt(i);
            if ((iM11373 & 1) != 0) {
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
