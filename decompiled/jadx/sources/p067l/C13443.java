package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13443 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37750;

    public /* synthetic */ C13443(int i) {
        this.f37750 = i;
    }

    public /* synthetic */ C13443(C16728 c16728) {
        this.f37750 = 1;
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
        switch (this.f37750) {
            case 0:
                return (InterfaceC5552) ((AbstractC11588) obj);
            case 1:
                return ((AbstractC17043) obj).getName();
            case 2:
                return MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
            default:
                return (Iterator) obj;
        }
    }
}
