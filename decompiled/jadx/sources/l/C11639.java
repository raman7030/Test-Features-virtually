package l;

import com.alipay.sdk.m.p.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۨۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11639 implements InterfaceC12344 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C5994 f34724 = new C5994(0, null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile CRC32 f34725;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f34726;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File f34727;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f34728;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f34729;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private synchronized CRC32 m28529() {
        if (this.f34725 == null) {
            return new CRC32();
        }
        CRC32 crc32 = this.f34725;
        this.f34725 = null;
        return crc32;
    }

    public C11639(File file) {
        int iHashCode = file.getName().hashCode() ^ C4925.m14303().uid;
        this.f34728 = new HashMap();
        this.f34726 = new ConcurrentMapC10942();
        this.f34725 = new CRC32();
        this.f34727 = file;
        this.f34729 = iHashCode;
    }

    @Override // l.InterfaceC12344
    public final boolean contains(String str) {
        C5994 c5994 = (C5994) this.f34726.get(str);
        if (c5994 == null) {
            synchronized (this) {
                c5994 = (C5994) this.f34726.get(str);
                if (c5994 == null) {
                    if (m28530(str).m48744()) {
                        return true;
                    }
                    this.f34726.putIfAbsent(str, f34724);
                    return false;
                }
            }
        }
        return c5994 != f34724;
    }

    @Override // l.InterfaceC12344
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18252(int i, String str) {
        return m28531(i, str) != null;
    }

    @Override // l.InterfaceC12344
    public final InterfaceC13049 edit() {
        return new C10228(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21578 m28530(String str) {
        HashMap map = this.f34728;
        C21578 c21578 = (C21578) map.get(str);
        if (c21578 != null) {
            return c21578;
        }
        byte[] bytes = str.getBytes();
        int length = this.f34729 ^ bytes.length;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ ((byte) (i ^ length)));
        }
        String strReplace = AbstractC11311.m27952().m27953(bytes).replace(a.h, '1');
        if (strReplace.length() > 255) {
            throw new RuntimeException("Key too long: ".concat(strReplace));
        }
        C21578 c21579 = new C21578(new File(this.f34727, strReplace));
        map.put(strReplace, c21579);
        return c21579;
    }

    @Override // l.InterfaceC12344
    public final boolean getBoolean(String str, boolean z) {
        byte[] bArrM28531 = m28531(17, str);
        if (bArrM28531 != null && bArrM28531.length == 1) {
            z = false;
            if (bArrM28531[0] != 0) {
                return true;
            }
        }
        return z;
    }

    @Override // l.InterfaceC12344
    public final float getFloat(String str, float f) {
        byte[] bArrM28531 = m28531(23, str);
        return (bArrM28531 == null || bArrM28531.length != 4) ? f : Float.intBitsToFloat(C15972.m37744(0, bArrM28531));
    }

    @Override // l.InterfaceC12344
    public final int getInt(String str, int i) {
        byte[] bArrM28531 = m28531(21, str);
        return (bArrM28531 == null || bArrM28531.length != 4) ? i : C15972.m37744(0, bArrM28531);
    }

    @Override // l.InterfaceC12344
    public final long getLong(String str, long j) {
        byte[] bArrM28531 = m28531(22, str);
        return (bArrM28531 == null || bArrM28531.length != 8) ? j : C15972.m37755(0, bArrM28531);
    }

    @Override // l.InterfaceC12344
    public final String getString(String str, String str2) {
        byte[] bArrM28531 = m28531(16, str);
        return bArrM28531 == null ? str2 : new String(bArrM28531, Charset.defaultCharset());
    }

    @Override // l.InterfaceC12344
    /* JADX INFO: renamed from: ֫ */
    public final byte mo18251(byte b, String str) {
        byte[] bArrM28531 = m28531(18, str);
        return (bArrM28531 == null || bArrM28531.length != 1) ? b : bArrM28531[0];
    }

    @Override // l.InterfaceC12344
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo18253(String str, byte[] bArr) {
        byte[] bArrM28531 = m28531(25, str);
        return bArrM28531 == null ? bArr : (byte[]) bArrM28531.clone();
    }

    @Override // l.InterfaceC12344
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo18254(String str) {
        byte[] bArrM28531 = m28531(26, str);
        if (bArrM28531 == null || bArrM28531.length % 4 != 0) {
            return null;
        }
        int length = bArrM28531.length / 4;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = C15972.m37744(i * 4, bArrM28531);
        }
        return iArr;
    }

    @Override // l.InterfaceC12344
    /* JADX INFO: renamed from: ֫ */
    public final String[] mo18255(String str, String[] strArr) {
        byte[] bArrM28531 = m28531(27, str);
        if (bArrM28531 == null) {
            return strArr;
        }
        C12951 c12951 = new C12951(bArrM28531);
        int iM31494 = c12951.m31494();
        String[] strArr2 = new String[iM31494];
        for (int i = 0; i < iM31494; i++) {
            strArr2[i] = c12951.m31506();
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private byte[] m28531(int i, String str) {
        C5994 c5994 = (C5994) this.f34726.get(str);
        if (c5994 == null) {
            synchronized (this) {
                c5994 = (C5994) this.f34726.get(str);
                if (c5994 == null) {
                    return m28532(i, str);
                }
            }
        }
        if (c5994 != f34724 && c5994.f18430 == i) {
            return c5994.f18429;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m28532(int i, String str) {
        int iHashCode = this.f34729 ^ str.hashCode();
        try {
            byte[] bArrM48741 = m28530(str).m48741();
            if (bArrM48741.length < 3) {
                return null;
            }
            int i2 = (bArrM48741[2] ^ iHashCode) & 255;
            int length = bArrM48741.length - 3;
            byte[] bArr = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                bArr[i3] = (byte) (bArrM48741[i3 + 3] ^ iHashCode);
            }
            int iM37760 = C15972.m37760(0, bArrM48741);
            CRC32 crc32M28529 = m28529();
            crc32M28529.update(i2);
            crc32M28529.update(bArr);
            int value = (int) (crc32M28529.getValue() & 255);
            synchronized (this) {
                if (this.f34725 == null) {
                    crc32M28529.reset();
                    this.f34725 = crc32M28529;
                }
            }
            if (iM37760 != value) {
                return null;
            }
            if (length < 10240) {
                this.f34726.putIfAbsent(str, new C5994(i2, bArr));
            }
            if (i2 == i) {
                return bArr;
            }
            return null;
        } catch (FileNotFoundException unused) {
            this.f34726.putIfAbsent(str, f34724);
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28527(C11639 c11639, String str, C5994 c5994, byte[] bArr, CRC32 crc32) throws Exception {
        FileOutputStream fileOutputStreamM48745;
        int i = c5994.f18430;
        byte[] bArr2 = c5994.f18429;
        int length = bArr2.length + 3;
        if (bArr.length < length) {
            bArr = new byte[length];
        }
        int iHashCode = c11639.f34729 ^ str.hashCode();
        crc32.reset();
        crc32.update(i);
        crc32.update(bArr2);
        int value = (int) (crc32.getValue() & 255);
        bArr[2] = (byte) (i ^ iHashCode);
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i2 + 3] = (byte) (bArr2[i2] ^ iHashCode);
        }
        C15972.m37757(0, value, bArr);
        C21578 c21578M28530 = c11639.m28530(str);
        try {
            fileOutputStreamM48745 = c21578M28530.m48745();
            try {
                fileOutputStreamM48745.write(bArr, 0, length);
                fileOutputStreamM48745.flush();
                c21578M28530.m48739(fileOutputStreamM48745);
            } catch (Exception e) {
                e = e;
                c21578M28530.m48738(fileOutputStreamM48745);
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStreamM48745 = null;
        }
    }
}
