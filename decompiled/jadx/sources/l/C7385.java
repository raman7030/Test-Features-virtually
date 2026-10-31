package l;

import android.content.Intent;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7385 implements InterfaceC12784, InterfaceC20106, InterfaceC4644, InterfaceC19764, InterfaceC8070, InterfaceC5240 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f22730;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22731;

    public /* synthetic */ C7385(int i, Object obj) {
        this.f22730 = i;
        this.f22731 = obj;
    }

    @Override // l.InterfaceC5240
    /* JADX INFO: renamed from: ֫ */
    public Object mo15127(C18145 c18145) {
        return (C14616) this.f22731;
    }

    @Override // l.InterfaceC19764
    /* JADX INFO: renamed from: ֫ */
    public void mo4668(Intent intent, int i) {
        ViewOnLayoutChangeListenerC7738.m20739((ViewOnLayoutChangeListenerC7738) this.f22731);
    }

    @Override // l.InterfaceC20106
    /* JADX INFO: renamed from: ֫ */
    public void mo13218(Object obj) {
        switch (this.f22730) {
            case 2:
                ((C16870) this.f22731).m39659();
                break;
            default:
                ActivityC17169.m40279((ActivityC17169) this.f22731, (String) obj);
                break;
        }
    }

    @Override // l.InterfaceC12784
    /* JADX INFO: renamed from: ֫ */
    public void mo15503(String str) {
        ((C19247) this.f22731).m44389(str);
    }

    @Override // l.InterfaceC4644
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo5660() {
        return C17447.m40794((AbstractC15440) this.f22731);
    }
}
