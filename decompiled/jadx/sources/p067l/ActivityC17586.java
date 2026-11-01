package p067l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܺܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC17586 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۫ۧ */
    public static final int[] f52552 = {-16777216, -1, -7829368};

    /* JADX INFO: renamed from: ۬ۧ */
    public static final /* synthetic */ int f52553 = 0;

    /* JADX INFO: renamed from: ֡ۧ */
    public TextView f52554;

    /* JADX INFO: renamed from: ֨ۧ */
    public C21831 f52555;

    /* JADX INFO: renamed from: ۖۧ */
    public boolean f52556;

    /* JADX INFO: renamed from: ۗۧ */
    public boolean f52557;

    /* JADX INFO: renamed from: ۘۧ */
    public boolean f52558;

    /* JADX INFO: renamed from: ۙۧ */
    public boolean f52559;

    /* JADX INFO: renamed from: ۜۧ */
    public boolean f52561;

    /* JADX INFO: renamed from: ۠ۧ */
    public View f52562;

    /* JADX INFO: renamed from: ۡۧ */
    public float f52563;

    /* JADX INFO: renamed from: ۢۧ */
    public CheckBox f52564;

    /* JADX INFO: renamed from: ܳۧ */
    public int f52565;

    /* JADX INFO: renamed from: ܶۧ */
    public AtomicBoolean f52566;

    /* JADX INFO: renamed from: ܺۧ */
    public MenuItem f52567;

    /* JADX INFO: renamed from: ܿۧ */
    public ValueAnimator f52568;

    /* JADX INFO: renamed from: ᩴۧ */
    public InterfaceC5264 f52570;

    /* JADX INFO: renamed from: ᩵ۧ */
    public AbstractC14651 f52571;

    /* JADX INFO: renamed from: ᩶ۧ */
    public C10882 f52572;

    /* JADX INFO: renamed from: ᩷ۧ */
    public View f52573;

    /* JADX INFO: renamed from: ᩸ۧ */
    public C14853 f52574;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f52576;

    /* JADX INFO: renamed from: ᩹ۧ */
    public final ArrayList f52575 = new ArrayList();

    /* JADX INFO: renamed from: ۚۧ */
    public AtomicBoolean f52560 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩳۧ */
    public int f52569 = 255;

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ۘ */
    public final int mo9138() {
        return 2;
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "ImageViewerActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f13389 = false;
        setTheme(R.style.MT_Protector);
        super.onCreate(bundle);
        this.f52572 = (C10882) new C6874(this).m15765(C10882.class);
        m12277(R.layout.MT_Protector);
        this.f52571 = (AbstractC14651) m12277(R.id.MT_Protector);
        boolean z = true;
        if (!this.f52572.f30147) {
            boolean z2 = ApplicationC21448.f67649.getBoolean("pvc", false);
            C10882 c10882 = this.f52572;
            if (bundle != null) {
                z2 = bundle.getBoolean("gallery.continuous", z2);
            }
            c10882.f30149 = z2;
            this.f52572.f30147 = true;
        }
        if (this.f52572.f30149) {
            m40017();
        }
        this.f52573 = m12277(R.id.MT_Protector);
        this.f13392 = (C1326) m12277(R.id.MT_Protector);
        this.f52564 = (CheckBox) m12277(R.id.MT_Protector);
        this.f52554 = (TextView) m12277(R.id.MT_Protector);
        this.f52562 = m12277(R.id.MT_Protector);
        m12263(this.f13392);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC18257(0, this));
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = i >= 30 ? 3 : 1;
            window.setAttributes(attributes);
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        C1087.m16291(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        C1459 c1459M12280 = m12280();
        c1459M12280.m32668(false);
        c1459M12280.m32665(false);
        c1459M12280.m32667(2);
        C1717.m43556(m12277(R.id.MT_Protector), new C18191(5, this));
        int i2 = ApplicationC21448.f67649.getInt("pvbi", 0);
        this.f52576 = i2;
        if (i2 < 0 || i2 >= 3) {
            this.f52576 = 0;
        }
        m40040();
        C11553 c11553 = new C11553(this);
        this.f52570 = c11553;
        this.f52571.mo16688(c11553);
        this.f52564.setSaveEnabled(false);
        this.f52564.setContentDescription(getString(R.string.MT_Protector));
        this.f52564.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩳܶۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                ActivityC17586.m40015(this.f59622, z3);
            }
        });
        this.f52562.setContentDescription(getString(R.string.MT_Protector));
        this.f52562.setOnClickListener(new ViewOnClickListenerC18928(this, 0));
        this.f52562.setEnabled(false);
        this.f52564.setVisibility(8);
        this.f52554.setText(R.string.MT_Protector);
        if (bundle != null) {
            m40043(false);
        }
        getOnBackPressedDispatcher().m30943(this, new C22282(this));
        C10882 c10883 = this.f52572;
        if (c10883.f30143 != null) {
            m40029();
            return;
        }
        if (bundle != null) {
            c10883.f30146 = bundle.getBoolean("gallery.internal");
            this.f52572.f30148 = bundle.getString("gallery.path");
            this.f52572.f30145 = bundle.getBundle("gallery.viewport");
            this.f52572.f30142 = bundle.getBoolean("gallery.bars", true);
            if (this.f52572.f30146) {
                String string = bundle.getString("gallery.localUri");
                if (string == null) {
                    m40021();
                    return;
                }
                this.f52572.f30144 = Uri.parse(string);
                ArrayList<String> stringArrayList = bundle.getStringArrayList("gallery.selected");
                if (stringArrayList != null) {
                    for (String str : stringArrayList) {
                        if (this.f52572.f30150.add(str)) {
                            this.f52572.f30151.add(str);
                        }
                    }
                }
                C4081.f8987.execute(new RunnableC24963(this, z, this.f52572.f30144, new ArrayList(this.f52572.f30151), this.f52560));
                return;
            }
        }
        m40027(bundle == null);
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.f52556 = true;
        if (this.f52563 <= 0.0f || this.f52558 || isFinishing() || isDestroyed()) {
            return;
        }
        m40043(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40014(ActivityC17586 activityC17586, C1914 c1914) {
        C1388 c1388M51175 = c1914.m51175(135);
        C1326 c1326 = activityC17586.f13392;
        int i = c1388M51175.f36103;
        int i2 = c1388M51175.f36105;
        int i3 = c1388M51175.f36104;
        c1326.setPadding(i, i2, i3, 0);
        activityC17586.f52573.setPadding(c1388M51175.f36103, 0, i3, c1388M51175.f36102);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40015(ActivityC17586 activityC17586, boolean z) {
        InterfaceC19370 interfaceC19370M40030;
        if (activityC17586.f52557) {
            return;
        }
        C10882 c10882 = activityC17586.f52572;
        if (!c10882.f30146 || c10882.f30143 == null || (interfaceC19370M40030 = activityC17586.m40030()) == null) {
            return;
        }
        if (z) {
            activityC17586.f52572.f30150.add(interfaceC19370M40030.getPath());
        } else {
            activityC17586.f52572.f30150.remove(interfaceC19370M40030.getPath());
            activityC17586.f52572.f30151.remove(interfaceC19370M40030.getPath());
        }
        activityC17586.m40050();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m40027(boolean z) {
        Intent intent = getIntent();
        boolean z2 = false;
        C4847 c4847 = (z && (intent.getComponent() != null && getClass().getName().equals(intent.getComponent().getClassName())) && intent.getData() == null) ? (C4847) C5178.m11084("ImageViewerArguments") : null;
        if (c4847 != null) {
            if (c4847.m10275() == null || c4847.m10274() == null || c4847.m10274().isEmpty() || c4847.m10273() < 0 || c4847.m10273() >= c4847.m10274().size()) {
                m40021();
                return;
            }
            Iterator it = c4847.m10274().iterator();
            while (it.hasNext()) {
                if (((InterfaceC19370) it.next()) == null) {
                    m40021();
                    return;
                }
            }
            this.f52572.f30143 = new C4847(c4847.m10275(), new ArrayList(c4847.m10274()), c4847.m10273());
            C10882 c10882 = this.f52572;
            c10882.f30146 = true;
            c10882.f30148 = m40042(c4847.m10273()).getPath();
            m40029();
            return;
        }
        C4081.f8987.execute(new RunnableC24963(this, z2, intent.getData(), new ArrayList(this.f52572.f30151), this.f52560));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40011(ActivityC17586 activityC17586, AtomicBoolean atomicBoolean, C4847 c4847) {
        if (atomicBoolean.get() || activityC17586.isFinishing() || activityC17586.isDestroyed()) {
            return;
        }
        activityC17586.f52572.f30143 = c4847;
        activityC17586.m40029();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40010(ActivityC17586 activityC17586, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get() || activityC17586.isFinishing() || activityC17586.isDestroyed()) {
            return;
        }
        activityC17586.m40021();
    }

    /* JADX INFO: renamed from: ֫֫ */
    private void m40017() {
        AbstractC14651 abstractC14651 = this.f52571;
        ViewGroup viewGroup = (ViewGroup) abstractC14651.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(abstractC14651);
        AbstractC14651 c7276 = this.f52572.f30149 ? new C7276(this) : new C10172(this, null);
        this.f52571 = c7276;
        c7276.setId(R.id.MT_Protector);
        this.f52571.mo16688(this.f52570);
        viewGroup.removeView(abstractC14651);
        viewGroup.addView(this.f52571, iIndexOfChild, abstractC14651.getLayoutParams());
    }

    /* JADX INFO: renamed from: ۨ */
    private void m40029() {
        ArrayList arrayList;
        C4847 c4847 = this.f52572.f30143;
        int iM10273 = c4847.m10273();
        if (this.f52572.f30148 != null) {
            iM10273 = 0;
            while (true) {
                if (iM10273 >= c4847.m10274().size()) {
                    iM10273 = -1;
                    break;
                } else if (this.f52572.f30148.equals(m40042(iM10273).getPath())) {
                    break;
                } else {
                    iM10273++;
                }
            }
        }
        if (iM10273 < 0 || iM10273 >= c4847.m10274().size()) {
            m40021();
            return;
        }
        try {
            Iterator it = c4847.m10274().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f52575;
                if (!zHasNext) {
                    break;
                }
                arrayList.add(AbstractC24196.m53498(this, c4847.m10275(), (InterfaceC19370) it.next()));
            }
            C21831 c21831 = new C21831(this, arrayList);
            this.f52555 = c21831;
            c21831.m49249(getLifecycle().mo21805().m35142(EnumC15415.RESUMED));
            this.f52555.m49247(new RunnableC8805(2, this));
            this.f52555.m49248(this.f52571, iM10273);
            Bundle bundle = this.f52572.f30145;
            if (bundle != null) {
                this.f52571.mo16692(bundle);
            }
            this.f52572.f30148 = m40042(iM10273).getPath();
            m40037(this.f52572.f30142);
            m40050();
        } catch (RuntimeException unused) {
            m40021();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC19370 m40042(int i) {
        return (InterfaceC19370) this.f52572.f30143.m10274().get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ */
    public InterfaceC19370 m40030() {
        int iMo16693 = this.f52571.mo16693();
        C4847 c4847 = this.f52572.f30143;
        if (c4847 == null || iMo16693 < 0 || iMo16693 >= c4847.m10274().size()) {
            return null;
        }
        return m40042(iMo16693);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻֫ */
    public void m40050() {
        InterfaceC19370 interfaceC19370M40030 = m40030();
        if (interfaceC19370M40030 == null) {
            return;
        }
        int iMo16693 = this.f52571.mo16693();
        setTitle(interfaceC19370M40030.getName());
        String str = String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(iMo16693 + 1), Integer.valueOf(this.f52575.size()));
        this.f52554.setText(str);
        this.f52571.setContentDescription(interfaceC19370M40030.getName() + " " + str);
        C16819 c16819M49245 = this.f52555.m49245(iMo16693);
        if (c16819M49245 == null) {
            this.f13392.setSubtitle(this.f52555.m49252(iMo16693) ? getString(R.string.MT_Protector) : null);
        } else {
            int i = c16819M49245.f49783;
            int i2 = c16819M49245.f49784;
            C13468 c13468 = c16819M49245.f49789;
            long time = c16819M49245.f49782;
            if (time < 0) {
                time = c13468.f37802;
            }
            if (time <= 0) {
                time = interfaceC19370M40030.getTime();
            }
            long j = c13468.f37803;
            String strM53419 = j >= 0 ? C24158.m53419(j) : null;
            int i3 = c16819M49245.f49788;
            int i4 = i3 >= 5 ? i2 : i;
            if (i3 < 5) {
                i = i2;
            }
            Locale locale = Locale.ENGLISH;
            String strM46928 = C20780.m46928(MotionUtils.EASING_TYPE_FORMAT_START, i4, "x", MotionUtils.EASING_TYPE_FORMAT_END, i);
            if (!C8597.m20012(interfaceC19370M40030)) {
                strM53419 = strM53419 == null ? strM46928 : C24104.m53357(strM53419, EnumC2483.f3919, strM46928);
            } else if (strM53419 == null) {
                strM53419 = "";
            }
            C1326 c1326 = this.f13392;
            if (time > 0) {
                strM53419 = C18794.m42823(time) + EnumC2483.f3919 + strM53419;
            }
            c1326.setSubtitle(strM53419);
        }
        this.f52557 = true;
        this.f52564.setVisibility(this.f52572.f30146 ? 0 : 8);
        this.f52564.setChecked(this.f52572.f30150.contains(interfaceC19370M40030.getPath()));
        this.f52564.setText(this.f52572.f30150.isEmpty() ? null : String.valueOf(this.f52572.f30150.size()));
        this.f52557 = false;
        this.f52562.setEnabled(this.f52566 == null);
        m40044();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m40037(boolean z) {
        this.f52572.f30142 = z;
        this.f13392.setVisibility(z ? 0 : 4);
        this.f52573.setVisibility(z ? 0 : 4);
        m40032();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫ */
    public void m40032() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (this.f52572.f30142 || this.f52563 > 0.0f || this.f52558) {
            m12280().m32669(7);
        } else {
            m12280().m32664(7);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        this.f52567 = menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        menu.add(0, R.id.more, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        m40044();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    private void m40044() {
        C21831 c21831;
        InterfaceC19370 interfaceC19370M40030 = m40030();
        MenuItem menuItem = this.f52567;
        if (menuItem != null) {
            menuItem.setVisible((interfaceC19370M40030 instanceof C11450) && ((C17278) interfaceC19370M40030).getName().toLowerCase(Locale.ROOT).endsWith(".9.png") && (c21831 = this.f52555) != null && c21831.m49245(this.f52571.mo16693()) != null);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.more) {
            C1898 c1898M48010 = C1828.m48010(this.f13392.findViewById(R.id.more));
            C0994 c0994M50638 = c1898M48010.m50638();
            C1484.m33529(c0994M50638, R.string.MT_Protector);
            c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setCheckable(true).setChecked(!this.f52572.f30149);
            c0994M50638.add(0, R.string.MT_Protector, 1, R.string.MT_Protector).setCheckable(true).setChecked(this.f52572.f30149);
            c0994M50638.setGroupCheckable(0, true, true);
            c1898M48010.m50636(new C16245(this));
            C1784.m46107(C1828.m48009(c1898M48010));
            return true;
        }
        if (menuItem.getItemId() == R.string.MT_Protector || menuItem.getItemId() == R.string.MT_Protector) {
            menuItem.setChecked(true);
            boolean z = menuItem.getItemId() == R.string.MT_Protector;
            if (this.f52572.f30149 != z && this.f52555 != null && !this.f52558) {
                m40048();
                int iMo16693 = this.f52571.mo16693();
                C10882 c10882 = this.f52572;
                c10882.f30149 = z;
                c10882.f30145 = null;
                m40017();
                this.f52555.m49251(this.f52571, iMo16693);
                m40040();
                m40050();
                ApplicationC21448.f67649.edit().putBoolean("pvc", z).apply();
                invalidateOptionsMenu();
            }
        } else {
            if (menuItem.getItemId() == R.string.MT_Protector) {
                this.f52576 = (this.f52576 + 1) % 3;
                m40040();
                ApplicationC21448.f67649.edit().mo27875(this.f52576, "pvbi").apply();
                return true;
            }
            if (menuItem.getItemId() == R.string.MT_Protector) {
                InterfaceC19370 interfaceC19370M40030 = m40030();
                if ((interfaceC19370M40030 instanceof C11450) && ((C17278) interfaceC19370M40030).getName().toLowerCase(Locale.ROOT).endsWith(".9.png")) {
                    AbstractC17043 abstractC17043Mo26445 = ((C11450) interfaceC19370M40030).mo26445();
                    startActivity(new Intent(this, (Class<?>) ActivityC17598.class).setAction("android.intent.action.VIEW").setData(abstractC17043Mo26445.mo33653() ? abstractC17043Mo26445.mo33652() : abstractC17043Mo26445.m38680()));
                    return true;
                }
            } else {
                return super.onOptionsItemSelected(menuItem);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m40035(ActivityC17586 activityC17586, int i) {
        ArrayList arrayList = activityC17586.f52575;
        if (activityC17586.f52555 == null || activityC17586.f52558 || activityC17586.isFinishing() || i < 0 || i >= arrayList.size()) {
            return;
        }
        InterfaceC19370 interfaceC19370M40042 = activityC17586.m40042(i);
        if (C8597.m20012(interfaceC19370M40042)) {
            ArrayList arrayList2 = new ArrayList();
            int size = -1;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (C8597.m20012(activityC17586.m40042(i2))) {
                    if (i2 == i) {
                        size = arrayList2.size();
                    }
                    arrayList2.add(activityC17586.m40042(i2));
                }
            }
            activityC17586.m40048();
            C5178.m11082(ActivityC17586.class, new C4847(activityC17586.f52572.f30143.m10275(), arrayList2, size), "VideoPlayerArguments");
            Intent intent = new Intent(activityC17586, (Class<?>) ActivityC12088.class);
            ActivityC12088.m27717(activityC17586, intent, activityC17586.f52572.f30143.m10275(), interfaceC19370M40042);
            activityC17586.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m40034(final ActivityC17586 activityC17586) {
        ArrayList arrayList = activityC17586.f52575;
        if (activityC17586.f52555 == null || activityC17586.f52566 != null || activityC17586.m40030() == null) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (activityC17586.f52572.f30150.contains(activityC17586.m40042(i).getPath())) {
                arrayList2.add((AbstractC24196) arrayList.get(i));
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add((AbstractC24196) arrayList.get(activityC17586.f52571.mo16693()));
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        activityC17586.f52566 = atomicBoolean;
        final C14853 c14853 = new C14853(activityC17586, R.string.MT_Protector);
        activityC17586.f52574 = c14853;
        c14853.m33952(new RunnableC8368(4, atomicBoolean));
        c14853.m33958(200);
        activityC17586.f52562.setEnabled(false);
        C4081.f8987.execute(new Runnable() { // from class: l.᩺۠ۜ
            @Override // java.lang.Runnable
            public final void run() {
                final ActivityC17586 activityC17587 = this.f76493;
                final ArrayList arrayList3 = arrayList2;
                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                final C14853 c14854 = c14853;
                int i2 = ActivityC17586.f52553;
                try {
                    final C5737 c5737M34539 = C15124.m34539(arrayList3, new C8870(atomicBoolean2));
                    activityC17587.runOnUiThread(new Runnable() { // from class: l.ܰ۠ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC17586.m40013(activityC17587, c14854, atomicBoolean2, c5737M34539, arrayList3);
                        }
                    });
                } catch (Exception e) {
                    activityC17587.runOnUiThread(new RunnableC9345(activityC17587, c14854, atomicBoolean2, e));
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40013(ActivityC17586 activityC17586, C14853 c14853, AtomicBoolean atomicBoolean, C5737 c5737, ArrayList arrayList) {
        String str;
        c14853.m33949();
        if (activityC17586.f52566 == atomicBoolean) {
            activityC17586.f52566 = null;
            activityC17586.f52574 = null;
        }
        try {
            try {
                if (!atomicBoolean.get() && !activityC17586.isFinishing() && !activityC17586.isDestroyed()) {
                    C1691 c1691 = new C1691(activityC17586);
                    c1691.m42384();
                    Iterator it = arrayList.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (((AbstractC24196) it.next()).m53501()) {
                            z2 = true;
                        } else {
                            z = true;
                        }
                    }
                    if (z && z2) {
                        str = "*/*";
                    } else {
                        str = z2 ? "video/*" : "image/*";
                    }
                    c1691.m42388(str);
                    Iterator it2 = c5737.m12743().iterator();
                    while (it2.hasNext()) {
                        c1691.m42385((Uri) it2.next());
                    }
                    c1691.m42387();
                    c5737.m12744();
                    c5737.close();
                    if (activityC17586.isDestroyed()) {
                        return;
                    }
                    activityC17586.m40050();
                    return;
                }
                c5737.close();
                if (activityC17586.isDestroyed()) {
                    return;
                }
                activityC17586.m40050();
            } catch (Exception unused) {
                C22682.m50793(R.string.MT_Protector);
            } finally {
                if (!activityC17586.isDestroyed()) {
                    activityC17586.m40050();
                }
            }
        } catch (Throwable th) {
            try {
                c5737.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40012(ActivityC17586 activityC17586, C14853 c14853, AtomicBoolean atomicBoolean) {
        c14853.m33949();
        if (activityC17586.f52566 == atomicBoolean) {
            activityC17586.f52566 = null;
            activityC17586.f52574 = null;
        }
        if (!atomicBoolean.get() && !activityC17586.isFinishing() && !activityC17586.isDestroyed()) {
            C22682.m50793(R.string.MT_Protector);
        }
        if (activityC17586.isDestroyed()) {
            return;
        }
        activityC17586.m40050();
    }

    /* JADX INFO: renamed from: ۟ */
    private void m40021() {
        C22682.m50793(R.string.MT_Protector);
        finish();
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m40018(ActivityC17586 activityC17586) {
        activityC17586.m40016(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40025(ActivityC17586 activityC17586) {
        activityC17586.m40016(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m40016(boolean z) {
        AbstractC5769 abstractC5769M33131;
        if (isFinishing() || this.f52558) {
            return;
        }
        C10882 c10882 = this.f52572;
        if (c10882 != null && c10882.f30146 && c10882.f30143 != null) {
            ArrayList arrayListM40028 = m40028();
            Intent intentPutExtra = new Intent().putExtra("gallery.currentPath", this.f52572.f30148);
            if (!arrayListM40028.isEmpty()) {
                intentPutExtra.putStringArrayListExtra("paths", arrayListM40028);
            }
            setResult(-1, intentPutExtra);
        }
        this.f52558 = true;
        InterfaceC19370 interfaceC19370M40030 = m40030();
        if (interfaceC19370M40030 != null) {
            if (!(this.f52572.f30143.m10275() instanceof C4744)) {
                AbstractC15599 abstractC15599M10275 = this.f52572.f30143.m10275();
                if ((abstractC15599M10275 instanceof AbstractC5375) && (abstractC5769M33131 = C14486.m33131(((AbstractC5375) abstractC15599M10275).m11734().f14161)) != null) {
                    C10987.m25348(interfaceC19370M40030.getPath(), new C19033(abstractC5769M33131, false));
                }
            } else if (!(interfaceC19370M40030.mo26445() instanceof C16433)) {
                String path = interfaceC19370M40030.getPath();
                C10987 c10987 = C10987.f30433;
                C13045.m29867(path, MotionUtils.EASING_TYPE_PATH);
                C10987.m25348(path, (C19033) null);
            }
        }
        ValueAnimator valueAnimator = this.f52568;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52568 = null;
        }
        m40032();
        if (!z) {
            this.f52571.mo16686();
            if (this.f52559) {
                m40043(false);
            }
        }
        finish();
        if (z) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    private void m40040() {
        this.f52571.mo16696(f52552[this.f52576]);
        m40038();
    }

    /* JADX INFO: renamed from: ܽ֫ */
    private void m40038() {
        int i;
        View viewM12277 = m12277(R.id.MT_Protector);
        int i2 = this.f52569;
        if (i2 == 0) {
            i = 0;
        } else {
            i = (i2 << 24) | (f52552[this.f52576] & 16777215);
        }
        viewM12277.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40009(ActivityC17586 activityC17586, ValueAnimator valueAnimator) {
        activityC17586.f52569 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        activityC17586.m40038();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        ValueAnimator valueAnimator = this.f52568;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52568 = null;
        }
        this.f52560.set(true);
        AtomicBoolean atomicBoolean = this.f52566;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C14853 c14853 = this.f52574;
        if (c14853 != null) {
            c14853.m33949();
        }
        C21831 c21831 = this.f52555;
        if (c21831 != null) {
            c21831.close();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m40043(boolean z) {
        if (z && this.f52559) {
            return;
        }
        final int i = this.f52565 + 1;
        this.f52565 = i;
        ValueAnimator valueAnimator = this.f52568;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52568 = null;
        }
        this.f52561 = false;
        this.f52569 = 255;
        m40040();
        try {
            if (z) {
                Class<?> cls = Class.forName("android.app.Activity$TranslucentConversionListener");
                Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class).invoke(this, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: l.ۧܶۜ
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        int i2 = ActivityC17586.f52553;
                        if (!method.getName().equals("onTranslucentConversionComplete") || objArr == null || !Boolean.TRUE.equals(objArr[0])) {
                            return null;
                        }
                        int i3 = i;
                        ActivityC17586 activityC17586 = this.f36254;
                        activityC17586.runOnUiThread(new RunnableC13338(i3, 1, activityC17586));
                        return null;
                    }
                }), null);
            } else if (Build.VERSION.SDK_INT >= 30) {
                setTranslucent(false);
            } else {
                Activity.class.getDeclaredMethod("convertFromTranslucent", null).invoke(this, null);
            }
            this.f52559 = z;
        } catch (ReflectiveOperationException | RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40008(final ActivityC17586 activityC17586, int i) {
        if (i != activityC17586.f52565 || activityC17586.f52558 || activityC17586.isFinishing() || activityC17586.isDestroyed() || activityC17586.f52561) {
            return;
        }
        activityC17586.f52561 = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(activityC17586.f52569, 0);
        activityC17586.f52568 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(180L);
        activityC17586.f52568.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.֫ܶۜ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActivityC17586.m40009(this.f9196, valueAnimator);
            }
        });
        activityC17586.f52568.start();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private ArrayList m40028() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : this.f52572.f30151) {
            if (this.f52572.f30150.contains(str) && hashSet.add(str)) {
                arrayList.add(str);
            }
        }
        C4847 c4847 = this.f52572.f30143;
        if (c4847 != null) {
            for (InterfaceC19370 interfaceC19370 : c4847.m10274()) {
                if (this.f52572.f30150.contains(interfaceC19370.getPath()) && hashSet.add(interfaceC19370.getPath())) {
                    arrayList.add(interfaceC19370.getPath());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩺ */
    private void m40048() {
        if (this.f52555 == null || m40030() == null) {
            return;
        }
        this.f52572.f30148 = m40030().getPath();
        this.f52572.f30145 = this.f52571.mo16695();
        C10882 c10882 = this.f52572;
        c10882.f30144 = (c10882.f30146 && c10882.f30143.m10275() == C4744.f10749 && (m40030() instanceof C11450) && m40030().mo26445().mo38688()) ? m40030().mo26445().m38680() : null;
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Uri uri;
        m40048();
        bundle.putBoolean("gallery.internal", this.f52572.f30146);
        bundle.putString("gallery.path", this.f52572.f30148);
        bundle.putBundle("gallery.viewport", this.f52572.f30145);
        bundle.putBoolean("gallery.bars", this.f52572.f30142);
        bundle.putBoolean("gallery.continuous", this.f52572.f30149);
        C10882 c10882 = this.f52572;
        if (c10882.f30146 && (uri = c10882.f30144) != null) {
            bundle.putString("gallery.localUri", uri.toString());
            bundle.putStringArrayList("gallery.selected", m40028());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        C21831 c21831 = this.f52555;
        if (c21831 != null) {
            c21831.m49249(true);
        }
    }

    @Override // p067l.ActivityC2023, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C21831 c21831 = this.f52555;
        if (c21831 == null || i == 20) {
            return;
        }
        c21831.m49253();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        C21831 c21831 = this.f52555;
        if (c21831 != null) {
            c21831.m49253();
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onPause() {
        m40048();
        C21831 c21831 = this.f52555;
        if (c21831 != null) {
            c21831.m49249(false);
        }
        this.f52571.mo16686();
        super.onPause();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onStop() {
        AtomicBoolean atomicBoolean = this.f52566;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C14853 c14853 = this.f52574;
        if (c14853 != null) {
            c14853.m33949();
        }
        super.onStop();
    }

    @Override // p067l.ActivityC2023, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f52558 = false;
        this.f52560.set(true);
        this.f52560 = new AtomicBoolean();
        AtomicBoolean atomicBoolean = this.f52566;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C21831 c21831 = this.f52555;
        if (c21831 != null) {
            c21831.close();
        }
        this.f52555 = null;
        this.f52575.clear();
        C10882 c10882 = this.f52572;
        c10882.f30143 = null;
        c10882.f30150.clear();
        c10882.f30151.clear();
        c10882.f30148 = null;
        c10882.f30144 = null;
        c10882.f30145 = null;
        c10882.f30146 = false;
        c10882.f30142 = true;
        setIntent(intent);
        setTitle(R.string.MT_Protector);
        this.f13392.setSubtitle((CharSequence) null);
        this.f52554.setText(R.string.MT_Protector);
        this.f52564.setVisibility(8);
        this.f52562.setEnabled(false);
        m40037(true);
        m40044();
        m40027(true);
    }
}
