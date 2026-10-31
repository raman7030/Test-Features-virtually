package l;

import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۬ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13172 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39398;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39399;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f39400;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f39401;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f39402;

    public C13172(ViewOnClickListenerC7528 viewOnClickListenerC7528, int i, HashSet hashSet, String str) {
        this.f39402 = viewOnClickListenerC7528;
        this.f39399 = i;
        this.f39401 = hashSet;
        this.f39398 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f39402;
        viewOnClickListenerC7528.f23168.m30051();
        C22933 c22933 = new C22933((AbstractActivityC3346) viewOnClickListenerC7528.requireActivity());
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f39400 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f39402;
        String str = this.f39398;
        HashSet<String> hashSet = this.f39401;
        int i = this.f39399;
        if (i == 0) {
            C19277 c19277 = new C19277(hashSet.size());
            C22933 c22933 = this.f39400;
            C11003.requireNonNull(c22933);
            c19277.m44459(new C23595(c22933));
            C8918 c8918 = new C8918(str);
            try {
                C13533 c13533 = new C13533(new BufferedOutputStream(c8918.m23007()));
                C22706 c22706 = new C22706();
                for (String str2 : hashSet) {
                    if (!this.f39400.m51053()) {
                        c19277.m44460(1);
                        c8918.m23012(str2 + ".smali");
                        C12366 c12366 = viewOnClickListenerC7528.f23168;
                        c22706.m50718();
                        c12366.m30029(str2, c22706);
                        c13533.append((CharSequence) c22706.m50717());
                        c13533.flush();
                    } else {
                        c8918.close();
                        return;
                    }
                }
                c8918.close();
                return;
            } catch (Throwable th) {
                try {
                    c8918.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i == 1) {
            C19277 c19278 = new C19277(hashSet.size());
            C22933 c22934 = this.f39400;
            C11003.requireNonNull(c22934);
            c19278.m44459(new C23595(c22934));
            C19357 c19357M44986 = null;
            for (String str3 : hashSet) {
                if (this.f39400.m51053()) {
                    return;
                }
                c19278.m44460(1);
                InterfaceC13508 interfaceC13508M30066 = viewOnClickListenerC7528.f23168.m30066(str3);
                C11003.requireNonNull(interfaceC13508M30066);
                if (c19357M44986 == null) {
                    c19357M44986 = interfaceC13508M30066.mo31673().m44986();
                }
                c19357M44986.m44606((InterfaceC8566) interfaceC13508M30066.mo31669());
                if (c19357M44986.m48536()) {
                    throw new C1637(R.string.MT_Protector);
                }
            }
            if (c19357M44986 != null) {
                c19357M44986.m48534(new C1011(C16999.m39866(str, new String[0])));
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C19277 c19279 = new C19277(hashSet.size());
        C22933 c22935 = this.f39400;
        C11003.requireNonNull(c22935);
        c19279.m44459(new C23595(c22935));
        C21473 c21473 = new C21473();
        C8918 c8919 = new C8918(str);
        try {
            for (String str4 : hashSet) {
                if (!this.f39400.m51053()) {
                    c19279.m44460(1);
                    InterfaceC13508 interfaceC13508M30067 = viewOnClickListenerC7528.f23168.m30066(str4);
                    C11003.requireNonNull(interfaceC13508M30067);
                    C19357 c19357M44987 = interfaceC13508M30067.mo31673().m44986();
                    c19357M44987.m44606((InterfaceC8566) interfaceC13508M30067.mo31669());
                    c21473.m48623();
                    c19357M44987.m48534(c21473);
                    byte[] bArrM10122 = C3310.m10119(ByteBuffer.wrap(c21473.m48622(), 0, c21473.m48625())).m10122();
                    c8919.m23012(str4 + ".class");
                    c8919.write(bArrM10122);
                } else {
                    c8919.close();
                    return;
                }
            }
            c8919.close();
        } catch (Throwable th3) {
            try {
                c8919.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f39400.m51053()) {
            C21374.m48457(R.string.MT_Protector);
            C16999.m39866(this.f39398, new String[0]).mo23552();
            return;
        }
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f39402.f23162.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f39402.f23168.m30061();
        this.f39400.m51051();
    }
}
