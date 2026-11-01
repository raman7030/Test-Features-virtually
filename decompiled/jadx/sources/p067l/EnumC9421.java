package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۟ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC9421 {

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f25722;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC9421 f25719 = new C12104();

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC9421 f25718 = new C8080();

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC9421 f25717 = new C13445();

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC9421 f25716 = new C24173();

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC9421 f25720 = new C15455();

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ EnumC9421[] f25721 = m21920();

    public /* synthetic */ EnumC9421(String str, int i, int i2, boolean z) {
        this(str, i, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC9421 mo18750(EnumC14115 enumC14115);

    public static EnumC9421 valueOf(String str) {
        return (EnumC9421) Enum.valueOf(EnumC9421.class, str);
    }

    public static EnumC9421[] values() {
        return (EnumC9421[]) f25721.clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ EnumC9421[] m21920() {
        return new EnumC9421[]{f25719, f25718, f25717, f25716, f25720};
    }

    public EnumC9421(String str, int i, boolean z) {
        super(str, i);
        this.f25722 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m21921() {
        return this.f25722;
    }
}
