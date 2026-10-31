package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.᩶ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19969 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f64659;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedList f64660;

    public C19969(ActivityC16315 activityC16315, LinkedList linkedList) {
        this.f64659 = activityC16315;
        this.f64660 = linkedList;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f64659, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        while (true) {
            LinkedList linkedList = this.f64660;
            if (linkedList.isEmpty()) {
                return;
            }
            InterfaceC15692 interfaceC15692 = (InterfaceC15692) linkedList.peek();
            C11003.requireNonNull(interfaceC15692);
            this.f23322.m31861(this.f64659.getString(R.string.MT_Protector) + " " + interfaceC15692.getTitle());
            interfaceC15692.mo36341();
            linkedList.pop();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        LinkedList linkedList = this.f64660;
        InterfaceC15692 interfaceC15692 = linkedList.isEmpty() ? null : (InterfaceC15692) linkedList.peek();
        if (interfaceC15692 == null) {
            this.f64659.m10223(exc, (DialogInterface.OnDismissListener) null);
        } else {
            interfaceC15692.mo36340(exc);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f64659.m38450();
        m20273();
    }
}
