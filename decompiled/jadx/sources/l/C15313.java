package l;

/* JADX INFO: renamed from: l.ܶܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15313 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f46967 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f46966 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f46965 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36337(C18090 c18090) {
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            this.f46967 = false;
            this.f46966 = false;
            return;
        }
        try {
            C15206 c15206M35970 = C15206.m35970(c18090.m42189(entry));
            this.f46967 = C22263.m49982(c15206M35970);
            this.f46966 = C22263.m49984(c15206M35970);
        } catch (Throwable unused) {
            this.f46967 = false;
            this.f46966 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36338(byte[] bArr) {
        try {
            C15206 c15206M35978 = C15206.m35978(bArr);
            this.f46967 = C22263.m49982(c15206M35978);
            this.f46966 = C22263.m49984(c15206M35978);
        } catch (Exception unused) {
            this.f46967 = false;
            this.f46966 = false;
        }
    }
}
