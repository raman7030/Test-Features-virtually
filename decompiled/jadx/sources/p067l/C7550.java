package p067l;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۚܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C7550 extends EnumC2483 {
    public /* synthetic */ C7550(EnumC19919 enumC19919, EnumC5837 enumC5837) {
        this("XSTDOUT", 57, "-Xstdout", "opt.arg.file", "opt.Xstdout", enumC19919, enumC5837);
    }

    public C7550(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3580(AbstractC3154 abstractC3154, String str, String str2) throws C4496 {
        try {
            abstractC3154.mo5389().m52450(new PrintWriter((Writer) new FileWriter(str2), true));
            super.mo3580(abstractC3154, str, str2);
        } catch (IOException e) {
            String message = e.getMessage();
            C14040 c14040 = C8300.f21997;
            throw abstractC3154.m5388(new C14040("compiler", "error.writing.file", str2, message));
        }
    }
}
