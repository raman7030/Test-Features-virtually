package p067l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.BitSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6705 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f17397;

    public /* synthetic */ C6705(int i) {
        this.f17397 = i;
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
        switch (this.f17397) {
            case 0:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 1:
                return new C18310((C14677) obj);
            case 2:
                return ((C6196) obj).f15598;
            case 3:
                return ((C10648) obj).f29442;
            case 4:
                return new BitSet();
            case 5:
                return MaterialDynamicColors.lambda$surfaceContainerLowest$22((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 7:
                return ((DynamicScheme) obj).neutralPalette;
            case 8:
                return MaterialDynamicColors.lambda$shadow$47((DynamicScheme) obj);
            case 9:
                return ((EnumC15515) obj).m35311();
            case 10:
                return ((EnumC16818) obj).m38122();
            case 11:
                return ((StackTraceElement) obj).toString();
            default:
                return C7480.stream(((C20391) obj).f63044);
        }
    }
}
