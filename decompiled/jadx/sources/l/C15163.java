package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15163 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3046 f46324;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46325;

    public /* synthetic */ C15163(C3046 c3046, int i) {
        this.f46324 = c3046;
        this.f46325 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C15869 c15869 = (C15869) obj;
        if (c15869.m37606() == 0) {
            int i = c15869.f20943;
            if (i > this.f46325) {
                c15869.f20943 = i - 1;
                this.f46324.f9588.m45762(new C3170(0, c15869));
            }
            c15869.m37604(2);
        }
    }
}
