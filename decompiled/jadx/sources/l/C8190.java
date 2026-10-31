package l;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.۠۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7DQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8190 extends AbstractC15244 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PrintWriter f25191;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public PrintWriter f25192;

    public C8190() {
        PrintStream printStream = System.out;
        PrintStream printStream2 = System.err;
        this.f25192 = new PrintWriter((OutputStream) printStream, true);
        this.f25191 = new PrintWriter((OutputStream) printStream2, true);
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ܽ */
    public final void mo1973(String str) {
        this.f25192.println(str);
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final void mo1968(String str) {
        this.f25192.print(str);
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo21693(String str) {
        this.f25191.println(str);
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo21694(String str) {
        this.f25191.print(str);
    }

    @Override // l.AbstractC15244, l.InterfaceC1134
    /* JADX INFO: renamed from: ۧ */
    public final void mo1971(String str) {
        PrintWriter printWriter = this.f25191;
        try {
            this.f25192.flush();
        } finally {
            printWriter.flush();
        }
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21690(Throwable th) {
        th.printStackTrace(this.f25191);
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1134 mo21692() {
        return new C18774(this.f25192);
    }

    @Override // l.AbstractC15244
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1134 mo21691() {
        return new C18774(this.f25191);
    }

    @Override // l.InterfaceC1134
    public final void flush() {
        this.f25192.flush();
        this.f25191.flush();
    }
}
