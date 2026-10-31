package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11141 extends AbstractC4474 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23840 f33447;

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ۧ */
    public final int mo11916() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11141(C23840 c23840, AbstractC5180 abstractC5180) {
        super(abstractC5180);
        this.f33447 = c23840;
    }

    @Override // l.AbstractC4474
    /* JADX INFO: renamed from: ۧ */
    public final ComponentCallbacksC9205 mo13217(int i) {
        if (i == 0) {
            return new ViewOnClickListenerC7528();
        }
        if (i == 1) {
            return new C21912();
        }
        if (i == 2) {
            return new C14772();
        }
        if (i == 3) {
            return new C15063();
        }
        throw new RuntimeException();
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo11912(int i) {
        C23840 c23840 = this.f33447;
        if (i == 0) {
            return c23840.getString(R.string.MT_Protector);
        }
        if (i == 1) {
            return c23840.getString(R.string.MT_Protector);
        }
        if (i == 2) {
            return c23840.getString(R.string.MT_Protector);
        }
        if (i == 3) {
            return c23840.getString(R.string.MT_Protector);
        }
        throw new RuntimeException();
    }
}
