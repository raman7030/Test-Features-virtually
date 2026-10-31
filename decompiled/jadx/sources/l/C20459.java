package l;

import java.lang.ref.SoftReference;
import java.util.List;

/* JADX INFO: renamed from: l.᩶᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7JN */
/* JADX INFO: loaded from: classes4.dex */
public final class C20459 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SoftReference f65962 = new SoftReference(new C22575());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22575 m46860() {
        C22575 c22575 = (C22575) f65962.get();
        if (c22575 != null) {
            return c22575;
        }
        C22575 c22576 = new C22575();
        f65962 = new SoftReference(c22576);
        return c22576;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15518 m46859(String str, boolean z) {
        String strM50560 = m46860().m50560(str, z);
        if (strM50560 == null) {
            return null;
        }
        C19048 c19048 = new C19048();
        c19048.f17421 = C14533.m34679(strM50560);
        c19048.f59988 = C18480.m42965(-16777216);
        c19048.f59985 = C18480.m42965(0);
        C15518 c15518 = new C15518();
        C1408 c1408 = c15518.f47431.f25886;
        float fM27878 = C11266.m27878(24.0f);
        c1408.f5060 = fM27878;
        c1408.f5066 = fM27878;
        c1408.f5062 = 24.0f;
        c1408.f5072 = 24.0f;
        c1408.f5065.f63800.add(c19048);
        return c15518;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m46861() {
        return (List) C5378.stream(m46860().f72985.entrySet()).filter(new C2538(2)).map(new C14205(1)).sorted().collect(C22976.toUnmodifiableList());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m46862() {
        return (List) C5378.stream(m46860().f72985.entrySet()).filter(new C21870(0)).map(new C14205(1)).sorted().collect(C22976.toUnmodifiableList());
    }
}
