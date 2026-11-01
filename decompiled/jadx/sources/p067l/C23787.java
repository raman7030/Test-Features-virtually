package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23787 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f75645;

    public /* synthetic */ C23787(int i) {
        this.f75645 = i;
    }

    public /* synthetic */ C23787(C5618 c5618) {
        this.f75645 = 8;
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
        switch (this.f75645) {
            case 0:
                return ((InterfaceC19370) obj).getName();
            case 1:
                return ((InterfaceC19370) obj).getName().toLowerCase();
            case 2:
                return ((C12896) obj).m29545();
            case 3:
                return ((C19486) obj).f59366;
            case 4:
                return MaterialDynamicColors.lambda$surfaceContainerLow$24((DynamicScheme) obj);
            case 5:
                int i = C9834.f27272;
                return "????";
            case 6:
                return String.format("#%d?", (Integer) obj);
            case 7:
                return String.format("#%d", (Integer) obj);
            default:
                return C5618.m12419((InterfaceC17787) obj);
        }
    }
}
