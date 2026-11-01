package p067l;

/* JADX INFO: renamed from: l.ۢܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11535 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f32171 = false;

    /* JADX INFO: renamed from: ۧ */
    public int f32172 = 4;

    /* JADX INFO: renamed from: ۧ */
    public final void m26595() {
        this.f32171 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26594(Integer num) {
        this.f32172 = num.intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m26593() {
        if (this.f32171) {
            return "\t";
        }
        String strConcat = "";
        for (int i = 0; i < this.f32172; i++) {
            strConcat = strConcat.concat(" ");
        }
        return strConcat;
    }
}
