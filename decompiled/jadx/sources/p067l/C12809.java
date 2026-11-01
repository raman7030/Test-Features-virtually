package p067l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 51FV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12809 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f36039;

    public /* synthetic */ C12809(int i) {
        this.f36039 = i;
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
        switch (this.f36039) {
            case 0:
                return C7480.stream((List) obj);
            case 1:
                return new C21249(((AbstractC17043) obj).m38675());
            case 2:
                return C7269.m16644((CharSequence) obj);
            case 3:
                return "$RECYCLE.BIN$" + ((InterfaceC19370) obj).getPath();
            case 4:
                return MaterialDynamicColors.lambda$onSurfaceVariant$36((DynamicScheme) obj);
            case 5:
                return MaterialDynamicColors.lambda$onTertiaryFixed$138((DynamicScheme) obj);
            case 6:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return (Integer) ((C6739) obj).m15399().m35190();
        }
    }
}
