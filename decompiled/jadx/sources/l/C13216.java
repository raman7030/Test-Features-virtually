package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13216 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39565;

    public /* synthetic */ C13216(int i) {
        this.f39565 = i;
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
        switch (this.f39565) {
            case 0:
                return ((C12511) obj).f37581;
            case 1:
                return ((Thread) ((Map.Entry) obj).getKey()).getName();
            case 2:
                return new ArrayList();
            case 3:
                return MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
            case 4:
                return Integer.valueOf(((String) obj).length());
            default:
                return C6241.m17188((EnumC19920) obj);
        }
    }
}
