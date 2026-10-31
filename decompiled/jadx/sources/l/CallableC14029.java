package l;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ܰ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC14029 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42422;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42423;

    public /* synthetic */ CallableC14029(int i, Object obj) {
        this.f42422 = i;
        this.f42423 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f42422) {
            case 0:
                try {
                    InputStream inputStreamMo27926 = ((C12993) this.f42423).mo27926();
                    try {
                        Boolean bool = Boolean.TRUE;
                        inputStreamMo27926.close();
                        return bool;
                    } catch (Throwable th) {
                        try {
                            inputStreamMo27926.close();
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
                return Byte.valueOf(C19697.m45298((C19697) this.f42423));
            default:
                C18390.m42817((InterfaceC13883) this.f42423);
                return null;
        }
    }
}
