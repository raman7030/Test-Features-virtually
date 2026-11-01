package p067l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.List;
import java.util.Set;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes.dex */
public class C14645 implements InterfaceC17213 {

    /* JADX INFO: renamed from: ֡ */
    public int f41809;

    /* JADX INFO: renamed from: ֨ */
    public int f41810;

    /* JADX INFO: renamed from: ֫ */
    public C19340 f41811;

    /* JADX INFO: renamed from: ۖ */
    public int f41812;

    /* JADX INFO: renamed from: ۘ */
    public int f41813;

    /* JADX INFO: renamed from: ۚ */
    public boolean f41814;

    /* JADX INFO: renamed from: ۜ */
    public int f41815;

    /* JADX INFO: renamed from: ۠ */
    public int f41816;

    /* JADX INFO: renamed from: ۡ */
    public final C2582 f41817;

    /* JADX INFO: renamed from: ۢ */
    public final C2582 f41818;

    /* JADX INFO: renamed from: ۧ */
    public int f41819;

    /* JADX INFO: renamed from: ܳ */
    public int f41820;

    /* JADX INFO: renamed from: ܶ */
    public Object f41821;

    /* JADX INFO: renamed from: ܺ */
    public int f41822;

    /* JADX INFO: renamed from: ܽ */
    public int f41823;

    /* JADX INFO: renamed from: ܿ */
    public boolean f41824;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6086 f41825;

    /* JADX INFO: renamed from: ᩴ */
    public final C9873 f41826;

    /* JADX INFO: renamed from: ᩵ */
    public int f41827;

    /* JADX INFO: renamed from: ᩷ */
    public final C2582 f41828;

    /* JADX INFO: renamed from: ᩸ */
    public int f41829;

    /* JADX INFO: renamed from: ᩹ */
    public int f41830;

    /* JADX INFO: renamed from: ᩻ */
    public int f41831;

    static {
        ApplicationC14266.m56479(IShizukuService.Stub.TRANSACTION_isHidden);
    }

    public native C14645(AbstractC6086 abstractC6086, C9873 c9873);

    public native C14645(C9873 c9873, AbstractC6086 abstractC6086, boolean z, boolean z2);

