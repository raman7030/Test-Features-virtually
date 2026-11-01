package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes5.dex */
public final class C22531 extends AbstractC6258 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public transient int f71028;

    /* JADX INFO: renamed from: ۙ */
    public transient InterfaceC13399 f71029;

    /* JADX INFO: renamed from: ۛ */
    public int f71030;

    /* JADX INFO: renamed from: ۤ */
    public transient int f71031;

    /* JADX INFO: renamed from: ۨ */
    public transient float[] f71032;

    /* JADX INFO: renamed from: ۫ */
    public final transient int f71033;

    /* JADX INFO: renamed from: ۬ */
    public transient int f71034;

    /* JADX INFO: renamed from: ᩶ */
    public transient int[] f71035;

    /* JADX INFO: renamed from: ᩸ */
    public transient boolean f71036;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC6848 f71037;

    /* JADX INFO: renamed from: ᩺ */
    public transient InterfaceC12984 f71038;

    public C22531() {
        int iM34880 = C15322.m34880(0.75f, 16);
        this.f71031 = iM34880;
        this.f71033 = iM34880;
        this.f71028 = iM34880 - 1;
        this.f71034 = C15322.m34887(0.75f, iM34880);
        int i = this.f71031 + 1;
        this.f71035 = new int[i];
        this.f71032 = new float[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public float m50489(int i) {
        int i2;
        float[] fArr = this.f71032;
        float f = fArr[i];
        this.f71030--;
        int[] iArr = this.f71035;
        loop0: while (true) {
            int i3 = (i + 1) & this.f71028;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int iM34881 = C15322.m34881(i2);
                    int i4 = this.f71028;
                    int i5 = iM34881 & i4;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    } else {
                        if (i >= i5 || i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            iArr[i] = i2;
            fArr[i] = fArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f71031;
        if (i6 > this.f71033 && this.f71030 < this.f71034 / 4 && i6 > 16) {
            m50491(i6 / 2);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public float m50486() {
        this.f71036 = false;
        float[] fArr = this.f71032;
        int i = this.f71031;
        float f = fArr[i];
        int i2 = this.f71030 - 1;
        this.f71030 = i2;
        if (i > this.f71033 && i2 < this.f71034 / 4 && i > 16) {
            m50491(i / 2);
        }
        return f;
    }

    @Override // p067l.AbstractC6258, java.util.Map
    public final void putAll(Map map) {
        if (0.75f <= 0.5d) {
            int iM34880 = C15322.m34880(0.75f, map.size());
            if (iM34880 > this.f71031) {
                m50491(iM34880);
            }
        } else {
            int iMin = (int) Math.min(1073741824L, Math.max(2L, C15322.m34883((long) Math.ceil((map.size() + this.f71030) / 0.75f))));
            if (iMin > this.f71031) {
                m50491(iMin);
            }
        }
        super.putAll(map);
    }

    @Override // p067l.AbstractC4917, p067l.InterfaceC10201
    /* JADX INFO: renamed from: ֫ */
    public final float mo10447(float f, int i) {
        int i2;
        if (i == 0) {
            i2 = this.f71036 ? this.f71031 : -(this.f71031 + 1);
        } else {
            int[] iArr = this.f71035;
            int iM34881 = C15322.m34881(i) & this.f71028;
            int i3 = iArr[iM34881];
            if (i3 != 0) {
                if (i != i3) {
                    while (true) {
                        iM34881 = (iM34881 + 1) & this.f71028;
                        int i4 = iArr[iM34881];
                        if (i4 == 0) {
                            i2 = -(iM34881 + 1);
                        } else if (i == i4) {
                        }
                    }
                }
                i2 = iM34881;
            } else {
                i2 = -(iM34881 + 1);
            }
        }
        if (i2 < 0) {
            int i5 = (-i2) - 1;
            if (i5 == this.f71031) {
                this.f71036 = true;
            }
            this.f71035[i5] = i;
            this.f71032[i5] = f;
            int i6 = this.f71030;
            this.f71030 = i6 + 1;
            if (i6 < this.f71034) {
                return 0.0f;
            }
            m50491(C15322.m34880(0.75f, i6 + 2));
            return 0.0f;
        }
        float[] fArr = this.f71032;
        float f2 = fArr[i2];
        fArr[i2] = f;
        return f2;
    }

    @Override // p067l.AbstractC4917, p067l.InterfaceC10201
    public final float remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f71036) {
                return m50486();
            }
            return 0.0f;
        }
        int[] iArr = this.f71035;
        int iM34881 = C15322.m34881(i) & this.f71028;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return 0.0f;
        }
        if (i == i3) {
            return m50489(iM34881);
        }
        do {
            iM34881 = (iM34881 + 1) & this.f71028;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return 0.0f;
            }
        } while (i != i2);
        return m50489(iM34881);
    }

    @Override // p067l.InterfaceC10201
    public final float get(int i) {
        int i2;
        if (i == 0) {
            if (this.f71036) {
                return this.f71032[this.f71031];
            }
            return 0.0f;
        }
        int[] iArr = this.f71035;
        int iM34881 = C15322.m34881(i) & this.f71028;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return 0.0f;
        }
        if (i == i3) {
            return this.f71032[iM34881];
        }
        do {
            iM34881 = (iM34881 + 1) & this.f71028;
            i2 = iArr[iM34881];
            if (i2 == 0) {
                return 0.0f;
            }
        } while (i != i2);
        return this.f71032[iM34881];
    }

    @Override // p067l.InterfaceC10201
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23794(int i) {
        int i2;
        if (i == 0) {
            return this.f71036;
        }
        int[] iArr = this.f71035;
        int iM34881 = C15322.m34881(i) & this.f71028;
        int i3 = iArr[iM34881];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                iM34881 = (iM34881 + 1) & this.f71028;
                i2 = iArr[iM34881];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50490(float f) {
        int[] iArr = this.f71035;
        float[] fArr = this.f71032;
        if (this.f71036 && Float.floatToRawIntBits(fArr[this.f71031]) == Float.floatToRawIntBits(f)) {
            return true;
        }
        int i = this.f71031;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && Float.floatToRawIntBits(fArr[i2]) == Float.floatToRawIntBits(f)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f71030 == 0) {
            return;
        }
        this.f71030 = 0;
        this.f71036 = false;
        Arrays.fill(this.f71035, 0);
    }

    @Override // p067l.InterfaceC11771
    public final int size() {
        return this.f71030;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f71030 == 0;
    }

    @Override // p067l.InterfaceC5507
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC20007 mo12134() {
        if (this.f71037 == null) {
            this.f71037 = new C19848(this);
        }
        return this.f71037;
    }

    @Override // java.util.Map
    public final InterfaceC13399 keySet() {
        if (this.f71029 == null) {
            this.f71029 = new C4425(this);
        }
        return this.f71029;
    }

    @Override // java.util.Map
    public final InterfaceC12984 values() {
        if (this.f71038 == null) {
            this.f71038 = new C8189(this);
        }
        return this.f71038;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50491(int i) {
        int i2;
        int[] iArr = this.f71035;
        float[] fArr = this.f71032;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        float[] fArr2 = new float[i4];
        int i5 = this.f71031;
        int i6 = this.f71036 ? this.f71030 - 1 : this.f71030;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int iM34881 = C15322.m34881(i2) & i3;
                if (iArr2[iM34881] != 0) {
                    do {
                        iM34881 = (iM34881 + 1) & i3;
                    } while (iArr2[iM34881] != 0);
                }
                iArr2[iM34881] = iArr[i5];
                fArr2[iM34881] = fArr[i5];
                i6 = i7;
            } else {
                fArr2[i] = fArr[this.f71031];
                this.f71031 = i;
                this.f71028 = i3;
                this.f71034 = C15322.m34887(0.75f, i);
                this.f71035 = iArr2;
                this.f71032 = fArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C22531 c22531 = (C22531) super.clone();
            c22531.f71029 = null;
            c22531.f71038 = null;
            c22531.f71037 = null;
            c22531.f71036 = this.f71036;
            c22531.f71035 = (int[]) this.f71035.clone();
            c22531.f71032 = (float[]) this.f71032.clone();
            return c22531;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f71035;
        float[] fArr = this.f71032;
        int i2 = this.f71036 ? this.f71030 - 1 : this.f71030;
        int iFloatToRawIntBits = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                i = iArr[i3];
                if (i == 0) {
                    i3++;
                }
            }
            iFloatToRawIntBits += i ^ Float.floatToRawIntBits(fArr[i3]);
            i3++;
            i2 = i4;
        }
        return this.f71036 ? Float.floatToRawIntBits(fArr[this.f71031]) + iFloatToRawIntBits : iFloatToRawIntBits;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int[] iArr = this.f71035;
        float[] fArr = this.f71032;
        C13554 c13554 = new C13554(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f71030;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int iM43665 = c13554.m43665();
            objectOutputStream.writeInt(iArr[iM43665]);
            objectOutputStream.writeFloat(fArr[iM43665]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iM34880 = C15322.m34880(0.75f, this.f71030);
        this.f71031 = iM34880;
        this.f71034 = C15322.m34887(0.75f, iM34880);
        int i2 = this.f71031;
        this.f71028 = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.f71035 = iArr;
        float[] fArr = new float[i3];
        this.f71032 = fArr;
        int i4 = this.f71030;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int i6 = objectInputStream.readInt();
            float f = objectInputStream.readFloat();
            if (i6 == 0) {
                i = this.f71031;
                this.f71036 = true;
            } else {
                int iM34881 = C15322.m34881(i6);
                int i7 = this.f71028;
                while (true) {
                    i = iM34881 & i7;
                    if (iArr[i] != 0) {
                        iM34881 = i + 1;
                        i7 = this.f71028;
                    }
                }
            }
            iArr[i] = i6;
            fArr[i] = f;
            i4 = i5;
        }
    }
}
