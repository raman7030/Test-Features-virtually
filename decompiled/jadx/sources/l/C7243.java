package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7243 implements InterfaceC23094 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f22195;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f22196;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17079 f22197;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1557 f22198;

    @Override // l.InterfaceC23094
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8531(IOException iOException) {
        return true;
    }

    public C7243(C17079 c17079, LinkedHashMap linkedHashMap, AbstractC1557 abstractC1557, AtomicInteger atomicInteger) {
        this.f22197 = c17079;
        this.f22195 = linkedHashMap;
        this.f22198 = abstractC1557;
        this.f22196 = atomicInteger;
    }

    @Override // l.InterfaceC23094
    /* JADX INFO: renamed from: ֫ */
    public final void mo8530(InterfaceC17889 interfaceC17889, InputStream inputStream) {
        AbstractC1557 abstractC1557 = this.f22198;
        try {
            String str = (String) this.f22195.get(interfaceC17889);
            C11003.requireNonNull(str);
            abstractC1557.mo5329(str + interfaceC17889.getName(), false);
            if (inputStream != null && this.f22197.m40087(C17079.m40080(inputStream))) {
                abstractC1557.m5330(new C12182(interfaceC17889, str));
                this.f22196.incrementAndGet();
            }
        } finally {
            C0349.m1793(inputStream);
        }
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f22197.f52371;
    }
}
