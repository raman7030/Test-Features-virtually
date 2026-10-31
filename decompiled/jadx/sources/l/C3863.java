package l;

import com.alipay.sdk.m.t.e;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۘۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5UU */
/* JADX INFO: loaded from: classes3.dex */
public final class C3863 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public void mo1728(C16040 c16040) {
        C11955 c11955 = new C11955();
        CRC32 crc32 = new CRC32();
        crc32.update((byte[]) ((C11955) c16040.m37919()).m29175());
        c11955.m29153(crc32.getValue());
        c16040.m37918(c11955);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11620(String str) {
        if (!"code".equals(str) && !e.m.equals(str) && !"both".equals(str)) {
            throw new IllegalArgumentException("Invalid scanKind");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11619(int i, String str) {
        m11620(str);
        C2241.m7424(i);
        if (e.m.equals(str)) {
            if (i != 4) {
                throw new IllegalArgumentException("scanKind=data requires referenceKinds=[data]");
            }
        } else if ("both".equals(str) && (i & 4) == 0) {
            throw new IllegalArgumentException("scanKind=both requires referenceKinds containing data");
        }
    }
}
