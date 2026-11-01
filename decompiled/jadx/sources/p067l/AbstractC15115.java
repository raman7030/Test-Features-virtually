package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۬᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1DC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15115 implements InterfaceC14385, Serializable {

    /* JADX INFO: renamed from: ۫ */
    public static final Object f43148 = C5728.f14029;

    /* JADX INFO: renamed from: ۗ */
    public transient InterfaceC14385 f43149;

    /* JADX INFO: renamed from: ۙ */
    public final Object f43150;

    /* JADX INFO: renamed from: ۬ */
    public final String f43151;

    /* JADX INFO: renamed from: ᩶ */
    public final Class f43152;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f43153;

    /* JADX INFO: renamed from: ᩹ */
    public final String f43154;

    /* JADX INFO: renamed from: ܽ */
    public abstract InterfaceC14385 mo8872();

    public AbstractC15115(Object obj, Class cls, String str, String str2, boolean z) {
        this.f43150 = obj;
        this.f43152 = cls;
        this.f43154 = str;
        this.f43151 = str2;
        this.f43153 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC14385 mo34526() {
        InterfaceC14385 interfaceC14385 = this.f43149;
        if (interfaceC14385 != null) {
            return interfaceC14385;
        }
        InterfaceC14385 interfaceC14385Mo8872 = mo8872();
        this.f43149 = interfaceC14385Mo8872;
        return interfaceC14385Mo8872;
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC14445 m34527() {
        Class cls = this.f43152;
        if (cls == null) {
            return null;
        }
        return this.f43153 ? C9021.m20895(cls) : C9021.m20892(cls);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m34528() {
        return this.f43154;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m34529() {
        return this.f43151;
    }
}
