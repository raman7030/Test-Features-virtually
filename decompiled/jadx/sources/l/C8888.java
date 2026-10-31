package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8888 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27042;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27043;

    public /* synthetic */ C8888(int i, Object obj) {
        this.f27042 = i;
        this.f27043 = obj;
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
        switch (this.f27042) {
            case 0:
                return ActivityC17169.m40305((ActivityC17169) this.f27043, (AbstractC14346) obj);
            case 1:
                return (C17534) ((C18240) this.f27043).invoke(obj);
            default:
                return ((MaterialDynamicColors) this.f27043).lambda$onSecondaryFixedVariant$130((DynamicScheme) obj);
        }
    }
}
