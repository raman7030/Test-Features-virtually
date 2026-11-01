package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes2.dex */
public final class C23150 extends C15772 {
    @Override // p067l.C15772, p067l.InterfaceC13032
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo8847(C20066 c20066) throws C8397 {
        if (c20066.m45439() && c20066.m45443() != 206) {
            try {
                c20066.close();
            } catch (Exception unused) {
            }
            throw new C8397("The server does not support range requests");
        }
        return super.mo8847(c20066);
    }
}
