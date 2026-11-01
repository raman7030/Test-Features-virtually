package p067l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩸᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7YI */
/* JADX INFO: loaded from: classes.dex */
public final class C23189 extends C15141 {

    /* JADX INFO: renamed from: ۬ */
    public byte[] f72864 = new byte[0];

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ᩴ */
    public final void mo7828() throws C14392 {
        C9383 c9383M47808 = m47808();
        try {
            m34575();
            new C6701(this.f72864).mo11615(c9383M47808, this);
            if (this.f66554.f66297 != null) {
                ThreadFactoryC8042 threadFactoryC8042M21852 = c9383M47808.m21852();
                Runnable runnable = new Runnable() { // from class: l.ܶ᩻ۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51084.mo5176();
                    }
                };
                threadFactoryC8042M21852.getClass();
                Thread thread = new Thread(runnable);
                this.f66545 = thread;
                thread.setName("Exec thread " + c9383M47808.f25599);
                this.f66545.start();
            }
        } catch (Exception e) {
            if (e instanceof C14392) {
                throw ((C14392) e);
            }
            throw new C14392("ChannelExec", e);
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m51660() {
        byte[] bArr = C20764.f65273;
        this.f72864 = "echo '===SYSTEM_TYPE==='; uname -s; echo '===USER_LIST==='; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Users UniqueID; else cat /etc/passwd; fi; echo '===GROUP_LIST==='; if [ \"$(uname -s)\" = \"Darwin\" ]; then dscl . -list /Groups PrimaryGroupID; else cat /etc/group; fi".getBytes(StandardCharsets.UTF_8);
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۜ */
    public final void mo7821() {
        C21099 c21099 = this.f66554;
        m47808();
        c21099.f66297 = null;
        C21099 c210910 = this.f66554;
        m47808();
        c210910.f66298 = null;
    }
}
