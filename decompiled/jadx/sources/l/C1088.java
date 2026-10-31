package l;

import android.view.View;

/* JADX INFO: renamed from: l.֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1088 extends AbstractC20139 {
    @Override // l.AbstractC20139
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3755(View view, Object obj) {
        C22960.m51090(view, ((Boolean) obj).booleanValue());
    }

    @Override // l.AbstractC20139
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo3756(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
    }

    @Override // l.AbstractC20139
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo3754(View view) {
        return Boolean.valueOf(C22960.m51092(view));
    }
}
