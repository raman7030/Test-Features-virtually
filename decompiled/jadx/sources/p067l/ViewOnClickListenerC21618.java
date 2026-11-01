package p067l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩶ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC21618 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f68138;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f68139;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f68140;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f68141;

    public /* synthetic */ ViewOnClickListenerC21618(Object obj, Object obj2, Object obj3, int i) {
        this.f68140 = i;
        this.f68141 = obj;
        this.f68139 = obj2;
        this.f68138 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f68140) {
            case 0:
                C9315 c9315 = (C9315) this.f68141;
                EditText editText = (EditText) this.f68139;
                EditText editText2 = (EditText) this.f68138;
                c9315.m21562();
                C4345.m8962(c9315.f25331, c9315.f25329, editText, editText2);
                break;
            default:
                C8126.m18831((boolean[]) this.f68141, (DialogInterfaceC2564) this.f68139, (Runnable) this.f68138);
                break;
        }
    }
}
