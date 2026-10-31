package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.UMConfigure;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ۤ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9976 implements InterfaceC18842 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22267 f30090;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.InterfaceC18842
    public final boolean apply(Object obj) {
        InterfaceC15086 interfaceC15086 = (InterfaceC15086) obj;
        if (!this.f30090.mo3775(Integer.valueOf(interfaceC15086.getPosition()))) {
            String text = interfaceC15086.getText();
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
                        b = cb.k;
                    }
                    break;
                case 1794694483:
                    if (text.equals("strictfp")) {
                        b = cb.f77931l;
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
