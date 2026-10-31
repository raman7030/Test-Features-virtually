package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5748 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17678;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17679;

    public /* synthetic */ C5748(int i, Object obj) {
        this.f17678 = i;
        this.f17679 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f17678) {
            case 0:
                return C11393.m28156((C11393) this.f17679, (String) obj);
            default:
                return ((MaterialDynamicColors) this.f17679).lambda$tertiaryFixedDim$136((DynamicScheme) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
