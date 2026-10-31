package l;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: l.ۚۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes2.dex */
public final class C5074 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Configuration f15948;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f15949;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ColorStateList f15950;

    public C5074(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f15950 = colorStateList;
        this.f15948 = configuration;
        this.f15949 = theme == null ? 0 : theme.hashCode();
    }
}
