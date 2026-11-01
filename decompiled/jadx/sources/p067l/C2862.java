package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2862 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f4946;

    public /* synthetic */ C2862(int i) {
        this.f4946 = i;
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
        switch (this.f4946) {
            case 0:
                return new ArrayList();
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            default:
                return ((DynamicScheme) obj).primaryPalette;
        }
    }
}
