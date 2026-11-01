package p067l;

import android.os.Build;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 898C */
/* JADX INFO: loaded from: classes4.dex */
public final class C13672 extends C17182 {
    @Override // p067l.C17182, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۚۧ */
    public final boolean mo31068() {
        return false;
    }

    @Override // p067l.C17182, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo31069(InterfaceC18588 interfaceC18588) {
        return false;
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public final String m31070() {
        return this.f51152.getPath();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @Override // p067l.C17182, p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final List mo25500(final boolean z) {
        String strM42102;
        File[] fileArrListFiles = this.f51152.listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        if (C18524.m42129()) {
            String strMo25505 = mo25505();
            String lowerCase = strMo25505.toLowerCase(Locale.ENGLISH);
            if (lowerCase.endsWith("/android/data") || lowerCase.endsWith("/android/obb")) {
                strM42102 = C18524.m42102(strMo25505);
                if (!"Android/data".equalsIgnoreCase(strM42102) && !"Android/obb".equalsIgnoreCase(strM42102)) {
                    strM42102 = null;
                }
            } else {
                strM42102 = null;
            }
        } else {
            strM42102 = null;
        }
        return (List) C23573.stream(fileArrListFiles).filter(new Predicate() { // from class: l.ۤᩴܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m28405or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z || !((File) obj).getName().startsWith(".");
            }
        }).map(new C8307(0, strM42102)).collect(C24205.toList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ AbstractC17043 m31066(File file, String str) {
        AbstractC17043 abstractC17043M42109;
        if (str == null || Build.VERSION.SDK_INT < 30) {
            abstractC17043M42109 = C18524.m42109(m31067(file.getPath()), new String[0]);
        } else {
            String strM31067 = m31067(file.getPath());
            boolean zIsDirectory = file.isDirectory();
            C6671 c6671 = new C6671(zIsDirectory ? -1L : file.length(), file.lastModified(), zIsDirectory);
            File file2 = new File(strM31067);
            StringBuilder sbM21133 = C9179.m21133(str, "/");
            sbM21133.append(file.getName());
            abstractC17043M42109 = C18524.m42108(file2, sbM21133.toString(), c6671);
        }
        return abstractC17043M42109 instanceof InterfaceC23140 ? ((InterfaceC23140) abstractC17043M42109).mo29974() : abstractC17043M42109;
    }

    @Override // p067l.C17182, p067l.AbstractC17043
    public final String getName() {
        String name = this.f51152.getName();
        return name.equals("\u200bAndroid") ? AnalyticsConstants.SDK_TYPE : name;
    }

    @Override // p067l.C17182, p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ֫ */
    public final String mo25505() {
        return m31067(this.f51152.getPath());
    }

    @Override // p067l.C17182, p067l.AbstractC17043
    public final String getParent() {
        return m31067(this.f51152.getParent());
    }

    /* JADX INFO: renamed from: ۖ */
    public static String m31067(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf("\u200bAndroid");
        if (iIndexOf < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, iIndexOf));
        sb.append(AnalyticsConstants.SDK_TYPE);
        return C21459.m48621(iIndexOf + 8, str, sb);
    }
}
