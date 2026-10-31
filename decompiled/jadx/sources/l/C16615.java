package l;

import android.text.style.UnderlineSpan;
import com.umeng.analytics.pro.am;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܽۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S91K */
/* JADX INFO: loaded from: classes4.dex */
public final class C16615 extends AbstractC7483 {
    @Override // l.AbstractC7483
    /* JADX INFO: renamed from: ֫ */
    public final void mo20106(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC15243 interfaceC15243) {
        if (interfaceC15243.mo36204()) {
            AbstractC7483.m20105(interfaceC3458, abstractC2143, interfaceC15243.mo36203());
        }
        C17820.m41747(interfaceC3458.builder(), new UnderlineSpan(), interfaceC15243.start(), interfaceC15243.end());
    }

    @Override // l.AbstractC7483
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo5986() {
        return Arrays.asList(am.aH, "ins");
    }
}
