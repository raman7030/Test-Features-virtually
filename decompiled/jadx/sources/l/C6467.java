package l;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۜۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5GD */
/* JADX INFO: loaded from: classes3.dex */
public class C6467 extends AbstractC5447 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15323 f19985 = new C23400();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13309 f19986 = new C13309();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6467 m17862(C3330 c3330) {
        return (C6467) new C4741(c3330, f19985).m13885(C6467.class);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m17864() {
        C13309 c13309 = this.f19986;
        int iM32287 = c13309.m32287();
        for (int i = 0; i < iM32287; i++) {
            ((C14227) c13309.m32290(i)).getClass();
        }
    }

    @Override // l.AbstractC5447
    /* JADX INFO: renamed from: ܽ */
    public final void mo15547() {
        C13309 c13309 = this.f19986;
        if (c13309.m32287() > 0) {
            ((C14227) c13309.m32290(0)).getClass();
            throw null;
        }
        c13309.m32285();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17863(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C13309 c13309 = this.f19986;
        if (c13309.m32287() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + ASN1Dump.TAB;
            if (c13309.m32287() <= 0) {
                return;
            }
            C14227 c14227 = (C14227) c13309.m32290(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c13309.m32282(0));
            printWriter.print(": ");
            printWriter.println(c14227.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }
}
