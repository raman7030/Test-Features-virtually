package p067l;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18642 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public List f55649;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC23336 f55650;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f55651;

    /* JADX INFO: renamed from: ᩷ */
    public List f55652;

    /* JADX INFO: renamed from: ᩻ */
    public C18639 f55653;

    public C18642(ActivityC23336 activityC23336) {
        this.f55650 = activityC23336;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f55650.f73411.m32018(true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f55652 = C10792.m24866();
        this.f55649 = (List) C7480.stream(C17853.m40542().m38684("keystore").mo25500(true)).filter(new C17971()).sorted(new C7716(1)).collect(C24205.toUnmodifiableList());
        ActivityC23336 activityC23336 = this.f55650;
        List list = activityC23336.f73417;
        ArrayList arrayList = new ArrayList();
        arrayList.add("h1");
        if (this.f55652.isEmpty()) {
            arrayList.add("e1");
        } else {
            for (AbstractC14973 abstractC14973 : this.f55652) {
                if (abstractC14973.mo15884().equals(activityC23336.f73421)) {
                    arrayList.add("k" + abstractC14973.mo12362() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("k" + abstractC14973.mo12362());
                }
            }
        }
        arrayList.add("h2");
        if (this.f55649.isEmpty()) {
            arrayList.add("e2");
        } else {
            for (AbstractC17043 abstractC17043 : this.f55649) {
                if (abstractC17043.getName().equals(activityC23336.f73412)) {
                    arrayList.add("f" + abstractC17043.getName() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("f" + abstractC17043.getName());
                }
            }
        }
        this.f55651 = arrayList;
        if (activityC23336.f73418 == null || list.isEmpty()) {
            return;
        }
        this.f55653 = C21993.m49555(new C19313(list, arrayList));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        List list = this.f55652;
        ActivityC23336 activityC23336 = this.f55650;
        activityC23336.f73419 = list;
        activityC23336.f73416 = this.f55649;
        activityC23336.f73417 = this.f55651;
        if (activityC23336.f73418 != null) {
            activityC23336.f73418.m54329();
            C18639 c18639 = this.f55653;
            if (c18639 != null) {
                c18639.m42393(activityC23336.f73418);
            } else {
                activityC23336.f73418.notifyDataSetChanged();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f55650.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f55650.f73411.m32018(false);
    }
}
