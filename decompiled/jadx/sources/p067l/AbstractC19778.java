package p067l;

/* JADX INFO: renamed from: l.ᩳ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19778 extends AbstractC22481 {

    /* JADX INFO: renamed from: ֫ */
    public String f60174;

    /* JADX INFO: renamed from: ۧ */
    public String f60175;

    public AbstractC19778(String str, String str2, boolean z) {
        C18515.m42066(str);
        C18515.m42066(str2);
        this.f60174 = C24550.m54148(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? C17073.m38720(1, 1, str2) : str2;
        String strM54147 = (!z && z2) ? C24550.m54147(str2) : C24550.m54148(str2);
        this.f60175 = strM54147;
    }
}
