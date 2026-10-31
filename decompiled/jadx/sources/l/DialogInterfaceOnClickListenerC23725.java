package l;

import android.content.DialogInterface;
import android.widget.EditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩻۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23725 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76829;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f76830;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76831;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76832;

    public /* synthetic */ DialogInterfaceOnClickListenerC23725(Object obj, Serializable serializable, Object obj2, int i) {
        this.f76831 = i;
        this.f76832 = obj;
        this.f76830 = serializable;
        this.f76829 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f76831) {
            case 0:
                C3264 c3264 = (C3264) this.f76832;
                c3264.m9991(new InterfaceC15257() { // from class: l.ܳ۬᩻
                    @Override // l.InterfaceC15257
                    public final C3856 run() {
                        this.f44568.f10244.m15192(str);
                        return null;
                    }
                }, new RunnableC20760(3, (DialogInterfaceC0206) this.f76829));
                break;
            case 1:
                Runnable runnable = (Runnable) this.f76832;
                ArrayList arrayList = (ArrayList) this.f76830;
                EditText editText = (EditText) this.f76829;
                if (runnable != null && i == arrayList.size()) {
                    runnable.run();
                } else {
                    editText.setText(((AbstractC15440) arrayList.get(i)).mo23554());
                    editText.setSelection(editText.length());
                }
                break;
            default:
                C0684 c0684 = (C0684) this.f76832;
                final AbstractC15440 abstractC15440 = (AbstractC15440) this.f76830;
                C19736 c19736 = (C19736) this.f76829;
                ArrayList arrayList2 = c0684.f37525;
                C3318 c3318 = c0684.f37526;
                try {
                    C1802.f6208.submit(new Callable() { // from class: l.ۖ᩸ܳ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(abstractC15440.mo23552());
                        }
                    }).get(100L, TimeUnit.MILLISECONDS);
                    break;
                } catch (Exception unused) {
                }
                int bindingAdapterPosition = c19736.getBindingAdapterPosition();
                arrayList2.remove((bindingAdapterPosition - c3318.m10143(c0684)) - 1);
                if (arrayList2.size() <= 0) {
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                } else {
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                }
                break;
        }
    }
}
