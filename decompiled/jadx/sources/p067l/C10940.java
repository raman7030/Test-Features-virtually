package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۡܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10940 extends AbstractC17644 {

    /* JADX INFO: renamed from: ۜ */
    public final List f30315;

    /* JADX INFO: renamed from: ܳ */
    public final C17441 f30316;

    /* JADX INFO: renamed from: ᩷ */
    public final List f30317;

    /* JADX INFO: renamed from: ᩻ */
    public final C17441 f30318;

    public C10940(C17441 c17441, C17441 c17442, List list, List list2, InterfaceC8848 interfaceC8848, C6836 c6836) {
        super(list.size(), list2.size(), interfaceC8848, c6836);
        this.f30316 = c17441;
        this.f30318 = c17442;
        this.f30315 = list;
        this.f30317 = list2;
    }

    @Override // p067l.AbstractC17644
    /* JADX INFO: renamed from: ֫ */
    public final void mo25214(int i, int i2, int i3, int i4) {
        C23600 c23600M12344 = C5575.m12344(this.f30315, this.f30317, i, i3, i2, i4);
        int i5 = c23600M12344.f75123;
        int i6 = c23600M12344.f75121;
        List listSubList = this.f30315.subList(i5, i6);
        int i7 = c23600M12344.f75124;
        int i8 = c23600M12344.f75122;
        InterfaceC8848 interfaceC8848M54811 = C24941.m54811(listSubList, this.f30317.subList(i7, i8), this.f52708);
        C19577 c19577 = this.f52706;
        c19577.m43009(i, i3, i5, i7);
        for (C23600 c23600 : interfaceC8848M54811.mo8421()) {
            int i9 = c23600.f75123;
            c19577.m43007(i5 + i9, c23600.f75124 + i7, c23600.f75121 - i9);
        }
        c19577.m43009(i6, i8, i2, i4);
    }

    @Override // p067l.AbstractC17644
    /* JADX INFO: renamed from: ֫ */
    public final C22930 mo25213(int i) {
        int i2 = this.f30316.getInt(i);
        return new C22930(i2, i2 + 1);
    }

    @Override // p067l.AbstractC17644
    /* JADX INFO: renamed from: ۧ */
    public final C22930 mo25215(int i) {
        int i2 = this.f30318.getInt(i);
        return new C22930(i2, i2 + 1);
    }
}
