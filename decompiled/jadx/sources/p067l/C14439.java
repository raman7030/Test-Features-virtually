package p067l;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C14439 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public DialogInterfaceC2564 f41259;

    /* JADX INFO: renamed from: ۧ */
    public C3847 f41260;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f41261;

    /* JADX INFO: renamed from: ܽ */
    public C8404 f41262;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C18402 f41263;

    /* JADX INFO: renamed from: ᩳ */
    public final C14849 f41264;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        final C17120 c17120 = (C17120) abstractC5462;
        final C13039 c13039 = (C13039) this.f41261.get(i);
        c17120.f50575.m28261(c13039.f36667.f66884);
        c17120.f50575.m28262(c13039.mo8868());
        c17120.f50576.setText(C7050.m16224(c13039.f36665));
        c17120.f50576.setTextColor(C23223.f72986);
        c17120.f50574.setVisibility(m33051() ? 0 : 8);
        c17120.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.᩶᩹ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14439.m33049(this.f68643, c13039);
            }
        });
        c17120.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۙ᩹ܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return C14439.m33052(this.f18403, c13039, view);
            }
        });
        c17120.f50574.setOnTouchListener(new View.OnTouchListener() { // from class: l.ۗ᩹ܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C14439.m33050(this.f14014, c17120, motionEvent);
                return false;
            }
        });
    }

    public C14439(C18402 c18402, C14849 c14849, ArrayList arrayList) {
        this.f41263 = c18402;
        this.f41264 = c14849;
        this.f41261 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33048(C14439 c14439, DialogInterfaceC2564 dialogInterfaceC2564, C3847 c3847, View view) {
        c14439.f41259 = dialogInterfaceC2564;
        c14439.f41260 = c3847;
        c14439.f41262 = new C8404(view, new RunnableC15109(c14439));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m33051() {
        C8404 c8404 = this.f41262;
        return c8404 != null && c8404.m19573();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33053(C14439 c14439) {
        C8404 c8404 = c14439.f41262;
        if (c8404 != null) {
            c8404.m19572();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33054(C14439 c14439, C13039 c13039) {
        ArrayList arrayList = c14439.f41261;
        int iIndexOf = arrayList.indexOf(c13039);
        if (iIndexOf == -1) {
            iIndexOf = -1;
        } else {
            arrayList.remove(iIndexOf);
            c14439.notifyItemRemoved(iIndexOf);
        }
        if (iIndexOf == -1) {
            return;
        }
        c14439.f41263.m41886(c13039.f36664, false);
        if (arrayList.isEmpty()) {
            C14849 c14849 = c14439.f41264;
            DialogInterfaceC2564 dialogInterfaceC2564 = c14439.f41259;
            ViewTreeObserver viewTreeObserver = c14849.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC20475(viewTreeObserver, dialogInterfaceC2564, c14849));
        }
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C17120(0, LayoutInflater.from(this.f41263.f37526).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m33049(C14439 c14439, C13039 c13039) {
        DialogInterfaceC2564 dialogInterfaceC2564;
        if (c14439.m33051() || (dialogInterfaceC2564 = c14439.f41259) == null) {
            return;
        }
        dialogInterfaceC2564.dismiss();
        c13039.mo8866(c14439.f41263.f37526);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [l.᩹᩹ܳ] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m33052(final C14439 c14439, final C13039 c13039, View view) {
        DialogInterfaceC2564 dialogInterfaceC2564;
        if (c14439.m33051() || (dialogInterfaceC2564 = c14439.f41259) == null) {
            return false;
        }
        C18402.m41890(c14439.f41263, view, (InterfaceC4321) c13039, true, dialogInterfaceC2564, new Runnable() { // from class: l.᩸᩹ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C14439.m33053(this.f72758);
            }
        }, (RunnableC23827) new Runnable() { // from class: l.᩹᩹ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C14439.m33054(this.f75716, c13039);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m33050(C14439 c14439, C17120 c17120, MotionEvent motionEvent) {
        if (c14439.m33051() && c14439.f41260 != null && motionEvent.getActionMasked() == 0) {
            c14439.f41260.m7555(c17120);
        }
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f41261.size();
    }
}
