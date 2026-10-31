package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۗۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC3042 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC3042 f9578 = new C19976();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC3042 f9580 = new C4453();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC3042[] f9579 = m9294();

    public /* synthetic */ EnumC3042(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo9295(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386, C6319 c6319);

    public EnumC3042(String str, int i) {
        super(str, i);
    }

    public static EnumC3042 valueOf(String str) {
        return (EnumC3042) Enum.valueOf(EnumC3042.class, str);
    }

    public static EnumC3042[] values() {
        return (EnumC3042[]) f9579.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC3042[] m9294() {
        return new EnumC3042[]{f9578, f9580};
    }
}
