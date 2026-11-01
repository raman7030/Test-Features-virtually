package p067l;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: renamed from: l.᩸ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K84H */
/* JADX INFO: loaded from: classes5.dex */
public final class C22929 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public final C14271 f72160;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10288 f72161;

    /* JADX INFO: renamed from: ܽ */
    public final Type f72162;

    public C22929(C14271 c14271, AbstractC10288 abstractC10288, Type type) {
        this.f72160 = c14271;
        this.f72161 = abstractC10288;
        this.f72162 = type;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        return this.f72161.mo5173(c18691);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) {
        AbstractC10288 abstractC10288Mo6211;
        Type type = this.f72162;
        Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
        AbstractC10288 abstractC10288 = this.f72161;
        if (type2 != type) {
            AbstractC10288 abstractC10288M32800 = this.f72160.m32800(C18020.m41002(type2));
            if (abstractC10288M32800 instanceof AbstractC4824) {
                AbstractC10288 abstractC10289 = abstractC10288;
                while ((abstractC10289 instanceof AbstractC3482) && (abstractC10288Mo6211 = ((AbstractC3482) abstractC10289).mo6211()) != abstractC10289) {
                    abstractC10289 = abstractC10288Mo6211;
                }
                if (abstractC10289 instanceof AbstractC4824) {
                    abstractC10288 = abstractC10288M32800;
                }
            } else {
                abstractC10288 = abstractC10288M32800;
            }
        }
        abstractC10288.mo5174(c24726, obj);
    }
}
