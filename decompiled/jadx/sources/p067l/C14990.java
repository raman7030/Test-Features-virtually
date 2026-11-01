package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BDE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14990 extends C10297 {

    /* JADX INFO: renamed from: ֫ */
    public static final C14990 f42827 = new C14990();

    @Override // p067l.C10297
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14320 mo23909(C23708 c23708, int i, String str, int i2, int i3) {
        int i4 = 0;
        if (i == 0) {
            if (str == "BootstrapMethods") {
                if (i3 < 2) {
                    m34341();
                    throw null;
                }
                C13000 c13000M52729 = c23708.m52729();
                int iM29815 = c13000M52729.m29815(i2);
                int i5 = i2 + 2;
                int i6 = i3 - 2;
                C12249 c12249M52728 = c23708.m52728();
                C14260 c14260M52719 = c23708.m52719();
                C20987 c20987 = new C20987(iM29815);
                for (int i7 = 0; i7 < iM29815; i7++) {
                    if (i6 < 4) {
                        throw new C24378("truncated attribute", null);
                    }
                    int iM29816 = c13000M52729.m29815(i5);
                    int iM29817 = c13000M52729.m29815(i5 + 2);
                    i5 += 4;
                    i6 -= 4;
                    if (i6 < iM29817 * 2) {
                        throw new C24378("truncated attribute", null);
                    }
                    C6234 c6234 = new C6234(iM29817);
                    int i8 = 0;
                    while (i8 < iM29817) {
                        c6234.mo14144(i8, c12249M52728.get(c13000M52729.m29815(i5)));
                        i8++;
                        i5 += 2;
                        i6 -= 2;
                    }
                    c6234.mo22326();
                    c20987.m47320(i7, c14260M52719, (C22978) c12249M52728.get(iM29816), c6234);
                }
                c20987.mo22326();
                if (i6 == 0) {
                    return new C22842(c20987);
                }
                m34342(i6);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C6748("Deprecated");
                }
                m34342(0);
                throw null;
            }
            if (str == "EnclosingMethod") {
                if (i3 != 4) {
                    m34342(4);
                    throw null;
                }
                C13000 c13000M527210 = c23708.m52729();
                C12249 c12249M52729 = c23708.m52728();
                C14260 c14260 = (C14260) c12249M52729.get(c13000M527210.m29815(i2));
                int iM29818 = c13000M527210.m29815(i2 + 2);
                return new C5407(c14260, (C21637) (iM29818 != 0 ? c12249M52729.get(iM29818) : null));
            }
            if (str == "InnerClasses") {
                if (i3 < 2) {
                    m34341();
                    throw null;
                }
                C13000 c13000M527211 = c23708.m52729();
                C12249 c12249M527210 = c23708.m52728();
                int iM29819 = c13000M527211.m29815(i2);
                int i9 = i2 + 2;
                int i10 = iM29819 * 8;
                if (i3 - 2 != i10) {
                    m34342(i10 + 2);
                    throw null;
                }
                C10928 c10928 = new C10928(iM29819);
                while (i4 < iM29819) {
                    int iM298110 = c13000M527211.m29815(i9);
                    int iM298111 = c13000M527211.m29815(i9 + 2);
                    int iM298112 = c13000M527211.m29815(i9 + 4);
                    c10928.m25192(i4, (C14260) c12249M527210.get(iM298110), (C14260) (iM298111 == 0 ? null : c12249M527210.get(iM298111)), (C14930) (iM298112 == 0 ? null : c12249M527210.get(iM298112)), c13000M527211.m29815(i9 + 6));
                    i9 += 8;
                    i4++;
                }
                c10928.mo22326();
                return new C14124(c10928);
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m34343(c23708, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m34344(c23708, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C18974("Synthetic");
                }
                m34342(0);
                throw null;
            }
            if (str == "Signature") {
                return m34345(c23708, i2, i3);
            }
            if (str == "SourceDebugExtension") {
                return new C18303(new C14930(c23708.m52729().m29812(i2, i2 + i3)));
            }
            if (str == "SourceFile") {
                if (i3 == 2) {
                    return new C19645((C14930) c23708.m52728().get(c23708.m52729().m29815(i2)));
                }
                m34342(2);
                throw null;
            }
        } else if (i == 1) {
            if (str == "ConstantValue") {
                if (i3 == 2) {
                    return new C21501((AbstractC8225) c23708.m52728().get(c23708.m52729().m29815(i2)));
                }
                m34342(2);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C6748("Deprecated");
                }
                m34342(0);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m34343(c23708, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m34344(c23708, i2, i3);
            }
            if (str == "Signature") {
                return m34345(c23708, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C18974("Synthetic");
                }
                m34342(0);
                throw null;
            }
        } else if (i == 2) {
            if (str == "AnnotationDefault") {
                if (i3 >= 2) {
                    return new C16805(i3, new C3591(c23708, i2, i3).m6599());
                }
                m34341();
                throw null;
            }
            if (str == "Code") {
                if (i3 < 12) {
                    m34341();
                    throw null;
                }
                C13000 c13000M527212 = c23708.m52729();
                C12249 c12249M527211 = c23708.m52728();
                int iM298113 = c13000M527212.m29815(i2);
                int iM298114 = c13000M527212.m29815(i2 + 2);
                int iM29814 = c13000M527212.m29814(i2 + 4);
                int i11 = i2 + 8;
                int i12 = i3 - 8;
                if (i12 < iM29814 + 4) {
                    throw new C24378("truncated attribute", null);
                }
                int i13 = i11 + iM29814;
                int i14 = i12 - iM29814;
                C6904 c6904 = new C6904(c13000M527212.m29812(i11, i13), c12249M527211);
                int iM298115 = c13000M527212.m29815(i13);
                C10257 c10257 = iM298115 == 0 ? C10257.f28405 : new C10257(iM298115);
                int i15 = i13 + 2;
                int i16 = i14 - 2;
                if (i16 < (iM298115 * 8) + 2) {
                    throw new C24378("truncated attribute", null);
                }
                while (i4 < iM298115) {
                    int iM298116 = c13000M527212.m29815(i15);
                    int iM298117 = c13000M527212.m29815(i15 + 2);
                    int iM298118 = c13000M527212.m29815(i15 + 4);
                    int iM298119 = c13000M527212.m29815(i15 + 6);
                    c10257.m23871(i4, iM298116, iM298117, iM298118, (C14260) (iM298119 == 0 ? null : c12249M527211.get(iM298119)));
                    i15 += 8;
                    i16 -= 8;
                    i4++;
                }
                c10257.mo22326();
                C17001 c17001 = new C17001(c23708, 3, i15, this);
                C15660 c15660M38593 = c17001.m38593();
                c15660M38593.mo22326();
                int iM38592 = c17001.m38592() - i15;
                if (iM38592 == i16) {
                    return new C23512(iM298113, iM298114, c6904, c10257, c15660M38593);
                }
                m34342((i15 - i2) + iM38592);
                throw null;
            }
            if (str == "Deprecated") {
                if (i3 == 0) {
                    return new C6748("Deprecated");
                }
                m34342(0);
                throw null;
            }
            if (str == "Exceptions") {
                if (i3 < 2) {
                    m34341();
                    throw null;
                }
                int iM298120 = c23708.m52729().m29815(i2);
                int i17 = i2 + 2;
                int i18 = iM298120 * 2;
                if (i3 - 2 == i18) {
                    return new C14794(c23708.m52718(i17, iM298120));
                }
                m34342(i18 + 2);
                throw null;
            }
            if (str == "RuntimeInvisibleAnnotations") {
                return m34343(c23708, i2, i3);
            }
            if (str == "RuntimeVisibleAnnotations") {
                return m34344(c23708, i2, i3);
            }
            if (str == "RuntimeInvisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C15464("RuntimeInvisibleParameterAnnotations", new C3591(c23708, i2, i3).m6601(EnumC13415.BUILD), i3);
                }
                m34341();
                throw null;
            }
            if (str == "RuntimeVisibleParameterAnnotations") {
                if (i3 >= 2) {
                    return new C4222("RuntimeVisibleParameterAnnotations", new C3591(c23708, i2, i3).m6601(EnumC13415.RUNTIME), i3);
                }
                m34341();
                throw null;
            }
            if (str == "Signature") {
                return m34345(c23708, i2, i3);
            }
            if (str == "Synthetic") {
                if (i3 == 0) {
                    return new C18974("Synthetic");
                }
                m34342(0);
                throw null;
            }
        } else if (i == 3) {
            if (str == "LineNumberTable") {
                if (i3 < 2) {
                    m34341();
                    throw null;
                }
                C13000 c13000M527213 = c23708.m52729();
                int iM298121 = c13000M527213.m29815(i2);
                int i19 = i2 + 2;
                int i20 = iM298121 * 4;
                if (i3 - 2 != i20) {
                    m34342(i20 + 2);
                    throw null;
                }
                C8245 c8245 = new C8245(iM298121);
                while (i4 < iM298121) {
                    c8245.m19037(i4, c13000M527213.m29815(i19), c13000M527213.m29815(i19 + 2));
                    i19 += 4;
                    i4++;
                }
                c8245.mo22326();
                return new C12113(c8245);
            }
            if (str == "LocalVariableTable") {
                if (i3 >= 2) {
                    C13000 c13000M527214 = c23708.m52729();
                    return new C8089("LocalVariableTable", m34340(c13000M527214.m29812(i2 + 2, i2 + i3), c23708.m52728(), c13000M527214.m29815(i2), false));
                }
                m34341();
                throw null;
            }
            if (str == "LocalVariableTypeTable") {
                if (i3 >= 2) {
                    C13000 c13000M527215 = c23708.m52729();
                    return new C13454("LocalVariableTypeTable", m34340(c13000M527215.m29812(i2 + 2, i2 + i3), c23708.m52728(), c13000M527215.m29815(i2), true));
                }
                m34341();
                throw null;
            }
        }
        C13000 c13000M527216 = c23708.m52729();
        c23708.m52728();
        return new C17632(str, c13000M527216, i2, i3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24338 m34340(C13000 c13000, C12249 c12249, int i, boolean z) {
        C14930 c14930;
        C14930 c14931;
        int i2 = i * 10;
        if (c13000.m29810() == i2) {
            C9234 c9234 = new C9234(new C4282(c13000));
            C24338 c24338 = new C24338(i);
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    int unsignedShort = c9234.readUnsignedShort();
                    int unsignedShort2 = c9234.readUnsignedShort();
                    int unsignedShort3 = c9234.readUnsignedShort();
                    int unsignedShort4 = c9234.readUnsignedShort();
                    int unsignedShort5 = c9234.readUnsignedShort();
                    C14930 c14932 = (C14930) c12249.get(unsignedShort3);
                    C14930 c14933 = (C14930) c12249.get(unsignedShort4);
                    if (z) {
                        c14931 = null;
                        c14930 = c14933;
                    } else {
                        c14930 = null;
                        c14931 = c14933;
                    }
                    c24338.m53701(i3, unsignedShort, unsignedShort2, c14932, c14931, c14930, unsignedShort5);
                } catch (IOException e) {
                    throw new RuntimeException("shouldn't happen", e);
                }
            }
            c24338.mo22326();
            return c24338;
        }
        m34342(i2 + 2);
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C24182 m34343(C23708 c23708, int i, int i2) {
        if (i2 >= 2) {
            return new C24182("RuntimeInvisibleAnnotations", new C3591(c23708, i, i2).m6600(EnumC13415.BUILD), i2);
        }
        m34341();
        throw null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C9430 m34344(C23708 c23708, int i, int i2) {
        if (i2 >= 2) {
            return new C9430("RuntimeVisibleAnnotations", new C3591(c23708, i, i2).m6600(EnumC13415.RUNTIME), i2);
        }
        m34341();
        throw null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C12940 m34345(C23708 c23708, int i, int i2) {
        if (i2 != 2) {
            m34342(2);
            throw null;
        }
        return new C12940((C14930) c23708.m52728().get(c23708.m52729().m29815(i)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34341() {
        throw new C24378("severely truncated attribute", null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34342(int i) {
        throw new C24378("bad attribute length; expected length ".concat(C16351.m37155(i)), null);
    }
}
