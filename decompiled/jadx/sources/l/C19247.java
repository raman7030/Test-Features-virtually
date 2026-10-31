package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.᩵ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19247 extends AbstractC13921 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f60572;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Charset f60573;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23734 f60576;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f60577;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f60578;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Map f60579;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60580;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12534 f60581;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f60582;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte[] f60575 = C5659.f17466;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60574 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C0225 f60583 = new C0225(1);

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ */
    public final String mo7654() {
        return "zip";
    }

    public C19247(String str) {
        this.f60580 = C16999.m39866(str, new String[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19247 m44378(C12951 c12951) {
        C19247 c19247 = new C19247(c12951.m31506());
        c19247.f60575 = c12951.m31496();
        c19247.f60582 = c12951.m31498();
        c19247.f60577 = c12951.m31503();
        String strM31506 = c12951.m31506();
        if (!strM31506.isEmpty()) {
            c19247.m44389(strM31506);
        }
        String strM31507 = c12951.m31506();
        if (!strM31507.isEmpty()) {
            c19247.f60573 = Charset.forName(strM31507);
        }
        C18541 c18541 = (C18541) C3175.m9733(c12951.m31506());
        if (c18541 != null) {
            c19247.f60572 = c18541.f57453;
            c19247.f60579 = c18541.f57454;
            c19247.f60576 = c18541.f57456;
            c19247.f60578 = c18541.f57455;
        }
        return c19247;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
        C18090 c18090 = new C18090(this.f60580, this.f60573);
        try {
            m44379(c18090);
            c18090.close();
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List m44383() {
        C18090 c18090M42166 = C18090.m42166(this.f60580, this.f60573);
        try {
            m44379(c18090M42166);
            List listUnmodifiableList = C20195.unmodifiableList(new ArrayList(c18090M42166.m42205()));
            c18090M42166.close();
            return listUnmodifiableList;
        } catch (Throwable th) {
            try {
                c18090M42166.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44379(C18090 c18090) {
        byte[] bArrM42188 = c18090.m42188();
        if (bArrM42188 == null) {
            bArrM42188 = C5659.f17466;
        }
        this.f60575 = bArrM42188;
        this.f60572 = C20195.unmodifiableList(c18090.m42194());
        this.f60579 = c18090.m42195();
        this.f60576 = new C23734(this.f60572);
        boolean zM42212 = c18090.m42212();
        this.f60582 = zM42212;
        this.f60577 = zM42212 ? C22263.m49979(c18090) : null;
        this.f60578 = this.f60580.mo23117();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m33352()) {
            return;
        }
        C0225 c0225 = this.f60583;
        c0225.close();
        while (true) {
            C18090 c18090 = (C18090) c0225.m1479();
            if (c18090 == null) {
                return;
            } else {
                C0349.m1793(c18090);
            }
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        return m44381(abstractActivityC3346, interfaceC17889, new C11461());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e A[Catch: ۘܰۡ -> 0x013a, TRY_LEAVE, TryCatch #3 {ۘܰۡ -> 0x013a, blocks: (B:63:0x00fc, B:67:0x010d, B:69:0x011a, B:71:0x0120, B:73:0x0128, B:75:0x012e), top: B:89:0x00fc }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FilterInputStream m44381(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889, final InterfaceC17066 interfaceC17066) throws C3979 {
        boolean zM29464;
        boolean z;
        BufferedInputStream bufferedInputStream;
        C0225 c0225;
        boolean z2;
        if (!interfaceC17066.mo1526()) {
            C3545 c3545M30924 = ((C12645) interfaceC17889).m30924();
            boolean zM50505 = C22523.m50505(c3545M30924);
            C0225 c0226 = this.f60583;
            AbstractC15440 abstractC15440 = this.f60580;
            if (!zM50505) {
                Iterator itM26216 = null;
                while (!interfaceC17066.mo1526()) {
                    String strM44390 = m44390();
                    try {
                        if (c3545M30924.m10808() && (strM44390 == null || strM44390.isEmpty())) {
                            if (itM26216 == null) {
                                itM26216 = C10395.m26216();
                            }
                            if (itM26216.hasNext()) {
                                m44389((String) itM26216.next());
                                zM29464 = false;
                                z = true;
                            } else {
                                C12079 c12079 = new C12079(abstractActivityC3346, new C7385(1, this));
                                c12079.m29463(new BooleanSupplier() { // from class: l.ۖۙ᩻
                                    @Override // java.util.function.BooleanSupplier
                                    public final boolean getAsBoolean() {
                                        return interfaceC17066.mo1526();
                                    }
                                });
                                zM29464 = c12079.m29464();
                                if (!zM29464) {
                                    break;
                                }
                            }
                            byte[] bArr = this.f60575;
                            String strM44391 = m44390();
                            if (m33352()) {
                                c0225 = c0226;
                            } else {
                                c0225 = null;
                            }
                            bufferedInputStream = new BufferedInputStream(C22523.m50497(c3545M30924, abstractC15440, bArr, strM44391, c0225));
                            if (c3545M30924.m10808() || C22523.m50506(c3545M30924, bufferedInputStream)) {
                                if (z) {
                                    C22523.m50501(m44390(), abstractC15440.mo23554());
                                }
                                return bufferedInputStream;
                            }
                            C0349.m1793(bufferedInputStream);
                            m44389(null);
                            if (zM29464) {
                                C22523.m50500();
                            }
                        } else {
                            zM29464 = false;
                        }
                        byte[] bArr2 = this.f60575;
                        String strM44392 = m44390();
                        if (m33352()) {
                            c0225 = c0226;
                        } else {
                            c0225 = null;
                        }
                        bufferedInputStream = new BufferedInputStream(C22523.m50497(c3545M30924, abstractC15440, bArr2, strM44392, c0225));
                        if (c3545M30924.m10808()) {
                        }
                        if (z) {
                            C22523.m50501(m44390(), abstractC15440.mo23554());
                        }
                        return bufferedInputStream;
                    } catch (C3979 e) {
                        if (c3545M30924.m10808()) {
                            m44389(null);
                            if (zM29464) {
                                C22523.m50500();
                            }
                        } else {
                            throw e;
                        }
                    }
                    z = false;
                }
            } else {
                String strM44393 = m44390();
                List listM50498 = null;
                while (!interfaceC17066.mo1526()) {
                    if (strM44393 == null || strM44393.isEmpty()) {
                        if (listM50498 == null) {
                            C18090 c18090M42168 = C18090.m42168(abstractC15440, this.f60575);
                            try {
                                listM50498 = C22523.m50498(c18090M42168, c3545M30924, interfaceC17066);
                                c18090M42168.close();
                            } catch (Throwable th) {
                                try {
                                    c18090M42168.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        AtomicReference atomicReference = new AtomicReference();
                        C12079 c120710 = new C12079(abstractActivityC3346, new C20378(atomicReference));
                        c120710.m29463(new BooleanSupplier() { // from class: l.ۖۙ᩻
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return interfaceC17066.mo1526();
                            }
                        });
                        if (!c120710.m29465(listM50498)) {
                            return null;
                        }
                        strM44393 = (String) atomicReference.get();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(C22523.m50497(c3545M30924, abstractC15440, this.f60575, strM44393, m33352() ? c0226 : null));
                        if (!C22523.m50506(c3545M30924, bufferedInputStream2)) {
                            C0349.m1793(bufferedInputStream2);
                            throw new C3979(c3545M30924.getName());
                        }
                        return new C3724(this, bufferedInputStream2, strM44393, z2);
                    } catch (C3979 unused) {
                        C10395.m26214(abstractC15440.mo23554(), strM44393);
                        if (z2) {
                            C22523.m50500();
                        }
                        strM44393 = null;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        if (this.f60579 == null) {
            mo7646(false);
        }
        C3545 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C12645(entry);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("zip".getBytes());
        C14460.m34528(messageDigest, this.f60580.mo23554());
        messageDigest.update(String.valueOf(this.f60578).getBytes());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12534 m44386() {
        C12534 c12534 = this.f60581;
        if (c12534 != null) {
            return c12534;
        }
        if (!this.f60574) {
            return null;
        }
        this.f60574 = false;
        try {
            if (this.f60572 == null) {
                mo7646(false);
            }
            C3545 c3545 = (C3545) this.f60579.get("resources.arsc");
            if (c3545 != null && c3545.getSize() < 15728640) {
                C18090 c18090M42168 = C18090.m42168(this.f60580, this.f60575);
                try {
                    this.f60581 = new C12534(0, new C23326(c18090M42168.m42189(c3545)));
                    c18090M42168.close();
                } catch (Throwable th) {
                    try {
                        c18090M42168.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return this.f60581;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f60572 == null) {
            mo7646(false);
        }
        if (C2568.f8121) {
            str = C16014.m37867(str, "/zip/");
        }
        List listM4937 = this.f60576.m4937(str.substring(1));
        ArrayList arrayList = new ArrayList(listM4937.size() + 1);
        Iterator it = listM4937.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12645((C3545) it.next()));
        }
        return arrayList;
    }

    public final C3545 getEntry(String str) {
        Map map = this.f60579;
        if (map == null) {
            return null;
        }
        C3545 c3545 = (C3545) map.get(str);
        return (c3545 == null && str.endsWith("/")) ? (C3545) this.f60576.m4933(str) : c3545;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final byte[] m44388() {
        return this.f60575;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m44395() {
        return this.f60575.length > 0;
    }

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final List m44393() {
        return this.f60572;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        c10130.m25439(this.f60580.mo23554());
        c10130.m25434(this.f60575);
        c10130.m25425(this.f60582);
        c10130.m25424(this.f60577);
        c10130.m25439(m44390());
        c10130.m25439(m44382());
        c10130.m25439(C3175.m9731(new C18541(this.f60572, this.f60579, this.f60576, this.f60578)));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m44391() {
        return this.f60580.mo23554();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m44380() {
        return this.f60580;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m44394() {
        return this.f60582;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m44384() {
        return this.f60577;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44385() {
        return this.f60578 != this.f60580.mo23117();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m44392() {
        return this.f60580.mo23120();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44389(String str) {
        C10395.m26217(this.f60580.mo23554(), str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m44390() {
        return C10395.m26212(this.f60580.mo23554());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44387(Charset charset) {
        this.f60573 = charset;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m44382() {
        Charset charset = this.f60573;
        return charset == null ? "" : charset.name();
    }
}
