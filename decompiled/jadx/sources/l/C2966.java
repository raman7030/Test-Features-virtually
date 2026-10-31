package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2966 extends AbstractC19900 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C2966 f9414;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f9415;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f9416;

    public C2966(C22016 c22016, C7980 c7980) {
        super(c22016, c7980.m21294(), c7980.m21293());
        this.f9416 = new ArrayList();
        for (InterfaceC20561 interfaceC20561 : c7980.getAnnotations()) {
            if (interfaceC20561.getVisibility() == 2) {
                String type = interfaceC20561.getType();
                type.getClass();
                if (type.equals("Ldalvik/annotation/EnclosingClass;")) {
                    for (InterfaceC9272 interfaceC9272 : interfaceC20561.getElements()) {
                        if (interfaceC9272.getName().equals(b.d)) {
                            this.f9415 = ((InterfaceC14684) interfaceC9272.getValue()).getValue();
                        }
                    }
                } else if (type.equals("Ldalvik/annotation/EnclosingMethod;")) {
                    for (InterfaceC9272 interfaceC9273 : interfaceC20561.getElements()) {
                        if (interfaceC9273.getName().equals(b.d)) {
                            this.f9415 = ((InterfaceC1985) interfaceC9273.getValue()).getValue().mo3566();
                        }
                    }
                }
            }
        }
        if (this.f9415 == null) {
            String type2 = c7980.getType();
            int iLastIndexOf = type2.lastIndexOf(47);
            int iLastIndexOf2 = type2.lastIndexOf(36);
            if (iLastIndexOf2 > iLastIndexOf) {
                while (type2.charAt(iLastIndexOf2 - 1) == '$') {
                    iLastIndexOf2--;
                }
                this.f9415 = type2.substring(0, iLastIndexOf2) + l.b;
            }
        }
    }

    @Override // l.AbstractC19900
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9073(InterfaceC8898 interfaceC8898) {
        interfaceC8898.mo1225(this);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m9076(String str) {
        C21311 c21311 = new C21311();
        this.f64309.m49540(str);
        this.f9416.add(c21311);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2966 m9077() {
        return this.f9414;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9075(C2966 c2966) {
        this.f9414 = c2966;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m9074() {
        return this.f9415;
    }
}
