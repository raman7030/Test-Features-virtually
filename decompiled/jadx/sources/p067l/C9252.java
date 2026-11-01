package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9252 implements InterfaceC24317 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ LinkedHashMap f25078;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AtomicInteger f25079;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18600 f25080;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC3848 f25081;

    @Override // p067l.InterfaceC24317
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10594(IOException iOException) {
        return true;
    }

    public C9252(C18600 c18600, LinkedHashMap linkedHashMap, AbstractC3848 abstractC3848, AtomicInteger atomicInteger) {
        this.f25080 = c18600;
        this.f25078 = linkedHashMap;
        this.f25081 = abstractC3848;
        this.f25079 = atomicInteger;
    }

    @Override // p067l.InterfaceC24317
    /* JADX INFO: renamed from: ֫ */
    public final void mo10593(InterfaceC19370 interfaceC19370, InputStream inputStream) {
        AbstractC3848 abstractC3848 = this.f25081;
        try {
            String str = (String) this.f25078.get(interfaceC19370);
            C12826.requireNonNull(str);
            abstractC3848.mo7558(str + interfaceC19370.getName(), false);
            if (inputStream != null && this.f25080.m42332(C18600.m42325(inputStream))) {
                abstractC3848.m7559(new C13946(interfaceC19370, str));
                this.f25079.incrementAndGet();
            }
        } finally {
            C2700.m4192(inputStream);
        }
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f25080.f55553;
    }
}
