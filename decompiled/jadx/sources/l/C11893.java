package l;

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
public final class C11893 extends C15587 {
    @Override // l.C15587, l.AbstractC15440
    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo29016() {
        return false;
    }

    @Override // l.C15587, l.AbstractC15440
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo29017(InterfaceC17066 interfaceC17066) {
        return false;
    }

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final String m29018() {
        return this.f48020.getPath();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @Override // l.C15587, l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public final List mo23549(final boolean z) {
        String strM39859;
        File[] fileArrListFiles = this.f48020.listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        if (C16999.m39886()) {
            String strMo23554 = mo23554();
            String lowerCase = strMo23554.toLowerCase(Locale.ENGLISH);
            if (lowerCase.endsWith("/android/data") || lowerCase.endsWith("/android/obb")) {
                strM39859 = C16999.m39859(strMo23554);
                if (!"Android/data".equalsIgnoreCase(strM39859) && !"Android/obb".equalsIgnoreCase(strM39859)) {
                    strM39859 = null;
                }
            } else {
                strM39859 = null;
            }
        } else {
            strM39859 = null;
        }
        return (List) C22311.stream(fileArrListFiles).filter(new Predicate() { // from class: l.ۤᩴܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z || !((File) obj).getName().startsWith(".");
            }
        }).map(new C6248(0, strM39859)).collect(C22976.toList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ AbstractC15440 m29014(File file, String str) {
        AbstractC15440 abstractC15440M39866;
        if (str == null || Build.VERSION.SDK_INT < 30) {
            abstractC15440M39866 = C16999.m39866(m29015(file.getPath()), new String[0]);
        } else {
            String strM29015 = m29015(file.getPath());
            boolean zIsDirectory = file.isDirectory();
            C4527 c4527 = new C4527(zIsDirectory ? -1L : file.length(), file.lastModified(), zIsDirectory);
            File file2 = new File(strM29015);
            StringBuilder sbM19190 = C7166.m19190(str, "/");
            sbM19190.append(file.getName());
            abstractC15440M39866 = C16999.m39865(file2, sbM19190.toString(), c4527);
        }
        return abstractC15440M39866 instanceof InterfaceC21855 ? ((InterfaceC21855) abstractC15440M39866).mo27913() : abstractC15440M39866;
    }

    @Override // l.C15587, l.AbstractC15440
    public final String getName() {
        String name = this.f48020.getName();
        return name.equals("\u200bAndroid") ? AnalyticsConstants.SDK_TYPE : name;
    }

    @Override // l.C15587, l.AbstractC15440
    /* JADX INFO: renamed from: ܺ֫ */
    public final String mo23554() {
        return m29015(this.f48020.getPath());
    }

    @Override // l.C15587, l.AbstractC15440
    public final String getParent() {
        return m29015(this.f48020.getParent());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m29015(String str) {
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
        return C20087.m46305(iIndexOf + 8, str, sb);
    }
}
