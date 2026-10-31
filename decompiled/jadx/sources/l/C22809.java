package l;

import bin.mt.function.ar.ActivityRecordService;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩺ۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes.dex */
public class C22809 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f73646;

    public C22809(C14507 c14507) {
        this.f73646 = new WeakReference(c14507);
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            C14507 c14507 = (C14507) this.f73646.get();
            if (c14507 != null) {
                C14507.m34664(c14507);
            }
            interfaceC23586.getLifecycle().mo19834(this);
            return;
        }
        if (enumC22901 == EnumC22901.ON_RESUME) {
            C14507 c14508 = (C14507) this.f73646.get();
            if (c14508 == null) {
                interfaceC23586.getLifecycle().mo19834(this);
                return;
            }
            DialogInterfaceC0206 dialogInterfaceC0206 = c14508.f44487;
            if (!dialogInterfaceC0206.m1442()) {
                interfaceC23586.getLifecycle().mo19834(this);
                return;
            }
            dialogInterfaceC0206.m1447().setText((ActivityRecordService.m47() && ActivityRecordService.m46()) ? R.string.MT_Protector : R.string.MT_Protector);
            ((ArrayList) c14508.f44484).clear();
            LinkedList linkedList = ActivityRecordService.f16;
            synchronized (linkedList) {
                ((ArrayList) c14508.f44484).addAll(linkedList);
            }
            c14508.f44485.notifyDataSetChanged();
        }
    }
}
