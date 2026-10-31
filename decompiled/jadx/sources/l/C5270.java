package l;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Environment;
import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۚۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5270 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f16482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f16483;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8092 f16484;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f16485;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f16486;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f16487;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ViewOnClickListenerC1036 viewOnClickListenerC1036 = (ViewOnClickListenerC1036) abstractC3255;
        C15852 c15852 = (C15852) this.f16482.get(i);
        viewOnClickListenerC1036.f3782.setText(c15852.f48969);
        viewOnClickListenerC1036.f3783.setText(c15852.f48972);
        viewOnClickListenerC1036.f3785.setImageDrawable(c15852.f48970);
        viewOnClickListenerC1036.f3784 = c15852;
        c15852.f48967 = true;
        if (System.currentTimeMillis() - this.f16487 < 300) {
            viewOnClickListenerC1036.itemView.setAlpha(0.0f);
            ObjectAnimator.ofFloat(viewOnClickListenerC1036.itemView, "alpha", 0.0f, 1.0f).start();
        }
    }

    public C5270(ActivityC8092 activityC8092) {
        this.f16484 = activityC8092;
        String path = Environment.getExternalStorageDirectory().getPath();
        this.f16486 = path;
        this.f16482 = new ArrayList();
        this.f16485 = new AtomicInteger();
        String string = ApplicationC20075.f65008.getString("apk_selector_path", path);
        this.f16483 = string;
        if (string.startsWith(path) && C16999.m39866(this.f16483, new String[0]).mo23120()) {
            return;
        }
        this.f16483 = path;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC1036(this.f16484, viewGroup);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f16482.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15199(final String str) {
        final int iIncrementAndGet = this.f16485.incrementAndGet();
        final List list = this.f16482;
        this.f16482 = Collections.EMPTY_LIST;
        notifyDataSetChanged();
        C1802.f6208.execute(new Runnable() { // from class: l.ۘۢۢ
            @Override // java.lang.Runnable
            public final void run() {
                C5270.m15197(this.f12312, list, str, iIncrementAndGet);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15197(final C5270 c5270, final List list, final String str, int i) {
        ActivityC8092 activityC8092 = c5270.f16484;
        list.clear();
        if (!c5270.f16483.equals(c5270.f16486)) {
            list.add(new C15852(0));
        }
        int i2 = 1;
        for (AbstractC15440 abstractC15440 : C16999.m39866(c5270.f16483, new String[0]).mo23549(true)) {
            if (abstractC15440.mo23113() || abstractC15440.getName().toLowerCase().endsWith(".apk")) {
                list.add(new C15852(abstractC15440));
            }
        }
        Collections.sort(list, new C18676());
        activityC8092.runOnUiThread(new Runnable() { // from class: l.᩵ۢۢ
            @Override // java.lang.Runnable
            public final void run() {
                C5270.m15196(this.f62737, list, str);
            }
        });
        SystemClock.sleep(100L);
        for (int i3 = 0; i3 < list.size() && i == c5270.f16485.get(); i3++) {
            try {
                final C15852 c15852 = (C15852) list.get(i3);
                if (!c15852.f48971) {
                    AbstractC15440 abstractC15441 = c15852.f48968;
                    String strMo23554 = abstractC15441.mo23554();
                    long jMo23127 = abstractC15441.mo23127();
                    long jMo23117 = abstractC15441.mo23117();
                    int i4 = C13110.f39245;
                    final Drawable drawableM28878 = C3695.m11250(C14460.m34530(strMo23554 + jMo23127 + jMo23117).toLowerCase(), C19883.f64205, false, new C14492(abstractC15441, i2)).m28878();
                    activityC8092.runOnUiThread(new Runnable() { // from class: l.֡ۢۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15852 c15853 = c15852;
                            boolean z = c15853.f48967;
                            C0734 c0734 = c15853.f48970;
                            Drawable drawable = drawableM28878;
                            if (!z) {
                                c0734.setDrawable(drawable);
                                return;
                            }
                            Drawable drawable2 = c0734.getDrawable();
                            drawable.setBounds(drawable2.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
                            c0734.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15196(C5270 c5270, List list, String str) {
        ActivityC8092 activityC8092 = c5270.f16484;
        c5270.f16487 = System.currentTimeMillis();
        c5270.f16482 = list;
        c5270.notifyDataSetChanged();
        if (str != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((C15852) list.get(i)).f48969.equalsIgnoreCase(str)) {
                    activityC8092.f24925.f7827.scrollToPosition(i);
                    return;
                }
            }
        }
        activityC8092.f24925.f7827.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15198() {
        String str = this.f16483;
        String str2 = this.f16486;
        if (str.equals(str2)) {
            return false;
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(this.f16483, new String[0]);
        String parent = abstractC15440M39866.getParent();
        this.f16483 = parent;
        if (parent == null) {
            this.f16483 = str2;
        }
        m15199(abstractC15440M39866.getName());
        return true;
    }
}
