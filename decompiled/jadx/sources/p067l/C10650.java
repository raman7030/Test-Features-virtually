package p067l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۡۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10650 extends AbstractC17354 {

    /* JADX INFO: renamed from: ۧ */
    public final String f29445;

    /* JADX INFO: renamed from: ܽ */
    public final int f29446;

    /* JADX INFO: renamed from: ᩳ */
    public final String f29447;

    public C10650(C14677 c14677) {
        super(8);
        this.f29447 = c14677.m33593();
        this.f29446 = c14677.m33580();
        this.f29445 = c14677.m33593();
    }

    @Override // p067l.AbstractC17354
    /* JADX INFO: renamed from: ֫ */
    public final void mo7829(AbstractActivityC5549 abstractActivityC5549) {
        byte[] bArrM34918 = C15342.m34918(this.f29446, this.f29445);
        if (bArrM34918 != null) {
            Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC22720.class);
            intent.putExtra("title", this.f29447);
            intent.putExtra("markdown", bArrM34918);
            abstractActivityC5549.startActivity(intent);
            return;
        }
        new C11321(this, abstractActivityC5549).m22250();
    }
}
