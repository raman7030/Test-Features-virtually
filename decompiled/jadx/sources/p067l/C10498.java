package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B13Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10498 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29071;

    public /* synthetic */ C10498(int i) {
        this.f29071 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f29071) {
            case 0:
                return ((C4463) obj).f10027;
            case 1:
                return MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
            default:
                return ((DynamicScheme) obj).neutralPalette;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }
}
