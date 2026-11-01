package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91T6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7929 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20800;

    public /* synthetic */ C7929(int i) {
        this.f20800 = i;
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
        switch (this.f20800) {
            case 0:
                return C13294.m30367((String) obj);
            case 1:
                return C4744.f10749;
            case 2:
                return new ArrayList();
            case 3:
                return new C11450((AbstractC17043) obj);
            case 4:
                return ((C6268) obj).f15852;
            case 5:
                return MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$controlNormal$148((DynamicScheme) obj);
            case 7:
                return MaterialDynamicColors.lambda$onPrimary$56((DynamicScheme) obj);
            case 8:
                return MaterialDynamicColors.lambda$tertiaryContainer$86((DynamicScheme) obj);
            case 9:
                return String.format("??? Invalid constant_pool reference #%d", (Integer) obj);
            default:
                return C8300.m19127(EnumC21300.f67015, EnumC21300.f67052);
        }
    }
}
