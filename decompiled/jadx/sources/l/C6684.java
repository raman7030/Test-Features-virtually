package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6684 extends EnumC8095 {
    public /* synthetic */ C6684() {
        this("FORMAT_45CC", 31);
    }

    public C6684(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int iM21487 = EnumC8095.m21487(i);
        if (iM21487 != 250) {
            throw new UnsupportedOperationException(String.valueOf(iM21487));
        }
        int iM21504 = EnumC8095.m21504(i);
        int iM21519 = EnumC8095.m21519(i);
        int i2 = interfaceC16186.read();
        int i3 = interfaceC16186.read();
        int iM21479 = EnumC8095.m21479(i3);
        int iM21491 = EnumC8095.m21491(i3);
        int iM21505 = EnumC8095.m21504(i3);
        int iM215110 = EnumC8095.m21519(i3);
        int i4 = interfaceC16186.read();
        C9838.m24906(iM21487);
        if (iM21519 < 1 || iM21519 > 5) {
            throw new C0374("bogus registerCount: ".concat(C14712.m35007(iM21519)), null);
        }
        return new C15149(this, iM21487, i2, i4, Arrays.copyOfRange(new int[]{iM21479, iM21491, iM21505, iM215110, iM21504}, 0, iM21519));
    }

    @Override // l.EnumC8095
    /* JADX INFO: renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        C15149 c15149 = (C15149) abstractC4193;
        EnumC8095.m21512(c15149.m12649(), EnumC8095.m21509(c15149.m35853(), c15149.mo2709()));
        EnumC8095.m21499(c15149.mo2707(), c15149.mo2708(), c15149.mo12651(), c15149.m35854());
        interfaceC2782.m8592();
    }
}
