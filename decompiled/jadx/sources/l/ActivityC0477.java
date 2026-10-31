package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0477 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2061 = 0;

    /* JADX INFO: renamed from: ۙۢ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f2062;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public TabLayout f2063;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public C6659 f2066;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public View f2067;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public View f2068;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public View f2069;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public View f2070;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C4006 f2071;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f2073;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public View f2074;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public View f2076;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C13328 f2077;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2064 = new ArrayList();

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final C5242 f2065 = new C5242(0);

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final C5242 f2072 = new C5242(Boolean.FALSE);

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC22434 f2075 = new View.OnLongClickListener() { // from class: l.᩹ܿܿ
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return ActivityC0477.m2101(this.f72681, view);
        }
    };

    static {
        ApplicationC12518.m30701(6);
        f2062 = new short[]{9342, 28904, -24929, -22667, -26847, -21320, -31192, -26483, 32347, 29775, -28188, 26963, 31088, 31870, -25984, -24072, 29467, -22120, -27671, 32272, -21843, -28560, -26003, 28801, -25511, 30324, 32341, -20672, 26792, -18497, -26469, -1548, -1559, -1567, -1538, -1565, -1563, -1563, -1545, -1547, -1567, -1541, -1566, -1538, -1537, -18860, 32695, 30803};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private native void m2088(MenuItem menuItem);

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "TextFunctionBarEditActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        int i = 1;
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC7935(i, this));
        this.f2071 = new C4006(this);
        m2107();
        this.f2070 = m10241(R.id.done);
        this.f2068 = m10241(R.id.menuScrollView);
        this.f2074 = m10241(R.id.MT_Protector);
        this.f2067 = m10241(R.id.MT_Protector);
        this.f2069 = m10241(R.id.MT_Protector);
        this.f2076 = m10241(R.id.MT_Protector);
        this.f2070.setOnClickListener(new ViewOnClickListenerC3868(i, this));
        this.f2063 = (TabLayout) m10241(R.id.tabLayout);
        C6659 c6659 = (C6659) m10241(R.id.MT_Protector);
        this.f2066 = c6659;
        c6659.m2029(new C19529(this));
        this.f2063.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C4795(this));
        this.f2063.setupWithViewPager(this.f2066);
        TabLayout tabLayout = this.f2063;
        tabLayout.setTabIconTint(tabLayout.getTabTextColors());
        this.f2066.m2043(getIntent().getIntExtra("pageIndex", 0));
        final H5PayActivity$$ExternalSyntheticLambda0 h5PayActivity$$ExternalSyntheticLambda0 = new H5PayActivity$$ExternalSyntheticLambda0(this);
        this.f2077 = new C13328(C8474.m22148(this, new InterfaceC19764() { // from class: l.᩹᩵᩷
            @Override // l.InterfaceC19764
            /* JADX INFO: renamed from: ֫ */
            public final void mo4668(Intent intent, int i2) {
                String stringExtra;
                if (i2 == 0 || i2 != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("extra");
                C11233.m27799(bundleExtra);
                h5PayActivity$$ExternalSyntheticLambda0.onGetPath(bundleExtra, stringExtra);
            }
        }));
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C3384 c3384 = new C3384(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c3384);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2095(ActivityC0477 activityC0477, AbstractC15440 abstractC15440, int[] iArr) {
        try {
            C8239.m21817(abstractC15440, iArr[0]);
            activityC0477.m2107();
            C21374.m48457(R.string.MT_Protector);
        } catch (Exception e) {
            activityC0477.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.ActivityC1252, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m2113();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m2105(boolean z) {
        if (z) {
            if (this.f2067.isClickable() && this.f2067.getAlpha() == 1.0f) {
                return;
            }
            this.f2067.setClickable(true);
            this.f2069.setClickable(true);
            this.f2076.setClickable(true);
            this.f2067.setAlpha(1.0f);
            this.f2069.setAlpha(1.0f);
            this.f2076.setAlpha(1.0f);
            return;
        }
        if (this.f2067.isClickable() || this.f2067.getAlpha() == 1.0f) {
            this.f2067.setClickable(false);
            this.f2069.setClickable(false);
            this.f2076.setClickable(false);
            this.f2067.setAlpha(0.5f);
            this.f2069.setAlpha(0.5f);
            this.f2076.setAlpha(0.5f);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m2103(final ActivityC0477 activityC0477, int i) {
        C5242 c5242 = activityC0477.f2072;
        activityC0477.f2073 = true;
        c5242.mo1669(Boolean.TRUE);
        final C23761 c23761 = (C23761) activityC0477.f2064.get(activityC0477.f2066.m2038());
        c23761.f76922 = i;
        c23761.f76916 = -2;
        BitSet bitSet = c23761.f76920;
        bitSet.clear();
        if (i != -1) {
            bitSet.set(i);
            c23761.f76918 = 1;
        } else {
            c23761.f76918 = 0;
        }
        c23761.f76915.notifyDataSetChanged();
        activityC0477.f2066.m18195(false);
        C0621 c0621 = new C0621(activityC0477.f2068, activityC0477.f2070, activityC0477.f2074);
        C0621 c0622 = new C0621(activityC0477.f2063);
        c0621.setAlpha(0.0f);
        c0621.m2553(0);
        c0622.f2381 = true;
        ObjectAnimator.ofFloat(c0621, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(c0622, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        activityC0477.m2105(c23761.f76918 > 0);
        activityC0477.f2067.setOnClickListener(new View.OnClickListener() { // from class: l.ۘܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC0477.m2096(this.f13018, c23761);
            }
        });
        activityC0477.f2069.setOnClickListener(new View.OnClickListener() { // from class: l.ᩴܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC0477.m2104(this.f59587, c23761);
            }
        });
        activityC0477.f2076.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC0477.f2061;
                final C23761 c23762 = c23761;
                int i3 = c23762.f76918;
                if (i3 == 0) {
                    return;
                }
                final ActivityC0477 activityC0478 = this.f63331;
                if (i3 != 1) {
                    C19258 c19258BuildDialog = activityC0478.buildDialog();
                    c19258BuildDialog.m44433(R.string.MT_Protector);
                    c19258BuildDialog.m44424(activityC0478.getString(R.string.MT_Protector, Integer.valueOf(c23762.f76918)));
                    c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚܿܿ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            int i5 = ActivityC0477.f2061;
                            c23762.m52424(true);
                            C8239.m21822();
                            activityC0478.m2115(false);
                        }
                    });
                    c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c19258BuildDialog.m44438();
                    return;
                }
                int size = ((ArrayList) c23762.m52425()).size();
                final int i4 = 0;
                while (i4 < size) {
                    if (c23762.f76920.get(i4)) {
                        C15293 c15293 = (C15293) ((ArrayList) c23762.m52425()).get(i4);
                        C19258 c19258BuildDialog2 = activityC0478.buildDialog();
                        c19258BuildDialog2.m44433(R.string.MT_Protector);
                        c19258BuildDialog2.m44424(activityC0478.getString(R.string.MT_Protector, c15293.m36306()));
                        c19258BuildDialog2.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܿܿ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = ActivityC0477.f2061;
                                C23761 c23763 = c23762;
                                ArrayList arrayList = (ArrayList) c23763.m52425();
                                int i7 = i4;
                                arrayList.remove(i7);
                                c23763.f76915.notifyItemRemoved(i7);
                                C8239.m21822();
                                activityC0478.m2115(false);
                            }
                        });
                        c19258BuildDialog2.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c19258BuildDialog2.m44438();
                    }
                    i4++;
                }
                i4 = -1;
                C15293 c15294 = (C15293) ((ArrayList) c23762.m52425()).get(i4);
                C19258 c19258BuildDialog3 = activityC0478.buildDialog();
                c19258BuildDialog3.m44433(R.string.MT_Protector);
                c19258BuildDialog3.m44424(activityC0478.getString(R.string.MT_Protector, c15294.m36306()));
                c19258BuildDialog3.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܿܿ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        int i6 = ActivityC0477.f2061;
                        C23761 c23763 = c23762;
                        ArrayList arrayList = (ArrayList) c23763.m52425();
                        int i7 = i4;
                        arrayList.remove(i7);
                        c23763.f76915.notifyItemRemoved(i7);
                        C8239.m21822();
                        activityC0478.m2115(false);
                    }
                });
                c19258BuildDialog3.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog3.m44438();
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2096(ActivityC0477 activityC0477, final C23761 c23761) {
        if (c23761.f76918 == 0) {
            return;
        }
        activityC0477.m2087(R.string.MT_Protector, c23761.f76919, new InterfaceC1629() { // from class: l.ܶܿܿ
            @Override // l.InterfaceC1629
            public final Object get() {
                int i = ActivityC0477.f2061;
                return c23761.m52424(false);
            }
        }, new RunnableC4196(2, activityC0477));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2104(ActivityC0477 activityC0477, final C23761 c23761) {
        if (c23761.f76918 == 0) {
            return;
        }
        activityC0477.m2087(R.string.MT_Protector, c23761.f76919, new InterfaceC1629() { // from class: l.֨ܿܿ
            @Override // l.InterfaceC1629
            public final Object get() {
                int i = ActivityC0477.f2061;
                return c23761.m52424(true);
            }
        }, new RunnableC22375(1, activityC0477));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2115(boolean z) {
        if (this.f2073) {
            this.f2073 = false;
            this.f2072.mo1669(Boolean.FALSE);
            C23761 c23761 = (C23761) this.f2064.get(this.f2066.m2038());
            if (z) {
                c23761.f76915.notifyDataSetChanged();
            }
            this.f2066.m18195(true);
            C0621 c0621 = new C0621(this.f2063);
            C0621 c0622 = new C0621(this.f2068, this.f2070, this.f2074);
            c0621.setAlpha(0.0f);
            c0621.m2553(0);
            c0622.f2380 = true;
            ObjectAnimator.ofFloat(c0621, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            ObjectAnimator.ofFloat(c0622, "alpha", 1.0f, 0.0f).setDuration(200L).start();
            this.f2067.setOnClickListener(null);
            this.f2069.setOnClickListener(null);
            this.f2076.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m2101(final ActivityC0477 activityC0477, View view) {
        final int iIntValue = ((Integer) view.getTag(R.id.tabLayout)).intValue();
        ArrayList arrayList = activityC0477.f2064;
        if (iIntValue == arrayList.size()) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        c21282.m48306();
        C3060 c3060M48304 = c21282.m48304();
        boolean z = iIntValue > 0;
        boolean z2 = iIntValue < arrayList.size() - 1;
        boolean z3 = arrayList.size() > 1;
        boolean z4 = arrayList.size() > 1;
        c3060M48304.add(0, 1, 0, R.string.MT_Protector).setEnabled(z).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, 2, 0, R.string.MT_Protector).setEnabled(z2).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, 6, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, 3, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, 4, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, 5, 0, R.string.MT_Protector).setEnabled(z4).setIcon(R.drawable.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.ܿܿܿ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC0477.m2091(this.f53447, iIntValue, menuItem);
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2091(final ActivityC0477 activityC0477, final int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
                int i2 = i - 1;
                Collections.swap(C8239.m21821(), i, i2);
                C8239.m21822();
                activityC0477.m2107();
                activityC0477.f2066.m2043(i2);
                break;
            case 2:
                int i3 = i + 1;
                Collections.swap(C8239.m21821(), i, i3);
                C8239.m21822();
                activityC0477.m2107();
                activityC0477.f2066.m2043(i3);
                break;
            case 3:
                activityC0477.m2087(R.string.MT_Protector, i, new InterfaceC1629() { // from class: l.ۢܿܿ
                    @Override // l.InterfaceC1629
                    public final Object get() {
                        int i4 = ActivityC0477.f2061;
                        return ((C5417) ((ArrayList) C8239.m21821()).get(i)).m15500();
                    }
                }, (Runnable) null);
                break;
            case 4:
                C5417 c5417 = (C5417) ((ArrayList) C8239.m21821()).get(i);
                C13261 c13261 = new C13261(activityC0477, activityC0477, c5417);
                c13261.m31258(R.string.MT_Protector);
                c13261.m31250((CharSequence) c5417.m15502());
                c13261.m31281();
                c13261.m31244();
                c13261.m31266(true);
                break;
            case 5:
                String strM14306 = C4925.m14306(R.string.MT_Protector, ((C5417) ((ArrayList) C8239.m21821()).get(i)).m15502());
                C19258 c19258BuildDialog = activityC0477.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44424(strM14306);
                c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡܿܿ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ActivityC0477.m2090(this.f27395, i);
                    }
                });
                c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog.m44438();
                break;
            case 6:
                C12556 c12556 = new C12556(activityC0477, activityC0477, i);
                c12556.m31258(R.string.MT_Protector);
                c12556.m31266(true);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2090(ActivityC0477 activityC0477, int i) {
        ((ArrayList) C8239.m21821()).remove(i);
        C8239.m21822();
        int iM2038 = activityC0477.f2066.m2038();
        activityC0477.m2107();
        if (i <= 0 || iM2038 != i) {
            return;
        }
        activityC0477.f2066.m2043(i - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2087(int i, final int i2, final InterfaceC1629 interfaceC1629, final Runnable runnable) {
        CharSequence[] charSequenceArr = (CharSequence[]) C5378.stream(C8239.m21821()).map(new C23519(1)).toArray(new C16083());
        SpannableString spannableString = new SpannableString(charSequenceArr[i2]);
        spannableString.setSpan(new ForegroundColorSpan(C21943.f70304), 0, spannableString.length(), 33);
        charSequenceArr[i2] = spannableString;
        final int[] iArr = {i2};
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44433(i);
        c19258BuildDialog.m44429(charSequenceArr, i2, new DialogInterfaceOnClickListenerC0081(2, iArr));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖܿܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC0477.m2098(this.f8402, iArr, i2, interfaceC1629, runnable);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2098(ActivityC0477 activityC0477, int[] iArr, int i, InterfaceC1629 interfaceC1629, Runnable runnable) {
        int i2 = iArr[0];
        if (i2 != i) {
            List list = (List) interfaceC1629.get();
            if (!list.isEmpty()) {
                List listM15500 = ((C5417) ((ArrayList) C8239.m21821()).get(i2)).m15500();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ArrayList) listM15500).add(C15293.m36301(((C15293) it.next()).m36305()));
                }
                ((C23761) activityC0477.f2064.get(i2)).f76915.notifyDataSetChanged();
                C8239.m21822();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m2113() {
        for (int i = 0; i < this.f2063.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f2063.getTabAt(i);
            if (tabAt != null) {
                TabLayout.TabView tabView = tabAt.view;
                tabView.setTag(R.id.tabLayout, Integer.valueOf(i));
                tabView.setOnLongClickListener(this.f2075);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m2107() {
        if (this.f2073) {
            m2115(true);
        }
        int size = ((ArrayList) C8239.m21821()).size();
        ArrayList arrayList = this.f2064;
        if (size == arrayList.size()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C23761) it.next()).f76915.notifyDataSetChanged();
            }
            AbstractC12014 abstractC12014M2032 = this.f2066.m2032();
            C11003.requireNonNull(abstractC12014M2032);
            abstractC12014M2032.m29381();
            return;
        }
        while (size > arrayList.size()) {
            arrayList.add(new C23761(this, arrayList.size()));
        }
        while (size < arrayList.size()) {
            C18473.m42953(arrayList, 1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C23761) it2.next()).f76915.notifyDataSetChanged();
        }
        C6659 c6659 = this.f2066;
        if (c6659 != null) {
            int iM2038 = c6659.m2038();
            this.f2066.m2029(new C19529(this));
            if (iM2038 >= 0 && iM2038 < size) {
                this.f2066.m2043(iM2038);
            } else if (iM2038 == size) {
                this.f2066.m2043(iM2038 - 1);
            }
            this.f2066.post(new RunnableC20699(3, this));
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        final MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = menu.findItem(R.id.more);
        this.f2065.m1668(this, new InterfaceC1008() { // from class: l.᩶ܿܿ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                ActivityC0477 activityC0477 = this.f65618;
                menuItemFindItem.setVisible((activityC0477.f2073 || ((Integer) obj).intValue() == activityC0477.f2064.size()) ? false : true);
            }
        });
        this.f2072.m1668(this, new InterfaceC1008() { // from class: l.ᩳܿܿ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                ActivityC0477.m2092(this.f56587, menuItemFindItem, menuItemFindItem2, (Boolean) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2092(ActivityC0477 activityC0477, MenuItem menuItem, MenuItem menuItem2, Boolean bool) {
        menuItem.setVisible((bool.booleanValue() || activityC0477.f2063.getSelectedTabPosition() == activityC0477.f2064.size()) ? false : true);
        menuItem2.setVisible(!bool.booleanValue());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        m2088(menuItem);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2099(ActivityC0477 activityC0477, boolean[] zArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("export", true);
        bundle.putIntegerArrayList("indices", arrayList);
        String string = ApplicationC20075.f65008.getString("tfdp", null);
        String strMo23554 = string == null ? C16293.f50120.mo23554() : C9523.m24406(string);
        String strM24404 = string == null ? "TextFunctions.json" : C9523.m24404(string);
        C13328 c13328 = activityC0477.f2077;
        c13328.getClass();
        C13328.m32310(c13328, R.string.MT_Protector, bundle, strMo23554, strM24404, new String[]{"json"}, 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m2100(C15293 c15293, int i, boolean z, final InterfaceC13041 interfaceC13041) {
        EditText editText;
        View viewM10216 = m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(i);
        final EditText editText2 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner);
        final EditText editText3 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final Button button = (Button) viewM10216.findViewById(R.id.MT_Protector);
        final TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        button.setTag(R.id.MT_Protector, textView);
        final Spinner spinner2 = (Spinner) viewM10216.findViewById(R.id.spinner2);
        EditText editText4 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final Button button2 = (Button) viewM10216.findViewById(R.id.button2);
        final TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        button2.setTag(R.id.MT_Protector, textView2);
        RunnableC22003 runnableC22003 = new RunnableC22003(editText3, editText4, viewM10216.findViewById(R.id.MT_Protector), 1);
        editText2.setText(c15293.m36306());
        C4550 c4550 = C11146.f33464;
        String[] strArr = new String[c4550.size()];
        C11146 c11146 = c15293.f46926;
        int iM27662 = c11146.m27662();
        int i2 = 0;
        for (int i3 = 0; i3 < c4550.size(); i3++) {
            int i4 = c4550.getInt(i3);
            strArr[i3] = C11146.m27658(i4);
            if (i4 == iM27662) {
                i2 = i3;
            }
        }
        spinner.setAdapter((SpinnerAdapter) new C20065(this, strArr));
        spinner.setSelection(i2);
        C11146.m27657(iM27662).mo20431(editText3, textView, button, c11146);
        C4550 c4551 = C11146.f33465;
        String[] strArr2 = new String[c4551.size() + 1];
        strArr2[0] = C4925.m14327(R.string.MT_Protector);
        C11146 c11147 = c15293.f46925;
        int iM27663 = c11147 == null ? -1 : c11147.m27662();
        int i5 = 0;
        int i6 = 0;
        while (i5 < c4551.size()) {
            int i7 = c4551.getInt(i5);
            i5++;
            strArr2[i5] = C11146.m27658(i7);
            if (i7 == iM27663) {
                i6 = i5;
            }
        }
        spinner2.setAdapter((SpinnerAdapter) new C20065(this, strArr2));
        spinner2.setSelection(i6);
        if (c11147 != null) {
            editText = editText4;
            C11146.m27657(iM27663).mo20431(editText, textView2, button2, c11147);
        } else {
            editText = editText4;
            C11146.f33463.mo20430(editText, textView2, button2);
        }
        runnableC22003.run();
        spinner.setOnItemSelectedListener(new C6206(editText3, textView, button, runnableC22003));
        spinner2.setOnItemSelectedListener(new C11851(editText, textView2, button2, runnableC22003));
        button.setOnClickListener(new View.OnClickListener() { // from class: l.ܳܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = ActivityC0477.f2061;
                C11146.m27657(C11146.f33464.getInt(spinner.getSelectedItemPosition())).mo20429((Button) view, this.f44827);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: l.᩻ܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = ActivityC0477.f2061;
                C11146.m27657(C11146.f33465.getInt(spinner2.getSelectedItemPosition() - 1)).mo20429((Button) view, this.f77165);
            }
        });
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (z) {
            C4925.m14329(editText2);
        }
        final EditText editText5 = editText;
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new View.OnClickListener(editText2, spinner, spinner2, editText3, textView, button, editText5, textView2, button2, interfaceC13041, dialogInterfaceC0206M19253) { // from class: l.ۜܿܿ

            /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f21338;

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Spinner f21339;

            /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ InterfaceC13041 f21340;

            /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Button f21341;

            /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f21342;

            /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Button f21343;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ DialogInterfaceC0206 f21344;

            /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ EditText f21345;

            /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ Spinner f21346;

            {
                this.f21343 = button;
                this.f21342 = editText5;
                this.f21341 = button2;
                this.f21340 = interfaceC13041;
                this.f21344 = dialogInterfaceC0206M19253;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C11146 c11146Mo20428;
                int i8 = ActivityC0477.f2061;
                EditText editText6 = this.f21345;
                String string = editText6.getText().toString();
                if (string.isEmpty()) {
                    editText6.requestFocus();
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                Spinner spinner3 = this.f21346;
                int selectedItemPosition = spinner3.getSelectedItemPosition();
                Spinner spinner4 = this.f21339;
                int selectedItemPosition2 = spinner4.getSelectedItemPosition();
                int i9 = C11146.f33464.getInt(selectedItemPosition);
                int i10 = selectedItemPosition2 == 0 ? -1 : C11146.f33465.getInt(selectedItemPosition2 - 1);
                C11146 c11146Mo20429 = C11146.m27657(i9).mo20428(i9, this.f21338, this.f21343);
                if (c11146Mo20429 == null) {
                    return;
                }
                if (i10 == -1) {
                    c11146Mo20428 = null;
                } else {
                    c11146Mo20428 = C11146.m27657(i10).mo20428(i10, this.f21342, this.f21341);
                    if (c11146Mo20428 == null) {
                        return;
                    }
                }
                if (c11146Mo20428 == null || !c11146Mo20428.m27663() || c11146Mo20429.mo14042()) {
                    this.f21340.accept(new C15293(string, c11146Mo20429, c11146Mo20428));
                    this.f21344.dismiss();
                } else {
                    C21374.m48457(R.string.MT_Protector);
                    ActivityC0477.m2112(spinner3);
                    ActivityC0477.m2112(spinner4);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m2112(View view) {
        ObjectAnimator.ofFloat(view, "translationX", 0.0f, -25.0f, 0.0f, 25.0f, 0.0f, -15.0f, 0.0f, 15.0f, 0.0f, -5.0f, 0.0f, 5.0f, 0.0f).setDuration(600L).start();
    }
}
