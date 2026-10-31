package l;

import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.ܽۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16621 extends GZIPOutputStream {
    public C16621(OutputStream outputStream, int i) {
        super(outputStream, 65536);
        ((GZIPOutputStream) this).def.setLevel(C18033.f56225[i]);
    }
}
