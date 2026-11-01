package bin.p000mt.function.p001ar;

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
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import p067l.ApplicationC21448;
import p067l.C0994;
import p067l.C10058;
import p067l.C11164;
import p067l.C13964;
import p067l.C16156;
import p067l.C1898;
import p067l.C19552;
import p067l.C24104;
import p067l.C24874;
import p067l.C7050;
import p067l.C8072;
import p067l.C8597;
import p067l.InterfaceC11953;
import p067l.InterfaceC14100;
import p067l.InterfaceC1583;

/* JADX INFO: loaded from: classes.dex */
public class ActivityRecordService extends AccessibilityService implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۛ */
    public static C24874 f14;

    /* JADX INFO: renamed from: ᩺ */
    public static volatile WeakReference f17;

    /* JADX INFO: renamed from: ۗ */
    public TextView f18;

    /* JADX INFO: renamed from: ۙ */
    public TextView f19;

    /* JADX INFO: renamed from: ۫ */
    public TextView f20;

    /* JADX INFO: renamed from: ۬ */
    public TextView f21;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f22;

    /* JADX INFO: renamed from: ᩸ */
    public C10058 f23;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f24;

    /* JADX INFO: renamed from: ۨ */
    public static final LinkedList f16 = new LinkedList();

    /* JADX INFO: renamed from: ۤ */
    public static boolean f15 = ApplicationC21448.f67649.getBoolean("activity_record", false);

    @Override // android.accessibilityservice.AccessibilityService
    public final void onInterrupt() {
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m46() {
        return f15;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42(boolean z) {
        if (f15 != z) {
            f15 = z;
            C24104.m53360(ApplicationC21448.f67649, "activity_record", z);
            ActivityRecordService activityRecordServiceM40 = m40();
            if (activityRecordServiceM40 != null) {
                if (z) {
                    activityRecordServiceM40.f24 = false;
                }
                if (z && ApplicationC21448.f67649.getBoolean("activity_record_floating_enable", true)) {
                    activityRecordServiceM40.f23.m23434();
                } else {
                    activityRecordServiceM40.f23.m23443();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m49() {
        ActivityRecordService activityRecordServiceM40 = m40();
        if (activityRecordServiceM40 != null) {
            activityRecordServiceM40.m43();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m45() {
        ActivityRecordService activityRecordServiceM40 = m40();
        if (activityRecordServiceM40 != null) {
            activityRecordServiceM40.f23.m23434();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m44() {
        ActivityRecordService activityRecordServiceM40 = m40();
        if (activityRecordServiceM40 != null) {
            activityRecordServiceM40.f23.m23443();
            activityRecordServiceM40.f24 = false;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m48() {
        ActivityRecordService activityRecordServiceM40 = m40();
        if (activityRecordServiceM40 != null) {
            return activityRecordServiceM40.f23.isAttachedToWindow();
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ActivityRecordService m40() {
        WeakReference weakReference = f17;
        if (weakReference != null) {
            return (ActivityRecordService) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m47() {
        return m40() != null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C19552.m44401());
        C10058 c10058 = (C10058) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f23 = c10058;
        this.f22 = (TextView) c10058.findViewById(R.id.textView0);
        this.f19 = (TextView) this.f23.findViewById(R.id.textView1);
        this.f18 = (TextView) this.f23.findViewById(R.id.textView2);
        this.f21 = (TextView) this.f23.findViewById(R.id.textView3);
        this.f20 = (TextView) this.f23.findViewById(R.id.textView4);
        if (!ApplicationC21448.f67649.getBoolean("activity_record_floating_show_single", true)) {
            onClick(this.f23);
        }
        this.f23.setOnClickListener(this);
        this.f23.setOnLongClickListener(this);
        m43();
        if (f15 && ApplicationC21448.f67649.getBoolean("activity_record_floating_enable", true)) {
            this.f23.m23434();
        }
        f17 = new WeakReference(this);
    }

    /* JADX INFO: renamed from: ۜ */
    private void m43() {
        LinkedList linkedList = f16;
        synchronized (linkedList) {
            Iterator it = linkedList.iterator();
            if (it.hasNext()) {
                C24874 c24874 = (C24874) it.next();
                this.f22.setText(c24874.f79459);
                this.f19.setText(c24874.f79458);
            } else {
                this.f22.setText(R.string.MT_Protector);
                this.f19.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f18.setText(((C24874) it.next()).f79458);
            } else {
                this.f18.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f21.setText(((C24874) it.next()).f79458);
            } else {
                this.f21.setText((CharSequence) null);
            }
            if (it.hasNext()) {
                this.f20.setText(((C24874) it.next()).f79458);
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
        this.f23.m23443();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50(ActivityInfo activityInfo) {
        CharSequence charSequenceLoadLabel = activityInfo.loadLabel(getPackageManager());
        if (TextUtils.isEmpty(charSequenceLoadLabel) || charSequenceLoadLabel.toString().trim().isEmpty()) {
            return m51(activityInfo.packageName);
        }
        return charSequenceLoadLabel.toString();
    }

    /* JADX INFO: renamed from: ֫ */
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
        C24874 c24874 = new C24874();
        String string = accessibilityEvent.getClassName().toString();
        String string2 = accessibilityEvent.getPackageName().toString();
        c24874.f79460 = string2;
        c24874.f79458 = string;
        if (string2.equals(getPackageName()) || c24874.equals(f14) || string2.equals("bin.mt.plus") || string2.equals("bin.mt.plus.canary") || string2.equals("bin.mt.plus")) {
            return;
        }
        try {
            activityInfo = getPackageManager().getActivityInfo(new ComponentName(string2, string), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            activityInfo = null;
        }
        if (activityInfo == null) {
            InterfaceC11953 interfaceC11953M25777 = C11164.m25777();
            if (interfaceC11953M25777 == null || !interfaceC11953M25777.mo27365()) {
                strSubstring = null;
                break;
            }
            C13964 c13964Mo27361 = interfaceC11953M25777.mo27361(600L, "dumpsys activity activities");
            if (!c13964Mo27361.f39429.isEmpty()) {
                strSubstring = null;
                break;
            }
            String[] strArr = c13964Mo27361.f39430;
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
                    c24874.f79459 = m51(string2);
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
                        c24874.f79459 = m51(string2);
                    }
                } else {
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(string);
                        c24874.f79458 = strSubstring;
                    } catch (ClassNotFoundException unused5) {
                        c24874.f79458 = C24104.m53357(strSubstring, " > ", string);
                    }
                    if (c24874.equals(f14)) {
                        return;
                    } else {
                        c24874.f79459 = m50(activityInfo2);
                    }
                }
            }
        } else {
            c24874.f79459 = m50(activityInfo);
        }
        LinkedList linkedList = f16;
        synchronized (linkedList) {
            if (linkedList.size() > 30) {
                linkedList.removeLast();
            }
            linkedList.addFirst(c24874);
        }
        m43();
        f14 = c24874;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC14100 interfaceC14100;
        boolean z = false;
        if (this.f18.getVisibility() == 0) {
            this.f18.setVisibility(8);
            this.f21.setVisibility(8);
            this.f20.setVisibility(8);
            interfaceC14100 = ApplicationC21448.f67649;
        } else {
            this.f18.setVisibility(0);
            this.f21.setVisibility(0);
            this.f20.setVisibility(0);
            interfaceC14100 = ApplicationC21448.f67649;
            z = true;
        }
        C24104.m53360(interfaceC14100, "activity_record_floating_show_single", z);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1898 c1898 = new C1898(this, view, 0);
        C0994 c0994M50638 = c1898.m50638();
        if (this.f18.getVisibility() == 0 && this.f19.length() > 0) {
            SubMenu subMenuAddSubMenu = c0994M50638.addSubMenu(R.string.MT_Protector);
            subMenuAddSubMenu.add(0, 1, 0, this.f19.getText());
            if (this.f18.length() > 0) {
                subMenuAddSubMenu.add(0, 2, 0, C8597.m20011(30, this.f18.getText().toString()));
            }
            if (this.f21.length() > 0) {
                subMenuAddSubMenu.add(0, 3, 0, C8597.m20011(30, this.f21.getText().toString()));
            }
            if (this.f20.length() > 0) {
                subMenuAddSubMenu.add(0, 4, 0, C8597.m20011(30, this.f20.getText().toString()));
            }
        } else {
            c0994M50638.add(0, 1, 0, R.string.MT_Protector).setEnabled(this.f19.length() > 0);
        }
        c0994M50638.add(0, 15, 0, this.f24 ? R.string.MT_Protector : R.string.MT_Protector);
        c0994M50638.add(0, 16, 0, R.string.MT_Protector);
        c0994M50638.add(0, 17, 0, R.string.MT_Protector);
        c0994M50638.add(0, 18, 0, R.string.MT_Protector);
        c1898.m50636((InterfaceC1583) new C8072(2, this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41(ActivityRecordService activityRecordService, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C7050.m16211((CharSequence) activityRecordService.f19.getText().toString());
            return;
        }
        if (itemId == 2) {
            C7050.m16211((CharSequence) activityRecordService.f18.getText().toString());
            return;
        }
        if (itemId == 3) {
            C7050.m16211((CharSequence) activityRecordService.f21.getText().toString());
            return;
        }
        if (itemId == 4) {
            C7050.m16211((CharSequence) activityRecordService.f20.getText().toString());
            return;
        }
        switch (itemId) {
            case 15:
                boolean z = activityRecordService.f24;
                activityRecordService.f24 = !z;
                menuItem.setTitle(!z ? R.string.MT_Protector : R.string.MT_Protector);
                return;
            case 16:
                activityRecordService.f23.m23443();
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
                C16156.m36801();
                return;
            default:
                return;
        }
    }
}
