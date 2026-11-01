package p067l;

import android.text.TextUtils;
import android.util.Base64;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩶ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C21704 implements Serializable {

    /* JADX INFO: renamed from: ۫ */
    public int f68347 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f68350 = true;

    /* JADX INFO: renamed from: ۤ */
    public boolean f68345 = false;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f68352 = false;

    /* JADX INFO: renamed from: ۗ */
    public int f68341 = 10;

    /* JADX INFO: renamed from: ۬ */
    public int f68348 = 2;

    /* JADX INFO: renamed from: ۙ */
    public int f68342 = 10;

    /* JADX INFO: renamed from: ۛ */
    public int f68343 = 1000;

    /* JADX INFO: renamed from: ۨ */
    public boolean f68346 = true;

    /* JADX INFO: renamed from: ᩺ */
    public String f68353 = "\\n";

    /* JADX INFO: renamed from: ܰ */
    public int f68349 = 0;

    /* JADX INFO: renamed from: ۟ */
    public boolean f68344 = true;

    /* JADX INFO: renamed from: ᩸ */
    public String f68351 = "";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: ܽ */
    public final void m48992() {
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        C11996 c11996 = new C11996();
        boolean z = this.f68347 == 0;
        this.f68350 = z;
        ?? r2 = z;
        if (this.f68345) {
            r2 = (z ? 1 : 0) | 2;
        }
        int i = r2;
        if (this.f68352) {
            i = (r2 == true ? 1 : 0) | 4;
        }
        c11996.writeByte(i);
        c11996.writeInt(this.f68341);
        c11996.writeInt(this.f68348);
        c11996.writeInt(this.f68342);
        c11996.writeInt(this.f68347);
        c11996.writeInt(this.f68343);
        c11996.m27445(this.f68346);
        c11996.m27443(this.f68353);
        int iM54968 = C25036.m54968(this.f68349);
        this.f68349 = iM54968;
        c11996.writeInt(iM54968);
        c11996.m27445(this.f68344);
        CharSequence charSequence = this.f68351;
        if (charSequence == null) {
            charSequence = "";
        }
        c11996.m27443(charSequence);
        interfaceC14770Edit.putString("smfa", Base64.encodeToString(c11996.m27464(), 2)).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public final void m48991() {
        String string = ApplicationC21448.f67649.getString("smfa", null);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            C14677 c14677 = new C14677(Base64.decode(string, 2));
            byte b = c14677.readByte();
            this.f68350 = (b & 1) != 0;
            this.f68345 = (b & 2) != 0;
            this.f68352 = (b & 4) != 0;
            this.f68341 = c14677.readInt();
            this.f68348 = c14677.readInt();
            this.f68342 = c14677.readInt();
            this.f68347 = !this.f68350 ? 1 : 0;
            int i = c14677.readInt();
            int i2 = c14677.readInt();
            boolean zM33585 = c14677.m33585();
            String strM33591 = c14677.m33591();
            int iM54968 = C25036.m54968(c14677.readInt());
            boolean zM33586 = c14677.m33585();
            String strM33592 = c14677.m33591();
            if (i >= 0 && i <= 3) {
                this.f68347 = i;
                this.f68350 = i == 0;
            }
            this.f68343 = i2;
            this.f68346 = zM33585;
            this.f68353 = strM33591;
            this.f68349 = iM54968;
            this.f68344 = zM33586;
            this.f68351 = strM33592;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48990() {
        int i = this.f68347;
        return i == 2 || i == 3;
    }
}
