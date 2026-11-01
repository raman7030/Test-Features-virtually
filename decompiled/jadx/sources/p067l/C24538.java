package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 24MP */
/* JADX INFO: loaded from: classes2.dex */
public final class C24538 extends AbstractC10969 {

    /* JADX INFO: renamed from: ᩶ */
    public final C11326 f77726;

    /* JADX INFO: renamed from: ᩹ */
    public final C19372[] f77727;

    public C24538(AbstractC17043 abstractC17043) {
        this(abstractC17043.m38664());
    }

    public C24538(InputStream inputStream) {
        this(new C5290(C2700.m4194(inputStream, 0)));
    }

    public C24538(byte[] bArr) {
        this(new C5290(bArr));
    }

    public C24538(C5290 c5290) throws Exception {
        int i;
        C7972 c7972M11445 = c5290.m11445(C4263.m8665(c5290.m11445(0)).f9454);
        while (c7972M11445.m18451() >= 8) {
            C4263 c4263M8665 = C4263.m8665(c7972M11445);
            int i2 = c4263M8665.f9453;
            if (c4263M8665.f9456 == 1) {
                c7972M11445.m18462(-8);
                break;
            }
            int i3 = c4263M8665.f9454;
            if (i3 < 8 || i2 < i3 || (i = i2 - 8) > c7972M11445.m18451()) {
                throw new IOException("Invalid chunk size before string pool at offset " + c4263M8665.f9455);
            }
            c7972M11445.m18462(i);
        }
        this.f77726 = new C11326(c7972M11445);
        this.f30383 = C15621.m35504(c5290, c7972M11445.m18455());
        int iM11442 = c5290.m11442(8);
        iM11442 = iM11442 < 0 ? 10 : iM11442;
        ArrayList arrayList = new ArrayList(iM11442);
        for (int i4 = 0; i4 < iM11442; i4++) {
            try {
                arrayList.add(new C19372(this, c7972M11445));
            } catch (Exception e) {
                if (i4 == 0) {
                    throw e;
                }
                if (c7972M11445.m18451() <= 0) {
                    this.f77727 = (C19372[]) arrayList.toArray(new C19372[0]);
                }
            }
        }
        this.f77727 = (C19372[]) arrayList.toArray(new C19372[0]);
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m54128() {
        this.f77726.m26269();
        for (C19372 c19372 : this.f77727) {
            c19372.f57827.m26269();
        }
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ᩻ۧ */
    public final C11326 mo16869() {
        return this.f77726;
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC14480 mo16869() {
        return this.f77726;
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ۚ */
    public final int mo16866() {
        return this.f77727.length;
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC6434 mo16867(int i) {
        return this.f77727[i];
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m54129() {
        C10949 c10949M25224 = C10949.m25224();
        for (C19372 c19372 : this.f77727) {
            c10949M25224.m25225(c19372.mo14722(), c19372.getPackageName());
        }
    }
}
