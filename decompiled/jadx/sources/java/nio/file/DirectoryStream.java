package java.nio.file;

import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface DirectoryStream<T> extends Closeable, Iterable<T> {

    /* JADX INFO: compiled from: N673 */
    public interface Filter<T> {
        /* JADX INFO: renamed from: accept */
        boolean mo39985accept(T t);
    }

    @Override // java.lang.Iterable
    Iterator<T> iterator();
}
