package l;

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
public final class C5031 extends AbstractC13921 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f15835;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f15836;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C22670 f15837;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC0091 f15838;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11506 f15839;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f15840;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f15841;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f15842;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f15843;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f15844;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f15845;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C22670 m14534(boolean z) {
        if (m14529() && (z || this.f15843 == null)) {
            C22670 c22670 = new C22670();
            this.f15837 = c22670;
            return c22670;
        }
        return null;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ */
    public final String mo7654() {
        return "payload";
    }

    public C5031(AbstractC15440 abstractC15440, long j, long j2) {
        this.f15836 = abstractC15440;
        this.f15840 = j;
        this.f15841 = j2;
        this.f15845 = null;
        this.f15842 = null;
        this.f15844 = 0;
        this.f15839 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5031 m14527(int i, String str, String str2) {
        return new C5031(str, str2, i, null);
    }

    public C5031(String str, String str2, int i, C11506 c11506) {
        this.f15836 = null;
        this.f15840 = 0L;
        this.f15841 = 0L;
        this.f15845 = str;
        C11003.requireNonNull(str2);
        this.f15842 = str2;
        this.f15844 = i;
        this.f15839 = c11506;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        if (m14529()) {
            C11506 c11506 = this.f15839;
            String strM28336 = c11506 == null ? null : c11506.m28336();
            boolean z = strM28336 != null;
            c10130.m25439(!z ? "\u0001MT_REMOTE_PAYLOAD_SOURCE_V1" : "\u0001MT_REMOTE_PAYLOAD_SOURCE_V2");
            c10130.m25423((CharSequence) this.f15845);
            c10130.m25423((CharSequence) this.f15842);
            c10130.writeInt(this.f15844);
            if (z) {
                c10130.m25431(c11506.m28335());
                c10130.m25432(c11506.m28331());
                c10130.m25432(c11506.m28333());
                c10130.m25423((CharSequence) strM28336);
                return;
            }
            return;
        }
        c10130.m25439(this.f15836.mo23554());
        c10130.m25431(this.f15840);
        c10130.m25431(this.f15841);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5031 m14528(C12951 c12951) {
        String strM31506 = c12951.m31506();
        if ("\u0001MT_REMOTE_PAYLOAD_SOURCE_V1".equals(strM31506)) {
            return m14527(c12951.readInt(), c12951.m31504(), c12951.m31504());
        }
        if ("\u0001MT_REMOTE_PAYLOAD_SOURCE_V2".equals(strM31506)) {
            return new C5031(c12951.m31504(), c12951.m31504(), c12951.readInt(), new C11506(c12951.readLong(), c12951.m31487(), c12951.m31487(), c12951.m31504()));
        }
        return new C5031(C16999.m39866(strM31506, new String[0]), c12951.readLong(), c12951.readLong());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14535(C22670 c22670) {
        InterfaceC0091 interfaceC0091 = this.f15838;
        if (interfaceC0091 != null) {
            C0349.m1793(interfaceC0091);
            this.f15838 = null;
        }
        InterfaceC0091 interfaceC0091M14530 = m14530(c22670);
        this.f15838 = interfaceC0091M14530;
        this.f15843 = interfaceC0091M14530.mo1052();
        InterfaceC0091 interfaceC0092 = this.f15838;
        if (interfaceC0092 instanceof C11382) {
            this.f15839 = ((C11382) interfaceC0092).m28136();
            return;
        }
        AbstractC15440 abstractC15440 = this.f15836;
        if (abstractC15440 != null) {
            this.f15835 = abstractC15440.mo23117();
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
        C22670 c22670;
        synchronized (this) {
            c22670 = this.f15837;
            this.f15837 = null;
        }
        m14535(c22670);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        if (this.f15838 == null) {
            mo7646(false);
        }
        return this.f15838.mo1050(((C19143) interfaceC17889).m44213());
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        if (this.f15843 == null) {
            mo7646(false);
        }
        String strSubstring = str.substring(1);
        for (C13621 c13621 : this.f15843) {
            if (c13621.m32740().equals(strSubstring)) {
                return new C19143(c13621);
            }
        }
        return null;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("payload".getBytes());
        C14460.m34528(messageDigest, m14532());
        if (m14529()) {
            C14460.m34528(messageDigest, this.f15842);
        } else {
            messageDigest.update(String.valueOf(this.f15835).getBytes());
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f15843 == null) {
            mo7646(false);
        }
        ArrayList arrayList = new ArrayList(this.f15843.size() + 1);
        if ("/".equals(str)) {
            Iterator it = this.f15843.iterator();
            while (it.hasNext()) {
                arrayList.add(new C19143((C13621) it.next()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0091 m14530(C22670 c22670) throws IOException {
        if (!m14529()) {
            long j = this.f15841;
            C23411 c23411M36513 = this.f15836.m36513("r");
            long j2 = this.f15840;
            if (j2 > 0) {
                try {
                    c23411M36513 = c23411M36513.m51861(j2, j);
                } catch (IOException e) {
                    c23411M36513.close();
                    throw e;
                }
            }
            return new C18437(c23411M36513);
        }
        return C11382.m28133(this.f15845, this.f15842, this.f15844, this.f15839, c22670);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m14533() {
        return this.f15836;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m14537() {
        AbstractC15440 abstractC15440 = this.f15836;
        return (abstractC15440 == null || this.f15835 == abstractC15440.mo23117()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m14536() {
        AbstractC15440 abstractC15440 = this.f15836;
        return abstractC15440 == null || abstractC15440.mo23120();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m14529() {
        return this.f15845 != null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m14532() {
        return m14529() ? this.f15845 : this.f15836.mo23554();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m14531() {
        if (m14529()) {
            StringBuilder sb = new StringBuilder("remote\nurlLength=");
            String str = this.f15845;
            sb.append(str.length());
            sb.append("\n");
            sb.append(str);
            return sb.toString();
        }
        String strMo23554 = this.f15836.mo23554();
        int i = C21965.f70357;
        return "pathLength=" + strMo23554.length() + "\n" + strMo23554 + "\noffset=" + this.f15840 + "\nlength=" + this.f15841;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0091 interfaceC0091 = this.f15838;
        if (interfaceC0091 != null) {
            C0349.m1793(interfaceC0091);
            this.f15838 = null;
        }
    }
}
