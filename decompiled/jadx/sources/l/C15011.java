package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15011 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f45773;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f45774;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f45775;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21818 f45776;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f45777;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashSet f45778 = new HashSet();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21363 f45779;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Collection f45780;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C18090 f45781;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22022 f45782;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f45783;

    public C15011(AbstractC21363 abstractC21363, C11667 c11667, boolean z) {
        this.f45779 = abstractC21363;
        this.f45774 = c11667;
        this.f45773 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22022 c22022 = new C22022(this.f45779.f68812.m39056());
        c22022.m49558(R.string.MT_Protector);
        c22022.m49556("...");
        c22022.mo49542((Runnable) null);
        c22022.m49548();
        this.f45782 = c22022;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        HashSet hashSet;
        C3545 c3545;
        C3545 c3546;
        int i;
        C11667 c11667;
        C8918 c8918;
        int i2;
        AbstractC21363 abstractC21363 = this.f45779;
        AbstractC15440 abstractC15440M39866 = C16999.m39866(abstractC21363.f68813.m26937(), new String[0]);
        C17721.m41504(abstractC15440M39866, EnumC16309.MODIFY_FILE);
        C18090 c18090 = new C18090(abstractC15440M39866);
        this.f45781 = c18090;
        this.f45780 = c18090.m42210();
        C11667 c11668 = this.f45774;
        C21818 c21818M50499 = C22523.m50499(abstractC15440M39866, c11668 != null);
        this.f45776 = c21818M50499;
        C8918 c8918M49176 = c21818M50499.m49176();
        if (c11668 == null && this.f45773 && this.f45781.m42201()) {
            c8918M49176.m23016(this.f45781);
        }
        if (this.f45781.m42212()) {
            c8918M49176.m23025();
        }
        int size = ((ArrayList) abstractC21363.f68810).size();
        this.f45783 = 0L;
        Iterator it = ((ArrayList) abstractC21363.f68810).iterator();
        while (it.hasNext()) {
            this.f45783 = ((C5977) it.next()).m16768().mo23127() + this.f45783;
        }
        this.f45775 = 0L;
        C8918 c8918M49177 = this.f45776.m49176();
        C15313 c15313 = new C15313();
        if (abstractC21363.f68809) {
            c15313.m36337(this.f45781);
        }
        Iterator it2 = ((ArrayList) abstractC21363.f68810).iterator();
        int i3 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            hashSet = this.f45778;
            if (!zHasNext) {
                break;
            }
            C5977 c5977 = (C5977) it2.next();
            if (this.f45782.m51053()) {
                break;
            }
            int i4 = i3 + 1;
            String strM16770 = c5977.m16770();
            AbstractC15440 abstractC15440M16768 = c5977.m16768();
            Iterator it3 = it2;
            Iterator it4 = this.f45780.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    c3545 = null;
                    break;
                }
                c3545 = (C3545) it4.next();
                Iterator it5 = it4;
                if (c3545.getName().equals(strM16770)) {
                    break;
                } else {
                    it4 = it5;
                }
            }
            if (c3545 == null) {
                c8918M49177.m23018(abstractC21363.f68809 ? C21665.m48934(strM16770, c15313) : 8);
                c8918M49177.m23026((String) null);
                c3546 = new C3545(strM16770);
            } else {
                c8918M49177.m23018(c3545.m10767());
                if (c3545.m10808()) {
                    c8918M49177.m23026(abstractC21363.f68813.m26938());
                } else {
                    c8918M49177.m23026((String) null);
                }
                c3546 = c3545;
            }
            C15313 c15314 = c15313;
            C22022 c22022 = this.f45782;
            AbstractC15440 abstractC15440 = abstractC15440M39866;
            StringBuilder sb = new StringBuilder();
            AbstractC21363 abstractC21364 = abstractC21363;
            sb.append(C4925.m14327(R.string.MT_Protector));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(i4);
            sb.append("/");
            sb.append(size);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c22022.m49554(sb.toString());
            this.f45782.m49556(strM16770);
            InputStream inputStreamMo27926 = abstractC15440M16768.mo27926();
            try {
                long jMo23127 = abstractC15440M16768.mo23127();
                c3546.m10805(jMo23127);
                int i5 = i4;
                c3546.setTime(abstractC15440M16768.mo23117());
                c8918M49177.m23013(c3546);
                byte[] bArr = new byte[4096];
                long j = 0;
                while (true) {
                    int i6 = inputStreamMo27926.read(bArr);
                    if (i6 > 0) {
                        i = i5;
                        c8918M49177.write(bArr, 0, i6);
                        c11667 = c11668;
                        c8918 = c8918M49176;
                        j += (long) i6;
                        this.f45782.m49549(j, c3546.getSize());
                        i2 = size;
                        byte[] bArr2 = bArr;
                        C3545 c3547 = c3546;
                        this.f45782.m49552(this.f45775 + j, this.f45783);
                        if (this.f45782.m51053()) {
                            break;
                        }
                        c11668 = c11667;
                        bArr = bArr2;
                        i5 = i;
                        c8918M49176 = c8918;
                        size = i2;
                        c3546 = c3547;
                    } else {
                        i = i5;
                        c11667 = c11668;
                        c8918 = c8918M49176;
                        i2 = size;
                        c8918M49177.m23023();
                        break;
                    }
                }
                this.f45775 += jMo23127;
                inputStreamMo27926.close();
                hashSet.add(strM16770);
                c11668 = c11667;
                it2 = it3;
                c15313 = c15314;
                abstractC15440M39866 = abstractC15440;
                i3 = i;
                abstractC21363 = abstractC21364;
                c8918M49176 = c8918;
                size = i2;
            } catch (Throwable th) {
                if (inputStreamMo27926 == null) {
                    throw th;
                }
                try {
                    inputStreamMo27926.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        AbstractC21363 abstractC21365 = abstractC21363;
        final AbstractC15440 abstractC15441 = abstractC15440M39866;
        C11667 c11669 = c11668;
        C8918 c8919 = c8918M49176;
        if (this.f45782.m51053()) {
            return;
        }
        C8918 c8918M49178 = this.f45776.m49176();
        C7957 c7957 = new C7957(this, C22523.m50496(this.f45780));
        int i7 = 0;
        for (C3545 c3548 : this.f45780) {
            if (this.f45782.m51053()) {
                break;
            }
            i7++;
            if (hashSet.contains(c3548.getName())) {
                if (!c3548.isDirectory()) {
                    this.f45777 = c3548.m10793() + this.f45777;
                }
            } else {
                this.f45782.m49554(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i7 + "/" + this.f45780.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f45782.m49556(c3548.getName());
                if (c3548.isDirectory()) {
                    c8918M49178.m23013(c3548);
                } else {
                    C22523.m50503(c3548, this.f45781, c8918M49178, c7957);
                    this.f45777 = c3548.m10793() + this.f45777;
                }
            }
        }
        if (this.f45782.m51053()) {
            return;
        }
        c8919.close();
        if (c11669 != null) {
            C10025.m25193(abstractC21365.f68812.m39056(), this.f45776, c11669, this.f45782);
        }
        C18838.m43524(abstractC15441);
        C17558 c17558 = new C17558();
        c17558.m41050(abstractC15441);
        this.f45776.m49175(abstractC15441, new Runnable() { // from class: l.֨ۙ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C15011 c15011 = this.f3472;
                c15011.f45782.m49558(R.string.MT_Protector);
                c15011.f45782.m49556(abstractC15441.getName());
            }
        }, this.f45781);
        c17558.m41052(abstractC15441);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        boolean zM51053 = this.f45782.m51053();
        AbstractC21363 abstractC21363 = this.f45779;
        if (!zM51053) {
            abstractC21363.f68812.m39041();
            ArrayList arrayList = new ArrayList(((ArrayList) abstractC21363.f68810).size());
            Iterator it = ((ArrayList) abstractC21363.f68810).iterator();
            while (it.hasNext()) {
                arrayList.add(((C5977) it.next()).m16774());
            }
            abstractC21363.f68812.m39000((Collection) arrayList);
            abstractC21363.f68812.m39015();
            C12190 c12190 = (C12190) abstractC21363;
            Iterator it2 = c12190.f36345.iterator();
            while (it2.hasNext()) {
                ((C5977) it2.next()).m16771();
            }
            c12190.f36343.f32356 = false;
            return;
        }
        C21818 c21818 = this.f45776;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f45776.m49174().mo23552();
        }
        abstractC21363.mo29665();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C21818 c21818 = this.f45776;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f45776.m49174().mo23552();
        }
        C21374.m48464(exc.toString());
        this.f45779.mo29665();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C0349.m1793(this.f45781);
        this.f45782.m51051();
        C15528.m36596();
    }
}
