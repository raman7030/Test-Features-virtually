package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22966 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72231;

    public /* synthetic */ C22966(int i) {
        this.f72231 = i;
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
        switch (this.f72231) {
            case 0:
                return new HashSet();
            case 1:
                return new C7637("", ((C21249) obj).m48007());
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return ((C11281) obj).f31438.f20408;
            default:
                return ((InterfaceC14415) obj).toString();
        }
    }
}
