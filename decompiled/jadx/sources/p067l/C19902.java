package p067l;

/* JADX INFO: renamed from: l.ᩴ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8SG */
/* JADX INFO: loaded from: classes4.dex */
public final class C19902 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f60436;

    /* JADX INFO: renamed from: ۜ */
    public long f60437;

    /* JADX INFO: renamed from: ۧ */
    public boolean f60438;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC6076 f60439;

    /* JADX INFO: renamed from: ܽ */
    public boolean f60440;

    /* JADX INFO: renamed from: ܿ */
    public long f60441;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f60442;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f60443;

    public C19902(InterfaceC6076 interfaceC6076) {
        interfaceC6076.getClass();
        this.f60439 = interfaceC6076;
        this.f60442 = true;
        this.f60441 = Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45206(long j) {
        C23877.m52957(j >= 0);
        C23877.m52960(!this.f60440);
        this.f60437 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45204(long j) {
        C23877.m52960(!this.f60440);
        this.f60441 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45208(boolean z) {
        C23877.m52960(!this.f60440);
        this.f60442 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45205(boolean z) {
        C23877.m52960(!this.f60440);
        this.f60436 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m45209(boolean z) {
        C23877.m52960(!this.f60440);
        this.f60443 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45207(boolean z) {
        C23877.m52960(!this.f60440);
        this.f60438 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7161 m45203() {
        this.f60440 = true;
        return new C7161(this);
    }
}
