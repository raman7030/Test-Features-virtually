package l;

import android.app.Application;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Looper;
import com.alipay.sdk.m.y.c;

/* JADX INFO: renamed from: l.ܺ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48SH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16155 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20888 f49755;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f49756;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16014 f49757;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f49758;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f49759;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f49760;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10575 f49761;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C9599 f49762;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f49763;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Looper f49764;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18231 f49765;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f49766;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6984 f49767;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC6141 f49768;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18055 f49769;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14185 f49770;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f49771;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f49772;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC6141 f49773;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49774;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C21096 f49775;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49776;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49777;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f49778;

    public C16155(final Application application) {
        this(application, new InterfaceC6141() { // from class: l.ۢ᩶֫
            @Override // l.InterfaceC6141
            public final Object get() {
                return new C7752(application);
            }
        }, new InterfaceC6141() { // from class: l.ۡ᩶֫
            @Override // l.InterfaceC6141
            public final Object get() {
                return new C22682(new C12981(application), new C19008());
            }
        });
    }

    public C16155(ActivityC10227 activityC10227, C7752 c7752, C22682 c22682) {
        this(activityC10227, new C14744(c7752), new C23917(c22682));
    }

    public C16155(ContextWrapper contextWrapper, InterfaceC6141 interfaceC6141, InterfaceC6141 interfaceC6142) {
        C6984 c6984 = new C6984(contextWrapper);
        C21096 c21096 = new C21096();
        C18055 c18055 = new C18055(1, contextWrapper);
        C16014 c16014 = new C16014(4);
        this.f49766 = contextWrapper;
        this.f49773 = interfaceC6141;
        this.f49768 = interfaceC6142;
        this.f49767 = c6984;
        this.f49775 = c21096;
        this.f49769 = c18055;
        this.f49757 = c16014;
        String str = C3603.f11424;
        Looper looperMyLooper = Looper.myLooper();
        this.f49764 = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f49765 = C18231.f56651;
        this.f49774 = 1;
        this.f49776 = true;
        this.f49762 = C9599.f29128;
        this.f49760 = 5000L;
        this.f49756 = 15000L;
        this.f49763 = c.a;
        this.f49755 = C20888.f67585;
        this.f49761 = new C12691().m30960();
        this.f49770 = InterfaceC16427.f50519;
        this.f49772 = 500L;
        this.f49778 = 2000L;
        this.f49777 = true;
        this.f49758 = "";
        this.f49759 = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38082(C7752 c7752) {
        C22632.m50634(!this.f49771);
        this.f49773 = new C14744(c7752);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38083(C22682 c22682) {
        C22632.m50634(!this.f49771);
        this.f49768 = new C23917(c22682);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38084() {
        C22632.m50634(!this.f49771);
        this.f49760 = 10000L;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38085() {
        C22632.m50634(!this.f49771);
        this.f49756 = 15000L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4162 m38081() {
        C22632.m50634(!this.f49771);
        this.f49771 = true;
        return new C15700(this);
    }
}
