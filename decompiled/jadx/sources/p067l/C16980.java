package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes5.dex */
public final class C16980 extends AbstractC17188 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f50216 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final String[] f50217;

    /* JADX INFO: renamed from: ܽ */
    public int f50218;

    public C16980(String str) {
        this.f50217 = str.split("\n", -1);
        this.f50218 = str.length() * 8;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    @Override // p067l.InterfaceC5790
    /* JADX INFO: renamed from: ֫ */
    public final C22396 mo4844(C21055 c21055, InterfaceC19872 interfaceC19872) {
        boolean z;
        InterfaceC4449 interfaceC4449Mo14310 = interfaceC19872.mo14310();
        boolean z2 = interfaceC4449Mo14310.mo9302() instanceof C23875;
        HashMap map = this.f50216;
        if (z2 || (interfaceC4449Mo14310.mo9302() instanceof C20662)) {
            map.put(interfaceC4449Mo14310.mo9302(), interfaceC4449Mo14310);
        }
        if (c21055.mo46445() < 4) {
            String strTrim = c21055.getLine().m40550().toString().substring(c21055.mo46447()).trim();
            C21332 c21332M40552 = c21055.getLine().m40552();
            if (c21332M40552 != null) {
                String str = strTrim.startsWith("$$") ? "$$" : strTrim.startsWith("\\[") ? "\\]" : null;
                if (str != null) {
                    if (strTrim.length() <= 4 || !strTrim.endsWith(str)) {
                        z = false;
                    } else {
                        int length = strTrim.length() - 2;
                        int i = 0;
                        while (length > 0) {
                            length--;
                            if (strTrim.charAt(length) != '\\') {
                                break;
                            }
                            i++;
                        }
                        if (i % 2 != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z || strTrim.equals("$$") || strTrim.equals("\\[")) {
                        if (!z) {
                            int iM48342 = c21332M40552.m48342();
                            ArrayList<InterfaceC4449> arrayList = new ArrayList();
                            for (AbstractC2555 abstractC2555Mo9302 = interfaceC4449Mo14310.mo9302(); abstractC2555Mo9302 != null; abstractC2555Mo9302 = abstractC2555Mo9302.mo3768()) {
                                if ((abstractC2555Mo9302 instanceof C23875) || (abstractC2555Mo9302 instanceof C20662)) {
                                    InterfaceC4449 interfaceC4449 = (InterfaceC4449) map.get(abstractC2555Mo9302);
                                    if (interfaceC4449 != null) {
                                        arrayList.add(0, interfaceC4449);
                                    }
                                }
                            }
                            int i2 = iM48342 + 1;
                            loop2: while (true) {
                                String[] strArr = this.f50217;
                                if (i2 >= strArr.length) {
                                    break;
                                }
                                int length2 = this.f50218 - (strArr[i2].length() + 1);
                                this.f50218 = length2;
                                if (length2 < 0) {
                                    break;
                                }
                                C23017 c23017 = new C23017(strArr[i2], interfaceC4449Mo14310);
                                for (InterfaceC4449 interfaceC44410 : arrayList) {
                                    if (!(interfaceC44410.mo9302() instanceof C20662) || !c23017.mo46443()) {
                                        C16359 c16359Mo9295 = interfaceC44410.mo9295(c23017);
                                        if (!C14110.m32033(c16359Mo9295)) {
                                            break loop2;
                                        }
                                        c23017.m51401(c16359Mo9295);
                                    }
                                }
                                if (!strArr[i2].substring(c23017.getIndex()).trim().equals(str)) {
                                    i2++;
                                }
                            }
                        }
                        C22396 c22396 = new C22396(new C10276(str, strTrim, z));
                        c22396.m50304(c21055.mo46447());
                        return c22396;
                    }
                }
            }
        }
        return null;
    }
}
