package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9BJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16795 extends AbstractC16876 implements InterfaceC16233 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C16795 f51558 = new C16795(1);

    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C11233.m27805(view, "it");
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof InterfaceC23103) {
            return (InterfaceC23103) tag;
        }
        return null;
    }
}
