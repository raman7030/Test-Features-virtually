package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ᩳܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19561 implements Closeable {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C14455 f59537 = new C14455();

    /* JADX INFO: renamed from: ֫֫ */
    public String f59538;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f59539;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC9866 f59540;

    /* JADX INFO: renamed from: ۛ */
    public String f59541;

    /* JADX INFO: renamed from: ۟ */
    public boolean f59542;

    /* JADX INFO: renamed from: ۤ */
    public boolean f59543;

    /* JADX INFO: renamed from: ۧ֫ */
    public byte[] f59544;

    /* JADX INFO: renamed from: ۨ */
    public LinkedHashMap f59545;

    /* JADX INFO: renamed from: ۫ */
    public List f59546;

    /* JADX INFO: renamed from: ۬ */
    public Charset f59547;

    /* JADX INFO: renamed from: ܰ */
    public boolean f59548;

    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean f59549;

    /* JADX INFO: renamed from: ܿ֫ */
    public String f59550;

    /* JADX INFO: renamed from: ᩳ֫ */
    public List f59551;

    /* JADX INFO: renamed from: ᩶ */
    public long f59552;

    /* JADX INFO: renamed from: ᩸ */
    public List f59553;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f59554;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f59555;

    /* JADX INFO: renamed from: ܽ */
    public final synchronized C19561 m44462() {
        C19561 c19561;
        if (this.f59543) {
            throw new IOException("Closed");
        }
        c19561 = new C19561(this.f59540.mo23139(), null, false, null, null);
        c19561.f59544 = this.f59544;
        c19561.f59554 = this.f59554;
        c19561.f59538 = this.f59538;
        c19561.f59555 = this.f59555;
        c19561.f59552 = this.f59552;
        this.f59546.add(c19561);
        return c19561;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19561 m44427(AbstractC17043 abstractC17043, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new C19561(abstractC17043.m38671("r"), null, false, null, null);
        }
        AbstractC17043 abstractC17043M38672 = abstractC17043.m38672();
        C14677 c14677 = new C14677(bArr);
        int i = c14677.readInt();
        AbstractC17043[] abstractC17043Arr = new AbstractC17043[i];
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            abstractC17043Arr[i2] = abstractC17043M38672.m38684(c14677.m33593());
            jArr[i2] = c14677.readLong();
        }
        return new C19561(C2489.m3601(C21267.m48028(abstractC17043.getName(), jArr, new C15795(abstractC17043Arr))), null, false, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m44435(AbstractC17043 abstractC17043) {
        AbstractC17043 abstractC17043M38694 = abstractC17043.m38694();
        C18219 c18219M44424 = m44424(abstractC17043M38694, abstractC17043.getName());
        if (c18219M44424 != null) {
            return c18219M44424.f54375;
        }
        C24618 c24618M38671 = abstractC17043.m38671("r");
        try {
            C19561 c19561 = new C19561(c24618M38671, null, false, null, null);
            try {
                c19561.m44431(abstractC17043M38694, (InterfaceC15125) null, true);
                byte[] bArr = c19561.f59544;
                c19561.close();
                return bArr;
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            C2700.m4192(c24618M38671);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19561 m44425(AbstractC17043 abstractC17043, Charset charset) {
        return new C19561(abstractC17043.m38671("r"), abstractC17043.m38694(), true, charset, null, true, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44432(byte[] bArr, int[] iArr) {
        int iM37299 = C16412.m37299(bArr.length, bArr);
        if (iM37299 == C16412.f48248) {
            for (byte b : bArr) {
                if (b <= 0) {
                    iArr[iM37299] = iArr[iM37299] + 1;
                    return;
                }
            }
            int i = C16412.f48248;
            iArr[i] = iArr[i] + 1;
            int i2 = C16412.f48245;
            iArr[i2] = iArr[i2] + 1;
            int i3 = C16412.f48246;
            iArr[i3] = iArr[i3] + 1;
            int i4 = C16412.f48242;
            iArr[i4] = iArr[i4] + 1;
            return;
        }
        iArr[iM37299] = iArr[iM37299] + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19561 m44426(AbstractC17043 abstractC17043, boolean z) {
        C24618 c24618M38671 = abstractC17043.m38671("r");
        try {
            C19561 c19561 = new C19561(c24618M38671, null, false, null, null, z, false);
            C12856 c12856M44442 = c19561.m44442();
            if (c12856M44442 != null && (c12856M44442.f36169 != 0 || c12856M44442.f36168 != 0 || c12856M44442.f36166 != c12856M44442.f36170)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            c19561.m44431((AbstractC17043) null, (InterfaceC15125) null, false);
            return c19561;
        } catch (IOException | RuntimeException e) {
            C2700.m4192(c24618M38671);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19561 m44428(C24618 c24618, C10050 c10050) {
        try {
            return new C19561(c24618, null, true, null, c10050, false, true);
        } catch (IOException | RuntimeException e) {
            C2700.m4192(c24618);
            throw e;
        }
    }

    public C19561(String str) {
        this(str, (C17588) null, 0);
    }

    public C19561(AbstractC17043 abstractC17043) {
        this(abstractC17043, (Charset) null, (InterfaceC15125) null);
    }

    public C19561(AbstractC17043 abstractC17043, Charset charset) {
        this(abstractC17043, charset, (InterfaceC15125) null);
    }

    public C19561(String str, C17588 c17588) {
        this(str, c17588, 0);
    }

    public C19561(String str, C17588 c17588, int i) {
        this(C18524.m42109(str, new String[0]), (Charset) null, c17588);
    }

    public C19561(AbstractC17043 abstractC17043, Charset charset, InterfaceC15125 interfaceC15125) {
        this(abstractC17043.m38671("r"), abstractC17043.m38694(), true, charset, interfaceC15125);
    }

    public C19561(InterfaceC9866 interfaceC9866, AbstractC17043 abstractC17043, boolean z, Charset charset, InterfaceC15125 interfaceC15125) {
        this(interfaceC9866, abstractC17043, z, charset, interfaceC15125, false, false);
    }

    public C19561(InterfaceC9866 interfaceC9866, AbstractC17043 abstractC17043, boolean z, Charset charset, InterfaceC15125 interfaceC15125, boolean z2, boolean z3) throws IOException {
        this.f59545 = new LinkedHashMap();
        List list = Collections.EMPTY_LIST;
        this.f59553 = list;
        this.f59551 = list;
        this.f59538 = "";
        this.f59543 = false;
        this.f59546 = C18426.m41997();
        this.f59549 = z2;
        this.f59539 = z3;
        this.f59540 = interfaceC9866;
        this.f59547 = charset;
        this.f59554 = C17548.m39934(interfaceC9866.getName().toLowerCase());
        if (z) {
            final C18219 c18219M44424 = m44424(abstractC17043, this.f59540.getName());
            if (c18219M44424 != null) {
                InterfaceC4502 interfaceC4502Mo23138 = this.f59540.mo23138();
                C21267 c21267M48028 = C21267.m48028(c18219M44424.f54373, c18219M44424.f54376.m19004(), new InterfaceC23278() { // from class: l.ۤ᩺ۡ
                    @Override // p067l.InterfaceC23278
                    /* JADX INFO: renamed from: ۧ */
                    public final InterfaceC4502 mo19606(int i) {
                        return ((AbstractC17043) c18219M44424.f54377.get(i)).mo25508("r");
                    }
                });
                c21267M48028.m48034(c18219M44424.f54374, interfaceC4502Mo23138);
                this.f59540 = C2489.m3601(c21267M48028);
                this.f59544 = c18219M44424.f54375;
            }
            m44431(abstractC17043, interfaceC15125, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18219 m44424(AbstractC17043 abstractC17043, String str) {
        if (abstractC17043 == null || !str.matches("(?i)(?s).*\\.zip\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C6517 c6517 = new C6517();
        int i = Integer.parseInt(str.substring(str.length() - 3));
        String strM38720 = C17073.m38720(3, 0, str);
        for (int i2 = 1; i2 <= 999; i2++) {
            AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(String.format(Locale.ENGLISH, "%s%03d", strM38720, Integer.valueOf(i2)));
            if (!abstractC17043M38684.mo25093()) {
                if (i2 >= i) {
                    break;
                }
                arrayList.clear();
                c6517.clear();
                break;
            }
            c6517.add(abstractC17043M38684.mo25101());
            arrayList.add(abstractC17043M38684);
        }
        int size = c6517.size();
        if (size <= 1) {
            return null;
        }
        arrayList.trimToSize();
        c6517.m14951();
        C11996 c11996 = new C11996();
        c11996.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            c11996.m27459(((AbstractC17043) arrayList.get(i3)).getName());
            c11996.m27451(c6517.getLong(i3));
        }
        return new C18219(str, i - 1, arrayList, c6517, c11996.m27464());
    }

    public final C5738 getEntry(String str) {
        return (C5738) this.f59545.get(str);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C5738 m44470(String str) throws IOException {
        C5738 c5738 = (C5738) this.f59545.get(str);
        if (c5738 != null) {
            return c5738;
        }
        StringBuilder sbM11879 = C5410.m11879("Entry not found: ", str, "\n(");
        sbM11879.append(this.f59540.getName());
        sbM11879.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IOException(sbM11879.toString());
    }

    /* JADX INFO: renamed from: ۘ */
    public final Map m44454() {
        return C21562.unmodifiableMap(this.f59545);
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public final Collection m44469() {
        return C21562.unmodifiableCollection(this.f59545.values());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final List m44464() throws IOException {
        if (!this.f59549) {
            throw new IllegalStateException("ZIP was not opened for testing");
        }
        if (this.f59550 != null) {
            throw new IOException(this.f59550);
        }
        if (this.f59548) {
            throw new IOException("ZIP central directory contains an unreadable local file header");
        }
        for (C4138 c4138 : this.f59551) {
            boolean z = true;
            boolean z2 = c4138.f9135 >= 0 && (m44433(c4138, true, c4138.f9132) || m44433(c4138, false, c4138.f9132));
            if (!z2 && c4138.f9130) {
                if (!m44433(c4138, true, false) && !m44433(c4138, false, false)) {
                    z = false;
                }
                z2 = z;
            }
            if (!z2) {
                throw new IOException("ZIP data descriptor does not match central directory");
            }
        }
        return this.f59553;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m44440(String str) {
        if (this.f59549 && this.f59550 == null) {
            this.f59550 = str;
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final byte[] m44447() {
        return this.f59544;
    }

    /* JADX INFO: renamed from: ۖ */
    public final ArrayList m44453() {
        ArrayList arrayList = new ArrayList(this.f59545.values());
        Collections.sort(arrayList, f59537);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m44466() {
        return this.f59545.size();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m44467() {
        return this.f59538;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44451(String str) {
        if (str == null) {
            str = "";
        }
        this.f59538 = str;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m44456() {
        return this.f59541;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m44472() {
        return this.f59538.isEmpty();
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m44471() {
        return this.f59554;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m44460() {
        return this.f59555;
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m44458() throws IOException {
        if (!this.f59555) {
            throw new IllegalStateException();
        }
        m44439(this.f59552);
        C11996 c11996 = new C11996();
        long jM44441 = m44441() - 24;
        while (jM44441 > 0) {
            int iM44441 = (int) m44441();
            jM44441 -= (long) (iM44441 + 8);
            if (jM44441 >= 0) {
                int iM44436 = m44436();
                if (iM44436 != 1114793335) {
                    c11996.m27451(iM44441);
                    c11996.writeInt(iM44436);
                    byte[] bArrM44434 = m44434(iM44441 - 4);
                    c11996.write(bArrM44434, 0, bArrM44434.length);
                } else {
                    m44443(iM44441 - 4);
                }
            }
        }
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m44468() {
        return this.f59542;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:321:0x0688  */
    /* JADX WARN: Code duplicated, block: B:330:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:338:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:357:0x0708  */
    /* JADX WARN: Code duplicated, block: B:359:0x0711 A[Catch: EOFException -> 0x071e, TRY_LEAVE, TryCatch #4 {EOFException -> 0x071e, blocks: (B:358:0x070a, B:359:0x0711), top: B:478:0x070a }] */
    /* JADX WARN: Code duplicated, block: B:516:0x0775 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX INFO: renamed from: ֫ */
    private void m44431(AbstractC17043 abstractC17043, InterfaceC15125 interfaceC15125, boolean z) throws IOException {
        long j;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        long j4;
        C21267 c21267;
        long jM48035;
        long j5;
        ArrayList<C5738> arrayList;
        HashSet hashSet;
        Set set;
        ArrayList arrayList2;
        Charset charset;
        C21267 c21268;
        boolean z4;
        IdentityHashMap identityHashMap;
        ArrayList arrayList3;
        long j6;
        long jM44437;
        int i;
        int i2;
        int i3;
        byte[] bArrM44434;
        ArrayList arrayList4;
        HashSet hashSet2;
        Set set2;
        Set set3;
        Charset charset2;
        Charset charset3;
        int i4;
        int i5;
        long j7;
        byte[] bArr;
        boolean z5;
        boolean z6;
        long jM12774;
        long j8;
        C19561 c19561 = this;
        C12856 c12856M44442 = m44442();
        if (c12856M44442 == null && abstractC17043 != null && c19561.f59544 == null && c19561.f59540.getName().matches("(?i)(?s).*\\.z(?:0[1-9]|[1-9][0-9]+)")) {
            String name = c19561.f59540.getName();
            AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(name.substring(0, name.length() - 3) + "zip");
            if (abstractC17043M38684.mo25093()) {
                InterfaceC9866 interfaceC9866 = c19561.f59540;
                try {
                    c19561.f59540 = abstractC17043M38684.m38671("r");
                    c12856M44442 = m44442();
                    if (c12856M44442 == null) {
                        C23461.m52177(c19561.f59540);
                        c19561.f59540 = interfaceC9866;
                    } else if (z) {
                        C23461.m52177(interfaceC9866);
                    }
                } catch (IOException unused) {
                    InterfaceC9866 interfaceC9867 = c19561.f59540;
                    if (interfaceC9867 != interfaceC9866) {
                        C23461.m52177(interfaceC9867);
                        c19561.f59540 = interfaceC9866;
                    }
                }
            }
        }
        boolean z7 = c19561.f59539;
        if (c12856M44442 != null) {
            boolean z8 = c12856M44442.f36164;
            long j9 = c12856M44442.f36167;
            int i6 = c12856M44442.f36168;
            int i7 = c12856M44442.f36169;
            long j10 = c12856M44442.f36165;
            long j11 = c12856M44442.f36163;
            long j12 = j10;
            long j13 = c12856M44442.f36170;
            if (z7 && (i7 != 0 || i6 != 0 || c12856M44442.f36166 != j13)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            boolean z9 = abstractC17043 != null && i7 > 0 && c19561.f59544 == null && c19561.f59540.getName().toLowerCase().endsWith(".zip");
            if (!z || z9) {
                if (z7 || z9 || j11 < 32) {
                    j = j13;
                } else {
                    c19561.m44439(j11 - 16);
                    if (c19561.f59540.available() >= 16 && m44441() == 2334950737559900225L && m44441() == 3617552046287187010L) {
                        c19561.m44439(j11 - 24);
                        long jM44441 = m44441();
                        j = j13;
                        long j14 = (j11 - jM44441) - 8;
                        c19561.m44439(j14);
                        if (m44441() == jM44441) {
                            c19561.f59555 = true;
                            c19561.f59552 = j14;
                        }
                    } else {
                        j = j13;
                    }
                }
                if (z9) {
                    String strM9926 = C4686.m9926(c19561.f59540.getName());
                    int i8 = i7 + 1;
                    AbstractC17043[] abstractC17043Arr = new AbstractC17043[i8];
                    long[] jArr = new long[i8];
                    int i9 = 0;
                    while (i9 < i7) {
                        boolean z10 = z8;
                        Locale locale = Locale.ENGLISH;
                        int i10 = i9 + 1;
                        long j15 = j12;
                        boolean z11 = z7;
                        AbstractC17043 abstractC17043M38685 = abstractC17043.m38684(String.format(locale, "%s.z%02d", strM9926, Integer.valueOf(i10)));
                        if (abstractC17043M38685.mo25093()) {
                            abstractC17043Arr[i9] = abstractC17043M38685;
                            jArr[i9] = abstractC17043M38685.mo25101();
                        } else {
                            AbstractC17043 abstractC17043M38686 = abstractC17043.m38684(String.format(locale, "%s.Z%02d", strM9926, Integer.valueOf(i10)));
                            if (!abstractC17043M38686.mo25093()) {
                                throw new FileNotFoundException(abstractC17043M38685.getName());
                            }
                            abstractC17043Arr[i9] = abstractC17043M38686;
                            jArr[i9] = abstractC17043M38686.mo25101();
                        }
                        z7 = z11;
                        z8 = z10;
                        i9 = i10;
                        j12 = j15;
                        j9 = j9;
                    }
                    z2 = z8;
                    long j16 = j9;
                    j2 = j12;
                    z3 = z7;
                    abstractC17043Arr[i7] = abstractC17043.m38684(c19561.f59540.getName());
                    jArr[i7] = c19561.f59540.length();
                    C11996 c11996M45308 = C19965.m45308(i8);
                    for (int i11 = 0; i11 <= i7; i11++) {
                        c11996M45308.m27459(abstractC17043Arr[i11].getName());
                        c11996M45308.m27451(jArr[i11]);
                    }
                    c19561.f59544 = c11996M45308.m27464();
                    if (!z) {
                        InterfaceC4502 interfaceC4502Mo23138 = c19561.f59540.mo23138();
                        C21267 c21267M48028 = C21267.m48028(interfaceC4502Mo23138.getName(), jArr, new C8420(abstractC17043Arr));
                        c21267M48028.m48034(i7, interfaceC4502Mo23138);
                        c19561.f59540 = C2489.m3601(c21267M48028);
                        long jM48036 = c21267M48028.m48035(i6) + j11;
                        jM48035 = c21267M48028.m48035(i7) + j16;
                        c19561.m44439(jM48036);
                        c21267 = c21267M48028;
                        j11 = jM48036;
                        j4 = 0;
                    }
                } else {
                    z2 = z8;
                    j2 = j12;
                    z3 = z7;
                    if (z3) {
                        j3 = 0;
                    } else {
                        if (j < 0 || j2 < 0 || j9 < j11 || j9 - j11 == j2 || j2 > j9) {
                            j5 = j11;
                        } else {
                            j5 = j9 - j2;
                            if (j5 <= j11) {
                                j5 = j11;
                            } else if (j != 0) {
                                c19561.m44439(j5);
                                if (c19561.f59540.available() < 46 || m44436() != 33639248) {
                                    j5 = j11;
                                } else {
                                    c19561.m44439(42 + j5);
                                    long jM44438 = m44437();
                                    long j17 = j5 - j11;
                                    if (jM44438 == 4294967295L || jM44438 > C14849.FOREVER_NS - j17) {
                                        j5 = j11;
                                    } else {
                                        c19561.m44439(jM44438 + j17);
                                        if (c19561.f59540.available() < 4 || m44436() != 67324752) {
                                            j5 = j11;
                                        }
                                    }
                                }
                            } else if (j2 != 0) {
                                j5 = j11;
                            }
                        }
                        j3 = j5 - j11;
                        j11 = j5;
                    }
                    c19561.m44439(j11);
                    j4 = j3;
                    c21267 = null;
                    jM48035 = j9;
                }
                String str = "ZIP central directory size does not match EOCD";
                boolean z12 = c19561.f59549;
                if ((z12 || z3) && (j < 0 || j2 < 0 || jM48035 < j11 || jM48035 - j11 != j2)) {
                    c19561.m44444("ZIP central directory size does not match EOCD");
                }
                if (z3 && j == 0 && j2 == 0) {
                    c19561.f59542 = z2;
                    return;
                }
                boolean z13 = z2;
                String str2 = "ZIP central directory entry count does not match EOCD";
                if (c19561.f59540.available() <= 50 || m44436() != 33639248) {
                    if (z3) {
                        throw new IOException("ZIP central directory could not be parsed");
                    }
                    if (z12 && (j != 0 || j2 != 0)) {
                        c19561.m44440("ZIP central directory could not be parsed");
                    }
                    c19561.m44430(interfaceC15125, true);
                    if (z12 && interfaceC15125 == null && c19561.f59553.size() != j) {
                        c19561.m44440("ZIP central directory entry count does not match EOCD");
                        return;
                    }
                    return;
                }
                c19561.f59542 = z13;
                ArrayList arrayList5 = new ArrayList();
                IdentityHashMap identityHashMap2 = (z12 || z3) ? new IdentityHashMap() : null;
                Set setNewSetFromMap = z12 ? Collections.newSetFromMap(new IdentityHashMap()) : null;
                ArrayList arrayList6 = z12 ? new ArrayList() : null;
                int i12 = C16412.f48239;
                int[] iArr = new int[i12];
                int i13 = 50000;
                ArrayList arrayList7 = arrayList6;
                long j18 = 0;
                long filePointer = 0;
                while (true) {
                    C5738 c5738 = new C5738();
                    int i14 = i12;
                    c5738.m12793((m44445() >> 8) & 15);
                    m44445();
                    c5738.m12783(m44445());
                    c5738.m12795(m44445());
                    String str3 = str;
                    c5738.setTime(C4809.m10148(m44437()));
                    c5738.m12750(m44436());
                    c5738.m12751(m44437());
                    c5738.m12786(m44437());
                    int iM44445 = m44445();
                    int iM44446 = m44445();
                    long j19 = j11;
                    int iM44447 = m44445();
                    int iM44448 = m44445();
                    String str4 = str2;
                    c5738.m12775(m44445());
                    c5738.m12785(m44436());
                    if (z9) {
                        c5738.m12780(c21267.m48035(iM44448) + m44437());
                    } else {
                        c5738.m12780(m44437());
                    }
                    boolean zM12767 = c5738.m12767();
                    byte[] bArrM44435 = c19561.m44434(iM44445);
                    Charset charsetM37298 = c19561.f59547;
                    if (interfaceC15125 == null || interfaceC15125.mo23420(bArrM44435)) {
                        if (!zM12767 && i13 > 0 && charsetM37298 == null) {
                            m44432(bArrM44435, iArr);
                            i13--;
                        }
                        int i15 = i13;
                        c5738.m12787(bArrM44435);
                        if (z12 || z3) {
                            identityHashMap2.put(c5738, bArrM44435);
                        }
                        if (iM44446 > 0) {
                            byte[] bArrM44436 = c19561.m44434(iM44446);
                            if (c5738.m12784(bArrM44436)) {
                                bArrM44436 = C10432.m24124(1, bArrM44436);
                                if (z12) {
                                    setNewSetFromMap.add(c5738);
                                }
                            }
                            c5738.m12757(bArrM44436);
                        }
                        if (j4 != 0) {
                            long jM12758 = c5738.m12758();
                            if (jM12758 < 0 || jM12758 > C14849.FOREVER_NS - j4) {
                                c19561.m44440("ZIP local file header offset overflows archive bounds");
                                c5738.m12780(c19561.f59540.length());
                            } else {
                                c5738.m12780(jM12758 + j4);
                            }
                        }
                        if (iM44447 > 0) {
                            try {
                                byte[] bArrM44437 = c19561.m44434(iM44447);
                                if (!zM12767 && i15 > 0 && charsetM37298 == null) {
                                    m44432(bArrM44437, iArr);
                                    i15--;
                                }
                                c5738.m12770(bArrM44437);
                            } catch (IOException e) {
                                if (z3) {
                                    throw e;
                                }
                            }
                        }
                        arrayList = arrayList5;
                        arrayList.add(c5738);
                        i13 = i15;
                    } else {
                        c19561.m44443(iM44446 + iM44447);
                        arrayList = arrayList5;
                    }
                    if (z12 || z3) {
                        j18++;
                        filePointer = c19561.f59540.getFilePointer();
                    }
                    long j20 = filePointer;
                    if (m44436() != 33639248) {
                        if (z12 || z3) {
                            if (j18 != j) {
                                c19561.m44444(str4);
                            }
                            if (j20 < j19 || j2 < 0) {
                                c19561.m44444(str3);
                            } else {
                                long j21 = j2 - (j20 - j19);
                                if (j21 != 0) {
                                    if (j21 < 6) {
                                        c19561.m44444("ZIP central directory size does not match parsed records");
                                    } else {
                                        try {
                                            c19561.m44439(j20);
                                            if (m44436() != 84233040) {
                                                c19561.m44444("ZIP central directory size does not match parsed records");
                                            } else {
                                                int iM44449 = m44445();
                                                if (j21 != ((long) iM44449) + 6 || c19561.f59540.available() < iM44449) {
                                                    c19561.m44444("ZIP central directory digital signature is truncated");
                                                }
                                            }
                                        } catch (IOException e2) {
                                            if (z3) {
                                                throw e2;
                                            }
                                            c19561.m44440("ZIP central directory is truncated");
                                        }
                                    }
                                }
                            }
                        }
                        Charset charset4 = StandardCharsets.UTF_8;
                        if (charsetM37298 == null) {
                            int i16 = C16412.f48248;
                            for (int i17 = 0; i17 < i14; i17++) {
                                if (i17 != i16 && iArr[i17] > iArr[i16]) {
                                    i16 = i17;
                                }
                            }
                            charsetM37298 = C16412.m37298(i16);
                        }
                        Collections.sort(arrayList, new C13785());
                        Set setNewSetFromMap2 = z12 ? Collections.newSetFromMap(new IdentityHashMap(arrayList.size())) : null;
                        HashSet hashSet3 = z12 ? null : new HashSet(arrayList.size());
                        for (C5738 c5739 : arrayList) {
                            try {
                                long jM12759 = c5739.m12758();
                                c19561.m44439(jM12759);
                                if (c19561.f59540.available() < 30 || m44436() != 67324752) {
                                    hashSet = hashSet3;
                                    set = setNewSetFromMap2;
                                    arrayList2 = arrayList;
                                    charset = charset4;
                                    this = c19561;
                                    c21268 = c21267;
                                    z4 = z12;
                                    identityHashMap = identityHashMap2;
                                    arrayList3 = arrayList7;
                                    if (z3) {
                                        throw new IOException("ZIP central directory entry has an unreadable local file header");
                                    }
                                } else {
                                    if (z12) {
                                        m44445();
                                        int iM444410 = m44445();
                                        int iM444411 = m44445();
                                        c19561.m44443(4L);
                                        int iM44436 = m44436();
                                        long jM44439 = m44437();
                                        i = iM444410;
                                        i2 = iM444411;
                                        i3 = iM44436;
                                        jM44437 = m44437();
                                        j6 = jM44439;
                                    } else {
                                        c19561.m44439(26 + jM12759);
                                        j6 = 0;
                                        jM44437 = 0;
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                    }
                                    int iM444412 = m44445();
                                    int iM444413 = m44445();
                                    if (z12 || z3) {
                                        bArrM44434 = c19561.m44434(iM444412);
                                    } else {
                                        c19561.m44443(iM444412);
                                        bArrM44434 = null;
                                    }
                                    byte[] bArrM44438 = c19561.m44434(iM444413);
                                    if (z12) {
                                        try {
                                            c21268 = c21267;
                                            i4 = iM444413;
                                            i5 = iM444412;
                                            j7 = jM12759;
                                            bArr = bArrM44438;
                                            byte[] bArr2 = bArrM44434;
                                            int i18 = i2;
                                            hashSet2 = hashSet3;
                                            int i19 = i3;
                                            arrayList4 = arrayList7;
                                            set2 = setNewSetFromMap;
                                            set3 = setNewSetFromMap2;
                                            z4 = z12;
                                            identityHashMap = identityHashMap2;
                                            charset2 = charsetM37298;
                                            charset3 = charset4;
                                            arrayList2 = arrayList;
                                            try {
                                                m44429(c5739, (byte[]) identityHashMap2.get(c5739), i, i18, i19, j6, jM44437, bArr2, bArr);
                                            } catch (EOFException e3) {
                                                e = e3;
                                                hashSet = hashSet2;
                                                arrayList3 = arrayList4;
                                                setNewSetFromMap = set2;
                                                set = set3;
                                                charsetM37298 = charset2;
                                                charset = charset3;
                                                if (!z3) {
                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                }
                                                setNewSetFromMap2 = set;
                                                hashSet3 = hashSet;
                                                charset4 = charset;
                                                arrayList7 = arrayList3;
                                                c19561 = this;
                                                identityHashMap2 = identityHashMap;
                                                z12 = z4;
                                                arrayList = arrayList2;
                                                c21267 = c21268;
                                            }
                                        } catch (EOFException e4) {
                                            e = e4;
                                            arrayList4 = arrayList7;
                                            hashSet2 = hashSet3;
                                            set2 = setNewSetFromMap;
                                            set3 = setNewSetFromMap2;
                                            arrayList2 = arrayList;
                                            charset2 = charsetM37298;
                                            charset3 = charset4;
                                            c21268 = c21267;
                                            z4 = z12;
                                            identityHashMap = identityHashMap2;
                                            hashSet = hashSet2;
                                            arrayList3 = arrayList4;
                                            setNewSetFromMap = set2;
                                            set = set3;
                                            charsetM37298 = charset2;
                                            charset = charset3;
                                            if (!z3) {
                                                throw new IOException("ZIP central directory entry local file header is truncated", e);
                                            }
                                            setNewSetFromMap2 = set;
                                            hashSet3 = hashSet;
                                            charset4 = charset;
                                            arrayList7 = arrayList3;
                                            c19561 = this;
                                            identityHashMap2 = identityHashMap;
                                            z12 = z4;
                                            arrayList = arrayList2;
                                            c21267 = c21268;
                                        }
                                    } else {
                                        arrayList4 = arrayList7;
                                        j7 = jM12759;
                                        i5 = iM444412;
                                        bArr = bArrM44438;
                                        byte[] bArr3 = bArrM44434;
                                        hashSet2 = hashSet3;
                                        set2 = setNewSetFromMap;
                                        set3 = setNewSetFromMap2;
                                        arrayList2 = arrayList;
                                        charset2 = charsetM37298;
                                        charset3 = charset4;
                                        c21268 = c21267;
                                        z4 = z12;
                                        i4 = iM444413;
                                        identityHashMap = identityHashMap2;
                                        if (z3 && !Arrays.equals((byte[]) identityHashMap.get(c5739), bArr3)) {
                                            throw new IOException("ZIP local file header name does not match central directory");
                                        }
                                    }
                                    byte[] bArr4 = bArr;
                                    c5739.m12781(C10432.m24124(1, bArr4));
                                    c5739.m12768(j7 + 30 + ((long) i5) + ((long) i4));
                                    if (z4) {
                                        try {
                                            if ((c5739.m12777() & 8) != 0) {
                                                boolean z14 = j6 == 4294967295L || jM44437 == 4294967295L;
                                                try {
                                                    try {
                                                        if (z14) {
                                                            setNewSetFromMap = set2;
                                                        } else {
                                                            setNewSetFromMap = set2;
                                                            try {
                                                                if (!setNewSetFromMap.contains(c5739)) {
                                                                    z5 = false;
                                                                }
                                                                if (z5 || z14 || C10432.m24121(1, bArr4) != null) {
                                                                    z6 = false;
                                                                } else {
                                                                    z6 = true;
                                                                }
                                                                long jM12792 = c5739.m12792();
                                                                jM12774 = c5739.m12774();
                                                                if (jM12774 >= 0 || jM12792 < 0 || jM12792 > C14849.FOREVER_NS - jM12774) {
                                                                    j8 = -1;
                                                                } else {
                                                                    j8 = jM12792 + jM12774;
                                                                }
                                                                arrayList3 = arrayList4;
                                                                arrayList3.add(new C4138(j8, c5739.m12763(), jM12774, c5739.getSize(), z5, z6));
                                                            } catch (EOFException e5) {
                                                                e = e5;
                                                                hashSet = hashSet2;
                                                                arrayList3 = arrayList4;
                                                                set = set3;
                                                                charsetM37298 = charset2;
                                                                charset = charset3;
                                                                if (!z3) {
                                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                                }
                                                                setNewSetFromMap2 = set;
                                                                hashSet3 = hashSet;
                                                                charset4 = charset;
                                                                arrayList7 = arrayList3;
                                                                c19561 = this;
                                                                identityHashMap2 = identityHashMap;
                                                                z12 = z4;
                                                                arrayList = arrayList2;
                                                                c21267 = c21268;
                                                            }
                                                        }
                                                        arrayList3.add(new C4138(j8, c5739.m12763(), jM12774, c5739.getSize(), z5, z6));
                                                    } catch (EOFException e6) {
                                                        e = e6;
                                                        hashSet = hashSet2;
                                                        set = set3;
                                                        charsetM37298 = charset2;
                                                        charset = charset3;
                                                        if (!z3) {
                                                            throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                        }
                                                        setNewSetFromMap2 = set;
                                                        hashSet3 = hashSet;
                                                        charset4 = charset;
                                                        arrayList7 = arrayList3;
                                                        c19561 = this;
                                                        identityHashMap2 = identityHashMap;
                                                        z12 = z4;
                                                        arrayList = arrayList2;
                                                        c21267 = c21268;
                                                    }
                                                    long jM12793 = c5739.m12792();
                                                    jM12774 = c5739.m12774();
                                                    if (jM12774 >= 0) {
                                                        j8 = -1;
                                                    } else {
                                                        j8 = -1;
                                                    }
                                                    arrayList3 = arrayList4;
                                                } catch (EOFException e7) {
                                                    e = e7;
                                                    arrayList3 = arrayList4;
                                                }
                                                z5 = true;
                                                if (z5) {
                                                    z6 = false;
                                                } else {
                                                    z6 = false;
                                                }
                                            } else {
                                                arrayList3 = arrayList4;
                                                setNewSetFromMap = set2;
                                            }
                                        } catch (EOFException e8) {
                                            e = e8;
                                            arrayList3 = arrayList4;
                                            setNewSetFromMap = set2;
                                        }
                                    } else {
                                        arrayList3 = arrayList4;
                                        setNewSetFromMap = set2;
                                    }
                                    if (c5739.m12767()) {
                                        this = this;
                                        try {
                                            charset = charset3;
                                            try {
                                                c5739.m12753(charset, false, this.f59554);
                                                charsetM37298 = charset2;
                                            } catch (EOFException e9) {
                                                e = e9;
                                                hashSet = hashSet2;
                                                set = set3;
                                                charsetM37298 = charset2;
                                                if (!z3) {
                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                }
                                                setNewSetFromMap2 = set;
                                                hashSet3 = hashSet;
                                                charset4 = charset;
                                                arrayList7 = arrayList3;
                                                c19561 = this;
                                                identityHashMap2 = identityHashMap;
                                                z12 = z4;
                                                arrayList = arrayList2;
                                                c21267 = c21268;
                                            }
                                        } catch (EOFException e10) {
                                            e = e10;
                                            charset = charset3;
                                        }
                                    } else {
                                        this = this;
                                        charset = charset3;
                                        charsetM37298 = charset2;
                                        c5739.m12753(charsetM37298, true, this.f59554);
                                    }
                                    if (!z9) {
                                        try {
                                            if (!this.f59554 && c5739.getName().equals("AndroidManifest.xml")) {
                                                this.f59554 = true;
                                            }
                                            if (z4) {
                                                set = set3;
                                                try {
                                                    set.add(c5739);
                                                    hashSet = hashSet2;
                                                } catch (EOFException e11) {
                                                    e = e11;
                                                    hashSet = hashSet2;
                                                    if (!z3) {
                                                        throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                    }
                                                }
                                            } else {
                                                set = set3;
                                                hashSet = hashSet2;
                                                try {
                                                    hashSet.add(c5739.getName());
                                                } catch (EOFException e12) {
                                                    e = e12;
                                                    if (!z3) {
                                                        throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                    }
                                                }
                                            }
                                        } catch (EOFException e13) {
                                            e = e13;
                                            hashSet = hashSet2;
                                            set = set3;
                                            if (!z3) {
                                                throw new IOException("ZIP central directory entry local file header is truncated", e);
                                            }
                                            setNewSetFromMap2 = set;
                                            hashSet3 = hashSet;
                                            charset4 = charset;
                                            arrayList7 = arrayList3;
                                            c19561 = this;
                                            identityHashMap2 = identityHashMap;
                                            z12 = z4;
                                            arrayList = arrayList2;
                                            c21267 = c21268;
                                        }
                                    } else if (z4) {
                                        set = set3;
                                        set.add(c5739);
                                        hashSet = hashSet2;
                                    } else {
                                        set = set3;
                                        hashSet = hashSet2;
                                        hashSet.add(c5739.getName());
                                    }
                                }
                            } catch (EOFException e14) {
                                e = e14;
                                hashSet = hashSet3;
                                set = setNewSetFromMap2;
                                arrayList2 = arrayList;
                                charset = charset4;
                                this = c19561;
                                c21268 = c21267;
                                z4 = z12;
                                identityHashMap = identityHashMap2;
                                arrayList3 = arrayList7;
                            }
                            setNewSetFromMap2 = set;
                            hashSet3 = hashSet;
                            charset4 = charset;
                            arrayList7 = arrayList3;
                            c19561 = this;
                            identityHashMap2 = identityHashMap;
                            z12 = z4;
                            arrayList = arrayList2;
                            c21267 = c21268;
                        }
                        ArrayList arrayList8 = arrayList7;
                        HashSet hashSet4 = hashSet3;
                        Set set4 = setNewSetFromMap2;
                        ArrayList<C5738> arrayList9 = arrayList;
                        C19561 c19562 = c19561;
                        C21267 c21269 = c21267;
                        boolean z15 = z12;
                        LinkedList<C5738> linkedList = new LinkedList();
                        for (C5738 c57310 : arrayList9) {
                            if (z15) {
                                if (set4.contains(c57310)) {
                                    c19562.m44446(c57310);
                                    linkedList.add(c57310);
                                }
                            } else if (hashSet4.contains(c57310.getName())) {
                                c19562.m44446(c57310);
                                linkedList.add(c57310);
                            }
                        }
                        if (z15) {
                            c19562.f59548 = linkedList.size() != arrayList9.size();
                            c19562.f59553 = C21562.unmodifiableList(new ArrayList(linkedList));
                            c19562.f59551 = C21562.unmodifiableList(arrayList8);
                        }
                        ArrayList arrayList10 = new ArrayList();
                        if (c21269 == null) {
                            long length = c19562.f59540.length() / 200;
                            for (C5738 c57311 : linkedList) {
                                if (c57311.m12748() == 0 && !c57311.m12789() && !c57311.isDirectory() && c57311.getSize() > length) {
                                    arrayList10.add(c57311);
                                }
                            }
                        }
                        boolean zIsEmpty = arrayList10.isEmpty();
                        LinkedHashMap linkedHashMap = c19562.f59545;
                        if (zIsEmpty) {
                            for (C5738 c57312 : linkedList) {
                                linkedHashMap.put(c57312.getName(), c57312);
                            }
                            return;
                        }
                        Collections.sort(arrayList10, new C24513(0));
                        int iMin = Math.min(arrayList10.size(), 10);
                        for (int i20 = 0; i20 < iMin; i20++) {
                            C5738 c57313 = (C5738) arrayList10.get(i20);
                            if (!c57313.m12771()) {
                                long jM12794 = c57313.m12792();
                                long jM12775 = c57313.m12774() + jM12794;
                                for (C5738 c57314 : linkedList) {
                                    if (c57314 != c57313 && !c57314.isDirectory() && !c57314.m12771()) {
                                        long jM12795 = c57314.m12792();
                                        long jM12776 = c57314.m12774() + jM12795;
                                        if (jM12794 <= jM12795 && jM12776 <= jM12775) {
                                            c57314.m12754(c57313);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList<C5738> arrayList11 = new ArrayList();
                        for (C5738 c57315 : linkedList) {
                            if (c57315.m12771()) {
                                arrayList11.add(c57315);
                            } else {
                                linkedHashMap.put(c57315.getName(), c57315);
                            }
                        }
                        for (C5738 c57316 : arrayList11) {
                            linkedHashMap.put(c57316.getName(), c57316);
                        }
                        return;
                    }
                    arrayList5 = arrayList;
                    j11 = j19;
                    str2 = str4;
                    filePointer = j20;
                    str = str3;
                    i12 = i14;
                }
            }
        } else if (!z) {
            if (z7) {
                throw new IOException("ZIP end of central directory is missing or unreadable");
            }
            c19561.m44440("ZIP end of central directory is missing or unreadable");
            c19561.m44430(interfaceC15125, false);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m44444(String str) throws IOException {
        if (this.f59539) {
            throw new IOException(str);
        }
        m44440(str);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00da A[Catch: IOException -> 0x00ee, TryCatch #0 {IOException -> 0x00ee, blocks: (B:22:0x0052, B:42:0x008e, B:44:0x0098, B:46:0x009d, B:48:0x00a3, B:50:0x00ad, B:51:0x00b1, B:53:0x00b7, B:55:0x00bf, B:58:0x00c6, B:64:0x00da, B:60:0x00cc, B:62:0x00d2, B:24:0x005a, B:28:0x0064, B:32:0x0070, B:38:0x007f, B:65:0x00de, B:66:0x00e5, B:67:0x00e6, B:68:0x00ed), top: B:89:0x004c }] */
    /* JADX INFO: renamed from: ֫ */
    private void m44429(C5738 c5738, byte[] bArr, int i, int i2, int i3, long j, long j2, byte[] bArr2, byte[] bArr3) {
        long jM24125;
        long[] jArr;
        int iM12777 = c5738.m12777();
        if (((iM12777 ^ i) & 10367) != 0) {
            m44440("ZIP local file header flags do not match central directory");
        }
        if (c5738.m12748() != i2) {
            m44440("ZIP local file header method does not match central directory");
        }
        int i4 = 0;
        boolean z = ((iM12777 & 8192) == 0 || (i & 8192) == 0) ? false : true;
        if (!z && !Arrays.equals(bArr, bArr2)) {
            m44440("ZIP local file header name does not match central directory");
        }
        try {
            if (j == 4294967295L || j2 == 4294967295L) {
                C10432 c10432M24121 = C10432.m24121(1, bArr3);
                if (c10432M24121 == null) {
                    throw new IOException("Missing ZIP64 local extra data");
                }
                if (j2 == 4294967295L) {
                    jM24125 = c10432M24121.m24125(0);
                    i4 = 8;
                } else {
                    jM24125 = j2;
                }
                long jM24126 = j == 4294967295L ? c10432M24121.m24125(i4) : j;
                if (jM24126 < 0 || jM24125 < 0) {
                    throw new IOException("Unsupported unsigned ZIP64 size");
                }
                jArr = new long[]{jM24126, jM24125};
            } else {
                jArr = new long[]{j, j2};
            }
            if ((iM12777 & 8) == 0) {
                if (jArr[0] != c5738.m12774()) {
                    m44440("ZIP local file header compressed size does not match central directory");
                }
                if (!z && (i3 != c5738.m12763() || jArr[1] != c5738.getSize())) {
                    m44440("ZIP local file header CRC or size does not match central directory");
                }
            } else {
                long j3 = jArr[0];
                if (j3 != 0 && j3 != c5738.m12774()) {
                    m44440("ZIP local file header compressed size does not match central directory");
                }
                if (!z) {
                    if (i3 == 0 || i3 == c5738.m12763()) {
                        long j4 = jArr[1];
                        if (j4 != 0 && j4 != c5738.getSize()) {
                            m44440("ZIP local file header CRC or size does not match central directory");
                        }
                    } else {
                        m44440("ZIP local file header CRC or size does not match central directory");
                    }
                }
            }
        } catch (IOException unused) {
            m44440("ZIP local file header contains invalid ZIP64 sizes");
        }
        if (c5738.m12748() == 99 || i2 == 99) {
            C10432 c10432M24122 = C10432.m24121(39169, c5738.m12788());
            C10432 c10432M24123 = C10432.m24121(39169, bArr3);
            if (c10432M24122 == null || c10432M24123 == null || c10432M24122.m24126().length < 7 || c10432M24123.m24126().length < 7) {
                m44440("ZIP AES extra data is missing from a file header");
                return;
            }
            for (int i5 = 0; i5 < 7; i5++) {
                if (c10432M24122.m24126()[i5] != c10432M24123.m24126()[i5]) {
                    m44440("ZIP AES extra data does not match between file headers");
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44433(C4138 c4138, boolean z, boolean z2) throws InterruptedIOException, C15536 {
        try {
            m44439(c4138.f9135);
            if (!z || m44436() == 134695760) {
                return m44436() == c4138.f9133 && (z2 ? m44441() : m44437()) == c4138.f9131 && (z2 ? m44441() : m44437()) == c4138.f9134;
            }
            return false;
        } catch (EOFException unused) {
            return false;
        } catch (InterruptedIOException e) {
            throw e;
        } catch (IOException e2) {
            throw new C15536(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX INFO: renamed from: ֫ */
    private void m44430(InterfaceC15125 interfaceC15125, boolean z) throws IOException {
        int i;
        long j;
        Charset charsetM37298;
        boolean zM12784;
        boolean z2;
        long jM44437;
        long jM44438;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        long j2;
        int i3;
        ArrayList<C5738> arrayList = new ArrayList();
        int i4 = C16412.f48239;
        int[] iArr = new int[i4];
        long length = this.f59540.length();
        m44439(0L);
        if (m44436() != 67324752) {
            InterfaceC9866 interfaceC9866 = this.f59540;
            int i5 = 4;
            byte[] bArr3 = {UTF8.S_P4A, 75, 3, 4};
            long jMin = Math.min(interfaceC9866.length(), 52428800L);
            long j3 = 4;
            if (jMin < j3) {
                i = i4;
                j = length;
            } else {
                int[] iArr2 = new int[4];
                int i6 = 1;
                int i7 = 0;
                while (i6 < i5) {
                    while (true) {
                        if (i7 <= 0) {
                            i3 = i4;
                            break;
                        }
                        i3 = i4;
                        if (bArr3[i7] == bArr3[i6]) {
                            break;
                        }
                        i7 = iArr2[i7 - 1];
                        i4 = i3;
                    }
                    if (bArr3[i7] == bArr3[i6]) {
                        i7++;
                    }
                    iArr2[i6] = i7;
                    i6++;
                    i5 = 4;
                    i4 = i3;
                }
                i = i4;
                byte[] bArr4 = new byte[65536];
                j = length;
                interfaceC9866.seek(0L);
                int i8 = 0;
                int i9 = 0;
                long j4 = 0;
                int i10 = 0;
                while (true) {
                    if (j4 < jMin) {
                        if (i8 >= i9) {
                            int iMo23140 = interfaceC9866.mo23140(0, (int) Math.min(65536, jMin - j4), bArr4);
                            if (iMo23140 != 0) {
                                i9 = iMo23140;
                                i8 = 0;
                            }
                        }
                        int i11 = i8 + 1;
                        if (bArr4[i8] == bArr3[i10]) {
                            i10++;
                            if (i10 == 4) {
                                long j5 = j4 - j3;
                                long j6 = j5 + 1;
                                i2 = i9;
                                long filePointer = interfaceC9866.getFilePointer();
                                bArr2 = bArr3;
                                try {
                                    interfaceC9866.seek(j5 + 5);
                                    int iMo23137 = interfaceC9866.mo23137();
                                    if (iMo23137 == 45 || iMo23137 == 20 || iMo23137 == 10) {
                                        interfaceC9866.mo23137();
                                        int iMo23138 = interfaceC9866.mo23137();
                                        if (iMo23138 == 0 || iMo23138 == 8 || iMo23138 == 9 || iMo23138 == 12 || iMo23138 == 14 || iMo23138 == 95) {
                                            interfaceC9866.readInt();
                                            interfaceC9866.readInt();
                                            long j7 = ((long) interfaceC9866.readInt()) & 4294967295L;
                                            interfaceC9866.readInt();
                                            bArr = bArr4;
                                            int iMo23139 = interfaceC9866.mo23137();
                                            if (iMo23139 != 0) {
                                                if (interfaceC9866.getFilePointer() + ((long) iMo23139) + ((long) interfaceC9866.mo23137()) + j7 <= interfaceC9866.length()) {
                                                    interfaceC9866.seek(filePointer);
                                                    j2 = j6;
                                                    break;
                                                }
                                                interfaceC9866.seek(filePointer);
                                            } else {
                                                interfaceC9866.seek(filePointer);
                                            }
                                        } else {
                                            bArr = bArr4;
                                            interfaceC9866.seek(filePointer);
                                        }
                                    } else {
                                        bArr = bArr4;
                                        interfaceC9866.seek(filePointer);
                                    }
                                    i10 = 0;
                                } catch (Throwable th) {
                                    interfaceC9866.seek(filePointer);
                                    throw th;
                                }
                            } else {
                                bArr = bArr4;
                                i2 = i9;
                                bArr2 = bArr3;
                                j3 = j3;
                                i11 = i11;
                            }
                        } else {
                            bArr = bArr4;
                            i2 = i9;
                            bArr2 = bArr3;
                            j3 = j3;
                            i11 = i11;
                            if (i10 > 0) {
                                i10 = iArr2[i10 - 1];
                            }
                            bArr3 = bArr2;
                            bArr4 = bArr;
                            jMin = jMin;
                            i9 = i2;
                            j3 = j3;
                        }
                        j4++;
                        i8 = i11;
                        bArr3 = bArr2;
                        bArr4 = bArr;
                        jMin = jMin;
                        i9 = i2;
                        j3 = j3;
                    }
                }
                if (j2 != -1) {
                    m44439(j2);
                }
            }
            j2 = -1;
            if (j2 != -1) {
                m44439(j2);
            }
        } else {
            i = i4;
            j = length;
            m44439(0L);
        }
        int i12 = 50000;
        loop0: while (true) {
            int iAvailable = this.f59540.available();
            charsetM37298 = this.f59547;
            if (iAvailable <= 30 || m44436() != 67324752) {
                break;
            }
            C5738 c5738 = new C5738();
            long j8 = 4;
            c5738.m12780(this.f59540.getFilePointer() - 4);
            m44445();
            c5738.m12783(m44445());
            c5738.m12795(m44445());
            c5738.setTime(C4809.m10148(m44437()));
            c5738.m12750(m44436());
            c5738.m12751(m44437());
            c5738.m12786(m44437());
            int iM44445 = m44445();
            int iM44446 = m44445();
            boolean zM12767 = c5738.m12767();
            byte[] bArrM44434 = m44434(iM44445);
            boolean z3 = (interfaceC15125 == null || interfaceC15125.mo23420(bArrM44434)) ? false : true;
            if (!z3 && !zM12767 && i12 > 0 && charsetM37298 == null) {
                m44432(bArrM44434, iArr);
                i12--;
            }
            c5738.m12787(bArrM44434);
            if (iM44446 > 0) {
                byte[] bArrM44435 = m44434(iM44446);
                zM12784 = c5738.m12784(bArrM44435);
                if (zM12784) {
                    bArrM44435 = C10432.m24124(1, bArrM44435);
                }
                c5738.m12781(bArrM44435);
            } else {
                zM12784 = false;
            }
            c5738.m12768(this.f59540.getFilePointer());
            int i13 = 8;
            if ((c5738.m12777() & 8) == 8) {
                int i14 = 0;
                while (true) {
                    int i15 = this.f59540.read();
                    if (i15 == -1) {
                        break loop0;
                    }
                    i14 = (i14 >>> i13) | (i15 << 24);
                    if (i14 == 134695760) {
                        long filePointer2 = (this.f59540.getFilePointer() - c5738.m12792()) - j8;
                        int iM44436 = m44436();
                        if (zM12784) {
                            jM44437 = m44441();
                            jM44438 = m44441();
                        } else {
                            jM44437 = m44437();
                            jM44438 = m44437();
                        }
                        long j9 = jM44437;
                        z2 = z3;
                        long j10 = jM44438;
                        if (j9 == filePointer2) {
                            c5738.m12750(iM44436);
                            c5738.m12751(j9);
                            c5738.m12786(j10);
                            break;
                        }
                    } else {
                        z2 = z3;
                    }
                    j8 = 4;
                    z3 = z2;
                    i13 = 8;
                }
                if (!z2) {
                    arrayList.add(c5738);
                }
            } else {
                z2 = z3;
                if (j - c5738.m12792() < c5738.m12774()) {
                    break;
                }
                m44443(c5738.m12774());
                if (!z2) {
                    arrayList.add(c5738);
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                throw new ZipException("Archive is not a ZIP archive");
            }
            return;
        }
        Charset charset = StandardCharsets.UTF_8;
        if (charsetM37298 == null) {
            int i16 = C16412.f48248;
            int i17 = i;
            for (int i18 = 0; i18 < i17; i18++) {
                if (i18 != i16 && iArr[i18] > iArr[i16]) {
                    i16 = i18;
                }
            }
            charsetM37298 = C16412.m37298(i16);
        }
        for (C5738 c5739 : arrayList) {
            if (c5739.m12767()) {
                c5739.m12753(charset, false, this.f59554);
            } else {
                c5739.m12753(charsetM37298, true, this.f59554);
            }
            if (!this.f59554 && c5739.getName().equals("AndroidManifest.xml") && this.f59544 == null) {
                this.f59554 = true;
            }
        }
        LinkedHashMap linkedHashMap = this.f59545;
        linkedHashMap.clear();
        for (C5738 c57310 : arrayList) {
            m44446(c57310);
            linkedHashMap.put(c57310.getName(), c57310);
        }
        if (this.f59549) {
            this.f59553 = C21562.unmodifiableList(new ArrayList(arrayList));
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m44446(C5738 c5738) throws ZipException, EOFException {
        int iM12748;
        if (c5738.m12789()) {
            if (this.f59554) {
                c5738.m12783(c5738.m12777() & (-2));
            } else {
                C10432 c10432M24121 = C10432.m24121(39169, c5738.m12747());
                if (c10432M24121 != null) {
                    c5738.m12779(99);
                    c5738.m12755(c10432M24121);
                    byte[] bArrM24126 = c10432M24121.m24126();
                    if (bArrM24126.length < 7) {
                        throw new ZipException("Invalid aes extra data record. (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    boolean z = C4809.f10911;
                    if (7 > bArrM24126.length) {
                        throw new EOFException();
                    }
                    c5738.m12795(C17548.m39944(5, bArrM24126));
                } else if ((c5738.m12777() & 64) != 0) {
                    c5738.m12779(1);
                } else {
                    c5738.m12779(0);
                }
            }
        }
        if (this.f59554 && (iM12748 = c5738.m12748()) != 8 && iM12748 != 0) {
            c5738.m12795(0);
        }
        if (this.f59554 && c5738.m12748() == 0 && c5738.getSize() != c5738.m12774()) {
            c5738.m12751(c5738.getSize());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C12856 m44423(long j, int i, long j2) throws IOException {
        m44439(j);
        int iM44436 = m44436();
        if (iM44436 != 101075792) {
            throw new IOException("Invalid zip64 eocd record offset, sig=" + Integer.toHexString(iM44436) + " offset=" + j);
        }
        if (this.f59539) {
            long jM44441 = m44441();
            long j3 = j2 - 20;
            if (jM44441 < 44 || j > 9223372036854775795L || jM44441 > 9223372036854775795L - j || j + 12 + jM44441 != j3) {
                throw new IOException(C17588.m40051(jM44441, "Invalid zip64 eocd record size: "));
            }
            m44443(4L);
        } else {
            m44443(12L);
        }
        return new C12856(m44436(), m44436(), m44441(), m44441(), m44441(), m44441(), j, i, true);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C14196 m44465(C5738 c5738) {
        return new C14196(this.f59540, c5738.m12792(), c5738.m12774(), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m44448(C5738 c5738) {
        return m44422(c5738, true, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final InputStream m44457(C5738 c5738) {
        return m44422(c5738, false, false);
    }

    /* JADX INFO: renamed from: ܽ */
    public final InputStream m44461(C5738 c5738) throws IOException {
        if (c5738.getSize() < 0) {
            throw new IOException("Unknown uncompressed size (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (c5738.m12774() < 0) {
            throw new IOException("Unknown compressed size (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return m44422(c5738, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b3  */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0100, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0181, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    private InputStream m44422(C5738 c5738, boolean z, boolean z2) throws IOException {
        boolean z3;
        InputStream c14196;
        InputStream bufferedInputStream;
        C20903 c20903;
        InputStream c9502;
        ByteBuffer byteBufferOrder;
        long size;
        if (!z2 && c5738.getSize() == 0 && (!c5738.m12789() || !c5738.m12773() || c5738.m12748() != 0)) {
            return new C9761();
        }
        long jM12792 = c5738.m12792();
        int iM12748 = c5738.m12748();
        boolean zM12789 = c5738.m12789();
        if (zM12789 && c5738.m12766() == 99) {
            int iM12778 = c5738.m12778();
            if (iM12778 == 2) {
                z3 = false;
            } else {
                if (iM12778 != 1) {
                    StringBuilder sbM34408 = C15033.m34408(iM12778, "Unsupported AES version ", " (");
                    sbM34408.append(c5738.getName());
                    sbM34408.append(MotionUtils.EASING_TYPE_FORMAT_END);
                    throw new IOException(sbM34408.toString());
                }
                z3 = true;
            }
        } else {
            z3 = true;
        }
        if (zM12789) {
            C14196 c14197 = new C14196(this.f59540, jM12792, c5738.m12774(), z2);
            int iM12766 = c5738.m12766();
            if (iM12766 == 0) {
                c14196 = new C21573(this, c5738, c14197, this.f59538);
            } else {
                if (iM12766 != 99) {
                    throw new IOException("Unsupported encryption method " + c5738.m12766() + " (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                bufferedInputStream = new C20903(this, c5738, c14197, this.f59538);
                c20903 = bufferedInputStream;
            }
            if (iM12748 != 0) {
                if (iM12748 != 12) {
                    c9502 = new C9502(c5738, bufferedInputStream);
                } else if (iM12748 != 14) {
                    int i = C20057.f60941;
                    byte[] bArr = new byte[9];
                    C23461.m52184(bufferedInputStream, bArr, 9);
                    byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder.get();
                    byteBufferOrder.get();
                    if ((byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) == 5) {
                        throw new UnsupportedOperationException("ZipEntry LZMA should have size 5 in header: " + c5738.getName());
                    }
                    if ((c5738.m12777() & 2) != 0) {
                        size = -1;
                    } else {
                        size = c5738.getSize();
                    }
                    bufferedInputStream = new C20057(c5738, bufferedInputStream, size, byteBufferOrder.get(), byteBufferOrder.getInt());
                } else if (iM12748 != 36) {
                    c9502 = new C4634(c5738, bufferedInputStream);
                } else if (iM12748 != 93) {
                    c9502 = new C2621(c5738, bufferedInputStream);
                } else if (iM12748 != 95) {
                    c9502 = new C20728(c5738, bufferedInputStream);
                } else if (iM12748 != 8) {
                    c9502 = new C12681(c5738, bufferedInputStream, z2);
                } else {
                    if (iM12748 == 9) {
                        throw new IOException("Unsupported compression method " + c5738.m12748() + " (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    c9502 = new C18044(c5738, bufferedInputStream);
                }
                bufferedInputStream = c9502;
            }
            if (z && iM12748 != 0) {
                bufferedInputStream = new BufferedInputStream(bufferedInputStream, 65536);
            }
            if (z2) {
                return new C24254(c5738, bufferedInputStream, c20903, z3);
            }
            return (this.f59554 && z3) ? new C8161(c5738, bufferedInputStream) : bufferedInputStream;
        }
        c14196 = new C14196(this.f59540, jM12792, (iM12748 != 0 || z2) ? c5738.m12774() : c5738.getSize(), z2);
        bufferedInputStream = c14196;
        c20903 = 0;
        if (iM12748 != 0) {
            if (iM12748 != 12) {
                c9502 = new C9502(c5738, bufferedInputStream);
            } else if (iM12748 != 14) {
                int i2 = C20057.f60941;
                byte[] bArr2 = new byte[9];
                C23461.m52184(bufferedInputStream, bArr2, 9);
                byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.get();
                byteBufferOrder.get();
                if ((byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) == 5) {
                    throw new UnsupportedOperationException("ZipEntry LZMA should have size 5 in header: " + c5738.getName());
                }
                if ((c5738.m12777() & 2) != 0) {
                    size = -1;
                } else {
                    size = c5738.getSize();
                }
                bufferedInputStream = new C20057(c5738, bufferedInputStream, size, byteBufferOrder.get(), byteBufferOrder.getInt());
            } else if (iM12748 != 36) {
                c9502 = new C4634(c5738, bufferedInputStream);
            } else if (iM12748 != 93) {
                c9502 = new C2621(c5738, bufferedInputStream);
            } else if (iM12748 != 95) {
                c9502 = new C20728(c5738, bufferedInputStream);
            } else if (iM12748 != 8) {
                c9502 = new C12681(c5738, bufferedInputStream, z2);
            } else {
                if (iM12748 == 9) {
                    throw new IOException("Unsupported compression method " + c5738.m12748() + " (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c9502 = new C18044(c5738, bufferedInputStream);
            }
            bufferedInputStream = c9502;
        }
        if (z) {
            bufferedInputStream = new BufferedInputStream(bufferedInputStream, 65536);
        }
        if (z2) {
            return new C24254(c5738, bufferedInputStream, c20903, z3);
        }
        if (this.f59554) {
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m44459(C5738 c5738) {
        if (c5738.getSize() > 20971520) {
            try {
                InputStream inputStreamM44422 = m44422(c5738, true, false);
                try {
                    byte[] bArrM4193 = C2700.m4193(c5738.getSize(), inputStreamM44422);
                    inputStreamM44422.close();
                    return bArrM4193;
                } catch (Throwable th) {
                    try {
                        inputStreamM44422.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception unused) {
                return m44452(c5738, (C20689) null);
            }
        }
        return m44452(c5738, (C20689) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m44452(C5738 c5738, C20689 c20689) throws IOException {
        int size = (int) c5738.getSize();
        byte[] bArr = new byte[size];
        int i = 0;
        InputStream inputStreamM44422 = m44422(c5738, true, false);
        while (i < size) {
            try {
                int i2 = inputStreamM44422.read(bArr, i, size - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
                if (c20689 != null) {
                    c20689.m46754(i2);
                }
            } catch (Throwable th) {
                try {
                    inputStreamM44422.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i != size || inputStreamM44422.read() != -1) {
            throw new IOException("The length of data has been read is incorrect. (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        inputStreamM44422.close();
        return bArr;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C19561 m44463(C5738 c5738) throws IOException {
        if (c5738.m12748() != 0) {
            throw new IOException("Entry is not stored: " + c5738.getName());
        }
        return new C19561(this.f59540.mo23141(c5738.m12792(), c5738.m12774()), null, true, null, null);
    }

    public final String getName() {
        InterfaceC9866 interfaceC9866 = this.f59540;
        if (interfaceC9866 == null) {
            return null;
        }
        return interfaceC9866.getName();
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m44449(boolean z) throws IOException {
        String strM44438 = m44438(1);
        C5738 entry = getEntry(strM44438);
        if (entry == null) {
            if (z) {
                return Collections.EMPTY_LIST;
            }
            StringBuilder sbM11879 = C5410.m11879("Entry not found: ", strM44438, "\n(");
            sbM11879.append(this.f59540.getName());
            sbM11879.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IOException(sbM11879.toString());
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (entry != null) {
            arrayList.add(entry);
            i++;
            entry = getEntry(m44438(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m44438(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C19768.m44906(i, "classes", ".dex");
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: IOException -> 0x0123, TryCatch #2 {IOException -> 0x0123, blocks: (B:28:0x007d, B:30:0x0082, B:32:0x00c0, B:36:0x00dc, B:31:0x0094), top: B:72:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[Catch: IOException -> 0x0123, TryCatch #2 {IOException -> 0x0123, blocks: (B:28:0x007d, B:30:0x0082, B:32:0x00c0, B:36:0x00dc, B:31:0x0094), top: B:72:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:45:0x0109 A[Catch: IOException -> 0x0126, TRY_LEAVE, TryCatch #1 {IOException -> 0x0126, blocks: (B:41:0x00fa, B:45:0x0109), top: B:70:0x00fa }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: ܰ */
    private C12856 m44442() throws IOException {
        long j;
        String str;
        String str2;
        long j2;
        String str3;
        boolean z;
        int i;
        long jM44437;
        long jM44438;
        long j3;
        int i2;
        long j4;
        int iM44445;
        C12856 c12856;
        long j5;
        String str4;
        C12856 c12856M44423;
        String str5;
        long length = this.f59540.length();
        long jMax = Math.max(0L, length - 65557);
        C12856 c12857 = null;
        long j6 = length - 22;
        String str6 = null;
        String str7 = null;
        while (true) {
            boolean z2 = this.f59539;
            if (j6 < jMax) {
                String str8 = str6;
                String str9 = str7;
                if (c12857 == null) {
                    return null;
                }
                if (z2) {
                    throw new IOException(str9);
                }
                m44440(str9);
                this.f59541 = str8;
                return c12857;
            }
            m44439(j6);
            if (m44436() != 101010256) {
                j6--;
            } else if (j6 > 20) {
                try {
                    m44439(j6 - 20);
                    if (m44436() == 117853008) {
                        int iM44436 = m44436();
                        long jM44441 = m44441();
                        int iM44437 = m44436();
                        if (z2 && (iM44436 != 0 || iM44437 != 1)) {
                            throw new IOException("Split ZIP archives are not supported");
                        }
                        j = jM44441;
                    } else {
                        j = -1;
                    }
                    str3 = str6;
                    long j7 = j6 + 4;
                    if (j != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    try {
                        m44439(j7);
                        if (z) {
                            m44443(16L);
                            j4 = -1;
                            jM44438 = -1;
                            j3 = -1;
                            jM44437 = -1;
                            i2 = -1;
                            i = -1;
                        } else {
                            int iM44446 = m44445();
                            int iM44447 = m44445();
                            long jM44445 = m44445();
                            long jM44446 = m44445();
                            i = iM44447;
                            jM44437 = m44437();
                            jM44438 = m44437();
                            j3 = jM44446;
                            i2 = iM44446;
                            j4 = jM44445;
                        }
                        iM44445 = m44445();
                        c12856 = new C12856(i2, i, j4, jM44438, j3, jM44437, j6, iM44445, false);
                        j5 = j6 + 22 + ((long) iM44445);
                        if (iM44445 > 0 || j5 > length) {
                            str4 = null;
                        } else {
                            str4 = new String(m44434(iM44445), StandardCharsets.UTF_8);
                        }
                        if (j != -1) {
                            str = str3;
                            long j8 = j;
                            str2 = str7;
                            j2 = j6;
                            try {
                                c12856M44423 = m44423(j8, iM44445, j6);
                            } catch (IOException unused) {
                                str6 = str;
                                j6 = j2 - 1;
                                str7 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str7;
                            j2 = j6;
                            c12856M44423 = c12856;
                        }
                        if (j5 == length) {
                            this.f59541 = str4;
                            return c12856M44423;
                        }
                        if (c12857 == null) {
                            if (j5 > length) {
                                str5 = "ZIP end of central directory comment is truncated";
                            } else {
                                str5 = "ZIP end of central directory does not terminate the archive";
                            }
                            str7 = str5;
                            c12857 = c12856M44423;
                            str6 = str4;
                        } else {
                            str7 = str2;
                            str6 = str;
                        }
                        j6 = j2 - 1;
                    } catch (IOException unused2) {
                        str = str3;
                        str2 = str7;
                        j2 = j6;
                        str6 = str;
                        j6 = j2 - 1;
                        str7 = str2;
                    }
                } catch (IOException unused3) {
                    str = str6;
                    str2 = str7;
                    j2 = j6;
                    str6 = str;
                    j6 = j2 - 1;
                    str7 = str2;
                }
            } else {
                j = -1;
                str3 = str6;
                long j9 = j6 + 4;
                if (j != -1) {
                    z = true;
                } else {
                    z = false;
                }
                m44439(j9);
                if (z) {
                    m44443(16L);
                    j4 = -1;
                    jM44438 = -1;
                    j3 = -1;
                    jM44437 = -1;
                    i2 = -1;
                    i = -1;
                } else {
                    int iM44448 = m44445();
                    int iM44449 = m44445();
                    long jM44447 = m44445();
                    long jM44448 = m44445();
                    i = iM44449;
                    jM44437 = m44437();
                    jM44438 = m44437();
                    j3 = jM44448;
                    i2 = iM44448;
                    j4 = jM44447;
                }
                iM44445 = m44445();
                c12856 = new C12856(i2, i, j4, jM44438, j3, jM44437, j6, iM44445, false);
                j5 = j6 + 22 + ((long) iM44445);
                if (iM44445 > 0) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (j != -1) {
                    str = str3;
                    long j10 = j;
                    str2 = str7;
                    j2 = j6;
                    c12856M44423 = m44423(j10, iM44445, j6);
                } else {
                    str = str3;
                    str2 = str7;
                    j2 = j6;
                    c12856M44423 = c12856;
                }
                if (j5 == length) {
                    this.f59541 = str4;
                    return c12856M44423;
                }
                if (c12857 == null) {
                    if (j5 > length) {
                        str5 = "ZIP end of central directory comment is truncated";
                    } else {
                        str5 = "ZIP end of central directory does not terminate the archive";
                    }
                    str7 = str5;
                    c12857 = c12856M44423;
                    str6 = str4;
                } else {
                    str7 = str2;
                    str6 = str;
                }
                j6 = j2 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m44439(long j) {
        this.f59540.seek(j);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m44443(long j) throws IOException {
        if (j < 0) {
            throw new IOException(C17588.m40051(j, "Skip "));
        }
        long filePointer = this.f59540.getFilePointer() + j;
        if (filePointer > this.f59540.length()) {
            throw new EOFException();
        }
        this.f59540.seek(filePointer);
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m44434(int i) {
        byte[] bArr = new byte[i];
        this.f59540.readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۗ */
    private int m44436() throws EOFException {
        int i = this.f59540.read();
        int i2 = this.f59540.read();
        int i3 = this.f59540.read();
        int i4 = this.f59540.read();
        if ((i | i2 | i3 | i4) >= 0) {
            return i | (i2 << 8) | (i3 << 16) | (i4 << 24);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ᩺ */
    private int m44445() throws EOFException {
        int i = this.f59540.read();
        int i2 = this.f59540.read();
        if ((i | i2) >= 0) {
            return i | (i2 << 8);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ۤ */
    private long m44437() {
        return ((long) m44436()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ۬ */
    private long m44441() {
        return m44437() | (m44437() << 32);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m44450();
        if (this.f59543) {
            return;
        }
        this.f59540.close();
        this.f59543 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44450() {
        List list = this.f59546;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23461.m52177((C19561) it.next());
        }
        list.clear();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC9866 m44473() {
        return this.f59540;
    }

    /* JADX INFO: renamed from: ۙ */
    public final C16207 m44455() {
        return new C16207(this);
    }
}
