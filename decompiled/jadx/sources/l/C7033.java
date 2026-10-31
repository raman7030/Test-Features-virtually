package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7033 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21679;

    public /* synthetic */ C7033(int i) {
        this.f21679 = i;
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
        switch (this.f21679) {
            case 0:
                return ((C3545) obj).m10810();
            case 1:
                return MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return (InterfaceC15234) obj;
            default:
                return ((AbstractC4308) obj).mo2973();
        }
    }
}
