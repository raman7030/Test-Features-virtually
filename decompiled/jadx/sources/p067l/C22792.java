package p067l;

import java.io.File;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩸ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes5.dex */
public final class C22792 extends AbstractC6698 {

    /* JADX INFO: renamed from: ֫ */
    public final String f71826;

    public C22792(File file) {
        this.f71826 = file.getPath();
    }

    @Override // p067l.AbstractC6698
    /* JADX INFO: renamed from: ֫ */
    public final GifInfoHandle mo15295() {
        return new GifInfoHandle(this.f71826);
    }
}
