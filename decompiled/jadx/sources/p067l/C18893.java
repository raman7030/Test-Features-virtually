package p067l;

import bin.p000mt.plus.Main;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܿܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18893 implements InterfaceC17068 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C17551 f56400;

    /* JADX INFO: renamed from: ۙ */
    public List f56401;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ boolean[] f56402;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ long f56403;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C19561 f56404;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ long f56405;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C5738 f56406;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f56407;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f56408;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f56409;

    public C18893(C17551 c17551, long j, long j2, C19561 c19561, boolean[] zArr, C5738 c5738) {
        this.f56400 = c17551;
        this.f56405 = j;
        this.f56403 = j2;
        this.f56404 = c19561;
        this.f56402 = zArr;
        this.f56406 = c5738;
    }

    @Override // p067l.InterfaceC17068
    /* JADX INFO: renamed from: ֫ */
    public final void mo18281(long j, long j2) {
        C17551 c17551 = this.f56400;
        c17551.m52470(j, j2);
        c17551.m13477(this.f56405 + j, this.f56403);
    }

    @Override // p067l.InterfaceC17068
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo18283() {
        C19561 c19561 = this.f56404;
        if (!c19561.m44472()) {
            this.f56409 = false;
            this.f56407 = false;
            return true;
        }
        this.f56402[0] = true;
        C5738 c5738 = this.f56406;
        if (C23775.m52847(c5738)) {
            if (this.f56401 == null) {
                this.f56401 = C23775.m52840(c19561, c5738, this);
            }
            this.f56409 = false;
            C13848 c13848 = new C13848((Main) null, c19561);
            c13848.m31525(new BooleanSupplier() { // from class: l.ᩳܰܳ
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    return this.f59556.f56400.mo3924();
                }
            });
            boolean zM31527 = c13848.m31527(this.f56401);
            this.f56407 = zM31527;
            return zM31527;
        }
        if (this.f56408 == null) {
            this.f56408 = C12248.m28245();
        }
        if (this.f56408.hasNext()) {
            c19561.m44451((String) this.f56408.next());
            this.f56409 = true;
            this.f56407 = false;
            return true;
        }
        this.f56409 = false;
        boolean zM31526 = new C13848((Main) null, c19561).m31526();
        this.f56407 = zM31526;
        return zM31526;
    }

    @Override // p067l.InterfaceC17068
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo18284() {
        return this.f56409;
    }

    @Override // p067l.InterfaceC17068
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo18282() {
        return this.f56407;
    }

    @Override // p067l.InterfaceC17068
    public final void cancel() {
        this.f56400.cancel();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f56400.mo3924();
    }
}
