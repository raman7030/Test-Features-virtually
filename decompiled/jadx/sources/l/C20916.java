package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.᩷ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20916 extends AbstractC7534 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f67637;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f67638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4007 f67639;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f67640;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f67641;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f67642;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67643;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f67644;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15975 f67645;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f67646;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0393 f67647;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9627[] f67648;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f67649;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67650;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f67651;

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩸ */
    public final String mo7144() {
        String strM26212 = C10395.m26212(mo7137());
        return !TextUtils.isEmpty(strM26212) ? strM26212 : this.f67645.f49298;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20916(C15975 c15975, C15975 c15976, IInArchive iInArchive, AbstractC15440 abstractC15440, ArrayList arrayList, C9627[] c9627Arr, String[] strArr, AbstractC15440 abstractC15441, boolean z, C0393 c0393, int i) {
        super(c15976);
        this.f67645 = c15975;
        this.f67642 = iInArchive;
        this.f67641 = abstractC15440;
        this.f67640 = arrayList;
        this.f67648 = c9627Arr;
        this.f67644 = strArr;
        this.f67651 = abstractC15441;
        this.f67637 = z;
        this.f67647 = c0393;
        this.f67643 = i;
        this.f67646 = iInArchive.getNumberOfItems();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۜ */
    public final String mo7137() {
        return this.f67641.mo23554();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩳ֫ */
    public final IInArchive mo7143() {
        return this.f67642;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۧ */
    public final void mo7140(IInArchive iInArchive) {
        C0349.m1793(iInArchive);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ֫ */
    public final void mo7136(String str) {
        this.f67645.f49298 = str;
        C10395.m26217(mo7137(), str);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۧ֫ */
    public final void mo7141() {
        this.f67650 = 0;
        this.f67640.clear();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ */
    public final void mo7142(int i) {
        this.f67650++;
        if (this.f67648[i] == null) {
            this.f67640.add(C4007.m12071(this.f67642, i));
        }
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14155(int i) {
        this.f67649 = false;
        C15975 c15975 = this.f67645;
        c15975.f49296 = false;
        this.f67650++;
        C4007 c4007M12071 = C4007.m12071(this.f67642, i);
        String str = this.f67644[i];
        if (c15975.f49299) {
            c15975.mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + this.f67650 + "/" + this.f67646 + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c15975.mo11520(str);
        if (this.f67648[i] != null) {
            return;
        }
        AbstractC15440 abstractC15440M36526 = this.f67651.m36526(str);
        if (abstractC15440M36526.mo23120()) {
            int iM37768 = c15975.m37768(abstractC15440M36526, str, c4007M12071.m12074(), c4007M12071.m12084());
            if (c15975.mo1526()) {
                return;
            }
            if (iM37768 == 0) {
                c15975.f49296 = true;
                c15975.f49292.m41050(abstractC15440M36526);
                if (c15975.f49293.mo13494() && abstractC15440M36526.mo29016()) {
                    abstractC15440M36526.mo29017(this);
                }
            } else {
                if (iM37768 == 1) {
                    return;
                }
                if (iM37768 == 2) {
                    abstractC15440M36526 = abstractC15440M36526.m36492(true);
                }
            }
        }
        this.f67638 = abstractC15440M36526;
        this.f67639 = c4007M12071;
        this.f67649 = true;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo14153() {
        if (!this.f67649) {
            return null;
        }
        this.f67645.m37774(this.f67638.m36536());
        return new C19783(this.f67638);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ۤ */
    public final void mo7139() {
        this.f67638.mo27929();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩹ */
    public final void mo14156() {
        if (this.f67649) {
            if (this.f67639.m12084() >= 0 && this.f67637 && this.f67638.mo27912()) {
                this.f67638.mo18537(this.f67639.m12084());
            }
            C15975 c15975 = this.f67645;
            if (c15975.f49296) {
                c15975.f49292.m41052(this.f67638);
            }
            this.f67647.m1888(this.f67644[this.f67639.m12080()], this.f67638.getName());
            C14463.m34555(this.f67638);
            c15975.m37777(this.f67638.mo23554().substring(this.f67643));
        }
    }
}
