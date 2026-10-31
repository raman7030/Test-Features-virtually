package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13071 implements InterfaceC13508 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18011 f39143;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12366 f39144;

    public C13071(C12366 c12366, C18011 c18011) {
        this.f39144 = c12366;
        this.f39143 = c18011;
    }

    @Override // l.InterfaceC13508
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo31672() {
        return this.f39143.f56169;
    }

    @Override // l.InterfaceC13508
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19562 mo31673() {
        return this.f39144.m30045(this.f39143.f56170);
    }

    @Override // l.InterfaceC13508
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo31675() {
        try {
            return this.f39144.m30025(this.f39143);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC13508
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo31671(C22706 c22706) {
        try {
            this.f39144.m30039(this.f39143, c22706);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.InterfaceC13508
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7980 mo31674() {
        try {
            return mo31669();
        } catch (IOException | C14658 unused) {
            return null;
        }
    }

    @Override // l.InterfaceC13508
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7980 mo31669() throws IOException {
        C18011 c18011 = this.f39143;
        C11005 c11005 = c18011.f56171;
        C12366 c12366 = this.f39144;
        if (c11005 != null) {
            C11005 c11005M30018 = c12366.m30018(c11005);
            c12366.m30005(c18011.f56170, c11005, c11005M30018);
            C7980 c7980M30003 = C12366.m30003(c11005M30018);
            C12366.m30010(c12366, c18011.f56169, c7980M30003);
            return c7980M30003;
        }
        return new C7980(c12366.m30065(c18011.f56168.getName()), c18011.f56167, c18011.f56172);
    }

    @Override // l.InterfaceC13508
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31670(String str) {
        C12366 c12366 = this.f39144;
        try {
            c12366.m30038(this.f39143, str);
        } catch (Exception e) {
            c12366.f37077.mo1664(e);
        }
    }
}
