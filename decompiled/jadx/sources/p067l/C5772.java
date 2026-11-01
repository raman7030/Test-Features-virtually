package p067l;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8P3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5772 {

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 f14177;

    /* JADX INFO: renamed from: ܽ */
    public boolean f14178;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f14176 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public ByteBuffer[] f14179 = new ByteBuffer[0];

    public C5772(AbstractC16192 abstractC16192) {
        this.f14177 = abstractC16192;
        C19854 c19854 = C19854.f60350;
        this.f14178 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19854 m12946(C19854 c19854) {
        if (c19854.equals(C19854.f60350)) {
            throw new C20525(c19854);
        }
        int i = 0;
        while (true) {
            AbstractC16192 abstractC16192 = this.f14177;
            if (i >= abstractC16192.size()) {
                return c19854;
            }
            InterfaceC2418 interfaceC2418 = (InterfaceC2418) abstractC16192.get(i);
            C19854 c19854Mo3356 = interfaceC2418.mo3356(c19854);
            if (interfaceC2418.mo3359()) {
                C23877.m52960(!c19854Mo3356.equals(C19854.f60350));
                c19854 = c19854Mo3356;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12947() {
        ArrayList arrayList = this.f14176;
        arrayList.clear();
        this.f14178 = false;
        int i = 0;
        while (true) {
            AbstractC16192 abstractC16192 = this.f14177;
            if (i >= abstractC16192.size()) {
                break;
            }
            InterfaceC2418 interfaceC2418 = (InterfaceC2418) abstractC16192.get(i);
            interfaceC2418.flush();
            if (interfaceC2418.mo3359()) {
                arrayList.add(interfaceC2418);
            }
            i++;
        }
        this.f14179 = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m12945(); i2++) {
            this.f14179[i2] = ((InterfaceC2418) arrayList.get(i2)).mo3361();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m12953() {
        return !this.f14176.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12948(ByteBuffer byteBuffer) {
        if (!m12953() || this.f14178) {
            return;
        }
        m12944(byteBuffer);
    }

    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer m12949() {
        if (!m12953()) {
            return InterfaceC2418.f3706;
        }
        ByteBuffer byteBuffer = this.f14179[m12945()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m12944(InterfaceC2418.f3706);
        return this.f14179[m12945()];
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m12952() {
        if (!m12953() || this.f14178) {
            return;
        }
        this.f14178 = true;
        ((InterfaceC2418) this.f14176.get(0)).mo3360();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m12951() {
        return this.f14178 && ((InterfaceC2418) this.f14176.get(m12945())).mo3358() && !this.f14179[m12945()].hasRemaining();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m12950() {
        int i = 0;
        while (true) {
            AbstractC16192 abstractC16192 = this.f14177;
            if (i < abstractC16192.size()) {
                InterfaceC2418 interfaceC2418 = (InterfaceC2418) abstractC16192.get(i);
                interfaceC2418.flush();
                interfaceC2418.reset();
                i++;
            } else {
                this.f14179 = new ByteBuffer[0];
                C19854 c19854 = C19854.f60350;
                this.f14178 = false;
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5772)) {
            return false;
        }
        AbstractC16192 abstractC16192 = ((C5772) obj).f14177;
        AbstractC16192 abstractC16193 = this.f14177;
        if (abstractC16193.size() != abstractC16192.size()) {
            return false;
        }
        for (int i = 0; i < abstractC16193.size(); i++) {
            if (abstractC16193.get(i) != abstractC16192.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f14177.hashCode();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m12944(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        boolean z = true;
        while (z) {
            z = false;
            for (int i = 0; i <= m12945(); i++) {
                if (!this.f14179[i].hasRemaining()) {
                    ArrayList arrayList = this.f14176;
                    InterfaceC2418 interfaceC2418 = (InterfaceC2418) arrayList.get(i);
                    if (interfaceC2418.mo3358()) {
                        if (!this.f14179[i].hasRemaining() && i < m12945()) {
                            ((InterfaceC2418) arrayList.get(i + 1)).mo3360();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.f14179[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : InterfaceC2418.f3706;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC2418.mo3357(byteBuffer2);
                        this.f14179[i] = interfaceC2418.mo3361();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f14179[i].hasRemaining();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private int m12945() {
        return this.f14179.length - 1;
    }
}
