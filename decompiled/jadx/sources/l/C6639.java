package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6639 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20421;

    public /* synthetic */ C6639(int i) {
        this.f20421 = i;
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
        switch (this.f20421) {
            case 0:
                return C9523.m24404((String) obj);
            case 1:
                int i = C4074.f12935;
                return new ArrayList();
            case 2:
                return ((C3545) obj).getName();
            case 3:
                return MaterialDynamicColors.lambda$surfaceContainer$26((DynamicScheme) obj);
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return ((C12048) obj).f17562;
            default:
                return ((InterfaceC5641) obj).toString();
        }
    }
}
