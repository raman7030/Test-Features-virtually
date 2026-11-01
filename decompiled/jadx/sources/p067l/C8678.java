package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8678 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f23297;

    public /* synthetic */ C8678(int i) {
        this.f23297 = i;
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
        switch (this.f23297) {
            case 0:
                return C11419.m26414((String) obj);
            case 1:
                int i = C6241.f15751;
                return new ArrayList();
            case 2:
                return ((C5738) obj).getName();
            case 3:
                return MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((C13818) obj).f20408;
            default:
                return ((InterfaceC7730) obj).toString();
        }
    }
}