    public C14645(byte[] bArr, int i, boolean z) {
        this(null, new C24151(bArr, i), z, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14645 m33466(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        C12461.m28690(inputStream);
        return new C14645(C19824.m45068(inputStream), 0, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14645 m33467(byte[] bArr) {
        return new C14645(bArr, 0, true);
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m33484() {
        return this.f41815;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6086 m33504() {
        return this.f41825;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C24151 m33502() {
        AbstractC6086 abstractC6086 = this.f41825;
        if (abstractC6086 instanceof C24151) {
            return (C24151) abstractC6086;
        }
        throw new RuntimeException();
    }

    @Override // p067l.InterfaceC17213
    /* JADX INFO: renamed from: ֫ */
    public final C9873 mo29499() {
        return this.f41826;
    }

    @Override // p067l.InterfaceC17213
    /* JADX INFO: renamed from: ۧ */
    public final Set mo29500() {
        return new C16656(this);
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m33483(int i) {
        int i2 = this.f41815;
        if (i2 == 0) {
            return 0;
        }
        int iMo13857 = this.f41825.mo13857((i * 4) + i2 + 4);
        if (iMo13857 == 0) {
            return 0;
        }
        return this.f41815 + iMo13857;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33500() {
        this.f41824 = false;
        this.f41811.m44077();
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m33488(int i) {
        if (i < 0 || i >= this.f41810) {
            throw new C6599(null, "String index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f41816;
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m33480(int i) {
        if (i < 0 || i >= this.f41829) {
            throw new C6599(null, "Type index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f41830;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33490(int i) {
        if (i < 0 || i >= this.f41820) {
            throw new C6599(null, "Field index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f41831;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m33501(int i) {
        if (i < 0 || i >= this.f41812) {
            throw new C6599(null, "Method index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f41813;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m33485(int i) {
        if (i < 0 || i >= this.f41827) {
            throw new C6599(null, "Proto index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 12) + this.f41809;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m33469(int i) {
        if (i < 0 || i >= this.f41819) {
            throw new C6599(null, "Class index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 32) + this.f41823;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m33494() {
        return this.f41819;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m33496() {
        return this.f41810;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m33482() {
        return this.f41829;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m33486() {
        return this.f41827;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m33509() {
        return this.f41820;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m33507() {
        return this.f41812;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m33508(int i) {
        boolean z = this.f41824;
        String strM44075 = z ? this.f41811.m44075(i) : null;
        if (strM44075 != null) {
            return strM44075;
        }
        int iM33488 = m33488(i);
        AbstractC6086 abstractC6086 = this.f41825;
        C20168 c20168M13859 = abstractC6086.m13859(abstractC6086.mo13855(iM33488));
        String strM45628 = c20168M13859.m45628(c20168M13859.m45635());
        c20168M13859.m45626();
        if (z) {
            this.f41811.m44078(i, strM45628);
        }
        return strM45628;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33492(int i, Writer writer, boolean z) throws IOException {
        if (this.f41824 && !z) {
            writer.write(m33508(i));
        } else {
            m33471(i, writer, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33471(int i, Writer writer, boolean z) {
        int iM33488 = m33488(i);
        AbstractC6086 abstractC6086 = this.f41825;
        C20168 c20168M13859 = abstractC6086.m13859(abstractC6086.mo13855(iM33488));
        c20168M13859.m45624(c20168M13859.m45635(), writer, z);
        c20168M13859.m45626();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33478(int i, int i2, int i3, String str) {
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length()) {
            String strM44075 = this.f41824 ? this.f41811.m44075(i) : null;
            if (strM44075 != null) {
                if (strM44075.length() == i3 && str.regionMatches(i2, strM44075, 0, i3)) {
                    return true;
                }
            } else {
                int iM33488 = m33488(i);
                AbstractC6086 abstractC6086 = this.f41825;
                C20168 c20168M13859 = abstractC6086.m13859(abstractC6086.mo13855(iM33488));
                try {
                    return C9659.m22507(this.f41825, c20168M13859.m45631(), c20168M13859.m45635(), str, i2, i3);
                } finally {
                    c20168M13859.m45626();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m33510(int i) {
        if (i == -1) {
            return null;
        }
        return m33508(i);
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m33487(int i) {
        boolean z = this.f41824;
        String strM44079 = z ? this.f41811.m44079(i) : null;
        if (strM44079 != null) {
            return strM44079;
        }
        String strM33508 = m33508(this.f41825.mo13855(m33480(i)));
        if (z) {
            this.f41811.m44081(i, strM33508);
        }
        return strM33508;
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m33497(int i) {
        return m33487(this.f41825.mo13855(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33472(Writer writer, int i) {
        if (this.f41824) {
            writer.write(m33487(i));
        } else {
            m33492(this.f41825.mo13855(m33480(i)), writer, false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m33493(int i, int i2, int i3, String str) {
        String strM44079 = this.f41824 ? this.f41811.m44079(i) : null;
        if (strM44079 != null) {
            return i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length() && strM44079.length() == i3 && str.regionMatches(i2, strM44079, 0, i3);
        }
        return m33478(this.f41825.mo13855(m33480(i)), i2, i3, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33479(int i, String str) {
        String strM44079 = this.f41824 ? this.f41811.m44079(i) : null;
        int i2 = 0;
        if (strM44079 != null) {
            int i3 = 0;
            while (i3 < strM44079.length() && strM44079.charAt(i3) == '[') {
                i3++;
            }
            return strM44079.length() - i3 == str.length() && strM44079.regionMatches(i3, str, 0, str.length());
        }
        int iM33480 = m33480(i);
        AbstractC6086 abstractC6086 = this.f41825;
        C20168 c20168M13859 = abstractC6086.m13859(abstractC6086.mo13855(m33488(abstractC6086.mo13855(iM33480))));
        try {
            int iM45635 = c20168M13859.m45635();
            int iM45631 = c20168M13859.m45631();
            while (i2 < iM45635 && abstractC6086.m13862(iM45631 + i2) == 91) {
                i2++;
            }
            return C9659.m22507(this.f41825, iM45631 + i2, iM45635 - i2, str, 0, str.length());
        } finally {
            c20168M13859.m45626();
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final List m33505() {
        return new C22693(this);
    }

    /* JADX INFO: renamed from: ۢ */
    public final List m33489() {
        return new C23363(this);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C5472 m33495(int i) {
        if (this.f41824) {
            return this.f41811.m44080(this, i);
        }
        return new C5472(this, i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C16870 m33499(int i) {
        if (this.f41824) {
            return this.f41811.m44076(this, i);
        }
        return new C16870(this, i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4131 m33498(int i, EnumC3167 enumC3167) {
        C4131 c4131 = (C4131) this.f41817.m3892();
        if (c4131 != null) {
            c4131.f32110 = enumC3167;
            c4131.f32112 = i;
            return c4131;
        }
        return new C4131(this, enumC3167, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33474(C4131 c4131) {
        this.f41817.m3890(c4131);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21825 m33491(int i, EnumC3167 enumC3167) {
        C21825 c21825 = (C21825) this.f41818.m3892();
        if (c21825 != null) {
            c21825.f32110 = enumC3167;
            c21825.f32112 = i;
            return c21825;
        }
        return new C21825(this, enumC3167, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33476(C21825 c21825) {
        this.f41818.m3890(c21825);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5061 m33470(int i, EnumC3167 enumC3167) {
        C5061 c5061 = (C5061) this.f41828.m3892();
        if (c5061 == null) {
            return new C5061(this, enumC3167, i);
        }
        c5061.f32110 = enumC3167;
        c5061.f32112 = i;
        return c5061;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33475(C5061 c5061) {
        this.f41828.m3890(c5061);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C3460 m33503(int i) {
        for (C3460 c3460 : new C21352(this, this.f41825.mo13855(this.f41822))) {
            if (c3460.m6189() == i) {
                return c3460;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33473(Object obj) {
        this.f41821 = obj;
    }

    /* JADX INFO: renamed from: ۖ */
    public final Object m33481() {
        return this.f41821;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33477(boolean z) {
        this.f41814 = z;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m33506() {
        return this.f41814;
    }
}
