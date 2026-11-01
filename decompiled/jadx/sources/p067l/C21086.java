package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21086 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f66246;

    public /* synthetic */ C21086(int i) {
        this.f66246 = i;
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
        switch (this.f66246) {
            case 0:
                return ((C24675) obj).m54323();
            case 1:
                return ((C10674) obj).f29534;
            case 2:
                return ((EnumC3167) obj).f6089;
            case 3:
                return ((C19160) obj).f57226;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return MaterialDynamicColors.lambda$controlHighlight$150((DynamicScheme) obj);
        }
    }
}
