package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۘᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A774 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4103 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f13037;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f13038;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f13039;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f13040;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f13041;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f13042;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f13043;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f13044;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f13045;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f13046;

    public C4103(int i, String str, byte[] bArr, byte[] bArr2, String str2, String str3, byte[] bArr3, String str4, String str5) {
        this.f13041 = i;
        this.f13039 = str;
        this.f13045 = str4;
        this.f13040 = str5;
        this.f13046 = Arrays.copyOf(bArr, bArr.length);
        this.f13038 = C14460.m34531(bArr);
        this.f13043 = str2;
        this.f13044 = str3;
        this.f13037 = Arrays.copyOf(bArr2, bArr2.length);
        this.f13042 = Arrays.copyOf(bArr3, bArr3.length);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4103 m12325(int i, String str, String str2, String str3, byte[] bArr) {
        return new C4103(i, str, m12323(i, str), C14460.m34534().digest(bArr), str2, str3, bArr, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4103 m12319(int i, String str, String str2, String str3, byte[] bArr) {
        return new C4103(i, str, m12323(i, str), C14460.m34534().digest(bArr), "missing", C23816.m52500(bArr), bArr, str2, str3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4103 m12327(String str, byte[] bArr, String str2) {
        return new C4103(this.f13041, this.f13039, this.f13046, C14460.m34534().digest(bArr), str, str2, bArr, this.f13045, this.f13040);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12329() {
        return this.f13045 != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4103 m12326(AbstractC15440 abstractC15440) throws C3059 {
        String str;
        String str2;
        String name = abstractC15440.getName();
        if (!m12322(name)) {
            throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Invalid resource patch file name.");
        }
        try {
            byte[] bArrM36506 = abstractC15440.m36506();
            C12951 c12951 = new C12951(bArrM36506);
            if (c12951.readInt() != 1297240144) {
                throw new IOException("Unsupported resource patch format");
            }
            int i = c12951.readInt();
            if (i != 1 && i != 2) {
                throw new IOException("Unsupported resource patch format");
            }
            int i2 = c12951.readInt();
            String strM31506 = c12951.m31506();
            if (i < 2 || !c12951.m31498()) {
                str = null;
                str2 = null;
            } else {
                String strM31504 = c12951.m31504();
                String strM31505 = c12951.m31504();
                if (strM31504.isEmpty() || strM31505.isEmpty()) {
                    throw new IOException("Invalid resource patch identity");
                }
                str = strM31504;
                str2 = strM31505;
            }
            String strM31507 = c12951.m31506();
            String strM31508 = c12951.m31506();
            byte[] bArr = new byte[32];
            c12951.m31489(32, bArr);
            int length = c12951.readInt();
            if (length < 0 || length > c12951.available() - 4) {
                throw new IOException("Invalid resource patch payload length");
            }
            byte[] bArr2 = new byte[length];
            c12951.m31489(length, bArr2);
            int i3 = c12951.readInt();
            if (c12951.available() != 0) {
                throw new IOException("Trailing resource patch bytes");
            }
            CRC32 crc32 = new CRC32();
            byte[] bArr3 = i == 1 ? bArr2 : bArrM36506;
            if (i != 1) {
                length = bArrM36506.length - 4;
            }
            crc32.update(bArr3, 0, length);
            if (((int) crc32.getValue()) != i3) {
                throw new IOException("Resource patch CRC mismatch");
            }
            if (!Arrays.equals(bArr, C14460.m34534().digest(bArr2))) {
                throw new IOException("Resource patch entry hash mismatch");
            }
            String strM52500 = C23816.m52500(bArr2);
            if (!strM52500.equals(strM31508) && !"sha256:".concat(C14460.m34531(bArr)).equals(strM31508) && (strM31508.length() != 40 || !C14460.m34531(C14460.m34532().digest(bArr2)).equals(strM31508))) {
                throw new IOException("Resource patch targetVersion mismatch");
            }
            byte[] bArrM12323 = m12323(i2, strM31506);
            if (!name.equals(C14460.m34531(bArrM12323).concat(".bin"))) {
                throw new IOException("Resource patch target hash mismatch");
            }
            return new C4103(i2, strM31506, bArrM12323, bArr, strM31507, strM52500, bArr2, str, str2);
        } catch (Exception e) {
            throw C3059.m9368("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12328(AbstractC15440 abstractC15440) {
        AbstractC15440 abstractC15440M12320 = m12320(abstractC15440, this.f13038);
        abstractC15440M12320.mo35195();
        AbstractC15440 abstractC15440M36520 = abstractC15440M12320.m36520(".resource_patch");
        try {
            OutputStream outputStreamMo23555 = abstractC15440M36520.mo23555(false);
            try {
                m12321(outputStreamMo23555);
                outputStreamMo23555.close();
                abstractC15440M36520.m36501(abstractC15440M12320, false, true, null);
                if (abstractC15440M36520.mo23120()) {
                    abstractC15440M36520.mo23552();
                }
            } catch (Throwable th) {
                if (outputStreamMo23555 != null) {
                    try {
                        outputStreamMo23555.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC15440M36520.mo23120()) {
                abstractC15440M36520.mo23552();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m12320(AbstractC15440 abstractC15440, String str) {
        return abstractC15440.m36526(str + ".bin");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m12322(String str) {
        if (str == null || str.length() != 68 || !str.endsWith(".bin")) {
            return false;
        }
        for (int i = 0; i < 64; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m12323(int i, String str) {
        C10130 c10130 = new C10130(64);
        c10130.writeInt(1);
        c10130.writeInt(i);
        c10130.m25439(str);
        return c10130.m25426(C14460.m34534());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m12324(ArrayList arrayList, byte[] bArr) {
        ArrayList<C4103> arrayListM12318 = m12318(arrayList);
        C10130 c10130 = new C10130((arrayListM12318.size() * 64) + 64);
        c10130.writeInt(2);
        c10130.write(bArr, 0, bArr.length);
        c10130.writeInt(arrayListM12318.size());
        for (C4103 c4103 : arrayListM12318) {
            c10130.write(c4103.f13046);
            c10130.write(c4103.f13037);
            c10130.m25425(c4103.m12329());
            if (c4103.m12329()) {
                c10130.m25423((CharSequence) c4103.f13045);
                c10130.m25423((CharSequence) c4103.f13040);
            }
            c10130.m25439(c4103.f13044);
        }
        return c10130.m25426(C14460.m34534());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m12318(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        C6083.sort(arrayList2, C8200.comparing(new C5851(4)));
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12321(OutputStream outputStream) throws IOException {
        C10130 c10130 = new C10130(96);
        c10130.writeInt(1297240144);
        c10130.writeInt(2);
        c10130.writeInt(this.f13041);
        c10130.m25439(this.f13039);
        c10130.m25425(m12329());
        if (m12329()) {
            c10130.m25423((CharSequence) this.f13045);
            c10130.m25423((CharSequence) this.f13040);
        }
        c10130.m25439(this.f13043);
        c10130.m25439(this.f13044);
        c10130.write(this.f13037);
        byte[] bArr = this.f13042;
        c10130.writeInt(bArr.length);
        CRC32 crc32 = new CRC32();
        crc32.update(c10130.m25438(), 0, c10130.size());
        crc32.update(bArr, 0, bArr.length);
        c10130.m25421(outputStream);
        outputStream.write(bArr);
        c10130.m25440();
        c10130.writeInt((int) crc32.getValue());
        c10130.m25421(outputStream);
    }
}
