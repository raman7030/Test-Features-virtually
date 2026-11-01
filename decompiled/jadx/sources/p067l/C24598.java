package p067l;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C24598 extends C12012 {

    /* JADX INFO: renamed from: ᩳ */
    public final Pattern f77886;

    public C24598() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f77886 = Pattern.compile("\\A\\d+");
    }

    @Override // p067l.AbstractC7988
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo18499() {
        boolean zMo18499 = super.mo18499();
        if (!zMo18499 || Build.VERSION.SDK_INT >= 29) {
            return zMo18499;
        }
        PackageInfo packageInfoM23309 = C10000.m23309();
        if (packageInfoM23309 != null) {
            Matcher matcher = this.f77886.matcher(packageInfoM23309.versionName);
            if (matcher.find() && Integer.parseInt(packageInfoM23309.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
