package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۧܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12957 extends AbstractC6620 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C25026 f36447;

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ۧ */
    public final int mo13852() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12957(C25026 c25026, AbstractC7291 abstractC7291) {
        super(abstractC7291);
        this.f36447 = c25026;
    }

    @Override // p067l.AbstractC6620
    /* JADX INFO: renamed from: ۧ */
    public final ComponentCallbacksC11117 mo15099(int i) {
        if (i == 0) {
            return new ViewOnClickListenerC9523();
        }
        if (i == 1) {
            return new C23194();
        }
        if (i == 2) {
            return new C16408();
        }
        if (i == 3) {
            return new C16684();
        }
        throw new RuntimeException();
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo13848(int i) {
        C25026 c25026 = this.f36447;
        if (i == 0) {
            return c25026.getString(R.string.MT_Protector);
        }
        if (i == 1) {
            return c25026.getString(R.string.MT_Protector);
        }
        if (i == 2) {
            return c25026.getString(R.string.MT_Protector);
        }
        if (i == 3) {
            return c25026.getString(R.string.MT_Protector);
        }
        throw new RuntimeException();
    }
}
