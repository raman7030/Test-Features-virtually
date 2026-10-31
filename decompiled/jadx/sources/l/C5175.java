package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes2.dex */
public final class C5175 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f16179;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f16180;

    public C5175(C12951 c12951) {
        this.f16180 = c12951.m31504();
        int i = c12951.readInt();
        this.f16179 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            List list = this.f16179;
            C19287 c19287 = new C19287();
            c19287.f60678 = true;
            c19287.f60680 = c12951.readInt();
            c19287.f60676 = c12951.readInt();
            c19287.f60677 = c12951.readInt();
            c19287.f60684 = c12951.readInt();
            c19287.f60685 = c12951.readInt();
            c19287.f60682 = c12951.m31504();
            c19287.f60681 = c12951.m31504();
            c19287.f60679 = c12951.m31504();
            c19287.f60683 = c12951.m31504();
            list.add(c19287);
        }
    }

    public C5175(String str, List list) {
        this.f16180 = str;
        this.f16179 = list;
    }
}
