package l;

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
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
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
public class ActivityC17169 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ֫ۤ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f52594 = {2939, -24690, -24695, -24690, -24685, 28, -7898, 8339, 16151, -9476, -15021, -7875, -20567, -20564, -20551, -20564, -20510, -20545, -20568, -20546, -20574, -20552, -20545, -20562, -20568, -20546, -20509, -20564, -20545, -20546, -20562, -11281, -1054, -2626, 11344, 12612, 12706};

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52595 = 0;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f52596;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C1556 f52597;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f52598;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public C16557 f52599;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public boolean f52601;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public C8202 f52604;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public C13064 f52605;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C12366 f52606;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public C3764 f52607;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public C12230 f52608;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public TextView f52609;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f52610;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f52611;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C9762 f52612;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C11649 f52613;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public boolean f52615;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C13132 f52617;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f52618;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public String f52619;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C11005 f52620;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C19452 f52621;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f52616 = new ArrayList();

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public LinkedList f52603 = new LinkedList();

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public C4650 f52602 = new C4650(1, this);

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f52614 = new AtomicReference();

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C8817 f52600 = C8817.m22787();

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "ProjectActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Boolean m40267(ActivityC17169 activityC17169, AbstractC14346 abstractC14346) {
        activityC17169.getClass();
        return Boolean.valueOf((abstractC14346 instanceof InterfaceC11525) && ((InterfaceC11525) abstractC14346).mo21122(activityC17169.f52621));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40274(ActivityC17169 activityC17169, int i, CheckBox checkBox) {
        activityC17169.getClass();
        ArrayList arrayList = new ArrayList(activityC17169.f52616.subList(0, i));
        C6055.m16891(arrayList, new C1771());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C1647(activityC17169, linkedList, (AbstractC14346) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Boolean m40305(ActivityC17169 activityC17169, AbstractC14346 abstractC14346) {
        activityC17169.getClass();
        return Boolean.valueOf((abstractC14346 instanceof InterfaceC3900) && ((InterfaceC3900) abstractC14346).mo11876(activityC17169.f52606));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40308(ActivityC17169 activityC17169, int i, CheckBox checkBox) {
        activityC17169.getClass();
        ArrayList arrayList = new ArrayList(activityC17169.f52616);
        arrayList.remove(i);
        C6055.m16891(arrayList, new C21608(1));
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C1647(activityC17169, linkedList, (AbstractC14346) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m40319(ActivityC17169 activityC17169) {
        activityC17169.getClass();
        try {
            C20197.m46431(activityC17169.f52620);
            activityC17169.m40355(true);
        } catch (Throwable th) {
            activityC17169.m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40321(ActivityC17169 activityC17169, int i, CheckBox checkBox) {
        activityC17169.getClass();
        ArrayList arrayList = activityC17169.f52616;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C6055.m16891(arrayList2, new C13825());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C1647(activityC17169, linkedList, (AbstractC14346) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        m10241(R.layout.MT_Protector);
        m10214();
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C1065 c1065 = new C1065(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c1065);
        m10244().m30602(2);
        m40264();
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        C9762 c9763 = (C9762) m10241(R.id.MT_Protector);
        this.f52612 = c9763;
        c9763.inflateMenu(R.menu.MT_Protector);
        this.f52599 = new C16557(this.f52612, R.id.MT_Protector, R.id.more);
        MenuItem menuItemFindItem = this.f52612.getMenu().findItem(R.id.MT_Protector);
        this.f52612.setOnMenuItemClickListener(new C16648(0, this));
        this.f52605 = (C13064) m10241(R.id.MT_Protector);
        this.f52611 = (FloatingActionButton) m10241(R.id.MT_Protector);
        m10229(this.f52605, m10241(R.id.MT_Protector), this.f10584, m10241(R.id.MT_Protector), this.f52612, this.f52611);
        this.f52605.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ᩳ۫᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC17169.m40298(this.f56271);
            }
        });
        C7623 c7623 = new C7623(this, this.f52605, this.f10584);
        c7623.m20413().m15982(C21943.f70298.getDefaultColor());
        this.f52605.m31651(c7623);
        c7623.m20414();
        this.f52605.m31651(new C5299(this));
        C3764 c3764 = (C3764) new C4741(this).m13885(C3764.class);
        this.f52607 = c3764;
        C5242 c5242M11418 = c3764.m11418();
        C11003.requireNonNull(menuItemFindItem);
        c5242M11418.m1668(this, new C19323(menuItemFindItem));
        this.f52607.m11419().m1668(this, new InterfaceC1008() { // from class: l.ܿ۫᩷
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C12366 c12366 = (C12366) obj;
                int i = ActivityC17169.f52595;
                if (c12366 != null) {
                    c12366.m30057(this.f53159);
                }
            }
        });
        this.f52607.m11392(this, this.f52602);
        this.f52607.m11390(this, new C7385(4, this));
        C5242 c5242M11403 = this.f52607.m11403();
        C9762 c9764 = this.f52612;
        C11003.requireNonNull(c9764);
        c5242M11403.m1668(this, new C14531(0, c9764));
        this.f52608 = (C12230) new C4741(this).m13885(C12230.class);
        this.f52604 = new C8202();
        C4925.m14316(new RunnableC23704(0, this), 500L);
        if (getIntent().hasExtra("bundle") && bundle == null) {
            Bundle extras = getIntent().getExtras();
            C11003.requireNonNull(extras);
            bundle = extras.getBundle("bundle");
            getIntent().getExtras().remove("bundle");
            C12171.m29644(this.f52607.m11419().m1662());
            C12171.m29644(this.f52607.m11411().m1662());
        }
        if (bundle != null) {
            this.f52620 = (C11005) bundle.getSerializable("projectRootDir");
            String[] stringArray = bundle.getStringArray("backStack");
            this.f52618 = bundle.getInt("currentFragment", 0);
            this.f52619 = bundle.getString("outputPath", null);
            if (this.f52620 == null || stringArray == null) {
                finish();
                return;
            }
            LinkedList linkedList = this.f52603;
            linkedList.clear();
            Collections.addAll(linkedList, stringArray);
            try {
                m40322(false);
                C12366 c12366 = this.f52606;
                ArrayList arrayList = this.f52616;
                if (c12366 != null) {
                    ComponentCallbacksC9205 componentCallbacksC9205M14899 = m2843().m14899("000000-0000-0000-0000-000000000000");
                    if (componentCallbacksC9205M14899 == null) {
                        componentCallbacksC9205M14899 = new C23840();
                        this.f52618 = 0;
                        AbstractC16882 abstractC16882M14900 = m2843().m14900();
                        abstractC16882M14900.m39682(componentCallbacksC9205M14899, "000000-0000-0000-0000-000000000000");
                        abstractC16882M14900.mo39685();
                    }
                    arrayList.add((AbstractC14346) componentCallbacksC9205M14899);
                }
                if (this.f52621 != null) {
                    ComponentCallbacksC9205 componentCallbacksC9205M148910 = m2843().m14899("000000-0000-0000-0000-000000000001");
                    if (componentCallbacksC9205M148910 == null) {
                        componentCallbacksC9205M148910 = new C4966();
                        if (this.f52606 == null) {
                            this.f52618 = 0;
                            AbstractC16882 abstractC16882M14901 = m2843().m14900();
                            abstractC16882M14901.m39682(componentCallbacksC9205M148910, "000000-0000-0000-0000-000000000001");
                            abstractC16882M14901.mo39685();
                        }
                    }
                    arrayList.add((AbstractC14346) componentCallbacksC9205M148910);
                }
                m40327(true);
                if (this.f52621 == null && m40371() && C5378.stream(arrayList).noneMatch(new C2538(0))) {
                    arrayList.add(1, new C16688());
                    m40331();
                }
                m40293();
                m40296();
            } catch (IOException e) {
                m10224((Throwable) e, true);
            }
            m10241(R.id.MT_Protector).setVisibility(8);
            if (bundle.getBoolean("hideProjectLoadingView", false)) {
                m40360();
                return;
            }
            return;
        }
        new C15175(this).m20274();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40298(ActivityC17169 activityC17169) {
        int width = (activityC17169.f52605.getWidth() - activityC17169.f52605.getChildAt(1).getWidth()) - activityC17169.f52611.getWidth();
        int iM27878 = C11266.m27878(36.0f);
        float f = -(width > iM27878 * 2 ? width - iM27878 : width / 2);
        if (activityC17169.f52611.getTranslationX() != f) {
            activityC17169.f52611.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40279(ActivityC17169 activityC17169, String str) {
        ArrayList arrayList = activityC17169.f52616;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((AbstractC14346) arrayList.get(i)).m34232().equals(str)) {
                activityC17169.m40268(i, true, false);
                return;
            }
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        m40264();
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    private void m40264() {
        if (getResources().getConfiguration().orientation == 2) {
            m10244().m30599(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m10244().m30604(1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40340(CharSequence charSequence) {
        this.f10584.setSubtitle(charSequence);
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final TextView m40364() {
        if (this.f52609 == null) {
            try {
                Field declaredField = C9762.class.getDeclaredField("mSubtitleTextView");
                declaredField.setAccessible(true);
                this.f52609 = (TextView) declaredField.get(this.f10584);
            } catch (Exception unused) {
            }
        }
        return this.f52609;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m40365(int i) {
        C8202 c8202 = this.f52604;
        if (c8202 != null) {
            c8202.m21700(this, i);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View m40367(int i) {
        C8202 c8202 = this.f52604;
        if (c8202 != null) {
            return c8202.m21699(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final void m40360() {
        View viewM10241 = m10241(R.id.MT_Protector);
        if (viewM10241.getVisibility() != 8) {
            viewM10241.setVisibility(8);
        }
        this.f52596 = true;
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        m40345(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40345(boolean z) {
        C12366 c12366 = this.f52606;
        if (c12366 == null || !c12366.m30043(this, this.f52607)) {
            C19452 c19452 = this.f52621;
            if (c19452 == null || !c19452.m44832(this, this.f52607)) {
                if (z && this.f52600.m22791()) {
                    C21374.m48457(R.string.MT_Protector);
                } else {
                    finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final void m40351() {
        C12366 c12366;
        int i = 0;
        boolean z = !(this.f52621 == null || this.f52606 == null) || ((c12366 = this.f52606) != null && c12366.m30048());
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44416(z ? R.string.MT_Protector : R.string.MT_Protector);
        c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20883(i, this));
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9594(0, this));
        c19258.m44438();
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("hideProjectLoadingView", this.f52596);
        bundle.putStringArray("backStack", (String[]) this.f52603.toArray(new String[0]));
        C11005 c11005 = this.f52620;
        if (c11005 != null) {
            bundle.putSerializable("projectRootDir", c11005);
            bundle.putInt("currentFragment", this.f52618);
            bundle.putString("outputPath", this.f52619);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40277(ActivityC17169 activityC17169, Exception exc) {
        activityC17169.m10223(exc, (DialogInterface.OnDismissListener) null);
        if (exc instanceof C1783) {
            C1783 c1783 = (C1783) exc;
            C19287 c19287M44466 = C19287.m44466(c1783.f6159, c1783.f6160);
            c19287M44466.f60678 = false;
            activityC17169.m40343(c1783.m5935(), c19287M44466);
            C12366 c12366 = activityC17169.f52606;
            C11003.requireNonNull(c12366);
            c12366.m30026(c1783.m5935());
            return;
        }
        if (exc instanceof C5672) {
            C5672 c5672 = (C5672) exc;
            C19287 c19287M44467 = C19287.m44466(c5672.f17514, c5672.f17513);
            c19287M44467.f60678 = false;
            activityC17169.m40354(c5672.m15979(), c19287M44467);
            C19452 c19452 = activityC17169.f52621;
            C11003.requireNonNull(c19452);
            c19452.m44818(c5672.m15979());
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static void m40337(ActivityC17169 activityC17169) {
        if (activityC17169.f52621 == null || !activityC17169.f52610) {
            return;
        }
        activityC17169.f52610 = false;
        new C22232(activityC17169, (C20765) activityC17169.getLifecycle()).m20274();
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final void m40347() {
        C11649 c11649 = this.f52613;
        if (c11649 != null) {
            c11649.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40358() {
        if (this.f52605.m31666(8388611)) {
            this.f52605.m31647(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public void m40293() {
        this.f52613 = new C11649(this);
        C13132 c13132 = (C13132) findViewById(R.id.MT_Protector);
        this.f52617 = c13132;
        c13132.setAdapter(this.f52613);
        this.f52617.setLayoutManager(new C6495(this));
        this.f52617.getItemAnimator().m50782(200L);
        this.f52617.getItemAnimator().m50792(200L);
        this.f52617.getItemAnimator().m50789(200L);
        this.f52617.getItemAnimator().m50786(200L);
        this.f52611.setOnClickListener(new ViewOnClickListenerC9841(6, this));
        this.f52617.addOnScrollListener(new C20116(this));
        C13132 c13133 = this.f52617;
        C16557 c16557 = this.f52599;
        C11003.requireNonNull(c16557);
        c13133.addOnItemTouchListener(new C5248(c13133, new C23496(c16557)));
        C1556 c1556 = new C1556(new C3182(this));
        this.f52597 = c1556;
        c1556.m5322(this.f52617);
        this.f52599.m38952(this.f52613);
        this.f52599.m38950(this.f52597);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m40323(ActivityC17169 activityC17169, AbstractC14346 abstractC14346) {
        return ((abstractC14346 instanceof C23840) || (abstractC14346 instanceof C4966) || (abstractC14346 instanceof C16688)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public void m40296() {
        boolean zM31666 = this.f52605.m31666(8388611);
        C6495 c6495 = (C6495) this.f52617.getLayoutManager();
        C11003.requireNonNull(c6495);
        int iFindFirstVisibleItemPosition = c6495.findFirstVisibleItemPosition();
        int childCount = c6495.getChildCount() + iFindFirstVisibleItemPosition;
        int i = this.f52618;
        if (i < iFindFirstVisibleItemPosition || i >= childCount) {
            if (this.f52601) {
                return;
            }
            this.f52601 = true;
            if (zM31666) {
                this.f52611.setVisibility(0);
                this.f52611.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f52611, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f52601) {
            this.f52601 = false;
            if (zM31666) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f52611, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.addListener(new C13059(this));
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m40313(ActivityC17169 activityC17169) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (AbstractC15440 abstractC15440 : C16293.f50111.mo23549(true)) {
            if (abstractC15440.getName().endsWith(".project") && abstractC15440.mo23113()) {
                arrayList.add(abstractC15440);
            }
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            C1802.f6208.submit(new RunnableC1126(i, arrayList));
        }
        activityC17169.f52620 = new C11005(C16293.f50111.m36535(".project"));
        Bundle extras = activityC17169.getIntent().getExtras();
        C11003.requireNonNull(extras);
        if (extras.containsKey("dexFiles")) {
            ArrayList arrayList2 = new ArrayList();
            C12951 c12951M31486 = C12951.m31486(extras.getByteArray("dexFiles"));
            while (c12951M31486.available() > 0) {
                arrayList2.add(C16999.m39866(c12951M31486.m31506(), new String[0]));
            }
            C6016 c6016 = new C6016();
            C11661.m28544(arrayList2, activityC17169.f52620.m27340(), c6016, new C8182(activityC17169));
            if (c6016.m16828()) {
                activityC17169.m10218(R.string.MT_Protector, activityC17169.getString(R.string.MT_Protector, c6016.toString()), false);
            }
            activityC17169.f52619 = ((AbstractC15440) arrayList2.get(0)).getParent();
            z = true;
        } else {
            z = false;
        }
        if (extras.containsKey("arscFile")) {
            String string = extras.getString("arscFile");
            C11003.requireNonNull(string);
            AbstractC15440 abstractC15440M39866 = C16999.m39866(string, new String[0]);
            C12395.m30552(abstractC15440M39866, activityC17169.f52620.m27340());
            activityC17169.f52610 = true;
            activityC17169.f52619 = abstractC15440M39866.getParent();
        } else {
            z2 = z;
        }
        if (!z2) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m40371() {
        return this.f52620.m27330("data/resources.arsc").mo23120();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m40350() {
        int i;
        if (this.f52621 != null || this.f52598) {
            return true;
        }
        C11005 c11005 = this.f52620;
        if (c11005 == null) {
            return false;
        }
        AbstractC15440 abstractC15440M27330 = c11005.m27330("data/resources.arsc");
        if (!abstractC15440M27330.mo23120()) {
            return false;
        }
        AbstractC5180 abstractC5180M2843 = m2843();
        if (abstractC5180M2843.m14886() || (i = this.f52618) < 0) {
            return false;
        }
        ArrayList arrayList = this.f52616;
        if (i >= arrayList.size()) {
            return false;
        }
        AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(this.f52618);
        if (!(abstractC14346 instanceof C16688) || abstractC5180M2843.m14899("000000-0000-0000-0000-000000000001") != null) {
            return false;
        }
        if (!C23196.m51460()) {
            m10235(R.string.MT_Protector);
            return true;
        }
        if (!C23196.m51454()) {
            m10235(R.string.MT_Protector);
            return true;
        }
        this.f52598 = true;
        new C10238(this, abstractC15440M27330, (C16688) abstractC14346).m20274();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40285(ActivityC17169 activityC17169, C19452 c19452) {
        c19452.m44828(activityC17169, activityC17169.f52602);
        c19452.m44829(activityC17169, new C20296(activityC17169));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m40322(boolean z) throws C19401 {
        C11005 c11005 = this.f52620;
        boolean z2 = false;
        boolean z3 = c11005 != null && c11005.m27330("dex").mo23113();
        C11005 c11006 = this.f52620;
        boolean z4 = c11006 != null && c11006.m27330("arsc").mo23113();
        if (!z3 && !z4) {
            throw new C19401("No a dex or arsc project.");
        }
        if (!z) {
            C12366 c12366 = this.f52606;
            if (z3 && c12366 != null) {
                if (!c12366.m36266().equals(this.f52620)) {
                    throw new RuntimeException("dex");
                }
                runOnUiThread(new RunnableC14191(3, this, c12366));
                z3 = false;
            }
            final C19452 c19452 = this.f52621;
            if (!z4 || c19452 == null) {
                z2 = z4;
            } else {
                if (!c19452.m36266().equals(this.f52620)) {
                    throw new RuntimeException("arsc");
                }
                runOnUiThread(new Runnable() { // from class: l.ܶ۫᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC17169 activityC17169 = this.f46750;
                        c19452.m44828(activityC17169, activityC17169.f52602);
                    }
                });
            }
            if (!z3 && !z2) {
                this.f52607.m11418().mo1664(Boolean.valueOf(m40373()));
                this.f52607.m11403().mo1664((Object) (m40373() ? getString(R.string.MT_Protector) : this.f52620.getName()));
                return;
            }
            z4 = z2;
        }
        if (z3) {
            C12366 c12366M30021 = C12366.m30021(this.f52620);
            this.f52606 = c12366M30021;
            runOnUiThread(new RunnableC22293(0, this, c12366M30021));
            this.f52607.m11419().mo1664(c12366M30021);
        }
        if (z4) {
            C19452 c19452M44813 = C19452.m44813(this.f52620);
            this.f52621 = c19452M44813;
            runOnUiThread(new RunnableC8425(2, this, c19452M44813));
            this.f52607.m11411().mo1664(c19452M44813);
        }
        this.f52607.m11418().mo1664(Boolean.valueOf(m40373()));
        this.f52607.m11403().mo1664((Object) (m40373() ? getString(R.string.MT_Protector) : this.f52620.getName()));
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean m40373() {
        C11005 c11005 = this.f52620;
        return c11005 != null && c11005.m27340().m36504(C16293.f50111);
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final String m40346() {
        return this.f52619;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40344(AbstractC14346 abstractC14346) {
        ArrayList arrayList = this.f52616;
        int iIndexOf = arrayList.indexOf(abstractC14346);
        boolean z = false;
        C12171.m29642(iIndexOf != -1);
        int i = this.f52618;
        LinkedList linkedList = this.f52603;
        if (iIndexOf == i) {
            String str = (String) linkedList.pop();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 != this.f52618 && ((AbstractC14346) arrayList.get(i2)).m34232().equals(str)) {
                    m40268(i2, false, true);
                    break;
                }
            }
            if (iIndexOf == this.f52618) {
                m40268(0, false, true);
            }
            C12171.m29642(iIndexOf != this.f52618);
        }
        ComponentCallbacksC9205 componentCallbacksC9205M14899 = m2843().m14899(abstractC14346.m34232());
        if (componentCallbacksC9205M14899 != null) {
            C12171.m29642(abstractC14346 == componentCallbacksC9205M14899);
            AbstractC16882 abstractC16882M14900 = m2843().m14900();
            abstractC16882M14900.mo39690(abstractC14346);
            abstractC16882M14900.mo39685();
        } else {
            if (!abstractC14346.isAdded() && !abstractC14346.isDetached()) {
                z = true;
            }
            C12171.m29642(z);
        }
        linkedList.removeAll(Collections.singleton(((AbstractC14346) arrayList.remove(iIndexOf)).m34232()));
        int i3 = this.f52618;
        if (iIndexOf < i3) {
            this.f52618 = i3 - 1;
            m40296();
        }
        m40329();
        this.f52613.notifyItemRemoved(iIndexOf);
        C11005 c11005M40356 = m40356();
        abstractC14346.m34233(c11005M40356).m27333();
        C5753.m16200(abstractC14346.m34236(c11005M40356).m27340()).m10915((InterfaceC21423) new C15942(0));
        abstractC14346.m34226(c11005M40356).m27333();
        m40331();
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
    
        if (l.C1047.m3599() >= 0) goto L10;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m40271(InterfaceC9922 interfaceC9922) {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        ActivityC17169 activityC17169 = this;
        int i4 = C22628.f73083;
        int i5 = C0483.f2088;
        int iM6982 = C2105.m6981("ᩴᩴ") ^ i5;
        int i6 = ((iM6982 ^ i4) * (-30715)) ^ (-1037365968);
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM6982 ^ (-1255949027);
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
        String strM12817 = null;
        Intent intent = null;
        C12534 c12534 = null;
        C3764 c3764 = null;
        while (true) {
            i14 = i7 ^ (i6 & (((i14 ^ i4) * 20841) >> 31));
            switch (i14) {
                case -2121549269:
                case -1425734507:
                    c3764 = c3764;
                    s = sArr[c];
                    s2 = 25340;
                    if (C1916.m6308() >= 0) {
                        iM2566 = C2105.m6981("ۜۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-26109)) ^ (-111453775);
                        i3 = -429824154;
                    } else {
                        iM2566 = C2105.m6981("֨ۧ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-7965)) ^ 1383573108;
                        i3 = -1084274491;
                    }
                    int i15 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i15;
                    activityC17169 = this;
                    break;
                case -2024244728:
                case 1090985518:
                    c3764 = c3764;
                    if (C1711.m5729()) {
                        iM2566 = C0630.m2566("ۖۡ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-25679)) ^ 1591153095;
                        i3 = 1359746377;
                        int i16 = iM2566 ^ i3;
                        c3764 = c3764;
                        i7 = i16;
                        activityC17169 = this;
                    }
                    c3764 = c3764;
                    int iM2567 = (C0630.m2566("֡ᩳ") ^ i5) * (-67);
                    i6 = ((iM2567 ^ i4) * 31067) ^ (-1064047340);
                    i7 = iM2567 ^ 283540320;
                    activityC17169 = this;
                    break;
                case -2006705923:
                case -1909483135:
                    c3764 = activityC17169.f52607;
                    if (c3764.f11863) {
                        int iM2568 = (C0630.m2566("֫֫") ^ i4) * (-77);
                        i7 = iM2568 ^ 1046013287;
                        i6 = ((iM2568 ^ i5) * 8161) ^ (-330771763);
                    } else {
                        int iM2569 = (C0630.m2566("֡ᩳ") ^ i5) * (-67);
                        i6 = ((iM2569 ^ i4) * 31067) ^ (-1064047340);
                        i7 = iM2569 ^ 283540320;
                    }
                    activityC17169 = this;
                    break;
                case -1991565939:
                case 43659875:
                    break;
                case -1823248366:
                case -962193868:
                    i12 = 40935;
                    iM2566 = C0630.m2566("ܶ᩺") ^ i5;
                    i6 = ((iM2566 ^ i4) * (-30635)) ^ 1736620434;
                    i3 = 1484510735;
                    int i17 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i17;
                    activityC17169 = this;
                    break;
                case -1712689963:
                case 1454432851:
                    C3432.m10477();
                    if (C3911.f12484 >= 0) {
                        c3764 = c3764;
                        iM2566 = C2105.m6981("ۛۨ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 2385) ^ 278954475;
                        i3 = -528240575;
                        int i18 = iM2566 ^ i3;
                        c3764 = c3764;
                        i7 = i18;
                        activityC17169 = this;
                    }
                    c3764 = c3764;
                    iM2566 = C2105.m6981("ۜۨ") ^ i4;
                    i6 = ((iM2566 ^ i5) * (-26109)) ^ (-111453775);
                    i3 = -429824154;
                    int i19 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i19;
                    activityC17169 = this;
                    break;
                case -1616549003:
                case 407400266:
                    intent.putExtra(strM12817, true);
                    activityC17169.startService(intent);
                    break;
                case -1527926436:
                case -1038516200:
                    strM12817 = C4263.m12817(sArr2, i13, i8, i12);
                    if (C3911.f12484 >= 0) {
                        iM6981 = (C2105.m6981("۬᩵") + i5) * 69;
                        i = ((iM6981 ^ i4) * 2001) ^ (-1640585422);
                        i2 = 331034189;
                    } else {
                        iM6981 = C2105.m6981("֫᩵") ^ i4;
                        i = ((iM6981 ^ i5) * 2633) ^ (-250281051);
                        i2 = 766223235;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1502935616:
                case 1958653212:
                    ServiceC13018.f38963 = c12534;
                    if (C0382.f1805) {
                        iM6981 = C2105.m6981("᩵᩻") ^ i5;
                        i = ((iM6981 ^ i4) * (-13373)) ^ (-1250736522);
                        i2 = 1014461863;
                    } else {
                        iM6981 = C2105.m6981("֫᩺") ^ i4;
                        i = ((iM6981 ^ i5) * (-23165)) ^ 1725770859;
                        i2 = -1408655335;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -1473512110:
                case 859900627:
                    c3764 = c3764;
                    sArr = f52594;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C2105.m6981("ۛۨ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 2385) ^ 278954475;
                        i3 = -528240575;
                    } else {
                        iM2566 = (C0630.m2566("ܺ᩵") + i4) * (-99);
                        i6 = ((iM2566 ^ i5) * (-4123)) ^ 918723623;
                        i3 = 1287066157;
                    }
                    int i110 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i110;
                    activityC17169 = this;
                    break;
                case -1212530866:
                case 1778623902:
                    c3764 = c3764;
                    if (C4075.f12947 >= 0) {
                        iM2566 = C2105.m6981("ۛۨ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 2385) ^ 278954475;
                        i3 = -528240575;
                    } else {
                        iM2566 = (C0630.m2566("֨᩶") ^ i5) * (-113);
                        i6 = ((iM2566 ^ i4) * 22137) ^ 1855498977;
                        i3 = -1308132272;
                    }
                    int i111 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i111;
                    activityC17169 = this;
                    break;
                case -746407415:
                case 577599996:
                    C3746.m11369();
                    C1047.m3599();
                    c3764 = c3764;
                    iM2566 = C0630.m2566("۠ۜ") ^ i5;
                    i6 = ((iM2566 ^ i4) * (-23781)) ^ (-126181240);
                    i3 = -1814006152;
                    int i112 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i112;
                    activityC17169 = this;
                    break;
                case -693708190:
                case 190671790:
                    c12534 = new C12534(0, interfaceC9922);
                    if (C0798.f2919) {
                        c3764 = c3764;
                        iM2566 = C0630.m2566("۠ۜ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-23781)) ^ (-126181240);
                        i3 = -1814006152;
                        int i113 = iM2566 ^ i3;
                        c3764 = c3764;
                        i7 = i113;
                        activityC17169 = this;
                    } else {
                        int iM25610 = C0630.m2566("ܰᩳ") ^ i4;
                        i7 = iM25610 ^ (-1819739552);
                        i6 = ((iM25610 ^ i5) * 609) ^ (-1501158369);
                        c12534 = c12534;
                    }
                    break;
                case -638847450:
                case 1300783752:
                    c3764 = c3764;
                    if ((i10 + i11) - i9 < 0) {
                        iM2566 = C2105.m6981("ۡܺ") ^ i4;
                        i6 = ((iM2566 ^ i5) * 31755) ^ (-908377927);
                        i3 = 1410253464;
                    } else {
                        iM2566 = (C2105.m6981("ۘ᩷") + i4) * 5;
                        i6 = ((iM2566 ^ i5) * 20705) ^ 1608524623;
                        i3 = -875176514;
                    }
                    int i114 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i114;
                    activityC17169 = this;
                    break;
                case -480809726:
                case 998226470:
                    intent = new Intent(activityC17169, (Class<?>) ServiceC13018.class);
                    if (C2126.f7087) {
                        iM6981 = (C2105.m6981("۬᩵") + i5) * 69;
                        i = ((iM6981 ^ i4) * 2001) ^ (-1640585422);
                        i2 = 331034189;
                    } else {
                        iM6981 = (C2105.m6981("ۘ۫") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM6981 ^ i4) * (-9949)) ^ 331182238;
                        i2 = -1493878721;
                    }
                    i7 = iM6981 ^ i2;
                    i6 = i;
                    break;
                case -229212632:
                case 1642928130:
                    i12 = 64123;
                    iM2566 = C0630.m2566("ܶ᩺") ^ i5;
                    i6 = ((iM2566 ^ i4) * (-30635)) ^ 1736620434;
                    i3 = 1484510735;
                    int i115 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i115;
                    activityC17169 = this;
                    break;
                case -186915586:
                case 1947964009:
                    c3764 = c3764;
                    if (C1294.m4369(c3764.f11862, ServiceC13018.f38961)) {
                        int iM25611 = (i4 - C0630.m2566("᩸᩹")) * (-79);
                        i7 = iM25611 ^ (-1991206112);
                        i6 = ((iM25611 ^ i5) * (-6403)) ^ 1942016241;
                        c3764 = c3764;
                    } else {
                        c3764 = c3764;
                        int iM25612 = (C0630.m2566("֡ᩳ") ^ i5) * (-67);
                        i6 = ((iM25612 ^ i4) * 31067) ^ (-1064047340);
                        i7 = iM25612 ^ 283540320;
                        activityC17169 = this;
                    }
                    break;
                case -8884792:
                case 1639512399:
                    sArr2 = f52594;
                    i13 = 1;
                    i8 = 4;
                    if (C0422.f1886 > 0) {
                        iM6981 = C2105.m6981("ۡ֫") ^ i4;
                        i = ((iM6981 ^ i5) * (-18695)) ^ (-877957378);
                        i2 = -134587375;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        c3764 = c3764;
                        iM2566 = C2105.m6981("ۜۨ") ^ i4;
                        i6 = ((iM2566 ^ i5) * (-26109)) ^ (-111453775);
                        i3 = -429824154;
                        int i116 = iM2566 ^ i3;
                        c3764 = c3764;
                        i7 = i116;
                        activityC17169 = this;
                    }
                    break;
                case 617914457:
                case 1067466031:
                    break;
                case 930875505:
                case 1378762828:
                    C1504.m5179();
                    if (C3432.f10845 >= 0) {
                        iM6981 = C2105.m6981("֫᩺") ^ i4;
                        i = ((iM6981 ^ i5) * (-23165)) ^ 1725770859;
                        i2 = -1408655335;
                        i7 = iM6981 ^ i2;
                        i6 = i;
                    } else {
                        c3764 = c3764;
                        iM2566 = C0630.m2566("۠ۜ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-23781)) ^ (-126181240);
                        i3 = -1814006152;
                        int i117 = iM2566 ^ i3;
                        c3764 = c3764;
                        i7 = i117;
                        activityC17169 = this;
                    }
                    break;
                case 1044109616:
                case 1618782457:
                    c3764 = c3764;
                    i9 = s * s2;
                    i10 = s * s;
                    i11 = 160528900;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("۠ۜ") ^ i5;
                        i6 = ((iM2566 ^ i4) * (-23781)) ^ (-126181240);
                        i3 = -1814006152;
                    } else {
                        iM2566 = (i5 - C0630.m2566("۟ۗ")) * (-3);
                        i6 = ((iM2566 ^ i4) * (-30017)) ^ (-650665526);
                        i3 = 789640183;
                    }
                    int i118 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i118;
                    activityC17169 = this;
                    break;
                case 1287912327:
                case 2071733499:
                    C2520.m8026();
                    C7106.m19120();
                    break;
                default:
                    c3764 = c3764;
                    c = 0;
                    if (C2520.f8000 >= 0) {
                        iM2566 = C2105.m6981("ۛۨ") ^ i5;
                        i6 = ((iM2566 ^ i4) * 2385) ^ 278954475;
                        i3 = -528240575;
                    } else {
                        iM2566 = C0630.m2566("ᩴ᩵") ^ i4;
                        i6 = ((iM2566 ^ i5) * 20147) ^ (-1289652883);
                        i3 = -1629139721;
                    }
                    int i119 = iM2566 ^ i3;
                    c3764 = c3764;
                    i7 = i119;
                    activityC17169 = this;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final void m40370() {
        if (this.f52621 == null) {
            return;
        }
        m40270(new Function() { // from class: l.ᩴ۫᩷
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ActivityC17169.m40267(this.f59277, (AbstractC14346) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final void m40349() {
        if (this.f52606 == null) {
            return;
        }
        m40270(new C8888(0, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40270(Function function) {
        int i = this.f52618;
        ArrayList arrayList = this.f52616;
        AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
        ArrayList<AbstractC14346> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC14346 abstractC14347 = (AbstractC14346) it.next();
            if (((Boolean) function.apply(abstractC14347)).booleanValue()) {
                if (abstractC14346 == abstractC14347) {
                    abstractC14346 = null;
                }
                arrayList2.add(abstractC14347);
                arrayList3.add(abstractC14347.m34232());
                it.remove();
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f52603.removeAll(arrayList3);
        if (abstractC14346 == null) {
            this.f52618 = 0;
        } else {
            this.f52618 = arrayList.indexOf(abstractC14346);
        }
        m40329();
        C11005 c11005M40356 = m40356();
        AbstractC5180 abstractC5180M2843 = m2843();
        AbstractC16882 abstractC16882M14900 = abstractC5180M2843.m14900();
        for (AbstractC14346 abstractC14348 : arrayList2) {
            ComponentCallbacksC9205 componentCallbacksC9205M14899 = abstractC5180M2843.m14899(abstractC14348.m34232());
            if (componentCallbacksC9205M14899 != null) {
                C12171.m29642(abstractC14348 == componentCallbacksC9205M14899);
                abstractC16882M14900.mo39690(abstractC14348);
            } else {
                C12171.m29642((abstractC14348.isAdded() || abstractC14348.isDetached()) ? false : true);
            }
            abstractC14348.m34233(c11005M40356).m27333();
            C5753.m16200(abstractC14348.m34236(c11005M40356).m27340()).m10915((InterfaceC21423) new C20177());
            abstractC14348.m34226(c11005M40356).m27333();
        }
        abstractC16882M14900.mo39689();
        m40331();
        this.f52613.notifyDataSetChanged();
        m40296();
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    private void m40329() {
        String strM34232 = ((AbstractC14346) this.f52616.get(this.f52618)).m34232();
        LinkedList linkedList = this.f52603;
        linkedList.push(strM34232);
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m40326(ActivityC17169 activityC17169, AbstractC14346 abstractC14346) {
        int iIndexOf = activityC17169.f52616.indexOf(abstractC14346);
        if (iIndexOf != -1) {
            activityC17169.m40268(iIndexOf, true, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40275(ActivityC17169 activityC17169, int i, boolean z) {
        activityC17169.m40268(i, z, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40268(int i, boolean z, boolean z2) {
        InputMethodManager inputMethodManager;
        InterfaceC18581 interfaceC18581Mo17431;
        if (i >= 0) {
            ArrayList arrayList = this.f52616;
            if (i < arrayList.size()) {
                AbstractC5180 abstractC5180M2843 = m2843();
                if (abstractC5180M2843.m14910() || abstractC5180M2843.m14886()) {
                    return;
                }
                int i2 = this.f52618;
                if (i2 != i) {
                    AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i2);
                    AbstractC14346 abstractC14347 = (AbstractC14346) arrayList.get(i);
                    if (!z2 && (interfaceC18581Mo17431 = abstractC14346.mo17431()) != null) {
                        if (this.f52608.m29735()) {
                            this.f52608.m29733((Runnable) new RunnableC19472(0, interfaceC18581Mo17431));
                        } else {
                            interfaceC18581Mo17431.mo9498();
                            this.f52608.m29733((Runnable) new RunnableC3741(interfaceC18581Mo17431));
                        }
                    }
                    AbstractC16882 abstractC16882M14900 = abstractC5180M2843.m14900();
                    if (this.f52618 < i) {
                        abstractC16882M14900.m39678(R.anim.MT_Protector, R.anim.MT_Protector);
                    } else {
                        abstractC16882M14900.m39678(R.anim.MT_Protector, R.anim.MT_Protector);
                    }
                    if (abstractC14346.mo34231()) {
                        abstractC16882M14900.mo39676(abstractC14346);
                    } else {
                        abstractC16882M14900.mo39686((ComponentCallbacksC9205) abstractC14346);
                    }
                    if (abstractC14347.isAdded()) {
                        abstractC16882M14900.mo39687(abstractC14347);
                    } else if (abstractC14347.isDetached()) {
                        abstractC16882M14900.m39681((ComponentCallbacksC9205) abstractC14347);
                    } else {
                        abstractC16882M14900.m39682(abstractC14347, abstractC14347.m34232());
                    }
                    abstractC16882M14900.mo39689();
                    this.f52618 = i;
                    m40296();
                    this.f52613.notifyDataSetChanged();
                    if (abstractC14346.mo17432() && !abstractC14347.mo17432() && (inputMethodManager = (InputMethodManager) getApplicationContext().getSystemService("input_method")) != null) {
                        inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
                    }
                    if (z) {
                        C12171.m29642(!z2);
                        String strM34232 = abstractC14346.m34232();
                        LinkedList linkedList = this.f52603;
                        linkedList.push(strM34232);
                        while (linkedList.size() > 5) {
                            linkedList.remove(linkedList.size() - 2);
                        }
                        return;
                    }
                    return;
                }
                ((AbstractC14346) arrayList.get(i2)).mo34241();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40343(String str, C19287 c19287) {
        C12366 c12366 = this.f52606;
        C6306 c6306 = null;
        if (c12366 != null) {
            try {
                if (!c12366.m30058(str)) {
                    throw new C19401("Class not found: " + str.replace('/', '.'));
                }
            } catch (IOException e) {
                m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f52616;
        int size = arrayList.size();
        int iM40266 = 0;
        while (true) {
            if (iM40266 >= size) {
                iM40266 = -1;
                break;
            }
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(iM40266);
            if (abstractC14346 instanceof C6306) {
                C6306 c6307 = (C6306) abstractC14346;
                if (str.equals(c6307.m17420())) {
                    c6306 = c6307;
                    break;
                }
            }
            iM40266++;
        }
        if (c6306 == null) {
            c6306 = new C6306();
            c6306.m17430(str);
            iM40266 = m40266(this.f52618 + 1, false);
            arrayList.add(iM40266, c6306);
            m40331();
        }
        c6306.m17425(c19287);
        if (c19287 == null && iM40266 == this.f52618) {
            C21374.m48457(R.string.MT_Protector);
        }
        m40268(iM40266, true, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40354(String str, C19287 c19287) {
        C19452 c19452 = this.f52621;
        C7864 c7864 = null;
        if (c19452 != null) {
            try {
                if (!c19452.m44838(str)) {
                    throw new C19401("Xml not found: " + str);
                }
            } catch (IOException e) {
                m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        ArrayList arrayList = this.f52616;
        int size = arrayList.size();
        int iM40266 = 0;
        while (true) {
            if (iM40266 >= size) {
                iM40266 = -1;
                break;
            }
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(iM40266);
            if (abstractC14346 instanceof C7864) {
                C7864 c7865 = (C7864) abstractC14346;
                if (str.equals(c7865.m21123())) {
                    c7864 = c7865;
                    break;
                }
            }
            iM40266++;
        }
        if (c7864 == null) {
            c7864 = new C7864();
            c7864.m21125(str);
            iM40266 = m40266(this.f52618 + 1, false);
            arrayList.add(iM40266, c7864);
            m40331();
        }
        c7864.m21121(c19287);
        if (c19287 == null && iM40266 == this.f52618) {
            C21374.m48457(R.string.MT_Protector);
        }
        m40268(iM40266, true, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40341(String str, String str2) {
        C16266 c16266;
        ArrayList arrayList = this.f52616;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c16266 = null;
                i = -1;
                break;
            }
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
            if (abstractC14346 instanceof C16266) {
                c16266 = (C16266) abstractC14346;
                if (str.equals(c16266.m38278()) && str2.equals(c16266.requireArguments().getString(e.s))) {
                    if (!c16266.m38280()) {
                        break;
                    }
                    c16266.m38281();
                    break;
                }
            }
            i++;
        }
        if (c16266 == null) {
            C16266 c16267 = new C16266();
            c16267.m38279(str, str2);
            int iM40266 = m40266(this.f52618 + 1, false);
            arrayList.add(iM40266, c16267);
            m40331();
            i = iM40266;
        }
        m40268(i, true, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40342(final String str, final String str2, ArrayList arrayList, final boolean z) {
        int iM40304;
        C12366 c12366 = this.f52606;
        if (c12366 == null) {
            return;
        }
        if (str2 != null) {
            m40269(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (!z && (iM40304 = m40304(str, (String) null)) >= 0) {
            m40268(iM40304, true, false);
            return;
        }
        final ArrayList arrayListM30050 = c12366.m30050(str);
        if (arrayListM30050.isEmpty()) {
            m40269(str, str2, Collections.EMPTY_LIST, z);
            return;
        }
        if (arrayList == null) {
            arrayList = arrayListM30050;
        }
        CharSequence[] charSequenceArr = new CharSequence[arrayListM30050.size()];
        final boolean[] zArr = new boolean[arrayListM30050.size()];
        for (int i = 0; i < arrayListM30050.size(); i++) {
            String str3 = (String) arrayListM30050.get(i);
            charSequenceArr[i] = C14336.m34210(str3);
            zArr[i] = arrayList.contains(str3);
        }
        View viewM10216 = m10216(R.layout.MT_Protector);
        ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
        C4915.m14284(listView);
        listView.setDivider(null);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        listView.setAdapter((ListAdapter) new C6004(charSequenceArr, zArr));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳۤ᩷
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                int i3 = ActivityC17169.f52595;
                boolean[] zArr2 = zArr;
                boolean z2 = !zArr2[i2];
                zArr2[i2] = z2;
                ((CheckedTextView) view).setChecked(z2);
            }
        });
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17169.m40287(this.f52987, zArr, arrayListM30050, str, str2, z);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438().m1448().setOnClickListener(new ViewOnClickListenerC14470(zArr, listView, 0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40287(ActivityC17169 activityC17169, boolean[] zArr, ArrayList arrayList, String str, String str2, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < zArr.length; i++) {
            if (zArr[i]) {
                arrayList2.add((String) arrayList.get(i));
            }
        }
        activityC17169.m40269(str, str2, (List) arrayList2, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40269(String str, String str2, List list, boolean z) {
        boolean zM38821;
        int iM40304 = m40304(str, str2);
        ArrayList arrayList = this.f52616;
        C16475 c16475 = iM40304 >= 0 ? (C16475) arrayList.get(iM40304) : null;
        if (c16475 == null) {
            C16475 c16476 = new C16475();
            c16476.m38820(str, str2, list);
            iM40304 = m40266(this.f52618 + 1, false);
            arrayList.add(iM40304, c16476);
            zM38821 = true;
        } else {
            zM38821 = c16475.m38821(list, z);
        }
        if (zM38821) {
            m40331();
        }
        m40268(iM40304, true, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m40304(String str, String str2) {
        ArrayList arrayList = this.f52616;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
            if (abstractC14346 instanceof C16475) {
                C16475 c16475 = (C16475) abstractC14346;
                if (str.equals(c16475.m38819()) && C11003.equals(str2, c16475.requireArguments().getString(e.s))) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m40266(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f52616;
            if (i >= arrayList.size()) {
                break;
            }
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
            if (!(abstractC14346 instanceof C23840) && !(abstractC14346 instanceof C4966) && !(abstractC14346 instanceof C16688) && (z || !abstractC14346.m34230())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public void m40331() {
        int i;
        AbstractC15440 abstractC15440M27330 = m40356().m27330("list");
        C10130 c10130M43030 = C18515.m43030(1736577895);
        for (AbstractC14346 abstractC14346 : this.f52616) {
            if (!(abstractC14346 instanceof C23840) && !(abstractC14346 instanceof C4966)) {
                if (abstractC14346 instanceof C6306) {
                    i = 16;
                } else if (abstractC14346 instanceof C16475) {
                    i = 17;
                } else if (abstractC14346 instanceof C16266) {
                    i = 20;
                } else if (abstractC14346 instanceof C7864) {
                    i = 18;
                } else {
                    if (!(abstractC14346 instanceof C16688)) {
                        throw new RuntimeException(abstractC14346.getClass().getSimpleName());
                    }
                    i = 19;
                }
                c10130M43030.writeByte(i);
                abstractC14346.getClass();
                Parcel parcelObtain = Parcel.obtain();
                abstractC14346.requireArguments().writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                c10130M43030.m25434(bArrMarshall);
            }
        }
        try {
            abstractC15440M27330.mo35195();
            abstractC15440M27330.m36496(c10130M43030);
        } catch (IOException e) {
            this.f52607.m11384((Throwable) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m40327(boolean z) {
        Class cls;
        C11005 c11005M40356 = m40356();
        AbstractC15440 abstractC15440M27330 = c11005M40356.m27330("list");
        if (abstractC15440M27330.mo23120()) {
            try {
                C12951 c12951 = new C12951(abstractC15440M27330.m36506());
                C22124.m49722((InterfaceC20008) c12951, 1736577895);
                while (c12951.available() > 0) {
                    int i = c12951.readByte() & 255;
                    byte[] bArrM31496 = c12951.m31496();
                    switch (i) {
                        case 16:
                            cls = C6306.class;
                            break;
                        case 17:
                            cls = C16475.class;
                            break;
                        case 18:
                            cls = C7864.class;
                            break;
                        case 19:
                            cls = C16688.class;
                            break;
                        case 20:
                            cls = C16266.class;
                            break;
                        default:
                            throw new RuntimeException("StateType: " + i);
                    }
                    AbstractC14346 abstractC14346 = (AbstractC14346) cls.newInstance();
                    abstractC14346.mo34229(bArrM31496);
                    ComponentCallbacksC9205 componentCallbacksC9205M14899 = m2843().m14899(abstractC14346.m34232());
                    ArrayList arrayList = this.f52616;
                    if (!z) {
                        C12171.m29644(componentCallbacksC9205M14899);
                        arrayList.add(abstractC14346);
                        abstractC14346.m34240(c11005M40356);
                    } else if (componentCallbacksC9205M14899 != null) {
                        arrayList.add((AbstractC14346) componentCallbacksC9205M14899);
                    } else {
                        arrayList.add(abstractC14346);
                        abstractC14346.m34240(c11005M40356);
                    }
                }
            } catch (Exception e) {
                this.f52607.m11384((Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C11005 m40356() {
        C11005 c11005 = this.f52620;
        C11003.requireNonNull(c11005);
        return new C11005(c11005, "state");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40339(MenuItem menuItem) {
        if (C13876.f41361.m22793()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f52599.m38953(true);
            return;
        }
        if (this.f52599.m38954()) {
            return;
        }
        if (itemId == R.id.MT_Protector) {
            m40353((Runnable) null);
            return;
        }
        if (itemId == R.id.MT_Protector) {
            startActivity(new Intent(this, (Class<?>) ActivityC16315.class));
            return;
        }
        if (itemId == R.id.MT_Protector) {
            m40361();
            return;
        }
        if (itemId == R.id.MT_Protector) {
            new C1832(this, new C20197(this.f52620)).m6080();
            return;
        }
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m40345(false);
                return;
            }
            return;
        }
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC17169.m40319(this.f1885);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC17169 activityC17169 = this.f16701;
                new C1832(activityC17169, new C20197(activityC17169.f52620)).m6080();
            }
        });
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m40333(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f52616;
        if (i >= arrayList.size()) {
            return null;
        }
        return C6554.m18061(50, ((AbstractC14346) arrayList.get(i)).mo14421());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10820 m40306(ActivityC17169 activityC17169, int i) {
        ArrayList arrayList = activityC17169.f52616;
        C10820 c10820 = new C10820();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i2);
            if (abstractC14346.m34237()) {
                c10820.f32544++;
                if (!abstractC14346.mo17426()) {
                    c10820.f32546++;
                }
                if (i2 < i) {
                    c10820.f32543++;
                } else if (i2 > i) {
                    c10820.f32545++;
                }
            }
        }
        return c10820;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m40348(final int i) {
        String strM40333 = m40333(i);
        if (strM40333 == null) {
            return;
        }
        View viewM10216 = m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM40333));
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۛ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17169.m40308(this.f18580, i, checkBox);
            }
        };
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, onClickListener);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40276(ActivityC17169 activityC17169, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC17169.f52616);
        C6055.m16891(arrayList, new C7476());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C1647(activityC17169, linkedList, (AbstractC14346) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40302(ActivityC17169 activityC17169) {
        for (AbstractC14346 abstractC14346 : new ArrayList(activityC17169.f52616)) {
            if (abstractC14346.m34237() && !abstractC14346.mo17426()) {
                abstractC14346.m34228(activityC17169);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40359(final int i) {
        String strM40333 = m40333(i);
        if (strM40333 == null) {
            return;
        }
        View viewM10216 = m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM40333));
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.۬۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17169.m40274(this.f39260, i, checkBox);
            }
        };
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, onClickListener);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m40372(int i) {
        String strM40333 = m40333(i);
        if (strM40333 == null) {
            return;
        }
        View viewM10216 = m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM40333));
        DialogInterfaceOnClickListenerC15734 dialogInterfaceOnClickListenerC15734 = new DialogInterfaceOnClickListenerC15734(this, i, (CheckBox) viewM10216.findViewById(R.id.MT_Protector), 1);
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, dialogInterfaceOnClickListenerC15734);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40366() {
        for (AbstractC14346 abstractC14346 : new ArrayList(this.f52616)) {
            if ((abstractC14346 instanceof C6306) && abstractC14346.f43260.getBoolean("changed", false)) {
                return true;
            }
            if ((abstractC14346 instanceof C7864) && abstractC14346.f43260.getBoolean("changed", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40363(final Runnable runnable) {
        if (m40366()) {
            this.f52605.m31665(8388611);
            C19258 c19258BuildDialog = buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜ۫᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ActivityC17169.m40278(this.f21026, runnable);
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258BuildDialog.m44438();
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40278(ActivityC17169 activityC17169, Runnable runnable) {
        activityC17169.f52605.m31647(8388611);
        activityC17169.m40353(runnable);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40353(Runnable runnable) {
        LinkedList linkedList = new LinkedList();
        for (AbstractC14346 abstractC14346 : new ArrayList(this.f52616)) {
            if ((abstractC14346 instanceof C6306) && abstractC14346.f43260.getBoolean("changed", false)) {
                linkedList.add(((C6306) abstractC14346).m17429(this));
            } else if ((abstractC14346 instanceof C7864) && abstractC14346.f43260.getBoolean("changed", false)) {
                linkedList.add(((C7864) abstractC14346).m21124(this));
            }
        }
        if (!linkedList.isEmpty()) {
            new C23643(this, linkedList, runnable).m20274();
        } else if (runnable != null) {
            runnable.run();
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40357() {
        C12366 c12366 = this.f52606;
        int i = 0;
        if (c12366 != null && c12366.m30044().m27330("strings_changed").mo23120()) {
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10299(this, i));
            c19258.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC10944(i, this));
            c19258.m44438();
            return;
        }
        C19452 c19452 = this.f52621;
        if (c19452 != null && c19452.m44854().m27330("strings_changed").mo23120()) {
            int i3 = DialogInterfaceC0206.f1451;
            C19258 c19259 = new C19258(this);
            c19259.m44433(R.string.MT_Protector);
            c19259.m44416(R.string.MT_Protector);
            c19259.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22555(4, this));
            c19259.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽۤ᩷
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC17169.m40272(this.f50985);
                }
            });
            c19259.m44438();
            return;
        }
        m40288(false, true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40324(ActivityC17169 activityC17169) {
        activityC17169.f52607.m11413(3);
        activityC17169.f52607.m11412();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40334(ActivityC17169 activityC17169) {
        activityC17169.f52607.m11404(3);
        activityC17169.f52607.m11402();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40281(ActivityC17169 activityC17169, C3929 c3929) {
        C19287 c19287M44466 = C19287.m44466(c3929.f12541, c3929.f12539);
        c19287M44466.f60678 = false;
        String str = c3929.f12540;
        activityC17169.m40354(str, c19287M44466);
        C19452 c19452 = activityC17169.f52621;
        C11003.requireNonNull(c19452);
        c19452.m44818(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40272(ActivityC17169 activityC17169) {
        activityC17169.m40288(false, true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40307(ActivityC17169 activityC17169) {
        activityC17169.m40288(true, true);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m40338(ActivityC17169 activityC17169) {
        activityC17169.m40288(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40288(final boolean z, final boolean z2) {
        m40353(new Runnable() { // from class: l.ۘ۫᩷
            @Override // java.lang.Runnable
            public final void run() {
                int i = ActivityC17169.f52595;
                new C2477(this.f12577, z2, z).m20274();
            }
        });
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m40362(String str) {
        for (AbstractC14346 abstractC14346 : this.f52616) {
            if (abstractC14346 instanceof C6306) {
                C6306 c6306 = (C6306) abstractC14346;
                if (c6306.m17420().equals(str)) {
                    return c6306.m17421(this.f52606, this.f52608);
                }
            }
        }
        C12366 c12366 = this.f52606;
        C11003.requireNonNull(c12366);
        return c12366.m30052(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m40368(String str) {
        for (AbstractC14346 abstractC14346 : this.f52616) {
            if (abstractC14346 instanceof C7864) {
                C7864 c7864 = (C7864) abstractC14346;
                if (c7864.m21123().equals(str)) {
                    return c7864.m21120(this.f52621, this.f52608);
                }
            }
        }
        C19452 c19452 = this.f52621;
        C11003.requireNonNull(c19452);
        return c19452.m44856(str);
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
    
        if (l.C1504.f5354 != false) goto L11;
     */
    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m40352() {
        int iM6981;
        int i;
        int i2;
        int iM2566;
        int i3;
        int i4;
        int iM2567;
        int i5;
        int i6;
        ActivityC17169 activityC17169 = this;
        InterfaceC15417 interfaceC15417 = null;
        AbstractC15440 abstractC15440M44845 = null;
        C12366 c12366 = null;
        AbstractC15440 abstractC15440M27330 = null;
        C11005 c11005M36266 = null;
        Object obj = null;
        int i7 = 0;
        String strM6988 = null;
        String strM10488 = null;
        String strM4373 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 2134508342;
        int i11 = RunnableC1937.f6483;
        int i12 = ViewOnClickListenerC1958.f6529;
        int iM2568 = C0630.m2566("᩹ܶ") ^ i11;
        int i13 = ((iM2568 ^ i12) * 27371) ^ 1385653375;
        int i14 = iM2568 ^ 230189624;
        short[] sArr = null;
        short[] sArr2 = null;
        int i15 = 0;
        int i16 = 0;
        short s = 0;
        int i17 = 0;
        int i18 = 0;
        C19452 c19452 = null;
        int i19 = 0;
        short[] sArr3 = null;
        char c = 0;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-8321)) >> 31));
            switch (i10) {
                case -2127177523:
                case -689072500:
                    if (C1420.m4917(abstractC15440M44845)) {
                        abstractC15440M27330 = abstractC15440M44845;
                        iM2567 = (C0630.m2566("ܺ֨") + i12) * 101;
                        i5 = ((iM2567 ^ i11) * 7053) ^ 329392202;
                        i6 = 1658364478;
                    } else {
                        iM2567 = (C0630.m2566("۠ܰ") + i12) * 77;
                        i5 = ((iM2567 ^ i11) * (-6845)) ^ 805983219;
                        i6 = -538627665;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -2099246967:
                case 1651371332:
                    if (C4117.f13076 > 0) {
                        iM2567 = (i12 - C0630.m2566("ۢ۠")) * (-127);
                        i5 = ((iM2567 ^ i11) * (-2429)) ^ 1229992902;
                        i6 = -226874618;
                    } else {
                        iM2567 = (C2105.m6981("ۡۜ") ^ i12) * (-51);
                        i5 = ((iM2567 ^ i11) * 1149) ^ 1251916452;
                        i6 = 460282180;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -2005492997:
                case 1075697805:
                    if (m40373()) {
                        iM2567 = C0630.m2566("ᩳ᩷") ^ i12;
                        i5 = ((iM2567 ^ i11) * (-9477)) ^ (-498383548);
                        i6 = -2009254971;
                    } else {
                        iM2567 = (C0630.m2566("ۗۘ") ^ i12) * (-23);
                        i5 = ((iM2567 ^ i11) * 21653) ^ (-287740052);
                        i6 = -1054216033;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -1860200140:
                case 354378388:
                    c12366 = activityC17169.f52606;
                    if (c12366 != null) {
                        iM2567 = C0630.m2566("ۡ֫") ^ i11;
                        i5 = ((iM2567 ^ i12) * 9745) ^ 1923434316;
                        i6 = 1490913378;
                    } else {
                        abstractC15440M27330 = abstractC15440M44845;
                        iM2567 = (C0630.m2566("ܺ֨") + i12) * 101;
                        i5 = ((iM2567 ^ i11) * 7053) ^ 329392202;
                        i6 = 1658364478;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -1837684983:
                case 306596976:
                    C4075.m12246(activityC17169, obj, interfaceC15417);
                    break;
                case -1741946397:
                case 524247165:
                    sArr3 = sArr3;
                    i19 = i19;
                    i8 = i17 * i17;
                    i9 = s * 2;
                    if (C3911.f12484 >= 0) {
                        iM6981 = C2105.m6981("ۘۨ") ^ i11;
                        i = ((iM6981 ^ i12) * 30313) ^ 88753816;
                        i2 = -208737922;
                    } else {
                        iM6981 = (C0630.m2566("ۧۨ") + i11) * (-101);
                        i = ((iM6981 ^ i12) * 4397) ^ 302375022;
                        i2 = -1999372477;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC17169 = this;
                    sArr3 = sArr3;
                    break;
                case -1711601950:
                case 1575573282:
                    sArr3 = sArr3;
                    i19 = i19;
                    s = sArr[c];
                    if (C4616.f14690 > 0) {
                        iM6981 = (C2105.m6981("۬۠") + i11) * 37;
                        i = ((iM6981 ^ i12) * (-27303)) ^ 726575647;
                        i2 = 152096141;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC17169 = this;
                        sArr3 = sArr3;
                    } else {
                        i19 = i19;
                        sArr3 = sArr3;
                        iM2566 = C0630.m2566("᩹᩻") ^ i11;
                        i3 = ((iM2566 ^ i12) * 13219) ^ 1761254202;
                        i4 = 635792633;
                        i14 = iM2566 ^ i4;
                        i13 = i3;
                        activityC17169 = this;
                    }
                    break;
                case -1671917873:
                case -1379656976:
                    sArr3 = sArr3;
                    i19 = i19;
                    sArr = f52594;
                    c = 5;
                    if (C2958.m9034() <= 0) {
                        iM6981 = C2105.m6981("᩺ۚ") ^ i12;
                        i = ((iM6981 ^ i11) * (-13221)) ^ 1793934853;
                        i2 = -1230788640;
                    } else {
                        iM6981 = (C0630.m2566("ۗܶ") + i12) * 45;
                        i = ((iM6981 ^ i11) * (-27179)) ^ 1566762724;
                        i2 = 1402036572;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC17169 = this;
                    sArr3 = sArr3;
                    break;
                case -1669926347:
                case 1315287789:
                    i15 = 45005;
                    iM6981 = C0630.m2566("ܰ۫") ^ i12;
                    i = ((iM6981 ^ i11) * 16453) ^ 1864613385;
                    i2 = -1375078587;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC17169 = this;
                    sArr3 = sArr3;
                    break;
                case -1614250383:
                case -287785377:
                    try {
                        C21769.m49100(activityC17169, interfaceC15417);
                        iM2567 = (C0630.m2566("ܳ᩹") + i12) * (-109);
                        i5 = ((iM2567 ^ i11) * 9377) ^ 515015025;
                        i6 = 522364814;
                        i14 = iM2567 ^ i6;
                    } catch (Throwable th) {
                        int iM6982 = C2105.m6981("᩹ۛ") ^ i11;
                        i5 = ((iM6982 ^ i12) * 26481) ^ 1511920726;
                        i14 = iM6982 ^ 60277665;
                        obj = th;
                    }
                    i13 = i5;
                    break;
                case -1605012227:
                case 175355865:
                    strM6988 = C2105.m6988(f52594, 9, 3, i15);
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        iM2567 = (C0630.m2566("֡۫") ^ i11) * 57;
                        i5 = ((iM2567 ^ i12) * (-17899)) ^ 778351818;
                        i6 = 1917532474;
                        i14 = iM2567 ^ i6;
                        i13 = i5;
                    } else {
                        sArr3 = sArr3;
                        i19 = i19;
                        iM6981 = C2105.m6981("᩺ۚ") ^ i12;
                        i = ((iM6981 ^ i11) * (-13221)) ^ 1793934853;
                        i2 = -1230788640;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC17169 = this;
                        sArr3 = sArr3;
                    }
                    break;
                case -1564907125:
                case 1651290360:
                    sArr3 = f52594;
                    i18 = 6;
                    i19 = 3;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("᩹᩻") ^ i11;
                        i3 = ((iM2566 ^ i12) * 13219) ^ 1761254202;
                        i4 = 635792633;
                    } else {
                        iM2566 = (C0630.m2566("۫ۛ") + i11) * 65;
                        i3 = ((iM2566 ^ i12) * (-11779)) ^ (-1634049520);
                        i4 = -946908683;
                    }
                    i14 = iM2566 ^ i4;
                    i13 = i3;
                    activityC17169 = this;
                    break;
                case -1486283813:
                case 1860570403:
                    C2126.m7040();
                    if (C1047.f3863 >= 0) {
                        iM2567 = (i12 - C0630.m2566("ۢ۠")) * (-127);
                        i5 = ((iM2567 ^ i11) * (-2429)) ^ 1229992902;
                        i6 = -226874618;
                    } else {
                        iM2567 = (C2105.m6981("ܿܰ") + i11) * (-5);
                        i5 = ((iM2567 ^ i12) * 28857) ^ (-1279653425);
                        i6 = -1627660222;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -1310501205:
                case 964296384:
                    i15 = 57717;
                    iM6981 = C0630.m2566("ܰ۫") ^ i12;
                    i = ((iM6981 ^ i11) * 16453) ^ 1864613385;
                    i2 = -1375078587;
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC17169 = this;
                    sArr3 = sArr3;
                    break;
                case -1310299559:
                case -896981143:
                    strM10488 = C3432.m10488(f52594, 31, 3, i15);
                    if (C1128.f4106 <= 0) {
                        iM2567 = (i11 - C2105.m6981("ۚ᩸")) * (-59);
                        i5 = ((iM2567 ^ i12) * (-14445)) ^ 778366224;
                        i6 = -1826063859;
                    } else {
                        iM2567 = (C2105.m6981("ۤۧ") + i11) * 123;
                        i5 = ((iM2567 ^ i12) * (-9065)) ^ (-1348127410);
                        i6 = -991486927;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -1301883709:
                case 848414614:
                    C19452 c19453 = activityC17169.f52621;
                    if (c19453 != null) {
                        int iM6983 = C2105.m6981("ۜ᩷") ^ i11;
                        c19452 = c19453;
                        i13 = ((iM6983 ^ i12) * 10759) ^ (-164783537);
                        i14 = iM6983 ^ 1323469934;
                        interfaceC15417 = null;
                    } else {
                        c19452 = c19453;
                        interfaceC15417 = null;
                        abstractC15440M44845 = null;
                        iM2567 = C0630.m2566("ۡۨ") ^ i12;
                        i5 = ((iM2567 ^ i11) * (-29891)) ^ (-1674190972);
                        i6 = 654452860;
                        i14 = iM2567 ^ i6;
                        i13 = i5;
                    }
                    break;
                case -1274675983:
                case 307082966:
                    C7106.m19120();
                    break;
                case -1200358053:
                case -187365718:
                    AbstractC2021.m6574();
                    if (C0714.f2697 < 0) {
                        iM2567 = (C2105.m6981("ۡۜ") ^ i12) * (-51);
                        i5 = ((iM2567 ^ i11) * 1149) ^ 1251916452;
                        i6 = 460282180;
                    } else {
                        iM2567 = (i11 - C2105.m6981("ۚ᩸")) * (-59);
                        i5 = ((iM2567 ^ i12) * (-14445)) ^ 778366224;
                        i6 = -1826063859;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -1147117965:
                case 166302074:
                    C1504.m5167(C0630.m2566(strM6988) ^ 2128027926);
                    break;
                case -1132470151:
                case 709443624:
                    if (C1420.m4917(abstractC15440M27330)) {
                        iM2567 = C0630.m2566("ۧ۟") ^ i12;
                        i5 = ((iM2567 ^ i11) * 20873) ^ (-15648900);
                        i6 = 1578761147;
                    } else {
                        iM2567 = (C0630.m2566("ۖ֡") ^ i12) * (-9);
                        i5 = ((iM2567 ^ i11) * (-14339)) ^ (-1099543456);
                        i6 = -2101997921;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -918647390:
                case 38707593:
                    c11005M36266 = c12366.m36266();
                    sArr2 = f52594;
                    i16 = 12;
                    if (RunnableC3474.f10992 <= 0) {
                        iM2567 = (C2105.m6981("ۡۜ") ^ i12) * (-51);
                        i5 = ((iM2567 ^ i11) * 1149) ^ 1251916452;
                        i6 = 460282180;
                    } else {
                        iM2567 = C2105.m6981("۠۟") ^ i11;
                        i5 = ((iM2567 ^ i12) * (-9885)) ^ (-2119751132);
                        i6 = 1732870215;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -862156017:
                case 2040743046:
                    sArr3 = sArr3;
                    int i20 = i18;
                    int i21 = i19;
                    int iM6984 = C2105.m6981(C0422.m1955(sArr3, i20, i21, i15));
                    if (C7811.f24123 >= 0) {
                        i19 = i21;
                        i18 = i20;
                        i7 = iM6984;
                        iM6981 = (C2105.m6981("ܶ᩻") ^ i11) * (-17);
                        i = ((iM6981 ^ i12) * 433) ^ (-2142146321);
                        i2 = 90692037;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC17169 = this;
                        sArr3 = sArr3;
                    } else {
                        int iM6985 = (C2105.m6981("ۖܽ") ^ i12) * 79;
                        i13 = ((iM6985 ^ i11) * (-13967)) ^ (-2127047729);
                        i14 = iM6985 ^ 478736482;
                        i19 = i21;
                        sArr3 = sArr3;
                        activityC17169 = this;
                        i18 = i20;
                        i7 = iM6984;
                    }
                    break;
                case -769397903:
                case -602023530:
                    strM4373 = C1294.m4373(f52594, 34, 3, i15);
                    if (C0964.f3626 != 0) {
                        iM2567 = C0630.m2566("ۢ֫") ^ i12;
                        i5 = ((iM2567 ^ i11) * 12959) ^ 1789880068;
                        i6 = 625839618;
                    } else {
                        iM2567 = C0630.m2566("ۗ۠") ^ i11;
                        i5 = ((iM2567 ^ i12) * (-6739)) ^ 1427011599;
                        i6 = -1366340803;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -756191900:
                case 640427367:
                    C4263.m12821(new C0359(activityC17169, abstractC15440M27330));
                    break;
                case -631349894:
                case 1353893223:
                    if (abstractC15440M27330 != null) {
                        iM2567 = C2105.m6981("ۧۤ") ^ i11;
                        i5 = ((iM2567 ^ i12) * 5473) ^ 771026833;
                        i6 = 765256590;
                    } else {
                        iM2567 = (C0630.m2566("ۖ֡") ^ i12) * (-9);
                        i5 = ((iM2567 ^ i11) * (-14339)) ^ (-1099543456);
                        i6 = -2101997921;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -603901906:
                case -218518792:
                    activityC17169.m10235(C2105.m6981(strM10488) ^ 2127463782);
                    break;
                case -553534369:
                case 698428986:
                    abstractC15440M44845 = c19452.m44845();
                    iM2567 = C0630.m2566("ۡۨ") ^ i12;
                    i5 = ((iM2567 ^ i11) * (-29891)) ^ (-1674190972);
                    i6 = 654452860;
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -543220126:
                case 662722168:
                    C4075.m12263();
                    if (C0422.f1886 <= 0) {
                        iM2567 = (i12 - C0630.m2566("ۢ۠")) * (-127);
                        i5 = ((iM2567 ^ i11) * (-2429)) ^ 1229992902;
                        i6 = -226874618;
                        i14 = iM2567 ^ i6;
                        i13 = i5;
                    } else {
                        iM2566 = C0630.m2566("᩹᩻") ^ i11;
                        i3 = ((iM2566 ^ i12) * 13219) ^ 1761254202;
                        i4 = 635792633;
                        i14 = iM2566 ^ i4;
                        i13 = i3;
                        activityC17169 = this;
                    }
                    break;
                case -509785474:
                case -97863991:
                    sArr3 = sArr3;
                    i19 = i19;
                    if (C1047.m3602()) {
                        iM6981 = (C2105.m6981("ܺܰ") + i11) * 37;
                        i = ((iM6981 ^ i12) * (-9461)) ^ 2054659637;
                        i2 = 1820651552;
                    } else {
                        iM6981 = (i12 - C0630.m2566("ۖۡ")) * (-111);
                        i = ((iM6981 ^ i11) * 31167) ^ (-359924727);
                        i2 = 643023783;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC17169 = this;
                    sArr3 = sArr3;
                    break;
                case -494716809:
                case 724558173:
                    C11340.m28031();
                    if (!C0483.m2121()) {
                        iM2567 = (i12 - C0630.m2566("ۢ۠")) * (-127);
                        i5 = ((iM2567 ^ i11) * (-2429)) ^ 1229992902;
                        i6 = -226874618;
                        i14 = iM2567 ^ i6;
                        i13 = i5;
                    } else {
                        sArr3 = sArr3;
                        i19 = i19;
                        iM6981 = C2105.m6981("ۘۨ") ^ i11;
                        i = ((iM6981 ^ i12) * 30313) ^ 88753816;
                        i2 = -208737922;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC17169 = this;
                        sArr3 = sArr3;
                    }
                    break;
                case -360921710:
                case 894616167:
                    C1504.m5167(2116561456 ^ i7);
                    new ViewOnClickListenerC0059(activityC17169);
                    break;
                case -299227659:
                case 860516201:
                    break;
                case -207952783:
                case 77057904:
                    break;
                case -156597102:
                case 1475766224:
                    abstractC15440M27330 = c11005M36266.m27330(C1005.m3502(sArr2, i16, 19, i15));
                    iM2567 = (C0630.m2566("ܺ֨") + i12) * 101;
                    i5 = ((iM2567 ^ i11) * 7053) ^ 329392202;
                    i6 = 1658364478;
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case -133025558:
                case 1860548674:
                    sArr3 = sArr3;
                    i19 = i19;
                    if ((i9 + 1) - i8 > 0) {
                        iM6981 = (i12 - C2105.m6981("֡᩻")) * (-21);
                        i = ((iM6981 ^ i11) * 20191) ^ (-2080838688);
                        i2 = 543030591;
                    } else {
                        iM6981 = (i11 - C2105.m6981("֨ۚ")) * (-115);
                        i = ((iM6981 ^ i12) * 15081) ^ (-1414094433);
                        i2 = -360551763;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC17169 = this;
                    sArr3 = sArr3;
                    break;
                case -43067078:
                case 1931563116:
                    if (abstractC15440M44845 != null) {
                        iM2567 = (i11 - C2105.m6981("᩵ۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM2567 ^ i12) * (-14949)) ^ (-1247633319);
                        i6 = 1410763570;
                    } else {
                        iM2567 = (C0630.m2566("۠ܰ") + i12) * 77;
                        i5 = ((iM2567 ^ i11) * (-6845)) ^ 805983219;
                        i6 = -538627665;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case 156048509:
                case 522162011:
                    sArr3 = sArr3;
                    i19 = i19;
                    i17 = s + 1;
                    if (C4075.f12947 >= 0) {
                        iM6981 = (C2105.m6981("ܶ᩻") ^ i11) * (-17);
                        i = ((iM6981 ^ i12) * 433) ^ (-2142146321);
                        i2 = 90692037;
                    } else {
                        iM6981 = C2105.m6981("᩶᩷") ^ i12;
                        i = ((iM6981 ^ i11) * (-18421)) ^ 523112938;
                        i2 = 1260358283;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC17169 = this;
                    sArr3 = sArr3;
                    break;
                case 171606868:
                case 1006938437:
                    if (C9255.m23764(this)) {
                        iM2567 = C0630.m2566("֡ۧ") ^ i12;
                        i5 = ((iM2567 ^ i11) * (-30795)) ^ 1534628340;
                        i6 = 1913599030;
                    } else {
                        iM2567 = (C0630.m2566("ᩳ᩶") ^ i11) * 27;
                        i5 = ((iM2567 ^ i12) * 151) ^ 1547020274;
                        i6 = -43569982;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case 904507965:
                case 1250778660:
                    if (C1047.f3863 >= 0) {
                        iM2567 = C2105.m6981("ۖ֫") ^ i12;
                        i5 = ((iM2567 ^ i11) * 5879) ^ (-1822713920);
                        i6 = -213227911;
                    } else {
                        iM2567 = C0630.m2566("ۢ֫") ^ i12;
                        i5 = ((iM2567 ^ i11) * 12959) ^ 1789880068;
                        i6 = 625839618;
                    }
                    i14 = iM2567 ^ i6;
                    i13 = i5;
                    break;
                case 947553045:
                case 1064062718:
                    activityC17169.m10235(C0630.m2566(strM4373) ^ 2098455548);
                    break;
                case 1780925012:
                case 1903096124:
                    C3019.m9255();
                    if (!C2126.f7087) {
                        sArr3 = sArr3;
                        i19 = i19;
                        iM6981 = C2105.m6981("ۘۨ") ^ i11;
                        i = ((iM6981 ^ i12) * 30313) ^ 88753816;
                        i2 = -208737922;
                        i14 = iM6981 ^ i2;
                        i13 = i;
                        i19 = i19;
                        activityC17169 = this;
                        sArr3 = sArr3;
                    } else {
                        iM2567 = C2105.m6981("ۖ֫") ^ i12;
                        i5 = ((iM2567 ^ i11) * 5879) ^ (-1822713920);
                        i6 = -213227911;
                        i14 = iM2567 ^ i6;
                        i13 = i5;
                    }
                    break;
                case 1979997896:
                case 2056543168:
                    sArr3 = sArr3;
                    int i22 = i19;
                    if (C1711.m5729()) {
                        i19 = i22;
                        iM6981 = (C2105.m6981("ۘۖ") ^ i11) * (-21);
                        i = ((iM6981 ^ i12) * 3351) ^ 843752968;
                        i2 = 988889610;
                    } else {
                        iM6981 = C2105.m6981("᩷۫") ^ i12;
                        i19 = i22;
                        i = ((iM6981 ^ i11) * (-24719)) ^ (-436898787);
                        i2 = -193598562;
                    }
                    i14 = iM6981 ^ i2;
                    i13 = i;
                    i19 = i19;
                    activityC17169 = this;
                    sArr3 = sArr3;
                    break;
                default:
                    C7811.m20844();
                    C21923.m49329();
                    iM2566 = C0630.m2566("᩹᩻") ^ i11;
                    i3 = ((iM2566 ^ i12) * 13219) ^ 1761254202;
                    i4 = 635792633;
                    i14 = iM2566 ^ i4;
                    i13 = i3;
                    activityC17169 = this;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final void m40361() {
        AbstractC15440 abstractC15440 = C0684.f2624;
        if (!abstractC15440.mo23120()) {
            abstractC15440.mo23546();
        }
        int i = 1;
        while (true) {
            if (!abstractC15440.m36526("Project" + i).mo23120()) {
                C18705 c18705 = new C18705(this, this, abstractC15440);
                c18705.m31258(R.string.MT_Protector);
                c18705.m31250((CharSequence) ("Project" + i));
                c18705.m31244();
                c18705.m31279(6);
                c18705.m31281();
                c18705.m31256(R.string.MT_Protector);
                c18705.m31266(true);
                return;
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        this.f52615 = true;
        if (m40373()) {
            try {
                ExecutorService executorService = C1802.f6208;
                final C11005 c11005 = this.f52620;
                C11003.requireNonNull(c11005);
                executorService.submit(new Callable() { // from class: l.᩸۫᩷
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(c11005.m27333());
                    }
                }).get(100L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            if (this.f52607.f11863) {
                C4925.m14312(new Intent("ACTION_MT_CLOSE_RESOURCE_QUERIER"));
            }
        }
        super.finish();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40355(boolean z) {
        if (!z && m40366()) {
            throw new RuntimeException("hasModifiedFiles");
        }
        new C19411(this).m20274();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m40320(ActivityC17169 activityC17169, int i) {
        int iM40266;
        ArrayList arrayList = activityC17169.f52616;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        AbstractC14346 abstractC14346 = (AbstractC14346) arrayList.get(i);
        if (abstractC14346.m34230()) {
            iM40266 = activityC17169.m40266(0, false);
            Bundle bundleRequireArguments = abstractC14346.requireArguments();
            C11003.requireNonNull(bundleRequireArguments);
            bundleRequireArguments.putBoolean("top", false);
            while (iM40266 < arrayList.size() && ((AbstractC14346) arrayList.get(iM40266)).m34230()) {
                iM40266++;
            }
        } else {
            int iM40267 = activityC17169.m40266(0, true);
            Bundle bundleRequireArguments2 = abstractC14346.requireArguments();
            C11003.requireNonNull(bundleRequireArguments2);
            bundleRequireArguments2.putBoolean("top", true);
            iM40266 = iM40267;
        }
        if (i != iM40266) {
            AbstractC14346 abstractC14347 = (AbstractC14346) arrayList.get(activityC17169.f52618);
            if (i < iM40266) {
                iM40266--;
            }
            arrayList.remove(i);
            arrayList.add(iM40266, abstractC14346);
            activityC17169.f52618 = arrayList.indexOf(abstractC14347);
            activityC17169.m40296();
        }
        activityC17169.m40331();
        activityC17169.f52613.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C3764 m40369() {
        return this.f52607;
    }
}
