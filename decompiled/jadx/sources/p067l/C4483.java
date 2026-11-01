package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4483 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f10066;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f10067;

    public /* synthetic */ C4483(int i, Object obj) {
        this.f10066 = i;
        this.f10067 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f10066) {
            case 0:
                return ((C24913) this.f10067).m54735((BooleanSupplier) obj);
            case 1:
                return ((MaterialDynamicColors) this.f10067).lambda$secondaryContainer$75((DynamicScheme) obj);
            default:
                return C24306.m53639((C24306) this.f10067, (String) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }
}
