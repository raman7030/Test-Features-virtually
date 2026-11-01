package p067l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8OQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23451 extends AbstractC16744 {
    @Override // p067l.AbstractC16744
    /* JADX INFO: renamed from: ֫ */
    public final C25079 mo6303(C10040 c10040, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            C17861 c17861 = new C17861(byteBuffer.array(), byteBuffer.limit());
            c17861.m40566(12);
            int iM40563 = (c17861.m40563() + c17861.m40558(12)) - 4;
            c17861.m40566(44);
            c17861.m40562(c17861.m40558(12));
            c17861.m40566(16);
            ArrayList arrayList = new ArrayList();
            while (c17861.m40563() < iM40563) {
                c17861.m40566(48);
                int iM40558 = c17861.m40558(8);
                c17861.m40566(4);
                int iM40564 = c17861.m40563() + c17861.m40558(12);
                String str = null;
                String str2 = null;
                while (c17861.m40563() < iM40564) {
                    int iM40559 = c17861.m40558(8);
                    int iM405510 = c17861.m40558(8);
                    int iM40565 = c17861.m40563() + iM405510;
                    if (iM40559 == 2) {
                        int iM405511 = c17861.m40558(16);
                        c17861.m40566(8);
                        if (iM405511 == 3) {
                            while (c17861.m40563() < iM40565) {
                                int iM405512 = c17861.m40558(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iM405512];
                                c17861.m40560(iM405512, bArr);
                                str = new String(bArr, charset);
                                int iM405513 = c17861.m40558(8);
                                for (int i = 0; i < iM405513; i++) {
                                    c17861.m40562(c17861.m40558(8));
                                }
                            }
                        }
                    } else if (iM40559 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iM405510];
                        c17861.m40560(iM405510, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    c17861.m40569(iM40565 * 8);
                }
                c17861.m40569(iM40564 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new C22781(iM40558, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new C25079(arrayList);
            }
        }
        return null;
    }
}
