package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37E8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14137 {

    /* JADX INFO: renamed from: ֫ */
    public int f40157;

    /* JADX INFO: renamed from: ۜ */
    public C20863 f40158;

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC21279 f40162;

    /* JADX INFO: renamed from: ܿ */
    public C8792 f40164;

    /* JADX INFO: renamed from: ᩷ */
    public C8792 f40166;

    /* JADX INFO: renamed from: ᩻ */
    public final C5263 f40167;

    /* JADX INFO: renamed from: ܽ */
    public C9286 f40163 = null;

    /* JADX INFO: renamed from: ۧ */
    public C9286 f40161 = null;

    /* JADX INFO: renamed from: ۡ */
    public C9286 f40159 = null;

    /* JADX INFO: renamed from: ۢ */
    public C9286 f40160 = null;

    /* JADX INFO: renamed from: ᩳ */
    public EnumC5458 f40165 = EnumC5458.unknown;

    public AbstractC14137(C5263 c5263, AbstractC21279 abstractC21279, int i) {
        this.f40167 = c5263;
        this.f40162 = abstractC21279;
        this.f40157 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32172() {
        boolean zM18869 = EnumC8140.m18869(this.f40157);
        C5263 c5263 = this.f40167;
        if (zM18869) {
            this.f40166 = new C8792(c5263, EnumC6799.f17621);
            this.f40157 &= ~EnumC8140.f21468.m18907();
        }
        if (EnumC8140.m18886(this.f40157)) {
            this.f40164 = new C8792(c5263, EnumC6799.f17633);
            this.f40157 &= ~EnumC8140.f21448.m18907();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21279 m32176() {
        return this.f40162;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32174(C17450 c17450) {
        C20863 c20863 = this.f40158;
        if (c20863 != null && c17450.f23817 != c20863.f65552.f23817) {
            this.f40162.mo4612("The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure.", EnumC16818.f49655.m38127(), this.f40165.m11981());
        }
        this.f40158 = new C20863(this.f40167, EnumC6799.f17627, c17450);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32175(C17450 c17450, long j) {
        C20863 c20863 = this.f40158;
        if (c20863 != null && c17450.f23817 != c20863.f65552.f23817) {
            this.f40162.mo13869(j, "The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure.", EnumC16818.f49655.m38127(), this.f40165.m11981());
        }
        this.f40158 = new C20863(this.f40167, EnumC6799.f17627, c17450);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ֫ */
    public final C7945 m32171(InterfaceC4079... interfaceC4079Arr) {
        C7945 c7945 = new C7945();
        for (InterfaceC4079 interfaceC4079 : interfaceC4079Arr) {
            if (interfaceC4079 != null) {
                c7945.m18356(interfaceC4079);
            }
        }
        C9286 c9286 = this.f40163;
        if (c9286 != null) {
            c7945.m18356(c9286);
        }
        C9286 c9287 = this.f40161;
        if (c9287 != null) {
            c7945.m18356(c9287);
        }
        C9286 c9288 = this.f40159;
        if (c9288 != null) {
            c7945.m18356(c9288);
        }
        C9286 c9289 = this.f40160;
        if (c9289 != null) {
            c7945.m18356(c9289);
        }
        return c7945;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32173(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C18179 c18179 = (C18179) it.next();
                boolean z = c18179.f54266;
                boolean z2 = c18179 instanceof C9996;
                C5263 c5263 = this.f40167;
                if (z2) {
                    C9996 c9996 = (C9996) c18179;
                    if (z) {
                        if (this.f40160 == null) {
                            this.f40160 = new C9286(c5263, EnumC6799.f17646);
                        }
                        this.f40160.m21502(c9996);
                    } else {
                        if (this.f40159 == null) {
                            this.f40159 = new C9286(c5263, EnumC6799.f17615);
                        }
                        this.f40159.m21502(c9996);
                    }
                } else if (z) {
                    if (this.f40161 == null) {
                        this.f40161 = new C9286(c5263, EnumC6799.f17620);
                    }
                    this.f40161.m21502(c18179);
                } else {
                    if (this.f40163 == null) {
                        this.f40163 = new C9286(c5263, EnumC6799.f17614);
                    }
                    this.f40163.m21502(c18179);
                }
            }
        }
    }
}
