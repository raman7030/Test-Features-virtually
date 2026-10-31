package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17335 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53110;

    public /* synthetic */ C17335(int i) {
        this.f53110 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f53110) {
            case 0:
                break;
            default:
                int i = C6306.f19498;
                ((ActivityC17169) obj).m40365(R.layout.MT_Protector);
                break;
        }
    }
}
