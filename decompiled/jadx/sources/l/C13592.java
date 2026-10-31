package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܰۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1B34 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13592 implements InterfaceC23094 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f40532;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17079 f40533;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1557 f40534;

    @Override // l.InterfaceC23094
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8531(IOException iOException) {
        return true;
    }

    public C13592(C17079 c17079, LinkedHashMap linkedHashMap, AbstractC1557 abstractC1557) {
        this.f40533 = c17079;
        this.f40532 = linkedHashMap;
        this.f40534 = abstractC1557;
    }

    @Override // l.InterfaceC23094
    /* JADX INFO: renamed from: ֫ */
    public final void mo8530(InterfaceC17889 interfaceC17889, InputStream inputStream) {
        AbstractC1557 abstractC1557 = this.f40534;
        try {
            C12182 c12182 = (C12182) this.f40532.get(interfaceC17889);
            C11003.requireNonNull(c12182);
            abstractC1557.mo5329(c12182.m29663(), false);
            if (inputStream != null && this.f40533.m40087(C17079.m40080(inputStream))) {
                abstractC1557.m5330(c12182);
            }
        } finally {
            C0349.m1793(inputStream);
        }
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f40533.f52371;
    }
}
