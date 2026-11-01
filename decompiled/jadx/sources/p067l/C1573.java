package p067l;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩶ */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes4.dex */
public final class C1573 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f48131;

    /* JADX INFO: renamed from: ۧ */
    public final Bundle f48132;

    /* JADX INFO: renamed from: ܽ */
    public final C1073 f48133;

    /* JADX INFO: renamed from: ܿ */
    public final CharSequence f48134;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f48135;

    public C1573(C1073 c1073, SpannableStringBuilder spannableStringBuilder) {
        Bundle bundle = new Bundle();
        this.f48131 = true;
        this.f48135 = true;
        this.f48133 = c1073;
        this.f48134 = C1888.m50320(spannableStringBuilder);
        this.f48132 = bundle;
        this.f48131 = true;
        this.f48135 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2028 m37191() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        return new C2028(this.f48133, this.f48134, null, this.f48132, arrayList2.isEmpty() ? null : (C1726[]) arrayList2.toArray(new C1726[arrayList2.size()]), arrayList.isEmpty() ? null : (C1726[]) arrayList.toArray(new C1726[arrayList.size()]), this.f48131, this.f48135);
    }
}
