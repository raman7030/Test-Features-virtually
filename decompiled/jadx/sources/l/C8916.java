package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8916 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27094;

    public /* synthetic */ C8916(int i) {
        this.f27094 = i;
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
        switch (this.f27094) {
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
