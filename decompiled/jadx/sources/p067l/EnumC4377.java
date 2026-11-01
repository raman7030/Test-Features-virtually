package p067l;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֫᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 041Z */
/* JADX INFO: loaded from: classes2.dex */
public class EnumC4377 {

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC4377 f9835 = new EnumC4377("PUBLIC", 0);

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC4377 f9837 = new EnumC4377("PROTECTED", 1);

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC4377 f9840 = new EnumC4377("PRIVATE", 2);

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC4377 f9845 = new EnumC4377("ABSTRACT", 3);

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC4377 f9843 = new EnumC4377("DEFAULT", 4);

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC4377 f9846 = new EnumC4377("STATIC", 5);

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC4377 f9839 = new EnumC4377("SEALED", 6);

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC4377 f9841 = new C9721();

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC4377 f9834 = new EnumC4377("FINAL", 8);

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC4377 f9832 = new EnumC4377("TRANSIENT", 9);

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC4377 f9838 = new EnumC4377("VOLATILE", 10);

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC4377 f9836 = new EnumC4377("SYNCHRONIZED", 11);

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC4377 f9833 = new EnumC4377("NATIVE", 12);

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC4377 f9842 = new EnumC4377("STRICTFP", 13);

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC4377[] f9844 = m9110();

    public /* synthetic */ EnumC4377(String str, int i, int i2) {
        this(str, i);
    }

    public EnumC4377(String str, int i) {
        super(str, i);
    }

    public static EnumC4377 valueOf(String str) {
        return (EnumC4377) Enum.valueOf(EnumC4377.class, str);
    }

    public static EnumC4377[] values() {
        return (EnumC4377[]) f9844.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC4377[] m9110() {
        return new EnumC4377[]{f9835, f9837, f9840, f9845, f9843, f9846, f9839, f9841, f9834, f9832, f9838, f9836, f9833, f9842};
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.US);
    }
}
