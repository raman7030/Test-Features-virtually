package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۤܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10380 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC14801[] f31214;

    public C10380(InterfaceC14801[] interfaceC14801Arr) {
        this.f31214 = interfaceC14801Arr;
    }

    private final Object readResolve() {
        InterfaceC14801[] interfaceC14801Arr = this.f31214;
        InterfaceC14801 interfaceC14801Mo13851 = C23974.f77731;
        for (InterfaceC14801 interfaceC14801 : interfaceC14801Arr) {
            interfaceC14801Mo13851 = interfaceC14801Mo13851.mo13851(interfaceC14801);
        }
        return interfaceC14801Mo13851;
    }
}
