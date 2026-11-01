package p067l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩸ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: FATD */
/* JADX INFO: loaded from: classes4.dex */
public final class C22857 {

    /* JADX INFO: renamed from: ֫ */
    public static final C12516 f71973 = C12516.m28828(new File(C17853.f53277.m38684("axmls").mo25505()), 26101061, 1, 2097152);

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m51057(String str) {
        try {
            C3798 c3798M28839 = f71973.m28839(str);
            if (c3798M28839 != null) {
                return C25037.m54976(c3798M28839.m7411(0)).mo14211();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51056(String str, byte[] bArr) {
        C15370 c15370M28835 = null;
        try {
            c15370M28835 = f71973.m28835(str);
            if (c15370M28835 == null) {
                return;
            }
            InterfaceC12257 interfaceC12257M54977 = C25037.m54977(c15370M28835.m35032(0));
            interfaceC12257M54977.write(bArr);
            interfaceC12257M54977.close();
            c15370M28835.m35034();
        } catch (IOException unused) {
            if (c15370M28835 != null) {
                try {
                    c15370M28835.m35033();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
