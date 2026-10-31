package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12247 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36504;

    public /* synthetic */ C12247(int i) {
        this.f36504 = i;
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
        switch (this.f36504) {
            case 0:
                return ((C15068) obj).m35657();
            case 1:
                return ((C6703) obj).m18262();
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
