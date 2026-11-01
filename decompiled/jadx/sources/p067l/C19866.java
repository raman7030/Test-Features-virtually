package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19866 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f60377;

    public /* synthetic */ C19866(int i) {
        this.f60377 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f60377) {
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
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m45108or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f60377) {
            case 0:
                return ((AbstractC17043) obj).mo25093();
            case 1:
                return ((AbstractC16003) obj) instanceof C18229;
            case 2:
                return !((Set) ((Map.Entry) obj).getValue()).isEmpty();
            case 3:
                AbstractC7783 abstractC7783 = (AbstractC7783) obj;
                return abstractC7783.f20405 == EnumC3600.f7343 && (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0;
            case 4:
                AbstractC7783 abstractC7784 = (AbstractC7783) obj;
                return abstractC7784.f20405 == EnumC3600.f7339 && (abstractC7784.mo18003() & 2305843009213693952L) != 0;
            default:
                EnumC21300 enumC21300 = (EnumC21300) obj;
                return enumC21300 == EnumC21300.f67050 || enumC21300 == EnumC21300.f67075 || enumC21300 == EnumC21300.f67032 || enumC21300 == EnumC21300.f67026;
        }
    }
}
