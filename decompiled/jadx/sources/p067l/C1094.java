package p067l;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: l.ۚۗ */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1094 {

    /* JADX INFO: renamed from: ֫ */
    public final Configuration f18784;

    /* JADX INFO: renamed from: ۧ */
    public final int f18785;

    /* JADX INFO: renamed from: ܽ */
    public final ColorStateList f18786;

    public C1094(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f18786 = colorStateList;
        this.f18784 = configuration;
        this.f18785 = theme == null ? 0 : theme.hashCode();
    }
}
