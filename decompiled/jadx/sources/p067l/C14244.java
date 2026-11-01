package p067l;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* JADX INFO: renamed from: l.۫ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14244 extends AbstractC15193 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileStore f40557a;

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo32728a(String str) {
        return this.f40557a.getAttribute(str);
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long mo32729b() {
        return this.f40557a.getBlockSize();
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2844 mo32730c(Class cls) {
        FileStoreAttributeView fileStoreAttributeView = this.f40557a.getFileStoreAttributeView(cls);
        if (fileStoreAttributeView == null) {
            return null;
        }
        return new C2844(fileStoreAttributeView);
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long mo32731d() {
        return this.f40557a.getTotalSpace();
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long mo32732e() {
        return this.f40557a.getUnallocatedSpace();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.f40557a;
        if (obj instanceof C14244) {
            obj = ((C14244) obj).f40557a;
        }
        return fileStore.equals(obj);
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean mo32733f() {
        return this.f40557a.isReadOnly();
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String mo32734g() {
        return this.f40557a.name();
    }

    @Override // p067l.AbstractC15193
    public final /* synthetic */ long getUsableSpace() {
        return this.f40557a.getUsableSpace();
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean mo32735h(Class cls) {
        return this.f40557a.supportsFileAttributeView(AbstractC24029.m53248q(cls));
    }

    public final /* synthetic */ int hashCode() {
        return this.f40557a.hashCode();
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean mo32736i(String str) {
        return this.f40557a.supportsFileAttributeView(str);
    }

    @Override // p067l.AbstractC15193
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String mo32737j() {
        return this.f40557a.type();
    }

    public C14244(FileStore fileStore) {
        this.f40557a = fileStore;
    }
}
