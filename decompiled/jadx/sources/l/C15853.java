package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8IG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15853 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f48973;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f48974;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48975;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f48976;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48977;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f48978;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f48979;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    public C15853(int i, int i2, String str) {
        this.f48974 = i;
        this.f48976 = i2;
        this.f48978 = str;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        int i = this.f48976;
        int i2 = this.f48974;
        C22632.m50634((i2 == -1 || i == -1) ? false : true);
        C17714 c17714 = new C17714(i);
        ((C16184) interfaceC8424).mo22068(false, 0, i, c17714.m41482());
        return c17714.m41464() == i2;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f48973 = interfaceC21830;
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(1024, 4);
        this.f48979 = interfaceC19383Mo3429;
        C1297 c1297 = new C1297();
        String str = this.f48978;
        c1297.m4462(str);
        c1297.m4465(str);
        interfaceC19383Mo3429.mo8456(c1297.m4440());
        this.f48973.mo3431();
        this.f48973.mo3430(new C2449());
        this.f48975 = 1;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        int i = this.f48975;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC19383 interfaceC19383 = this.f48979;
        interfaceC19383.getClass();
        int iMo8451 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, 1024, true);
        if (iMo8451 == -1) {
            this.f48975 = 2;
            this.f48979.mo8455(0L, 1, this.f48977, 0, null);
            this.f48977 = 0;
            return 0;
        }
        this.f48977 += iMo8451;
        return 0;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        if (j == 0 || this.f48975 == 1) {
            this.f48975 = 1;
            this.f48977 = 0;
        }
    }
}
