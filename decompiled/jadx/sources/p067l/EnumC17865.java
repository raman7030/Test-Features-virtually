package p067l;

import android.net.Uri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܽ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC17865 {

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC17865 f53335 = new C3784();

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC17865 f53333 = new C12502();

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC17865[] f53334 = m40584();

    public /* synthetic */ EnumC17865(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract long mo7400();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo7401(Uri uri);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo7402(String str);

    public EnumC17865(String str, int i) {
        super(str, i);
    }

    public static EnumC17865 valueOf(String str) {
        return (EnumC17865) Enum.valueOf(EnumC17865.class, str);
    }

    public static EnumC17865[] values() {
        return (EnumC17865[]) f53334.clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ EnumC17865[] m40584() {
        return new EnumC17865[]{f53335, f53333};
    }
}
