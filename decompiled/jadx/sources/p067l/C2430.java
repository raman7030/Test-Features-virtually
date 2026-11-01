package p067l;

import android.text.TextWatcher;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2430 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f3750;

    public /* synthetic */ C2430(int i) {
        this.f3750 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f3750) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m3401or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f3750) {
            case 0:
                return C12826.nonNull((C22549) obj);
            case 1:
                return ((TextWatcher) obj) instanceof C6516;
            case 2:
                return ((AbstractC17043) obj).mo25094();
            case 3:
                String str = (String) obj;
                return str == null || str.isEmpty();
            case 4:
                return ((C20038) obj).m45397();
            case 5:
                String str2 = (String) obj;
                return str2.indexOf(47) == -1 && str2.toLowerCase().endsWith(".apk");
            case 6:
                return ((Set) ((Map.Entry) obj).getValue()).isEmpty();
            default:
                return C9268.m21395((AbstractC21062) obj);
        }
    }
}
