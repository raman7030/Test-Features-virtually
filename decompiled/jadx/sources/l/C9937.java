package l;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9937 extends AbstractC2399 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f30010;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Uri f30011;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16431 f30012;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14159 f30013;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f30014;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23411 f30015;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f30016;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9937(C16431 c16431) {
        super(c16431.f50535 instanceof AbstractC3163);
        this.f30012 = c16431;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws Throwable {
        boolean zM38727;
        Uri uri = c3104.f9711;
        long jM33792 = c3104.f9713;
        this.f30011 = uri;
        long j = c3104.f9718;
        this.f30010 = j;
        m7774(c3104);
        Uri uri2 = this.f30011;
        C16431 c16431 = this.f30012;
        InterfaceC17889 interfaceC17889M38737 = c16431.m38737(uri2);
        if (C17781.m41659(interfaceC17889M38737.getName()) != null) {
            zM38727 = C16431.m38727(c16431, interfaceC17889M38737);
        } else {
            c16431.m38741(interfaceC17889M38737);
            zM38727 = false;
        }
        if (c16431.f50530 == null) {
            return m25055(c3104, interfaceC17889M38737.mo24433());
        }
        String strM38724 = C16431.m38724(interfaceC17889M38737);
        AbstractC15440 abstractC15440M38706 = C16431.m38706(c16431, strM38724);
        if (c16431.m38716(interfaceC17889M38737, abstractC15440M38706)) {
            c16431.m38726(interfaceC17889M38737, strM38724);
            return m25055(c3104, abstractC15440M38706);
        }
        if (!zM38727) {
            if (!C16431.m38723(c16431, interfaceC17889M38737)) {
                return m25055(c3104, abstractC15440M38706);
            }
            C14159 c14159M38705 = c16431.m38705(interfaceC17889M38737, strM38724, true);
            this.f30013 = c14159M38705;
            if (jM33792 == -1) {
                jM33792 = c14159M38705.m33792() - j;
            }
            this.f30014 = jM33792;
            if (jM33792 < 0) {
                throw new C22154(null, null, 2008);
            }
            this.f30016 = true;
            m7776(c3104);
            return this.f30014;
        }
        AbstractC13921 abstractC13921 = c16431.f50535;
        if (!(abstractC13921 instanceof AbstractC3163)) {
            throw new IOException("Network range cache is not available");
        }
        C14159 c14159 = new C14159(new C17054((AbstractC3163) abstractC13921, interfaceC17889M38737), interfaceC17889M38737.getName(), interfaceC17889M38737.getSize());
        this.f30013 = c14159;
        if (jM33792 == -1) {
            jM33792 = c14159.m33792() - j;
        }
        this.f30014 = jM33792;
        if (jM33792 < 0) {
            throw new C22154(null, null, 2008);
        }
        this.f30016 = true;
        m7776(c3104);
        return this.f30014;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m25055(C3104 c3104, AbstractC15440 abstractC15440) throws C22154 {
        C23411 c23411M36513 = abstractC15440.m36513("r");
        this.f30015 = c23411M36513;
        c23411M36513.seek(c3104.f9718);
        long length = c3104.f9713;
        if (length == -1) {
            length = this.f30015.length() - c3104.f9718;
        }
        this.f30014 = length;
        if (length < 0) {
            throw new C22154(null, null, 2008);
        }
        this.f30016 = true;
        m7776(c3104);
        return this.f30014;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws C22154 {
        int iM33790;
        if (i2 == 0) {
            return 0;
        }
        long j = this.f30014;
        if (j == 0) {
            return -1;
        }
        try {
            C23411 c23411 = this.f30015;
            if (c23411 != null) {
                iM33790 = c23411.read(bArr, i, (int) Math.min(j, i2));
            } else {
                iM33790 = this.f30013.m33790(this.f30010, bArr, i, (int) Math.min(j, i2));
            }
            if (iM33790 > 0) {
                long j2 = iM33790;
                this.f30010 += j2;
                this.f30014 -= j2;
                m7777(iM33790);
            }
            return iM33790;
        } catch (IOException e) {
            throw new C22154(2000, e);
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f30011;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f30011 = null;
        try {
            try {
                C23411 c23411 = this.f30015;
                if (c23411 != null) {
                    c23411.close();
                }
                C14159 c14159 = this.f30013;
                if (c14159 != null) {
                    c14159.close();
                }
                this.f30015 = null;
                this.f30013 = null;
                if (this.f30016) {
                    this.f30016 = false;
                    m7775();
                }
            } catch (IOException e) {
                throw new C22154(2000, e);
            }
        } catch (Throwable th) {
            this.f30015 = null;
            this.f30013 = null;
            if (this.f30016) {
                this.f30016 = false;
                m7775();
            }
            throw th;
        }
    }
}
