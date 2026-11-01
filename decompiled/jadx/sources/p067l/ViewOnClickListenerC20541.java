package p067l;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩵֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20541 extends AbstractActivityC5549 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۟ۧ */
    public static final /* synthetic */ int f63467 = 0;

    /* JADX INFO: renamed from: ֡ۧ */
    public int f63468;

    /* JADX INFO: renamed from: ֨ۧ */
    public C7741 f63469;

    /* JADX INFO: renamed from: ۘۧ */
    public boolean f63472;

    /* JADX INFO: renamed from: ۚۧ */
    public long f63474;

    /* JADX INFO: renamed from: ۛۧ */
    public C14102 f63475;

    /* JADX INFO: renamed from: ۜۧ */
    public View f63476;

    /* JADX INFO: renamed from: ۠ۧ */
    public final AtomicInteger f63477;

    /* JADX INFO: renamed from: ۡۧ */
    public final int f63478;

    /* JADX INFO: renamed from: ۢۧ */
    public final C10748 f63479;

    /* JADX INFO: renamed from: ۨۧ */
    public int f63481;

    /* JADX INFO: renamed from: ۬ۧ */
    public List f63483;

    /* JADX INFO: renamed from: ܰۧ */
    public C18310 f63484;

    /* JADX INFO: renamed from: ܳۧ */
    public C7654 f63485;

    /* JADX INFO: renamed from: ܺۧ */
    public EditText f63487;

    /* JADX INFO: renamed from: ܿۧ */
    public C12902 f63488;

    /* JADX INFO: renamed from: ᩳۧ */
    public C14366 f63489;

    /* JADX INFO: renamed from: ᩴۧ */
    public String f63490;

    /* JADX INFO: renamed from: ᩵ۧ */
    public List f63491;

    /* JADX INFO: renamed from: ᩶ۧ */
    public C24790 f63492;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C21103 f63493;

    /* JADX INFO: renamed from: ᩸ۧ */
    public List f63494;

    /* JADX INFO: renamed from: ᩹ۧ */
    public C4694 f63495;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C16407 f63497;

    /* JADX INFO: renamed from: ۫ۧ */
    public final HashSet f63482 = new HashSet();

    /* JADX INFO: renamed from: ۤۧ */
    public final HashSet f63480 = new HashSet();

    /* JADX INFO: renamed from: ᩺ۧ */
    public final C19199 f63496 = new C19199(this);

    /* JADX INFO: renamed from: ۗۧ */
    public int f63471 = ApplicationC21448.f67649.getInt("fcsp", 0);

    /* JADX INFO: renamed from: ۙۧ */
    public boolean f63473 = ApplicationC21448.f67649.getBoolean("fcrp", false);

    /* JADX INFO: renamed from: ۖۧ */
    public String f63470 = "";

    /* JADX INFO: renamed from: ܶۧ */
    public int f63486 = R.string.MT_Protector;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "FilePickerActivity";
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        C13045.m29867(menu, "menu");
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        SubMenu subMenu = menu.findItem(R.id.MT_Protector).getSubMenu();
        C13045.m29861(subMenu);
        ArrayList arrayList = new ArrayList();
        subMenu.clear();
        MenuItem menuItemAdd = subMenu.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector);
        C13045.m29865(menuItemAdd, "add(...)");
        C21265 c21265 = C21265.f66826;
        C13045.m29865(c21265, "ROOT");
        m46375(menuItemAdd, c21265);
        arrayList.add("/");
        MenuItem menuItemAdd2 = subMenu.add(R.id.MT_Protector, R.string.MT_Protector, 0, R.string.MT_Protector);
        C13045.m29865(menuItemAdd2, "add(...)");
        C21265 c21266 = C21265.f66816;
        C13045.m29865(c21266, "SDCARD");
        m46375(menuItemAdd2, c21266);
        arrayList.add(C17853.f53287.mo25505());
        for (C6376 c6376 : (ArrayList) C21129.m47755()) {
            MenuItem menuItemAdd3 = subMenu.add(R.id.MT_Protector, arrayList.size() + R.string.MT_Protector, 0, c6376.f16499);
            C13045.m29865(menuItemAdd3, "add(...)");
            C21265 c21267 = C21265.f66816;
            C13045.m29865(c21267, "SDCARD");
            m46375(menuItemAdd3, c21267);
            arrayList.add(c6376.f16500.getPath());
        }
        for (C6196 c6196 : C20278.m45812()) {
            MenuItem menuItemAdd4 = subMenu.add(R.id.MT_Protector, arrayList.size() + R.string.MT_Protector, 0, c6196.f15596);
            C13045.m29865(menuItemAdd4, "add(...)");
            C21265 c21268 = C21265.f66817;
            C13045.m29865(c21268, "FOLDER");
            m46375(menuItemAdd4, c21268);
            arrayList.add(c6196.m14040());
        }
        this.f63483 = arrayList;
        return true;
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C13045.m29867(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C18310 c18310 = this.f63484;
        if (c18310 != null) {
            C11996 c11996 = new C11996();
            c18310.mo8201(c11996);
            bundle.putByteArray("visitorData", c11996.m27464());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46375(MenuItem menuItem, C21265 c21265) {
        C13045.m29867(c21265, "typeIcon");
        menuItem.setIcon(c21265.f66884.m30927());
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        C13045.m29867(menuItem, "selectedMenuItem");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.more) {
            SubMenu subMenu = menuItem.getSubMenu();
            C13045.m29861(subMenu);
            subMenu.findItem(R.id.MT_Protector).setChecked(C18825.m42882());
            subMenu.findItem(R.id.MT_Protector).setChecked(C18825.m42880());
            C10027 c10027 = C10027.f27775;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m46392(this, false, (InterfaceC4387) null, 2);
            C10027 c10028 = C10027.f27775;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            C7129.m16404();
            C24790 c24790 = this.f63492;
            if (c24790 == null) {
                C13045.m29866("searchView");
                throw null;
            }
            if (!c24790.m54464()) {
                C24790 c24791 = this.f63492;
                if (c24791 != null) {
                    c24791.m54457((String) null);
                } else {
                    C13045.m29866("searchView");
                    throw null;
                }
            }
            C24790 c24792 = this.f63492;
            if (c24792 == null) {
                C13045.m29866("searchView");
                throw null;
            }
            c24792.m54461(true);
            C10027 c10029 = C10027.f27775;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C12494(this);
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean z = !menuItem.isChecked();
            menuItem.setChecked(z);
            C18825.m42879(z);
            m46392(this, true, (InterfaceC4387) null, 4);
            C10027 c100210 = C10027.f27775;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            boolean z2 = !menuItem.isChecked();
            menuItem.setChecked(z2);
            C18825.m42876(z2);
            m46392(this, true, (InterfaceC4387) null, 4);
            C10027 c100211 = C10027.f27775;
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            finish();
            C10027 c100212 = C10027.f27775;
            return true;
        }
        if (menuItem.getGroupId() == R.id.MT_Protector) {
            int i = itemId - R.string.MT_Protector;
            List list = this.f63483;
            if (i >= 0 && i < list.size()) {
                m46377((String) list.get(i), (InterfaceC4387) null);
                return true;
            }
        }
        return false;
    }

    public ViewOnClickListenerC20541() {
        List list = Collections.EMPTY_LIST;
        C13045.m29865(list, "emptyList(...)");
        this.f63494 = list;
        this.f63491 = list;
        this.f63468 = -1;
        this.f63478 = ApplicationC21448.f67650.getInt("fltp", 0);
        this.f63472 = true;
        this.f63483 = list;
        this.f63477 = new AtomicInteger();
        this.f63479 = C10748.m24757();
    }

    /* JADX INFO: renamed from: ܽ */
    public static final void m46423(ViewOnClickListenerC20541 viewOnClickListenerC20541, int i) {
        viewOnClickListenerC20541.f63471 = i;
        ApplicationC21448.f67649.edit().mo27875(i, "fcsp").apply();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m46391(ViewOnClickListenerC20541 viewOnClickListenerC20541, boolean z) {
        viewOnClickListenerC20541.f63473 = z;
        C24104.m53360(ApplicationC21448.f67649, "fcrp", z);
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12250();
        m12277(R.layout.MT_Protector);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C24563 c24563 = new C24563(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c24563);
        Intent intent = getIntent();
        C13045.m29865(intent, "getIntent(...)");
        if (C13045.m29864((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            setTitle(R.string.MT_Protector);
        } else {
            setTitle(getIntent().getIntExtra("title", R.string.MT_Protector));
        }
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        AbstractC1360 abstractC1360M6355 = m6355();
        if (abstractC1360M6355 != null) {
            abstractC1360M6355.mo28329(true);
        }
        c1326.setNavigationIcon(R.drawable.MT_Protector);
        c1326.setNavigationOnClickListener(new ViewOnClickListenerC11173(this, 2));
        c1326.setSubtitle("...");
        TextView textViewM37071 = C16267.m37071(c1326);
        TextView textViewM37070 = C16267.m37070(c1326);
        textViewM37070.setEllipsize(TextUtils.TruncateAt.START);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: l.ۢ᩵᩷
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ViewOnClickListenerC20541.m46408(this.f32591);
                return true;
            }
        };
        ViewOnClickListenerC13218 viewOnClickListenerC13218 = new ViewOnClickListenerC13218(4, this);
        textViewM37071.setOnClickListener(viewOnClickListenerC13218);
        textViewM37070.setOnClickListener(viewOnClickListenerC13218);
        textViewM37071.setOnLongClickListener(onLongClickListener);
        textViewM37070.setOnLongClickListener(onLongClickListener);
        View viewM12277 = m12277(R.id.file_name);
        C13045.m29865(viewM12277, "view(...)");
        this.f63487 = (EditText) viewM12277;
        View viewM12278 = m12277(R.id.MT_Protector);
        C13045.m29865(viewM12278, "view(...)");
        this.f63495 = (C4694) viewM12278;
        View viewM12279 = m12277(R.id.MT_Protector);
        C13045.m29865(viewM12279, "view(...)");
        this.f63475 = (C14102) viewM12279;
        View viewM122710 = m12277(R.id.MT_Protector);
        C13045.m29865(viewM122710, "view(...)");
        this.f63476 = viewM122710;
        C14366 c14366 = new C14366(this);
        this.f63489 = c14366;
        C4694 c4694 = this.f63495;
        if (c4694 == null) {
            C13045.m29866("recyclerView");
            throw null;
        }
        c4694.setAdapter(c14366);
        C14102 c14102 = this.f63475;
        if (c14102 == null) {
            C13045.m29866("swipeRefreshLayout");
            throw null;
        }
        c14102.m32017(new C6320(this));
        C4694 c4695 = this.f63495;
        if (c4695 == null) {
            C13045.m29866("recyclerView");
            throw null;
        }
        c4695.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC20402(0, this));
        View viewM122711 = m12277(R.id.MT_Protector);
        C13045.m29865(viewM122711, "view(...)");
        this.f63493 = (C21103) viewM122711;
        View viewM122712 = m12277(R.id.MT_Protector);
        C13045.m29865(viewM122712, "view(...)");
        C16407 c16407 = (C16407) viewM122712;
        this.f63497 = c16407;
        final Window window = getWindow();
        final int statusBarColor = window.getStatusBarColor();
        c16407.m37264(new InterfaceC25125() { // from class: l.۠ܺ᩷
            {
                int i = 378135578;
                int i2 = C1404.f82149;
                int i3 = C1053.f81965;
                int iM55680 = (i3 - C0873.m55680("ܳۙ")) * 93;
                int i4 = ((iM55680 ^ i2) * (-7675)) ^ 998805692;
                int i5 = 1999966778;
                while (true) {
                    i = ((((i ^ i2) * (-30389)) >> 31) & i4) ^ (iM55680 ^ i5);
                    switch (i) {
                        case -2099925983:
                        case -295996919:
                            C0989.m56095();
                            if (C1036.f81953 >= 0) {
                                iM55680 = C0946.m55979("ۚۨ") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-20653)) ^ (-1660438326);
                                i5 = 1282613871;
                            } else {
                                iM55680 = C0873.m55680("۬᩹") ^ i2;
                                i4 = ((iM55680 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            }
                            break;
                        case -1738940899:
                        case 677106937:
                            if (C0898.f81858 > 0) {
                                iM55680 = (C0873.m55680("۠᩻") ^ i3) * (-29);
                                i4 = ((iM55680 ^ i2) * (-15015)) ^ (-1121003954);
                                i5 = 1293806777;
                            } else {
                                iM55680 = C0873.m55680("۬᩹") ^ i2;
                                i4 = ((iM55680 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            }
                            break;
                        case -1731225997:
                        case 1549832448:
                            if (!C1024.f81946) {
                                iM55680 = C0946.m55979("᩹᩵") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-4399)) ^ (-192937458);
                                i5 = -1743703264;
                            } else {
                                iM55680 = C0873.m55680("۬᩹") ^ i2;
                                i4 = ((iM55680 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            }
                            break;
                        case -1682145256:
                        case 1997411733:
                            if (C0882.m55710() != 0) {
                                iM55680 = C0946.m55979("᩹᩵") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-4399)) ^ (-192937458);
                                i5 = -1743703264;
                            } else {
                                iM55680 = (C0873.m55680("۫᩺") ^ i3) * (-121);
                                i4 = ((iM55680 ^ i2) * 30729) ^ 2075912272;
                                i5 = 1585492723;
                            }
                            break;
                        case -1483417427:
                        case 1393952440:
                            if (C0949.f81897 >= 0) {
                                iM55680 = (C0873.m55680("۠᩻") ^ i3) * (-29);
                                i4 = ((iM55680 ^ i2) * (-15015)) ^ (-1121003954);
                                i5 = 1293806777;
                            } else {
                                iM55680 = C0873.m55680("ᩴۤ") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-29817)) ^ 537929137;
                                i5 = 1335205332;
                            }
                            break;
                        case -1404152556:
                        case 1508495506:
                            C0873.m55678();
                            iM55680 = C0873.m55680("۬᩹") ^ i2;
                            i4 = ((iM55680 ^ i3) * 1145) ^ (-257386873);
                            i5 = 664781107;
                            break;
                        case -1087935225:
                        case -197516435:
                            if (C0946.f81894 != 0) {
                                iM55680 = C0873.m55680("ۨ֨") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-17945)) ^ (-110888860);
                                i5 = -1232511287;
                            } else {
                                iM55680 = C0946.m55979("֨۬") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-14225)) ^ 1203229132;
                                i5 = -2065039263;
                            }
                            break;
                        case -828080094:
                        case 1913811296:
                            if (C0967.f81910 >= 0) {
                                iM55680 = C0873.m55680("۬᩹") ^ i2;
                                i4 = ((iM55680 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                iM55680 = (C0873.m55680("ۤܽ") + i3) * (-55);
                                i4 = ((iM55680 ^ i2) * (-23901)) ^ 609980105;
                                i5 = -1704284219;
                            }
                            break;
                        case -656754227:
                        case 1492118693:
                            if (C0989.m56095() <= 0) {
                                iM55680 = C0873.m55680("۬᩹") ^ i2;
                                i4 = ((iM55680 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                iM55680 = (C0873.m55680("ۧ֡") ^ i3) * 65;
                                i4 = ((iM55680 ^ i2) * (-7859)) ^ 1011723628;
                                i5 = 1459572207;
                            }
                            break;
                        case -324006086:
                        case 1516837388:
                            if (C1071.f81975 <= 0) {
                                iM55680 = C0873.m55680("۬᩹") ^ i2;
                                i4 = ((iM55680 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                iM55680 = (i2 - C0873.m55680("ܽ᩵")) * (-95);
                                i4 = ((iM55680 ^ i3) * (-27671)) ^ (-511741500);
                                i5 = -1671282903;
                            }
                            break;
                        case -206235902:
                        case -148408492:
                            C1048.m56305();
                            throw new RuntimeException();
                        case 493277917:
                        case 1693439367:
                            if (C0845.m55584() <= 0) {
                                iM55680 = C0946.m55979("᩹᩵") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-4399)) ^ (-192937458);
                                i5 = -1743703264;
                            } else {
                                iM55680 = C0873.m55680("ۛᩴ") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-11305)) ^ (-809773808);
                                i5 = -1567531504;
                            }
                            break;
                        case 513647106:
                        case 2101298279:
                            if (RunnableC0871.f81839 >= 0) {
                                iM55680 = C0946.m55979("ۚۨ") ^ i2;
                                i4 = ((iM55680 ^ i3) * (-20653)) ^ (-1660438326);
                                i5 = 1282613871;
                            } else {
                                iM55680 = C0946.m55979("᩵ۡ") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-3851)) ^ 935788946;
                                i5 = -1067110071;
                            }
                            break;
                        case 659389646:
                        case 1992005589:
                            if (C0877.f81843 >= 0) {
                                iM55680 = C0873.m55680("۬᩹") ^ i2;
                                i4 = ((iM55680 ^ i3) * 1145) ^ (-257386873);
                                i5 = 664781107;
                            } else {
                                iM55680 = (C0873.m55680("ܿ᩺") ^ i3) * (-91);
                                i4 = ((iM55680 ^ i2) * 24433) ^ 348974715;
                                i5 = -568678003;
                            }
                            break;
                        case 1281305189:
                        case 1354797337:
                            return;
                        default:
                            if (C0890.m55740()) {
                                iM55680 = (i2 - C0873.m55680("᩻᩷")) * 67;
                                i4 = ((iM55680 ^ i3) * 32059) ^ 486836045;
                                i5 = -717457128;
                            } else {
                                iM55680 = C0946.m55979("᩹᩵") ^ i3;
                                i4 = ((iM55680 ^ i2) * (-4399)) ^ (-192937458);
                                i5 = -1743703264;
                            }
                            break;
                    }
                }
            }

            @Override // p067l.InterfaceC25125
            /* JADX INFO: renamed from: ֫ */
            public final void mo20903(float f) {
                float f2 = 0.0f;
                int i = 0;
                int iArgb = 0;
                int i2 = 0;
                int i3 = 17589096;
                int i4 = C1028.f81950;
                int i5 = C0873.f81841;
                int iM55680 = C0873.m55680("ۨᩴ") ^ i4;
                int i6 = ((iM55680 ^ i5) * 20581) ^ 1912098364;
                int i7 = 50741964;
                while (true) {
                    i3 = ((((i3 ^ i5) * (-9731)) >> 31) & i6) ^ (iM55680 ^ i7);
                    switch (i3) {
                        case -2042076051:
                        case -1415427393:
                            if (RunnableC0938.f81886 >= 0) {
                                iM55680 = (C0873.m55680("ᩳۜ") ^ i5) * (-15);
                                i6 = ((iM55680 ^ i4) * (-27785)) ^ (-205655300);
                                i7 = 81012750;
                            } else {
                                iM55680 = C0946.m55979("֫ۢ") ^ i5;
                                i6 = ((iM55680 ^ i4) * 12945) ^ (-1605008660);
                                i7 = -1685430923;
                            }
                            break;
                        case -1889509855:
                        case -1649277381:
                            i = (int) (f * f2);
                            if (C0863.f81833 <= 0) {
                                iM55680 = (C0873.m55680("ᩳۜ") ^ i5) * (-15);
                                i6 = ((iM55680 ^ i4) * (-27785)) ^ (-205655300);
                                i7 = 81012750;
                            } else {
                                iM55680 = C0946.m55979("᩸ۡ") ^ i4;
                                i6 = ((iM55680 ^ i5) * 27803) ^ 1791791356;
                                i7 = -1396053914;
                            }
                            break;
                        case -1847739401:
                        case 6905280:
                            if (C0866.f81837 >= 0) {
                                iM55680 = (C0873.m55680("ܰۢ") + i5) * (-33);
                                i6 = ((iM55680 ^ i4) * 12567) ^ 179494554;
                                i7 = 214476848;
                            } else {
                                iM55680 = (i4 - C0946.m55979("ۙᩳ")) * 61;
                                i6 = ((iM55680 ^ i5) * 27423) ^ 808652366;
                                i7 = -617143500;
                            }
                            break;
                        case -1415424879:
                        case 2131154139:
                            if (C1036.f81953 < 0) {
                                iM55680 = (i4 - C0873.m55680("ۘ᩵")) * 83;
                                i6 = ((iM55680 ^ i5) * 23619) ^ (-403002387);
                                i7 = -906428753;
                            } else {
                                iM55680 = (i4 - C0946.m55979("ۙᩳ")) * 61;
                                i6 = ((iM55680 ^ i5) * 27423) ^ 808652366;
                                i7 = -617143500;
                            }
                            break;
                        case -1212595423:
                        case -575964113:
                            if (C1017.f81942 >= 0) {
                                iM55680 = (C0873.m55680("ܽ᩹") + i5) * 115;
                                i6 = ((iM55680 ^ i4) * (-26727)) ^ 323234738;
                                i7 = 1924192070;
                            } else {
                                iM55680 = (C0873.m55680("֫ܿ") + i5) * (-115);
                                i6 = ((iM55680 ^ i4) * 11859) ^ 1865461197;
                                i7 = 679239961;
                            }
                            break;
                        case -1071566119:
                        case -815990272:
                            ServiceConnectionC1013.m56157();
                            iM55680 = (i4 - C0946.m55979("ۙᩳ")) * 61;
                            i6 = ((iM55680 ^ i5) * 27423) ^ 808652366;
                            i7 = -617143500;
                            break;
                        case -1053162332:
                        case -575578052:
                            if (C1053.f81965 <= 0) {
                                iM55680 = (C0873.m55680("ܽ᩹") + i5) * 115;
                                i6 = ((iM55680 ^ i4) * (-26727)) ^ 323234738;
                                i7 = 1924192070;
                            } else {
                                iM55680 = (C0873.m55680("ᩴۙ") ^ i4) * (-61);
                                i6 = ((iM55680 ^ i5) * 31995) ^ (-71421780);
                                i7 = -901016287;
                            }
                            break;
                        case -904684566:
                        case 778906968:
                            iArgb = Color.argb(i, 0, 0, 0);
                            if (C0906.m55809() <= 0) {
                                iM55680 = (C0873.m55680("ܰۢ") + i5) * (-33);
                                i6 = ((iM55680 ^ i4) * 12567) ^ 179494554;
                                i7 = 214476848;
                            } else {
                                iM55680 = (C0946.m55979("ۧܰ") + i4) * (-55);
                                i6 = ((iM55680 ^ i5) * 7501) ^ (-2021439419);
                                i7 = -941322319;
                            }
                            break;
                        case -722886382:
                        case 1709177509:
                            if (C1025.f81947 >= 0) {
                                iM55680 = (i4 - C0873.m55680("ۘ᩵")) * 83;
                                i6 = ((iM55680 ^ i5) * 23619) ^ (-403002387);
                                i7 = -906428753;
                            } else {
                                iM55680 = C0946.m55979("ܽᩳ") ^ i4;
                                i6 = ((iM55680 ^ i5) * (-465)) ^ 496596849;
                                i7 = 121572906;
                            }
                            break;
                        case -645860119:
                        case 1138435128:
                            C1024.m56209();
                            if (C1404.f82149 >= 0) {
                                iM55680 = (C0873.m55680("ܽ᩹") + i5) * 115;
                                i6 = ((iM55680 ^ i4) * (-26727)) ^ 323234738;
                                i7 = 1924192070;
                            } else {
                                iM55680 = (i4 - C0946.m55979("ۙᩳ")) * 61;
                                i6 = ((iM55680 ^ i5) * 27423) ^ 808652366;
                                i7 = -617143500;
                            }
                            break;
                        case -538215086:
                        case 549805391:
                            i2 = statusBarColor;
                            if (C0890.m55740()) {
                                iM55680 = (i5 - C0873.m55680("֨۠")) * (-37);
                                i6 = ((iM55680 ^ i4) * (-29321)) ^ (-532664170);
                                i7 = 443764472;
                            } else {
                                iM55680 = (C0873.m55680("ܽ᩹") + i5) * 115;
                                i6 = ((iM55680 ^ i4) * (-26727)) ^ 323234738;
                                i7 = 1924192070;
                            }
                            break;
                        case -17527294:
                        case 1015015421:
                            window.setStatusBarColor(C1199.m21221(iArgb, i2));
                            break;
                        case 596721634:
                        case 1522163467:
                            C0861.m55626();
                            break;
                        case 845772115:
                        case 1783509739:
                            int i8 = AbstractActivityC5549.f13384;
                            if (C0866.f81837 >= 0) {
                                iM55680 = (C0873.m55680("ܰۢ") + i5) * (-33);
                                i6 = ((iM55680 ^ i4) * 12567) ^ 179494554;
                                i7 = 214476848;
                            } else {
                                iM55680 = (i4 - C0873.m55680("ۧܳ")) * (-81);
                                i6 = ((iM55680 ^ i5) * (-11253)) ^ 1501969197;
                                i7 = 1353860667;
                            }
                            break;
                        case 954397971:
                        case 1642511385:
                            if (C0890.f81849 != 0) {
                                iM55680 = (C0873.m55680("ܽ᩹") + i5) * 115;
                                i6 = ((iM55680 ^ i4) * (-26727)) ^ 323234738;
                                i7 = 1924192070;
                            } else {
                                iM55680 = (i5 - C0873.m55680("᩹ܶ")) * (-15);
                                i6 = ((iM55680 ^ i4) * (-23753)) ^ 847528502;
                                i7 = 697964724;
                            }
                            break;
                        default:
                            f2 = 102.0f;
                            if (C0917.f81868) {
                                iM55680 = (C0873.m55680("ᩳۜ") ^ i5) * (-15);
                                i6 = ((iM55680 ^ i4) * (-27785)) ^ (-205655300);
                                i7 = 81012750;
                            } else {
                                iM55680 = (i5 - C0873.m55680("ۚ֨")) * 43;
                                i6 = ((iM55680 ^ i4) * 1377) ^ (-582707593);
                                i7 = -1259090359;
                            }
                            break;
                    }
                    return;
                }
            }
        });
        C2996 c2996 = (C2996) m12277(R.id.MT_Protector);
        C21103 c21103 = this.f63493;
        if (c21103 == null) {
            C13045.m29866("bottomToolbar");
            throw null;
        }
        c2996.m5041(c21103);
        final C21103 c21104 = this.f63493;
        if (c21104 == null) {
            C13045.m29866("bottomToolbar");
            throw null;
        }
        C16407 c16408 = this.f63497;
        if (c16408 == null) {
            C13045.m29866("bottomSlideLayout");
            throw null;
        }
        c21104.m47719(c16408);
        c21104.m47717();
        c21104.m47715(R.drawable.MT_Protector, R.drawable.MT_Protector).m40332(false);
        c21104.m47715(R.drawable.MT_Protector, R.drawable.MT_Protector).m40332(false);
        c21104.m47726(R.drawable.MT_Protector, 45);
        C17748 c17748M47716 = c21104.m47716(new C20124(c21104));
        c17748M47716.m40333();
        c17748M47716.m40332(false);
        c21104.m47715(R.drawable.MT_Protector, R.drawable.MT_Protector);
        c21104.setOnClickListener(new ViewOnClickListenerC21073(C10748.m24756(200), this, c21104, 0));
        c21104.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.֡᩵᩷
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ViewOnClickListenerC20541.m46393(c21104, this);
                return true;
            }
        });
        View viewM122713 = m12277(R.id.searchView);
        C13045.m29865(viewM122713, "view(...)");
        C24790 c24790 = (C24790) viewM122713;
        this.f63492 = c24790;
        c24790.m54459(true);
        C24790 c24791 = this.f63492;
        if (c24791 == null) {
            C13045.m29866("searchView");
            throw null;
        }
        c24791.m54458(new C8470(this));
        this.f63488 = new C12902(this, new Runnable() { // from class: l.ۚ᩵᩷
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC20541.m46392(this.f20092, true, (InterfaceC4387) null, 4);
            }
        });
        this.f63469 = C10423.m24117(this, new InterfaceC21153() { // from class: l.֨᩵᩷
            @Override // p067l.InterfaceC21153
            /* JADX INFO: renamed from: ֫ */
            public final void mo6900(Intent intent2, int i) {
                ViewOnClickListenerC20541.m46383(this.f7572, i, intent2);
            }
        });
        C3513.m6290(this);
        C21272.m48054();
        if (C11164.m25782()) {
            m46374(bundle);
            return;
        }
        C14853 c14853 = new C14853(this, R.string.MT_Protector);
        c14853.m33958(500);
        new Thread(new RunnableC10343(c14853, this, bundle, 0)).start();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m46408(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        C18310 c18310 = viewOnClickListenerC20541.f63484;
        if (c18310 != null) {
            C7050.m16211((CharSequence) c18310.m41983());
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m46422(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        viewOnClickListenerC20541.m46430();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46381(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        int i = viewOnClickListenerC20541.f63468;
        long j = viewOnClickListenerC20541.f63474;
        if (i == -1 || j == 0) {
            return;
        }
        if (System.currentTimeMillis() > j) {
            viewOnClickListenerC20541.f63474 = 0L;
            return;
        }
        C4694 c4694 = viewOnClickListenerC20541.f63495;
        if (c4694 == null) {
            C13045.m29866("recyclerView");
            throw null;
        }
        if (i >= c4694.m9943()) {
            C4694 c4695 = viewOnClickListenerC20541.f63495;
            if (c4695 == null) {
                C13045.m29866("recyclerView");
                throw null;
            }
            if (i <= c4695.m9944()) {
                return;
            }
        }
        C4694 c4696 = viewOnClickListenerC20541.f63495;
        if (c4696 == null) {
            C13045.m29866("recyclerView");
            throw null;
        }
        c4696.scrollToPosition(i);
        viewOnClickListenerC20541.f63468 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46378(C10748 c10748, final ViewOnClickListenerC20541 viewOnClickListenerC20541, C21103 c21103) {
        C18310 c18310;
        C18310 c18311;
        C19199 c19199 = viewOnClickListenerC20541.f63496;
        if (c10748.m24763()) {
            return;
        }
        if (viewOnClickListenerC20541.m46425() && viewOnClickListenerC20541.m46413() > 0) {
            int iM47731 = c21103.m47731();
            if (iM47731 == 0) {
                boolean z = false;
                for (InterfaceC19370 interfaceC19370 : viewOnClickListenerC20541.f63491) {
                    if (interfaceC19370.mo39135() && !interfaceC19370.isChecked()) {
                        interfaceC19370.setChecked(true);
                        z = true;
                    }
                }
                viewOnClickListenerC20541.m46417();
                if (z) {
                    c19199.m43688(false);
                    return;
                }
                return;
            }
            if (iM47731 == 1) {
                boolean z2 = false;
                for (InterfaceC19370 interfaceC19371 : viewOnClickListenerC20541.f63491) {
                    if (interfaceC19371.mo39135()) {
                        interfaceC19371.setChecked(!interfaceC19371.isChecked());
                        z2 = true;
                    }
                }
                viewOnClickListenerC20541.m46417();
                if (z2) {
                    c19199.m43688(false);
                    return;
                }
                return;
            }
            if (iM47731 == 2) {
                if (viewOnClickListenerC20541.m46425()) {
                    boolean zM46415 = viewOnClickListenerC20541.m46415();
                    viewOnClickListenerC20541.m46417();
                    if (zM46415) {
                        c19199.m43688(false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iM47731 != 3) {
                if (iM47731 != 4) {
                    return;
                }
                viewOnClickListenerC20541.m12253(R.string.MT_Protector, R.string.MT_Protector, false);
                return;
            }
            HashSet hashSet = new HashSet();
            for (InterfaceC19370 interfaceC19372 : viewOnClickListenerC20541.f63491) {
                if (interfaceC19372.mo39135() && interfaceC19372.isChecked()) {
                    String name = interfaceC19372.getName();
                    C13045.m29865(name, "getName(...)");
                    hashSet.add(C5649.m12577(name));
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            boolean z3 = false;
            for (InterfaceC19370 interfaceC19373 : viewOnClickListenerC20541.f63491) {
                if (interfaceC19373.mo39135() && !interfaceC19373.isChecked()) {
                    String name2 = interfaceC19373.getName();
                    C13045.m29865(name2, "getName(...)");
                    if (hashSet.contains(C5649.m12577(name2))) {
                        interfaceC19373.setChecked(true);
                        z3 = true;
                    }
                }
            }
            viewOnClickListenerC20541.m46417();
            if (z3) {
                c19199.m43688(false);
                return;
            }
            return;
        }
        int iM47732 = c21103.m47731();
        if (iM47732 == 0) {
            C14102 c14102 = viewOnClickListenerC20541.f63475;
            if (c14102 == null) {
                C13045.m29866("swipeRefreshLayout");
                throw null;
            }
            if (c14102.m32022() || (c18310 = viewOnClickListenerC20541.f63484) == null) {
                return;
            }
            final C4341 c4341M29880 = c18310.f55048.m29880(viewOnClickListenerC20541.m46396());
            String strM41982 = c18310.m41982();
            if (viewOnClickListenerC20541.m46425()) {
                viewOnClickListenerC20541.m46415();
                viewOnClickListenerC20541.m46417();
            }
            String str = c4341M29880.f9710;
            String str2 = c4341M29880.f9709;
            c18310.mo37385(str);
            String strM41983 = c18310.m41982();
            final String strM26414 = (strM41982.length() <= strM41983.length() || !strM41983.equals(C11419.m26416(strM41982))) ? null : C11419.m26414(strM41982);
            if (c4341M29880.f9708) {
                C24790 c24790 = viewOnClickListenerC20541.f63492;
                if (c24790 == null) {
                    C13045.m29866("searchView");
                    throw null;
                }
                c24790.m54457(str2);
                C24790 c24791 = viewOnClickListenerC20541.f63492;
                if (c24791 == null) {
                    C13045.m29866("searchView");
                    throw null;
                }
                c24791.m54461(false);
                C13045.m29865(str2, "filterText");
                viewOnClickListenerC20541.f63470 = str2;
            } else {
                C24790 c24792 = viewOnClickListenerC20541.f63492;
                if (c24792 == null) {
                    C13045.m29866("searchView");
                    throw null;
                }
                if (c24792.m54464()) {
                    viewOnClickListenerC20541.f63470 = "";
                    C24790 c24793 = viewOnClickListenerC20541.f63492;
                    if (c24793 == null) {
                        C13045.m29866("searchView");
                        throw null;
                    }
                    c24793.m54465();
                }
            }
            m46392(viewOnClickListenerC20541, true, new InterfaceC4387() { // from class: l.᩻᩵᩷
                @Override // p067l.InterfaceC4387
                /* JADX INFO: renamed from: ֫ */
                public final Object mo6293() {
                    return ViewOnClickListenerC20541.m46371(this.f80065, c4341M29880, strM26414);
                }
            }, 2);
            viewOnClickListenerC20541.m46427();
            return;
        }
        if (iM47732 != 1) {
            if (iM47732 != 2) {
                if (iM47732 != 4) {
                    return;
                }
                viewOnClickListenerC20541.m46414();
                return;
            }
            View viewM12252 = viewOnClickListenerC20541.m12252(R.layout.MT_Protector);
            final C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
            final TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
            c12096.m32377(new C18528(textView));
            C20671 c20671BuildDialog = viewOnClickListenerC20541.buildDialog();
            c20671BuildDialog.m46715(viewM12252);
            c20671BuildDialog.m46722(false);
            boolean z4 = viewOnClickListenerC20541.f63481 != 0;
            if (z4) {
                ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            } else {
                ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            }
            final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            C7204.m16545(dialogInterfaceC2564M46732);
            C7050.m16226(c12096);
            dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܿ᩵᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewOnClickListenerC20541.m46407(c12096, viewOnClickListenerC20541, dialogInterfaceC2564M46732, textView);
                }
            });
            if (z4) {
                dialogInterfaceC2564M46732.m3859().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ᩵᩷
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ViewOnClickListenerC20541.m46379(c12096, viewOnClickListenerC20541, dialogInterfaceC2564M46732, textView);
                    }
                });
                return;
            }
            return;
        }
        C14102 c14103 = viewOnClickListenerC20541.f63475;
        if (c14103 == null) {
            C13045.m29866("swipeRefreshLayout");
            throw null;
        }
        if (c14103.m32022() || (c18311 = viewOnClickListenerC20541.f63484) == null) {
            return;
        }
        final C4341 c4341M29884 = c18311.f55048.m29884(viewOnClickListenerC20541.m46396());
        String strM41984 = c18311.m41982();
        if (viewOnClickListenerC20541.m46425()) {
            viewOnClickListenerC20541.m46415();
            viewOnClickListenerC20541.m46417();
        }
        String str3 = c4341M29884.f9710;
        String str4 = c4341M29884.f9709;
        c18311.mo37385(str3);
        String strM41985 = c18311.m41982();
        final String strM26415 = (strM41984.length() <= strM41985.length() || !strM41985.equals(C11419.m26416(strM41984))) ? null : C11419.m26414(strM41984);
        if (c4341M29884.f9708) {
            C24790 c24794 = viewOnClickListenerC20541.f63492;
            if (c24794 == null) {
                C13045.m29866("searchView");
                throw null;
            }
            c24794.m54457(str4);
            C24790 c24795 = viewOnClickListenerC20541.f63492;
            if (c24795 == null) {
                C13045.m29866("searchView");
                throw null;
            }
            c24795.m54461(false);
            C13045.m29865(str4, "filterText");
            viewOnClickListenerC20541.f63470 = str4;
        } else {
            C24790 c24796 = viewOnClickListenerC20541.f63492;
            if (c24796 == null) {
                C13045.m29866("searchView");
                throw null;
            }
            if (c24796.m54464()) {
                viewOnClickListenerC20541.f63470 = "";
                C24790 c24797 = viewOnClickListenerC20541.f63492;
                if (c24797 == null) {
                    C13045.m29866("searchView");
                    throw null;
                }
                c24797.m54465();
            }
        }
        m46392(viewOnClickListenerC20541, true, new InterfaceC4387() { // from class: l.ᩳ᩵᩷
            @Override // p067l.InterfaceC4387
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6293() {
                return ViewOnClickListenerC20541.m46406(this.f60022, c4341M29884, strM26415);
            }
        }, 2);
        viewOnClickListenerC20541.m46427();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46393(C21103 c21103, ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        int iM47731 = c21103.m47731();
        if (viewOnClickListenerC20541.m46425() && viewOnClickListenerC20541.m46413() > 0) {
            if (iM47731 != 3) {
                c21103.m47729(iM47731, new int[]{R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector}[iM47731]);
                return;
            } else {
                new C7300(viewOnClickListenerC20541, new C19870(viewOnClickListenerC20541)).m16862();
                return;
            }
        }
        if (c21103.m47727()) {
            if (iM47731 == 0) {
                c21103.m47729(0, R.string.MT_Protector);
                return;
            }
            if (iM47731 == 1) {
                c21103.m47729(1, R.string.MT_Protector);
                return;
            }
            if (iM47731 == 2) {
                c21103.m47729(2, R.string.MT_Protector);
                return;
            }
            if (iM47731 != 3) {
                if (iM47731 != 4) {
                    return;
                }
                viewOnClickListenerC20541.m46430();
                return;
            }
            c21103.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            C24790 c24790 = viewOnClickListenerC20541.f63492;
            if (c24790 == null) {
                C13045.m29866("searchView");
                throw null;
            }
            if (!c24790.m54464()) {
                C24790 c24791 = viewOnClickListenerC20541.f63492;
                if (c24791 != null) {
                    c24791.m54457((String) null);
                } else {
                    C13045.m29866("searchView");
                    throw null;
                }
            }
            C24790 c24792 = viewOnClickListenerC20541.f63492;
            if (c24792 != null) {
                c24792.m54461(true);
            } else {
                C13045.m29866("searchView");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46383(ViewOnClickListenerC20541 viewOnClickListenerC20541, int i, Intent intent) {
        if (i != -1 || intent == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Uri data = intent.getData();
        C12902 c12902 = viewOnClickListenerC20541.f63488;
        if (c12902 != null) {
            c12902.m29573(data);
        } else {
            C13045.m29866("androidDataGranter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46380(C14853 c14853, ViewOnClickListenerC20541 viewOnClickListenerC20541, Bundle bundle) {
        c14853.m33949();
        viewOnClickListenerC20541.m46374(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [l.᩷᩵᩷] */
    /* JADX INFO: renamed from: ֫ */
    private final void m46374(Bundle bundle) {
        String stringExtra;
        String[] stringArrayExtra;
        int intExtra;
        String stringExtra2;
        C18310 c18310;
        Intent intent = getIntent();
        C13045.m29861(intent);
        if (C13045.m29864((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            this.f63481 = (C13045.m29864((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT") && intent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false)) ? 3 : 1;
            this.f63490 = "exportSelectFile";
            stringExtra2 = C17853.f53287.mo25505();
            C13045.m29865(stringExtra2, "getPath(...)");
            stringExtra = null;
            stringArrayExtra = null;
            intExtra = 0;
        } else {
            this.f63481 = intent.getIntExtra("type", 0);
            stringExtra = intent.getStringExtra("initFilename");
            stringArrayExtra = intent.getStringArrayExtra("suffixes");
            intExtra = intent.getIntExtra("customButtonTitle", 0);
            this.f63490 = intent.getStringExtra("initPathKey");
            stringExtra2 = intent.getStringExtra("initPath");
            if (stringExtra2 == null) {
                stringExtra2 = C17853.f53287.mo25505();
                C13045.m29865(stringExtra2, "getPath(...)");
            }
            if (stringExtra2.length() == 0 || !stringExtra2.startsWith("/")) {
                stringExtra2 = C17853.f53287.mo25505();
                C13045.m29865(stringExtra2, "getPath(...)");
            }
        }
        String str = this.f63490;
        if (str != null) {
            stringExtra2 = ApplicationC21448.f67649.getString(str, stringExtra2);
            C13045.m29865(stringExtra2, "getString(...)");
        }
        if (bundle == null || !bundle.containsKey("visitorData")) {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(stringExtra2, new String[0]);
            if (abstractC17043M42109.mo25094() && abstractC17043M42109.mo25093()) {
                stringExtra2 = abstractC17043M42109.m38669();
            }
            c18310 = new C18310(stringExtra2);
        } else {
            c18310 = new C18310(new C14677(bundle.getByteArray("visitorData")));
        }
        this.f63484 = c18310;
        m46427();
        if (stringExtra != null) {
            EditText editText = this.f63487;
            if (editText == null) {
                C13045.m29866("filenameEditText");
                throw null;
            }
            editText.setText(stringExtra);
        }
        if (stringArrayExtra != null) {
            for (String str2 : stringArrayExtra) {
                C13045.m29867(str2, "<this>");
                if (str2.indexOf(46, 0) >= 0) {
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    C13045.m29865(lowerCase, "toLowerCase(...)");
                    this.f63480.add(".".concat(lowerCase));
                } else {
                    String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    C13045.m29865(lowerCase2, "toLowerCase(...)");
                    this.f63482.add(lowerCase2);
                }
            }
        }
        int i = this.f63481;
        if (i == 0) {
            m12277(R.id.button1).setVisibility(0);
            m12277(R.id.divider).setVisibility(0);
            EditText editText2 = this.f63487;
            if (editText2 == null) {
                C13045.m29866("filenameEditText");
                throw null;
            }
            editText2.setVisibility(8);
            TextView textView = (TextView) m12277(R.id.button1);
            textView.setBackgroundTintList(ColorStateList.valueOf(C23223.f73001));
            textView.setOnClickListener(this);
            if (intExtra != 0) {
                textView.setText(intExtra);
            }
        } else if (i == 1) {
            EditText editText3 = this.f63487;
            if (editText3 == null) {
                C13045.m29866("filenameEditText");
                throw null;
            }
            editText3.setVisibility(8);
            View view = this.f63476;
            if (view == null) {
                C13045.m29866("bottomSpace");
                throw null;
            }
            view.setVisibility(8);
        } else if (i == 2) {
            m12277(R.id.button2).setVisibility(0);
            m12277(R.id.textView).setVisibility(0);
            m12277(R.id.divider).setVisibility(0);
            TextView textView2 = (TextView) m12277(R.id.button2);
            textView2.setBackgroundTintList(ColorStateList.valueOf(C23223.f73001));
            textView2.setOnClickListener(this);
            if (intExtra != 0) {
                textView2.setText(intExtra);
            }
        } else if (i == 3) {
            m12277(R.id.button1).setVisibility(0);
            m12277(R.id.divider).setVisibility(0);
            EditText editText4 = this.f63487;
            if (editText4 == null) {
                C13045.m29866("filenameEditText");
                throw null;
            }
            editText4.setVisibility(8);
            TextView textView3 = (TextView) m12277(R.id.button1);
            textView3.setBackgroundTintList(ColorStateList.valueOf(C23223.f73001));
            if (intExtra == 0) {
                intExtra = R.string.MT_Protector;
            }
            this.f63486 = intExtra;
            textView3.setOnClickListener(this);
            m46417();
        }
        C19199 c19199 = this.f63496;
        c19199.getClass();
        new Thread(new RunnableC8687(1, c19199.f57384, c19199)).start();
        m46392(this, false, (InterfaceC4387) null, 2);
        this.f63485 = new C7654(this, (C22414) new InterfaceC8304() { // from class: l.᩷᩵᩷
            @Override // p067l.InterfaceC8304
            /* JADX INFO: renamed from: ֫ */
            public final void mo14294(String str3, C19033 c19033) {
                ViewOnClickListenerC20541.m46387(this.f70698, str3, c19033);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46387(ViewOnClickListenerC20541 viewOnClickListenerC20541, String str, C19033 c19033) {
        if (c19033 != null) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        C16407 c16407 = viewOnClickListenerC20541.f63497;
        if (c16407 == null) {
            C13045.m29866("bottomSlideLayout");
            throw null;
        }
        c16407.m37269();
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        C7050.m16206(180L, new RunnableC18664(abstractC17043M42109.mo25087(), viewOnClickListenerC20541, abstractC17043M42109));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46394(boolean z, final ViewOnClickListenerC20541 viewOnClickListenerC20541, final AbstractC17043 abstractC17043) {
        if (z) {
            String strMo25505 = abstractC17043.mo25505();
            C13045.m29865(strMo25505, "getPath(...)");
            viewOnClickListenerC20541.m46377(strMo25505, (InterfaceC4387) null);
            return;
        }
        viewOnClickListenerC20541.m46377(abstractC17043.m38669(), new InterfaceC4387() { // from class: l.ۖ᩵᩷
            @Override // p067l.InterfaceC4387
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6293() {
                return ViewOnClickListenerC20541.m46369(abstractC17043, viewOnClickListenerC20541);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10027 m46369(AbstractC17043 abstractC17043, ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        C19199 c19199 = viewOnClickListenerC20541.f63496;
        String name = abstractC17043.getName();
        C13045.m29865(name, "getName(...)");
        c19199.m43685(name);
        return C10027.f27775;
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f63472) {
            this.f63472 = false;
        } else {
            m46392(this, true, (InterfaceC4387) null, 4);
        }
        C21103 c21103 = this.f63493;
        if (c21103 != null) {
            c21103.m47722();
        } else {
            C13045.m29866("bottomToolbar");
            throw null;
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.InterfaceC14936
    /* JADX INFO: renamed from: ۧ */
    public final void mo121(Intent intent) {
        C7741 c7741 = this.f63469;
        if (c7741 != null) {
            c7741.m17868(intent);
        } else {
            C13045.m29866("launcherForGrantPathPrimary");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    private final void m46427() {
        C18310 c18310;
        C13059 c13059;
        C18310 c18311;
        C13059 c130510;
        C18310 c18312 = this.f63484;
        if (c18312 != null) {
            String strM41982 = c18312.m41982();
            C13045.m29865(strM41982, "getPath(...)");
            C10987.m25348(strM41982, (C19033) null);
            this.f13392.setSubtitle(c18312.m41982());
        }
        C21103 c21103 = this.f63493;
        if (c21103 == null) {
            C13045.m29866("bottomToolbar");
            throw null;
        }
        boolean z = false;
        AbstractC11044 abstractC11044M47714 = c21103.m47714(0);
        abstractC11044M47714.getClass();
        C17748 c17748 = (C17748) abstractC11044M47714;
        C14102 c14102 = this.f63475;
        if (c14102 != null) {
            c17748.m40332((c14102.m32022() || (c18311 = this.f63484) == null || (c130510 = c18311.f55048) == null || !c130510.m29883()) ? false : true);
            C21103 c21104 = this.f63493;
            if (c21104 == null) {
                C13045.m29866("bottomToolbar");
                throw null;
            }
            AbstractC11044 abstractC11044M47715 = c21104.m47714(1);
            abstractC11044M47715.getClass();
            C17748 c17749 = (C17748) abstractC11044M47715;
            C14102 c14103 = this.f63475;
            if (c14103 != null) {
                if (!c14103.m32022() && (c18310 = this.f63484) != null && (c13059 = c18310.f55048) != null && c13059.m29885()) {
                    z = true;
                }
                c17749.m40332(z);
                return;
            }
            C13045.m29866("swipeRefreshLayout");
            throw null;
        }
        C13045.m29866("swipeRefreshLayout");
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46392(ViewOnClickListenerC20541 viewOnClickListenerC20541, boolean z, InterfaceC4387 interfaceC4387, int i) {
        boolean z2 = (i & 2) == 0;
        if ((i & 4) != 0) {
            interfaceC4387 = null;
        }
        InterfaceC4387 interfaceC4388 = interfaceC4387;
        AtomicInteger atomicInteger = viewOnClickListenerC20541.f63477;
        C18310 c18310 = viewOnClickListenerC20541.f63484;
        if (c18310 == null) {
            return;
        }
        AbstractC9381 lifecycle = viewOnClickListenerC20541.getLifecycle();
        C13045.m29865(lifecycle, "<get-lifecycle>(...)");
        new C4447(z2, viewOnClickListenerC20541, c18310, (C22103) lifecycle, z2 ? atomicInteger.get() : atomicInteger.incrementAndGet(), interfaceC4388, z).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m46388(ViewOnClickListenerC20541 viewOnClickListenerC20541, List list) {
        Set setM46401;
        if (viewOnClickListenerC20541.m46425()) {
            setM46401 = viewOnClickListenerC20541.m46401();
        } else {
            setM46401 = C4858.f11046;
        }
        viewOnClickListenerC20541.f63494 = list;
        if (viewOnClickListenerC20541.m46425()) {
            for (InterfaceC19370 interfaceC19370 : viewOnClickListenerC20541.f63494) {
                if (!interfaceC19370.mo39147()) {
                    interfaceC19370.setChecked(interfaceC19370.mo39135() && setM46401.contains(interfaceC19370.getPath()));
                }
            }
        }
        if (viewOnClickListenerC20541.f63470.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC19370 interfaceC19371 = (InterfaceC19370) obj;
                if (!interfaceC19371.mo39148()) {
                    String name = interfaceC19371.getName();
                    C13045.m29865(name, "getName(...)");
                    if (C5235.m11295((CharSequence) name, (CharSequence) viewOnClickListenerC20541.f63470, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list = arrayList;
        }
        viewOnClickListenerC20541.f63491 = list;
        viewOnClickListenerC20541.m46417();
        viewOnClickListenerC20541.f63496.m43688(true);
    }

    /* JADX INFO: renamed from: ܽ֫ */
    private final boolean m46425() {
        return this.f63481 == 3;
    }

    /* JADX INFO: renamed from: ۟ */
    private final HashSet m46401() {
        HashSet hashSet = new HashSet();
        for (InterfaceC19370 interfaceC19370 : this.f63494) {
            if (interfaceC19370.mo39135() && interfaceC19370.isChecked()) {
                hashSet.add(interfaceC19370.getPath());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private final int m46413() {
        int i = 0;
        for (InterfaceC19370 interfaceC19370 : this.f63494) {
            if (interfaceC19370.mo39135() && interfaceC19370.isChecked()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ */
    private final boolean m46415() {
        boolean z = false;
        for (InterfaceC19370 interfaceC19370 : this.f63494) {
            if (!interfaceC19370.mo39147() && interfaceC19370.isChecked()) {
                interfaceC19370.setChecked(false);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m46382(ViewOnClickListenerC20541 viewOnClickListenerC20541, int i) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC19370 interfaceC19370 : viewOnClickListenerC20541.f63491) {
            if (interfaceC19370.mo39135() && interfaceC19370.isChecked()) {
                arrayList.add(C7300.m16859(i, interfaceC19370.getTime()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = false;
        for (InterfaceC19370 interfaceC19371 : viewOnClickListenerC20541.f63491) {
            if (interfaceC19371.mo39135() && !interfaceC19371.isChecked()) {
                Iterator it = arrayList.iterator();
                C13045.m29865(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    C13045.m29865(next, "next(...)");
                    long[] jArr = (long[]) next;
                    if (jArr[0] <= interfaceC19371.getTime() && interfaceC19371.getTime() < jArr[1]) {
                        interfaceC19371.setChecked(true);
                        z = true;
                        break;
                    }
                }
            }
        }
        viewOnClickListenerC20541.m46395(z, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static final void m46410(ViewOnClickListenerC20541 viewOnClickListenerC20541, long j, long j2) {
        boolean z = false;
        for (InterfaceC19370 interfaceC19370 : viewOnClickListenerC20541.f63491) {
            if (interfaceC19370.mo39135()) {
                boolean z2 = j <= interfaceC19370.getTime() && interfaceC19370.getTime() < j2;
                if (interfaceC19370.isChecked() != z2) {
                    interfaceC19370.setChecked(z2);
                    z = true;
                }
            }
        }
        viewOnClickListenerC20541.m46395(z, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m46385(ViewOnClickListenerC20541 viewOnClickListenerC20541, long j, long j2) {
        boolean z = false;
        for (InterfaceC19370 interfaceC19370 : viewOnClickListenerC20541.f63491) {
            if (interfaceC19370.mo39135()) {
                boolean z2 = interfaceC19370.mo26449() && j <= interfaceC19370.getSize() && interfaceC19370.getSize() < j2;
                if (interfaceC19370.isChecked() != z2) {
                    interfaceC19370.setChecked(z2);
                    z = true;
                }
            }
        }
        viewOnClickListenerC20541.m46395(z, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m46389(ViewOnClickListenerC20541 viewOnClickListenerC20541, C5788 c5788) {
        boolean z = false;
        for (InterfaceC19370 interfaceC19370 : viewOnClickListenerC20541.f63491) {
            if (interfaceC19370.mo39135()) {
                String name = interfaceC19370.getName();
                C13045.m29865(name, "getName(...)");
                boolean zBooleanValue = ((Boolean) c5788.invoke(name)).booleanValue();
                if (interfaceC19370.isChecked() != zBooleanValue) {
                    interfaceC19370.setChecked(zBooleanValue);
                    z = true;
                }
            }
        }
        viewOnClickListenerC20541.m46395(z, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m46395(boolean z, boolean z2) {
        m46417();
        if (z) {
            this.f63496.m43688(false);
        }
        if (z2 && m46413() == 0) {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ֫ */
    public final void m46417() {
        if (m46425()) {
            int iM46413 = m46413();
            TextView textView = (TextView) m12277(R.id.button1);
            textView.setText(getString(this.f63486) + MotionUtils.EASING_TYPE_FORMAT_START + iM46413 + MotionUtils.EASING_TYPE_FORMAT_END);
            textView.setEnabled(iM46413 > 0);
            if (iM46413 > 0) {
                C21103 c21103 = this.f63493;
                if (c21103 != null) {
                    c21103.m47723();
                    return;
                } else {
                    C13045.m29866("bottomToolbar");
                    throw null;
                }
            }
            C21103 c21104 = this.f63493;
            if (c21104 != null) {
                c21104.m47732();
            } else {
                C13045.m29866("bottomToolbar");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m46390(ViewOnClickListenerC20541 viewOnClickListenerC20541, ViewOnClickListenerC12355 viewOnClickListenerC12355) {
        viewOnClickListenerC12355.m28442().setBackgroundColor(viewOnClickListenerC20541.m46425() && viewOnClickListenerC12355.m28439().mo39135() && viewOnClickListenerC12355.m28439().isChecked() ? C23223.f72997 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ */
    public final void m46437() {
        final C18310 c18310;
        C14102 c14102 = this.f63475;
        if (c14102 == null) {
            C13045.m29866("swipeRefreshLayout");
            throw null;
        }
        if (c14102.m32022() || (c18310 = this.f63484) == null) {
            return;
        }
        String strM41982 = c18310.m41982();
        final String strM26414 = C11419.m26414(strM41982);
        final String strM26416 = C11419.m26416(strM41982);
        if (strM26416 == null) {
            if (this.f63479.m24761()) {
                C22682.m50793(R.string.MT_Protector);
                return;
            } else {
                C22682.m50801();
                finish();
                return;
            }
        }
        m46377(strM26416, new InterfaceC4387() { // from class: l.ۜ᩵᩷
            @Override // p067l.InterfaceC4387
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6293() {
                return ViewOnClickListenerC20541.m46370(c18310, strM26416, this, strM26414);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10027 m46370(C18310 c18310, String str, ViewOnClickListenerC20541 viewOnClickListenerC20541, String str2) {
        viewOnClickListenerC20541.f63496.m43684((Integer) c18310.f55048.f36716.getOrDefault(str, null), str2);
        return C10027.f27775;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ */
    public final void m46414() {
        if (m46425() && !m46401().isEmpty()) {
            if (m46425()) {
                boolean zM46415 = m46415();
                m46417();
                if (zM46415) {
                    this.f63496.m43688(false);
                    return;
                }
                return;
            }
            return;
        }
        C24790 c24790 = this.f63492;
        if (c24790 == null) {
            C13045.m29866("searchView");
            throw null;
        }
        if (c24790.m54464()) {
            C24790 c24791 = this.f63492;
            if (c24791 != null) {
                c24791.m54460();
                return;
            } else {
                C13045.m29866("searchView");
                throw null;
            }
        }
        m46437();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10027 m46371(ViewOnClickListenerC20541 viewOnClickListenerC20541, C4341 c4341, String str) {
        viewOnClickListenerC20541.f63496.m43684(Integer.valueOf(c4341.f9711), str);
        return C10027.f27775;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C10027 m46406(ViewOnClickListenerC20541 viewOnClickListenerC20541, C4341 c4341, String str) {
        viewOnClickListenerC20541.f63496.m43684(Integer.valueOf(c4341.f9711), str);
        return C10027.f27775;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m46376(TextView textView, int i) {
        textView.setVisibility(0);
        textView.setText(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m46407(C12096 c12096, final ViewOnClickListenerC20541 viewOnClickListenerC20541, DialogInterfaceC2564 dialogInterfaceC2564, TextView textView) {
        String string = c12096.m32500().toString();
        if (C5235.m11295((CharSequence) string, (CharSequence) "\\", false) || C5235.m11295((CharSequence) string, (CharSequence) "/", false)) {
            m46376(textView, R.string.MT_Protector);
            return;
        }
        C18310 c18310 = viewOnClickListenerC20541.f63484;
        C13045.m29861(c18310);
        final AbstractC17043 abstractC17043M42109 = C18524.m42109(c18310.m41982(), string);
        if (abstractC17043M42109.mo25094()) {
            if (abstractC17043M42109.mo25087()) {
                m46376(textView, R.string.MT_Protector);
                return;
            } else {
                m46376(textView, R.string.MT_Protector);
                return;
            }
        }
        try {
            C18310 c18311 = viewOnClickListenerC20541.f63484;
            C13045.m29861(c18311);
            C19210.m43749(c18311.mo41743(), EnumC17868.MODIFY_DIRECTORY_LINKED);
            try {
                abstractC17043M42109.m38666();
                m46392(viewOnClickListenerC20541, false, new InterfaceC4387() { // from class: l.ܺ᩵᩷
                    @Override // p067l.InterfaceC4387
                    /* JADX INFO: renamed from: ֫ */
                    public final Object mo6293() {
                        return ViewOnClickListenerC20541.m46428(abstractC17043M42109, viewOnClickListenerC20541);
                    }
                }, 2);
                dialogInterfaceC2564.dismiss();
            } catch (Exception e) {
                e = e;
                viewOnClickListenerC20541.m12259(e, (DialogInterface.OnDismissListener) null);
            }
        } catch (C3924 e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C10027 m46428(AbstractC17043 abstractC17043, ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        C19199 c19199 = viewOnClickListenerC20541.f63496;
        String name = abstractC17043.getName();
        C13045.m29865(name, "getName(...)");
        c19199.m43685(name);
        return C10027.f27775;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46379(C12096 c12096, final ViewOnClickListenerC20541 viewOnClickListenerC20541, DialogInterfaceC2564 dialogInterfaceC2564, TextView textView) {
        String string = c12096.m32500().toString();
        if (C5235.m11295((CharSequence) string, (CharSequence) "\\", false) || C5235.m11295((CharSequence) string, (CharSequence) "/", false)) {
            m46376(textView, R.string.MT_Protector);
            return;
        }
        C18310 c18310 = viewOnClickListenerC20541.f63484;
        C13045.m29861(c18310);
        final AbstractC17043 abstractC17043M42109 = C18524.m42109(c18310.m41982(), string);
        if (abstractC17043M42109.mo25094()) {
            if (abstractC17043M42109.mo25087()) {
                m46376(textView, R.string.MT_Protector);
                return;
            } else {
                m46376(textView, R.string.MT_Protector);
                return;
            }
        }
        try {
            C18310 c18311 = viewOnClickListenerC20541.f63484;
            C13045.m29861(c18311);
            C19210.m43749(c18311.mo41743(), EnumC17868.MODIFY_DIRECTORY_LINKED);
            try {
                if (abstractC17043M42109.mo25496()) {
                    m46392(viewOnClickListenerC20541, false, new InterfaceC4387() { // from class: l.ۡ᩵᩷
                        @Override // p067l.InterfaceC4387
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo6293() {
                            return ViewOnClickListenerC20541.m46405(abstractC17043M42109, viewOnClickListenerC20541);
                        }
                    }, 2);
                    dialogInterfaceC2564.dismiss();
                    return;
                }
                throw new Exception("Failed to create file: ".concat(string));
            } catch (Exception e) {
                e = e;
                viewOnClickListenerC20541.m12259(e, (DialogInterface.OnDismissListener) null);
            }
        } catch (C3924 e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C10027 m46405(AbstractC17043 abstractC17043, ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        C19199 c19199 = viewOnClickListenerC20541.f63496;
        String name = abstractC17043.getName();
        C13045.m29865(name, "getName(...)");
        c19199.m43685(name);
        return C10027.f27775;
    }

    /* JADX INFO: renamed from: ֫֫ */
    private final C4341 m46396() {
        C18310 c18310 = this.f63484;
        C13045.m29861(c18310);
        String strM41982 = c18310.m41982();
        int iM43682 = this.f63496.m43682();
        C24790 c24790 = this.f63492;
        if (c24790 != null) {
            return new C4341(strM41982, iM43682, this.f63470, c24790.m54464());
        }
        C13045.m29866("searchView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public final void m46377(String str, InterfaceC4387 interfaceC4387) {
        C18310 c18310 = this.f63484;
        C13045.m29861(c18310);
        c18310.f55048.m29887(m46396());
        if (m46425()) {
            m46415();
            m46417();
        }
        final C25114 c25114 = new C25114();
        if (!C5235.m11298(str, "/", false) && c18310.mo8211(str)) {
            c25114.f80364 = C11419.m26414(str);
            str = C11419.m26416(str);
            C13045.m29865(str, "getParent(...)");
        }
        c18310.mo37385(str);
        C24790 c24790 = this.f63492;
        if (c24790 == null) {
            C13045.m29866("searchView");
            throw null;
        }
        if (c24790.m54464()) {
            this.f63470 = "";
            C24790 c24791 = this.f63492;
            if (c24791 == null) {
                C13045.m29866("searchView");
                throw null;
            }
            c24791.m54465();
        }
        if (interfaceC4387 == null) {
            interfaceC4387 = new InterfaceC4387() { // from class: l.ܽ᩵᩷
                @Override // p067l.InterfaceC4387
                /* JADX INFO: renamed from: ֫ */
                public final Object mo6293() {
                    return ViewOnClickListenerC20541.m46372(c25114, this);
                }
            };
        }
        m46392(this, true, interfaceC4387, 2);
        m46427();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10027 m46372(C25114 c25114, ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        C19199 c19199 = viewOnClickListenerC20541.f63496;
        Object obj = c25114.f80364;
        if (obj == null) {
            c19199.m43683(0);
        } else {
            c19199.m43685((String) obj);
        }
        return C10027.f27775;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    private final void m46430() {
        C18310 c18310 = this.f63484;
        if (c18310 == null) {
            return;
        }
        Object systemService = C7050.m16232().getSystemService("clipboard");
        C13045.m29862(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        C15845 c15845 = new C15845(this);
        c15845.m33344(R.string.MT_Protector);
        c15845.m33336((CharSequence) C8597.m20011(2000, c18310.m41983()));
        c15845.m33367();
        c15845.m33365(2);
        c15845.m33352(true);
        c15845.m33368().setOnClickListener(new ViewOnClickListenerC21546(1, (ClipboardManager) systemService, c15845));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intentPutStringArrayListExtra;
        String strM36347;
        C18310 c18310 = this.f63484;
        if (c18310 == null) {
            return;
        }
        int i = this.f63481;
        if (i == 0) {
            String strM41982 = c18310.m41982();
            C13045.m29865(strM41982, "getPath(...)");
            m46420(strM41982);
            return;
        }
        int i2 = 0;
        int i3 = 3;
        ClipData clipDataNewRawUri = null;
        if (i == 2) {
            String strM41983 = c18310.m41982();
            EditText editText = this.f63487;
            if (editText == null) {
                C13045.m29866("filenameEditText");
                throw null;
            }
            AbstractC17043 abstractC17043M42109 = C18524.m42109(strM41983, editText.getText().toString());
            if (abstractC17043M42109.mo25094()) {
                C20671 c20671BuildDialog = buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46718(getString(R.string.MT_Protector, abstractC17043M42109.getName()));
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13339(i3, abstractC17043M42109, this));
                c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732();
                return;
            }
            String strMo25505 = abstractC17043M42109.mo25505();
            C13045.m29865(strMo25505, "getPath(...)");
            C10987.m25348(strMo25505, (C19033) null);
            String strMo25506 = abstractC17043M42109.mo25505();
            C13045.m29865(strMo25506, "getPath(...)");
            m46420(strMo25506);
            return;
        }
        if (i == 3) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (InterfaceC19370 interfaceC19370 : this.f63494) {
                if (interfaceC19370.mo39135() && interfaceC19370.isChecked()) {
                    arrayList.add(interfaceC19370.getPath());
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            String str = this.f63490;
            if (str != null) {
                C18310 c18311 = this.f63484;
                if (c18311 == null || (strM36347 = c18311.m41982()) == null) {
                    strM36347 = C15993.m36347(arrayList.get(0));
                }
                ApplicationC21448.f67649.edit().putString(str, strM36347).apply();
            }
            Intent intent = getIntent();
            C13045.m29865(intent, "getIntent(...)");
            if (!C13045.m29864((Object) intent.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
                intentPutStringArrayListExtra = new Intent().putStringArrayListExtra("paths", arrayList);
                C13045.m29865(intentPutStringArrayListExtra, "putStringArrayListExtra(...)");
            } else {
                intentPutStringArrayListExtra = new Intent();
                if (arrayList.size() == 1) {
                    intentPutStringArrayListExtra.setData(C13692.m31097(arrayList.get(0)));
                } else {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i4 = i2 + 1;
                        Uri uriM31097 = C13692.m31097(it.next());
                        if (i2 == 0) {
                            clipDataNewRawUri = ClipData.newRawUri("paths", uriM31097);
                        } else if (clipDataNewRawUri != null) {
                            clipDataNewRawUri.addItem(new ClipData.Item(uriM31097));
                        }
                        i2 = i4;
                    }
                    intentPutStringArrayListExtra.setClipData(clipDataNewRawUri);
                }
                if (!arrayList.isEmpty()) {
                    intentPutStringArrayListExtra.addFlags(1);
                    intentPutStringArrayListExtra.addFlags(2);
                }
            }
            setResult(-1, intentPutStringArrayListExtra);
            finish();
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m46421(AbstractC17043 abstractC17043, ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        String strMo25505 = abstractC17043.mo25505();
        C13045.m29865(strMo25505, "getPath(...)");
        C10987.m25348(strMo25505, (C19033) null);
        String strMo25506 = abstractC17043.mo25505();
        C13045.m29865(strMo25506, "getPath(...)");
        viewOnClickListenerC20541.m46420(strMo25506);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public final void m46420(String str) {
        String str2 = this.f63490;
        if (str2 != null) {
            ApplicationC21448.f67649.edit().putString(str2, C15993.m36347(str)).apply();
        }
        Intent intent = new Intent();
        Intent intent2 = getIntent();
        C13045.m29865(intent2, "getIntent(...)");
        if (C13045.m29864((Object) intent2.getAction(), (Object) "android.intent.action.GET_CONTENT")) {
            intent.setData(C13692.m31097(str));
            intent.addFlags(1);
            intent.addFlags(2);
        } else {
            intent.putExtra(MotionUtils.EASING_TYPE_PATH, str);
            Bundle bundleExtra = getIntent().getBundleExtra("extra");
            if (bundleExtra != null) {
                intent.putExtra("extra", bundleExtra);
            }
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: renamed from: ֫ */
    public static final C8331 m46368(AbstractC1815 abstractC1815, String str, InterfaceC24424 interfaceC24424) {
        C13045.m29867(abstractC1815, "registry");
        C13045.m29867(str, "key");
        return new C8331(C10423.m24116(abstractC1815, str, new C14604(interfaceC24424)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static final C8331 m46366(AbstractActivityC5549 abstractActivityC5549, final InterfaceC24424 interfaceC24424) {
        return new C8331(C10423.m24117(abstractActivityC5549, new InterfaceC21153() { // from class: l.ۙ᩵᩷
            @Override // p067l.InterfaceC21153
            /* JADX INFO: renamed from: ֫ */
            public final void mo6900(Intent intent, int i) {
                String stringExtra;
                InterfaceC24424 interfaceC24425 = interfaceC24424;
                if (i == 0) {
                    interfaceC24425.onCanceled();
                } else {
                    if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                        return;
                    }
                    interfaceC24425.mo10533(stringExtra);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: ֫ */
    public static final C8331 m46367(ComponentCallbacksC11117 componentCallbacksC11117, final InterfaceC24424 interfaceC24424) {
        return new C8331(C10423.m24115(componentCallbacksC11117, new InterfaceC21153() { // from class: l.᩶᩵᩷
            @Override // p067l.InterfaceC21153
            /* JADX INFO: renamed from: ֫ */
            public final void mo6900(Intent intent, int i) {
                String stringExtra;
                InterfaceC24424 interfaceC24425 = interfaceC24424;
                if (i == 0) {
                    interfaceC24425.onCanceled();
                } else {
                    if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                        return;
                    }
                    interfaceC24425.mo10533(stringExtra);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: ֫ */
    public static final C15036 m46373(ComponentCallbacksC11117 componentCallbacksC11117, final InterfaceC13696 interfaceC13696) {
        return new C15036(C10423.m24115(componentCallbacksC11117, new InterfaceC21153() { // from class: l.᩸᩵᩷
            @Override // p067l.InterfaceC21153
            /* JADX INFO: renamed from: ֫ */
            public final void mo6900(Intent intent, int i) {
                String stringExtra;
                InterfaceC13696 interfaceC13697 = interfaceC13696;
                if (i == 0) {
                    interfaceC13697.onCanceled();
                    return;
                }
                if (i != -1 || intent == null || (stringExtra = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH)) == null) {
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("extra");
                C13045.m29861(bundleExtra);
                interfaceC13697.onGetPath(bundleExtra, stringExtra);
            }
        }));
    }
}
