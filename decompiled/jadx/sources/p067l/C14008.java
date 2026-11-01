package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14008 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f39521;

    public /* synthetic */ C14008(int i) {
        this.f39521 = i;
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
        switch (this.f39521) {
            case 0:
                return ((C16689) obj).m37815();
            case 1:
                return ((C8739) obj).m20210();
            case 2:
                return new ArrayList();
            case 3:
                return ((DynamicScheme) obj).errorPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
            default:
                return MaterialDynamicColors.lambda$secondaryFixedDim$121((DynamicScheme) obj);
        }
    }
}
