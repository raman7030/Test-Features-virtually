package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20298 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f62708;

    public /* synthetic */ C20298(int i) {
        this.f62708 = i;
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
        switch (this.f62708) {
            case 0:
                return new HashMap();
            case 1:
                return C13757.f38882;
            case 2:
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
            case 3:
                return MaterialDynamicColors.lambda$secondaryFixed$118((DynamicScheme) obj);
            case 4:
                return new LinkedHashSet();
            default:
                return (InterfaceC23133) ((InterfaceC11912) obj).m27230();
        }
    }
}
