package p067l;

/* JADX INFO: renamed from: l.᩶ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05NW */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC21263 extends AbstractRunnableC22643 implements Runnable {
    public RunnableC21263(C21302 c21302, String str) {
        super(c21302);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21302 c21302 = this.f71446;
        c21302.m48173("211-Features supported by FTP Server\r\n");
        c21302.m48173(" UTF8\r\n");
        c21302.m48173(" MDTM\r\n");
        c21302.m48173(" MFMT\r\n");
        c21302.m48173(" MLST Type*;Size*;Modify*;Perm\r\n");
        c21302.m48173(" HASH MD5;SHA-1;SHA-256;SHA-384;SHA-512\r\n");
        c21302.m48173(" REST STREAM\r\n");
        c21302.m48173(" RANG STREAM\r\n");
        c21302.m48173("211 End\r\n");
    }
}
