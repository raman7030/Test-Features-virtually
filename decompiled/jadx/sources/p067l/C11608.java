package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11608 extends AbstractC11588 {

    /* JADX INFO: renamed from: ۙ֫ */
    public ArrayList f32418;

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        m26679(EnumC16818.f49669.m38127() + " {");
        m26678(1);
        C21230.forEach(this.f32418, new Consumer() { // from class: l.᩷ܿ֨
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f70515.m26679((String) obj);
            }
        });
        m26667(1);
        m26679(C0249l.f1198d);
    }
}
