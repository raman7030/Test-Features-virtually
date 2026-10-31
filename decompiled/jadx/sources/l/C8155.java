package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8155 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25143;

    public /* synthetic */ C8155(int i) {
        this.f25143 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f25143) {
            case 0:
                return ((AbstractC15440) obj).mo23554();
            default:
                return ((DynamicScheme) obj).neutralPalette;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
