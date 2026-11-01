package p067l;

import java.io.InputStream;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩹ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes.dex */
public final class C23462 extends AbstractC6698 {

    /* JADX INFO: renamed from: ֫ */
    public final InputStream f74716;

    public C23462(InputStream inputStream) {
        this.f74716 = inputStream;
    }

    @Override // p067l.AbstractC6698
    /* JADX INFO: renamed from: ֫ */
    public final GifInfoHandle mo15295() {
        return new GifInfoHandle(this.f74716);
    }
}
