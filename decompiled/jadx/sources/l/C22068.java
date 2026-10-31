package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22068 implements InterfaceC9920 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70714;

    public /* synthetic */ C22068(int i) {
        this.f70714 = i;
    }

    @Override // l.InterfaceC9920
    public final AbstractC1661 create() {
        switch (this.f70714) {
            case 0:
                return new C12015("zip");
            default:
                C4716 c4716 = new C4716(R.string.MT_Protector, R.drawable.MT_Protector);
                c4716.m5604();
                return c4716;
        }
    }
}
