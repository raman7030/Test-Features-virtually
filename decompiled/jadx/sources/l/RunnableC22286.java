package l;

import bin.mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.᩹۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22286 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72269;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72270;

    public /* synthetic */ RunnableC22286(int i, Object obj) {
        this.f72269 = i;
        this.f72270 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f72269) {
            case 0:
                C6058.m16899((C6058) this.f72270);
                break;
            case 1:
                C22933.m51033((C22933) this.f72270);
                break;
            case 2:
                C15528.m36595((String) this.f72270);
                break;
            case 3:
                ((AsyncTask) this.f72270).lambda$start$0();
                break;
            default:
                C14771.m35110((C14771) this.f72270);
                break;
        }
    }
}
