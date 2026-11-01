package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;
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
public final class C21594 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C6841 f68082;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ boolean f68083;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ HashMap f68084;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f68085;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C1349 f68086;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Collection f68087;

    /* JADX INFO: renamed from: ᩻ */
    public C23380 f68088;

    public C21594(C6841 c6841, HashMap map, C1349 c1349, boolean z, Collection collection) {
        this.f68082 = c6841;
        this.f68084 = map;
        this.f68086 = c1349;
        this.f68083 = z;
        this.f68087 = collection;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f68082.f17771);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51883();
        this.f68085 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        boolean z;
        final String string;
        final String str;
        final String str2;
        final String str3;
        String strReplace;
        String strReplace2;
        String strSubstring;
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f68082.f17769;
        HashMap map = new HashMap();
        HashMap map2 = this.f68084;
        for (Map.Entry entry : map2.entrySet()) {
            String type = (String) entry.getKey();
            InterfaceC15206 interfaceC15206M32127 = viewOnClickListenerC9523.f26081.m32127(type);
            C12826.requireNonNull(interfaceC15206M32127);
            try {
                C9952 c9952Mo33762 = interfaceC15206M32127.mo33762();
                C12826.requireNonNull(c9952Mo33762);
                type = c9952Mo33762.getType();
                strSubstring = type.substring(1, type.length() - 1);
            } catch (Exception unused) {
                strSubstring = type;
            }
            map.put(strSubstring, (String) entry.getValue());
        }
        viewOnClickListenerC9523.f26081.m32093(map2);
        C14121 c14121 = viewOnClickListenerC9523.f26081;
        C24164 c24164 = this.f68085;
        C12826.requireNonNull(c24164);
        C24793 c24793 = new C24793(c24164);
        final C0977 c0977 = new C0977(map.size());
        final C0977 c0978 = new C0977(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            z = this.f68083;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            c0977.put(C10965.m25286(new StringBuilder("L"), (String) entry2.getKey(), C0249l.f1196b), "L" + ((String) entry2.getValue()) + C0249l.f1196b);
            c0977.put(C10965.m25286(new StringBuilder("L"), (String) entry2.getKey(), "<"), "L" + ((String) entry2.getValue()) + "<");
            c0977.put(C10965.m25286(new StringBuilder("L"), (String) entry2.getKey(), "\","), "L" + ((String) entry2.getValue()) + "\",");
            if (z) {
                c0978.put(((String) entry2.getKey()).replace('/', '.'), ((String) entry2.getValue()).replace('/', '.'));
            }
        }
        C1349 c1349 = this.f68086;
        if (c1349 != null) {
            Object obj = c1349.f33659;
            Object obj2 = c1349.f33658;
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
        final C23380 c23380 = new C23380();
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        c14121.m32094(concurrentLinkedQueue, "", true, (Predicate) null);
        c24793.mo8466(0);
        final C20689 c20689 = new C20689(concurrentLinkedQueue.size());
        c20689.m46753(c24793);
        final C13259 c13259M30304 = C13259.m30304("L[^;:<\r\n()]+(;|<|\",)");
        Runnable runnable = new Runnable() { // from class: l.ܿܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC15206 interfaceC15206;
                String str6;
                String str7;
                C23948 c23948 = new C23948();
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    if (concurrentLinkedQueue2.isEmpty() || (interfaceC15206 = (InterfaceC15206) concurrentLinkedQueue2.poll()) == null) {
                        return;
                    }
                    c20689.m46754(1);
                    String strMo33763 = interfaceC15206.mo33763();
                    C12826.requireNonNull(strMo33763);
                    C13929 c13929Matcher = c13259M30304.matcher((CharSequence) strMo33763);
                    c23948.m53044();
                    int i = 0;
                    int iEnd = 0;
                    int i2 = 0;
                    while (c13929Matcher.find()) {
                        String strGroup = c13929Matcher.group();
                        if (TextUtils.indexOf(strMo33763, "const-string", strMo33763.lastIndexOf(10, c13929Matcher.start()) + 1, c13929Matcher.start()) == -1) {
                            String string3 = (String) c0977.getOrDefault(strGroup, null);
                            if (string3 == null && (str7 = string) != null && strGroup.startsWith(str7)) {
                                StringBuilder sbM17248 = C7470.m17248(str);
                                sbM17248.append(strGroup.substring(str7.length()));
                                string3 = sbM17248.toString();
                            }
                            if (string3 != null) {
                                c23948.append((CharSequence) strMo33763.substring(iEnd, c13929Matcher.start()));
                                c23948.append((CharSequence) string3);
                                iEnd = c13929Matcher.end();
                                i2++;
                            }
                        }
                    }
                    if (iEnd != 0) {
                        c23948.append((CharSequence) strMo33763.substring(iEnd));
                        strMo33763 = c23948.toString();
                    }
                    c23948.m53044();
                    C14317 c14317 = new C14317(strMo33763);
                    while (c14317.m32891()) {
                        String string4 = (String) c0978.getOrDefault(c14317.f40914, null);
                        if (string4 == null && (str6 = str2) != null && c14317.f40914.startsWith(str6)) {
                            StringBuilder sbM17249 = C7470.m17248(str3);
                            sbM17249.append(c14317.f40914.substring(str6.length()));
                            string4 = sbM17249.toString();
                        }
                        if (string4 != null) {
                            c23948.append((CharSequence) strMo33763.substring(i, c14317.f40916));
                            try {
                                C15693.m35744(c23948, string4);
                            } catch (IOException unused2) {
                            }
                            i = c14317.f40912;
                            i2++;
                        }
                    }
                    if (i != 0) {
                        c23948.append((CharSequence) strMo33763.substring(i));
                        strMo33763 = c23948.toString();
                    }
                    if (i2 > 0) {
                        interfaceC15206.mo33758(strMo33763);
                        c23380.m52023(i2);
                    }
                }
            }
        };
        c14121.m32085();
        c14121.m32103(false);
        C5275.m11400((int) (C19110.f57020 * 0.66f), runnable);
        c14121.m32103(true);
        c14121.m32122();
        this.f68088 = c23380;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C6841 c6841 = this.f68082;
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = c6841.f17769;
        viewOnClickListenerC9523.m22191();
        viewOnClickListenerC9523.m22190(this.f68087);
        c6841.f17771.m12254(R.string.MT_Protector, viewOnClickListenerC9523.getString(R.string.MT_Protector, Integer.valueOf(this.f68088.f74495), Integer.valueOf(this.f68088.f74494)), false);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f68082.f17769;
        viewOnClickListenerC9523.m22191();
        viewOnClickListenerC9523.f26075.m13320((Throwable) exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f68085.m53442();
        ((ActivityC18686) this.f68082.f17771).m42594();
    }
}
