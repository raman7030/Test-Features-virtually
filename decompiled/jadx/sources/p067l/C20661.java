package p067l;

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
public final class C20661 extends AbstractC15599 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public List f63803;

    /* JADX INFO: renamed from: ۙ */
    public Charset f63804;

    /* JADX INFO: renamed from: ۤ */
    public C24925 f63807;

    /* JADX INFO: renamed from: ۨ */
    public String f63808;

    /* JADX INFO: renamed from: ۫ */
    public long f63809;

    /* JADX INFO: renamed from: ۬ */
    public Map f63810;

    /* JADX INFO: renamed from: ܰ */
    public final AbstractC17043 f63811;

    /* JADX INFO: renamed from: ᩶ */
    public C14281 f63812;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f63813;

    /* JADX INFO: renamed from: ۟ */
    public byte[] f63806 = C7747.f20313;

    /* JADX INFO: renamed from: ۛ */
    public boolean f63805 = true;

    /* JADX INFO: renamed from: ᩺ */
    public final C2582 f63814 = new C2582(1);

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return "zip";
    }

    public C20661(String str) {
        this.f63811 = C18524.m42109(str, new String[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20661 m46672(C14677 c14677) {
        C20661 c20661 = new C20661(c14677.m33593());
        c20661.f63806 = c14677.m33583();
        c20661.f63813 = c14677.m33585();
        c20661.f63808 = c14677.m33590();
        String strM33593 = c14677.m33593();
        if (!strM33593.isEmpty()) {
            c20661.m46683(strM33593);
        }
        String strM33594 = c14677.m33593();
        if (!strM33594.isEmpty()) {
            c20661.f63804 = Charset.forName(strM33594);
        }
        C19990 c19990 = (C19990) C5386.m11777(c14677.m33593());
        if (c19990 != null) {
            c20661.f63803 = c19990.f60677;
            c20661.f63810 = c19990.f60678;
            c20661.f63807 = c19990.f60680;
            c20661.f63809 = c19990.f60679;
        }
        return c20661;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        C19561 c19561 = new C19561(this.f63811, this.f63804);
        try {
            m46673(c19561);
            c19561.close();
        } catch (Throwable th) {
            try {
                c19561.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۗ */
    public final List m46677() {
        C19561 c19561M44425 = C19561.m44425(this.f63811, this.f63804);
        try {
            m46673(c19561M44425);
            List listUnmodifiableList = C21562.unmodifiableList(new ArrayList(c19561M44425.m44464()));
            c19561M44425.close();
            return listUnmodifiableList;
        } catch (Throwable th) {
            try {
                c19561M44425.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46673(C19561 c19561) {
        byte[] bArrM44447 = c19561.m44447();
        if (bArrM44447 == null) {
            bArrM44447 = C7747.f20313;
        }
        this.f63806 = bArrM44447;
        this.f63803 = C21562.unmodifiableList(c19561.m44453());
        this.f63810 = c19561.m44454();
        this.f63807 = new C24925(this.f63803);
        boolean zM44471 = c19561.m44471();
        this.f63813 = zM44471;
        this.f63808 = zM44471 ? C23527.m52307(c19561) : null;
        this.f63809 = this.f63811.mo25091();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m35471()) {
            return;
        }
        C2582 c2582 = this.f63814;
        c2582.close();
        while (true) {
            C19561 c19561 = (C19561) c2582.m3892();
            if (c19561 == null) {
                return;
            } else {
                C2700.m4192(c19561);
            }
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) {
        return m46675(abstractActivityC5549, interfaceC19370, new C13261());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e A[Catch: ۘܰۡ -> 0x013a, TRY_LEAVE, TryCatch #3 {ۘܰۡ -> 0x013a, blocks: (B:63:0x00fc, B:67:0x010d, B:69:0x011a, B:71:0x0120, B:73:0x0128, B:75:0x012e), top: B:89:0x00fc }] */
    /* JADX INFO: renamed from: ֫ */
    public final FilterInputStream m46675(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370, final InterfaceC18588 interfaceC18588) throws C6150 {
        boolean zM31526;
        boolean z;
        BufferedInputStream bufferedInputStream;
        C2582 c2582;
        boolean z2;
        if (!interfaceC18588.mo3924()) {
            C5738 c5738M33002 = ((C14387) interfaceC19370).m33002();
            boolean zM52847 = C23775.m52847(c5738M33002);
            C2582 c2583 = this.f63814;
            AbstractC17043 abstractC17043 = this.f63811;
            if (!zM52847) {
                Iterator itM28245 = null;
                while (!interfaceC18588.mo3924()) {
                    String strM46684 = m46684();
                    try {
                        if (c5738M33002.m12789() && (strM46684 == null || strM46684.isEmpty())) {
                            if (itM28245 == null) {
                                itM28245 = C12248.m28245();
                            }
                            if (itM28245.hasNext()) {
                                m46683((String) itM28245.next());
                                zM31526 = false;
                                z = true;
                            } else {
                                C13848 c13848 = new C13848(abstractActivityC5549, new C9387(1, this));
                                c13848.m31525(new BooleanSupplier() { // from class: l.ۖۙ᩻
                                    @Override // java.util.function.BooleanSupplier
                                    public final boolean getAsBoolean() {
                                        return interfaceC18588.mo3924();
                                    }
                                });
                                zM31526 = c13848.m31526();
                                if (!zM31526) {
                                    break;
                                }
                            }
                            byte[] bArr = this.f63806;
                            String strM46685 = m46684();
                            if (m35471()) {
                                c2582 = c2583;
                            } else {
                                c2582 = null;
                            }
                            bufferedInputStream = new BufferedInputStream(C23775.m52839(c5738M33002, abstractC17043, bArr, strM46685, c2582));
                            if (c5738M33002.m12789() || C23775.m52848(c5738M33002, bufferedInputStream)) {
                                if (z) {
                                    C23775.m52843(m46684(), abstractC17043.mo25505());
                                }
                                return bufferedInputStream;
                            }
                            C2700.m4192(bufferedInputStream);
                            m46683(null);
                            if (zM31526) {
                                C23775.m52842();
                            }
                        } else {
                            zM31526 = false;
                        }
                        byte[] bArr2 = this.f63806;
                        String strM46686 = m46684();
                        if (m35471()) {
                            c2582 = c2583;
                        } else {
                            c2582 = null;
                        }
                        bufferedInputStream = new BufferedInputStream(C23775.m52839(c5738M33002, abstractC17043, bArr2, strM46686, c2582));
                        if (c5738M33002.m12789()) {
                        }
                        if (z) {
                            C23775.m52843(m46684(), abstractC17043.mo25505());
                        }
                        return bufferedInputStream;
                    } catch (C6150 e) {
                        if (c5738M33002.m12789()) {
                            m46683(null);
                            if (zM31526) {
                                C23775.m52842();
                            }
                        } else {
                            throw e;
                        }
                    }
                    z = false;
                }
            } else {
                String strM46687 = m46684();
                List listM52840 = null;
                while (!interfaceC18588.mo3924()) {
                    if (strM46687 == null || strM46687.isEmpty()) {
                        if (listM52840 == null) {
                            C19561 c19561M44427 = C19561.m44427(abstractC17043, this.f63806);
                            try {
                                listM52840 = C23775.m52840(c19561M44427, c5738M33002, interfaceC18588);
                                c19561M44427.close();
                            } catch (Throwable th) {
                                try {
                                    c19561M44427.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        AtomicReference atomicReference = new AtomicReference();
                        C13848 c13849 = new C13848(abstractActivityC5549, new C21736(atomicReference));
                        c13849.m31525(new BooleanSupplier() { // from class: l.ۖۙ᩻
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return interfaceC18588.mo3924();
                            }
                        });
                        if (!c13849.m31527(listM52840)) {
                            return null;
                        }
                        strM46687 = (String) atomicReference.get();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(C23775.m52839(c5738M33002, abstractC17043, this.f63806, strM46687, m35471() ? c2583 : null));
                        if (!C23775.m52848(c5738M33002, bufferedInputStream2)) {
                            C2700.m4192(bufferedInputStream2);
                            throw new C6150(c5738M33002.getName());
                        }
                        return new C5908(this, bufferedInputStream2, strM46687, z2);
                    } catch (C6150 unused) {
                        C12248.m28243(abstractC17043.mo25505(), strM46687);
                        if (z2) {
                            C23775.m52842();
                        }
                        strM46687 = null;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        if (this.f63810 == null) {
            mo9717(false);
        }
        C5738 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C14387(entry);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update("zip".getBytes());
        C16111.m36662(messageDigest, this.f63811.mo25505());
        messageDigest.update(String.valueOf(this.f63809).getBytes());
    }

    /* JADX INFO: renamed from: ۜ */
    public final C14281 m46680() {
        C14281 c14281 = this.f63812;
        if (c14281 != null) {
            return c14281;
        }
        if (!this.f63805) {
            return null;
        }
        this.f63805 = false;
        try {
            if (this.f63803 == null) {
                mo9717(false);
            }
            C5738 c5738 = (C5738) this.f63810.get("resources.arsc");
            if (c5738 != null && c5738.getSize() < 15728640) {
                C19561 c19561M44427 = C19561.m44427(this.f63811, this.f63806);
                try {
                    this.f63812 = new C14281(0, new C24538(c19561M44427.m44448(c5738)));
                    c19561M44427.close();
                } catch (Throwable th) {
                    try {
                        c19561M44427.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return this.f63812;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        if (this.f63803 == null) {
            mo9717(false);
        }
        if (C4809.f10911) {
            str = C17588.m40053(str, "/zip/");
        }
        List listM7180 = this.f63807.m7180(str.substring(1));
        ArrayList arrayList = new ArrayList(listM7180.size() + 1);
        Iterator it = listM7180.iterator();
        while (it.hasNext()) {
            arrayList.add(new C14387((C5738) it.next()));
        }
        return arrayList;
    }

    public final C5738 getEntry(String str) {
        Map map = this.f63810;
        if (map == null) {
            return null;
        }
        C5738 c5738 = (C5738) map.get(str);
        return (c5738 == null && str.endsWith("/")) ? (C5738) this.f63807.m7176(str) : c5738;
    }

    /* JADX INFO: renamed from: ܶ */
    public final byte[] m46682() {
        return this.f63806;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m46689() {
        return this.f63806.length > 0;
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public final List m46687() {
        return this.f63803;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
        c11996.m27459(this.f63811.mo25505());
        c11996.m27454(this.f63806);
        c11996.m27445(this.f63813);
        c11996.m27444(this.f63808);
        c11996.m27459(m46684());
        c11996.m27459(m46676());
        c11996.m27459(C5386.m11775(new C19990(this.f63803, this.f63810, this.f63807, this.f63809)));
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m46685() {
        return this.f63811.mo25505();
    }

    /* JADX INFO: renamed from: ֡ */
    public final AbstractC17043 m46674() {
        return this.f63811;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m46688() {
        return this.f63813;
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m46678() {
        return this.f63808;
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m46679() {
        return this.f63809 != this.f63811.mo25091();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m46686() {
        return this.f63811.mo25094();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46683(String str) {
        C12248.m28246(this.f63811.mo25505(), str);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final String m46684() {
        return C12248.m28241(this.f63811.mo25505());
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46681(Charset charset) {
        this.f63804 = charset;
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m46676() {
        Charset charset = this.f63804;
        return charset == null ? "" : charset.name();
    }
}
