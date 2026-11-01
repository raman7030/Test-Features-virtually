package p067l;

import android.text.SpannableStringBuilder;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7892 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20708;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f20709;

    public /* synthetic */ C7892(int i, Object obj) {
        this.f20708 = i;
        this.f20709 = obj;
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
        switch (this.f20708) {
            case 0:
                return (SpannableStringBuilder) ((C11916) this.f20709).invoke(obj);
            case 1:
                return ((MaterialDynamicColors) this.f20709).lambda$primary$54((DynamicScheme) obj);
            default:
                return ((MaterialDynamicColors) this.f20709).lambda$onBackground$14((DynamicScheme) obj);
        }
    }
}
