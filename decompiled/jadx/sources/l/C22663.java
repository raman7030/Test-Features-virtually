package l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4HZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22663 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50657(Context context) {
        C7141 c7141 = new C7141();
        if (context != null) {
            if ("pl_droidsonroids_gif".length() == 0) {
                throw new IllegalArgumentException("Given library is either null or empty");
            }
            C7141.m19155("Beginning load of %s...", "pl_droidsonroids_gif");
            InterfaceC11375 interfaceC11375 = c7141.f21924;
            HashSet hashSet = c7141.f21925;
            if (hashSet.contains("pl_droidsonroids_gif")) {
                C7141.m19155("%s already loaded previously!", "pl_droidsonroids_gif");
                return;
            }
            try {
                ((C1703) interfaceC11375).getClass();
                System.loadLibrary("pl_droidsonroids_gif");
                hashSet.add("pl_droidsonroids_gif");
                C7141.m19155("%s (%s) was loaded normally!", "pl_droidsonroids_gif", null);
                return;
            } catch (UnsatisfiedLinkError e) {
                C7141.m19155("Loading the library normally failed: %s", Log.getStackTraceString(e));
                C7141.m19155("%s (%s) was not loaded normally, re-linking...", "pl_droidsonroids_gif", null);
                File fileM19156 = c7141.m19156(context);
                if (!fileM19156.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileM19157 = c7141.m19156(context);
                    C1703 c1703 = (C1703) interfaceC11375;
                    c1703.getClass();
                    File[] fileArrListFiles = dir.listFiles(new C13490(System.mapLibraryName("pl_droidsonroids_gif")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileM19157.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    c1703.getClass();
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
                    c1703.getClass();
                    c7141.f21923.m25121(context, strArr2, System.mapLibraryName("pl_droidsonroids_gif"), fileM19156, c7141);
                }
                String absolutePath = fileM19156.getAbsolutePath();
                ((C1703) interfaceC11375).getClass();
                System.load(absolutePath);
                hashSet.add("pl_droidsonroids_gif");
                C7141.m19155("%s (%s) was re-linked!", "pl_droidsonroids_gif", null);
                return;
            }
        }
        throw new IllegalArgumentException("Given context is null");
    }
}
