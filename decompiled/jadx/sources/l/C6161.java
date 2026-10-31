package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6161 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18953;

    public /* synthetic */ C6161(int i) {
        this.f18953 = i;
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
        switch (this.f18953) {
            case 0:
                return C2346.m7631((C12951) obj);
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return new HashMap();
        }
    }
}
