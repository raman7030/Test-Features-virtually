package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.commonsdk.UMConfigure;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۤ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11849 implements InterfaceC20276 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23531 f33049;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p067l.InterfaceC20276
    public final boolean apply(Object obj) {
        InterfaceC16706 interfaceC16706 = (InterfaceC16706) obj;
        if (!this.f33049.mo6048(Integer.valueOf(interfaceC16706.getPosition()))) {
            String text = interfaceC16706.getText();
            text.getClass();
            byte b = -1;
            switch (text.hashCode()) {
                case -1888027236:
                    if (text.equals("volatile")) {
                        b = 0;
                    }
                    break;
                case -1466596076:
                    if (text.equals(MessageHandler.Properties.IsSynchronized)) {
                        b = 1;
                    }
                    break;
                case -1052618729:
                    if (text.equals(UMConfigure.WRAPER_TYPE_NATIVE)) {
                        b = 2;
                    }
                    break;
                case -977423767:
                    if (text.equals("public")) {
                        b = 3;
                    }
                    break;
                case -906342564:
                    if (text.equals("sealed")) {
                        b = 4;
                    }
                    break;
                case -892481938:
                    if (text.equals("static")) {
                        b = 5;
                    }
                    break;
                case -608539730:
                    if (text.equals("protected")) {
                        b = 6;
                    }
                    break;
                case -314497661:
                    if (text.equals("private")) {
                        b = 7;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    if (text.equals("-")) {
                        b = 8;
                    }
                    break;
                case 109261:
                    if (text.equals("non")) {
                        b = 9;
                    }
                    break;
                case 97436022:
                    if (text.equals("final")) {
                        b = 10;
                    }
                    break;
                case 1052746378:
                    if (text.equals("transient")) {
                        b = 11;
                    }
                    break;
                case 1544803905:
                    if (text.equals("default")) {
                        b = 12;
                    }
                    break;
                case 1732898850:
                    if (text.equals("abstract")) {
                        b = C0698cb.f2569k;
                    }
                    break;
                case 1794694483:
                    if (text.equals("strictfp")) {
                        b = C0698cb.f2570l;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
