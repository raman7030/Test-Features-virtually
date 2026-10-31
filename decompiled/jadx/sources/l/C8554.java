package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: B13Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8554 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26156;

    public /* synthetic */ C8554(int i) {
        this.f26156 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f26156) {
            case 0:
                return ((C2204) obj).f7242;
            case 1:
                return MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
            default:
                return ((DynamicScheme) obj).neutralPalette;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
