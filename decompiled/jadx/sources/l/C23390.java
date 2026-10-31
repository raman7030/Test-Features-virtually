package l;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C23390 extends C10147 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Pattern f75140;

    public C23390() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f75140 = Pattern.compile("\\A\\d+");
    }

    @Override // l.AbstractC5913
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo16573() {
        boolean zMo16573 = super.mo16573();
        if (!zMo16573 || Build.VERSION.SDK_INT >= 29) {
            return zMo16573;
        }
        PackageInfo packageInfoM21343 = C8030.m21343();
        if (packageInfoM21343 != null) {
            Matcher matcher = this.f75140.matcher(packageInfoM21343.versionName);
            if (matcher.find() && Integer.parseInt(packageInfoM21343.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
