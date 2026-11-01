package p067l;

import android.content.DialogInterface;
import android.widget.EditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩻۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC24917 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f79580;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Serializable f79581;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f79582;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f79583;

    public /* synthetic */ DialogInterfaceOnClickListenerC24917(Object obj, Serializable serializable, Object obj2, int i) {
        this.f79582 = i;
        this.f79583 = obj;
        this.f79581 = serializable;
        this.f79580 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f79582) {
            case 0:
                C5471 c5471 = (C5471) this.f79583;
                c5471.m12024(new InterfaceC16869() { // from class: l.ܳ۬᩻
                    @Override // p067l.InterfaceC16869
                    public final C6033 run() {
                        this.f47675.f13052.m17095(str);
                        return null;
                    }
                }, new RunnableC22099(3, (DialogInterfaceC2564) this.f79580));
                break;
            case 1:
                Runnable runnable = (Runnable) this.f79583;
                ArrayList arrayList = (ArrayList) this.f79581;
                EditText editText = (EditText) this.f79580;
                if (runnable != null && i == arrayList.size()) {
                    runnable.run();
                } else {
                    editText.setText(((AbstractC17043) arrayList.get(i)).mo25505());
                    editText.setSelection(editText.length());
                }
                break;
            default:
                C3019 c3019 = (C3019) this.f79583;
                final AbstractC17043 abstractC17043 = (AbstractC17043) this.f79581;
                C21126 c21126 = (C21126) this.f79580;
                ArrayList arrayList2 = c3019.f40548;
                C5522 c5522 = c3019.f40549;
                try {
                    C4081.f8987.submit(new Callable() { // from class: l.ۖ᩸ܳ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(abstractC17043.mo25503());
                        }
                    }).get(100L, TimeUnit.MILLISECONDS);
                    break;
                } catch (Exception unused) {
                }
                int bindingAdapterPosition = c21126.getBindingAdapterPosition();
                arrayList2.remove((bindingAdapterPosition - c5522.m12179(c3019)) - 1);
                if (arrayList2.size() <= 0) {
                    c5522.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                } else {
                    c5522.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                }
                break;
        }
    }
}
