package l;

import android.text.TextUtils;
import com.umeng.analytics.pro.am;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۤۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10101 extends AbstractC22800 {
    @Override // l.AbstractC22800
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5985(C18981 c18981, InterfaceC14040 interfaceC14040, InterfaceC15243 interfaceC15243) {
        InterfaceC1592 interfaceC1592Mo22000;
        String str = (String) interfaceC15243.attributes().get("href");
        if (TextUtils.isEmpty(str) || (interfaceC1592Mo22000 = c18981.m43812().mo22000(C2315.class)) == null) {
            return null;
        }
        AbstractC4415.f14123.m29086(interfaceC14040, str);
        return interfaceC1592Mo22000.mo5310(c18981, interfaceC14040);
    }

    @Override // l.AbstractC7483
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo5986() {
        return Collections.singleton(am.av);
    }
}
