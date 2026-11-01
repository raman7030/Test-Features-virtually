package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۘۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5UU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6040 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public void mo4126(C17613 c17613) {
        C13731 c13731 = new C13731();
        CRC32 crc32 = new CRC32();
        crc32.update((byte[]) ((C13731) c17613.m40106()).m31229());
        c13731.m31207(crc32.getValue());
        c17613.m40105(c13731);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13556(String str) {
        if (!"code".equals(str) && !AbstractC0213e.f989m.equals(str) && !"both".equals(str)) {
            throw new IllegalArgumentException("Invalid scanKind");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13555(int i, String str) {
        m13556(str);
        C4498.m9506(i);
        if (AbstractC0213e.f989m.equals(str)) {
            if (i != 4) {
                throw new IllegalArgumentException("scanKind=data requires referenceKinds=[data]");
            }
        } else if ("both".equals(str) && (i & 4) == 0) {
            throw new IllegalArgumentException("scanKind=both requires referenceKinds containing data");
        }
    }
}
