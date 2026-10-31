package l;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: renamed from: l.ۛܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6145 extends FileStore {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ AbstractC13494 a;

    public /* synthetic */ C6145(AbstractC13494 abstractC13494) {
        this.a = abstractC13494;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC13494 abstractC13494 = this.a;
        if (obj instanceof C6145) {
            obj = ((C6145) obj).a;
        }
        return abstractC13494.equals(obj);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ Object getAttribute(String str) {
        return this.a.a(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getBlockSize() {
        return this.a.b();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ FileStoreAttributeView getFileStoreAttributeView(Class cls) {
        C0500 c0500C = this.a.c(cls);
        if (c0500C == null) {
            return null;
        }
        return c0500C.a;
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getTotalSpace() {
        return this.a.d();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUnallocatedSpace() {
        return this.a.e();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUsableSpace() {
        return this.a.getUsableSpace();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.f();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String name() {
        return this.a.g();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(Class cls) {
        return this.a.h(AbstractC22791.q(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(String str) {
        return this.a.i(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String type() {
        return this.a.j();
    }
}
