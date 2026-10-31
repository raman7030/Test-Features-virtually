package l;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۘ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8P4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4191 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2780 f13645;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f13646 = new AtomicBoolean(false);

    public C4191(InterfaceC2780 interfaceC2780) {
        this.f13645 = interfaceC2780;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1368 m12640(Object... objArr) {
        Constructor constructorMo8584;
        synchronized (this.f13646) {
            try {
                if (!this.f13646.get()) {
                    try {
                        constructorMo8584 = this.f13645.mo8584();
                    } catch (ClassNotFoundException unused) {
                        this.f13646.set(true);
                        constructorMo8584 = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorMo8584 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorMo8584 == null) {
            return null;
        }
        try {
            return (InterfaceC1368) constructorMo8584.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
