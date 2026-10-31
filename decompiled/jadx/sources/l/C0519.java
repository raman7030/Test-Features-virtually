package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0519 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2173;

    public /* synthetic */ C0519(int i) {
        this.f2173 = i;
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
        switch (this.f2173) {
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
