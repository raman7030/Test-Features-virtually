package p067l;

import android.content.Context;
import android.view.Surface;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۖ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5090 implements InterfaceC8640, InterfaceC6431 {

    /* JADX INFO: renamed from: ֫ */
    public long f11923;

    /* JADX INFO: renamed from: ۜ */
    public AbstractC16192 f11924;

    /* JADX INFO: renamed from: ۧ */
    public C10307 f11925;

    /* JADX INFO: renamed from: ܳ */
    public Executor f11926;

    /* JADX INFO: renamed from: ܽ */
    public boolean f11927;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC18698 f11928;

    /* JADX INFO: renamed from: ᩳ */
    public long f11929;

    /* JADX INFO: renamed from: ᩷ */
    public final int f11930;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C3748 f11931;

    public C5090(C3748 c3748, Context context) {
        this.f11931 = c3748;
        this.f11930 = C5792.m13019(context) ? 1 : 5;
        this.f11924 = AbstractC16192.m36872of();
        this.f11929 = -9223372036854775807L;
        this.f11928 = InterfaceC18698.f55838;
        this.f11926 = C3748.f7940;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۢ */
    public final void mo10832() {
        C3748 c3748 = this.f11931;
        if (c3748.f7954) {
            c3748.m7233();
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10840() {
        C3748 c3748 = this.f11931;
        if (c3748.f7954) {
            c3748.m7231();
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10825(InterfaceC18698 interfaceC18698, Executor executor) {
        this.f11928 = interfaceC18698;
        this.f11926 = executor;
    }

    @Override // p067l.InterfaceC8640
    public final boolean isInitialized() {
        return this.f11927;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10824(C10307 c10307, long j, int i, List list) {
        C23877.m52960(this.f11927);
        this.f11924 = AbstractC16192.copyOf((Collection) list);
        this.f11925 = c10307;
        C3748 c3748 = this.f11931;
        c3748.f7951 = -9223372036854775807L;
        c3748.f7947 = false;
        m10815(c10307);
        boolean z = this.f11929 == -9223372036854775807L;
        if (c3748.f7954 || z) {
            long j2 = z ? -4611686018427387904L : this.f11929 + 1;
            c3748.f7944.m49349(j2, new C7772(j + this.f11923, i, j2));
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10827(long j, InterfaceC16015 interfaceC16015) {
        C23877.m52960(this.f11927);
        C3748 c3748 = this.f11931;
        if (!C3748.m7214(c3748)) {
            return false;
        }
        InterfaceC24547 interfaceC24547M7227 = C3748.m7227(c3748);
        interfaceC24547M7227.getClass();
        if (interfaceC24547M7227.m54138() >= this.f11930) {
            return false;
        }
        InterfaceC24547 interfaceC24547M7228 = C3748.m7227(c3748);
        interfaceC24547M7228.getClass();
        if (!interfaceC24547M7228.m54143()) {
            return false;
        }
        long j2 = j + this.f11923;
        this.f11929 = j2;
        ((C9524) interfaceC16015).mo22193(j2 * 1000);
        return true;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10828(C10307 c10307) throws C24733 {
        C23877.m52960(!this.f11927);
        C3748.m7212(this.f11931, c10307);
        this.f11927 = true;
        return true;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10829(boolean z) {
        return C3748.m7218(this.f11931, z && this.f11927);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۧ */
    public final void mo10833(boolean z) {
        boolean z2 = this.f11927;
        C3748 c3748 = this.f11931;
        if (z2) {
            InterfaceC24547 interfaceC24547M7227 = C3748.m7227(c3748);
            interfaceC24547M7227.getClass();
            interfaceC24547M7227.flush();
        }
        this.f11929 = -9223372036854775807L;
        C3748.m7211(c3748, z);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo10834() {
        return this.f11927 && C3748.m7215(this.f11931);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ܿ */
    public final Surface mo10838() {
        C23877.m52960(this.f11927);
        InterfaceC24547 interfaceC24547M7227 = C3748.m7227(this.f11931);
        interfaceC24547M7227.getClass();
        return interfaceC24547M7227.m54141();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10839() {
        if (this.f11927) {
            C3748 c3748 = this.f11931;
            long j = c3748.f7949;
            C3748.m7211(c3748, false);
            InterfaceC24547 interfaceC24547M7227 = C3748.m7227(c3748);
            interfaceC24547M7227.getClass();
            interfaceC24547M7227.m54142();
            c3748.f7949 = j;
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ᩻ */
    public final void mo10841() {
        long j = this.f11929;
        C3748 c3748 = this.f11931;
        c3748.f7951 = j;
        if (c3748.f7949 >= c3748.f7951) {
            C3748.m7220(c3748);
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۜ */
    public final void mo10830() {
        C3748 c3748 = this.f11931;
        if (c3748.f7944.m49352() == 0) {
            C3748.m7225(c3748);
            return;
        }
        C21886 c21886 = new C21886();
        boolean z = true;
        while (c3748.f7944.m49352() > 0) {
            C7772 c7772 = (C7772) c3748.f7944.m49350();
            c7772.getClass();
            if (z) {
                int i = c7772.f20388;
                if (i == 0 || i == 1) {
                    c7772 = new C7772(c7772.f20390, 0, c7772.f20389);
                } else {
                    C3748.m7225(c3748);
                }
                z = false;
            }
            c21886.m49349(c7772.f20389, c7772);
        }
        c3748.f7944 = c21886;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10826(InterfaceC23865 interfaceC23865) {
        C3748.m7210(this.f11931, interfaceC23865);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10817(float f) {
        C3748.m7205(this.f11931, f);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10822(List list) {
        if (this.f11924.equals(list)) {
            return;
        }
        this.f11924 = AbstractC16192.copyOf((Collection) list);
        C10307 c10307 = this.f11925;
        if (c10307 != null) {
            m10815(c10307);
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10819(long j) {
        this.f11923 = j;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10821(Surface surface, C18532 c18532) {
        this.f11931.m7229(surface, c18532);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۡ */
    public final void mo10831() {
        this.f11931.m7228();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10818(int i) {
        C3748.m7206(this.f11931, i);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10820(long j, long j2) {
        C3748.m7208(this.f11931, j + this.f11923, j2);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ܽ */
    public final void mo10837(boolean z) {
        C3748 c3748 = this.f11931;
        if (c3748.f7954) {
            C3748.m7222(c3748, z);
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10816() {
        this.f11931.m7232();
    }

    @Override // p067l.InterfaceC6431
    /* JADX INFO: renamed from: ܽ */
    public final void mo10836() {
        InterfaceC18698 interfaceC18698 = this.f11928;
        Executor executor = this.f11926;
        C12826.requireNonNull(interfaceC18698);
        executor.execute(new RunnableC12405(1, interfaceC18698));
    }

    @Override // p067l.InterfaceC6431
    /* JADX INFO: renamed from: ܳ */
    public final void mo10835() {
        final InterfaceC18698 interfaceC18698 = this.f11928;
        Executor executor = this.f11926;
        C12826.requireNonNull(interfaceC18698);
        executor.execute(new Runnable() { // from class: l.ۡ᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC18698.mo27044();
            }
        });
    }

    @Override // p067l.InterfaceC6431
    /* JADX INFO: renamed from: ֫ */
    public final void mo10823(final C8454 c8454) {
        final InterfaceC18698 interfaceC18698 = this.f11928;
        this.f11926.execute(new Runnable() { // from class: l.ܺ᩻ۧ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC18698.mo27043(c8454);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    private void m10815(C10307 c10307) {
        C3601 c3601M23918 = c10307.m23918();
        C22378 c22378 = c10307.f28551;
        if (c22378 == null || !c22378.m50230()) {
            c22378 = C22378.f70597;
        }
        c3601M23918.m6680(c22378);
        c3601M23918.m6672();
        InterfaceC24547 interfaceC24547M7227 = C3748.m7227(this.f11931);
        interfaceC24547M7227.getClass();
        interfaceC24547M7227.m54137();
    }
}
