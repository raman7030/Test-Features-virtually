package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1981 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6638;

    public /* synthetic */ C1981(int i) {
        this.f6638 = i;
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
        switch (this.f6638) {
            case 0:
                return "#" + ((Integer) obj);
            case 1:
                return new C23636();
            case 2:
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
                int i = C20239.f65443;
                if (!interfaceC17889.isDirectory()) {
                    return interfaceC17889.getPath();
                }
                return interfaceC17889.getPath() + "/";
            case 3:
                return ((DynamicScheme) obj).secondaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$errorContainer$98((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$primaryContainer$59((DynamicScheme) obj);
            case 6:
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
            default:
                return C5378.stream(((C18963) obj).f59815);
        }
    }
}
