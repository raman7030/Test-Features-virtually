package l;

import com.google.android.material.motion.MotionUtils;
import com.rosan.dhizuku.shared.DhizukuVariables;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.᩸᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: RAH2 */
/* JADX INFO: loaded from: classes.dex */
public final class C21820 extends AbstractC0652 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f69897;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69898;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f69899;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC23230 f69900;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f69901;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f69902;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f69903;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f69904;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f69905;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f69906;

    public C21820(OutputStream outputStream) {
        super(outputStream);
        this.f69899 = 0;
        this.f69898 = 0;
        ((FilterOutputStream) this).out = new C14432(new C7356(outputStream));
        int i = C8789.f26773;
        Charset.defaultCharset().name();
        this.f69900 = AbstractC14057.m33658((String) null);
        this.f69902 = new byte[512];
        this.f69906 = 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49181(HashMap map, String str, C4529 c4529) {
        if (c4529 != null) {
            C4239 instant = c4529.toInstant();
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if (nano == 0) {
                map.put(str, String.valueOf(epochSecond));
            } else {
                m49179(map, str, epochSecond, nano);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49179(HashMap map, String str, long j, int i) {
        map.put(str, BigDecimal.valueOf(j).add(BigDecimal.valueOf(i).movePointLeft(9).setScale(7, RoundingMode.DOWN)).toPlainString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49180(HashMap map, String str, long j, long j2) {
        if (j < 0 || j > j2) {
            map.put(str, String.valueOf(j));
        }
    }

    @Override // l.AbstractC0652, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            if (!m2665()) {
                finish();
            }
        } finally {
            if (!isClosed()) {
                super.close();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49187() throws IOException {
        m2664();
        if (!this.f69901) {
            throw new IOException("No current entry to close");
        }
        ((C14432) ((FilterOutputStream) this).out).m34459();
        long j = this.f69897;
        long j2 = this.f69903;
        if (j < j2) {
            StringBuilder sb = new StringBuilder("Entry '");
            sb.append(this.f69904);
            sb.append("' closed at '");
            sb.append(this.f69897);
            sb.append("' before the '");
            throw new IOException(C15942.m37718(sb, this.f69903, "' bytes specified in the header were written"));
        }
        long j3 = (j2 / 512) + this.f69905;
        this.f69905 = j3;
        if (0 != j2 % 512) {
            this.f69905 = j3 + 1;
        }
        this.f69901 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49178(String str, long j, long j2) {
        m49177(j, j2, str, "");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49177(long j, long j2, String str, String str2) {
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(str + " '" + j + "' is too big ( > " + j2 + " )." + str2);
        }
    }

    @Override // l.AbstractC0652
    public final void finish() throws IOException {
        m2664();
        if (this.f69901) {
            throw new IOException("This archive contains unclosed entries.");
        }
        byte[] bArr = this.f69902;
        Arrays.fill(bArr, (byte) 0);
        m49184(bArr);
        Arrays.fill(bArr, (byte) 0);
        m49184(bArr);
        long j = this.f69905;
        int i = this.f69906;
        long j2 = j % ((long) i);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        if (i2 != 0) {
            while (i2 < i) {
                Arrays.fill(bArr, (byte) 0);
                m49184(bArr);
                i2++;
            }
        }
        ((FilterOutputStream) this).out.flush();
        super.finish();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m49183(C1358 c1358, String str, HashMap map, String str2, byte b, String str3) throws IOException {
        byte[] bArrMo29130 = this.f69900.mo29130(str);
        int length = bArrMo29130.length;
        if (length >= 100) {
            int i = this.f69899;
            if (i == 3) {
                map.put(str2, str);
                return true;
            }
            if (i == 2) {
                C1358 c1359 = new C1358(b, "././@LongLink");
                c1359.m4751(((long) length) + 1);
                m49182(c1358, c1359);
                m49185(c1359);
                write(bArrMo29130, 0, length);
                write(0);
                m49187();
                return false;
            }
            if (i != 1) {
                throw new IllegalArgumentException(str3 + " '" + str + "' is too long ( > 100 bytes)");
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x01be  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0228  */
    /* JADX WARN: Code duplicated, block: B:58:0x022d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0230  */
    /* JADX WARN: Code duplicated, block: B:62:0x0242  */
    /* JADX WARN: Code duplicated, block: B:63:0x0245  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49185(C1358 c1358) throws IOException {
        String str;
        HashMap map;
        boolean z;
        int length;
        StringBuilder sb;
        int i;
        String string;
        char cCharAt;
        m2664();
        boolean zM4755 = c1358.m4755();
        InterfaceC23230 interfaceC23230 = this.f69900;
        byte[] bArr = this.f69902;
        if (zM4755) {
            Map mapM4761 = c1358.m4761();
            final StringWriter stringWriter = new StringWriter();
            C13843.forEach(mapM4761, new BiConsumer() { // from class: l.ܶ᩷֡
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C17873.$default$andThen(this, biConsumer);
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str2 = (String) obj;
                    String str3 = (String) obj2;
                    int length2 = str3.length() + str2.length() + 5;
                    String str4 = length2 + " " + str2 + "=" + str3 + "\n";
                    int length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                    while (length2 != length3) {
                        str4 = length3 + " " + str2 + "=" + str3 + "\n";
                        int i2 = length3;
                        length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                        length2 = i2;
                    }
                    stringWriter.write(str4);
                }
            });
            byte[] bytes = stringWriter.toString().getBytes(StandardCharsets.UTF_8);
            c1358.m4751(bytes.length);
            c1358.m4738(bArr, interfaceC23230, this.f69898 == 1);
            m49184(bArr);
            this.f69903 = c1358.m4729();
            this.f69897 = 0L;
            this.f69901 = true;
            write(bytes);
            m49187();
            return;
        }
        HashMap map2 = new HashMap();
        String strM4741 = c1358.m4741();
        m49183(c1358, strM4741, map2, MotionUtils.EASING_TYPE_PATH, (byte) 76, "file name");
        String strM4767 = c1358.m4767();
        if (strM4767 != null && !strM4767.isEmpty()) {
            m49183(c1358, strM4767, map2, "linkpath", (byte) 75, "link name");
        }
        int i2 = this.f69898;
        if (i2 == 2) {
            str = strM4741;
            map = map2;
            m49180(map2, "size", c1358.m4729(), 8589934591L);
            m49180(map, "gid", c1358.m4748(), 2097151L);
            C4529 c4529M4745 = c1358.m4745();
            if (c4529M4745 != null) {
                C4239 instant = c4529M4745.toInstant();
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (nano == 0) {
                    m49180(map, "mtime", epochSecond, 8589934591L);
                } else {
                    m49179(map, "mtime", epochSecond, nano);
                }
            }
            m49181(map, "atime", c1358.m4771());
            if (c1358.m4730() != null) {
                m49181(map, "ctime", c1358.m4730());
            } else {
                m49181(map, "ctime", c1358.m4731());
            }
            m49180(map, DhizukuVariables.PARAM_CLIENT_UID, c1358.m4747(), 2097151L);
            m49181(map, "LIBARCHIVE.creationtime", c1358.m4731());
            m49180(map, "SCHILY.devmajor", c1358.m4759(), 2097151L);
            m49180(map, "SCHILY.devminor", c1358.m4762(), 2097151L);
            m49178("mode", c1358.m4739(), 2097151L);
        } else {
            str = strM4741;
            map = map2;
            if (i2 != 1) {
                m49178("entry size", c1358.m4729(), 8589934591L);
                m49177(c1358.m4748(), 2097151L, "group id", " Use STAR or POSIX extensions to overcome this limit");
                C4529 c4529M4746 = c1358.m4745();
                int i3 = C6672.f20732;
                int i4 = C17961.f55991;
                m49178("last modification time", c4529M4746 != null ? c4529M4746.to(TimeUnit.SECONDS) : 0L, 8589934591L);
                m49178("user id", c1358.m4747(), 2097151L);
                m49178("mode", c1358.m4739(), 2097151L);
                m49178("major device number", c1358.m4759(), 2097151L);
                m49178("minor device number", c1358.m4762(), 2097151L);
            }
            map.putAll(c1358.m4761());
            if (!map.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("./PaxHeaders.X/");
                length = str.length();
                sb = new StringBuilder(length);
                for (i = 0; i < length; i++) {
                    cCharAt = (char) (str.charAt(i) & 127);
                    if (cCharAt != 0 || cCharAt == '/' || cCharAt == '\\') {
                        sb.append("_");
                    } else {
                        sb.append(cCharAt);
                    }
                }
                sb2.append(sb.toString());
                string = sb2.toString();
                if (string.length() >= 100) {
                    string = string.substring(0, 99);
                }
                C1358 c1359 = new C1358((byte) 120, string);
                m49182(c1358, c1359);
                final StringWriter stringWriter2 = new StringWriter();
                C13843.forEach(map, new BiConsumer() { // from class: l.ܶ᩷֡
                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C17873.$default$andThen(this, biConsumer);
                    }

                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        String str2 = (String) obj;
                        String str3 = (String) obj2;
                        int length2 = str3.length() + str2.length() + 5;
                        String str4 = length2 + " " + str2 + "=" + str3 + "\n";
                        int length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                        while (length2 != length3) {
                            str4 = length3 + " " + str2 + "=" + str3 + "\n";
                            int i5 = length3;
                            length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                            length2 = i5;
                        }
                        stringWriter2.write(str4);
                    }
                });
                byte[] bytes2 = stringWriter2.toString().getBytes(StandardCharsets.UTF_8);
                c1359.m4751(bytes2.length);
                m49185(c1359);
                write(bytes2);
                m49187();
            }
            if (this.f69898 == 1) {
                z = true;
            } else {
                z = false;
            }
            c1358.m4738(bArr, interfaceC23230, z);
            m49184(bArr);
            this.f69897 = 0L;
            if (c1358.m4768()) {
                this.f69903 = 0L;
            } else {
                this.f69903 = c1358.m4729();
            }
            this.f69904 = str;
            this.f69901 = true;
        }
        map.putAll(c1358.m4761());
        if (!map.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("./PaxHeaders.X/");
            length = str.length();
            sb = new StringBuilder(length);
            while (i < length) {
                cCharAt = (char) (str.charAt(i) & 127);
                if (cCharAt != 0) {
                    sb.append("_");
                } else {
                    sb.append("_");
                }
            }
            sb3.append(sb.toString());
            string = sb3.toString();
            if (string.length() >= 100) {
                string = string.substring(0, 99);
            }
            C1358 c13510 = new C1358((byte) 120, string);
            m49182(c1358, c13510);
            final StringWriter stringWriter3 = new StringWriter();
            C13843.forEach(map, new BiConsumer() { // from class: l.ܶ᩷֡
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C17873.$default$andThen(this, biConsumer);
                }

                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str2 = (String) obj;
                    String str3 = (String) obj2;
                    int length2 = str3.length() + str2.length() + 5;
                    String str4 = length2 + " " + str2 + "=" + str3 + "\n";
                    int length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                    while (length2 != length3) {
                        str4 = length3 + " " + str2 + "=" + str3 + "\n";
                        int i5 = length3;
                        length3 = str4.getBytes(StandardCharsets.UTF_8).length;
                        length2 = i5;
                    }
                    stringWriter3.write(str4);
                }
            });
            byte[] bytes3 = stringWriter3.toString().getBytes(StandardCharsets.UTF_8);
            c13510.m4751(bytes3.length);
            m49185(c13510);
            write(bytes3);
            m49187();
        }
        if (this.f69898 == 1) {
            z = true;
        } else {
            z = false;
        }
        c1358.m4738(bArr, interfaceC23230, z);
        m49184(bArr);
        this.f69897 = 0L;
        if (c1358.m4768()) {
            this.f69903 = 0L;
        } else {
            this.f69903 = c1358.m4729();
        }
        this.f69904 = str;
        this.f69901 = true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m49186() {
        this.f69898 = 1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49188() {
        this.f69899 = 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49182(C1358 c1358, C1358 c1359) {
        C4529 c4529M4745 = c1358.m4745();
        int i = C6672.f20732;
        int i2 = C17961.f55991;
        long j = 0;
        long j2 = c4529M4745 != null ? c4529M4745.to(TimeUnit.SECONDS) : 0L;
        if (j2 >= 0 && j2 <= 8589934591L) {
            j = j2;
        }
        c1359.m4737(C4529.from(j, TimeUnit.SECONDS));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f69901) {
            throw new IllegalStateException("No current tar entry");
        }
        long j = i2;
        if (this.f69897 + j <= this.f69903) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            this.f69897 += j;
        } else {
            StringBuilder sbM32308 = C13325.m32308(i2, "Request to write '", "' bytes exceeds size in header of '");
            sbM32308.append(this.f69903);
            sbM32308.append("' bytes for entry '");
            throw new IOException(C9045.m23341(sbM32308, this.f69904, "'"));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m49184(byte[] bArr) throws IOException {
        if (bArr.length != 512) {
            throw new IOException(C3200.m9831(bArr.length, "' which is not the record size of '512'", new StringBuilder("Record to write has length '")));
        }
        ((FilterOutputStream) this).out.write(bArr);
        this.f69905++;
    }
}
