package l;

import android.content.Context;
import android.view.Surface;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۖ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2863 implements InterfaceC6599, InterfaceC4274 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f9123;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f9124;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8353 f9125;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Executor f9126;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f9127;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC17182 f9128;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f9129;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f9130;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1451 f9131;

    public C2863(C1451 c1451, Context context) {
        this.f9131 = c1451;
        this.f9130 = C3603.m11043(context) ? 1 : 5;
        this.f9124 = AbstractC14545.of();
        this.f9129 = -9223372036854775807L;
        this.f9128 = InterfaceC17182.f52657;
        this.f9126 = C1451.f5167;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo8765() {
        C1451 c1451 = this.f9131;
        if (c1451.f5181) {
            c1451.m4990();
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8773() {
        C1451 c1451 = this.f9131;
        if (c1451.f5181) {
            c1451.m4988();
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8758(InterfaceC17182 interfaceC17182, Executor executor) {
        this.f9128 = interfaceC17182;
        this.f9126 = executor;
    }

    @Override // l.InterfaceC6599
    public final boolean isInitialized() {
        return this.f9127;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8757(C8353 c8353, long j, int i, List list) {
        C22632.m50634(this.f9127);
        this.f9124 = AbstractC14545.copyOf((Collection) list);
        this.f9125 = c8353;
        C1451 c1451 = this.f9131;
        c1451.f5178 = -9223372036854775807L;
        c1451.f5174 = false;
        m8748(c8353);
        boolean z = this.f9129 == -9223372036854775807L;
        if (c1451.f5181 || z) {
            long j2 = z ? -4611686018427387904L : this.f9129 + 1;
            c1451.f5171.m47026(j2, new C5685(j + this.f9123, i, j2));
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8760(long j, InterfaceC14359 interfaceC14359) {
        C22632.m50634(this.f9127);
        C1451 c1451 = this.f9131;
        if (!C1451.m4971(c1451)) {
            return false;
        }
        InterfaceC23337 interfaceC23337M4984 = C1451.m4984(c1451);
        interfaceC23337M4984.getClass();
        if (interfaceC23337M4984.m51741() >= this.f9130) {
            return false;
        }
        InterfaceC23337 interfaceC23337M4985 = C1451.m4984(c1451);
        interfaceC23337M4985.getClass();
        if (!interfaceC23337M4985.m51746()) {
            return false;
        }
        long j2 = j + this.f9123;
        this.f9129 = j2;
        ((C7529) interfaceC14359).mo20217(j2 * 1000);
        return true;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8761(C8353 c8353) throws C23532 {
        C22632.m50634(!this.f9127);
        C1451.m4969(this.f9131, c8353);
        this.f9127 = true;
        return true;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8762(boolean z) {
        return C1451.m4975(this.f9131, z && this.f9127);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo8766(boolean z) {
        boolean z2 = this.f9127;
        C1451 c1451 = this.f9131;
        if (z2) {
            InterfaceC23337 interfaceC23337M4984 = C1451.m4984(c1451);
            interfaceC23337M4984.getClass();
            interfaceC23337M4984.flush();
        }
        this.f9129 = -9223372036854775807L;
        C1451.m4968(c1451, z);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo8767() {
        return this.f9127 && C1451.m4972(this.f9131);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Surface mo8771() {
        C22632.m50634(this.f9127);
        InterfaceC23337 interfaceC23337M4984 = C1451.m4984(this.f9131);
        interfaceC23337M4984.getClass();
        return interfaceC23337M4984.m51744();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo8772() {
        if (this.f9127) {
            C1451 c1451 = this.f9131;
            long j = c1451.f5176;
            C1451.m4968(c1451, false);
            InterfaceC23337 interfaceC23337M4984 = C1451.m4984(c1451);
            interfaceC23337M4984.getClass();
            interfaceC23337M4984.m51745();
            c1451.f5176 = j;
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo8774() {
        long j = this.f9129;
        C1451 c1451 = this.f9131;
        c1451.f5178 = j;
        if (c1451.f5176 >= c1451.f5178) {
            C1451.m4977(c1451);
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo8763() {
        C1451 c1451 = this.f9131;
        if (c1451.f5171.m47029() == 0) {
            C1451.m4982(c1451);
            return;
        }
        C20537 c20537 = new C20537();
        boolean z = true;
        while (c1451.f5171.m47029() > 0) {
            C5685 c5685 = (C5685) c1451.f5171.m47027();
            c5685.getClass();
            if (z) {
                int i = c5685.f17541;
                if (i == 0 || i == 1) {
                    c5685 = new C5685(c5685.f17543, 0, c5685.f17542);
                } else {
                    C1451.m4982(c1451);
                }
                z = false;
            }
            c20537.m47026(c5685.f17542, c5685);
        }
        c1451.f5171 = c20537;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8759(InterfaceC22618 interfaceC22618) {
        C1451.m4967(this.f9131, interfaceC22618);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8750(float f) {
        C1451.m4962(this.f9131, f);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8755(List list) {
        if (this.f9124.equals(list)) {
            return;
        }
        this.f9124 = AbstractC14545.copyOf((Collection) list);
        C8353 c8353 = this.f9125;
        if (c8353 != null) {
            m8748(c8353);
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8752(long j) {
        this.f9123 = j;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8754(Surface surface, C17008 c17008) {
        this.f9131.m4986(surface, c17008);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo8764() {
        this.f9131.m4985();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8751(int i) {
        C1451.m4963(this.f9131, i);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8753(long j, long j2) {
        C1451.m4965(this.f9131, j + this.f9123, j2);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo8770(boolean z) {
        C1451 c1451 = this.f9131;
        if (c1451.f5181) {
            C1451.m4979(c1451, z);
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8749() {
        this.f9131.m4989();
    }

    @Override // l.InterfaceC4274
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo8769() {
        InterfaceC17182 interfaceC17182 = this.f9128;
        Executor executor = this.f9126;
        C11003.requireNonNull(interfaceC17182);
        executor.execute(new RunnableC10560(1, interfaceC17182));
    }

    @Override // l.InterfaceC4274
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo8768() {
        final InterfaceC17182 interfaceC17182 = this.f9128;
        Executor executor = this.f9126;
        C11003.requireNonNull(interfaceC17182);
        executor.execute(new Runnable() { // from class: l.ۡ᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC17182.mo25027();
            }
        });
    }

    @Override // l.InterfaceC4274
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8756(final C6404 c6404) {
        final InterfaceC17182 interfaceC17182 = this.f9128;
        this.f9126.execute(new Runnable() { // from class: l.ܺ᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC17182.mo25026(c6404);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8748(C8353 c8353) {
        C1297 c1297M21948 = c8353.m21948();
        C21054 c21054 = c8353.f25637;
        if (c21054 == null || !c21054.m47900()) {
            c21054 = C21054.f67913;
        }
        c1297M21948.m4448(c21054);
        c1297M21948.m4440();
        InterfaceC23337 interfaceC23337M4984 = C1451.m4984(this.f9131);
        interfaceC23337M4984.getClass();
        interfaceC23337M4984.m51740();
    }
}
