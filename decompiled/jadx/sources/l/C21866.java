package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes2.dex */
public final class C21866 extends C14103 {
    @Override // l.C14103, l.InterfaceC11220
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo6721(C18621 c18621) throws C6343 {
        if (c18621.m43173() && c18621.m43177() != 206) {
            try {
                c18621.close();
            } catch (Exception unused) {
            }
            throw new C6343("The server does not support range requests");
        }
        return super.mo6721(c18621);
    }
}
