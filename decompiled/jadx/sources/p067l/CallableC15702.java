package p067l;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܰ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC15702 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f45505;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Object f45506;

    public /* synthetic */ CallableC15702(int i, Object obj) {
        this.f45505 = i;
        this.f45506 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f45505) {
            case 0:
                try {
                    InputStream inputStreamMo29987 = ((C14717) this.f45506).mo29987();
                    try {
                        Boolean bool = Boolean.TRUE;
                        inputStreamMo29987.close();
                        return bool;
                    } catch (Throwable th) {
                        try {
                            inputStreamMo29987.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            case 1:
                return Byte.valueOf(C21089.m47595((C21089) this.f45506));
            default:
                C19847.m45089((InterfaceC15563) this.f45506);
                return null;
        }
    }
}
