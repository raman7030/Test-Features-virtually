package p067l;

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
/* JADX INFO: renamed from: l.֨᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC3711 {

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC3711 f7851;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC3711 f7852;

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC3711[] f7853 = m7140();

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC3711 f7854;

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC5723 mo5138(C6394 c6394, InterfaceC25109 interfaceC25109, Object obj, int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC12900 mo5139();

    public EnumC3711(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC3711(String str, int i, C7715 c7715) {
        this(str, i);
    }

    public static EnumC3711 valueOf(String str) {
        return (EnumC3711) Enum.valueOf(EnumC3711.class, str);
    }

    public static EnumC3711[] values() {
        return (EnumC3711[]) f7853.clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ EnumC3711[] m7140() {
        return new EnumC3711[]{f7852, f7854, f7851};
    }

    static {
        final String str = "STRONG";
        final int i = 0;
        f7852 = new EnumC3711(str, i) { // from class: l.᩵᩹ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC3711
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC5723 mo5138(C6394 c6394, InterfaceC25109 interfaceC25109, Object obj, int i2) {
                if (i2 == 1) {
                    return new C23828(obj);
                }
                return new C9746(i2, obj);
            }

            @Override // p067l.EnumC3711
            /* JADX INFO: renamed from: ֫ */
            public AbstractC12900 mo5139() {
                return AbstractC12900.m29555();
            }
        };
        final String str2 = "SOFT";
        final int i2 = 1;
        f7854 = new EnumC3711(str2, i2) { // from class: l.֡᩹ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC3711
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC5723 mo5138(C6394 c6394, InterfaceC25109 interfaceC25109, Object obj, int i3) {
                if (i3 == 1) {
                    return new C20476(c6394.f16548, obj, interfaceC25109);
                }
                return new C15780(i3, interfaceC25109, obj, c6394.f16548);
            }

            @Override // p067l.EnumC3711
            /* JADX INFO: renamed from: ֫ */
            public AbstractC12900 mo5139() {
                return AbstractC12900.m29556();
            }
        };
        final String str3 = "WEAK";
        final int i3 = 2;
        f7851 = new EnumC3711(str3, i3) { // from class: l.ۚ᩹ܺ
            {
                C7715 c7715 = null;
            }

            @Override // p067l.EnumC3711
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC5723 mo5138(C6394 c6394, InterfaceC25109 interfaceC25109, Object obj, int i4) {
                if (i4 == 1) {
                    return new C13770(c6394.f16548, obj, interfaceC25109);
                }
                return new C4322(i4, interfaceC25109, obj, c6394.f16548);
            }

            @Override // p067l.EnumC3711
            /* JADX INFO: renamed from: ֫ */
            public AbstractC12900 mo5139() {
                return AbstractC12900.m29556();
            }
        };
    }
}
