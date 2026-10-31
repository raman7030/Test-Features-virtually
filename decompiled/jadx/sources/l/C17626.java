package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 18FX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17626 extends AbstractC13921 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f53847;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f53848;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f53849;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0225 f53850 = new C0225(1);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f53851;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3326 f53852;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f53853;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f53854;

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ */
    public final String mo7654() {
        return "tar";
    }

    public C17626(String str, String str2) {
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        this.f53849 = abstractC15440M39866;
        this.f53851 = str.equals(str2) ? abstractC15440M39866 : C16999.m39866(str2, new String[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17626 m41198(C12951 c12951) {
        C17626 c17626 = new C17626(c12951.m31506(), c12951.m31506());
        String strM31506 = c12951.m31506();
        if (!strM31506.isEmpty()) {
            c17626.f53854 = strM31506;
        }
        C18332 c18332 = (C18332) C3175.m9733(c12951.m31506());
        if (c18332 != null) {
            c17626.f53853 = c18332.f56982;
            c17626.f53848 = c18332.f56983;
            c17626.f53852 = c18332.f56985;
            c17626.f53847 = c18332.f56984;
        }
        return c17626;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) throws IOException {
        AbstractC15440 abstractC15440 = this.f53849;
        boolean z2 = true;
        while (true) {
            try {
                C10531 c10531 = new C10531(abstractC15440.m36513("r"), this.f53854);
                try {
                    this.f53853 = C20195.unmodifiableList(c10531.m26454());
                    HashMap map = new HashMap();
                    for (C1358 c1358 : this.f53853) {
                        map.put(c1358.m4741(), c1358);
                    }
                    this.f53848 = C20195.unmodifiableMap(map);
                    this.f53852 = new C3326(this.f53853);
                    this.f53847 = abstractC15440.mo23117();
                    c10531.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c10531.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (!z2 || !m41199()) {
                    throw e;
                }
                z2 = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m33352()) {
            return;
        }
        C0225 c0225 = this.f53850;
        c0225.close();
        while (true) {
            C10531 c10531 = (C10531) c0225.m1479();
            if (c10531 == null) {
                return;
            } else {
                C0349.m1793(c10531);
            }
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) throws IOException {
        AbstractC15440 abstractC15440 = this.f53849;
        C1358 c1358M28851 = ((C11793) interfaceC17889).m28851();
        C10531 c10531M26448 = m33352() ? (C10531) this.f53850.m1479() : null;
        if (c10531M26448 == null) {
            try {
                c10531M26448 = C10531.m26448(abstractC15440);
            } catch (IOException e) {
                if (m41199()) {
                    c10531M26448 = C10531.m26448(abstractC15440);
                } else {
                    throw e;
                }
            }
        }
        return new C16920(this, c10531M26448.m26453(c1358M28851), c10531M26448);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) throws IOException {
        if (this.f53848 == null) {
            mo7646(false);
        }
        boolean zEndsWith = str.endsWith("/");
        C1358 entry = getEntry(str.substring(1));
        if (entry == null || entry.m4768() != zEndsWith) {
            return null;
        }
        return new C11793(entry);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m41199() {
        AbstractC15440 abstractC15440;
        if (this.f53849.mo23120() || (abstractC15440 = this.f53851) == this.f53849) {
            return false;
        }
        synchronized (abstractC15440) {
            if (!this.f53849.mo23120()) {
                BufferedInputStream bufferedInputStreamM36518 = this.f53851.m36518();
                try {
                    InputStream inputStreamM30663 = C12498.m30663(bufferedInputStreamM36518);
                    if (inputStreamM30663 == null) {
                        throw new IOException("Extraction fail: " + this.f53851.mo23554());
                    }
                    AbstractC15440 abstractC15440M36520 = this.f53849.m36520(".tmp");
                    try {
                        abstractC15440M36520.m36493(inputStreamM30663);
                        abstractC15440M36520.m36498(this.f53849, (Runnable) null);
                        bufferedInputStreamM36518.close();
                    } catch (IOException e) {
                        abstractC15440M36520.mo27929();
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStreamM36518.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw th;
            }
        }
        return true;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("tar".getBytes());
        C14460.m34528(messageDigest, this.f53849.mo23554());
        messageDigest.update(String.valueOf(this.f53847).getBytes());
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f53848 == null) {
            mo7646(false);
        }
        if (C2568.f8121) {
            str = C16014.m37867(str, "/tar/");
        }
        List listM4937 = this.f53852.m4937(str.substring(1));
        ArrayList arrayList = new ArrayList(listM4937.size() + 1);
        Iterator it = listM4937.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11793((C1358) it.next()));
        }
        return arrayList;
    }

    public final C1358 getEntry(String str) {
        Map map = this.f53848;
        if (map == null) {
            return null;
        }
        C1358 c1358 = (C1358) map.get(str);
        if (c1358 != null || !str.endsWith("/")) {
            return c1358;
        }
        C1358 c1359 = (C1358) map.get(str.substring(0, str.length() - 1));
        return (c1359 == null || !c1359.m4768()) ? (C1358) this.f53852.m4933(str) : c1359;
    }

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final List m41208() {
        return this.f53853;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        c10130.m25439(this.f53849.mo23554());
        c10130.m25439(this.f53851.mo23554());
        c10130.m25439(m41203());
        c10130.m25439(C3175.m9731(new C18332(this.f53853, this.f53848, this.f53852, this.f53847)));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m41206() {
        return this.f53849.mo23554();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m41207() {
        return this.f53849;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m41202() {
        return this.f53851.mo23554();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m41201() {
        return this.f53851;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m41204() {
        return this.f53847 != this.f53849.mo23117();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m41200() {
        return this.f53849.mo23120();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41205(String str) {
        this.f53854 = str;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m41203() {
        String str = this.f53854;
        return str == null ? "" : str;
    }
}
