package l;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֫᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 041Z */
/* JADX INFO: loaded from: classes2.dex */
public class EnumC2113 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7050 = new EnumC2113("PUBLIC", 0);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7052 = new EnumC2113("PROTECTED", 1);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7055 = new EnumC2113("PRIVATE", 2);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7060 = new EnumC2113("ABSTRACT", 3);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7058 = new EnumC2113("DEFAULT", 4);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7061 = new EnumC2113("STATIC", 5);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7054 = new EnumC2113("SEALED", 6);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7056 = new C7736();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7049 = new EnumC2113("FINAL", 8);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7047 = new EnumC2113("TRANSIENT", 9);

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7053 = new EnumC2113("VOLATILE", 10);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7051 = new EnumC2113("SYNCHRONIZED", 11);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7048 = new EnumC2113("NATIVE", 12);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC2113 f7057 = new EnumC2113("STRICTFP", 13);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC2113[] f7059 = m6999();

    public /* synthetic */ EnumC2113(String str, int i, int i2) {
        this(str, i);
    }

    public EnumC2113(String str, int i) {
        super(str, i);
    }

    public static EnumC2113 valueOf(String str) {
        return (EnumC2113) Enum.valueOf(EnumC2113.class, str);
    }

    public static EnumC2113[] values() {
        return (EnumC2113[]) f7059.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC2113[] m6999() {
        return new EnumC2113[]{f7050, f7052, f7055, f7060, f7058, f7061, f7054, f7056, f7049, f7047, f7053, f7051, f7048, f7057};
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.US);
    }
}
