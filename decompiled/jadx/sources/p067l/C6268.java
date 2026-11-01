package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۘᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A774 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6268 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f15851;

    /* JADX INFO: renamed from: ۜ */
    public final String f15852;

    /* JADX INFO: renamed from: ۢ */
    public final String f15853;

    /* JADX INFO: renamed from: ۧ */
    public final String f15854;

    /* JADX INFO: renamed from: ܳ */
    public final int f15855;

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f15856;

    /* JADX INFO: renamed from: ܿ */
    public final String f15857;

    /* JADX INFO: renamed from: ᩳ */
    public final String f15858;

    /* JADX INFO: renamed from: ᩷ */
    public final String f15859;

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] f15860;

    public C6268(int i, String str, byte[] bArr, byte[] bArr2, String str2, String str3, byte[] bArr3, String str4, String str5) {
        this.f15855 = i;
        this.f15853 = str;
        this.f15859 = str4;
        this.f15854 = str5;
        this.f15860 = Arrays.copyOf(bArr, bArr.length);
        this.f15852 = C16111.m36665(bArr);
        this.f15857 = str2;
        this.f15858 = str3;
        this.f15851 = Arrays.copyOf(bArr2, bArr2.length);
        this.f15856 = Arrays.copyOf(bArr3, bArr3.length);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C6268 m14230(int i, String str, String str2, String str3, byte[] bArr) {
        return new C6268(i, str, m14228(i, str), C16111.m36668().digest(bArr), str2, str3, bArr, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6268 m14224(int i, String str, String str2, String str3, byte[] bArr) {
        return new C6268(i, str, m14228(i, str), C16111.m36668().digest(bArr), "missing", C25003.m54909(bArr), bArr, str2, str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6268 m14232(String str, byte[] bArr, String str2) {
        return new C6268(this.f15855, this.f15853, this.f15860, C16111.m36668().digest(bArr), str, str2, bArr, this.f15859, this.f15854);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14234() {
        return this.f15859 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C6268 m14231(AbstractC17043 abstractC17043) throws C5276 {
        String str;
        String str2;
        String name = abstractC17043.getName();
        if (!m14227(name)) {
            throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Invalid resource patch file name.");
        }
        try {
            byte[] bArrM38664 = abstractC17043.m38664();
            C14677 c14677 = new C14677(bArrM38664);
            if (c14677.readInt() != 1297240144) {
                throw new IOException("Unsupported resource patch format");
            }
            int i = c14677.readInt();
            if (i != 1 && i != 2) {
                throw new IOException("Unsupported resource patch format");
            }
            int i2 = c14677.readInt();
            String strM33593 = c14677.m33593();
            if (i < 2 || !c14677.m33585()) {
                str = null;
                str2 = null;
            } else {
                String strM33591 = c14677.m33591();
                String strM33592 = c14677.m33591();
                if (strM33591.isEmpty() || strM33592.isEmpty()) {
                    throw new IOException("Invalid resource patch identity");
                }
                str = strM33591;
                str2 = strM33592;
            }
            String strM33594 = c14677.m33593();
            String strM33595 = c14677.m33593();
            byte[] bArr = new byte[32];
            c14677.m33576(32, bArr);
            int length = c14677.readInt();
            if (length < 0 || length > c14677.available() - 4) {
                throw new IOException("Invalid resource patch payload length");
            }
            byte[] bArr2 = new byte[length];
            c14677.m33576(length, bArr2);
            int i3 = c14677.readInt();
            if (c14677.available() != 0) {
                throw new IOException("Trailing resource patch bytes");
            }
            CRC32 crc32 = new CRC32();
            byte[] bArr3 = i == 1 ? bArr2 : bArrM38664;
            if (i != 1) {
                length = bArrM38664.length - 4;
            }
            crc32.update(bArr3, 0, length);
            if (((int) crc32.getValue()) != i3) {
                throw new IOException("Resource patch CRC mismatch");
            }
            if (!Arrays.equals(bArr, C16111.m36668().digest(bArr2))) {
                throw new IOException("Resource patch entry hash mismatch");
            }
            String strM54909 = C25003.m54909(bArr2);
            if (!strM54909.equals(strM33595) && !"sha256:".concat(C16111.m36665(bArr)).equals(strM33595) && (strM33595.length() != 40 || !C16111.m36665(C16111.m36666().digest(bArr2)).equals(strM33595))) {
                throw new IOException("Resource patch targetVersion mismatch");
            }
            byte[] bArrM14228 = m14228(i2, strM33593);
            if (!name.equals(C16111.m36665(bArrM14228).concat(".bin"))) {
                throw new IOException("Resource patch target hash mismatch");
            }
            return new C6268(i2, strM33593, bArrM14228, bArr, strM33594, strM54909, bArr2, str, str2);
        } catch (Exception e) {
            throw C5276.m11410("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14233(AbstractC17043 abstractC17043) {
        AbstractC17043 abstractC17043M14225 = m14225(abstractC17043, this.f15852);
        abstractC17043M14225.mo37342();
        AbstractC17043 abstractC17043M38678 = abstractC17043M14225.m38678(".resource_patch");
        try {
            OutputStream outputStreamMo25506 = abstractC17043M38678.mo25506(false);
            try {
                m14226(outputStreamMo25506);
                outputStreamMo25506.close();
                abstractC17043M38678.m38659(abstractC17043M14225, false, true, null);
                if (abstractC17043M38678.mo25094()) {
                    abstractC17043M38678.mo25503();
                }
            } catch (Throwable th) {
                if (outputStreamMo25506 != null) {
                    try {
                        outputStreamMo25506.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC17043M38678.mo25094()) {
                abstractC17043M38678.mo25503();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m14225(AbstractC17043 abstractC17043, String str) {
        return abstractC17043.m38684(str + ".bin");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m14227(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m14228(int i, String str) {
        C11996 c11996 = new C11996(64);
        c11996.writeInt(1);
        c11996.writeInt(i);
        c11996.m27459(str);
        return c11996.m27446(C16111.m36668());
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m14229(ArrayList arrayList, byte[] bArr) {
        ArrayList<C6268> arrayListM14223 = m14223(arrayList);
        C11996 c11996 = new C11996((arrayListM14223.size() * 64) + 64);
        c11996.writeInt(2);
        c11996.write(bArr, 0, bArr.length);
        c11996.writeInt(arrayListM14223.size());
        for (C6268 c6268 : arrayListM14223) {
            c11996.write(c6268.f15860);
            c11996.write(c6268.f15851);
            c11996.m27445(c6268.m14234());
            if (c6268.m14234()) {
                c11996.m27443((CharSequence) c6268.f15859);
                c11996.m27443((CharSequence) c6268.f15854);
            }
            c11996.m27459(c6268.f15858);
        }
        return c11996.m27446(C16111.m36668());
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m14223(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        C8150.sort(arrayList2, C10162.comparing(new C7929(4)));
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14226(OutputStream outputStream) throws IOException {
        C11996 c11996 = new C11996(96);
        c11996.writeInt(1297240144);
        c11996.writeInt(2);
        c11996.writeInt(this.f15855);
        c11996.m27459(this.f15853);
        c11996.m27445(m14234());
        if (m14234()) {
            c11996.m27443((CharSequence) this.f15859);
            c11996.m27443((CharSequence) this.f15854);
        }
        c11996.m27459(this.f15857);
        c11996.m27459(this.f15858);
        c11996.write(this.f15851);
        byte[] bArr = this.f15856;
        c11996.writeInt(bArr.length);
        CRC32 crc32 = new CRC32();
        crc32.update(c11996.m27458(), 0, c11996.size());
        crc32.update(bArr, 0, bArr.length);
        c11996.m27441(outputStream);
        outputStream.write(bArr);
        c11996.m27460();
        c11996.writeInt((int) crc32.getValue());
        c11996.m27441(outputStream);
    }
}
