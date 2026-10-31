package l;

import android.graphics.Point;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14T3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9693 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9693 f29307;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Point f29308;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC9693 mo1512(AbstractC9693 abstractC9693);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1514(StringBuilder sb, int i);

    /* JADX INFO: renamed from: ֫ */
    public void mo1515(ArrayList arrayList) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1516(C10130 c10130);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1517(C20982 c20982);

    public AbstractC9693(AbstractC9693 abstractC9693) {
        this.f29307 = abstractC9693;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC9693 m24637(AbstractC9693 abstractC9693, C12951 c12951) {
        AbstractC9693 c15068;
        int iM31501 = c12951.m31501();
        switch (iM31501) {
            case 20224:
                c15068 = new C15068(c12951);
                break;
            case 20225:
                c15068 = new C1372(abstractC9693, c12951);
                break;
            case 20226:
                c15068 = new C8428(abstractC9693, c12951);
                break;
            case 20227:
                c15068 = new C2370(abstractC9693, c12951);
                break;
            case 20228:
                c15068 = new C12039(abstractC9693, c12951);
                break;
            case 20229:
                c15068 = new C4195(abstractC9693, c12951);
                break;
            case 20230:
                c15068 = new C0252(abstractC9693, c12951);
                break;
            case 20231:
                c15068 = new C19304(abstractC9693, c12951);
                break;
            default:
                c15068 = null;
                break;
        }
        if (c15068 != null) {
            return c15068;
        }
        throw new RuntimeException(C19370.m44628(iM31501, "Unknown syntax item type: "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15068 mo24638() {
        return this.f29307.mo24638();
    }
}
