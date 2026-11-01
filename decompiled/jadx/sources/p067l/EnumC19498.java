package p067l;

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
public final class EnumC19498 {

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC19498 f59393;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC19498 f59394;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ EnumC19498[] f59395;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumSet f59396;

    public static EnumC19498 valueOf(String str) {
        return (EnumC19498) Enum.valueOf(EnumC19498.class, str);
    }

    public static EnumC19498[] values() {
        return (EnumC19498[]) f59395.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC19498[] m44323() {
        return new EnumC19498[]{f59394, f59393};
    }

    static {
        EnumC12793 enumC12793 = EnumC12793.f36001;
        f59394 = new EnumC19498("EQ_LOWER", 0, EnumSet.of(enumC12793, EnumC12793.f36000));
        f59393 = new EnumC19498("EQ_UPPER", 1, EnumSet.of(enumC12793, EnumC12793.f36002));
        f59395 = m44323();
    }

    public EnumC19498(String str, int i, EnumSet enumSet) {
        super(str, i);
        this.f59396 = enumSet;
    }
}
