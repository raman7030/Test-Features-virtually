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
/* JADX INFO: renamed from: l.ᩴۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18565 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC18565 f57615;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC18565 f57616;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC18565 f57617;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC18565[] f57618;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumSet f57619;

    public static EnumC18565 valueOf(String str) {
        return (EnumC18565) Enum.valueOf(EnumC18565.class, str);
    }

    public static EnumC18565[] values() {
        return (EnumC18565[]) f57618.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC18565[] m43104() {
        return new EnumC18565[]{f57617, f57616, f57615};
    }

    static {
        EnumC10969 enumC10969 = EnumC10969.f33008;
        f57617 = new EnumC18565("EQ", 0, EnumSet.of(enumC10969));
        EnumC10969 enumC109610 = EnumC10969.f33007;
        f57616 = new EnumC18565("EQ_LOWER", 1, EnumSet.of(enumC10969, enumC109610));
        f57615 = new EnumC18565("EQ_LOWER_THROWS_UPPER_CAPTURED", 2, EnumSet.of(enumC10969, enumC109610, EnumC10969.f33010, EnumC10969.f33011, EnumC10969.f33012));
        f57618 = m43104();
    }

    public EnumC18565(String str, int i, EnumSet enumSet) {
        super(str, i);
        this.f57619 = enumSet;
    }
}
