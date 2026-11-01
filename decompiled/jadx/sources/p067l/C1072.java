package p067l;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۙ۫ */
/* JADX INFO: compiled from: SB10 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1072 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f17551;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17551) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                PackageInfo packageInfo = (PackageInfo) obj;
                PackageInfo packageInfo2 = (PackageInfo) obj2;
                boolean z = (packageInfo.applicationInfo.flags & 129) == 0;
                if (z == ((packageInfo2.applicationInfo.flags & 129) == 0)) {
                    return packageInfo.packageName.compareToIgnoreCase(packageInfo2.packageName);
                }
                return z ? -1 : 1;
        }
    }
}
