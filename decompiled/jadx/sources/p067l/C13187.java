package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: renamed from: l.ۨ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13187 implements InterfaceC20563 {

    /* JADX INFO: renamed from: ֫ */
    public final C18724 f37048;

    /* JADX INFO: renamed from: ܳ */
    public final C17208 f37050;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12257 f37051;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC8233 f37053;

    /* JADX INFO: renamed from: ܿ */
    public int f37052 = 0;

    /* JADX INFO: renamed from: ۧ */
    public long f37049 = 262144;

    public C13187(C18724 c18724, C17208 c17208, InterfaceC8233 interfaceC8233, InterfaceC12257 interfaceC12257) {
        this.f37048 = c18724;
        this.f37050 = c17208;
        this.f37053 = interfaceC8233;
        this.f37051 = interfaceC12257;
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7603 mo30185(C10678 c10678, long j) {
        if ("chunked".equalsIgnoreCase(c10678.m24584("Transfer-Encoding"))) {
            if (this.f37052 != 1) {
                throw new IllegalStateException("state: " + this.f37052);
            }
            this.f37052 = 2;
            return new C5140(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f37052 != 1) {
            throw new IllegalStateException("state: " + this.f37052);
        }
        this.f37052 = 2;
        return new C13857(this, j);
    }

    @Override // p067l.InterfaceC20563
    public final void cancel() {
        C24585 c24585M38977 = this.f37050.m38977();
        if (c24585M38977 != null) {
            c24585M38977.m54218();
        }
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final void mo30188(C10678 c10678) {
        Proxy.Type type = this.f37050.m38977().m54226().m16902().type();
        StringBuilder sb = new StringBuilder();
        sb.append(c10678.m24589());
        sb.append(' ');
        if (!c10678.m24590() && type == Proxy.Type.HTTP) {
            sb.append(c10678.m24591());
        } else {
            C13535 c13535M24591 = c10678.m24591();
            String strM30819 = c13535M24591.m30819();
            String strM30824 = c13535M24591.m30824();
            if (strM30824 != null) {
                strM30819 = strM30819 + '?' + strM30824;
            }
            sb.append(strM30819);
        }
        sb.append(" HTTP/1.1");
        m30189(c10678.m24588(), sb.toString());
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final C16538 mo30186(C20066 c20066) {
        C17208 c17208 = this.f37050;
        c17208.f51224.getClass();
        String strM45435 = c20066.m45435("Content-Type");
        if (!C3127.m5332(c20066)) {
            return new C16538(strM45435, 0L, C25037.m54976(m30183(0L)));
        }
        if ("chunked".equalsIgnoreCase(c20066.m45435("Transfer-Encoding"))) {
            C13535 c13535M24591 = c20066.m45434().m24591();
            if (this.f37052 != 4) {
                throw new IllegalStateException("state: " + this.f37052);
            }
            this.f37052 = 5;
            return new C16538(strM45435, -1L, C25037.m54976(new C14527(this, c13535M24591)));
        }
        long jM5330 = C3127.m5330(c20066);
        if (jM5330 != -1) {
            return new C16538(strM45435, jM5330, C25037.m54976(m30183(jM5330)));
        }
        if (this.f37052 != 4) {
            throw new IllegalStateException("state: " + this.f37052);
        }
        this.f37052 = 5;
        c17208.m38978();
        return new C16538(strM45435, -1L, C25037.m54976(new C7822(this)));
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ۧ */
    public final void mo30190() {
        this.f37051.flush();
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final void mo30187() {
        this.f37051.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30189(C12194 c12194, String str) {
        if (this.f37052 != 0) {
            throw new IllegalStateException("state: " + this.f37052);
        }
        InterfaceC12257 interfaceC12257 = this.f37051;
        interfaceC12257.mo28280(str).mo28280("\r\n");
        int iM28164 = c12194.m28164();
        for (int i = 0; i < iM28164; i++) {
            interfaceC12257.mo28280(c12194.m28161(i)).mo28280(": ").mo28280(c12194.m28165(i)).mo28280("\r\n");
        }
        interfaceC12257.mo28280("\r\n");
        this.f37052 = 1;
    }

    @Override // p067l.InterfaceC20563
    /* JADX INFO: renamed from: ֫ */
    public final C5984 mo30184(boolean z) {
        int i = this.f37052;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f37052);
        }
        try {
            String strMo14208 = this.f37053.mo14208(this.f37049);
            this.f37049 -= (long) strMo14208.length();
            C23245 c23245M51791 = C23245.m51791(strMo14208);
            int i2 = c23245M51791.f73071;
            C5984 c5984 = new C5984();
            c5984.m13418(c23245M51791.f73073);
            c5984.m13411(i2);
            c5984.m13422(c23245M51791.f73072);
            c5984.m13416(m30191());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f37052 = 3;
                return c5984;
            }
            this.f37052 = 4;
            return c5984;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f37050);
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C12194 m30191() {
        C14205 c14205 = new C14205();
        while (true) {
            String strMo14208 = this.f37053.mo14208(this.f37049);
            this.f37049 -= (long) strMo14208.length();
            if (strMo14208.length() != 0) {
                AbstractC10007.f27689.mo23319(c14205, strMo14208);
            } else {
                return c14205.m32677();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3579 m30183(long j) {
        if (this.f37052 != 4) {
            throw new IllegalStateException("state: " + this.f37052);
        }
        this.f37052 = 5;
        return new C11846(this, j);
    }
}
