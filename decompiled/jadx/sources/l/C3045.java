package l;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۗۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C3045 extends AbstractC22800 {
    @Override // l.AbstractC22800
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5985(C18981 c18981, InterfaceC14040 interfaceC14040, InterfaceC15243 interfaceC15243) {
        int i;
        InterfaceC1592 interfaceC1592Mo22000 = c18981.m43812().mo22000(C6548.class);
        if (interfaceC1592Mo22000 == null) {
            return null;
        }
        try {
            i = Integer.parseInt(interfaceC15243.name().substring(1));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i < 1 || i > 6) {
            return null;
        }
        AbstractC4415.f14121.m29086(interfaceC14040, Integer.valueOf(i));
        return interfaceC1592Mo22000.mo5310(c18981, interfaceC14040);
    }

    @Override // l.AbstractC7483
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo5986() {
        return Arrays.asList("h1", "h2", "h3", "h4", "h5", "h6");
    }
}
