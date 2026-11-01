package p067l;

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
public final class C19121 extends AbstractC15599 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public long f57040;

    /* JADX INFO: renamed from: ۙ */
    public Map f57041;

    /* JADX INFO: renamed from: ۛ */
    public final AbstractC17043 f57042;

    /* JADX INFO: renamed from: ۤ */
    public final C2582 f57043 = new C2582(1);

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC17043 f57044;

    /* JADX INFO: renamed from: ۬ */
    public C5530 f57045;

    /* JADX INFO: renamed from: ᩶ */
    public List f57046;

    /* JADX INFO: renamed from: ᩹ */
    public String f57047;

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return "tar";
    }

    public C19121(String str, String str2) {
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        this.f57042 = abstractC17043M42109;
        this.f57044 = str.equals(str2) ? abstractC17043M42109 : C18524.m42109(str2, new String[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19121 m43444(C14677 c14677) {
        C19121 c19121 = new C19121(c14677.m33593(), c14677.m33593());
        String strM33593 = c14677.m33593();
        if (!strM33593.isEmpty()) {
            c19121.f57047 = strM33593;
        }
        C19792 c19792 = (C19792) C5386.m11777(c14677.m33593());
        if (c19792 != null) {
            c19121.f57046 = c19792.f60200;
            c19121.f57041 = c19792.f60201;
            c19121.f57045 = c19792.f60203;
            c19121.f57040 = c19792.f60202;
        }
        return c19121;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) throws IOException {
        AbstractC17043 abstractC17043 = this.f57042;
        boolean z2 = true;
        while (true) {
            try {
                C12377 c12377 = new C12377(abstractC17043.m38671("r"), this.f57047);
                try {
                    this.f57046 = C21562.unmodifiableList(c12377.m28487());
                    HashMap map = new HashMap();
                    for (C3659 c3659 : this.f57046) {
                        map.put(c3659.m6979(), c3659);
                    }
                    this.f57041 = C21562.unmodifiableMap(map);
                    this.f57045 = new C5530(this.f57046);
                    this.f57040 = abstractC17043.mo25091();
                    c12377.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c12377.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (!z2 || !m43445()) {
                    throw e;
                }
                z2 = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m35471()) {
            return;
        }
        C2582 c2582 = this.f57043;
        c2582.close();
        while (true) {
            C12377 c12377 = (C12377) c2582.m3892();
            if (c12377 == null) {
                return;
            } else {
                C2700.m4192(c12377);
            }
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) throws IOException {
        AbstractC17043 abstractC17043 = this.f57042;
        C3659 c3659M30900 = ((C13577) interfaceC19370).m30900();
        C12377 c12377M28481 = m35471() ? (C12377) this.f57043.m3892() : null;
        if (c12377M28481 == null) {
            try {
                c12377M28481 = C12377.m28481(abstractC17043);
            } catch (IOException e) {
                if (m43445()) {
                    c12377M28481 = C12377.m28481(abstractC17043);
                } else {
                    throw e;
                }
            }
        }
        return new C18450(this, c12377M28481.m28486(c3659M30900), c12377M28481);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) throws IOException {
        if (this.f57041 == null) {
            mo9717(false);
        }
        boolean zEndsWith = str.endsWith("/");
        C3659 entry = getEntry(str.substring(1));
        if (entry == null || entry.m7006() != zEndsWith) {
            return null;
        }
        return new C13577(entry);
    }

    /* JADX INFO: renamed from: ᩸ */
    private boolean m43445() {
        AbstractC17043 abstractC17043;
        if (this.f57042.mo25094() || (abstractC17043 = this.f57044) == this.f57042) {
            return false;
        }
        synchronized (abstractC17043) {
            if (!this.f57042.mo25094()) {
                BufferedInputStream bufferedInputStreamM38676 = this.f57044.m38676();
                try {
                    InputStream inputStreamM32738 = C14247.m32738(bufferedInputStreamM38676);
                    if (inputStreamM32738 == null) {
                        throw new IOException("Extraction fail: " + this.f57044.mo25505());
                    }
                    AbstractC17043 abstractC17043M38678 = this.f57042.m38678(".tmp");
                    try {
                        abstractC17043M38678.m38651(inputStreamM32738);
                        abstractC17043M38678.m38656(this.f57042, (Runnable) null);
                        bufferedInputStreamM38676.close();
                    } catch (IOException e) {
                        abstractC17043M38678.mo29990();
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStreamM38676.close();
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

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update("tar".getBytes());
        C16111.m36662(messageDigest, this.f57042.mo25505());
        messageDigest.update(String.valueOf(this.f57040).getBytes());
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        if (this.f57041 == null) {
            mo9717(false);
        }
        if (C4809.f10911) {
            str = C17588.m40053(str, "/tar/");
        }
        List listM7180 = this.f57045.m7180(str.substring(1));
        ArrayList arrayList = new ArrayList(listM7180.size() + 1);
        Iterator it = listM7180.iterator();
        while (it.hasNext()) {
            arrayList.add(new C13577((C3659) it.next()));
        }
        return arrayList;
    }

    public final C3659 getEntry(String str) {
        Map map = this.f57041;
        if (map == null) {
            return null;
        }
        C3659 c3659 = (C3659) map.get(str);
        if (c3659 != null || !str.endsWith("/")) {
            return c3659;
        }
        C3659 c36510 = (C3659) map.get(str.substring(0, str.length() - 1));
        return (c36510 == null || !c36510.m7006()) ? (C3659) this.f57045.m7176(str) : c36510;
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public final List m43454() {
        return this.f57046;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
        c11996.m27459(this.f57042.mo25505());
        c11996.m27459(this.f57044.mo25505());
        c11996.m27459(m43449());
        c11996.m27459(C5386.m11775(new C19792(this.f57046, this.f57041, this.f57045, this.f57040)));
    }

    /* JADX INFO: renamed from: ᩴ */
    public final String m43452() {
        return this.f57042.mo25505();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC17043 m43453() {
        return this.f57042;
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m43448() {
        return this.f57044.mo25505();
    }

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC17043 m43447() {
        return this.f57044;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m43450() {
        return this.f57040 != this.f57042.mo25091();
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m43446() {
        return this.f57042.mo25094();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m43451(String str) {
        this.f57047 = str;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m43449() {
        String str = this.f57047;
        return str == null ? "" : str;
    }
}
