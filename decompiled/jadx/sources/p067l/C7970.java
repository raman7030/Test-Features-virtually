package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7970 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20955;

    public /* synthetic */ C7970(int i) {
        this.f20955 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f20955) {
            case 0:
                return new C11075((C14677) obj);
            case 1:
                return MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).primaryPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
            case 5:
                return C7480.stream((C4848) obj);
            default:
                return C7480.stream(((C20391) obj).f63044);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }
}
