package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 412K */
/* JADX INFO: loaded from: classes3.dex */
public final class C9945 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f30027;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30028;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f30029;

    public C9945(AbstractC15440 abstractC15440) {
        boolean z = C4925.f15523.getBoolean("generate_backup_file", true);
        this.f30027 = abstractC15440;
        String lowerCase = abstractC15440.mo23544().toLowerCase();
        if (z && (lowerCase.startsWith("/dev/") || lowerCase.startsWith("/proc/") || abstractC15440.getParent() == null)) {
            z = false;
        }
        if (z && abstractC15440.mo27911() && abstractC15440.mo27935() == null) {
            this.f30028 = true;
            AbstractC15440 abstractC15440M36520 = abstractC15440.m36520(".tmp");
            try {
                if ((abstractC15440.mo36530() && !(abstractC15440 instanceof C11893)) || (abstractC15440.mo27917() && abstractC15440.mo27925().m27916())) {
                    this.f30029 = abstractC15440M36520;
                } else if (abstractC15440M36520.mo23545()) {
                    this.f30029 = abstractC15440M36520;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25070(InterfaceC2889 interfaceC2889) throws IOException {
        AbstractC15440 abstractC15440 = null;
        AbstractC15440 abstractC15441 = this.f30027;
        AbstractC15440 abstractC15442 = this.f30029;
        if (abstractC15442 == null) {
            if (abstractC15441.mo27917() || !abstractC15441.mo27911() || abstractC15441.mo27935() != null) {
                interfaceC2889.mo8487(abstractC15441);
                return;
            }
            if (abstractC15441.mo23120() && !abstractC15441.mo23113()) {
                AbstractC15440 abstractC15440M36520 = abstractC15441.m36520(".rollback");
                if (abstractC15441.mo23551(abstractC15440M36520)) {
                    abstractC15440 = abstractC15440M36520;
                }
            }
            try {
                interfaceC2889.mo8487(abstractC15441);
                if (abstractC15440 != null) {
                    abstractC15440.mo23552();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (abstractC15440 != null && abstractC15440.mo23120()) {
                    if (abstractC15441.mo23120()) {
                        abstractC15441.mo23552();
                    }
                    abstractC15440.mo23551(abstractC15441);
                }
                throw th;
            }
        }
        try {
            interfaceC2889.mo8487(abstractC15442);
            if (this.f30028) {
                abstractC15441.m36529();
            } else {
                abstractC15441.mo23552();
            }
            abstractC15442.m36498(abstractC15441, (Runnable) null);
            C16999.m39870(abstractC15441);
        } catch (Throwable th2) {
            abstractC15442.mo23552();
            throw th2;
        }
    }
}
