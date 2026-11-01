package p067l;

import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21736 implements InterfaceC14518, InterfaceC6782, InterfaceC21477, InterfaceC22339 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f68453;

    public /* synthetic */ C21736(Object obj) {
        this.f68453 = obj;
    }

    @Override // p067l.InterfaceC21477
    /* JADX INFO: renamed from: ֫ */
    public void mo15100(Object obj) {
        ((C16408) this.f68453).m37273((C13607) obj, true);
    }

    @Override // p067l.InterfaceC14518
    /* JADX INFO: renamed from: ֫ */
    public void mo17414(String str) {
        ((AtomicReference) this.f68453).set(str);
    }

    @Override // p067l.InterfaceC6782
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo7890() {
        return C18950.m43047((InterfaceC12916) this.f68453);
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        throw new C15611((String) this.f68453);
    }
}
