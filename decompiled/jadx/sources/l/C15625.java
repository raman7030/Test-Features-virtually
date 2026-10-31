package l;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8KK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15625 implements InterfaceC12367 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1368 f48104;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16184 f48105;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20419 f48106;

    public C15625(InterfaceC20419 interfaceC20419) {
        this.f48106 = interfaceC20419;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36824(InterfaceC21449 interfaceC21449, Uri uri, Map map, long j, long j2, InterfaceC21830 interfaceC21830) throws C11826 {
        C16184 c16184 = new C16184(interfaceC21449, j, j2);
        this.f48105 = c16184;
        if (this.f48104 != null) {
            return;
        }
        InterfaceC1368[] interfaceC1368ArrMo18051 = this.f48106.mo18051(uri, map);
        C1846 c1846M34729 = AbstractC14545.m34729(interfaceC1368ArrMo18051.length);
        if (interfaceC1368ArrMo18051.length == 1) {
            this.f48104 = interfaceC1368ArrMo18051[0];
        } else {
            for (InterfaceC1368 interfaceC1368 : interfaceC1368ArrMo18051) {
                try {
                    if (interfaceC1368.mo4841(c16184)) {
                        this.f48104 = interfaceC1368;
                        c16184.mo22066();
                        break;
                    } else {
                        c1846M34729.m16263(interfaceC1368.mo4842());
                        boolean z = this.f48104 != null || c16184.getPosition() == j;
                        C22632.m50634(z);
                        c16184.mo22066();
                    }
                } catch (EOFException unused) {
                    if (this.f48104 != null || c16184.getPosition() == j) {
                    }
                } catch (Throwable th) {
                    C22632.m50634(this.f48104 != null || c16184.getPosition() == j);
                    c16184.mo22066();
                    throw th;
                }
                C22632.m50634(z);
                c16184.mo22066();
            }
            if (this.f48104 == null) {
                String str = "None of the available extractors (" + C6847.m18531(", ").m18533((Iterable) C7470.m20014(AbstractC14545.m34733(interfaceC1368ArrMo18051), new C16701())) + ") could read the stream.";
                uri.getClass();
                throw new C11826(str, c1846M34729.m6131());
            }
        }
        this.f48104.mo4840(interfaceC21830);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36826() {
        InterfaceC1368 interfaceC1368 = this.f48104;
        if (interfaceC1368 != null) {
            interfaceC1368.mo4838();
            this.f48104 = null;
        }
        this.f48105 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36822() {
        InterfaceC1368 interfaceC1368 = this.f48104;
        if (interfaceC1368 == null) {
            return;
        }
        InterfaceC1368 interfaceC1368Mo4843 = interfaceC1368.mo4843();
        if (interfaceC1368Mo4843 instanceof C17058) {
            ((C17058) interfaceC1368Mo4843).m40035();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m36825() {
        C16184 c16184 = this.f48105;
        if (c16184 != null) {
            return c16184.getPosition();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36823(long j, long j2) {
        InterfaceC1368 interfaceC1368 = this.f48104;
        interfaceC1368.getClass();
        interfaceC1368.mo4839(j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36821(C23615 c23615) {
        InterfaceC1368 interfaceC1368 = this.f48104;
        interfaceC1368.getClass();
        C16184 c16184 = this.f48105;
        c16184.getClass();
        return interfaceC1368.mo4837(c16184, c23615);
    }
}
