package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܰۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P9US */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13660 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC5983 f40734;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f40735;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f40736;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f40737;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC11628 f40738;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f40739;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f40740;

    /* JADX INFO: renamed from: ֫ */
    public void mo2716(StringBuilder sb) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo32824(long j);

    public AbstractC13660(String str, EnumC11628 enumC11628, EnumC5983 enumC5983, boolean z) {
        this.f40737 = str;
        this.f40738 = enumC11628;
        this.f40734 = enumC5983;
        this.f40740 = z;
        HashMap mapM13431 = C4572.m13431(m32828());
        this.f40739 = mapM13431;
        String str2 = (String) mapM13431.get(EnumC12250.Domain);
        String str3 = (String) mapM13431.get(EnumC12250.Protocol);
        String str4 = (String) mapM13431.get(EnumC12250.Application);
        String lowerCase = ((String) mapM13431.get(EnumC12250.Instance)).toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? C4860.m14172("_", str4, ".") : "");
        String strM51498 = C23202.m51498(sb, str3.length() > 0 ? C4860.m14172("_", str3, ".") : "", str2, ".");
        this.f40736 = strM51498;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(lowerCase.length() > 0 ? lowerCase.concat(".") : "");
        sb2.append(strM51498);
        this.f40735 = sb2.toString().toLowerCase();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC13660) {
            AbstractC13660 abstractC13660 = (AbstractC13660) obj;
            if (m32822().equals(abstractC13660.m32822()) && m32832().equals(abstractC13660.m32832()) && m32830() == abstractC13660.m32830()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo22112(AbstractC13660 abstractC13660) {
        if (m32822().equals(abstractC13660.m32822())) {
            return m32832().equals(abstractC13660.m32832()) && m32825(abstractC13660.m32830());
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32825(EnumC5983 enumC5983) {
        EnumC5983 enumC5984 = EnumC5983.CLASS_ANY;
        return enumC5984 == enumC5983 || enumC5984 == m32830() || m32830().equals(enumC5983);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m32828() {
        String str = this.f40737;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m32829() {
        String str = this.f40736;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32822() {
        String str = this.f40735;
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC11628 m32832() {
        EnumC11628 enumC11628 = this.f40738;
        return enumC11628 != null ? enumC11628 : EnumC11628.TYPE_IGNORE;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC5983 m32830() {
        EnumC5983 enumC5983 = this.f40734;
        return enumC5983 != null ? enumC5983 : EnumC5983.CLASS_UNKNOWN;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32833() {
        return this.f40740;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m32831() {
        String str = (String) C20195.unmodifiableMap(this.f40739).get(EnumC12250.Subtype);
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m32826() {
        EnumC12250 enumC12250 = EnumC12250.Application;
        HashMap map = this.f40739;
        return ((String) map.get(enumC12250)).equals("dns-sd") && ((String) map.get(EnumC12250.Instance)).equals("_services");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m32834() {
        EnumC12250 enumC12250 = EnumC12250.Application;
        HashMap map = this.f40739;
        if (!((String) map.get(enumC12250)).equals("dns-sd")) {
            return false;
        }
        String str = (String) map.get(EnumC12250.Instance);
        return "b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo18988(AbstractC13660 abstractC13660) {
        return abstractC13660.m32832() == m32832();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo32823(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(m32828().getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeShort(m32832().m28522());
        dataOutputStream.writeShort(m32830().m16802());
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final byte[] m32827() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo32823(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32821(AbstractC22542 abstractC22542) {
        byte[] bArrM32827 = m32827();
        byte[] bArrM32828 = abstractC22542.m32827();
        int iMin = Math.min(bArrM32827.length, bArrM32828.length);
        for (int i = 0; i < iMin; i++) {
            byte b = bArrM32827[i];
            byte b2 = bArrM32828[i];
            if (b > b2) {
                return 1;
            }
            if (b < b2) {
                return -1;
            }
        }
        return bArrM32827.length - bArrM32828.length;
    }

    public final int hashCode() {
        return m32830().m16802() + m32832().m28522() + m32822().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append('[');
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(System.identityHashCode(this));
        sb.append(" type: ");
        sb.append(m32832());
        sb.append(", class: ");
        sb.append(m32830());
        sb.append(this.f40740 ? "-unique," : ",");
        sb.append(" name: ");
        sb.append(this.f40737);
        mo2716(sb);
        sb.append(']');
        return sb.toString();
    }
}
