package p067l;

import net.p069sf.sevenzipjbinding.IOutCreateArchive7z;
import net.p069sf.sevenzipjbinding.IOutUpdateArchive7z;
import net.p069sf.sevenzipjbinding.impl.OutArchiveImpl;

/* JADX INFO: renamed from: l.֡᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HB62 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3064 extends OutArchiveImpl implements IOutCreateArchive7z, IOutUpdateArchive7z {

    /* JADX INFO: renamed from: ۬ */
    public boolean f5528;

    /* JADX INFO: renamed from: ᩶ */
    public Boolean f5529;

    /* JADX INFO: renamed from: ۙ */
    public int f5526 = -1;

    /* JADX INFO: renamed from: ۫ */
    public int f5527 = -1;

    /* JADX INFO: renamed from: ۗ */
    public boolean f5525 = true;

    /* JADX INFO: renamed from: ᩹ */
    public int f5531 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public long f5530 = -1;

    @Override // net.p069sf.sevenzipjbinding.impl.OutArchiveImpl, net.p069sf.sevenzipjbinding.IOutFeatureSetLevel
    public final void setLevel(int i) {
        this.f5526 = i;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutFeatureSetMultithreading
    public final void setThreadCount(int i) {
        this.f5527 = i;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutFeatureSetEncryptHeader
    public final void setHeaderEncryption(boolean z) {
        this.f5529 = Boolean.valueOf(z);
    }

    @Override // net.p069sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolid(boolean z) {
        this.f5525 = z;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidFiles(int i) {
        this.f5531 = i;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidSize(long j) {
        this.f5530 = j;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidExtension(boolean z) {
        this.f5528 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.֡᩺᩵, net.sf.sevenzipjbinding.impl.OutArchiveImpl] */
    @Override // net.p069sf.sevenzipjbinding.impl.OutArchiveImpl
    public final void applyFeatures() {
        String string;
        ensureOpened();
        Boolean bool = this.f5529;
        ?? BooleanValue = bool == null ? -1 : bool.booleanValue();
        if (this.f5525) {
            StringBuilder sb = new StringBuilder();
            if (this.f5528) {
                sb.append("E");
            }
            int i = this.f5531;
            if (i != -1) {
                sb.append(i);
                sb.append("F");
            }
            long j = this.f5530;
            if (j != -1) {
                sb.append(j);
                sb.append("B");
            }
            string = sb.length() > 0 ? sb.toString() : null;
        } else {
            string = "";
        }
        nativeSet7z(this.f5526, BooleanValue, this.f5527, string);
    }
}
