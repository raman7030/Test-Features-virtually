package p067l;

import android.content.Intent;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9387 implements InterfaceC14518, InterfaceC21477, InterfaceC6782, InterfaceC21153, InterfaceC10038, InterfaceC7348 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f25642;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f25643;

    public /* synthetic */ C9387(int i, Object obj) {
        this.f25642 = i;
        this.f25643 = obj;
    }

    @Override // p067l.InterfaceC7348
    /* JADX INFO: renamed from: ֫ */
    public Object mo17030(C19613 c19613) {
        return (C16259) this.f25643;
    }

    @Override // p067l.InterfaceC21153
    /* JADX INFO: renamed from: ֫ */
    public void mo6900(Intent intent, int i) {
        ViewOnLayoutChangeListenerC9723.m22719((ViewOnLayoutChangeListenerC9723) this.f25643);
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        switch (this.f25642) {
            case 2:
                ((C18402) this.f25643).m41895();
                break;
            default:
                ActivityC18686.m42524((ActivityC18686) this.f25643, (String) obj);
                break;
        }
    }

    @Override // p067l.InterfaceC14518
    /* JADX INFO: renamed from: ֫ */
    public void mo17414(String str) {
        ((C20661) this.f25643).m46683(str);
    }

    @Override // p067l.InterfaceC6782
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo7890() {
        return C18950.m43052((AbstractC17043) this.f25643);
    }
}
