package p067l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import bin.p000mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10059 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final /* synthetic */ int f27834 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public C2798 f27835;

    /* JADX INFO: renamed from: ܿۧ */
    public C4695 f27836;

    /* JADX INFO: renamed from: ᩳۧ */
    public C18776 f27837;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "ApkSelectorActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12250();
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C18105 c18105 = new C18105(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c18105);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC20613(3, this));
        this.f27836 = new C4695(this);
        this.f27837 = new C18776(this);
        TabLayout tabLayout = (TabLayout) m12277(R.id.tabLayout);
        C2798 c2798 = (C2798) m12277(R.id.MT_Protector);
        this.f27835 = c2798;
        c2798.m4406(new C12742(this));
        tabLayout.setupWithViewPager(this.f27835);
        this.f27836.f10614.m17102(null);
        final C11401 c11401 = this.f27837.f56098;
        c11401.getClass();
        C4081.f8987.execute(new Runnable() { // from class: l.ܳۢۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C11401 c11402 = c11401;
                ActivityC10059 activityC10059 = c11402.f31822;
                PackageManager packageManager = activityC10059.getPackageManager();
                ArrayList<C19447> arrayList = c11402.f31821;
                arrayList.clear();
                for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                    if ((packageInfo.applicationInfo.flags & 129) == 0) {
                        arrayList.add(new C19447(packageInfo));
                    }
                }
                Collections.sort(arrayList, new C24811());
                activityC10059.runOnUiThread(new Runnable() { // from class: l.ۜۢۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c11402.notifyDataSetChanged();
                    }
                });
                SystemClock.sleep(100L);
                for (final C19447 c19447 : arrayList) {
                    final BitmapDrawable bitmapDrawableM18675 = RunnableC8046.m18675(c19447.f59242);
                    activityC10059.runOnUiThread(new Runnable() { // from class: l.᩷ۢۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19447 c19448 = c19447;
                            boolean z = c19448.f59239;
                            C0878 c0878 = c19448.f59241;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM18675;
                            if (!z) {
                                c0878.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c0878.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c0878.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
            }
        });
    }
}
