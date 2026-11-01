package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ᩳۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7WW */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19442 {

    /* JADX INFO: renamed from: ܺ */
    public static final byte[] f59220;

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC24727 f59221;

    /* JADX INFO: renamed from: ۢ */
    public InterfaceC5005 f59224;

    /* JADX INFO: renamed from: ܿ */
    public C23780 f59228;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC5005 f59229;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC4019 f59231;

    /* JADX INFO: renamed from: ۡ */
    public int f59223 = 0;

    /* JADX INFO: renamed from: ۜ */
    public String f59222 = "no comment";

    /* JADX INFO: renamed from: ܽ */
    public boolean f59227 = false;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f59225 = null;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f59226 = null;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f59230 = null;

    /* JADX INFO: renamed from: ֫ */
    public static int m44215(int i) {
        int i2 = 1;
        if (i <= 127) {
            return 1;
        }
        while (i > 0) {
            i >>>= 8;
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13547() {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract byte[] mo9930(String str, byte[] bArr);

    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[Catch: all -> 0x012b, TryCatch #2 {, blocks: (B:4:0x0002, B:7:0x0007, B:10:0x002e, B:11:0x0032, B:13:0x0036, B:14:0x003c, B:18:0x0056, B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a, B:51:0x011f, B:9:0x0024), top: B:60:0x0002, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078 A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[Catch: Exception -> 0x011f, all -> 0x012b, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a A[Catch: Exception -> 0x011f, all -> 0x012b, TRY_LEAVE, TryCatch #0 {Exception -> 0x011f, blocks: (B:19:0x0059, B:22:0x005e, B:25:0x0064, B:26:0x006a, B:30:0x0079, B:29:0x0078, B:31:0x0089, B:34:0x0091, B:38:0x00a9, B:41:0x00af, B:42:0x00b5, B:43:0x00c8, B:46:0x00cf, B:49:0x010a), top: B:57:0x0059, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized byte[] m44228(byte[] bArr, byte[] bArr2) {
        int blockSize;
        byte[] bArr3;
        int blockSize2;
        int i;
        int i2;
        byte[] bArr4;
        int i3;
        int length;
        int length2;
        int length3;
        byte[] bArrMo3553 = null;
        if (this.f59221 == null) {
            try {
                this.f59221 = (InterfaceC24727) Class.forName(C21769.m49091("3des-cbc")).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception | LinkageError unused) {
                this.f59228.getClass();
                C21769.f68542.getClass();
            }
            this.f59221 = this.f59221;
            if (this.f59229 == null) {
                this.f59229 = m44226();
            }
            blockSize = this.f59221.getBlockSize();
            bArr3 = new byte[blockSize];
            blockSize2 = this.f59229.getBlockSize();
            int i4 = (blockSize / blockSize2) * blockSize2;
            if (blockSize % blockSize2 == 0) {
                i = 0;
            } else {
                i = blockSize2;
            }
            i2 = i4 + i;
            bArr4 = new byte[i2];
            try {
                i3 = this.f59223;
                if (i3 == 0) {
                    length2 = 0;
                    while (length2 + blockSize2 <= i2) {
                        if (bArrMo3553 != null) {
                            this.f59229.mo3552(bArrMo3553.length, bArrMo3553);
                        }
                        this.f59229.mo3552(bArr.length, bArr);
                        InterfaceC5005 interfaceC5005 = this.f59229;
                        length3 = 8;
                        if (bArr2.length > 8) {
                            length3 = bArr2.length;
                        }
                        interfaceC5005.mo3552(length3, bArr2);
                        bArrMo3553 = this.f59229.mo3553();
                        System.arraycopy(bArrMo3553, 0, bArr4, length2, bArrMo3553.length);
                        length2 += bArrMo3553.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
                } else if (i3 == 4) {
                    byte[] bArrMo8022 = this.f59231.mo8022(bArr2.length + blockSize, bArr);
                    System.arraycopy(bArrMo8022, 0, bArr3, 0, blockSize);
                    System.arraycopy(bArrMo8022, blockSize, bArr2, 0, bArr2.length);
                    C20764.m46890(bArrMo8022);
                } else if (i3 == 1) {
                    length = 0;
                    while (length + blockSize2 <= i2) {
                        if (bArrMo3553 != null) {
                            this.f59229.mo3552(bArrMo3553.length, bArrMo3553);
                        }
                        this.f59229.mo3552(bArr.length, bArr);
                        bArrMo3553 = this.f59229.mo3553();
                        System.arraycopy(bArrMo3553, 0, bArr4, length, bArrMo3553.length);
                        length += bArrMo3553.length;
                    }
                    System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
                } else if (i3 == 2) {
                    byte[] bArr5 = new byte[4];
                    this.f59224.mo3552(4, bArr5);
                    this.f59224.mo3552(bArr.length, bArr);
                    byte[] bArrMo3554 = this.f59224.mo3553();
                    System.arraycopy(bArrMo3554, 0, bArr3, 0, bArrMo3554.length);
                    C20764.m46890(bArrMo3554);
                    bArr5[3] = 1;
                    this.f59224.mo3552(4, bArr5);
                    this.f59224.mo3552(bArr.length, bArr);
                    byte[] bArrMo3555 = this.f59224.mo3553();
                    System.arraycopy(bArrMo3555, 0, bArr3, bArrMo3555.length, blockSize - bArrMo3555.length);
                    C20764.m46890(bArrMo3555);
                } else if (i3 == 5) {
                    byte[] bArrMo8023 = this.f59231.mo8022(bArr2.length + blockSize + 32, bArr);
                    System.arraycopy(bArrMo8023, 0, bArr3, 0, blockSize);
                    System.arraycopy(bArrMo8023, blockSize, bArr2, 0, bArr2.length);
                    C20764.m46890(bArrMo8023);
                }
            } catch (Exception unused2) {
                this.f59228.getClass();
                C21769.f68542.getClass();
            }
        } else {
            if (this.f59229 == null) {
                this.f59229 = m44226();
            }
            blockSize = this.f59221.getBlockSize();
            bArr3 = new byte[blockSize];
            blockSize2 = this.f59229.getBlockSize();
            int i5 = (blockSize / blockSize2) * blockSize2;
            if (blockSize % blockSize2 == 0) {
                i = 0;
            } else {
                i = blockSize2;
            }
            i2 = i5 + i;
            bArr4 = new byte[i2];
            i3 = this.f59223;
            if (i3 == 0) {
                length2 = 0;
                while (length2 + blockSize2 <= i2) {
                    if (bArrMo3553 != null) {
                        this.f59229.mo3552(bArrMo3553.length, bArrMo3553);
                    }
                    this.f59229.mo3552(bArr.length, bArr);
                    InterfaceC5005 interfaceC5006 = this.f59229;
                    length3 = 8;
                    if (bArr2.length > 8) {
                        length3 = bArr2.length;
                    }
                    interfaceC5006.mo3552(length3, bArr2);
                    bArrMo3553 = this.f59229.mo3553();
                    System.arraycopy(bArrMo3553, 0, bArr4, length2, bArrMo3553.length);
                    length2 += bArrMo3553.length;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
            } else if (i3 == 4) {
                byte[] bArrMo8024 = this.f59231.mo8022(bArr2.length + blockSize, bArr);
                System.arraycopy(bArrMo8024, 0, bArr3, 0, blockSize);
                System.arraycopy(bArrMo8024, blockSize, bArr2, 0, bArr2.length);
                C20764.m46890(bArrMo8024);
            } else if (i3 == 1) {
                length = 0;
                while (length + blockSize2 <= i2) {
                    if (bArrMo3553 != null) {
                        this.f59229.mo3552(bArrMo3553.length, bArrMo3553);
                    }
                    this.f59229.mo3552(bArr.length, bArr);
                    bArrMo3553 = this.f59229.mo3553();
                    System.arraycopy(bArrMo3553, 0, bArr4, length, bArrMo3553.length);
                    length += bArrMo3553.length;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, blockSize);
            } else if (i3 == 2) {
                byte[] bArr6 = new byte[4];
                this.f59224.mo3552(4, bArr6);
                this.f59224.mo3552(bArr.length, bArr);
                byte[] bArrMo3556 = this.f59224.mo3553();
                System.arraycopy(bArrMo3556, 0, bArr3, 0, bArrMo3556.length);
                C20764.m46890(bArrMo3556);
                bArr6[3] = 1;
                this.f59224.mo3552(4, bArr6);
                this.f59224.mo3552(bArr.length, bArr);
                byte[] bArrMo3557 = this.f59224.mo3553();
                System.arraycopy(bArrMo3557, 0, bArr3, bArrMo3557.length, blockSize - bArrMo3557.length);
                C20764.m46890(bArrMo3557);
            } else if (i3 == 5) {
                byte[] bArrMo8025 = this.f59231.mo8022(bArr2.length + blockSize + 32, bArr);
                System.arraycopy(bArrMo8025, 0, bArr3, 0, blockSize);
                System.arraycopy(bArrMo8025, blockSize, bArr2, 0, bArr2.length);
                C20764.m46890(bArrMo8025);
            }
        }
        throw th;
        return bArr3;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract byte[] mo9931();

    /* JADX INFO: renamed from: ۧ */
    public abstract byte[] mo9932(byte[] bArr);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo26346();

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo9933(byte[] bArr);

    /* JADX INFO: renamed from: ᩳ */
    public abstract byte[] mo9935();

    static {
        byte[] bArr = C20764.f65273;
        Charset charset = StandardCharsets.UTF_8;
        f59220 = "openssh-key-v1\u0000".getBytes(charset);
        C20764.m46893("\n");
        C20764.m46893("-----BEGIN OPENSSH PRIVATE KEY-----");
        C20764.m46893("-----END OPENSSH PRIVATE KEY-----");
        C20764.m46893("none");
        "Proc-Type: 4,ENCRYPTED".getBytes(charset);
        "DEK-Info: DES-EDE3-CBC,".getBytes(charset);
        C20764.m46893(" ");
    }

    public AbstractC19442(C23780 c23780) {
        this.f59228 = c23780;
    }

    /* JADX INFO: renamed from: ܿ */
    public byte[] mo9934() {
        return this.f59230;
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m44223(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] bArrM44228 = m44228(bArr2, bArr3);
            this.f59221.mo4571(1, bArrM44228, bArr3);
            C20764.m46890(bArrM44228);
            byte[] bArr4 = new byte[bArr.length - this.f59221.mo4574()];
            if (this.f59221.mo4576()) {
                this.f59221.mo4569(0);
                InterfaceC24727 interfaceC24727 = this.f59221;
                interfaceC24727.mo4575(-4, bArr, bArr.length - interfaceC24727.mo4574(), bArr4, 0);
                return bArr4;
            }
            if (this.f59221.mo4577()) {
                this.f59221.mo4575(0, bArr, bArr.length, bArr4, 0);
                return bArr4;
            }
            this.f59221.mo4570(0, bArr, bArr.length, bArr4, 0);
            return bArr4;
        } catch (Exception unused) {
            this.f59228.getClass();
            C21769.f68542.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m44216(int i, byte[] bArr, byte[] bArr2) {
        bArr[i] = 2;
        int iM44224 = m44224(i + 1, bArr2.length, bArr);
        System.arraycopy(bArr2, 0, bArr, iM44224, bArr2.length);
        return iM44224 + bArr2.length;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m44224(int i, int i2, byte[] bArr) {
        int iM44215 = m44215(i2) - 1;
        if (iM44215 == 0) {
            int i3 = i + 1;
            bArr[i] = (byte) i2;
            return i3;
        }
        int i4 = i + 1;
        bArr[i] = (byte) (iM44215 | 128);
        int i5 = i4 + iM44215;
        while (iM44215 > 0) {
            bArr[(i4 + iM44215) - 1] = (byte) (i2 & 255);
            i2 >>>= 8;
            iM44215--;
        }
        return i5;
    }

    /* JADX INFO: renamed from: ܳ */
    private InterfaceC5005 m44226() {
        try {
            InterfaceC5005 interfaceC5005 = (InterfaceC5005) Class.forName(C21769.m49091("md5")).asSubclass(InterfaceC5005.class).getDeclaredConstructor(null).newInstance(null);
            this.f59229 = interfaceC5005;
            interfaceC5005.init();
        } catch (Exception | LinkageError unused) {
            this.f59228.getClass();
            C21769.f68542.getClass();
        }
        return this.f59229;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo9929(byte[] bArr) {
        boolean z = this.f59227;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        byte[] bArrM44223 = null;
        try {
            bArrM44223 = m44223(this.f59225, bArr2, this.f59226);
            if (mo9933(bArrM44223)) {
                this.f59227 = false;
                C20764.m46890(this.f59225);
            }
            return !this.f59227;
        } finally {
            C20764.m46890(bArr2);
            C20764.m46890(bArrM44223);
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x01ee A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:158:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:165:0x020f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0217  */
    /* JADX WARN: Code duplicated, block: B:190:0x0285  */
    /* JADX WARN: Code duplicated, block: B:193:0x028b A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0302 A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:245:0x0375  */
    /* JADX WARN: Code duplicated, block: B:247:0x037a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0386 A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x03cd A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x03da  */
    /* JADX WARN: Code duplicated, block: B:280:0x03de A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:286:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:288:0x03f0 A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:293:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:296:0x0402 A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x040e A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, LOOP:15: B:294:0x03ff->B:302:0x040e, LOOP_END, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x0414 A[EDGE_INSN: B:305:0x0414->B:311:0x0430 BREAK  A[LOOP:1: B:77:0x00ed->B:309:0x041f, LOOP_LABEL: LOOP:1: B:77:0x00ed->B:309:0x041f]] */
    /* JADX WARN: Code duplicated, block: B:306:0x0417  */
    /* JADX WARN: Code duplicated, block: B:312:0x0432 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x0434  */
    /* JADX WARN: Code duplicated, block: B:346:0x048e A[Catch: LinkageError -> 0x0494, Exception | LinkageError -> 0x0496, TryCatch #12 {Exception | LinkageError -> 0x0496, blocks: (B:250:0x0380, B:252:0x0386, B:254:0x038e, B:256:0x0394, B:257:0x0397, B:259:0x039a, B:263:0x03a6, B:265:0x03ab, B:268:0x03ba, B:270:0x03bf, B:269:0x03bd, B:264:0x03a9, B:273:0x03cd, B:275:0x03d2, B:280:0x03de, B:282:0x03e3, B:284:0x03e7, B:315:0x0437, B:318:0x043e, B:319:0x0441, B:321:0x0444, B:323:0x0447, B:325:0x0450, B:328:0x0458, B:332:0x0463, B:334:0x046e, B:335:0x0472, B:339:0x047a, B:341:0x047f, B:344:0x0488, B:345:0x048d, B:346:0x048e, B:347:0x0493, B:288:0x03f0, B:290:0x03f5, B:292:0x03fb, B:294:0x03ff, B:296:0x0402, B:302:0x040e, B:307:0x0419), top: B:604:0x0380 }] */
    /* JADX WARN: Code duplicated, block: B:353:0x049b A[PHI: r2
      0x049b: PHI (r2v4 byte[] A[IMMUTABLE_TYPE]) = (r2v3 byte[]), (r2v9 byte[]) binds: [B:311:0x0430, B:342:0x0484] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:355:0x049e A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TRY_ENTER, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:361:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:362:0x04ab A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:375:0x04e9 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TRY_ENTER, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x04f1 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:378:0x0505 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:380:0x051d A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TRY_LEAVE, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:391:0x0555 A[Catch: LinkageError -> 0x04a3, Exception -> 0x06eb, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:453:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:456:0x05f9 A[Catch: LinkageError -> 0x04a3, Exception -> 0x06ed, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:511:0x0681 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:512:0x0683 A[Catch: LinkageError -> 0x04a3, Exception -> 0x06ed, TRY_ENTER, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:554:0x06e9 A[PHI: r16
      0x06e9: PHI (r16v8 ??) = (r16v6 ??), (r16v6 ??), (r16v6 ??), (r16v6 ??), (r16v10 ??) binds: [B:511:0x0681, B:513:0x0687, B:515:0x068d, B:517:0x0694, B:440:0x05cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:559:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:562:0x0700 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:563:0x0706  */
    /* JADX WARN: Code duplicated, block: B:565:0x0709 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:566:0x070f  */
    /* JADX WARN: Code duplicated, block: B:568:0x0712 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:569:0x0718  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:571:0x071b A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:572:0x0721  */
    /* JADX WARN: Code duplicated, block: B:574:0x0724 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:575:0x072a  */
    /* JADX WARN: Code duplicated, block: B:577:0x072d A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:578:0x0733  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:580:0x0736 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:582:0x0744 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:583:0x074c A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:585:0x0752 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:586:0x0756 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:342:0x0484, B:355:0x049e, B:362:0x04ab, B:364:0x04ae, B:366:0x04b5, B:368:0x04bb, B:370:0x04c0, B:372:0x04c7, B:375:0x04e9, B:377:0x04f1, B:378:0x0505, B:379:0x051c, B:380:0x051d, B:389:0x054f, B:391:0x0555, B:393:0x055c, B:395:0x0560, B:397:0x0564, B:400:0x056a, B:402:0x056f, B:404:0x0575, B:409:0x057d, B:411:0x0583, B:412:0x0586, B:414:0x0589, B:427:0x05a9, B:433:0x05b2, B:435:0x05b8, B:439:0x05c9, B:441:0x05ce, B:562:0x0700, B:580:0x0736, B:582:0x0744, B:583:0x074c, B:585:0x0752, B:586:0x0756, B:587:0x075b, B:565:0x0709, B:568:0x0712, B:571:0x071b, B:574:0x0724, B:577:0x072d, B:446:0x05da, B:557:0x06ee, B:454:0x05ef, B:456:0x05f9, B:458:0x05fd, B:460:0x0603, B:463:0x060c, B:465:0x0610, B:472:0x0621, B:476:0x062b, B:481:0x0635, B:484:0x063a, B:485:0x063d, B:489:0x0644, B:492:0x0649, B:493:0x064c, B:500:0x0660, B:503:0x0667, B:505:0x066c, B:507:0x0674, B:509:0x0678, B:512:0x0683, B:514:0x0689, B:516:0x068f, B:519:0x0698, B:524:0x06a0, B:527:0x06a5, B:528:0x06a8, B:532:0x06af, B:535:0x06b4, B:536:0x06b7, B:543:0x06cb, B:546:0x06d2, B:548:0x06d7, B:550:0x06df, B:552:0x06e3), top: B:598:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:600:0x054f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3 A[Catch: LinkageError -> 0x00b3, Exception -> 0x00b6, TryCatch #11 {Exception -> 0x00b6, LinkageError -> 0x00b3, blocks: (B:48:0x00ac, B:56:0x00bb, B:61:0x00c3, B:63:0x00c8, B:65:0x00cc, B:67:0x00d3, B:69:0x00d9, B:71:0x00df, B:80:0x00f3, B:82:0x00fd, B:84:0x0101, B:86:0x0109, B:88:0x0111, B:90:0x0117, B:92:0x011d, B:94:0x0123, B:96:0x012b, B:160:0x01f9, B:101:0x0137, B:103:0x013f, B:108:0x014b, B:114:0x015c, B:116:0x0162, B:119:0x016c, B:122:0x0174, B:124:0x017c, B:126:0x0182, B:128:0x018c, B:130:0x0194, B:132:0x019c, B:135:0x01a8, B:139:0x01b0, B:141:0x01b8, B:143:0x01be, B:145:0x01c6, B:147:0x01ce, B:149:0x01d6, B:151:0x01dc, B:153:0x01e4, B:156:0x01ee, B:161:0x0203, B:162:0x0208, B:163:0x0209, B:164:0x020e, B:171:0x021d, B:173:0x0225, B:175:0x022d, B:177:0x0235, B:179:0x023d, B:181:0x0245, B:183:0x024d, B:185:0x0253, B:187:0x025f, B:188:0x027d, B:189:0x0284, B:193:0x028b, B:195:0x028f, B:197:0x0297, B:199:0x029f, B:201:0x02a7, B:203:0x02af, B:205:0x02b7, B:207:0x02bf, B:209:0x02c5, B:211:0x02d1, B:213:0x02f3, B:214:0x02fa, B:218:0x0302, B:220:0x0306, B:222:0x030e, B:224:0x0316, B:226:0x031e, B:228:0x0326, B:230:0x032e, B:232:0x0336, B:234:0x033c, B:236:0x0348), top: B:605:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:622:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0411 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x040d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:378:0x0505, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC19442 m44219(C23780 c23780, byte[] bArr, byte[] bArr2) throws Throwable {
        byte[] bArr3;
        int length;
        int i;
        char c;
        char c2;
        int i2;
        char c3;
        boolean z;
        InterfaceC24727 interfaceC24727;
        char c4;
        ?? r16;
        char c5;
        InterfaceC24727 interfaceC24728;
        byte[] bArrM46892;
        boolean z2;
        boolean z3;
        byte[] bArrM46893;
        char c6;
        byte b;
        String strM46879;
        ?? r17;
        ?? r18;
        ?? r3;
        ?? r5;
        AbstractC19442 c4690;
        C17823 c17823;
        String strM46882;
        int i3;
        int i4;
        boolean z4;
        byte b2;
        byte b3;
        int i5;
        byte b4;
        int i6;
        byte b5;
        int i7;
        int i8;
        boolean z5;
        int i9;
        byte[] bArr4;
        int i10;
        InterfaceC24727 interfaceC24729;
        int i11;
        int i12;
        int i13;
        char c7;
        int i14;
        byte b6;
        byte[] bArr5 = new byte[8];
        if (bArr2 == null && bArr != null && bArr.length > 11 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && ((b6 = bArr[3]) == 7 || b6 == 9 || b6 == 11 || b6 == 19)) {
            C17823 c17824 = new C17823(bArr);
            c17824.m40465(bArr.length);
            String strM46883 = C20764.m46882(c17824.m40471());
            c17824.m40463();
            if (strM46883.equals(OpenSSHPublicKeyUtil.RSA)) {
                return C6031.m13543(c23780, c17824);
            }
            if (strM46883.equals(OpenSSHPublicKeyUtil.DSS)) {
                return C18771.m42803(c23780, c17824);
            }
            if (strM46883.equals("ecdsa-sha2-nistp256") || strM46883.equals("ecdsa-sha2-nistp384") || strM46883.equals("ecdsa-sha2-nistp521")) {
                return C8713.m20157(c23780, c17824);
            }
            if (strM46883.equals(OpenSSHPublicKeyUtil.ED_25519)) {
                return C22125.m49916(c23780, c17824);
            }
            if (strM46883.equals("ssh-ed448")) {
                return C11396.m26345(c23780, c17824);
            }
            throw new C14392("privatekey: invalid key ".concat(strM46883));
        }
        if (bArr == null) {
            if (bArr != null) {
                length = bArr.length;
            } else {
                length = 0;
            }
            i = 0;
            while (true) {
                if (i < length) {
                    c = 2;
                    c2 = 1;
                    break;
                }
                c = 2;
                if (bArr[i] != 45) {
                }
                i++;
            }
            i2 = 0;
            c3 = 0;
            z = true;
            interfaceC24727 = null;
            loop1: while (true) {
                if (i < length) {
                    c4 = c;
                    r16 = z ? 1 : 0;
                    c5 = c2;
                    interfaceC24728 = interfaceC24727;
                    bArrM46892 = null;
                    z2 = z;
                    break;
                }
                z4 = z ? 1 : 0;
                b2 = bArr[i];
                interfaceC24728 = interfaceC24727;
                if (b2 == 66) {
                    c4 = c;
                    if (b2 == 65) {
                        c5 = c2;
                        if (b2 != 65) {
                        }
                        if (b2 != 65) {
                            bArrM46892 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                        } else {
                            bArrM46892 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                        }
                    } else {
                        c5 = c2;
                        if (b2 != 65) {
                        }
                        if (b2 != 65) {
                            bArrM46892 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                        } else {
                            bArrM46892 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                        }
                    }
                    interfaceC24727 = interfaceC24729;
                    z5 = z4;
                } else {
                    c4 = c;
                    if (b2 == 65) {
                        c5 = c2;
                        if (b2 != 65) {
                        }
                        if (b2 != 65) {
                            bArrM46892 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                        } else {
                            bArrM46892 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                        }
                    } else {
                        c5 = c2;
                        if (b2 != 65) {
                        }
                        if (b2 != 65) {
                            bArrM46892 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                        } else {
                            bArrM46892 = null;
                            if (b2 == 67) {
                                if (bArr[i + 1] != 66) {
                                }
                            }
                            if (b2 == 13) {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            } else {
                                b3 = 10;
                                if (b2 == b3) {
                                    b4 = bArr[i5];
                                    if (b4 == b3) {
                                        i += 2;
                                    } else if (b4 == 13) {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    } else {
                                        i6 = i5;
                                        while (true) {
                                            if (i6 >= bArr.length) {
                                                if (b5 != 58) {
                                                    i6++;
                                                }
                                            }
                                            if (i2 != 3) {
                                                z2 = false;
                                                i = i5;
                                                break loop1;
                                            }
                                            i = i5;
                                        }
                                    }
                                    z2 = z4;
                                    r16 = z4;
                                    break;
                                }
                                i++;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                        }
                    }
                    interfaceC24727 = interfaceC24729;
                    z5 = z4;
                }
                c2 = c5;
                c = c4;
                z = z5;
                if (bArr != null) {
                    if (c3 != 0) {
                        throw new C14392("invalid privatekey");
                    }
                    i3 = i;
                    while (i3 < length) {
                        i3++;
                    }
                    if (length - i3 != 0) {
                    }
                    throw new C14392("invalid privatekey");
                }
                r16 = z4;
                z3 = z2;
                if (i2 == 4) {
                    return m44218(c23780, bArrM46892);
                }
                if (bArrM46892 != null) {
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    c17823 = new C17823(bArrM46892);
                    c17823.m40464();
                    c17823.m40464();
                    c17823.m40471();
                    strM46882 = C20764.m46882(c17823.m40471());
                    if (strM46882.equals("3des-cbc")) {
                        c17823.m40464();
                        bArr3 = new byte[bArrM46892.length - c17823.m40472()];
                        c17823.m40452(bArr3);
                        throw new C14392("cipher " + strM46882 + " is not supported for this privatekey format");
                    }
                    if (strM46882.equals("none")) {
                        c17823.m40464();
                        c17823.m40464();
                        byte[] bArr6 = new byte[bArrM46892.length - c17823.m40472()];
                        c17823.m40452(bArr6);
                        z3 = false;
                        bArrM46892 = bArr6;
                    } else {
                        throw new C14392("cipher " + strM46882 + " is not supported for this privatekey format");
                    }
                }
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                bArrM46893 = "";
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    if (bArr2.length <= 4) {
                        r16 = "";
                        b = bArr2[0];
                        if (b != 115) {
                            if (b != 101) {
                                bArrM46893 = 0;
                            } else {
                                bArrM46893 = 0;
                            }
                        } else if (b != 101) {
                            bArrM46893 = 0;
                        } else {
                            bArrM46893 = 0;
                        }
                    } else {
                        r16 = "";
                        b = bArr2[0];
                        if (b != 115) {
                            if (b != 101) {
                                bArrM46893 = 0;
                            } else {
                                bArrM46893 = 0;
                            }
                        } else if (b != 101) {
                            bArrM46893 = 0;
                        } else {
                            bArrM46893 = 0;
                        }
                    }
                    c6 = 1;
                    r3 = bArrM46893;
                    r18 = r16;
                } else {
                    r18 = "";
                    c6 = 1;
                    r3 = 0;
                }
                r5 = r18;
                if (c3 == c6) {
                    c4690 = new C18771(c23780);
                } else if (c3 == 2) {
                    c4690 = new C6031(c23780);
                } else if (c3 == 3) {
                    c4690 = new C8713(c23780, bArr2);
                } else if (c3 == 5) {
                    c4690 = new C22125(c23780, bArr2);
                } else if (c3 == 6) {
                    c4690 = new C11396(c23780, bArr2);
                } else if (i2 == 3) {
                    c4690 = new C4690(c23780);
                } else {
                    c4690 = null;
                }
                if (c4690 != null) {
                    c4690.f59227 = z3;
                    c4690.f59230 = r3;
                    c4690.f59223 = i2;
                    c4690.f59222 = r5;
                    c4690.f59221 = interfaceC24728;
                    if (z3) {
                        c4690.f59227 = true;
                        c4690.f59226 = bArr5;
                        c4690.f59225 = bArrM46892;
                    } else if (c4690.mo9933(bArrM46892)) {
                        c4690.f59227 = false;
                    } else {
                        throw new C14392("invalid privatekey");
                    }
                }
                return c4690;
            }
        }
        try {
            AbstractC19442 abstractC19442M44225 = m44225(c23780, bArr);
            if (abstractC19442M44225 != null) {
                return abstractC19442M44225;
            }
            if (bArr != null) {
                length = bArr.length;
            } else {
                length = 0;
            }
            i = 0;
            while (true) {
                if (i < length) {
                    c = 2;
                    c2 = 1;
                    break;
                }
                c = 2;
                if (bArr[i] != 45 && (i14 = i + 4) < length) {
                    c2 = 1;
                    if (bArr[i + 1] == 45 && bArr[i + 2] == 45 && bArr[i + 3] == 45 && bArr[i14] == 45) {
                        break;
                    }
                }
                i++;
            }
            i2 = 0;
            c3 = 0;
            z = true;
            interfaceC24727 = null;
            loop1: while (true) {
                if (i < length) {
                    c4 = c;
                    r16 = z ? 1 : 0;
                    c5 = c2;
                    interfaceC24728 = interfaceC24727;
                    bArrM46892 = null;
                    z2 = z;
                    break;
                }
                z4 = z ? 1 : 0;
                b2 = bArr[i];
                interfaceC24728 = interfaceC24727;
                if (b2 == 66 || (i13 = i + 3) >= length) {
                    c4 = c;
                } else {
                    c4 = c;
                    if (bArr[i + 1] == 69 && bArr[i + 2] == 71 && bArr[i13] == 73) {
                        int i15 = i + 6;
                        int i16 = i + 8;
                        if (i16 >= length) {
                            throw new C14392("invalid privatekey");
                        }
                        byte b7 = bArr[i15];
                        if (b7 == 68 && bArr[i + 7] == 83 && bArr[i16] == 65) {
                            c7 = 1;
                        } else if (b7 == 82 && bArr[i + 7] == 83 && bArr[i16] == 65) {
                            c7 = 2;
                        } else if (b7 == 69 && bArr[i + 7] == 67) {
                            c7 = 3;
                        } else {
                            if (b7 == 83 && bArr[i + 7] == 83 && bArr[i16] == 72) {
                                i2 = 1;
                            } else {
                                int i17 = i + 12;
                                if (i17 < length && b7 == 80 && bArr[i + 7] == 82 && bArr[i16] == 73) {
                                    int i18 = i + 9;
                                    if (bArr[i18] == 86 && bArr[i + 10] == 65 && bArr[i + 11] == 84 && bArr[i17] == 69) {
                                        i2 = 3;
                                        c7 = 4;
                                        z5 = false;
                                        i15 = i18;
                                    }
                                    c3 = c7;
                                    c5 = c2;
                                    interfaceC24727 = interfaceC24728;
                                    i = i15 + 3;
                                }
                                int i19 = i + 14;
                                if (i19 < length && b7 == 69 && bArr[i + 7] == 78 && bArr[i16] == 67 && bArr[i + 9] == 82 && bArr[i + 10] == 89) {
                                    int i20 = i + 11;
                                    if (bArr[i20] == 80 && bArr[i17] == 84 && bArr[i + 13] == 69 && bArr[i19] == 68) {
                                        i15 = i20;
                                        i2 = 3;
                                    } else {
                                        if (m44220(i15, length, bArr)) {
                                            throw new C14392("invalid privatekey");
                                        }
                                        i2 = 4;
                                    }
                                } else {
                                    if (m44220(i15, length, bArr)) {
                                        throw new C14392("invalid privatekey");
                                    }
                                    i2 = 4;
                                }
                            }
                            c7 = 4;
                        }
                        z5 = z4;
                        c3 = c7;
                        c5 = c2;
                        interfaceC24727 = interfaceC24728;
                        i = i15 + 3;
                    }
                    c2 = c5;
                    c = c4;
                    z = z5;
                }
                if (b2 == 65 || (i12 = i + 7) >= length) {
                    c5 = c2;
                } else {
                    c5 = c2;
                    if (bArr[i + 1] == 69 && bArr[i + 2] == 83 && bArr[i + 3] == 45 && bArr[i + 4] == 50 && bArr[i + 5] == 53 && bArr[i + 6] == 54 && bArr[i12] == 45) {
                        i += 8;
                        if (C9383.m21826(C21769.m49091("aes256-cbc"))) {
                            interfaceC24729 = (InterfaceC24727) Class.forName(C21769.m49091("aes256-cbc")).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
                            bArr5 = new byte[interfaceC24729.mo4578()];
                        } else {
                            throw new C14392("privatekey: aes256-cbc is not available");
                        }
                    }
                    interfaceC24727 = interfaceC24729;
                    z5 = z4;
                    c2 = c5;
                    c = c4;
                    z = z5;
                }
                if (b2 != 65 && (i11 = i + 7) < length && bArr[i + 1] == 69 && bArr[i + 2] == 83 && bArr[i + 3] == 45 && bArr[i + 4] == 49 && bArr[i + 5] == 57 && bArr[i + 6] == 50 && bArr[i11] == 45) {
                    i += 8;
                    if (C9383.m21826(C21769.m49091("aes192-cbc"))) {
                        interfaceC24729 = (InterfaceC24727) Class.forName(C21769.m49091("aes192-cbc")).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
                        bArr5 = new byte[interfaceC24729.mo4578()];
                    } else {
                        throw new C14392("privatekey: aes192-cbc is not available");
                    }
                } else {
                    if (b2 != 65 && (i10 = i + 7) < length && bArr[i + 1] == 69 && bArr[i + 2] == 83 && bArr[i + 3] == 45 && bArr[i + 4] == 49 && bArr[i + 5] == 50 && bArr[i + 6] == 56 && bArr[i10] == 45) {
                        i += 8;
                        if (C9383.m21826(C21769.m49091("aes128-cbc"))) {
                            bArr4 = null;
                            try {
                                interfaceC24729 = (InterfaceC24727) Class.forName(C21769.m49091("aes128-cbc")).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
                                bArr5 = new byte[interfaceC24729.mo4578()];
                            } catch (Exception e) {
                                e = e;
                            } catch (LinkageError e2) {
                                e = e2;
                            }
                        } else {
                            bArr4 = null;
                            throw new C14392("privatekey: aes128-cbc is not available");
                        }
                    } else {
                        bArrM46892 = null;
                        if (b2 == 67 && (i9 = i + 3) < length) {
                            try {
                                if (bArr[i + 1] != 66 && bArr[i + 2] == 67 && bArr[i9] == 44) {
                                    i += 4;
                                    for (int i21 = 0; i21 < bArr5.length; i21++) {
                                        int i22 = i + 1;
                                        byte b8 = bArr[i];
                                        int i23 = (((byte) ((48 > b8 || b8 > 57) ? b8 - 87 : b8 - 48)) << 4) & 240;
                                        i += 2;
                                        byte b9 = bArr[i22];
                                        bArr5[i21] = (byte) (i23 + (((byte) ((48 > b9 || b9 > 57) ? b9 - 87 : b9 - 48)) & 15));
                                    }
                                }
                                z5 = z4;
                                interfaceC24727 = interfaceC24728;
                                c2 = c5;
                                c = c4;
                                z = z5;
                            } catch (Exception | LinkageError e3) {
                                e = e3;
                                bArr4 = null;
                                bArr3 = bArr4;
                            }
                        }
                        if (b2 == 13 || (i8 = i + 1) >= bArr.length) {
                            b3 = 10;
                        } else {
                            b3 = 10;
                            if (bArr[i8] == 10) {
                                i = i8;
                            }
                            z5 = z4;
                            interfaceC24727 = interfaceC24728;
                            c2 = c5;
                            c = c4;
                            z = z5;
                        }
                        if (b2 == b3 && (i5 = i + 1) < bArr.length) {
                            b4 = bArr[i5];
                            if (b4 == b3) {
                                i += 2;
                            } else if (b4 == 13 || (i7 = i + 2) >= bArr.length || bArr[i7] != 10) {
                                i6 = i5;
                                while (true) {
                                    if (i6 >= bArr.length && (b5 = bArr[i6]) != 10) {
                                        if (b5 != 58) {
                                            i6++;
                                        }
                                    }
                                    if (i2 != 3) {
                                        z2 = false;
                                        i = i5;
                                        break loop1;
                                    }
                                    i = i5;
                                }
                            } else {
                                i += 3;
                            }
                            z2 = z4;
                            r16 = z4;
                            break;
                        }
                        i++;
                        z5 = z4;
                        interfaceC24727 = interfaceC24728;
                        c2 = c5;
                        c = c4;
                        z = z5;
                    }
                    bArr3 = bArr4;
                }
                interfaceC24727 = interfaceC24729;
                z5 = z4;
                c2 = c5;
                c = c4;
                z = z5;
            }
            if (bArr != null) {
                r16 = z4;
                z3 = z2;
                if (i2 == 4) {
                    return m44218(c23780, bArrM46892);
                }
                if (bArrM46892 != null && bArrM46892.length > 4 && bArrM46892[0] == 63 && bArrM46892[c5] == 111 && bArrM46892[c4] == -7 && bArrM46892[3] == -21) {
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    c17823 = new C17823(bArrM46892);
                    c17823.m40464();
                    c17823.m40464();
                    c17823.m40471();
                    strM46882 = C20764.m46882(c17823.m40471());
                    if (strM46882.equals("3des-cbc")) {
                        c17823.m40464();
                        bArr3 = new byte[bArrM46892.length - c17823.m40472()];
                        c17823.m40452(bArr3);
                        try {
                            throw new C14392("cipher " + strM46882 + " is not supported for this privatekey format");
                        } catch (Exception e4) {
                            e = e4;
                        } catch (LinkageError e5) {
                            e = e5;
                        }
                    } else if (strM46882.equals("none")) {
                        c17823.m40464();
                        c17823.m40464();
                        byte[] bArr7 = new byte[bArrM46892.length - c17823.m40472()];
                        c17823.m40452(bArr7);
                        z3 = false;
                        bArrM46892 = bArr7;
                    } else {
                        throw new C14392("cipher " + strM46882 + " is not supported for this privatekey format");
                    }
                }
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                z3 = z2;
                bArrM46893 = "";
                if (bArr2 != null) {
                    try {
                        int length3 = bArr2.length;
                        try {
                            try {
                                if (bArr2.length <= 4 && bArr2[0] == 45 && bArr2[c5] == 45 && bArr2[c4] == 45 && bArr2[3] == 45) {
                                    int i24 = 0;
                                    do {
                                        i24++;
                                        if (bArr2.length <= i24) {
                                            break;
                                        }
                                    } while (bArr2[i24] != 10);
                                    boolean z6 = bArr2.length > i24;
                                    loop6: while (true) {
                                        if (!z6) {
                                            r16 = bArrM46893;
                                            break;
                                        }
                                        if (bArr2[i24] == 10) {
                                            int i25 = i24 + 1;
                                            int i26 = i25;
                                            ?? r4 = bArrM46893;
                                            while (true) {
                                                if (i26 < bArr2.length) {
                                                    byte b10 = bArr2[i26];
                                                    r17 = r4;
                                                    if (b10 != 10) {
                                                        if (b10 != 58) {
                                                            i26++;
                                                            r4 = r17;
                                                        }
                                                    }
                                                } else {
                                                    r17 = r4;
                                                }
                                                i24 = i25;
                                                r16 = r17;
                                                break loop6;
                                            }
                                        }
                                        r17 = bArrM46893;
                                        i24++;
                                        bArrM46893 = r17;
                                    }
                                    if (bArr2.length <= i24) {
                                        z6 = false;
                                    }
                                    int i27 = i24;
                                    while (z6 && i27 < length3) {
                                        byte b11 = bArr2[i27];
                                        if (b11 == 10) {
                                            System.arraycopy(bArr2, i27 + 1, bArr2, i27, (length3 - i27) - 1);
                                            length3--;
                                        } else {
                                            if (b11 == 45) {
                                                break;
                                            }
                                            i27++;
                                        }
                                    }
                                    if (z6) {
                                        bArrM46893 = C20764.m46892(i24, i27 - i24, bArr2);
                                        if (bArr == null || c3 == 4) {
                                            char c8 = bArrM46893[8];
                                            if (c8 == 'd') {
                                                c3 = 1;
                                            } else if (c8 == 'r') {
                                                c3 = 2;
                                            }
                                        }
                                    } else {
                                        bArrM46893 = 0;
                                    }
                                } else {
                                    r16 = "";
                                    b = bArr2[0];
                                    if (b != 115 && bArr2[c5] == 115 && bArr2[c4] == 104 && bArr2[3] == 45) {
                                        if (bArr == null && bArr2.length > 7) {
                                            byte b12 = bArr2[4];
                                            if (b12 == 100) {
                                                c3 = 1;
                                            } else if (b12 == 114) {
                                                c3 = 2;
                                            } else if (b12 == 101 && bArr2[6] == 50) {
                                                c3 = 5;
                                            } else if (b12 == 101 && bArr2[6] == 52) {
                                                c3 = 6;
                                            }
                                        }
                                        int i28 = 0;
                                        while (i28 < length3 && bArr2[i28] != 32) {
                                            i28++;
                                        }
                                        int i29 = i28 + 1;
                                        if (i29 < length3) {
                                            int i30 = i29;
                                            while (i30 < length3 && bArr2[i30] != 32) {
                                                i30++;
                                            }
                                            int i31 = i30;
                                            bArrM46893 = C20764.m46892(i29, i30 - i29, bArr2);
                                            i29 = i31;
                                        } else {
                                            bArrM46893 = 0;
                                        }
                                        int i32 = i29 + 1;
                                        if (i29 < length3) {
                                            int i33 = i32;
                                            while (i33 < length3 && bArr2[i33] != 10) {
                                                i33++;
                                            }
                                            if (i33 > 0 && bArr2[i33 - 1] == 13) {
                                                i33--;
                                            }
                                            if (i32 < i33) {
                                                strM46879 = C20764.m46879(i32, i33 - i32, bArr2);
                                                bArrM46893 = bArrM46893;
                                                r16 = strM46879;
                                            }
                                        }
                                    } else if (b != 101 && bArr2[c5] == 99 && bArr2[c4] == 100 && bArr2[3] == 115) {
                                        if (bArr == null && bArr2.length > 7) {
                                            c3 = 3;
                                        }
                                        int i34 = 0;
                                        while (i34 < length3 && bArr2[i34] != 32) {
                                            i34++;
                                        }
                                        int i35 = i34 + 1;
                                        if (i35 < length3) {
                                            int i36 = i35;
                                            while (i36 < length3 && bArr2[i36] != 32) {
                                                i36++;
                                            }
                                            int i37 = i36;
                                            bArrM46893 = C20764.m46892(i35, i36 - i35, bArr2);
                                            i35 = i37;
                                        } else {
                                            bArrM46893 = 0;
                                        }
                                        int i38 = i35 + 1;
                                        if (i35 < length3) {
                                            int i39 = i38;
                                            while (i39 < length3 && bArr2[i39] != 10) {
                                                i39++;
                                            }
                                            if (i39 > 0 && bArr2[i39 - 1] == 13) {
                                                i39--;
                                            }
                                            if (i38 < i39) {
                                                strM46879 = C20764.m46879(i38, i39 - i38, bArr2);
                                                bArrM46893 = bArrM46893;
                                                r16 = strM46879;
                                            }
                                        }
                                    } else {
                                        bArrM46893 = 0;
                                    }
                                }
                            } catch (Exception unused) {
                                c23780.getClass();
                                C21769.f68542.getClass();
                            }
                        } catch (Exception unused2) {
                            bArrM46893 = 0;
                            c23780.getClass();
                            C21769.f68542.getClass();
                        }
                    } catch (Exception unused3) {
                        r16 = bArrM46893;
                    }
                    c6 = 1;
                    r3 = bArrM46893;
                    r18 = r16;
                } else {
                    r18 = "";
                    c6 = 1;
                    r3 = 0;
                }
                r5 = r18;
                if (c3 == c6) {
                    c4690 = new C18771(c23780);
                } else if (c3 == 2) {
                    c4690 = new C6031(c23780);
                } else if (c3 == 3) {
                    c4690 = new C8713(c23780, bArr2);
                } else if (c3 == 5) {
                    c4690 = new C22125(c23780, bArr2);
                } else if (c3 == 6) {
                    c4690 = new C11396(c23780, bArr2);
                } else if (i2 == 3) {
                    c4690 = new C4690(c23780);
                } else {
                    c4690 = null;
                }
                if (c4690 != null) {
                    c4690.f59227 = z3;
                    c4690.f59230 = r3;
                    c4690.f59223 = i2;
                    c4690.f59222 = r5;
                    c4690.f59221 = interfaceC24728;
                    if (z3) {
                        c4690.f59227 = true;
                        c4690.f59226 = bArr5;
                        c4690.f59225 = bArrM46892;
                    } else if (c4690.mo9933(bArrM46892)) {
                        c4690.f59227 = false;
                    } else {
                        throw new C14392("invalid privatekey");
                    }
                }
                return c4690;
            }
            if (c3 != 0) {
                throw new C14392("invalid privatekey");
            }
            i3 = i;
            while (i3 < length && bArr[i3] != 45) {
                i3++;
            }
            if (length - i3 != 0 || (i4 = i3 - i) == 0) {
                throw new C14392("invalid privatekey");
            }
            byte[] bArr8 = new byte[i4];
            System.arraycopy(bArr, i, bArr8, 0, i4);
            int i40 = 0;
            while (i40 < i4) {
                byte b13 = bArr8[i40];
                if (b13 == 10) {
                    int i41 = (i40 <= 0 || bArr8[i40 + (-1)] != 13) ? 0 : 1;
                    int i42 = i40 + 1;
                    System.arraycopy(bArr8, i42, bArr8, i40 - i41, i4 - i42);
                    if (i41 != 0) {
                        i4--;
                        i40--;
                    }
                    i4--;
                } else {
                    if (b13 == 45) {
                        break;
                    }
                    i40++;
                }
            }
            if (i40 > 0) {
                bArrM46892 = C20764.m46892(0, i40, bArr8);
            }
            try {
                try {
                    C20764.m46890(bArr8);
                    r16 = z4;
                    z3 = z2;
                    if (i2 == 4) {
                        return m44218(c23780, bArrM46892);
                    }
                    if (bArrM46892 != null) {
                        z3 = z2;
                        z3 = z2;
                        z3 = z2;
                        z3 = z2;
                        z3 = z2;
                        c17823 = new C17823(bArrM46892);
                        c17823.m40464();
                        c17823.m40464();
                        c17823.m40471();
                        strM46882 = C20764.m46882(c17823.m40471());
                        if (strM46882.equals("3des-cbc")) {
                            c17823.m40464();
                            bArr3 = new byte[bArrM46892.length - c17823.m40472()];
                            c17823.m40452(bArr3);
                            throw new C14392("cipher " + strM46882 + " is not supported for this privatekey format");
                        }
                        if (strM46882.equals("none")) {
                            c17823.m40464();
                            c17823.m40464();
                            byte[] bArr9 = new byte[bArrM46892.length - c17823.m40472()];
                            c17823.m40452(bArr9);
                            z3 = false;
                            bArrM46892 = bArr9;
                        } else {
                            throw new C14392("cipher " + strM46882 + " is not supported for this privatekey format");
                        }
                    }
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    z3 = z2;
                    bArrM46893 = "";
                    if (bArr2 != null) {
                        int length4 = bArr2.length;
                        if (bArr2.length <= 4) {
                            r16 = "";
                            b = bArr2[0];
                            if (b != 115) {
                                if (b != 101) {
                                    bArrM46893 = 0;
                                } else {
                                    bArrM46893 = 0;
                                }
                            } else if (b != 101) {
                                bArrM46893 = 0;
                            } else {
                                bArrM46893 = 0;
                            }
                        } else {
                            r16 = "";
                            b = bArr2[0];
                            if (b != 115) {
                                if (b != 101) {
                                    bArrM46893 = 0;
                                } else {
                                    bArrM46893 = 0;
                                }
                            } else if (b != 101) {
                                bArrM46893 = 0;
                            } else {
                                bArrM46893 = 0;
                            }
                        }
                        c6 = 1;
                        r3 = bArrM46893;
                        r18 = r16;
                    } else {
                        r18 = "";
                        c6 = 1;
                        r3 = 0;
                    }
                    r5 = r18;
                    if (c3 == c6) {
                        c4690 = new C18771(c23780);
                    } else if (c3 == 2) {
                        c4690 = new C6031(c23780);
                    } else if (c3 == 3) {
                        c4690 = new C8713(c23780, bArr2);
                    } else if (c3 == 5) {
                        c4690 = new C22125(c23780, bArr2);
                    } else if (c3 == 6) {
                        c4690 = new C11396(c23780, bArr2);
                    } else if (i2 == 3) {
                        c4690 = new C4690(c23780);
                    } else {
                        c4690 = null;
                    }
                    if (c4690 != null) {
                        c4690.f59227 = z3;
                        c4690.f59230 = r3;
                        c4690.f59223 = i2;
                        c4690.f59222 = r5;
                        c4690.f59221 = interfaceC24728;
                        if (z3) {
                            c4690.f59227 = true;
                            c4690.f59226 = bArr5;
                            c4690.f59225 = bArrM46892;
                        } else if (c4690.mo9933(bArrM46892)) {
                            c4690.f59227 = false;
                        } else {
                            throw new C14392("invalid privatekey");
                        }
                    }
                    return c4690;
                } catch (LinkageError e6) {
                    e = e6;
                    bArr3 = bArrM46892;
                }
            } catch (Exception e7) {
                e = e7;
                bArr3 = bArrM46892;
            }
        } catch (Exception e8) {
            e = e8;
            bArr3 = null;
        } catch (LinkageError e9) {
            e = e9;
            bArr3 = null;
        }
        C20764.m46890(bArr3);
        if (e instanceof C14392) {
            throw ((C14392) e);
        }
        throw new C14392(e.toString(), e);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010c A[Catch: Exception -> 0x0075, TryCatch #2 {Exception -> 0x0075, blocks: (B:10:0x005d, B:12:0x0069, B:14:0x006f, B:15:0x0074, B:30:0x00e9, B:32:0x00ed, B:33:0x00ef, B:34:0x00f0, B:35:0x0104, B:39:0x0108, B:41:0x010c, B:42:0x010e, B:43:0x010f, B:44:0x0123), top: B:53:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x010f A[Catch: Exception -> 0x0075, TryCatch #2 {Exception -> 0x0075, blocks: (B:10:0x005d, B:12:0x0069, B:14:0x006f, B:15:0x0074, B:30:0x00e9, B:32:0x00ed, B:33:0x00ef, B:34:0x00f0, B:35:0x0104, B:39:0x0108, B:41:0x010c, B:42:0x010e, B:43:0x010f, B:44:0x0123), top: B:53:0x005b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x010f, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC19442 m44218(C23780 c23780, byte[] bArr) throws Exception {
        if (bArr == null) {
            throw new C14392("invalid privatekey");
        }
        C17823 c17823 = new C17823(bArr);
        byte[] bArr2 = f59220;
        int length = bArr2.length;
        byte[] bArr3 = new byte[length];
        c17823.m40450(0, length, bArr3);
        if (!C20764.m46891(bArr2, bArr3)) {
            throw new C14392("Invalid openssh v1 format.");
        }
        byte[] bArrM40471 = c17823.m40471();
        int length2 = bArrM40471.length;
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArrM40471, 0, length2, charset);
        byte[] bArrM40472 = c17823.m40471();
        String str2 = new String(bArrM40472, 0, bArrM40472.length, charset);
        byte[] bArrM40473 = c17823.m40471();
        if (c17823.m40464() != 1) {
            throw new C14392("We don't support having more than 1 key in the file (yet).");
        }
        byte[] bArrM40474 = c17823.m40471();
        AbstractC19442 abstractC19442M44217 = m44217(c23780, (String) null, bArrM40474);
        boolean zEquals = "none".equals(str);
        abstractC19442M44217.f59227 = !zEquals;
        abstractC19442M44217.f59230 = bArrM40474;
        abstractC19442M44217.f59223 = 4;
        abstractC19442M44217.f59222 = "";
        try {
            if (zEquals) {
                byte[] bArrM40475 = c17823.m40471();
                abstractC19442M44217.f59225 = bArrM40475;
                if (!abstractC19442M44217.mo9933(bArrM40475)) {
                    throw new C14392("invalid privatekey");
                }
                C20764.m46890(abstractC19442M44217.f59225);
                return abstractC19442M44217;
            }
            try {
                InterfaceC24727 interfaceC24727 = (InterfaceC24727) Class.forName(C21769.m49091(str)).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
                abstractC19442M44217.f59221 = interfaceC24727;
                int iMo4578 = interfaceC24727.mo4578();
                if (abstractC19442M44217.f59221.mo4576()) {
                    iMo4578 = 0;
                } else if (abstractC19442M44217.f59221.mo4577()) {
                    iMo4578 = 12;
                }
                abstractC19442M44217.f59226 = new byte[iMo4578];
                byte[] bArrM40476 = c17823.m40471();
                int length3 = bArrM40476.length + abstractC19442M44217.f59221.mo4574();
                byte[] bArr4 = new byte[length3];
                System.arraycopy(bArrM40476, 0, bArr4, 0, bArrM40476.length);
                c17823.m40450(bArrM40476.length, length3 - bArrM40476.length, bArr4);
                abstractC19442M44217.f59225 = bArr4;
                try {
                    InterfaceC4019 interfaceC4019 = (InterfaceC4019) Class.forName(C21769.m49091(str2)).asSubclass(InterfaceC4019.class).getDeclaredConstructor(null).newInstance(null);
                    abstractC19442M44217.f59231 = interfaceC4019;
                    interfaceC4019.mo8021(bArrM40473);
                    return abstractC19442M44217;
                } catch (Exception | LinkageError e) {
                    if (e instanceof C14392) {
                        throw ((C14392) e);
                    }
                    throw new C14392("kdf " + str2 + " is not available", e);
                }
            } catch (Exception e2) {
                e = e2;
                if (e instanceof C14392) {
                    throw ((C14392) e);
                }
                throw new C14392("cipher " + str + " is not available", e);
            } catch (LinkageError e3) {
                e = e3;
                if (e instanceof C14392) {
                    throw ((C14392) e);
                }
                throw new C14392("cipher " + str + " is not available", e);
            }
        } catch (Exception e4) {
            C20764.m46890(abstractC19442M44217.f59225);
            throw e4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m44220(int i, int i2, byte[] bArr) {
        int i3 = i + 24;
        return i3 < i2 && "OPENSSH PRIVATE KEY-----".equals(C20764.m46882(Arrays.copyOfRange(bArr, i, i3)));
    }

    public final void finalize() {
        mo13547();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0110 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:16:0x0050, B:18:0x0056, B:19:0x005c, B:21:0x0089, B:23:0x00af, B:36:0x0106, B:34:0x00e1, B:35:0x00e9, B:40:0x010c, B:42:0x0110, B:43:0x0112, B:44:0x0113, B:45:0x012e, B:28:0x00d2, B:30:0x00d6, B:31:0x00d8, B:32:0x00d9, B:33:0x00e0, B:55:0x0141, B:57:0x0149, B:60:0x0150, B:61:0x0157, B:49:0x0132, B:51:0x0136, B:52:0x0138, B:53:0x0139, B:54:0x0140, B:70:0x0161, B:71:0x0164), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0113 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:16:0x0050, B:18:0x0056, B:19:0x005c, B:21:0x0089, B:23:0x00af, B:36:0x0106, B:34:0x00e1, B:35:0x00e9, B:40:0x010c, B:42:0x0110, B:43:0x0112, B:44:0x0113, B:45:0x012e, B:28:0x00d2, B:30:0x00d6, B:31:0x00d8, B:32:0x00d9, B:33:0x00e0, B:55:0x0141, B:57:0x0149, B:60:0x0150, B:61:0x0157, B:49:0x0132, B:51:0x0136, B:52:0x0138, B:53:0x0139, B:54:0x0140, B:70:0x0161, B:71:0x0164), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0136 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:16:0x0050, B:18:0x0056, B:19:0x005c, B:21:0x0089, B:23:0x00af, B:36:0x0106, B:34:0x00e1, B:35:0x00e9, B:40:0x010c, B:42:0x0110, B:43:0x0112, B:44:0x0113, B:45:0x012e, B:28:0x00d2, B:30:0x00d6, B:31:0x00d8, B:32:0x00d9, B:33:0x00e0, B:55:0x0141, B:57:0x0149, B:60:0x0150, B:61:0x0157, B:49:0x0132, B:51:0x0136, B:52:0x0138, B:53:0x0139, B:54:0x0140, B:70:0x0161, B:71:0x0164), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0139 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:16:0x0050, B:18:0x0056, B:19:0x005c, B:21:0x0089, B:23:0x00af, B:36:0x0106, B:34:0x00e1, B:35:0x00e9, B:40:0x010c, B:42:0x0110, B:43:0x0112, B:44:0x0113, B:45:0x012e, B:28:0x00d2, B:30:0x00d6, B:31:0x00d8, B:32:0x00d9, B:33:0x00e0, B:55:0x0141, B:57:0x0149, B:60:0x0150, B:61:0x0157, B:49:0x0132, B:51:0x0136, B:52:0x0138, B:53:0x0139, B:54:0x0140, B:70:0x0161, B:71:0x0164), top: B:76:0x002a }] */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x0113, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0166: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:73:0x0166 */
    /* JADX INFO: renamed from: ۧ */
    public static AbstractC19442 m44225(C23780 c23780, byte[] bArr) throws Throwable {
        int i;
        byte[] bArr2;
        C17823 c17823 = new C17823(bArr);
        HashMap map = new HashMap();
        while (m44221(c17823, map)) {
        }
        String str = (String) map.get("PuTTY-User-Key-File-2");
        byte[] bArr3 = null;
        if (str == null) {
            str = (String) map.get("PuTTY-User-Key-File-3");
            if (str == null) {
                return null;
            }
            i = 5;
        } else {
            i = 2;
        }
        try {
            try {
                byte[] bArrM44222 = m44222(c17823, Integer.parseInt((String) map.get("Public-Lines")));
                while (m44221(c17823, map)) {
                }
                byte[] bArrM44223 = m44222(c17823, Integer.parseInt((String) map.get("Private-Lines")));
                do {
                    try {
                    } catch (Exception e) {
                        e = e;
                    }
                } while (m44221(c17823, map));
                byte[] bArrM46892 = C20764.m46892(0, bArrM44223.length, bArrM44223);
                try {
                    byte[] bArrM46893 = C20764.m46892(0, bArrM44222.length, bArrM44222);
                    AbstractC19442 abstractC19442M44217 = m44217(c23780, str, bArrM46893);
                    abstractC19442M44217.f59227 = !((String) map.get("Encryption")).equals("none");
                    abstractC19442M44217.f59230 = bArrM46893;
                    abstractC19442M44217.f59223 = i;
                    abstractC19442M44217.f59222 = (String) map.get("Comment");
                    if (abstractC19442M44217.f59227) {
                        try {
                            InterfaceC24727 interfaceC24727 = (InterfaceC24727) Class.forName(C21769.m49091("aes256-cbc")).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
                            abstractC19442M44217.f59221 = interfaceC24727;
                            abstractC19442M44217.f59226 = new byte[interfaceC24727.mo4578()];
                            if (i == 2) {
                                try {
                                    InterfaceC5005 interfaceC5005 = (InterfaceC5005) Class.forName(C21769.m49091("sha-1")).asSubclass(InterfaceC5005.class).getDeclaredConstructor(null).newInstance(null);
                                    interfaceC5005.init();
                                    abstractC19442M44217.f59224 = interfaceC5005;
                                } catch (Exception | LinkageError e2) {
                                    if (e2 instanceof C14392) {
                                        throw ((C14392) e2);
                                    }
                                    throw new C14392("hash sha-1 is not available", e2);
                                }
                            } else {
                                String str2 = (String) map.get("Key-Derivation");
                                try {
                                    InterfaceC4019 interfaceC4019 = (InterfaceC4019) Class.forName(C21769.m49091(str2)).asSubclass(InterfaceC4019.class).getDeclaredConstructor(null).newInstance(null);
                                    abstractC19442M44217.f59231 = interfaceC4019;
                                    interfaceC4019.mo8020(map);
                                } catch (Exception e3) {
                                    e = e3;
                                    if (e instanceof C14392) {
                                        throw ((C14392) e);
                                    }
                                    throw new C14392("kdf " + str2 + " is not available", e);
                                } catch (LinkageError e4) {
                                    e = e4;
                                    if (e instanceof C14392) {
                                        throw ((C14392) e);
                                    }
                                    throw new C14392("kdf " + str2 + " is not available", e);
                                }
                            }
                            abstractC19442M44217.f59225 = bArrM46892;
                        } catch (Exception e5) {
                            e = e5;
                            if (e instanceof C14392) {
                                throw ((C14392) e);
                            }
                            throw new C14392("cipher aes256-cbc is not available", e);
                        } catch (LinkageError e6) {
                            e = e6;
                            if (e instanceof C14392) {
                                throw ((C14392) e);
                            }
                            throw new C14392("cipher aes256-cbc is not available", e);
                        }
                    } else {
                        abstractC19442M44217.f59225 = bArrM46892;
                        if (!abstractC19442M44217.mo9933(bArrM46892)) {
                            throw new C14392("invalid privatekey");
                        }
                        C20764.m46890(bArrM46892);
                    }
                    C20764.m46890(bArrM44223);
                    return abstractC19442M44217;
                } catch (Exception e7) {
                    e = e7;
                    bArr3 = bArrM46892;
                    C20764.m46890(bArr3);
                    throw e;
                }
            } catch (Throwable th) {
                th = th;
                bArr3 = bArr2;
                C20764.m46890(bArr3);
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
        } catch (Throwable th2) {
            th = th2;
            C20764.m46890(bArr3);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC19442 m44217(C23780 c23780, String str, byte[] bArr) throws C14392 {
        C17823 c17823 = new C17823(bArr);
        c17823.m40465(bArr.length);
        byte[] bArrM40471 = c17823.m40471();
        byte[] bArr2 = C20764.f65273;
        String str2 = new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
        if (str == null || str.equals("")) {
            str = str2;
        } else if (!str.equals(str2)) {
            throw new C14392(C21459.m48622("pubkeyblob type [", str2, "] does not match expected type [", str, "]"));
        }
        if (str.equals(OpenSSHPublicKeyUtil.RSA)) {
            int iM40464 = c17823.m40464();
            byte[] bArr3 = new byte[iM40464];
            c17823.m40450(0, iM40464, bArr3);
            int iM40465 = c17823.m40464();
            byte[] bArr4 = new byte[iM40465];
            c17823.m40450(0, iM40465, bArr4);
            return new C6031(c23780, bArr4, bArr3, null);
        }
        if (str.equals(OpenSSHPublicKeyUtil.DSS)) {
            int iM40466 = c17823.m40464();
            byte[] bArr5 = new byte[iM40466];
            c17823.m40450(0, iM40466, bArr5);
            int iM40467 = c17823.m40464();
            byte[] bArr6 = new byte[iM40467];
            c17823.m40450(0, iM40467, bArr6);
            int iM40468 = c17823.m40464();
            byte[] bArr7 = new byte[iM40468];
            c17823.m40450(0, iM40468, bArr7);
            int iM40469 = c17823.m40464();
            byte[] bArr8 = new byte[iM40469];
            c17823.m40450(0, iM40469, bArr8);
            return new C18771(c23780, bArr5, bArr6, bArr7, bArr8, null);
        }
        if (!str.equals("ecdsa-sha2-nistp256") && !str.equals("ecdsa-sha2-nistp384") && !str.equals("ecdsa-sha2-nistp521")) {
            if (!str.equals(OpenSSHPublicKeyUtil.ED_25519) && !str.equals("ssh-ed448")) {
                throw new C14392(C6988.m16053("key type ", str, " is not supported"));
            }
            int iM404610 = c17823.m40464();
            byte[] bArr9 = new byte[iM404610];
            c17823.m40450(0, iM404610, bArr9);
            return str.equals(OpenSSHPublicKeyUtil.ED_25519) ? new C22125(c23780, bArr9, null) : new C11396(c23780, bArr9, null);
        }
        byte[] bArrM40472 = c17823.m40471();
        int iM404611 = c17823.m40464();
        c17823.m40447();
        int i = (iM404611 - 1) / 2;
        byte[] bArr10 = new byte[i];
        byte[] bArr11 = new byte[i];
        c17823.m40450(0, i, bArr10);
        c17823.m40450(0, i, bArr11);
        return new C8713(c23780, bArrM40472, bArr10, bArr11, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m44222(C17823 c17823, int i) {
        byte[] bArr = c17823.f53185;
        int i2 = c17823.f53186;
        byte[] bArr2 = null;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                break;
            }
            int i4 = i2;
            while (bArr.length > i4) {
                int i5 = i4 + 1;
                byte b = bArr[i4];
                if (b == 13 || b == 10) {
                    int i6 = (i5 - i2) - 1;
                    if (bArr2 != null) {
                        if (i6 > 0) {
                            byte[] bArr3 = new byte[bArr2.length + i6];
                            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                            System.arraycopy(bArr, i2, bArr3, bArr2.length, i6);
                            C20764.m46890(bArr2);
                            i4 = i5;
                            bArr2 = bArr3;
                            break;
                        }
                    } else {
                        bArr2 = new byte[i6];
                        System.arraycopy(bArr, i2, bArr2, 0, i6);
                    }
                    i4 = i5;
                    break;
                }
                i4 = i5;
            }
            if (i4 < bArr.length && bArr[i4] == 10) {
                i4++;
            }
            i2 = i4;
            i = i3;
        }
        if (bArr2 != null) {
            c17823.f53186 = i2;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m44221(C17823 c17823, HashMap map) {
        String strM46879;
        int i;
        String strM468710;
        byte[] bArr = c17823.f53185;
        int i2 = c17823.f53186;
        int i3 = i2;
        while (true) {
            strM46879 = null;
            if (i3 < bArr.length) {
                byte b = bArr[i3];
                if (b == 13 || b == 10) {
                    int i4 = i3 + 1;
                    if (i4 < bArr.length) {
                        byte b2 = bArr[i4];
                    }
                } else {
                    if (b == 58) {
                        strM468710 = C20764.m46879(i2, i3 - i2, bArr);
                        int i5 = i3 + 1;
                        if (i5 < bArr.length && bArr[i5] == 32) {
                            i = i3 + 2;
                            break;
                        }
                        i = i5;
                        break;
                    }
                    i3++;
                }
            }
            i = i2;
            strM468710 = null;
            break;
        }
        if (strM468710 == null) {
            return false;
        }
        for (int i6 = i; i6 < bArr.length; i6++) {
            byte b3 = bArr[i6];
            if (b3 == 13 || b3 == 10) {
                strM46879 = C20764.m46879(i, i6 - i, bArr);
                i = i6 + 1;
                if (i >= bArr.length || bArr[i] != 10) {
                    break;
                    break;
                }
                i = i6 + 2;
                break;
            }
        }
        if (strM46879 != null) {
            map.put(strM468710, strM46879);
            c17823.f53186 = i;
        }
        return strM46879 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44227(AbstractC19442 abstractC19442) {
        this.f59230 = abstractC19442.f59230;
        this.f59223 = abstractC19442.f59223;
        this.f59222 = abstractC19442.f59222;
        this.f59221 = abstractC19442.f59221;
    }
}
