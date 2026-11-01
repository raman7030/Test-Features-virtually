package p067l;

import android.app.Application;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Looper;
import com.alipay.sdk.p010m.p058y.C0240c;

/* JADX INFO: renamed from: l.ܺ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48SH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17722 {

    /* JADX INFO: renamed from: ֡ */
    public C22220 f52921;

    /* JADX INFO: renamed from: ֨ */
    public long f52922;

    /* JADX INFO: renamed from: ֫ */
    public C17588 f52923;

    /* JADX INFO: renamed from: ۖ */
    public String f52924;

    /* JADX INFO: renamed from: ۘ */
    public int f52925;

    /* JADX INFO: renamed from: ۚ */
    public long f52926;

    /* JADX INFO: renamed from: ۜ */
    public C12419 f52927;

    /* JADX INFO: renamed from: ۠ */
    public C11491 f52928;

    /* JADX INFO: renamed from: ۡ */
    public long f52929;

    /* JADX INFO: renamed from: ۢ */
    public Looper f52930;

    /* JADX INFO: renamed from: ۧ */
    public C19695 f52931;

    /* JADX INFO: renamed from: ܳ */
    public final ContextWrapper f52932;

    /* JADX INFO: renamed from: ܶ */
    public C9006 f52933;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC8205 f52934;

    /* JADX INFO: renamed from: ܽ */
    public C19528 f52935;

    /* JADX INFO: renamed from: ܿ */
    public C15849 f52936;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f52937;

    /* JADX INFO: renamed from: ᩴ */
    public long f52938;

    /* JADX INFO: renamed from: ᩵ */
    public InterfaceC8205 f52939;

    /* JADX INFO: renamed from: ᩶ */
    public int f52940;

    /* JADX INFO: renamed from: ᩷ */
    public C22418 f52941;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f52942;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f52943;

    /* JADX INFO: renamed from: ᩻ */
    public long f52944;

    public C17722(final Application application) {
        this(application, new InterfaceC8205() { // from class: l.ۢ᩶֫
            @Override // p067l.InterfaceC8205
            public final Object get() {
                return new C9736(application);
            }
        }, new InterfaceC8205() { // from class: l.ۡ᩶֫
            @Override // p067l.InterfaceC8205
            public final Object get() {
                return new C23925(new C14705(application), new C20434());
            }
        });
    }

    public C17722(ActivityC12088 activityC12088, C9736 c9736, C23925 c23925) {
        this(activityC12088, new C16381(c9736), new C25099(c23925));
    }

    public C17722(ContextWrapper contextWrapper, InterfaceC8205 interfaceC8205, InterfaceC8205 interfaceC8206) {
        C9006 c9006 = new C9006(contextWrapper);
        C22418 c22418 = new C22418();
        C19528 c19528 = new C19528(1, contextWrapper);
        C17588 c17588 = new C17588(4);
        this.f52932 = contextWrapper;
        this.f52939 = interfaceC8205;
        this.f52934 = interfaceC8206;
        this.f52933 = c9006;
        this.f52941 = c22418;
        this.f52935 = c19528;
        this.f52923 = c17588;
        String str = C5792.f14228;
        Looper looperMyLooper = Looper.myLooper();
        this.f52930 = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f52931 = C19695.f59870;
        this.f52940 = 1;
        this.f52942 = true;
        this.f52928 = C11491.f32075;
        this.f52926 = 5000L;
        this.f52922 = 15000L;
        this.f52929 = C0240c.f1145a;
        this.f52921 = C22220.f70271;
        this.f52927 = new C14430().m33038();
        this.f52936 = InterfaceC17980.f53699;
        this.f52938 = 500L;
        this.f52944 = 2000L;
        this.f52943 = true;
        this.f52924 = "";
        this.f52925 = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40274(C9736 c9736) {
        C23877.m52960(!this.f52937);
        this.f52939 = new C16381(c9736);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40275(C23925 c23925) {
        C23877.m52960(!this.f52937);
        this.f52934 = new C25099(c23925);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40276() {
        C23877.m52960(!this.f52937);
        this.f52926 = 10000L;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40277() {
        C23877.m52960(!this.f52937);
        this.f52922 = 15000L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6324 m40273() {
        C23877.m52960(!this.f52937);
        this.f52937 = true;
        return new C17289(this);
    }
}
