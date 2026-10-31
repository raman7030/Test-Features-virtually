package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.BitSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5T2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4563 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14568;

    public /* synthetic */ C4563(int i) {
        this.f14568 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f14568) {
            case 0:
                ApplicationInfo applicationInfo = ((PackageInfo) obj).applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            case 1:
                return new C16773((C12951) obj);
            case 2:
                return ((C4027) obj).f12783;
            case 3:
                return ((C8712) obj).f26517;
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
                return ((EnumC13833) obj).m33193();
            case 10:
                return ((EnumC15204) obj).m35962();
            case 11:
                return ((StackTraceElement) obj).toString();
            default:
                return C5378.stream(((C18963) obj).f59815);
        }
    }
}
