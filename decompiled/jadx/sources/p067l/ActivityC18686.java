package p067l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܿۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC18686 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ֫ۤ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f82278 = {2939, -24690, -24695, -24690, -24685, 28, -7898, 8339, 16151, -9476, -15021, -7875, -20567, -20564, -20551, -20564, -20510, -20545, -20568, -20546, -20574, -20552, -20545, -20562, -20568, -20546, -20509, -20564, -20545, -20546, -20562, -11281, -1054, -2626, 11344, 12612, 12706};

    /* JADX INFO: renamed from: ۛۧ */
    public static final /* synthetic */ int f55776 = 0;

    /* JADX INFO: renamed from: ֡ۧ */
    public boolean f55777;

    /* JADX INFO: renamed from: ֨ۧ */
    public C3847 f55778;

    /* JADX INFO: renamed from: ۖۧ */
    public boolean f55779;

    /* JADX INFO: renamed from: ۗۧ */
    public C18104 f55780;

    /* JADX INFO: renamed from: ۙۧ */
    public boolean f55782;

    /* JADX INFO: renamed from: ۠ۧ */
    public C10164 f55785;

    /* JADX INFO: renamed from: ۡۧ */
    public C14784 f55786;

    /* JADX INFO: renamed from: ۢۧ */
    public C14121 f55787;

    /* JADX INFO: renamed from: ۤۧ */
    public C5946 f55788;

    /* JADX INFO: renamed from: ۫ۧ */
    public C13992 f55789;

    /* JADX INFO: renamed from: ۬ۧ */
    public TextView f55790;

    /* JADX INFO: renamed from: ܳۧ */
    public boolean f55791;

    /* JADX INFO: renamed from: ܶۧ */
    public FloatingActionButton f55792;

    /* JADX INFO: renamed from: ܺۧ */
    public C1326 f55793;

    /* JADX INFO: renamed from: ܿۧ */
    public C13440 f55794;

    /* JADX INFO: renamed from: ᩴۧ */
    public boolean f55796;

    /* JADX INFO: renamed from: ᩶ۧ */
    public C14849 f55798;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f55799;

    /* JADX INFO: renamed from: ᩸ۧ */
    public String f55800;

    /* JADX INFO: renamed from: ᩹ۧ */
    public C12828 f55801;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C20856 f55802;

    /* JADX INFO: renamed from: ᩵ۧ */
    public ArrayList f55797 = new ArrayList();

    /* JADX INFO: renamed from: ۜۧ */
    public LinkedList f55784 = new LinkedList();

    /* JADX INFO: renamed from: ۚۧ */
    public C6788 f55783 = new C6788(1, this);

    /* JADX INFO: renamed from: ᩳۧ */
    public final AtomicReference f55795 = new AtomicReference();

    /* JADX INFO: renamed from: ۘۧ */
    public C10748 f55781 = C10748.m24757();

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "ProjectActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ Boolean m42512(ActivityC18686 activityC18686, AbstractC16003 abstractC16003) {
        activityC18686.getClass();
        return Boolean.valueOf((abstractC16003 instanceof InterfaceC13322) && ((InterfaceC13322) abstractC16003).mo23087(activityC18686.f55802));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42519(ActivityC18686 activityC18686, int i, CheckBox checkBox) {
        activityC18686.getClass();
        ArrayList arrayList = new ArrayList(activityC18686.f55797.subList(0, i));
        C8123.m18820(arrayList, new C4052());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C3934(activityC18686, linkedList, (AbstractC16003) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C3934) linkedList.removeFirst()).m7760();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ Boolean m42550(ActivityC18686 activityC18686, AbstractC16003 abstractC16003) {
        activityC18686.getClass();
        return Boolean.valueOf((abstractC16003 instanceof InterfaceC6075) && ((InterfaceC6075) abstractC16003).mo13812(activityC18686.f55787));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m42553(ActivityC18686 activityC18686, int i, CheckBox checkBox) {
        activityC18686.getClass();
        ArrayList arrayList = new ArrayList(activityC18686.f55797);
        arrayList.remove(i);
        C8123.m18820(arrayList, new C22905(1));
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C3934(activityC18686, linkedList, (AbstractC16003) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C3934) linkedList.removeFirst()).m7760();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m42564(ActivityC18686 activityC18686) {
        activityC18686.getClass();
        try {
            C21564.m48750(activityC18686.f55801);
            activityC18686.m42600(true);
        } catch (Throwable th) {
            activityC18686.m12259(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m42566(ActivityC18686 activityC18686, int i, CheckBox checkBox) {
        activityC18686.getClass();
        ArrayList arrayList = activityC18686.f55797;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C8123.m18820(arrayList2, new C15508());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C3934(activityC18686, linkedList, (AbstractC16003) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C3934) linkedList.removeFirst()).m7760();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        m12277(R.layout.MT_Protector);
        m12250();
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C3381 c3381 = new C3381(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c3381);
        m12280().m32667(2);
        m42509();
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        C1326 c1327 = (C1326) m12277(R.id.MT_Protector);
        this.f55793 = c1327;
        c1327.inflateMenu(R.menu.MT_Protector);
        this.f55780 = new C18104(this.f55793, R.id.MT_Protector, R.id.more);
        MenuItem menuItemFindItem = this.f55793.getMenu().findItem(R.id.MT_Protector);
        this.f55793.setOnMenuItemClickListener(new C18191(0, this));
        this.f55786 = (C14784) m12277(R.id.MT_Protector);
        this.f55792 = (FloatingActionButton) m12277(R.id.MT_Protector);
        m12265(this.f55786, m12277(R.id.MT_Protector), this.f13392, m12277(R.id.MT_Protector), this.f55793, this.f55792);
        this.f55786.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ᩳ۫᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC18686.m42543(this.f59476);
            }
        });
        C1220 c1220 = new C1220(this, this.f55786, this.f13392);
        c1220.m22392().m17917(C23223.f73009.getDefaultColor());
        this.f55786.m33738(c1220);
        c1220.m22393();
        this.f55786.m33738(new C7405(this));
        C5946 c5946 = (C5946) new C6874(this).m15765(C5946.class);
        this.f55788 = c5946;
        C7350 c7350M13354 = c5946.m13354();
        C12826.requireNonNull(menuItemFindItem);
        c7350M13354.m4066(this, new C20733(menuItemFindItem));
        this.f55788.m13355().m4066(this, new InterfaceC3326() { // from class: l.ܿ۫᩷
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C14121 c14121 = (C14121) obj;
                int i = ActivityC18686.f55776;
                if (c14121 != null) {
                    c14121.m32118(this.f56343);
                }
            }
        });
        this.f55788.m13328(this, this.f55783);
        this.f55788.m13326(this, new C9387(4, this));
        C7350 c7350M13339 = this.f55788.m13339();
        C1326 c1328 = this.f55793;
        C12826.requireNonNull(c1328);
        c7350M13339.m4066(this, new C16179(0, c1328));
        this.f55789 = (C13992) new C6874(this).m15765(C13992.class);
        this.f55785 = new C10164();
        C7050.m16213(new RunnableC24897(0, this), 500L);
        if (getIntent().hasExtra("bundle") && bundle == null) {
            Bundle extras = getIntent().getExtras();
            C12826.requireNonNull(extras);
            bundle = extras.getBundle("bundle");
            getIntent().getExtras().remove("bundle");
            C1446.m31706(this.f55788.m13355().m4060());
            C1446.m31706(this.f55788.m13347().m4060());
        }
        if (bundle != null) {
            this.f55801 = (C12828) bundle.getSerializable("projectRootDir");
            String[] stringArray = bundle.getStringArray("backStack");
            this.f55799 = bundle.getInt("currentFragment", 0);
            this.f55800 = bundle.getString("outputPath", null);
            if (this.f55801 == null || stringArray == null) {
                finish();
                return;
            }
            LinkedList linkedList = this.f55784;
            linkedList.clear();
            Collections.addAll(linkedList, stringArray);
            try {
                m42567(false);
                C14121 c14121 = this.f55787;
                ArrayList arrayList = this.f55797;
                if (c14121 != null) {
                    ComponentCallbacksC11117 componentCallbacksC11117M16809 = m5172().m16809("000000-0000-0000-0000-000000000000");
                    if (componentCallbacksC11117M16809 == null) {
                        componentCallbacksC11117M16809 = new C25026();
                        this.f55799 = 0;
                        AbstractC18413 abstractC18413M16810 = m5172().m16810();
                        abstractC18413M16810.m41923(componentCallbacksC11117M16809, "000000-0000-0000-0000-000000000000");
                        abstractC18413M16810.mo41926();
                    }
                    arrayList.add((AbstractC16003) componentCallbacksC11117M16809);
                }
                if (this.f55802 != null) {
                    ComponentCallbacksC11117 componentCallbacksC11117M168010 = m5172().m16809("000000-0000-0000-0000-000000000001");
                    if (componentCallbacksC11117M168010 == null) {
                        componentCallbacksC11117M168010 = new C7089();
                        if (this.f55787 == null) {
                            this.f55799 = 0;
                            AbstractC18413 abstractC18413M16811 = m5172().m16810();
                            abstractC18413M16811.m41923(componentCallbacksC11117M168010, "000000-0000-0000-0000-000000000001");
                            abstractC18413M16811.mo41926();
                        }
                    }
                    arrayList.add((AbstractC16003) componentCallbacksC11117M168010);
                }
                m42572(true);
                if (this.f55802 == null && m42616() && C7480.stream(arrayList).noneMatch(new C4781(0))) {
                    arrayList.add(1, new C18229());
                    m42576();
                }
                m42538();
                m42541();
            } catch (IOException e) {
                m12260((Throwable) e, true);
            }
            m12277(R.id.MT_Protector).setVisibility(8);
            if (bundle.getBoolean("hideProjectLoadingView", false)) {
                m42605();
                return;
            }
            return;
        }
        new C16791(this).m22250();
    }

    /* JADX INFO: renamed from: ۜ */
    public static /* synthetic */ void m42543(ActivityC18686 activityC18686) {
        int width = (activityC18686.f55786.getWidth() - activityC18686.f55786.getChildAt(1).getWidth()) - activityC18686.f55792.getWidth();
        int iM29939 = C13076.m29939(36.0f);
        float f = -(width > iM29939 * 2 ? width - iM29939 : width / 2);
        if (activityC18686.f55792.getTranslationX() != f) {
            activityC18686.f55792.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42524(ActivityC18686 activityC18686, String str) {
        ArrayList arrayList = activityC18686.f55797;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((AbstractC16003) arrayList.get(i)).m36365().equals(str)) {
                activityC18686.m42513(i, true, false);
                return;
            }
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC0904, p067l.ActivityC2023, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        m42509();
    }

    /* JADX INFO: renamed from: ֡֫ */
    private void m42509() {
        if (getResources().getConfiguration().orientation == 2) {
            m12280().m32664(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m12280().m32669(1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42585(CharSequence charSequence) {
        this.f13392.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final TextView m42609() {
        if (this.f55790 == null) {
            try {
                Field declaredField = C1326.class.getDeclaredField("mSubtitleTextView");
                declaredField.setAccessible(true);
                this.f55790 = (TextView) declaredField.get(this.f13392);
            } catch (Exception unused) {
            }
        }
        return this.f55790;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m42610(int i) {
        C10164 c10164 = this.f55785;
        if (c10164 != null) {
            c10164.m23669(this, i);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final View m42612(int i) {
        C10164 c10164 = this.f55785;
        if (c10164 != null) {
            return c10164.m23668(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final void m42605() {
        View viewM12277 = m12277(R.id.MT_Protector);
        if (viewM12277.getVisibility() != 8) {
            viewM12277.setVisibility(8);
        }
        this.f55777 = true;
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        m42590(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42590(boolean z) {
        C14121 c14121 = this.f55787;
        if (c14121 == null || !c14121.m32104(this, this.f55788)) {
            C20856 c20856 = this.f55802;
            if (c20856 == null || !c20856.m47128(this, this.f55788)) {
                if (z && this.f55781.m24761()) {
                    C22682.m50793(R.string.MT_Protector);
                } else {
                    finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final void m42596() {
        C14121 c14121;
        int i = 0;
        boolean z = !(this.f55802 == null || this.f55787 == null) || ((c14121 = this.f55787) != null && c14121.m32109());
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(this);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46710(z ? R.string.MT_Protector : R.string.MT_Protector);
        c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22216(i, this));
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11487(0, this));
        c20671.m46732();
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hideProjectLoadingView", this.f55777);
        bundle.putStringArray("backStack", (String[]) this.f55784.toArray(new String[0]));
        C12828 c12828 = this.f55801;
        if (c12828 != null) {
            bundle.putSerializable("projectRootDir", c12828);
            bundle.putInt("currentFragment", this.f55799);
            bundle.putString("outputPath", this.f55800);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42522(ActivityC18686 activityC18686, Exception exc) {
        activityC18686.m12259(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C4063) {
            C4063 c4063 = (C4063) exc;
            C20699 c20699M46760 = C20699.m46760(c4063.f8934, c4063.f8935);
            c20699M46760.f63908 = false;
            activityC18686.m42588(c4063.m8130(), c20699M46760);
            C14121 c14121 = activityC18686.f55787;
            C12826.requireNonNull(c14121);
            c14121.m32087(c4063.m8130());
            return;
        }
        if (exc instanceof C7760) {
            C7760 c7760 = (C7760) exc;
            C20699 c20699M46761 = C20699.m46760(c7760.f20361, c7760.f20360);
            c20699M46761.f63908 = false;
            activityC18686.m42599(c7760.m17914(), c20699M46761);
            C20856 c20856 = activityC18686.f55802;
            C12826.requireNonNull(c20856);
            c20856.m47114(c7760.m17914());
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    public static void m42582(ActivityC18686 activityC18686) {
        if (activityC18686.f55802 == null || !activityC18686.f55791) {
            return;
        }
        activityC18686.f55791 = false;
        new C23498(activityC18686, (C22103) activityC18686.getLifecycle()).m22250();
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final void m42592() {
        C13440 c13440 = this.f55794;
        if (c13440 != null) {
            c13440.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public final void m42603() {
        if (this.f55786.m33753(8388611)) {
            this.f55786.m33734(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ֫ */
    public void m42538() {
        this.f55794 = new C13440(this);
        C14849 c14849 = (C14849) findViewById(R.id.MT_Protector);
        this.f55798 = c14849;
        c14849.setAdapter(this.f55794);
        this.f55798.setLayoutManager(new C8541(this));
        this.f55798.getItemAnimator().m53108(200L);
        this.f55798.getItemAnimator().m53118(200L);
        this.f55798.getItemAnimator().m53115(200L);
        this.f55798.getItemAnimator().m53112(200L);
        this.f55792.setOnClickListener(new ViewOnClickListenerC11722(6, this));
        this.f55798.addOnScrollListener(new C21487(this));
        C14849 c148410 = this.f55798;
        C18104 c18104 = this.f55780;
        C12826.requireNonNull(c18104);
        c148410.addOnItemTouchListener(new C7356(c148410, new C24699(c18104)));
        C3847 c3847 = new C3847(new C5393(this));
        this.f55778 = c3847;
        c3847.m7551(this.f55798);
        this.f55780.m41178(this.f55794);
        this.f55780.m41176(this.f55778);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m42568(ActivityC18686 activityC18686, AbstractC16003 abstractC16003) {
        return ((abstractC16003 instanceof C25026) || (abstractC16003 instanceof C7089) || (abstractC16003 instanceof C18229)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ֫ */
    public void m42541() {
        boolean zM33753 = this.f55786.m33753(8388611);
        C8541 c8541 = (C8541) this.f55798.getLayoutManager();
        C12826.requireNonNull(c8541);
        int iFindFirstVisibleItemPosition = c8541.findFirstVisibleItemPosition();
        int childCount = c8541.getChildCount() + iFindFirstVisibleItemPosition;
        int i = this.f55799;
        if (i < iFindFirstVisibleItemPosition || i >= childCount) {
            if (this.f55782) {
                return;
            }
            this.f55782 = true;
            if (zM33753) {
                this.f55792.setVisibility(0);
                this.f55792.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f55792, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f55782) {
            this.f55782 = false;
            if (zM33753) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f55792, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.addListener(new C14780(this));
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۫ */
    public static void m42558(ActivityC18686 activityC18686) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (AbstractC17043 abstractC17043 : C17853.f53278.mo25500(true)) {
            if (abstractC17043.getName().endsWith(".project") && abstractC17043.mo25087()) {
                arrayList.add(abstractC17043);
            }
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            C4081.f8987.submit(new RunnableC3439(i, arrayList));
        }
        activityC18686.f55801 = new C12828(C17853.f53278.m38693(".project"));
        Bundle extras = activityC18686.getIntent().getExtras();
        C12826.requireNonNull(extras);
        if (extras.containsKey("dexFiles")) {
            ArrayList arrayList2 = new ArrayList();
            C14677 c14677M33573 = C14677.m33573(extras.getByteArray("dexFiles"));
            while (c14677M33573.available() > 0) {
                arrayList2.add(C18524.m42109(c14677M33573.m33593(), new String[0]));
            }
            C8086 c8086 = new C8086();
            C13451.m30592(arrayList2, activityC18686.f55801.m29402(), c8086, new C10145(activityC18686));
            if (c8086.m18756()) {
                activityC18686.m12254(R.string.MT_Protector, activityC18686.getString(R.string.MT_Protector, c8086.toString()), false);
            }
            activityC18686.f55800 = ((AbstractC17043) arrayList2.get(0)).getParent();
            z = true;
        } else {
            z = false;
        }
        if (extras.containsKey("arscFile")) {
            String string = extras.getString("arscFile");
            C12826.requireNonNull(string);
            AbstractC17043 abstractC17043M42109 = C18524.m42109(string, new String[0]);
            C14149.m32616(abstractC17043M42109, activityC18686.f55801.m29402());
            activityC18686.f55791 = true;
            activityC18686.f55800 = abstractC17043M42109.getParent();
        } else {
            z2 = z;
        }
        if (!z2) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m42616() {
        return this.f55801.m29392("data/resources.arsc").mo25094();
    }

    /* JADX INFO: renamed from: ۟ */
    public final boolean m42595() {
        int i;
        if (this.f55802 != null || this.f55779) {
            return true;
        }
        C12828 c12828 = this.f55801;
        if (c12828 == null) {
            return false;
        }
        AbstractC17043 abstractC17043M29392 = c12828.m29392("data/resources.arsc");
        if (!abstractC17043M29392.mo25094()) {
            return false;
        }
        AbstractC7291 abstractC7291M5172 = m5172();
        if (abstractC7291M5172.m16796() || (i = this.f55799) < 0) {
            return false;
        }
        ArrayList arrayList = this.f55797;
        if (i >= arrayList.size()) {
            return false;
        }
        AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(this.f55799);
        if (!(abstractC16003 instanceof C18229) || abstractC7291M5172.m16809("000000-0000-0000-0000-000000000001") != null) {
            return false;
        }
        if (!C24414.m53856()) {
            m12271(R.string.MT_Protector);
            return true;
        }
        if (!C24414.m53850()) {
            m12271(R.string.MT_Protector);
            return true;
        }
        this.f55779 = true;
        new C12099(this, abstractC17043M29392, (C18229) abstractC16003).m22250();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42530(ActivityC18686 activityC18686, C20856 c20856) {
        c20856.m47124(activityC18686, activityC18686.f55783);
        c20856.m47125(activityC18686, new C21658(activityC18686));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m42567(boolean z) throws C20807 {
        C12828 c12828 = this.f55801;
        boolean z2 = false;
        boolean z3 = c12828 != null && c12828.m29392("dex").mo25087();
        C12828 c12829 = this.f55801;
        boolean z4 = c12829 != null && c12829.m29392("arsc").mo25087();
        if (!z3 && !z4) {
            throw new C20807("No a dex or arsc project.");
        }
        if (!z) {
            C14121 c14121 = this.f55787;
            if (z3 && c14121 != null) {
                if (!c14121.m38427().equals(this.f55801)) {
                    throw new RuntimeException("dex");
                }
                runOnUiThread(new RunnableC15855(3, this, c14121));
                z3 = false;
            }
            final C20856 c20856 = this.f55802;
            if (!z4 || c20856 == null) {
                z2 = z4;
            } else {
                if (!c20856.m38427().equals(this.f55801)) {
                    throw new RuntimeException("arsc");
                }
                runOnUiThread(new Runnable() { // from class: l.ܶ۫᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC18686 activityC18686 = this.f49874;
                        c20856.m47124(activityC18686, activityC18686.f55783);
                    }
                });
            }
            if (!z3 && !z2) {
                this.f55788.m13354().mo4062(Boolean.valueOf(m42618()));
                this.f55788.m13339().mo4062((Object) (m42618() ? getString(R.string.MT_Protector) : this.f55801.getName()));
                return;
            }
            z4 = z2;
        }
        if (z3) {
            C14121 c14121M32082 = C14121.m32082(this.f55801);
            this.f55787 = c14121M32082;
            runOnUiThread(new RunnableC23556(0, this, c14121M32082));
            this.f55788.m13355().mo4062(c14121M32082);
        }
        if (z4) {
            C20856 c20856M47109 = C20856.m47109(this.f55801);
            this.f55802 = c20856M47109;
            runOnUiThread(new RunnableC10376(2, this, c20856M47109));
            this.f55788.m13347().mo4062(c20856M47109);
        }
        this.f55788.m13354().mo4062(Boolean.valueOf(m42618()));
        this.f55788.m13339().mo4062((Object) (m42618() ? getString(R.string.MT_Protector) : this.f55801.getName()));
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean m42618() {
        C12828 c12828 = this.f55801;
        return c12828 != null && c12828.m29402().m38662(C17853.f53278);
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final String m42591() {
        return this.f55800;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42589(AbstractC16003 abstractC16003) {
        ArrayList arrayList = this.f55797;
        int iIndexOf = arrayList.indexOf(abstractC16003);
        boolean z = false;
        C1446.m31704(iIndexOf != -1);
        int i = this.f55799;
        LinkedList linkedList = this.f55784;
        if (iIndexOf == i) {
            String str = (String) linkedList.pop();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 != this.f55799 && ((AbstractC16003) arrayList.get(i2)).m36365().equals(str)) {
                    m42513(i2, false, true);
                    break;
                }
            }
            if (iIndexOf == this.f55799) {
                m42513(0, false, true);
            }
            C1446.m31704(iIndexOf != this.f55799);
        }
        ComponentCallbacksC11117 componentCallbacksC11117M16809 = m5172().m16809(abstractC16003.m36365());
        if (componentCallbacksC11117M16809 != null) {
            C1446.m31704(abstractC16003 == componentCallbacksC11117M16809);
            AbstractC18413 abstractC18413M16810 = m5172().m16810();
            abstractC18413M16810.mo41931(abstractC16003);
            abstractC18413M16810.mo41926();
        } else {
            if (!abstractC16003.isAdded() && !abstractC16003.isDetached()) {
                z = true;
            }
            C1446.m31704(z);
        }
        linkedList.removeAll(Collections.singleton(((AbstractC16003) arrayList.remove(iIndexOf)).m36365()));
        int i3 = this.f55799;
        if (iIndexOf < i3) {
            this.f55799 = i3 - 1;
            m42541();
        }
        m42574();
        this.f55794.notifyItemRemoved(iIndexOf);
        C12828 c12828M42601 = m42601();
        abstractC16003.m36366(c12828M42601).m29395();
        C7836.m18119(abstractC16003.m36369(c12828M42601).m29402()).m12892((InterfaceC22729) new C17520(0));
        abstractC16003.m36359(c12828M42601).m29395();
        m42576();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0 A[PHI: r4 r5
      0x00e0: PHI (r4v4 android.content.Intent) = (r4v3 android.content.Intent), (r4v2 android.content.Intent) binds: [B:33:0x00de, B:25:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x00e0: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v6 java.lang.String) binds: [B:33:0x00de, B:25:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x030f A[PHI: r16 r20 r21
      0x030f: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:80:0x030d, B:76:0x02ee, B:15:0x0075, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r20v29 l.ۘۛ᩷) = (r20v4 l.ۘۛ᩷), (r20v5 l.ۘۛ᩷), (r20v28 l.ۘۛ᩷), (r20v33 l.ۘۛ᩷) binds: [B:80:0x030d, B:76:0x02ee, B:15:0x0075, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x030f: PHI (r21v4 char) = (r21v3 char), (r21v3 char), (r21v3 char), (r21v7 char) binds: [B:80:0x030d, B:76:0x02ee, B:15:0x0075, B:6:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (p067l.C0894.m55769() >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m42516(InterfaceC11799 interfaceC11799) {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        ActivityC18686 activityC18686 = this;
        int i4 = C1964.f83032;
        int i5 = C0866.f81837;
        int iM559710 = C0946.m55979("ᩴᩴ") ^ i5;
        int i6 = ((iM559710 ^ i4) * (-30715)) ^ (-1037365968);
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM559710 ^ (-1255949027);
        int i8 = 0;
        short s = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -432076896;
        char c = 0;
        String strM56325 = null;
        Intent intent = null;
        C14281 c14281 = null;
        C5946 c5946 = null;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * 20841) >> 31));
            switch (i14) {
                case -2121549269:
                case -1425734507:
                    c5946 = c5946;
                    s = sArr[c];
                    s2 = 25340;
                    if (C0937.m55918() >= 0) {
                        iM55680 = C0946.m55979("ۜۨ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-26109)) ^ (-111453775);
                        i3 = -429824154;
                    } else {
                        iM55680 = C0946.m55979("֨ۧ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-7965)) ^ 1383573108;
                        i3 = -1084274491;
                    }
                    int i15 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i15;
                    activityC18686 = this;
                    break;
                case -2024244728:
                case 1090985518:
                    c5946 = c5946;
                    if (C0927.m55866()) {
                        iM55680 = C0873.m55680("ۖۡ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-25679)) ^ 1591153095;
                        i3 = 1359746377;
                        int i16 = iM55680 ^ i3;
                        c5946 = c5946;
                        i7 = i16;
                        activityC18686 = this;
                    }
                    c5946 = c5946;
                    int iM55681 = (C0873.m55680("֡ᩳ") ^ i5) * (-67);
                    i6 = ((iM55681 ^ i4) * 31067) ^ (-1064047340);
                    i7 = iM55681 ^ 283540320;
                    activityC18686 = this;
                    break;
                case -2006705923:
                case -1909483135:
                    c5946 = activityC18686.f55788;
                    if (c5946.f14669) {
                        int iM55682 = (C0873.m55680("֫֫") ^ i4) * (-77);
                        i7 = iM55682 ^ 1046013287;
                        i6 = ((iM55682 ^ i5) * 8161) ^ (-330771763);
                    } else {
                        int iM55683 = (C0873.m55680("֡ᩳ") ^ i5) * (-67);
                        i6 = ((iM55683 ^ i4) * 31067) ^ (-1064047340);
                        i7 = iM55683 ^ 283540320;
                    }
                    activityC18686 = this;
                    break;
                case -1991565939:
                case 43659875:
                    break;
                case -1823248366:
                case -962193868:
                    i12 = 40935;
                    iM55680 = C0873.m55680("ܶ᩺") ^ i5;
                    i6 = ((iM55680 ^ i4) * (-30635)) ^ 1736620434;
                    i3 = 1484510735;
                    int i17 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i17;
                    activityC18686 = this;
                    break;
                case -1712689963:
                case 1454432851:
                    C1012.m56134();
                    if (C1036.f81953 >= 0) {
                        c5946 = c5946;
                        iM55680 = C0946.m55979("ۛۨ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 2385) ^ 278954475;
                        i3 = -528240575;
                        int i18 = iM55680 ^ i3;
                        c5946 = c5946;
                        i7 = i18;
                        activityC18686 = this;
                    }
                    c5946 = c5946;
                    iM55680 = C0946.m55979("ۜۨ") ^ i4;
                    i6 = ((iM55680 ^ i5) * (-26109)) ^ (-111453775);
                    i3 = -429824154;
                    int i19 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i19;
                    activityC18686 = this;
                    break;
                case -1616549003:
                case 407400266:
                    intent.putExtra(strM56325, true);
                    activityC18686.startService(intent);
                    break;
                case -1527926436:
                case -1038516200:
                    strM56325 = C1053.m56325(sArr2, i13, i8, i12);
                    if (C1036.f81953 >= 0) {
                        iM55979 = (C0946.m55979("۬᩵") + i5) * 69;
                        i = ((iM55979 ^ i4) * 2001) ^ (-1640585422);
                        i2 = 331034189;
                    } else {
                        iM55979 = C0946.m55979("֫᩵") ^ i4;
                        i = ((iM55979 ^ i5) * 2633) ^ (-250281051);
                        i2 = 766223235;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1502935616:
                case 1958653212:
                    ServiceC14741.f42010 = c14281;
                    if (C0861.f81831) {
                        iM55979 = C0946.m55979("᩵᩻") ^ i5;
                        i = ((iM55979 ^ i4) * (-13373)) ^ (-1250736522);
                        i2 = 1014461863;
                    } else {
                        iM55979 = C0946.m55979("֫᩺") ^ i4;
                        i = ((iM55979 ^ i5) * (-23165)) ^ 1725770859;
                        i2 = -1408655335;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -1473512110:
                case 859900627:
                    c5946 = c5946;
                    sArr = f82278;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0946.m55979("ۛۨ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 2385) ^ 278954475;
                        i3 = -528240575;
                    } else {
                        iM55680 = (C0873.m55680("ܺ᩵") + i4) * (-99);
                        i6 = ((iM55680 ^ i5) * (-4123)) ^ 918723623;
                        i3 = 1287066157;
                    }
                    int i110 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i110;
                    activityC18686 = this;
                    break;
                case -1212530866:
                case 1778623902:
                    c5946 = c5946;
                    if (C1044.f81959 >= 0) {
                        iM55680 = C0946.m55979("ۛۨ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 2385) ^ 278954475;
                        i3 = -528240575;
                    } else {
                        iM55680 = (C0873.m55680("֨᩶") ^ i5) * (-113);
                        i6 = ((iM55680 ^ i4) * 22137) ^ 1855498977;
                        i3 = -1308132272;
                    }
                    int i111 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i111;
                    activityC18686 = this;
                    break;
                case -746407415:
                case 577599996:
                    C1028.m56247();
                    C0894.m55769();
                    c5946 = c5946;
                    iM55680 = C0873.m55680("۠ۜ") ^ i5;
                    i6 = ((iM55680 ^ i4) * (-23781)) ^ (-126181240);
                    i3 = -1814006152;
                    int i112 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i112;
                    activityC18686 = this;
                    break;
                case -693708190:
                case 190671790:
                    c14281 = new C14281(0, interfaceC11799);
                    if (C0882.f81846) {
                        c5946 = c5946;
                        iM55680 = C0873.m55680("۠ۜ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-23781)) ^ (-126181240);
                        i3 = -1814006152;
                        int i113 = iM55680 ^ i3;
                        c5946 = c5946;
                        i7 = i113;
                        activityC18686 = this;
                    } else {
                        int iM55684 = C0873.m55680("ܰᩳ") ^ i4;
                        i7 = iM55684 ^ (-1819739552);
                        i6 = ((iM55684 ^ i5) * 609) ^ (-1501158369);
                        c14281 = c14281;
                    }
                    break;
                case -638847450:
                case 1300783752:
                    c5946 = c5946;
                    if ((i10 + i11) - i9 < 0) {
                        iM55680 = C0946.m55979("ۡܺ") ^ i4;
                        i6 = ((iM55680 ^ i5) * 31755) ^ (-908377927);
                        i3 = 1410253464;
                    } else {
                        iM55680 = (C0946.m55979("ۘ᩷") + i4) * 5;
                        i6 = ((iM55680 ^ i5) * 20705) ^ 1608524623;
                        i3 = -875176514;
                    }
                    int i114 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i114;
                    activityC18686 = this;
                    break;
                case -480809726:
                case 998226470:
                    intent = new Intent(activityC18686, (Class<?>) ServiceC14741.class);
                    if (C0947.f81895) {
                        iM55979 = (C0946.m55979("۬᩵") + i5) * 69;
                        i = ((iM55979 ^ i4) * 2001) ^ (-1640585422);
                        i2 = 331034189;
                    } else {
                        iM55979 = (C0946.m55979("ۘ۫") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55979 ^ i4) * (-9949)) ^ 331182238;
                        i2 = -1493878721;
                    }
                    i7 = iM55979 ^ i2;
                    i6 = i;
                    break;
                case -229212632:
                case 1642928130:
                    i12 = 64123;
                    iM55680 = C0873.m55680("ܶ᩺") ^ i5;
                    i6 = ((iM55680 ^ i4) * (-30635)) ^ 1736620434;
                    i3 = 1484510735;
                    int i115 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i115;
                    activityC18686 = this;
                    break;
                case -186915586:
                case 1947964009:
                    c5946 = c5946;
                    if (C0906.m55806(c5946.f14668, ServiceC14741.f42008)) {
                        int iM55685 = (i4 - C0873.m55680("᩸᩹")) * (-79);
                        i7 = iM55685 ^ (-1991206112);
                        i6 = ((iM55685 ^ i5) * (-6403)) ^ 1942016241;
                        c5946 = c5946;
                    } else {
                        c5946 = c5946;
                        int iM55686 = (C0873.m55680("֡ᩳ") ^ i5) * (-67);
                        i6 = ((iM55686 ^ i4) * 31067) ^ (-1064047340);
                        i7 = iM55686 ^ 283540320;
                        activityC18686 = this;
                    }
                    break;
                case -8884792:
                case 1639512399:
                    sArr2 = f82278;
                    i13 = 1;
                    i8 = 4;
                    if (C0863.f81833 > 0) {
                        iM55979 = C0946.m55979("ۡ֫") ^ i4;
                        i = ((iM55979 ^ i5) * (-18695)) ^ (-877957378);
                        i2 = -134587375;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                    } else {
                        c5946 = c5946;
                        iM55680 = C0946.m55979("ۜۨ") ^ i4;
                        i6 = ((iM55680 ^ i5) * (-26109)) ^ (-111453775);
                        i3 = -429824154;
                        int i116 = iM55680 ^ i3;
                        c5946 = c5946;
                        i7 = i116;
                        activityC18686 = this;
                    }
                    break;
                case 617914457:
                case 1067466031:
                    break;
                case 930875505:
                case 1378762828:
                    C0917.m55854();
                    if (C1012.f81938 >= 0) {
                        iM55979 = C0946.m55979("֫᩺") ^ i4;
                        i = ((iM55979 ^ i5) * (-23165)) ^ 1725770859;
                        i2 = -1408655335;
                        i7 = iM55979 ^ i2;
                        i6 = i;
                    } else {
                        c5946 = c5946;
                        iM55680 = C0873.m55680("۠ۜ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-23781)) ^ (-126181240);
                        i3 = -1814006152;
                        int i117 = iM55680 ^ i3;
                        c5946 = c5946;
                        i7 = i117;
                        activityC18686 = this;
                    }
                    break;
                case 1044109616:
                case 1618782457:
                    c5946 = c5946;
                    i9 = s * s2;
                    i10 = s * s;
                    i11 = 160528900;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("۠ۜ") ^ i5;
                        i6 = ((iM55680 ^ i4) * (-23781)) ^ (-126181240);
                        i3 = -1814006152;
                    } else {
                        iM55680 = (i5 - C0873.m55680("۟ۗ")) * (-3);
                        i6 = ((iM55680 ^ i4) * (-30017)) ^ (-650665526);
                        i3 = 789640183;
                    }
                    int i118 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i118;
                    activityC18686 = this;
                    break;
                case 1287912327:
                case 2071733499:
                    C0967.m56074();
                    C1194.m56396();
                    break;
                default:
                    c5946 = c5946;
                    c = 0;
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0946.m55979("ۛۨ") ^ i5;
                        i6 = ((iM55680 ^ i4) * 2385) ^ 278954475;
                        i3 = -528240575;
                    } else {
                        iM55680 = C0873.m55680("ᩴ᩵") ^ i4;
                        i6 = ((iM55680 ^ i5) * 20147) ^ (-1289652883);
                        i3 = -1629139721;
                    }
                    int i119 = iM55680 ^ i3;
                    c5946 = c5946;
                    i7 = i119;
                    activityC18686 = this;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final void m42615() {
        if (this.f55802 == null) {
            return;
        }
        m42515(new Function() { // from class: l.ᩴ۫᩷
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivityC18686.m42512(this.f62499, (AbstractC16003) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final void m42594() {
        if (this.f55787 == null) {
            return;
        }
        m42515(new C10816(0, this));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42515(Function function) {
        int i = this.f55799;
        ArrayList arrayList = this.f55797;
        AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(i);
        ArrayList<AbstractC16003> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC16003 abstractC16004 = (AbstractC16003) it.next();
            if (((Boolean) function.apply(abstractC16004)).booleanValue()) {
                if (abstractC16003 == abstractC16004) {
                    abstractC16003 = null;
                }
                arrayList2.add(abstractC16004);
                arrayList3.add(abstractC16004.m36365());
                it.remove();
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f55784.removeAll(arrayList3);
        if (abstractC16003 == null) {
            this.f55799 = 0;
        } else {
            this.f55799 = arrayList.indexOf(abstractC16003);
        }
        m42574();
        C12828 c12828M42601 = m42601();
        AbstractC7291 abstractC7291M5172 = m5172();
        AbstractC18413 abstractC18413M16810 = abstractC7291M5172.m16810();
        for (AbstractC16003 abstractC16005 : arrayList2) {
            ComponentCallbacksC11117 componentCallbacksC11117M16809 = abstractC7291M5172.m16809(abstractC16005.m36365());
            if (componentCallbacksC11117M16809 != null) {
                C1446.m31704(abstractC16005 == componentCallbacksC11117M16809);
                abstractC18413M16810.mo41931(abstractC16005);
            } else {
                C1446.m31704((abstractC16005.isAdded() || abstractC16005.isDetached()) ? false : true);
            }
            abstractC16005.m36366(c12828M42601).m29395();
            C7836.m18119(abstractC16005.m36369(c12828M42601).m29402()).m12892((InterfaceC22729) new C21545());
            abstractC16005.m36359(c12828M42601).m29395();
        }
        abstractC18413M16810.mo41930();
        m42576();
        this.f55794.notifyDataSetChanged();
        m42541();
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    private void m42574() {
        String strM36365 = ((AbstractC16003) this.f55797.get(this.f55799)).m36365();
        LinkedList linkedList = this.f55784;
        linkedList.push(strM36365);
        Iterator it = linkedList.iterator();
        String str = null;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str != null && str.equals(str2)) {
                it.remove();
            } else {
                str = str2;
            }
        }
        linkedList.pop();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m42571(ActivityC18686 activityC18686, AbstractC16003 abstractC16003) {
        int iIndexOf = activityC18686.f55797.indexOf(abstractC16003);
        if (iIndexOf != -1) {
            activityC18686.m42513(iIndexOf, true, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42520(ActivityC18686 activityC18686, int i, boolean z) {
        activityC18686.m42513(i, z, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42513(int i, boolean z, boolean z2) {
        InputMethodManager inputMethodManager;
        InterfaceC20028 interfaceC20028Mo19371;
        if (i >= 0) {
            ArrayList arrayList = this.f55797;
            if (i < arrayList.size()) {
                AbstractC7291 abstractC7291M5172 = m5172();
                if (abstractC7291M5172.m16820() || abstractC7291M5172.m16796()) {
                    return;
                }
                int i2 = this.f55799;
                if (i2 != i) {
                    AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(i2);
                    AbstractC16003 abstractC16004 = (AbstractC16003) arrayList.get(i);
                    if (!z2 && (interfaceC20028Mo19371 = abstractC16003.mo19371()) != null) {
                        if (this.f55789.m31797()) {
                            this.f55789.m31795((Runnable) new RunnableC20875(0, interfaceC20028Mo19371));
                        } else {
                            interfaceC20028Mo19371.mo11541();
                            this.f55789.m31795((Runnable) new RunnableC5924(interfaceC20028Mo19371));
                        }
                    }
                    AbstractC18413 abstractC18413M16810 = abstractC7291M5172.m16810();
                    if (this.f55799 < i) {
                        abstractC18413M16810.m41919(R.anim.MT_Protector, R.anim.MT_Protector);
                    } else {
                        abstractC18413M16810.m41919(R.anim.MT_Protector, R.anim.MT_Protector);
                    }
                    if (abstractC16003.mo36364()) {
                        abstractC18413M16810.mo41917(abstractC16003);
                    } else {
                        abstractC18413M16810.mo41927((ComponentCallbacksC11117) abstractC16003);
                    }
                    if (abstractC16004.isAdded()) {
                        abstractC18413M16810.mo41928(abstractC16004);
                    } else if (abstractC16004.isDetached()) {
                        abstractC18413M16810.m41922((ComponentCallbacksC11117) abstractC16004);
                    } else {
                        abstractC18413M16810.m41923(abstractC16004, abstractC16004.m36365());
                    }
                    abstractC18413M16810.mo41930();
                    this.f55799 = i;
                    m42541();
                    this.f55794.notifyDataSetChanged();
                    if (abstractC16003.mo19372() && !abstractC16004.mo19372() && (inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method")) != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                    }
                    if (z) {
                        C1446.m31704(!z2);
                        String strM36365 = abstractC16003.m36365();
                        LinkedList linkedList = this.f55784;
                        linkedList.push(strM36365);
                        while (linkedList.size() > 5) {
                            linkedList.remove(linkedList.size() - 2);
                        }
                        return;
                    }
                    return;
                }
                ((AbstractC16003) arrayList.get(i2)).mo36374();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42588(String str, C20699 c20699) {
        C14121 c14121 = this.f55787;
        C8362 c8362 = null;
        if (c14121 != null) {
            try {
                if (!c14121.m32119(str)) {
                    throw new C20807("Class not found: " + str.replace('/', '.'));
                }
            } catch (IOException e) {
                m12259(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f55797;
        int size = arrayList.size();
        int iM42511 = 0;
        while (true) {
            if (iM42511 >= size) {
                iM42511 = -1;
                break;
            }
            AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(iM42511);
            if (abstractC16003 instanceof C8362) {
                C8362 c8363 = (C8362) abstractC16003;
                if (str.equals(c8363.m19360())) {
                    c8362 = c8363;
                    break;
                }
            }
            iM42511++;
        }
        if (c8362 == null) {
            c8362 = new C8362();
            c8362.m19370(str);
            iM42511 = m42511(this.f55799 + 1, false);
            arrayList.add(iM42511, c8362);
            m42576();
        }
        c8362.m19365(c20699);
        if (c20699 == null && iM42511 == this.f55799) {
            C22682.m50793(R.string.MT_Protector);
        }
        m42513(iM42511, true, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42599(String str, C20699 c20699) {
        C20856 c20856 = this.f55802;
        C9842 c9842 = null;
        if (c20856 != null) {
            try {
                if (!c20856.m47134(str)) {
                    throw new C20807("Xml not found: " + str);
                }
            } catch (IOException e) {
                m12259(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f55797;
        int size = arrayList.size();
        int iM42511 = 0;
        while (true) {
            if (iM42511 >= size) {
                iM42511 = -1;
                break;
            }
            AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(iM42511);
            if (abstractC16003 instanceof C9842) {
                C9842 c9843 = (C9842) abstractC16003;
                if (str.equals(c9843.m23088())) {
                    c9842 = c9843;
                    break;
                }
            }
            iM42511++;
        }
        if (c9842 == null) {
            c9842 = new C9842();
            c9842.m23090(str);
            iM42511 = m42511(this.f55799 + 1, false);
            arrayList.add(iM42511, c9842);
            m42576();
        }
        c9842.m23086(c20699);
        if (c20699 == null && iM42511 == this.f55799) {
            C22682.m50793(R.string.MT_Protector);
        }
        m42513(iM42511, true, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42586(String str, String str2) {
        C17828 c17828;
        ArrayList arrayList = this.f55797;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c17828 = null;
                i = -1;
                break;
            }
            AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(i);
            if (abstractC16003 instanceof C17828) {
                c17828 = (C17828) abstractC16003;
                if (str.equals(c17828.m40492()) && str2.equals(c17828.requireArguments().getString(AbstractC0213e.f995s))) {
                    if (!c17828.m40494()) {
                        break;
                    }
                    c17828.m40495();
                    break;
                }
            }
            i++;
        }
        if (c17828 == null) {
            C17828 c17829 = new C17828();
            c17829.m40493(str, str2);
            int iM42511 = m42511(this.f55799 + 1, false);
            arrayList.add(iM42511, c17829);
            m42576();
            i = iM42511;
        }
        m42513(i, true, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42587(final String str, final String str2, ArrayList arrayList, final boolean z) {
        int iM42549;
        C14121 c14121 = this.f55787;
        if (c14121 == null) {
            return;
        }
        if (str2 != null) {
            m42514(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (!z && (iM42549 = m42549(str, (String) null)) >= 0) {
            m42513(iM42549, true, false);
            return;
        }
        final ArrayList arrayListM32111 = c14121.m32111(str);
        if (arrayListM32111.isEmpty()) {
            m42514(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (arrayList == null) {
            arrayList = arrayListM32111;
        }
        CharSequence[] charSequenceArr = new CharSequence[arrayListM32111.size()];
        final boolean[] zArr = new boolean[arrayListM32111.size()];
        for (int i = 0; i < arrayListM32111.size(); i++) {
            String str3 = (String) arrayListM32111.get(i);
            charSequenceArr[i] = C15993.m36343(str3);
            zArr[i] = arrayList.contains(str3);
        }
        View viewM12252 = m12252(R.layout.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        C7040.m16181(listView);
        listView.setDivider(null);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        listView.setAdapter((ListAdapter) new C8075(charSequenceArr, zArr));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳۤ᩷
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                int i3 = ActivityC18686.f55776;
                boolean[] zArr2 = zArr;
                boolean z2 = !zArr2[i2];
                zArr2[i2] = z2;
                ((CheckedTextView) view).setChecked(z2);
            }
        });
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC18686.m42532(this.f56169, zArr, arrayListM32111, str, str2, z);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732().m3861().setOnClickListener(new ViewOnClickListenerC16121(zArr, listView, 0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42532(ActivityC18686 activityC18686, boolean[] zArr, ArrayList arrayList, String str, String str2, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                arrayList2.add((String) arrayList.get(i));
            }
        }
        activityC18686.m42514(str, str2, (List) arrayList2, z);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42514(String str, String str2, List list, boolean z) {
        boolean zM41047;
        int iM42549 = m42549(str, str2);
        ArrayList arrayList = this.f55797;
        C18026 c18026 = iM42549 >= 0 ? (C18026) arrayList.get(iM42549) : null;
        if (c18026 == null) {
            C18026 c18027 = new C18026();
            c18027.m41046(str, str2, list);
            iM42549 = m42511(this.f55799 + 1, false);
            arrayList.add(iM42549, c18027);
            zM41047 = true;
        } else {
            zM41047 = c18026.m41047(list, z);
        }
        if (zM41047) {
            m42576();
        }
        m42513(iM42549, true, false);
    }

    /* JADX INFO: renamed from: ۧ */
    private int m42549(String str, String str2) {
        ArrayList arrayList = this.f55797;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(i);
            if (abstractC16003 instanceof C18026) {
                C18026 c18026 = (C18026) abstractC16003;
                if (str.equals(c18026.m41045()) && C12826.equals(str2, c18026.requireArguments().getString(AbstractC0213e.f995s))) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m42511(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f55797;
            if (i >= arrayList.size()) {
                break;
            }
            AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(i);
            if (!(abstractC16003 instanceof C25026) && !(abstractC16003 instanceof C7089) && !(abstractC16003 instanceof C18229) && (z || !abstractC16003.m36363())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵֫ */
    public void m42576() {
        int i;
        AbstractC17043 abstractC17043M29392 = m42601().m29392("list");
        C11996 c11996M45308 = C19965.m45308(1736577895);
        for (AbstractC16003 abstractC16003 : this.f55797) {
            if (!(abstractC16003 instanceof C25026) && !(abstractC16003 instanceof C7089)) {
                if (abstractC16003 instanceof C8362) {
                    i = 16;
                } else if (abstractC16003 instanceof C18026) {
                    i = 17;
                } else if (abstractC16003 instanceof C17828) {
                    i = 20;
                } else if (abstractC16003 instanceof C9842) {
                    i = 18;
                } else {
                    if (!(abstractC16003 instanceof C18229)) {
                        throw new RuntimeException(abstractC16003.getClass().getSimpleName());
                    }
                    i = 19;
                }
                c11996M45308.writeByte(i);
                abstractC16003.getClass();
                Parcel parcelObtain = Parcel.obtain();
                abstractC16003.requireArguments().writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                c11996M45308.m27454(bArrMarshall);
            }
        }
        try {
            abstractC17043M29392.mo37342();
            abstractC17043M29392.m38654(c11996M45308);
        } catch (IOException e) {
            this.f55788.m13320((Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m42572(boolean z) {
        Class cls;
        C12828 c12828M42601 = m42601();
        AbstractC17043 abstractC17043M29392 = c12828M42601.m29392("list");
        if (abstractC17043M29392.mo25094()) {
            try {
                C14677 c14677 = new C14677(abstractC17043M29392.m38664());
                C23395.m52060((InterfaceC21384) c14677, 1736577895);
                while (c14677.available() > 0) {
                    int i = c14677.readByte() & 255;
                    byte[] bArrM33583 = c14677.m33583();
                    switch (i) {
                        case 16:
                            cls = C8362.class;
                            break;
                        case 17:
                            cls = C18026.class;
                            break;
                        case 18:
                            cls = C9842.class;
                            break;
                        case 19:
                            cls = C18229.class;
                            break;
                        case 20:
                            cls = C17828.class;
                            break;
                        default:
                            throw new RuntimeException("StateType: " + i);
                    }
                    AbstractC16003 abstractC16003 = (AbstractC16003) cls.newInstance();
                    abstractC16003.mo36362(bArrM33583);
                    ComponentCallbacksC11117 componentCallbacksC11117M16809 = m5172().m16809(abstractC16003.m36365());
                    ArrayList arrayList = this.f55797;
                    if (!z) {
                        C1446.m31706(componentCallbacksC11117M16809);
                        arrayList.add(abstractC16003);
                        abstractC16003.m36373(c12828M42601);
                    } else if (componentCallbacksC11117M16809 != null) {
                        arrayList.add((AbstractC16003) componentCallbacksC11117M16809);
                    } else {
                        arrayList.add(abstractC16003);
                        abstractC16003.m36373(c12828M42601);
                    }
                }
            } catch (Exception e) {
                this.f55788.m13320((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final C12828 m42601() {
        C12828 c12828 = this.f55801;
        C12826.requireNonNull(c12828);
        return new C12828(c12828, "state");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42584(MenuItem menuItem) {
        if (C15556.f44442.m24763()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f55780.m41179(true);
            return;
        }
        if (this.f55780.m41180()) {
            return;
        }
        if (itemId == R.id.MT_Protector) {
            m42598((Runnable) null);
            return;
        }
        if (itemId == R.id.MT_Protector) {
            startActivity(new Intent(this, (Class<?>) ActivityC17874.class));
            return;
        }
        if (itemId == R.id.MT_Protector) {
            m42606();
            return;
        }
        if (itemId == R.id.MT_Protector) {
            new C4110(this, new C21564(this.f55801)).m8278();
            return;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m42590(false);
                return;
            }
            return;
        }
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46710(R.string.MT_Protector);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC18686.m42564(this.f4662);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC18686 activityC18686 = this.f19539;
                new C4110(activityC18686, new C21564(activityC18686.f55801)).m8278();
            }
        });
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ᩷ */
    private String m42578(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f55797;
        if (i >= arrayList.size()) {
            return null;
        }
        return C8597.m20011(50, ((AbstractC16003) arrayList.get(i)).mo16325());
    }

    /* JADX INFO: renamed from: ۧ */
    public static C12652 m42551(ActivityC18686 activityC18686, int i) {
        ArrayList arrayList = activityC18686.f55797;
        C12652 c12652 = new C12652();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(i2);
            if (abstractC16003.m36370()) {
                c12652.f35520++;
                if (!abstractC16003.mo19366()) {
                    c12652.f35522++;
                }
                if (i2 < i) {
                    c12652.f35519++;
                } else if (i2 > i) {
                    c12652.f35521++;
                }
            }
        }
        return c12652;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m42593(final int i) {
        String strM42578 = m42578(i);
        if (strM42578 == null) {
            return;
        }
        View viewM12252 = m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM42578));
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۛ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC18686.m42553(this.f21436, i, checkBox);
            }
        };
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, onClickListener);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42521(ActivityC18686 activityC18686, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC18686.f55797);
        C8123.m18820(arrayList, new C9474());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C3934(activityC18686, linkedList, (AbstractC16003) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C3934) linkedList.removeFirst()).m7760();
    }

    /* JADX INFO: renamed from: ۢ */
    public static /* synthetic */ void m42547(ActivityC18686 activityC18686) {
        for (AbstractC16003 abstractC16003 : new ArrayList(activityC18686.f55797)) {
            if (abstractC16003.m36370() && !abstractC16003.mo19366()) {
                abstractC16003.m36361(activityC18686);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m42604(final int i) {
        String strM42578 = m42578(i);
        if (strM42578 == null) {
            return;
        }
        View viewM12252 = m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM42578));
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.۬۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC18686.m42519(this.f42315, i, checkBox);
            }
        };
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, onClickListener);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m42617(int i) {
        String strM42578 = m42578(i);
        if (strM42578 == null) {
            return;
        }
        View viewM12252 = m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM42578));
        DialogInterfaceOnClickListenerC17322 dialogInterfaceOnClickListenerC17322 = new DialogInterfaceOnClickListenerC17322(this, i, (CheckBox) viewM12252.findViewById(R.id.MT_Protector), 1);
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, dialogInterfaceOnClickListenerC17322);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean m42611() {
        for (AbstractC16003 abstractC16003 : new ArrayList(this.f55797)) {
            if ((abstractC16003 instanceof C8362) && abstractC16003.f46351.getBoolean("changed", false)) {
                return true;
            }
            if ((abstractC16003 instanceof C9842) && abstractC16003.f46351.getBoolean("changed", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m42608(final Runnable runnable) {
        if (m42611()) {
            this.f55786.m33752(8388611);
            C20671 c20671BuildDialog = buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ۫᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC18686.m42523(this.f23900, runnable);
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671BuildDialog.m46732();
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42523(ActivityC18686 activityC18686, Runnable runnable) {
        activityC18686.f55786.m33734(8388611);
        activityC18686.m42598(runnable);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42598(Runnable runnable) {
        LinkedList linkedList = new LinkedList();
        for (AbstractC16003 abstractC16003 : new ArrayList(this.f55797)) {
            if ((abstractC16003 instanceof C8362) && abstractC16003.f46351.getBoolean("changed", false)) {
                linkedList.add(((C8362) abstractC16003).m19369(this));
            } else if ((abstractC16003 instanceof C9842) && abstractC16003.f46351.getBoolean("changed", false)) {
                linkedList.add(((C9842) abstractC16003).m23089(this));
            }
        }
        if (!linkedList.isEmpty()) {
            new C24839(this, linkedList, runnable).m22250();
        } else if (runnable != null) {
            runnable.run();
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public final void m42602() {
        C14121 c14121 = this.f55787;
        int i = 0;
        if (c14121 != null && c14121.m32105().m29392("strings_changed").mo25094()) {
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12157(this, i));
            c20671.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12770(i, this));
            c20671.m46732();
            return;
        }
        C20856 c20856 = this.f55802;
        if (c20856 != null && c20856.m47150().m29392("strings_changed").mo25094()) {
            int i3 = DialogInterfaceC2564.f4230;
            C20671 c20672 = new C20671(this);
            c20672.m46727(R.string.MT_Protector);
            c20672.m46710(R.string.MT_Protector);
            c20672.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23805(4, this));
            c20672.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽۤ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC18686.m42517(this.f54162);
                }
            });
            c20672.m46732();
            return;
        }
        m42533(false, true);
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ void m42569(ActivityC18686 activityC18686) {
        activityC18686.f55788.m13349(3);
        activityC18686.f55788.m13348();
    }

    /* JADX INFO: renamed from: ᩷ */
    public static /* synthetic */ void m42579(ActivityC18686 activityC18686) {
        activityC18686.f55788.m13340(3);
        activityC18686.f55788.m13338();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m42526(ActivityC18686 activityC18686, C6103 c6103) {
        C20699 c20699M46760 = C20699.m46760(c6103.f15349, c6103.f15347);
        c20699M46760.f63908 = false;
        String str = c6103.f15348;
        activityC18686.m42599(str, c20699M46760);
        C20856 c20856 = activityC18686.f55802;
        C12826.requireNonNull(c20856);
        c20856.m47114(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42517(ActivityC18686 activityC18686) {
        activityC18686.m42533(false, true);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m42552(ActivityC18686 activityC18686) {
        activityC18686.m42533(true, true);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m42583(ActivityC18686 activityC18686) {
        activityC18686.m42533(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m42533(final boolean z, final boolean z2) {
        m42598(new Runnable() { // from class: l.ۘ۫᩷
            @Override // java.lang.Runnable
            public final void run() {
                int i = ActivityC18686.f55776;
                new C4723(this.f15385, z2, z).m22250();
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m42607(String str) {
        for (AbstractC16003 abstractC16003 : this.f55797) {
            if (abstractC16003 instanceof C8362) {
                C8362 c8362 = (C8362) abstractC16003;
                if (c8362.m19360().equals(str)) {
                    return c8362.m19361(this.f55787, this.f55789);
                }
            }
        }
        C14121 c14121 = this.f55787;
        C12826.requireNonNull(c14121);
        return c14121.m32113(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m42613(String str) {
        for (AbstractC16003 abstractC16003 : this.f55797) {
            if (abstractC16003 instanceof C9842) {
                C9842 c9842 = (C9842) abstractC16003;
                if (c9842.m23088().equals(str)) {
                    return c9842.m23085(this.f55802, this.f55789);
                }
            }
        }
        C20856 c20856 = this.f55802;
        C12826.requireNonNull(c20856);
        return c20856.m47152(str);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0184 A[PHI: r11
      0x0184: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v1 java.lang.String) binds: [B:51:0x0182, B:7:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01c9 A[PHI: r10
      0x01c9: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v1 java.lang.String) binds: [B:57:0x01c7, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0264 A[PHI: r6 r13 r14
      0x0264: PHI (r6v3 l.ۧ۫᩷) = (r6v2 l.ۧ۫᩷), (r6v1 l.ۧ۫᩷), (r6v1 l.ۧ۫᩷) binds: [B:70:0x0262, B:28:0x00cd, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r13v4 short[]) = (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:70:0x0262, B:28:0x00cd, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:70:0x0262, B:28:0x00cd, B:18:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e3 A[PHI: r4
      0x02e3: PHI (r4v3 l.۫ۧۢ) = (r4v2 l.۫ۧۢ), (r4v1 l.۫ۧۢ) binds: [B:80:0x02cb, B:77:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0314  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        if (p067l.C0917.f81868 != false) goto L11;
     */
    /* JADX INFO: renamed from: ۢ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m42597() {
        int iM55979;
        int i;
        int i2;
        int iM55680;
        int i3;
        int i4;
        int iM55681;
        int i5;
        int i6;
        ActivityC18686 activityC18686 = this;
        InterfaceC17021 interfaceC17021 = null;
        AbstractC17043 abstractC17043M47141 = null;
        C14121 c14121 = null;
        AbstractC17043 abstractC17043M29392 = null;
        C12828 c12828M38427 = null;
        Object obj = null;
        int i7 = 0;
        String strM55986 = null;
        String strM56144 = null;
        String strM55810 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 2134508342;
        int i11 = RunnableC0938.f81886;
        int i12 = ViewOnClickListenerC0939.f81888;
        int iM55682 = C0873.m55680("᩹ܶ") ^ i11;
        int i13 = ((iM55682 ^ i12) * 27371) ^ 1385653375;
        int i14 = iM55682 ^ 230189624;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = 0;
        int i16 = 0;
        short s = 0;
        int i17 = 0;
        int i18 = 0;
        C20856 c20856 = null;
        int i19 = 0;
        short[] sArr3 = null;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-8321)) >> 31));
            switch (i10) {
                case -2127177523:
                case -689072500:
                    if (C0912.m55837(abstractC17043M47141)) {
                        abstractC17043M29392 = abstractC17043M47141;
                        iM55681 = (C0873.m55680("ܺ֨") + i12) * 101;
                        i5 = ((iM55681 ^ i11) * 7053) ^ 329392202;
                        i6 = 1658364478;
                    } else {
                        iM55681 = (C0873.m55680("۠ܰ") + i12) * 77;
                        i5 = ((iM55681 ^ i11) * (-6845)) ^ 805983219;
                        i6 = -538627665;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -2099246967:
                case 1651371332:
                    if (C1046.f81962 > 0) {
                        iM55681 = (i12 - C0873.m55680("ۢ۠")) * (-127);
                        i5 = ((iM55681 ^ i11) * (-2429)) ^ 1229992902;
                        i6 = -226874618;
                    } else {
                        iM55681 = (C0946.m55979("ۡۜ") ^ i12) * (-51);
                        i5 = ((iM55681 ^ i11) * 1149) ^ 1251916452;
                        i6 = 460282180;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -2005492997:
                case 1075697805:
                    if (m42618()) {
                        iM55681 = C0873.m55680("ᩳ᩷") ^ i12;
                        i5 = ((iM55681 ^ i11) * (-9477)) ^ (-498383548);
                        i6 = -2009254971;
                    } else {
                        iM55681 = (C0873.m55680("ۗۘ") ^ i12) * (-23);
                        i5 = ((iM55681 ^ i11) * 21653) ^ (-287740052);
                        i6 = -1054216033;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -1860200140:
                case 354378388:
                    c14121 = activityC18686.f55787;
                    if (c14121 != null) {
                        iM55681 = C0873.m55680("ۡ֫") ^ i11;
                        i5 = ((iM55681 ^ i12) * 9745) ^ 1923434316;
                        i6 = 1490913378;
                    } else {
                        abstractC17043M29392 = abstractC17043M47141;
                        iM55681 = (C0873.m55680("ܺ֨") + i12) * 101;
                        i5 = ((iM55681 ^ i11) * 7053) ^ 329392202;
                        i6 = 1658364478;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -1837684983:
                case 306596976:
                    C1044.m56272(activityC18686, obj, interfaceC17021);
                    break;
                case -1741946397:
                case 524247165:
                    sArr3 = sArr3;
                    i19 = i19;
                    i8 = i17 * i17;
                    i9 = s * 2;
                    if (C1036.f81953 >= 0) {
                        iM55979 = C0946.m55979("ۘۨ") ^ i11;
                        i = ((iM55979 ^ i12) * 30313) ^ 88753816;
                        i2 = -208737922;
                    } else {
                        iM55979 = (C0873.m55680("ۧۨ") + i11) * (-101);
                        i = ((iM55979 ^ i12) * 4397) ^ 302375022;
                        i2 = -1999372477;
                    }
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC18686 = this;
                    sArr3 = sArr3;
                    break;
                case -1711601950:
                case 1575573282:
                    sArr3 = sArr3;
                    i19 = i19;
                    s = sArr[c];
                    if (C1071.f81975 > 0) {
                        iM55979 = (C0946.m55979("۬۠") + i11) * 37;
                        i = ((iM55979 ^ i12) * (-27303)) ^ 726575647;
                        i2 = 152096141;
                        i14 = iM55979 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC18686 = this;
                        sArr3 = sArr3;
                    } else {
                        i19 = i19;
                        sArr3 = sArr3;
                        iM55680 = C0873.m55680("᩹᩻") ^ i11;
                        i3 = ((iM55680 ^ i12) * 13219) ^ 1761254202;
                        i4 = 635792633;
                        i14 = iM55680 ^ i4;
                        i13 = i3;
                        activityC18686 = this;
                    }
                    break;
                case -1671917873:
                case -1379656976:
                    sArr3 = sArr3;
                    i19 = i19;
                    sArr = f82278;
                    c = 5;
                    if (C0989.m56095() <= 0) {
                        iM55979 = C0946.m55979("᩺ۚ") ^ i12;
                        i = ((iM55979 ^ i11) * (-13221)) ^ 1793934853;
                        i2 = -1230788640;
                    } else {
                        iM55979 = (C0873.m55680("ۗܶ") + i12) * 45;
                        i = ((iM55979 ^ i11) * (-27179)) ^ 1566762724;
                        i2 = 1402036572;
                    }
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC18686 = this;
                    sArr3 = sArr3;
                    break;
                case -1669926347:
                case 1315287789:
                    i15 = 45005;
                    iM55979 = C0873.m55680("ܰ۫") ^ i12;
                    i = ((iM55979 ^ i11) * 16453) ^ 1864613385;
                    i2 = -1375078587;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC18686 = this;
                    sArr3 = sArr3;
                    break;
                case -1614250383:
                case -287785377:
                    try {
                        C23058.m51450(activityC18686, interfaceC17021);
                        iM55681 = (C0873.m55680("ܳ᩹") + i12) * (-109);
                        i5 = ((iM55681 ^ i11) * 9377) ^ 515015025;
                        i6 = 522364814;
                        i14 = iM55681 ^ i6;
                    } catch (Throwable th) {
                        int iM559710 = C0946.m55979("᩹ۛ") ^ i11;
                        i5 = ((iM559710 ^ i12) * 26481) ^ 1511920726;
                        i14 = iM559710 ^ 60277665;
                        obj = th;
                    }
                    i13 = i5;
                    break;
                case -1605012227:
                case 175355865:
                    strM55986 = C0946.m55986(f82278, 9, 3, i15);
                    if (ViewOnClickListenerC0939.f81888 > 0) {
                        iM55681 = (C0873.m55680("֡۫") ^ i11) * 57;
                        i5 = ((iM55681 ^ i12) * (-17899)) ^ 778351818;
                        i6 = 1917532474;
                        i14 = iM55681 ^ i6;
                        i13 = i5;
                    } else {
                        sArr3 = sArr3;
                        i19 = i19;
                        iM55979 = C0946.m55979("᩺ۚ") ^ i12;
                        i = ((iM55979 ^ i11) * (-13221)) ^ 1793934853;
                        i2 = -1230788640;
                        i14 = iM55979 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC18686 = this;
                        sArr3 = sArr3;
                    }
                    break;
                case -1564907125:
                case 1651290360:
                    sArr3 = f82278;
                    i18 = 6;
                    i19 = 3;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("᩹᩻") ^ i11;
                        i3 = ((iM55680 ^ i12) * 13219) ^ 1761254202;
                        i4 = 635792633;
                    } else {
                        iM55680 = (C0873.m55680("۫ۛ") + i11) * 65;
                        i3 = ((iM55680 ^ i12) * (-11779)) ^ (-1634049520);
                        i4 = -946908683;
                    }
                    i14 = iM55680 ^ i4;
                    i13 = i3;
                    activityC18686 = this;
                    break;
                case -1486283813:
                case 1860570403:
                    C0947.m55997();
                    if (C0894.f81854 >= 0) {
                        iM55681 = (i12 - C0873.m55680("ۢ۠")) * (-127);
                        i5 = ((iM55681 ^ i11) * (-2429)) ^ 1229992902;
                        i6 = -226874618;
                    } else {
                        iM55681 = (C0946.m55979("ܿܰ") + i11) * (-5);
                        i5 = ((iM55681 ^ i12) * 28857) ^ (-1279653425);
                        i6 = -1627660222;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -1310501205:
                case 964296384:
                    i15 = 57717;
                    iM55979 = C0873.m55680("ܰ۫") ^ i12;
                    i = ((iM55979 ^ i11) * 16453) ^ 1864613385;
                    i2 = -1375078587;
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC18686 = this;
                    sArr3 = sArr3;
                    break;
                case -1310299559:
                case -896981143:
                    strM56144 = C1012.m56144(f82278, 31, 3, i15);
                    if (C0898.f81858 <= 0) {
                        iM55681 = (i11 - C0946.m55979("ۚ᩸")) * (-59);
                        i5 = ((iM55681 ^ i12) * (-14445)) ^ 778366224;
                        i6 = -1826063859;
                    } else {
                        iM55681 = (C0946.m55979("ۤۧ") + i11) * 123;
                        i5 = ((iM55681 ^ i12) * (-9065)) ^ (-1348127410);
                        i6 = -991486927;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -1301883709:
                case 848414614:
                    C20856 c20857 = activityC18686.f55802;
                    if (c20857 != null) {
                        int iM559711 = C0946.m55979("ۜ᩷") ^ i11;
                        c20856 = c20857;
                        i13 = ((iM559711 ^ i12) * 10759) ^ (-164783537);
                        i14 = iM559711 ^ 1323469934;
                        interfaceC17021 = null;
                    } else {
                        c20856 = c20857;
                        interfaceC17021 = null;
                        abstractC17043M47141 = null;
                        iM55681 = C0873.m55680("ۡۨ") ^ i12;
                        i5 = ((iM55681 ^ i11) * (-29891)) ^ (-1674190972);
                        i6 = 654452860;
                        i14 = iM55681 ^ i6;
                        i13 = i5;
                    }
                    break;
                case -1274675983:
                case 307082966:
                    C1194.m56396();
                    break;
                case -1200358053:
                case -187365718:
                    AbstractC0942.m55971();
                    if (C0877.f81843 < 0) {
                        iM55681 = (C0946.m55979("ۡۜ") ^ i12) * (-51);
                        i5 = ((iM55681 ^ i11) * 1149) ^ 1251916452;
                        i6 = 460282180;
                    } else {
                        iM55681 = (i11 - C0946.m55979("ۚ᩸")) * (-59);
                        i5 = ((iM55681 ^ i12) * (-14445)) ^ 778366224;
                        i6 = -1826063859;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -1147117965:
                case 166302074:
                    C0917.m55842(C0873.m55680(strM55986) ^ 2128027926);
                    break;
                case -1132470151:
                case 709443624:
                    if (C0912.m55837(abstractC17043M29392)) {
                        iM55681 = C0873.m55680("ۧ۟") ^ i12;
                        i5 = ((iM55681 ^ i11) * 20873) ^ (-15648900);
                        i6 = 1578761147;
                    } else {
                        iM55681 = (C0873.m55680("ۖ֡") ^ i12) * (-9);
                        i5 = ((iM55681 ^ i11) * (-14339)) ^ (-1099543456);
                        i6 = -2101997921;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -918647390:
                case 38707593:
                    c12828M38427 = c14121.m38427();
                    sArr2 = f82278;
                    i16 = 12;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55681 = (C0946.m55979("ۡۜ") ^ i12) * (-51);
                        i5 = ((iM55681 ^ i11) * 1149) ^ 1251916452;
                        i6 = 460282180;
                    } else {
                        iM55681 = C0946.m55979("۠۟") ^ i11;
                        i5 = ((iM55681 ^ i12) * (-9885)) ^ (-2119751132);
                        i6 = 1732870215;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -862156017:
                case 2040743046:
                    sArr3 = sArr3;
                    int i20 = i18;
                    int i21 = i19;
                    int iM559712 = C0946.m55979(C0863.m55635(sArr3, i20, i21, i15));
                    if (C1229.f82066 >= 0) {
                        i19 = i21;
                        i18 = i20;
                        i7 = iM559712;
                        iM55979 = (C0946.m55979("ܶ᩻") ^ i11) * (-17);
                        i = ((iM55979 ^ i12) * 433) ^ (-2142146321);
                        i2 = 90692037;
                        i14 = iM55979 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC18686 = this;
                        sArr3 = sArr3;
                    } else {
                        int iM559713 = (C0946.m55979("ۖܽ") ^ i12) * 79;
                        i13 = ((iM559713 ^ i11) * (-13967)) ^ (-2127047729);
                        i14 = iM559713 ^ 478736482;
                        i19 = i21;
                        sArr3 = sArr3;
                        activityC18686 = this;
                        i18 = i20;
                        i7 = iM559712;
                    }
                    break;
                case -769397903:
                case -602023530:
                    strM55810 = C0906.m55810(f82278, 34, 3, i15);
                    if (C0890.f81849 != 0) {
                        iM55681 = C0873.m55680("ۢ֫") ^ i12;
                        i5 = ((iM55681 ^ i11) * 12959) ^ 1789880068;
                        i6 = 625839618;
                    } else {
                        iM55681 = C0873.m55680("ۗ۠") ^ i11;
                        i5 = ((iM55681 ^ i12) * (-6739)) ^ 1427011599;
                        i6 = -1366340803;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -756191900:
                case 640427367:
                    C1053.m56329(new C2710(activityC18686, abstractC17043M29392));
                    break;
                case -631349894:
                case 1353893223:
                    if (abstractC17043M29392 != null) {
                        iM55681 = C0946.m55979("ۧۤ") ^ i11;
                        i5 = ((iM55681 ^ i12) * 5473) ^ 771026833;
                        i6 = 765256590;
                    } else {
                        iM55681 = (C0873.m55680("ۖ֡") ^ i12) * (-9);
                        i5 = ((iM55681 ^ i11) * (-14339)) ^ (-1099543456);
                        i6 = -2101997921;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -603901906:
                case -218518792:
                    activityC18686.m12271(C0946.m55979(strM56144) ^ 2127463782);
                    break;
                case -553534369:
                case 698428986:
                    abstractC17043M47141 = c20856.m47141();
                    iM55681 = C0873.m55680("ۡۨ") ^ i12;
                    i5 = ((iM55681 ^ i11) * (-29891)) ^ (-1674190972);
                    i6 = 654452860;
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -543220126:
                case 662722168:
                    C1044.m56286();
                    if (C0863.f81833 <= 0) {
                        iM55681 = (i12 - C0873.m55680("ۢ۠")) * (-127);
                        i5 = ((iM55681 ^ i11) * (-2429)) ^ 1229992902;
                        i6 = -226874618;
                        i14 = iM55681 ^ i6;
                        i13 = i5;
                    } else {
                        iM55680 = C0873.m55680("᩹᩻") ^ i11;
                        i3 = ((iM55680 ^ i12) * 13219) ^ 1761254202;
                        i4 = 635792633;
                        i14 = iM55680 ^ i4;
                        i13 = i3;
                        activityC18686 = this;
                    }
                    break;
                case -509785474:
                case -97863991:
                    sArr3 = sArr3;
                    i19 = i19;
                    if (C0894.m55772()) {
                        iM55979 = (C0946.m55979("ܺܰ") + i11) * 37;
                        i = ((iM55979 ^ i12) * (-9461)) ^ 2054659637;
                        i2 = 1820651552;
                    } else {
                        iM55979 = (i12 - C0873.m55680("ۖۡ")) * (-111);
                        i = ((iM55979 ^ i11) * 31167) ^ (-359924727);
                        i2 = 643023783;
                    }
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC18686 = this;
                    sArr3 = sArr3;
                    break;
                case -494716809:
                case 724558173:
                    C1404.m56468();
                    if (!C0866.m55645()) {
                        iM55681 = (i12 - C0873.m55680("ۢ۠")) * (-127);
                        i5 = ((iM55681 ^ i11) * (-2429)) ^ 1229992902;
                        i6 = -226874618;
                        i14 = iM55681 ^ i6;
                        i13 = i5;
                    } else {
                        sArr3 = sArr3;
                        i19 = i19;
                        iM55979 = C0946.m55979("ۘۨ") ^ i11;
                        i = ((iM55979 ^ i12) * 30313) ^ 88753816;
                        i2 = -208737922;
                        i14 = iM55979 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC18686 = this;
                        sArr3 = sArr3;
                    }
                    break;
                case -360921710:
                case 894616167:
                    C0917.m55842(2116561456 ^ i7);
                    new ViewOnClickListenerC2424(activityC18686);
                    break;
                case -299227659:
                case 860516201:
                    break;
                case -207952783:
                case 77057904:
                    break;
                case -156597102:
                case 1475766224:
                    abstractC17043M29392 = c12828M38427.m29392(C0892.m55750(sArr2, i16, 19, i15));
                    iM55681 = (C0873.m55680("ܺ֨") + i12) * 101;
                    i5 = ((iM55681 ^ i11) * 7053) ^ 329392202;
                    i6 = 1658364478;
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case -133025558:
                case 1860548674:
                    sArr3 = sArr3;
                    i19 = i19;
                    if ((i9 + 1) - i8 > 0) {
                        iM55979 = (i12 - C0946.m55979("֡᩻")) * (-21);
                        i = ((iM55979 ^ i11) * 20191) ^ (-2080838688);
                        i2 = 543030591;
                    } else {
                        iM55979 = (i11 - C0946.m55979("֨ۚ")) * (-115);
                        i = ((iM55979 ^ i12) * 15081) ^ (-1414094433);
                        i2 = -360551763;
                    }
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC18686 = this;
                    sArr3 = sArr3;
                    break;
                case -43067078:
                case 1931563116:
                    if (abstractC17043M47141 != null) {
                        iM55681 = (i11 - C0946.m55979("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM55681 ^ i12) * (-14949)) ^ (-1247633319);
                        i6 = 1410763570;
                    } else {
                        iM55681 = (C0873.m55680("۠ܰ") + i12) * 77;
                        i5 = ((iM55681 ^ i11) * (-6845)) ^ 805983219;
                        i6 = -538627665;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case 156048509:
                case 522162011:
                    sArr3 = sArr3;
                    i19 = i19;
                    i17 = s + 1;
                    if (C1044.f81959 >= 0) {
                        iM55979 = (C0946.m55979("ܶ᩻") ^ i11) * (-17);
                        i = ((iM55979 ^ i12) * 433) ^ (-2142146321);
                        i2 = 90692037;
                    } else {
                        iM55979 = C0946.m55979("᩶᩷") ^ i12;
                        i = ((iM55979 ^ i11) * (-18421)) ^ 523112938;
                        i2 = 1260358283;
                    }
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC18686 = this;
                    sArr3 = sArr3;
                    break;
                case 171606868:
                case 1006938437:
                    if (C11164.m25765(this)) {
                        iM55681 = C0873.m55680("֡ۧ") ^ i12;
                        i5 = ((iM55681 ^ i11) * (-30795)) ^ 1534628340;
                        i6 = 1913599030;
                    } else {
                        iM55681 = (C0873.m55680("ᩳ᩶") ^ i11) * 27;
                        i5 = ((iM55681 ^ i12) * 151) ^ 1547020274;
                        i6 = -43569982;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case 904507965:
                case 1250778660:
                    if (C0894.f81854 >= 0) {
                        iM55681 = C0946.m55979("ۖ֫") ^ i12;
                        i5 = ((iM55681 ^ i11) * 5879) ^ (-1822713920);
                        i6 = -213227911;
                    } else {
                        iM55681 = C0873.m55680("ۢ֫") ^ i12;
                        i5 = ((iM55681 ^ i11) * 12959) ^ 1789880068;
                        i6 = 625839618;
                    }
                    i14 = iM55681 ^ i6;
                    i13 = i5;
                    break;
                case 947553045:
                case 1064062718:
                    activityC18686.m12271(C0873.m55680(strM55810) ^ 2098455548);
                    break;
                case 1780925012:
                case 1903096124:
                    C0992.m56107();
                    if (!C0947.f81895) {
                        sArr3 = sArr3;
                        i19 = i19;
                        iM55979 = C0946.m55979("ۘۨ") ^ i11;
                        i = ((iM55979 ^ i12) * 30313) ^ 88753816;
                        i2 = -208737922;
                        i14 = iM55979 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC18686 = this;
                        sArr3 = sArr3;
                    } else {
                        iM55681 = C0946.m55979("ۖ֫") ^ i12;
                        i5 = ((iM55681 ^ i11) * 5879) ^ (-1822713920);
                        i6 = -213227911;
                        i14 = iM55681 ^ i6;
                        i13 = i5;
                    }
                    break;
                case 1979997896:
                case 2056543168:
                    sArr3 = sArr3;
                    int i22 = i19;
                    if (C0927.m55866()) {
                        i19 = i22;
                        iM55979 = (C0946.m55979("ۘۖ") ^ i11) * (-21);
                        i = ((iM55979 ^ i12) * 3351) ^ 843752968;
                        i2 = 988889610;
                    } else {
                        iM55979 = C0946.m55979("᩷۫") ^ i12;
                        i19 = i22;
                        i = ((iM55979 ^ i11) * (-24719)) ^ (-436898787);
                        i2 = -193598562;
                    }
                    i14 = iM55979 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC18686 = this;
                    sArr3 = sArr3;
                    break;
                default:
                    C1229.m56410();
                    C1929.m56553();
                    iM55680 = C0873.m55680("᩹᩻") ^ i11;
                    i3 = ((iM55680 ^ i12) * 13219) ^ 1761254202;
                    i4 = 635792633;
                    i14 = iM55680 ^ i4;
                    i13 = i3;
                    activityC18686 = this;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܺ֫ */
    public final void m42606() {
        AbstractC17043 abstractC17043 = C3019.f5397;
        if (!abstractC17043.mo25094()) {
            abstractC17043.mo25497();
        }
        int i = 1;
        while (true) {
            if (!abstractC17043.m38684("Project" + i).mo25094()) {
                C20146 c20146 = new C20146(this, this, abstractC17043);
                c20146.m33344(R.string.MT_Protector);
                c20146.m33336((CharSequence) ("Project" + i));
                c20146.m33330();
                c20146.m33365(6);
                c20146.m33367();
                c20146.m33342(R.string.MT_Protector);
                c20146.m33352(true);
                return;
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f55796 = true;
        if (m42618()) {
            try {
                ExecutorService executorService = C4081.f8987;
                final C12828 c12828 = this.f55801;
                C12826.requireNonNull(c12828);
                executorService.submit(new Callable() { // from class: l.᩸۫᩷
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(c12828.m29395());
                    }
                }).get(100L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            if (this.f55788.f14669) {
                C7050.m16209(new Intent("ACTION_MT_CLOSE_RESOURCE_QUERIER"));
            }
        }
        super.finish();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42600(boolean z) {
        if (!z && m42611()) {
            throw new RuntimeException("hasModifiedFiles");
        }
        new C20817(this).m22250();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m42565(ActivityC18686 activityC18686, int i) {
        int iM42511;
        ArrayList arrayList = activityC18686.f55797;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        AbstractC16003 abstractC16003 = (AbstractC16003) arrayList.get(i);
        if (abstractC16003.m36363()) {
            iM42511 = activityC18686.m42511(0, false);
            Bundle bundleRequireArguments = abstractC16003.requireArguments();
            C12826.requireNonNull(bundleRequireArguments);
            bundleRequireArguments.putBoolean("top", false);
            while (iM42511 < arrayList.size() && ((AbstractC16003) arrayList.get(iM42511)).m36363()) {
                iM42511++;
            }
        } else {
            int iM42512 = activityC18686.m42511(0, true);
            Bundle bundleRequireArguments2 = abstractC16003.requireArguments();
            C12826.requireNonNull(bundleRequireArguments2);
            bundleRequireArguments2.putBoolean("top", true);
            iM42511 = iM42512;
        }
        if (i != iM42511) {
            AbstractC16003 abstractC16004 = (AbstractC16003) arrayList.get(activityC18686.f55799);
            if (i < iM42511) {
                iM42511--;
            }
            arrayList.remove(i);
            arrayList.add(iM42511, abstractC16003);
            activityC18686.f55799 = arrayList.indexOf(abstractC16004);
            activityC18686.m42541();
        }
        activityC18686.m42576();
        activityC18686.f55794.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C5946 m42614() {
        return this.f55788;
    }
}
