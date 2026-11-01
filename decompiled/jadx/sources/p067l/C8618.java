package p067l;

import android.graphics.Bitmap;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۜۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8618 implements InterfaceC14518, InterfaceC6782, InterfaceC9544, InterfaceC6141, InterfaceC4595 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f23157;

    public /* synthetic */ C8618(Object obj) {
        this.f23157 = obj;
    }

    @Override // p067l.InterfaceC14518
    /* JADX INFO: renamed from: ֫ */
    public void mo17414(String str) {
        ((C19561) this.f23157).m44451(str);
    }

    @Override // p067l.InterfaceC6141
    /* JADX INFO: renamed from: ۧ */
    public String mo13935() {
        C9842 c9842 = (C9842) this.f23157;
        return c9842.m23085(c9842.f27284, c9842.f27288);
    }

    @Override // p067l.InterfaceC6782
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo7890() {
        return C18950.m43040((InterfaceC12916) this.f23157);
    }

    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo9168(C4360 c4360) {
        C22671 c22671 = (C22671) this.f23157;
        return c22671.m9012().getString(R.string.MT_Protector, c22671.m13265().getString(c22671.m9037(), "10MB"));
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(final int i) {
        final InterfaceC4595 interfaceC4595 = (InterfaceC4595) this.f23157;
        C7050.m16212(new Runnable() { // from class: l.᩷ۛۡ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4595.mo8466(i);
            }
        });
    }
}
