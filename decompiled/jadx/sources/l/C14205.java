package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14205 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42871;

    public /* synthetic */ C14205(int i) {
        this.f42871 = i;
    }

    public /* synthetic */ C14205(C3419 c3419) {
        this.f42871 = 8;
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
        switch (this.f42871) {
            case 0:
                return "#" + ((Integer) obj);
            case 1:
                return (String) ((Map.Entry) obj).getKey();
            case 2:
                int i = C3276.f10309;
                return C16999.m39866((String) obj, new String[0]);
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$tertiaryFixedDim$135((DynamicScheme) obj);
            case 6:
                return new LinkedHashSet();
            case 7:
                return ((C9378) obj).f28489.f17560;
            default:
                return C3419.m10378((InterfaceC9875) obj);
        }
    }
}
