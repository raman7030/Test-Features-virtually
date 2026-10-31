package l;

/* JADX INFO: renamed from: l.᩶ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05NW */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC19881 extends AbstractRunnableC21333 implements Runnable {
    public RunnableC19881(C19922 c19922, String str) {
        super(c19922);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19922 c19922 = this.f68752;
        c19922.m45860("211-Features supported by FTP Server\r\n");
        c19922.m45860(" UTF8\r\n");
        c19922.m45860(" MDTM\r\n");
        c19922.m45860(" MFMT\r\n");
        c19922.m45860(" MLST Type*;Size*;Modify*;Perm\r\n");
        c19922.m45860(" HASH MD5;SHA-1;SHA-256;SHA-384;SHA-512\r\n");
        c19922.m45860(" REST STREAM\r\n");
        c19922.m45860(" RANG STREAM\r\n");
        c19922.m45860("211 End\r\n");
    }
}
