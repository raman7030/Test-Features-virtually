package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ܶܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16978 implements InterfaceC18755 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC21674 f50214;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f50215;

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo6353(String str) {
    }

    public C16978(ViewOnClickListenerC21674 viewOnClickListenerC21674, TextView textView) {
        this.f50214 = viewOnClickListenerC21674;
        this.f50215 = textView;
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6351(String str) {
        this.f50214.f68277.m51400(str);
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6352(EnumC16072 enumC16072) {
        this.f50215.setVisibility(enumC16072.m36584() ? 4 : 0);
    }
}
