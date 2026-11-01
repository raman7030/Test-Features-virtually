package p067l;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8KK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17218 implements InterfaceC14122 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC3669 f51243;

    /* JADX INFO: renamed from: ۧ */
    public C17750 f51244;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC21775 f51245;

    public C17218(InterfaceC21775 interfaceC21775) {
        this.f51245 = interfaceC21775;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX INFO: renamed from: ֫ */
    public final void m38990(InterfaceC22753 interfaceC22753, Uri uri, Map map, long j, long j2, InterfaceC23116 interfaceC23116) throws C13608 {
        C17750 c17750 = new C17750(interfaceC22753, j, j2);
        this.f51244 = c17750;
        if (this.f51243 != null) {
            return;
        }
        InterfaceC3669[] interfaceC3669ArrMo20001 = this.f51245.mo20001(uri, map);
        C4123 c4123M36878 = AbstractC16192.m36878(interfaceC3669ArrMo20001.length);
        if (interfaceC3669ArrMo20001.length == 1) {
            this.f51243 = interfaceC3669ArrMo20001[0];
        } else {
            for (InterfaceC3669 interfaceC3669 : interfaceC3669ArrMo20001) {
                try {
                    if (interfaceC3669.mo7079(c17750)) {
                        this.f51243 = interfaceC3669;
                        c17750.mo24036();
                        break;
                    } else {
                        c4123M36878.m18183(interfaceC3669.mo7080());
                        boolean z = this.f51243 != null || c17750.getPosition() == j;
                        C23877.m52960(z);
                        c17750.mo24036();
                    }
                } catch (EOFException unused) {
                    if (this.f51243 != null || c17750.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    C23877.m52960(this.f51243 != null || c17750.getPosition() == j);
                    c17750.mo24036();
                    throw th;
                }
                C23877.m52960(z);
                c17750.mo24036();
            }
            if (this.f51243 == null) {
                String str = "None of the available extractors (" + C8876.m20480(", ").m20482((Iterable) C9468.m21989(AbstractC16192.m36882(interfaceC3669ArrMo20001), new C18241())) + ") could read the stream.";
                uri.getClass();
                throw new C13608(str, c4123M36878.m8329());
            }
        }
        this.f51243.mo7078(interfaceC23116);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38992() {
        InterfaceC3669 interfaceC3669 = this.f51243;
        if (interfaceC3669 != null) {
            interfaceC3669.mo7076();
            this.f51243 = null;
        }
        this.f51244 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38988() {
        InterfaceC3669 interfaceC3669 = this.f51243;
        if (interfaceC3669 == null) {
            return;
        }
        InterfaceC3669 interfaceC3669Mo7081 = interfaceC3669.mo7081();
        if (interfaceC3669Mo7081 instanceof C18580) {
            ((C18580) interfaceC3669Mo7081).m42280();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m38991() {
        C17750 c17750 = this.f51244;
        if (c17750 != null) {
            return c17750.getPosition();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38989(long j, long j2) {
        InterfaceC3669 interfaceC3669 = this.f51243;
        interfaceC3669.getClass();
        interfaceC3669.mo7077(j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38987(C24812 c24812) {
        InterfaceC3669 interfaceC3669 = this.f51243;
        interfaceC3669.getClass();
        C17750 c17750 = this.f51244;
        c17750.getClass();
        return interfaceC3669.mo7075(c17750, c24812);
    }
}
