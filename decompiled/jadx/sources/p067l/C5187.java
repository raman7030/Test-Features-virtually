package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5187 extends AbstractC21281 {

    /* JADX INFO: renamed from: ۖ */
    public C5187 f12213;

    /* JADX INFO: renamed from: ۘ */
    public String f12214;

    /* JADX INFO: renamed from: ܺ */
    public ArrayList f12215;

    public C5187(C23292 c23292, C9952 c9952) {
        super(c23292, c9952.m23260(), c9952.m23259());
        this.f12215 = new ArrayList();
        for (InterfaceC21909 interfaceC21909 : c9952.getAnnotations()) {
            if (interfaceC21909.getVisibility() == 2) {
                String type = interfaceC21909.getType();
                type.getClass();
                if (type.equals("Ldalvik/annotation/EnclosingClass;")) {
                    for (InterfaceC11180 interfaceC11180 : interfaceC21909.getElements()) {
                        if (interfaceC11180.getName().equals(C0226b.f1011d)) {
                            this.f12214 = ((InterfaceC16324) interfaceC11180.getValue()).getValue();
                        }
                    }
                } else if (type.equals("Ldalvik/annotation/EnclosingMethod;")) {
                    for (InterfaceC11180 interfaceC11181 : interfaceC21909.getElements()) {
                        if (interfaceC11181.getName().equals(C0226b.f1011d)) {
                            this.f12214 = ((InterfaceC4255) interfaceC11181.getValue()).getValue().mo5853();
                        }
                    }
                }
            }
        }
        if (this.f12214 == null) {
            String type2 = c9952.getType();
            int iLastIndexOf = type2.lastIndexOf(47);
            int iLastIndexOf2 = type2.lastIndexOf(36);
            if (iLastIndexOf2 > iLastIndexOf) {
                while (type2.charAt(iLastIndexOf2 - 1) == '$') {
                    iLastIndexOf2--;
                }
                this.f12214 = type2.substring(0, iLastIndexOf2) + C0249l.f1196b;
            }
        }
    }

    @Override // p067l.AbstractC21281
    /* JADX INFO: renamed from: ֫ */
    public final void mo11125(InterfaceC10825 interfaceC10825) {
        interfaceC10825.mo3627(this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m11128(String str) {
        C22622 c22622 = new C22622();
        this.f66944.m51876(str);
        this.f12215.add(c22622);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C5187 m11129() {
        return this.f12213;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11127(C5187 c5187) {
        this.f12213 = c5187;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m11126() {
        return this.f12214;
    }
}
