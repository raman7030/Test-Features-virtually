package p067l;

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
public final class C23106 extends AbstractC2988 {

    /* JADX INFO: renamed from: ۗ */
    public long f72606;

    /* JADX INFO: renamed from: ۙ */
    public int f72607;

    /* JADX INFO: renamed from: ۛ */
    public int f72608;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC24446 f72609;

    /* JADX INFO: renamed from: ۤ */
    public boolean f72610;

    /* JADX INFO: renamed from: ۨ */
    public final byte[] f72611;

    /* JADX INFO: renamed from: ۫ */
    public long f72612;

    /* JADX INFO: renamed from: ۬ */
    public String f72613;

    /* JADX INFO: renamed from: ܰ */
    public long f72614;

    /* JADX INFO: renamed from: ᩺ */
    public final int f72615;

    public C23106(OutputStream outputStream) {
        super(outputStream);
        this.f72608 = 0;
        this.f72607 = 0;
        ((FilterOutputStream) this).out = new C16084(new C9359(outputStream));
        int i = C10721.f29698;
        Charset.defaultCharset().name();
        this.f72609 = AbstractC15728.m35783((String) null);
        this.f72611 = new byte[512];
        this.f72615 = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51532(HashMap map, String str, C6673 c6673) {
        if (c6673 != null) {
            C6398 instant = c6673.toInstant();
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if (nano == 0) {
                map.put(str, String.valueOf(epochSecond));
            } else {
                m51530(map, str, epochSecond, nano);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51530(HashMap map, String str, long j, int i) {
        map.put(str, BigDecimal.valueOf(j).add(BigDecimal.valueOf(i).movePointLeft(9).setScale(7, RoundingMode.DOWN)).toPlainString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51531(HashMap map, String str, long j, long j2) {
        if (j < 0 || j > j2) {
            map.put(str, String.valueOf(j));
        }
    }

    @Override // p067l.AbstractC2988, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            if (!m5005()) {
                finish();
            }
        } finally {
            if (!isClosed()) {
                super.close();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m51538() throws IOException {
        m5004();
        if (!this.f72610) {
            throw new IOException("No current entry to close");
        }
        ((C16084) ((FilterOutputStream) this).out).m36592();
        long j = this.f72606;
        long j2 = this.f72612;
        if (j < j2) {
            StringBuilder sb = new StringBuilder("Entry '");
            sb.append(this.f72613);
            sb.append("' closed at '");
            sb.append(this.f72606);
            sb.append("' before the '");
            throw new IOException(C17520.m39893(sb, this.f72612, "' bytes specified in the header were written"));
        }
        long j3 = (j2 / 512) + this.f72614;
        this.f72614 = j3;
        if (0 != j2 % 512) {
            this.f72614 = j3 + 1;
        }
        this.f72610 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51529(String str, long j, long j2) {
        m51528(j, j2, str, "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51528(long j, long j2, String str, String str2) {
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(str + " '" + j + "' is too big ( > " + j2 + " )." + str2);
        }
    }

    @Override // p067l.AbstractC2988
    public final void finish() throws IOException {
        m5004();
        if (this.f72610) {
            throw new IOException("This archive contains unclosed entries.");
        }
        byte[] bArr = this.f72611;
        Arrays.fill(bArr, (byte) 0);
        m51535(bArr);
        Arrays.fill(bArr, (byte) 0);
        m51535(bArr);
        long j = this.f72614;
        int i = this.f72615;
        long j2 = j % ((long) i);
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        if (i2 != 0) {
            while (i2 < i) {
                Arrays.fill(bArr, (byte) 0);
                m51535(bArr);
                i2++;
            }
        }
        ((FilterOutputStream) this).out.flush();
        super.finish();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m51534(C3659 c3659, String str, HashMap map, String str2, byte b, String str3) throws IOException {
        byte[] bArrMo31184 = this.f72609.mo31184(str);
        int length = bArrMo31184.length;
        if (length >= 100) {
            int i = this.f72608;
            if (i == 3) {
                map.put(str2, str);
                return true;
            }
            if (i == 2) {
                C3659 c36510 = new C3659(b, "././@LongLink");
                c36510.m6989(((long) length) + 1);
                m51533(c3659, c36510);
                m51536(c36510);
                write(bArrMo31184, 0, length);
                write(0);
                m51538();
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
    /* JADX INFO: renamed from: ֫ */
    public final void m51536(C3659 c3659) throws IOException {
        String str;
        HashMap map;
        boolean z;
        int length;
        StringBuilder sb;
        int i;
        String string;
        char cCharAt;
        m5004();
        boolean zM6993 = c3659.m6993();
        InterfaceC24446 interfaceC24446 = this.f72609;
        byte[] bArr = this.f72611;
        if (zM6993) {
            Map mapM6999 = c3659.m6999();
            final StringWriter stringWriter = new StringWriter();
            C15525.forEach(mapM6999, new BiConsumer() { // from class: l.ܶ᩷֡
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C19355.$default$andThen(this, biConsumer);
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
            c3659.m6989(bytes.length);
            c3659.m6976(bArr, interfaceC24446, this.f72607 == 1);
            m51535(bArr);
            this.f72612 = c3659.m6967();
            this.f72606 = 0L;
            this.f72610 = true;
            write(bytes);
            m51538();
            return;
        }
        HashMap map2 = new HashMap();
        String strM6979 = c3659.m6979();
        m51534(c3659, strM6979, map2, MotionUtils.EASING_TYPE_PATH, (byte) 76, "file name");
        String strM7005 = c3659.m7005();
        if (strM7005 != null && !strM7005.isEmpty()) {
            m51534(c3659, strM7005, map2, "linkpath", (byte) 75, "link name");
        }
        int i2 = this.f72607;
        if (i2 == 2) {
            str = strM6979;
            map = map2;
            m51531(map2, "size", c3659.m6967(), 8589934591L);
            m51531(map, "gid", c3659.m6986(), 2097151L);
            C6673 c6673M6983 = c3659.m6983();
            if (c6673M6983 != null) {
                C6398 instant = c6673M6983.toInstant();
                long epochSecond = instant.getEpochSecond();
                int nano = instant.getNano();
                if (nano == 0) {
                    m51531(map, "mtime", epochSecond, 8589934591L);
                } else {
                    m51530(map, "mtime", epochSecond, nano);
                }
            }
            m51532(map, "atime", c3659.m7009());
            if (c3659.m6968() != null) {
                m51532(map, "ctime", c3659.m6968());
            } else {
                m51532(map, "ctime", c3659.m6969());
            }
            m51531(map, DhizukuVariables.PARAM_CLIENT_UID, c3659.m6985(), 2097151L);
            m51532(map, "LIBARCHIVE.creationtime", c3659.m6969());
            m51531(map, "SCHILY.devmajor", c3659.m6997(), 2097151L);
            m51531(map, "SCHILY.devminor", c3659.m7000(), 2097151L);
            m51529("mode", c3659.m6977(), 2097151L);
        } else {
            str = strM6979;
            map = map2;
            if (i2 != 1) {
                m51529("entry size", c3659.m6967(), 8589934591L);
                m51528(c3659.m6986(), 2097151L, "group id", " Use STAR or POSIX extensions to overcome this limit");
                C6673 c6673M6984 = c3659.m6983();
                int i3 = C8709.f23607;
                int i4 = C19438.f59188;
                m51529("last modification time", c6673M6984 != null ? c6673M6984.m15191to(TimeUnit.SECONDS) : 0L, 8589934591L);
                m51529("user id", c3659.m6985(), 2097151L);
                m51529("mode", c3659.m6977(), 2097151L);
                m51529("major device number", c3659.m6997(), 2097151L);
                m51529("minor device number", c3659.m7000(), 2097151L);
            }
            map.putAll(c3659.m6999());
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
                C3659 c36510 = new C3659((byte) 120, string);
                m51533(c3659, c36510);
                final StringWriter stringWriter2 = new StringWriter();
                C15525.forEach(map, new BiConsumer() { // from class: l.ܶ᩷֡
                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C19355.$default$andThen(this, biConsumer);
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
                c36510.m6989(bytes2.length);
                m51536(c36510);
                write(bytes2);
                m51538();
            }
            if (this.f72607 == 1) {
                z = true;
            } else {
                z = false;
            }
            c3659.m6976(bArr, interfaceC24446, z);
            m51535(bArr);
            this.f72606 = 0L;
            if (c3659.m7006()) {
                this.f72612 = 0L;
            } else {
                this.f72612 = c3659.m6967();
            }
            this.f72613 = str;
            this.f72610 = true;
        }
        map.putAll(c3659.m6999());
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
            C3659 c36511 = new C3659((byte) 120, string);
            m51533(c3659, c36511);
            final StringWriter stringWriter3 = new StringWriter();
            C15525.forEach(map, new BiConsumer() { // from class: l.ܶ᩷֡
                public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return C19355.$default$andThen(this, biConsumer);
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
            c36511.m6989(bytes3.length);
            m51536(c36511);
            write(bytes3);
            m51538();
        }
        if (this.f72607 == 1) {
            z = true;
        } else {
            z = false;
        }
        c3659.m6976(bArr, interfaceC24446, z);
        m51535(bArr);
        this.f72606 = 0L;
        if (c3659.m7006()) {
            this.f72612 = 0L;
        } else {
            this.f72612 = c3659.m6967();
        }
        this.f72613 = str;
        this.f72610 = true;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m51537() {
        this.f72607 = 1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m51539() {
        this.f72608 = 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51533(C3659 c3659, C3659 c36510) {
        C6673 c6673M6983 = c3659.m6983();
        int i = C8709.f23607;
        int i2 = C19438.f59188;
        long j = 0;
        long jM15191to = c6673M6983 != null ? c6673M6983.m15191to(TimeUnit.SECONDS) : 0L;
        if (jM15191to >= 0 && jM15191to <= 8589934591L) {
            j = jM15191to;
        }
        c36510.m6975(C6673.from(j, TimeUnit.SECONDS));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f72610) {
            throw new IllegalStateException("No current tar entry");
        }
        long j = i2;
        if (this.f72606 + j <= this.f72612) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            this.f72606 += j;
        } else {
            StringBuilder sbM34408 = C15033.m34408(i2, "Request to write '", "' bytes exceeds size in header of '");
            sbM34408.append(this.f72612);
            sbM34408.append("' bytes for entry '");
            throw new IOException(C10965.m25286(sbM34408, this.f72613, "'"));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m51535(byte[] bArr) throws IOException {
        if (bArr.length != 512) {
            throw new IOException(C5410.m11876(bArr.length, "' which is not the record size of '512'", new StringBuilder("Record to write has length '")));
        }
        ((FilterOutputStream) this).out.write(bArr);
        this.f72614++;
    }
}
