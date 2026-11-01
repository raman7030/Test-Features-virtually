package p067l;

import java.util.EnumSet;
import java.util.function.Consumer;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 l.֫ܿ֨, still in use, count: 1, list:
  (r0v21 l.֫ܿ֨) from 0x0160: INVOKE (r0v21 l.֫ܿ֨) STATIC call: java.util.EnumSet.of(java.lang.Enum):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>):java.util.EnumSet<E extends java.lang.Enum<E>> (c), WRAPPED] (LINE:113)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.֫ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4231 {
    NONE("No options"),
    CONSTANT_POOL("Constant Pool"),
    PRINT_BCI("Program Counter - for all instructions"),
    LABELS("Labels (as identifiers)"),
    CP_INDEX("CP index along with arguments"),
    LINE_NUMBER_TABLE_Numbers("Line Numbers in comments"),
    LINE_NUMBER_TABLE_Lines("Java Source Lines in comments"),
    LINE_NUMBER_TABLE_Table("LineNumberTable attribute as table"),
    LINE_NUMBER_TABLE_All("Line Numbers, Source Lines, attribute as Table", new C15649()),
    LOCAL_VARIABLE_Vars("Print LocalVariableTable attribute"),
    LOCAL_VARIABLE_Types("Print LocalVariableTypeTable attribute"),
    LOCAL_VARIABLE_All("Print both LocalVariableTable and LocalVariableTypeTable attributes", new C16487(2)),
    HEX("Numbers as hexadecimals"),
    TRACE("Print internal traces, debug information"),
    SYSINFO("system information"),
    NO_COMMENTS("No comments, suppress printing comments"),
    VERBOSE("Verbose information"),
    TABLE("Attributes as table"),
    DROP_Source("Discard SourceFile attribute"),
    DROP_Signatures("Discard Signature attribute"),
    DROP_Classes("Discard this_class and super_class pair"),
    DROP_CharacterRange("Discard CharacterRangeTable attribute"),
    DROP_All("Discard SourceFile, CharacterRangeTable attributes, this_class and super_class pair", new C9615()),
    DETAILED_Output("Detailed output"),
    EXTRA_DETAILED_Output("Detailed output, this_class and super_class pair"),
    BEST_EFFORT("Print as much as possible despite errors");


    /* JADX INFO: renamed from: ֡֫ */
    public static final EnumSet f9311 = EnumSet.of(new EnumC4231("Discard CharacterRangeTable attribute"));

    /* JADX INFO: renamed from: ᩸ */
    public final Consumer f9339;

    /* JADX INFO: renamed from: ᩹ */
    public final String f9340;

    public static EnumC4231 valueOf(String str) {
        return (EnumC4231) Enum.valueOf(EnumC4231.class, str);
    }

    public static EnumC4231[] values() {
        return (EnumC4231[]) f9335.clone();
    }

    static {
    }

    public EnumC4231(String str) {
        super(str, i);
        this.f9340 = str;
        this.f9339 = null;
    }

    public EnumC4231(String str, Consumer consumer) {
        super(str, i);
        this.f9340 = str;
        this.f9339 = consumer;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m8593() {
        Consumer consumer = this.f9339;
        if (consumer != null) {
            consumer.accept(this);
        } else {
            C12949.m29677(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC4231 m8585(String str, String str2) {
        int iLastIndexOf;
        for (EnumC4231 enumC4231 : values()) {
            String strName = enumC4231.name();
            if (strName.startsWith(str) && (iLastIndexOf = enumC4231.name().lastIndexOf(95)) > 0 && strName.substring(iLastIndexOf + 1).equalsIgnoreCase(str2)) {
                return enumC4231;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m8594() {
        return !f9311.contains(this);
    }
}
