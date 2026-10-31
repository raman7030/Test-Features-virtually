package l;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8767 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22655(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            C17648.m41297(textView, new C14328(dragEvent.getClipData(), 3).m34197());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22654(DragEvent dragEvent, View view, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        C17648.m41297(view, new C14328(dragEvent.getClipData(), 3).m34197());
        return true;
    }
}
