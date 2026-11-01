package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8429 implements InterfaceC14700 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC7603 f22596;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC7603 f22597;

    /* JADX INFO: renamed from: ܽ */
    public boolean f22598;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C9770 f22599;

    /* JADX INFO: renamed from: ᩳ */
    public final C15370 f22600;

    public C8429(C9770 c9770, C15370 c15370) {
        this.f22599 = c9770;
        this.f22600 = c15370;
        InterfaceC7603 interfaceC7603M35032 = c15370.m35032(1);
        this.f22597 = interfaceC7603M35032;
        this.f22596 = new C12453(this, interfaceC7603M35032, c15370);
    }

    @Override // p067l.InterfaceC14700
    /* JADX INFO: renamed from: ֫ */
    public final void mo19637() {
        synchronized (this.f22599) {
            if (this.f22598) {
                return;
            }
            this.f22598 = true;
            this.f22599.getClass();
            C21407.m48495(this.f22597);
            try {
                this.f22600.m35033();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p067l.InterfaceC14700
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7603 mo19638() {
        return this.f22596;
    }
}
