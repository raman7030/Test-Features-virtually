package l;

import android.text.TextWatcher;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0065 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f975;

    public /* synthetic */ C0065(int i) {
        this.f975 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f975) {
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
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f975) {
            case 0:
                return C11003.nonNull((C21234) obj);
            case 1:
                return ((TextWatcher) obj) instanceof C4364;
            case 2:
                return ((AbstractC15440) obj).mo23120();
            case 3:
                String str = (String) obj;
                return str == null || str.isEmpty();
            case 4:
                return ((C18592) obj).m43132();
            case 5:
                String str2 = (String) obj;
                return str2.indexOf(47) == -1 && str2.toLowerCase().endsWith(".apk");
            case 6:
                return ((Set) ((Map.Entry) obj).getValue()).isEmpty();
            default:
                return C7260.m19429((AbstractC19669) obj);
        }
    }
}
