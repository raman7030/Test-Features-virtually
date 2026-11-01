package p067l;

import java.util.BitSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC3198 {

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC3198 f6209 = new C20634();

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC3198 f6207 = new C2527();

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC3198 f6206 = new C7222();

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC3198[] f6208 = m5529();

    public /* synthetic */ EnumC3198(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo3694(BitSet bitSet, int i);

    public EnumC3198(String str, int i) {
        super(str, i);
    }

    public static EnumC3198 valueOf(String str) {
        return (EnumC3198) Enum.valueOf(EnumC3198.class, str);
    }

    public static EnumC3198[] values() {
        return (EnumC3198[]) f6208.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC3198[] m5529() {
        return new EnumC3198[]{f6209, f6207, f6206};
    }
}
