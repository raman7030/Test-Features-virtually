package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.᩷ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C22247 extends AbstractC9529 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ boolean f70322;

    /* JADX INFO: renamed from: ۗ */
    public AbstractC17043 f70323;

    /* JADX INFO: renamed from: ۙ */
    public C6177 f70324;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ ArrayList f70325;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ AbstractC17043 f70326;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ IInArchive f70327;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ int f70328;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ String[] f70329;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C17551 f70330;

    /* JADX INFO: renamed from: ۬ */
    public int f70331;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C2742 f70332;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ C11518[] f70333;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f70334;

    /* JADX INFO: renamed from: ᩹ */
    public int f70335;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ AbstractC17043 f70336;

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩸ */
    public final String mo9239() {
        String strM28241 = C12248.m28241(mo9232());
        return !TextUtils.isEmpty(strM28241) ? strM28241 : this.f70330.f52456;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22247(C17551 c17551, C17551 c17552, IInArchive iInArchive, AbstractC17043 abstractC17043, ArrayList arrayList, C11518[] c11518Arr, String[] strArr, AbstractC17043 abstractC17044, boolean z, C2742 c2742, int i) {
        super(c17552);
        this.f70330 = c17551;
        this.f70327 = iInArchive;
        this.f70326 = abstractC17043;
        this.f70325 = arrayList;
        this.f70333 = c11518Arr;
        this.f70329 = strArr;
        this.f70336 = abstractC17044;
        this.f70322 = z;
        this.f70332 = c2742;
        this.f70328 = i;
        this.f70331 = iInArchive.getNumberOfItems();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۜ */
    public final String mo9232() {
        return this.f70326.mo25505();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩳ֫ */
    public final IInArchive mo9238() {
        return this.f70327;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۧ */
    public final void mo9235(IInArchive iInArchive) {
        C2700.m4192(iInArchive);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ֫ */
    public final void mo9231(String str) {
        this.f70330.f52456 = str;
        C12248.m28246(mo9232(), str);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۧ֫ */
    public final void mo9236() {
        this.f70335 = 0;
        this.f70325.clear();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܳ */
    public final void mo9237(int i) {
        this.f70335++;
        if (this.f70333[i] == null) {
            this.f70325.add(C6177.m13991(this.f70327, i));
        }
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16036(int i) {
        this.f70334 = false;
        C17551 c17551 = this.f70330;
        c17551.f52454 = false;
        this.f70335++;
        C6177 c6177M13991 = C6177.m13991(this.f70327, i);
        String str = this.f70329[i];
        if (c17551.f52457) {
            c17551.mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + this.f70335 + "/" + this.f70331 + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c17551.mo13456(str);
        if (this.f70333[i] != null) {
            return;
        }
        AbstractC17043 abstractC17043M38684 = this.f70336.m38684(str);
        if (abstractC17043M38684.mo25094()) {
            int iM39952 = c17551.m39952(abstractC17043M38684, str, c6177M13991.m13994(), c6177M13991.m14004());
            if (c17551.mo3924()) {
                return;
            }
            if (iM39952 == 0) {
                c17551.f52454 = true;
                c17551.f52450.m43296(abstractC17043M38684);
                if (c17551.f52451.mo15383() && abstractC17043M38684.mo31068()) {
                    abstractC17043M38684.mo31069(this);
                }
            } else {
                if (iM39952 == 1) {
                    return;
                }
                if (iM39952 == 2) {
                    abstractC17043M38684 = abstractC17043M38684.m38650(true);
                }
            }
        }
        this.f70323 = abstractC17043M38684;
        this.f70324 = c6177M13991;
        this.f70334 = true;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo16034() {
        if (!this.f70334) {
            return null;
        }
        this.f70330.m39958(this.f70323.m38694());
        return new C21171(this.f70323);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۤ */
    public final void mo9234() {
        this.f70323.mo29990();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩹ */
    public final void mo16037() {
        if (this.f70334) {
            if (this.f70324.m14004() >= 0 && this.f70322 && this.f70323.mo29973()) {
                this.f70323.mo20486(this.f70324.m14004());
            }
            C17551 c17551 = this.f70330;
            if (c17551.f52454) {
                c17551.f52450.m43298(this.f70323);
            }
            this.f70332.m4280(this.f70329[this.f70324.m14000()], this.f70323.getName());
            C16114.m36689(this.f70323);
            c17551.m39961(this.f70323.mo25505().substring(this.f70328));
        }
    }
}
