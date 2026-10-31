package l;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T22W */
/* JADX INFO: loaded from: classes3.dex */
public final class C12999 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static TextClassifier m31570(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
