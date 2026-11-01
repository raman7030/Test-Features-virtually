package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10842 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30026;

    public /* synthetic */ C10842(int i) {
        this.f30026 = i;
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
        switch (this.f30026) {
            case 0:
                return Boolean.valueOf(((String) obj).contains("module-info."));
            case 1:
                return MaterialDynamicColors.lambda$onErrorContainer$101((DynamicScheme) obj);
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return new HashSet();
        }
    }
}
