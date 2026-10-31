package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8OQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22183 extends AbstractC15126 {
    @Override // l.AbstractC15126
    /* JADX INFO: renamed from: ֫ */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            C16302 c16302 = new C16302(byteBuffer.array(), byteBuffer.limit());
            c16302.m38351(12);
            int iM38348 = (c16302.m38348() + c16302.m38343(12)) - 4;
            c16302.m38351(44);
            c16302.m38347(c16302.m38343(12));
            c16302.m38351(16);
            ArrayList arrayList = new ArrayList();
            while (c16302.m38348() < iM38348) {
                c16302.m38351(48);
                int iM38343 = c16302.m38343(8);
                c16302.m38351(4);
                int iM38349 = c16302.m38348() + c16302.m38343(12);
                String str = null;
                String str2 = null;
                while (c16302.m38348() < iM38349) {
                    int iM38344 = c16302.m38343(8);
                    int iM38345 = c16302.m38343(8);
                    int iM383410 = c16302.m38348() + iM38345;
                    if (iM38344 == 2) {
                        int iM38346 = c16302.m38343(16);
                        c16302.m38351(8);
                        if (iM38346 == 3) {
                            while (c16302.m38348() < iM383410) {
                                int iM38347 = c16302.m38343(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iM38347];
                                c16302.m38345(iM38347, bArr);
                                str = new String(bArr, charset);
                                int iM383411 = c16302.m38343(8);
                                for (int i = 0; i < iM383411; i++) {
                                    c16302.m38347(c16302.m38343(8));
                                }
                            }
                        }
                    } else if (iM38344 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iM38345];
                        c16302.m38345(iM38345, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    c16302.m38354(iM383410 * 8);
                }
                c16302.m38354(iM38349 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new C21478(iM38343, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new C23896(arrayList);
            }
        }
        return null;
    }
}
