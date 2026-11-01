package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes.dex */
public final class C23183 extends AbstractC6620 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C7089 f72825;

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ۧ */
    public final int mo13852() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23183(C7089 c7089, AbstractC7291 abstractC7291) {
        super(abstractC7291);
        this.f72825 = c7089;
    }

    @Override // p067l.AbstractC6620
    /* JADX INFO: renamed from: ۧ */
    public final ComponentCallbacksC11117 mo15099(int i) {
        if (i == 0) {
            return new ViewOnClickListenerC22924();
        }
        if (i == 1) {
            return new C15546();
        }
        if (i == 2) {
            return new C7996();
        }
        if (i == 3) {
            return new C20738();
        }
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo13848(int i) {
        C7089 c7089 = this.f72825;
        if (i == 0) {
            return c7089.getString(R.string.MT_Protector);
        }
        if (i == 1) {
            return c7089.getString(R.string.MT_Protector);
        }
        if (i == 2) {
            return c7089.getString(R.string.MT_Protector);
        }
        if (i == 3) {
            return c7089.getString(R.string.MT_Protector);
        }
        throw new RuntimeException();
    }
}
