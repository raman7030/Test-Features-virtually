package p067l;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0V */
/* JADX INFO: loaded from: classes.dex */
public final class C23678 extends C23008 {

    /* JADX INFO: renamed from: ֫ */
    public final C16971 f75381;

    public C23678(TextView textView) {
        this.f75381 = new C16971(textView);
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ֫ */
    public final TransformationMethod mo38561(TransformationMethod transformationMethod) {
        return !C8946.m20665() ? transformationMethod : this.f75381.mo38561(transformationMethod);
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ֫ */
    public final void mo38562(boolean z) {
        if (C8946.m20665()) {
            this.f75381.mo38562(z);
        }
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ֫ */
    public final InputFilter[] mo38564(InputFilter[] inputFilterArr) {
        return !C8946.m20665() ? inputFilterArr : this.f75381.mo38564(inputFilterArr);
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ۧ */
    public final void mo38565(boolean z) {
        boolean zM20665 = C8946.m20665();
        C16971 c16971 = this.f75381;
        if (!zM20665) {
            c16971.m38566(z);
        } else {
            c16971.mo38565(z);
        }
    }

    @Override // p067l.C23008
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo38563() {
        return this.f75381.mo38563();
    }
}
