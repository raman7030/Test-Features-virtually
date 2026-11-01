package p067l;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86KX */
/* JADX INFO: loaded from: classes.dex */
public final class C23742 extends Exception {

    /* JADX INFO: renamed from: ᩶ */
    public final List f75538;

    /* JADX INFO: renamed from: ᩸ */
    public final String f75539;

    /* JADX INFO: renamed from: ᩹ */
    public final List f75540;

    public C23742(String str, String str2, List list, List list2) {
        super(str2);
        this.f75539 = str;
        this.f75538 = C21562.unmodifiableList(new ArrayList(list));
        this.f75540 = C21562.unmodifiableList(new ArrayList(new LinkedHashSet(list2)));
    }
}
