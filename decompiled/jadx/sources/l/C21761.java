package l;

/* JADX INFO: renamed from: l.᩸ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98C6 */
/* JADX INFO: loaded from: classes.dex */
public class C21761 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f69729;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC23898 f69730;

    public C21761(String str) {
        this.f69729 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49084(String str) {
        this.f69729 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m49083() {
        return this.f69729;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49087(AbstractC23898 abstractC23898) {
        if (this.f69730 == null) {
            this.f69730 = abstractC23898;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC23898 m49089() {
        return this.f69730;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7216 m49088() {
        AbstractC23898 abstractC23898 = this.f69730;
        if (abstractC23898 == null) {
            return null;
        }
        return abstractC23898.m52653();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49086(C21245 c21245, InterfaceC7838 interfaceC7838) {
        if (m49088() == null) {
            interfaceC7838.run();
        } else {
            m49088().m19306(c21245, interfaceC7838);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49085(InterfaceC7838 interfaceC7838) {
        if (m49088() == null) {
            interfaceC7838.run();
        } else {
            m49088().m19306(m49088().m19305(), interfaceC7838);
        }
    }
}
