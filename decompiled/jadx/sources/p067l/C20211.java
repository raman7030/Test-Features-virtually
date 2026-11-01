package p067l;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47C4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20211 extends AbstractC6129 {

    /* JADX INFO: renamed from: ܽ */
    public PrintWriter f62506;

    @Override // p067l.AbstractC6129
    /* JADX INFO: renamed from: ۧ */
    public final String mo4346() {
        return "text-output stream";
    }

    public C20211(PrintWriter printWriter) {
        this.f62506 = new PrintWriter((Writer) printWriter, true);
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ܽ */
    public final void mo4349(String str) {
        this.f62506.println(str);
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final void mo4344(String str) {
        this.f62506.print(str);
    }

    @Override // p067l.AbstractC6129, p067l.InterfaceC3446
    /* JADX INFO: renamed from: ۧ */
    public final void mo4347(String str) {
        super.mo4347(str);
        this.f62506.flush();
    }

    @Override // p067l.InterfaceC3446
    public final void flush() {
        this.f62506.flush();
    }

    @Override // p067l.InterfaceC3446
    /* JADX INFO: renamed from: ֫ */
    public final DataOutputStream mo4343() {
        throw new C14572("Use EscapedPrintStreamOutput");
    }
}
