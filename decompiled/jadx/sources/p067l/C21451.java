package p067l;

import android.content.res.Resources;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩶ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes5.dex */
public final class C21451 extends AbstractC6698 {

    /* JADX INFO: renamed from: ֫ */
    public final int f67659;

    /* JADX INFO: renamed from: ۧ */
    public final Resources f67660;

    public C21451(Resources resources, int i) {
        this.f67660 = resources;
        this.f67659 = i;
    }

    @Override // p067l.AbstractC6698
    /* JADX INFO: renamed from: ֫ */
    public final GifInfoHandle mo15295() {
        return new GifInfoHandle(this.f67660.openRawResourceFd(this.f67659));
    }
}
