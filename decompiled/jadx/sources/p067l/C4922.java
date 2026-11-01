package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4922 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f11207;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f11208;

    public /* synthetic */ C4922(int i, Object obj) {
        this.f11207 = i;
        this.f11208 = obj;
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
        int i = this.f11207;
        Object obj2 = this.f11208;
        switch (i) {
            case 0:
                return ((C5592) obj2).m26657(9, "uses").concat(String.format("%s;%n", (C21686) obj));
            default:
                C8005 c8005 = (C8005) obj2;
                if (obj instanceof C13370) {
                    return c8005.m18543((C13370) obj);
                }
                c8005.getClass();
                return obj;
        }
    }
}
