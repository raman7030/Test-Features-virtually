package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.۬᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13407 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f40069;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f40070;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f40071;

    public C13407(ActivityC21107 activityC21107, boolean z) {
        this.f40071 = activityC21107;
        this.f40069 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f40071, R.string.MT_Protector);
        this.f23322.m31860((Runnable) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ActivityC21107 activityC21107 = this.f40071;
        Runnable runnable = new Runnable() { // from class: l.ۗ᩹ܽ
            @Override // java.lang.Runnable
            public final void run() {
                C13407.m32418(this.f11210);
            }
        };
        this.f40070 = 0;
        try {
            C3454 c3454 = new C3454();
            int size = activityC21107.f68093.f56832.size();
            Iterator it = activityC21107.f68093.f56832.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C11258) it.next()).m27860(c3454);
                i += 100;
                int i2 = i / size;
                if (i2 != this.f40070) {
                    this.f40070 = i2;
                    activityC21107.runOnUiThread(runnable);
                }
                if (this.f23322.m31868()) {
                    return;
                }
            }
            c3454.m10578();
            this.f40070 = -1;
            activityC21107.runOnUiThread(runnable);
            int iM10579 = c3454.m10579();
            byte[] bArr = new byte[iM10579];
            c3454.m10576(new C1547(bArr));
            C3454.m10574(bArr);
            Adler32 adler32 = new Adler32();
            adler32.update(bArr, 12, iM10579 - 12);
            int value = (int) adler32.getValue();
            bArr[8] = (byte) value;
            bArr[9] = (byte) (value >> 8);
            bArr[10] = (byte) (value >> 16);
            bArr[11] = (byte) (value >> 24);
            AbstractC15440 abstractC15440 = activityC21107.f68093.f56842;
            abstractC15440.getClass();
            abstractC15440.m36497(new C2742(0, bArr));
            ActivityC21107.f68088 = false;
        } finally {
            System.gc();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32418(C13407 c13407) {
        if (c13407.f40070 == -1) {
            c13407.f23322.m31867();
            return;
        }
        c13407.f23322.m31859((CharSequence) (c13407.f40071.getString(R.string.MT_Protector) + ' ' + c13407.f40070 + '%'));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f40069) {
            this.f40071.finish();
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f40071.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
