package p067l;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ܽۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18165 extends GZIPOutputStream {
    public C18165(OutputStream outputStream, int i) {
        super(outputStream, 65536);
        ((GZIPOutputStream) this).def.setLevel(C19507.f59423[i]);
    }
}
