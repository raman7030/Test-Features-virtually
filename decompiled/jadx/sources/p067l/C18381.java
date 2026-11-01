package p067l;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.ܽ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18381 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ᩳ */
    public Inflater f54894;

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f54891 = new C19203();

    /* JADX INFO: renamed from: ܽ */
    public final C19203 f54893 = new C19203();

    /* JADX INFO: renamed from: ۧ */
    public final C13018 f54892 = new C13018();

    @Override // p067l.InterfaceC11657
    public final /* synthetic */ void reset() {
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC15266 mo8743(int i, int i2, byte[] bArr) {
        return C16349.m37149(this, bArr, i2);
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final void mo8744(byte[] bArr, int i, int i2, C22386 c22386, InterfaceC24686 interfaceC24686) {
        C19203 c19203 = this.f54891;
        c19203.m43708(i2 + i, bArr);
        c19203.m43730(i);
        if (this.f54894 == null) {
            this.f54894 = new Inflater();
        }
        Inflater inflater = this.f54894;
        String str = C5792.f14228;
        if (c19203.m43703() > 0 && c19203.m43723() == 120) {
            C19203 c19204 = this.f54893;
            if (C5792.m13008(c19203, c19204, inflater)) {
                c19203.m43708(c19204.m43729(), c19204.m43728());
            }
        }
        C13018 c13018 = this.f54892;
        c13018.m29839();
        ArrayList arrayList = new ArrayList();
        while (c19203.m43703() >= 3) {
            int iM43729 = c19203.m43729();
            int iM43702 = c19203.m43702();
            int iM43710 = c19203.m43710();
            int iM43731 = c19203.m43731() + iM43710;
            C21196 c21196 = null;
            if (iM43731 > iM43729) {
                c19203.m43730(iM43729);
            } else {
                if (iM43702 != 128) {
                    switch (iM43702) {
                        case 20:
                            C13018.m29837(c13018, c19203, iM43710);
                            break;
                        case 21:
                            C13018.m29835(c13018, c19203, iM43710);
                            break;
                        case 22:
                            C13018.m29836(c13018, c19203, iM43710);
                            break;
                    }
                } else {
                    C21196 c21196M29838 = c13018.m29838();
                    c13018.m29839();
                    c21196 = c21196M29838;
                }
                c19203.m43730(iM43731);
            }
            if (c21196 != null) {
                arrayList.add(c21196);
            }
        }
        interfaceC24686.accept(new C14596(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
