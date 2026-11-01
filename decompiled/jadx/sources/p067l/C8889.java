package p067l;

/* JADX INFO: renamed from: l.ۜܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8889 extends C16299 {

    /* JADX INFO: renamed from: ۫ */
    public String f24094;

    public C8889(InterfaceC13638 interfaceC13638, String str) {
        super(interfaceC13638);
        this.f24094 = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return C10965.m25286(new StringBuilder(), this.f24094, " is an odexed instruction. You cannot reassemble a disassembled odex file unless it has been deodexed.");
    }
}
