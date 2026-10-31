package l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.۫۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8OH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12276 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15803 f36565;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4015 f36566;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C1192 f36567;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36568;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f36569;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f36570;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0281 f36571;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5221 f36572;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Context f36573;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f36574;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16714 f36575;

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        interfaceC0486.getClass();
        this.f36569.mo5937(interfaceC0486);
        this.f36568.add(interfaceC0486);
        m29808(this.f36575, interfaceC0486);
        m29808(this.f36565, interfaceC0486);
        m29808(this.f36571, interfaceC0486);
        m29808(this.f36574, interfaceC0486);
        m29808(this.f36567, interfaceC0486);
        m29808(this.f36572, interfaceC0486);
        m29808(this.f36566, interfaceC0486);
    }

    public C12276(Context context, InterfaceC21449 interfaceC21449) {
        this.f36573 = context.getApplicationContext();
        interfaceC21449.getClass();
        this.f36569 = interfaceC21449;
        this.f36568 = new ArrayList();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        C22632.m50634(this.f36570 == null);
        Uri uri = c3104.f9711;
        String scheme = uri.getScheme();
        String str = C3603.f11424;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f36573;
        if (zIsEmpty || C11003.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f36575 == null) {
                    C16714 c16714 = new C16714(false);
                    this.f36575 = c16714;
                    m29807(c16714);
                }
                this.f36570 = this.f36575;
            } else {
                if (this.f36565 == null) {
                    C15803 c15803 = new C15803(context);
                    this.f36565 = c15803;
                    m29807(c15803);
                }
                this.f36570 = this.f36565;
            }
        } else if (!"asset".equals(scheme)) {
            if (!"content".equals(scheme)) {
                boolean zEquals = "rtmp".equals(scheme);
                InterfaceC21449 interfaceC21449 = this.f36569;
                if (!zEquals) {
                    if (!"udp".equals(scheme)) {
                        if (!e.m.equals(scheme)) {
                            if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                                this.f36570 = interfaceC21449;
                            } else {
                                if (this.f36566 == null) {
                                    C4015 c4015 = new C4015(context);
                                    this.f36566 = c4015;
                                    m29807(c4015);
                                }
                                this.f36570 = this.f36566;
                            }
                        } else {
                            if (this.f36572 == null) {
                                C5221 c5221 = new C5221(false);
                                this.f36572 = c5221;
                                m29807(c5221);
                            }
                            this.f36570 = this.f36572;
                        }
                    } else {
                        if (this.f36567 == null) {
                            C1192 c1192 = new C1192();
                            this.f36567 = c1192;
                            m29807(c1192);
                        }
                        this.f36570 = this.f36567;
                    }
                } else {
                    if (this.f36574 == null) {
                        try {
                            InterfaceC21449 interfaceC214410 = (InterfaceC21449) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f36574 = interfaceC214410;
                            m29807(interfaceC214410);
                        } catch (ClassNotFoundException unused) {
                            C19956.m46037("Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.f36574 == null) {
                            this.f36574 = interfaceC21449;
                        }
                    }
                    this.f36570 = this.f36574;
                }
            } else {
                if (this.f36571 == null) {
                    C0281 c0281 = new C0281(context);
                    this.f36571 = c0281;
                    m29807(c0281);
                }
                this.f36570 = this.f36571;
            }
        } else {
            if (this.f36565 == null) {
                C15803 c15804 = new C15803(context);
                this.f36565 = c15804;
                m29807(c15804);
            }
            this.f36570 = this.f36565;
        }
        return this.f36570.mo1620(c3104);
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC21449 interfaceC21449 = this.f36570;
        interfaceC21449.getClass();
        return interfaceC21449.read(bArr, i, i2);
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f36570;
        if (interfaceC21449 == null) {
            return null;
        }
        return interfaceC21449.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f36570;
        return interfaceC21449 == null ? Collections.EMPTY_MAP : interfaceC21449.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        InterfaceC21449 interfaceC21449 = this.f36570;
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } finally {
                this.f36570 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29807(InterfaceC21449 interfaceC21449) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36568;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC21449.mo5937((InterfaceC0486) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29808(InterfaceC21449 interfaceC21449, InterfaceC0486 interfaceC0486) {
        if (interfaceC21449 != null) {
            interfaceC21449.mo5937(interfaceC0486);
        }
    }
}
