package p067l;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺۤ */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C1629 {

    /* JADX INFO: renamed from: ֫ */
    public int f52170;

    /* JADX INFO: renamed from: ۧ */
    public boolean f52171;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC1594 f52172;

    public C1629() {
        this.f52171 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.f52172 = C1034.f15189;
        this.f52170 = 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1034 m39775() {
        if (this.f52170 == 2 && this.f52172 == C1034.f15189) {
            return this.f52171 ? C1034.f15185 : C1034.f15186;
        }
        return new C1034(this.f52171, this.f52170, this.f52172);
    }
}
