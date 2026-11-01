package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes4.dex */
public final class C14791 implements InterfaceC15206 {

    /* JADX INFO: renamed from: ֫ */
    public final C19486 f42191;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14121 f42192;

    public C14791(C14121 c14121, C19486 c19486) {
        this.f42192 = c14121;
        this.f42191 = c19486;
    }

    @Override // p067l.InterfaceC15206
    /* JADX INFO: renamed from: ۧ */
    public final String mo33760() {
        return this.f42191.f59366;
    }

    @Override // p067l.InterfaceC15206
    /* JADX INFO: renamed from: ܽ */
    public final C20960 mo33761() {
        return this.f42192.m32106(this.f42191.f59367);
    }

    @Override // p067l.InterfaceC15206
    /* JADX INFO: renamed from: ᩳ */
    public final String mo33763() {
        try {
            return this.f42192.m32086(this.f42191);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p067l.InterfaceC15206
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo33759(C23948 c23948) {
        try {
            this.f42192.m32100(this.f42191, c23948);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p067l.InterfaceC15206
    /* JADX INFO: renamed from: ܿ */
    public final C9952 mo33762() {
        try {
            return mo33757();
        } catch (IOException | C16299 unused) {
            return null;
        }
    }

    @Override // p067l.InterfaceC15206
    /* JADX INFO: renamed from: ֫ */
    public final C9952 mo33757() throws IOException {
        C19486 c19486 = this.f42191;
        C12828 c12828 = c19486.f59368;
        C14121 c14121 = this.f42192;
        if (c12828 != null) {
            C12828 c12828M32079 = c14121.m32079(c12828);
            c14121.m32066(c19486.f59367, c12828, c12828M32079);
            C9952 c9952M32064 = C14121.m32064(c12828M32079);
            C14121.m32071(c14121, c19486.f59366, c9952M32064);
            return c9952M32064;
        }
        return new C9952(c14121.m32126(c19486.f59365.getName()), c19486.f59364, c19486.f59369);
    }

    @Override // p067l.InterfaceC15206
    /* JADX INFO: renamed from: ֫ */
    public final void mo33758(String str) {
        C14121 c14121 = this.f42192;
        try {
            c14121.m32099(this.f42191, str);
        } catch (Exception e) {
            c14121.f40093.mo4062(e);
        }
    }
}
