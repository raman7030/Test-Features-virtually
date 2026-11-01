package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C9621 extends C16996 {

    /* JADX INFO: renamed from: ܳ */
    public C4848 f26491;

    /* JADX INFO: renamed from: ܿ */
    public boolean f26492;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C12955 f26493;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9621(C12955 c12955, C15828 c15828, C4848 c4848) {
        super(c12955, c15828);
        this.f26493 = c12955;
        this.f26491 = c4848;
        this.f26492 = C7480.stream(c15828.m35943()).anyMatch(new C19051(1));
    }

    @Override // p067l.C16996, p067l.InterfaceC23033
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 mo22403() {
        C12955 c12955;
        if (this.f50257 == null) {
            C20271 c20271 = new C20271();
            C4848 c4848 = this.f26491;
            C11281 c11281 = (C11281) c4848.last();
            Iterator it = c4848.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c12955 = this.f26493;
                if (!zHasNext) {
                    break;
                }
                C11281 c11282 = (C11281) it.next();
                c20271.m45777((c11282 == c11281 && this.f26492) ? c12955.f36442.m19455(c11282.f31438.f20406) : c11282.f31438.f20406);
            }
            this.f50257 = new C12497(c20271.m45783(), c12955.f36440.f69183, C4848.m10283(), c12955.f36440.f69163);
        }
        return this.f50257;
    }

    @Override // p067l.C16996, p067l.InterfaceC23033
    /* JADX INFO: renamed from: ᩳ */
    public final C5771 mo22405() {
        C5771 c5771Mo22405 = super.mo22405();
        c5771Mo22405.f20409 |= 2251868533161984L;
        C20271 c20271 = new C20271();
        C4848<C11281> c4848 = this.f26491;
        C11281 c11281 = (C11281) c4848.last();
        for (C11281 c11282 : c4848) {
            c20271.m45777(new C13818(((c11282 == c11281 && this.f26492) ? 17179869184L : 0L) | 2305843017820405760L, c11282.f31433, c11282.f31438.f20406, c5771Mo22405));
        }
        c5771Mo22405.f14172 = c20271.m45783();
        c5771Mo22405.f20409 |= 2305843009213693952L;
        return c5771Mo22405;
    }

    @Override // p067l.C16996, p067l.InterfaceC23033
    /* JADX INFO: renamed from: ֫ */
    public final C10471 mo22404(C10471 c10471) {
        C4848 c4848M48354;
        C4848 c4848 = this.f26491;
        for (C11281 c11281 : c10471.f28963) {
            C22536 c22536M35935 = ((C15828) this.f50258).m35935(c11281.f31438);
            C18537 c18537 = this.f26493.f36425;
            c18537.f55352 = c11281.f18924;
            C21339 c21339 = new C21339(c18537);
            C4436 c4436 = c11281.f31435;
            if (!c22536M35935.m50507().isEmpty()) {
                c4848M48354 = c21339.m48354((Object) null, c22536M35935.m50507());
            } else {
                c4848M48354 = C4848.m10283();
            }
            c4436.f9953 = c4848M48354;
            c11281.f31437 = (AbstractC14355) c21339.mo10751(((C11281) c4848.f11034).f31437, (Object) null);
            c4848 = c4848.f11035;
        }
        return c10471;
    }
}
