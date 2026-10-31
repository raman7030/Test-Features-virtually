package l;

import android.text.TextUtils;
import android.util.Base64;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩶ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C20344 implements Serializable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65671 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65674 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f65669 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f65676 = false;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f65665 = 10;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f65672 = 2;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f65666 = 10;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f65667 = 1000;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f65670 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f65677 = "\\n";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f65673 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f65668 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f65675 = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46669() {
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        C10130 c10130 = new C10130();
        boolean z = this.f65671 == 0;
        this.f65674 = z;
        ?? r2 = z;
        if (this.f65669) {
            r2 = (z ? 1 : 0) | 2;
        }
        int i = r2;
        if (this.f65676) {
            i = (r2 == true ? 1 : 0) | 4;
        }
        c10130.writeByte(i);
        c10130.writeInt(this.f65665);
        c10130.writeInt(this.f65672);
        c10130.writeInt(this.f65666);
        c10130.writeInt(this.f65671);
        c10130.writeInt(this.f65667);
        c10130.m25425(this.f65670);
        c10130.m25423(this.f65677);
        int iM52559 = C23850.m52559(this.f65673);
        this.f65673 = iM52559;
        c10130.writeInt(iM52559);
        c10130.m25425(this.f65668);
        CharSequence charSequence = this.f65675;
        if (charSequence == null) {
            charSequence = "";
        }
        c10130.m25423(charSequence);
        interfaceC13049Edit.putString("smfa", Base64.encodeToString(c10130.m25444(), 2)).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46668() {
        String string = ApplicationC20075.f65008.getString("smfa", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            C12951 c12951 = new C12951(Base64.decode(string, 2));
            byte b = c12951.readByte();
            this.f65674 = (b & 1) != 0;
            this.f65669 = (b & 2) != 0;
            this.f65676 = (b & 4) != 0;
            this.f65665 = c12951.readInt();
            this.f65672 = c12951.readInt();
            this.f65666 = c12951.readInt();
            this.f65671 = !this.f65674 ? 1 : 0;
            int i = c12951.readInt();
            int i2 = c12951.readInt();
            boolean zM31498 = c12951.m31498();
            String strM31504 = c12951.m31504();
            int iM52559 = C23850.m52559(c12951.readInt());
            boolean zM31499 = c12951.m31498();
            String strM31505 = c12951.m31504();
            if (i >= 0 && i <= 3) {
                this.f65671 = i;
                this.f65674 = i == 0;
            }
            this.f65667 = i2;
            this.f65670 = zM31498;
            this.f65677 = strM31504;
            this.f65673 = iM52559;
            this.f65668 = zM31499;
            this.f65675 = strM31505;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46667() {
        int i = this.f65671;
        return i == 2 || i == 3;
    }
}
