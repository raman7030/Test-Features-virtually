package l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֡۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q20L */
/* JADX INFO: loaded from: classes2.dex */
public final class C0412 implements InterfaceC8174 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f1877 = new LinkedHashSet();

    public C0412(C15228 c15228) {
        c15228.m36039("androidx.savedstate.Restarter", this);
    }

    @Override // l.InterfaceC8174
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bundle mo1940() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1877));
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1941(String str) {
        this.f1877.add(str);
    }
}
