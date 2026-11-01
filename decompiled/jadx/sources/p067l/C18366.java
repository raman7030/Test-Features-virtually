package p067l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܽᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18366 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f54852;

    /* JADX INFO: renamed from: ۜ */
    public boolean f54853;

    /* JADX INFO: renamed from: ۢ */
    public final C14146 f54854;

    /* JADX INFO: renamed from: ۧ */
    public final C23631 f54855;

    /* JADX INFO: renamed from: ܳ */
    public boolean f54856;

    /* JADX INFO: renamed from: ᩳ */
    public final C13693 f54859;

    /* JADX INFO: renamed from: ᩻ */
    public final int f54861;

    /* JADX INFO: renamed from: ܽ */
    public final Handler f54857 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᩷ */
    public final RunnableC9237 f54860 = new Runnable() { // from class: l.۟ۘᩳ
        @Override // java.lang.Runnable
        public final void run() {
            C18366.m41844(this.f25010);
        }
    };

    /* JADX INFO: renamed from: ܿ */
    public long f54858 = -1;

    /* JADX WARN: Type inference failed for: r0v1, types: [l.۟ۘᩳ] */
    public C18366(C23631 c23631, C13693 c13693, int i) {
        this.f54855 = c23631;
        this.f54859 = c13693;
        this.f54854 = c23631.f75242;
        this.f54861 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41847() {
        this.f54857.postDelayed(this.f54860, 2000L);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41848() {
        this.f54853 = true;
        this.f54857.removeCallbacks(this.f54860);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41844(final C18366 c18366) {
        C14146 c14146 = c18366.f54854;
        C13693 c13693 = c18366.f54859;
        C23631 c23631 = c18366.f54855;
        if (c18366.f54853 || !c23631.m52570(c13693, c14146)) {
            c18366.m41848();
            return;
        }
        if (c18366.f54856 || !c14146.m32572()) {
            c18366.m41846();
            return;
        }
        try {
            C11996 c11996 = new C11996();
            C11996 c11997 = new C11996();
            c23631.f75229.m38849(c11996);
            c23631.f75229.m38842(c11997);
            c23631.f8386.putBoolean("changed", c23631.m52576(c13693.f38639.isChanged()));
            C15013 c15013M34369 = C15013.m34369(c18366.f54854, c23631.f8386, c23631.m52571(), c11996.m27464(), c11997.m27464(), c18366.f54861, c18366.f54858, c18366.f54852);
            if (c15013M34369 == null) {
                c18366.m41846();
                return;
            }
            final byte[] bArrM34378 = c15013M34369.m34378();
            final long jM34373 = c15013M34369.m34373();
            c18366.f54856 = true;
            c13693.f38631.m55042(c15013M34369).m12887(new InterfaceC9988() { // from class: l.֫ᩴᩳ
                @Override // p067l.InterfaceC9988
                /* JADX INFO: renamed from: ۧ */
                public final void mo6895(Object obj, Throwable th) {
                    long j = jM34373;
                    C18366 c18367 = this.f9519;
                    c18367.f54857.post(new Runnable() { // from class: l.ۧᩴᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18366.m41845(j, c18367, th, bArr);
                        }
                    });
                }
            });
        } catch (C5626 unused) {
            c18366.m41846();
        } catch (Exception e) {
            c23631.f8383.m48823((Throwable) e);
            c18366.m41846();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m41845(long j, C18366 c18366, Throwable th, byte[] bArr) {
        C13693 c13693 = c18366.f54859;
        C23631 c23631 = c18366.f54855;
        c18366.f54856 = false;
        if (th == null) {
            c18366.f54858 = j;
            c18366.f54852 = bArr;
        }
        if (c18366.f54853 || !c23631.m52570(c13693, c18366.f54854)) {
            return;
        }
        if (th instanceof C15154) {
            th = th.getCause();
        }
        if (th != null && !(th instanceof CancellationException)) {
            c23631.f8383.m48823(th);
        }
        if (c13693.f38631.m55044() != null) {
            c23631.f8383.m48823((Throwable) c13693.f38631.m55044());
        }
        c18366.m41846();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m41846() {
        if (this.f54853) {
            return;
        }
        this.f54857.postDelayed(this.f54860, 2000L);
    }
}
