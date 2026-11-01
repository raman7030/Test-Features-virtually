package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C13039 implements InterfaceC4321 {

    /* JADX INFO: renamed from: ֫ */
    public final String f36664;

    /* JADX INFO: renamed from: ۧ */
    public final int f36665;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1489 f36666;

    /* JADX INFO: renamed from: ܿ */
    public final C21265 f36667;

    /* JADX INFO: renamed from: ᩳ */
    public final String f36668;

    public C13039(String str, int i, C21265 c21265, String str2, InterfaceC1489 interfaceC1489) {
        this.f36664 = str;
        this.f36665 = i;
        this.f36667 = c21265;
        this.f36668 = str2;
        this.f36666 = interfaceC1489;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m29856() {
        switch (this.f36664) {
            case "pt":
                return C18402.f54942;
            case "re":
                return C23219.m51754();
            case "tu":
                if (!C18402.f54944 || !C11419.m26417()) {
                    return false;
                }
            default:
                return true;
        }
    }

    @Override // p067l.InterfaceC4321
    public final String getName() {
        return C7050.m16224(this.f36665);
    }

    public final String toString() {
        return C7050.m16224(this.f36665);
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ۧ */
    public final C13596 mo8867() {
        return this.f36667.f66884;
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ֫ */
    public final String mo8865() {
        return this.f36664;
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo8868() {
        if (this.f36665 == R.string.MT_Protector) {
            return C6850.m15692();
        }
        return false;
    }

    @Override // p067l.InterfaceC4321
    /* JADX INFO: renamed from: ֫ */
    public final void mo8866(Main main) {
        this.f36666.accept(main);
    }
}
