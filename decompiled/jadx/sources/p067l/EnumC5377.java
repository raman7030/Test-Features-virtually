package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۗۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC5377 {

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC5377 f12771 = new C23482();

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC5377 f12769 = new C21471();

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC5377 f12768 = new C6718();

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC5377[] f12770 = m11757();

    public /* synthetic */ EnumC5377(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC5377 mo11759(EnumC5377 enumC5377);

    /* JADX INFO: renamed from: ۧ */
    public abstract EnumC5377 mo11761(EnumC5377 enumC5377);

    public EnumC5377(String str, int i) {
        super(str, i);
    }

    public static EnumC5377 valueOf(String str) {
        return (EnumC5377) Enum.valueOf(EnumC5377.class, str);
    }

    public static EnumC5377[] values() {
        return (EnumC5377[]) f12770.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC5377[] m11757() {
        return new EnumC5377[]{f12771, f12769, f12768};
    }

    /* JADX INFO: renamed from: ۧ */
    public EnumC5377 m11762(boolean z) {
        return mo11761(m11758(z));
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC5377 m11760(boolean z) {
        return mo11759(m11758(z));
    }

    /* JADX INFO: renamed from: ܽ */
    public static EnumC5377 m11758(boolean z) {
        return z ? f12771 : f12769;
    }
}
