package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17024 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f50357;

    public /* synthetic */ C17024(int i) {
        this.f50357 = i;
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
        switch (this.f50357) {
            case 0:
                return ((C23731) ((Map.Entry) obj).getValue()).f75511;
            case 1:
                int i = AbstractActivityC14026.f39540;
                return ((C10674) obj).f29534;
            case 2:
                return C19121.m43444((C14677) obj);
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiary$80((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).primaryPalette;
            case 6:
                return ((C4123) obj).m8329();
            case 7:
                int i2 = C14979.f42802;
                return null;
            default:
                return ((C20271) obj).m45783();
        }
    }
}
