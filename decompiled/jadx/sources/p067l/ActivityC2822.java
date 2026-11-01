package p067l;

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
import bin.p000mt.plus.R;
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
public class ActivityC2822 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ֨ۧ */
    public static final /* synthetic */ int f4836 = 0;

    /* JADX INFO: renamed from: ۙۢ֫, reason: not valid java name and contains not printable characters */
    private static final short[] f81835;

    /* JADX INFO: renamed from: ֡ۧ */
    public TabLayout f4837;

    /* JADX INFO: renamed from: ۚۧ */
    public C8697 f4840;

    /* JADX INFO: renamed from: ۜۧ */
    public View f4841;

    /* JADX INFO: renamed from: ۡۧ */
    public View f4842;

    /* JADX INFO: renamed from: ۢۧ */
    public View f4843;

    /* JADX INFO: renamed from: ܳۧ */
    public View f4844;

    /* JADX INFO: renamed from: ܺۧ */
    public C6176 f4845;

    /* JADX INFO: renamed from: ᩳۧ */
    public boolean f4847;

    /* JADX INFO: renamed from: ᩴۧ */
    public View f4848;

    /* JADX INFO: renamed from: ᩷ۧ */
    public View f4850;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C15036 f4851;

    /* JADX INFO: renamed from: ۖۧ */
    public final ArrayList f4838 = new ArrayList();

    /* JADX INFO: renamed from: ۘۧ */
    public final C7350 f4839 = new C7350(0);

    /* JADX INFO: renamed from: ܿۧ */
    public final C7350 f4846 = new C7350(Boolean.FALSE);

    /* JADX INFO: renamed from: ᩵ۧ */
    public final ViewOnLongClickListenerC23690 f4849 = new View.OnLongClickListener() { // from class: l.᩹ܿܿ
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return ActivityC2822.m4482(this.f75408, view);
        }
    };

    static {
        ApplicationC14266.m56479(6);
        f81835 = new short[]{9342, 28904, -24929, -22667, -26847, -21320, -31192, -26483, 32347, 29775, -28188, 26963, 31088, 31870, -25984, -24072, 29467, -22120, -27671, 32272, -21843, -28560, -26003, 28801, -25511, 30324, 32341, -20672, 26792, -18497, -26469, -1548, -1559, -1567, -1538, -1565, -1563, -1563, -1545, -1547, -1567, -1541, -1566, -1538, -1537, -18860, 32695, 30803};
    }

    /* JADX INFO: renamed from: ֫ */
    private native void m4469(MenuItem menuItem);

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "TextFunctionBarEditActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        int i = 1;
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC9910(i, this));
        this.f4845 = new C6176(this);
        m4488();
        this.f4844 = m12277(R.id.done);
        this.f4842 = m12277(R.id.menuScrollView);
        this.f4848 = m12277(R.id.MT_Protector);
        this.f4841 = m12277(R.id.MT_Protector);
        this.f4843 = m12277(R.id.MT_Protector);
        this.f4850 = m12277(R.id.MT_Protector);
        this.f4844.setOnClickListener(new ViewOnClickListenerC6045(i, this));
        this.f4837 = (TabLayout) m12277(R.id.tabLayout);
        C8697 c8697 = (C8697) m12277(R.id.MT_Protector);
        this.f4840 = c8697;
        c8697.m4406(new C20929(this));
        this.f4837.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C6926(this));
        this.f4837.setupWithViewPager(this.f4840);
        TabLayout tabLayout = this.f4837;
        tabLayout.setTabIconTint(tabLayout.getTabTextColors());
        this.f4840.m4420(getIntent().getIntExtra("pageIndex", 0));
        final H5PayActivity$$ExternalSyntheticLambda0 h5PayActivity$$ExternalSyntheticLambda0 = new H5PayActivity$$ExternalSyntheticLambda0(this);
        this.f4851 = new C15036(C10423.m24117(this, new InterfaceC21153() { // from class: l.᩹᩵᩷
            @Override // p067l.InterfaceC21153
            /* JADX INFO: renamed from: ֫ */
            public final void mo6900(Intent intent, int i2) {
                String stringExtra;
                if (i2 == 0 || i2 != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("extra");
                C13045.m29861(bundleExtra);
                h5PayActivity$$ExternalSyntheticLambda0.onGetPath(bundleExtra, stringExtra);
            }
        }));
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C5585 c5585 = new C5585(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c5585);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4476(ActivityC2822 activityC2822, AbstractC17043 abstractC17043, int[] iArr) {
        try {
            C10199.m23786(abstractC17043, iArr[0]);
            activityC2822.m4488();
            C22682.m50793(R.string.MT_Protector);
        } catch (Exception e) {
            activityC2822.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.ActivityC0904, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m4494();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m4486(boolean z) {
        if (z) {
            if (this.f4841.isClickable() && this.f4841.getAlpha() == 1.0f) {
                return;
            }
            this.f4841.setClickable(true);
            this.f4843.setClickable(true);
            this.f4850.setClickable(true);
            this.f4841.setAlpha(1.0f);
            this.f4843.setAlpha(1.0f);
            this.f4850.setAlpha(1.0f);
            return;
        }
        if (this.f4841.isClickable() || this.f4841.getAlpha() == 1.0f) {
            this.f4841.setClickable(false);
            this.f4843.setClickable(false);
            this.f4850.setClickable(false);
            this.f4841.setAlpha(0.5f);
            this.f4843.setAlpha(0.5f);
            this.f4850.setAlpha(0.5f);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m4484(final ActivityC2822 activityC2822, int i) {
        C7350 c7350 = activityC2822.f4846;
        activityC2822.f4847 = true;
        c7350.mo4067(Boolean.TRUE);
        final C24951 c24951 = (C24951) activityC2822.f4838.get(activityC2822.f4840.m4415());
        c24951.f79674 = i;
        c24951.f79668 = -2;
        BitSet bitSet = c24951.f79672;
        bitSet.clear();
        if (i != -1) {
            bitSet.set(i);
            c24951.f79670 = 1;
        } else {
            c24951.f79670 = 0;
        }
        c24951.f79667.notifyDataSetChanged();
        activityC2822.f4840.m20143(false);
        C2959 c2959 = new C2959(activityC2822.f4842, activityC2822.f4844, activityC2822.f4848);
        C2959 c29510 = new C2959(activityC2822.f4837);
        c2959.setAlpha(0.0f);
        c2959.m4909(0);
        c29510.f5154 = true;
        ObjectAnimator.ofFloat(c2959, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        ObjectAnimator.ofFloat(c29510, "alpha", 1.0f, 0.0f).setDuration(200L).start();
        activityC2822.m4486(c24951.f79670 > 0);
        activityC2822.f4841.setOnClickListener(new View.OnClickListener() { // from class: l.ۘܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC2822.m4477(this.f15833, c24951);
            }
        });
        activityC2822.f4843.setOnClickListener(new View.OnClickListener() { // from class: l.ᩴܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC2822.m4485(this.f62817, c24951);
            }
        });
        activityC2822.f4850.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC2822.f4836;
                final C24951 c24952 = c24951;
                int i3 = c24952.f79670;
                if (i3 == 0) {
                    return;
                }
                final ActivityC2822 activityC2823 = this.f65949;
                if (i3 != 1) {
                    C20671 c20671BuildDialog = activityC2823.buildDialog();
                    c20671BuildDialog.m46727(R.string.MT_Protector);
                    c20671BuildDialog.m46718(activityC2823.getString(R.string.MT_Protector, Integer.valueOf(c24952.f79670)));
                    c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚܿܿ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            int i5 = ActivityC2822.f4836;
                            c24952.m54833(true);
                            C10199.m23791();
                            activityC2823.m4496(false);
                        }
                    });
                    c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20671BuildDialog.m46732();
                    return;
                }
                int size = ((ArrayList) c24952.m54834()).size();
                final int i4 = 0;
                while (i4 < size) {
                    if (c24952.f79672.get(i4)) {
                        C16903 c16903 = (C16903) ((ArrayList) c24952.m54834()).get(i4);
                        C20671 c20671BuildDialog2 = activityC2823.buildDialog();
                        c20671BuildDialog2.m46727(R.string.MT_Protector);
                        c20671BuildDialog2.m46718(activityC2823.getString(R.string.MT_Protector, c16903.m38467()));
                        c20671BuildDialog2.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܿܿ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = ActivityC2822.f4836;
                                C24951 c24953 = c24952;
                                ArrayList arrayList = (ArrayList) c24953.m54834();
                                int i7 = i4;
                                arrayList.remove(i7);
                                c24953.f79667.notifyItemRemoved(i7);
                                C10199.m23791();
                                activityC2823.m4496(false);
                            }
                        });
                        c20671BuildDialog2.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c20671BuildDialog2.m46732();
                    }
                    i4++;
                }
                i4 = -1;
                C16903 c16904 = (C16903) ((ArrayList) c24952.m54834()).get(i4);
                C20671 c20671BuildDialog3 = activityC2823.buildDialog();
                c20671BuildDialog3.m46727(R.string.MT_Protector);
                c20671BuildDialog3.m46718(activityC2823.getString(R.string.MT_Protector, c16904.m38467()));
                c20671BuildDialog3.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡ܿܿ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        int i6 = ActivityC2822.f4836;
                        C24951 c24953 = c24952;
                        ArrayList arrayList = (ArrayList) c24953.m54834();
                        int i7 = i4;
                        arrayList.remove(i7);
                        c24953.f79667.notifyItemRemoved(i7);
                        C10199.m23791();
                        activityC2823.m4496(false);
                    }
                });
                c20671BuildDialog3.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog3.m46732();
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4477(ActivityC2822 activityC2822, final C24951 c24951) {
        if (c24951.f79670 == 0) {
            return;
        }
        activityC2822.m4468(R.string.MT_Protector, c24951.f79671, new InterfaceC0923() { // from class: l.ܶܿܿ
            @Override // p067l.InterfaceC0923
            public final Object get() {
                int i = ActivityC2822.f4836;
                return c24951.m54833(false);
            }
        }, new RunnableC6357(2, activityC2822));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m4485(ActivityC2822 activityC2822, final C24951 c24951) {
        if (c24951.f79670 == 0) {
            return;
        }
        activityC2822.m4468(R.string.MT_Protector, c24951.f79671, new InterfaceC0923() { // from class: l.֨ܿܿ
            @Override // p067l.InterfaceC0923
            public final Object get() {
                int i = ActivityC2822.f4836;
                return c24951.m54833(true);
            }
        }, new RunnableC23634(1, activityC2822));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4496(boolean z) {
        if (this.f4847) {
            this.f4847 = false;
            this.f4846.mo4067(Boolean.FALSE);
            C24951 c24951 = (C24951) this.f4838.get(this.f4840.m4415());
            if (z) {
                c24951.f79667.notifyDataSetChanged();
            }
            this.f4840.m20143(true);
            C2959 c2959 = new C2959(this.f4837);
            C2959 c29510 = new C2959(this.f4842, this.f4844, this.f4848);
            c2959.setAlpha(0.0f);
            c2959.m4909(0);
            c29510.f5153 = true;
            ObjectAnimator.ofFloat(c2959, "alpha", 0.0f, 1.0f).setDuration(200L).start();
            ObjectAnimator.ofFloat(c29510, "alpha", 1.0f, 0.0f).setDuration(200L).start();
            this.f4841.setOnClickListener(null);
            this.f4843.setOnClickListener(null);
            this.f4850.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4482(final ActivityC2822 activityC2822, View view) {
        final int iIntValue = ((Integer) view.getTag(R.id.tabLayout)).intValue();
        ArrayList arrayList = activityC2822.f4838;
        if (iIntValue == arrayList.size()) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        c1898.m50640();
        C0994 c0994M50638 = c1898.m50638();
        boolean z = iIntValue > 0;
        boolean z2 = iIntValue < arrayList.size() - 1;
        boolean z3 = arrayList.size() > 1;
        boolean z4 = arrayList.size() > 1;
        c0994M50638.add(0, 1, 0, R.string.MT_Protector).setEnabled(z).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, 2, 0, R.string.MT_Protector).setEnabled(z2).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, 6, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, 3, 0, R.string.MT_Protector).setEnabled(z3).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, 4, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, 5, 0, R.string.MT_Protector).setEnabled(z4).setIcon(R.drawable.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ܿܿܿ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC2822.m4472(this.f56635, iIntValue, menuItem);
                return true;
            }
        });
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4472(final ActivityC2822 activityC2822, final int i, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
                int i2 = i - 1;
                Collections.swap(C10199.m23790(), i, i2);
                C10199.m23791();
                activityC2822.m4488();
                activityC2822.f4840.m4420(i2);
                break;
            case 2:
                int i3 = i + 1;
                Collections.swap(C10199.m23790(), i, i3);
                C10199.m23791();
                activityC2822.m4488();
                activityC2822.f4840.m4420(i3);
                break;
            case 3:
                activityC2822.m4468(R.string.MT_Protector, i, new InterfaceC0923() { // from class: l.ۢܿܿ
                    @Override // p067l.InterfaceC0923
                    public final Object get() {
                        int i4 = ActivityC2822.f4836;
                        return ((C7517) ((ArrayList) C10199.m23790()).get(i)).m17411();
                    }
                }, (Runnable) null);
                break;
            case 4:
                C7517 c7517 = (C7517) ((ArrayList) C10199.m23790()).get(i);
                C14972 c14972 = new C14972(activityC2822, activityC2822, c7517);
                c14972.m33344(R.string.MT_Protector);
                c14972.m33336((CharSequence) c7517.m17413());
                c14972.m33367();
                c14972.m33330();
                c14972.m33352(true);
                break;
            case 5:
                String strM16203 = C7050.m16203(R.string.MT_Protector, ((C7517) ((ArrayList) C10199.m23790()).get(i)).m17413());
                C20671 c20671BuildDialog = activityC2822.buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46718(strM16203);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡܿܿ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        ActivityC2822.m4471(this.f30331, i);
                    }
                });
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732();
                break;
            case 6:
                C14302 c14302 = new C14302(activityC2822, activityC2822, i);
                c14302.m33344(R.string.MT_Protector);
                c14302.m33352(true);
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4471(ActivityC2822 activityC2822, int i) {
        ((ArrayList) C10199.m23790()).remove(i);
        C10199.m23791();
        int iM4415 = activityC2822.f4840.m4415();
        activityC2822.m4488();
        if (i <= 0 || iM4415 != i) {
            return;
        }
        activityC2822.f4840.m4420(i - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4468(int i, final int i2, final InterfaceC0923 interfaceC0923, final Runnable runnable) {
        CharSequence[] charSequenceArr = (CharSequence[]) C7480.stream(C10199.m23790()).map(new C24721(1)).toArray(new C17654());
        SpannableString spannableString = new SpannableString(charSequenceArr[i2]);
        spannableString.setSpan(new ForegroundColorSpan(C23223.f73015), 0, spannableString.length(), 33);
        charSequenceArr[i2] = spannableString;
        final int[] iArr = {i2};
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46727(i);
        c20671BuildDialog.m46723(charSequenceArr, i2, new DialogInterfaceOnClickListenerC2445(2, iArr));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖܿܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC2822.m4479(this.f11197, iArr, i2, interfaceC0923, runnable);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4479(ActivityC2822 activityC2822, int[] iArr, int i, InterfaceC0923 interfaceC0923, Runnable runnable) {
        int i2 = iArr[0];
        if (i2 != i) {
            List list = (List) interfaceC0923.get();
            if (!list.isEmpty()) {
                List listM17411 = ((C7517) ((ArrayList) C10199.m23790()).get(i2)).m17411();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ArrayList) listM17411).add(C16903.m38462(((C16903) it.next()).m38466()));
                }
                ((C24951) activityC2822.f4838.get(i2)).f79667.notifyDataSetChanged();
                C10199.m23791();
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ */
    public void m4494() {
        for (int i = 0; i < this.f4837.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f4837.getTabAt(i);
            if (tabAt != null) {
                TabLayout.TabView tabView = tabAt.view;
                tabView.setTag(R.id.tabLayout, Integer.valueOf(i));
                tabView.setOnLongClickListener(this.f4849);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ */
    public void m4488() {
        if (this.f4847) {
            m4496(true);
        }
        int size = ((ArrayList) C10199.m23790()).size();
        ArrayList arrayList = this.f4838;
        if (size == arrayList.size()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C24951) it.next()).f79667.notifyDataSetChanged();
            }
            AbstractC13787 abstractC13787M4409 = this.f4840.m4409();
            C12826.requireNonNull(abstractC13787M4409);
            abstractC13787M4409.m31441();
            return;
        }
        while (size > arrayList.size()) {
            arrayList.add(new C24951(this, arrayList.size()));
        }
        while (size < arrayList.size()) {
            C19925.m45229(arrayList, 1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C24951) it2.next()).f79667.notifyDataSetChanged();
        }
        C8697 c8697 = this.f4840;
        if (c8697 != null) {
            int iM4415 = c8697.m4415();
            this.f4840.m4406(new C20929(this));
            if (iM4415 >= 0 && iM4415 < size) {
                this.f4840.m4420(iM4415);
            } else if (iM4415 == size) {
                this.f4840.m4420(iM4415 - 1);
            }
            this.f4840.post(new RunnableC22041(3, this));
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        final MenuItem menuItemFindItem = menu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = menu.findItem(R.id.more);
        this.f4839.m4066(this, new InterfaceC3326() { // from class: l.᩶ܿܿ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                ActivityC2822 activityC2822 = this.f68293;
                menuItemFindItem.setVisible((activityC2822.f4847 || ((Integer) obj).intValue() == activityC2822.f4838.size()) ? false : true);
            }
        });
        this.f4846.m4066(this, new InterfaceC3326() { // from class: l.ᩳܿܿ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                ActivityC2822.m4473(this.f59800, menuItemFindItem, menuItemFindItem2, (Boolean) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4473(ActivityC2822 activityC2822, MenuItem menuItem, MenuItem menuItem2, Boolean bool) {
        menuItem.setVisible((bool.booleanValue() || activityC2822.f4837.getSelectedTabPosition() == activityC2822.f4838.size()) ? false : true);
        menuItem2.setVisible(!bool.booleanValue());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        m4469(menuItem);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4480(ActivityC2822 activityC2822, boolean[] zArr) {
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
        String string = ApplicationC21448.f67649.getString("tfdp", null);
        String strMo25505 = string == null ? C17853.f53287.mo25505() : C11419.m26416(string);
        String strM26414 = string == null ? "TextFunctions.json" : C11419.m26414(string);
        C15036 c15036 = activityC2822.f4851;
        c15036.getClass();
        C15036.m34410(c15036, R.string.MT_Protector, bundle, strMo25505, strM26414, new String[]{"json"}, 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m4481(C16903 c16903, int i, boolean z, final InterfaceC1489 interfaceC1489) {
        EditText editText;
        View viewM12252 = m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(i);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        final EditText editText3 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final Button button = (Button) viewM12252.findViewById(R.id.MT_Protector);
        final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        button.setTag(R.id.MT_Protector, textView);
        final Spinner spinner2 = (Spinner) viewM12252.findViewById(R.id.spinner2);
        EditText editText4 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final Button button2 = (Button) viewM12252.findViewById(R.id.button2);
        final TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        button2.setTag(R.id.MT_Protector, textView2);
        RunnableC23280 runnableC23280 = new RunnableC23280(editText3, editText4, viewM12252.findViewById(R.id.MT_Protector), 1);
        editText2.setText(c16903.m38467());
        C6693 c6693 = C12962.f36464;
        String[] strArr = new String[c6693.size()];
        C12962 c12962 = c16903.f50053;
        int iM29724 = c12962.m29724();
        int i2 = 0;
        for (int i3 = 0; i3 < c6693.size(); i3++) {
            int i4 = c6693.getInt(i3);
            strArr[i3] = C12962.m29720(i4);
            if (i4 == iM29724) {
                i2 = i3;
            }
        }
        spinner.setAdapter((SpinnerAdapter) new C21438(this, strArr));
        spinner.setSelection(i2);
        C12962.m29719(iM29724).mo22410(editText3, textView, button, c12962);
        C6693 c6694 = C12962.f36465;
        String[] strArr2 = new String[c6694.size() + 1];
        strArr2[0] = C7050.m16224(R.string.MT_Protector);
        C12962 c12963 = c16903.f50052;
        int iM29725 = c12963 == null ? -1 : c12963.m29724();
        int i5 = 0;
        int i6 = 0;
        while (i5 < c6694.size()) {
            int i7 = c6694.getInt(i5);
            i5++;
            strArr2[i5] = C12962.m29720(i7);
            if (i7 == iM29725) {
                i6 = i5;
            }
        }
        spinner2.setAdapter((SpinnerAdapter) new C21438(this, strArr2));
        spinner2.setSelection(i6);
        if (c12963 != null) {
            editText = editText4;
            C12962.m29719(iM29725).mo22410(editText, textView2, button2, c12963);
        } else {
            editText = editText4;
            C12962.f36463.mo22409(editText, textView2, button2);
        }
        runnableC23280.run();
        spinner.setOnItemSelectedListener(new C8267(editText3, textView, button, runnableC23280));
        spinner2.setOnItemSelectedListener(new C13632(editText, textView2, button2, runnableC23280));
        button.setOnClickListener(new View.OnClickListener() { // from class: l.ܳܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = ActivityC2822.f4836;
                C12962.m29719(C12962.f36464.getInt(spinner.getSelectedItemPosition())).mo22408((Button) view, this.f47937);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: l.᩻ܿܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = ActivityC2822.f4836;
                C12962.m29719(C12962.f36465.getInt(spinner2.getSelectedItemPosition() - 1)).mo22408((Button) view, this.f79915);
            }
        });
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        if (z) {
            C7050.m16226(editText2);
        }
        final EditText editText5 = editText;
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new View.OnClickListener(editText2, spinner, spinner2, editText3, textView, button, editText5, textView2, button2, interfaceC1489, dialogInterfaceC2564M21200) { // from class: l.ۜܿܿ

            /* JADX INFO: renamed from: ۗ */
            public final /* synthetic */ EditText f24217;

            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ Spinner f24218;

            /* JADX INFO: renamed from: ۛ */
            public final /* synthetic */ InterfaceC1489 f24219;

            /* JADX INFO: renamed from: ۤ */
            public final /* synthetic */ Button f24220;

            /* JADX INFO: renamed from: ۫ */
            public final /* synthetic */ EditText f24221;

            /* JADX INFO: renamed from: ۬ */
            public final /* synthetic */ Button f24222;

            /* JADX INFO: renamed from: ᩶ */
            public final /* synthetic */ DialogInterfaceC2564 f24223;

            /* JADX INFO: renamed from: ᩸ */
            public final /* synthetic */ EditText f24224;

            /* JADX INFO: renamed from: ᩹ */
            public final /* synthetic */ Spinner f24225;

            {
                this.f24222 = button;
                this.f24221 = editText5;
                this.f24220 = button2;
                this.f24219 = interfaceC1489;
                this.f24223 = dialogInterfaceC2564M21200;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12962 c12962Mo22407;
                int i8 = ActivityC2822.f4836;
                EditText editText6 = this.f24224;
                String string = editText6.getText().toString();
                if (string.isEmpty()) {
                    editText6.requestFocus();
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                Spinner spinner3 = this.f24225;
                int selectedItemPosition = spinner3.getSelectedItemPosition();
                Spinner spinner4 = this.f24218;
                int selectedItemPosition2 = spinner4.getSelectedItemPosition();
                int i9 = C12962.f36464.getInt(selectedItemPosition);
                int i10 = selectedItemPosition2 == 0 ? -1 : C12962.f36465.getInt(selectedItemPosition2 - 1);
                C12962 c12962Mo22408 = C12962.m29719(i9).mo22407(i9, this.f24217, this.f24222);
                if (c12962Mo22408 == null) {
                    return;
                }
                if (i10 == -1) {
                    c12962Mo22407 = null;
                } else {
                    c12962Mo22407 = C12962.m29719(i10).mo22407(i10, this.f24221, this.f24220);
                    if (c12962Mo22407 == null) {
                        return;
                    }
                }
                if (c12962Mo22407 == null || !c12962Mo22407.m29725() || c12962Mo22408.mo15922()) {
                    this.f24219.accept(new C16903(string, c12962Mo22408, c12962Mo22407));
                    this.f24223.dismiss();
                } else {
                    C22682.m50793(R.string.MT_Protector);
                    ActivityC2822.m4493(spinner3);
                    ActivityC2822.m4493(spinner4);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m4493(View view) {
        ObjectAnimator.ofFloat(view, "translationX", 0.0f, -25.0f, 0.0f, 25.0f, 0.0f, -15.0f, 0.0f, 15.0f, 0.0f, -5.0f, 0.0f, 5.0f, 0.0f).setDuration(600L).start();
    }
}
