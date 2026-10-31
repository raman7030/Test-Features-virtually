package l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۟ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7376 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20306 f22645;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f22646;

    public C7376(TextView textView) {
        this.f22646 = textView;
        this.f22645 = new C20306(textView);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19826(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f22646.getContext().obtainStyledAttributes(attributeSet, C3390.f10706, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m19830(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19830(boolean z) {
        this.f22645.m46550(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19828() {
        return this.f22645.m46548();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputFilter[] m19829(InputFilter[] inputFilterArr) {
        return this.f22645.m46549(inputFilterArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19827(boolean z) {
        this.f22645.m46547(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TransformationMethod m19825(TransformationMethod transformationMethod) {
        return this.f22645.m46546(transformationMethod);
    }
}
