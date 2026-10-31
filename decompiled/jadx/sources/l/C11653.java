package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11653 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34751;

    public /* synthetic */ C11653(int i) {
        this.f34751 = i;
    }

    public /* synthetic */ C11653(C15109 c15109) {
        this.f34751 = 1;
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
        switch (this.f34751) {
            case 0:
                return (InterfaceC3350) ((AbstractC9701) obj);
            case 1:
                return ((AbstractC15440) obj).getName();
            case 2:
                return MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
            default:
                return (Iterator) obj;
        }
    }
}
