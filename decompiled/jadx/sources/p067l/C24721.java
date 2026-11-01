package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24721 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f78233;

    public /* synthetic */ C24721(int i) {
        this.f78233 = i;
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
        switch (this.f78233) {
            case 0:
                return C17344.m39329((AbstractC17043) obj);
            case 1:
                return ((C7517) obj).m17413();
            case 2:
                return C12826.toString((EnumC14619) obj);
            case 3:
                return AbstractC5375.m11720((C14677) obj);
            case 4:
                return ((InterfaceC15206) obj).mo33762();
            case 5:
                return new ArrayList();
            case 6:
                return MaterialDynamicColors.lambda$controlActivated$146((DynamicScheme) obj);
            case 7:
                return MaterialDynamicColors.lambda$onTertiary$83((DynamicScheme) obj);
            case 8:
                return C6988.m16053("\"", (String) obj, "\"");
            default:
                return C18189.m41402of(((InterfaceC23981) obj).m53153());
        }
    }
}
