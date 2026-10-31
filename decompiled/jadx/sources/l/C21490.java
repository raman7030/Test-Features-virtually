package l;

import java.io.File;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.᩸ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I51P */
/* JADX INFO: loaded from: classes5.dex */
public final class C21490 extends AbstractC4556 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f69129;

    public C21490(File file) {
        this.f69129 = file.getPath();
    }

    @Override // l.AbstractC4556
    /* JADX INFO: renamed from: ֫ */
    public final GifInfoHandle mo13407() {
        return new GifInfoHandle(this.f69129);
    }
}
