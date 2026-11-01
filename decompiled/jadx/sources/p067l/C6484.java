package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TemperatureCache;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6484 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f16744;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f16745;

    public /* synthetic */ C6484(int i, Object obj) {
        this.f16744 = i;
        this.f16745 = obj;
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
        switch (this.f16744) {
            case 0:
                return Boolean.valueOf(!((EnumC5532) obj).equals(((InterfaceC2654) this.f16745).mo3381()));
            case 1:
                return ((MaterialDynamicColors) this.f16745).lambda$tertiary$81((DynamicScheme) obj);
            default:
                return ((TemperatureCache) this.f16745).lambda$getHctsByTemp$0((Hct) obj);
        }
    }
}
