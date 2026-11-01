package p067l;

import android.text.Html;
import android.webkit.WebResourceResponse;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p055w.C0233a;
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
public final class C4912 implements InterfaceC2623, AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC17043 f11178;

    /* JADX INFO: renamed from: ۙ */
    public int f11179;

    /* JADX INFO: renamed from: ۟ */
    public final AbstractC15599 f11181;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f11182;

    /* JADX INFO: renamed from: ۨ */
    public final Object f11183;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f11184;

    /* JADX INFO: renamed from: ۬ */
    public final String f11185;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f11187;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC3244 f11188;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f11189;

    /* JADX INFO: renamed from: ᩺ */
    public final String f11190;

    /* JADX INFO: renamed from: ܰ */
    public final Object f11186 = new Object();

    /* JADX INFO: renamed from: ۛ */
    public final HashSet f11180 = new HashSet();

    public C4912(ActivityC3244 activityC3244, AbstractC15599 abstractC15599, String str, boolean z, AbstractC17043 abstractC17043, String str2, boolean z2) {
        this.f11188 = activityC3244;
        this.f11181 = abstractC15599;
        this.f11183 = abstractC15599 instanceof C4598 ? new Object() : abstractC15599;
        this.f11190 = str;
        this.f11184 = z;
        this.f11182 = abstractC15599 instanceof AbstractC5375;
        this.f11178 = abstractC17043;
        this.f11185 = str2;
        this.f11189 = z2;
    }

    @Override // p067l.InterfaceC2623
    /* JADX INFO: renamed from: ֫ */
    public final WebResourceResponse mo3980(String str) {
        return m10424(str, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final WebResourceResponse m10433(String str) {
        if (this.f11182) {
            m10427(false);
        }
        return m10424(str, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private WebResourceResponse m10424(String str, boolean z) {
        final int i;
        final InterfaceC19370 interfaceC19370M10431;
        C24377 c24377;
        synchronized (this.f11186) {
            i = this.f11179;
        }
        if (!m10428(i)) {
            return m10429(404, "Not Found");
        }
        String strM20651 = C8935.m20651(str);
        if (strM20651 != null && (strM20651.isEmpty() || str.endsWith("/"))) {
            strM20651 = strM20651.isEmpty() ? "index.html" : strM20651.concat("/index.html");
        }
        String str2 = strM20651;
        String strM20653 = C8935.m20653(this.f11190, str2);
        if (str2 == null || strM20653 == null) {
            return m10429(404, "Not Found");
        }
        try {
            if (this.f11178 != null && strM20653.equals(this.f11185)) {
                return m10423("text/html", C0233a.f1077D, new C24377(this.f11178.mo29987(), new Consumer() { // from class: l.ۡܿܳ
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C4912.m10426(this.f30327, (C24377) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C24719.$default$andThen(this, consumer);
                    }
                }), i);
            }
            if (!this.f11189) {
                return m10429(404, "Not Found");
            }
            synchronized (this.f11183) {
                synchronized (this.f11181) {
                    if (!m10428(i)) {
                        return m10429(404, "Not Found");
                    }
                    if (this.f11182 && z) {
                        this.f11181.mo9717(false);
                    }
                    if (this.f11184 || this.f11182) {
                        interfaceC19370M10431 = m10431(str2);
                    } else {
                        interfaceC19370M10431 = this.f11181.mo9709(strM20653);
                    }
                    if (interfaceC19370M10431 != null && ((C17278) interfaceC19370M10431).mo39135()) {
                        if (this.f11182) {
                            c24377 = new C24377(new InterfaceC13649() { // from class: l.ܺܿܳ
                                @Override // p067l.InterfaceC13649
                                /* JADX INFO: renamed from: ֫ */
                                public final InputStream mo31046() {
                                    return C4912.m10425(this.f52723, i, interfaceC19370M10431);
                                }
                            }, new Consumer() { // from class: l.ۡܿܳ
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    C4912.m10426(this.f30327, (C24377) obj);
                                }

                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C24719.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            InputStream inputStreamMo9707 = this.f11181.mo9707(this.f11188, interfaceC19370M10431);
                            if (inputStreamMo9707 == null) {
                                return m10429(404, "Not Found");
                            }
                            c24377 = new C24377(inputStreamMo9707, new Consumer() { // from class: l.ۡܿܳ
                                @Override // java.util.function.Consumer
                                public final void accept(Object obj) {
                                    C4912.m10426(this.f30327, (C24377) obj);
                                }

                                public /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return C24719.$default$andThen(this, consumer);
                                }
                            });
                        }
                        return m10423(C3590.m6593(str2), null, c24377, i);
                    }
                    return m10422(404, "Not Found", z);
                }
            }
        } catch (IOException | RuntimeException unused) {
            if (this.f11182 && m10428(i)) {
                return m10422(502, "Bad Gateway", z);
            }
            return m10429(404, "Not Found");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private InterfaceC19370 m10431(String str) {
        String string;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(this.f11190);
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
        InterfaceC19370 interfaceC19370Mo9709 = null;
        while (it.hasNext()) {
            interfaceC19370Mo9709 = this.f11181.mo9709((String) it.next());
            if (interfaceC19370Mo9709 == null || ((C17278) interfaceC19370Mo9709).mo39144()) {
                return null;
            }
        }
        return interfaceC19370Mo9709;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ InputStream m10425(C4912 c4912, int i, InterfaceC19370 interfaceC19370) {
        InputStream inputStreamMo9707;
        synchronized (c4912.f11181) {
            if (!c4912.m10428(i)) {
                throw new IOException("HTML preview request was cancelled");
            }
            inputStreamMo9707 = c4912.f11181.mo9707(c4912.f11188, interfaceC19370);
        }
        return inputStreamMo9707;
    }

    /* JADX INFO: renamed from: ֫ */
    private WebResourceResponse m10423(String str, String str2, C24377 c24377, int i) {
        synchronized (this.f11186) {
            if (!this.f11187 && i == this.f11179) {
                this.f11180.add(c24377);
                return new WebResourceResponse(str, str2, 200, "OK", m10430(), c24377);
            }
            c24377.close();
            return m10429(404, "Not Found");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private WebResourceResponse m10422(int i, String str, boolean z) {
        if (!this.f11182 || !z) {
            return m10429(i, str);
        }
        return new WebResourceResponse("text/html", C0233a.f1077D, i, str, m10430(), new ByteArrayInputStream(("<!doctype html><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>" + Html.escapeHtml(C7050.m16224(R.string.MT_Protector)) + "</p><p><a href=\"\">" + Html.escapeHtml(C7050.m16224(R.string.MT_Protector)) + "</a></p>").getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX INFO: renamed from: ۧ */
    public static WebResourceResponse m10429(int i, String str) {
        return new WebResourceResponse("text/plain", C0233a.f1077D, i, str, m10430(), new ByteArrayInputStream(new byte[0]));
    }

    /* JADX INFO: renamed from: ܽ */
    public static HashMap m10430() {
        HashMap map = new HashMap();
        map.put("Cache-Control", "no-store");
        map.put("Referrer-Policy", "same-origin");
        map.put("Cross-Origin-Resource-Policy", "same-origin");
        return map;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10432() {
        m10427(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m10427(true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10427(boolean z) {
        int i;
        C24377[] c24377Arr;
        synchronized (this.f11186) {
            this.f11187 = z | this.f11187;
            this.f11179++;
            c24377Arr = (C24377[]) this.f11180.toArray(new C24377[0]);
            this.f11180.clear();
        }
        for (C24377 c24377 : c24377Arr) {
            c24377.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m10428(int i) {
        boolean z;
        synchronized (this.f11186) {
            z = !this.f11187 && this.f11179 == i;
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10426(C4912 c4912, C24377 c24377) {
        synchronized (c4912.f11186) {
            c4912.f11180.remove(c24377);
        }
    }
}
