package p067l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: l.۟ۢ */
/* JADX INFO: compiled from: OB0Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1208 {

    /* JADX INFO: renamed from: ֫ */
    public final C21667 f25557;

    /* JADX INFO: renamed from: ۧ */
    public final TextView f25558;

    public C1208(TextView textView) {
        this.f25558 = textView;
        this.f25557 = new C21667(textView);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21799(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f25558.getContext().obtainStyledAttributes(attributeSet, C1010.f13513, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m21803(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21803(boolean z) {
        this.f25557.m48873(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21801() {
        return this.f25557.m48871();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputFilter[] m21802(InputFilter[] inputFilterArr) {
        return this.f25557.m48872(inputFilterArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21800(boolean z) {
        this.f25557.m48870(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final TransformationMethod m21798(TransformationMethod transformationMethod) {
        return this.f25557.m48869(transformationMethod);
    }
}
