package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7150 extends AbstractC15599 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public long f18667;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17043 f18668;

    /* JADX INFO: renamed from: ۛ */
    public C23914 f18669;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC2455 f18670;

    /* JADX INFO: renamed from: ۨ */
    public C13304 f18671;

    /* JADX INFO: renamed from: ۫ */
    public final long f18672;

    /* JADX INFO: renamed from: ۬ */
    public final long f18673;

    /* JADX INFO: renamed from: ܰ */
    public final String f18674;

    /* JADX INFO: renamed from: ᩶ */
    public List f18675;

    /* JADX INFO: renamed from: ᩹ */
    public final int f18676;

    /* JADX INFO: renamed from: ᩺ */
    public final String f18677;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C23914 m16438(boolean z) {
        if (m16433() && (z || this.f18675 == null)) {
            C23914 c23914 = new C23914();
            this.f18669 = c23914;
            return c23914;
        }
        return null;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return "payload";
    }

    public C7150(AbstractC17043 abstractC17043, long j, long j2) {
        this.f18668 = abstractC17043;
        this.f18672 = j;
        this.f18673 = j2;
        this.f18677 = null;
        this.f18674 = null;
        this.f18676 = 0;
        this.f18671 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7150 m16431(int i, String str, String str2) {
        return new C7150(str, str2, i, null);
    }

    public C7150(String str, String str2, int i, C13304 c13304) {
        this.f18668 = null;
        this.f18672 = 0L;
        this.f18673 = 0L;
        this.f18677 = str;
        C12826.requireNonNull(str2);
        this.f18674 = str2;
        this.f18676 = i;
        this.f18671 = c13304;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
        if (m16433()) {
            C13304 c13304 = this.f18671;
            String strM30380 = c13304 == null ? null : c13304.m30380();
            boolean z = strM30380 != null;
            c11996.m27459(!z ? "\u0001MT_REMOTE_PAYLOAD_SOURCE_V1" : "\u0001MT_REMOTE_PAYLOAD_SOURCE_V2");
            c11996.m27443((CharSequence) this.f18677);
            c11996.m27443((CharSequence) this.f18674);
            c11996.writeInt(this.f18676);
            if (z) {
                c11996.m27451(c13304.m30379());
                c11996.m27452(c13304.m30375());
                c11996.m27452(c13304.m30377());
                c11996.m27443((CharSequence) strM30380);
                return;
            }
            return;
        }
        c11996.m27459(this.f18668.mo25505());
        c11996.m27451(this.f18672);
        c11996.m27451(this.f18673);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7150 m16432(C14677 c14677) {
        String strM33593 = c14677.m33593();
        if ("\u0001MT_REMOTE_PAYLOAD_SOURCE_V1".equals(strM33593)) {
            return m16431(c14677.readInt(), c14677.m33591(), c14677.m33591());
        }
        if ("\u0001MT_REMOTE_PAYLOAD_SOURCE_V2".equals(strM33593)) {
            return new C7150(c14677.m33591(), c14677.m33591(), c14677.readInt(), new C13304(c14677.readLong(), c14677.m33574(), c14677.m33574(), c14677.m33591()));
        }
        return new C7150(C18524.m42109(strM33593, new String[0]), c14677.readLong(), c14677.readLong());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16439(C23914 c23914) {
        InterfaceC2455 interfaceC2455 = this.f18670;
        if (interfaceC2455 != null) {
            C2700.m4192(interfaceC2455);
            this.f18670 = null;
        }
        InterfaceC2455 interfaceC2455M16434 = m16434(c23914);
        this.f18670 = interfaceC2455M16434;
        this.f18675 = interfaceC2455M16434.mo3448();
        InterfaceC2455 interfaceC2456 = this.f18670;
        if (interfaceC2456 instanceof C13186) {
            this.f18671 = ((C13186) interfaceC2456).m30180();
            return;
        }
        AbstractC17043 abstractC17043 = this.f18668;
        if (abstractC17043 != null) {
            this.f18667 = abstractC17043.mo25091();
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        C23914 c23914;
        synchronized (this) {
            c23914 = this.f18669;
            this.f18669 = null;
        }
        m16439(c23914);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) {
        if (this.f18670 == null) {
            mo9717(false);
        }
        return this.f18670.mo3446(((C20562) interfaceC19370).m46507());
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        if (this.f18675 == null) {
            mo9717(false);
        }
        String strSubstring = str.substring(1);
        for (C15314 c15314 : this.f18675) {
            if (c15314.m34854().equals(strSubstring)) {
                return new C20562(c15314);
            }
        }
        return null;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update("payload".getBytes());
        C16111.m36662(messageDigest, m16436());
        if (m16433()) {
            C16111.m36662(messageDigest, this.f18674);
        } else {
            messageDigest.update(String.valueOf(this.f18667).getBytes());
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        if (this.f18675 == null) {
            mo9717(false);
        }
        ArrayList arrayList = new ArrayList(this.f18675.size() + 1);
        if ("/".equals(str)) {
            Iterator it = this.f18675.iterator();
            while (it.hasNext()) {
                arrayList.add(new C20562((C15314) it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2455 m16434(C23914 c23914) throws IOException {
        if (!m16433()) {
            long j = this.f18673;
            C24618 c24618M38671 = this.f18668.m38671("r");
            long j2 = this.f18672;
            if (j2 > 0) {
                try {
                    c24618M38671 = c24618M38671.m54259(j2, j);
                } catch (IOException e) {
                    c24618M38671.close();
                    throw e;
                }
            }
            return new C19891(c24618M38671);
        }
        return C13186.m30177(this.f18677, this.f18674, this.f18676, this.f18671, c23914);
    }

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC17043 m16437() {
        return this.f18668;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m16441() {
        AbstractC17043 abstractC17043 = this.f18668;
        return (abstractC17043 == null || this.f18667 == abstractC17043.mo25091()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m16440() {
        AbstractC17043 abstractC17043 = this.f18668;
        return abstractC17043 == null || abstractC17043.mo25094();
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m16433() {
        return this.f18677 != null;
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m16436() {
        return m16433() ? this.f18677 : this.f18668.mo25505();
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m16435() {
        if (m16433()) {
            StringBuilder sb = new StringBuilder("remote\nurlLength=");
            String str = this.f18677;
            sb.append(str.length());
            sb.append("\n");
            sb.append(str);
            return sb.toString();
        }
        String strMo25505 = this.f18668.mo25505();
        int i = C23244.f73068;
        return "pathLength=" + strMo25505.length() + "\n" + strMo25505 + "\noffset=" + this.f18672 + "\nlength=" + this.f18673;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC2455 interfaceC2455 = this.f18670;
        if (interfaceC2455 != null) {
            C2700.m4192(interfaceC2455);
            this.f18670 = null;
        }
    }
}
