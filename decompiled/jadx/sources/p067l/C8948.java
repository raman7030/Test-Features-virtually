package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8948 {

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC4410 f24255 = C13128.m30022(C8948.class);

    /* JADX INFO: renamed from: ֫ */
    public String f24256;

    /* JADX INFO: renamed from: ۧ */
    public C13978 f24257;

    /* JADX INFO: renamed from: ܽ */
    public C15612 f24258;

    public C8948(C15612 c15612, C13978 c13978, String str) {
        this.f24258 = c15612;
        this.f24257 = c13978;
        this.f24256 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8653 m20676(long j, int i, byte[] bArr) {
        C22320 c22320 = new C22320(j, i, bArr);
        ArrayList arrayList = new ArrayList();
        while (c22320.m50134()) {
            f24255.mo9177("Sending async write request to {} from offset {}", this.f24256, Long.valueOf(c22320.m26689()));
            arrayList.add(new C8653(this.f24258.m10457(this.f24257, c22320), new C16323(c22320.m26688())));
        }
        return new C8653(new C24746(arrayList), new C25041());
    }
}
