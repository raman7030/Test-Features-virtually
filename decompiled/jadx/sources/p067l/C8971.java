package p067l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C8971 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C3606 f24301;

    /* JADX INFO: renamed from: ۧ */
    public C3626 f24302;

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public final void mo12739(AbstractC7257 abstractC7257) {
        super.mo12739(abstractC7257);
        if (abstractC7257 != null) {
            abstractC7257.f18925 = null;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3780(final C3626 c3626) {
        if (c3626.f7517 != null) {
            if (c3626.f7516.mo23288("package-info", EnumC18398.SOURCE)) {
                c3626.f7517.f27062.m35949();
            }
            c3626.f7517.m22844();
        }
        if (c3626.f7516.mo23288("module-info", EnumC18398.SOURCE)) {
            C2417 c2417 = c3626.f7510;
            c2417.f3696 = null;
            c2417.f3705 = null;
            c2417.f3697 = null;
            c2417.f3701 = null;
            c2417.f3693 = null;
            c2417.f3689 = null;
            c2417.f20410 = new InterfaceC8453() { // from class: l.ܳᩴ۠
                @Override // p067l.InterfaceC8453
                /* JADX INFO: renamed from: ܽ */
                public final /* synthetic */ boolean mo9173() {
                    return false;
                }

                @Override // p067l.InterfaceC8453
                /* JADX INFO: renamed from: ֫ */
                public final void mo9171(AbstractC7783 abstractC7783) {
                    C5473 c5473 = this.f48028.f24301.f7430;
                    C3626 c3627 = c3626;
                    c5473.m12093(c3627.f7510.f3687, C4848.m10276of((Object) c3627));
                }
            };
            c2417.f3687.m35949();
            C15828 c15828 = c3626.f7510.f3687;
            c15828.f45850 = AbstractC15689.m35727(c15828);
        }
        c3626.f7517 = null;
        this.f24302 = c3626;
        try {
            m35992(c3626.f7509);
        } finally {
            this.f24302 = null;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        super.mo3617(c7650);
        C4848 c4848M10283 = C4848.m10283();
        C4848 c4848 = c7650.f20020;
        while (c4848.m10293() && !((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60735)) {
            c4848M10283 = c4848M10283.m10290((AbstractC7257) c4848.f11034);
            c4848 = c4848.f11035;
        }
        if (c4848.m10293() && (((C10471) c4848.f11034).f28961.f9954 & 68719476736L) != 0) {
            C4848 c4848M10290 = c4848.f11035;
            while (c4848M10283.m10293()) {
                c4848M10290 = c4848M10290.m10290((AbstractC7257) c4848M10283.f11034);
                c4848M10283 = c4848M10283.f11035;
            }
            c7650.f20020 = c4848M10290;
        }
        C15828 c15828 = c7650.f20027;
        if (c15828 != null) {
            c15828.f20410 = new C4948(this.f24301, this.f24302);
            Iterator it = c15828.m35943().iterator();
            while (it.hasNext()) {
                C7480.stream(((C22536) it.next()).m50507()).forEach(new Consumer() { // from class: l.᩻ᩴ۠
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C24719.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void m45213n(Object obj) {
                        this.f79964.mo3826((C19049) obj);
                    }
                });
            }
            c7650.f20027.f45853 = C4848.m10283();
        }
        c7650.f20027 = null;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
        C5771 c5771;
        if (C9268.m21429(c10471) && (c5771 = c10471.f28960) != null && c5771.f20407.m18009() && c10471.f28958.f11316.m10293() && C9268.m21417((AbstractC7257) c10471.f28958.f11316.f11034)) {
            C4968 c4968 = c10471.f28958;
            C4848 c4848 = c4968.f11316;
            if (((AbstractC13154) c4848.f11034).f18924 == c4968.f18924) {
                c4968.f11316 = c4848.f11035;
            }
        }
        c10471.f28960 = null;
        super.mo3801(c10471);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        c11281.f31438 = null;
        super.mo3805(c11281);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        c20530.f63427 = null;
        super.mo3832(c20530);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        c11674.f5602 = null;
        super.mo3806(c11674);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        c8598.f5602 = null;
        mo12739(c8598.f23105);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        c11003.f5602 = null;
        super.mo3803(c11003);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        c8320.f22260 = null;
        mo12739(c8320.f22261);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        c9661.f26611 = null;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3826(C19049 c19049) {
        c19049.f56842 = null;
        super.mo3826(c19049);
    }

    public C8971(C3606 c3606) {
        this.f24301 = c3606;
    }
}
