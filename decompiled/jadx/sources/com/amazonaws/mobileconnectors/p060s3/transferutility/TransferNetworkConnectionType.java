package com.amazonaws.mobileconnectors.p060s3.transferutility;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.HashMap;
import java.util.Map;
import p067l.InterfaceC23699;

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

    /* JADX INFO: renamed from: ۗ */
    @InterfaceC23699("MOBILE")
    public static final TransferNetworkConnectionType f1453;

    /* JADX INFO: renamed from: ۙ */
    public static final Map f1454;

    /* JADX INFO: renamed from: ۬ */
    @InterfaceC23699("WIFI")
    public static final TransferNetworkConnectionType f1455;

    /* JADX INFO: renamed from: ᩶ */
    public static final Log f1456;

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ TransferNetworkConnectionType[] f1457;

    /* JADX INFO: renamed from: ᩹ */
    @InterfaceC23699("ANY")
    public static final TransferNetworkConnectionType f1458;

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo1544(NetworkInfo networkInfo);

    public TransferNetworkConnectionType(String str, int i) {
        super(str, i);
    }

    public static TransferNetworkConnectionType valueOf(String str) {
        return (TransferNetworkConnectionType) Enum.valueOf(TransferNetworkConnectionType.class, str);
    }

    public static TransferNetworkConnectionType[] values() {
        return (TransferNetworkConnectionType[]) f1457.clone();
    }

    static {
        int i = 0;
        TransferNetworkConnectionType transferNetworkConnectionType = new TransferNetworkConnectionType("ANY", i) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.1
            @Override // com.amazonaws.mobileconnectors.p060s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ֫ */
            public boolean mo1544(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected();
            }
        };
        f1458 = transferNetworkConnectionType;
        TransferNetworkConnectionType transferNetworkConnectionType2 = new TransferNetworkConnectionType("WIFI", 1) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.2
            @Override // com.amazonaws.mobileconnectors.p060s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ֫ */
            public boolean mo1544(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 1;
            }
        };
        f1455 = transferNetworkConnectionType2;
        TransferNetworkConnectionType transferNetworkConnectionType3 = new TransferNetworkConnectionType("MOBILE", 2) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkConnectionType.3
            @Override // com.amazonaws.mobileconnectors.p060s3.transferutility.TransferNetworkConnectionType
            /* JADX INFO: renamed from: ֫ */
            public boolean mo1544(NetworkInfo networkInfo) {
                return networkInfo != null && networkInfo.isConnected() && networkInfo.getType() == 0;
            }
        };
        f1453 = transferNetworkConnectionType3;
        f1457 = new TransferNetworkConnectionType[]{transferNetworkConnectionType, transferNetworkConnectionType2, transferNetworkConnectionType3};
        f1454 = new HashMap();
        TransferNetworkConnectionType[] transferNetworkConnectionTypeArrValues = values();
        int length = transferNetworkConnectionTypeArrValues.length;
        while (i < length) {
            TransferNetworkConnectionType transferNetworkConnectionType4 = transferNetworkConnectionTypeArrValues[i];
            f1454.put(transferNetworkConnectionType4.toString(), transferNetworkConnectionType4);
            i++;
        }
        f1456 = LogFactory.m1468(TransferNetworkConnectionType.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m1543(ConnectivityManager connectivityManager) {
        return mo1544(connectivityManager.getActiveNetworkInfo());
    }

    /* JADX INFO: renamed from: ֫ */
    public static TransferNetworkConnectionType m1542(String str) {
        Map map = f1454;
        if (map.containsKey(str)) {
            return (TransferNetworkConnectionType) map.get(str);
        }
        f1456.mo1457("Unknown connection type " + str + " transfer will have connection type set to ANY.");
        return f1458;
    }
}
