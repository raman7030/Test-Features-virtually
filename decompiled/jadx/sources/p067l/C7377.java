package p067l;

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
public final class C7377 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public List f19319;

    /* JADX INFO: renamed from: ۧ */
    public String f19320;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC10059 f19321;

    /* JADX INFO: renamed from: ܽ */
    public AtomicInteger f19322;

    /* JADX INFO: renamed from: ܿ */
    public final String f19323;

    /* JADX INFO: renamed from: ᩳ */
    public long f19324;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC3353 viewOnClickListenerC3353 = (ViewOnClickListenerC3353) abstractC5462;
        C17434 c17434 = (C17434) this.f19319.get(i);
        viewOnClickListenerC3353.f6554.setText(c17434.f52107);
        viewOnClickListenerC3353.f6555.setText(c17434.f52110);
        viewOnClickListenerC3353.f6557.setImageDrawable(c17434.f52108);
        viewOnClickListenerC3353.f6556 = c17434;
        c17434.f52105 = true;
        if (System.currentTimeMillis() - this.f19324 < 300) {
            viewOnClickListenerC3353.itemView.setAlpha(0.0f);
            ObjectAnimator.ofFloat(viewOnClickListenerC3353.itemView, "alpha", 0.0f, 1.0f).start();
        }
    }

    public C7377(ActivityC10059 activityC10059) {
        this.f19321 = activityC10059;
        String path = Environment.getExternalStorageDirectory().getPath();
        this.f19323 = path;
        this.f19319 = new ArrayList();
        this.f19322 = new AtomicInteger();
        String string = ApplicationC21448.f67649.getString("apk_selector_path", path);
        this.f19320 = string;
        if (string.startsWith(path) && C18524.m42109(this.f19320, new String[0]).mo25094()) {
            return;
        }
        this.f19320 = path;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC3353(this.f19321, viewGroup);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f19319.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17102(final String str) {
        final int iIncrementAndGet = this.f19322.incrementAndGet();
        final List list = this.f19319;
        this.f19319 = Collections.EMPTY_LIST;
        notifyDataSetChanged();
        C4081.f8987.execute(new Runnable() { // from class: l.ۘۢۢ
            @Override // java.lang.Runnable
            public final void run() {
                C7377.m17100(this.f15119, list, str, iIncrementAndGet);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17100(final C7377 c7377, final List list, final String str, int i) {
        ActivityC10059 activityC10059 = c7377.f19321;
        list.clear();
        if (!c7377.f19320.equals(c7377.f19323)) {
            list.add(new C17434(0));
        }
        int i2 = 1;
        for (AbstractC17043 abstractC17043 : C18524.m42109(c7377.f19320, new String[0]).mo25500(true)) {
            if (abstractC17043.mo25087() || abstractC17043.getName().toLowerCase().endsWith(".apk")) {
                list.add(new C17434(abstractC17043));
            }
        }
        Collections.sort(list, new C20118());
        activityC10059.runOnUiThread(new Runnable() { // from class: l.᩵ۢۢ
            @Override // java.lang.Runnable
            public final void run() {
                C7377.m17099(this.f65348, list, str);
            }
        });
        SystemClock.sleep(100L);
        for (int i3 = 0; i3 < list.size() && i == c7377.f19322.get(); i3++) {
            try {
                final C17434 c17434 = (C17434) list.get(i3);
                if (!c17434.f52109) {
                    AbstractC17043 abstractC17044 = c17434.f52106;
                    String strMo25505 = abstractC17044.mo25505();
                    long jMo25101 = abstractC17044.mo25101();
                    long jMo25091 = abstractC17044.mo25091();
                    int i4 = C14828.f42297;
                    final Drawable drawableM30927 = C5880.m13196(C16111.m36664(strMo25505 + jMo25101 + jMo25091).toLowerCase(), C21265.f66841, false, new C16142(abstractC17044, i2)).m30927();
                    activityC10059.runOnUiThread(new Runnable() { // from class: l.֡ۢۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C17434 c17435 = c17434;
                            boolean z = c17435.f52105;
                            C0878 c0878 = c17435.f52108;
                            Drawable drawable = drawableM30927;
                            if (!z) {
                                c0878.setDrawable(drawable);
                                return;
                            }
                            Drawable drawable2 = c0878.getDrawable();
                            drawable.setBounds(drawable2.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
                            c0878.setDrawable(transitionDrawable);
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

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17099(C7377 c7377, List list, String str) {
        ActivityC10059 activityC10059 = c7377.f19321;
        c7377.f19324 = System.currentTimeMillis();
        c7377.f19319 = list;
        c7377.notifyDataSetChanged();
        if (str != null) {
            for (int i = 0; i < list.size(); i++) {
                if (((C17434) list.get(i)).f52107.equalsIgnoreCase(str)) {
                    activityC10059.f27836.f10616.scrollToPosition(i);
                    return;
                }
            }
        }
        activityC10059.f27836.f10616.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17101() {
        String str = this.f19320;
        String str2 = this.f19323;
        if (str.equals(str2)) {
            return false;
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(this.f19320, new String[0]);
        String parent = abstractC17043M42109.getParent();
        this.f19320 = parent;
        if (parent == null) {
            this.f19320 = str2;
        }
        m17102(abstractC17043M42109.getName());
        return true;
    }
}
