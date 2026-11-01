package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N43O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10943 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f30324;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f30325;

    public /* synthetic */ C10943(int i, Object obj) {
        this.f30324 = i;
        this.f30325 = obj;
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
        switch (this.f30324) {
            case 0:
                InterfaceC22097 interfaceC22097 = (InterfaceC22097) obj;
                ((C17647) this.f30325).getClass();
                try {
                    return C18189.m41402of(C18743.readAttributes(interfaceC22097, InterfaceC16730.class, new EnumC16060[0]));
                } catch (IOException unused) {
                    return C18189.empty();
                }
            case 1:
                return ((MaterialDynamicColors) this.f30325).lambda$onTertiaryFixed$139((DynamicScheme) obj);
            default:
                return ((MaterialDynamicColors) this.f30325).lambda$onPrimaryContainer$62((DynamicScheme) obj);
        }
    }
}
