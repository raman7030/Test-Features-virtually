package l;

/* JADX INFO: renamed from: l.ۜܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65LR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6861 extends C14658 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f21215;

    public C6861(InterfaceC11858 interfaceC11858, String str) {
        super(interfaceC11858);
        this.f21215 = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return C9045.m23341(new StringBuilder(), this.f21215, " is an odexed instruction. You cannot reassemble a disassembled odex file unless it has been deodexed.");
    }
}
