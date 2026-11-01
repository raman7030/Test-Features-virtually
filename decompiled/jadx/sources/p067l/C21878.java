package p067l;

import android.content.pm.PackageInfo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A16O */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21878 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f68817;

    public /* synthetic */ C21878(int i) {
        this.f68817 = i;
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
        switch (this.f68817) {
            case 0:
                Object objM42109 = C18524.m42109((String) obj, new String[0]);
                return objM42109 instanceof InterfaceC23140 ? ((InterfaceC23140) objM42109).mo29974() : objM42109;
            case 1:
                return new C23244((C14677) obj);
            case 2:
                return ((PackageInfo) obj).applicationInfo.sourceDir;
            case 3:
                return ((C13946) obj).m31720();
            case 4:
                return ((DynamicScheme) obj).secondaryPalette;
            case 5:
                return MaterialDynamicColors.lambda$scrim$49((DynamicScheme) obj);
            default:
                return ((DynamicScheme) obj).neutralVariantPalette;
        }
    }
}
