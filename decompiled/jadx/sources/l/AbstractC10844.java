package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10844 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC10844 f32593 = new C10322();

    /* JADX INFO: renamed from: ֫ */
    public abstract Set mo5671();

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC13848 mo5672();

    /* JADX INFO: renamed from: ܽ */
    public abstract InterfaceC13848 mo5673();

    /* JADX INFO: renamed from: ᩳ */
    public abstract InterfaceC13848 mo5674();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC10844 m27108(C12918 c12918, int i) {
        if (i == 0) {
            return f32593;
        }
        return new C1671(c12918, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m27106(C12918 c12918, int i) {
        if (i != 0) {
            return new C6088(c12918, i, c12918.m31418().mo11935(i));
        }
        return AbstractC6079.of();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m27107(C12918 c12918, int i) {
        if (i > 0) {
            return new C11733(c12918, i, c12918.m31418().mo11935(i));
        }
        return AbstractC14545.of();
    }
}
