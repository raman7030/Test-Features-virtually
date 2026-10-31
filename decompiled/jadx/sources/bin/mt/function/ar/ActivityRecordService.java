package bin.mt.function.ar;

import android.accessibilityservice.AccessibilityService;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import l.ApplicationC20075;
import l.C12201;
import l.C14507;
import l.C18080;
import l.C21282;
import l.C22870;
import l.C23680;
import l.C3060;
import l.C4925;
import l.C6001;
import l.C6554;
import l.C8091;
import l.C9255;
import l.InterfaceC10085;
import l.InterfaceC12344;
import l.InterfaceC14930;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRecordService extends AccessibilityService implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static C23680 f14;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static volatile WeakReference f17;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f18;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f19;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f20;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f21;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f22;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8091 f23;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f24;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final LinkedList f16 = new LinkedList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f15 = ApplicationC20075.f65008.getBoolean("activity_record", false);

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m46() {
        return f15;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42(boolean z) {
        if (f15 != z) {
            f15 = z;
            C22870.m50970(ApplicationC20075.f65008, "activity_record", z);
            ActivityRecordService activityRecordServiceM40 = m40();
            if (activityRecordServiceM40 != null) {
                if (z) {
                    activityRecordServiceM40.f24 = false;
                }
                if (z && ApplicationC20075.f65008.getBoolean("activity_record_floating_enable", true)) {
                    activityRecordServiceM40.f23.m21466();
                } else {
                    activityRecordServiceM40.f23.m21475();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m49() {
        ActivityRecordService activityRecordServiceM40 = m40();
        if (activityRecordServiceM40 != null) {
            activityRecordServiceM40.m43();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m45() {
        ActivityRecordService activityRecordServiceM40 = m40();
        if (activityRecordServiceM40 != null) {
            activityRecordServiceM40.f23.m21466();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44() {
        ActivityRecordService activityRecordServiceM40 = m40();
        if (activityRecordServiceM40 != null) {
            activityRecordServiceM40.f23.m21475();
            activityRecordServiceM40.f24 = false;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48() {
        ActivityRecordService activityRecordServiceM40 = m40();
        if (activityRecordServiceM40 != null) {
            return activityRecordServiceM40.f23.isAttachedToWindow();
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ActivityRecordService m40() {
        WeakReference weakReference = f17;
        if (weakReference != null) {
            return (ActivityRecordService) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m47() {
        return m40() != null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C18080.m42142());
        C8091 c8091 = (C8091) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f23 = c8091;
        this.f22 = (TextView) c8091.findViewById(R.id.textView0);
        this.f19 = (TextView) this.f23.findViewById(R.id.textView1);
        this.f18 = (TextView) this.f23.findViewById(R.id.textView2);
        this.f21 = (TextView) this.f23.findViewById(R.id.textView3);
        this.f20 = (TextView) this.f23.findViewById(R.id.textView4);
        if (!ApplicationC20075.f65008.getBoolean("activity_record_floating_show_single", true)) {
            onClick(this.f23);
        }
        this.f23.setOnClickListener(this);
        this.f23.setOnLongClickListener(this);
        m43();
        if (f15 && ApplicationC20075.f65008.getBoolean("activity_record_floating_enable", true)) {
            this.f23.m21466();
        }
        f17 = new WeakReference(this);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m43() {
        LinkedList linkedList = f16;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            if (it.hasNext()) {
                C23680 c23680 = (C23680) it.next();
                this.f22.setText(c23680.f76709);
                this.f19.setText(c23680.f76708);
            } else {
                this.f22.setText(R.string.MT_Protector);
                this.f19.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f18.setText(((C23680) it.next()).f76708);
            } else {
                this.f18.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f21.setText(((C23680) it.next()).f76708);
            } else {
                this.f21.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f20.setText(((C23680) it.next()).f76708);
            } else {
                this.f20.setText((CharSequence) null);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        WeakReference weakReference = f17;
        if (weakReference != null && weakReference.get() == this) {
            f17 = null;
        }
        this.f23.m21475();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50(ActivityInfo activityInfo) {
        CharSequence charSequenceLoadLabel = activityInfo.loadLabel(getPackageManager());
        if (TextUtils.isEmpty(charSequenceLoadLabel) || charSequenceLoadLabel.toString().trim().isEmpty()) {
            return m51(activityInfo.packageName);
        }
        return charSequenceLoadLabel.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m51(String str) {
        PackageManager packageManager = getPackageManager();
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (Exception unused) {
            return "null";
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0105 A[EDGE_INSN: B:60:0x0105->B:61:0x0106 BREAK  A[LOOP:0: B:38:0x009e->B:59:0x0102]] */
    @Override // android.accessibilityservice.AccessibilityService
    public final void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ActivityInfo activityInfo;
        String strSubstring;
        ActivityInfo activityInfo2;
        if (!f15 || this.f24 || accessibilityEvent.getEventType() != 32 || accessibilityEvent.getClassName() == null || accessibilityEvent.getPackageName() == null) {
            return;
        }
        C23680 c23680 = new C23680();
        String string = accessibilityEvent.getClassName().toString();
        String string2 = accessibilityEvent.getPackageName().toString();
        c23680.f76710 = string2;
        c23680.f76708 = string;
        if (string2.equals(getPackageName()) || c23680.equals(f14) || string2.equals("bin.mt.plus") || string2.equals("bin.mt.plus.canary") || string2.equals("bin.mt.plus")) {
            return;
        }
        try {
            activityInfo = getPackageManager().getActivityInfo(new ComponentName(string2, string), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            activityInfo = null;
        }
        if (activityInfo == null) {
            InterfaceC10085 interfaceC10085M23776 = C9255.m23776();
            if (interfaceC10085M23776 == null || !interfaceC10085M23776.mo25346()) {
                strSubstring = null;
                break;
            }
            C12201 c12201Mo25342 = interfaceC10085M23776.mo25342(600L, "dumpsys activity activities");
            if (!c12201Mo25342.f36414.isEmpty()) {
                strSubstring = null;
                break;
            }
            String[] strArr = c12201Mo25342.f36415;
            int length = strArr.length;
            int i = 0;
            boolean z = false;
            loop0: while (true) {
                if (i < length) {
                    String str = strArr[i];
                    if (z) {
                        if (str.contains("ActivityRecord")) {
                            if (str.contains(" " + string2 + "/")) {
                                for (String str2 : str.split(" ")) {
                                    if (str2.startsWith(string2.concat("/"))) {
                                        strSubstring = str2.substring(string2.length() + 1);
                                        if (!strSubstring.startsWith(".")) {
                                            break loop0;
                                        }
                                        strSubstring = string2.concat(strSubstring);
                                        break loop0;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else if (str.isEmpty()) {
                        }
                    } else if (str.contains("Running activities")) {
                        z = true;
                    }
                    i++;
                }
                strSubstring = null;
                break;
            }
            if (strSubstring == null) {
                try {
                    ClassLoader.getSystemClassLoader().loadClass(string);
                    return;
                } catch (ClassNotFoundException unused2) {
                    c23680.f76709 = m51(string2);
                }
            } else {
                try {
                    activityInfo2 = getPackageManager().getActivityInfo(new ComponentName(string2, strSubstring), 0);
                } catch (PackageManager.NameNotFoundException unused3) {
                    activityInfo2 = null;
                }
                if (activityInfo2 == null) {
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(string);
                        return;
                    } catch (ClassNotFoundException unused4) {
                        c23680.f76709 = m51(string2);
                    }
                } else {
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(string);
                        c23680.f76708 = strSubstring;
                    } catch (ClassNotFoundException unused5) {
                        c23680.f76708 = C22870.m50967(strSubstring, " > ", string);
                    }
                    if (c23680.equals(f14)) {
                        return;
                    } else {
                        c23680.f76709 = m50(activityInfo2);
                    }
                }
            }
        } else {
            c23680.f76709 = m50(activityInfo);
        }
        LinkedList linkedList = f16;
        synchronized (linkedList) {
            if (linkedList.size() > 30) {
                linkedList.removeLast();
            }
            linkedList.addFirst(c23680);
        }
        m43();
        f14 = c23680;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12344 interfaceC12344;
        boolean z = false;
        if (this.f18.getVisibility() == 0) {
            this.f18.setVisibility(8);
            this.f21.setVisibility(8);
            this.f20.setVisibility(8);
            interfaceC12344 = ApplicationC20075.f65008;
        } else {
            this.f18.setVisibility(0);
            this.f21.setVisibility(0);
            this.f20.setVisibility(0);
            interfaceC12344 = ApplicationC20075.f65008;
            z = true;
        }
        C22870.m50970(interfaceC12344, "activity_record_floating_show_single", z);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C21282 c21282 = new C21282(this, view, 0);
        C3060 c3060M48304 = c21282.m48304();
        if (this.f18.getVisibility() == 0 && this.f19.length() > 0) {
            SubMenu subMenuAddSubMenu = c3060M48304.addSubMenu(R.string.MT_Protector);
            subMenuAddSubMenu.add(0, 1, 0, this.f19.getText());
            if (this.f18.length() > 0) {
                subMenuAddSubMenu.add(0, 2, 0, C6554.m18061(30, this.f18.getText().toString()));
            }
            if (this.f21.length() > 0) {
                subMenuAddSubMenu.add(0, 3, 0, C6554.m18061(30, this.f21.getText().toString()));
            }
            if (this.f20.length() > 0) {
                subMenuAddSubMenu.add(0, 4, 0, C6554.m18061(30, this.f20.getText().toString()));
            }
        } else {
            c3060M48304.add(0, 1, 0, R.string.MT_Protector).setEnabled(this.f19.length() > 0);
        }
        c3060M48304.add(0, 15, 0, this.f24 ? R.string.MT_Protector : R.string.MT_Protector);
        c3060M48304.add(0, 16, 0, R.string.MT_Protector);
        c3060M48304.add(0, 17, 0, R.string.MT_Protector);
        c3060M48304.add(0, 18, 0, R.string.MT_Protector);
        c21282.m48302((InterfaceC14930) new C6001(2, this));
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41(ActivityRecordService activityRecordService, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C4925.m14314((CharSequence) activityRecordService.f19.getText().toString());
            return;
        }
        if (itemId == 2) {
            C4925.m14314((CharSequence) activityRecordService.f18.getText().toString());
            return;
        }
        if (itemId == 3) {
            C4925.m14314((CharSequence) activityRecordService.f21.getText().toString());
            return;
        }
        if (itemId == 4) {
            C4925.m14314((CharSequence) activityRecordService.f20.getText().toString());
            return;
        }
        switch (itemId) {
            case 15:
                boolean z = activityRecordService.f24;
                activityRecordService.f24 = !z;
                menuItem.setTitle(!z ? R.string.MT_Protector : R.string.MT_Protector);
                return;
            case 16:
                activityRecordService.f23.m21475();
                return;
            case 17:
                LinkedList linkedList = f16;
                synchronized (linkedList) {
                    linkedList.clear();
                    m49();
                    break;
                }
                f14 = null;
                return;
            case 18:
                C14507.m34660();
                return;
            default:
                return;
        }
    }
}
