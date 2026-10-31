package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܽ֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16315 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50233 = 0;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public C13132 f50234;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C13136 f50235;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f50236;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C1556 f50237;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C9762 f50239;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50240;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public boolean f50242;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public C16557 f50244;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C10091 f50247;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C8202 f50248;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f50249;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public C12230 f50251;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C20256 f50252;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C13064 f50253;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public static final Object f50232 = new Object();

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public static final Object f50231 = new Object();

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C1700 f50245 = new C1700(this, 1);

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f50241 = new ArrayList();

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f50246 = -1;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f50243 = false;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C8817 f50250 = C8817.m22787();

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public boolean f50238 = false;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "TextEditor";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38415(ActivityC16315 activityC16315, int i, CheckBox checkBox) {
        activityC16315.getClass();
        ArrayList arrayList = activityC16315.f50241;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C6055.m16891(arrayList2, new C2330());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C13617(activityC16315, linkedList, (C22372) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC16315.f50243 = true;
        ((C13617) linkedList.removeFirst()).m32733();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38429(ActivityC16315 activityC16315, int i, CheckBox checkBox) {
        activityC16315.getClass();
        ArrayList arrayList = new ArrayList(activityC16315.f50241.subList(0, i));
        C6055.m16891(arrayList, new C2330());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C13617(activityC16315, linkedList, (C22372) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC16315.f50243 = true;
        ((C13617) linkedList.removeFirst()).m32733();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38436(ActivityC16315 activityC16315, int i, CheckBox checkBox) {
        activityC16315.getClass();
        ArrayList arrayList = new ArrayList(activityC16315.f50241);
        arrayList.remove(i);
        C6055.m16891(arrayList, new C2330());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C13617(activityC16315, linkedList, (C22372) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC16315.f50243 = true;
        ((C13617) linkedList.removeFirst()).m32733();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] bArrM36506;
        int iM38437;
        super.onCreate(bundle);
        setTitle("");
        m10241(R.layout.MT_Protector);
        m10214();
        m10244().m30602(2);
        m38446();
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C22085 c22085 = new C22085(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c22085);
        m10241(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۚᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC16315.f50233;
                this.f57595.m38449(false);
            }
        });
        C9762 c9763 = (C9762) m10241(R.id.MT_Protector);
        this.f50239 = c9763;
        c9763.setTitle(R.string.MT_Protector);
        this.f50239.inflateMenu(R.menu.MT_Protector);
        this.f50244 = new C16557(this.f50239, R.id.MT_Protector, R.id.more);
        this.f50239.setOnMenuItemClickListener(new C19264(this));
        this.f50253 = (C13064) m10241(R.id.MT_Protector);
        this.f50249 = (FloatingActionButton) m10241(R.id.MT_Protector);
        m10229(this.f50253, m10241(R.id.MT_Protector), this.f10584, m10241(R.id.MT_Protector), this.f50239, this.f50249);
        this.f50253.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.֡ۚᩳ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC16315.m38413(this.f1466);
            }
        });
        C7623 c7623 = new C7623(this, this.f50253, this.f10584);
        c7623.m20413().m15982(C21943.f70298.getDefaultColor());
        this.f50253.m31651(c7623);
        c7623.m20414();
        this.f50253.m31651(new C21380(this));
        C20256 c20256 = (C20256) new C4741(this).m13885(C20256.class);
        this.f50252 = c20256;
        c20256.m46503(this, this.f50245);
        this.f50251 = (C12230) new C4741(this).m13885(C12230.class);
        this.f50248 = new C8202();
        C4925.m14316(new RunnableC5152(0, this), 500L);
        boolean z = bundle != null;
        synchronized (f50232) {
            AbstractC15440 abstractC15440M41823 = C17852.m41823();
            if (abstractC15440M41823.mo23120()) {
                try {
                    bArrM36506 = abstractC15440M41823.m36506();
                } catch (Exception e) {
                    this.f50252.m46502((Throwable) e);
                    bArrM36506 = null;
                }
                if (bArrM36506 != null) {
                    try {
                        C12951 c12951 = new C12951(bArrM36506);
                        C22124.m49722((InterfaceC20008) c12951, 1736577895);
                        while (c12951.available() > 0) {
                            byte[] bArrM31496 = c12951.m31496();
                            C22372 c22372 = new C22372();
                            if (c22372.getArguments() != null) {
                                throw new RuntimeException("Arguments is not null.");
                            }
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.unmarshall(bArrM31496, 0, bArrM31496.length);
                            parcelObtain.setDataPosition(0);
                            Bundle bundle2 = new Bundle();
                            bundle2.readFromParcel(parcelObtain);
                            c22372.setArguments(bundle2);
                            parcelObtain.recycle();
                            ComponentCallbacksC9205 componentCallbacksC9205M14899 = m2843().m14899(c22372.m5412());
                            if (!z) {
                                C12171.m29644(componentCallbacksC9205M14899);
                                c22372.m5424();
                                if (c22372.m5417()) {
                                    this.f50241.add(c22372);
                                }
                            } else if (componentCallbacksC9205M14899 != null) {
                                C22372 c22373 = (C22372) componentCallbacksC9205M14899;
                                if (!c22373.m5417()) {
                                    try {
                                        c22373.m5424();
                                    } catch (Exception e2) {
                                        this.f50252.m46502((Throwable) e2);
                                    }
                                }
                                if (c22373.m5417()) {
                                    this.f50241.add(c22373);
                                }
                            } else {
                                c22372.m5424();
                                if (c22372.m5417()) {
                                    this.f50241.add(c22372);
                                }
                            }
                            this.f50252.m46502((Throwable) e);
                        }
                    } catch (Exception e3) {
                        this.f50252.m46502((Throwable) e3);
                    }
                }
                C20256 c20257 = this.f50252;
                if (c20257.f65495) {
                    c20257.f65495 = false;
                    List listMo23549 = C17852.m41819().mo23549(true);
                    final ArrayList arrayList = new ArrayList();
                    arrayList.add(C11459.m28260("current|list").matcher((CharSequence) ""));
                    for (int i = 0; i < this.f50241.size(); i++) {
                        arrayList.add(C11459.m28260(C3939.m11985(((C22372) this.f50241.get(i)).m5412()) + "((-\\d+)?\\.dat|\\.tat|\\.lit|\\.e2)").matcher((CharSequence) ""));
                    }
                    C5378.stream(listMo23549).filter(new Predicate() { // from class: l.ܶۚᩳ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19285.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo4928negate() {
                            return C19285.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19285.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i2 = ActivityC16315.f50233;
                            String name = ((AbstractC15440) obj).getName();
                            for (C12164 c12164 : arrayList) {
                                c12164.m29615reset((CharSequence) name);
                                if (c12164.matches()) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }).forEach(new C23581(1));
                }
            }
        }
        this.f50247 = new C10091(this);
        C13132 c13132 = (C13132) findViewById(R.id.MT_Protector);
        this.f50234 = c13132;
        c13132.setAdapter(this.f50247);
        this.f50234.setLayoutManager(new C6495(this));
        this.f50234.getItemAnimator().m50782(200L);
        this.f50234.getItemAnimator().m50792(200L);
        this.f50234.getItemAnimator().m50789(200L);
        this.f50234.getItemAnimator().m50786(200L);
        this.f50249.setOnClickListener(new View.OnClickListener() { // from class: l.ܳۚᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC16315 activityC16315 = this.f43205;
                activityC16315.f50234.smoothScrollToPosition(activityC16315.f50246);
            }
        });
        this.f50234.addOnScrollListener(new C4446(this));
        C13132 c13133 = this.f50234;
        C16557 c16557 = this.f50244;
        C11003.requireNonNull(c16557);
        c13133.addOnItemTouchListener(new C5248(c13133, new C23496(c16557)));
        C1556 c1556 = new C1556(new C12912(this));
        this.f50237 = c1556;
        c1556.m5322(this.f50234);
        this.f50244.m38952(this.f50247);
        this.f50244.m38950(this.f50237);
        m38423();
        if ((bundle == null ? m38419(getIntent(), false, true) : false) || this.f50246 != -1 || (iM38437 = m38437()) == -1) {
            return;
        }
        m38426(iM38437, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38413(ActivityC16315 activityC16315) {
        int width = (activityC16315.f50253.getWidth() - activityC16315.f50253.getChildAt(1).getWidth()) - activityC16315.f50249.getWidth();
        int iM27878 = C11266.m27878(36.0f);
        float f = -(width > iM27878 * 2 ? width - iM27878 : width / 2);
        if (activityC16315.f50249.getTranslationX() != f) {
            activityC16315.f50249.setTranslationX(f);
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        this.f50242 = false;
        super.onStop();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        m38446();
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    private void m38446() {
        if (getResources().getConfiguration().orientation == 2) {
            m10244().m30599(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m10244().m30604(1);
        }
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f50236) {
            return;
        }
        m38419(intent, false, false);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38458(Intent intent) {
        m38419(intent, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m38419(Intent intent, boolean z, final boolean z2) {
        C22372 c22372;
        boolean z3;
        String stringExtra;
        if (intent.getBooleanExtra("fromExternalApp", false)) {
            this.f50242 = true;
        }
        if ("bin.mt.edit2.ACTION_CREATE_WITH_TEXT".equals(intent.getAction())) {
            m38455();
            return false;
        }
        if (!"android.intent.action.SEND".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.TEXT") || (stringExtra = intent.getStringExtra("android.intent.extra.TEXT")) == null) {
            boolean zEquals = "android.intent.action.VIEW".equals(intent.getAction());
            ArrayList arrayList = this.f50241;
            if (!zEquals && !"android.intent.action.EDIT".equals(intent.getAction())) {
                if (arrayList.isEmpty()) {
                    m38455();
                    return false;
                }
            } else if (intent.getData() == null) {
                if (arrayList.isEmpty()) {
                    m38455();
                    return false;
                }
            } else if (z || C9255.m23781()) {
                try {
                    AbstractC15440 abstractC15440M39862 = C16999.m39862(intent);
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            c22372 = null;
                            break;
                        }
                        c22372 = (C22372) arrayList.get(i);
                        if (c22372.m5420().f15019.mo23554().equals(abstractC15440M39862.mo23554())) {
                            break;
                        }
                        i++;
                    }
                    if (c22372 == null) {
                        if (arrayList.size() == 1) {
                            C22372 c22373 = (C22372) arrayList.get(0);
                            if (!c22373.m5410() || c22373.m5426()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                        C22372 c22374 = new C22372();
                        c22374.m5415((String) null);
                        String strMo23554 = abstractC15440M39862.mo23554();
                        Bundle bundle = c22374.f5606;
                        bundle.putString("filePath", strMo23554);
                        if (EnumC2288.m7536() != EnumC2288.ALWAYS_KEEP) {
                            bundle.putBoolean("temp", true);
                        }
                        String stringExtra2 = intent.getStringExtra("save_as_path");
                        if (stringExtra2 != null) {
                            bundle.putString("save_as_path", stringExtra2);
                        }
                        if (intent.getBooleanExtra("axml", false)) {
                            bundle.putBoolean("forceTryAXml", true);
                        }
                        if (intent.getBooleanExtra(Name.LABEL, false)) {
                            bundle.putBoolean("forceTryClass", true);
                        }
                        int iM38411 = m38411(m38437() + 1, false);
                        arrayList.add(iM38411, c22374);
                        m38432();
                        c22374.mo5408(new String[0]);
                        i = iM38411;
                    } else {
                        z3 = false;
                    }
                    m38426(i, false);
                    if (z3) {
                        m38448((C22372) arrayList.get(0));
                    }
                } catch (Exception e) {
                    m10224((Throwable) e, true);
                    return false;
                }
            } else {
                final Intent intent2 = new Intent(intent);
                this.f50236 = true;
                C13136 c13136 = new C13136(this, R.string.MT_Protector);
                c13136.m31866(500);
                this.f50235 = c13136;
                C1802.f6208.execute(new Runnable() { // from class: l.۠ۚᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = ActivityC16315.f50233;
                        try {
                            C9255.m23778();
                        } catch (Throwable unused) {
                        }
                        C4925.m14315(new RunnableC17146(this.f24630, intent2, z2));
                    }
                });
                return true;
            }
            return false;
        }
        C17622.f53840 = stringExtra;
        m38455();
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38416(ActivityC16315 activityC16315, Intent intent, boolean z) {
        int iM38437;
        C13136 c13136 = activityC16315.f50235;
        if (c13136 != null) {
            c13136.m31857();
            activityC16315.f50235 = null;
        }
        activityC16315.f50236 = false;
        AbstractC5180 abstractC5180M2843 = activityC16315.m2843();
        if (activityC16315.isFinishing() || activityC16315.isDestroyed() || abstractC5180M2843.m14910() || abstractC5180M2843.m14886()) {
            return;
        }
        activityC16315.m38419(intent, true, false);
        if (z && activityC16315.f50246 == -1 && (iM38437 = activityC16315.m38437()) != -1) {
            activityC16315.m38426(iM38437, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38412(CharSequence charSequence) {
        C17622.f53840 = charSequence;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m38459(int i) {
        C8202 c8202 = this.f50248;
        if (c8202 != null) {
            c8202.m21700(this, R.layout.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View m38460(int i) {
        C8202 c8202 = this.f50248;
        if (c8202 != null) {
            return c8202.m21699(R.layout.MT_Protector);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m38452() {
        if (ApplicationC20075.f65010.getBoolean("double_confirm_before_exit", false)) {
            return this.f50250.m22791();
        }
        return false;
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        this.f50242 = false;
        m38449(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38449(boolean z) {
        if (z && m38452()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        System.out.println("exitToExternalApp=" + this.f50242);
        m38439();
        finish();
        if (this.f50242) {
            moveTaskToBack(true);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38454(boolean z) {
        if (this.f50238) {
            return;
        }
        boolean z2 = true;
        this.f50238 = true;
        ArrayList<C22372> arrayList = this.f50241;
        if (z) {
            C22372 c22372 = (C22372) arrayList.get(this.f50246);
            ArrayList arrayList2 = new ArrayList();
            for (C22372 c22373 : arrayList) {
                if (c22373.mo5419() && c22373 != c22372 && !c22373.m5426()) {
                    arrayList2.add(c22373);
                }
            }
            boolean zIsEmpty = arrayList2.isEmpty();
            boolean z3 = !zIsEmpty;
            if (!zIsEmpty) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C22372) it.next()).m50233();
                }
                arrayList.removeAll(arrayList2);
                this.f50246 = arrayList.indexOf(c22372);
            }
            if (c22372.mo5419()) {
                arrayList.remove(this.f50246);
                int i = this.f50246;
                if (i > 0) {
                    this.f50246 = i - 1;
                }
                c22372.m50233();
            } else {
                z2 = z3;
            }
            if (z2) {
                m38441();
                m38432();
            }
        } else {
            C22372 c22374 = (C22372) arrayList.get(this.f50246);
            if (c22374.mo5419()) {
                arrayList.remove(this.f50246);
                int i2 = this.f50246;
                if (i2 > 0) {
                    this.f50246 = i2 - 1;
                }
                c22374.m50233();
                m38441();
                m38432();
            }
        }
        m38449(false);
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m38439();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onPause() {
        super.onPause();
        m38439();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38447(MenuItem menuItem) {
        if (C13876.f41361.m22793()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f50244.m38953(true);
            return;
        }
        if (this.f50244.m38954()) {
            return;
        }
        ArrayList arrayList = this.f50241;
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m38461();
                m38455();
                return;
            } else {
                if (itemId == R.id.MT_Protector) {
                    ((C22372) arrayList.get(this.f50246)).onOptionsItemSelected(menuItem);
                    return;
                }
                return;
            }
        }
        LinkedList linkedList = new LinkedList();
        for (C22372 c22372 : new ArrayList(arrayList)) {
            if (c22372.m5426() && !c22372.m5410()) {
                linkedList.add(new C15315(c22372, this));
            }
        }
        if (linkedList.isEmpty()) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            new C19969(this, linkedList).m20274();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m38443(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f50241;
        if (i >= arrayList.size()) {
            return null;
        }
        return C6554.m18061(50, ((C22372) arrayList.get(i)).m5420().f15019.getName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38418(ActivityC16315 activityC16315, C3060 c3060, int i) {
        ArrayList arrayList = activityC16315.f50241;
        C7268 c7268 = new C7268();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C22372 c22372 = (C22372) arrayList.get(i2);
            if (!c22372.m5413()) {
                c7268.f22337++;
                if (!c22372.m5426()) {
                    c7268.f22339++;
                }
                if (i2 < i) {
                    c7268.f22336++;
                } else if (i2 > i) {
                    c7268.f22338++;
                }
            }
        }
        if (C7268.m19512(c7268)) {
            SubMenu subMenuAddSubMenu = c3060.addSubMenu(0, R.id.MT_Protector, 0, activityC16315.getString(R.string.MT_Protector) + "…");
            subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
            subMenuAddSubMenu.setHeaderTitle(R.string.MT_Protector);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7268.f22336 + c7268.f22338 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7268.f22337 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7268.f22339 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7268.f22336 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c7268.f22338 > 0);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m38456() {
        return this.f50243;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m38451(final int i) {
        String strM38443 = m38443(i);
        if (strM38443 == null) {
            return;
        }
        View viewM10216 = m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM38443));
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۜۚᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC16315.m38436(this.f20247, i, checkBox);
            }
        };
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, onClickListener);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38417(ActivityC16315 activityC16315, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC16315.f50241);
        C6055.m16891(arrayList, new C2330());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C13617(activityC16315, linkedList, (C22372) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC16315.f50243 = true;
        ((C13617) linkedList.removeFirst()).m32733();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38427(ActivityC16315 activityC16315) {
        activityC16315.f50243 = true;
        try {
            for (C22372 c22372 : new ArrayList(activityC16315.f50241)) {
                if (!c22372.m5426() && !c22372.m5413()) {
                    activityC16315.m38448(c22372);
                }
            }
            activityC16315.f50243 = false;
        } catch (Throwable th) {
            activityC16315.f50243 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m38457(int i) {
        String strM38443 = m38443(i);
        if (strM38443 == null) {
            return;
        }
        View viewM10216 = m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM38443));
        DialogInterfaceOnClickListenerC15734 dialogInterfaceOnClickListenerC15734 = new DialogInterfaceOnClickListenerC15734(this, i, (CheckBox) viewM10216.findViewById(R.id.MT_Protector), 0);
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, dialogInterfaceOnClickListenerC15734);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m38462(final int i) {
        String strM38443 = m38443(i);
        if (strM38443 == null) {
            return;
        }
        View viewM10216 = m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM38443));
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۢۚᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC16315.m38415(this.f28508, i, checkBox);
            }
        };
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, onClickListener);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m38450() {
        C10091 c10091 = this.f50247;
        if (c10091 != null) {
            c10091.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m38461() {
        if (this.f50253.m31666(8388611)) {
            this.f50253.m31647(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public void m38423() {
        boolean zM31666 = this.f50253.m31666(8388611);
        C6495 c6495 = (C6495) this.f50234.getLayoutManager();
        C11003.requireNonNull(c6495);
        int iFindFirstVisibleItemPosition = c6495.findFirstVisibleItemPosition();
        int childCount = c6495.getChildCount() + iFindFirstVisibleItemPosition;
        int i = this.f50246;
        if (i < iFindFirstVisibleItemPosition || i >= childCount) {
            if (this.f50240) {
                return;
            }
            this.f50240 = true;
            if (zM31666) {
                this.f50249.setVisibility(0);
                this.f50249.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f50249, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f50240) {
            this.f50240 = false;
            if (zM31666) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50249, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.addListener(new C12207(this));
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m38455() {
        C22372 c22372 = new C22372();
        c22372.m5415((String) null);
        c22372.f5606.putString("filePath", "untitled");
        ArrayList arrayList = this.f50241;
        if (arrayList.isEmpty()) {
            this.f50246 = -1;
        }
        int iM38411 = m38411(this.f50246 + 1, false);
        arrayList.add(iM38411, c22372);
        m38432();
        c22372.mo5408(new String[0]);
        m38426(iM38411, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38448(C22372 c22372) {
        int i;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f50241;
        int iIndexOf = arrayList.indexOf(c22372);
        C12171.m29642(iIndexOf != -1);
        if (arrayList.size() > 1 && iIndexOf == (i = this.f50246)) {
            if (i > 0) {
                m38426(i - 1, true);
            } else {
                m38426(i + 1, true);
            }
            C12171.m29642(iIndexOf != this.f50246);
        }
        ComponentCallbacksC9205 componentCallbacksC9205M14899 = m2843().m14899(c22372.m5412());
        if (componentCallbacksC9205M14899 != null) {
            C12171.m29642(c22372 == componentCallbacksC9205M14899);
            AbstractC16882 abstractC16882M14900 = m2843().m14900();
            abstractC16882M14900.mo39690(c22372);
            abstractC16882M14900.mo39685();
        } else {
            C12171.m29642((c22372.isAdded() || c22372.isDetached()) ? false : true);
        }
        arrayList.remove(iIndexOf);
        int i2 = this.f50246;
        if (iIndexOf < i2) {
            this.f50246 = i2 - 1;
            m38441();
            m38423();
        }
        this.f50247.notifyItemRemoved(iIndexOf);
        c22372.m50233();
        m38432();
        if (arrayList.isEmpty()) {
            m38449(false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38453(C22372 c22372) {
        int iIndexOf = this.f50241.indexOf(c22372);
        if (iIndexOf != -1) {
            m38426(iIndexOf, false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38428(ActivityC16315 activityC16315, int i) {
        activityC16315.m38426(i, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38426(int i, boolean z) {
        InterfaceC18581 interfaceC18581M50235;
        if (i >= 0) {
            ArrayList arrayList = this.f50241;
            if (i < arrayList.size()) {
                AbstractC5180 abstractC5180M2843 = m2843();
                if (abstractC5180M2843.m14910() || abstractC5180M2843.m14886()) {
                    return;
                }
                int i2 = this.f50246;
                if (i2 == -1) {
                    C22372 c22372 = (C22372) arrayList.get(i);
                    AbstractC16882 abstractC16882M14900 = abstractC5180M2843.m14900();
                    abstractC16882M14900.m39679(R.id.MT_Protector, c22372, c22372.m5412());
                    abstractC16882M14900.mo39685();
                    this.f50246 = i;
                    m38441();
                    m38423();
                    this.f50247.notifyDataSetChanged();
                    return;
                }
                if (i2 != i) {
                    C22372 c22373 = (C22372) arrayList.get(i2);
                    C22372 c22374 = (C22372) arrayList.get(i);
                    if (!z && (interfaceC18581M50235 = c22373.m50235()) != null) {
                        if (this.f50251.m29735()) {
                            this.f50251.m29733((Runnable) new RunnableC0918(0, interfaceC18581M50235));
                        } else {
                            interfaceC18581M50235.mo9498();
                            this.f50251.m29733((Runnable) new RunnableC3741(interfaceC18581M50235));
                        }
                    }
                    AbstractC16882 abstractC16882M14901 = abstractC5180M2843.m14900();
                    if (this.f50246 < i) {
                        abstractC16882M14901.m39678(R.anim.MT_Protector, R.anim.MT_Protector);
                    } else {
                        abstractC16882M14901.m39678(R.anim.MT_Protector, R.anim.MT_Protector);
                    }
                    abstractC16882M14901.mo39686(c22373);
                    if (c22374.isDetached()) {
                        abstractC16882M14901.m39681(c22374);
                    } else {
                        abstractC16882M14901.m39682(c22374, c22374.m5412());
                    }
                    abstractC16882M14901.mo39689();
                    this.f50246 = i;
                    m38441();
                    m38423();
                    this.f50247.notifyDataSetChanged();
                    return;
                }
                ((C22372) arrayList.get(i2)).m50237();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m38411(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f50241;
            if (i >= arrayList.size()) {
                break;
            }
            C22372 c22372 = (C22372) arrayList.get(i);
            if (z || !c22372.m5413()) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void m38432() {
        AbstractC15440 abstractC15440M41823 = C17852.m41823();
        C10130 c10130M43030 = C18515.m43030(1736577895);
        for (C22372 c22372 : this.f50241) {
            c22372.getClass();
            Parcel parcelObtain = Parcel.obtain();
            c22372.requireArguments().writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            c10130M43030.m25434(bArrMarshall);
        }
        try {
            new RunnableC8450(abstractC15440M41823, c10130M43030, f50232).m22126();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private void m38439() {
        InterfaceC18581 interfaceC18581M50235;
        int i = this.f50246;
        if (i != -1) {
            ArrayList arrayList = this.f50241;
            if (i >= arrayList.size() || (interfaceC18581M50235 = ((C22372) arrayList.get(this.f50246)).m50235()) == null) {
                return;
            }
            interfaceC18581M50235.mo9498();
            this.f50251.m29733((Runnable) new RunnableC3741(interfaceC18581M50235));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public void m38441() {
        C10130 c10130 = new C10130(4);
        c10130.writeInt(this.f50246);
        AbstractC15440 abstractC15440M41821 = C17852.m41821();
        Object obj = f50231;
        C1802.m5991(new RunnableC8450(abstractC15440M41821, c10130, obj), obj, 200L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x001b -> B:16:0x0020). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m38437() throws Throwable {
        Exception e;
        ?? M41821;
        try {
            M41821 = C17852.m41821();
            try {
                synchronized (f50231) {
                    try {
                        int i = M41821.mo23120() ? M41821.m36528().readInt() : -1;
                    } catch (Throwable th) {
                        th = th;
                        M41821 = -1;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                M41821 = M41821;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                this.f50252.m46502((Throwable) e);
                ?? r1 = M41821;
                if (this.f50241.isEmpty()) {
                    return -1;
                }
                if (r1 < 0 || r1 >= this.f50241.size()) {
                    return 0;
                }
                return r1 == true ? 1 : 0;
            }
        } catch (Exception e3) {
            e = e3;
            M41821 = -1;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m38435(ActivityC16315 activityC16315, int i) {
        int iM38411;
        ArrayList arrayList = activityC16315.f50241;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        C22372 c22372 = (C22372) arrayList.get(i);
        if (c22372.m5413()) {
            iM38411 = activityC16315.m38411(0, false);
            Bundle bundleRequireArguments = c22372.requireArguments();
            C11003.requireNonNull(bundleRequireArguments);
            bundleRequireArguments.putBoolean("top", false);
            while (iM38411 < arrayList.size() && ((C22372) arrayList.get(iM38411)).m5413()) {
                iM38411++;
            }
        } else {
            int iM38412 = activityC16315.m38411(0, true);
            Bundle bundleRequireArguments2 = c22372.requireArguments();
            C11003.requireNonNull(bundleRequireArguments2);
            bundleRequireArguments2.putBoolean("top", true);
            c22372.m50232();
            iM38411 = iM38412;
        }
        if (i != iM38411) {
            C22372 c22373 = (C22372) arrayList.get(activityC16315.f50246);
            if (i < iM38411) {
                iM38411--;
            }
            arrayList.remove(i);
            arrayList.add(iM38411, c22372);
            activityC16315.f50246 = arrayList.indexOf(c22373);
            activityC16315.m38441();
            activityC16315.m38423();
        }
        activityC16315.m38432();
        activityC16315.f50247.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38430() {
        return ApplicationC20075.f65008.getBoolean("axml_id_2_name", true);
    }
}
