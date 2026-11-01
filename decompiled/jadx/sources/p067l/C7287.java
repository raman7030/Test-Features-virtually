package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C7287 {

    /* JADX INFO: renamed from: ֫ */
    public final List f19020;

    /* JADX INFO: renamed from: ۧ */
    public final String f19021;

    public C7287(C14677 c14677) {
        this.f19021 = c14677.m33591();
        int i = c14677.readInt();
        this.f19020 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            List list = this.f19020;
            C20699 c20699 = new C20699();
            c20699.f63908 = true;
            c20699.f63910 = c14677.readInt();
            c20699.f63906 = c14677.readInt();
            c20699.f63907 = c14677.readInt();
            c20699.f63914 = c14677.readInt();
            c20699.f63915 = c14677.readInt();
            c20699.f63912 = c14677.m33591();
            c20699.f63911 = c14677.m33591();
            c20699.f63909 = c14677.m33591();
            c20699.f63913 = c14677.m33591();
            list.add(c20699);
        }
    }

    public C7287(String str, List list) {
        this.f19021 = str;
        this.f19020 = list;
    }
}
