package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9053 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f24560;

    public /* synthetic */ C9053(int i) {
        this.f24560 = i;
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
        switch (this.f24560) {
            case 0:
                return ((C5738) obj).m12791();
            case 1:
                return MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return (InterfaceC16847) obj;
            default:
                return ((AbstractC6462) obj).mo5302();
        }
    }
}
