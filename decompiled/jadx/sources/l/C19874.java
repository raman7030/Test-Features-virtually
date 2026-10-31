package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩶ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19874 extends C14268 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21529 f64164;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19874(Object obj, C21529 c21529) {
        super(obj);
        this.f64164 = c21529;
    }

    @Override // l.C14268
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8964() {
        int iM33912 = m33912() & 2;
        C21529 c21529 = this.f64164;
        if (iM33912 != 0) {
            c21529.m48691(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        c21529.m48691(0, bundle);
    }
}
