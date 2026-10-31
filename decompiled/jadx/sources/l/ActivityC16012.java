package l;

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
import bin.mt.plus.R;
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
public class ActivityC16012 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f49389 = {-16777216, -1, -7829368};

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49390 = 0;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public TextView f49391;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C20478 f49392;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f49393;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public boolean f49394;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public boolean f49395;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public boolean f49396;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f49398;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public View f49399;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public float f49400;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public CheckBox f49401;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f49402;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f49403;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f49404;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f49405;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC3047 f49407;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC12924 f49408;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C8958 f49409;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public View f49410;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public C13136 f49411;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f49413;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f49412 = new ArrayList();

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public AtomicBoolean f49397 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public int f49406 = 255;

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ۘ */
    public final int mo7027() {
        return 2;
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "ImageViewerActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f10581 = false;
        setTheme(R.style.MT_Protector);
        super.onCreate(bundle);
        this.f49409 = (C8958) new C4741(this).m13885(C8958.class);
        m10241(R.layout.MT_Protector);
        this.f49408 = (AbstractC12924) m10241(R.id.MT_Protector);
        boolean z = true;
        if (!this.f49409.f27213) {
            boolean z2 = ApplicationC20075.f65008.getBoolean("pvc", false);
            C8958 c8958 = this.f49409;
            if (bundle != null) {
                z2 = bundle.getBoolean("gallery.continuous", z2);
            }
            c8958.f27215 = z2;
            this.f49409.f27213 = true;
        }
        if (this.f49409.f27215) {
            m37831();
        }
        this.f49410 = m10241(R.id.MT_Protector);
        this.f10584 = (C9762) m10241(R.id.MT_Protector);
        this.f49401 = (CheckBox) m10241(R.id.MT_Protector);
        this.f49391 = (TextView) m10241(R.id.MT_Protector);
        this.f49399 = m10241(R.id.MT_Protector);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC16718(0, this));
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = i >= 30 ? 3 : 1;
            window.setAttributes(attributes);
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        C4948.m14388(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        C12437 c12437M10244 = m10244();
        c12437M10244.m30603(false);
        c12437M10244.m30600(false);
        c12437M10244.m30602(2);
        C17648.m41310(m10241(R.id.MT_Protector), new C16648(5, this));
        int i2 = ApplicationC20075.f65008.getInt("pvbi", 0);
        this.f49413 = i2;
        if (i2 < 0 || i2 >= 3) {
            this.f49413 = 0;
        }
        m37854();
        C9664 c9664 = new C9664(this);
        this.f49407 = c9664;
        this.f49408.mo14780(c9664);
        this.f49401.setSaveEnabled(false);
        this.f49401.setContentDescription(getString(R.string.MT_Protector));
        this.f49401.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩳܶۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                ActivityC16012.m37829(this.f56407, z3);
            }
        });
        this.f49399.setContentDescription(getString(R.string.MT_Protector));
        this.f49399.setOnClickListener(new ViewOnClickListenerC17424(this, 0));
        this.f49399.setEnabled(false);
        this.f49401.setVisibility(8);
        this.f49391.setText(R.string.MT_Protector);
        if (bundle != null) {
            m37857(false);
        }
        getOnBackPressedDispatcher().m28894(this, new C20953(this));
        C8958 c8959 = this.f49409;
        if (c8959.f27209 != null) {
            m37843();
            return;
        }
        if (bundle != null) {
            c8959.f27212 = bundle.getBoolean("gallery.internal");
            this.f49409.f27214 = bundle.getString("gallery.path");
            this.f49409.f27211 = bundle.getBundle("gallery.viewport");
            this.f49409.f27208 = bundle.getBoolean("gallery.bars", true);
            if (this.f49409.f27212) {
                String string = bundle.getString("gallery.localUri");
                if (string == null) {
                    m37835();
                    return;
                }
                this.f49409.f27210 = Uri.parse(string);
                ArrayList<String> stringArrayList = bundle.getStringArrayList("gallery.selected");
                if (stringArrayList != null) {
                    for (String str : stringArrayList) {
                        if (this.f49409.f27216.add(str)) {
                            this.f49409.f27217.add(str);
                        }
                    }
                }
                C1802.f6208.execute(new RunnableC23774(this, z, this.f49409.f27210, new ArrayList(this.f49409.f27217), this.f49397));
                return;
            }
        }
        m37841(bundle == null);
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.f49393 = true;
        if (this.f49400 <= 0.0f || this.f49395 || isFinishing() || isDestroyed()) {
            return;
        }
        m37857(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37828(ActivityC16012 activityC16012, C21610 c21610) {
        C11007 c11007M48827 = c21610.m48827(135);
        C9762 c9762 = activityC16012.f10584;
        int i = c11007M48827.f33109;
        int i2 = c11007M48827.f33111;
        int i3 = c11007M48827.f33110;
        c9762.setPadding(i, i2, i3, 0);
        activityC16012.f49410.setPadding(c11007M48827.f33109, 0, i3, c11007M48827.f33108);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37829(ActivityC16012 activityC16012, boolean z) {
        InterfaceC17889 interfaceC17889M37844;
        if (activityC16012.f49394) {
            return;
        }
        C8958 c8958 = activityC16012.f49409;
        if (!c8958.f27212 || c8958.f27209 == null || (interfaceC17889M37844 = activityC16012.m37844()) == null) {
            return;
        }
        if (z) {
            activityC16012.f49409.f27216.add(interfaceC17889M37844.getPath());
        } else {
            activityC16012.f49409.f27216.remove(interfaceC17889M37844.getPath());
            activityC16012.f49409.f27217.remove(interfaceC17889M37844.getPath());
        }
        activityC16012.m37864();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37841(boolean z) {
        Intent intent = getIntent();
        boolean z2 = false;
        C2608 c2608 = (z && (intent.getComponent() != null && getClass().getName().equals(intent.getComponent().getClassName())) && intent.getData() == null) ? (C2608) C2956.m9016("ImageViewerArguments") : null;
        if (c2608 != null) {
            if (c2608.m8234() == null || c2608.m8233() == null || c2608.m8233().isEmpty() || c2608.m8232() < 0 || c2608.m8232() >= c2608.m8233().size()) {
                m37835();
                return;
            }
            Iterator it = c2608.m8233().iterator();
            while (it.hasNext()) {
                if (((InterfaceC17889) it.next()) == null) {
                    m37835();
                    return;
                }
            }
            this.f49409.f27209 = new C2608(c2608.m8234(), new ArrayList(c2608.m8233()), c2608.m8232());
            C8958 c8958 = this.f49409;
            c8958.f27212 = true;
            c8958.f27214 = m37856(c2608.m8232()).getPath();
            m37843();
            return;
        }
        C1802.f6208.execute(new RunnableC23774(this, z2, intent.getData(), new ArrayList(this.f49409.f27217), this.f49397));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37825(ActivityC16012 activityC16012, AtomicBoolean atomicBoolean, C2608 c2608) {
        if (atomicBoolean.get() || activityC16012.isFinishing() || activityC16012.isDestroyed()) {
            return;
        }
        activityC16012.f49409.f27209 = c2608;
        activityC16012.m37843();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37824(ActivityC16012 activityC16012, AtomicBoolean atomicBoolean) {
        if (atomicBoolean.get() || activityC16012.isFinishing() || activityC16012.isDestroyed()) {
            return;
        }
        activityC16012.m37835();
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m37831() {
        AbstractC12924 abstractC12924 = this.f49408;
        ViewGroup viewGroup = (ViewGroup) abstractC12924.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(abstractC12924);
        AbstractC12924 c5164 = this.f49409.f27215 ? new C5164(this) : new C8211(this, null);
        this.f49408 = c5164;
        c5164.setId(R.id.MT_Protector);
        this.f49408.mo14780(this.f49407);
        viewGroup.removeView(abstractC12924);
        viewGroup.addView(this.f49408, iIndexOfChild, abstractC12924.getLayoutParams());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m37843() {
        ArrayList arrayList;
        C2608 c2608 = this.f49409.f27209;
        int iM8232 = c2608.m8232();
        if (this.f49409.f27214 != null) {
            iM8232 = 0;
            while (true) {
                if (iM8232 >= c2608.m8233().size()) {
                    iM8232 = -1;
                    break;
                } else if (this.f49409.f27214.equals(m37856(iM8232).getPath())) {
                    break;
                } else {
                    iM8232++;
                }
            }
        }
        if (iM8232 < 0 || iM8232 >= c2608.m8233().size()) {
            m37835();
            return;
        }
        try {
            Iterator it = c2608.m8233().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f49412;
                if (!zHasNext) {
                    break;
                }
                arrayList.add(AbstractC22967.m51106(this, c2608.m8234(), (InterfaceC17889) it.next()));
            }
            C20478 c20478 = new C20478(this, arrayList);
            this.f49392 = c20478;
            c20478.m46926(getLifecycle().mo19832().m33028(EnumC13728.RESUMED));
            this.f49392.m46924(new RunnableC6772(2, this));
            this.f49392.m46925(this.f49408, iM8232);
            Bundle bundle = this.f49409.f27211;
            if (bundle != null) {
                this.f49408.mo14784(bundle);
            }
            this.f49409.f27214 = m37856(iM8232).getPath();
            m37851(this.f49409.f27208);
            m37864();
        } catch (RuntimeException unused) {
            m37835();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 m37856(int i) {
        return (InterfaceC17889) this.f49409.f27209.m8233().get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 m37844() {
        int iMo14785 = this.f49408.mo14785();
        C2608 c2608 = this.f49409.f27209;
        if (c2608 == null || iMo14785 < 0 || iMo14785 >= c2608.m8233().size()) {
            return null;
        }
        return m37856(iMo14785);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public void m37864() {
        InterfaceC17889 interfaceC17889M37844 = m37844();
        if (interfaceC17889M37844 == null) {
            return;
        }
        int iMo14785 = this.f49408.mo14785();
        setTitle(interfaceC17889M37844.getName());
        String str = String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(iMo14785 + 1), Integer.valueOf(this.f49412.size()));
        this.f49391.setText(str);
        this.f49408.setContentDescription(interfaceC17889M37844.getName() + " " + str);
        C15205 c15205M46922 = this.f49392.m46922(iMo14785);
        if (c15205M46922 == null) {
            this.f10584.setSubtitle(this.f49392.m46929(iMo14785) ? getString(R.string.MT_Protector) : null);
        } else {
            int i = c15205M46922.f46658;
            int i2 = c15205M46922.f46659;
            C11679 c11679 = c15205M46922.f46664;
            long time = c15205M46922.f46657;
            if (time < 0) {
                time = c11679.f34803;
            }
            if (time <= 0) {
                time = interfaceC17889M37844.getTime();
            }
            long j = c11679.f34804;
            String strM51028 = j >= 0 ? C22927.m51028(j) : null;
            int i3 = c15205M46922.f46663;
            int i4 = i3 >= 5 ? i2 : i;
            if (i3 < 5) {
                i = i2;
            }
            Locale locale = Locale.ENGLISH;
            String strM44634 = C19373.m44634(MotionUtils.EASING_TYPE_FORMAT_START, i4, "x", MotionUtils.EASING_TYPE_FORMAT_END, i);
            if (!C6554.m18062(interfaceC17889M37844)) {
                strM51028 = strM51028 == null ? strM44634 : C22870.m50967(strM51028, EnumC0121.f1143, strM44634);
            } else if (strM51028 == null) {
                strM51028 = "";
            }
            C9762 c9762 = this.f10584;
            if (time > 0) {
                strM51028 = C17283.m40572(time) + EnumC0121.f1143 + strM51028;
            }
            c9762.setSubtitle(strM51028);
        }
        this.f49394 = true;
        this.f49401.setVisibility(this.f49409.f27212 ? 0 : 8);
        this.f49401.setChecked(this.f49409.f27216.contains(interfaceC17889M37844.getPath()));
        this.f49401.setText(this.f49409.f27216.isEmpty() ? null : String.valueOf(this.f49409.f27216.size()));
        this.f49394 = false;
        this.f49399.setEnabled(this.f49403 == null);
        m37858();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m37851(boolean z) {
        this.f49409.f27208 = z;
        this.f10584.setVisibility(z ? 0 : 4);
        this.f49410.setVisibility(z ? 0 : 4);
        m37846();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void m37846() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (this.f49409.f27208 || this.f49400 > 0.0f || this.f49395) {
            m10244().m30604(7);
        } else {
            m10244().m30599(7);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        this.f49404 = menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        menu.add(0, R.id.more, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector).setShowAsActionFlags(2);
        m37858();
        return true;
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m37858() {
        C20478 c20478;
        InterfaceC17889 interfaceC17889M37844 = m37844();
        MenuItem menuItem = this.f49404;
        if (menuItem != null) {
            menuItem.setVisible((interfaceC17889M37844 instanceof C9555) && ((C15688) interfaceC17889M37844).getName().toLowerCase(Locale.ROOT).endsWith(".9.png") && (c20478 = this.f49392) != null && c20478.m46922(this.f49408.mo14785()) != null);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.more) {
            C21282 c21282M45699 = C19871.m45699(this.f10584.findViewById(R.id.more));
            C3060 c3060M48304 = c21282M45699.m48304();
            C12937.m31442(c3060M48304, R.string.MT_Protector);
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setCheckable(true).setChecked(!this.f49409.f27215);
            c3060M48304.add(0, R.string.MT_Protector, 1, R.string.MT_Protector).setCheckable(true).setChecked(this.f49409.f27215);
            c3060M48304.setGroupCheckable(0, true, true);
            c21282M45699.m48302(new C14601(this));
            C18997.m43839(C19871.m45698(c21282M45699));
            return true;
        }
        if (menuItem.getItemId() == R.string.MT_Protector || menuItem.getItemId() == R.string.MT_Protector) {
            menuItem.setChecked(true);
            boolean z = menuItem.getItemId() == R.string.MT_Protector;
            if (this.f49409.f27215 != z && this.f49392 != null && !this.f49395) {
                m37862();
                int iMo14785 = this.f49408.mo14785();
                C8958 c8958 = this.f49409;
                c8958.f27215 = z;
                c8958.f27211 = null;
                m37831();
                this.f49392.m46928(this.f49408, iMo14785);
                m37854();
                m37864();
                ApplicationC20075.f65008.edit().putBoolean("pvc", z).apply();
                invalidateOptionsMenu();
            }
        } else {
            if (menuItem.getItemId() == R.string.MT_Protector) {
                this.f49413 = (this.f49413 + 1) % 3;
                m37854();
                ApplicationC20075.f65008.edit().mo25853(this.f49413, "pvbi").apply();
                return true;
            }
            if (menuItem.getItemId() == R.string.MT_Protector) {
                InterfaceC17889 interfaceC17889M37844 = m37844();
                if ((interfaceC17889M37844 instanceof C9555) && ((C15688) interfaceC17889M37844).getName().toLowerCase(Locale.ROOT).endsWith(".9.png")) {
                    AbstractC15440 abstractC15440Mo24433 = ((C9555) interfaceC17889M37844).mo24433();
                    startActivity(new Intent(this, (Class<?>) ActivityC16024.class).setAction("android.intent.action.VIEW").setData(abstractC15440Mo24433.mo31568() ? abstractC15440Mo24433.mo31567() : abstractC15440Mo24433.m36522()));
                    return true;
                }
            } else {
                return super.onOptionsItemSelected(menuItem);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37849(ActivityC16012 activityC16012, int i) {
        ArrayList arrayList = activityC16012.f49412;
        if (activityC16012.f49392 == null || activityC16012.f49395 || activityC16012.isFinishing() || i < 0 || i >= arrayList.size()) {
            return;
        }
        InterfaceC17889 interfaceC17889M37856 = activityC16012.m37856(i);
        if (C6554.m18062(interfaceC17889M37856)) {
            ArrayList arrayList2 = new ArrayList();
            int size = -1;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (C6554.m18062(activityC16012.m37856(i2))) {
                    if (i2 == i) {
                        size = arrayList2.size();
                    }
                    arrayList2.add(activityC16012.m37856(i2));
                }
            }
            activityC16012.m37862();
            C2956.m9014(ActivityC16012.class, new C2608(activityC16012.f49409.f27209.m8234(), arrayList2, size), "VideoPlayerArguments");
            Intent intent = new Intent(activityC16012, (Class<?>) ActivityC10227.class);
            ActivityC10227.m25695(activityC16012, intent, activityC16012.f49409.f27209.m8234(), interfaceC17889M37856);
            activityC16012.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37848(final ActivityC16012 activityC16012) {
        ArrayList arrayList = activityC16012.f49412;
        if (activityC16012.f49392 == null || activityC16012.f49403 != null || activityC16012.m37844() == null) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (activityC16012.f49409.f27216.contains(activityC16012.m37856(i).getPath())) {
                arrayList2.add((AbstractC22967) arrayList.get(i));
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add((AbstractC22967) arrayList.get(activityC16012.f49408.mo14785()));
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        activityC16012.f49403 = atomicBoolean;
        final C13136 c13136 = new C13136(activityC16012, R.string.MT_Protector);
        activityC16012.f49411 = c13136;
        c13136.m31860(new RunnableC6312(4, atomicBoolean));
        c13136.m31866(200);
        activityC16012.f49399.setEnabled(false);
        C1802.f6208.execute(new Runnable() { // from class: l.᩺۠ۜ
            @Override // java.lang.Runnable
            public final void run() {
                final ActivityC16012 activityC16013 = this.f73762;
                final ArrayList arrayList3 = arrayList2;
                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                final C13136 c13137 = c13136;
                int i2 = ActivityC16012.f49390;
                try {
                    final C3544 c3544M32437 = C13421.m32437(arrayList3, new C6841(atomicBoolean2));
                    activityC16013.runOnUiThread(new Runnable() { // from class: l.ܰ۠ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC16012.m37827(activityC16013, c13137, atomicBoolean2, c3544M32437, arrayList3);
                        }
                    });
                } catch (Exception e) {
                    activityC16013.runOnUiThread(new RunnableC7341(activityC16013, c13137, atomicBoolean2, e));
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37827(ActivityC16012 activityC16012, C13136 c13136, AtomicBoolean atomicBoolean, C3544 c3544, ArrayList arrayList) {
        String str;
        c13136.m31857();
        if (activityC16012.f49403 == atomicBoolean) {
            activityC16012.f49403 = null;
            activityC16012.f49411 = null;
        }
        try {
            try {
                if (!atomicBoolean.get() && !activityC16012.isFinishing() && !activityC16012.isDestroyed()) {
                    C17109 c17109 = new C17109(activityC16012);
                    c17109.m40139();
                    Iterator it = arrayList.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (((AbstractC22967) it.next()).m51109()) {
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
                    c17109.m40143(str);
                    Iterator it2 = c3544.m10762().iterator();
                    while (it2.hasNext()) {
                        c17109.m40140((Uri) it2.next());
                    }
                    c17109.m40142();
                    c3544.m10763();
                    c3544.close();
                    if (activityC16012.isDestroyed()) {
                        return;
                    }
                    activityC16012.m37864();
                    return;
                }
                c3544.close();
                if (activityC16012.isDestroyed()) {
                    return;
                }
                activityC16012.m37864();
            } catch (Exception unused) {
                C21374.m48457(R.string.MT_Protector);
            } finally {
                if (!activityC16012.isDestroyed()) {
                    activityC16012.m37864();
                }
            }
        } catch (Throwable th) {
            try {
                c3544.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37826(ActivityC16012 activityC16012, C13136 c13136, AtomicBoolean atomicBoolean) {
        c13136.m31857();
        if (activityC16012.f49403 == atomicBoolean) {
            activityC16012.f49403 = null;
            activityC16012.f49411 = null;
        }
        if (!atomicBoolean.get() && !activityC16012.isFinishing() && !activityC16012.isDestroyed()) {
            C21374.m48457(R.string.MT_Protector);
        }
        if (activityC16012.isDestroyed()) {
            return;
        }
        activityC16012.m37864();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m37835() {
        C21374.m48457(R.string.MT_Protector);
        finish();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m37832(ActivityC16012 activityC16012) {
        activityC16012.m37830(false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37839(ActivityC16012 activityC16012) {
        activityC16012.m37830(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m37830(boolean z) {
        AbstractC3577 abstractC3577M31047;
        if (isFinishing() || this.f49395) {
            return;
        }
        C8958 c8958 = this.f49409;
        if (c8958 != null && c8958.f27212 && c8958.f27209 != null) {
            ArrayList arrayListM37842 = m37842();
            Intent intentPutExtra = new Intent().putExtra("gallery.currentPath", this.f49409.f27214);
            if (!arrayListM37842.isEmpty()) {
                intentPutExtra.putStringArrayListExtra("paths", arrayListM37842);
            }
            setResult(-1, intentPutExtra);
        }
        this.f49395 = true;
        InterfaceC17889 interfaceC17889M37844 = m37844();
        if (interfaceC17889M37844 != null) {
            if (!(this.f49409.f27209.m8234() instanceof C2499)) {
                AbstractC13921 abstractC13921M8234 = this.f49409.f27209.m8234();
                if ((abstractC13921M8234 instanceof AbstractC3163) && (abstractC3577M31047 = C12749.m31047(((AbstractC3163) abstractC13921M8234).m9690().f11356)) != null) {
                    C9068.m23402(interfaceC17889M37844.getPath(), new C17534(abstractC3577M31047, false));
                }
            } else if (!(interfaceC17889M37844.mo24433() instanceof C14798)) {
                String path = interfaceC17889M37844.getPath();
                C9068 c9068 = C9068.f27496;
                C11233.m27805(path, MotionUtils.EASING_TYPE_PATH);
                C9068.m23402(path, (C17534) null);
            }
        }
        ValueAnimator valueAnimator = this.f49405;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49405 = null;
        }
        m37846();
        if (!z) {
            this.f49408.mo14778();
            if (this.f49396) {
                m37857(false);
            }
        }
        finish();
        if (z) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private void m37854() {
        this.f49408.mo14788(f49389[this.f49413]);
        m37852();
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private void m37852() {
        int i;
        View viewM10241 = m10241(R.id.MT_Protector);
        int i2 = this.f49406;
        if (i2 == 0) {
            i = 0;
        } else {
            i = (i2 << 24) | (f49389[this.f49413] & 16777215);
        }
        viewM10241.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37823(ActivityC16012 activityC16012, ValueAnimator valueAnimator) {
        activityC16012.f49406 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        activityC16012.m37852();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        ValueAnimator valueAnimator = this.f49405;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49405 = null;
        }
        this.f49397.set(true);
        AtomicBoolean atomicBoolean = this.f49403;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C13136 c13136 = this.f49411;
        if (c13136 != null) {
            c13136.m31857();
        }
        C20478 c20478 = this.f49392;
        if (c20478 != null) {
            c20478.close();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m37857(boolean z) {
        if (z && this.f49396) {
            return;
        }
        final int i = this.f49402 + 1;
        this.f49402 = i;
        ValueAnimator valueAnimator = this.f49405;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49405 = null;
        }
        this.f49398 = false;
        this.f49406 = 255;
        m37854();
        try {
            if (z) {
                Class<?> cls = Class.forName("android.app.Activity$TranslucentConversionListener");
                Activity.class.getDeclaredMethod("convertToTranslucent", cls, ActivityOptions.class).invoke(this, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: l.ۧܶۜ
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        int i2 = ActivityC16012.f49390;
                        if (!method.getName().equals("onTranslucentConversionComplete") || objArr == null || !Boolean.TRUE.equals(objArr[0])) {
                            return null;
                        }
                        int i3 = i;
                        ActivityC16012 activityC16012 = this.f33252;
                        activityC16012.runOnUiThread(new RunnableC11542(i3, 1, activityC16012));
                        return null;
                    }
                }), null);
            } else if (Build.VERSION.SDK_INT >= 30) {
                setTranslucent(false);
            } else {
                Activity.class.getDeclaredMethod("convertFromTranslucent", null).invoke(this, null);
            }
            this.f49396 = z;
        } catch (ReflectiveOperationException | RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37822(final ActivityC16012 activityC16012, int i) {
        if (i != activityC16012.f49402 || activityC16012.f49395 || activityC16012.isFinishing() || activityC16012.isDestroyed() || activityC16012.f49398) {
            return;
        }
        activityC16012.f49398 = true;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(activityC16012.f49406, 0);
        activityC16012.f49405 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(180L);
        activityC16012.f49405.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.֫ܶۜ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActivityC16012.m37823(this.f6415, valueAnimator);
            }
        });
        activityC16012.f49405.start();
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m37842() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : this.f49409.f27217) {
            if (this.f49409.f27216.contains(str) && hashSet.add(str)) {
                arrayList.add(str);
            }
        }
        C2608 c2608 = this.f49409.f27209;
        if (c2608 != null) {
            for (InterfaceC17889 interfaceC17889 : c2608.m8233()) {
                if (this.f49409.f27216.contains(interfaceC17889.getPath()) && hashSet.add(interfaceC17889.getPath())) {
                    arrayList.add(interfaceC17889.getPath());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m37862() {
        if (this.f49392 == null || m37844() == null) {
            return;
        }
        this.f49409.f27214 = m37844().getPath();
        this.f49409.f27211 = this.f49408.mo14787();
        C8958 c8958 = this.f49409;
        c8958.f27210 = (c8958.f27212 && c8958.f27209.m8234() == C2499.f7958 && (m37844() instanceof C9555) && m37844().mo24433().mo36530()) ? m37844().mo24433().m36522() : null;
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Uri uri;
        m37862();
        bundle.putBoolean("gallery.internal", this.f49409.f27212);
        bundle.putString("gallery.path", this.f49409.f27214);
        bundle.putBundle("gallery.viewport", this.f49409.f27211);
        bundle.putBoolean("gallery.bars", this.f49409.f27208);
        bundle.putBoolean("gallery.continuous", this.f49409.f27215);
        C8958 c8958 = this.f49409;
        if (c8958.f27212 && (uri = c8958.f27210) != null) {
            bundle.putString("gallery.localUri", uri.toString());
            bundle.putStringArrayList("gallery.selected", m37842());
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        C20478 c20478 = this.f49392;
        if (c20478 != null) {
            c20478.m46926(true);
        }
    }

    @Override // l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        C20478 c20478 = this.f49392;
        if (c20478 == null || i == 20) {
            return;
        }
        c20478.m46930();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        C20478 c20478 = this.f49392;
        if (c20478 != null) {
            c20478.m46930();
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onPause() {
        m37862();
        C20478 c20478 = this.f49392;
        if (c20478 != null) {
            c20478.m46926(false);
        }
        this.f49408.mo14778();
        super.onPause();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        AtomicBoolean atomicBoolean = this.f49403;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C13136 c13136 = this.f49411;
        if (c13136 != null) {
            c13136.m31857();
        }
        super.onStop();
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f49395 = false;
        this.f49397.set(true);
        this.f49397 = new AtomicBoolean();
        AtomicBoolean atomicBoolean = this.f49403;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        C20478 c20478 = this.f49392;
        if (c20478 != null) {
            c20478.close();
        }
        this.f49392 = null;
        this.f49412.clear();
        C8958 c8958 = this.f49409;
        c8958.f27209 = null;
        c8958.f27216.clear();
        c8958.f27217.clear();
        c8958.f27214 = null;
        c8958.f27210 = null;
        c8958.f27211 = null;
        c8958.f27212 = false;
        c8958.f27208 = true;
        setIntent(intent);
        setTitle(R.string.MT_Protector);
        this.f10584.setSubtitle((CharSequence) null);
        this.f49391.setText(R.string.MT_Protector);
        this.f49401.setVisibility(8);
        this.f49399.setEnabled(false);
        m37851(true);
        m37858();
        m37841(true);
    }
}
