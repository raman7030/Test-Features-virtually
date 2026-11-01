package p067l;

import bin.p000mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16487 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f48436;

    public /* synthetic */ C16487(int i) {
        this.f48436 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        switch (this.f48436) {
            case 0:
                ((ActivityC18686) obj).m42610(R.layout.MT_Protector);
                break;
            case 1:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) obj;
                C13045.m29867(abstractActivityC5549, "activity");
                int i = C12996.f36563;
                C14853 c14853 = new C14853(abstractActivityC5549, R.string.MT_Protector);
                c14853.m33956();
                new Thread(new RunnableC14515(abstractActivityC5549, new C19959(c14853))).start();
                break;
            default:
                C12949.m29680((EnumC4231) obj);
                break;
        }
    }
}
