package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0197 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1440 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1435 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1436 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1439 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 f1438 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f1437 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo1345(InterfaceC10076 interfaceC10076);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String mo1356() {
        return "";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m1352() {
        return this.f1438;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m1354() {
        return this.f1439;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m1341() {
        return this.f1435;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m1349() {
        return this.f1436;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC0197 mo1355() {
        return this.f1440;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo1353(AbstractC0197 abstractC0197) {
        this.f1440 = abstractC0197;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m1343(AbstractC0197 abstractC0197) {
        abstractC0197.m1348();
        abstractC0197.mo1353(this);
        AbstractC0197 abstractC0198 = this.f1436;
        if (abstractC0198 != null) {
            abstractC0198.f1438 = abstractC0197;
            abstractC0197.f1439 = abstractC0198;
        } else {
            this.f1435 = abstractC0197;
        }
        this.f1436 = abstractC0197;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1346(C13994 c13994) {
        c13994.m1348();
        c13994.f1440 = this;
        AbstractC0197 abstractC0197 = this.f1435;
        if (abstractC0197 != null) {
            abstractC0197.f1439 = c13994;
            c13994.f1438 = abstractC0197;
            this.f1435 = c13994;
        } else {
            this.f1435 = c13994;
            this.f1436 = c13994;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m1348() {
        AbstractC0197 abstractC0197 = this.f1439;
        if (abstractC0197 != null) {
            abstractC0197.f1438 = this.f1438;
        } else {
            AbstractC0197 abstractC0198 = this.f1440;
            if (abstractC0198 != null) {
                abstractC0198.f1435 = this.f1438;
            }
        }
        AbstractC0197 abstractC0199 = this.f1438;
        if (abstractC0199 != null) {
            abstractC0199.f1439 = abstractC0197;
        } else {
            AbstractC0197 abstractC01910 = this.f1440;
            if (abstractC01910 != null) {
                abstractC01910.f1436 = abstractC0197;
            }
        }
        this.f1440 = null;
        this.f1438 = null;
        this.f1439 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1350(AbstractC0197 abstractC0197) {
        abstractC0197.m1348();
        AbstractC0197 abstractC0198 = this.f1438;
        abstractC0197.f1438 = abstractC0198;
        if (abstractC0198 != null) {
            abstractC0198.f1439 = abstractC0197;
        }
        abstractC0197.f1439 = this;
        this.f1438 = abstractC0197;
        AbstractC0197 abstractC0199 = this.f1440;
        abstractC0197.f1440 = abstractC0199;
        if (abstractC0197.f1438 == null) {
            abstractC0199.f1436 = abstractC0197;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1344(C3726 c3726) {
        c3726.m1348();
        AbstractC0197 abstractC0197 = this.f1439;
        c3726.f1439 = abstractC0197;
        if (abstractC0197 != null) {
            abstractC0197.f1438 = c3726;
        }
        c3726.f1438 = this;
        this.f1439 = c3726;
        AbstractC0197 abstractC0198 = this.f1440;
        c3726.f1440 = abstractC0198;
        if (c3726.f1439 == null) {
            abstractC0198.f1435 = c3726;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m1351() {
        ArrayList arrayList = this.f1437;
        return arrayList != null ? C20195.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1342(List list) {
        if (list.isEmpty()) {
            this.f1437 = null;
        } else {
            this.f1437 = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1347(C19954 c19954) {
        if (this.f1437 == null) {
            this.f1437 = new ArrayList();
        }
        this.f1437.add(c19954);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        return C9045.m23341(sb, mo1356(), l.d);
    }
}
