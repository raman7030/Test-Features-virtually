package l;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: FB0V */
/* JADX INFO: loaded from: classes.dex */
public final class C22422 extends C21717 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15365 f72654;

    public C22422(TextView textView) {
        this.f72654 = new C15365(textView);
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ֫ */
    public final TransformationMethod mo36403(TransformationMethod transformationMethod) {
        return !C6921.m18716() ? transformationMethod : this.f72654.mo36403(transformationMethod);
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ֫ */
    public final void mo36404(boolean z) {
        if (C6921.m18716()) {
            this.f72654.mo36404(z);
        }
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ֫ */
    public final InputFilter[] mo36406(InputFilter[] inputFilterArr) {
        return !C6921.m18716() ? inputFilterArr : this.f72654.mo36406(inputFilterArr);
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ۧ */
    public final void mo36407(boolean z) {
        boolean zM18716 = C6921.m18716();
        C15365 c15365 = this.f72654;
        if (!zM18716) {
            c15365.m36408(z);
        } else {
            c15365.mo36407(z);
        }
    }

    @Override // l.C21717
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo36405() {
        return this.f72654.mo36405();
    }
}
