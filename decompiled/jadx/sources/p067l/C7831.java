package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7831 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20523;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f20524;

    public /* synthetic */ C7831(int i, Object obj) {
        this.f20523 = i;
        this.f20524 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f20523) {
            case 0:
                return C13196.m30200((C13196) this.f20524, (String) obj);
            default:
                return ((MaterialDynamicColors) this.f20524).lambda$tertiaryFixedDim$136((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }
}
