package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15420 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47228;

    public /* synthetic */ C15420(int i) {
        this.f47228 = i;
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
        switch (this.f47228) {
            case 0:
                return ((C22477) ((Map.Entry) obj).getValue()).f72784;
            case 1:
                int i = AbstractActivityC12266.f36524;
                return ((C8739) obj).f26609;
            case 2:
                return C17626.m41198((C12951) obj);
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiary$80((DynamicScheme) obj);
            case 5:
                return ((DynamicScheme) obj).primaryPalette;
            case 6:
                return ((C1846) obj).m6131();
            case 7:
                int i2 = C13269.f39737;
                return null;
            default:
                return ((C18837) obj).m43517();
        }
    }
}
