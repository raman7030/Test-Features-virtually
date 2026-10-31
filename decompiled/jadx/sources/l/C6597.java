package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۜۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6597 extends AbstractC15768 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f20317;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f20318;

    public C6597(C12951 c12951) {
        super(4);
        this.f20318 = c12951.m31506();
        this.f20317 = C3878.m11706(c12951.m31506());
    }

    @Override // l.AbstractC15768
    /* JADX INFO: renamed from: ֫ */
    public final void mo5599(AbstractActivityC3346 abstractActivityC3346) {
        Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC21414.class);
        intent.putExtra("title", this.f20318);
        intent.putExtra("markdown", this.f20317);
        abstractActivityC3346.startActivity(intent);
    }
}
