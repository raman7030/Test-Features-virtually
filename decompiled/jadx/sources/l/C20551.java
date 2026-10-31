package l;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20551 implements Iterator {
    public final DirectoryStream.Filter a;
    public final File[] b;
    public int c = 0;
    public final /* synthetic */ C9262 d;

    public C20551(C9262 c9262, InterfaceC20758 interfaceC20758, DirectoryStream.Filter filter) {
        this.d = c9262;
        File[] fileArrListFiles = interfaceC20758.toFile().listFiles();
        this.b = fileArrListFiles == null ? new File[0] : fileArrListFiles;
        this.a = filter;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (next() == null) {
            return false;
        }
        this.c--;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C15610 next() {
        C15610 c15610;
        do {
            int i = this.c;
            File[] fileArr = this.b;
            if (i >= fileArr.length) {
                return null;
            }
            this.c = i + 1;
            File file = fileArr[i];
            C14199 c14199 = this.d.g;
            String path = file.getPath();
            C9262 c9262 = this.d;
            c15610 = new C15610(c14199, path, c9262.e, c9262.f);
            try {
            } catch (IOException e) {
                throw new DirectoryIteratorException(e);
            }
        } while (!this.a.mo39985accept(c15610));
        return c15610;
    }
}
