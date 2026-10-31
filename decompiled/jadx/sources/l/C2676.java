package l;

import android.text.Html;
import android.webkit.WebResourceResponse;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G72T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2676 implements InterfaceC0268, AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f8383;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8384;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f8386;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f8387;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f8388;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f8389;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f8390;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8392;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC0921 f8393;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f8394;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f8395;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f8391 = new Object();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashSet f8385 = new HashSet();

    public C2676(ActivityC0921 activityC0921, AbstractC13921 abstractC13921, String str, boolean z, AbstractC15440 abstractC15440, String str2, boolean z2) {
        this.f8393 = activityC0921;
        this.f8386 = abstractC13921;
        this.f8388 = abstractC13921 instanceof C2346 ? new Object() : abstractC13921;
        this.f8395 = str;
        this.f8389 = z;
        this.f8387 = abstractC13921 instanceof AbstractC3163;
        this.f8383 = abstractC15440;
        this.f8390 = str2;
        this.f8394 = z2;
    }

    @Override // l.InterfaceC0268
    /* JADX INFO: renamed from: ֫ */
    public final WebResourceResponse mo1582(String str) {
        return m8378(str, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m8387(String str) {
        if (this.f8387) {
            m8381(false);
        }
        return m8378(str, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m8378(String str, boolean z) {
        final int i;
        final InterfaceC17889 interfaceC17889M8385;
        C23157 c23157;
        synchronized (this.f8391) {
            i = this.f8384;
        }
        if (!m8382(i)) {
            return m8383(404, "Not Found");
        }
        String strM18702 = C6909.m18702(str);
        if (strM18702 != null && (strM18702.isEmpty() || str.endsWith("/"))) {
            strM18702 = strM18702.isEmpty() ? "index.html" : strM18702.concat("/index.html");
        }
        String str2 = strM18702;
        String strM18704 = C6909.m18704(this.f8395, str2);
        if (str2 == null || strM18704 == null) {
            return m8383(404, "Not Found");
        }
        try {
            if (this.f8383 != null && strM18704.equals(this.f8390)) {
                return m8377("text/html", a.D, new C23157(this.f8383.mo27926(), new Consumer() { // from class: l.ۡܿܳ
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C2676.m8380(this.f27391, (C23157) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C23517.$default$andThen(this, consumer);
                    }
                }), i);
            }
            if (!this.f8394) {
                return m8383(404, "Not Found");
            }
            synchronized (this.f8388) {
                synchronized (this.f8386) {
                    if (!m8382(i)) {
                        return m8383(404, "Not Found");
                    }
                    if (this.f8387 && z) {
                        this.f8386.mo7646(false);
                    }
                    if (this.f8389 || this.f8387) {
                        interfaceC17889M8385 = m8385(str2);
                    } else {
                        interfaceC17889M8385 = this.f8386.mo7638(strM18704);
                    }
                    if (interfaceC17889M8385 != null && ((C15688) interfaceC17889M8385).mo36969()) {
                        if (this.f8387) {
                            c23157 = new C23157(new InterfaceC11869() { // from class: l.ܺܿܳ
                                @Override // l.InterfaceC11869
                                /* JADX INFO: renamed from: ֫ */
                                public final InputStream mo28995() {
                                    return C2676.m8379(this.f49560, i, interfaceC17889M8385);
                                }
                            }, new Consumer() { // from class: l.ۡܿܳ
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    C2676.m8380(this.f27391, (C23157) obj);
                                }

                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C23517.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            InputStream inputStreamMo7636 = this.f8386.mo7636(this.f8393, interfaceC17889M8385);
                            if (inputStreamMo7636 == null) {
                                return m8383(404, "Not Found");
                            }
                            c23157 = new C23157(inputStreamMo7636, new Consumer() { // from class: l.ۡܿܳ
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    C2676.m8380(this.f27391, (C23157) obj);
                                }

                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C23517.$default$andThen(this, consumer);
                                }
                            });
                        }
                        return m8377(C1285.m4347(str2), null, c23157, i);
                    }
                    return m8376(404, "Not Found", z);
                }
            }
        } catch (IOException | RuntimeException unused) {
            if (this.f8387 && m8382(i)) {
                return m8376(502, "Bad Gateway", z);
            }
            return m8383(404, "Not Found");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private InterfaceC17889 m8385(String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(this.f8395);
        int i = 0;
        while (i < str.length()) {
            int iIndexOf = str.indexOf(47, i);
            boolean z = iIndexOf == -1;
            if (z) {
                iIndexOf = str.length();
            }
            sb.append((CharSequence) str, i, iIndexOf);
            if (z) {
                string = sb.toString();
            } else {
                string = ((Object) sb) + "/";
            }
            arrayList.add(string);
            if (!z) {
                sb.append('/');
            }
            i = iIndexOf + 1;
        }
        Iterator it = arrayList.iterator();
        InterfaceC17889 interfaceC17889Mo7638 = null;
        while (it.hasNext()) {
            interfaceC17889Mo7638 = this.f8386.mo7638((String) it.next());
            if (interfaceC17889Mo7638 == null || ((C15688) interfaceC17889Mo7638).mo36978()) {
                return null;
            }
        }
        return interfaceC17889Mo7638;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m8379(C2676 c2676, int i, InterfaceC17889 interfaceC17889) {
        InputStream inputStreamMo7636;
        synchronized (c2676.f8386) {
            if (!c2676.m8382(i)) {
                throw new IOException("HTML preview request was cancelled");
            }
            inputStreamMo7636 = c2676.f8386.mo7636(c2676.f8393, interfaceC17889);
        }
        return inputStreamMo7636;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m8377(String str, String str2, C23157 c23157, int i) {
        synchronized (this.f8391) {
            if (!this.f8392 && i == this.f8384) {
                this.f8385.add(c23157);
                return new WebResourceResponse(str, str2, 200, "OK", m8384(), c23157);
            }
            c23157.close();
            return m8383(404, "Not Found");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m8376(int i, String str, boolean z) {
        if (!this.f8387 || !z) {
            return m8383(i, str);
        }
        return new WebResourceResponse("text/html", a.D, i, str, m8384(), new ByteArrayInputStream(("<!doctype html><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>" + Html.escapeHtml(C4925.m14327(R.string.MT_Protector)) + "</p><p><a href=\"\">" + Html.escapeHtml(C4925.m14327(R.string.MT_Protector)) + "</a></p>").getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m8383(int i, String str) {
        return new WebResourceResponse("text/plain", a.D, i, str, m8384(), new ByteArrayInputStream(new byte[0]));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap m8384() {
        HashMap map = new HashMap();
        map.put("Cache-Control", "no-store");
        map.put("Referrer-Policy", "same-origin");
        map.put("Cross-Origin-Resource-Policy", "same-origin");
        return map;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8386() {
        m8381(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m8381(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8381(boolean z) {
        int i;
        C23157[] c23157Arr;
        synchronized (this.f8391) {
            this.f8392 = z | this.f8392;
            this.f8384++;
            c23157Arr = (C23157[]) this.f8385.toArray(new C23157[0]);
            this.f8385.clear();
        }
        for (C23157 c23157 : c23157Arr) {
            c23157.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m8382(int i) {
        boolean z;
        synchronized (this.f8391) {
            z = !this.f8392 && this.f8384 == i;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8380(C2676 c2676, C23157 c23157) {
        synchronized (c2676.f8391) {
            c2676.f8385.remove(c23157);
        }
    }
}
