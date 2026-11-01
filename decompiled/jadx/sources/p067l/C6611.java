package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6611 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f17053;

    public /* synthetic */ C6611(int i) {
        this.f17053 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f17053) {
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
    public /* synthetic */ Predicate m15092or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f17053) {
            case 0:
                return ((AbstractC14973) obj) != C16984.m38573();
            case 1:
                C7012 c7012 = (C7012) obj;
                return c7012.m16134() > 0 || c7012.m16133() > 0;
            case 2:
                return ((AbstractC6462) obj).mo14805();
            case 3:
                AbstractC7783 abstractC7783 = (AbstractC7783) obj;
                return abstractC7783.f20405 == EnumC3600.f7343 && (abstractC7783.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 && (abstractC7783.mo18003() & 35184372088832L) == 0;
            case 4:
                return ((AbstractC7783) obj).f20405 == EnumC3600.f7343;
            default:
                return ((InterfaceC5323) obj) != null;
        }
    }
}
