package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15868 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f45961;

    public /* synthetic */ C15868(int i) {
        this.f45961 = i;
    }

    public /* synthetic */ C15868(C5618 c5618) {
        this.f45961 = 8;
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
        switch (this.f45961) {
            case 0:
                return "#" + ((Integer) obj);
            case 1:
                return (String) ((Map.Entry) obj).getKey();
            case 2:
                int i = C5482.f13117;
                return C18524.m42109((String) obj, new String[0]);
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135((DynamicScheme) obj);
            case 6:
                return new LinkedHashSet();
            case 7:
                return ((C11281) obj).f31438.f20406;
            default:
                return C5618.m12417((InterfaceC11754) obj);
        }
    }
}
