package p067l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֡۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q20L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2760 implements InterfaceC10137 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashSet f4654 = new LinkedHashSet();

    public C2760(C16841 c16841) {
        c16841.m38200("androidx.savedstate.Restarter", this);
    }

    @Override // p067l.InterfaceC10137
    /* JADX INFO: renamed from: ֫ */
    public final Bundle mo4332() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4654));
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4333(String str) {
        this.f4654.add(str);
    }
}
