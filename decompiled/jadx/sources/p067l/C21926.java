package p067l;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.᩷ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5GD */
/* JADX INFO: loaded from: classes5.dex */
public final class C21926 extends AbstractC18572 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f68943;

    /* JADX INFO: renamed from: ۧ */
    public final C8514 f68944;

    public C21926(InterfaceC24784 interfaceC24784, C5533 c5533) {
        this.f68943 = interfaceC24784;
        this.f68944 = C8514.m19810(c5533);
    }

    @Override // p067l.AbstractC18572
    /* JADX INFO: renamed from: ֫ */
    public final void mo42265() {
        this.f68944.m19812();
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sbM34407 = C15033.m34407(128, "LoaderManager{");
        sbM34407.append(Integer.toHexString(System.identityHashCode(this)));
        sbM34407.append(" in ");
        Object obj = this.f68943;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sbM34407.append(simpleName);
        sbM34407.append('{');
        sbM34407.append(Integer.toHexString(System.identityHashCode(obj)));
        sbM34407.append("}}");
        return sbM34407.toString();
    }

    @Override // p067l.AbstractC18572
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void mo42266(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f68944.m19811(str, fileDescriptor, printWriter, strArr);
    }
}
