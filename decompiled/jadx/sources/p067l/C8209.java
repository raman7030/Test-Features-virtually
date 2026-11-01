package p067l;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: renamed from: l.ۛܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8209 extends FileStore {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f21779b = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC15193 f21780a;

    public /* synthetic */ C8209(AbstractC15193 abstractC15193) {
        this.f21780a = abstractC15193;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC15193 abstractC15193 = this.f21780a;
        if (obj instanceof C8209) {
            obj = ((C8209) obj).f21780a;
        }
        return abstractC15193.equals(obj);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ Object getAttribute(String str) {
        return this.f21780a.mo32728a(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getBlockSize() {
        return this.f21780a.mo32729b();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ FileStoreAttributeView getFileStoreAttributeView(Class cls) {
        C2844 c2844Mo32730c = this.f21780a.mo32730c(cls);
        if (c2844Mo32730c == null) {
            return null;
        }
        return c2844Mo32730c.f4902a;
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getTotalSpace() {
        return this.f21780a.mo32731d();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUnallocatedSpace() {
        return this.f21780a.mo32732e();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUsableSpace() {
        return this.f21780a.getUsableSpace();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21780a.hashCode();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean isReadOnly() {
        return this.f21780a.mo32733f();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String name() {
        return this.f21780a.mo32734g();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(Class cls) {
        return this.f21780a.mo32735h(AbstractC24029.m53248q(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(String str) {
        return this.f21780a.mo32736i(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String type() {
        return this.f21780a.mo32737j();
    }
}
