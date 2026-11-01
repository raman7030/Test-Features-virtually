package p067l;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14807 extends AbstractC23525 {

    /* JADX INFO: renamed from: ᩳ */
    public final C23563 f42235;

    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #4 {all -> 0x00a7, blocks: (B:38:0x00b8, B:40:0x00c8, B:28:0x0098, B:37:0x00af), top: B:46:0x0002 }] */
    /* JADX INFO: renamed from: ۧ */
    public final synchronized int m33813() {
        int iM16536;
        try {
            try {
                Iterator it = this.f20656.iterator();
                iM16536 = 0;
                while (it.hasNext()) {
                    try {
                        ((C6091) this.f20655).mo13867((InterfaceC24904) it.next());
                        C13524 c13524 = new C13524((C6091) this.f20655, this.f42235);
                        c13524.m30742();
                        c13524.m30741();
                        if (((C7196) ((C6091) this.f20655).m48082()).m16532(EnumC22620.ERROR) > 0) {
                            break;
                        }
                        for (C15496 c15496 : c13524.m30733()) {
                            String str = c15496.f44272;
                            InterfaceC3446 interfaceC3446M48092 = ((C6091) this.f20655).m48092();
                            interfaceC3446M48092.mo4345(str, C18189.m41402of(c15496.f44277), this.f20655);
                            c15496.m35270(interfaceC3446M48092);
                            interfaceC3446M48092.mo4347(str);
                        }
                        if (!((C7196) ((C6091) this.f20655).m48082()).m16537()) {
                            iM16536 += ((C7196) ((C6091) this.f20655).m48082()).m16536();
                        }
                    } catch (IOException e) {
                        e = e;
                        ((C6091) this.f20655).m48083(e);
                        iM16536++;
                    } catch (Error e2) {
                        e = e2;
                        ((C6091) this.f20655).m48083(e);
                        iM16536++;
                    } catch (URISyntaxException e3) {
                        e = e3;
                        ((C6091) this.f20655).m48083(e);
                        iM16536++;
                    } catch (Throwable th) {
                        th = th;
                        ((C6091) this.f20655).m48083(th);
                        ((C6091) this.f20655).m48073(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (IOException e4) {
            e = e4;
            iM16536 = 0;
            ((C6091) this.f20655).m48083(e);
            iM16536++;
            if (!((C7196) ((C6091) this.f20655).m48082()).m16537()) {
                iM16536 += ((C7196) ((C6091) this.f20655).m48082()).m16536();
            }
            return iM16536;
        } catch (Error e5) {
            e = e5;
            iM16536 = 0;
            ((C6091) this.f20655).m48083(e);
            iM16536++;
            if (!((C7196) ((C6091) this.f20655).m48082()).m16537()) {
                iM16536 += ((C7196) ((C6091) this.f20655).m48082()).m16536();
            }
            return iM16536;
        } catch (URISyntaxException e6) {
            e = e6;
            iM16536 = 0;
            ((C6091) this.f20655).m48083(e);
            iM16536++;
            if (!((C7196) ((C6091) this.f20655).m48082()).m16537()) {
                iM16536 += ((C7196) ((C6091) this.f20655).m48082()).m16536();
            }
            return iM16536;
        } catch (Throwable th3) {
            th = th3;
            iM16536 = 0;
        }
        if (!((C7196) ((C6091) this.f20655).m48082()).m16537()) {
            iM16536 += ((C7196) ((C6091) this.f20655).m48082()).m16536();
        }
        return iM16536;
    }

    public C14807(C11494 c11494, C22893 c22893, C18869 c18869) {
        super(c11494, c22893);
        this.f42235 = new C23563();
        this.f20656.add(c18869);
    }
}
