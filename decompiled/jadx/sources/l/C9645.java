package l;

/* JADX INFO: renamed from: l.ۢܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9645 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f29222 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f29223 = 4;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24581() {
        this.f29222 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24580(Integer num) {
        this.f29223 = num.intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24579() {
        if (this.f29222) {
            return "\t";
        }
        String strConcat = "";
        for (int i = 0; i < this.f29223; i++) {
            strConcat = strConcat.concat(" ");
        }
        return strConcat;
    }
}
