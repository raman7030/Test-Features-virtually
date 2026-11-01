package p067l;

/* JADX INFO: renamed from: l.᩸ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98C6 */
/* JADX INFO: loaded from: classes.dex */
public class C23050 {

    /* JADX INFO: renamed from: ֫ */
    public String f72438;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC25081 f72439;

    public C23050(String str) {
        this.f72438 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51433(String str) {
        this.f72438 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m51432() {
        return this.f72438;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51436(AbstractC25081 abstractC25081) {
        if (this.f72439 == null) {
            this.f72439 = abstractC25081;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC25081 m51438() {
        return this.f72439;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9226 m51437() {
        AbstractC25081 abstractC25081 = this.f72439;
        if (abstractC25081 == null) {
            return null;
        }
        return abstractC25081.m55062();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51435(C22559 c22559, InterfaceC9817 interfaceC9817) {
        if (m51437() == null) {
            interfaceC9817.run();
        } else {
            m51437().m21254(c22559, interfaceC9817);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51434(InterfaceC9817 interfaceC9817) {
        if (m51437() == null) {
            interfaceC9817.run();
        } else {
            m51437().m21254(m51437().m21253(), interfaceC9817);
        }
    }
}
