package p067l;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21900 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final DirectoryStream.Filter f68886a;

    /* JADX INFO: renamed from: b */
    public final File[] f68887b;

    /* JADX INFO: renamed from: c */
    public int f68888c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C11171 f68889d;

    public C21900(C11171 c11171, InterfaceC22097 interfaceC22097, DirectoryStream.Filter filter) {
        this.f68889d = c11171;
        File[] fileArrListFiles = interfaceC22097.toFile().listFiles();
        this.f68887b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.f68886a = filter;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.f68888c--;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C17204 next() {
        C17204 c17204;
        do {
            int i = this.f68888c;
            File[] fileArr = this.f68887b;
            if (i >= fileArr.length) {
                return null;
            }
            this.f68888c = i + 1;
            File file = fileArr[i];
            C15863 c15863 = this.f68889d.f31011g;
            String path = file.getPath();
            C11171 c11171 = this.f68889d;
            c17204 = new C17204(c15863, path, c11171.f31009e, c11171.f31010f);
            try {
            } catch (IOException e) {
                throw new DirectoryIteratorException(e);
            }
        } while (!this.f68886a.mo56507accept(c17204));
        return c17204;
    }
}
