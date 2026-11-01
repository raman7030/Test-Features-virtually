package p067l;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۘ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8P4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6352 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5011 f16458;

    /* JADX INFO: renamed from: ۧ */
    public final AtomicBoolean f16459 = new AtomicBoolean(false);

    public C6352(InterfaceC5011 interfaceC5011) {
        this.f16458 = interfaceC5011;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3669 m14516(Object... objArr) {
        Constructor constructorMo10647;
        synchronized (this.f16459) {
            try {
                if (!this.f16459.get()) {
                    try {
                        constructorMo10647 = this.f16458.mo10647();
                    } catch (ClassNotFoundException unused) {
                        this.f16459.set(true);
                        constructorMo10647 = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorMo10647 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorMo10647 == null) {
            return null;
        }
        try {
            return (InterfaceC3669) constructorMo10647.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
