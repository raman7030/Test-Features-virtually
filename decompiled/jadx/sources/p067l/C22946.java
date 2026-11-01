package p067l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩸ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 85AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C22946 {
    /* JADX INFO: renamed from: ֫ */
    public static void m51262(Writer writer, InterfaceC10509 interfaceC10509, C23616 c23616) {
        try {
            C3304 c3304 = new C3304(c23616, interfaceC10509);
            if (writer instanceof C5636) {
                c3304.m5753((C5636) writer);
            } else {
                c3304.m5753(new C5636(writer));
            }
        } catch (Throwable th) {
            throw new IOException(C21466.m48631("An error occurred with the class: ", C17073.m38720(1, 1, interfaceC10509.getType())), th);
        }
    }
}
