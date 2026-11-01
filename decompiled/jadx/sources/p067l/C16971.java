package p067l;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܶܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0V */
/* JADX INFO: loaded from: classes4.dex */
public final class C16971 extends C23008 {

    /* JADX INFO: renamed from: ֫ */
    public final C7585 f50205;

    /* JADX INFO: renamed from: ۧ */
    public boolean f50206 = true;

    /* JADX INFO: renamed from: ܽ */
    public final TextView f50207;

    public C16971(TextView textView) {
        this.f50207 = textView;
        this.f50205 = new C7585(textView);
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ֫ */
    public final void mo38562(boolean z) {
        if (z) {
            TextView textView = this.f50207;
            textView.setTransformationMethod(mo38561(textView.getTransformationMethod()));
        }
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ֫ */
    public final InputFilter[] mo38564(InputFilter[] inputFilterArr) {
        if (this.f50206) {
            int length = inputFilterArr.length;
            int i = 0;
            while (true) {
                C7585 c7585 = this.f50205;
                if (i < length) {
                    if (inputFilterArr[i] == c7585) {
                        return inputFilterArr;
                    }
                    i++;
                } else {
                    InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                    inputFilterArr2[length] = c7585;
                    return inputFilterArr2;
                }
            }
        } else {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C7585) {
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

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ֫ */
    public final TransformationMethod mo38561(TransformationMethod transformationMethod) {
        if (this.f50206) {
            return ((transformationMethod instanceof C14960) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C14960(transformationMethod);
        }
        return transformationMethod instanceof C14960 ? ((C14960) transformationMethod).m34256() : transformationMethod;
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ۧ */
    public final void mo38565(boolean z) {
        this.f50206 = z;
        TextView textView = this.f50207;
        textView.setTransformationMethod(mo38561(textView.getTransformationMethod()));
        textView.setFilters(mo38564(textView.getFilters()));
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo38563() {
        return this.f50206;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38566(boolean z) {
        this.f50206 = z;
    }
}
