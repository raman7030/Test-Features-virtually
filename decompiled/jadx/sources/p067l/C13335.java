package p067l;

import bin.p000mt.json.JSONValue;
import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13335 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f37453;

    public /* synthetic */ C13335(int i) {
        this.f37453 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f37453) {
            case 0:
                return new C7280((C14677) obj);
            case 1:
                return C7480.stream(((C21678) obj).f68292);
            case 2:
                return C11419.m26416((String) obj);
            case 3:
                return (CharSequence) obj;
            case 4:
                return ((JSONValue) obj).asString();
            case 5:
                return ((DynamicScheme) obj).primaryPalette;
            default:
                return ((DynamicScheme) obj).primaryPalette;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }
}
