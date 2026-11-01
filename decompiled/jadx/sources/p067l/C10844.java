package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
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
import net.p069sf.sevenzipjbinding.SevenZip;

/* JADX INFO: renamed from: l.ۡܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10844 implements Closeable {

    /* JADX INFO: renamed from: ֫֫ */
    public OutputStream f30036;

    /* JADX INFO: renamed from: ۗ */
    public final byte[] f30037;

    /* JADX INFO: renamed from: ۙ */
    public String f30038;

    /* JADX INFO: renamed from: ۛ */
    public final ArrayList f30039;

    /* JADX INFO: renamed from: ۟ */
    public int f30040;

    /* JADX INFO: renamed from: ۤ */
    public final AbstractC17043 f30041;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f30042;

    /* JADX INFO: renamed from: ۨ */
    public C11211 f30043;

    /* JADX INFO: renamed from: ۫ */
    public Charset f30044;

    /* JADX INFO: renamed from: ۬ */
    public C11103 f30045;

    /* JADX INFO: renamed from: ܰ */
    public int f30046;

    /* JADX INFO: renamed from: ܽ֫ */
    public final long f30047;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f30048;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C13526 f30049;

    /* JADX INFO: renamed from: ᩶ */
    public C12185 f30050;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f30051;

    /* JADX INFO: renamed from: ᩹ */
    public final C24618 f30052;

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC17043 f30053;

    /* JADX INFO: renamed from: ᩻ */
    public final void m25001() {
        this.f30044 = StandardCharsets.UTF_8;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m24980(C11103 c11103) throws IOException {
        byte[] bArrM24124;
        boolean z = c11103.f30773 || c11103.f30780;
        byte[] bArr = c11103.f30787;
        byte[] bArr2 = c11103.f30783;
        if (z) {
            byte[] bArr3 = new byte[24];
            C4809.m10149(c11103.f30785, 0, bArr3);
            C4809.m10149(c11103.f30784, 8, bArr3);
            C4809.m10149(c11103.f30776, 16, bArr3);
            bArrM24124 = C10432.m24122(1, c11103.f30786, bArr3);
        } else {
            bArrM24124 = C10432.m24124(1, c11103.f30786);
        }
        m24973(33639248);
        int i = 45;
        int i2 = (c11103.f30773 || c11103.f30780) ? 45 : 20;
        C24618 c24618 = this.f30052;
        c24618.write(i2 & 255);
        c24618.write(c11103.f30789 & 255);
        if (!c11103.f30773 && !c11103.f30780) {
            i = (c11103.f30781 == 0 && (1 & c11103.f30777) == 0) ? 10 : 20;
        }
        m24978(i);
        m24978(c11103.f30777);
        m24978(c11103.f30781);
        m24973(c11103.f30772);
        m24973(c11103.f30768);
        if (z) {
            m24979(4294967295L);
            m24979(4294967295L);
        } else {
            m24979(c11103.f30784);
            m24979(c11103.f30785);
        }
        m24978(bArr2.length);
        m24978(bArrM24124.length);
        m24978(bArr.length);
        m24978(c11103.f30767);
        m24978(c11103.f30788);
        m24973(c11103.f30778);
        if (z) {
            m24979(4294967295L);
        } else {
            m24979(c11103.f30776);
        }
        m24975(bArr2);
        m24975(bArrM24124);
        m24975(bArr);
    }

    public C10844(String str) {
        this(C18524.m42109(str, new String[0]), -1L, null);
    }

    public C10844(AbstractC17043 abstractC17043) {
        this(abstractC17043, -1L, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10844 m24963(AbstractC17043 abstractC17043) {
        C24618 c24618M38671 = abstractC17043.m38671("rw");
        try {
            if (c24618M38671.length() != 0) {
                throw new IOException("ZIP output file must be empty");
            }
            return new C10844(abstractC17043, c24618M38671);
        } catch (IOException | RuntimeException e) {
            try {
                c24618M38671.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C10844(AbstractC17043 abstractC17043, C24618 c24618) {
        this.f30039 = new ArrayList();
        this.f30040 = 8;
        this.f30046 = -1;
        this.f30044 = StandardCharsets.UTF_8;
        this.f30043 = new C11211();
        this.f30037 = new byte[8192];
        this.f30041 = abstractC17043;
        this.f30052 = c24618;
        this.f30047 = -1L;
        this.f30048 = C17548.m39934(abstractC17043.getName().toLowerCase(Locale.ROOT));
    }

    public C10844(AbstractC17043 abstractC17043, long j, final C6766 c6766) throws IOException {
        this.f30039 = new ArrayList();
        this.f30040 = 8;
        this.f30046 = -1;
        this.f30044 = StandardCharsets.UTF_8;
        this.f30043 = new C11211();
        this.f30037 = new byte[8192];
        this.f30041 = abstractC17043;
        if (abstractC17043.mo25094()) {
            abstractC17043.mo25503();
        }
        if (j <= 0) {
            this.f30052 = abstractC17043.m38671("rw");
            this.f30047 = -1L;
        } else {
            if (j < 61440 || j > 4294967295L) {
                throw new IOException("Zip split segment size should between 64K and 4,294,967,295");
            }
            final C20125 c20125 = new C20125();
            final AbstractC17043 abstractC17043M38672 = abstractC17043.m38672();
            final String strM9926 = C4686.m9926(abstractC17043.getName());
            this.f30052 = C2489.m3601(C21267.m48027(abstractC17043.getName(), j, new InterfaceC23278() { // from class: l.ۜܰۡ
                @Override // p067l.InterfaceC23278
                /* JADX INFO: renamed from: ۧ */
                public final InterfaceC4502 mo19606(int i) {
                    return C10844.m24962(this.f23974, abstractC17043M38672, strM9926, c20125, c6766, i);
                }
            }));
            this.f30047 = j;
            m24973(134695760);
        }
        this.f30048 = C17548.m39934(abstractC17043.getName().toLowerCase());
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ InterfaceC4502 m24962(C10844 c10844, AbstractC17043 abstractC17043, String str, C20125 c20125, InterfaceC1489 interfaceC1489, int i) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(String.format(Locale.ENGLISH, "%s.z%02d", str, Integer.valueOf(i + 1)));
        InterfaceC4502 interfaceC4502Mo25508 = abstractC17043M38684.mo25508("rw");
        if (c20125.add(i)) {
            interfaceC4502Mo25508.setLength(0L);
            if (interfaceC1489 != null) {
                interfaceC1489.accept(abstractC17043M38684);
            }
            c10844.f30053 = abstractC17043M38684;
        }
        return interfaceC4502Mo25508;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m24991() {
        this.f30048 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24992(int i) {
        this.f30040 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m24996() {
        return this.f30040;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24983(int i) {
        this.f30046 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m25000(String str) {
        this.f30042 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24993(String str) {
        this.f30038 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m24999() {
        this.f30048 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24990(C19561 c19561) {
        if (this.f30047 != -1) {
            throw new UnsupportedOperationException("ApkSigBlockPairsData is not supported in split mode");
        }
        this.f30051 = c19561.m44458();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24995(byte[] bArr) {
        if (this.f30047 != -1) {
            throw new UnsupportedOperationException("ApkSigBlockPairsData is not supported in split mode");
        }
        this.f30051 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24986(String str) {
        m24971(new C11103(str, this.f30044));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24987(C5738 c5738) {
        m24971(new C11103(c5738, this.f30044));
    }

    /* JADX INFO: renamed from: ۧ */
    private void m24971(C11103 c11103) throws IOException {
        OutputStream c3963;
        if (this.f30045 != null) {
            m24997();
        }
        long j = this.f30047;
        C24618 c24618 = this.f30052;
        if (j != -1) {
            c11103.f30767 = m24967();
            c11103.f30776 = m24968();
            c11103.f30769 = c24618.getFilePointer();
        } else {
            long filePointer = c24618.getFilePointer();
            c11103.f30769 = filePointer;
            c11103.f30776 = filePointer;
        }
        this.f30039.add(c11103);
        boolean z = c11103.f30779;
        boolean z2 = c11103.f30766;
        int i = 0;
        if (z) {
            c11103.f30781 = 0;
            if (z2) {
                c11103.f30777 = 2048;
            }
            m24976(c11103);
            c11103.f30774 = c24618.getFilePointer();
            return;
        }
        this.f30045 = c11103;
        String str = this.f30042;
        boolean z3 = (str == null || str.isEmpty()) ? false : true;
        int i2 = this.f30040;
        C12185 c12185 = new C12185(c24618);
        this.f30050 = c12185;
        OutputStream outputStream = c12185;
        if (z3) {
            C7491 c7491 = new C7491(c12185, str, 3, false);
            int i3 = C10432.f28841;
            byte[] bArr = new byte[7];
            boolean z4 = C4809.f10911;
            C17548.m39941(0, 2, bArr);
            byte[] bytes = "AE".getBytes();
            if (bytes.length + 2 > 7) {
                throw new EOFException();
            }
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            bArr[4] = (byte) 3;
            C17548.m39941(5, i2, bArr);
            if (Arrays.equals(c11103.f30775, c11103.f30786)) {
                byte[] bArrM24122 = C10432.m24122(39169, c11103.f30775, bArr);
                c11103.f30786 = bArrM24122;
                c11103.f30775 = bArrM24122;
            } else {
                c11103.f30775 = C10432.m24122(39169, c11103.f30775, bArr);
                c11103.f30786 = C10432.m24122(39169, c11103.f30786, bArr);
            }
            i2 = 99;
            i = 1;
            outputStream = c7491;
        }
        if (z2) {
            i |= 2048;
        }
        c11103.f30777 = i;
        c11103.f30781 = i2;
        m24976(c11103);
        c11103.f30774 = c24618.getFilePointer();
        int i4 = this.f30040;
        OutputStream outputStreamM55291 = outputStream;
        if (i4 != 0) {
            if (i4 != 8) {
                if (i4 == 12) {
                    c3963 = new C17385(outputStream, 9);
                } else if (i4 == 36) {
                    c3963 = new C5975(outputStream);
                } else {
                    if (i4 != 95) {
                        throw new IOException(C20778.m46922(i2, "Unsupported compression method "));
                    }
                    outputStreamM55291 = C3410.m6039(outputStream, 6);
                }
                outputStreamM55291 = c3963;
            } else if (this.f30046 == 10) {
                try {
                    SevenZip.m55296();
                    outputStreamM55291 = SevenZip.m55291(outputStream);
                } catch (Exception e) {
                    throw new IOException(e);
                }
            } else {
                c3963 = new C3963(outputStream, new Deflater(this.f30046, true));
                outputStreamM55291 = c3963;
            }
        }
        this.f30049 = new C13526(outputStreamM55291);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24994(C5738 c5738) throws IOException {
        if (this.f30045 != null) {
            m24997();
        }
        C11103 c11103 = new C11103(c5738, this.f30044);
        if (c5738.m12789()) {
            c11103.f30777 |= 1;
            if (c5738.m12766() == 0 && (c5738.m12777() & 8) == 8) {
                c11103.f30777 |= 8;
                c11103.f30770 = true;
                this.f30045 = c11103;
            } else if (c5738.m12766() == 99) {
                c11103.f30781 = 99;
            }
        }
        if (c11103.f30766) {
            c11103.f30777 |= 2048;
        }
        long j = this.f30047;
        C24618 c24618 = this.f30052;
        if (j != -1) {
            c11103.f30767 = m24967();
            c11103.f30776 = m24968();
            c11103.f30769 = c24618.getFilePointer();
        } else {
            long filePointer = c24618.getFilePointer();
            c11103.f30769 = filePointer;
            c11103.f30776 = filePointer;
        }
        c11103.f30771 = c5738.m12762();
        this.f30039.add(c11103);
        m24976(c11103);
        c11103.f30774 = c24618.getFilePointer();
        if (c5738.m12762()) {
            this.f30043.mo25899(c5738.m12792(), c11103);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24984(int i, byte[] bArr) {
        this.f30052.write(bArr, 0, i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m24998(C5738 c5738) {
        if (this.f30047 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        if (!c5738.m12771()) {
            return false;
        }
        C5738 c5738M12760 = c5738.m12760();
        C11103 c11103 = (C11103) this.f30043.mo9532(c5738M12760.m12792());
        if (c11103 == null) {
            return false;
        }
        C11103 c11104 = new C11103(c5738, this.f30044);
        m24974(c11104);
        c11104.f30777 = c5738.m12777();
        long jM12758 = (c5738.m12758() - c5738M12760.m12792()) + c11103.f30774;
        c11104.f30769 = jM12758;
        c11104.f30776 = jM12758;
        c11104.f30774 = (c5738.m12792() - c5738M12760.m12792()) + c11103.f30774;
        this.f30039.add(c11104);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24988(C5738 c5738, C19561 c19561) {
        if (m24998(c5738)) {
            return;
        }
        m24994(c5738);
        if (c5738.isDirectory()) {
            return;
        }
        C14196 c14196M44465 = c19561.m44465(c5738);
        while (true) {
            byte[] bArr = this.f30037;
            int i = c14196M44465.read(bArr);
            if (i == -1) {
                return;
            } else {
                m24984(i, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24989(C5738 c5738, C19561 c19561, InterfaceC3693 interfaceC3693) throws IOException {
        if (interfaceC3693 == null) {
            m24988(c5738, c19561);
            return;
        }
        if (m24998(c5738)) {
            interfaceC3693.mo4047(c5738.m12774(), c5738.m12774(), c5738.m12774());
            return;
        }
        m24994(c5738);
        if (c5738.isDirectory()) {
            return;
        }
        long jM12774 = c5738.m12774();
        C14196 c14196M44465 = c19561.m44465(c5738);
        long j = 0;
        while (true) {
            byte[] bArr = this.f30037;
            int i = c14196M44465.read(bArr);
            if (i == -1 || interfaceC3693.mo3924()) {
                return;
            }
            m24984(i, bArr);
            long j2 = i;
            long j3 = j + j2;
            interfaceC3693.mo4047(j2, j3, jM12774);
            j = j3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11515 m24982(C19561 c19561, String str) throws IOException {
        if (this.f30047 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        if (str.endsWith("/") || str.endsWith("\\")) {
            throw new IOException("Invalid host entry name: ".concat(str));
        }
        int i = this.f30040;
        String str2 = this.f30042;
        this.f30040 = 0;
        this.f30042 = null;
        C11103 c11103 = new C11103(str, this.f30044);
        c11103.f30771 = true;
        m24971(c11103);
        this.f30040 = i;
        this.f30042 = str2;
        return new C11515(c19561, this);
    }

    /* JADX INFO: renamed from: ܿ */
    private void m24976(C11103 c11103) throws IOException {
        int i;
        byte[] bArrM24124;
        m24974(c11103);
        byte[] bArr = c11103.f30783;
        m24973(67324752);
        if (c11103.f30773 || c11103.f30780) {
            i = 45;
        } else {
            i = (c11103.f30781 == 0 && (c11103.f30777 & 1) == 0) ? 10 : 20;
        }
        m24978(i);
        m24978(c11103.f30777);
        m24978(c11103.f30781);
        m24973(c11103.f30772);
        m24973(c11103.f30768);
        if (c11103.f30773) {
            m24979(4294967295L);
            m24979(4294967295L);
        } else {
            m24979(c11103.f30784);
            m24979(c11103.f30785);
        }
        m24978(bArr.length);
        if (c11103.f30773) {
            byte[] bArr2 = new byte[16];
            C4809.m10149(c11103.f30785, 0, bArr2);
            C4809.m10149(c11103.f30784, 8, bArr2);
            bArrM24124 = C10432.m24122(1, c11103.f30775, bArr2);
        } else {
            bArrM24124 = C10432.m24124(1, c11103.f30775);
        }
        if (this.f30048 && c11103.f30781 == 0) {
            int i2 = (c11103.f30771 || new String(bArr, StandardCharsets.UTF_8).endsWith(".so")) ? 16384 : 4;
            long filePointer = this.f30052.getFilePointer() + 2 + ((long) bArr.length);
            long j = i2;
            if ((((long) bArrM24124.length) + filePointer) % j != 0) {
                byte[] bArrM24123 = C10432.m24123(bArrM24124);
                int length = (int) ((filePointer + ((long) bArrM24123.length)) % j);
                bArrM24124 = Arrays.copyOf(bArrM24123, bArrM24123.length + (length != 0 ? i2 - length : 0));
            }
        }
        m24978(bArrM24124.length);
        m24975(bArr);
        m24975(bArrM24124);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m24974(C11103 c11103) {
        long j = c11103.f30785;
        if ((j >= 4026531840L && c11103.f30784 == -1) || j >= 4294967295L || c11103.f30784 >= 4294967295L) {
            c11103.f30773 = true;
        }
        if (c11103.f30776 >= 4294967295L) {
            c11103.f30780 = true;
        }
        if (j == -1) {
            c11103.f30785 = 0L;
        }
        if (c11103.f30784 == -1) {
            c11103.f30784 = 0L;
        }
    }

    public final void write(int i) throws IOException {
        this.f30049.write(i);
    }

    public final void write(byte[] bArr) {
        this.f30049.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f30049.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24985(InputStream inputStream) throws IOException {
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

    /* JADX INFO: renamed from: ֫ */
    public final OutputStream m24981() {
        OutputStream outputStream = this.f30036;
        if (outputStream != null) {
            return outputStream;
        }
        C22244 c22244 = new C22244(this);
        this.f30036 = c22244;
        return c22244;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b9  */
    /* JADX INFO: renamed from: ܽ */
    public final void m24997() throws IOException {
        C11103 c11103 = this.f30045;
        if (c11103 == null) {
            return;
        }
        if (c11103.f30770) {
            if ((c11103.f30777 & 8) == 8) {
                m24973(134695760);
                m24973(this.f30045.f30768);
                C11103 c11104 = this.f30045;
                if (c11104.f30773) {
                    m24970(c11104.f30785);
                    m24970(this.f30045.f30784);
                } else {
                    m24979(c11104.f30784);
                    m24979(this.f30045.f30785);
                }
            }
            this.f30045 = null;
            return;
        }
        this.f30049.close();
        this.f30045.f30768 = this.f30049.m30787();
        this.f30045.f30784 = this.f30050.m28140();
        this.f30045.f30785 = this.f30049.m30786();
        C24618 c24618 = this.f30052;
        long filePointer = c24618.getFilePointer();
        c24618.seek(this.f30045.f30769 + 14);
        m24973(this.f30045.f30768);
        C11103 c11105 = this.f30045;
        if (!c11105.f30773) {
            long j = c11105.f30784;
            if (j >= 4294967295L || c11105.f30785 >= 4294967295L) {
                throw new IOException("Zip entry size needs zip64: name=" + new String(this.f30045.f30783) + ", compressedSize=" + this.f30045.f30784 + ", size=" + this.f30045.f30785);
            }
            m24979(j);
            m24979(this.f30045.f30785);
        } else if (c11105.f30785 < 4294967295L) {
            long j2 = c11105.f30784;
            if (j2 < 4294967295L) {
                c11105.f30773 = false;
                m24979(j2);
                m24979(this.f30045.f30785);
                c24618.skipBytes(this.f30045.f30783.length + 4);
                m24978(0);
                m24978(16);
                m24970(0L);
                m24970(0L);
            } else {
                m24979(4294967295L);
                m24979(4294967295L);
                c24618.skipBytes(this.f30045.f30783.length + 4);
                c24618.skipBytes(4);
                m24970(this.f30045.f30785);
                m24970(this.f30045.f30784);
            }
        } else {
            m24979(4294967295L);
            m24979(4294967295L);
            c24618.skipBytes(this.f30045.f30783.length + 4);
            c24618.skipBytes(4);
            m24970(this.f30045.f30785);
            m24970(this.f30045.f30784);
        }
        c24618.seek(filePointer);
        this.f30049 = null;
        this.f30050 = null;
        this.f30045 = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        byte[] bArr;
        ArrayList arrayList = this.f30039;
        C24618 c24618 = this.f30052;
        if (c24618.isClosed()) {
            return;
        }
        if (this.f30045 != null) {
            m24997();
        }
        byte[] bArr2 = this.f30051;
        if (bArr2 != null) {
            int filePointer = (int) (c24618.getFilePointer() % ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF);
            if (filePointer != 0) {
                m24975(new byte[4096 - filePointer]);
            }
            int length = bArr2.length + 32;
            int i = length % 4096;
            if (i != 0) {
                int i2 = 4096 - i;
                if (i2 < 12) {
                    i2 = 8192 - i;
                }
                bArr = new byte[i2];
                C17548.m39932(i2 - 8, 0, bArr);
                C17548.m39930(8, 1114793335, bArr);
                length += i2;
            } else {
                bArr = null;
            }
            long j2 = ((long) length) - 8;
            m24970(j2);
            m24975(bArr2);
            if (bArr != null) {
                m24975(bArr);
            }
            m24970(j2);
            m24970(2334950737559900225L);
            m24970(3617552046287187010L);
        }
        try {
            Collections.sort(arrayList);
            long j3 = this.f30047;
            if (j3 == -1) {
                long filePointer2 = c24618.getFilePointer();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m24980((C11103) it.next());
                }
                m24965(0L, 0L, c24618.getFilePointer() - filePointer2, filePointer2);
                c24618.close();
                return;
            }
            long jM24968 = m24968();
            long jM24967 = m24967();
            long filePointer3 = c24618.getFilePointer();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m24980((C11103) it2.next());
            }
            long filePointer4 = c24618.getFilePointer() - filePointer3;
            long j4 = 1 + jM24967;
            int i3 = ((j4 >= 65535 || jM24967 >= 65535 || arrayList.size() >= 65535 || filePointer4 > 4294967295L || jM24968 > 4294967295L) ? 76 : 0) + 22;
            String str = this.f30038;
            if (m24968() + ((long) (i3 + (str == null ? C7747.f20313 : str.getBytes(this.f30044)).length)) > j3) {
                c24618.flush();
                ((C21267) c24618.mo23138()).m48033();
                j = j4;
            } else {
                j = jM24967;
            }
            m24965(j, jM24967, filePointer4, jM24968);
            c24618.close();
            AbstractC17043 abstractC17043 = this.f30053;
            C12826.requireNonNull(abstractC17043);
            abstractC17043.mo25502(this.f30041);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24965(long j, long j2, long j3, long j4) throws IOException {
        boolean z;
        ArrayList arrayList = this.f30039;
        boolean z2 = j >= 65535 || j2 >= 65535 || arrayList.size() >= 65535 || j3 > 4294967295L || j4 > 4294967295L;
        if (z2) {
            m24973(101075792);
            z = z2;
            m24970(44L);
            m24978(20);
            m24978(20);
            m24979(j);
            m24979(j2);
            m24970(arrayList.size());
            m24970(arrayList.size());
            m24970(j3);
            m24970(j4);
            m24973(117853008);
            if (this.f30047 == -1) {
                m24973(0);
                m24970(j3 + j4);
                m24973(1);
            } else {
                boolean z3 = j != j2;
                m24973((int) j);
                m24970(z3 ? 0L : m24968() - 64);
                m24973((int) (1 + j));
            }
        } else {
            z = z2;
        }
        String str = this.f30038;
        byte[] bytes = str == null ? C7747.f20313 : str.getBytes(this.f30044);
        m24973(101010256);
        m24978((int) j);
        m24978((int) j2);
        if (z) {
            m24978(65535);
            m24978(65535);
            m24979(4294967295L);
            m24979(4294967295L);
        } else {
            m24978(arrayList.size());
            m24978(arrayList.size());
            m24979(j3);
            m24979(j4);
        }
        m24978(bytes.length);
        m24975(bytes);
    }

    /* JADX INFO: renamed from: ۖ */
    private int m24967() {
        long j = this.f30047;
        if (j == -1) {
            throw new IllegalStateException();
        }
        long filePointer = this.f30052.getFilePointer() / j;
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ۘ */
    private long m24968() {
        long j = this.f30047;
        if (j == -1) {
            throw new IllegalStateException();
        }
        return this.f30052.getFilePointer() % j;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m24975(byte[] bArr) {
        if (bArr.length > 0) {
            C24618 c24618 = this.f30052;
            c24618.getClass();
            c24618.write(bArr, 0, bArr.length);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m24978(int i) {
        C24618 c24618 = this.f30052;
        c24618.write(i & 255);
        c24618.write((i >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m24973(int i) {
        C24618 c24618 = this.f30052;
        c24618.write(i & 255);
        c24618.write((i >>> 8) & 255);
        c24618.write((i >>> 16) & 255);
        c24618.write((i >>> 24) & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m24970(long j) {
        C24618 c24618 = this.f30052;
        c24618.write((int) (j & 255));
        c24618.write((int) ((j >>> 8) & 255));
        c24618.write((int) ((j >>> 16) & 255));
        c24618.write((int) ((j >>> 24) & 255));
        c24618.write((int) ((j >>> 32) & 255));
        c24618.write((int) ((j >>> 40) & 255));
        c24618.write((int) ((j >>> 48) & 255));
        c24618.write((int) ((j >>> 56) & 255));
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m24979(long j) throws IOException {
        if (j < 0 || j > 4294967295L) {
            throw new IOException("Value out of unsigned int.");
        }
        C24618 c24618 = this.f30052;
        c24618.write((int) (j & 255));
        c24618.write((int) ((j >>> 8) & 255));
        c24618.write((int) ((j >>> 16) & 255));
        c24618.write((int) ((j >>> 24) & 255));
    }
}
