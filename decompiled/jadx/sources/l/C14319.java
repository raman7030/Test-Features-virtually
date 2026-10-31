package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܳۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14319 implements InterfaceC7305, InterfaceC2266 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43184;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43185;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43186;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43187;

    public /* synthetic */ C14319(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f43186 = obj;
        this.f43187 = obj2;
        this.f43185 = obj3;
        this.f43184 = obj4;
    }

    @Override // l.InterfaceC7305
    /* JADX INFO: renamed from: ֫ */
    public void mo10987(C10211 c10211) {
        C15730.m37134((C15730) this.f43186, (C10211) this.f43187, (C2450) this.f43185, (C16560) this.f43184, c10211);
    }

    @Override // l.InterfaceC2266
    /* JADX INFO: renamed from: ۧ */
    public void mo7493(int i) {
        C12002 c12002 = (C12002) this.f43186;
        ImageView imageView = (ImageView) this.f43187;
        InterfaceC14760 interfaceC14760 = (InterfaceC14760) this.f43185;
        C21236 c21236 = (C21236) this.f43184;
        EnumC6357 enumC6357 = EnumC6357.IMMUTABLE;
        c12002.f35932 = i;
        c12002.f35934 = enumC6357;
        imageView.setImageBitmap(interfaceC14760.mo32433(c12002));
        if (c21236.mo48205()) {
            c21236.m48206();
            ((DialogInterfaceC0206) c21236.mo15808()).m1441(false);
        }
    }
}
