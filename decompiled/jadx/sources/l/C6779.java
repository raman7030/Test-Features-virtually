package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6779 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21051;

    public /* synthetic */ C6779(int i) {
        this.f21051 = i;
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
        switch (this.f21051) {
            case 0:
                return ((C20891) obj).toString();
            case 1:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
            default:
                return ((InterfaceC21164) obj).mo957();
        }
    }
}
