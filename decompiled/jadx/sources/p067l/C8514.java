package p067l;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۜۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5GD */
/* JADX INFO: loaded from: classes3.dex */
public class C8514 extends AbstractC7545 {

    /* JADX INFO: renamed from: ۗ */
    public static final InterfaceC16931 f22860 = new C24607();

    /* JADX INFO: renamed from: ۙ */
    public C1502 f22861 = new C1502();

    /* JADX INFO: renamed from: ֫ */
    public static C8514 m19810(C5533 c5533) {
        return (C8514) new C6874(c5533, f22860).m15765(C8514.class);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m19812() {
        C1502 c1502 = this.f22861;
        int iM34388 = c1502.m34388();
        for (int i = 0; i < iM34388; i++) {
            ((C15889) c1502.m34391(i)).getClass();
        }
    }

    @Override // p067l.AbstractC7545
    /* JADX INFO: renamed from: ܽ */
    public final void mo17458() {
        C1502 c1502 = this.f22861;
        if (c1502.m34388() > 0) {
            ((C15889) c1502.m34391(0)).getClass();
            throw null;
        }
        c1502.m34386();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19811(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C1502 c1502 = this.f22861;
        if (c1502.m34388() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + ASN1Dump.TAB;
            if (c1502.m34388() <= 0) {
                return;
            }
            C15889 c15889 = (C15889) c1502.m34391(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c1502.m34383(0));
            printWriter.print(": ");
            printWriter.println(c15889.toString());
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
