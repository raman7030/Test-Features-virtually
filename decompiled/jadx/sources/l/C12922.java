package l;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.۬ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8Y5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12922 extends AbstractC22800 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12217 f38793;

    public C12922(C12217 c12217) {
        this.f38793 = c12217;
    }

    @Override // l.AbstractC7483
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo5986() {
        return Collections.singleton("img");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12922 m31432() {
        return new C12922(new C12217(AbstractC2545.m8058()));
    }

    @Override // l.AbstractC22800
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5985(C18981 c18981, InterfaceC14040 interfaceC14040, InterfaceC15243 interfaceC15243) {
        InterfaceC1592 interfaceC1592Mo22000;
        String str = (String) interfaceC15243.attributes().get("src");
        if (TextUtils.isEmpty(str) || (interfaceC1592Mo22000 = c18981.m43812().mo22000(C8665.class)) == null) {
            return null;
        }
        c18981.m43809().getClass();
        C22260 c22260M29709 = this.f38793.m29709(interfaceC15243.attributes());
        AbstractC15203.f46435.m29086(interfaceC14040, str);
        AbstractC15203.f46436.m29086(interfaceC14040, c22260M29709);
        AbstractC15203.f46437.m29086(interfaceC14040, Boolean.FALSE);
        return interfaceC1592Mo22000.mo5310(c18981, interfaceC14040);
    }
}
