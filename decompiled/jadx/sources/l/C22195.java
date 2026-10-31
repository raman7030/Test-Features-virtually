package l;

import java.io.InputStream;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩹ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes.dex */
public final class C22195 extends AbstractC4556 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream f71995;

    public C22195(InputStream inputStream) {
        this.f71995 = inputStream;
    }

    @Override // l.AbstractC4556
    /* JADX INFO: renamed from: ֫ */
    public final GifInfoHandle mo13407() {
        return new GifInfoHandle(this.f71995);
    }
}
