package l;

import android.content.res.Resources;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩶ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20079 extends AbstractC4556 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f65019;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Resources f65020;

    public C20079(Resources resources, int i) {
        this.f65020 = resources;
        this.f65019 = i;
    }

    @Override // l.AbstractC4556
    /* JADX INFO: renamed from: ֫ */
    public final GifInfoHandle mo13407() {
        return new GifInfoHandle(this.f65020.openRawResourceFd(this.f65019));
    }
}
