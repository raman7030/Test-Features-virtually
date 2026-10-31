package l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21673 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69526;

    public /* synthetic */ C21673(int i) {
        this.f69526 = i;
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
        switch (this.f69526) {
            case 0:
                return new HashSet();
            case 1:
                return new C5543("", ((C19866) obj).m45696());
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return ((C9378) obj).f28489.f17562;
            default:
                return ((InterfaceC12675) obj).toString();
        }
    }
}
