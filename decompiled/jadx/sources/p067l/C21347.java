package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩶ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21347 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC17874 f67299;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ LinkedList f67300;

    public C21347(ActivityC17874 activityC17874, LinkedList linkedList) {
        this.f67299 = activityC17874;
        this.f67300 = linkedList;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f67299, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        while (true) {
            LinkedList linkedList = this.f67300;
            if (linkedList.isEmpty()) {
                return;
            }
            InterfaceC17282 interfaceC17282 = (InterfaceC17282) linkedList.peek();
            C12826.requireNonNull(interfaceC17282);
            this.f26234.m33953(this.f67299.getString(R.string.MT_Protector) + " " + interfaceC17282.getTitle());
            interfaceC17282.mo38503();
            linkedList.pop();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        LinkedList linkedList = this.f67300;
        InterfaceC17282 interfaceC17282 = linkedList.isEmpty() ? null : (InterfaceC17282) linkedList.peek();
        if (interfaceC17282 == null) {
            this.f67299.m12259(exc, (DialogInterface.OnDismissListener) null);
        } else {
            interfaceC17282.mo38502(exc);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f67299.m40665();
        m22249();
    }
}
