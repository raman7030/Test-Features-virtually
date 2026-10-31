package l;

import java.util.EnumSet;

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
/* JADX INFO: renamed from: l.ᩳۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18024 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC18024 f56195;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC18024 f56196;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC18024[] f56197;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumSet f56198;

    public static EnumC18024 valueOf(String str) {
        return (EnumC18024) Enum.valueOf(EnumC18024.class, str);
    }

    public static EnumC18024[] values() {
        return (EnumC18024[]) f56197.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC18024[] m42072() {
        return new EnumC18024[]{f56196, f56195};
    }

    static {
        EnumC10969 enumC10969 = EnumC10969.f33008;
        f56196 = new EnumC18024("EQ_LOWER", 0, EnumSet.of(enumC10969, EnumC10969.f33007));
        f56195 = new EnumC18024("EQ_UPPER", 1, EnumSet.of(enumC10969, EnumC10969.f33009));
        f56197 = m42072();
    }

    public EnumC18024(String str, int i, EnumSet enumSet) {
        super(str, i);
        this.f56198 = enumSet;
    }
}
