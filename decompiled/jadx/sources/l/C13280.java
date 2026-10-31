package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BDE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13280 extends C8342 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13280 f39762 = new C13280();

    @Override // l.C8342
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12575 mo21939(C22453 c22453, int i, String str, int i2, int i3) {
        int i4 = 0;
        if (i == 0) {
            if (str == "BootstrapMethods") {
                if (i3 < 2) {
                    m32242();
                    throw null;
                }
                C11186 c11186M50388 = c22453.m50388();
                int iM27753 = c11186M50388.m27753(i2);
                int i5 = i2 + 2;
                int i6 = i3 - 2;
                C10396 c10396M50387 = c22453.m50387();
                C12512 c12512M50378 = c22453.m50378();
                C19590 c19590 = new C19590(iM27753);
                for (int i7 = 0; i7 < iM27753; i7++) {
                    if (i6 < 4) {
                        throw new C23158("truncated attribute", null);
                    }
                    int iM27754 = c11186M50388.m27753(i5);
                    int iM27755 = c11186M50388.m27753(i5 + 2);
                    i5 += 4;
                    i6 -= 4;
                    if (i6 < iM27755 * 2) {
                        throw new C23158("truncated attribute", null);
                    }
                    C4067 c4067 = new C4067(iM27755);
                    int i8 = 0;
                    while (i8 < iM27755) {
                        c4067.mo12223(i8, c10396M50387.get(c11186M50388.m27753(i5)));
                        i8++;
                        i5 += 2;
                        i6 -= 2;
                    }
                    c4067.mo20349();
                    c19590.m45025(i7, c12512M50378, (C21685) c10396M50387.get(iM27754), c4067);
                }
                c19590.mo20349();
                if (i6 == 0) {
                    return new C21542(c19590);
                }
                m32243(i6);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C4608("Deprecated");
                }
                m32243(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i3 != 4) {
                    m32243(4);
                    throw null;
                }
                C11186 c11186M50389 = c22453.m50388();
                C10396 c10396M50388 = c22453.m50387();
                C12512 c12512 = (C12512) c10396M50388.get(c11186M50389.m27753(i2));
                int iM27756 = c11186M50389.m27753(i2 + 2);
                return new C3197(c12512, (C20274) (iM27756 != 0 ? c10396M50388.get(iM27756) : null));
            }
            if (str == "InnerClasses") {
                if (i3 < 2) {
                    m32242();
                    throw null;
                }
                C11186 c11186M503810 = c22453.m50388();
                C10396 c10396M50389 = c22453.m50387();
                int iM27757 = c11186M503810.m27753(i2);
                int i9 = i2 + 2;
                int i10 = iM27757 * 8;
                if (i3 - 2 != i10) {
                    m32243(i10 + 2);
                    throw null;
                }
                C9006 c9006 = new C9006(iM27757);
                while (i4 < iM27757) {
                    int iM27758 = c11186M503810.m27753(i9);
                    int iM27759 = c11186M503810.m27753(i9 + 2);
                    int iM277510 = c11186M503810.m27753(i9 + 4);
                    c9006.m23248(i4, (C12512) c10396M50389.get(iM27758), (C12512) (iM27759 == 0 ? null : c10396M50389.get(iM27759)), (C13217) (iM277510 == 0 ? null : c10396M50389.get(iM277510)), c11186M503810.m27753(i9 + 6));
                    i9 += 8;
                    i4++;
                }
                c9006.mo20349();
                return new C12369(c9006);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m32244(c22453, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m32245(c22453, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C17472("Synthetic");
                }
                m32243(0);
                throw null;
            }
            if (str == "Signature") {
                return m32246(c22453, i2, i3);
            }
            if (str == "SourceDebugExtension") {
                return new C16766(new C13217(c22453.m50388().m27750(i2, i2 + i3)));
            }
            if (str == "SourceFile") {
                if (i3 == 2) {
                    return new C18178((C13217) c22453.m50387().get(c22453.m50388().m27753(i2)));
                }
                m32243(2);
                throw null;
            }
        } else if (i == 1) {
            if (str == "ConstantValue") {
                if (i3 == 2) {
                    return new C20131((AbstractC6162) c22453.m50387().get(c22453.m50388().m27753(i2)));
                }
                m32243(2);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C4608("Deprecated");
                }
                m32243(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m32244(c22453, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m32245(c22453, i2, i3);
            }
            if (str == "Signature") {
                return m32246(c22453, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C17472("Synthetic");
                }
                m32243(0);
                throw null;
            }
        } else if (i == 2) {
            if (str == "AnnotationDefault") {
                if (i3 >= 2) {
                    return new C15190(i3, new C1286(c22453, i2, i3).m4353());
                }
                m32242();
                throw null;
            }
            if (str == "Code") {
                if (i3 < 12) {
                    m32242();
                    throw null;
                }
                C11186 c11186M503811 = c22453.m50388();
                C10396 c10396M503810 = c22453.m50387();
                int iM277511 = c11186M503811.m27753(i2);
                int iM277512 = c11186M503811.m27753(i2 + 2);
                int iM27752 = c11186M503811.m27752(i2 + 4);
                int i11 = i2 + 8;
                int i12 = i3 - 8;
                if (i12 < iM27752 + 4) {
                    throw new C23158("truncated attribute", null);
                }
                int i13 = i11 + iM27752;
                int i14 = i12 - iM27752;
                C4772 c4772 = new C4772(c11186M503811.m27750(i11, i13), c10396M503810);
                int iM277513 = c11186M503811.m27753(i13);
                C8300 c8300 = iM277513 == 0 ? C8300.f25495 : new C8300(iM277513);
                int i15 = i13 + 2;
                int i16 = i14 - 2;
                if (i16 < (iM277513 * 8) + 2) {
                    throw new C23158("truncated attribute", null);
                }
                while (i4 < iM277513) {
                    int iM277514 = c11186M503811.m27753(i15);
                    int iM277515 = c11186M503811.m27753(i15 + 2);
                    int iM277516 = c11186M503811.m27753(i15 + 4);
                    int iM277517 = c11186M503811.m27753(i15 + 6);
                    c8300.m21901(i4, iM277514, iM277515, iM277516, (C12512) (iM277517 == 0 ? null : c10396M503810.get(iM277517)));
                    i15 += 8;
                    i16 -= 8;
                    i4++;
                }
                c8300.mo20349();
                C15396 c15396 = new C15396(c22453, 3, i15, this);
                C13985 c13985M36435 = c15396.m36435();
                c13985M36435.mo20349();
                int iM36434 = c15396.m36434() - i15;
                if (iM36434 == i16) {
                    return new C22247(iM277511, iM277512, c4772, c8300, c13985M36435);
                }
                m32243((i15 - i2) + iM36434);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C4608("Deprecated");
                }
                m32243(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i3 < 2) {
                    m32242();
                    throw null;
                }
                int iM277518 = c22453.m50388().m27753(i2);
                int i17 = i2 + 2;
                int i18 = iM277518 * 2;
                if (i3 - 2 == i18) {
                    return new C13074(c22453.m50377(i17, iM277518));
                }
                m32243(i18 + 2);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m32244(c22453, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m32245(c22453, i2, i3);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C13779("RuntimeInvisibleParameterAnnotations", new C1286(c22453, i2, i3).m4355(EnumC11623.BUILD), i3);
                }
                m32242();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C1950("RuntimeVisibleParameterAnnotations", new C1286(c22453, i2, i3).m4355(EnumC11623.RUNTIME), i3);
                }
                m32242();
                throw null;
            }
            if (str == "Signature") {
                return m32246(c22453, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C17472("Synthetic");
                }
                m32243(0);
                throw null;
            }
        } else if (i == 3) {
            if (str == "LineNumberTable") {
                if (i3 < 2) {
                    m32242();
                    throw null;
                }
                C11186 c11186M503812 = c22453.m50388();
                int iM277519 = c11186M503812.m27753(i2);
                int i19 = i2 + 2;
                int i20 = iM277519 * 4;
                if (i3 - 2 != i20) {
                    m32243(i20 + 2);
                    throw null;
                }
                C6183 c6183 = new C6183(iM277519);
                while (i4 < iM277519) {
                    c6183.m17105(i4, c11186M503812.m27753(i19), c11186M503812.m27753(i19 + 2));
                    i19 += 4;
                    i4++;
                }
                c6183.mo20349();
                return new C10253(c6183);
            }
            if (str == "LocalVariableTable") {
                if (i3 >= 2) {
                    C11186 c11186M503813 = c22453.m50388();
                    return new C6019("LocalVariableTable", m32241(c11186M503813.m27750(i2 + 2, i2 + i3), c22453.m50387(), c11186M503813.m27753(i2), false));
                }
                m32242();
                throw null;
            }
            if (str == "LocalVariableTypeTable") {
                if (i3 >= 2) {
                    C11186 c11186M503814 = c22453.m50388();
                    return new C11664("LocalVariableTypeTable", m32241(c11186M503814.m27750(i2 + 2, i2 + i3), c22453.m50387(), c11186M503814.m27753(i2), true));
                }
                m32242();
                throw null;
            }
        }
        C11186 c11186M503815 = c22453.m50388();
        c22453.m50387();
        return new C16060(str, c11186M503815, i2, i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23116 m32241(C11186 c11186, C10396 c10396, int i, boolean z) {
        C13217 c13217;
        C13217 c13218;
        int i2 = i * 10;
        if (c11186.m27748() == i2) {
            C7224 c7224 = new C7224(new C2013(c11186));
            C23116 c23116 = new C23116(i);
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    int unsignedShort = c7224.readUnsignedShort();
                    int unsignedShort2 = c7224.readUnsignedShort();
                    int unsignedShort3 = c7224.readUnsignedShort();
                    int unsignedShort4 = c7224.readUnsignedShort();
                    int unsignedShort5 = c7224.readUnsignedShort();
                    C13217 c13219 = (C13217) c10396.get(unsignedShort3);
                    C13217 c132110 = (C13217) c10396.get(unsignedShort4);
                    if (z) {
                        c13218 = null;
                        c13217 = c132110;
                    } else {
                        c13217 = null;
                        c13218 = c132110;
                    }
                    c23116.m51307(i3, unsignedShort, unsignedShort2, c13219, c13218, c13217, unsignedShort5);
                } catch (IOException e) {
                    throw new RuntimeException("shouldn't happen", e);
                }
            }
            c23116.mo20349();
            return c23116;
        }
        m32243(i2 + 2);
        throw null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22952 m32244(C22453 c22453, int i, int i2) {
        if (i2 >= 2) {
            return new C22952("RuntimeInvisibleAnnotations", new C1286(c22453, i, i2).m4354(EnumC11623.BUILD), i2);
        }
        m32242();
        throw null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C7430 m32245(C22453 c22453, int i, int i2) {
        if (i2 >= 2) {
            return new C7430("RuntimeVisibleAnnotations", new C1286(c22453, i, i2).m4354(EnumC11623.RUNTIME), i2);
        }
        m32242();
        throw null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C11123 m32246(C22453 c22453, int i, int i2) {
        if (i2 != 2) {
            m32243(2);
            throw null;
        }
        return new C11123((C13217) c22453.m50387().get(c22453.m50388().m27753(i)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32242() {
        throw new C23158("severely truncated attribute", null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32243(int i) {
        throw new C23158("bad attribute length; expected length ".concat(C14712.m35008(i)), null);
    }
}
