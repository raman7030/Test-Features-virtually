package l;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47C4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18774 extends AbstractC3957 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PrintWriter f59284;

    @Override // l.AbstractC3957
    /* JADX INFO: renamed from: ۧ */
    public final String mo1970() {
        return "text-output stream";
    }

    public C18774(PrintWriter printWriter) {
        this.f59284 = new PrintWriter((Writer) printWriter, true);
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ܽ */
    public final void mo1973(String str) {
        this.f59284.println(str);
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final void mo1968(String str) {
        this.f59284.print(str);
    }

    @Override // l.AbstractC3957, l.InterfaceC1134
    /* JADX INFO: renamed from: ۧ */
    public final void mo1971(String str) {
        super.mo1971(str);
        this.f59284.flush();
    }

    @Override // l.InterfaceC1134
    public final void flush() {
        this.f59284.flush();
    }

    @Override // l.InterfaceC1134
    /* JADX INFO: renamed from: ֫ */
    public final DataOutputStream mo1967() {
        throw new C12841("Use EscapedPrintStreamOutput");
    }
}
