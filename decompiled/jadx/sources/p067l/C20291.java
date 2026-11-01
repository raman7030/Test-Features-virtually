package p067l;

/* JADX INFO: renamed from: l.ᩴܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20291 extends EnumC2483 {
    public /* synthetic */ C20291(EnumC19919 enumC19919, EnumC5837 enumC5837, EnumC11202 enumC11202) {
        this("J", 48, "-J", "opt.arg.flag", "opt.J", enumC19919, enumC5837, enumC11202);
    }

    public C20291(String str, int i, String str2, String str3, String str4, EnumC19919 enumC19919, EnumC5837 enumC5837, EnumC11202 enumC11202) {
        super(str, i, str2, str3, str4, enumC19919, enumC5837, enumC11202, 0);
    }

    @Override // p067l.EnumC2483
    /* JADX INFO: renamed from: ֫ */
    public void mo3579(AbstractC3154 abstractC3154, String str) {
        throw new AssertionError("the -J flag should be caught by the launcher.");
    }
}
