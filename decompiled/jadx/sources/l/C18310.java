package l;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩳ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18310 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f56923;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f56924;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC16898 f56925;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final WeakReference f56926;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextWatcher f56927;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, l.ܽ᩷᩷] */
    public C18310(View view, final RunnableC2539 runnableC2539) {
        this.f56923 = false;
        WeakReference weakReference = new WeakReference(view);
        this.f56926 = weakReference;
        ?? r4 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ܽ᩷᩷
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                runnableC2539.run();
            }
        };
        this.f56925 = r4;
        C2082 c2082 = new C2082(runnableC2539);
        this.f56927 = c2082;
        View view2 = (View) weakReference.get();
        if (view2 == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(r4);
            this.f56924 = viewTreeObserver;
        }
        if (view2 instanceof TextView) {
            ((TextView) view2).addTextChangedListener(c2082);
            this.f56923 = true;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m42664() {
        return (View) this.f56926.get();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m42665() {
        return this.f56926.get() != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42663() {
        View view = (View) this.f56926.get();
        ViewTreeObserver viewTreeObserver = this.f56924;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.f56924.removeOnGlobalLayoutListener(this.f56925);
        }
        if (this.f56923 && (view instanceof TextView)) {
            ((TextView) view).removeTextChangedListener(this.f56927);
        }
    }
}
