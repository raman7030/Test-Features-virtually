package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8224 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f21812;

    public /* synthetic */ C8224(int i) {
        this.f21812 = i;
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
        switch (this.f21812) {
            case 0:
                return C4598.m9702((C14677) obj);
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return new HashMap();
        }
    }
}
