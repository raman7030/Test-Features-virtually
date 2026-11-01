package p067l;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.۠۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7DQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10152 extends AbstractC16856 {

    /* JADX INFO: renamed from: ֫ */
    public PrintWriter f28102;

    /* JADX INFO: renamed from: ۧ */
    public PrintWriter f28103;

    public C10152() {
        PrintStream printStream = System.out;
        PrintStream printStream2 = System.err;
        this.f28103 = new PrintWriter((OutputStream) printStream, true);
        this.f28102 = new PrintWriter((OutputStream) printStream2, true);
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ܽ */
    public final void mo4349(String str) {
        this.f28103.println(str);
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final void mo4344(String str) {
        this.f28103.print(str);
    }

    @Override // p067l.AbstractC16856
    /* JADX INFO: renamed from: ܿ */
    public final void mo23662(String str) {
        this.f28102.println(str);
    }

    @Override // p067l.AbstractC16856
    /* JADX INFO: renamed from: ᩳ */
    public final void mo23663(String str) {
        this.f28102.print(str);
    }

    @Override // p067l.AbstractC16856, p067l.InterfaceC3446
    /* JADX INFO: renamed from: ۧ */
    public final void mo4347(String str) {
        PrintWriter printWriter = this.f28102;
        try {
            this.f28103.flush();
        } finally {
            printWriter.flush();
        }
    }

    @Override // p067l.AbstractC16856
    /* JADX INFO: renamed from: ֫ */
    public final void mo23659(Throwable th) {
        th.printStackTrace(this.f28102);
    }

    @Override // p067l.AbstractC16856
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3446 mo23661() {
        return new C20211(this.f28103);
    }

    @Override // p067l.AbstractC16856
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3446 mo23660() {
        return new C20211(this.f28102);
    }

    @Override // p067l.InterfaceC3446
    public final void flush() {
        this.f28103.flush();
        this.f28102.flush();
    }
}
