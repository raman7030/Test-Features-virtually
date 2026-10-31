package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14855 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45320;

    public /* synthetic */ C14855(int i) {
        this.f45320 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f45320) {
            case 0:
                ((ActivityC17169) obj).m40365(R.layout.MT_Protector);
                break;
            case 1:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) obj;
                C11233.m27805(abstractActivityC3346, "activity");
                int i = C11182.f33563;
                C13136 c13136 = new C13136(abstractActivityC3346, R.string.MT_Protector);
                c13136.m31864();
                new Thread(new RunnableC12781(abstractActivityC3346, new C18509(c13136))).start();
                break;
            default:
                C11133.m27618((EnumC1960) obj);
                break;
        }
    }
}
