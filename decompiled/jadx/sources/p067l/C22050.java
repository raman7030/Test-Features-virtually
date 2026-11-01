package p067l;

import android.content.Intent;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22050 extends AbstractC17354 {
    @Override // p067l.AbstractC17354
    /* JADX INFO: renamed from: ֫ */
    public final void mo7829(AbstractActivityC5549 abstractActivityC5549) {
        if (!C24414.m53856()) {
            C22682.m50793(R.string.MT_Protector);
            new ViewOnClickListenerC2424(abstractActivityC5549);
        } else {
            abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC8440.class));
        }
    }
}
