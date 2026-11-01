package p067l;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡۡ */
/* JADX INFO: compiled from: 6B0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1277 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m24625(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            C1717.m43543(textView, new C1553(dragEvent.getClipData(), 3).m36330());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24624(DragEvent dragEvent, View view, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        C1717.m43543(view, new C1553(dragEvent.getClipData(), 3).m36330());
        return true;
    }
}
