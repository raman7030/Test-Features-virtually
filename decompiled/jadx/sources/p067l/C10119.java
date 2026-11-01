package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10119 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f28055;

    public /* synthetic */ C10119(int i) {
        this.f28055 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f28055) {
            case 0:
                return ((AbstractC17043) obj).mo25505();
            default:
                return ((DynamicScheme) obj).neutralPalette;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }
}
