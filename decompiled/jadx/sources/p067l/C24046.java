package p067l;

import bin.p000mt.function.p001ar.ActivityRecordService;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩺ۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes.dex */
public class C24046 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final WeakReference f76376;

    public C24046(C16156 c16156) {
        this.f76376 = new WeakReference(c16156);
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_DESTROY) {
            C16156 c16156 = (C16156) this.f76376.get();
            if (c16156 != null) {
                C16156.m36805(c16156);
            }
            interfaceC24784.getLifecycle().mo21807(this);
            return;
        }
        if (enumC24133 == EnumC24133.ON_RESUME) {
            C16156 c16157 = (C16156) this.f76376.get();
            if (c16157 == null) {
                interfaceC24784.getLifecycle().mo21807(this);
                return;
            }
            DialogInterfaceC2564 dialogInterfaceC2564 = c16157.f47588;
            if (!dialogInterfaceC2564.m3855()) {
                interfaceC24784.getLifecycle().mo21807(this);
                return;
            }
            dialogInterfaceC2564.m3860().setText((ActivityRecordService.m47() && ActivityRecordService.m46()) ? R.string.MT_Protector : R.string.MT_Protector);
            ((ArrayList) c16157.f47585).clear();
            LinkedList linkedList = ActivityRecordService.f16;
            synchronized (linkedList) {
                ((ArrayList) c16157.f47585).addAll(linkedList);
            }
            c16157.f47586.notifyDataSetChanged();
        }
    }
}
