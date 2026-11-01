package p067l;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩹' uses external variables
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
/* JADX INFO: renamed from: l.᩻ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC24833 implements InterfaceC18263 {

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC24833 f79327;

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC24833[] f79328 = m54537();

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC24833 f79329;

    public abstract /* synthetic */ Object apply(Object obj);

    public EnumC24833(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC24833(String str, int i, C4046 c4046) {
        this(str, i);
    }

    public static EnumC24833 valueOf(String str) {
        return (EnumC24833) Enum.valueOf(EnumC24833.class, str);
    }

    public static EnumC24833[] values() {
        return (EnumC24833[]) f79328.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC24833[] m54537() {
        return new EnumC24833[]{f79329, f79327};
    }

    static {
        final String str = "KEY";
        final int i = 0;
        f79329 = new EnumC24833(str, i) { // from class: l.ܿۤܺ
            {
                C4046 c4046 = null;
            }

            @Override // p067l.EnumC24833, p067l.InterfaceC18263
            /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        };
        final String str2 = "VALUE";
        final int i2 = 1;
        f79327 = new EnumC24833(str2, i2) { // from class: l.ܳۤܺ
            {
                C4046 c4046 = null;
            }

            @Override // p067l.EnumC24833, p067l.InterfaceC18263
            /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }
}
