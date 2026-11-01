package p067l;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* JADX INFO: renamed from: l.ܳܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16255 implements InterfaceC22767 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DosFileAttributeView f47815a;

    public /* synthetic */ C16255(DosFileAttributeView dosFileAttributeView) {
        this.f47815a = dosFileAttributeView;
    }

    @Override // p067l.InterfaceC18267
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo21481a(C6673 c6673, C6673 c6674, C6673 c6675) throws IOException {
        this.f47815a.setTimes(AbstractC24029.m53246o(c6673), AbstractC24029.m53246o(c6674), AbstractC24029.m53246o(c6675));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.f47815a;
        if (obj instanceof C16255) {
            obj = ((C16255) obj).f47815a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f47815a.hashCode();
    }

    @Override // p067l.InterfaceC24107
    public final /* synthetic */ String name() {
        return this.f47815a.name();
    }

    @Override // p067l.InterfaceC22767, p067l.InterfaceC18267
    public final /* synthetic */ C8880 readAttributes() throws IOException {
        DosFileAttributes attributes = this.f47815a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return new C8880(attributes);
    }

    @Override // p067l.InterfaceC18267
    public final /* synthetic */ InterfaceC16730 readAttributes() {
        return C19609.m44513a(this.f47815a.readAttributes());
    }

    @Override // p067l.InterfaceC22767
    public final /* synthetic */ void setArchive(boolean z) throws IOException {
        this.f47815a.setArchive(z);
    }

    @Override // p067l.InterfaceC22767
    public final /* synthetic */ void setHidden(boolean z) throws IOException {
        this.f47815a.setHidden(z);
    }

    @Override // p067l.InterfaceC22767
    public final /* synthetic */ void setReadOnly(boolean z) throws IOException {
        this.f47815a.setReadOnly(z);
    }

    @Override // p067l.InterfaceC22767
    public final /* synthetic */ void setSystem(boolean z) throws IOException {
        this.f47815a.setSystem(z);
    }
}
