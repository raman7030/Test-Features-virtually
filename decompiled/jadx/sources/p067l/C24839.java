package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩻ۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24839 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Runnable f79334;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC18686 f79335;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ LinkedList f79336;

    public C24839(ActivityC18686 activityC18686, LinkedList linkedList, Runnable runnable) {
        this.f79335 = activityC18686;
        this.f79336 = linkedList;
        this.f79334 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f79335, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        while (true) {
            LinkedList linkedList = this.f79336;
            if (linkedList.isEmpty()) {
                return;
            }
            InterfaceC7482 interfaceC7482 = (InterfaceC7482) linkedList.peek();
            C12826.requireNonNull(interfaceC7482);
            this.f26234.m33953(this.f79335.getString(R.string.MT_Protector) + " " + interfaceC7482.getTitle());
            interfaceC7482.mo5357();
            linkedList.pop();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        Runnable runnable = this.f79334;
        if (runnable != null) {
            C7050.m16212(runnable);
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        LinkedList linkedList = this.f79336;
        InterfaceC7482 interfaceC7482 = linkedList.isEmpty() ? null : (InterfaceC7482) linkedList.peek();
        if (interfaceC7482 != null) {
            exc = interfaceC7482.mo5356(exc);
        }
        if (exc != null) {
            ActivityC18686 activityC18686 = this.f79335;
            activityC18686.m12259(exc, (DialogInterface.OnDismissListener) null);
            if (exc instanceof C4063) {
                C4063 c4063 = (C4063) exc;
                C20699 c20699M46760 = C20699.m46760(c4063.f8934, c4063.f8935);
                c20699M46760.f63908 = false;
                activityC18686.m42588(c4063.m8130(), c20699M46760);
                C14121 c14121 = activityC18686.f55787;
                C12826.requireNonNull(c14121);
                c14121.m32087(c4063.m8130());
                return;
            }
            if (exc instanceof C7760) {
                C7760 c7760 = (C7760) exc;
                C20699 c20699M46761 = C20699.m46760(c7760.f20361, c7760.f20360);
                c20699M46761.f63908 = false;
                activityC18686.m42599(c7760.m17914(), c20699M46761);
                C20856 c20856 = activityC18686.f55802;
                C12826.requireNonNull(c20856);
                c20856.m47114(c7760.m17914());
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f79335.m42592();
        m22249();
    }
}
