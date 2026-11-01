package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.֨֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public final class C3088 extends C5771 {

    /* JADX INFO: renamed from: ۧ֫ */
    public int f5585;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f5586;

    public C3088(AbstractC12224 abstractC12224, AbstractC6462 abstractC6462, int i, AbstractC7783 abstractC7783) {
        super(9L, abstractC12224, abstractC6462, abstractC7783);
        this.f5585 = Integer.MIN_VALUE;
        this.f5586 = i;
    }

    @Override // p067l.C5771, p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5228(InterfaceC11807 interfaceC11807, Locale locale) {
        return interfaceC11807.mo6261(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m5227(EnumC19998 enumC19998) {
        if (this.f5585 != Integer.MIN_VALUE && !enumC19998.m45371()) {
            return this.f5585;
        }
        int iM16379 = EnumC7112.m16379(enumC19998, this.f5586);
        this.f5585 = iM16379;
        return iM16379;
    }
}
