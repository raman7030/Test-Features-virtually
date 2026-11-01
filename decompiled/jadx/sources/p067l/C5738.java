package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۗ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 466O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5738 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public byte[] f14064;

    /* JADX INFO: renamed from: ۙ */
    public String f14065;

    /* JADX INFO: renamed from: ۟ */
    public C5738 f14068;

    /* JADX INFO: renamed from: ۧ֫ */
    public byte[] f14070;

    /* JADX INFO: renamed from: ۫ */
    public int f14072;

    /* JADX INFO: renamed from: ܳ֫ */
    public String f14075;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f14076;

    /* JADX INFO: renamed from: ܿ֫ */
    public byte[] f14077;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f14078;

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f14079;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f14080;

    /* JADX INFO: renamed from: ᩸ */
    public C10432 f14081;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f14082;

    /* JADX INFO: renamed from: ᩺ */
    public int f14083;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f14084 = 0;

    /* JADX INFO: renamed from: ۬ */
    public long f14073 = -1;

    /* JADX INFO: renamed from: ۜ֫ */
    public long f14067 = -1;

    /* JADX INFO: renamed from: ֫֫ */
    public int f14063 = 0;

    /* JADX INFO: renamed from: ۨ */
    public int f14071 = 0;

    /* JADX INFO: renamed from: ܰ */
    public long f14074 = -1;

    /* JADX INFO: renamed from: ۤ */
    public long f14069 = -1;

    /* JADX INFO: renamed from: ۛ */
    public int f14066 = -1;

    public C5738() {
    }

    public C5738(String str) {
        m12769(str);
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m12776() {
        return this.f14084;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m12793(int i) {
        this.f14084 = i;
    }

    /* JADX INFO: renamed from: ۤ */
    public final boolean m12767() {
        return (this.f14083 & 2048) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m12777() {
        return this.f14083;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m12783(int i) {
        this.f14083 = i;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m12748() {
        return this.f14076;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m12795(int i) {
        this.f14076 = i;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m12789() {
        return (this.f14083 & 1) != 0;
    }

    public final long getTime() {
        return this.f14080;
    }

    public final void setTime(long j) {
        this.f14080 = j;
        m12746();
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m12763() {
        return this.f14072;
    }

    /* JADX INFO: renamed from: ۫ */
    public final long m12772() {
        return ((long) this.f14072) & 4294967295L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12750(int i) {
        this.f14072 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m12774() {
        return this.f14073;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12751(long j) {
        this.f14073 = j;
    }

    public final long getSize() {
        return this.f14067;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12786(long j) {
        this.f14067 = j;
    }

    public final String getName() {
        return this.f14078;
    }

    public final boolean isDirectory() {
        return this.f14078.endsWith("/");
    }

    /* JADX INFO: renamed from: ᩹ */
    public final String m12794() {
        String str = this.f14075;
        return str == null ? this.f14078 : str;
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m12764() {
        return this.f14078.replaceAll("[:\\\\*?<>\"|]", "_").replaceAll("\\s", " ");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12769(String str) {
        if (str == null) {
            str = "";
        }
        this.f14078 = str;
        this.f14075 = null;
        m12746();
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m12782() {
        return this.f14065;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12752(String str) {
        this.f14065 = str;
        m12746();
    }

    /* JADX INFO: renamed from: ֡ */
    public final byte[] m12747() {
        return this.f14070;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12756(C17136 c17136) {
        this.f14070 = C10432.m24122(19796, this.f14070, c17136.m38797());
    }

    /* JADX INFO: renamed from: ۚ */
    public final C17136 m12761() {
        C10432 c10432M24121 = C10432.m24121(19796, this.f14070);
        if (c10432M24121 == null) {
            return null;
        }
        C17136 c17136 = new C17136();
        c17136.m38796(c10432M24121.m24126());
        return c17136;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m12788() {
        return this.f14082;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12781(byte[] bArr) {
        this.f14070 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12757(byte[] bArr) {
        this.f14082 = bArr;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m12790() {
        return this.f14063;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m12775(int i) {
        this.f14063 = i;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m12765() {
        return this.f14071;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12785(int i) {
        this.f14071 = i;
    }

    /* JADX INFO: renamed from: ۗ */
    public final int m12759() {
        if (this.f14084 != 3) {
            return 0;
        }
        return (this.f14071 >> 16) & 65535;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m12766() {
        return this.f14066;
    }

    /* JADX INFO: renamed from: ܰ */
    public final boolean m12773() {
        return this.f14066 == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12779(int i) {
        this.f14066 = i;
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m12758() {
        return this.f14074;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12780(long j) {
        this.f14074 = j;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m12792() {
        return this.f14069;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12768(long j) {
        this.f14069 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12749() {
        C10432 c10432 = this.f14081;
        C12826.requireNonNull(c10432);
        return c10432.m24126()[4] & 255;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m12778() throws IOException {
        C10432 c10432 = this.f14081;
        if (c10432 == null || c10432.m24126().length < 2) {
            throw new IOException(C10965.m25286(new StringBuilder("Missing or invalid AES extra data ("), this.f14078, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        byte[] bArrM24126 = this.f14081.m24126();
        return ((bArrM24126[1] & 255) << 8) | (bArrM24126[0] & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12755(C10432 c10432) {
        this.f14081 = c10432;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m12784(byte[] bArr) throws IOException {
        C10432 c10432M24121 = C10432.m24121(1, bArr);
        int i = 0;
        if (c10432M24121 != null) {
            if (this.f14067 == 4294967295L) {
                this.f14067 = c10432M24121.m24125(0);
                i = 8;
            }
            if (this.f14073 == 4294967295L) {
                this.f14073 = c10432M24121.m24125(i);
                i += 8;
            }
            if (this.f14074 == 4294967295L) {
                this.f14074 = c10432M24121.m24125(i);
            }
            return true;
        }
        if (this.f14073 != 4294967295L && this.f14067 != 4294967295L && this.f14074 != 4294967295L) {
            return false;
        }
        throw new IOException("File contains no zip64 extended information: name=" + new String(this.f14077) + ", compressedSize=" + this.f14073 + ", size=" + this.f14067 + ", headerOffset=" + this.f14074 + ", extra=" + C16111.m36665(bArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12753(Charset charset, boolean z, boolean z2) {
        byte[] bArr = this.f14070;
        if (bArr == null || bArr.length == 0) {
            z = false;
        }
        String strM12745 = z ? m12745(C10432.m24121(28789, bArr), this.f14077) : null;
        if (strM12745 == null) {
            strM12745 = new String(this.f14077, charset);
        }
        if (!z2 && strM12745.indexOf(92) != -1 && strM12745.indexOf(47) == -1) {
            this.f14078 = strM12745.replace('\\', '/');
            this.f14075 = strM12745;
        } else {
            this.f14078 = strM12745;
            this.f14075 = null;
        }
        this.f14077 = null;
        if (this.f14064 == null) {
            return;
        }
        String strM12746 = z ? m12745(C10432.m24121(25461, this.f14070), this.f14064) : null;
        if (strM12746 == null) {
            strM12746 = new String(this.f14064, charset);
        }
        m12752(strM12746);
        this.f14064 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m12745(C10432 c10432, byte[] bArr) throws EOFException {
        byte[] bArrM24126;
        int length;
        if (c10432 == null || bArr == null || (length = (bArrM24126 = c10432.m24126()).length) < 5 || c10432.m24128() != 1) {
            return null;
        }
        int iM24127 = c10432.m24127();
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        if (iM24127 != ((int) crc32.getValue())) {
            return null;
        }
        return new String(bArrM24126, 5, length - 5, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12787(byte[] bArr) {
        this.f14077 = bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12770(byte[] bArr) {
        this.f14064 = bArr;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final String m12791() {
        if (this.f14078.isEmpty()) {
            return "";
        }
        int length = this.f14078.length();
        int i = length - 1;
        if (this.f14078.charAt(i) == '/') {
            i = length - 2;
        }
        return this.f14078.substring(this.f14078.lastIndexOf(47, i) + 1, i + 1);
    }

    public final String getParent() {
        if (this.f14078.isEmpty()) {
            return null;
        }
        int length = this.f14078.length();
        int i = length - 1;
        if (this.f14078.charAt(i) == '/') {
            i = length - 2;
        }
        int iLastIndexOf = this.f14078.lastIndexOf(47, i) + 1;
        return iLastIndexOf == 0 ? "" : this.f14078.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12754(C5738 c5738) {
        this.f14068 = c5738;
        if (c5738.f14079 == null) {
            c5738.f14079 = new ArrayList();
        }
        c5738.f14079.add(this);
        ArrayList<C5738> arrayList = this.f14079;
        if (arrayList != null) {
            this.f14079 = null;
            for (C5738 c5739 : arrayList) {
                c5739.f14068 = null;
                c5739.m12754(c5738);
            }
        }
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m12762() {
        return this.f14079 != null;
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m12771() {
        return this.f14068 != null;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C5738 m12760() {
        return this.f14068;
    }

    /* JADX INFO: renamed from: ۟ */
    private void m12746() {
        C5738 c5738 = this.f14068;
        if (c5738 != null) {
            c5738.f14079.remove(this);
            if (c5738.f14079.isEmpty()) {
                c5738.f14079 = null;
            }
            this.f14068 = null;
        }
    }

    public final C5738 clone() {
        try {
            C5738 c5738 = (C5738) super.clone();
            C10432 c10432 = this.f14081;
            if (c10432 != null) {
                c5738.f14081 = c10432.m56416clone();
            }
            return c5738;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
