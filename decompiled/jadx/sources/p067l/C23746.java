package p067l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩹᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8Q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23746 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f75543 = new C19203();

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
        C21196 c21196M51720;
        C19203 c19203 = this.f75543;
        c19203.m43708(i2 + i, bArr);
        c19203.m43730(i);
        ArrayList arrayList = new ArrayList();
        while (c19203.m43703() > 0) {
            C23877.m52956("Incomplete Mp4Webvtt Top Level box header found.", c19203.m43703() >= 8);
            int iM43739 = c19203.m43739();
            if (c19203.m43739() == 1987343459) {
                int i3 = iM43739 - 8;
                CharSequence charSequenceM53872 = null;
                C23207 c23207M53876 = null;
                while (i3 > 0) {
                    C23877.m52956("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM437310 = c19203.m43739();
                    int iM437311 = c19203.m43739();
                    int i4 = iM437310 - 8;
                    byte[] bArrM43728 = c19203.m43728();
                    int iM43731 = c19203.m43731();
                    String str = C5792.f14228;
                    String str2 = new String(bArrM43728, iM43731, i4, StandardCharsets.UTF_8);
                    c19203.m43724(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM437311 == 1937011815) {
                        c23207M53876 = C24416.m53876(str2);
                    } else if (iM437311 == 1885436268) {
                        charSequenceM53872 = C24416.m53872((String) null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceM53872 == null) {
                    charSequenceM53872 = "";
                }
                if (c23207M53876 != null) {
                    c23207M53876.m51726(charSequenceM53872);
                    c21196M51720 = c23207M53876.m51720();
                } else {
                    Pattern pattern = C24416.f77316;
                    C13688 c13688 = new C13688();
                    c13688.f38614 = charSequenceM53872;
                    c21196M51720 = c13688.m31095().m51720();
                }
                arrayList.add(c21196M51720);
            } else {
                c19203.m43724(iM43739 - 8);
            }
        }
        interfaceC24686.accept(new C14596(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
