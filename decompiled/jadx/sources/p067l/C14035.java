package p067l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.۫۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8OH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14035 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public C17387 f39581;

    /* JADX INFO: renamed from: ۜ */
    public C6184 f39582;

    /* JADX INFO: renamed from: ۡ */
    public C3501 f39583;

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList f39584;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22753 f39585;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC22753 f39586;

    /* JADX INFO: renamed from: ܽ */
    public C2635 f39587;

    /* JADX INFO: renamed from: ܿ */
    public C7330 f39588;

    /* JADX INFO: renamed from: ᩳ */
    public final Context f39589;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC22753 f39590;

    /* JADX INFO: renamed from: ᩻ */
    public C18253 f39591;

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        interfaceC2830.getClass();
        this.f39585.mo8132(interfaceC2830);
        this.f39584.add(interfaceC2830);
        m31870(this.f39591, interfaceC2830);
        m31870(this.f39581, interfaceC2830);
        m31870(this.f39587, interfaceC2830);
        m31870(this.f39590, interfaceC2830);
        m31870(this.f39583, interfaceC2830);
        m31870(this.f39588, interfaceC2830);
        m31870(this.f39582, interfaceC2830);
    }

    public C14035(Context context, InterfaceC22753 interfaceC22753) {
        this.f39589 = context.getApplicationContext();
        interfaceC22753.getClass();
        this.f39585 = interfaceC22753;
        this.f39584 = new ArrayList();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) {
        C23877.m52960(this.f39586 == null);
        Uri uri = c5318.f12514;
        String scheme = uri.getScheme();
        String str = C5792.f14228;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f39589;
        if (zIsEmpty || C12826.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f39591 == null) {
                    C18253 c18253 = new C18253(false);
                    this.f39591 = c18253;
                    m31869(c18253);
                }
                this.f39586 = this.f39591;
            } else {
                if (this.f39581 == null) {
                    C17387 c17387 = new C17387(context);
                    this.f39581 = c17387;
                    m31869(c17387);
                }
                this.f39586 = this.f39581;
            }
        } else if (!"asset".equals(scheme)) {
            if (!"content".equals(scheme)) {
                boolean zEquals = "rtmp".equals(scheme);
                InterfaceC22753 interfaceC22753 = this.f39585;
                if (!zEquals) {
                    if (!"udp".equals(scheme)) {
                        if (!AbstractC0213e.f989m.equals(scheme)) {
                            if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                                this.f39586 = interfaceC22753;
                            } else {
                                if (this.f39582 == null) {
                                    C6184 c6184 = new C6184(context);
                                    this.f39582 = c6184;
                                    m31869(c6184);
                                }
                                this.f39586 = this.f39582;
                            }
                        } else {
                            if (this.f39588 == null) {
                                C7330 c7330 = new C7330(false);
                                this.f39588 = c7330;
                                m31869(c7330);
                            }
                            this.f39586 = this.f39588;
                        }
                    } else {
                        if (this.f39583 == null) {
                            C3501 c3501 = new C3501();
                            this.f39583 = c3501;
                            m31869(c3501);
                        }
                        this.f39586 = this.f39583;
                    }
                } else {
                    if (this.f39590 == null) {
                        try {
                            InterfaceC22753 interfaceC22754 = (InterfaceC22753) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f39590 = interfaceC22754;
                            m31869(interfaceC22754);
                        } catch (ClassNotFoundException unused) {
                            C21334.m48351("Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.f39590 == null) {
                            this.f39590 = interfaceC22753;
                        }
                    }
                    this.f39586 = this.f39590;
                }
            } else {
                if (this.f39587 == null) {
                    C2635 c2635 = new C2635(context);
                    this.f39587 = c2635;
                    m31869(c2635);
                }
                this.f39586 = this.f39587;
            }
        } else {
            if (this.f39581 == null) {
                C17387 c17388 = new C17387(context);
                this.f39581 = c17388;
                m31869(c17388);
            }
            this.f39586 = this.f39581;
        }
        return this.f39586.mo4020(c5318);
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC22753 interfaceC22753 = this.f39586;
        interfaceC22753.getClass();
        return interfaceC22753.read(bArr, i, i2);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        InterfaceC22753 interfaceC22753 = this.f39586;
        if (interfaceC22753 == null) {
            return null;
        }
        return interfaceC22753.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        InterfaceC22753 interfaceC22753 = this.f39586;
        return interfaceC22753 == null ? Collections.EMPTY_MAP : interfaceC22753.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        InterfaceC22753 interfaceC22753 = this.f39586;
        if (interfaceC22753 != null) {
            try {
                interfaceC22753.close();
            } finally {
                this.f39586 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31869(InterfaceC22753 interfaceC22753) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f39584;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC22753.mo8132((InterfaceC2830) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31870(InterfaceC22753 interfaceC22753, InterfaceC2830 interfaceC2830) {
        if (interfaceC22753 != null) {
            interfaceC22753.mo8132(interfaceC2830);
        }
    }
}
