package l;

import android.content.res.AssetManager;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ܶۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15138 extends AbstractC4556 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AssetManager f46258;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f46259;

    public C15138(AssetManager assetManager, String str) {
        this.f46258 = assetManager;
        this.f46259 = str;
    }

    @Override // l.AbstractC4556
    /* JADX INFO: renamed from: ֫ */
    public final GifInfoHandle mo13407() {
        return new GifInfoHandle(this.f46258.openFd(this.f46259));
    }
}
