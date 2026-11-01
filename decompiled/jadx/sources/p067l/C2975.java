package p067l;

import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2975 implements DirectoryStream {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ DirectoryStream.Filter f5208;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C10352 f5209;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f5210 = false;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7670 f5211;

    public C2975(C7670 c7670, DirectoryStream.Filter filter, C10352 c10352) {
        this.f5211 = c7670;
        this.f5208 = filter;
        this.f5209 = c10352;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5210 = true;
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        if (this.f5210) {
            throw new IllegalStateException("DirectoryStream is closed");
        }
        DirectoryStream.Filter filter = this.f5208;
        return C7480.stream(this.f5211.f20121.m7180(this.f5209.f52947.substring(1))).map(new Function() { // from class: l.᩵᩶۠
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f66233.f5211.getPath("/" + ((C5738) obj).getName(), new String[0]);
            }
        }).filter(filter == null ? new C6329(0) : new C20411(0, filter)).iterator();
    }
}
