package l;

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
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC21107 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static boolean f68088;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ListView f68089;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public AbstractC21294[] f68090;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f68091;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C12609 f68092;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C18284 f68093;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C5652 f68094;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f68087 = Pattern.compile("\\s");

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f68086 = Pattern.compile("\\s|\\(|\\)");

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "DexEditor";
    }

    public ActivityC21107() {
        AbstractC21294 abstractC21294 = C19883.f64226;
        this.f68090 = new AbstractC21294[]{abstractC21294, C19883.f64210, abstractC21294, C19883.f64230, C19883.f64218, C19883.f64228};
        m10242();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f68093 = (C18284) new C4741(this).m13885(C18284.class);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C21875 c21875 = new C21875(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c21875);
        m10214();
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        this.f10584 = (C9762) m10241(R.id.MT_Protector);
        ListView listView = (ListView) m10241(android.R.id.list);
        this.f68089 = listView;
        listView.setFastScrollEnabled(true);
        this.f68089.setOnItemClickListener(this);
        this.f68089.setOnItemLongClickListener(this);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC2825(0, this));
        this.f68094 = C8474.m22148(this, new C4236(0, this));
        C18284 c18284 = this.f68093;
        if (!c18284.f56848) {
            f68088 = false;
            c18284.f56837 = ApplicationC20075.f65008.getBoolean("flatten_package", true);
            if (C16999.m39873((AbstractActivityC3346) this)) {
                return;
            }
            new C20464(this).m20274();
            return;
        }
        ListView listView2 = this.f68089;
        C12609 c12609 = new C12609(new C7763(this));
        this.f68092 = c12609;
        listView2.setAdapter((ListAdapter) c12609);
        this.f68089.setOnScrollListener(new C4941(this));
        this.f68092.m14112(this.f68089);
        this.f68092.m10504(true);
        this.f68092.m10506();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48052(ActivityC21107 activityC21107, int i, Intent intent) {
        if (i == 1) {
            activityC21107.f68093.f56841 = intent.getByteArrayExtra(e.m);
        } else if (i == 2) {
            activityC21107.f68093.f56841 = null;
            activityC21107.m48075();
        } else {
            activityC21107.f68093.f56841 = null;
        }
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        m48060(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48060(boolean z) {
        if (f68088) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢ᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    boolean z2 = ActivityC21107.f68088;
                    new C13407(this.f29914, true).m20274();
                }
            });
            c19258.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9175(this, 0));
            c19258.m44438();
            return;
        }
        if (z) {
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19259 = new C19258(this);
            c19259.m44433(R.string.MT_Protector);
            c19259.m44416(R.string.MT_Protector);
            c19259.m44442(R.string.MT_Protector, null);
            c19259.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    boolean z2 = ActivityC21107.f68088;
                    this.f49963.finish();
                }
            });
            c19259.m44438();
            return;
        }
        finish();
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
        final MenuItem menuItemFindItem5 = subMenu.findItem(R.id.MT_Protector);
        final MenuItem menuItemFindItem6 = subMenu.findItem(R.id.MT_Protector);
        MenuItem menuItemFindItem7 = subMenu.findItem(R.id.MT_Protector);
        this.f68091 = menuItemFindItem7;
        menuItemFindItem7.setChecked(this.f68093.f56837);
        this.f68093.f56831.m1668(this, new InterfaceC1008() { // from class: l.ۜ᩹ܽ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                ActivityC21107.m48053(this.f21731, menuItemFindItem5, menuItemFindItem6, menuItemFindItem4, menuItemFindItem, menuItemFindItem2, menuItemFindItem3, (EnumC6995) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48053(ActivityC21107 activityC21107, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, MenuItem menuItem4, MenuItem menuItem5, MenuItem menuItem6, EnumC6995 enumC6995) {
        EnumC6995 enumC6996 = EnumC6995.STRING_POOL;
        menuItem.setVisible(enumC6995 == enumC6996);
        menuItem2.setVisible(enumC6995 == enumC6996);
        menuItem3.setVisible(enumC6995 == EnumC6995.FIELD_LIST || enumC6995 == EnumC6995.METHOD_LIST);
        activityC21107.f68091.setVisible(enumC6995 == EnumC6995.CLASS_LIST);
        switch (C15523.f47451[enumC6995.ordinal()]) {
            case 1:
            case 2:
                menuItem4.setVisible(true);
                menuItem5.setVisible(true);
                menuItem6.setVisible(true);
                break;
            case 3:
                boolean z = ((C0644) activityC21107.f68093.f56846.peek()).f2492.size() > 0;
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
                boolean z2 = ((C0644) activityC21107.f68093.f56854.peek()).f2492.size() > 0;
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
            new C13407(this, false).m20274();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m48060(false);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C12702(this, this, this.f68093.f56830).m40707();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C10586(this, this);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            EnumC6995 enumC6995M42621 = this.f68093.m42621();
            if (enumC6995M42621 == EnumC6995.FIELD_LIST) {
                C16872 c16872 = new C16872(this);
                if (c16872.f51777) {
                    c16872.f51777 = false;
                    c16872.m36254(0).addTextChangedListener(new C2056(c16872));
                    c16872.m36254(2).addTextChangedListener(new C11229(c16872));
                }
                c16872.f51775 = -1;
                c16872.f51773 = true;
                c16872.m36254(0).setText("public");
                c16872.m36254(1).setText("newField");
                c16872.m36254(2).setText("I");
                c16872.m36254(3).setText((CharSequence) null);
                c16872.m36262();
                c16872.m36258().setText(R.string.MT_Protector);
                return true;
            }
            if (enumC6995M42621 == EnumC6995.METHOD_LIST) {
                new C17578(this).m41102();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            int i = C15523.f47451[this.f68093.m42621().ordinal()];
            if (i == 1 || i == 2) {
                new C23285(this, this, false).m43825(false);
                return true;
            }
            if (i == 3) {
                new C23285(this, this, true).m43825(true);
                return true;
            }
        } else {
            if (itemId == R.id.MT_Protector) {
                switch (C15523.f47451[this.f68093.m42621().ordinal()]) {
                    case 1:
                    case 2:
                        new C19759(this, this, false).m38101(false);
                        return true;
                    case 3:
                        new C19759(this, this, true).m38101(true);
                        return true;
                    case 4:
                    case 5:
                        new C0707(this, this, false).m38101(false);
                        return true;
                    case 6:
                        new C0707(this, this, true).m38101(true);
                        return true;
                }
            }
            if (itemId != R.id.MT_Protector) {
                if (itemId != R.id.MT_Protector) {
                    return false;
                }
                C18284 c18284 = this.f68093;
                c18284.f56837 = !c18284.f56837;
                ApplicationC20075.f65008.edit().putBoolean("flatten_package", this.f68093.f56837).apply();
                this.f68091.setChecked(this.f68093.f56837);
                C18284 c18285 = this.f68093;
                c18285.f56847.m35066(c18285.f56832.keySet());
                C18284 c18286 = this.f68093;
                c18286.f56843 = c18286.f56847.f45069;
                this.f68092.notifyDataSetChanged();
                setTitle("/");
                return true;
            }
            switch (C15523.f47451[this.f68093.m42621().ordinal()]) {
                case 1:
                case 2:
                    new C6352(this, this, false).m31331(false);
                    break;
                case 3:
                    new C6352(this, this, true).m31331(true);
                    return true;
                case 4:
                case 5:
                    new C11997(this, this, false).m31331(false);
                    return true;
                case 6:
                    new C11997(this, this, true).m31331(true);
                    return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m48068() {
        switch (C15523.f47451[this.f68093.m42621().ordinal()]) {
            case 1:
                m48060(true);
                break;
            case 2:
                C18284 c18284 = this.f68093;
                C23928 c23928 = c18284.f56843;
                if (c23928.f77600 == null) {
                    m48049(EnumC6995.MAIN);
                    m10241(R.string.MT_Protector);
                } else {
                    c18284.f56849.put(c23928.f77599, Integer.valueOf(this.f68089.getFirstVisiblePosition()));
                    C18284 c18285 = this.f68093;
                    c18285.f56843 = c18285.f56843.f77600;
                    setTitle("/" + this.f68093.f56843.f77599);
                    m48049(EnumC6995.CLASS_LIST);
                }
                break;
            case 3:
                this.f68093.f56846.pop();
                if (this.f68093.f56846.isEmpty()) {
                    C18284 c18286 = this.f68093;
                    EnumC6995 enumC6995 = c18286.f56833;
                    EnumC6995 enumC6996 = EnumC6995.MAIN;
                    if (enumC6995 == enumC6996 || c18286.f56843 == null) {
                        m48049(enumC6996);
                        m10241(R.string.MT_Protector);
                    } else {
                        m48049(EnumC6995.CLASS_LIST);
                        setTitle("/" + this.f68093.f56843.f77599);
                    }
                } else {
                    setTitle(((C0644) this.f68093.f56846.peek()).f2494);
                    this.f68092.m10504(true);
                    this.f68092.m10506();
                    this.f68092.notifyDataSetChanged();
                    this.f68089.setSelection(((C0644) this.f68093.f56846.peek()).f2493);
                }
                break;
            case 4:
                if (this.f68093.f56846.isEmpty()) {
                    setTitle("/" + this.f68093.f56843.f77599);
                    m48049(EnumC6995.CLASS_LIST);
                } else {
                    setTitle(((C0644) this.f68093.f56846.peek()).f2494);
                    m48049(EnumC6995.SEARCH_RESULT_CLASS);
                    this.f68089.setSelection(((C0644) this.f68093.f56846.peek()).f2493);
                }
                break;
            case 5:
            case 8:
                setTitle(this.f68093.f56844);
                m48049(EnumC6995.CLASS_INFO);
                break;
            case 6:
                this.f68093.f56854.pop();
                if (this.f68093.f56854.isEmpty()) {
                    EnumC6995 enumC6997 = this.f68093.f56851;
                    EnumC6995 enumC6998 = EnumC6995.METHOD_LIST;
                    if (enumC6997 == enumC6998) {
                        m48049(enumC6998);
                        m10241(R.string.MT_Protector);
                    } else {
                        m48049(EnumC6995.CLASS_INFO);
                        setTitle(this.f68093.f56844);
                    }
                } else {
                    setTitle(((C0644) this.f68093.f56854.peek()).f2494);
                    this.f68092.m10504(true);
                    this.f68092.m10506();
                    this.f68092.notifyDataSetChanged();
                    this.f68089.setSelection(((C0644) this.f68093.f56854.peek()).f2493);
                }
                break;
            case 7:
                C18284 c18287 = this.f68093;
                if (c18287.f56830) {
                    c18287.f56830 = false;
                    m10241(R.string.MT_Protector);
                    this.f68092.notifyDataSetChanged();
                } else {
                    c18287.f56849.put("//", Integer.valueOf(this.f68089.getFirstVisiblePosition()));
                    m48049(EnumC6995.MAIN);
                    m10241(R.string.MT_Protector);
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        try {
            switch (C15523.f47451[this.f68093.m42621().ordinal()]) {
                case 1:
                    if (i == 0) {
                        C18284 c18284 = this.f68093;
                        c18284.f56843 = c18284.f56847.f45069;
                        setTitle("/" + this.f68093.f56843.f77599);
                        m48049(EnumC6995.CLASS_LIST);
                    } else if (i == 1) {
                        m10241(R.string.MT_Protector);
                        m48049(EnumC6995.STRING_POOL);
                        Integer num = (Integer) this.f68093.f56849.get("//");
                        if (num == null) {
                            this.f68089.setSelection(0);
                        } else {
                            this.f68089.setSelection(num.intValue());
                        }
                    }
                    break;
                case 2:
                    if (i < this.f68093.f56843.f77603.size()) {
                        C18284 c18285 = this.f68093;
                        c18285.f56849.put(c18285.f56843.f77599, Integer.valueOf(this.f68089.getFirstVisiblePosition()));
                        C18284 c18286 = this.f68093;
                        c18286.f56843 = (C23928) c18286.f56843.f77603.get(i);
                        setTitle("/" + this.f68093.f56843.f77599);
                        m48049(EnumC6995.CLASS_LIST);
                    } else {
                        C18284 c18287 = this.f68093;
                        c18287.f56849.put(c18287.f56843.f77599, Integer.valueOf(this.f68089.getFirstVisiblePosition()));
                        int size = i - this.f68093.f56843.f77603.size();
                        C18284 c18288 = this.f68093;
                        c18288.f56844 = (String) c18288.f56843.f77604.get(size);
                        C18284 c18289 = this.f68093;
                        c18289.f56841 = null;
                        c18289.f56834 = (C11258) c18289.f56832.get(this.f68093.f56843.f77599 + this.f68093.f56844);
                        setTitle(this.f68093.f56844);
                        m48049(EnumC6995.CLASS_INFO);
                    }
                    break;
                case 3:
                    ((C0644) this.f68093.f56846.peek()).f2493 = this.f68089.getFirstVisiblePosition();
                    C18284 c182810 = this.f68093;
                    c182810.f56834 = (C11258) ((C0644) c182810.f56846.peek()).f2492.get(i);
                    String strM50835 = this.f68093.f56834.m27862().m50835();
                    int iLastIndexOf = strM50835.lastIndexOf(47);
                    if (iLastIndexOf == -1) {
                        C18284 c182811 = this.f68093;
                        String strSubstring = strM50835.substring(0, strM50835.length() - 1);
                        c182811.f56844 = strSubstring;
                        setTitle(strSubstring);
                    } else {
                        C18284 c182812 = this.f68093;
                        String strSubstring2 = strM50835.substring(iLastIndexOf + 1, strM50835.length() - 1);
                        c182812.f56844 = strSubstring2;
                        setTitle(strSubstring2);
                    }
                    this.f68093.f56841 = null;
                    m48049(EnumC6995.CLASS_INFO);
                    break;
                case 4:
                    if (i == 0) {
                        new C14112(this).m33722();
                    } else if (i == 1) {
                        m48069();
                        m10241(R.string.MT_Protector);
                        m48049(EnumC6995.FIELD_LIST);
                    } else if (i == 2) {
                        m48063();
                        m10241(R.string.MT_Protector);
                        m48049(EnumC6995.METHOD_LIST);
                    } else if (i == 3) {
                        m48075();
                    }
                    break;
                case 5:
                    z = i < this.f68093.f56852.size();
                    if (!z) {
                        i -= this.f68093.f56852.size();
                    }
                    C13889 c13889 = (C13889) (z ? this.f68093.f56852 : this.f68093.f56850).get(i);
                    if (c13889.f41404 == null) {
                        new C17578(this).m41101(i, c13889);
                    } else {
                        ActivityC6142.f18914 = c13889;
                        startActivity(new Intent(this, (Class<?>) ActivityC6142.class));
                    }
                    break;
                case 6:
                    ((C0644) this.f68093.f56854.peek()).f2493 = this.f68089.getFirstVisiblePosition();
                    C13889 c138810 = (C13889) ((C0644) this.f68093.f56854.peek()).f2492.get(i);
                    if (c138810.f41404 == null) {
                        C21374.m48457(R.string.MT_Protector);
                    } else {
                        ActivityC6142.f18914 = c138810;
                        startActivity(new Intent(this, (Class<?>) ActivityC6142.class));
                    }
                    break;
                case 7:
                    C5647 c5647 = new C5647(this, this);
                    c5647.m31270();
                    c5647.m31258(R.string.MT_Protector);
                    C18284 c182813 = this.f68093;
                    C11467[] c11467Arr = c182813.f56839;
                    if (c182813.f56830) {
                        i = c182813.f56853[i];
                    }
                    c182813.f56838 = i;
                    c5647.m31250((CharSequence) c11467Arr[i].m28273());
                    c5647.m31266(true);
                    break;
                case 8:
                    z = i < this.f68093.f56836.size();
                    if (!z) {
                        i -= this.f68093.f56836.size();
                    }
                    new C16872(this).m39671(i, (C23062) (z ? this.f68093.f56836 : this.f68093.f56835).get(i));
                    break;
            }
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m48075() {
        byte[] bArr = this.f68093.f56841;
        if (bArr == null) {
            new C1413(this).m20274();
            return;
        }
        C5652 c5652 = this.f68094;
        String strM23341 = C9045.m23341(new StringBuilder(), this.f68093.f56844, ".java");
        C2956.m9014(ActivityC21107.class, bArr, "textViewer_data");
        Intent intent = new Intent(C4925.m14335(), (Class<?>) ActivityC14946.class);
        intent.putExtra(e.s, 1);
        intent.putExtra("title", strM23341);
        intent.putExtra("saveStateOnResult", true);
        c5652.m15940(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public void m48063() {
        C7540 c7540M27863;
        this.f68093.f56850.clear();
        this.f68093.f56852.clear();
        C11258 c11258 = this.f68093.f56834;
        if (c11258 == null || (c7540M27863 = c11258.m27863()) == null) {
            return;
        }
        Collections.addAll(this.f68093.f56852, c7540M27863.m20249());
        Collections.addAll(this.f68093.f56850, c7540M27863.m20254());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m48069() {
        this.f68093.f56835.clear();
        this.f68093.f56836.clear();
        C7540 c7540M27863 = this.f68093.f56834.m27863();
        if (c7540M27863 != null) {
            Collections.addAll(this.f68093.f56836, c7540M27863.m20250());
            Collections.addAll(this.f68093.f56835, c7540M27863.m20251());
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        final String str;
        final int[] iArr;
        int i2 = C15523.f47451[this.f68093.m42621().ordinal()];
        if (i2 == 2) {
            final boolean z = i < this.f68093.f56843.f77603.size();
            if (z) {
                iArr = new int[]{R.string.MT_Protector, R.string.MT_Protector};
                str = ((C23928) this.f68093.f56843.f77603.get(i)).f77602;
            } else {
                int[] iArr2 = {R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
                str = (String) this.f68093.f56843.f77604.get(i - this.f68093.f56843.f77603.size());
                iArr = iArr2;
            }
            String[] strArr = new String[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                strArr[i3] = getString(iArr[i3]);
            }
            int i4 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44430(strArr, new DialogInterface.OnClickListener() { // from class: l.᩷᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    ActivityC21107.m48059(this.f68231, iArr, str, z, i5);
                }
            });
            c19258.m44438();
            return true;
        }
        if (i2 == 3) {
            final C11258 c11258 = (C11258) ((C0644) this.f68093.f56846.peek()).f2492.get(i);
            String[] strArr2 = {getString(R.string.MT_Protector)};
            int i5 = DialogInterfaceC0206.f1451;
            C19258 c19259 = new C19258(this);
            c19259.m44430(strArr2, new DialogInterface.OnClickListener() { // from class: l.᩻᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    boolean z2 = ActivityC21107.f68088;
                    C4925.m14314((CharSequence) c11258.m27862().m50835());
                }
            });
            c19259.m44438();
            return true;
        }
        if (i2 == 5) {
            final boolean z2 = i < this.f68093.f56852.size();
            if (!z2) {
                i -= this.f68093.f56852.size();
            }
            final int i6 = i;
            final C13889 c13889 = (C13889) (z2 ? this.f68093.f56852 : this.f68093.f56850).get(i6);
            final int[] iArr3 = c13889.f41404 == null ? new int[]{R.string.MT_Protector, R.string.MT_Protector} : new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector};
            String[] strArr3 = new String[iArr3.length];
            for (int i7 = 0; i7 < iArr3.length; i7++) {
                strArr3[i7] = getString(iArr3[i7]);
            }
            int i8 = DialogInterfaceC0206.f1451;
            C19258 c192510 = new C19258(this);
            c192510.m44430(strArr3, new DialogInterface.OnClickListener() { // from class: l.ܳ᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i9) {
                    boolean z3 = ActivityC21107.f68088;
                    int i10 = iArr3[i9];
                    final ActivityC21107 activityC21107 = this.f45219;
                    C13889 c138810 = c13889;
                    final int i11 = i6;
                    if (i10 == R.string.MT_Protector) {
                        new C17578(activityC21107).m41101(i11, c138810);
                        return;
                    }
                    if (i10 == R.string.MT_Protector) {
                        ActivityC6142.f18914 = c138810;
                        activityC21107.startActivity(new Intent(activityC21107, (Class<?>) ActivityC6142.class));
                    } else if (i10 == R.string.MT_Protector) {
                        int i12 = DialogInterfaceC0206.f1451;
                        C19258 c192511 = new C19258(activityC21107);
                        c192511.m44433(R.string.MT_Protector);
                        c192511.m44424(c138810.f41402.f70681.m28273());
                        final boolean z4 = z2;
                        c192511.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܿ᩹ܽ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i13) {
                                ActivityC21107.m48067(activityC21107, z4, i11);
                            }
                        });
                        c192511.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                        c192511.m44438();
                    }
                }
            });
            c192510.m44438();
            return true;
        }
        if (i2 != 8) {
            return false;
        }
        final boolean z3 = i < this.f68093.f56836.size();
        if (!z3) {
            i -= this.f68093.f56836.size();
        }
        final int i9 = i;
        final C23062 c23062 = (C23062) (z3 ? this.f68093.f56836 : this.f68093.f56835).get(i9);
        final int[] iArr4 = {R.string.MT_Protector, R.string.MT_Protector};
        String[] strArr4 = new String[2];
        for (int i10 = 0; i10 < 2; i10++) {
            strArr4[i10] = getString(iArr4[i10]);
        }
        int i11 = DialogInterfaceC0206.f1451;
        C19258 c192511 = new C19258(this);
        c192511.m44430(strArr4, new DialogInterface.OnClickListener() { // from class: l.ۧ᩹ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                boolean z4 = ActivityC21107.f68088;
                int i13 = iArr4[i12];
                final ActivityC21107 activityC21107 = this.f33830;
                C23062 c23063 = c23062;
                final int i14 = i9;
                if (i13 == R.string.MT_Protector) {
                    new C16872(activityC21107).m39671(i14, c23063);
                    return;
                }
                if (i13 == R.string.MT_Protector) {
                    int i15 = DialogInterfaceC0206.f1451;
                    C19258 c192512 = new C19258(activityC21107);
                    c192512.m44433(R.string.MT_Protector);
                    c192512.m44424(c23063.f74187.f57398.m28273());
                    final boolean z5 = z3;
                    c192512.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳ᩹ܽ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i16) {
                            ActivityC21107.m48057(activityC21107, z5, i14);
                        }
                    });
                    c192512.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                    c192512.m44438();
                }
            }
        });
        c192511.m44438();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48059(final ActivityC21107 activityC21107, int[] iArr, final String str, final boolean z, int i) {
        int i2 = iArr[i];
        if (i2 == R.string.MT_Protector) {
            C4925.m14314((CharSequence) ((C11258) activityC21107.f68093.f56832.get(activityC21107.f68093.f56843.f77599 + str)).m27862().m50835());
            return;
        }
        if (i2 == R.string.MT_Protector) {
            int i3 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC21107);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44424(str);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ᩹ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC21107.m48058(this.f52005, z, str);
                }
            });
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        if (i2 == R.string.MT_Protector) {
            C8469 c8469 = new C8469(activityC21107, activityC21107, str, z);
            c8469.m31258(R.string.MT_Protector);
            c8469.m31250((CharSequence) str);
            c8469.m31244();
            c8469.m31279(6);
            c8469.m31281();
            c8469.m31266(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public void m48061() {
        C23928 c23928;
        C18284 c18284 = this.f68093;
        String str = c18284.f56843.f77599;
        c18284.f56843 = c18284.f56847.f45069;
        loop0: while (!this.f68093.f56843.f77599.equals(str)) {
            int size = this.f68093.f56843.f77603.size();
            do {
                size--;
                if (size < 0) {
                    break loop0;
                } else {
                    c23928 = (C23928) this.f68093.f56843.f77603.get(size);
                }
            } while (!str.startsWith(c23928.f77599));
            this.f68093.f56843 = c23928;
        }
        this.f68092.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48057(ActivityC21107 activityC21107, boolean z, int i) {
        if (z) {
            activityC21107.f68093.f56834.m27863().m20253(i);
            activityC21107.f68093.f56836.remove(i);
        } else {
            activityC21107.f68093.f56834.m27863().m20255(i);
            activityC21107.f68093.f56835.remove(i);
        }
        activityC21107.f68092.notifyDataSetChanged();
        f68088 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48067(ActivityC21107 activityC21107, boolean z, int i) {
        if (z) {
            activityC21107.f68093.f56834.m27863().m20247(i);
            activityC21107.f68093.f56852.remove(i);
        } else {
            activityC21107.f68093.f56834.m27863().m20252(i);
            activityC21107.f68093.f56850.remove(i);
        }
        activityC21107.f68092.notifyDataSetChanged();
        f68088 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m48049(EnumC6995 enumC6995) {
        C23928 c23928;
        this.f68093.f56831.mo1669(enumC6995);
        this.f68092.m10504(true);
        this.f68092.m10506();
        this.f68092.notifyDataSetChanged();
        C18284 c18284 = this.f68093;
        c18284.f56830 = false;
        if (enumC6995 == EnumC6995.CLASS_LIST && (c23928 = c18284.f56843) != null) {
            Integer num = (Integer) c18284.f56849.get(c23928.f77599);
            if (num == null) {
                this.f68089.setSelection(0);
                return;
            } else {
                this.f68089.setSelection(num.intValue());
                return;
            }
        }
        this.f68089.setSelection(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48058(ActivityC21107 activityC21107, boolean z, String str) {
        if (z) {
            String str2 = activityC21107.f68093.f56843.f77599 + str.replace('.', '/') + '/';
            for (Map.Entry entry : activityC21107.f68093.f56832.entrySet()) {
                if (((String) entry.getKey()).startsWith(str2)) {
                    activityC21107.f68093.f56840.f10940.m25236().remove(entry.getValue());
                }
            }
        } else {
            activityC21107.f68093.f56840.f10940.m25236().remove(activityC21107.f68093.f56832.get(activityC21107.f68093.f56843.f77599 + str.replace('.', '/')));
        }
        f68088 = true;
        activityC21107.f68093.f56832.clear();
        for (C11258 c11258 : activityC21107.f68093.f56840.f10940.m25236()) {
            activityC21107.f68093.f56832.put(C15472.m36561(1, 1, c11258.m27862().m50835()), c11258);
        }
        C18284 c18284 = activityC21107.f68093;
        c18284.f56847.m35066(c18284.f56832.keySet());
        activityC21107.m48061();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48054(ActivityC21107 activityC21107, String str, String str2) {
        for (C22755 c22755 : activityC21107.f68093.f56840.f10926.m25236()) {
            String strM50835 = c22755.m50835();
            int i = 1;
            for (int i2 = 0; i2 < strM50835.length() && strM50835.charAt(i2) == '['; i2++) {
                i++;
            }
            int iIndexOf = strM50835.indexOf(str);
            if (iIndexOf != -1 && iIndexOf == i) {
                c22755.m50833(strM50835.replace(str, str2));
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m48062(ActivityC21107 activityC21107) {
        int i;
        HashSet hashSet = new HashSet();
        Iterator it = activityC21107.f68093.f56840.f10940.m25236().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C7540 c7540M27863 = ((C11258) it.next()).m27863();
            if (c7540M27863 != null) {
                for (C13889 c13889 : c7540M27863.m20249()) {
                    m48050(c13889, hashSet);
                }
                C13889[] c13889ArrM20254 = c7540M27863.m20254();
                int length = c13889ArrM20254.length;
                while (i < length) {
                    m48050(c13889ArrM20254[i], hashSet);
                    i++;
                }
            }
        }
        activityC21107.f68093.f56839 = new C11467[hashSet.size()];
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            activityC21107.f68093.f56839[i] = (C11467) it2.next();
            i++;
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48050(C13889 c13889, HashSet hashSet) {
        C4160 c4160 = c13889.f41404;
        if (c4160 != null) {
            for (AbstractC2043 abstractC2043 : c4160.f13573) {
                int i = C15523.f47452[abstractC2043.mo2742().ordinal()];
                if ((i == 1 || i == 2) && abstractC2043.f6840.f77584 == EnumC6982.string) {
                    hashSet.add((C11467) ((AbstractC16859) abstractC2043).m39631());
                }
            }
        }
    }
}
