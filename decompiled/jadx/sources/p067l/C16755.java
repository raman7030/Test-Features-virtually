package p067l;

import android.content.res.AssetManager;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ܶۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16755 extends AbstractC6698 {

    /* JADX INFO: renamed from: ֫ */
    public final AssetManager f49377;

    /* JADX INFO: renamed from: ۧ */
    public final String f49378;

    public C16755(AssetManager assetManager, String str) {
        this.f49377 = assetManager;
        this.f49378 = str;
    }

    @Override // p067l.AbstractC6698
    /* JADX INFO: renamed from: ֫ */
    public final GifInfoHandle mo15295() {
        return new GifInfoHandle(this.f49377.openFd(this.f49378));
    }
}
