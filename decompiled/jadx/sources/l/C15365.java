package l;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܶܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0V */
/* JADX INFO: loaded from: classes4.dex */
public final class C15365 extends C21717 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5489 f47078;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f47079 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f47080;

    public C15365(TextView textView) {
        this.f47080 = textView;
        this.f47078 = new C5489(textView);
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo36404(boolean z) {
        if (z) {
            TextView textView = this.f47080;
            textView.setTransformationMethod(mo36403(textView.getTransformationMethod()));
        }
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputFilter[] mo36406(InputFilter[] inputFilterArr) {
        if (this.f47079) {
            int length = inputFilterArr.length;
            int i = 0;
            while (true) {
                C5489 c5489 = this.f47078;
                if (i < length) {
                    if (inputFilterArr[i] == c5489) {
                        return inputFilterArr;
                    }
                    i++;
                } else {
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                    inputFilterArr2[length] = c5489;
                    return inputFilterArr2;
                }
            }
        } else {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C5489) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length2 = inputFilterArr.length;
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr3[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr3;
        }
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TransformationMethod mo36403(TransformationMethod transformationMethod) {
        if (this.f47079) {
            return ((transformationMethod instanceof C13249) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C13249(transformationMethod);
        }
        return transformationMethod instanceof C13249 ? ((C13249) transformationMethod).m32157() : transformationMethod;
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo36407(boolean z) {
        this.f47079 = z;
        TextView textView = this.f47080;
        textView.setTransformationMethod(mo36403(textView.getTransformationMethod()));
        textView.setFilters(mo36406(textView.getFilters()));
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo36405() {
        return this.f47079;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36408(boolean z) {
        this.f47079 = z;
    }
}
