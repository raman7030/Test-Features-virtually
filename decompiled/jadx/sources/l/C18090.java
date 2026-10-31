package l;

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
public final class C18090 implements Closeable {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C12717 f56325 = new C12717();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f56326;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f56327;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7889 f56328;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f56329;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f56330;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f56331;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte[] f56332;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f56333;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f56334;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Charset f56335;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f56336;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean f56337;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f56338;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public List f56339;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f56340;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f56341;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f56342;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f56343;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C18090 m42203() {
        C18090 c18090;
        if (this.f56331) {
            throw new IOException("Closed");
        }
        c18090 = new C18090(this.f56328.mo21174(), null, false, null, null);
        c18090.f56332 = this.f56332;
        c18090.f56342 = this.f56342;
        c18090.f56326 = this.f56326;
        c18090.f56343 = this.f56343;
        c18090.f56340 = this.f56340;
        this.f56334.add(c18090);
        return c18090;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18090 m42168(AbstractC15440 abstractC15440, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new C18090(abstractC15440.m36513("r"), null, false, null, null);
        }
        AbstractC15440 abstractC15440M36514 = abstractC15440.m36514();
        C12951 c12951 = new C12951(bArr);
        int i = c12951.readInt();
        AbstractC15440[] abstractC15440Arr = new AbstractC15440[i];
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            abstractC15440Arr[i2] = abstractC15440M36514.m36526(c12951.m31506());
            jArr[i2] = c12951.readLong();
        }
        return new C18090(C0127.m1200(C19885.m45717(abstractC15440.getName(), jArr, new C14127(abstractC15440Arr))), null, false, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m42176(AbstractC15440 abstractC15440) {
        AbstractC15440 abstractC15440M36536 = abstractC15440.m36536();
        C16678 c16678M42165 = m42165(abstractC15440M36536, abstractC15440.getName());
        if (c16678M42165 != null) {
            return c16678M42165.f51190;
        }
        C23411 c23411M36513 = abstractC15440.m36513("r");
        try {
            C18090 c18090 = new C18090(c23411M36513, null, false, null, null);
            try {
                c18090.m42172(abstractC15440M36536, (InterfaceC13422) null, true);
                byte[] bArr = c18090.f56332;
                c18090.close();
                return bArr;
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            C0349.m1793(c23411M36513);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18090 m42166(AbstractC15440 abstractC15440, Charset charset) {
        return new C18090(abstractC15440.m36513("r"), abstractC15440.m36536(), true, charset, null, true, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42173(byte[] bArr, int[] iArr) {
        int iM35152 = C14776.m35152(bArr.length, bArr);
        if (iM35152 == C14776.f45134) {
            for (byte b : bArr) {
                if (b <= 0) {
                    iArr[iM35152] = iArr[iM35152] + 1;
                    return;
                }
            }
            int i = C14776.f45134;
            iArr[i] = iArr[i] + 1;
            int i2 = C14776.f45131;
            iArr[i2] = iArr[i2] + 1;
            int i3 = C14776.f45132;
            iArr[i3] = iArr[i3] + 1;
            int i4 = C14776.f45128;
            iArr[i4] = iArr[i4] + 1;
            return;
        }
        iArr[iM35152] = iArr[iM35152] + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18090 m42167(AbstractC15440 abstractC15440, boolean z) {
        C23411 c23411M36513 = abstractC15440.m36513("r");
        try {
            C18090 c18090 = new C18090(c23411M36513, null, false, null, null, z, false);
            C11035 c11035M42183 = c18090.m42183();
            if (c11035M42183 != null && (c11035M42183.f33174 != 0 || c11035M42183.f33173 != 0 || c11035M42183.f33171 != c11035M42183.f33175)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            c18090.m42172((AbstractC15440) null, (InterfaceC13422) null, false);
            return c18090;
        } catch (IOException | RuntimeException e) {
            C0349.m1793(c23411M36513);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18090 m42169(C23411 c23411, C8083 c8083) {
        try {
            return new C18090(c23411, null, true, null, c8083, false, true);
        } catch (IOException | RuntimeException e) {
            C0349.m1793(c23411);
            throw e;
        }
    }

    public C18090(String str) {
        this(str, (C16014) null, 0);
    }

    public C18090(AbstractC15440 abstractC15440) {
        this(abstractC15440, (Charset) null, (InterfaceC13422) null);
    }

    public C18090(AbstractC15440 abstractC15440, Charset charset) {
        this(abstractC15440, charset, (InterfaceC13422) null);
    }

    public C18090(String str, C16014 c16014) {
        this(str, c16014, 0);
    }

    public C18090(String str, C16014 c16014, int i) {
        this(C16999.m39866(str, new String[0]), (Charset) null, c16014);
    }

    public C18090(AbstractC15440 abstractC15440, Charset charset, InterfaceC13422 interfaceC13422) {
        this(abstractC15440.m36513("r"), abstractC15440.m36536(), true, charset, interfaceC13422);
    }

    public C18090(InterfaceC7889 interfaceC7889, AbstractC15440 abstractC15440, boolean z, Charset charset, InterfaceC13422 interfaceC13422) {
        this(interfaceC7889, abstractC15440, z, charset, interfaceC13422, false, false);
    }

    public C18090(InterfaceC7889 interfaceC7889, AbstractC15440 abstractC15440, boolean z, Charset charset, InterfaceC13422 interfaceC13422, boolean z2, boolean z3) throws IOException {
        this.f56333 = new LinkedHashMap();
        List list = Collections.EMPTY_LIST;
        this.f56341 = list;
        this.f56339 = list;
        this.f56326 = "";
        this.f56331 = false;
        this.f56334 = C16895.m39756();
        this.f56337 = z2;
        this.f56327 = z3;
        this.f56328 = interfaceC7889;
        this.f56335 = charset;
        this.f56342 = C15972.m37750(interfaceC7889.getName().toLowerCase());
        if (z) {
            final C16678 c16678M42165 = m42165(abstractC15440, this.f56328.getName());
            if (c16678M42165 != null) {
                InterfaceC2245 interfaceC2245Mo21173 = this.f56328.mo21173();
                C19885 c19885M45717 = C19885.m45717(c16678M42165.f51188, c16678M42165.f51191.m17072(), new InterfaceC22001() { // from class: l.ۤ᩺ۡ
                    @Override // l.InterfaceC22001
                    /* JADX INFO: renamed from: ۧ */
                    public final InterfaceC2245 mo17661(int i) {
                        return ((AbstractC15440) c16678M42165.f51192.get(i)).mo23557("r");
                    }
                });
                c19885M45717.m45723(c16678M42165.f51189, interfaceC2245Mo21173);
                this.f56328 = C0127.m1200(c19885M45717);
                this.f56332 = c16678M42165.f51190;
            }
            m42172(abstractC15440, interfaceC13422, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16678 m42165(AbstractC15440 abstractC15440, String str) {
        if (abstractC15440 == null || !str.matches("(?i)(?s).*\\.zip\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C4365 c4365 = new C4365();
        int i = Integer.parseInt(str.substring(str.length() - 3));
        String strM36561 = C15472.m36561(3, 0, str);
        for (int i2 = 1; i2 <= 999; i2++) {
            AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(String.format(Locale.ENGLISH, "%s%03d", strM36561, Integer.valueOf(i2)));
            if (!abstractC15440M36526.mo23119()) {
                if (i2 >= i) {
                    break;
                }
                arrayList.clear();
                c4365.clear();
                break;
            }
            c4365.add(abstractC15440M36526.mo23127());
            arrayList.add(abstractC15440M36526);
        }
        int size = c4365.size();
        if (size <= 1) {
            return null;
        }
        arrayList.trimToSize();
        c4365.m13087();
        C10130 c10130 = new C10130();
        c10130.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            c10130.m25439(((AbstractC15440) arrayList.get(i3)).getName());
            c10130.m25431(c4365.getLong(i3));
        }
        return new C16678(str, i - 1, arrayList, c4365, c10130.m25444());
    }

    public final C3545 getEntry(String str) {
        return (C3545) this.f56333.get(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3545 m42211(String str) throws IOException {
        C3545 c3545 = (C3545) this.f56333.get(str);
        if (c3545 != null) {
            return c3545;
        }
        StringBuilder sbM9834 = C3200.m9834("Entry not found: ", str, "\n(");
        sbM9834.append(this.f56328.getName());
        sbM9834.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IOException(sbM9834.toString());
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Map m42195() {
        return C20195.unmodifiableMap(this.f56333);
    }

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final Collection m42210() {
        return C20195.unmodifiableCollection(this.f56333.values());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m42205() throws IOException {
        if (!this.f56337) {
            throw new IllegalStateException("ZIP was not opened for testing");
        }
        if (this.f56338 != null) {
            throw new IOException(this.f56338);
        }
        if (this.f56336) {
            throw new IOException("ZIP central directory contains an unreadable local file header");
        }
        for (C1862 c1862 : this.f56339) {
            boolean z = true;
            boolean z2 = c1862.f6354 >= 0 && (m42174(c1862, true, c1862.f6351) || m42174(c1862, false, c1862.f6351));
            if (!z2 && c1862.f6349) {
                if (!m42174(c1862, true, false) && !m42174(c1862, false, false)) {
                    z = false;
                }
                z2 = z;
            }
            if (!z2) {
                throw new IOException("ZIP data descriptor does not match central directory");
            }
        }
        return this.f56341;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42181(String str) {
        if (this.f56337 && this.f56338 == null) {
            this.f56338 = str;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] m42188() {
        return this.f56332;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m42194() {
        ArrayList arrayList = new ArrayList(this.f56333.values());
        Collections.sort(arrayList, f56325);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m42207() {
        return this.f56333.size();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m42208() {
        return this.f56326;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42192(String str) {
        if (str == null) {
            str = "";
        }
        this.f56326 = str;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m42197() {
        return this.f56329;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m42213() {
        return this.f56326.isEmpty();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m42212() {
        return this.f56342;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m42201() {
        return this.f56343;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m42199() throws IOException {
        if (!this.f56343) {
            throw new IllegalStateException();
        }
        m42180(this.f56340);
        C10130 c10130 = new C10130();
        long jM42182 = m42182() - 24;
        while (jM42182 > 0) {
            int iM42182 = (int) m42182();
            jM42182 -= (long) (iM42182 + 8);
            if (jM42182 >= 0) {
                int iM42177 = m42177();
                if (iM42177 != 1114793335) {
                    c10130.m25431(iM42182);
                    c10130.writeInt(iM42177);
                    byte[] bArrM42175 = m42175(iM42182 - 4);
                    c10130.write(bArrM42175, 0, bArrM42175.length);
                } else {
                    m42184(iM42182 - 4);
                }
            }
        }
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m42209() {
        return this.f56330;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42172(AbstractC15440 abstractC15440, InterfaceC13422 interfaceC13422, boolean z) throws IOException {
        long j;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        long j4;
        C19885 c19885;
        long jM45724;
        long j5;
        ArrayList<C3545> arrayList;
        HashSet hashSet;
        Set set;
        ArrayList arrayList2;
        Charset charset;
        C19885 c19886;
        boolean z4;
        IdentityHashMap identityHashMap;
        ArrayList arrayList3;
        long j6;
        long jM42178;
        int i;
        int i2;
        int i3;
        byte[] bArrM42175;
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
        long jM10793;
        long j8;
        C18090 c18090 = this;
        C11035 c11035M42183 = m42183();
        if (c11035M42183 == null && abstractC15440 != null && c18090.f56332 == null && c18090.f56328.getName().matches("(?i)(?s).*\\.z(?:0[1-9]|[1-9][0-9]+)")) {
            String name = c18090.f56328.getName();
            AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(name.substring(0, name.length() - 3) + "zip");
            if (abstractC15440M36526.mo23119()) {
                InterfaceC7889 interfaceC7889 = c18090.f56328;
                try {
                    c18090.f56328 = abstractC15440M36526.m36513("r");
                    c11035M42183 = m42183();
                    if (c11035M42183 == null) {
                        C22194.m49850(c18090.f56328);
                        c18090.f56328 = interfaceC7889;
                    } else if (z) {
                        C22194.m49850(interfaceC7889);
                    }
                } catch (IOException unused) {
                    InterfaceC7889 interfaceC78810 = c18090.f56328;
                    if (interfaceC78810 != interfaceC7889) {
                        C22194.m49850(interfaceC78810);
                        c18090.f56328 = interfaceC7889;
                    }
                }
            }
        }
        boolean z7 = c18090.f56327;
        if (c11035M42183 != null) {
            boolean z8 = c11035M42183.f33169;
            long j9 = c11035M42183.f33172;
            int i6 = c11035M42183.f33173;
            int i7 = c11035M42183.f33174;
            long j10 = c11035M42183.f33170;
            long j11 = c11035M42183.f33168;
            long j12 = j10;
            long j13 = c11035M42183.f33175;
            if (z7 && (i7 != 0 || i6 != 0 || c11035M42183.f33171 != j13)) {
                throw new IOException("Split ZIP archives are not supported");
            }
            boolean z9 = abstractC15440 != null && i7 > 0 && c18090.f56332 == null && c18090.f56328.getName().toLowerCase().endsWith(".zip");
            if (!z || z9) {
                if (z7 || z9 || j11 < 32) {
                    j = j13;
                } else {
                    c18090.m42180(j11 - 16);
                    if (c18090.f56328.available() >= 16 && m42182() == 2334950737559900225L && m42182() == 3617552046287187010L) {
                        c18090.m42180(j11 - 24);
                        long jM42182 = m42182();
                        j = j13;
                        long j14 = (j11 - jM42182) - 8;
                        c18090.m42180(j14);
                        if (m42182() == jM42182) {
                            c18090.f56343 = true;
                            c18090.f56340 = j14;
                        }
                    } else {
                        j = j13;
                    }
                }
                if (z9) {
                    String strM7878 = C2439.m7878(c18090.f56328.getName());
                    int i8 = i7 + 1;
                    AbstractC15440[] abstractC15440Arr = new AbstractC15440[i8];
                    long[] jArr = new long[i8];
                    int i9 = 0;
                    while (i9 < i7) {
                        boolean z10 = z8;
                        Locale locale = Locale.ENGLISH;
                        int i10 = i9 + 1;
                        long j15 = j12;
                        boolean z11 = z7;
                        AbstractC15440 abstractC15440M36527 = abstractC15440.m36526(String.format(locale, "%s.z%02d", strM7878, Integer.valueOf(i10)));
                        if (abstractC15440M36527.mo23119()) {
                            abstractC15440Arr[i9] = abstractC15440M36527;
                            jArr[i9] = abstractC15440M36527.mo23127();
                        } else {
                            AbstractC15440 abstractC15440M36528 = abstractC15440.m36526(String.format(locale, "%s.Z%02d", strM7878, Integer.valueOf(i10)));
                            if (!abstractC15440M36528.mo23119()) {
                                throw new FileNotFoundException(abstractC15440M36527.getName());
                            }
                            abstractC15440Arr[i9] = abstractC15440M36528;
                            jArr[i9] = abstractC15440M36528.mo23127();
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
                    abstractC15440Arr[i7] = abstractC15440.m36526(c18090.f56328.getName());
                    jArr[i7] = c18090.f56328.length();
                    C10130 c10130M43030 = C18515.m43030(i8);
                    for (int i11 = 0; i11 <= i7; i11++) {
                        c10130M43030.m25439(abstractC15440Arr[i11].getName());
                        c10130M43030.m25431(jArr[i11]);
                    }
                    c18090.f56332 = c10130M43030.m25444();
                    if (!z) {
                        InterfaceC2245 interfaceC2245Mo21173 = c18090.f56328.mo21173();
                        C19885 c19885M45717 = C19885.m45717(interfaceC2245Mo21173.getName(), jArr, new C6367(abstractC15440Arr));
                        c19885M45717.m45723(i7, interfaceC2245Mo21173);
                        c18090.f56328 = C0127.m1200(c19885M45717);
                        long jM45725 = c19885M45717.m45724(i6) + j11;
                        jM45724 = c19885M45717.m45724(i7) + j16;
                        c18090.m42180(jM45725);
                        c19885 = c19885M45717;
                        j11 = jM45725;
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
                                c18090.m42180(j5);
                                if (c18090.f56328.available() < 46 || m42177() != 33639248) {
                                    j5 = j11;
                                } else {
                                    c18090.m42180(42 + j5);
                                    long jM42179 = m42178();
                                    long j17 = j5 - j11;
                                    if (jM42179 == 4294967295L || jM42179 > C13132.FOREVER_NS - j17) {
                                        j5 = j11;
                                    } else {
                                        c18090.m42180(jM42179 + j17);
                                        if (c18090.f56328.available() < 4 || m42177() != 67324752) {
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
                    c18090.m42180(j11);
                    j4 = j3;
                    c19885 = null;
                    jM45724 = j9;
                }
                String str = "ZIP central directory size does not match EOCD";
                boolean z12 = c18090.f56337;
                if ((z12 || z3) && (j < 0 || j2 < 0 || jM45724 < j11 || jM45724 - j11 != j2)) {
                    c18090.m42185("ZIP central directory size does not match EOCD");
                }
                if (z3 && j == 0 && j2 == 0) {
                    c18090.f56330 = z2;
                    return;
                }
                boolean z13 = z2;
                String str2 = "ZIP central directory entry count does not match EOCD";
                if (c18090.f56328.available() <= 50 || m42177() != 33639248) {
                    if (z3) {
                        throw new IOException("ZIP central directory could not be parsed");
                    }
                    if (z12 && (j != 0 || j2 != 0)) {
                        c18090.m42181("ZIP central directory could not be parsed");
                    }
                    c18090.m42171(interfaceC13422, true);
                    if (z12 && interfaceC13422 == null && c18090.f56341.size() != j) {
                        c18090.m42181("ZIP central directory entry count does not match EOCD");
                        return;
                    }
                    return;
                }
                c18090.f56330 = z13;
                ArrayList arrayList5 = new ArrayList();
                IdentityHashMap identityHashMap2 = (z12 || z3) ? new IdentityHashMap() : null;
                Set setNewSetFromMap = z12 ? Collections.newSetFromMap(new IdentityHashMap()) : null;
                ArrayList arrayList6 = z12 ? new ArrayList() : null;
                int i12 = C14776.f45125;
                int[] iArr = new int[i12];
                int i13 = 50000;
                ArrayList arrayList7 = arrayList6;
                long j18 = 0;
                long filePointer = 0;
                while (true) {
                    C3545 c3545 = new C3545();
                    int i14 = i12;
                    c3545.m10812((m42186() >> 8) & 15);
                    m42186();
                    c3545.m10802(m42186());
                    c3545.m10814(m42186());
                    String str3 = str;
                    c3545.setTime(C2568.m8115(m42178()));
                    c3545.m10769(m42177());
                    c3545.m10770(m42178());
                    c3545.m10805(m42178());
                    int iM42186 = m42186();
                    int iM42187 = m42186();
                    long j19 = j11;
                    int iM42188 = m42186();
                    int iM42189 = m42186();
                    String str4 = str2;
                    c3545.m10794(m42186());
                    c3545.m10804(m42177());
                    if (z9) {
                        c3545.m10799(c19885.m45724(iM42189) + m42178());
                    } else {
                        c3545.m10799(m42178());
                    }
                    boolean zM10786 = c3545.m10786();
                    byte[] bArrM42176 = c18090.m42175(iM42186);
                    Charset charsetM35151 = c18090.f56335;
                    if (interfaceC13422 == null || interfaceC13422.mo21452(bArrM42176)) {
                        if (!zM10786 && i13 > 0 && charsetM35151 == null) {
                            m42173(bArrM42176, iArr);
                            i13--;
                        }
                        int i15 = i13;
                        c3545.m10806(bArrM42176);
                        if (z12 || z3) {
                            identityHashMap2.put(c3545, bArrM42176);
                        }
                        if (iM42187 > 0) {
                            byte[] bArrM42177 = c18090.m42175(iM42187);
                            if (c3545.m10803(bArrM42177)) {
                                bArrM42177 = C8484.m22155(1, bArrM42177);
                                if (z12) {
                                    setNewSetFromMap.add(c3545);
                                }
                            }
                            c3545.m10776(bArrM42177);
                        }
                        if (j4 != 0) {
                            long jM10777 = c3545.m10777();
                            if (jM10777 < 0 || jM10777 > C13132.FOREVER_NS - j4) {
                                c18090.m42181("ZIP local file header offset overflows archive bounds");
                                c3545.m10799(c18090.f56328.length());
                            } else {
                                c3545.m10799(jM10777 + j4);
                            }
                        }
                        if (iM42188 > 0) {
                            try {
                                byte[] bArrM42178 = c18090.m42175(iM42188);
                                if (!zM10786 && i15 > 0 && charsetM35151 == null) {
                                    m42173(bArrM42178, iArr);
                                    i15--;
                                }
                                c3545.m10789(bArrM42178);
                            } catch (IOException e) {
                                if (z3) {
                                    throw e;
                                }
                            }
                        }
                        arrayList = arrayList5;
                        arrayList.add(c3545);
                        i13 = i15;
                    } else {
                        c18090.m42184(iM42187 + iM42188);
                        arrayList = arrayList5;
                    }
                    if (z12 || z3) {
                        j18++;
                        filePointer = c18090.f56328.getFilePointer();
                    }
                    long j20 = filePointer;
                    if (m42177() != 33639248) {
                        if (z12 || z3) {
                            if (j18 != j) {
                                c18090.m42185(str4);
                            }
                            if (j20 < j19 || j2 < 0) {
                                c18090.m42185(str3);
                            } else {
                                long j21 = j2 - (j20 - j19);
                                if (j21 != 0) {
                                    if (j21 < 6) {
                                        c18090.m42185("ZIP central directory size does not match parsed records");
                                    } else {
                                        try {
                                            c18090.m42180(j20);
                                            if (m42177() != 84233040) {
                                                c18090.m42185("ZIP central directory size does not match parsed records");
                                            } else {
                                                int iM421810 = m42186();
                                                if (j21 != ((long) iM421810) + 6 || c18090.f56328.available() < iM421810) {
                                                    c18090.m42185("ZIP central directory digital signature is truncated");
                                                }
                                            }
                                        } catch (IOException e2) {
                                            if (z3) {
                                                throw e2;
                                            }
                                            c18090.m42181("ZIP central directory is truncated");
                                        }
                                    }
                                }
                            }
                        }
                        Charset charset4 = StandardCharsets.UTF_8;
                        if (charsetM35151 == null) {
                            int i16 = C14776.f45134;
                            for (int i17 = 0; i17 < i14; i17++) {
                                if (i17 != i16 && iArr[i17] > iArr[i16]) {
                                    i16 = i17;
                                }
                            }
                            charsetM35151 = C14776.m35151(i16);
                        }
                        Collections.sort(arrayList, new C12012());
                        Set setNewSetFromMap2 = z12 ? Collections.newSetFromMap(new IdentityHashMap(arrayList.size())) : null;
                        HashSet hashSet3 = z12 ? null : new HashSet(arrayList.size());
                        for (C3545 c3546 : arrayList) {
                            try {
                                long jM10778 = c3546.m10777();
                                c18090.m42180(jM10778);
                                if (c18090.f56328.available() < 30 || m42177() != 67324752) {
                                    hashSet = hashSet3;
                                    set = setNewSetFromMap2;
                                    arrayList2 = arrayList;
                                    charset = charset4;
                                    this = c18090;
                                    c19886 = c19885;
                                    z4 = z12;
                                    identityHashMap = identityHashMap2;
                                    arrayList3 = arrayList7;
                                    if (z3) {
                                        throw new IOException("ZIP central directory entry has an unreadable local file header");
                                    }
                                } else {
                                    if (z12) {
                                        m42186();
                                        int iM421811 = m42186();
                                        int iM421812 = m42186();
                                        c18090.m42184(4L);
                                        int iM42177 = m42177();
                                        long jM421710 = m42178();
                                        i = iM421811;
                                        i2 = iM421812;
                                        i3 = iM42177;
                                        jM42178 = m42178();
                                        j6 = jM421710;
                                    } else {
                                        c18090.m42180(26 + jM10778);
                                        j6 = 0;
                                        jM42178 = 0;
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                    }
                                    int iM421813 = m42186();
                                    int iM421814 = m42186();
                                    if (z12 || z3) {
                                        bArrM42175 = c18090.m42175(iM421813);
                                    } else {
                                        c18090.m42184(iM421813);
                                        bArrM42175 = null;
                                    }
                                    byte[] bArrM42179 = c18090.m42175(iM421814);
                                    if (z12) {
                                        try {
                                            c19886 = c19885;
                                            i4 = iM421814;
                                            i5 = iM421813;
                                            j7 = jM10778;
                                            bArr = bArrM42179;
                                            byte[] bArr2 = bArrM42175;
                                            int i18 = i2;
                                            hashSet2 = hashSet3;
                                            int i19 = i3;
                                            arrayList4 = arrayList7;
                                            set2 = setNewSetFromMap;
                                            set3 = setNewSetFromMap2;
                                            z4 = z12;
                                            identityHashMap = identityHashMap2;
                                            charset2 = charsetM35151;
                                            charset3 = charset4;
                                            arrayList2 = arrayList;
                                            try {
                                                m42170(c3546, (byte[]) identityHashMap2.get(c3546), i, i18, i19, j6, jM42178, bArr2, bArr);
                                            } catch (EOFException e3) {
                                                e = e3;
                                                hashSet = hashSet2;
                                                arrayList3 = arrayList4;
                                                setNewSetFromMap = set2;
                                                set = set3;
                                                charsetM35151 = charset2;
                                                charset = charset3;
                                                if (!z3) {
                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                }
                                                setNewSetFromMap2 = set;
                                                hashSet3 = hashSet;
                                                charset4 = charset;
                                                arrayList7 = arrayList3;
                                                c18090 = this;
                                                identityHashMap2 = identityHashMap;
                                                z12 = z4;
                                                arrayList = arrayList2;
                                                c19885 = c19886;
                                            }
                                        } catch (EOFException e4) {
                                            e = e4;
                                            arrayList4 = arrayList7;
                                            hashSet2 = hashSet3;
                                            set2 = setNewSetFromMap;
                                            set3 = setNewSetFromMap2;
                                            arrayList2 = arrayList;
                                            charset2 = charsetM35151;
                                            charset3 = charset4;
                                            c19886 = c19885;
                                            z4 = z12;
                                            identityHashMap = identityHashMap2;
                                            hashSet = hashSet2;
                                            arrayList3 = arrayList4;
                                            setNewSetFromMap = set2;
                                            set = set3;
                                            charsetM35151 = charset2;
                                            charset = charset3;
                                            if (!z3) {
                                                throw new IOException("ZIP central directory entry local file header is truncated", e);
                                            }
                                            setNewSetFromMap2 = set;
                                            hashSet3 = hashSet;
                                            charset4 = charset;
                                            arrayList7 = arrayList3;
                                            c18090 = this;
                                            identityHashMap2 = identityHashMap;
                                            z12 = z4;
                                            arrayList = arrayList2;
                                            c19885 = c19886;
                                        }
                                    } else {
                                        arrayList4 = arrayList7;
                                        j7 = jM10778;
                                        i5 = iM421813;
                                        bArr = bArrM42179;
                                        byte[] bArr3 = bArrM42175;
                                        hashSet2 = hashSet3;
                                        set2 = setNewSetFromMap;
                                        set3 = setNewSetFromMap2;
                                        arrayList2 = arrayList;
                                        charset2 = charsetM35151;
                                        charset3 = charset4;
                                        c19886 = c19885;
                                        z4 = z12;
                                        i4 = iM421814;
                                        identityHashMap = identityHashMap2;
                                        if (z3 && !Arrays.equals((byte[]) identityHashMap.get(c3546), bArr3)) {
                                            throw new IOException("ZIP local file header name does not match central directory");
                                        }
                                    }
                                    byte[] bArr4 = bArr;
                                    c3546.m10800(C8484.m22155(1, bArr4));
                                    c3546.m10787(j7 + 30 + ((long) i5) + ((long) i4));
                                    if (z4) {
                                        try {
                                            if ((c3546.m10796() & 8) != 0) {
                                                boolean z14 = j6 == 4294967295L || jM42178 == 4294967295L;
                                                try {
                                                    try {
                                                        if (z14) {
                                                            setNewSetFromMap = set2;
                                                        } else {
                                                            setNewSetFromMap = set2;
                                                            try {
                                                                if (!setNewSetFromMap.contains(c3546)) {
                                                                    z5 = false;
                                                                }
                                                                if (z5 || z14 || C8484.m22152(1, bArr4) != null) {
                                                                    z6 = false;
                                                                } else {
                                                                    z6 = true;
                                                                }
                                                                long jM10811 = c3546.m10811();
                                                                jM10793 = c3546.m10793();
                                                                if (jM10793 >= 0 || jM10811 < 0 || jM10811 > C13132.FOREVER_NS - jM10793) {
                                                                    j8 = -1;
                                                                } else {
                                                                    j8 = jM10811 + jM10793;
                                                                }
                                                                arrayList3 = arrayList4;
                                                                arrayList3.add(new C1862(j8, c3546.m10782(), jM10793, c3546.getSize(), z5, z6));
                                                            } catch (EOFException e5) {
                                                                e = e5;
                                                                hashSet = hashSet2;
                                                                arrayList3 = arrayList4;
                                                                set = set3;
                                                                charsetM35151 = charset2;
                                                                charset = charset3;
                                                                if (!z3) {
                                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                                }
                                                                setNewSetFromMap2 = set;
                                                                hashSet3 = hashSet;
                                                                charset4 = charset;
                                                                arrayList7 = arrayList3;
                                                                c18090 = this;
                                                                identityHashMap2 = identityHashMap;
                                                                z12 = z4;
                                                                arrayList = arrayList2;
                                                                c19885 = c19886;
                                                            }
                                                        }
                                                        arrayList3.add(new C1862(j8, c3546.m10782(), jM10793, c3546.getSize(), z5, z6));
                                                    } catch (EOFException e6) {
                                                        e = e6;
                                                        hashSet = hashSet2;
                                                        set = set3;
                                                        charsetM35151 = charset2;
                                                        charset = charset3;
                                                        if (!z3) {
                                                            throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                        }
                                                        setNewSetFromMap2 = set;
                                                        hashSet3 = hashSet;
                                                        charset4 = charset;
                                                        arrayList7 = arrayList3;
                                                        c18090 = this;
                                                        identityHashMap2 = identityHashMap;
                                                        z12 = z4;
                                                        arrayList = arrayList2;
                                                        c19885 = c19886;
                                                    }
                                                    long jM10812 = c3546.m10811();
                                                    jM10793 = c3546.m10793();
                                                    if (jM10793 >= 0) {
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
                                    if (c3546.m10786()) {
                                        this = this;
                                        try {
                                            charset = charset3;
                                            try {
                                                c3546.m10772(charset, false, this.f56342);
                                                charsetM35151 = charset2;
                                            } catch (EOFException e9) {
                                                e = e9;
                                                hashSet = hashSet2;
                                                set = set3;
                                                charsetM35151 = charset2;
                                                if (!z3) {
                                                    throw new IOException("ZIP central directory entry local file header is truncated", e);
                                                }
                                                setNewSetFromMap2 = set;
                                                hashSet3 = hashSet;
                                                charset4 = charset;
                                                arrayList7 = arrayList3;
                                                c18090 = this;
                                                identityHashMap2 = identityHashMap;
                                                z12 = z4;
                                                arrayList = arrayList2;
                                                c19885 = c19886;
                                            }
                                        } catch (EOFException e10) {
                                            e = e10;
                                            charset = charset3;
                                        }
                                    } else {
                                        this = this;
                                        charset = charset3;
                                        charsetM35151 = charset2;
                                        c3546.m10772(charsetM35151, true, this.f56342);
                                    }
                                    if (!z9) {
                                        try {
                                            if (!this.f56342 && c3546.getName().equals("AndroidManifest.xml")) {
                                                this.f56342 = true;
                                            }
                                            if (z4) {
                                                set = set3;
                                                try {
                                                    set.add(c3546);
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
                                                    hashSet.add(c3546.getName());
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
                                            c18090 = this;
                                            identityHashMap2 = identityHashMap;
                                            z12 = z4;
                                            arrayList = arrayList2;
                                            c19885 = c19886;
                                        }
                                    } else if (z4) {
                                        set = set3;
                                        set.add(c3546);
                                        hashSet = hashSet2;
                                    } else {
                                        set = set3;
                                        hashSet = hashSet2;
                                        hashSet.add(c3546.getName());
                                    }
                                }
                            } catch (EOFException e14) {
                                e = e14;
                                hashSet = hashSet3;
                                set = setNewSetFromMap2;
                                arrayList2 = arrayList;
                                charset = charset4;
                                this = c18090;
                                c19886 = c19885;
                                z4 = z12;
                                identityHashMap = identityHashMap2;
                                arrayList3 = arrayList7;
                            }
                            setNewSetFromMap2 = set;
                            hashSet3 = hashSet;
                            charset4 = charset;
                            arrayList7 = arrayList3;
                            c18090 = this;
                            identityHashMap2 = identityHashMap;
                            z12 = z4;
                            arrayList = arrayList2;
                            c19885 = c19886;
                        }
                        ArrayList arrayList8 = arrayList7;
                        HashSet hashSet4 = hashSet3;
                        Set set4 = setNewSetFromMap2;
                        ArrayList<C3545> arrayList9 = arrayList;
                        C18090 c18091 = c18090;
                        C19885 c19887 = c19885;
                        boolean z15 = z12;
                        LinkedList<C3545> linkedList = new LinkedList();
                        for (C3545 c3547 : arrayList9) {
                            if (z15) {
                                if (set4.contains(c3547)) {
                                    c18091.m42187(c3547);
                                    linkedList.add(c3547);
                                }
                            } else if (hashSet4.contains(c3547.getName())) {
                                c18091.m42187(c3547);
                                linkedList.add(c3547);
                            }
                        }
                        if (z15) {
                            c18091.f56336 = linkedList.size() != arrayList9.size();
                            c18091.f56341 = C20195.unmodifiableList(new ArrayList(linkedList));
                            c18091.f56339 = C20195.unmodifiableList(arrayList8);
                        }
                        ArrayList arrayList10 = new ArrayList();
                        if (c19887 == null) {
                            long length = c18091.f56328.length() / 200;
                            for (C3545 c3548 : linkedList) {
                                if (c3548.m10767() == 0 && !c3548.m10808() && !c3548.isDirectory() && c3548.getSize() > length) {
                                    arrayList10.add(c3548);
                                }
                            }
                        }
                        boolean zIsEmpty = arrayList10.isEmpty();
                        LinkedHashMap linkedHashMap = c18091.f56333;
                        if (zIsEmpty) {
                            for (C3545 c3549 : linkedList) {
                                linkedHashMap.put(c3549.getName(), c3549);
                            }
                            return;
                        }
                        Collections.sort(arrayList10, new C23300(0));
                        int iMin = Math.min(arrayList10.size(), 10);
                        for (int i20 = 0; i20 < iMin; i20++) {
                            C3545 c35410 = (C3545) arrayList10.get(i20);
                            if (!c35410.m10790()) {
                                long jM10813 = c35410.m10811();
                                long jM10794 = c35410.m10793() + jM10813;
                                for (C3545 c35411 : linkedList) {
                                    if (c35411 != c35410 && !c35411.isDirectory() && !c35411.m10790()) {
                                        long jM10814 = c35411.m10811();
                                        long jM10795 = c35411.m10793() + jM10814;
                                        if (jM10813 <= jM10814 && jM10795 <= jM10794) {
                                            c35411.m10773(c35410);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList<C3545> arrayList11 = new ArrayList();
                        for (C3545 c35412 : linkedList) {
                            if (c35412.m10790()) {
                                arrayList11.add(c35412);
                            } else {
                                linkedHashMap.put(c35412.getName(), c35412);
                            }
                        }
                        for (C3545 c35413 : arrayList11) {
                            linkedHashMap.put(c35413.getName(), c35413);
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
            c18090.m42181("ZIP end of central directory is missing or unreadable");
            c18090.m42171(interfaceC13422, false);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m42185(String str) throws IOException {
        if (this.f56327) {
            throw new IOException(str);
        }
        m42181(str);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00da A[Catch: IOException -> 0x00ee, TryCatch #0 {IOException -> 0x00ee, blocks: (B:22:0x0052, B:42:0x008e, B:44:0x0098, B:46:0x009d, B:48:0x00a3, B:50:0x00ad, B:51:0x00b1, B:53:0x00b7, B:55:0x00bf, B:58:0x00c6, B:64:0x00da, B:60:0x00cc, B:62:0x00d2, B:24:0x005a, B:28:0x0064, B:32:0x0070, B:38:0x007f, B:65:0x00de, B:66:0x00e5, B:67:0x00e6, B:68:0x00ed), top: B:89:0x004c }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42170(C3545 c3545, byte[] bArr, int i, int i2, int i3, long j, long j2, byte[] bArr2, byte[] bArr3) {
        long jM22156;
        long[] jArr;
        int iM10796 = c3545.m10796();
        if (((iM10796 ^ i) & 10367) != 0) {
            m42181("ZIP local file header flags do not match central directory");
        }
        if (c3545.m10767() != i2) {
            m42181("ZIP local file header method does not match central directory");
        }
        int i4 = 0;
        boolean z = ((iM10796 & 8192) == 0 || (i & 8192) == 0) ? false : true;
        if (!z && !Arrays.equals(bArr, bArr2)) {
            m42181("ZIP local file header name does not match central directory");
        }
        try {
            if (j == 4294967295L || j2 == 4294967295L) {
                C8484 c8484M22152 = C8484.m22152(1, bArr3);
                if (c8484M22152 == null) {
                    throw new IOException("Missing ZIP64 local extra data");
                }
                if (j2 == 4294967295L) {
                    jM22156 = c8484M22152.m22156(0);
                    i4 = 8;
                } else {
                    jM22156 = j2;
                }
                long jM22157 = j == 4294967295L ? c8484M22152.m22156(i4) : j;
                if (jM22157 < 0 || jM22156 < 0) {
                    throw new IOException("Unsupported unsigned ZIP64 size");
                }
                jArr = new long[]{jM22157, jM22156};
            } else {
                jArr = new long[]{j, j2};
            }
            if ((iM10796 & 8) == 0) {
                if (jArr[0] != c3545.m10793()) {
                    m42181("ZIP local file header compressed size does not match central directory");
                }
                if (!z && (i3 != c3545.m10782() || jArr[1] != c3545.getSize())) {
                    m42181("ZIP local file header CRC or size does not match central directory");
                }
            } else {
                long j3 = jArr[0];
                if (j3 != 0 && j3 != c3545.m10793()) {
                    m42181("ZIP local file header compressed size does not match central directory");
                }
                if (!z) {
                    if (i3 == 0 || i3 == c3545.m10782()) {
                        long j4 = jArr[1];
                        if (j4 != 0 && j4 != c3545.getSize()) {
                            m42181("ZIP local file header CRC or size does not match central directory");
                        }
                    } else {
                        m42181("ZIP local file header CRC or size does not match central directory");
                    }
                }
            }
        } catch (IOException unused) {
            m42181("ZIP local file header contains invalid ZIP64 sizes");
        }
        if (c3545.m10767() == 99 || i2 == 99) {
            C8484 c8484M22153 = C8484.m22152(39169, c3545.m10807());
            C8484 c8484M22154 = C8484.m22152(39169, bArr3);
            if (c8484M22153 == null || c8484M22154 == null || c8484M22153.m22157().length < 7 || c8484M22154.m22157().length < 7) {
                m42181("ZIP AES extra data is missing from a file header");
                return;
            }
            for (int i5 = 0; i5 < 7; i5++) {
                if (c8484M22153.m22157()[i5] != c8484M22154.m22157()[i5]) {
                    m42181("ZIP AES extra data does not match between file headers");
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42174(C1862 c1862, boolean z, boolean z2) throws InterruptedIOException, C13855 {
        try {
            m42180(c1862.f6354);
            if (!z || m42177() == 134695760) {
                return m42177() == c1862.f6352 && (z2 ? m42182() : m42178()) == c1862.f6350 && (z2 ? m42182() : m42178()) == c1862.f6353;
            }
            return false;
        } catch (EOFException unused) {
            return false;
        } catch (InterruptedIOException e) {
            throw e;
        } catch (IOException e2) {
            throw new C13855(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42171(InterfaceC13422 interfaceC13422, boolean z) throws IOException {
        int i;
        long j;
        Charset charsetM35151;
        boolean zM10803;
        boolean z2;
        long jM42178;
        long jM42179;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        long j2;
        int i3;
        ArrayList<C3545> arrayList = new ArrayList();
        int i4 = C14776.f45125;
        int[] iArr = new int[i4];
        long length = this.f56328.length();
        m42180(0L);
        if (m42177() != 67324752) {
            InterfaceC7889 interfaceC7889 = this.f56328;
            int i5 = 4;
            byte[] bArr3 = {UTF8.S_P4A, 75, 3, 4};
            long jMin = Math.min(interfaceC7889.length(), 52428800L);
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
                interfaceC7889.seek(0L);
                int i8 = 0;
                int i9 = 0;
                long j4 = 0;
                int i10 = 0;
                while (true) {
                    if (j4 < jMin) {
                        if (i8 >= i9) {
                            int iMo21175 = interfaceC7889.mo21175(0, (int) Math.min(65536, jMin - j4), bArr4);
                            if (iMo21175 != 0) {
                                i9 = iMo21175;
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
                                long filePointer = interfaceC7889.getFilePointer();
                                bArr2 = bArr3;
                                try {
                                    interfaceC7889.seek(j5 + 5);
                                    int iMo21172 = interfaceC7889.mo21172();
                                    if (iMo21172 == 45 || iMo21172 == 20 || iMo21172 == 10) {
                                        interfaceC7889.mo21172();
                                        int iMo21173 = interfaceC7889.mo21172();
                                        if (iMo21173 == 0 || iMo21173 == 8 || iMo21173 == 9 || iMo21173 == 12 || iMo21173 == 14 || iMo21173 == 95) {
                                            interfaceC7889.readInt();
                                            interfaceC7889.readInt();
                                            long j7 = ((long) interfaceC7889.readInt()) & 4294967295L;
                                            interfaceC7889.readInt();
                                            bArr = bArr4;
                                            int iMo21174 = interfaceC7889.mo21172();
                                            if (iMo21174 != 0) {
                                                if (interfaceC7889.getFilePointer() + ((long) iMo21174) + ((long) interfaceC7889.mo21172()) + j7 <= interfaceC7889.length()) {
                                                    interfaceC7889.seek(filePointer);
                                                    j2 = j6;
                                                    break;
                                                }
                                                interfaceC7889.seek(filePointer);
                                            } else {
                                                interfaceC7889.seek(filePointer);
                                            }
                                        } else {
                                            bArr = bArr4;
                                            interfaceC7889.seek(filePointer);
                                        }
                                    } else {
                                        bArr = bArr4;
                                        interfaceC7889.seek(filePointer);
                                    }
                                    i10 = 0;
                                } catch (Throwable th) {
                                    interfaceC7889.seek(filePointer);
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
                    m42180(j2);
                }
            }
            j2 = -1;
            if (j2 != -1) {
                m42180(j2);
            }
        } else {
            i = i4;
            j = length;
            m42180(0L);
        }
        int i12 = 50000;
        loop0: while (true) {
            int iAvailable = this.f56328.available();
            charsetM35151 = this.f56335;
            if (iAvailable <= 30 || m42177() != 67324752) {
                break;
            }
            C3545 c3545 = new C3545();
            long j8 = 4;
            c3545.m10799(this.f56328.getFilePointer() - 4);
            m42186();
            c3545.m10802(m42186());
            c3545.m10814(m42186());
            c3545.setTime(C2568.m8115(m42178()));
            c3545.m10769(m42177());
            c3545.m10770(m42178());
            c3545.m10805(m42178());
            int iM42186 = m42186();
            int iM42187 = m42186();
            boolean zM10786 = c3545.m10786();
            byte[] bArrM42175 = m42175(iM42186);
            boolean z3 = (interfaceC13422 == null || interfaceC13422.mo21452(bArrM42175)) ? false : true;
            if (!z3 && !zM10786 && i12 > 0 && charsetM35151 == null) {
                m42173(bArrM42175, iArr);
                i12--;
            }
            c3545.m10806(bArrM42175);
            if (iM42187 > 0) {
                byte[] bArrM42176 = m42175(iM42187);
                zM10803 = c3545.m10803(bArrM42176);
                if (zM10803) {
                    bArrM42176 = C8484.m22155(1, bArrM42176);
                }
                c3545.m10800(bArrM42176);
            } else {
                zM10803 = false;
            }
            c3545.m10787(this.f56328.getFilePointer());
            int i13 = 8;
            if ((c3545.m10796() & 8) == 8) {
                int i14 = 0;
                while (true) {
                    int i15 = this.f56328.read();
                    if (i15 == -1) {
                        break loop0;
                    }
                    i14 = (i14 >>> i13) | (i15 << 24);
                    if (i14 == 134695760) {
                        long filePointer2 = (this.f56328.getFilePointer() - c3545.m10811()) - j8;
                        int iM42177 = m42177();
                        if (zM10803) {
                            jM42178 = m42182();
                            jM42179 = m42182();
                        } else {
                            jM42178 = m42178();
                            jM42179 = m42178();
                        }
                        long j9 = jM42178;
                        z2 = z3;
                        long j10 = jM42179;
                        if (j9 == filePointer2) {
                            c3545.m10769(iM42177);
                            c3545.m10770(j9);
                            c3545.m10805(j10);
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
                    arrayList.add(c3545);
                }
            } else {
                z2 = z3;
                if (j - c3545.m10811() < c3545.m10793()) {
                    break;
                }
                m42184(c3545.m10793());
                if (!z2) {
                    arrayList.add(c3545);
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
        if (charsetM35151 == null) {
            int i16 = C14776.f45134;
            int i17 = i;
            for (int i18 = 0; i18 < i17; i18++) {
                if (i18 != i16 && iArr[i18] > iArr[i16]) {
                    i16 = i18;
                }
            }
            charsetM35151 = C14776.m35151(i16);
        }
        for (C3545 c3546 : arrayList) {
            if (c3546.m10786()) {
                c3546.m10772(charset, false, this.f56342);
            } else {
                c3546.m10772(charsetM35151, true, this.f56342);
            }
            if (!this.f56342 && c3546.getName().equals("AndroidManifest.xml") && this.f56332 == null) {
                this.f56342 = true;
            }
        }
        LinkedHashMap linkedHashMap = this.f56333;
        linkedHashMap.clear();
        for (C3545 c3547 : arrayList) {
            m42187(c3547);
            linkedHashMap.put(c3547.getName(), c3547);
        }
        if (this.f56337) {
            this.f56341 = C20195.unmodifiableList(new ArrayList(arrayList));
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m42187(C3545 c3545) throws ZipException, EOFException {
        int iM10767;
        if (c3545.m10808()) {
            if (this.f56342) {
                c3545.m10802(c3545.m10796() & (-2));
            } else {
                C8484 c8484M22152 = C8484.m22152(39169, c3545.m10766());
                if (c8484M22152 != null) {
                    c3545.m10798(99);
                    c3545.m10774(c8484M22152);
                    byte[] bArrM22157 = c8484M22152.m22157();
                    if (bArrM22157.length < 7) {
                        throw new ZipException("Invalid aes extra data record. (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    boolean z = C2568.f8121;
                    if (7 > bArrM22157.length) {
                        throw new EOFException();
                    }
                    c3545.m10814(C15972.m37760(5, bArrM22157));
                } else if ((c3545.m10796() & 64) != 0) {
                    c3545.m10798(1);
                } else {
                    c3545.m10798(0);
                }
            }
        }
        if (this.f56342 && (iM10767 = c3545.m10767()) != 8 && iM10767 != 0) {
            c3545.m10814(0);
        }
        if (this.f56342 && c3545.m10767() == 0 && c3545.getSize() != c3545.m10793()) {
            c3545.m10770(c3545.getSize());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11035 m42164(long j, int i, long j2) throws IOException {
        m42180(j);
        int iM42177 = m42177();
        if (iM42177 != 101075792) {
            throw new IOException("Invalid zip64 eocd record offset, sig=" + Integer.toHexString(iM42177) + " offset=" + j);
        }
        if (this.f56327) {
            long jM42182 = m42182();
            long j3 = j2 - 20;
            if (jM42182 < 44 || j > 9223372036854775795L || jM42182 > 9223372036854775795L - j || j + 12 + jM42182 != j3) {
                throw new IOException(C16014.m37865(jM42182, "Invalid zip64 eocd record size: "));
            }
            m42184(4L);
        } else {
            m42184(12L);
        }
        return new C11035(m42177(), m42177(), m42182(), m42182(), m42182(), m42182(), j, i, true);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12445 m42206(C3545 c3545) {
        return new C12445(this.f56328, c3545.m10811(), c3545.m10793(), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m42189(C3545 c3545) {
        return m42163(c3545, true, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InputStream m42198(C3545 c3545) {
        return m42163(c3545, false, false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream m42202(C3545 c3545) throws IOException {
        if (c3545.getSize() < 0) {
            throw new IOException("Unknown uncompressed size (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (c3545.m10793() < 0) {
            throw new IOException("Unknown compressed size (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return m42163(c3545, true, true);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InputStream m42163(C3545 c3545, boolean z, boolean z2) throws IOException {
        boolean z3;
        InputStream c12445;
        InputStream bufferedInputStream;
        C19502 c19502;
        InputStream c7506;
        ByteBuffer byteBufferOrder;
        long size;
        if (!z2 && c3545.getSize() == 0 && (!c3545.m10808() || !c3545.m10792() || c3545.m10767() != 0)) {
            return new C7778();
        }
        long jM10811 = c3545.m10811();
        int iM10767 = c3545.m10767();
        boolean zM10808 = c3545.m10808();
        if (zM10808 && c3545.m10785() == 99) {
            int iM10797 = c3545.m10797();
            if (iM10797 == 2) {
                z3 = false;
            } else {
                if (iM10797 != 1) {
                    StringBuilder sbM32308 = C13325.m32308(iM10797, "Unsupported AES version ", " (");
                    sbM32308.append(c3545.getName());
                    sbM32308.append(MotionUtils.EASING_TYPE_FORMAT_END);
                    throw new IOException(sbM32308.toString());
                }
                z3 = true;
            }
        } else {
            z3 = true;
        }
        if (zM10808) {
            C12445 c12446 = new C12445(this.f56328, jM10811, c3545.m10793(), z2);
            int iM10785 = c3545.m10785();
            if (iM10785 == 0) {
                c12445 = new C20207(this, c3545, c12446, this.f56326);
            } else {
                if (iM10785 != 99) {
                    throw new IOException("Unsupported encryption method " + c3545.m10785() + " (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                bufferedInputStream = new C19502(this, c3545, c12446, this.f56326);
                c19502 = bufferedInputStream;
            }
            if (iM10767 != 0) {
                if (iM10767 != 12) {
                    c7506 = new C7506(c3545, bufferedInputStream);
                } else if (iM10767 != 14) {
                    int i = C18612.f57719;
                    byte[] bArr = new byte[9];
                    C22194.m49857(bufferedInputStream, bArr, 9);
                    byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder.get();
                    byteBufferOrder.get();
                    if ((byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) == 5) {
                        throw new UnsupportedOperationException("ZipEntry LZMA should have size 5 in header: " + c3545.getName());
                    }
                    if ((c3545.m10796() & 2) != 0) {
                        size = -1;
                    } else {
                        size = c3545.getSize();
                    }
                    bufferedInputStream = new C18612(c3545, bufferedInputStream, size, byteBufferOrder.get(), byteBufferOrder.getInt());
                } else if (iM10767 != 36) {
                    c7506 = new C2384(c3545, bufferedInputStream);
                } else if (iM10767 != 93) {
                    c7506 = new C0266(c3545, bufferedInputStream);
                } else if (iM10767 != 95) {
                    c7506 = new C19318(c3545, bufferedInputStream);
                } else if (iM10767 != 8) {
                    c7506 = new C10851(c3545, bufferedInputStream, z2);
                } else {
                    if (iM10767 == 9) {
                        throw new IOException("Unsupported compression method " + c3545.m10767() + " (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    c7506 = new C16494(c3545, bufferedInputStream);
                }
                bufferedInputStream = c7506;
            }
            if (z && iM10767 != 0) {
                bufferedInputStream = new BufferedInputStream(bufferedInputStream, 65536);
            }
            if (z2) {
                return new C23028(c3545, bufferedInputStream, c19502, z3);
            }
            return (this.f56342 && z3) ? new C6095(c3545, bufferedInputStream) : bufferedInputStream;
        }
        c12445 = new C12445(this.f56328, jM10811, (iM10767 != 0 || z2) ? c3545.m10793() : c3545.getSize(), z2);
        bufferedInputStream = c12445;
        c19502 = 0;
        if (iM10767 != 0) {
            if (iM10767 != 12) {
                c7506 = new C7506(c3545, bufferedInputStream);
            } else if (iM10767 != 14) {
                int i2 = C18612.f57719;
                byte[] bArr2 = new byte[9];
                C22194.m49857(bufferedInputStream, bArr2, 9);
                byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.get();
                byteBufferOrder.get();
                if ((byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY) == 5) {
                    throw new UnsupportedOperationException("ZipEntry LZMA should have size 5 in header: " + c3545.getName());
                }
                if ((c3545.m10796() & 2) != 0) {
                    size = -1;
                } else {
                    size = c3545.getSize();
                }
                bufferedInputStream = new C18612(c3545, bufferedInputStream, size, byteBufferOrder.get(), byteBufferOrder.getInt());
            } else if (iM10767 != 36) {
                c7506 = new C2384(c3545, bufferedInputStream);
            } else if (iM10767 != 93) {
                c7506 = new C0266(c3545, bufferedInputStream);
            } else if (iM10767 != 95) {
                c7506 = new C19318(c3545, bufferedInputStream);
            } else if (iM10767 != 8) {
                c7506 = new C10851(c3545, bufferedInputStream, z2);
            } else {
                if (iM10767 == 9) {
                    throw new IOException("Unsupported compression method " + c3545.m10767() + " (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c7506 = new C16494(c3545, bufferedInputStream);
            }
            bufferedInputStream = c7506;
        }
        if (z) {
            bufferedInputStream = new BufferedInputStream(bufferedInputStream, 65536);
        }
        if (z2) {
            return new C23028(c3545, bufferedInputStream, c19502, z3);
        }
        if (this.f56342) {
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m42200(C3545 c3545) {
        if (c3545.getSize() > 20971520) {
            try {
                InputStream inputStreamM42163 = m42163(c3545, true, false);
                try {
                    byte[] bArrM1794 = C0349.m1794(c3545.getSize(), inputStreamM42163);
                    inputStreamM42163.close();
                    return bArrM1794;
                } catch (Throwable th) {
                    try {
                        inputStreamM42163.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Exception unused) {
                return m42193(c3545, (C19277) null);
            }
        }
        return m42193(c3545, (C19277) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m42193(C3545 c3545, C19277 c19277) throws IOException {
        int size = (int) c3545.getSize();
        byte[] bArr = new byte[size];
        int i = 0;
        InputStream inputStreamM42163 = m42163(c3545, true, false);
        while (i < size) {
            try {
                int i2 = inputStreamM42163.read(bArr, i, size - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
                if (c19277 != null) {
                    c19277.m44460(i2);
                }
            } catch (Throwable th) {
                try {
                    inputStreamM42163.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i != size || inputStreamM42163.read() != -1) {
            throw new IOException("The length of data has been read is incorrect. (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        inputStreamM42163.close();
        return bArr;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18090 m42204(C3545 c3545) throws IOException {
        if (c3545.m10767() != 0) {
            throw new IOException("Entry is not stored: " + c3545.getName());
        }
        return new C18090(this.f56328.mo21176(c3545.m10811(), c3545.m10793()), null, true, null, null);
    }

    public final String getName() {
        InterfaceC7889 interfaceC7889 = this.f56328;
        if (interfaceC7889 == null) {
            return null;
        }
        return interfaceC7889.getName();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m42190(boolean z) throws IOException {
        String strM42179 = m42179(1);
        C3545 entry = getEntry(strM42179);
        if (entry == null) {
            if (z) {
                return Collections.EMPTY_LIST;
            }
            StringBuilder sbM9834 = C3200.m9834("Entry not found: ", strM42179, "\n(");
            sbM9834.append(this.f56328.getName());
            sbM9834.append(MotionUtils.EASING_TYPE_FORMAT_END);
            throw new IOException(sbM9834.toString());
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (entry != null) {
            arrayList.add(entry);
            i++;
            entry = getEntry(m42179(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42179(int i) {
        if (i > 0) {
            return i == 1 ? "classes.dex" : C18307.m42645(i, "classes", ".dex");
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C11035 m42183() throws IOException {
        long j;
        String str;
        String str2;
        long j2;
        String str3;
        boolean z;
        int i;
        long jM42178;
        long jM42179;
        long j3;
        int i2;
        long j4;
        int iM42186;
        C11035 c11035;
        long j5;
        String str4;
        C11035 c11035M42164;
        String str5;
        long length = this.f56328.length();
        long jMax = Math.max(0L, length - 65557);
        C11035 c11036 = null;
        long j6 = length - 22;
        String str6 = null;
        String str7 = null;
        while (true) {
            boolean z2 = this.f56327;
            if (j6 < jMax) {
                String str8 = str6;
                String str9 = str7;
                if (c11036 == null) {
                    return null;
                }
                if (z2) {
                    throw new IOException(str9);
                }
                m42181(str9);
                this.f56329 = str8;
                return c11036;
            }
            m42180(j6);
            if (m42177() != 101010256) {
                j6--;
            } else if (j6 > 20) {
                try {
                    m42180(j6 - 20);
                    if (m42177() == 117853008) {
                        int iM42177 = m42177();
                        long jM42182 = m42182();
                        int iM42178 = m42177();
                        if (z2 && (iM42177 != 0 || iM42178 != 1)) {
                            throw new IOException("Split ZIP archives are not supported");
                        }
                        j = jM42182;
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
                        m42180(j7);
                        if (z) {
                            m42184(16L);
                            j4 = -1;
                            jM42179 = -1;
                            j3 = -1;
                            jM42178 = -1;
                            i2 = -1;
                            i = -1;
                        } else {
                            int iM42187 = m42186();
                            int iM42188 = m42186();
                            long jM42186 = m42186();
                            long jM42187 = m42186();
                            i = iM42188;
                            jM42178 = m42178();
                            jM42179 = m42178();
                            j3 = jM42187;
                            i2 = iM42187;
                            j4 = jM42186;
                        }
                        iM42186 = m42186();
                        c11035 = new C11035(i2, i, j4, jM42179, j3, jM42178, j6, iM42186, false);
                        j5 = j6 + 22 + ((long) iM42186);
                        if (iM42186 > 0 || j5 > length) {
                            str4 = null;
                        } else {
                            str4 = new String(m42175(iM42186), StandardCharsets.UTF_8);
                        }
                        if (j != -1) {
                            str = str3;
                            long j8 = j;
                            str2 = str7;
                            j2 = j6;
                            try {
                                c11035M42164 = m42164(j8, iM42186, j6);
                            } catch (IOException unused) {
                                str6 = str;
                                j6 = j2 - 1;
                                str7 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str7;
                            j2 = j6;
                            c11035M42164 = c11035;
                        }
                        if (j5 == length) {
                            this.f56329 = str4;
                            return c11035M42164;
                        }
                        if (c11036 == null) {
                            if (j5 > length) {
                                str5 = "ZIP end of central directory comment is truncated";
                            } else {
                                str5 = "ZIP end of central directory does not terminate the archive";
                            }
                            str7 = str5;
                            c11036 = c11035M42164;
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
                m42180(j9);
                if (z) {
                    m42184(16L);
                    j4 = -1;
                    jM42179 = -1;
                    j3 = -1;
                    jM42178 = -1;
                    i2 = -1;
                    i = -1;
                } else {
                    int iM42189 = m42186();
                    int iM421810 = m42186();
                    long jM42188 = m42186();
                    long jM42189 = m42186();
                    i = iM421810;
                    jM42178 = m42178();
                    jM42179 = m42178();
                    j3 = jM42189;
                    i2 = iM42189;
                    j4 = jM42188;
                }
                iM42186 = m42186();
                c11035 = new C11035(i2, i, j4, jM42179, j3, jM42178, j6, iM42186, false);
                j5 = j6 + 22 + ((long) iM42186);
                if (iM42186 > 0) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                if (j != -1) {
                    str = str3;
                    long j10 = j;
                    str2 = str7;
                    j2 = j6;
                    c11035M42164 = m42164(j10, iM42186, j6);
                } else {
                    str = str3;
                    str2 = str7;
                    j2 = j6;
                    c11035M42164 = c11035;
                }
                if (j5 == length) {
                    this.f56329 = str4;
                    return c11035M42164;
                }
                if (c11036 == null) {
                    if (j5 > length) {
                        str5 = "ZIP end of central directory comment is truncated";
                    } else {
                        str5 = "ZIP end of central directory does not terminate the archive";
                    }
                    str7 = str5;
                    c11036 = c11035M42164;
                    str6 = str4;
                } else {
                    str7 = str2;
                    str6 = str;
                }
                j6 = j2 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42180(long j) {
        this.f56328.seek(j);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m42184(long j) throws IOException {
        if (j < 0) {
            throw new IOException(C16014.m37865(j, "Skip "));
        }
        long filePointer = this.f56328.getFilePointer() + j;
        if (filePointer > this.f56328.length()) {
            throw new EOFException();
        }
        this.f56328.seek(filePointer);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m42175(int i) {
        byte[] bArr = new byte[i];
        this.f56328.readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private int m42177() throws EOFException {
        int i = this.f56328.read();
        int i2 = this.f56328.read();
        int i3 = this.f56328.read();
        int i4 = this.f56328.read();
        if ((i | i2 | i3 | i4) >= 0) {
            return i | (i2 << 8) | (i3 << 16) | (i4 << 24);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private int m42186() throws EOFException {
        int i = this.f56328.read();
        int i2 = this.f56328.read();
        if ((i | i2) >= 0) {
            return i | (i2 << 8);
        }
        throw new EOFException();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private long m42178() {
        return ((long) m42177()) & 4294967295L;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private long m42182() {
        return m42178() | (m42178() << 32);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m42191();
        if (this.f56331) {
            return;
        }
        this.f56328.close();
        this.f56331 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42191() {
        List list = this.f56334;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22194.m49850((C18090) it.next());
        }
        list.clear();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 m42214() {
        return this.f56328;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14561 m42196() {
        return new C14561(this);
    }
}
