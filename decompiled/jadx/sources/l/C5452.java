package l;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۚܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5452 extends EnumC0121 {
    public /* synthetic */ C5452(EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this("XSTDOUT", 57, "-Xstdout", "opt.arg.file", "opt.Xstdout", enumC18467, enumC3650);
    }

    public C5452(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        super(str, i, str2, str3, str4, enumC18467, enumC3650, 0);
    }

    @Override // l.EnumC0121
    /* JADX INFO: renamed from: ֫ */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) throws C2239 {
        try {
            abstractC0827.mo3075().m50110(new PrintWriter((Writer) new FileWriter(str2), true));
            super.mo1179(abstractC0827, str, str2);
        } catch (IOException e) {
            String message = e.getMessage();
            C12281 c12281 = C6241.f19132;
            throw abstractC0827.m3074(new C12281("compiler", "error.writing.file", str2, message));
        }
    }
}
