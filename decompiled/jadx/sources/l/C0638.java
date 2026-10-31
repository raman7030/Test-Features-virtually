package l;

import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0638 implements DirectoryStream {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DirectoryStream.Filter f2436;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8400 f2437;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2438 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5578 f2439;

    public C0638(C5578 c5578, DirectoryStream.Filter filter, C8400 c8400) {
        this.f2439 = c5578;
        this.f2436 = filter;
        this.f2437 = c8400;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2438 = true;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        if (this.f2438) {
            throw new IllegalStateException("DirectoryStream is closed");
        }
        DirectoryStream.Filter filter = this.f2436;
        return C5378.stream(this.f2439.f17281.m4937(this.f2437.f49781.substring(1))).map(new Function() { // from class: l.᩵᩶۠
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f63612.f2439.getPath("/" + ((C3545) obj).getName(), new String[0]);
            }
        }).filter(filter == null ? new C4167(0) : new C18984(0, filter)).iterator();
    }
}
