package p067l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9US */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15351 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC8055 f43815;

    /* JADX INFO: renamed from: ۧ */
    public final String f43816;

    /* JADX INFO: renamed from: ܳ */
    public final String f43817;

    /* JADX INFO: renamed from: ܽ */
    public final String f43818;

    /* JADX INFO: renamed from: ܿ */
    public final EnumC13420 f43819;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f43820;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f43821;

    /* JADX INFO: renamed from: ֫ */
    public void mo5055(StringBuilder sb) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo34939(long j);

    public AbstractC15351(String str, EnumC13420 enumC13420, EnumC8055 enumC8055, boolean z) {
        this.f43818 = str;
        this.f43819 = enumC13420;
        this.f43815 = enumC8055;
        this.f43821 = z;
        HashMap mapM15319 = C6714.m15319(m34943());
        this.f43820 = mapM15319;
        String str2 = (String) mapM15319.get(EnumC14011.Domain);
        String str3 = (String) mapM15319.get(EnumC14011.Protocol);
        String str4 = (String) mapM15319.get(EnumC14011.Application);
        String lowerCase = ((String) mapM15319.get(EnumC14011.Instance)).toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? C6988.m16053("_", str4, ".") : "");
        String strM53894 = C24420.m53894(sb, str3.length() > 0 ? C6988.m16053("_", str3, ".") : "", str2, ".");
        this.f43817 = strM53894;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lowerCase.length() > 0 ? lowerCase.concat(".") : "");
        sb2.append(strM53894);
        this.f43816 = sb2.toString().toLowerCase();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC15351) {
            AbstractC15351 abstractC15351 = (AbstractC15351) obj;
            if (m34937().equals(abstractC15351.m34937()) && m34947().equals(abstractC15351.m34947()) && m34945() == abstractC15351.m34945()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo24081(AbstractC15351 abstractC15351) {
        if (m34937().equals(abstractC15351.m34937())) {
            return m34947().equals(abstractC15351.m34947()) && m34940(abstractC15351.m34945());
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34940(EnumC8055 enumC8055) {
        EnumC8055 enumC8056 = EnumC8055.CLASS_ANY;
        return enumC8056 == enumC8055 || enumC8056 == m34945() || m34945().equals(enumC8055);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m34943() {
        String str = this.f43818;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m34944() {
        String str = this.f43817;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m34937() {
        String str = this.f43816;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC13420 m34947() {
        EnumC13420 enumC13420 = this.f43819;
        return enumC13420 != null ? enumC13420 : EnumC13420.TYPE_IGNORE;
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC8055 m34945() {
        EnumC8055 enumC8055 = this.f43815;
        return enumC8055 != null ? enumC8055 : EnumC8055.CLASS_UNKNOWN;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m34948() {
        return this.f43821;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m34946() {
        String str = (String) C21562.unmodifiableMap(this.f43820).get(EnumC14011.Subtype);
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m34941() {
        EnumC14011 enumC14011 = EnumC14011.Application;
        HashMap map = this.f43820;
        return ((String) map.get(enumC14011)).equals("dns-sd") && ((String) map.get(EnumC14011.Instance)).equals("_services");
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m34949() {
        EnumC14011 enumC14011 = EnumC14011.Application;
        HashMap map = this.f43820;
        if (!((String) map.get(enumC14011)).equals("dns-sd")) {
            return false;
        }
        String str = (String) map.get(EnumC14011.Instance);
        return "b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo20945(AbstractC15351 abstractC15351) {
        return abstractC15351.m34947() == m34947();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo34938(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(m34943().getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeShort(m34947().m30568());
        dataOutputStream.writeShort(m34945().m18728());
    }

    /* JADX INFO: renamed from: ۢ */
    public final byte[] m34942() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo34938(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34936(AbstractC23793 abstractC23793) {
        byte[] bArrM34942 = m34942();
        byte[] bArrM34943 = abstractC23793.m34942();
        int iMin = Math.min(bArrM34942.length, bArrM34943.length);
        for (int i = 0; i < iMin; i++) {
            byte b = bArrM34942[i];
            byte b2 = bArrM34943[i];
            if (b > b2) {
                return 1;
            }
            if (b < b2) {
                return -1;
            }
        }
        return bArrM34942.length - bArrM34943.length;
    }

    public final int hashCode() {
        return m34945().m18728() + m34947().m30568() + m34937().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append('[');
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(System.identityHashCode(this));
        sb.append(" type: ");
        sb.append(m34947());
        sb.append(", class: ");
        sb.append(m34945());
        sb.append(this.f43821 ? "-unique," : ",");
        sb.append(" name: ");
        sb.append(this.f43818);
        mo5055(sb);
        sb.append(']');
        return sb.toString();
    }
}
