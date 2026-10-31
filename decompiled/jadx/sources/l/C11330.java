package l;

import android.content.ContextWrapper;
import android.os.Handler;

/* JADX INFO: renamed from: l.ۧ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8VY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11330 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f33903;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f33904;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC16476 f33905;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC13850 f33906;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Handler f33907;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f33908;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f33909;

    public C11330(ContextWrapper contextWrapper) {
        this.f33908 = contextWrapper;
        this.f33906 = new C12440(contextWrapper);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27997(InterfaceC13850 interfaceC13850) {
        this.f33906 = interfaceC13850;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27999() {
        this.f33903 = 5000L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27996(Handler handler) {
        this.f33907 = handler;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27998(InterfaceC16476 interfaceC16476) {
        this.f33905 = interfaceC16476;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28000() {
        this.f33909 = 50;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17679 m27995() {
        C22632.m50634(!this.f33904);
        Handler handler = this.f33907;
        C22632.m50634((handler == null && this.f33905 == null) || !(handler == null || this.f33905 == null));
        this.f33904 = true;
        return new C17679(this);
    }
}
