package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23519 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75487;

    public /* synthetic */ C23519(int i) {
        this.f75487 = i;
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
        switch (this.f75487) {
            case 0:
                return C15757.m37159((AbstractC15440) obj);
            case 1:
                return ((C5417) obj).m15502();
            case 2:
                return C11003.toString((EnumC12890) obj);
            case 3:
                return AbstractC3163.m9676((C12951) obj);
            case 4:
                return ((InterfaceC13508) obj).mo31674();
            case 5:
                return new ArrayList();
            case 6:
                return MaterialDynamicColors.lambda$controlActivated$146((DynamicScheme) obj);
            case 7:
                return MaterialDynamicColors.lambda$onTertiary$83((DynamicScheme) obj);
            case 8:
                return C4860.m14172("\"", (String) obj, "\"");
            default:
                return C16646.of(((InterfaceC22741) obj).m50820());
        }
    }
}
