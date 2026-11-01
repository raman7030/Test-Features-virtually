package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܰۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15286 implements InterfaceC24317 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ LinkedHashMap f43609;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18600 f43610;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC3848 f43611;

    @Override // p067l.InterfaceC24317
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10594(IOException iOException) {
        return true;
    }

    public C15286(C18600 c18600, LinkedHashMap linkedHashMap, AbstractC3848 abstractC3848) {
        this.f43610 = c18600;
        this.f43609 = linkedHashMap;
        this.f43611 = abstractC3848;
    }

    @Override // p067l.InterfaceC24317
    /* JADX INFO: renamed from: ֫ */
    public final void mo10593(InterfaceC19370 interfaceC19370, InputStream inputStream) {
        AbstractC3848 abstractC3848 = this.f43611;
        try {
            C13946 c13946 = (C13946) this.f43609.get(interfaceC19370);
            C12826.requireNonNull(c13946);
            abstractC3848.mo7558(c13946.m31725(), false);
            if (inputStream != null && this.f43610.m42332(C18600.m42325(inputStream))) {
                abstractC3848.m7559(c13946);
            }
        } finally {
            C2700.m4192(inputStream);
        }
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f43610.f55553;
    }
}
