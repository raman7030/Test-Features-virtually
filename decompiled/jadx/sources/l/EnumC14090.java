package l;

import java.util.logging.Logger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩶' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ܰ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC14090 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC14090 f42544;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC14090 f42545;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC14090 f42546;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC14090[] f42547;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC14090 f42548;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f42549 = 4;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC14090 f42550;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC14090 f42551;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f42552 = 2;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC14090 f42553;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC14090[] f42554;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int f42555 = 1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC14090 f42556;

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC23927 mo10703(C4235 c4235, Object obj, int i, InterfaceC23927 interfaceC23927);

    public EnumC14090(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC14090(String str, int i, C5625 c5625) {
        this(str, i);
    }

    public static EnumC14090 valueOf(String str) {
        return (EnumC14090) Enum.valueOf(EnumC14090.class, str);
    }

    public static EnumC14090[] values() {
        return (EnumC14090[]) f42554.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC14090[] m33695() {
        return new EnumC14090[]{f42553, f42545, f42551, f42544, f42550, f42548, f42556, f42546};
    }

    static {
        final String str = "STRONG";
        final int i = 0;
        EnumC14090 enumC14090 = new EnumC14090(str, i) { // from class: l.ۙ᩸ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10703(C4235 c4235, Object obj, int i2, InterfaceC23927 interfaceC23927) {
                return new C21874(obj, i2, interfaceC23927);
            }
        };
        f42553 = enumC14090;
        final String str2 = "STRONG_ACCESS";
        final int i2 = 1;
        EnumC14090 enumC14091 = new EnumC14090(str2, i2) { // from class: l.ۗ᩸ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public InterfaceC23927 mo10703(C4235 c4235, Object obj, int i3, InterfaceC23927 interfaceC23927) {
                C8468 c8468 = new C8468(obj, i3, interfaceC23927);
                c8468.f25894 = C13132.FOREVER_NS;
                EnumC16228 enumC16228 = EnumC16228.INSTANCE;
                c8468.f25896 = enumC16228;
                c8468.f25895 = enumC16228;
                return c8468;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public InterfaceC23927 mo10704(C4235 c4235, InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928, Object obj) {
                InterfaceC23927 interfaceC23927Mo10704 = super.mo10704(c4235, interfaceC23927, interfaceC23928, obj);
                m33696(interfaceC23927, interfaceC23927Mo10704);
                return interfaceC23927Mo10704;
            }
        };
        f42545 = enumC14091;
        final String str3 = "STRONG_WRITE";
        final int i3 = 2;
        EnumC14090 enumC14092 = new EnumC14090(str3, i3) { // from class: l.۬᩸ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10703(C4235 c4235, Object obj, int i4, InterfaceC23927 interfaceC23927) {
                C20463 c20463 = new C20463(obj, i4, interfaceC23927);
                c20463.f65970 = C13132.FOREVER_NS;
                EnumC16228 enumC16228 = EnumC16228.INSTANCE;
                c20463.f65969 = enumC16228;
                c20463.f65971 = enumC16228;
                return c20463;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10704(C4235 c4235, InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928, Object obj) {
                InterfaceC23927 interfaceC23927Mo10704 = super.mo10704(c4235, interfaceC23927, interfaceC23928, obj);
                m33697(interfaceC23927, interfaceC23927Mo10704);
                return interfaceC23927Mo10704;
            }
        };
        f42551 = enumC14092;
        final String str4 = "STRONG_ACCESS_WRITE";
        final int i4 = 3;
        EnumC14090 enumC14093 = new EnumC14090(str4, i4) { // from class: l.۫᩸ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10703(C4235 c4235, Object obj, int i5, InterfaceC23927 interfaceC23927) {
                C15522 c15522 = new C15522(obj, i5, interfaceC23927);
                c15522.f47445 = C13132.FOREVER_NS;
                EnumC16228 enumC16228 = EnumC16228.INSTANCE;
                c15522.f47450 = enumC16228;
                c15522.f47447 = enumC16228;
                c15522.f47448 = C13132.FOREVER_NS;
                c15522.f47449 = enumC16228;
                c15522.f47446 = enumC16228;
                return c15522;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10704(C4235 c4235, InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928, Object obj) {
                InterfaceC23927 interfaceC23927Mo10704 = super.mo10704(c4235, interfaceC23927, interfaceC23928, obj);
                m33696(interfaceC23927, interfaceC23927Mo10704);
                m33697(interfaceC23927, interfaceC23927Mo10704);
                return interfaceC23927Mo10704;
            }
        };
        f42544 = enumC14093;
        final String str5 = "WEAK";
        final int i5 = 4;
        EnumC14090 enumC14094 = new EnumC14090(str5, i5) { // from class: l.ۤ᩸ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10703(C4235 c4235, Object obj, int i6, InterfaceC23927 interfaceC23927) {
                return new C6351(i6, interfaceC23927, obj, c4235.f13741);
            }
        };
        f42550 = enumC14094;
        final String str6 = "WEAK_ACCESS";
        final int i6 = 5;
        EnumC14090 enumC14095 = new EnumC14090(str6, i6) { // from class: l.ۛ᩸ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10703(C4235 c4235, Object obj, int i7, InterfaceC23927 interfaceC23927) {
                C12701 c12701 = new C12701(i7, interfaceC23927, obj, c4235.f13741);
                c12701.f38238 = C13132.FOREVER_NS;
                EnumC16228 enumC16228 = EnumC16228.INSTANCE;
                c12701.f38237 = enumC16228;
                c12701.f38239 = enumC16228;
                return c12701;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10704(C4235 c4235, InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928, Object obj) {
                InterfaceC23927 interfaceC23927Mo10704 = super.mo10704(c4235, interfaceC23927, interfaceC23928, obj);
                m33696(interfaceC23927, interfaceC23927Mo10704);
                return interfaceC23927Mo10704;
            }
        };
        f42548 = enumC14095;
        final String str7 = "WEAK_WRITE";
        final int i7 = 6;
        EnumC14090 enumC14096 = new EnumC14090(str7, i7) { // from class: l.ۨ᩸ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10703(C4235 c4235, Object obj, int i8, InterfaceC23927 interfaceC23927) {
                C23284 c23284 = new C23284(i8, interfaceC23927, obj, c4235.f13741);
                c23284.f74763 = C13132.FOREVER_NS;
                EnumC16228 enumC16228 = EnumC16228.INSTANCE;
                c23284.f74762 = enumC16228;
                c23284.f74761 = enumC16228;
                return c23284;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10704(C4235 c4235, InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928, Object obj) {
                InterfaceC23927 interfaceC23927Mo10704 = super.mo10704(c4235, interfaceC23927, interfaceC23928, obj);
                m33697(interfaceC23927, interfaceC23927Mo10704);
                return interfaceC23927Mo10704;
            }
        };
        f42556 = enumC14096;
        final String str8 = "WEAK_ACCESS_WRITE";
        final int i8 = 7;
        EnumC14090 enumC14097 = new EnumC14090(str8, i8) { // from class: l.᩺᩸ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10703(C4235 c4235, Object obj, int i9, InterfaceC23927 interfaceC23927) {
                C10585 c10585 = new C10585(i9, interfaceC23927, obj, c4235.f13741);
                c10585.f31777 = C13132.FOREVER_NS;
                EnumC16228 enumC16228 = EnumC16228.INSTANCE;
                c10585.f31776 = enumC16228;
                c10585.f31780 = enumC16228;
                c10585.f31778 = C13132.FOREVER_NS;
                c10585.f31781 = enumC16228;
                c10585.f31779 = enumC16228;
                return c10585;
            }

            @Override // l.EnumC14090
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC23927 mo10704(C4235 c4235, InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928, Object obj) {
                InterfaceC23927 interfaceC23927Mo10704 = super.mo10704(c4235, interfaceC23927, interfaceC23928, obj);
                m33696(interfaceC23927, interfaceC23927Mo10704);
                m33697(interfaceC23927, interfaceC23927Mo10704);
                return interfaceC23927Mo10704;
            }
        };
        f42546 = enumC14097;
        f42554 = m33695();
        f42547 = new EnumC14090[]{enumC14090, enumC14091, enumC14092, enumC14093, enumC14094, enumC14095, enumC14096, enumC14097};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC14090 m33694(EnumC1412 enumC1412, boolean z, boolean z2) {
        return f42547[((enumC1412 == EnumC1412.f5080 ? (char) 4 : (char) 0) | (z ? 1 : 0) ? 1 : 0) | (z2 ? 2 : 0)];
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC23927 mo10704(C4235 c4235, InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928, Object obj) {
        return mo10703(c4235, obj, interfaceC23927.getHash(), interfaceC23928);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m33696(InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928) {
        interfaceC23928.mo17635(interfaceC23927.mo17638());
        InterfaceC23927 interfaceC23927Mo17634 = interfaceC23927.mo17634();
        Logger logger = ConcurrentMapC14754.f45046;
        interfaceC23927Mo17634.mo17641(interfaceC23928);
        interfaceC23928.mo17637(interfaceC23927Mo17634);
        InterfaceC23927 interfaceC23927Mo17647 = interfaceC23927.mo17647();
        interfaceC23928.mo17641(interfaceC23927Mo17647);
        interfaceC23927Mo17647.mo17637(interfaceC23928);
        EnumC16228 enumC16228 = EnumC16228.INSTANCE;
        interfaceC23927.mo17641(enumC16228);
        interfaceC23927.mo17637(enumC16228);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m33697(InterfaceC23927 interfaceC23927, InterfaceC23927 interfaceC23928) {
        interfaceC23928.mo17642(interfaceC23927.mo17639());
        InterfaceC23927 interfaceC23927Mo17646 = interfaceC23927.mo17646();
        Logger logger = ConcurrentMapC14754.f45046;
        interfaceC23927Mo17646.mo17643(interfaceC23928);
        interfaceC23928.mo17645(interfaceC23927Mo17646);
        InterfaceC23927 interfaceC23927Mo17640 = interfaceC23927.mo17640();
        interfaceC23928.mo17643(interfaceC23927Mo17640);
        interfaceC23927Mo17640.mo17645(interfaceC23928);
        EnumC16228 enumC16228 = EnumC16228.INSTANCE;
        interfaceC23927.mo17643(enumC16228);
        interfaceC23927.mo17645(enumC16228);
    }
}
