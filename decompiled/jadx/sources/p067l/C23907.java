package p067l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4HZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23907 {
    /* JADX INFO: renamed from: ֫ */
    public static void m52983(Context context) {
        C9155 c9155 = new C9155();
        if (context != null) {
            if ("pl_droidsonroids_gif".length() == 0) {
                throw new IllegalArgumentException("Given library is either null or empty");
            }
            C9155.m21098("Beginning load of %s...", "pl_droidsonroids_gif");
            InterfaceC13179 interfaceC13179 = c9155.f24803;
            HashSet hashSet = c9155.f24804;
            if (hashSet.contains("pl_droidsonroids_gif")) {
                C9155.m21098("%s already loaded previously!", "pl_droidsonroids_gif");
                return;
            }
            try {
                ((C3987) interfaceC13179).getClass();
                System.loadLibrary("pl_droidsonroids_gif");
                hashSet.add("pl_droidsonroids_gif");
                C9155.m21098("%s (%s) was loaded normally!", "pl_droidsonroids_gif", null);
                return;
            } catch (UnsatisfiedLinkError e) {
                C9155.m21098("Loading the library normally failed: %s", Log.getStackTraceString(e));
                C9155.m21098("%s (%s) was not loaded normally, re-linking...", "pl_droidsonroids_gif", null);
                File fileM21099 = c9155.m21099(context);
                if (!fileM21099.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileM210910 = c9155.m21099(context);
                    C3987 c3987 = (C3987) interfaceC13179;
                    c3987.getClass();
                    File[] fileArrListFiles = dir.listFiles(new C15189(System.mapLibraryName("pl_droidsonroids_gif")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileM210910.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    c3987.getClass();
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        if (str != null && str.length() != 0) {
                            strArr = new String[]{Build.CPU_ABI, str};
                        } else {
                            strArr = new String[]{Build.CPU_ABI};
                        }
                    }
                    String[] strArr2 = strArr;
                    c3987.getClass();
                    c9155.f24802.m27138(context, strArr2, System.mapLibraryName("pl_droidsonroids_gif"), fileM21099, c9155);
                }
                String absolutePath = fileM21099.getAbsolutePath();
                ((C3987) interfaceC13179).getClass();
                System.load(absolutePath);
                hashSet.add("pl_droidsonroids_gif");
                C9155.m21098("%s (%s) was re-linked!", "pl_droidsonroids_gif", null);
                return;
            }
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
