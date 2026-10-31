package l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۗۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC3219 extends Service implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static boolean f10120;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10121 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8091 f10124;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8091 f10125;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C8864 f10127;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f10128;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Intent f10129;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10130;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public MediaProjection f10132;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6747 f10133;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public VirtualDisplay f10135;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageReader f10137;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f10139;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f10140;

    /* JADX INFO: renamed from: ۙ۬᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f10119 = {1992, -24829, -24826, -24813, -24826};

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final Handler f10122 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public Point f10134 = new Point();

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Point f10136 = new Point();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Rect f10131 = new Rect();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f10138 = new C15212(this);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int[] f10126 = new int[2];

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Rect f10123 = new Rect();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9877(AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) viewM10216.findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) viewM10216.findViewById(R.id.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, abstractActivityC3346.getResources().getStringArray(R.array.MT_Protector)));
        spinner2.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, abstractActivityC3346.getResources().getStringArray(R.array.MT_Protector)));
        spinner3.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, abstractActivityC3346.getResources().getStringArray(R.array.MT_Protector)));
        c2978.setChecked(C13096.m31741());
        c2979.setChecked(C13096.m31754());
        spinner.setSelection(C13096.m31751());
        spinner2.setSelection(C13096.m31744());
        spinner3.setSelection(C13096.m31748());
        c2978.setOnCheckedChangeListener(new C22552(1));
        c2979.setOnCheckedChangeListener(new C5336());
        spinner.setOnItemSelectedListener(new C21564(new C15918()));
        spinner2.setOnItemSelectedListener(new C21564(new C2514()));
        spinner3.setOnItemSelectedListener(new C21564(new C3925()));
        DialogInterfaceC0206[] dialogInterfaceC0206Arr = new DialogInterfaceC0206[1];
        viewM10216.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8158(new C1102(dialogInterfaceC0206Arr)));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44421(viewM10216);
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, f10120 ? R.string.MT_Protector : R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206Arr[0] = dialogInterfaceC0206M19253;
        if (abstractActivityC3346 instanceof ActivityC1355) {
            dialogInterfaceC0206M19253.m1436(new DialogInterfaceOnDismissListenerC18742(abstractActivityC3346, 0));
        }
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new ViewOnClickListenerC8558(2, abstractActivityC3346));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9868(AbstractActivityC3346 abstractActivityC3346) {
        if (f10120) {
            C4925.m14335().stopService(new Intent(C4925.m14335(), (Class<?>) ServiceC3219.class));
            return;
        }
        if (!C9255.m23764(abstractActivityC3346)) {
            try {
                C21769.m49100(abstractActivityC3346, null);
                return;
            } catch (Throwable th) {
                abstractActivityC3346.m10223(th, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (abstractActivityC3346 instanceof Main) {
            ((Main) abstractActivityC3346).m136();
        } else {
            if (abstractActivityC3346 instanceof ActivityC1355) {
                ((ActivityC1355) abstractActivityC3346).m4717();
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f10128 = getResources().getConfiguration().orientation;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_COLOR_PICKER", getString(R.string.MT_Protector), 3));
        }
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        C21093 c21093 = new C21093(this, "MT_COLOR_PICKER");
        c21093.m48000();
        c21093.m47996(C4925.m14327(R.string.MT_Protector));
        c21093.m47993(activity);
        c21093.m48001();
        c21093.m47998(false);
        startForeground(1001, c21093.m47991());
        this.f10125 = (C8091) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f10124 = (C8091) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f10133 = (C6747) this.f10125.getChildAt(0);
        C8864 c8864 = (C8864) this.f10124.getChildAt(0);
        this.f10127 = c8864;
        c8864.m22903((TextView) this.f10124.findViewById(R.id.MT_Protector));
        this.f10125.m21474();
        int[] iArr = new int[2];
        this.f10125.m21470(new C20153(this, iArr));
        this.f10125.m21468(new C11374(this, iArr));
        int iM31747 = C13096.m31747();
        for (int i = 0; i < 2; i++) {
            View childAt = this.f10124.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = iM31747;
            layoutParams.width = iM31747;
            childAt.setLayoutParams(layoutParams);
        }
        this.f10124.setOnClickListener(new ViewOnClickListenerC19142(2, this));
        this.f10124.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩵ۨܿ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ServiceC3219 serviceC3219 = this.f62895;
                return serviceC3219.f10127.m22904(serviceC3219.f10124.m21472(), serviceC3219.f10124.m21473());
            }
        });
        this.f10124.m21474();
        Point point = new Point();
        this.f10124.m21470(new C4630(this, point));
        this.f10124.m21468(new C5030(this, point));
        f10120 = true;
        C4925.m14312(new Intent("ScreenColorPicker.ACTION_START"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED");
        C4925.m14311(this.f10138, intentFilter);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Parcelable parcelableExtra = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1167306312;
        int i9 = C1420.f5096;
        int i10 = C0630.f2410;
        int iM6981 = C2105.m6981("ܽ۠") ^ i9;
        int i11 = ((iM6981 ^ i10) * 2909) ^ (-582266195);
        int i12 = 1962009068;
        while (true) {
            i8 = ((((i8 ^ i10) * (-29801)) >> 31) & i11) ^ (iM6981 ^ i12);
            switch (i8) {
                case -2129442152:
                case 366995009:
                    i3 = s * 5358;
                    i4 = s * s;
                    if (C3245.m9925() != 0) {
                        iM6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((iM6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM6981 = C2105.m6981("ۛ᩸") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-27201)) ^ 375190728;
                        i12 = 1795822757;
                    }
                    break;
                case -1903049273:
                case 834278686:
                    if ((7177041 + i4) - i3 >= 0) {
                        iM6981 = C2105.m6981("᩵ۙ") ^ i9;
                        i11 = ((iM6981 ^ i10) * 26227) ^ (-682934625);
                        i12 = 841069024;
                    } else {
                        iM6981 = C2105.m6981("ܳۖ") ^ i10;
                        i11 = ((iM6981 ^ i9) * 4689) ^ 753848335;
                        i12 = 552908613;
                    }
                    break;
                case -1899341550:
                case 1539054372:
                    s = f10119[0];
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((iM6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM6981 = C2105.m6981("ۧܽ") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-5691)) ^ 73280685;
                        i12 = 1444274403;
                    }
                    break;
                case -1837631425:
                case 476038145:
                    C2126.m7040();
                    iM6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                    i11 = ((iM6981 ^ i9) * 17467) ^ (-492427089);
                    i12 = -2031915303;
                    break;
                case -1819617437:
                case 1838450855:
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((iM6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM6981 = C2105.m6981("ۡ᩵") ^ i10;
                        i11 = ((iM6981 ^ i9) * 12339) ^ (-1844814338);
                        i12 = -825667487;
                    }
                    break;
                case -1803988845:
                case 451926079:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                        i11 = ((iM6981 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        iM6981 = (i9 - C2105.m6981("᩸ۖ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i11 = ((iM6981 ^ i10) * 8525) ^ 486044006;
                        i12 = -1331581710;
                    }
                    break;
                case -1776360948:
                case 1471151393:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                        i11 = ((iM6981 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        iM6981 = C2105.m6981("ᩳᩴ") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-26173)) ^ 2033462941;
                        i12 = -918981052;
                    }
                    break;
                case -1614235919:
                case -441029969:
                    sArr = f10119;
                    i6 = 1;
                    i7 = 4;
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("۫᩵") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-32597)) ^ (-2075090245);
                        i12 = 823560516;
                    } else {
                        iM6981 = C0630.m2566("ۘ۠") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-9709)) ^ (-85224372);
                        i12 = -2126807073;
                    }
                    break;
                case -1329841224:
                case -631967708:
                    C5695.m16023();
                    C1294.m4372();
                    return 0;
                case -801216137:
                case -521920402:
                    C0964.m3413();
                    if (C3683.f11629 < 0) {
                        iM6981 = C0630.m2566("۫᩵") ^ i10;
                        i11 = ((iM6981 ^ i9) * (-32597)) ^ (-2075090245);
                        i12 = 823560516;
                    } else {
                        iM6981 = (C0630.m2566("ܺ᩶") ^ i10) * (-111);
                        i11 = ((iM6981 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    }
                    break;
                case -469432274:
                case 2051325440:
                    i5 = 29677;
                    iM6981 = (C2105.m6981("֡֫") + i10) * (-29);
                    i11 = ((iM6981 ^ i9) * 13279) ^ 283833314;
                    i12 = 640207521;
                    break;
                case -446017231:
                case 561848199:
                    this.f10129 = (Intent) parcelableExtra;
                    m9883();
                    return 2;
                case 185732813:
                case 1911050608:
                    i5 = 40807;
                    iM6981 = (C2105.m6981("֡֫") + i10) * (-29);
                    i11 = ((iM6981 ^ i9) * 13279) ^ 283833314;
                    i12 = 640207521;
                    break;
                case 212838297:
                case 889707460:
                    AbstractC2021.m6574();
                    if (C2167.f7158 < 0) {
                        iM6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                        i11 = ((iM6981 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        iM6981 = C0630.m2566("ۜᩳ") ^ i9;
                        i11 = ((iM6981 ^ i10) * (-6185)) ^ (-393189043);
                        i12 = 1603661954;
                    }
                    break;
                case 346795337:
                case 481481445:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((iM6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM6981 = (i10 - C0630.m2566("ۚۙ")) * 91;
                        i11 = ((iM6981 ^ i9) * (-23699)) ^ 2036008198;
                        i12 = 582586712;
                    }
                    break;
                case 506367781:
                case 1299322134:
                    if (RunnableC3474.m10630()) {
                        iM6981 = C0630.m2566("۬᩸") ^ i9;
                        i11 = ((iM6981 ^ i10) * 29403) ^ (-1181401145);
                        i12 = -707475308;
                    } else {
                        iM6981 = (C0630.m2566("ܺ᩶") ^ i10) * (-111);
                        i11 = ((iM6981 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    }
                    break;
                case 926670139:
                case 1657182523:
                    if (C4117.m12364() != 0) {
                        iM6981 = (C0630.m2566("ܺ᩶") ^ i10) * (-111);
                        i11 = ((iM6981 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    } else {
                        iM6981 = (C0630.m2566("ۙܺ") ^ i9) * 47;
                        i11 = ((iM6981 ^ i10) * (-22687)) ^ 1457810897;
                        i12 = 1856295230;
                    }
                    break;
                case 1293100347:
                case 1806079720:
                    C1916.m6308();
                    if (!C1916.f6442) {
                        iM6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                        i11 = ((iM6981 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        iM6981 = (C0630.m2566("ܺ᩶") ^ i10) * (-111);
                        i11 = ((iM6981 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    }
                    break;
                default:
                    parcelableExtra = intent.getParcelableExtra(C1005.m3502(sArr, i6, i7, i5));
                    if (C2272.f7362) {
                        iM6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((iM6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM6981 = C0630.m2566("᩺ۙ") ^ i9;
                        i11 = ((iM6981 ^ i10) * 19541) ^ (-1582580185);
                        i12 = -1499221702;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m9883() {
        Runnable[] runnableArr = {null};
        runnableArr[0] = new RunnableC21604(2, this);
        if (this.f10125.isAttachedToWindow()) {
            m9878();
            C4925.m14316(runnableArr[0], 15L);
        } else {
            runnableArr[0].run();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m9890(ServiceC3219 serviceC3219) {
        int dimension;
        Display defaultDisplay = ((WindowManager) serviceC3219.getApplicationContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getSize(serviceC3219.f10136);
        Point point = serviceC3219.f10134;
        defaultDisplay.getRealSize(point);
        C6747 c6747 = serviceC3219.f10133;
        if (c6747 == null || (dimension = c6747.getWidth()) <= 0) {
            dimension = (int) serviceC3219.getResources().getDimension(R.dimen.MT_Protector);
        }
        int i = dimension / 2;
        serviceC3219.f10125.m21467((point.x / 2) - i, (point.y / 2) - i);
        serviceC3219.f10125.m21469(new C0396(serviceC3219));
        serviceC3219.f10125.m21466();
        serviceC3219.m9881();
        C4925.m14309(500L, new RunnableC22511(1, serviceC3219));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9866(ServiceC3219 serviceC3219, Point point, float f, float f2) {
        float fM31752 = C13096.m31752();
        serviceC3219.m9863(point.x + ((int) (f / fM31752)), point.y + ((int) (f2 / fM31752)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m9881() {
        int i = getResources().getDisplayMetrics().densityDpi;
        this.f10132 = ((MediaProjectionManager) getApplicationContext().getSystemService("media_projection")).getMediaProjection(-1, this.f10129);
        Point point = this.f10134;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(point.x, point.y, 1, 1);
        this.f10137 = imageReaderNewInstance;
        this.f10135 = this.f10132.createVirtualDisplay("MT_COLOR_PICKER", point.x, point.y, i, 16, imageReaderNewInstance.getSurface(), null, null);
        this.f10139 = false;
        this.f10137.setOnImageAvailableListener(this, f10122);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9875() {
        VirtualDisplay virtualDisplay = this.f10135;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.f10135 = null;
        }
        ImageReader imageReader = this.f10137;
        if (imageReader != null) {
            imageReader.close();
            this.f10137 = null;
        }
        MediaProjection mediaProjection = this.f10132;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.f10132 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m9878() {
        m9875();
        C8091 c8091 = this.f10125;
        if (c8091 != null) {
            c8091.m21475();
        }
        C8091 c8092 = this.f10124;
        if (c8092 != null) {
            c8092.m21475();
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f10128;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f10128 = i2;
            m9878();
            C4925.m14316(new RunnableC6438(2, this), 50L);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        m9878();
        f10120 = false;
        C4925.m14312(new Intent("ScreenColorPicker.ACTION_STOP"));
        int i = C13096.f39208;
        C4925.m14310(this.f10138);
        stopForeground(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m9863(int i, int i2) {
        int dimension;
        int iM31747;
        int i3;
        Point point = this.f10134;
        int i4 = 0;
        if (i < 0) {
            i = 0;
        } else {
            int i5 = point.x;
            if (i >= i5) {
                i = i5 - 1;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        } else {
            int i6 = point.y;
            if (i2 >= i6) {
                i2 = i6 - 1;
            }
        }
        Rect rect = this.f10131;
        int i7 = -rect.left;
        int i8 = -rect.top;
        C6747 c6747 = this.f10133;
        if (c6747 == null || (dimension = c6747.getWidth()) <= 0) {
            dimension = (int) getResources().getDimension(R.dimen.MT_Protector);
        }
        C8864 c8864 = this.f10127;
        if (c8864 == null || (iM31747 = c8864.getWidth()) <= 0) {
            iM31747 = C13096.m31747();
        }
        this.f10130 = i;
        this.f10140 = i2;
        int i9 = dimension / 2;
        int i10 = i - i9;
        int i11 = i2 - i9;
        int i12 = rect.left;
        if (i10 <= i12) {
            i3 = i10 - i12;
        } else {
            int i13 = i10 + dimension;
            int i14 = rect.right;
            i3 = i13 >= i14 ? i13 - i14 : 0;
        }
        int i15 = rect.top;
        if (i11 <= i15) {
            i4 = i11 - i15;
        } else {
            int i16 = dimension + i11;
            int i17 = rect.bottom;
            if (i16 >= i17) {
                i4 = i16 - i17;
            }
        }
        this.f10133.m18366(i3, i4);
        this.f10125.m21467(i10 + i7, i11 + i8);
        if (point.x < point.y) {
            int i18 = (i - (iM31747 / 2)) + i7;
            float f = i2;
            float f2 = iM31747;
            int i19 = ((int) (f - (1.5f * f2))) + i8;
            if (i19 <= 0) {
                i19 = ((int) ((f2 * 0.5f) + f)) + i8;
            }
            this.f10124.m21467(i18, i19);
            return;
        }
        int i20 = (i2 - (iM31747 / 2)) + i8;
        float f3 = i;
        float f4 = iM31747;
        int i21 = ((int) (f3 - (1.5f * f4))) + i7;
        if (i21 <= 0) {
            i21 = ((int) ((f4 * 0.5f) + f3)) + i7;
        }
        this.f10124.m21467(i21, i20);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m9888(ServiceC3219 serviceC3219) {
        Rect rect = serviceC3219.f10131;
        int i = -rect.left;
        int i2 = -rect.top;
        int iM31747 = C13096.m31747();
        Point point = serviceC3219.f10134;
        if (point.x < point.y) {
            int i3 = (serviceC3219.f10130 - (iM31747 / 2)) + i;
            float f = serviceC3219.f10140;
            float f2 = iM31747;
            int i4 = ((int) (f - (1.5f * f2))) + i2;
            if (i4 <= 0) {
                i4 = ((int) ((f2 * 0.5f) + f)) + i2;
            }
            serviceC3219.f10124.m21467(i3, i4);
            return;
        }
        int i5 = (serviceC3219.f10140 - (iM31747 / 2)) + i2;
        float f3 = serviceC3219.f10130;
        float f4 = iM31747;
        int i6 = ((int) (f3 - (1.5f * f4))) + i;
        if (i6 <= 0) {
            i6 = ((int) ((f4 * 0.5f) + f3)) + i;
        }
        serviceC3219.f10124.m21467(i6, i5);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        if (imageAcquireNextImage == null) {
            return;
        }
        if (!this.f10139) {
            this.f10139 = true;
        }
        this.f10125.getLocationOnScreen(this.f10126);
        int width = this.f10130;
        int height = this.f10140;
        int i = 0;
        if (width < 0) {
            width = 0;
        } else if (width >= imageAcquireNextImage.getWidth()) {
            width = imageAcquireNextImage.getWidth() - 1;
        }
        if (height < 0) {
            height = 0;
        } else if (height >= imageAcquireNextImage.getHeight()) {
            height = imageAcquireNextImage.getHeight() - 1;
        }
        int iM18364 = this.f10133.m18364();
        Rect rect = this.f10123;
        rect.set(width - iM18364, height - iM18364, width + iM18364 + 1, iM18364 + height + 1);
        C8864 c8864 = this.f10127;
        int width2 = imageAcquireNextImage.getWidth();
        int height2 = imageAcquireNextImage.getHeight();
        int iWidth = rect.width();
        int iHeight = rect.height();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        Image.Plane plane = imageAcquireNextImage.getPlanes()[0];
        ByteBuffer buffer = plane.getBuffer();
        int rowStride = plane.getRowStride();
        int pixelStride = plane.getPixelStride();
        int i2 = 0;
        while (i2 < iHeight) {
            while (i < iWidth) {
                int i3 = rect.left + i;
                int i4 = iWidth;
                int i5 = rect.top + i2;
                if (i3 < 0 || i3 >= width2 || i5 < 0 || i5 >= height2) {
                    bitmapCreateBitmap.setPixel(i, i2, 0);
                } else {
                    buffer.position((i3 * pixelStride) + (i5 * rowStride));
                    bitmapCreateBitmap.setPixel(i, i2, Color.argb(255, buffer.get() & 255, buffer.get() & 255, buffer.get() & 255));
                }
                i++;
                iWidth = i4;
                rect = rect;
                width2 = width2;
            }
            i2++;
            i = 0;
        }
        c8864.m22902(bitmapCreateBitmap, width, height);
        imageAcquireNextImage.close();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9876(ServiceC3219 serviceC3219) {
        if (!f10120 || serviceC3219.f10139) {
            return;
        }
        serviceC3219.m9875();
        serviceC3219.m9881();
        C4925.m14309(500L, new RunnableC16185(2, serviceC3219));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m9879(ServiceC3219 serviceC3219) {
        if (!f10120 || serviceC3219.f10139) {
            return;
        }
        C21374.m48464("Getting screen image timed out");
        serviceC3219.stopSelf();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m9884(ServiceC3219 serviceC3219) {
        if (!f10120 || serviceC3219.f10139) {
            return;
        }
        serviceC3219.m9875();
        serviceC3219.m9881();
        C4925.m14309(500L, new RunnableC19472(2, serviceC3219));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m9885() {
        return f10120;
    }
}
