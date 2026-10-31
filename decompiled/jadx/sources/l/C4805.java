package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P86L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4805 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile AbstractC8333 f15204;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3394 f15205;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16469 f15206;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12524 f15207;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15208;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15209;

    public C4805(C3394 c3394, boolean z, boolean z2, C12524 c12524, C16469 c16469) {
        this.f15205 = c3394;
        this.f15209 = z;
        this.f15208 = z2;
        this.f15207 = c12524;
        this.f15206 = c16469;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (this.f15209) {
            c17175.m40409();
            return null;
        }
        AbstractC8333 abstractC8333M30727 = this.f15204;
        if (abstractC8333M30727 == null) {
            abstractC8333M30727 = this.f15207.m30727(this.f15205, this.f15206);
            this.f15204 = abstractC8333M30727;
        }
        return abstractC8333M30727.mo2844(c17175);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        if (this.f15208) {
            c23525.m51981();
            return;
        }
        AbstractC8333 abstractC8333M30727 = this.f15204;
        if (abstractC8333M30727 == null) {
            abstractC8333M30727 = this.f15207.m30727(this.f15205, this.f15206);
            this.f15204 = abstractC8333M30727;
        }
        abstractC8333M30727.mo2845(c23525, obj);
    }
}
