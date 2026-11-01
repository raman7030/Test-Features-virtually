package p067l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۜۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8638 extends AbstractC17354 {

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f23194;

    /* JADX INFO: renamed from: ܽ */
    public final String f23195;

    public C8638(C14677 c14677) {
        super(4);
        this.f23195 = c14677.m33593();
        this.f23194 = C6054.m13642(c14677.m33593());
    }

    @Override // p067l.AbstractC17354
    /* JADX INFO: renamed from: ֫ */
    public final void mo7829(AbstractActivityC5549 abstractActivityC5549) {
        Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC22720.class);
        intent.putExtra("title", this.f23195);
        intent.putExtra("markdown", this.f23194);
        abstractActivityC5549.startActivity(intent);
    }
}
