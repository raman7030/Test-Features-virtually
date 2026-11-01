package p067l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۧ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13049 {

    /* JADX INFO: renamed from: ֫ */
    public final short[] f36691 = new short[2];

    /* JADX INFO: renamed from: ۧ */
    public final short[] f36692;

    /* JADX INFO: renamed from: ܽ */
    public final short[][] f36693;

    /* JADX INFO: renamed from: ᩳ */
    public final short[][] f36694;

    public AbstractC13049() {
        Class cls = Short.TYPE;
        this.f36693 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.f36694 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.f36692 = new short[256];
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26910() {
        AbstractC9088.m21030(this.f36691);
        int i = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f36693;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC9088.m21030(sArr[i2]);
            i2++;
        }
        while (true) {
            short[][] sArr2 = this.f36694;
            if (i < sArr2.length) {
                AbstractC9088.m21030(sArr2[i]);
                i++;
            } else {
                AbstractC9088.m21030(this.f36692);
                return;
            }
        }
    }
}
