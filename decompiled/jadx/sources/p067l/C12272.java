package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12272 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f34288;

    public /* synthetic */ C12272(int i) {
        this.f34288 = i;
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
        switch (this.f34288) {
            case 0:
                C4225 c4225 = (C4225) obj;
                return c4225.m8578() + ": " + c4225.m8579();
            case 1:
                int i = AbstractActivityC14026.f39540;
                return ((C10674) obj).f29534;
            case 2:
                return ((InterfaceC22097) obj).toString();
            case 3:
                return new ArrayList(((Integer) obj).intValue());
            case 4:
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return MaterialDynamicColors.lambda$primaryFixedDim$107((DynamicScheme) obj);
        }
    }
}
