package p067l;

import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۫ۡ */
/* JADX INFO: compiled from: T22W */
/* JADX INFO: loaded from: classes3.dex */
public final class C1452 {

    /* JADX INFO: renamed from: ֫ */
    public TextClassifier f39621;

    /* JADX INFO: renamed from: ۧ */
    public TextView f39622;

    public C1452(TextView textView) {
        this.f39622 = textView;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31886(TextClassifier textClassifier) {
        this.f39621 = textClassifier;
    }

    /* JADX INFO: renamed from: ֫ */
    public final TextClassifier m31885() {
        TextClassifier textClassifier = this.f39621;
        return textClassifier == null ? C1487.m33655(this.f39622) : textClassifier;
    }
}
