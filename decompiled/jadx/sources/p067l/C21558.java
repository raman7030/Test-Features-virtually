package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5XH */
/* JADX INFO: loaded from: classes5.dex */
public class C21558 implements InterfaceC9410, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۙ */
    public static final C21558 f67993;

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ int f67994 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final transient AbstractC16192 f67995;

    /* JADX INFO: renamed from: ᩹ */
    public final transient AbstractC16192 f67996;

    static {
        int i = AbstractC16192.f47662;
        AbstractC16192 abstractC16192 = C18009.f53770;
        f67993 = new C21558(abstractC16192, abstractC16192);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C21558 m48745() {
        return f67993;
    }

    public C21558(AbstractC16192 abstractC16192, AbstractC16192 abstractC16193) {
        this.f67995 = abstractC16192;
        this.f67996 = abstractC16193;
    }

    @Override // p067l.InterfaceC9410
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13880(Integer num) {
        C7476 c7476 = new C7476();
        C4520 c4520 = new C4520(num);
        EnumC4085 enumC4085 = EnumC4085.f9008;
        EnumC11975 enumC11975 = EnumC11975.f33391;
        int iM29352 = C12803.m29352(this.f67995, c7476, c4520, C14774.f42115, enumC4085, enumC11975);
        if (iM29352 != -1 && ((C15444) this.f67995.get(iM29352)).m35188(num)) {
            return this.f67996.get(iM29352);
        }
        return null;
    }

    @Override // p067l.InterfaceC9410
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11500 mo13881() {
        AbstractC16192 abstractC16192 = this.f67995;
        if (abstractC16192.isEmpty()) {
            return C8622.f23161;
        }
        int i = C15444.f44129;
        return new C19527(new C11305(abstractC16192, C24162.f76622), this.f67996, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public C21558 mo38411(C15444 c15444) {
        if (!c15444.m35187()) {
            AbstractC16192 abstractC16192 = this.f67995;
            if (!abstractC16192.isEmpty()) {
                if (abstractC16192.isEmpty()) {
                    throw new NoSuchElementException();
                }
                if (!c15444.m35189(C15444.m35179(((C15444) abstractC16192.get(0)).f44130, ((C15444) abstractC16192.get(abstractC16192.size() - 1)).f44131))) {
                    C3452 c3452 = new C3452();
                    AbstractC5861 abstractC5861 = c15444.f44130;
                    EnumC4085 enumC4085 = EnumC4085.f9006;
                    EnumC11975 enumC11975 = EnumC11975.f33392;
                    abstractC5861.getClass();
                    C14774 c14774 = C14774.f42115;
                    int iM29352 = C12803.m29352(abstractC16192, c3452, abstractC5861, c14774, enumC4085, enumC11975);
                    C7476 c7476 = new C7476();
                    AbstractC5861 abstractC5862 = c15444.f44131;
                    EnumC4085 enumC4086 = EnumC4085.f9008;
                    abstractC5862.getClass();
                    int iM29353 = C12803.m29352(abstractC16192, c7476, abstractC5862, c14774, enumC4086, enumC11975);
                    if (iM29352 < iM29353) {
                        return new C16862(new C10158(this, iM29353 - iM29352, iM29352, c15444), this.f67996.subList(iM29352, iM29353), c15444, this);
                    }
                }
            }
            return this;
        }
        return f67993;
    }

    public final int hashCode() {
        return mo13881().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC9410)) {
            return false;
        }
        AbstractC11500 abstractC11500Mo13881 = mo13881();
        Map mapMo13881 = ((InterfaceC9410) obj).mo13881();
        abstractC11500Mo13881.getClass();
        return C20811.m46983(abstractC11500Mo13881, mapMo13881);
    }

    public final String toString() {
        AbstractC11500 abstractC11500Mo13881 = mo13881();
        abstractC11500Mo13881.getClass();
        return C20811.m46982(abstractC11500Mo13881);
    }

    public Object writeReplace() {
        return new C23569(mo13881());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
