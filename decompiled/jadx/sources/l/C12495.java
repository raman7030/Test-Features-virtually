package l;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: renamed from: l.۫ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12495 extends AbstractC13494 {
    public final /* synthetic */ FileStore a;

    @Override // l.AbstractC13494
    public final /* synthetic */ Object a(String str) {
        return this.a.getAttribute(str);
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ long b() {
        return this.a.getBlockSize();
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ C0500 c(Class cls) {
        FileStoreAttributeView fileStoreAttributeView = this.a.getFileStoreAttributeView(cls);
        if (fileStoreAttributeView == null) {
            return null;
        }
        return new C0500(fileStoreAttributeView);
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ long d() {
        return this.a.getTotalSpace();
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ long e() {
        return this.a.getUnallocatedSpace();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.a;
        if (obj instanceof C12495) {
            obj = ((C12495) obj).a;
        }
        return fileStore.equals(obj);
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ boolean f() {
        return this.a.isReadOnly();
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ String g() {
        return this.a.name();
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ long getUsableSpace() {
        return this.a.getUsableSpace();
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ boolean h(Class cls) {
        return this.a.supportsFileAttributeView(AbstractC22791.q(cls));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ boolean i(String str) {
        return this.a.supportsFileAttributeView(str);
    }

    @Override // l.AbstractC13494
    public final /* synthetic */ String j() {
        return this.a.type();
    }

    public C12495(FileStore fileStore) {
        this.a = fileStore;
    }
}
