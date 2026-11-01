package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24063 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f76430;

    public /* synthetic */ C24063(int i) {
        this.f76430 = i;
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
        switch (this.f76430) {
            case 0:
                return new C16458((C14677) obj);
            case 1:
                return MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).secondaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$outlineVariant$45((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).primaryPalette;
            case 5:
                C7929 c7929 = C12102.f33839;
                return null;
            default:
                return ((AbstractC7783) obj).f20406;
        }
    }
}
