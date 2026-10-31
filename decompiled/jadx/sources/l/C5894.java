package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5894 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18100;

    public /* synthetic */ C5894(int i) {
        this.f18100 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f18100) {
            case 0:
                return new C9160((C12951) obj);
            case 1:
                return MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).primaryPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
            case 5:
                return C5378.stream((C2609) obj);
            default:
                return C5378.stream(((C18963) obj).f59815);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
