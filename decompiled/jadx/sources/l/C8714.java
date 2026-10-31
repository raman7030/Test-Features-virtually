package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۡۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8714 extends AbstractC15768 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f26520;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f26521;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f26522;

    public C8714(C12951 c12951) {
        super(8);
        this.f26522 = c12951.m31506();
        this.f26521 = c12951.m31493();
        this.f26520 = c12951.m31506();
    }

    @Override // l.AbstractC15768
    /* JADX INFO: renamed from: ֫ */
    public final void mo5599(AbstractActivityC3346 abstractActivityC3346) {
        byte[] bArrM32803 = C13651.m32803(this.f26521, this.f26520);
        if (bArrM32803 != null) {
            Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC21414.class);
            intent.putExtra("title", this.f26522);
            intent.putExtra("markdown", bArrM32803);
            abstractActivityC3346.startActivity(intent);
            return;
        }
        new C9420(this, abstractActivityC3346).m20274();
    }
}
