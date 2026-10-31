package l;

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
public class C12918 implements InterfaceC15620 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f38768;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f38769;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17858 f38770;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f38771;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f38772;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f38773;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f38774;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f38775;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0225 f38776;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0225 f38777;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38778;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f38779;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Object f38780;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38781;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f38782;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f38783;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC3912 f38784;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7897 f38785;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f38786;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0225 f38787;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38788;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38789;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f38790;

    static {
        ApplicationC12518.m30701(IShizukuService.Stub.TRANSACTION_isHidden);
    }

    public native C12918(AbstractC3912 abstractC3912, C7897 c7897);

    public native C12918(C7897 c7897, AbstractC3912 abstractC3912, boolean z, boolean z2);

    public C12918(byte[] bArr, int i, boolean z) {
        this(null, new C22920(bArr, i), z, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12918 m31380(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        C10619.m26650(inputStream);
        return new C12918(C18366.m42796(inputStream), 0, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12918 m31381(byte[] bArr) {
        return new C12918(bArr, 0, true);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m31398() {
        return this.f38774;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC3912 m31418() {
        return this.f38784;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22920 m31416() {
        AbstractC3912 abstractC3912 = this.f38784;
        if (abstractC3912 instanceof C22920) {
            return (C22920) abstractC3912;
        }
        throw new RuntimeException();
    }

    @Override // l.InterfaceC15620
    /* JADX INFO: renamed from: ֫ */
    public final C7897 mo27437() {
        return this.f38785;
    }

    @Override // l.InterfaceC15620
    /* JADX INFO: renamed from: ۧ */
    public final Set mo27438() {
        return new C15034(this);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m31397(int i) {
        int i2 = this.f38774;
        if (i2 == 0) {
            return 0;
        }
        int iMo11937 = this.f38784.mo11937((i * 4) + i2 + 4);
        if (iMo11937 == 0) {
            return 0;
        }
        return this.f38774 + iMo11937;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31414() {
        this.f38783 = false;
        this.f38770.m41831();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m31402(int i) {
        if (i < 0 || i >= this.f38769) {
            throw new C4452(null, "String index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f38775;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m31394(int i) {
        if (i < 0 || i >= this.f38788) {
            throw new C4452(null, "Type index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f38789;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31404(int i) {
        if (i < 0 || i >= this.f38779) {
            throw new C4452(null, "Field index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f38790;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m31415(int i) {
        if (i < 0 || i >= this.f38771) {
            throw new C4452(null, "Method index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f38772;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m31399(int i) {
        if (i < 0 || i >= this.f38786) {
            throw new C4452(null, "Proto index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 12) + this.f38768;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31383(int i) {
        if (i < 0 || i >= this.f38778) {
            throw new C4452(null, "Class index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 32) + this.f38782;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m31408() {
        return this.f38778;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m31410() {
        return this.f38769;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m31396() {
        return this.f38788;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m31400() {
        return this.f38786;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m31423() {
        return this.f38779;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m31421() {
        return this.f38771;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m31422(int i) {
        boolean z = this.f38783;
        String strM41829 = z ? this.f38770.m41829(i) : null;
        if (strM41829 != null) {
            return strM41829;
        }
        int iM31402 = m31402(i);
        AbstractC3912 abstractC3912 = this.f38784;
        C18729 c18729M11939 = abstractC3912.m11939(abstractC3912.mo11935(iM31402));
        String strM43361 = c18729M11939.m43361(c18729M11939.m43368());
        c18729M11939.m43359();
        if (z) {
            this.f38770.m41832(i, strM43361);
        }
        return strM43361;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31406(int i, Writer writer, boolean z) throws IOException {
        if (this.f38783 && !z) {
            writer.write(m31422(i));
        } else {
            m31385(i, writer, z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31385(int i, Writer writer, boolean z) {
        int iM31402 = m31402(i);
        AbstractC3912 abstractC3912 = this.f38784;
        C18729 c18729M11939 = abstractC3912.m11939(abstractC3912.mo11935(iM31402));
        c18729M11939.m43357(c18729M11939.m43368(), writer, z);
        c18729M11939.m43359();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31392(int i, int i2, int i3, String str) {
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length()) {
            String strM41829 = this.f38783 ? this.f38770.m41829(i) : null;
            if (strM41829 != null) {
                if (strM41829.length() == i3 && str.regionMatches(i2, strM41829, 0, i3)) {
                    return true;
                }
            } else {
                int iM31402 = m31402(i);
                AbstractC3912 abstractC3912 = this.f38784;
                C18729 c18729M11939 = abstractC3912.m11939(abstractC3912.mo11935(iM31402));
                try {
                    return C7671.m20527(this.f38784, c18729M11939.m43364(), c18729M11939.m43368(), str, i2, i3);
                } finally {
                    c18729M11939.m43359();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m31424(int i) {
        if (i == -1) {
            return null;
        }
        return m31422(i);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m31401(int i) {
        boolean z = this.f38783;
        String strM41833 = z ? this.f38770.m41833(i) : null;
        if (strM41833 != null) {
            return strM41833;
        }
        String strM31422 = m31422(this.f38784.mo11935(m31394(i)));
        if (z) {
            this.f38770.m41835(i, strM31422);
        }
        return strM31422;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m31411(int i) {
        return m31401(this.f38784.mo11935(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31386(Writer writer, int i) {
        if (this.f38783) {
            writer.write(m31401(i));
        } else {
            m31406(this.f38784.mo11935(m31394(i)), writer, false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31407(int i, int i2, int i3, String str) {
        String strM41833 = this.f38783 ? this.f38770.m41833(i) : null;
        if (strM41833 != null) {
            return i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length() && strM41833.length() == i3 && str.regionMatches(i2, strM41833, 0, i3);
        }
        return m31392(this.f38784.mo11935(m31394(i)), i2, i3, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31393(int i, String str) {
        String strM41833 = this.f38783 ? this.f38770.m41833(i) : null;
        int i2 = 0;
        if (strM41833 != null) {
            int i3 = 0;
            while (i3 < strM41833.length() && strM41833.charAt(i3) == '[') {
                i3++;
            }
            return strM41833.length() - i3 == str.length() && strM41833.regionMatches(i3, str, 0, str.length());
        }
        int iM31394 = m31394(i);
        AbstractC3912 abstractC3912 = this.f38784;
        C18729 c18729M11939 = abstractC3912.m11939(abstractC3912.mo11935(m31402(abstractC3912.mo11935(iM31394))));
        try {
            int iM43368 = c18729M11939.m43368();
            int iM43364 = c18729M11939.m43364();
            while (i2 < iM43368 && abstractC3912.m11942(iM43364 + i2) == 91) {
                i2++;
            }
            return C7671.m20527(this.f38784, iM43364 + i2, iM43368 - i2, str, 0, str.length());
        } finally {
            c18729M11939.m43359();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m31419() {
        return new C21386(this);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List m31403() {
        return new C22091(this);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3266 m31409(int i) {
        if (this.f38783) {
            return this.f38770.m41834(this, i);
        }
        return new C3266(this, i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15259 m31413(int i) {
        if (this.f38783) {
            return this.f38770.m41830(this, i);
        }
        return new C15259(this, i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1855 m31412(int i, EnumC0841 enumC0841) {
        C1855 c1855 = (C1855) this.f38776.m1479();
        if (c1855 != null) {
            c1855.f29162 = enumC0841;
            c1855.f29164 = i;
            return c1855;
        }
        return new C1855(this, enumC0841, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31388(C1855 c1855) {
        this.f38776.m1477(c1855);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20472 m31405(int i, EnumC0841 enumC0841) {
        C20472 c20472 = (C20472) this.f38777.m1479();
        if (c20472 != null) {
            c20472.f29162 = enumC0841;
            c20472.f29164 = i;
            return c20472;
        }
        return new C20472(this, enumC0841, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31390(C20472 c20472) {
        this.f38777.m1477(c20472);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2833 m31384(int i, EnumC0841 enumC0841) {
        C2833 c2833 = (C2833) this.f38787.m1479();
        if (c2833 == null) {
            return new C2833(this, enumC0841, i);
        }
        c2833.f29162 = enumC0841;
        c2833.f29164 = i;
        return c2833;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31389(C2833 c2833) {
        this.f38787.m1477(c2833);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1149 m31417(int i) {
        for (C1149 c1149 : new C19975(this, this.f38784.mo11935(this.f38781))) {
            if (c1149.m3948() == i) {
                return c1149;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31387(Object obj) {
        this.f38780 = obj;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m31395() {
        return this.f38780;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31391(boolean z) {
        this.f38773 = z;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m31420() {
        return this.f38773;
    }
}
