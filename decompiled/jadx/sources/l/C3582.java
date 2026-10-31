package l;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8P3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3582 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f11372;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f11373;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f11371 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ByteBuffer[] f11374 = new ByteBuffer[0];

    public C3582(AbstractC14545 abstractC14545) {
        this.f11372 = abstractC14545;
        C18399 c18399 = C18399.f57130;
        this.f11373 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18399 m10970(C18399 c18399) {
        if (c18399.equals(C18399.f57130)) {
            throw new C19105(c18399);
        }
        int i = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f11372;
            if (i >= abstractC14545.size()) {
                return c18399;
            }
            InterfaceC0053 interfaceC0053 = (InterfaceC0053) abstractC14545.get(i);
            C18399 c18399Mo961 = interfaceC0053.mo961(c18399);
            if (interfaceC0053.mo964()) {
                C22632.m50634(!c18399Mo961.equals(C18399.f57130));
                c18399 = c18399Mo961;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10971() {
        ArrayList arrayList = this.f11371;
        arrayList.clear();
        this.f11373 = false;
        int i = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f11372;
            if (i >= abstractC14545.size()) {
                break;
            }
            InterfaceC0053 interfaceC0053 = (InterfaceC0053) abstractC14545.get(i);
            interfaceC0053.flush();
            if (interfaceC0053.mo964()) {
                arrayList.add(interfaceC0053);
            }
            i++;
        }
        this.f11374 = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m10969(); i2++) {
            this.f11374[i2] = ((InterfaceC0053) arrayList.get(i2)).mo966();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m10977() {
        return !this.f11371.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10972(ByteBuffer byteBuffer) {
        if (!m10977() || this.f11373) {
            return;
        }
        m10968(byteBuffer);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m10973() {
        if (!m10977()) {
            return InterfaceC0053.f930;
        }
        ByteBuffer byteBuffer = this.f11374[m10969()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        m10968(InterfaceC0053.f930);
        return this.f11374[m10969()];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m10976() {
        if (!m10977() || this.f11373) {
            return;
        }
        this.f11373 = true;
        ((InterfaceC0053) this.f11371.get(0)).mo965();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m10975() {
        return this.f11373 && ((InterfaceC0053) this.f11371.get(m10969())).mo963() && !this.f11374[m10969()].hasRemaining();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m10974() {
        int i = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f11372;
            if (i < abstractC14545.size()) {
                InterfaceC0053 interfaceC0053 = (InterfaceC0053) abstractC14545.get(i);
                interfaceC0053.flush();
                interfaceC0053.reset();
                i++;
            } else {
                this.f11374 = new ByteBuffer[0];
                C18399 c18399 = C18399.f57130;
                this.f11373 = false;
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3582)) {
            return false;
        }
        AbstractC14545 abstractC14545 = ((C3582) obj).f11372;
        AbstractC14545 abstractC14546 = this.f11372;
        if (abstractC14546.size() != abstractC14545.size()) {
            return false;
        }
        for (int i = 0; i < abstractC14546.size(); i++) {
            if (abstractC14546.get(i) != abstractC14545.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f11372.hashCode();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m10968(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        boolean z = true;
        while (z) {
            z = false;
            for (int i = 0; i <= m10969(); i++) {
                if (!this.f11374[i].hasRemaining()) {
                    ArrayList arrayList = this.f11371;
                    InterfaceC0053 interfaceC0053 = (InterfaceC0053) arrayList.get(i);
                    if (interfaceC0053.mo963()) {
                        if (!this.f11374[i].hasRemaining() && i < m10969()) {
                            ((InterfaceC0053) arrayList.get(i + 1)).mo965();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.f11374[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : InterfaceC0053.f930;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC0053.mo962(byteBuffer2);
                        this.f11374[i] = interfaceC0053.mo966();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f11374[i].hasRemaining();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m10969() {
        return this.f11374.length - 1;
    }
}
