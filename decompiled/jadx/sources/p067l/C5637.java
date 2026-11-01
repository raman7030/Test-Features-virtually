package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6L4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5637 implements InterfaceC20589 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C15694 f13670;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f13671;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ String f13672;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ int f13673;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ String f13674;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C19561 f13675;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C6978 f13676;

    public C5637(C15694 c15694, C19561 c19561, C6978 c6978, int i, int i2, String str, String str2) {
        this.f13670 = c15694;
        this.f13675 = c19561;
        this.f13676 = c6978;
        this.f13673 = i;
        this.f13671 = i2;
        this.f13674 = str;
        this.f13672 = str2;
    }

    @Override // p067l.InterfaceC20589
    /* JADX INFO: renamed from: ֫ */
    public final void mo12540(AbstractC17043 abstractC17043) {
        C15694 c15694 = this.f13670;
        C6978 c6978 = this.f13676;
        C19561 c19561 = this.f13675;
        try {
            C10844 c10844M24963 = C10844.m24963(abstractC17043);
            if (c19561 != null) {
                try {
                    c10844M24963.m24993(c19561.m44456());
                    if (c19561.m44471()) {
                        c10844M24963.m24999();
                    }
                } catch (Throwable th) {
                    try {
                        c10844M24963.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            for (C17035 c17035 : c6978.f18155) {
                C7649.m17630();
                C5738 c5738Clone = c17035.f50374;
                String str = c17035.f50375;
                if (!c5738Clone.getName().equals(str)) {
                    c5738Clone = c5738Clone.clone();
                    c5738Clone.m12769(str);
                }
                c10844M24963.m24989(c5738Clone, c19561, C15694.f45483);
                C7649.m17630();
            }
            for (C3625 c3625 : c6978.f18153) {
                C7649.m17630();
                Object obj = c3625.f7507;
                String str2 = c3625.f7505;
                C8319 c8319 = (C8319) obj;
                C9385 c9385M43852 = c15694.f45485.m43852();
                AbstractC17043 abstractC17044 = c8319.f22257;
                boolean z = c8319.f22256;
                c9385M43852.m21856(abstractC17044.mo25505());
                C14362 c14362M17629 = C7649.m17629(c15694.f45485, abstractC17044.mo25505(), z);
                C5738 c5738 = new C5738(str2);
                c5738.setTime(c8319.f22258);
                c5738.m12786(z ? 0L : c14362M17629.m32961());
                c10844M24963.m24992(this.f13673);
                c10844M24963.m24983(this.f13671);
                C5738 entry = c19561 == null ? null : c19561.getEntry(str2);
                if (entry != null) {
                    c10844M24963.m24992(entry.m12748());
                }
                c10844M24963.m25000(this.f13674);
                c10844M24963.m24987(c5738);
                if (!z) {
                    try {
                        C15024 c15024 = new C15024(abstractC17044.mo29987());
                        try {
                            OutputStream outputStreamM24981 = c10844M24963.m24981();
                            byte[] bArr = new byte[65536];
                            while (true) {
                                C7649.m17630();
                                int i = c15024.read(bArr);
                                if (i < 0) {
                                    try {
                                        break;
                                    } catch (C24412 e) {
                                        throw C15694.m35750(c3625.f7506, e, c3625.f7505);
                                    }
                                } else if (i != 0) {
                                    outputStreamM24981.write(bArr, 0, i);
                                }
                            }
                            c15024.close();
                        } catch (Throwable th3) {
                            try {
                                c15024.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (IOException e2) {
                        throw new C24412(e2.getMessage(), e2);
                    }
                }
                c10844M24963.m24997();
            }
            c10844M24963.close();
            if (c19561 != null) {
                c19561.close();
            }
        } catch (Throwable th5) {
            if (c19561 != null) {
                try {
                    c19561.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    @Override // p067l.InterfaceC20589
    /* JADX INFO: renamed from: ֫ */
    public final void mo12539(C9385 c9385) throws C5276 {
        C7649.m17630();
        if (this.f13675 != null) {
            c9385.m21856(this.f13672);
        }
        Iterator it = this.f13676.f18153.iterator();
        while (it.hasNext()) {
            c9385.m21856(((C8319) ((C3625) it.next()).f7507).f22257.mo25505());
        }
    }
}
