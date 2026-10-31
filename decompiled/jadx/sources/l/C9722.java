package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C9722 extends AbstractC9701 {

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f29468;

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        m24665(EnumC15204.f46544.m35967() + " {");
        m24664(1);
        C19846.forEach(this.f29468, new Consumer() { // from class: l.᩷ܿ֨
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f67830.m24665((String) obj);
            }
        });
        m24653(1);
        m24665(l.d);
    }
}
