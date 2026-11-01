package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܰۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P904 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15319 extends AbstractC9480 {
    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final void mo22082(InterfaceC5655 interfaceC5655, AbstractC4406 abstractC4406, InterfaceC16855 interfaceC16855) {
        if (interfaceC16855.mo38365()) {
            AbstractC9480.m22081(interfaceC5655, abstractC4406, interfaceC16855.mo38364());
        }
        C19304 c19304Builder = interfaceC5655.builder();
        C20408 c20408Mo12595 = interfaceC5655.mo12595();
        InterfaceC3881 interfaceC3881Mo23970 = c20408Mo12595.m46079().mo23970(C6282.class);
        C19304.m43993(c19304Builder, interfaceC3881Mo23970 == null ? null : interfaceC3881Mo23970.mo7539(c20408Mo12595, interfaceC5655.mo12591()), interfaceC16855.start(), interfaceC16855.end());
    }

    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8183() {
        return Arrays.asList(C0655am.f2274aB, "del");
    }
}
