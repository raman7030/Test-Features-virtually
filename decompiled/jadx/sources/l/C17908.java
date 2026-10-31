package l;

import android.view.View;

/* JADX INFO: renamed from: l.ᩳ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17908 implements InterfaceC5198 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23552 f54677;

    public C17908(C23552 c23552) {
        this.f54677 = c23552;
    }

    @Override // l.InterfaceC5198
    public final boolean perform(View view, AbstractC9432 abstractC9432) {
        int i = ((C2386) view).f7611 + 1;
        C2386 c2386 = this.f54677.f75611;
        if (c2386.m7721()) {
            c2386.m7719(i, true);
        }
        return true;
    }
}
