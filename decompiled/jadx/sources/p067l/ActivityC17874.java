package p067l;

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
import bin.p000mt.plus.R;
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
public class ActivityC17874 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩶ۧ */
    public static final /* synthetic */ int f53400 = 0;

    /* JADX INFO: renamed from: ֡ۧ */
    public C14849 f53401;

    /* JADX INFO: renamed from: ֨ۧ */
    public C14853 f53402;

    /* JADX INFO: renamed from: ۖۧ */
    public boolean f53403;

    /* JADX INFO: renamed from: ۘۧ */
    public C3847 f53404;

    /* JADX INFO: renamed from: ۜۧ */
    public C1326 f53406;

    /* JADX INFO: renamed from: ۠ۧ */
    public boolean f53407;

    /* JADX INFO: renamed from: ۢۧ */
    public boolean f53409;

    /* JADX INFO: renamed from: ܶۧ */
    public C18104 f53411;

    /* JADX INFO: renamed from: ᩳۧ */
    public C11959 f53414;

    /* JADX INFO: renamed from: ᩴۧ */
    public C10164 f53415;

    /* JADX INFO: renamed from: ᩵ۧ */
    public FloatingActionButton f53416;

    /* JADX INFO: renamed from: ᩸ۧ */
    public C13992 f53418;

    /* JADX INFO: renamed from: ᩹ۧ */
    public C21620 f53419;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C14784 f53420;

    /* JADX INFO: renamed from: ۙۧ */
    public static final Object f53399 = new Object();

    /* JADX INFO: renamed from: ۗۧ */
    public static final Object f53398 = new Object();

    /* JADX INFO: renamed from: ܺۧ */
    public C3984 f53412 = new C3984(this, 1);

    /* JADX INFO: renamed from: ۡۧ */
    public ArrayList f53408 = new ArrayList();

    /* JADX INFO: renamed from: ܿۧ */
    public int f53413 = -1;

    /* JADX INFO: renamed from: ܳۧ */
    public boolean f53410 = false;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C10748 f53417 = C10748.m24757();

    /* JADX INFO: renamed from: ۚۧ */
    public boolean f53405 = false;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "TextEditor";
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40630(ActivityC17874 activityC17874, int i, CheckBox checkBox) {
        activityC17874.getClass();
        ArrayList arrayList = activityC17874.f53408;
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i + 1, arrayList.size()));
        C8123.m18820(arrayList2, new C4583());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedList.add(new C15310(activityC17874, linkedList, (C23631) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC17874.f53410 = true;
        ((C15310) linkedList.removeFirst()).m34845();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m40644(ActivityC17874 activityC17874, int i, CheckBox checkBox) {
        activityC17874.getClass();
        ArrayList arrayList = new ArrayList(activityC17874.f53408.subList(0, i));
        C8123.m18820(arrayList, new C4583());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C15310(activityC17874, linkedList, (C23631) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC17874.f53410 = true;
        ((C15310) linkedList.removeFirst()).m34845();
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m40651(ActivityC17874 activityC17874, int i, CheckBox checkBox) {
        activityC17874.getClass();
        ArrayList arrayList = new ArrayList(activityC17874.f53408);
        arrayList.remove(i);
        C8123.m18820(arrayList, new C4583());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C15310(activityC17874, linkedList, (C23631) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC17874.f53410 = true;
        ((C15310) linkedList.removeFirst()).m34845();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] bArrM38664;
        int iM40652;
        super.onCreate(bundle);
        setTitle("");
        m12277(R.layout.MT_Protector);
        m12250();
        m12280().m32667(2);
        m40661();
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C23358 c23358 = new C23358(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c23358);
        m12277(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ᩴۚᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC17874.f53400;
                this.f60818.m40664(false);
            }
        });
        C1326 c1327 = (C1326) m12277(R.id.MT_Protector);
        this.f53406 = c1327;
        c1327.setTitle(R.string.MT_Protector);
        this.f53406.inflateMenu(R.menu.MT_Protector);
        this.f53411 = new C18104(this.f53406, R.id.MT_Protector, R.id.more);
        this.f53406.setOnMenuItemClickListener(new C20677(this));
        this.f53420 = (C14784) m12277(R.id.MT_Protector);
        this.f53416 = (FloatingActionButton) m12277(R.id.MT_Protector);
        m12265(this.f53420, m12277(R.id.MT_Protector), this.f13392, m12277(R.id.MT_Protector), this.f53406, this.f53416);
        this.f53420.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.֡ۚᩳ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC17874.m40628(this.f4245);
            }
        });
        C1220 c1220 = new C1220(this, this.f53420, this.f13392);
        c1220.m22392().m17917(C23223.f73009.getDefaultColor());
        this.f53420.m33738(c1220);
        c1220.m22393();
        this.f53420.m33738(new C22688(this));
        C21620 c21620 = (C21620) new C6874(this).m15765(C21620.class);
        this.f53419 = c21620;
        c21620.m48824(this, this.f53412);
        this.f53418 = (C13992) new C6874(this).m15765(C13992.class);
        this.f53415 = new C10164();
        C7050.m16213(new RunnableC7265(0, this), 500L);
        boolean z = bundle != null;
        synchronized (f53399) {
            AbstractC17043 abstractC17043M44069 = C19335.m44069();
            if (abstractC17043M44069.mo25094()) {
                try {
                    bArrM38664 = abstractC17043M44069.m38664();
                } catch (Exception e) {
                    this.f53419.m48823((Throwable) e);
                    bArrM38664 = null;
                }
                if (bArrM38664 != null) {
                    try {
                        C14677 c14677 = new C14677(bArrM38664);
                        C23395.m52060((InterfaceC21384) c14677, 1736577895);
                        while (c14677.available() > 0) {
                            byte[] bArrM33583 = c14677.m33583();
                            C23631 c23631 = new C23631();
                            if (c23631.getArguments() != null) {
                                throw new RuntimeException("Arguments is not null.");
                            }
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.unmarshall(bArrM33583, 0, bArrM33583.length);
                            parcelObtain.setDataPosition(0);
                            Bundle bundle2 = new Bundle();
                            bundle2.readFromParcel(parcelObtain);
                            c23631.setArguments(bundle2);
                            parcelObtain.recycle();
                            ComponentCallbacksC11117 componentCallbacksC11117M16809 = m5172().m16809(c23631.m7641());
                            if (!z) {
                                C1446.m31706(componentCallbacksC11117M16809);
                                c23631.m7653();
                                if (c23631.m7646()) {
                                    this.f53408.add(c23631);
                                }
                            } else if (componentCallbacksC11117M16809 != null) {
                                C23631 c23632 = (C23631) componentCallbacksC11117M16809;
                                if (!c23632.m7646()) {
                                    try {
                                        c23632.m7653();
                                    } catch (Exception e2) {
                                        this.f53419.m48823((Throwable) e2);
                                    }
                                }
                                if (c23632.m7646()) {
                                    this.f53408.add(c23632);
                                }
                            } else {
                                c23631.m7653();
                                if (c23631.m7646()) {
                                    this.f53408.add(c23631);
                                }
                            }
                            this.f53419.m48823((Throwable) e);
                        }
                    } catch (Exception e3) {
                        this.f53419.m48823((Throwable) e3);
                    }
                }
                C21620 c21621 = this.f53419;
                if (c21621.f68144) {
                    c21621.f68144 = false;
                    List listMo25500 = C19335.m44065().mo25500(true);
                    final ArrayList arrayList = new ArrayList();
                    arrayList.add(C13259.m30304("current|list").matcher((CharSequence) ""));
                    for (int i = 0; i < this.f53408.size(); i++) {
                        arrayList.add(C13259.m30304(C6112.m13905(((C23631) this.f53408.get(i)).m7641()) + "((-\\d+)?\\.dat|\\.tat|\\.lit|\\.e2)").matcher((CharSequence) ""));
                    }
                    C7480.stream(listMo25500).filter(new Predicate() { // from class: l.ܶۚᩳ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C20697.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo55838negate() {
                            return C20697.$default$negate(this);
                        }

                        /* JADX INFO: renamed from: or */
                        public /* synthetic */ Predicate m37712or(Predicate predicate) {
                            return C20697.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            int i2 = ActivityC17874.f53400;
                            String name = ((AbstractC17043) obj).getName();
                            for (C13929 c13929 : arrayList) {
                                c13929.m56473reset((CharSequence) name);
                                if (c13929.matches()) {
                                    return false;
                                }
                            }
                            return true;
                        }
                    }).forEach(new C24780(1));
                }
            }
        }
        this.f53414 = new C11959(this);
        C14849 c14849 = (C14849) findViewById(R.id.MT_Protector);
        this.f53401 = c14849;
        c14849.setAdapter(this.f53414);
        this.f53401.setLayoutManager(new C8541(this));
        this.f53401.getItemAnimator().m53108(200L);
        this.f53401.getItemAnimator().m53118(200L);
        this.f53401.getItemAnimator().m53115(200L);
        this.f53401.getItemAnimator().m53112(200L);
        this.f53416.setOnClickListener(new View.OnClickListener() { // from class: l.ܳۚᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC17874 activityC17874 = this.f46297;
                activityC17874.f53401.smoothScrollToPosition(activityC17874.f53413);
            }
        });
        this.f53401.addOnScrollListener(new C6594(this));
        C14849 c148410 = this.f53401;
        C18104 c18104 = this.f53411;
        C12826.requireNonNull(c18104);
        c148410.addOnItemTouchListener(new C7356(c148410, new C24699(c18104)));
        C3847 c3847 = new C3847(new C14640(this));
        this.f53404 = c3847;
        c3847.m7551(this.f53401);
        this.f53411.m41178(this.f53414);
        this.f53411.m41176(this.f53404);
        m40638();
        if ((bundle == null ? m40634(getIntent(), false, true) : false) || this.f53413 != -1 || (iM40652 = m40652()) == -1) {
            return;
        }
        m40641(iM40652, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40628(ActivityC17874 activityC17874) {
        int width = (activityC17874.f53420.getWidth() - activityC17874.f53420.getChildAt(1).getWidth()) - activityC17874.f53416.getWidth();
        int iM29939 = C13076.m29939(36.0f);
        float f = -(width > iM29939 * 2 ? width - iM29939 : width / 2);
        if (activityC17874.f53416.getTranslationX() != f) {
            activityC17874.f53416.setTranslationX(f);
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onStop() {
        this.f53409 = false;
        super.onStop();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC0904, p067l.ActivityC2023, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        m40661();
    }

    /* JADX INFO: renamed from: ᩻֫ */
    private void m40661() {
        if (getResources().getConfiguration().orientation == 2) {
            m12280().m32664(1);
        } else if (getResources().getConfiguration().orientation == 1) {
            m12280().m32669(1);
        }
    }

    @Override // p067l.ActivityC2023, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f53403) {
            return;
        }
        m40634(intent, false, false);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40673(Intent intent) {
        m40634(intent, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m40634(Intent intent, boolean z, final boolean z2) {
        C23631 c23631;
        boolean z3;
        String stringExtra;
        if (intent.getBooleanExtra("fromExternalApp", false)) {
            this.f53409 = true;
        }
        if ("bin.mt.edit2.ACTION_CREATE_WITH_TEXT".equals(intent.getAction())) {
            m40670();
            return false;
        }
        if (!"android.intent.action.SEND".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.TEXT") || (stringExtra = intent.getStringExtra("android.intent.extra.TEXT")) == null) {
            boolean zEquals = "android.intent.action.VIEW".equals(intent.getAction());
            ArrayList arrayList = this.f53408;
            if (!zEquals && !"android.intent.action.EDIT".equals(intent.getAction())) {
                if (arrayList.isEmpty()) {
                    m40670();
                    return false;
                }
            } else if (intent.getData() == null) {
                if (arrayList.isEmpty()) {
                    m40670();
                    return false;
                }
            } else if (z || C11164.m25782()) {
                try {
                    AbstractC17043 abstractC17043M42105 = C18524.m42105(intent);
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            c23631 = null;
                            break;
                        }
                        c23631 = (C23631) arrayList.get(i);
                        if (c23631.m7649().f17850.mo25505().equals(abstractC17043M42105.mo25505())) {
                            break;
                        }
                        i++;
                    }
                    if (c23631 == null) {
                        if (arrayList.size() == 1) {
                            C23631 c23632 = (C23631) arrayList.get(0);
                            if (!c23632.m7639() || c23632.m7655()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                        C23631 c23633 = new C23631();
                        c23633.m7644((String) null);
                        String strMo25505 = abstractC17043M42105.mo25505();
                        Bundle bundle = c23633.f8386;
                        bundle.putString("filePath", strMo25505);
                        if (EnumC4543.m9604() != EnumC4543.ALWAYS_KEEP) {
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
                        int iM40626 = m40626(m40652() + 1, false);
                        arrayList.add(iM40626, c23633);
                        m40647();
                        c23633.mo7637(new String[0]);
                        i = iM40626;
                    } else {
                        z3 = false;
                    }
                    m40641(i, false);
                    if (z3) {
                        m40663((C23631) arrayList.get(0));
                    }
                } catch (Exception e) {
                    m12260((Throwable) e, true);
                    return false;
                }
            } else {
                final Intent intent2 = new Intent(intent);
                this.f53403 = true;
                C14853 c14853 = new C14853(this, R.string.MT_Protector);
                c14853.m33958(500);
                this.f53402 = c14853;
                C4081.f8987.execute(new Runnable() { // from class: l.۠ۚᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = ActivityC17874.f53400;
                        try {
                            C11164.m25779();
                        } catch (Throwable unused) {
                        }
                        C7050.m16212(new RunnableC18664(this.f27543, intent2, z2));
                    }
                });
                return true;
            }
            return false;
        }
        C19117.f57034 = stringExtra;
        m40670();
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40631(ActivityC17874 activityC17874, Intent intent, boolean z) {
        int iM40652;
        C14853 c14853 = activityC17874.f53402;
        if (c14853 != null) {
            c14853.m33949();
            activityC17874.f53402 = null;
        }
        activityC17874.f53403 = false;
        AbstractC7291 abstractC7291M5172 = activityC17874.m5172();
        if (activityC17874.isFinishing() || activityC17874.isDestroyed() || abstractC7291M5172.m16820() || abstractC7291M5172.m16796()) {
            return;
        }
        activityC17874.m40634(intent, true, false);
        if (z && activityC17874.f53413 == -1 && (iM40652 = activityC17874.m40652()) != -1) {
            activityC17874.m40641(iM40652, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40627(CharSequence charSequence) {
        C19117.f57034 = charSequence;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m40674(int i) {
        C10164 c10164 = this.f53415;
        if (c10164 != null) {
            c10164.m23669(this, R.layout.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final View m40675(int i) {
        C10164 c10164 = this.f53415;
        if (c10164 != null) {
            return c10164.m23668(R.layout.MT_Protector);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۟ */
    public final boolean m40667() {
        if (ApplicationC21448.f67650.getBoolean("double_confirm_before_exit", false)) {
            return this.f53417.m24761();
        }
        return false;
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        this.f53409 = false;
        m40664(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40664(boolean z) {
        if (z && m40667()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        System.out.println("exitToExternalApp=" + this.f53409);
        m40654();
        finish();
        if (this.f53409) {
            moveTaskToBack(true);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40669(boolean z) {
        if (this.f53405) {
            return;
        }
        boolean z2 = true;
        this.f53405 = true;
        ArrayList<C23631> arrayList = this.f53408;
        if (z) {
            C23631 c23631 = (C23631) arrayList.get(this.f53413);
            ArrayList arrayList2 = new ArrayList();
            for (C23631 c23632 : arrayList) {
                if (c23632.mo7648() && c23632 != c23631 && !c23632.m7655()) {
                    arrayList2.add(c23632);
                }
            }
            boolean zIsEmpty = arrayList2.isEmpty();
            boolean z3 = !zIsEmpty;
            if (!zIsEmpty) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C23631) it.next()).m52573();
                }
                arrayList.removeAll(arrayList2);
                this.f53413 = arrayList.indexOf(c23631);
            }
            if (c23631.mo7648()) {
                arrayList.remove(this.f53413);
                int i = this.f53413;
                if (i > 0) {
                    this.f53413 = i - 1;
                }
                c23631.m52573();
            } else {
                z2 = z3;
            }
            if (z2) {
                m40656();
                m40647();
            }
        } else {
            C23631 c23633 = (C23631) arrayList.get(this.f53413);
            if (c23633.mo7648()) {
                arrayList.remove(this.f53413);
                int i2 = this.f53413;
                if (i2 > 0) {
                    this.f53413 = i2 - 1;
                }
                c23633.m52573();
                m40656();
                m40647();
            }
        }
        m40664(false);
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m40654();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onPause() {
        super.onPause();
        m40654();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40662(MenuItem menuItem) {
        if (C15556.f44442.m24763()) {
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            this.f53411.m41179(true);
            return;
        }
        if (this.f53411.m41180()) {
            return;
        }
        ArrayList arrayList = this.f53408;
        if (itemId != R.id.MT_Protector) {
            if (itemId == R.id.MT_Protector) {
                m40676();
                m40670();
                return;
            } else {
                if (itemId == R.id.MT_Protector) {
                    ((C23631) arrayList.get(this.f53413)).onOptionsItemSelected(menuItem);
                    return;
                }
                return;
            }
        }
        LinkedList linkedList = new LinkedList();
        for (C23631 c23631 : new ArrayList(arrayList)) {
            if (c23631.m7655() && !c23631.m7639()) {
                linkedList.add(new C16924(c23631, this));
            }
        }
        if (linkedList.isEmpty()) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            new C21347(this, linkedList).m22250();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private String m40658(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.f53408;
        if (i >= arrayList.size()) {
            return null;
        }
        return C8597.m20011(50, ((C23631) arrayList.get(i)).m7649().f17850.getName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40633(ActivityC17874 activityC17874, C0994 c0994, int i) {
        ArrayList arrayList = activityC17874.f53408;
        C9276 c9276 = new C9276();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C23631 c23631 = (C23631) arrayList.get(i2);
            if (!c23631.m7642()) {
                c9276.f25226++;
                if (!c23631.m7655()) {
                    c9276.f25228++;
                }
                if (i2 < i) {
                    c9276.f25225++;
                } else if (i2 > i) {
                    c9276.f25227++;
                }
            }
        }
        if (C9276.m21478(c9276)) {
            SubMenu subMenuAddSubMenu = c0994.addSubMenu(0, R.id.MT_Protector, 0, activityC17874.getString(R.string.MT_Protector) + "…");
            subMenuAddSubMenu.getItem().setIcon(R.drawable.MT_Protector);
            subMenuAddSubMenu.setHeaderTitle(R.string.MT_Protector);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c9276.f25225 + c9276.f25227 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c9276.f25226 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c9276.f25228 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c9276.f25225 > 0);
            subMenuAddSubMenu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector).setEnabled(c9276.f25227 > 0);
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public final boolean m40671() {
        return this.f53410;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m40666(final int i) {
        String strM40658 = m40658(i);
        if (strM40658 == null) {
            return;
        }
        View viewM12252 = m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM40658));
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۜۚᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17874.m40651(this.f23125, i, checkBox);
            }
        };
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, onClickListener);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m40632(ActivityC17874 activityC17874, CheckBox checkBox) {
        ArrayList arrayList = new ArrayList(activityC17874.f53408);
        C8123.m18820(arrayList, new C4583());
        boolean zIsChecked = checkBox.isChecked();
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new C15310(activityC17874, linkedList, (C23631) it.next(), zIsChecked));
        }
        if (linkedList.isEmpty()) {
            return;
        }
        activityC17874.f53410 = true;
        ((C15310) linkedList.removeFirst()).m34845();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40642(ActivityC17874 activityC17874) {
        activityC17874.f53410 = true;
        try {
            for (C23631 c23631 : new ArrayList(activityC17874.f53408)) {
                if (!c23631.m7655() && !c23631.m7642()) {
                    activityC17874.m40663(c23631);
                }
            }
            activityC17874.f53410 = false;
        } catch (Throwable th) {
            activityC17874.f53410 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m40672(int i) {
        String strM40658 = m40658(i);
        if (strM40658 == null) {
            return;
        }
        View viewM12252 = m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM40658));
        DialogInterfaceOnClickListenerC17322 dialogInterfaceOnClickListenerC17322 = new DialogInterfaceOnClickListenerC17322(this, i, (CheckBox) viewM12252.findViewById(R.id.MT_Protector), 0);
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, dialogInterfaceOnClickListenerC17322);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m40677(final int i) {
        String strM40658 = m40658(i);
        if (strM40658 == null) {
            return;
        }
        View viewM12252 = m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(getString(R.string.MT_Protector, strM40658));
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.ۢۚᩳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC17874.m40630(this.f31457, i, checkBox);
            }
        };
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, onClickListener);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m40665() {
        C11959 c11959 = this.f53414;
        if (c11959 != null) {
            c11959.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    public final void m40676() {
        if (this.f53420.m33753(8388611)) {
            this.f53420.m33734(8388611);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ֫ */
    public void m40638() {
        boolean zM33753 = this.f53420.m33753(8388611);
        C8541 c8541 = (C8541) this.f53401.getLayoutManager();
        C12826.requireNonNull(c8541);
        int iFindFirstVisibleItemPosition = c8541.findFirstVisibleItemPosition();
        int childCount = c8541.getChildCount() + iFindFirstVisibleItemPosition;
        int i = this.f53413;
        if (i < iFindFirstVisibleItemPosition || i >= childCount) {
            if (this.f53407) {
                return;
            }
            this.f53407 = true;
            if (zM33753) {
                this.f53416.setVisibility(0);
                this.f53416.setAlpha(0.0f);
                ObjectAnimator.ofFloat(this.f53416, "alpha", 0.0f, 1.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        if (this.f53407) {
            this.f53407 = false;
            if (zM33753) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f53416, "alpha", 1.0f, 0.0f);
                objectAnimatorOfFloat.addListener(new C13970(this));
                objectAnimatorOfFloat.setDuration(200L).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public final void m40670() {
        C23631 c23631 = new C23631();
        c23631.m7644((String) null);
        c23631.f8386.putString("filePath", "untitled");
        ArrayList arrayList = this.f53408;
        if (arrayList.isEmpty()) {
            this.f53413 = -1;
        }
        int iM40626 = m40626(this.f53413 + 1, false);
        arrayList.add(iM40626, c23631);
        m40647();
        c23631.mo7637(new String[0]);
        m40641(iM40626, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40663(C23631 c23631) {
        int i;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new RuntimeException();
        }
        ArrayList arrayList = this.f53408;
        int iIndexOf = arrayList.indexOf(c23631);
        C1446.m31704(iIndexOf != -1);
        if (arrayList.size() > 1 && iIndexOf == (i = this.f53413)) {
            if (i > 0) {
                m40641(i - 1, true);
            } else {
                m40641(i + 1, true);
            }
            C1446.m31704(iIndexOf != this.f53413);
        }
        ComponentCallbacksC11117 componentCallbacksC11117M16809 = m5172().m16809(c23631.m7641());
        if (componentCallbacksC11117M16809 != null) {
            C1446.m31704(c23631 == componentCallbacksC11117M16809);
            AbstractC18413 abstractC18413M16810 = m5172().m16810();
            abstractC18413M16810.mo41931(c23631);
            abstractC18413M16810.mo41926();
        } else {
            C1446.m31704((c23631.isAdded() || c23631.isDetached()) ? false : true);
        }
        arrayList.remove(iIndexOf);
        int i2 = this.f53413;
        if (iIndexOf < i2) {
            this.f53413 = i2 - 1;
            m40656();
            m40638();
        }
        this.f53414.notifyItemRemoved(iIndexOf);
        c23631.m52573();
        m40647();
        if (arrayList.isEmpty()) {
            m40664(false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40668(C23631 c23631) {
        int iIndexOf = this.f53408.indexOf(c23631);
        if (iIndexOf != -1) {
            m40641(iIndexOf, false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40643(ActivityC17874 activityC17874, int i) {
        activityC17874.m40641(i, false);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m40641(int i, boolean z) {
        InterfaceC20028 interfaceC20028M52575;
        if (i >= 0) {
            ArrayList arrayList = this.f53408;
            if (i < arrayList.size()) {
                AbstractC7291 abstractC7291M5172 = m5172();
                if (abstractC7291M5172.m16820() || abstractC7291M5172.m16796()) {
                    return;
                }
                int i2 = this.f53413;
                if (i2 == -1) {
                    C23631 c23631 = (C23631) arrayList.get(i);
                    AbstractC18413 abstractC18413M16810 = abstractC7291M5172.m16810();
                    abstractC18413M16810.m41920(R.id.MT_Protector, c23631, c23631.m7641());
                    abstractC18413M16810.mo41926();
                    this.f53413 = i;
                    m40656();
                    m40638();
                    this.f53414.notifyDataSetChanged();
                    return;
                }
                if (i2 != i) {
                    C23631 c23632 = (C23631) arrayList.get(i2);
                    C23631 c23633 = (C23631) arrayList.get(i);
                    if (!z && (interfaceC20028M52575 = c23632.m52575()) != null) {
                        if (this.f53418.m31797()) {
                            this.f53418.m31795((Runnable) new RunnableC3241(0, interfaceC20028M52575));
                        } else {
                            interfaceC20028M52575.mo11541();
                            this.f53418.m31795((Runnable) new RunnableC5924(interfaceC20028M52575));
                        }
                    }
                    AbstractC18413 abstractC18413M16811 = abstractC7291M5172.m16810();
                    if (this.f53413 < i) {
                        abstractC18413M16811.m41919(R.anim.MT_Protector, R.anim.MT_Protector);
                    } else {
                        abstractC18413M16811.m41919(R.anim.MT_Protector, R.anim.MT_Protector);
                    }
                    abstractC18413M16811.mo41927(c23632);
                    if (c23633.isDetached()) {
                        abstractC18413M16811.m41922(c23633);
                    } else {
                        abstractC18413M16811.m41923(c23633, c23633.m7641());
                    }
                    abstractC18413M16811.mo41930();
                    this.f53413 = i;
                    m40656();
                    m40638();
                    this.f53414.notifyDataSetChanged();
                    return;
                }
                ((C23631) arrayList.get(i2)).m52577();
                return;
            }
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m40626(int i, boolean z) {
        while (true) {
            ArrayList arrayList = this.f53408;
            if (i >= arrayList.size()) {
                break;
            }
            C23631 c23631 = (C23631) arrayList.get(i);
            if (z || !c23631.m7642()) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫ */
    public void m40647() {
        AbstractC17043 abstractC17043M44069 = C19335.m44069();
        C11996 c11996M45308 = C19965.m45308(1736577895);
        for (C23631 c23631 : this.f53408) {
            c23631.getClass();
            Parcel parcelObtain = Parcel.obtain();
            c23631.requireArguments().writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            c11996M45308.m27454(bArrMarshall);
        }
        try {
            new RunnableC10400(abstractC17043M44069, c11996M45308, f53399).m24095();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    private void m40654() {
        InterfaceC20028 interfaceC20028M52575;
        int i = this.f53413;
        if (i != -1) {
            ArrayList arrayList = this.f53408;
            if (i >= arrayList.size() || (interfaceC20028M52575 = ((C23631) arrayList.get(this.f53413)).m52575()) == null) {
                return;
            }
            interfaceC20028M52575.mo11541();
            this.f53418.m31795((Runnable) new RunnableC5924(interfaceC20028M52575));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ֫ */
    public void m40656() {
        C11996 c11996 = new C11996(4);
        c11996.writeInt(this.f53413);
        AbstractC17043 abstractC17043M44067 = C19335.m44067();
        Object obj = f53398;
        C4081.m8188(new RunnableC10400(abstractC17043M44067, c11996, obj), obj, 200L);
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
    /* JADX INFO: renamed from: ܽ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m40652() throws Throwable {
        Exception e;
        ?? M44067;
        try {
            M44067 = C19335.m44067();
            try {
                synchronized (f53398) {
                    try {
                        int i = M44067.mo25094() ? M44067.m38686().readInt() : -1;
                    } catch (Throwable th) {
                        th = th;
                        M44067 = -1;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                M44067 = M44067;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                this.f53419.m48823((Throwable) e);
                ?? r1 = M44067;
                if (this.f53408.isEmpty()) {
                    return -1;
                }
                if (r1 < 0 || r1 >= this.f53408.size()) {
                    return 0;
                }
                return r1 == true ? 1 : 0;
            }
        } catch (Exception e3) {
            e = e3;
            M44067 = -1;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m40650(ActivityC17874 activityC17874, int i) {
        int iM40626;
        ArrayList arrayList = activityC17874.f53408;
        if (i == -1 || i >= arrayList.size()) {
            return;
        }
        C23631 c23631 = (C23631) arrayList.get(i);
        if (c23631.m7642()) {
            iM40626 = activityC17874.m40626(0, false);
            Bundle bundleRequireArguments = c23631.requireArguments();
            C12826.requireNonNull(bundleRequireArguments);
            bundleRequireArguments.putBoolean("top", false);
            while (iM40626 < arrayList.size() && ((C23631) arrayList.get(iM40626)).m7642()) {
                iM40626++;
            }
        } else {
            int iM40627 = activityC17874.m40626(0, true);
            Bundle bundleRequireArguments2 = c23631.requireArguments();
            C12826.requireNonNull(bundleRequireArguments2);
            bundleRequireArguments2.putBoolean("top", true);
            c23631.m52572();
            iM40626 = iM40627;
        }
        if (i != iM40626) {
            C23631 c23632 = (C23631) arrayList.get(activityC17874.f53413);
            if (i < iM40626) {
                iM40626--;
            }
            arrayList.remove(i);
            arrayList.add(iM40626, c23631);
            activityC17874.f53413 = arrayList.indexOf(c23632);
            activityC17874.m40656();
            activityC17874.m40638();
        }
        activityC17874.m40647();
        activityC17874.f53414.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public static boolean m40645() {
        return ApplicationC21448.f67649.getBoolean("axml_id_2_name", true);
    }
}
