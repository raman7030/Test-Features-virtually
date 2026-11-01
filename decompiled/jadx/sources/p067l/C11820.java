package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 412K */
/* JADX INFO: loaded from: classes3.dex */
public final class C11820 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC17043 f32984;

    /* JADX INFO: renamed from: ۧ */
    public boolean f32985;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC17043 f32986;

    public C11820(AbstractC17043 abstractC17043) {
        boolean z = C7050.f18355.getBoolean("generate_backup_file", true);
        this.f32984 = abstractC17043;
        String lowerCase = abstractC17043.mo25495().toLowerCase();
        if (z && (lowerCase.startsWith("/dev/") || lowerCase.startsWith("/proc/") || abstractC17043.getParent() == null)) {
            z = false;
        }
        if (z && abstractC17043.mo29972() && abstractC17043.mo29996() == null) {
            this.f32985 = true;
            AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(".tmp");
            try {
                if ((abstractC17043.mo38688() && !(abstractC17043 instanceof C13672)) || (abstractC17043.mo29978() && abstractC17043.mo29986().m29977())) {
                    this.f32986 = abstractC17043M38678;
                } else if (abstractC17043M38678.mo25496()) {
                    this.f32986 = abstractC17043M38678;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27087(InterfaceC5114 interfaceC5114) throws IOException {
        AbstractC17043 abstractC17043 = null;
        AbstractC17043 abstractC17044 = this.f32984;
        AbstractC17043 abstractC17045 = this.f32986;
        if (abstractC17045 == null) {
            if (abstractC17044.mo29978() || !abstractC17044.mo29972() || abstractC17044.mo29996() != null) {
                interfaceC5114.mo10534(abstractC17044);
                return;
            }
            if (abstractC17044.mo25094() && !abstractC17044.mo25087()) {
                AbstractC17043 abstractC17043M38678 = abstractC17044.m38678(".rollback");
                if (abstractC17044.mo25502(abstractC17043M38678)) {
                    abstractC17043 = abstractC17043M38678;
                }
            }
            try {
                interfaceC5114.mo10534(abstractC17044);
                if (abstractC17043 != null) {
                    abstractC17043.mo25503();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (abstractC17043 != null && abstractC17043.mo25094()) {
                    if (abstractC17044.mo25094()) {
                        abstractC17044.mo25503();
                    }
                    abstractC17043.mo25502(abstractC17044);
                }
                throw th;
            }
        }
        try {
            interfaceC5114.mo10534(abstractC17045);
            if (this.f32985) {
                abstractC17044.m38687();
            } else {
                abstractC17044.mo25503();
            }
            abstractC17045.m38656(abstractC17044, (Runnable) null);
            C18524.m42113(abstractC17044);
        } catch (Throwable th2) {
            abstractC17045.mo25503();
            throw th2;
        }
    }
}
