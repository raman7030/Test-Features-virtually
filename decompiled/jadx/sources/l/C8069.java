package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8069 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24874;

    public /* synthetic */ C8069(int i) {
        this.f24874 = i;
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
        switch (this.f24874) {
            case 0:
                C3587 c3587M4616 = ((C1323) obj).m4616();
                if (c3587M4616 != null) {
                    return C7260.m19452(c3587M4616.f11378);
                }
                return null;
            case 1:
                return new ArrayList();
            case 2:
                return ((DynamicScheme) obj).secondaryPalette;
            case 3:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 4:
                return MaterialDynamicColors.lambda$controlHighlight$151((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).neutralVariantPalette;
            default:
                return Integer.valueOf(((EnumC4662) obj).m13648());
        }
    }
}
