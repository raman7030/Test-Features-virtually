package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۧ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11238 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final short[] f33691 = new short[2];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final short[] f33692;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short[][] f33693;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short[][] f33694;

    public AbstractC11238() {
        Class cls = Short.TYPE;
        this.f33693 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.f33694 = (short[][]) Array.newInstance((Class<?>) cls, 16, 8);
        this.f33692 = new short[256];
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24895() {
        AbstractC7070.m19072(this.f33691);
        int i = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f33693;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC7070.m19072(sArr[i2]);
            i2++;
        }
        while (true) {
            short[][] sArr2 = this.f33694;
            if (i < sArr2.length) {
                AbstractC7070.m19072(sArr2[i]);
                i++;
            } else {
                AbstractC7070.m19072(this.f33692);
                return;
            }
        }
    }
}
