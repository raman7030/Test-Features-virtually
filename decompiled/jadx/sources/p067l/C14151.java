package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.۫۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4PF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14151 extends AbstractC9476 implements InterfaceC10765 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC3167 f40350 = EnumC3167.f5951;

    /* JADX INFO: renamed from: ۙ */
    public final int f40351;

    /* JADX INFO: renamed from: ᩶ */
    public final List f40352;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089;
    }

    public C14151(int i, List list) {
        super(f40350);
        this.f40351 = i;
        this.f40352 = list == null ? AbstractC16192.m36872of() : list;
    }

    @Override // p067l.InterfaceC10765
    /* JADX INFO: renamed from: ᩷ */
    public final int mo21004() {
        return this.f40351;
    }

    @Override // p067l.InterfaceC10765
    /* JADX INFO: renamed from: ۬ */
    public final List mo21003() {
        return this.f40352;
    }

    @Override // p067l.AbstractC9476, p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۚ */
    public final int mo6216() {
        return (((this.f40352.size() * this.f40351) + 1) / 2) + 4;
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f40350.f6090;
    }
}
