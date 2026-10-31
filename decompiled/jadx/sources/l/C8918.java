package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.Deflater;
import net.sf.sevenzipjbinding.SevenZip;

/* JADX INFO: renamed from: l.ۡܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8918 implements Closeable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public OutputStream f27104;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f27105;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f27106;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f27107;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f27108;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f27109;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f27110;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9304 f27111;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Charset f27112;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C9190 f27113;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f27114;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final long f27115;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f27116;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C11740 f27117;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10329 f27118;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f27119;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f27120;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f27121;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m23027() {
        this.f27112 = StandardCharsets.UTF_8;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m23006(C9190 c9190) throws IOException {
        byte[] bArrM22155;
        boolean z = c9190.f27834 || c9190.f27841;
        byte[] bArr = c9190.f27848;
        byte[] bArr2 = c9190.f27844;
        if (z) {
            byte[] bArr3 = new byte[24];
            C2568.m8116(c9190.f27846, 0, bArr3);
            C2568.m8116(c9190.f27845, 8, bArr3);
            C2568.m8116(c9190.f27837, 16, bArr3);
            bArrM22155 = C8484.m22153(1, c9190.f27847, bArr3);
        } else {
            bArrM22155 = C8484.m22155(1, c9190.f27847);
        }
        m22999(33639248);
        int i = 45;
        int i2 = (c9190.f27834 || c9190.f27841) ? 45 : 20;
        C23411 c23411 = this.f27120;
        c23411.write(i2 & 255);
        c23411.write(c9190.f27850 & 255);
        if (!c9190.f27834 && !c9190.f27841) {
            i = (c9190.f27842 == 0 && (1 & c9190.f27838) == 0) ? 10 : 20;
        }
        m23004(i);
        m23004(c9190.f27838);
        m23004(c9190.f27842);
        m22999(c9190.f27833);
        m22999(c9190.f27829);
        if (z) {
            m23005(4294967295L);
            m23005(4294967295L);
        } else {
            m23005(c9190.f27845);
            m23005(c9190.f27846);
        }
        m23004(bArr2.length);
        m23004(bArrM22155.length);
        m23004(bArr.length);
        m23004(c9190.f27828);
        m23004(c9190.f27849);
        m22999(c9190.f27839);
        if (z) {
            m23005(4294967295L);
        } else {
            m23005(c9190.f27837);
        }
        m23001(bArr2);
        m23001(bArrM22155);
        m23001(bArr);
    }

    public C8918(String str) {
        this(C16999.m39866(str, new String[0]), -1L, null);
    }

    public C8918(AbstractC15440 abstractC15440) {
        this(abstractC15440, -1L, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8918 m22989(AbstractC15440 abstractC15440) {
        C23411 c23411M36513 = abstractC15440.m36513("rw");
        try {
            if (c23411M36513.length() != 0) {
                throw new IOException("ZIP output file must be empty");
            }
            return new C8918(abstractC15440, c23411M36513);
        } catch (IOException | RuntimeException e) {
            try {
                c23411M36513.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C8918(AbstractC15440 abstractC15440, C23411 c23411) {
        this.f27107 = new ArrayList();
        this.f27108 = 8;
        this.f27114 = -1;
        this.f27112 = StandardCharsets.UTF_8;
        this.f27111 = new C9304();
        this.f27105 = new byte[8192];
        this.f27109 = abstractC15440;
        this.f27120 = c23411;
        this.f27115 = -1L;
        this.f27116 = C15972.m37750(abstractC15440.getName().toLowerCase(Locale.ROOT));
    }

    public C8918(AbstractC15440 abstractC15440, long j, final C4627 c4627) throws IOException {
        this.f27107 = new ArrayList();
        this.f27108 = 8;
        this.f27114 = -1;
        this.f27112 = StandardCharsets.UTF_8;
        this.f27111 = new C9304();
        this.f27105 = new byte[8192];
        this.f27109 = abstractC15440;
        if (abstractC15440.mo23120()) {
            abstractC15440.mo23552();
        }
        if (j <= 0) {
            this.f27120 = abstractC15440.m36513("rw");
            this.f27115 = -1L;
        } else {
            if (j < 61440 || j > 4294967295L) {
                throw new IOException("Zip split segment size should between 64K and 4,294,967,295");
            }
            final C18683 c18683 = new C18683();
            final AbstractC15440 abstractC15440M36514 = abstractC15440.m36514();
            final String strM7878 = C2439.m7878(abstractC15440.getName());
            this.f27120 = C0127.m1200(C19885.m45716(abstractC15440.getName(), j, new InterfaceC22001() { // from class: l.ۜܰۡ
                @Override // l.InterfaceC22001
                /* JADX INFO: renamed from: ۧ */
                public final InterfaceC2245 mo17661(int i) {
                    return C8918.m22988(this.f21096, abstractC15440M36514, strM7878, c18683, c4627, i);
                }
            }));
            this.f27115 = j;
            m22999(134695760);
        }
        this.f27116 = C15972.m37750(abstractC15440.getName().toLowerCase());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC2245 m22988(C8918 c8918, AbstractC15440 abstractC15440, String str, C18683 c18683, InterfaceC13041 interfaceC13041, int i) {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(String.format(Locale.ENGLISH, "%s.z%02d", str, Integer.valueOf(i + 1)));
        InterfaceC2245 interfaceC2245Mo23557 = abstractC15440M36526.mo23557("rw");
        if (c18683.add(i)) {
            interfaceC2245Mo23557.setLength(0L);
            if (interfaceC13041 != null) {
                interfaceC13041.accept(abstractC15440M36526);
            }
            c8918.f27121 = abstractC15440M36526;
        }
        return interfaceC2245Mo23557;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m23017() {
        this.f27116 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23018(int i) {
        this.f27108 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m23022() {
        return this.f27108;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23009(int i) {
        this.f27114 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23026(String str) {
        this.f27110 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23019(String str) {
        this.f27106 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23025() {
        this.f27116 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23016(C18090 c18090) {
        if (this.f27115 != -1) {
            throw new UnsupportedOperationException("ApkSigBlockPairsData is not supported in split mode");
        }
        this.f27119 = c18090.m42199();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23021(byte[] bArr) {
        if (this.f27115 != -1) {
            throw new UnsupportedOperationException("ApkSigBlockPairsData is not supported in split mode");
        }
        this.f27119 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23012(String str) {
        m22997(new C9190(str, this.f27112));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23013(C3545 c3545) {
        m22997(new C9190(c3545, this.f27112));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m22997(C9190 c9190) throws IOException {
        OutputStream c1678;
        if (this.f27113 != null) {
            m23023();
        }
        long j = this.f27115;
        C23411 c23411 = this.f27120;
        if (j != -1) {
            c9190.f27828 = m22993();
            c9190.f27837 = m22994();
            c9190.f27830 = c23411.getFilePointer();
        } else {
            long filePointer = c23411.getFilePointer();
            c9190.f27830 = filePointer;
            c9190.f27837 = filePointer;
        }
        this.f27107.add(c9190);
        boolean z = c9190.f27840;
        boolean z2 = c9190.f27827;
        int i = 0;
        if (z) {
            c9190.f27842 = 0;
            if (z2) {
                c9190.f27838 = 2048;
            }
            m23002(c9190);
            c9190.f27835 = c23411.getFilePointer();
            return;
        }
        this.f27113 = c9190;
        String str = this.f27110;
        boolean z3 = (str == null || str.isEmpty()) ? false : true;
        int i2 = this.f27108;
        C10329 c10329 = new C10329(c23411);
        this.f27118 = c10329;
        OutputStream outputStream = c10329;
        if (z3) {
            C5390 c5390 = new C5390(c10329, str, 3, false);
            int i3 = C8484.f25926;
            byte[] bArr = new byte[7];
            boolean z4 = C2568.f8121;
            C15972.m37757(0, 2, bArr);
            byte[] bytes = "AE".getBytes();
            if (bytes.length + 2 > 7) {
                throw new EOFException();
            }
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            bArr[4] = (byte) 3;
            C15972.m37757(5, i2, bArr);
            if (Arrays.equals(c9190.f27836, c9190.f27847)) {
                byte[] bArrM22153 = C8484.m22153(39169, c9190.f27836, bArr);
                c9190.f27847 = bArrM22153;
                c9190.f27836 = bArrM22153;
            } else {
                c9190.f27836 = C8484.m22153(39169, c9190.f27836, bArr);
                c9190.f27847 = C8484.m22153(39169, c9190.f27847, bArr);
            }
            i2 = 99;
            i = 1;
            outputStream = c5390;
        }
        if (z2) {
            i |= 2048;
        }
        c9190.f27838 = i;
        c9190.f27842 = i2;
        m23002(c9190);
        c9190.f27835 = c23411.getFilePointer();
        int i4 = this.f27108;
        OutputStream outputStreamM52885 = outputStream;
        if (i4 != 0) {
            if (i4 != 8) {
                if (i4 == 12) {
                    c1678 = new C15801(outputStream, 9);
                } else if (i4 == 36) {
                    c1678 = new C3795(outputStream);
                } else {
                    if (i4 != 95) {
                        throw new IOException(C19370.m44628(i2, "Unsupported compression method "));
                    }
                    outputStreamM52885 = C1096.m3766(outputStream, 6);
                }
                outputStreamM52885 = c1678;
            } else if (this.f27114 == 10) {
                try {
                    SevenZip.m52890();
                    outputStreamM52885 = SevenZip.m52885(outputStream);
                } catch (Exception e) {
                    throw new IOException(e);
                }
            } else {
                c1678 = new C1678(outputStream, new Deflater(this.f27114, true));
                outputStreamM52885 = c1678;
            }
        }
        this.f27117 = new C11740(outputStreamM52885);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23020(C3545 c3545) throws IOException {
        if (this.f27113 != null) {
            m23023();
        }
        C9190 c9190 = new C9190(c3545, this.f27112);
        if (c3545.m10808()) {
            c9190.f27838 |= 1;
            if (c3545.m10785() == 0 && (c3545.m10796() & 8) == 8) {
                c9190.f27838 |= 8;
                c9190.f27831 = true;
                this.f27113 = c9190;
            } else if (c3545.m10785() == 99) {
                c9190.f27842 = 99;
            }
        }
        if (c9190.f27827) {
            c9190.f27838 |= 2048;
        }
        long j = this.f27115;
        C23411 c23411 = this.f27120;
        if (j != -1) {
            c9190.f27828 = m22993();
            c9190.f27837 = m22994();
            c9190.f27830 = c23411.getFilePointer();
        } else {
            long filePointer = c23411.getFilePointer();
            c9190.f27830 = filePointer;
            c9190.f27837 = filePointer;
        }
        c9190.f27832 = c3545.m10781();
        this.f27107.add(c9190);
        m23002(c9190);
        c9190.f27835 = c23411.getFilePointer();
        if (c3545.m10781()) {
            this.f27111.mo23890(c3545.m10811(), c9190);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23010(int i, byte[] bArr) {
        this.f27120.write(bArr, 0, i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m23024(C3545 c3545) {
        if (this.f27115 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        if (!c3545.m10790()) {
            return false;
        }
        C3545 c3545M10779 = c3545.m10779();
        C9190 c9190 = (C9190) this.f27111.mo7450(c3545M10779.m10811());
        if (c9190 == null) {
            return false;
        }
        C9190 c9191 = new C9190(c3545, this.f27112);
        m23000(c9191);
        c9191.f27838 = c3545.m10796();
        long jM10777 = (c3545.m10777() - c3545M10779.m10811()) + c9190.f27835;
        c9191.f27830 = jM10777;
        c9191.f27837 = jM10777;
        c9191.f27835 = (c3545.m10811() - c3545M10779.m10811()) + c9190.f27835;
        this.f27107.add(c9191);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23014(C3545 c3545, C18090 c18090) {
        if (m23024(c3545)) {
            return;
        }
        m23020(c3545);
        if (c3545.isDirectory()) {
            return;
        }
        C12445 c12445M42206 = c18090.m42206(c3545);
        while (true) {
            byte[] bArr = this.f27105;
            int i = c12445M42206.read(bArr);
            if (i == -1) {
                return;
            } else {
                m23010(i, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23015(C3545 c3545, C18090 c18090, InterfaceC1393 interfaceC1393) throws IOException {
        if (interfaceC1393 == null) {
            m23014(c3545, c18090);
            return;
        }
        if (m23024(c3545)) {
            interfaceC1393.mo1647(c3545.m10793(), c3545.m10793(), c3545.m10793());
            return;
        }
        m23020(c3545);
        if (c3545.isDirectory()) {
            return;
        }
        long jM10793 = c3545.m10793();
        C12445 c12445M42206 = c18090.m42206(c3545);
        long j = 0;
        while (true) {
            byte[] bArr = this.f27105;
            int i = c12445M42206.read(bArr);
            if (i == -1 || interfaceC1393.mo1526()) {
                return;
            }
            m23010(i, bArr);
            long j2 = i;
            long j3 = j + j2;
            interfaceC1393.mo1647(j2, j3, jM10793);
            j = j3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9624 m23008(C18090 c18090, String str) throws IOException {
        if (this.f27115 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        if (str.endsWith("/") || str.endsWith("\\")) {
            throw new IOException("Invalid host entry name: ".concat(str));
        }
        int i = this.f27108;
        String str2 = this.f27110;
        this.f27108 = 0;
        this.f27110 = null;
        C9190 c9190 = new C9190(str, this.f27112);
        c9190.f27832 = true;
        m22997(c9190);
        this.f27108 = i;
        this.f27110 = str2;
        return new C9624(c18090, this);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m23002(C9190 c9190) throws IOException {
        int i;
        byte[] bArrM22155;
        m23000(c9190);
        byte[] bArr = c9190.f27844;
        m22999(67324752);
        if (c9190.f27834 || c9190.f27841) {
            i = 45;
        } else {
            i = (c9190.f27842 == 0 && (c9190.f27838 & 1) == 0) ? 10 : 20;
        }
        m23004(i);
        m23004(c9190.f27838);
        m23004(c9190.f27842);
        m22999(c9190.f27833);
        m22999(c9190.f27829);
        if (c9190.f27834) {
            m23005(4294967295L);
            m23005(4294967295L);
        } else {
            m23005(c9190.f27845);
            m23005(c9190.f27846);
        }
        m23004(bArr.length);
        if (c9190.f27834) {
            byte[] bArr2 = new byte[16];
            C2568.m8116(c9190.f27846, 0, bArr2);
            C2568.m8116(c9190.f27845, 8, bArr2);
            bArrM22155 = C8484.m22153(1, c9190.f27836, bArr2);
        } else {
            bArrM22155 = C8484.m22155(1, c9190.f27836);
        }
        if (this.f27116 && c9190.f27842 == 0) {
            int i2 = (c9190.f27832 || new String(bArr, StandardCharsets.UTF_8).endsWith(".so")) ? 16384 : 4;
            long filePointer = this.f27120.getFilePointer() + 2 + ((long) bArr.length);
            long j = i2;
            if ((((long) bArrM22155.length) + filePointer) % j != 0) {
                byte[] bArrM22154 = C8484.m22154(bArrM22155);
                int length = (int) ((filePointer + ((long) bArrM22154.length)) % j);
                bArrM22155 = Arrays.copyOf(bArrM22154, bArrM22154.length + (length != 0 ? i2 - length : 0));
            }
        }
        m23004(bArrM22155.length);
        m23001(bArr);
        m23001(bArrM22155);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m23000(C9190 c9190) {
        long j = c9190.f27846;
        if ((j >= 4026531840L && c9190.f27845 == -1) || j >= 4294967295L || c9190.f27845 >= 4294967295L) {
            c9190.f27834 = true;
        }
        if (c9190.f27837 >= 4294967295L) {
            c9190.f27841 = true;
        }
        if (j == -1) {
            c9190.f27846 = 0L;
        }
        if (c9190.f27845 == -1) {
            c9190.f27845 = 0L;
        }
    }

    public final void write(int i) throws IOException {
        this.f27117.write(i);
    }

    public final void write(byte[] bArr) {
        this.f27117.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f27117.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23011(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OutputStream m23007() {
        OutputStream outputStream = this.f27104;
        if (outputStream != null) {
            return outputStream;
        }
        C20913 c20913 = new C20913(this);
        this.f27104 = c20913;
        return c20913;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b9  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23023() throws IOException {
        C9190 c9190 = this.f27113;
        if (c9190 == null) {
            return;
        }
        if (c9190.f27831) {
            if ((c9190.f27838 & 8) == 8) {
                m22999(134695760);
                m22999(this.f27113.f27829);
                C9190 c9191 = this.f27113;
                if (c9191.f27834) {
                    m22996(c9191.f27846);
                    m22996(this.f27113.f27845);
                } else {
                    m23005(c9191.f27845);
                    m23005(this.f27113.f27846);
                }
            }
            this.f27113 = null;
            return;
        }
        this.f27117.close();
        this.f27113.f27829 = this.f27117.m28739();
        this.f27113.f27845 = this.f27118.m26115();
        this.f27113.f27846 = this.f27117.m28738();
        C23411 c23411 = this.f27120;
        long filePointer = c23411.getFilePointer();
        c23411.seek(this.f27113.f27830 + 14);
        m22999(this.f27113.f27829);
        C9190 c9192 = this.f27113;
        if (!c9192.f27834) {
            long j = c9192.f27845;
            if (j >= 4294967295L || c9192.f27846 >= 4294967295L) {
                throw new IOException("Zip entry size needs zip64: name=" + new String(this.f27113.f27844) + ", compressedSize=" + this.f27113.f27845 + ", size=" + this.f27113.f27846);
            }
            m23005(j);
            m23005(this.f27113.f27846);
        } else if (c9192.f27846 < 4294967295L) {
            long j2 = c9192.f27845;
            if (j2 < 4294967295L) {
                c9192.f27834 = false;
                m23005(j2);
                m23005(this.f27113.f27846);
                c23411.skipBytes(this.f27113.f27844.length + 4);
                m23004(0);
                m23004(16);
                m22996(0L);
                m22996(0L);
            } else {
                m23005(4294967295L);
                m23005(4294967295L);
                c23411.skipBytes(this.f27113.f27844.length + 4);
                c23411.skipBytes(4);
                m22996(this.f27113.f27846);
                m22996(this.f27113.f27845);
            }
        } else {
            m23005(4294967295L);
            m23005(4294967295L);
            c23411.skipBytes(this.f27113.f27844.length + 4);
            c23411.skipBytes(4);
            m22996(this.f27113.f27846);
            m22996(this.f27113.f27845);
        }
        c23411.seek(filePointer);
        this.f27117 = null;
        this.f27118 = null;
        this.f27113 = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        byte[] bArr;
        ArrayList arrayList = this.f27107;
        C23411 c23411 = this.f27120;
        if (c23411.isClosed()) {
            return;
        }
        if (this.f27113 != null) {
            m23023();
        }
        byte[] bArr2 = this.f27119;
        if (bArr2 != null) {
            int filePointer = (int) (c23411.getFilePointer() % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (filePointer != 0) {
                m23001(new byte[4096 - filePointer]);
            }
            int length = bArr2.length + 32;
            int i = length % 4096;
            if (i != 0) {
                int i2 = 4096 - i;
                if (i2 < 12) {
                    i2 = 8192 - i;
                }
                bArr = new byte[i2];
                C15972.m37748(i2 - 8, 0, bArr);
                C15972.m37746(8, 1114793335, bArr);
                length += i2;
            } else {
                bArr = null;
            }
            long j2 = ((long) length) - 8;
            m22996(j2);
            m23001(bArr2);
            if (bArr != null) {
                m23001(bArr);
            }
            m22996(j2);
            m22996(2334950737559900225L);
            m22996(3617552046287187010L);
        }
        try {
            Collections.sort(arrayList);
            long j3 = this.f27115;
            if (j3 == -1) {
                long filePointer2 = c23411.getFilePointer();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m23006((C9190) it.next());
                }
                m22991(0L, 0L, c23411.getFilePointer() - filePointer2, filePointer2);
                c23411.close();
                return;
            }
            long jM22994 = m22994();
            long jM22993 = m22993();
            long filePointer3 = c23411.getFilePointer();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m23006((C9190) it2.next());
            }
            long filePointer4 = c23411.getFilePointer() - filePointer3;
            long j4 = 1 + jM22993;
            int i3 = ((j4 >= 65535 || jM22993 >= 65535 || arrayList.size() >= 65535 || filePointer4 > 4294967295L || jM22994 > 4294967295L) ? 76 : 0) + 22;
            String str = this.f27106;
            if (m22994() + ((long) (i3 + (str == null ? C5659.f17466 : str.getBytes(this.f27112)).length)) > j3) {
                c23411.flush();
                ((C19885) c23411.mo21173()).m45722();
                j = j4;
            } else {
                j = jM22993;
            }
            m22991(j, jM22993, filePointer4, jM22994);
            c23411.close();
            AbstractC15440 abstractC15440 = this.f27121;
            C11003.requireNonNull(abstractC15440);
            abstractC15440.mo23551(this.f27109);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22991(long j, long j2, long j3, long j4) throws IOException {
        boolean z;
        ArrayList arrayList = this.f27107;
        boolean z2 = j >= 65535 || j2 >= 65535 || arrayList.size() >= 65535 || j3 > 4294967295L || j4 > 4294967295L;
        if (z2) {
            m22999(101075792);
            z = z2;
            m22996(44L);
            m23004(20);
            m23004(20);
            m23005(j);
            m23005(j2);
            m22996(arrayList.size());
            m22996(arrayList.size());
            m22996(j3);
            m22996(j4);
            m22999(117853008);
            if (this.f27115 == -1) {
                m22999(0);
                m22996(j3 + j4);
                m22999(1);
            } else {
                boolean z3 = j != j2;
                m22999((int) j);
                m22996(z3 ? 0L : m22994() - 64);
                m22999((int) (1 + j));
            }
        } else {
            z = z2;
        }
        String str = this.f27106;
        byte[] bytes = str == null ? C5659.f17466 : str.getBytes(this.f27112);
        m22999(101010256);
        m23004((int) j);
        m23004((int) j2);
        if (z) {
            m23004(65535);
            m23004(65535);
            m23005(4294967295L);
            m23005(4294967295L);
        } else {
            m23004(arrayList.size());
            m23004(arrayList.size());
            m23005(j3);
            m23005(j4);
        }
        m23004(bytes.length);
        m23001(bytes);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m22993() {
        long j = this.f27115;
        if (j == -1) {
            throw new IllegalStateException();
        }
        long filePointer = this.f27120.getFilePointer() / j;
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private long m22994() {
        long j = this.f27115;
        if (j == -1) {
            throw new IllegalStateException();
        }
        return this.f27120.getFilePointer() % j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m23001(byte[] bArr) {
        if (bArr.length > 0) {
            C23411 c23411 = this.f27120;
            c23411.getClass();
            c23411.write(bArr, 0, bArr.length);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m23004(int i) {
        C23411 c23411 = this.f27120;
        c23411.write(i & 255);
        c23411.write((i >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m22999(int i) {
        C23411 c23411 = this.f27120;
        c23411.write(i & 255);
        c23411.write((i >>> 8) & 255);
        c23411.write((i >>> 16) & 255);
        c23411.write((i >>> 24) & 255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m22996(long j) {
        C23411 c23411 = this.f27120;
        c23411.write((int) (j & 255));
        c23411.write((int) ((j >>> 8) & 255));
        c23411.write((int) ((j >>> 16) & 255));
        c23411.write((int) ((j >>> 24) & 255));
        c23411.write((int) ((j >>> 32) & 255));
        c23411.write((int) ((j >>> 40) & 255));
        c23411.write((int) ((j >>> 48) & 255));
        c23411.write((int) ((j >>> 56) & 255));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m23005(long j) throws IOException {
        if (j < 0 || j > 4294967295L) {
            throw new IOException("Value out of unsigned int.");
        }
        C23411 c23411 = this.f27120;
        c23411.write((int) (j & 255));
        c23411.write((int) ((j >>> 8) & 255));
        c23411.write((int) ((j >>> 16) & 255));
        c23411.write((int) ((j >>> 24) & 255));
    }
}
