package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10816 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29966;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f29967;

    public /* synthetic */ C10816(int i, Object obj) {
        this.f29966 = i;
        this.f29967 = obj;
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
        switch (this.f29966) {
            case 0:
                return ActivityC18686.m42550((ActivityC18686) this.f29967, (AbstractC16003) obj);
            case 1:
                return (C19033) ((C19704) this.f29967).invoke(obj);
            default:
                return ((MaterialDynamicColors) this.f29967).lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
        }
    }
}
