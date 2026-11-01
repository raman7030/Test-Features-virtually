package p067l;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* JADX INFO: renamed from: l.᩹ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23632 implements InterfaceC21426 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserDefinedFileAttributeView f75244a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.f75244a;
        if (obj instanceof C23632) {
            obj = ((C23632) obj).f75244a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f75244a.hashCode();
    }

    @Override // p067l.InterfaceC24107
    public final /* synthetic */ String name() {
        return this.f75244a.name();
    }
}
