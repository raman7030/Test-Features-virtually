package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20229 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4706 f65434;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f65435;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f65436;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f65437;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10220 f65438;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f65439;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22108 f65440;

    public C20229(C4706 c4706, HashMap map, C10220 c10220, boolean z, Collection collection) {
        this.f65434 = c4706;
        this.f65436 = map;
        this.f65438 = c10220;
        this.f65435 = z;
        this.f65439 = collection;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f65434.f14941);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49547();
        this.f65437 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        boolean z;
        final String string;
        final String str;
        final String str2;
        final String str3;
        String strReplace;
        String strReplace2;
        String strSubstring;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f65434.f14939;
        HashMap map = new HashMap();
        HashMap map2 = this.f65436;
        for (Map.Entry entry : map2.entrySet()) {
            String type = (String) entry.getKey();
            InterfaceC13508 interfaceC13508M30066 = viewOnClickListenerC7528.f23168.m30066(type);
            C11003.requireNonNull(interfaceC13508M30066);
            try {
                C7980 c7980Mo31674 = interfaceC13508M30066.mo31674();
                C11003.requireNonNull(c7980Mo31674);
                type = c7980Mo31674.getType();
                strSubstring = type.substring(1, type.length() - 1);
            } catch (Exception unused) {
                strSubstring = type;
            }
            map.put(strSubstring, (String) entry.getValue());
        }
        viewOnClickListenerC7528.f23168.m30032(map2);
        C12366 c12366 = viewOnClickListenerC7528.f23168;
        C22933 c22933 = this.f65437;
        C11003.requireNonNull(c22933);
        C23595 c23595 = new C23595(c22933);
        final C2727 c2727 = new C2727(map.size());
        final C2727 c2728 = new C2727(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            z = this.f65435;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            c2727.put(C9045.m23341(new StringBuilder("L"), (String) entry2.getKey(), l.b), "L" + ((String) entry2.getValue()) + l.b);
            c2727.put(C9045.m23341(new StringBuilder("L"), (String) entry2.getKey(), "<"), "L" + ((String) entry2.getValue()) + "<");
            c2727.put(C9045.m23341(new StringBuilder("L"), (String) entry2.getKey(), "\","), "L" + ((String) entry2.getValue()) + "\",");
            if (z) {
                c2728.put(((String) entry2.getKey()).replace('/', '.'), ((String) entry2.getValue()).replace('/', '.'));
            }
        }
        C10220 c10220 = this.f65438;
        if (c10220 != null) {
            Object obj = c10220.f30698;
            Object obj2 = c10220.f30697;
            StringBuilder sb = new StringBuilder("L");
            String str4 = (String) obj2;
            sb.append(str4);
            string = sb.toString();
            StringBuilder sb2 = new StringBuilder("L");
            String str5 = (String) obj;
            sb2.append(str5);
            String string2 = sb2.toString();
            if (z) {
                strReplace = str4.replace('/', '.');
                strReplace2 = str5.replace('/', '.');
            } else {
                strReplace = null;
                strReplace2 = null;
            }
            str2 = strReplace;
            str3 = strReplace2;
            str = string2;
        } else {
            string = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        final C22108 c22108 = new C22108();
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        c12366.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
        c23595.mo6264(0);
        final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
        c19277.m44459(c23595);
        final C11459 c11459M28260 = C11459.m28260("L[^;:<\r\n()]+(;|<|\",)");
        Runnable runnable = new Runnable() { // from class: l.ܿܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC13508 interfaceC13508;
                String str6;
                String str7;
                C22706 c22706 = new C22706();
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    if (concurrentLinkedQueue2.isEmpty() || (interfaceC13508 = (InterfaceC13508) concurrentLinkedQueue2.poll()) == null) {
                        return;
                    }
                    c19277.m44460(1);
                    String strMo31675 = interfaceC13508.mo31675();
                    C11003.requireNonNull(strMo31675);
                    C12164 c12164Matcher = c11459M28260.matcher((CharSequence) strMo31675);
                    c22706.m50718();
                    int i = 0;
                    int iEnd = 0;
                    int i2 = 0;
                    while (c12164Matcher.find()) {
                        String strGroup = c12164Matcher.group();
                        if (TextUtils.indexOf(strMo31675, "const-string", strMo31675.lastIndexOf(10, c12164Matcher.start()) + 1, c12164Matcher.start()) == -1) {
                            String string3 = (String) c2727.getOrDefault(strGroup, null);
                            if (string3 == null && (str7 = string) != null && strGroup.startsWith(str7)) {
                                StringBuilder sbM15339 = C5368.m15339(str);
                                sbM15339.append(strGroup.substring(str7.length()));
                                string3 = sbM15339.toString();
                            }
                            if (string3 != null) {
                                c22706.append((CharSequence) strMo31675.substring(iEnd, c12164Matcher.start()));
                                c22706.append((CharSequence) string3);
                                iEnd = c12164Matcher.end();
                                i2++;
                            }
                        }
                    }
                    if (iEnd != 0) {
                        c22706.append((CharSequence) strMo31675.substring(iEnd));
                        strMo31675 = c22706.toString();
                    }
                    c22706.m50718();
                    C12572 c12572 = new C12572(strMo31675);
                    while (c12572.m30816()) {
                        String string4 = (String) c2728.getOrDefault(c12572.f37888, null);
                        if (string4 == null && (str6 = str2) != null && c12572.f37888.startsWith(str6)) {
                            StringBuilder sbM153310 = C5368.m15339(str3);
                            sbM153310.append(c12572.f37888.substring(str6.length()));
                            string4 = sbM153310.toString();
                        }
                        if (string4 != null) {
                            c22706.append((CharSequence) strMo31675.substring(i, c12572.f37890));
                            try {
                                C14020.m33624(c22706, string4);
                            } catch (IOException unused2) {
                            }
                            i = c12572.f37886;
                            i2++;
                        }
                    }
                    if (i != 0) {
                        c22706.append((CharSequence) strMo31675.substring(i));
                        strMo31675 = c22706.toString();
                    }
                    if (i2 > 0) {
                        interfaceC13508.mo31670(strMo31675);
                        c22108.m49685(i2);
                    }
                }
            }
        };
        c12366.m30024();
        c12366.m30042(false);
        C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
        c12366.m30042(true);
        c12366.m30061();
        this.f65440 = c22108;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C4706 c4706 = this.f65434;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = c4706.f14939;
        viewOnClickListenerC7528.m20215();
        viewOnClickListenerC7528.m20214(this.f65439);
        c4706.f14941.m10218(R.string.MT_Protector, viewOnClickListenerC7528.getString(R.string.MT_Protector, Integer.valueOf(this.f65440.f71773), Integer.valueOf(this.f65440.f71772)), false);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f65434.f14939;
        viewOnClickListenerC7528.m20215();
        viewOnClickListenerC7528.f23162.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f65437.m51051();
        ((ActivityC17169) this.f65434.f14941).m40349();
    }
}
