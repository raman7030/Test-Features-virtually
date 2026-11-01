package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۨۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13430 implements InterfaceC14100 {

    /* JADX INFO: renamed from: ܳ */
    public static final C8065 f37721 = new C8065(0, null);

    /* JADX INFO: renamed from: ֫ */
    public volatile CRC32 f37722;

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f37723;

    /* JADX INFO: renamed from: ܽ */
    public final File f37724;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f37725;

    /* JADX INFO: renamed from: ᩳ */
    public final int f37726;

    /* JADX INFO: renamed from: ۧ */
    private synchronized CRC32 m30577() {
        if (this.f37722 == null) {
            return new CRC32();
        }
        CRC32 crc32 = this.f37722;
        this.f37722 = null;
        return crc32;
    }

    public C13430(File file) {
        int iHashCode = file.getName().hashCode() ^ C7050.m16200().uid;
        this.f37725 = new HashMap();
        this.f37723 = new ConcurrentMapC12768();
        this.f37722 = new CRC32();
        this.f37724 = file;
        this.f37726 = iHashCode;
    }

    @Override // p067l.InterfaceC14100
    public final boolean contains(String str) {
        C8065 c8065 = (C8065) this.f37723.get(str);
        if (c8065 == null) {
            synchronized (this) {
                c8065 = (C8065) this.f37723.get(str);
                if (c8065 == null) {
                    if (m30578(str).m51090()) {
                        return true;
                    }
                    this.f37723.putIfAbsent(str, f37721);
                    return false;
                }
            }
        }
        return c8065 != f37721;
    }

    @Override // p067l.InterfaceC14100
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20200(int i, String str) {
        return m30579(i, str) != null;
    }

    @Override // p067l.InterfaceC14100
    public final InterfaceC14770 edit() {
        return new C12089(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public C22876 m30578(String str) {
        HashMap map = this.f37725;
        C22876 c22876 = (C22876) map.get(str);
        if (c22876 != null) {
            return c22876;
        }
        byte[] bytes = str.getBytes();
        int length = this.f37726 ^ bytes.length;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ ((byte) (i ^ length)));
        }
        String strReplace = AbstractC13119.m30013().m30014(bytes).replace(C0184a.f880h, '1');
        if (strReplace.length() > 255) {
            throw new RuntimeException("Key too long: ".concat(strReplace));
        }
        C22876 c22877 = new C22876(new File(this.f37724, strReplace));
        map.put(strReplace, c22877);
        return c22877;
    }

    @Override // p067l.InterfaceC14100
    public final boolean getBoolean(String str, boolean z) {
        byte[] bArrM30579 = m30579(17, str);
        if (bArrM30579 != null && bArrM30579.length == 1) {
            z = false;
            if (bArrM30579[0] != 0) {
                return true;
            }
        }
        return z;
    }

    @Override // p067l.InterfaceC14100
    public final float getFloat(String str, float f) {
        byte[] bArrM30579 = m30579(23, str);
        return (bArrM30579 == null || bArrM30579.length != 4) ? f : Float.intBitsToFloat(C17548.m39928(0, bArrM30579));
    }

    @Override // p067l.InterfaceC14100
    public final int getInt(String str, int i) {
        byte[] bArrM30579 = m30579(21, str);
        return (bArrM30579 == null || bArrM30579.length != 4) ? i : C17548.m39928(0, bArrM30579);
    }

    @Override // p067l.InterfaceC14100
    public final long getLong(String str, long j) {
        byte[] bArrM30579 = m30579(22, str);
        return (bArrM30579 == null || bArrM30579.length != 8) ? j : C17548.m39939(0, bArrM30579);
    }

    @Override // p067l.InterfaceC14100
    public final String getString(String str, String str2) {
        byte[] bArrM30579 = m30579(16, str);
        return bArrM30579 == null ? str2 : new String(bArrM30579, Charset.defaultCharset());
    }

    @Override // p067l.InterfaceC14100
    /* JADX INFO: renamed from: ֫ */
    public final byte mo20199(byte b, String str) {
        byte[] bArrM30579 = m30579(18, str);
        return (bArrM30579 == null || bArrM30579.length != 1) ? b : bArrM30579[0];
    }

    @Override // p067l.InterfaceC14100
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo20201(String str, byte[] bArr) {
        byte[] bArrM30579 = m30579(25, str);
        return bArrM30579 == null ? bArr : (byte[]) bArrM30579.clone();
    }

    @Override // p067l.InterfaceC14100
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo20202(String str) {
        byte[] bArrM30579 = m30579(26, str);
        if (bArrM30579 == null || bArrM30579.length % 4 != 0) {
            return null;
        }
        int length = bArrM30579.length / 4;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = C17548.m39928(i * 4, bArrM30579);
        }
        return iArr;
    }

    @Override // p067l.InterfaceC14100
    /* JADX INFO: renamed from: ֫ */
    public final String[] mo20203(String str, String[] strArr) {
        byte[] bArrM30579 = m30579(27, str);
        if (bArrM30579 == null) {
            return strArr;
        }
        C14677 c14677 = new C14677(bArrM30579);
        int iM33581 = c14677.m33581();
        String[] strArr2 = new String[iM33581];
        for (int i = 0; i < iM33581; i++) {
            strArr2[i] = c14677.m33593();
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: ۧ */
    private byte[] m30579(int i, String str) {
        C8065 c8065 = (C8065) this.f37723.get(str);
        if (c8065 == null) {
            synchronized (this) {
                c8065 = (C8065) this.f37723.get(str);
                if (c8065 == null) {
                    return m30580(i, str);
                }
            }
        }
        if (c8065 != f37721 && c8065.f21281 == i) {
            return c8065.f21280;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    private byte[] m30580(int i, String str) {
        int iHashCode = this.f37726 ^ str.hashCode();
        try {
            byte[] bArrM51087 = m30578(str).m51087();
            if (bArrM51087.length < 3) {
                return null;
            }
            int i2 = (bArrM51087[2] ^ iHashCode) & 255;
            int length = bArrM51087.length - 3;
            byte[] bArr = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                bArr[i3] = (byte) (bArrM51087[i3 + 3] ^ iHashCode);
            }
            int iM39944 = C17548.m39944(0, bArrM51087);
            CRC32 crc32M30577 = m30577();
            crc32M30577.update(i2);
            crc32M30577.update(bArr);
            int value = (int) (crc32M30577.getValue() & 255);
            synchronized (this) {
                if (this.f37722 == null) {
                    crc32M30577.reset();
                    this.f37722 = crc32M30577;
                }
            }
            if (iM39944 != value) {
                return null;
            }
            if (length < 10240) {
                this.f37723.putIfAbsent(str, new C8065(i2, bArr));
            }
            if (i2 == i) {
                return bArr;
            }
            return null;
        } catch (FileNotFoundException unused) {
            this.f37723.putIfAbsent(str, f37721);
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30575(C13430 c13430, String str, C8065 c8065, byte[] bArr, CRC32 crc32) throws Exception {
        FileOutputStream fileOutputStreamM51091;
        int i = c8065.f21281;
        byte[] bArr2 = c8065.f21280;
        int length = bArr2.length + 3;
        if (bArr.length < length) {
            bArr = new byte[length];
        }
        int iHashCode = c13430.f37726 ^ str.hashCode();
        crc32.reset();
        crc32.update(i);
        crc32.update(bArr2);
        int value = (int) (crc32.getValue() & 255);
        bArr[2] = (byte) (i ^ iHashCode);
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i2 + 3] = (byte) (bArr2[i2] ^ iHashCode);
        }
        C17548.m39941(0, value, bArr);
        C22876 c22876M30578 = c13430.m30578(str);
        try {
            fileOutputStreamM51091 = c22876M30578.m51091();
            try {
                fileOutputStreamM51091.write(bArr, 0, length);
                fileOutputStreamM51091.flush();
                c22876M30578.m51085(fileOutputStreamM51091);
            } catch (Exception e) {
                e = e;
                c22876M30578.m51084(fileOutputStreamM51091);
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStreamM51091 = null;
        }
    }
}
