package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15064 implements InterfaceC12792 {

    /* JADX INFO: renamed from: ֫ */
    public C5677 f42996;

    /* JADX INFO: renamed from: ۜ */
    public boolean f42997;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C12383 f42998;

    /* JADX INFO: renamed from: ۧ */
    public C18155 f42999;

    /* JADX INFO: renamed from: ܳ */
    public String f43000;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f43001;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC10727 f43002;

    /* JADX INFO: renamed from: ᩳ */
    public C11319 f43003;

    /* JADX INFO: renamed from: ᩷ */
    public C14394 f43004;

    /* JADX INFO: renamed from: ᩻ */
    public String f43005;

    public C15064(C12383 c12383) {
        this.f42998 = c12383;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34427(C11319 c11319, InterfaceC10727 interfaceC10727, ArrayList arrayList, C18155 c18155, boolean z, C5677 c5677, C14394 c14394) {
        this.f43003 = c11319;
        this.f43002 = interfaceC10727;
        this.f43001 = arrayList;
        this.f42999 = c18155;
        this.f42997 = z;
        this.f42996 = c5677;
        this.f43004 = c14394;
        this.f43000 = null;
        this.f43005 = null;
    }

    @Override // p067l.InterfaceC12792
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo29342(int i, int i2, int i3, EnumC3167 enumC3167) {
        boolean zM28493;
        C5677 c5677;
        String strM33487;
        C14645 c14645 = this.f42999.f54212;
        if ("dex_field".equals(this.f43003.f31519)) {
            C11319 c11319 = this.f43003;
            c5677 = this.f42996;
            C14394 c14394 = this.f43004;
            if (i2 == 2) {
                AbstractC6086 abstractC6086M33504 = c14645.m33504();
                int iM33490 = c14645.m33490(i3);
                int iM13856 = abstractC6086M33504.m13856(iM33490);
                String str = c11319.f31512;
                String str2 = c11319.f31518;
                if (c14645.m33493(iM13856, 0, str.length(), str)) {
                    int iMo13855 = abstractC6086M33504.mo13855(iM33490 + 4);
                    int i4 = c14394.f41137;
                    int i5 = c14394.f41138;
                    if (c14645.m33478(iMo13855, 0, i4, str2) && c14645.m33493(abstractC6086M33504.m13856(iM33490 + 2), i5, str2.length() - i5, str2)) {
                        strM33487 = C24104.m53357(c14645.m33487(iM13856), "->", str2);
                        c5677.f13836 = strM33487;
                        c5677.f13835 = "exact_reference";
                        c5677.f13834 = "not_applicable";
                        zM28493 = true;
                    }
                }
            }
            zM28493 = false;
        } else if ("dex_class".equals(this.f43003.f31519)) {
            C11319 c113110 = this.f43003;
            c5677 = this.f42996;
            if (i2 == 1 && c14645.m33479(i3, c113110.f31512)) {
                strM33487 = c14645.m33487(i3);
                c5677.f13836 = strM33487;
                c5677.f13835 = "exact_reference";
                c5677.f13834 = "not_applicable";
                zM28493 = true;
            } else {
                zM28493 = false;
            }
        } else {
            zM28493 = C12383.m28493(this.f42998, this.f43003, this.f43002, this.f42999, c14645, i3, enumC3167, i2, this.f42997, this.f42996, this.f43004);
        }
        if (zM28493) {
            if (this.f43005 == null) {
                this.f43000 = this.f42999.f54220.getType();
                C18155 c18155 = this.f42999;
                StringBuilder sb = new StringBuilder();
                Iterator it = c18155.mo5852().iterator();
                while (it.hasNext()) {
                    sb.append((CharSequence) it.next());
                }
                this.f43005 = c18155.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + c18155.mo5855();
            }
            ArrayList arrayList = this.f43001;
            String str3 = this.f43000;
            String str4 = this.f43005;
            C5677 c5678 = this.f42996;
            arrayList.add(new C17746(str3, str4, c5678.f13836, c5678.f13835, c5678.f13834, enumC3167.f6089, i));
            if (this.f43001.size() >= this.f43003.f31516) {
                return false;
            }
        }
        return true;
    }
}
