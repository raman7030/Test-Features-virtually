package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC22429 extends AbstractActivityC5549 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ܺۧ */
    public static boolean f70770;

    /* JADX INFO: renamed from: ۜۧ */
    public ListView f70771;

    /* JADX INFO: renamed from: ܳۧ */
    public AbstractC22606[] f70772;

    /* JADX INFO: renamed from: ܿۧ */
    public MenuItem f70773;

    /* JADX INFO: renamed from: ᩳۧ */
    public C14352 f70774;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C19746 f70775;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C7741 f70776;

    /* JADX INFO: renamed from: ۢۧ */
    public static final Pattern f70769 = Pattern.compile("\\s");

    /* JADX INFO: renamed from: ۡۧ */
    public static final Pattern f70768 = Pattern.compile("\\s|\\(|\\)");

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "DexEditor";
    }

    public ActivityC22429() {
        AbstractC22606 abstractC22606 = C21265.f66862;
        this.f70772 = new AbstractC22606[]{abstractC22606, C21265.f66846, abstractC22606, C21265.f66866, C21265.f66854, C21265.f66864};
        m12278();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f70775 = (C19746) new C6874(this).m15765(C19746.class);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C23159 c23159 = new C23159(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c23159);
        m12250();
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        this.f13392 = (C1326) m12277(R.id.MT_Protector);
        ListView listView = (ListView) m12277(android.R.id.list);
        this.f70771 = listView;
        listView.setFastScrollEnabled(true);
        this.f70771.setOnItemClickListener(this);
        this.f70771.setOnItemLongClickListener(this);
        m12263(this.f13392);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC5054(0, this));
        this.f70776 = C10423.m24117(this, new C6395(0, this));
        C19746 c19746 = this.f70775;
        if (!c19746.f60065) {
            f70770 = false;
            c19746.f60054 = ApplicationC21448.f67649.getBoolean("flatten_package", true);
            if (C18524.m42116((AbstractActivityC5549) this)) {
                return;
            }
            new C21818(this).m22250();
            return;
        }
        ListView listView2 = this.f70771;
        C14352 c14352 = new C14352(new C9747(this));
        this.f70774 = c14352;
        listView2.setAdapter((ListAdapter) c14352);
        this.f70771.setOnScrollListener(new C7065(this));
        this.f70774.m15992(this.f70771);
        this.f70774.m12528(true);
        this.f70774.m12530();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50382(ActivityC22429 activityC22429, int i, Intent intent) {
        if (i == 1) {
            activityC22429.f70775.f60058 = intent.getByteArrayExtra(AbstractC0213e.f989m);
        } else if (i == 2) {
            activityC22429.f70775.f60058 = null;
            activityC22429.m50405();
        } else {
            activityC22429.f70775.f60058 = null;
        }
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        m50390(false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50390(boolean z) {
        if (f70770) {
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢ᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    boolean z2 = ActivityC22429.f70770;
                    new C15111(this.f32871, true).m22250();
                }
            });
            c20671.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC11089(this, 0));
            c20671.m46732();
            return;
        }
        if (z) {
            int i2 = DialogInterfaceC2564.f4230;
            C20671 c20672 = new C20671(this);
            c20672.m46727(R.string.MT_Protector);
            c20672.m46710(R.string.MT_Protector);
            c20672.m46736(R.string.MT_Protector, null);
            c20672.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    boolean z2 = ActivityC22429.f70770;
                    this.f53133.finish();
                }
            });
            c20672.m46732();
            return;
        }
        finish();
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
        final MenuItem menuItemFindItem5 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem6 = subMenu.findItem(R.id.MT_Protector);
        MenuItem menuItemFindItem7 = subMenu.findItem(R.id.MT_Protector);
        this.f70773 = menuItemFindItem7;
        menuItemFindItem7.setChecked(this.f70775.f60054);
        this.f70775.f60048.m4066(this, new InterfaceC3326() { // from class: l.ۜ᩹ܽ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                ActivityC22429.m50383(this.f24612, menuItemFindItem5, menuItemFindItem6, menuItemFindItem4, menuItemFindItem, menuItemFindItem2, menuItemFindItem3, (EnumC9017) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50383(ActivityC22429 activityC22429, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, MenuItem menuItem4, MenuItem menuItem5, MenuItem menuItem6, EnumC9017 enumC9017) {
        EnumC9017 enumC9018 = EnumC9017.STRING_POOL;
        menuItem.setVisible(enumC9017 == enumC9018);
        menuItem2.setVisible(enumC9017 == enumC9018);
        menuItem3.setVisible(enumC9017 == EnumC9017.FIELD_LIST || enumC9017 == EnumC9017.METHOD_LIST);
        activityC22429.f70773.setVisible(enumC9017 == EnumC9017.CLASS_LIST);
        switch (C17122.f50583[enumC9017.ordinal()]) {
            case 1:
            case 2:
                menuItem4.setVisible(true);
                menuItem5.setVisible(true);
                menuItem6.setVisible(true);
                break;
            case 3:
                boolean z = ((C2981) activityC22429.f70775.f60063.peek()).f5264.size() > 0;
                menuItem4.setVisible(z);
                menuItem5.setVisible(z);
                menuItem6.setVisible(z);
                break;
            case 4:
            case 5:
                menuItem4.setVisible(true);
                menuItem5.setVisible(false);
                menuItem6.setVisible(true);
                break;
            case 6:
                boolean z2 = ((C2981) activityC22429.f70775.f60071.peek()).f5264.size() > 0;
                menuItem4.setVisible(z2);
                menuItem5.setVisible(false);
                menuItem6.setVisible(z2);
                break;
            case 7:
            case 8:
                menuItem4.setVisible(false);
                menuItem5.setVisible(false);
                menuItem6.setVisible(false);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            new C15111(this, false).m22250();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m50390(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C14441(this, this, this.f70775.f60047).m42958();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C12430(this, this);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            EnumC9017 enumC9017M44881 = this.f70775.m44881();
            if (enumC9017M44881 == EnumC9017.FIELD_LIST) {
                C18404 c18404 = new C18404(this);
                if (c18404.f54956) {
                    c18404.f54956 = false;
                    c18404.m38415(0).addTextChangedListener(new C4323(c18404));
                    c18404.m38415(2).addTextChangedListener(new C13041(c18404));
                }
                c18404.f54954 = -1;
                c18404.f54952 = true;
                c18404.m38415(0).setText("public");
                c18404.m38415(1).setText("newField");
                c18404.m38415(2).setText("I");
                c18404.m38415(3).setText((CharSequence) null);
                c18404.m38423();
                c18404.m38419().setText(R.string.MT_Protector);
                return true;
            }
            if (enumC9017M44881 == EnumC9017.METHOD_LIST) {
                new C19075(this).m43348();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            int i = C17122.f50583[this.f70775.m44881().ordinal()];
            if (i == 1 || i == 2) {
                new C24499(this, this, false).m46093(false);
                return true;
            }
            if (i == 3) {
                new C24499(this, this, true).m46093(true);
                return true;
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                switch (C17122.f50583[this.f70775.m44881().ordinal()]) {
                    case 1:
                    case 2:
                        new C21148(this, this, false).m40293(false);
                        return true;
                    case 3:
                        new C21148(this, this, true).m40293(true);
                        return true;
                    case 4:
                    case 5:
                        new C3041(this, this, false).m40293(false);
                        return true;
                    case 6:
                        new C3041(this, this, true).m40293(true);
                        return true;
                }
            }
            if (itemId != R.id.MT_Protector) {
                if (itemId != R.id.MT_Protector) {
                    return false;
                }
                C19746 c19746 = this.f70775;
                c19746.f60054 = !c19746.f60054;
                ApplicationC21448.f67649.edit().putBoolean("flatten_package", this.f70775.f60054).apply();
                this.f70773.setChecked(this.f70775.f60054);
                C19746 c19747 = this.f70775;
                c19747.f60064.m37213(c19747.f60049.keySet());
                C19746 c19748 = this.f70775;
                c19748.f60060 = c19748.f60064.f48182;
                this.f70774.notifyDataSetChanged();
                setTitle("/");
                return true;
            }
            switch (C17122.f50583[this.f70775.m44881().ordinal()]) {
                case 1:
                case 2:
                    new C8406(this, this, false).m33417(false);
                    break;
                case 3:
                    new C8406(this, this, true).m33417(true);
                    return true;
                case 4:
                case 5:
                    new C13771(this, this, false).m33417(false);
                    return true;
                case 6:
                    new C13771(this, this, true).m33417(true);
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ */
    public void m50398() {
        switch (C17122.f50583[this.f70775.m44881().ordinal()]) {
            case 1:
                m50390(true);
                break;
            case 2:
                C19746 c19746 = this.f70775;
                C25110 c25110 = c19746.f60060;
                if (c25110.f80351 == null) {
                    m50379(EnumC9017.MAIN);
                    m12277(R.string.MT_Protector);
                } else {
                    c19746.f60066.put(c25110.f80350, Integer.valueOf(this.f70771.getFirstVisiblePosition()));
                    C19746 c19747 = this.f70775;
                    c19747.f60060 = c19747.f60060.f80351;
                    setTitle("/" + this.f70775.f60060.f80350);
                    m50379(EnumC9017.CLASS_LIST);
                }
                break;
            case 3:
                this.f70775.f60063.pop();
                if (this.f70775.f60063.isEmpty()) {
                    C19746 c19748 = this.f70775;
                    EnumC9017 enumC9017 = c19748.f60050;
                    EnumC9017 enumC9018 = EnumC9017.MAIN;
                    if (enumC9017 == enumC9018 || c19748.f60060 == null) {
                        m50379(enumC9018);
                        m12277(R.string.MT_Protector);
                    } else {
                        m50379(EnumC9017.CLASS_LIST);
                        setTitle("/" + this.f70775.f60060.f80350);
                    }
                } else {
                    setTitle(((C2981) this.f70775.f60063.peek()).f5266);
                    this.f70774.m12528(true);
                    this.f70774.m12530();
                    this.f70774.notifyDataSetChanged();
                    this.f70771.setSelection(((C2981) this.f70775.f60063.peek()).f5265);
                }
                break;
            case 4:
                if (this.f70775.f60063.isEmpty()) {
                    setTitle("/" + this.f70775.f60060.f80350);
                    m50379(EnumC9017.CLASS_LIST);
                } else {
                    setTitle(((C2981) this.f70775.f60063.peek()).f5266);
                    m50379(EnumC9017.SEARCH_RESULT_CLASS);
                    this.f70771.setSelection(((C2981) this.f70775.f60063.peek()).f5265);
                }
                break;
            case 5:
            case 8:
                setTitle(this.f70775.f60061);
                m50379(EnumC9017.CLASS_INFO);
                break;
            case 6:
                this.f70775.f60071.pop();
                if (this.f70775.f60071.isEmpty()) {
                    EnumC9017 enumC9019 = this.f70775.f60068;
                    EnumC9017 enumC90110 = EnumC9017.METHOD_LIST;
                    if (enumC9019 == enumC90110) {
                        m50379(enumC90110);
                        m12277(R.string.MT_Protector);
                    } else {
                        m50379(EnumC9017.CLASS_INFO);
                        setTitle(this.f70775.f60061);
                    }
                } else {
                    setTitle(((C2981) this.f70775.f60071.peek()).f5266);
                    this.f70774.m12528(true);
                    this.f70774.m12530();
                    this.f70774.notifyDataSetChanged();
                    this.f70771.setSelection(((C2981) this.f70775.f60071.peek()).f5265);
                }
                break;
            case 7:
                C19746 c19749 = this.f70775;
                if (c19749.f60047) {
                    c19749.f60047 = false;
                    m12277(R.string.MT_Protector);
                    this.f70774.notifyDataSetChanged();
                } else {
                    c19749.f60066.put("//", Integer.valueOf(this.f70771.getFirstVisiblePosition()));
                    m50379(EnumC9017.MAIN);
                    m12277(R.string.MT_Protector);
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        try {
            switch (C17122.f50583[this.f70775.m44881().ordinal()]) {
                case 1:
                    if (i == 0) {
                        C19746 c19746 = this.f70775;
                        c19746.f60060 = c19746.f60064.f48182;
                        setTitle("/" + this.f70775.f60060.f80350);
                        m50379(EnumC9017.CLASS_LIST);
                    } else if (i == 1) {
                        m12277(R.string.MT_Protector);
                        m50379(EnumC9017.STRING_POOL);
                        Integer num = (Integer) this.f70775.f60066.get("//");
                        if (num == null) {
                            this.f70771.setSelection(0);
                        } else {
                            this.f70771.setSelection(num.intValue());
                        }
                    }
                    break;
                case 2:
                    if (i < this.f70775.f60060.f80354.size()) {
                        C19746 c19747 = this.f70775;
                        c19747.f60066.put(c19747.f60060.f80350, Integer.valueOf(this.f70771.getFirstVisiblePosition()));
                        C19746 c19748 = this.f70775;
                        c19748.f60060 = (C25110) c19748.f60060.f80354.get(i);
                        setTitle("/" + this.f70775.f60060.f80350);
                        m50379(EnumC9017.CLASS_LIST);
                    } else {
                        C19746 c19749 = this.f70775;
                        c19749.f60066.put(c19749.f60060.f80350, Integer.valueOf(this.f70771.getFirstVisiblePosition()));
                        int size = i - this.f70775.f60060.f80354.size();
                        C19746 c197410 = this.f70775;
                        c197410.f60061 = (String) c197410.f60060.f80355.get(size);
                        C19746 c197411 = this.f70775;
                        c197411.f60058 = null;
                        c197411.f60051 = (C13068) c197411.f60049.get(this.f70775.f60060.f80350 + this.f70775.f60061);
                        setTitle(this.f70775.f60061);
                        m50379(EnumC9017.CLASS_INFO);
                    }
                    break;
                case 3:
                    ((C2981) this.f70775.f60063.peek()).f5265 = this.f70771.getFirstVisiblePosition();
                    C19746 c197412 = this.f70775;
                    c197412.f60051 = (C13068) ((C2981) c197412.f60063.peek()).f5264.get(i);
                    String strM53168 = this.f70775.f60051.m29923().m53168();
                    int iLastIndexOf = strM53168.lastIndexOf(47);
                    if (iLastIndexOf == -1) {
                        C19746 c197413 = this.f70775;
                        String strSubstring = strM53168.substring(0, strM53168.length() - 1);
                        c197413.f60061 = strSubstring;
                        setTitle(strSubstring);
                    } else {
                        C19746 c197414 = this.f70775;
                        String strSubstring2 = strM53168.substring(iLastIndexOf + 1, strM53168.length() - 1);
                        c197414.f60061 = strSubstring2;
                        setTitle(strSubstring2);
                    }
                    this.f70775.f60058 = null;
                    m50379(EnumC9017.CLASS_INFO);
                    break;
                case 4:
                    if (i == 0) {
                        new C15781(this).m35848();
                    } else if (i == 1) {
                        m50399();
                        m12277(R.string.MT_Protector);
                        m50379(EnumC9017.FIELD_LIST);
                    } else if (i == 2) {
                        m50393();
                        m12277(R.string.MT_Protector);
                        m50379(EnumC9017.METHOD_LIST);
                    } else if (i == 3) {
                        m50405();
                    }
                    break;
                case 5:
                    z = i < this.f70775.f60069.size();
                    if (!z) {
                        i -= this.f70775.f60069.size();
                    }
                    C15568 c15568 = (C15568) (z ? this.f70775.f60069 : this.f70775.f60067).get(i);
                    if (c15568.f44485 == null) {
                        new C19075(this).m43347(i, c15568);
                    } else {
                        ActivityC8206.f21772 = c15568;
                        startActivity(new Intent(this, (Class<?>) ActivityC8206.class));
                    }
                    break;
                case 6:
                    ((C2981) this.f70775.f60071.peek()).f5265 = this.f70771.getFirstVisiblePosition();
                    C15568 c15569 = (C15568) ((C2981) this.f70775.f60071.peek()).f5264.get(i);
                    if (c15569.f44485 == null) {
                        C22682.m50793(R.string.MT_Protector);
                    } else {
                        ActivityC8206.f21772 = c15569;
                        startActivity(new Intent(this, (Class<?>) ActivityC8206.class));
                    }
                    break;
                case 7:
                    C7736 c7736 = new C7736(this, this);
                    c7736.m33356();
                    c7736.m33344(R.string.MT_Protector);
                    C19746 c197415 = this.f70775;
                    C13266[] c13266Arr = c197415.f60056;
                    if (c197415.f60047) {
                        i = c197415.f60070[i];
                    }
                    c197415.f60055 = i;
                    c7736.m33336((CharSequence) c13266Arr[i].m30317());
                    c7736.m33352(true);
                    break;
                case 8:
                    z = i < this.f70775.f60053.size();
                    if (!z) {
                        i -= this.f70775.f60053.size();
                    }
                    new C18404(this).m41907(i, (C24286) (z ? this.f70775.f60053 : this.f70775.f60052).get(i));
                    break;
            }
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    private void m50405() {
        byte[] bArr = this.f70775.f60058;
        if (bArr == null) {
            new C3712(this).m22250();
            return;
        }
        C7741 c7741 = this.f70776;
        String strM25286 = C10965.m25286(new StringBuilder(), this.f70775.f60061, ".java");
        C5178.m11082(ActivityC22429.class, bArr, "textViewer_data");
        Intent intent = new Intent(C7050.m16232(), (Class<?>) ActivityC16573.class);
        intent.putExtra(AbstractC0213e.f995s, 1);
        intent.putExtra("title", strM25286);
        intent.putExtra("saveStateOnResult", true);
        c7741.m17868(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟ */
    public void m50393() {
        C9534 c9534M29924;
        this.f70775.f60067.clear();
        this.f70775.f60069.clear();
        C13068 c13068 = this.f70775.f60051;
        if (c13068 == null || (c9534M29924 = c13068.m29924()) == null) {
            return;
        }
        Collections.addAll(this.f70775.f60069, c9534M29924.m22225());
        Collections.addAll(this.f70775.f60067, c9534M29924.m22230());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ */
    public void m50399() {
        this.f70775.f60052.clear();
        this.f70775.f60053.clear();
        C9534 c9534M29924 = this.f70775.f60051.m29924();
        if (c9534M29924 != null) {
            Collections.addAll(this.f70775.f60053, c9534M29924.m22226());
            Collections.addAll(this.f70775.f60052, c9534M29924.m22227());
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        final String str;
        final int[] iArr;
        int i2 = C17122.f50583[this.f70775.m44881().ordinal()];
        if (i2 == 2) {
            final boolean z = i < this.f70775.f60060.f80354.size();
            if (z) {
                iArr = new int[]{R.string.MT_Protector, R.string.MT_Protector};
                str = ((C25110) this.f70775.f60060.f80354.get(i)).f80353;
            } else {
                int[] iArr2 = {R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
                str = (String) this.f70775.f60060.f80355.get(i - this.f70775.f60060.f80354.size());
                iArr = iArr2;
            }
            String[] strArr = new String[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                strArr[i3] = getString(iArr[i3]);
            }
            int i4 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46724(strArr, new DialogInterface.OnClickListener() { // from class: l.᩷᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    ActivityC22429.m50389(this.f70914, iArr, str, z, i5);
                }
            });
            c20671.m46732();
            return true;
        }
        if (i2 == 3) {
            final C13068 c13068 = (C13068) ((C2981) this.f70775.f60063.peek()).f5264.get(i);
            String[] strArr2 = {getString(R.string.MT_Protector)};
            int i5 = DialogInterfaceC2564.f4230;
            C20671 c20672 = new C20671(this);
            c20672.m46724(strArr2, new DialogInterface.OnClickListener() { // from class: l.᩻᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    boolean z2 = ActivityC22429.f70770;
                    C7050.m16211((CharSequence) c13068.m29923().m53168());
                }
            });
            c20672.m46732();
            return true;
        }
        if (i2 == 5) {
            final boolean z2 = i < this.f70775.f60069.size();
            if (!z2) {
                i -= this.f70775.f60069.size();
            }
            final int i6 = i;
            final C15568 c15568 = (C15568) (z2 ? this.f70775.f60069 : this.f70775.f60067).get(i6);
            final int[] iArr3 = c15568.f44485 == null ? new int[]{R.string.MT_Protector, R.string.MT_Protector} : new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
            String[] strArr3 = new String[iArr3.length];
            for (int i7 = 0; i7 < iArr3.length; i7++) {
                strArr3[i7] = getString(iArr3[i7]);
            }
            int i8 = DialogInterfaceC2564.f4230;
            C20671 c20673 = new C20671(this);
            c20673.m46724(strArr3, new DialogInterface.OnClickListener() { // from class: l.ܳ᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    boolean z3 = ActivityC22429.f70770;
                    int i10 = iArr3[i9];
                    final ActivityC22429 activityC22429 = this.f48335;
                    C15568 c15569 = c15568;
                    final int i11 = i6;
                    if (i10 == R.string.MT_Protector) {
                        new C19075(activityC22429).m43347(i11, c15569);
                        return;
                    }
                    if (i10 == R.string.MT_Protector) {
                        ActivityC8206.f21772 = c15569;
                        activityC22429.startActivity(new Intent(activityC22429, (Class<?>) ActivityC8206.class));
                    } else if (i10 == R.string.MT_Protector) {
                        int i12 = DialogInterfaceC2564.f4230;
                        C20671 c20674 = new C20671(activityC22429);
                        c20674.m46727(R.string.MT_Protector);
                        c20674.m46718(c15569.f44483.f73398.m30317());
                        final boolean z4 = z2;
                        c20674.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ᩹ܽ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i13) {
                                ActivityC22429.m50397(activityC22429, z4, i11);
                            }
                        });
                        c20674.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c20674.m46732();
                    }
                }
            });
            c20673.m46732();
            return true;
        }
        if (i2 != 8) {
            return false;
        }
        final boolean z3 = i < this.f70775.f60053.size();
        if (!z3) {
            i -= this.f70775.f60053.size();
        }
        final int i9 = i;
        final C24286 c24286 = (C24286) (z3 ? this.f70775.f60053 : this.f70775.f60052).get(i9);
        final int[] iArr4 = {R.string.MT_Protector, R.string.MT_Protector};
        String[] strArr4 = new String[2];
        for (int i10 = 0; i10 < 2; i10++) {
            strArr4[i10] = getString(iArr4[i10]);
        }
        int i11 = DialogInterfaceC2564.f4230;
        C20671 c20674 = new C20671(this);
        c20674.m46724(strArr4, new DialogInterface.OnClickListener() { // from class: l.ۧ᩹ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                boolean z4 = ActivityC22429.f70770;
                int i13 = iArr4[i12];
                final ActivityC22429 activityC22429 = this.f36829;
                C24286 c24287 = c24286;
                final int i14 = i9;
                if (i13 == R.string.MT_Protector) {
                    new C18404(activityC22429).m41907(i14, c24287);
                    return;
                }
                if (i13 == R.string.MT_Protector) {
                    int i15 = DialogInterfaceC2564.f4230;
                    C20671 c20675 = new C20671(activityC22429);
                    c20675.m46727(R.string.MT_Protector);
                    c20675.m46718(c24287.f76932.f60619.m30317());
                    final boolean z5 = z3;
                    c20675.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ᩹ܽ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i16) {
                            ActivityC22429.m50387(activityC22429, z5, i14);
                        }
                    });
                    c20675.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c20675.m46732();
                }
            }
        });
        c20674.m46732();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50389(final ActivityC22429 activityC22429, int[] iArr, final String str, final boolean z, int i) {
        int i2 = iArr[i];
        if (i2 == R.string.MT_Protector) {
            C7050.m16211((CharSequence) ((C13068) activityC22429.f70775.f60049.get(activityC22429.f70775.f60060.f80350 + str)).m29923().m53168());
            return;
        }
        if (i2 == R.string.MT_Protector) {
            int i3 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(activityC22429);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46718(str);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC22429.m50388(this.f55186, z, str);
                }
            });
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732();
            return;
        }
        if (i2 == R.string.MT_Protector) {
            C10418 c10418 = new C10418(activityC22429, activityC22429, str, z);
            c10418.m33344(R.string.MT_Protector);
            c10418.m33336((CharSequence) str);
            c10418.m33330();
            c10418.m33365(6);
            c10418.m33367();
            c10418.m33352(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫֫ */
    public void m50391() {
        C25110 c25110;
        C19746 c19746 = this.f70775;
        String str = c19746.f60060.f80350;
        c19746.f60060 = c19746.f60064.f48182;
        loop0: while (!this.f70775.f60060.f80350.equals(str)) {
            int size = this.f70775.f60060.f80354.size();
            do {
                size--;
                if (size < 0) {
                    break loop0;
                } else {
                    c25110 = (C25110) this.f70775.f60060.f80354.get(size);
                }
            } while (!str.startsWith(c25110.f80350));
            this.f70775.f60060 = c25110;
        }
        this.f70774.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50387(ActivityC22429 activityC22429, boolean z, int i) {
        if (z) {
            activityC22429.f70775.f60051.m29924().m22229(i);
            activityC22429.f70775.f60053.remove(i);
        } else {
            activityC22429.f70775.f60051.m29924().m22231(i);
            activityC22429.f70775.f60052.remove(i);
        }
        activityC22429.f70774.notifyDataSetChanged();
        f70770 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m50397(ActivityC22429 activityC22429, boolean z, int i) {
        if (z) {
            activityC22429.f70775.f60051.m29924().m22223(i);
            activityC22429.f70775.f60069.remove(i);
        } else {
            activityC22429.f70775.f60051.m29924().m22228(i);
            activityC22429.f70775.f60067.remove(i);
        }
        activityC22429.f70774.notifyDataSetChanged();
        f70770 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m50379(EnumC9017 enumC9017) {
        C25110 c25110;
        this.f70775.f60048.mo4067(enumC9017);
        this.f70774.m12528(true);
        this.f70774.m12530();
        this.f70774.notifyDataSetChanged();
        C19746 c19746 = this.f70775;
        c19746.f60047 = false;
        if (enumC9017 == EnumC9017.CLASS_LIST && (c25110 = c19746.f60060) != null) {
            Integer num = (Integer) c19746.f60066.get(c25110.f80350);
            if (num == null) {
                this.f70771.setSelection(0);
                return;
            } else {
                this.f70771.setSelection(num.intValue());
                return;
            }
        }
        this.f70771.setSelection(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50388(ActivityC22429 activityC22429, boolean z, String str) {
        if (z) {
            String str2 = activityC22429.f70775.f60060.f80350 + str.replace('.', '/') + '/';
            for (Map.Entry entry : activityC22429.f70775.f60049.entrySet()) {
                if (((String) entry.getKey()).startsWith(str2)) {
                    activityC22429.f70775.f60057.f13741.m27253().remove(entry.getValue());
                }
            }
        } else {
            activityC22429.f70775.f60057.f13741.m27253().remove(activityC22429.f70775.f60049.get(activityC22429.f70775.f60060.f80350 + str.replace('.', '/')));
        }
        f70770 = true;
        activityC22429.f70775.f60049.clear();
        for (C13068 c13068 : activityC22429.f70775.f60057.f13741.m27253()) {
            activityC22429.f70775.f60049.put(C17073.m38720(1, 1, c13068.m29923().m53168()), c13068);
        }
        C19746 c19746 = activityC22429.f70775;
        c19746.f60064.m37213(c19746.f60049.keySet());
        activityC22429.m50391();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50384(ActivityC22429 activityC22429, String str, String str2) {
        for (C23994 c23994 : activityC22429.f70775.f60057.f13727.m27253()) {
            String strM53168 = c23994.m53168();
            int i = 1;
            for (int i2 = 0; i2 < strM53168.length() && strM53168.charAt(i2) == '['; i2++) {
                i++;
            }
            int iIndexOf = strM53168.indexOf(str);
            if (iIndexOf != -1 && iIndexOf == i) {
                c23994.m53166(strM53168.replace(str, str2));
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public static void m50392(ActivityC22429 activityC22429) {
        int i;
        HashSet hashSet = new HashSet();
        Iterator it = activityC22429.f70775.f60057.f13741.m27253().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C9534 c9534M29924 = ((C13068) it.next()).m29924();
            if (c9534M29924 != null) {
                for (C15568 c15568 : c9534M29924.m22225()) {
                    m50380(c15568, hashSet);
                }
                C15568[] c15568ArrM22230 = c9534M29924.m22230();
                int length = c15568ArrM22230.length;
                while (i < length) {
                    m50380(c15568ArrM22230[i], hashSet);
                    i++;
                }
            }
        }
        activityC22429.f70775.f60056 = new C13266[hashSet.size()];
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            activityC22429.f70775.f60056[i] = (C13266) it2.next();
            i++;
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50380(C15568 c15568, HashSet hashSet) {
        C6322 c6322 = c15568.f44485;
        if (c6322 != null) {
            for (AbstractC4310 abstractC4310 : c6322.f16386) {
                int i = C17122.f50584[abstractC4310.mo5081().ordinal()];
                if ((i == 1 || i == 2) && abstractC4310.f9623.f80335 == EnumC9004.string) {
                    hashSet.add((C13266) ((AbstractC18391) abstractC4310).m41867());
                }
            }
        }
    }
}
