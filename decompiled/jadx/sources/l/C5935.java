package l;

import android.os.Looper;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5935 extends AbstractViewOnClickListenerC12490 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static WeakReference f18216;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5935(Main main, C3318 c3318) {
        String strM14327 = C4925.m14327(R.string.MT_Protector);
        super(main, strM14327, strM14327, c3318);
        f18216 = new WeakReference(this);
        m16665();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m16666() {
        C5935 c5935;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new RunnableC5505(1));
            return;
        }
        WeakReference weakReference = f18216;
        if (weakReference == null || (c5935 = (C5935) weakReference.get()) == null) {
            return;
        }
        c5935.m16665();
        c5935.f37526.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m16665() {
        ArrayList arrayList = this.f37525;
        arrayList.clear();
        Main main = this.f34527;
        if (main.m132() != null) {
            C11971 c11971M24094 = main.m132().m24094();
            c11971M24094.m29245();
            try {
                Iterator<E> it = c11971M24094.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C12990(this, main, (AbstractC16891) it.next()));
                }
                c11971M24094.m29244();
            } catch (Throwable th) {
                c11971M24094.m29244();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m16667() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m16666();
        } else {
            m16665();
            this.f37526.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* JADX INFO: renamed from: ֫ */
    public final void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i) {
        C12285 c12285 = (C12285) abstractViewOnLongClickListenerC14606;
        C12990 c12990 = (C12990) this.f37525.get(i);
        c12285.f36597 = c12990;
        c12285.f44703.setText(c12990.f38903);
        c12285.f44700.setText(c12990.f38901);
        c12285.f44704.m26232(c12990.f38904);
        c12285.itemView.setOnClickListener(c12990);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16664(C5935 c5935, C12285 c12285) {
        C3318 c3318 = c5935.f37526;
        ArrayList arrayList = c5935.f37525;
        C12990 c12990 = c12285.f36597;
        C9340 c9340M132 = c5935.f34527.m132();
        if (c12990 == null || c9340M132 == null) {
            c5935.m16667();
            return;
        }
        int iMo25527 = c12990.mo25527();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            View.OnClickListener onClickListener = (AbstractViewOnClickListenerC1201) arrayList.get(i);
            if ((onClickListener instanceof InterfaceC10169) && ((InterfaceC10169) onClickListener).mo25527() == iMo25527) {
                break;
            } else {
                i++;
            }
        }
        int bindingAdapterPosition = c12285.getBindingAdapterPosition();
        int iM10143 = c3318.m10143(c5935);
        if (i != -1 && bindingAdapterPosition != -1 && iM10143 != -1 && bindingAdapterPosition == iM10143 + 1 + i) {
            z = true;
        }
        if (c9340M132.m24066(iMo25527) && z && i >= 0 && i < arrayList.size()) {
            Object obj = arrayList.get(i);
            if ((obj instanceof InterfaceC10169) && ((InterfaceC10169) obj).mo25527() == iMo25527) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                    return;
                } else {
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                    return;
                }
            }
        }
        c5935.m16667();
    }
}
