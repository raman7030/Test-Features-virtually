package p067l;

import com.google.android.material.datepicker.UtcDates;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۢ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11504 {
    public static final EnumC11504 STANDARD;
    public static final EnumC11504 UTC;
    public static final EnumC11504 WALL;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC11504[] f32104a;

    public static EnumC11504 valueOf(String str) {
        return (EnumC11504) Enum.valueOf(EnumC11504.class, str);
    }

    public static EnumC11504[] values() {
        return (EnumC11504[]) f32104a.clone();
    }

    static {
        EnumC11504 enumC11504 = new EnumC11504(UtcDates.UTC, 0);
        UTC = enumC11504;
        EnumC11504 enumC11505 = new EnumC11504("WALL", 1);
        WALL = enumC11505;
        EnumC11504 enumC11506 = new EnumC11504("STANDARD", 2);
        STANDARD = enumC11506;
        f32104a = new EnumC11504[]{enumC11504, enumC11505, enumC11506};
    }
}
