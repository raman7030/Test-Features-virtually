package l;

import com.google.android.material.datepicker.UtcDates;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۢ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9612 {
    public static final EnumC9612 STANDARD;
    public static final EnumC9612 UTC;
    public static final EnumC9612 WALL;
    public static final /* synthetic */ EnumC9612[] a;

    public static EnumC9612 valueOf(String str) {
        return (EnumC9612) Enum.valueOf(EnumC9612.class, str);
    }

    public static EnumC9612[] values() {
        return (EnumC9612[]) a.clone();
    }

    static {
        EnumC9612 enumC9612 = new EnumC9612(UtcDates.UTC, 0);
        UTC = enumC9612;
        EnumC9612 enumC9613 = new EnumC9612("WALL", 1);
        WALL = enumC9613;
        EnumC9612 enumC9614 = new EnumC9612("STANDARD", 2);
        STANDARD = enumC9614;
        a = new EnumC9612[]{enumC9612, enumC9613, enumC9614};
    }
}
