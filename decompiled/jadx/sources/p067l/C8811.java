package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8811 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23925;

    public /* synthetic */ C8811(int i) {
        this.f23925 = i;
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
        switch (this.f23925) {
            case 0:
                return ((C22223) obj).toString();
            case 1:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
            default:
                return ((InterfaceC22483) obj).mo3352();
        }
    }
}
