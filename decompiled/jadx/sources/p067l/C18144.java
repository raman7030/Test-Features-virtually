package p067l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1KK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18144 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54174;

    public /* synthetic */ C18144(int i) {
        this.f54174 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f54174) {
            case 0:
                return ((C19486) obj).f59366;
            case 1:
                int i = C24257.f76856;
                return C18524.m42109((String) obj, new String[0]);
            case 2:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 3:
                return MaterialDynamicColors.lambda$textPrimaryInverse$153((DynamicScheme) obj);
            case 4:
                return MaterialDynamicColors.lambda$secondaryContainer$74((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$onError$95((DynamicScheme) obj);
            case 6:
                return ((C11281) obj).f31438.f20406;
            default:
                return ((InterfaceC7730) obj).toString();
        }
    }
}
