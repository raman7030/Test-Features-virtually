package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20709 extends AbstractC15768 {
    @Override // l.AbstractC15768
    /* JADX INFO: renamed from: ֫ */
    public final void mo5599(AbstractActivityC3346 abstractActivityC3346) {
        if (!C23196.m51460()) {
            C21374.m48457(R.string.MT_Protector);
            new ViewOnClickListenerC0059(abstractActivityC3346);
        } else {
            abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC6388.class));
        }
    }
}
