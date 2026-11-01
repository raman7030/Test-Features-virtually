package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes2.dex */
public class C23835 extends AbstractC23625 {

    /* JADX INFO: renamed from: ۚ֫ */
    public static final /* synthetic */ int f75732 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public C23105 f75733;

    /* JADX INFO: renamed from: ۘ֫ */
    public long f75734 = 0;

    /* JADX INFO: renamed from: ᩴ֫ */
    public C19561 f75735;

    /* JADX INFO: renamed from: ᩵֫ */
    public C19561 f75736;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79707;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("tarZipPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        String strM13492 = m13492("srcZipPath");
        String strM13493 = m13492("tarZipPath");
        String strM13494 = m13492("targetPath");
        int iM13484 = m13484("update");
        String[] strArrM13494 = m13494("ARG_PATHS");
        C13457 c13457M13469 = m13469();
        boolean zM13488 = m13488("keepApkSigBlock");
        AbstractC17043 abstractC17043M42109 = C18524.m42109(strM13493, new String[0]);
        C19210.m43750(abstractC17043M42109, EnumC17868.MODIFY_FILE);
        this.f75735 = new C19561(C18524.m42109(strM13492, new String[0]));
        this.f75736 = new C19561(abstractC17043M42109);
        int i = 1;
        C23105 c23105M52841 = C23775.m52841(abstractC17043M42109, c13457M13469 != null);
        this.f75733 = c23105M52841;
        C10844 c10844M51527 = c23105M52841.m51527();
        boolean zM44471 = this.f75736.m44471();
        if (c13457M13469 == null && zM13488 && this.f75736.m44460()) {
            c10844M51527.m24990(this.f75736);
        }
        if (zM44471) {
            c10844M51527.m24999();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Collection<C5738> collectionM44469 = this.f75735.m44469();
        int length = strArrM13494.length;
        int i2 = 0;
        while (i2 < length) {
            String strSubstring = strArrM13494[i2].substring(i);
            if (strSubstring.endsWith("/")) {
                int iLastIndexOf = strSubstring.lastIndexOf(47, strSubstring.length() - 2) + 1;
                for (C5738 c5738 : collectionM44469) {
                    String[] strArr = strArrM13494;
                    Collection collection = collectionM44469;
                    if (c5738.getName().startsWith(strSubstring)) {
                        StringBuilder sbM17248 = C7470.m17248(strM13494);
                        sbM17248.append(c5738.getName().substring(iLastIndexOf));
                        String string = sbM17248.toString();
                        c5738.m12769(string);
                        linkedHashMap.put(string, c5738);
                    }
                    collectionM44469 = collection;
                    strArrM13494 = strArr;
                    strSubstring = strSubstring;
                }
            } else {
                C5738 c5738M44470 = this.f75735.m44470(strSubstring);
                StringBuilder sbM17249 = C7470.m17248(strM13494);
                sbM17249.append(c5738M44470.m12791());
                String string2 = sbM17249.toString();
                c5738M44470.m12769(string2);
                linkedHashMap.put(string2, c5738M44470);
            }
            i2++;
            i = 1;
            collectionM44469 = collectionM44469;
            strArrM13494 = strArrM13494;
        }
        for (C5738 c5739 : this.f75736.m44469()) {
            linkedHashMap2.put(c5739.getName(), c5739);
        }
        if (iM13484 == 0) {
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                linkedHashMap2.remove((String) it.next());
            }
        } else if (iM13484 == 1) {
            for (Map.Entry entry : new ArrayList(linkedHashMap.entrySet())) {
                C5738 c57310 = (C5738) linkedHashMap2.get(entry.getKey());
                if (c57310 != null) {
                    if (((C5738) entry.getValue()).getTime() > c57310.getTime()) {
                        linkedHashMap2.remove(entry.getKey());
                    } else {
                        linkedHashMap.remove(entry.getKey());
                    }
                }
            }
        } else if (iM13484 == 2) {
            Iterator it2 = linkedHashMap2.keySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove((String) it2.next());
            }
        }
        C16922 c16922 = new C16922();
        if (zM44471) {
            C5738 c57311 = (C5738) linkedHashMap.get("AndroidManifest.xml");
            if (c57311 != null) {
                InputStream inputStreamM44448 = this.f75735.m44448(c57311);
                try {
                    try {
                        C16820 c16820M38130 = C16820.m38130(inputStreamM44448);
                        c16922.f50093 = C23527.m52310(c16820M38130);
                        c16922.f50092 = C23527.m52312(c16820M38130);
                    } catch (Exception unused) {
                        c16922.f50093 = false;
                        c16922.f50092 = false;
                    }
                    inputStreamM44448.close();
                } catch (Throwable th) {
                    try {
                        inputStreamM44448.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                c16922.m38499(this.f75736);
            }
        }
        C17128 c17128 = new C17128(this, m52904(linkedHashMap.values(), c16922) + m52904(linkedHashMap2.values(), c16922));
        int i3 = 0;
        for (C5738 c57312 : linkedHashMap.values()) {
            if (mo3924()) {
                return C18736.m42768();
            }
            i3++;
            mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i3 + "/" + linkedHashMap.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo13456(c57312.getName());
            if (c57312.isDirectory()) {
                c10844M51527.m24987(c57312);
            } else {
                C22959.m51285(this.f75735, c10844M51527, c57312, c16922, new C23165(c17128));
                this.f75734 += C22959.m51284(c57312, c16922);
            }
        }
        Iterator it3 = linkedHashMap2.values().iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            C5738 c57313 = (C5738) it3.next();
            if (mo3924()) {
                return C18736.m42768();
            }
            int i5 = i4 + 1;
            mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i5 + "/" + linkedHashMap2.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo13456(c57313.getName());
            if (c57313.isDirectory()) {
                c10844M51527.m24987(c57313);
            } else {
                C22959.m51285(this.f75736, c10844M51527, c57313, c16922, new C23165(c17128));
                this.f75734 += C22959.m51284(c57313, c16922);
            }
            it3 = it3;
            i4 = i5;
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        C2700.m4192(this.f75735);
        this.f75735 = null;
        C2700.m4192(this.f75736);
        this.f75736 = null;
        c10844M51527.close();
        if (c13457M13469 != null) {
            C11896.m27217(this.f75733, c13457M13469, this);
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        C20272.m45790(abstractC17043M42109);
        C19056 c19056 = new C19056();
        c19056.m43296(abstractC17043M42109);
        this.f75733.m51526(abstractC17043M42109, new RunnableC22254(3, this, abstractC17043M42109), new AutoCloseable[0]);
        c19056.m43298(abstractC17043M42109);
        return C18736.m42767();
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m52904(Collection collection, C16922 c16922) {
        Iterator it = collection.iterator();
        long jM51284 = 0;
        while (it.hasNext()) {
            C5738 c5738 = (C5738) it.next();
            if (!c5738.isDirectory()) {
                jM51284 += C22959.m51284(c5738, c16922);
            }
        }
        return jM51284;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773()) {
            if (m13478(c18107)) {
                c18107.m41267();
            }
            if (m13461(c18108)) {
                c18108.m41226((Collection) AbstractC5996.m13446(m13494("ARG_PATHS")));
                c18108.m41241();
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C23105 c23105 = this.f75733;
        if (c23105 != null) {
            C2700.m4192(c23105.m51527());
            this.f75733.m51525().mo25503();
        }
        C2700.m4192(this.f75735);
        C2700.m4192(this.f75736);
        C17127.m38756();
    }
}
