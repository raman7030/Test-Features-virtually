package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14929 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f42630;

    public /* synthetic */ C14929(int i) {
        this.f42630 = i;
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
        switch (this.f42630) {
            case 0:
                return ((C14259) obj).f40605;
            case 1:
                return ((Thread) ((Map.Entry) obj).getKey()).getName();
            case 2:
                return new ArrayList();
            case 3:
                return MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
            case 4:
                return Integer.valueOf(((String) obj).length());
            default:
                return C8300.m19126((EnumC21300) obj);
        }
    }
}
