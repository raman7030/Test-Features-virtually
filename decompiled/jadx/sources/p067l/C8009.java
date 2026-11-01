package p067l;

import android.os.Looper;
import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8009 extends AbstractViewOnClickListenerC14239 {

    /* JADX INFO: renamed from: ۤ */
    public static WeakReference f21070;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8009(Main main, C5522 c5522) {
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        super(main, strM16224, strM16224, c5522);
        f21070 = new WeakReference(this);
        m18591();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m18592() {
        C8009 c8009;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C7050.m16212(new RunnableC7601(1));
            return;
        }
        WeakReference weakReference = f21070;
        if (weakReference == null || (c8009 = (C8009) weakReference.get()) == null) {
            return;
        }
        c8009.m18591();
        c8009.f40549.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m18591() {
        ArrayList arrayList = this.f40548;
        arrayList.clear();
        Main main = this.f37526;
        if (main.m130() != null) {
            C13746 c13746M26103 = main.m130().m26103();
            c13746M26103.m31299();
            try {
                Iterator<E> it = c13746M26103.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C14714(this, main, (AbstractC18422) it.next()));
                }
                c13746M26103.m31298();
            } catch (Throwable th) {
                c13746M26103.m31298();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public void m18593() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m18592();
        } else {
            m18591();
            this.f40549.notifyDataSetChanged();
        }
    }

    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ֫ */
    public final void mo5113(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250, int i) {
        C14044 c14044 = (C14044) abstractViewOnLongClickListenerC16250;
        C14714 c14714 = (C14714) this.f40548.get(i);
        c14044.f39613 = c14714;
        c14044.f47809.setText(c14714.f41949);
        c14044.f47806.setText(c14714.f41947);
        c14044.f47810.m28261(c14714.f41950);
        c14044.itemView.setOnClickListener(c14714);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18590(C8009 c8009, C14044 c14044) {
        C5522 c5522 = c8009.f40549;
        ArrayList arrayList = c8009.f40548;
        C14714 c14714 = c14044.f39613;
        C11245 c11245M130 = c8009.f37526.m130();
        if (c14714 == null || c11245M130 == null) {
            c8009.m18593();
            return;
        }
        int iMo27546 = c14714.mo27546();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            View.OnClickListener onClickListener = (AbstractViewOnClickListenerC3510) arrayList.get(i);
            if ((onClickListener instanceof InterfaceC12033) && ((InterfaceC12033) onClickListener).mo27546() == iMo27546) {
                break;
            } else {
                i++;
            }
        }
        int bindingAdapterPosition = c14044.getBindingAdapterPosition();
        int iM12179 = c5522.m12179(c8009);
        if (i != -1 && bindingAdapterPosition != -1 && iM12179 != -1 && bindingAdapterPosition == iM12179 + 1 + i) {
            z = true;
        }
        if (c11245M130.m26075(iMo27546) && z && i >= 0 && i < arrayList.size()) {
            Object obj = arrayList.get(i);
            if ((obj instanceof InterfaceC12033) && ((InterfaceC12033) obj).mo27546() == iMo27546) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    c5522.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                    return;
                } else {
                    c5522.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                    return;
                }
            }
        }
        c8009.m18593();
    }
}
