package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22536 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72918;

    public /* synthetic */ C22536(int i) {
        this.f72918 = i;
    }

    public /* synthetic */ C22536(C3419 c3419) {
        this.f72918 = 8;
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
        switch (this.f72918) {
            case 0:
                return ((InterfaceC17889) obj).getName();
            case 1:
                return ((InterfaceC17889) obj).getName().toLowerCase();
            case 2:
                return ((C11077) obj).m27483();
            case 3:
                return ((C18011) obj).f56169;
            case 4:
                return MaterialDynamicColors.lambda$surfaceContainerLow$24((DynamicScheme) obj);
            case 5:
                int i = C7856.f24356;
                return "????";
            case 6:
                return String.format("#%d?", (Integer) obj);
            case 7:
                return String.format("#%d", (Integer) obj);
            default:
                return C3419.m10380((InterfaceC16223) obj);
        }
    }
}
