package p067l;

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
public abstract class EnumC15760 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC15760 f45630;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC15760 f45631;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC15760 f45632;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC15760[] f45633;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC15760 f45634;

    /* JADX INFO: renamed from: ۨ */
    public static final int f45635 = 4;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC15760 f45636;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC15760 f45637;

    /* JADX INFO: renamed from: ܰ */
    public static final int f45638 = 2;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC15760 f45639;

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC15760[] f45640;

    /* JADX INFO: renamed from: ᩹ */
    public static final int f45641 = 1;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC15760 f45642;

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC25109 mo12698(C6394 c6394, Object obj, int i, InterfaceC25109 interfaceC25109);

    public EnumC15760(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC15760(String str, int i, C7715 c7715) {
        this(str, i);
    }

    public static EnumC15760 valueOf(String str) {
        return (EnumC15760) Enum.valueOf(EnumC15760.class, str);
    }

    public static EnumC15760[] values() {
        return (EnumC15760[]) f45640.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC15760[] m35820() {
        return new EnumC15760[]{f45639, f45631, f45637, f45630, f45636, f45634, f45642, f45632};
    }

    static {
        final String str = "STRONG";
        final int i = 0;
        EnumC15760 enumC15760 = new EnumC15760(str, i) { // from class: l.ۙ᩸ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12698(C6394 c6394, Object obj, int i2, InterfaceC25109 interfaceC25109) {
                return new C23158(obj, i2, interfaceC25109);
            }
        };
        f45639 = enumC15760;
        final String str2 = "STRONG_ACCESS";
        final int i2 = 1;
        EnumC15760 enumC15761 = new EnumC15760(str2, i2) { // from class: l.ۗ᩸ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12698(C6394 c6394, Object obj, int i3, InterfaceC25109 interfaceC25109) {
                C10417 c10417 = new C10417(obj, i3, interfaceC25109);
                c10417.f28807 = C14849.FOREVER_NS;
                EnumC17792 enumC17792 = EnumC17792.INSTANCE;
                c10417.f28809 = enumC17792;
                c10417.f28808 = enumC17792;
                return c10417;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12699(C6394 c6394, InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010, Object obj) {
                InterfaceC25109 interfaceC25109Mo12699 = super.mo12699(c6394, interfaceC25109, interfaceC251010, obj);
                m35821(interfaceC25109, interfaceC25109Mo12699);
                return interfaceC25109Mo12699;
            }
        };
        f45631 = enumC15761;
        final String str3 = "STRONG_WRITE";
        final int i3 = 2;
        EnumC15760 enumC15762 = new EnumC15760(str3, i3) { // from class: l.۬᩸ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12698(C6394 c6394, Object obj, int i4, InterfaceC25109 interfaceC25109) {
                C21817 c21817 = new C21817(obj, i4, interfaceC25109);
                c21817.f68646 = C14849.FOREVER_NS;
                EnumC17792 enumC17792 = EnumC17792.INSTANCE;
                c21817.f68645 = enumC17792;
                c21817.f68647 = enumC17792;
                return c21817;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12699(C6394 c6394, InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010, Object obj) {
                InterfaceC25109 interfaceC25109Mo12699 = super.mo12699(c6394, interfaceC25109, interfaceC251010, obj);
                m35822(interfaceC25109, interfaceC25109Mo12699);
                return interfaceC25109Mo12699;
            }
        };
        f45637 = enumC15762;
        final String str4 = "STRONG_ACCESS_WRITE";
        final int i4 = 3;
        EnumC15760 enumC15763 = new EnumC15760(str4, i4) { // from class: l.۫᩸ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12698(C6394 c6394, Object obj, int i5, InterfaceC25109 interfaceC25109) {
                C17121 c17121 = new C17121(obj, i5, interfaceC25109);
                c17121.f50577 = C14849.FOREVER_NS;
                EnumC17792 enumC17792 = EnumC17792.INSTANCE;
                c17121.f50582 = enumC17792;
                c17121.f50579 = enumC17792;
                c17121.f50580 = C14849.FOREVER_NS;
                c17121.f50581 = enumC17792;
                c17121.f50578 = enumC17792;
                return c17121;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12699(C6394 c6394, InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010, Object obj) {
                InterfaceC25109 interfaceC25109Mo12699 = super.mo12699(c6394, interfaceC25109, interfaceC251010, obj);
                m35821(interfaceC25109, interfaceC25109Mo12699);
                m35822(interfaceC25109, interfaceC25109Mo12699);
                return interfaceC25109Mo12699;
            }
        };
        f45630 = enumC15763;
        final String str5 = "WEAK";
        final int i5 = 4;
        EnumC15760 enumC15764 = new EnumC15760(str5, i5) { // from class: l.ۤ᩸ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12698(C6394 c6394, Object obj, int i6, InterfaceC25109 interfaceC25109) {
                return new C8405(i6, interfaceC25109, obj, c6394.f16554);
            }
        };
        f45636 = enumC15764;
        final String str6 = "WEAK_ACCESS";
        final int i6 = 5;
        EnumC15760 enumC15765 = new EnumC15760(str6, i6) { // from class: l.ۛ᩸ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12698(C6394 c6394, Object obj, int i7, InterfaceC25109 interfaceC25109) {
                C14440 c14440 = new C14440(i7, interfaceC25109, obj, c6394.f16554);
                c14440.f41266 = C14849.FOREVER_NS;
                EnumC17792 enumC17792 = EnumC17792.INSTANCE;
                c14440.f41265 = enumC17792;
                c14440.f41267 = enumC17792;
                return c14440;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12699(C6394 c6394, InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010, Object obj) {
                InterfaceC25109 interfaceC25109Mo12699 = super.mo12699(c6394, interfaceC25109, interfaceC251010, obj);
                m35821(interfaceC25109, interfaceC25109Mo12699);
                return interfaceC25109Mo12699;
            }
        };
        f45634 = enumC15765;
        final String str7 = "WEAK_WRITE";
        final int i7 = 6;
        EnumC15760 enumC15766 = new EnumC15760(str7, i7) { // from class: l.ۨ᩸ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12698(C6394 c6394, Object obj, int i8, InterfaceC25109 interfaceC25109) {
                C24498 c24498 = new C24498(i8, interfaceC25109, obj, c6394.f16554);
                c24498.f77507 = C14849.FOREVER_NS;
                EnumC17792 enumC17792 = EnumC17792.INSTANCE;
                c24498.f77506 = enumC17792;
                c24498.f77505 = enumC17792;
                return c24498;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12699(C6394 c6394, InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010, Object obj) {
                InterfaceC25109 interfaceC25109Mo12699 = super.mo12699(c6394, interfaceC25109, interfaceC251010, obj);
                m35822(interfaceC25109, interfaceC25109Mo12699);
                return interfaceC25109Mo12699;
            }
        };
        f45642 = enumC15766;
        final String str8 = "WEAK_ACCESS_WRITE";
        final int i8 = 7;
        EnumC15760 enumC15767 = new EnumC15760(str8, i8) { // from class: l.᩺᩸ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12698(C6394 c6394, Object obj, int i9, InterfaceC25109 interfaceC25109) {
                C12429 c12429 = new C12429(i9, interfaceC25109, obj, c6394.f16554);
                c12429.f34747 = C14849.FOREVER_NS;
                EnumC17792 enumC17792 = EnumC17792.INSTANCE;
                c12429.f34746 = enumC17792;
                c12429.f34750 = enumC17792;
                c12429.f34748 = C14849.FOREVER_NS;
                c12429.f34751 = enumC17792;
                c12429.f34749 = enumC17792;
                return c12429;
            }

            @Override // p067l.EnumC15760
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC25109 mo12699(C6394 c6394, InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010, Object obj) {
                InterfaceC25109 interfaceC25109Mo12699 = super.mo12699(c6394, interfaceC25109, interfaceC251010, obj);
                m35821(interfaceC25109, interfaceC25109Mo12699);
                m35822(interfaceC25109, interfaceC25109Mo12699);
                return interfaceC25109Mo12699;
            }
        };
        f45632 = enumC15767;
        f45640 = m35820();
        f45633 = new EnumC15760[]{enumC15760, enumC15761, enumC15762, enumC15763, enumC15764, enumC15765, enumC15766, enumC15767};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static EnumC15760 m35819(EnumC3711 enumC3711, boolean z, boolean z2) {
        return f45633[((enumC3711 == EnumC3711.f7851 ? (char) 4 : (char) 0) | (z ? 1 : 0) ? 1 : 0) | (z2 ? 2 : 0)];
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC25109 mo12699(C6394 c6394, InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010, Object obj) {
        return mo12698(c6394, obj, interfaceC25109.getHash(), interfaceC251010);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m35821(InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010) {
        interfaceC251010.mo19575(interfaceC25109.mo19578());
        InterfaceC25109 interfaceC25109Mo19574 = interfaceC25109.mo19574();
        Logger logger = ConcurrentMapC16391.f48159;
        interfaceC25109Mo19574.mo19581(interfaceC251010);
        interfaceC251010.mo19577(interfaceC25109Mo19574);
        InterfaceC25109 interfaceC25109Mo19587 = interfaceC25109.mo19587();
        interfaceC251010.mo19581(interfaceC25109Mo19587);
        interfaceC25109Mo19587.mo19577(interfaceC251010);
        EnumC17792 enumC17792 = EnumC17792.INSTANCE;
        interfaceC25109.mo19581(enumC17792);
        interfaceC25109.mo19577(enumC17792);
    }

    /* JADX INFO: renamed from: ۧ */
    public void m35822(InterfaceC25109 interfaceC25109, InterfaceC25109 interfaceC251010) {
        interfaceC251010.mo19582(interfaceC25109.mo19579());
        InterfaceC25109 interfaceC25109Mo19586 = interfaceC25109.mo19586();
        Logger logger = ConcurrentMapC16391.f48159;
        interfaceC25109Mo19586.mo19583(interfaceC251010);
        interfaceC251010.mo19585(interfaceC25109Mo19586);
        InterfaceC25109 interfaceC25109Mo19580 = interfaceC25109.mo19580();
        interfaceC251010.mo19583(interfaceC25109Mo19580);
        interfaceC25109Mo19580.mo19585(interfaceC251010);
        EnumC17792 enumC17792 = EnumC17792.INSTANCE;
        interfaceC25109.mo19583(enumC17792);
        interfaceC25109.mo19585(enumC17792);
    }
}
