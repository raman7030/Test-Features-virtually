package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9982 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f27652;

    public /* synthetic */ C9982(int i) {
        this.f27652 = i;
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
        switch (this.f27652) {
            case 0:
                return ((C8049) obj).m18696().toLowerCase();
            case 1:
                return C4954.m10507((C3771) obj);
            case 2:
                return ((C4415) obj).f9915;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return MaterialDynamicColors.lambda$tertiaryFixed$132((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).neutralPalette;
            case 7:
                return ((EnumC15515) obj).m35310();
            case 8:
                C3724 c3724 = (C3724) obj;
                EnumC14113 enumC14113 = EnumC14113.CONSTANT_NULL;
                return new C23697(c3724.m7172(), (String) c3724.f22917);
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
