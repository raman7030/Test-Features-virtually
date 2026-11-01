package p067l;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۡ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10817 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ Object f29968;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f29969;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f29970;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29971;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f29972;

    public /* synthetic */ RunnableC10817(View view, Object obj, Object obj2, Object obj3, int i) {
        this.f29971 = i;
        this.f29972 = view;
        this.f29970 = obj;
        this.f29969 = obj2;
        this.f29968 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29971) {
            case 0:
                C18805.m42845((TextInputLayout) this.f29972, (EditText) this.f29970, (AbstractActivityC5549) this.f29969, (DialogInterfaceC2564) this.f29968);
                break;
            default:
                C14146.m32205((C14146) this.f29972, (InterfaceC9768) this.f29970, (C6495) this.f29969, (RuntimeException) this.f29968);
                break;
        }
    }
}
