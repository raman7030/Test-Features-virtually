package com.amazonaws.mobileconnectors.s3.transferutility;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.HashMap;
import java.util.Map;
import l.InterfaceC22444;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩹' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public abstract class TransferNetworkConnectionType {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    @InterfaceC22444("MOBILE")
    public static final TransferNetworkConnectionType f293;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Map f294;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    @InterfaceC22444("WIFI")
    public static final TransferNetworkConnectionType f295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Log f296;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ TransferNetworkConnectionType[] f297;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    @InterfaceC22444("ANY")
    public static final TransferNetworkConnectionType f298;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo378(NetworkInfo networkInfo);

    public TransferNetworkConnectionType(String str, int i) {
        super(str, i);
    }

    public static TransferNetworkConnectionType valueOf(String str) {
        return (TransferNetworkConnectionType) Enum.valueOf(TransferNetworkConnectionType.class, str);
    }

    public static TransferNetworkConnectionType[] values() {
        return (TransferNetworkConnectionType[]) f297.clone();
    }

    static {
        int i = 0;
        TransferNetworkConnectionType transferNetworkConnectionType = new TransferNetworkConnectionType("ANY", i) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.1
            @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ֫ */
            public boolean mo378(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected();
            }
        };
        f298 = transferNetworkConnectionType;
        TransferNetworkConnectionType transferNetworkConnectionType2 = new TransferNetworkConnectionType("WIFI", 1) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.2
            @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ֫ */
            public boolean mo378(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
            }
        };
        f295 = transferNetworkConnectionType2;
        TransferNetworkConnectionType transferNetworkConnectionType3 = new TransferNetworkConnectionType("MOBILE", 2) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.3
            @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ֫ */
            public boolean mo378(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
            }
        };
        f293 = transferNetworkConnectionType3;
        f297 = new TransferNetworkConnectionType[]{transferNetworkConnectionType, transferNetworkConnectionType2, transferNetworkConnectionType3};
        f294 = new HashMap();
        TransferNetworkConnectionType[] transferNetworkConnectionTypeArrValues = values();
        int length = transferNetworkConnectionTypeArrValues.length;
        while (i < length) {
            TransferNetworkConnectionType transferNetworkConnectionType4 = transferNetworkConnectionTypeArrValues[i];
            f294.put(transferNetworkConnectionType4.toString(), transferNetworkConnectionType4);
            i++;
        }
        f296 = LogFactory.m302(TransferNetworkConnectionType.class);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m377(ConnectivityManager connectivityManager) {
        return mo378(connectivityManager.getActiveNetworkInfo());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static TransferNetworkConnectionType m376(String str) {
        Map map = f294;
        if (map.containsKey(str)) {
            return (TransferNetworkConnectionType) map.get(str);
        }
        f296.mo291("Unknown connection type " + str + " transfer will have connection type set to ANY.");
        return f298;
    }
}
