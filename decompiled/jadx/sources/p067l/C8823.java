package p067l;

import android.content.Context;
import android.util.AttributeSet;
import bin.p000mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SX */
/* JADX INFO: loaded from: classes3.dex */
public class C8823 extends AbstractC5907 {
    public C8823(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m9024((InterfaceC9544) new C23509(3, this));
    }

    public C8823(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9024((InterfaceC9544) new C23509(3, this));
    }

    public C8823(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9024((InterfaceC9544) new C23509(3, this));
    }

    public C8823(Context context) {
        super(context);
        m9024((InterfaceC9544) new C23509(3, this));
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        m20385(abstractActivityC5549, m9035(), m13265().getInt(m9037(), 10), new InterfaceC8054() { // from class: l.ܳ۬᩷
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                C8823.m20386(this.f47674, i);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final /* bridge */ /* synthetic */ void m45213n(Object obj) {
                mo18722((Integer) obj);
            }

            @Override // p067l.InterfaceC8054
            /* JADX INFO: renamed from: ܽ */
            public final /* synthetic */ void mo18722(Integer num) {
                C12078.m27664((InterfaceC8054) this, num);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return C12078.m27663((InterfaceC8054) this, intConsumer);
            }

            public final Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m20386(C8823 c8823, int i) {
        c8823.m13265().edit().putInt(c8823.m9037(), i).apply();
        c8823.mo9048();
        C5880.m13197();
        C19378.m44121();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20385(AbstractActivityC5549 abstractActivityC5549, CharSequence charSequence, int i, InterfaceC8054 interfaceC8054) {
        C1627 c1627 = new C1627(abstractActivityC5549, null);
        c1627.setMax(25);
        c1627.setPadding(c1627.getPaddingLeft(), C13076.m29939(20.0f) + c1627.getPaddingTop(), c1627.getPaddingRight(), c1627.getPaddingBottom());
        c1627.setProgress(i - 5);
        String str = ((Object) charSequence) + " (";
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(c1627.getProgress() + 5);
        sbM17248.append("s)");
        c20671BuildDialog.m46730(sbM17248.toString());
        c20671BuildDialog.m46715(c1627);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c1627.setOnSeekBarChangeListener(new C24916(c20671BuildDialog.m46732(), str, interfaceC8054));
    }
}
