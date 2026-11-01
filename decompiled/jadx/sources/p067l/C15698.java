package p067l;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15698 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ۧ */
    public final C19203 f45494 = new C19203();

    /* JADX INFO: renamed from: ֫ */
    public final C21735 f45493 = new C21735();

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
        C5641 c5641M53875;
        C19203 c19203 = this.f45494;
        c19203.m43708(i2 + i, bArr);
        c19203.m43730(i);
        ArrayList arrayList = new ArrayList();
        try {
            C9664.m22541(c19203);
            while (!TextUtils.isEmpty(c19203.m43720(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b = -1;
                int iM43731 = 0;
                while (b == -1) {
                    iM43731 = c19203.m43731();
                    String strM43720 = c19203.m43720(StandardCharsets.UTF_8);
                    if (strM43720 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strM43720)) {
                        b = 2;
                    } else {
                        b = strM43720.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                c19203.m43730(iM43731);
                if (b == 0) {
                    C7891.m18239(new C12486(arrayList2), c22386, interfaceC24686);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(c19203.m43720(StandardCharsets.UTF_8))) {
                    }
                } else if (b == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    c19203.m43720(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f45493.m49017(c19203));
                } else if (b == 3 && (c5641M53875 = C24416.m53875(c19203, arrayList)) != null) {
                    arrayList2.add(c5641M53875);
                }
            }
        } catch (C10998 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
