package l;

import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19512 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f63053;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f63054;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63055;

    public C19512(ViewOnClickListenerC21628 viewOnClickListenerC21628, String str, HashSet hashSet) {
        this.f63054 = viewOnClickListenerC21628;
        this.f63055 = str;
        this.f63053 = hashSet;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267((AbstractActivityC3346) this.f63054.requireActivity(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C8918 c8918 = new C8918(this.f63055);
        try {
            C13533 c13533 = new C13533(new BufferedOutputStream(c8918.m23007()));
            for (String str : this.f63053) {
                c8918.m23012(str + ".xml");
                c13533.write(this.f63054.f69432.m44856(str));
                c13533.flush();
            }
            c8918.close();
        } catch (Throwable th) {
            try {
                c8918.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
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
        this.f63054.f69427.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
