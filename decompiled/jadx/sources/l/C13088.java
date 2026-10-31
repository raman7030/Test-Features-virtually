package l;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13088 extends AbstractC22261 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22301 f39187;

    /* JADX WARN: Code duplicated, block: B:40:0x00c8 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #4 {all -> 0x00a7, blocks: (B:38:0x00b8, B:40:0x00c8, B:28:0x0098, B:37:0x00af), top: B:46:0x0002 }] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m31723() {
        int iM14628;
        try {
            try {
                Iterator it = this.f17810.iterator();
                iM14628 = 0;
                while (it.hasNext()) {
                    try {
                        ((C3917) this.f17809).mo11947((InterfaceC23712) it.next());
                        C11738 c11738 = new C11738((C3917) this.f17809, this.f39187);
                        c11738.m28694();
                        c11738.m28693();
                        if (((C5080) ((C3917) this.f17809).m45770()).m14624(EnumC21309.ERROR) > 0) {
                            break;
                        }
                        for (C13813 c13813 : c11738.m28685()) {
                            String str = c13813.f41194;
                            InterfaceC1134 interfaceC1134M45780 = ((C3917) this.f17809).m45780();
                            interfaceC1134M45780.mo1969(str, C16646.of(c13813.f41199), this.f17809);
                            c13813.m33153(interfaceC1134M45780);
                            interfaceC1134M45780.mo1971(str);
                        }
                        if (!((C5080) ((C3917) this.f17809).m45770()).m14629()) {
                            iM14628 += ((C5080) ((C3917) this.f17809).m45770()).m14628();
                        }
                    } catch (IOException e) {
                        e = e;
                        ((C3917) this.f17809).m45771(e);
                        iM14628++;
                    } catch (Error e2) {
                        e = e2;
                        ((C3917) this.f17809).m45771(e);
                        iM14628++;
                    } catch (URISyntaxException e3) {
                        e = e3;
                        ((C3917) this.f17809).m45771(e);
                        iM14628++;
                    } catch (Throwable th) {
                        th = th;
                        ((C3917) this.f17809).m45771(th);
                        ((C3917) this.f17809).m45761(th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (IOException e4) {
            e = e4;
            iM14628 = 0;
            ((C3917) this.f17809).m45771(e);
            iM14628++;
            if (!((C5080) ((C3917) this.f17809).m45770()).m14629()) {
                iM14628 += ((C5080) ((C3917) this.f17809).m45770()).m14628();
            }
            return iM14628;
        } catch (Error e5) {
            e = e5;
            iM14628 = 0;
            ((C3917) this.f17809).m45771(e);
            iM14628++;
            if (!((C5080) ((C3917) this.f17809).m45770()).m14629()) {
                iM14628 += ((C5080) ((C3917) this.f17809).m45770()).m14628();
            }
            return iM14628;
        } catch (URISyntaxException e6) {
            e = e6;
            iM14628 = 0;
            ((C3917) this.f17809).m45771(e);
            iM14628++;
            if (!((C5080) ((C3917) this.f17809).m45770()).m14629()) {
                iM14628 += ((C5080) ((C3917) this.f17809).m45770()).m14628();
            }
            return iM14628;
        } catch (Throwable th3) {
            th = th3;
            iM14628 = 0;
        }
        if (!((C5080) ((C3917) this.f17809).m45770()).m14629()) {
            iM14628 += ((C5080) ((C3917) this.f17809).m45770()).m14628();
        }
        return iM14628;
    }

    public C13088(C9602 c9602, C21596 c21596, C17362 c17362) {
        super(c9602, c21596);
        this.f39187 = new C22301();
        this.f17810.add(c17362);
    }
}
