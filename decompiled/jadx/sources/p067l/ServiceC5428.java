package p067l;

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
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۗۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceC5428 extends Service implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: ۜ֫ */
    public static boolean f12926;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final /* synthetic */ int f12927 = 0;

    /* JADX INFO: renamed from: ۗ */
    public C10058 f12930;

    /* JADX INFO: renamed from: ۙ */
    public C10058 f12931;

    /* JADX INFO: renamed from: ۟ */
    public C10793 f12933;

    /* JADX INFO: renamed from: ۤ */
    public int f12934;

    /* JADX INFO: renamed from: ۧ֫ */
    public Intent f12935;

    /* JADX INFO: renamed from: ۨ */
    public int f12936;

    /* JADX INFO: renamed from: ۬ */
    public MediaProjection f12938;

    /* JADX INFO: renamed from: ܰ */
    public C8781 f12939;

    /* JADX INFO: renamed from: ܿ֫ */
    public VirtualDisplay f12941;

    /* JADX INFO: renamed from: ᩶ */
    public ImageReader f12943;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f12945;

    /* JADX INFO: renamed from: ᩺ */
    public int f12946;

    /* JADX INFO: renamed from: ۙ۬᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f81928 = {1992, -24829, -24826, -24813, -24826};

    /* JADX INFO: renamed from: ᩻֫ */
    public static final Handler f12928 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܽ֫ */
    public Point f12940 = new Point();

    /* JADX INFO: renamed from: ᩳ֫ */
    public Point f12942 = new Point();

    /* JADX INFO: renamed from: ۫ */
    public Rect f12937 = new Rect();

    /* JADX INFO: renamed from: ᩸ */
    public BroadcastReceiver f12944 = new C16826(this);

    /* JADX INFO: renamed from: ۛ */
    public int[] f12932 = new int[2];

    /* JADX INFO: renamed from: ֫֫ */
    public Rect f12929 = new Rect();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m11924(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) viewM12252.findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) viewM12252.findViewById(R.id.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C21438(abstractActivityC5549, abstractActivityC5549.getResources().getStringArray(R.array.MT_Protector)));
        spinner2.setAdapter((SpinnerAdapter) new C21438(abstractActivityC5549, abstractActivityC5549.getResources().getStringArray(R.array.MT_Protector)));
        spinner3.setAdapter((SpinnerAdapter) new C21438(abstractActivityC5549, abstractActivityC5549.getResources().getStringArray(R.array.MT_Protector)));
        c0990.setChecked(C14815.m33831());
        c0991.setChecked(C14815.m33844());
        spinner.setSelection(C14815.m33841());
        spinner2.setSelection(C14815.m33834());
        spinner3.setSelection(C14815.m33838());
        c0990.setOnCheckedChangeListener(new C23802(1));
        c0991.setOnCheckedChangeListener(new C7440());
        spinner.setOnItemSelectedListener(new C22863(new C17497()));
        spinner2.setOnItemSelectedListener(new C22863(new C4758()));
        spinner3.setOnItemSelectedListener(new C22863(new C6099()));
        DialogInterfaceC2564[] dialogInterfaceC2564Arr = new DialogInterfaceC2564[1];
        viewM12252.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC10122(new C3416(dialogInterfaceC2564Arr)));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46715(viewM12252);
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, f12926 ? R.string.MT_Protector : R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564Arr[0] = dialogInterfaceC2564M21200;
        if (abstractActivityC5549 instanceof ActivityC3657) {
            dialogInterfaceC2564M21200.m3849(new DialogInterfaceOnDismissListenerC20181(abstractActivityC5549, 0));
        }
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new ViewOnClickListenerC10502(2, abstractActivityC5549));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11915(AbstractActivityC5549 abstractActivityC5549) {
        if (f12926) {
            C7050.m16232().stopService(new Intent(C7050.m16232(), (Class<?>) ServiceC5428.class));
            return;
        }
        if (!C11164.m25765(abstractActivityC5549)) {
            try {
                C23058.m51450(abstractActivityC5549, null);
                return;
            } catch (Throwable th) {
                abstractActivityC5549.m12259(th, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (abstractActivityC5549 instanceof Main) {
            ((Main) abstractActivityC5549).m134();
        } else {
            if (abstractActivityC5549 instanceof ActivityC3657) {
                ((ActivityC3657) abstractActivityC5549).m6955();
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f12934 = getResources().getConfiguration().orientation;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_COLOR_PICKER", getString(R.string.MT_Protector), 3));
        }
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        C1888 c1888 = new C1888(this, "MT_COLOR_PICKER");
        c1888.m50330();
        c1888.m50326(C7050.m16224(R.string.MT_Protector));
        c1888.m50323(activity);
        c1888.m50331();
        c1888.m50328(false);
        startForeground(1001, c1888.m50321());
        this.f12931 = (C10058) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f12930 = (C10058) LayoutInflater.from(this).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f12939 = (C8781) this.f12931.getChildAt(0);
        C10793 c10793 = (C10793) this.f12930.getChildAt(0);
        this.f12933 = c10793;
        c10793.m24874((TextView) this.f12930.findViewById(R.id.MT_Protector));
        this.f12931.m23442();
        int[] iArr = new int[2];
        this.f12931.m23438(new C21522(this, iArr));
        this.f12931.m23436(new C13178(this, iArr));
        int iM33837 = C14815.m33837();
        for (int i = 0; i < 2; i++) {
            View childAt = this.f12930.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = iM33837;
            layoutParams.width = iM33837;
            childAt.setLayoutParams(layoutParams);
        }
        this.f12930.setOnClickListener(new ViewOnClickListenerC20561(2, this));
        this.f12930.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩵ۨܿ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ServiceC5428 serviceC5428 = this.f65511;
                return serviceC5428.f12933.m24875(serviceC5428.f12930.m23440(), serviceC5428.f12930.m23441());
            }
        });
        this.f12930.m23442();
        Point point = new Point();
        this.f12930.m23438(new C6769(this, point));
        this.f12930.m23436(new C7149(this, point));
        f12926 = true;
        C7050.m16209(new Intent("ScreenColorPicker.ACTION_START"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED");
        C7050.m16208(this.f12944, intentFilter);
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
        int i9 = C0912.f81867;
        int i10 = C0873.f81841;
        int iM55979 = C0946.m55979("ܽ۠") ^ i9;
        int i11 = ((iM55979 ^ i10) * 2909) ^ (-582266195);
        int i12 = 1962009068;
        while (true) {
            i8 = ((((i8 ^ i10) * (-29801)) >> 31) & i11) ^ (iM55979 ^ i12);
            switch (i8) {
                case -2129442152:
                case 366995009:
                    i3 = s * 5358;
                    i4 = s * s;
                    if (C1003.m56123() != 0) {
                        iM55979 = C0873.m55680("۫᩺") ^ i9;
                        i11 = ((iM55979 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM55979 = C0946.m55979("ۛ᩸") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-27201)) ^ 375190728;
                        i12 = 1795822757;
                    }
                    break;
                case -1903049273:
                case 834278686:
                    if ((7177041 + i4) - i3 >= 0) {
                        iM55979 = C0946.m55979("᩵ۙ") ^ i9;
                        i11 = ((iM55979 ^ i10) * 26227) ^ (-682934625);
                        i12 = 841069024;
                    } else {
                        iM55979 = C0946.m55979("ܳۖ") ^ i10;
                        i11 = ((iM55979 ^ i9) * 4689) ^ 753848335;
                        i12 = 552908613;
                    }
                    break;
                case -1899341550:
                case 1539054372:
                    s = f81928[0];
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("۫᩺") ^ i9;
                        i11 = ((iM55979 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM55979 = C0946.m55979("ۧܽ") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-5691)) ^ 73280685;
                        i12 = 1444274403;
                    }
                    break;
                case -1837631425:
                case 476038145:
                    C0947.m55997();
                    iM55979 = (i10 - C0946.m55979("ۖܿ")) * 97;
                    i11 = ((iM55979 ^ i9) * 17467) ^ (-492427089);
                    i12 = -2031915303;
                    break;
                case -1819617437:
                case 1838450855:
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("۫᩺") ^ i9;
                        i11 = ((iM55979 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM55979 = C0946.m55979("ۡ᩵") ^ i10;
                        i11 = ((iM55979 ^ i9) * 12339) ^ (-1844814338);
                        i12 = -825667487;
                    }
                    break;
                case -1803988845:
                case 451926079:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i10 - C0946.m55979("ۖܿ")) * 97;
                        i11 = ((iM55979 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        iM55979 = (i9 - C0946.m55979("᩸ۖ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i11 = ((iM55979 ^ i10) * 8525) ^ 486044006;
                        i12 = -1331581710;
                    }
                    break;
                case -1776360948:
                case 1471151393:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i10 - C0946.m55979("ۖܿ")) * 97;
                        i11 = ((iM55979 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        iM55979 = C0946.m55979("ᩳᩴ") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-26173)) ^ 2033462941;
                        i12 = -918981052;
                    }
                    break;
                case -1614235919:
                case -441029969:
                    sArr = f81928;
                    i6 = 1;
                    i7 = 4;
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("۫᩵") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-32597)) ^ (-2075090245);
                        i12 = 823560516;
                    } else {
                        iM55979 = C0873.m55680("ۘ۠") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-9709)) ^ (-85224372);
                        i12 = -2126807073;
                    }
                    break;
                case -1329841224:
                case -631967708:
                    C1124.m56367();
                    C0906.m55809();
                    return 0;
                case -801216137:
                case -521920402:
                    C0890.m55740();
                    if (C1025.f81947 < 0) {
                        iM55979 = C0873.m55680("۫᩵") ^ i10;
                        i11 = ((iM55979 ^ i9) * (-32597)) ^ (-2075090245);
                        i12 = 823560516;
                    } else {
                        iM55979 = (C0873.m55680("ܺ᩶") ^ i10) * (-111);
                        i11 = ((iM55979 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    }
                    break;
                case -469432274:
                case 2051325440:
                    i5 = 29677;
                    iM55979 = (C0946.m55979("֡֫") + i10) * (-29);
                    i11 = ((iM55979 ^ i9) * 13279) ^ 283833314;
                    i12 = 640207521;
                    break;
                case -446017231:
                case 561848199:
                    this.f12935 = (Intent) parcelableExtra;
                    m11930();
                    return 2;
                case 185732813:
                case 1911050608:
                    i5 = 40807;
                    iM55979 = (C0946.m55979("֡֫") + i10) * (-29);
                    i11 = ((iM55979 ^ i9) * 13279) ^ 283833314;
                    i12 = 640207521;
                    break;
                case 212838297:
                case 889707460:
                    AbstractC0942.m55971();
                    if (C0949.f81897 < 0) {
                        iM55979 = (i10 - C0946.m55979("ۖܿ")) * 97;
                        i11 = ((iM55979 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        iM55979 = C0873.m55680("ۜᩳ") ^ i9;
                        i11 = ((iM55979 ^ i10) * (-6185)) ^ (-393189043);
                        i12 = 1603661954;
                    }
                    break;
                case 346795337:
                case 481481445:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("۫᩺") ^ i9;
                        i11 = ((iM55979 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM55979 = (i10 - C0873.m55680("ۚۙ")) * 91;
                        i11 = ((iM55979 ^ i9) * (-23699)) ^ 2036008198;
                        i12 = 582586712;
                    }
                    break;
                case 506367781:
                case 1299322134:
                    if (RunnableC1014.m56177()) {
                        iM55979 = C0873.m55680("۬᩸") ^ i9;
                        i11 = ((iM55979 ^ i10) * 29403) ^ (-1181401145);
                        i12 = -707475308;
                    } else {
                        iM55979 = (C0873.m55680("ܺ᩶") ^ i10) * (-111);
                        i11 = ((iM55979 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    }
                    break;
                case 926670139:
                case 1657182523:
                    if (C1046.m56302() != 0) {
                        iM55979 = (C0873.m55680("ܺ᩶") ^ i10) * (-111);
                        i11 = ((iM55979 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    } else {
                        iM55979 = (C0873.m55680("ۙܺ") ^ i9) * 47;
                        i11 = ((iM55979 ^ i10) * (-22687)) ^ 1457810897;
                        i12 = 1856295230;
                    }
                    break;
                case 1293100347:
                case 1806079720:
                    C0937.m55918();
                    if (!C0937.f81884) {
                        iM55979 = (i10 - C0946.m55979("ۖܿ")) * 97;
                        i11 = ((iM55979 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        iM55979 = (C0873.m55680("ܺ᩶") ^ i10) * (-111);
                        i11 = ((iM55979 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    }
                    break;
                default:
                    parcelableExtra = intent.getParcelableExtra(C0892.m55750(sArr, i6, i7, i5));
                    if (C0955.f81898) {
                        iM55979 = C0873.m55680("۫᩺") ^ i9;
                        i11 = ((iM55979 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        iM55979 = C0873.m55680("᩺ۙ") ^ i9;
                        i11 = ((iM55979 ^ i10) * 19541) ^ (-1582580185);
                        i12 = -1499221702;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public void m11930() {
        Runnable[] runnableArr = {null};
        runnableArr[0] = new RunnableC22901(2, this);
        if (this.f12931.isAttachedToWindow()) {
            m11925();
            C7050.m16213(runnableArr[0], 15L);
        } else {
            runnableArr[0].run();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m11937(ServiceC5428 serviceC5428) {
        int dimension;
        Display defaultDisplay = ((WindowManager) serviceC5428.getApplicationContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getSize(serviceC5428.f12942);
        Point point = serviceC5428.f12940;
        defaultDisplay.getRealSize(point);
        C8781 c8781 = serviceC5428.f12939;
        if (c8781 == null || (dimension = c8781.getWidth()) <= 0) {
            dimension = (int) serviceC5428.getResources().getDimension(R.dimen.MT_Protector);
        }
        int i = dimension / 2;
        serviceC5428.f12931.m23435((point.x / 2) - i, (point.y / 2) - i);
        serviceC5428.f12931.m23437(new C2745(serviceC5428));
        serviceC5428.f12931.m23434();
        serviceC5428.m11928();
        C7050.m16206(500L, new RunnableC23763(1, serviceC5428));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m11913(ServiceC5428 serviceC5428, Point point, float f, float f2) {
        float fM33842 = C14815.m33842();
        serviceC5428.m11910(point.x + ((int) (f / fM33842)), point.y + ((int) (f2 / fM33842)));
    }

    /* JADX INFO: renamed from: ܽ */
    private void m11928() {
        int i = getResources().getDisplayMetrics().densityDpi;
        this.f12938 = ((MediaProjectionManager) getApplicationContext().getSystemService("media_projection")).getMediaProjection(-1, this.f12935);
        Point point = this.f12940;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(point.x, point.y, 1, 1);
        this.f12943 = imageReaderNewInstance;
        this.f12941 = this.f12938.createVirtualDisplay("MT_COLOR_PICKER", point.x, point.y, i, 16, imageReaderNewInstance.getSurface(), null, null);
        this.f12945 = false;
        this.f12943.setOnImageAvailableListener(this, f12928);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m11922() {
        VirtualDisplay virtualDisplay = this.f12941;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.f12941 = null;
        }
        ImageReader imageReader = this.f12943;
        if (imageReader != null) {
            imageReader.close();
            this.f12943 = null;
        }
        MediaProjection mediaProjection = this.f12938;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.f12938 = null;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m11925() {
        m11922();
        C10058 c10058 = this.f12931;
        if (c10058 != null) {
            c10058.m23443();
        }
        C10058 c10059 = this.f12930;
        if (c10059 != null) {
            c10059.m23443();
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f12934;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f12934 = i2;
            m11925();
            C7050.m16213(new RunnableC8487(2, this), 50L);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        m11925();
        f12926 = false;
        C7050.m16209(new Intent("ScreenColorPicker.ACTION_STOP"));
        int i = C14815.f42256;
        C7050.m16207(this.f12944);
        stopForeground(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m11910(int i, int i2) {
        int dimension;
        int iM33837;
        int i3;
        Point point = this.f12940;
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
        Rect rect = this.f12937;
        int i7 = -rect.left;
        int i8 = -rect.top;
        C8781 c8781 = this.f12939;
        if (c8781 == null || (dimension = c8781.getWidth()) <= 0) {
            dimension = (int) getResources().getDimension(R.dimen.MT_Protector);
        }
        C10793 c10793 = this.f12933;
        if (c10793 == null || (iM33837 = c10793.getWidth()) <= 0) {
            iM33837 = C14815.m33837();
        }
        this.f12936 = i;
        this.f12946 = i2;
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
        this.f12939.m20314(i3, i4);
        this.f12931.m23435(i10 + i7, i11 + i8);
        if (point.x < point.y) {
            int i18 = (i - (iM33837 / 2)) + i7;
            float f = i2;
            float f2 = iM33837;
            int i19 = ((int) (f - (1.5f * f2))) + i8;
            if (i19 <= 0) {
                i19 = ((int) ((f2 * 0.5f) + f)) + i8;
            }
            this.f12930.m23435(i18, i19);
            return;
        }
        int i20 = (i2 - (iM33837 / 2)) + i8;
        float f3 = i;
        float f4 = iM33837;
        int i21 = ((int) (f3 - (1.5f * f4))) + i7;
        if (i21 <= 0) {
            i21 = ((int) ((f4 * 0.5f) + f3)) + i7;
        }
        this.f12930.m23435(i21, i20);
    }

    /* JADX INFO: renamed from: ᩵ */
    public static void m11935(ServiceC5428 serviceC5428) {
        Rect rect = serviceC5428.f12937;
        int i = -rect.left;
        int i2 = -rect.top;
        int iM33837 = C14815.m33837();
        Point point = serviceC5428.f12940;
        if (point.x < point.y) {
            int i3 = (serviceC5428.f12936 - (iM33837 / 2)) + i;
            float f = serviceC5428.f12946;
            float f2 = iM33837;
            int i4 = ((int) (f - (1.5f * f2))) + i2;
            if (i4 <= 0) {
                i4 = ((int) ((f2 * 0.5f) + f)) + i2;
            }
            serviceC5428.f12930.m23435(i3, i4);
            return;
        }
        int i5 = (serviceC5428.f12946 - (iM33837 / 2)) + i2;
        float f3 = serviceC5428.f12936;
        float f4 = iM33837;
        int i6 = ((int) (f3 - (1.5f * f4))) + i;
        if (i6 <= 0) {
            i6 = ((int) ((f4 * 0.5f) + f3)) + i;
        }
        serviceC5428.f12930.m23435(i6, i5);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        if (imageAcquireNextImage == null) {
            return;
        }
        if (!this.f12945) {
            this.f12945 = true;
        }
        this.f12931.getLocationOnScreen(this.f12932);
        int width = this.f12936;
        int height = this.f12946;
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
        int iM20312 = this.f12939.m20312();
        Rect rect = this.f12929;
        rect.set(width - iM20312, height - iM20312, width + iM20312 + 1, iM20312 + height + 1);
        C10793 c10793 = this.f12933;
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
        c10793.m24873(bitmapCreateBitmap, width, height);
        imageAcquireNextImage.close();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m11923(ServiceC5428 serviceC5428) {
        if (!f12926 || serviceC5428.f12945) {
            return;
        }
        serviceC5428.m11922();
        serviceC5428.m11928();
        C7050.m16206(500L, new RunnableC17751(2, serviceC5428));
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m11926(ServiceC5428 serviceC5428) {
        if (!f12926 || serviceC5428.f12945) {
            return;
        }
        C22682.m50800("Getting screen image timed out");
        serviceC5428.stopSelf();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m11931(ServiceC5428 serviceC5428) {
        if (!f12926 || serviceC5428.f12945) {
            return;
        }
        serviceC5428.m11922();
        serviceC5428.m11928();
        C7050.m16206(500L, new RunnableC20875(2, serviceC5428));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m11932() {
        return f12926;
    }
}
