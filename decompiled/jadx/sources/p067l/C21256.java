package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.᩶ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes5.dex */
public final class C21256 extends C15928 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C1910 f66800;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21256(Object obj, C1910 c1910) {
        super(obj);
        this.f66800 = c1910;
    }

    @Override // p067l.C15928
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11032() {
        int iM36045 = m36045() & 2;
        C1910 c1910 = this.f66800;
        if (iM36045 != 0) {
            c1910.m51036(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        c1910.m51036(0, bundle);
    }
}
