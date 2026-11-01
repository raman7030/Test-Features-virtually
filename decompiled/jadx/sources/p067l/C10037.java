package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10037 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f27787;

    public /* synthetic */ C10037(int i) {
        this.f27787 = i;
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
        switch (this.f27787) {
            case 0:
                C5777 c5777M6848 = ((C3626) obj).m6848();
                if (c5777M6848 != null) {
                    return C9268.m21418(c5777M6848.f14183);
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
                return Integer.valueOf(((EnumC6799) obj).m15523());
        }
    }
}
