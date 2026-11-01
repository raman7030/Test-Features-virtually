package p067l;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩳ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19771 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f60141;

    /* JADX INFO: renamed from: ۧ */
    public ViewTreeObserver f60142;

    /* JADX INFO: renamed from: ܽ */
    public final ViewTreeObserverOnGlobalLayoutListenerC18429 f60143;

    /* JADX INFO: renamed from: ܿ */
    public final WeakReference f60144;

    /* JADX INFO: renamed from: ᩳ */
    public final TextWatcher f60145;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, l.ܽ᩷᩷] */
    public C19771(View view, final RunnableC4782 runnableC4782) {
        this.f60141 = false;
        WeakReference weakReference = new WeakReference(view);
        this.f60144 = weakReference;
        ?? r4 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ܽ᩷᩷
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                runnableC4782.run();
            }
        };
        this.f60143 = r4;
        C4348 c4348 = new C4348(runnableC4782);
        this.f60145 = c4348;
        View view2 = (View) weakReference.get();
        if (view2 == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(r4);
            this.f60142 = viewTreeObserver;
        }
        if (view2 instanceof TextView) {
            ((TextView) view2).addTextChangedListener(c4348);
            this.f60141 = true;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m44925() {
        return (View) this.f60144.get();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44926() {
        return this.f60144.get() != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44924() {
        View view = (View) this.f60144.get();
        ViewTreeObserver viewTreeObserver = this.f60142;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.f60142.removeOnGlobalLayoutListener(this.f60143);
        }
        if (this.f60141 && (view instanceof TextView)) {
            ((TextView) view).removeTextChangedListener(this.f60145);
        }
    }
}
