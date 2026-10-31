package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6604 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static String f20334;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20335 = 0;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C23537 f20336;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ListView f20337;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC15069 f20338;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C12609 f20339;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC20010 f20340;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "ArscEditor";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20336 = (C23537) new C4741(this).m13885(C23537.class);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C23328 c23328 = new C23328(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c23328);
        m10214();
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        this.f10584 = (C9762) m10241(R.id.MT_Protector);
        ListView listView = (ListView) m10241(android.R.id.list);
        this.f20337 = listView;
        listView.setFastScrollEnabled(true);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC15566(0, this));
        this.f20338 = new ViewOnClickListenerC15069(this);
        this.f20340 = new ViewOnClickListenerC20010(this);
        if (this.f20336.f75570) {
            m18111();
        } else {
            if (C16999.m39873((AbstractActivityC3346) this)) {
                return;
            }
            new C14155(this).m20274();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public void m18111() {
        C19096 c19096 = new C19096(this);
        ListView listView = this.f20337;
        C12609 c12609 = new C12609(c19096);
        this.f20339 = c12609;
        listView.setAdapter((ListAdapter) c12609);
        this.f20337.setOnScrollListener(new C7806(this));
        this.f20339.m14112(this.f20337);
        this.f20339.m10504(true);
        this.f20339.m10506();
        this.f20337.setOnItemClickListener(this);
        this.f20337.setOnItemLongClickListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        switch (C12040.f36026[this.f20336.m52000().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C23537 c23537 = this.f20336;
                if (c23537.f75580) {
                    i = c23537.f75571[i];
                }
                c23537.f75576 = c23537.f75566.getValue(i);
                C21282 c21282 = new C21282(this, view, 0);
                c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c21282.m48302(new InterfaceC14930() { // from class: l.֨᩻ᩳ
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC6604.f20335;
                        if (menuItem.getItemId() == R.string.MT_Protector) {
                            final ActivityC6604 activityC6604 = this.f5202;
                            C23537 c23538 = activityC6604.f20336;
                            String strM30772 = c23538.f75569.m30772(c23538.f75576.mo5006());
                            int i3 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(activityC6604);
                            c19258.m44433(R.string.MT_Protector);
                            c19258.m44424(activityC6604.getString(R.string.MT_Protector, strM30772));
                            final int i4 = i;
                            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC6604 activityC6605 = activityC6604;
                                    activityC6605.f20336.f75566.m43651(i4);
                                    activityC6605.f20336.f75576 = null;
                                    activityC6605.f20339.notifyDataSetChanged();
                                    activityC6605.f20336.f75587 = true;
                                }
                            });
                            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c19258.m44438();
                        }
                        return true;
                    }
                });
                C18342.m42767(view, c21282);
                return true;
            case 4:
            default:
                return false;
            case 5:
            case 8:
            case 9:
                final EnumC4487 enumC4487M52000 = this.f20336.m52000();
                if (enumC4487M52000 == EnumC4487.CONFIG) {
                    C23537 c23538 = this.f20336;
                    c23538.f75566 = (C18906) c23538.f75579.get(c23538.f75588 ? c23538.f75582[i] : i);
                } else if (enumC4487M52000 == EnumC4487.SEARCH_BY_ID) {
                    m18110((C18906) this.f20336.f75572.get(i));
                } else if (enumC4487M52000 == EnumC4487.SEARCH_VALUE) {
                    m18110(((C5193) this.f20336.f75573.get(i)).f16276);
                } else {
                    throw new IllegalStateException(enumC4487M52000.name());
                }
                C21282 c21283 = new C21282(this, view, 0);
                if (enumC4487M52000 != EnumC4487.SEARCH_BY_ID) {
                    c21283.m48304().add(0, R.string.menu_copy_id, 0, R.string.menu_copy_id);
                }
                c21283.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c21283.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c21283.m48302(new InterfaceC14930() { // from class: l.᩵᩻ᩳ
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC6604.f20335;
                        int itemId = menuItem.getItemId();
                        final ActivityC6604 activityC6604 = this.f63956;
                        if (itemId == R.string.menu_copy_id) {
                            C4925.m14308(R.string.MT_Protector, activityC6604.f20336.f75566.mo47886());
                        } else if (itemId == R.string.MT_Protector) {
                            activityC6604.f20338.m35670();
                        } else if (itemId == R.string.MT_Protector) {
                            int i3 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(activityC6604);
                            c19258.m44433(R.string.MT_Protector);
                            c19258.m44424(activityC6604.getString(R.string.MT_Protector, activityC6604.f20336.f75566.mo29406()));
                            final EnumC4487 enumC4487 = enumC4487M52000;
                            final int i4 = i;
                            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC6604 activityC6605 = activityC6604;
                                    C23537 c23539 = activityC6605.f20336;
                                    c23539.f75568.m8399(c23539.f75566.mo47883());
                                    EnumC4487 enumC4488 = EnumC4487.CONFIG;
                                    EnumC4487 enumC4489 = enumC4487;
                                    int i6 = i4;
                                    if (enumC4489 == enumC4488) {
                                        C23537 c235310 = activityC6605.f20336;
                                        if (c235310.f75588) {
                                            c235310.f75584--;
                                            while (true) {
                                                C23537 c235311 = activityC6605.f20336;
                                                if (i6 >= c235311.f75584) {
                                                    break;
                                                }
                                                int[] iArr = c235311.f75582;
                                                int i7 = i6 + 1;
                                                iArr[i6] = iArr[i7] - 1;
                                                i6 = i7;
                                            }
                                        }
                                        activityC6605.f20336.m51999();
                                    } else if (enumC4489 == EnumC4487.SEARCH_BY_ID) {
                                        activityC6605.f20336.f75572.remove(i6);
                                    } else if (enumC4489 == EnumC4487.SEARCH_VALUE) {
                                        activityC6605.f20336.f75573.remove(i6);
                                    } else {
                                        throw new IllegalStateException(enumC4489.name());
                                    }
                                    activityC6605.f20336.f75566 = null;
                                    activityC6605.f20339.notifyDataSetChanged();
                                    activityC6605.f20336.f75587 = true;
                                }
                            });
                            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c19258.m44438();
                        }
                        return true;
                    }
                });
                C18342.m42767(view, c21283);
                return true;
            case 6:
                if (i >= 3) {
                    C23537 c23539 = this.f20336;
                    c23539.f75577 = c23539.f75578.mo14957(i - 3);
                    C10838 c10838 = new C10838(this, this);
                    c10838.m31258(R.string.MT_Protector);
                    c10838.m31250((CharSequence) this.f20336.f75577.getPackageName());
                    c10838.m31279(6);
                    c10838.m31281();
                    c10838.m31266(true);
                    return true;
                }
                return false;
            case 7:
                C23537 c235310 = this.f20336;
                c235310.f75568 = c235310.f75574.mo2877(i);
                this.f20336.m51999();
                C21282 c21284 = new C21282(this, view, 0);
                c21284.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                if (this.f20336.f75574.mo2871() > 1) {
                    c21284.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                c21284.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c21284.m48302(new InterfaceC14930() { // from class: l.᩸᩻ᩳ
                    @Override // l.InterfaceC14930
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC6604.f20335;
                        int itemId = menuItem.getItemId();
                        final ActivityC6604 activityC6604 = this.f70172;
                        if (itemId == R.string.MT_Protector) {
                            C16481 c16481 = new C16481(activityC6604, activityC6604);
                            c16481.m31258(R.string.MT_Protector);
                            c16481.m31250((CharSequence) activityC6604.f20336.f75568.mo18742());
                            c16481.m31244();
                            c16481.m31279(6);
                            c16481.m31281();
                            c16481.m31266(true);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            int i3 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(activityC6604);
                            c19258.m44433(R.string.MT_Protector);
                            c19258.m44424(activityC6604.getString(R.string.MT_Protector, activityC6604.f20336.f75568.mo18744()));
                            final int i4 = i;
                            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC6604 activityC6605 = activityC6604;
                                    activityC6605.f20336.f75574.m46626(i4);
                                    C23537 c235311 = activityC6605.f20336;
                                    c235311.f75568 = null;
                                    c235311.f75579.clear();
                                    activityC6605.f20339.notifyDataSetChanged();
                                    activityC6605.f20336.f75587 = true;
                                }
                            });
                            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c19258.m44438();
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            C17893 c17893 = new C17893(activityC6604, activityC6604);
                            c17893.m31258(R.string.MT_Protector);
                            c17893.m31250((CharSequence) activityC6604.f20336.f75568.mo18742());
                            c17893.m31244();
                            c17893.m31279(6);
                            c17893.m31242();
                            c17893.m31266(true);
                        }
                        return true;
                    }
                });
                C18342.m42767(view, c21284);
                return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18110(C18906 c18906) {
        C23537 c23537 = this.f20336;
        c23537.f75566 = c18906;
        c23537.f75568 = c18906.mo29410();
        C23537 c23538 = this.f20336;
        c23538.f75574 = c23538.f75568.getType();
        C23537 c23539 = this.f20336;
        c23539.f75577 = c23539.f75574.m46616();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (C12040.f36026[this.f20336.m52000().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C23537 c23537 = this.f20336;
                if (c23537.f75580) {
                    i = c23537.f75571[i];
                }
                c23537.f75576 = c23537.f75566.getValue(i);
                this.f20340.m46148();
                break;
            case 4:
                C17187 c17187 = new C17187(this, this);
                c17187.m31258(R.string.MT_Protector);
                c17187.m31270();
                C23537 c23538 = this.f20336;
                C13260 c13260 = c23538.f75567;
                if (c23538.f75588) {
                    i = c23538.f75582[i];
                }
                c23538.f75565 = i;
                c17187.m31250((CharSequence) c13260.m47858(i));
                c17187.m31242();
                c17187.m31266(true);
                break;
            case 5:
                if (!this.f20336.f75574.getTypeName().equals("id")) {
                    C23537 c23539 = this.f20336;
                    ArrayList arrayList = c23539.f75579;
                    if (c23539.f75588) {
                        i = c23539.f75582[i];
                    }
                    c23539.f75566 = (C18906) arrayList.get(i);
                    if (this.f20336.f75566.mo29412()) {
                        setTitle(this.f20336.f75568.mo18744() + '/' + this.f20336.f75566.mo29406());
                        m18107(EnumC4487.ENTRY);
                    } else {
                        C23537 c235310 = this.f20336;
                        c235310.f75576 = c235310.f75566.getValue();
                        this.f20340.m46148();
                    }
                }
                break;
            case 6:
                if (i == 0) {
                    m10241(R.string.MT_Protector);
                    m18107(EnumC4487.STRING_POOL);
                } else if (i == 1) {
                    new C14364(this, this).m31332();
                } else if (i != 2) {
                    C23537 c235311 = this.f20336;
                    c235311.f75577 = c235311.f75578.mo14957(i - 3);
                    setTitle(this.f20336.f75577.getPackageName());
                    m18107(EnumC4487.PACKAGE);
                } else {
                    C12745 c12745 = new C12745(this, this);
                    c12745.m31258(R.string.search_by_id);
                    c12745.m31250((CharSequence) f20334);
                    c12745.m31244();
                    c12745.m31279(3);
                    String str = f20334;
                    if (str != null && str.length() > 0) {
                        c12745.m31281();
                    }
                    c12745.m31266(true);
                }
                break;
            case 7:
                C23537 c235312 = this.f20336;
                c235312.f75568 = c235312.f75574.mo2877(i);
                this.f20336.m51999();
                setTitle(this.f20336.f75568.mo18744());
                m18107(EnumC4487.CONFIG);
                break;
            case 8:
                C23537 c235313 = this.f20336;
                c235313.f75566 = (C18906) c235313.f75572.get(i);
                if (this.f20336.f75566.mo29412()) {
                    C23537 c235314 = this.f20336;
                    c235314.f75568 = c235314.f75566.mo29410();
                    this.f20336.m51999();
                    C23537 c235315 = this.f20336;
                    c235315.f75574 = c235315.f75568.getType();
                    setTitle(this.f20336.f75568.mo18744() + '/' + this.f20336.f75566.mo29406());
                    m18107(EnumC4487.SEARCH_BY_ID_IN);
                } else {
                    C23537 c235316 = this.f20336;
                    c235316.f75576 = c235316.f75566.getValue();
                    this.f20340.m46148();
                }
                break;
            case 9:
                m18110(((C5193) this.f20336.f75573.get(i)).f16276);
                if (this.f20336.f75566.mo29412()) {
                    setTitle(this.f20336.f75568.mo18744() + "/" + this.f20336.f75566.mo29406());
                    m18107(EnumC4487.SEARCH_VALUE_IN);
                } else {
                    C23537 c235317 = this.f20336;
                    c235317.f75576 = c235317.f75566.getValue();
                    this.f20340.m46148();
                }
                break;
            case 10:
                C23537 c235318 = this.f20336;
                c235318.f75574 = c235318.f75577.getType(i);
                if (this.f20336.f75574.mo2871() == 1 && this.f20336.f75574.getTypeName().equals("id")) {
                    C23537 c235319 = this.f20336;
                    c235319.f75568 = c235319.f75574.mo2877(0);
                    this.f20336.m51999();
                    setTitle(this.f20336.f75568.mo18744());
                    m18107(EnumC4487.CONFIG);
                } else {
                    setTitle(this.f20336.f75574.getTypeName());
                    m18107(EnumC4487.TYPE);
                }
                break;
        }
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        m18114();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m18114() {
        if (this.f20336.f75587) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ᩻ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC6604.f20335;
                    new C10629(this.f15702, true).m20274();
                }
            });
            c19258.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC3573(0, this));
            c19258.m44438();
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m18117() {
        C23537 c23537 = this.f20336;
        C8322 c8322 = c23537.f75577;
        C20317 c20317 = c23537.f75574;
        C2678 c2678 = c23537.f75568;
        C18906 c18906 = c23537.f75566;
        switch (C12040.f36026[c23537.m52000().ordinal()]) {
            case 1:
                C23537 c23538 = this.f20336;
                if (c23538.f75580) {
                    c23538.f75580 = false;
                    this.f20339.notifyDataSetChanged();
                    setTitle(c2678.mo18744() + '/' + c18906.mo29406());
                } else {
                    setTitle(c23538.f75588 ? getString(R.string.MT_Protector, c23538.f75583) : c2678.mo18744());
                    m18107(EnumC4487.CONFIG);
                }
                break;
            case 2:
                C23537 c23539 = this.f20336;
                if (c23539.f75580) {
                    c23539.f75580 = false;
                    this.f20339.notifyDataSetChanged();
                    setTitle(c2678.mo18744() + '/' + c18906.mo29406());
                } else {
                    setTitle(f20334);
                    m18107(EnumC4487.SEARCH_BY_ID);
                }
                break;
            case 3:
                C23537 c235310 = this.f20336;
                if (c235310.f75580) {
                    c235310.f75580 = false;
                    this.f20339.notifyDataSetChanged();
                    setTitle(c2678.mo18744() + "/" + c18906.mo29406());
                } else {
                    setTitle(c235310.f75581);
                    m18107(EnumC4487.SEARCH_VALUE);
                }
                break;
            case 4:
                C23537 c235311 = this.f20336;
                if (c235311.f75588) {
                    c235311.f75588 = false;
                    this.f20339.notifyDataSetChanged();
                    m10241(R.string.MT_Protector);
                } else {
                    m10241(R.string.MT_Protector);
                    m18107(EnumC4487.MAIN);
                }
                break;
            case 5:
                C23537 c235312 = this.f20336;
                if (c235312.f75588) {
                    c235312.f75588 = false;
                    this.f20339.notifyDataSetChanged();
                    setTitle(c2678.mo18744());
                } else if (c20317.mo2871() == 1 && c20317.getTypeName().equals("id")) {
                    setTitle(c8322.getPackageName());
                    m18107(EnumC4487.PACKAGE);
                } else {
                    setTitle(c20317.getTypeName());
                    m18107(EnumC4487.TYPE);
                }
                break;
            case 6:
                m18114();
                break;
            case 7:
                setTitle(c8322.getPackageName());
                m18107(EnumC4487.PACKAGE);
                break;
            case 8:
            case 9:
                this.f20336.f75573.clear();
                this.f20336.f75572.clear();
                m10241(R.string.MT_Protector);
                m18107(EnumC4487.MAIN);
                break;
            case 10:
                m10241(R.string.MT_Protector);
                m18107(EnumC4487.MAIN);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        int itemId = menuItem.getItemId();
        int iMo29409 = 0;
        if (itemId == R.id.MT_Protector) {
            new C10629(this, false).m20274();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m18114();
            return true;
        }
        byte b = 2;
        if (itemId == R.id.MT_Protector) {
            int i = C12040.f36026[this.f20336.m52000().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                z = this.f20336.f75580;
            } else {
                z = this.f20336.f75588;
            }
            new C1665(this, this, z).m40707();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            final C20317 c20317 = this.f20336.f75574;
            int iMo2871 = c20317.mo2871();
            String[] strArr = new String[iMo2871];
            final boolean[] zArr = new boolean[iMo2871];
            while (iMo29409 < iMo2871) {
                strArr[iMo29409] = c20317.mo2877(iMo29409).mo18744();
                iMo29409++;
            }
            View viewM10216 = m10216(R.layout.MT_Protector);
            ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
            C4915.m14284(listView);
            listView.setDivider(null);
            ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            final C20438 c20438 = new C20438(this, zArr, strArr);
            listView.setAdapter((ListAdapter) c20438);
            listView.setOnItemClickListener(c20438);
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44421(viewM10216);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩻ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    int i4 = ActivityC6604.f20335;
                    ActivityC6604 activityC6604 = this.f73073;
                    activityC6604.getClass();
                    boolean[] zArr2 = zArr;
                    boolean z2 = false;
                    for (int length = zArr2.length - 1; length >= 0; length--) {
                        if (zArr2[length]) {
                            c20317.m46626(length);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        activityC6604.f20339.notifyDataSetChanged();
                        activityC6604.f20336.f75587 = true;
                    }
                }
            });
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44438().m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩶᩻ᩳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = ActivityC6604.f20335;
                    int i4 = 0;
                    while (true) {
                        boolean[] zArr2 = zArr;
                        if (i4 >= zArr2.length) {
                            c20438.notifyDataSetChanged();
                            return;
                        } else {
                            zArr2[i4] = !zArr2[i4];
                            i4++;
                        }
                    }
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C6395(this, this);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        int i3 = C12040.f36026[this.f20336.m52000().ordinal()];
        if (i3 != 1) {
            if (i3 == 5) {
                C0253.m1520(this);
                return true;
            }
            if (i3 != 7) {
                return true;
            }
            C18599 c18599 = new C18599(this, this);
            c18599.m31258(R.string.MT_Protector);
            Locale locale = Locale.getDefault();
            c18599.m31265("-" + locale.getLanguage() + "-r" + locale.getCountry());
            c18599.m31244();
            c18599.m31279(6);
            c18599.m31266(true);
            return true;
        }
        String typeName = this.f20336.f75574.getTypeName();
        typeName.getClass();
        switch (typeName.hashCode()) {
            case -475309713:
                if (!typeName.equals("plurals")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3004913:
                if (!typeName.equals("attr")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 93090393:
                if (!typeName.equals("array")) {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        String str = "Text";
        int i4 = 4;
        switch (b) {
            case 0:
                i4 = 0;
                break;
            case 1:
                iMo29409 = 16777216;
                str = "1";
                break;
            case 2:
                iMo29409 = 33554432 + this.f20336.f75566.mo29409();
                i4 = 0;
                break;
            default:
                str = "1";
                break;
        }
        this.f20340.m46149(str, iMo29409, i4, true);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        C11003.requireNonNull(subMenu);
        final MenuItem menuItemFindItem = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem3 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem4 = subMenu.findItem(R.id.MT_Protector);
        this.f20336.f75585.m1668(this, new InterfaceC1008() { // from class: l.۠᩻ᩳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                EnumC4487 enumC4487 = (EnumC4487) obj;
                int i = ActivityC6604.f20335;
                EnumC4487 enumC4488 = EnumC4487.STRING_POOL;
                menuItemFindItem2.setVisible(enumC4487 == enumC4488);
                menuItemFindItem.setVisible(enumC4487 == enumC4488 || enumC4487 == EnumC4487.CONFIG || enumC4487 == EnumC4487.ENTRY || enumC4487 == EnumC4487.SEARCH_VALUE_IN || enumC4487 == EnumC4487.SEARCH_BY_ID_IN);
                EnumC4487 enumC4489 = EnumC4487.TYPE;
                menuItemFindItem3.setVisible(enumC4487 == enumC4489 || enumC4487 == EnumC4487.CONFIG || enumC4487 == EnumC4487.ENTRY);
                menuItemFindItem4.setVisible(enumC4487 == enumC4489);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m18107(EnumC4487 enumC4487) {
        EnumC4487 enumC4487M52000 = this.f20336.m52000();
        this.f20336.f75586[enumC4487M52000.ordinal()] = this.f20337.getFirstVisiblePosition();
        this.f20336.f75585.mo1669(enumC4487);
        this.f20339.m10504(true);
        this.f20339.m10506();
        this.f20339.notifyDataSetChanged();
        if (enumC4487M52000 == EnumC4487.SEARCH_VALUE || enumC4487M52000 == EnumC4487.SEARCH_VALUE_IN || enumC4487M52000 == EnumC4487.SEARCH_BY_ID || enumC4487M52000 == EnumC4487.SEARCH_BY_ID_IN) {
            return;
        }
        this.f20337.setSelection(this.f20336.f75586[enumC4487.ordinal()]);
    }
}
