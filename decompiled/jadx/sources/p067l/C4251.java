package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4251 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f9418;

    public /* synthetic */ C4251(int i) {
        this.f9418 = i;
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
        switch (this.f9418) {
            case 0:
                return "#" + ((Integer) obj);
            case 1:
                return new C24832();
            case 2:
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) obj;
                int i = C21604.f68092;
                if (!interfaceC19370.isDirectory()) {
                    return interfaceC19370.getPath();
                }
                return interfaceC19370.getPath() + "/";
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$errorContainer$98((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$primaryContainer$59((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
            default:
                return C7480.stream(((C20391) obj).f63044);
        }
    }
}
