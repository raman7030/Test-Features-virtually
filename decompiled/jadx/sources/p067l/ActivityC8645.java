package p067l;

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
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC8645 extends AbstractActivityC5549 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۢۧ */
    public static String f23211;

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final /* synthetic */ int f23212 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public C24738 f23213;

    /* JADX INFO: renamed from: ܳۧ */
    public ListView f23214;

    /* JADX INFO: renamed from: ܿۧ */
    public ViewOnClickListenerC16690 f23215;

    /* JADX INFO: renamed from: ᩳۧ */
    public C14352 f23216;

    /* JADX INFO: renamed from: ᩻ۧ */
    public ViewOnClickListenerC21386 f23217;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "ArscEditor";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23213 = (C24738) new C6874(this).m15765(C24738.class);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C24540 c24540 = new C24540(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c24540);
        m12250();
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        this.f13392 = (C1326) m12277(R.id.MT_Protector);
        ListView listView = (ListView) m12277(android.R.id.list);
        this.f23214 = listView;
        listView.setFastScrollEnabled(true);
        m12263(this.f13392);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC17163(0, this));
        this.f23215 = new ViewOnClickListenerC16690(this);
        this.f23217 = new ViewOnClickListenerC21386(this);
        if (this.f23213.f78316) {
            m20063();
        } else {
            if (C18524.m42116((AbstractActivityC5549) this)) {
                return;
            }
            new C15822(this).m22250();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟ */
    public void m20063() {
        C20518 c20518 = new C20518(this);
        ListView listView = this.f23214;
        C14352 c14352 = new C14352(c20518);
        this.f23216 = c14352;
        listView.setAdapter((ListAdapter) c14352);
        this.f23214.setOnScrollListener(new C9788(this));
        this.f23216.m15992(this.f23214);
        this.f23216.m12528(true);
        this.f23216.m12530();
        this.f23214.setOnItemClickListener(this);
        this.f23214.setOnItemLongClickListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        switch (C13812.f39037[this.f23213.m54402().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C24738 c24738 = this.f23213;
                if (c24738.f78326) {
                    i = c24738.f78317[i];
                }
                c24738.f78322 = c24738.f78312.getValue(i);
                C1898 c1898 = new C1898(this, view, 0);
                c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c1898.m50636(new InterfaceC1583() { // from class: l.֨᩻ᩳ
                    @Override // p067l.InterfaceC1583
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC8645.f23212;
                        if (menuItem.getItemId() == R.string.MT_Protector) {
                            final ActivityC8645 activityC8645 = this.f7975;
                            C24738 c24739 = activityC8645.f23213;
                            String strM32844 = c24739.f78315.m32844(c24739.f78322.mo7249());
                            int i3 = DialogInterfaceC2564.f4230;
                            C20671 c20671 = new C20671(activityC8645);
                            c20671.m46727(R.string.MT_Protector);
                            c20671.m46718(activityC8645.getString(R.string.MT_Protector, strM32844));
                            final int i4 = i;
                            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC8645 activityC8646 = activityC8645;
                                    activityC8646.f23213.f78312.m45917(i4);
                                    activityC8646.f23213.f78322 = null;
                                    activityC8646.f23216.notifyDataSetChanged();
                                    activityC8646.f23213.f78333 = true;
                                }
                            });
                            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c20671.m46732();
                        }
                        return true;
                    }
                });
                C19801.m45029(view, c1898);
                return true;
            case 4:
            default:
                return false;
            case 5:
            case 8:
            case 9:
                final EnumC6633 enumC6633M54402 = this.f23213.m54402();
                if (enumC6633M54402 == EnumC6633.CONFIG) {
                    C24738 c24739 = this.f23213;
                    c24739.f78312 = (C20337) c24739.f78325.get(c24739.f78334 ? c24739.f78328[i] : i);
                } else if (enumC6633M54402 == EnumC6633.SEARCH_BY_ID) {
                    m20062((C20337) this.f23213.f78318.get(i));
                } else if (enumC6633M54402 == EnumC6633.SEARCH_VALUE) {
                    m20062(((C7304) this.f23213.f78319.get(i)).f19117);
                } else {
                    throw new IllegalStateException(enumC6633M54402.name());
                }
                C1898 c1899 = new C1898(this, view, 0);
                if (enumC6633M54402 != EnumC6633.SEARCH_BY_ID) {
                    c1899.m50638().add(0, R.string.menu_copy_id, 0, R.string.menu_copy_id);
                }
                c1899.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c1899.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c1899.m50636(new InterfaceC1583() { // from class: l.᩵᩻ᩳ
                    @Override // p067l.InterfaceC1583
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC8645.f23212;
                        int itemId = menuItem.getItemId();
                        final ActivityC8645 activityC8645 = this.f66593;
                        if (itemId == R.string.menu_copy_id) {
                            C7050.m16205(R.string.MT_Protector, activityC8645.f23213.f78312.mo50216());
                        } else if (itemId == R.string.MT_Protector) {
                            activityC8645.f23215.m37828();
                        } else if (itemId == R.string.MT_Protector) {
                            int i3 = DialogInterfaceC2564.f4230;
                            C20671 c20671 = new C20671(activityC8645);
                            c20671.m46727(R.string.MT_Protector);
                            c20671.m46718(activityC8645.getString(R.string.MT_Protector, activityC8645.f23213.f78312.mo31468()));
                            final EnumC6633 enumC6633 = enumC6633M54402;
                            final int i4 = i;
                            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚ᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC8645 activityC8646 = activityC8645;
                                    C24738 c247310 = activityC8646.f23213;
                                    c247310.f78314.m10445(c247310.f78312.mo50213());
                                    EnumC6633 enumC6634 = EnumC6633.CONFIG;
                                    EnumC6633 enumC6635 = enumC6633;
                                    int i6 = i4;
                                    if (enumC6635 == enumC6634) {
                                        C24738 c247311 = activityC8646.f23213;
                                        if (c247311.f78334) {
                                            c247311.f78330--;
                                            while (true) {
                                                C24738 c247312 = activityC8646.f23213;
                                                if (i6 >= c247312.f78330) {
                                                    break;
                                                }
                                                int[] iArr = c247312.f78328;
                                                int i7 = i6 + 1;
                                                iArr[i6] = iArr[i7] - 1;
                                                i6 = i7;
                                            }
                                        }
                                        activityC8646.f23213.m54401();
                                    } else if (enumC6635 == EnumC6633.SEARCH_BY_ID) {
                                        activityC8646.f23213.f78318.remove(i6);
                                    } else if (enumC6635 == EnumC6633.SEARCH_VALUE) {
                                        activityC8646.f23213.f78319.remove(i6);
                                    } else {
                                        throw new IllegalStateException(enumC6635.name());
                                    }
                                    activityC8646.f23213.f78312 = null;
                                    activityC8646.f23216.notifyDataSetChanged();
                                    activityC8646.f23213.f78333 = true;
                                }
                            });
                            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c20671.m46732();
                        }
                        return true;
                    }
                });
                C19801.m45029(view, c1899);
                return true;
            case 6:
                if (i >= 3) {
                    C24738 c247310 = this.f23213;
                    c247310.f78323 = c247310.f78324.mo16867(i - 3);
                    C12669 c12669 = new C12669(this, this);
                    c12669.m33344(R.string.MT_Protector);
                    c12669.m33336((CharSequence) this.f23213.f78323.getPackageName());
                    c12669.m33365(6);
                    c12669.m33367();
                    c12669.m33352(true);
                    return true;
                }
                return false;
            case 7:
                C24738 c247311 = this.f23213;
                c247311.f78314 = c247311.f78320.mo5206(i);
                this.f23213.m54401();
                C1898 c18910 = new C1898(this, view, 0);
                c18910.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                if (this.f23213.f78320.mo5200() > 1) {
                    c18910.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                }
                c18910.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c18910.m50636(new InterfaceC1583() { // from class: l.᩸᩻ᩳ
                    @Override // p067l.InterfaceC1583
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i2 = ActivityC8645.f23212;
                        int itemId = menuItem.getItemId();
                        final ActivityC8645 activityC8645 = this.f72886;
                        if (itemId == R.string.MT_Protector) {
                            C18032 c18032 = new C18032(activityC8645, activityC8645);
                            c18032.m33344(R.string.MT_Protector);
                            c18032.m33336((CharSequence) activityC8645.f23213.f78314.mo20692());
                            c18032.m33330();
                            c18032.m33365(6);
                            c18032.m33367();
                            c18032.m33352(true);
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            int i3 = DialogInterfaceC2564.f4230;
                            C20671 c20671 = new C20671(activityC8645);
                            c20671.m46727(R.string.MT_Protector);
                            c20671.m46718(activityC8645.getString(R.string.MT_Protector, activityC8645.f23213.f78314.mo20694()));
                            final int i4 = i;
                            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬᩻ᩳ
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i5) {
                                    ActivityC8645 activityC8646 = activityC8645;
                                    activityC8646.f23213.f78320.m48949(i4);
                                    C24738 c247312 = activityC8646.f23213;
                                    c247312.f78314 = null;
                                    c247312.f78325.clear();
                                    activityC8646.f23216.notifyDataSetChanged();
                                    activityC8646.f23213.f78333 = true;
                                }
                            });
                            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c20671.m46732();
                            return true;
                        }
                        if (itemId == R.string.MT_Protector) {
                            C19374 c19374 = new C19374(activityC8645, activityC8645);
                            c19374.m33344(R.string.MT_Protector);
                            c19374.m33336((CharSequence) activityC8645.f23213.f78314.mo20692());
                            c19374.m33330();
                            c19374.m33365(6);
                            c19374.m33328();
                            c19374.m33352(true);
                        }
                        return true;
                    }
                });
                C19801.m45029(view, c18910);
                return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20062(C20337 c20337) {
        C24738 c24738 = this.f23213;
        c24738.f78312 = c20337;
        c24738.f78314 = c20337.mo31472();
        C24738 c24739 = this.f23213;
        c24739.f78320 = c24739.f78314.getType();
        C24738 c247310 = this.f23213;
        c247310.f78323 = c247310.f78320.m48939();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (C13812.f39037[this.f23213.m54402().ordinal()]) {
            case 1:
            case 2:
            case 3:
                C24738 c24738 = this.f23213;
                if (c24738.f78326) {
                    i = c24738.f78317[i];
                }
                c24738.f78322 = c24738.f78312.getValue(i);
                this.f23217.m48463();
                break;
            case 4:
                C18703 c18703 = new C18703(this, this);
                c18703.m33344(R.string.MT_Protector);
                c18703.m33356();
                C24738 c24739 = this.f23213;
                C14971 c14971 = c24739.f78313;
                if (c24739.f78334) {
                    i = c24739.f78328[i];
                }
                c24739.f78311 = i;
                c18703.m33336((CharSequence) c14971.m50188(i));
                c18703.m33328();
                c18703.m33352(true);
                break;
            case 5:
                if (!this.f23213.f78320.getTypeName().equals("id")) {
                    C24738 c247310 = this.f23213;
                    ArrayList arrayList = c247310.f78325;
                    if (c247310.f78334) {
                        i = c247310.f78328[i];
                    }
                    c247310.f78312 = (C20337) arrayList.get(i);
                    if (this.f23213.f78312.mo31474()) {
                        setTitle(this.f23213.f78314.mo20694() + '/' + this.f23213.f78312.mo31468());
                        m20059(EnumC6633.ENTRY);
                    } else {
                        C24738 c247311 = this.f23213;
                        c247311.f78322 = c247311.f78312.getValue();
                        this.f23217.m48463();
                    }
                }
                break;
            case 6:
                if (i == 0) {
                    m12277(R.string.MT_Protector);
                    m20059(EnumC6633.STRING_POOL);
                } else if (i == 1) {
                    new C16020(this, this).m33418();
                } else if (i != 2) {
                    C24738 c247312 = this.f23213;
                    c247312.f78323 = c247312.f78324.mo16867(i - 3);
                    setTitle(this.f23213.f78323.getPackageName());
                    m20059(EnumC6633.PACKAGE);
                } else {
                    C14482 c14482 = new C14482(this, this);
                    c14482.m33344(R.string.search_by_id);
                    c14482.m33336((CharSequence) f23211);
                    c14482.m33330();
                    c14482.m33365(3);
                    String str = f23211;
                    if (str != null && str.length() > 0) {
                        c14482.m33367();
                    }
                    c14482.m33352(true);
                }
                break;
            case 7:
                C24738 c247313 = this.f23213;
                c247313.f78314 = c247313.f78320.mo5206(i);
                this.f23213.m54401();
                setTitle(this.f23213.f78314.mo20694());
                m20059(EnumC6633.CONFIG);
                break;
            case 8:
                C24738 c247314 = this.f23213;
                c247314.f78312 = (C20337) c247314.f78318.get(i);
                if (this.f23213.f78312.mo31474()) {
                    C24738 c247315 = this.f23213;
                    c247315.f78314 = c247315.f78312.mo31472();
                    this.f23213.m54401();
                    C24738 c247316 = this.f23213;
                    c247316.f78320 = c247316.f78314.getType();
                    setTitle(this.f23213.f78314.mo20694() + '/' + this.f23213.f78312.mo31468());
                    m20059(EnumC6633.SEARCH_BY_ID_IN);
                } else {
                    C24738 c247317 = this.f23213;
                    c247317.f78322 = c247317.f78312.getValue();
                    this.f23217.m48463();
                }
                break;
            case 9:
                m20062(((C7304) this.f23213.f78319.get(i)).f19117);
                if (this.f23213.f78312.mo31474()) {
                    setTitle(this.f23213.f78314.mo20694() + "/" + this.f23213.f78312.mo31468());
                    m20059(EnumC6633.SEARCH_VALUE_IN);
                } else {
                    C24738 c247318 = this.f23213;
                    c247318.f78322 = c247318.f78312.getValue();
                    this.f23217.m48463();
                }
                break;
            case 10:
                C24738 c247319 = this.f23213;
                c247319.f78320 = c247319.f78323.getType(i);
                if (this.f23213.f78320.mo5200() == 1 && this.f23213.f78320.getTypeName().equals("id")) {
                    C24738 c247320 = this.f23213;
                    c247320.f78314 = c247320.f78320.mo5206(0);
                    this.f23213.m54401();
                    setTitle(this.f23213.f78314.mo20694());
                    m20059(EnumC6633.CONFIG);
                } else {
                    setTitle(this.f23213.f78320.getTypeName());
                    m20059(EnumC6633.TYPE);
                }
                break;
        }
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        m20066();
    }

    /* JADX INFO: renamed from: ܰ */
    private void m20066() {
        if (this.f23213.f78333) {
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ᩻ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC8645.f23212;
                    new C12471(this.f18536, true).m22250();
                }
            });
            c20671.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC5765(0, this));
            c20671.m46732();
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ */
    public void m20069() {
        C24738 c24738 = this.f23213;
        C10278 c10278 = c24738.f78323;
        C21678 c21678 = c24738.f78320;
        C4914 c4914 = c24738.f78314;
        C20337 c20337 = c24738.f78312;
        switch (C13812.f39037[c24738.m54402().ordinal()]) {
            case 1:
                C24738 c24739 = this.f23213;
                if (c24739.f78326) {
                    c24739.f78326 = false;
                    this.f23216.notifyDataSetChanged();
                    setTitle(c4914.mo20694() + '/' + c20337.mo31468());
                } else {
                    setTitle(c24739.f78334 ? getString(R.string.MT_Protector, c24739.f78329) : c4914.mo20694());
                    m20059(EnumC6633.CONFIG);
                }
                break;
            case 2:
                C24738 c247310 = this.f23213;
                if (c247310.f78326) {
                    c247310.f78326 = false;
                    this.f23216.notifyDataSetChanged();
                    setTitle(c4914.mo20694() + '/' + c20337.mo31468());
                } else {
                    setTitle(f23211);
                    m20059(EnumC6633.SEARCH_BY_ID);
                }
                break;
            case 3:
                C24738 c247311 = this.f23213;
                if (c247311.f78326) {
                    c247311.f78326 = false;
                    this.f23216.notifyDataSetChanged();
                    setTitle(c4914.mo20694() + "/" + c20337.mo31468());
                } else {
                    setTitle(c247311.f78327);
                    m20059(EnumC6633.SEARCH_VALUE);
                }
                break;
            case 4:
                C24738 c247312 = this.f23213;
                if (c247312.f78334) {
                    c247312.f78334 = false;
                    this.f23216.notifyDataSetChanged();
                    m12277(R.string.MT_Protector);
                } else {
                    m12277(R.string.MT_Protector);
                    m20059(EnumC6633.MAIN);
                }
                break;
            case 5:
                C24738 c247313 = this.f23213;
                if (c247313.f78334) {
                    c247313.f78334 = false;
                    this.f23216.notifyDataSetChanged();
                    setTitle(c4914.mo20694());
                } else if (c21678.mo5200() == 1 && c21678.getTypeName().equals("id")) {
                    setTitle(c10278.getPackageName());
                    m20059(EnumC6633.PACKAGE);
                } else {
                    setTitle(c21678.getTypeName());
                    m20059(EnumC6633.TYPE);
                }
                break;
            case 6:
                m20066();
                break;
            case 7:
                setTitle(c10278.getPackageName());
                m20059(EnumC6633.PACKAGE);
                break;
            case 8:
            case 9:
                this.f23213.f78319.clear();
                this.f23213.f78318.clear();
                m12277(R.string.MT_Protector);
                m20059(EnumC6633.MAIN);
                break;
            case 10:
                m12277(R.string.MT_Protector);
                m20059(EnumC6633.MAIN);
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
        int iMo31471 = 0;
        if (itemId == R.id.MT_Protector) {
            new C12471(this, false).m22250();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m20066();
            return true;
        }
        byte b = 2;
        if (itemId == R.id.MT_Protector) {
            int i = C13812.f39037[this.f23213.m54402().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                z = this.f23213.f78326;
            } else {
                z = this.f23213.f78334;
            }
            new C3951(this, this, z).m42958();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            final C21678 c21678 = this.f23213.f78320;
            int iMo5200 = c21678.mo5200();
            String[] strArr = new String[iMo5200];
            final boolean[] zArr = new boolean[iMo5200];
            while (iMo31471 < iMo5200) {
                strArr[iMo31471] = c21678.mo5206(iMo31471).mo20694();
                iMo31471++;
            }
            View viewM12252 = m12252(R.layout.MT_Protector);
            ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
            C7040.m16181(listView);
            listView.setDivider(null);
            ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
            final C21793 c21793 = new C21793(this, zArr, strArr);
            listView.setAdapter((ListAdapter) c21793);
            listView.setOnItemClickListener(c21793);
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46715(viewM12252);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹᩻ᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    int i4 = ActivityC8645.f23212;
                    ActivityC8645 activityC8645 = this.f75801;
                    activityC8645.getClass();
                    boolean[] zArr2 = zArr;
                    boolean z2 = false;
                    for (int length = zArr2.length - 1; length >= 0; length--) {
                        if (zArr2[length]) {
                            c21678.m48949(length);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        activityC8645.f23216.notifyDataSetChanged();
                        activityC8645.f23213.f78333 = true;
                    }
                }
            });
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732().m3861().setOnClickListener(new View.OnClickListener() { // from class: l.᩶᩻ᩳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = ActivityC8645.f23212;
                    int i4 = 0;
                    while (true) {
                        boolean[] zArr2 = zArr;
                        if (i4 >= zArr2.length) {
                            c21793.notifyDataSetChanged();
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
            new C8447(this, this);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        int i3 = C13812.f39037[this.f23213.m54402().ordinal()];
        if (i3 != 1) {
            if (i3 == 5) {
                C2609.m3918(this);
                return true;
            }
            if (i3 != 7) {
                return true;
            }
            C20045 c20045 = new C20045(this, this);
            c20045.m33344(R.string.MT_Protector);
            Locale locale = Locale.getDefault();
            c20045.m33351("-" + locale.getLanguage() + "-r" + locale.getCountry());
            c20045.m33330();
            c20045.m33365(6);
            c20045.m33352(true);
            return true;
        }
        String typeName = this.f23213.f78320.getTypeName();
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
                iMo31471 = 16777216;
                str = "1";
                break;
            case 2:
                iMo31471 = 33554432 + this.f23213.f78312.mo31471();
                i4 = 0;
                break;
            default:
                str = "1";
                break;
        }
        this.f23217.m48464(str, iMo31471, i4, true);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        C12826.requireNonNull(subMenu);
        final MenuItem menuItemFindItem = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem2 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem3 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem4 = subMenu.findItem(R.id.MT_Protector);
        this.f23213.f78331.m4066(this, new InterfaceC3326() { // from class: l.۠᩻ᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                EnumC6633 enumC6633 = (EnumC6633) obj;
                int i = ActivityC8645.f23212;
                EnumC6633 enumC6634 = EnumC6633.STRING_POOL;
                menuItemFindItem2.setVisible(enumC6633 == enumC6634);
                menuItemFindItem.setVisible(enumC6633 == enumC6634 || enumC6633 == EnumC6633.CONFIG || enumC6633 == EnumC6633.ENTRY || enumC6633 == EnumC6633.SEARCH_VALUE_IN || enumC6633 == EnumC6633.SEARCH_BY_ID_IN);
                EnumC6633 enumC6635 = EnumC6633.TYPE;
                menuItemFindItem3.setVisible(enumC6633 == enumC6635 || enumC6633 == EnumC6633.CONFIG || enumC6633 == EnumC6633.ENTRY);
                menuItemFindItem4.setVisible(enumC6633 == enumC6635);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m20059(EnumC6633 enumC6633) {
        EnumC6633 enumC6633M54402 = this.f23213.m54402();
        this.f23213.f78332[enumC6633M54402.ordinal()] = this.f23214.getFirstVisiblePosition();
        this.f23213.f78331.mo4067(enumC6633);
        this.f23216.m12528(true);
        this.f23216.m12530();
        this.f23216.notifyDataSetChanged();
        if (enumC6633M54402 == EnumC6633.SEARCH_VALUE || enumC6633M54402 == EnumC6633.SEARCH_VALUE_IN || enumC6633M54402 == EnumC6633.SEARCH_BY_ID || enumC6633M54402 == EnumC6633.SEARCH_BY_ID_IN) {
            return;
        }
        this.f23214.setSelection(this.f23213.f78332[enumC6633.ordinal()]);
    }
}
