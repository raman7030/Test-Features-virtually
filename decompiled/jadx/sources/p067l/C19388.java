package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ᩳ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19388 implements InterfaceC1100 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C24752 f57874;

    public C19388(C24752 c24752) {
        this.f57874 = c24752;
    }

    @Override // p067l.InterfaceC1100
    public final boolean perform(View view, AbstractC1310 abstractC1310) {
        int i = ((C4636) view).f10402 + 1;
        C4636 c4636 = this.f57874.f78357;
        if (c4636.m9782()) {
            c4636.m9780(i, true);
        }
        return true;
    }
}
