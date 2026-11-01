package p067l;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۬ۡ */
/* JADX INFO: compiled from: T22W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1487 {
    /* JADX INFO: renamed from: ֫ */
    public static TextClassifier m33655(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
