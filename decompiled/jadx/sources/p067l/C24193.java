package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩺ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9K8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24193 extends C18158 {

    /* JADX INFO: renamed from: ۖ */
    public C24212 f76687;

    /* JADX INFO: renamed from: ۜ */
    public int f76688;

    /* JADX INFO: renamed from: ۡ */
    public int f76689;

    /* JADX INFO: renamed from: ۢ */
    public List f76690;

    /* JADX INFO: renamed from: ܳ */
    public EnumC23366 f76691;

    /* JADX INFO: renamed from: ܺ */
    public UUID f76692;

    /* JADX INFO: renamed from: ܿ */
    public EnumSet f76693 = EnumSet.noneOf(EnumC7943.class);

    /* JADX INFO: renamed from: ᩷ */
    public int f76694;

    /* JADX INFO: renamed from: ᩻ */
    public int f76695;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    @Override // p067l.C18158
    /* JADX INFO: renamed from: ۧ */
    public final void mo9145(C2460 c2460) throws C14862 {
        int iM28125;
        int iM28126;
        ?? arrayList;
        c2460.m28121(2);
        this.f76689 = c2460.m28125();
        EnumC23366 enumC23366M52016 = EnumC23366.m52016(c2460.m28125());
        this.f76691 = enumC23366M52016;
        EnumC23366 enumC23366 = EnumC23366.SMB_3_1_1;
        if (enumC23366M52016 == enumC23366) {
            iM28125 = c2460.m28125();
        } else {
            c2460.m28121(2);
            iM28125 = 0;
        }
        this.f76692 = new UUID((((c2460.m28107() << 16) | ((long) c2460.m28125())) << 16) | ((long) c2460.m28125()), AbstractC24250.f76846.mo18931(c2460));
        this.f76693 = C16873.m38439(c2460.m28107(), EnumC7943.class);
        this.f76688 = c2460.m28124();
        this.f76695 = c2460.m28124();
        this.f76694 = c2460.m28124();
        this.f76687 = C15494.m35260(c2460);
        C15494.m35260(c2460);
        int iM28127 = c2460.m28125();
        int iM28128 = c2460.m28125();
        if (this.f76691 == enumC23366) {
            iM28126 = c2460.m28125();
        } else {
            c2460.m28121(2);
            iM28126 = 0;
        }
        if (iM28128 > 0) {
            c2460.m28122(iM28127);
            c2460.m28119(iM28128);
        }
        if (this.f76691 == enumC23366) {
            c2460.m28122(iM28126);
            try {
                arrayList = new ArrayList();
                for (int i = 0; i < iM28125; i++) {
                    arrayList.add(AbstractC3722.m7163(c2460));
                }
            } catch (C14862 e) {
                throw new IllegalArgumentException("unknown error when parse negotiateContext", e);
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        this.f76690 = arrayList;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m53490() {
        return this.f76689;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC23366 m53497() {
        return this.f76691;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final UUID m53495() {
        return this.f76692;
    }

    /* JADX INFO: renamed from: ۜ */
    public final Set m53491() {
        return this.f76693;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m53492() {
        return this.f76688;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m53493() {
        return this.f76695;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m53494() {
        return this.f76694;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C24212 m53496() {
        return this.f76687;
    }

    /* JADX INFO: renamed from: ۖ */
    public final List m53489() {
        return this.f76690;
    }
}
