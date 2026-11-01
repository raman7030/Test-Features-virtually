package com.tencent.p062mm.opensdk.openapi;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.material.motion.MotionUtils;
import com.tencent.p062mm.opensdk.channel.MMessageActV2;
import com.tencent.p062mm.opensdk.channel.p063a.C0605a;
import com.tencent.p062mm.opensdk.channel.p063a.C0606b;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import com.tencent.p062mm.opensdk.modelbiz.AddCardToWXCardPackage;
import com.tencent.p062mm.opensdk.modelbiz.ChooseCardFromWXCardPackage;
import com.tencent.p062mm.opensdk.modelbiz.CreateChatroom;
import com.tencent.p062mm.opensdk.modelbiz.HandleScanResult;
import com.tencent.p062mm.opensdk.modelbiz.IWXChannelJumpInfo;
import com.tencent.p062mm.opensdk.modelbiz.JoinChatroom;
import com.tencent.p062mm.opensdk.modelbiz.OpenWebview;
import com.tencent.p062mm.opensdk.modelbiz.SubscribeMessage;
import com.tencent.p062mm.opensdk.modelbiz.SubscribeMiniProgramMsg;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelBaseJumpInfo;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelBind;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelJumpUrlInfo;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelOpenEvent;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelOpenFeed;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelOpenLive;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelOpenProfile;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelShareVideo;
import com.tencent.p062mm.opensdk.modelbiz.WXChannelStartLive;
import com.tencent.p062mm.opensdk.modelbiz.WXGetA8Key;
import com.tencent.p062mm.opensdk.modelbiz.WXInvoiceAuthInsert;
import com.tencent.p062mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.p062mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken;
import com.tencent.p062mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.p062mm.opensdk.modelbiz.WXNontaxPay;
import com.tencent.p062mm.opensdk.modelbiz.WXOpenBusinessView;
import com.tencent.p062mm.opensdk.modelbiz.WXOpenBusinessWebview;
import com.tencent.p062mm.opensdk.modelbiz.WXOpenCustomerServiceChat;
import com.tencent.p062mm.opensdk.modelbiz.WXPayInsurance;
import com.tencent.p062mm.opensdk.modelbiz.WXPreloadMiniProgram;
import com.tencent.p062mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment;
import com.tencent.p062mm.opensdk.modelbiz.WXQRCodePay;
import com.tencent.p062mm.opensdk.modelmsg.GetMessageFromWX;
import com.tencent.p062mm.opensdk.modelmsg.LaunchFromWX;
import com.tencent.p062mm.opensdk.modelmsg.SendAuth;
import com.tencent.p062mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p062mm.opensdk.modelmsg.SendTdiAuth;
import com.tencent.p062mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p062mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p062mm.opensdk.modelmsg.WXStateSceneDataObject;
import com.tencent.p062mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p062mm.opensdk.modelpay.JumpToOfflinePay;
import com.tencent.p062mm.opensdk.modelpay.PayResp;
import com.tencent.p062mm.opensdk.modelpay.WXJointPay;
import com.tencent.p062mm.opensdk.utils.C0626d;
import com.tencent.p062mm.opensdk.utils.ILog;
import com.tencent.p062mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p067l.C10878;
import p067l.C10965;
import p067l.C14523;

/* JADX INFO: loaded from: classes.dex */
public class BaseWXApiImplV10 implements IWXAPI {
    public static final String TAG = "MicroMsg.SDK.WXApiImplV10";
    public static String wxappPayEntryClassname;
    public String appId;
    public boolean checkSignature;
    public Context context;
    public boolean detached = false;
    public int launchMode;
    public WXAPiSecurityHelper securityHelper;
    public int wxSdkVersion;

    public BaseWXApiImplV10(Context context, String str, boolean z, int i) {
        this.checkSignature = false;
        this.launchMode = 2;
        Log.m2020d(TAG, "<init>, appId = " + str + ", checkSignature = " + z + ", launchMode = " + i);
        this.context = context;
        this.appId = str;
        this.checkSignature = z;
        this.launchMode = i;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        C0626d.f2127D = context;
        this.securityHelper = new WXAPiSecurityHelper(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackReq(SendReqCallback sendReqCallback, boolean z) {
        if (sendReqCallback != null) {
            sendReqCallback.onSendFinish(z);
        }
    }

    private boolean checkSumConsistent(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            str = "checkSumConsistent fail, invalid arguments";
        } else {
            if (bArr.length == bArr2.length) {
                for (int i = 0; i < bArr.length; i++) {
                    if (bArr[i] != bArr2[i]) {
                        return false;
                    }
                }
                return true;
            }
            str = "checkSumConsistent fail, length is different";
        }
        Log.m2021e(TAG, str);
        return false;
    }

    private boolean createChatroom(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/createChatroom"), null, null, new String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_create_chatroom_group_id", ""), bundle.getString("_wxapi_create_chatroom_chatroom_name", ""), bundle.getString("_wxapi_create_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_create_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean doLaunchApp(Bundle bundle) {
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.bundle = bundle;
        args.content = "weixin://sendreq?appid=" + this.appId;
        args.targetPkgName = "com.tencent.mm";
        args.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
        args.launchMode = this.launchMode;
        try {
            String tokenFromWX = getTokenFromWX(this.context);
            if (tokenFromWX != null) {
                args.token = tokenFromWX;
            }
        } catch (Exception e) {
            Log.m2021e(TAG, "getTokenFromWX fail, exception = ".concat(String.valueOf(e)));
        }
        return MMessageActV2.send(this.context, args);
    }

    private String finderShareVideoJumpInfoToString(IWXChannelJumpInfo iWXChannelJumpInfo) {
        String str;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("jumpType", iWXChannelJumpInfo.type());
            if (iWXChannelJumpInfo instanceof WXChannelBaseJumpInfo) {
                jSONObject.put("wording", ((WXChannelBaseJumpInfo) iWXChannelJumpInfo).wording);
                jSONObject.put("extra", ((WXChannelBaseJumpInfo) iWXChannelJumpInfo).extra);
                if (iWXChannelJumpInfo instanceof WXChannelJumpMiniProgramInfo) {
                    jSONObject.put("username", ((WXChannelJumpMiniProgramInfo) iWXChannelJumpInfo).username);
                    str = MotionUtils.EASING_TYPE_PATH;
                    str2 = ((WXChannelJumpMiniProgramInfo) iWXChannelJumpInfo).path;
                } else if (iWXChannelJumpInfo instanceof WXChannelJumpUrlInfo) {
                    str = "url";
                    str2 = ((WXChannelJumpUrlInfo) iWXChannelJumpInfo).url;
                }
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    private String getTokenFromWX(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"), null, null, new String[]{this.appId, "638067200"}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            Log.m2021e(TAG, "getTokenFromWX , token is null , if your app targetSdkVersion >= 30, include 'com.tencent.mm' in a set of <package> elements inside the <queries> element");
            return null;
        }
        String string = cursorQuery.getString(0);
        Log.m2022i(TAG, "getTokenFromWX token is ".concat(String.valueOf(string)));
        cursorQuery.close();
        return string;
    }

    private boolean joinChatroom(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/joinChatroom"), null, null, new String[]{this.appId, bundle.getString("_wxapi_basereq_transaction", ""), bundle.getString("_wxapi_join_chatroom_group_id", ""), bundle.getString("_wxapi_join_chatroom_chatroom_nickname", ""), bundle.getString("_wxapi_join_chatroom_ext_msg", ""), bundle.getString("_wxapi_basereq_openid", "")}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private void launchWXIfNeed() {
        if (Build.VERSION.SDK_INT < 29 || this.launchMode != 2) {
            openWXApp();
        } else {
            launchWXUsingPendingIntent();
        }
    }

    private boolean sendAddCardToWX(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/addCardToWX"), null, null, new String[]{this.appId, bundle.getString("_wxapi_add_card_to_wx_card_list"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendChooseCardFromWX(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"), null, null, new String[]{bundle.getString("_wxapi_choose_card_from_wx_card_app_id"), bundle.getString("_wxapi_choose_card_from_wx_card_location_id"), bundle.getString("_wxapi_choose_card_from_wx_card_sign_type"), bundle.getString("_wxapi_choose_card_from_wx_card_card_sign"), bundle.getString("_wxapi_choose_card_from_wx_card_time_stamp"), bundle.getString("_wxapi_choose_card_from_wx_card_nonce_str"), bundle.getString("_wxapi_choose_card_from_wx_card_card_id"), bundle.getString("_wxapi_choose_card_from_wx_card_card_type"), bundle.getString("_wxapi_choose_card_from_wx_card_can_multi_select"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendFinderBind(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Log.m2022i(TAG, "sendFinderBind");
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderBind"), null, null, new String[]{this.appId, baseReq.openId}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendFinderOpenEvent(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Log.m2022i(TAG, "sendFinderOpenEvent");
        WXChannelOpenEvent.Req req = (WXChannelOpenEvent.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenEvent"), null, null, new String[]{this.appId, req.username, req.eventId, req.extInfo}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendFinderOpenFeed(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Log.m2022i(TAG, "sendFinderOpenFeed");
        WXChannelOpenFeed.Req req = (WXChannelOpenFeed.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenFeed"), null, null, new String[]{this.appId, req.feedID, req.nonceID, String.valueOf(req.notGetReleatedList)}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendFinderOpenLive(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Log.m2022i(TAG, "sendFinderOpenLive");
        WXChannelOpenLive.Req req = (WXChannelOpenLive.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenLive"), null, null, new String[]{this.appId, req.feedID, req.nonceID}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendFinderOpenProfile(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Log.m2022i(TAG, "sendFinderOpenProfile");
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderOpenProfile"), null, null, new String[]{this.appId, ((WXChannelOpenProfile.Req) baseReq).userName}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendFinderShareVideo(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Log.m2022i(TAG, "sendFinderShareVideo");
        WXChannelShareVideo.Req req = (WXChannelShareVideo.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderShareVideo"), null, null, new String[]{this.appId, req.videoPath, "", "", req.extData, finderShareVideoJumpInfoToString(req.jumpInfo)}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendFinderStartLive(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Log.m2022i(TAG, "sendFinderStartLive");
        WXChannelStartLive.Req req = (WXChannelStartLive.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/finderStartLive"), null, null, new String[]{this.appId, req.liveJsonInfo, req.openId}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendGetA8KeyReq(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/getA8Key"), null, null, new String[]{this.appId, ((WXGetA8Key.Req) baseReq).url}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendHandleScanResult(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/handleScanResult"), null, null, new String[]{this.appId, bundle.getString("_wxapi_scan_qrcode_result")}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendInvoiceAuthInsert(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "2", C14523.encode("url=" + C14523.encode(((WXInvoiceAuthInsert.Req) baseReq).url))}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendJumpToOfflinePayReq(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay"), null, null, new String[]{this.appId}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendLaunchWXMiniprogram(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        WXLaunchMiniProgram.Req req = (WXLaunchMiniProgram.Req) baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram");
        String str = this.appId;
        String str2 = req.userName;
        String str3 = req.path;
        StringBuilder sb = new StringBuilder();
        sb.append(req.miniprogramType);
        Cursor cursorQuery = contentResolver.query(uri, null, null, new String[]{str, str2, str3, sb.toString(), req.extData}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendLaunchWXMiniprogramWithToken(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogramWithToken"), null, null, new String[]{this.appId, ((WXLaunchMiniProgramWithToken.Req) baseReq).token}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendNonTaxPay(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "3", C14523.encode("url=" + C14523.encode(((WXNontaxPay.Req) baseReq).url))}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendOpenBusiLuckyMoney(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"), null, null, new String[]{this.appId, bundle.getString("_wxapi_open_busi_lucky_money_timeStamp"), bundle.getString("_wxapi_open_busi_lucky_money_nonceStr"), bundle.getString("_wxapi_open_busi_lucky_money_signType"), bundle.getString("_wxapi_open_busi_lucky_money_signature"), bundle.getString("_wxapi_open_busi_lucky_money_package")}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendOpenBusinessView(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        WXOpenBusinessView.Req req = (WXOpenBusinessView.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessView"), null, null, new String[]{this.appId, req.businessType, req.query, req.extInfo, req.transaction, req.openId}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendOpenBusinessWebview(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        WXOpenBusinessWebview.Req req = (WXOpenBusinessWebview.Req) baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/openBusinessWebview");
        HashMap map = req.queryInfo;
        String string = (map == null || map.size() <= 0) ? "" : new JSONObject(req.queryInfo).toString();
        String str = this.appId;
        StringBuilder sb = new StringBuilder();
        sb.append(req.businessType);
        Cursor cursorQuery = contentResolver.query(uri, null, null, new String[]{str, sb.toString(), string}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendOpenCustomerServiceChat(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        WXOpenCustomerServiceChat.Req req = (WXOpenCustomerServiceChat.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openCustomerServiceChat"), null, null, new String[]{this.appId, req.corpId, req.url}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendOpenRankListReq(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openRankList"), null, null, new String[0], null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendOpenWebview(Context context, Bundle bundle) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openWebview"), null, null, new String[]{this.appId, bundle.getString("_wxapi_jump_to_webview_url"), bundle.getString("_wxapi_basereq_transaction")}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendPayInSurance(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "4", C14523.encode("url=" + C14523.encode(((WXPayInsurance.Req) baseReq).url))}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendPreloadWXMiniProgramEnvironment(Context context, BaseReq baseReq) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogramEnvironment"), null, null, new String[]{this.appId, ((WXPreloadMiniProgramEnvironment.Req) baseReq).extData}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendPreloadWXMiniprogram(Context context, BaseReq baseReq) {
        WXPreloadMiniProgram.Req req = (WXPreloadMiniProgram.Req) baseReq;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogram");
        String str = this.appId;
        String str2 = req.userName;
        String str3 = req.path;
        StringBuilder sb = new StringBuilder();
        sb.append(req.miniprogramType);
        Cursor cursorQuery = contentResolver.query(uri, null, null, new String[]{str, str2, str3, sb.toString(), req.extData}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendQRCodePayReq(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        WXQRCodePay.Req req = (WXQRCodePay.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/QRCodePay"), null, null, new String[]{this.appId, req.codeContent, req.extraMsg}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendSubscribeMessage(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        SubscribeMessage.Req req = (SubscribeMessage.Req) baseReq;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "1", String.valueOf(req.scene), req.templateID, req.reserved}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendSubscribeMiniProgramMsg(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.tencent.mm.sdk.comm.provider/openTypeWebview"), null, null, new String[]{this.appId, "5", ((SubscribeMiniProgramMsg.Req) baseReq).miniProgramAppId}, null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    private boolean sendToWxaRedirectingPage(Context context, BaseReq baseReq) {
        launchWXIfNeed();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Uri.parse("content://com.tencent.mm.sdk.comm.provider/launchWxaOpenApiRedirectingPage");
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, this.appId);
        arrayList.addAll(Arrays.asList(((WXLaunchWxaRedirectingPage.Req) baseReq).toArray()));
        Cursor cursorQuery = contentResolver.query(uri, null, null, (String[]) arrayList.toArray(new String[0]), null);
        if (cursorQuery == null) {
            return true;
        }
        cursorQuery.close();
        return true;
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public void detach() {
        Log.m2020d(TAG, "detach");
        this.detached = true;
        this.context = null;
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public boolean isWXAppInstalled() {
        if (this.detached) {
            throw new IllegalStateException("isWXAppInstalled fail, WXMsgImpl has been detached");
        }
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo("com.tencent.mm", 64);
            if (packageInfo != null) {
                return WXApiImplComm.validateAppSignature(this.context, packageInfo.signatures, this.checkSignature);
            }
            Log.m2024w(TAG, "isWXAppInstalled packageInfo is null");
            return false;
        } catch (Exception e) {
            Log.m2024w(TAG, "isWXAppInstalled ex:" + e.getMessage());
            return false;
        }
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public boolean registerApp(String str) {
        return registerApp(str, 0L);
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public boolean registerApp(String str, long j) {
        if (this.detached) {
            throw new IllegalStateException("registerApp fail, WXMsgImpl has been detached");
        }
        if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            Log.m2021e(TAG, "register app failed for wechat app signature check failed");
            return false;
        }
        Log.m2020d(TAG, "registerApp, appId = ".concat(String.valueOf(str)));
        if (str != null) {
            this.appId = str;
        }
        Log.m2020d(TAG, "registerApp, appId = ".concat(String.valueOf(str)));
        if (str != null) {
            this.appId = str;
        }
        Log.m2020d(TAG, "register app " + this.context.getPackageName());
        C0605a.a aVar = new C0605a.a();
        aVar.f2092a = "com.tencent.mm";
        aVar.action = ConstantsAPI.ACTION_HANDLE_APP_REGISTER;
        aVar.content = "weixin://registerapp?appid=" + this.appId;
        aVar.f2093b = j;
        return C0605a.m2006a(this.context, aVar);
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public boolean sendReq(BaseReq baseReq) {
        return sendReq(baseReq, null);
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public boolean sendReq(BaseReq baseReq, final SendReqCallback sendReqCallback) {
        String strM25286;
        String str;
        if (this.detached) {
            throw new IllegalStateException("sendReq fail, WXMsgImpl has been detached");
        }
        if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            Log.m2021e(TAG, "sendReq failed for wechat app signature check failed");
            return false;
        }
        if (baseReq.getType() == 2) {
            SendMessageToWX.Req req = (SendMessageToWX.Req) baseReq;
            if (req.scene == 4) {
                SendMessageToWX.IWXSceneDataObject iWXSceneDataObject = req.sceneDataObject;
                if (iWXSceneDataObject instanceof WXStateSceneDataObject) {
                    WXStateSceneDataObject wXStateSceneDataObject = (WXStateSceneDataObject) iWXSceneDataObject;
                    WXMediaMessage wXMediaMessage = req.message;
                    if (wXMediaMessage.mediaObject == null) {
                        wXMediaMessage.mediaObject = new WXTextObject();
                    }
                    if (req.message.getType() == 1 && ((str = wXStateSceneDataObject.stateTitle) == null || str.length() <= 0)) {
                        wXStateSceneDataObject.stateTitle = ((WXTextObject) req.message.mediaObject).text;
                    }
                }
            }
        }
        if (!baseReq.checkArgs()) {
            Log.m2021e(TAG, "sendReq checkArgs fail");
            return false;
        }
        Log.m2022i(TAG, "sendReq, req type = " + baseReq.getType());
        final Bundle bundle = new Bundle();
        baseReq.toBundle(bundle);
        if (baseReq.getType() == 5 || baseReq.getType() == 27) {
            return sendPayReq(this.context, bundle);
        }
        if (baseReq.getType() == 9) {
            return sendAddCardToWX(this.context, bundle);
        }
        if (baseReq.getType() == 16) {
            return sendChooseCardFromWX(this.context, bundle);
        }
        if (baseReq.getType() == 11) {
            return sendOpenRankListReq(this.context, bundle);
        }
        if (baseReq.getType() == 12) {
            return sendOpenWebview(this.context, bundle);
        }
        if (baseReq.getType() == 25) {
            return sendOpenBusinessWebview(this.context, baseReq);
        }
        if (baseReq.getType() == 13) {
            return sendOpenBusiLuckyMoney(this.context, bundle);
        }
        if (baseReq.getType() == 14) {
            return createChatroom(this.context, bundle);
        }
        if (baseReq.getType() == 15) {
            return joinChatroom(this.context, bundle);
        }
        if (baseReq.getType() == 17) {
            return sendHandleScanResult(this.context, bundle);
        }
        if (baseReq.getType() == 18) {
            return sendSubscribeMessage(this.context, baseReq);
        }
        if (baseReq.getType() == 28) {
            return sendPreloadWXMiniprogram(this.context, baseReq);
        }
        if (baseReq.getType() == 29) {
            return sendLaunchWXMiniprogramWithToken(this.context, baseReq);
        }
        if (baseReq.getType() == 23) {
            return sendSubscribeMiniProgramMsg(this.context, baseReq);
        }
        if (baseReq.getType() == 19) {
            return sendLaunchWXMiniprogram(this.context, baseReq);
        }
        if (baseReq.getType() == 32) {
            return sendPreloadWXMiniProgramEnvironment(this.context, baseReq);
        }
        if (baseReq.getType() == 30) {
            return sendToWxaRedirectingPage(this.context, baseReq);
        }
        if (baseReq.getType() == 26) {
            return sendOpenBusinessView(this.context, baseReq);
        }
        if (baseReq.getType() == 33) {
            return sendFinderShareVideo(this.context, baseReq);
        }
        if (baseReq.getType() == 39) {
            return sendFinderStartLive(this.context, baseReq);
        }
        if (baseReq.getType() == 34) {
            return sendFinderOpenProfile(this.context, baseReq);
        }
        if (baseReq.getType() == 35) {
            return sendFinderOpenLive(this.context, baseReq);
        }
        if (baseReq.getType() == 36) {
            return sendFinderOpenFeed(this.context, baseReq);
        }
        if (baseReq.getType() == 41) {
            return sendFinderOpenEvent(this.context, baseReq);
        }
        if (baseReq.getType() == 42) {
            return sendFinderBind(this.context, baseReq);
        }
        if (baseReq.getType() == 37) {
            return sendOpenCustomerServiceChat(this.context, baseReq);
        }
        if (baseReq.getType() == 38) {
            return sendQRCodePayReq(this.context, baseReq);
        }
        if (baseReq.getType() == 20) {
            return sendInvoiceAuthInsert(this.context, baseReq);
        }
        if (baseReq.getType() == 21) {
            return sendNonTaxPay(this.context, baseReq);
        }
        if (baseReq.getType() == 22) {
            return sendPayInSurance(this.context, baseReq);
        }
        if (baseReq.getType() == 24) {
            return sendJumpToOfflinePayReq(this.context, bundle);
        }
        if (baseReq.getType() == 43) {
            return sendGetA8KeyReq(this.context, baseReq);
        }
        if (baseReq.getType() == 2) {
            SendMessageToWX.Req req2 = (SendMessageToWX.Req) baseReq;
            if (C0626d.m2030a(req2.message.getType())) {
                WXMiniProgramObject wXMiniProgramObject = (WXMiniProgramObject) req2.message.mediaObject;
                wXMiniProgramObject.userName = C10965.m25286(new StringBuilder(), wXMiniProgramObject.userName, "@app");
                String str2 = wXMiniProgramObject.path;
                if (!C0626d.m2033b(str2)) {
                    String[] strArrSplit = str2.split("\\?");
                    if (strArrSplit.length > 1) {
                        strM25286 = strArrSplit[0] + ".html?" + strArrSplit[1];
                    } else {
                        strM25286 = C10965.m25286(new StringBuilder(), strArrSplit[0], ".html");
                    }
                    wXMiniProgramObject.path = strM25286;
                }
                int i = req2.scene;
                if (i != 3 && i != 1) {
                    req2.scene = 0;
                }
                baseReq.toBundle(bundle);
            }
        }
        String strExtractMayNeedDoSecurityCheckUrl = this.securityHelper.extractMayNeedDoSecurityCheckUrl(this.appId, baseReq);
        if (C0626d.m2033b(strExtractMayNeedDoSecurityCheckUrl)) {
            boolean zDoLaunchApp = doLaunchApp(bundle);
            callbackReq(sendReqCallback, zDoLaunchApp);
            return zDoLaunchApp;
        }
        int iDoExtraSecurityCheck = this.securityHelper.doExtraSecurityCheck(this.appId, "638067200", strExtractMayNeedDoSecurityCheckUrl, new WXAPiSecurityHelper.ISecurityCheck() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.2
            @Override // com.tencent.mm.opensdk.openapi.WXAPiSecurityHelper.ISecurityCheck
            public void onCheckFinish(boolean z) {
                if (!z) {
                    Log.m2022i(BaseWXApiImplV10.TAG, "WXAPiSecurityHelper, extra check do next step: check fail, stop process!");
                    BaseWXApiImplV10.this.callbackReq(sendReqCallback, false);
                } else {
                    Log.m2022i(BaseWXApiImplV10.TAG, "WXAPiSecurityHelper, extra check do next step: check pass, doLaunchApp");
                    BaseWXApiImplV10.this.callbackReq(sendReqCallback, BaseWXApiImplV10.this.doLaunchApp(bundle));
                }
            }
        });
        if (iDoExtraSecurityCheck == 0) {
            Log.m2022i(TAG, "WXAPiSecurityHelper, extra check pass, doLaunchApp");
            boolean zDoLaunchApp2 = doLaunchApp(bundle);
            callbackReq(sendReqCallback, zDoLaunchApp2);
            return zDoLaunchApp2;
        }
        if (iDoExtraSecurityCheck != 1) {
            Log.m2022i(TAG, "WXAPiSecurityHelper, hold on request, extra check need to do next step");
            return true;
        }
        Log.m2022i(TAG, "WXAPiSecurityHelper, extra check fail, return");
        callbackReq(sendReqCallback, false);
        return false;
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public boolean sendResp(BaseResp baseResp) {
        String str;
        if (this.detached) {
            throw new IllegalStateException("sendResp fail, WXMsgImpl has been detached");
        }
        if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            str = "sendResp failed for wechat app signature check failed";
        } else {
            if (baseResp.checkArgs()) {
                Bundle bundle = new Bundle();
                baseResp.toBundle(bundle);
                MMessageActV2.Args args = new MMessageActV2.Args();
                args.bundle = bundle;
                args.content = "weixin://sendresp?appid=" + this.appId;
                args.targetPkgName = "com.tencent.mm";
                args.targetClassName = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                try {
                    String tokenFromWX = getTokenFromWX(this.context);
                    if (tokenFromWX != null) {
                        args.token = tokenFromWX;
                    }
                } catch (Exception e) {
                    Log.m2021e(TAG, "getTokenFromWX fail, exception = ".concat(String.valueOf(e)));
                }
                return MMessageActV2.send(this.context, args);
            }
            str = "sendResp checkArgs fail";
        }
        Log.m2021e(TAG, str);
        return false;
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public void setLogImpl(ILog iLog) {
        Log.setLogImpl(iLog);
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public void unregisterApp() {
        if (this.detached) {
            throw new IllegalStateException("unregisterApp fail, WXMsgImpl has been detached");
        }
        if (!WXApiImplComm.validateAppSignatureForPackage(this.context, "com.tencent.mm", this.checkSignature)) {
            Log.m2021e(TAG, "unregister app failed for wechat app signature check failed");
            return;
        }
        Log.m2020d(TAG, "unregisterApp, appId = " + this.appId);
        String str = this.appId;
        if (str == null || str.length() == 0) {
            Log.m2021e(TAG, "unregisterApp fail, appId is empty");
            return;
        }
        Log.m2020d(TAG, "unregister app " + this.context.getPackageName());
        C0605a.a aVar = new C0605a.a();
        aVar.f2092a = "com.tencent.mm";
        aVar.action = ConstantsAPI.ACTION_HANDLE_APP_UNREGISTER;
        aVar.content = "weixin://unregisterapp?appid=" + this.appId;
        C0605a.m2006a(this.context, aVar);
    }

    private void launchWXUsingPendingIntent() {
        PendingIntent activity;
        if (this.detached) {
            throw new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
        }
        if (!isWXAppInstalled()) {
            Log.m2021e(TAG, "openWXApp failed, not installed or signature check failed");
            return;
        }
        try {
            Log.m2022i(TAG, "launchWXUsingPendingIntent");
            Intent launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
            int i = Build.VERSION.SDK_INT;
            int i2 = i >= 23 ? 201326592 : 134217728;
            if (i < 35) {
                activity = PendingIntent.getActivity(this.context, 1, launchIntentForPackage, i2);
            } else {
                if (launchIntentForPackage == null) {
                    throw new NullPointerException("getLaunchIntentForPackage is null");
                }
                ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                activity = PendingIntent.getActivity(this.context, 1, launchIntentForPackage, i2, activityOptionsMakeBasic.toBundle());
            }
            activity.send(this.context, 2, null, new PendingIntent.OnFinished() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.3
                @Override // android.app.PendingIntent.OnFinished
                public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i3, String str, Bundle bundle) {
                    Log.m2020d(BaseWXApiImplV10.TAG, "onSendFinished resultCode: " + i3 + ", resultData: " + str);
                }
            }, null);
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("launchWXUsingPendingIntent pendingIntent send failed: "), TAG);
            openWXApp();
        }
    }

    private boolean sendPayReq(Context context, Bundle bundle) {
        if (wxappPayEntryClassname == null) {
            wxappPayEntryClassname = new MMSharedPreferences(context).getString("_wxapp_pay_entry_classname_", null);
            Log.m2020d(TAG, "pay, set wxappPayEntryClassname = " + wxappPayEntryClassname);
            if (wxappPayEntryClassname == null) {
                try {
                    wxappPayEntryClassname = context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getString("com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME", null);
                } catch (Exception e) {
                    C10878.m25049(e, new StringBuilder("get from metaData failed : "), TAG);
                }
            }
            if (wxappPayEntryClassname == null) {
                Log.m2021e(TAG, "pay fail, wxappPayEntryClassname is null");
                return false;
            }
        }
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.bundle = bundle;
        args.targetPkgName = "com.tencent.mm";
        args.targetClassName = wxappPayEntryClassname;
        args.launchMode = this.launchMode;
        try {
            String tokenFromWX = getTokenFromWX(context);
            if (tokenFromWX != null) {
                args.token = tokenFromWX;
            }
        } catch (Exception e2) {
            Log.m2021e(TAG, "getTokenFromWX fail, exception = ".concat(String.valueOf(e2)));
        }
        return MMessageActV2.send(context, args);
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public int getWXAppSupportAPI() {
        if (this.detached) {
            throw new IllegalStateException("getWXAppSupportAPI fail, WXMsgImpl has been detached");
        }
        if (!isWXAppInstalled()) {
            Log.m2021e(TAG, "open wx app failed, not installed or signature check failed");
            return 0;
        }
        this.wxSdkVersion = 0;
        try {
            this.wxSdkVersion = this.context.getPackageManager().getApplicationInfo("com.tencent.mm", 128).metaData.getInt("com.tencent.mm.BuildInfo.OPEN_SDK_VERSION", 0);
            Log.m2020d(TAG, "OPEN_SDK_VERSION = " + this.wxSdkVersion);
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("get from metaData failed : "), TAG);
        }
        if (this.wxSdkVersion == 0) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C0626d.m2031b().submit(new Runnable() { // from class: com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        MMSharedPreferences mMSharedPreferences = new MMSharedPreferences(BaseWXApiImplV10.this.context);
                        BaseWXApiImplV10.this.wxSdkVersion = mMSharedPreferences.getInt("_build_info_sdk_int_", 0);
                    } catch (Exception e2) {
                        Log.m2024w(BaseWXApiImplV10.TAG, e2.getMessage());
                    }
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                Log.m2024w(TAG, e2.getMessage());
            }
        }
        Log.m2020d(TAG, "wxSdkVersion = " + this.wxSdkVersion);
        return this.wxSdkVersion;
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public boolean openWXApp() {
        if (this.detached) {
            throw new IllegalStateException("openWXApp fail, WXMsgImpl has been detached");
        }
        if (!isWXAppInstalled()) {
            Log.m2021e(TAG, "open wx app failed, not installed or signature check failed");
            return false;
        }
        try {
            Context context = this.context;
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm"));
            return true;
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("startActivity fail, exception = "), TAG);
            return false;
        }
    }

    private boolean handleWxInternalRespType(String str, IWXAPIEventHandler iWXAPIEventHandler) {
        Log.m2022i(TAG, "handleWxInternalRespType, extInfo = ".concat(String.valueOf(str)));
        try {
            Uri uri = Uri.parse(str);
            String queryParameter = uri.getQueryParameter("wx_internal_resptype");
            Log.m2022i(TAG, "handleWxInternalRespType, respType = ".concat(String.valueOf(queryParameter)));
            if (C0626d.m2033b(queryParameter)) {
                Log.m2021e(TAG, "handleWxInternalRespType fail, respType is null");
                return false;
            }
            if (queryParameter.equals("subscribemessage")) {
                SubscribeMessage.Resp resp = new SubscribeMessage.Resp();
                String queryParameter2 = uri.getQueryParameter("ret");
                if (queryParameter2 != null && queryParameter2.length() > 0) {
                    resp.errCode = C0626d.m2034c(queryParameter2);
                }
                resp.openId = uri.getQueryParameter("openid");
                resp.templateID = uri.getQueryParameter("template_id");
                resp.scene = C0626d.m2034c(uri.getQueryParameter("scene"));
                resp.action = uri.getQueryParameter("action");
                resp.reserved = uri.getQueryParameter("reserved");
                iWXAPIEventHandler.onResp(resp);
                return true;
            }
            if (queryParameter.contains("invoice_auth_insert")) {
                WXInvoiceAuthInsert.Resp resp2 = new WXInvoiceAuthInsert.Resp();
                String queryParameter3 = uri.getQueryParameter("ret");
                if (queryParameter3 != null && queryParameter3.length() > 0) {
                    resp2.errCode = C0626d.m2034c(queryParameter3);
                }
                resp2.wxOrderId = uri.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp(resp2);
                return true;
            }
            if (queryParameter.contains("payinsurance")) {
                WXPayInsurance.Resp resp3 = new WXPayInsurance.Resp();
                String queryParameter4 = uri.getQueryParameter("ret");
                if (queryParameter4 != null && queryParameter4.length() > 0) {
                    resp3.errCode = C0626d.m2034c(queryParameter4);
                }
                resp3.wxOrderId = uri.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp(resp3);
                return true;
            }
            if (queryParameter.contains("nontaxpay")) {
                WXNontaxPay.Resp resp4 = new WXNontaxPay.Resp();
                String queryParameter5 = uri.getQueryParameter("ret");
                if (queryParameter5 != null && queryParameter5.length() > 0) {
                    resp4.errCode = C0626d.m2034c(queryParameter5);
                }
                resp4.wxOrderId = uri.getQueryParameter("wx_order_id");
                iWXAPIEventHandler.onResp(resp4);
                return true;
            }
            if (!"subscribeminiprogrammsg".equals(queryParameter) && !"5".equals(queryParameter)) {
                Log.m2021e(TAG, "this open sdk version not support the request type");
                return false;
            }
            SubscribeMiniProgramMsg.Resp resp5 = new SubscribeMiniProgramMsg.Resp();
            String queryParameter6 = uri.getQueryParameter("ret");
            if (queryParameter6 != null && queryParameter6.length() > 0) {
                resp5.errCode = C0626d.m2034c(queryParameter6);
            }
            resp5.openId = uri.getQueryParameter("openid");
            resp5.unionId = uri.getQueryParameter("unionid");
            resp5.nickname = uri.getQueryParameter("nickname");
            resp5.errStr = uri.getQueryParameter("errmsg");
            iWXAPIEventHandler.onResp(resp5);
            return true;
        } catch (Exception e) {
            C10878.m25049(e, new StringBuilder("handleWxInternalRespType fail, ex = "), TAG);
        }
    }

    @Override // com.tencent.p062mm.opensdk.openapi.IWXAPI
    public boolean handleIntent(Intent intent, IWXAPIEventHandler iWXAPIEventHandler) {
        try {
            if (!WXApiImplComm.isIntentFromWx(intent, ConstantsAPI.Token.WX_TOKEN_VALUE_MSG)) {
                Log.m2022i(TAG, "handleIntent fail, intent not from weixin msg");
                return false;
            }
            if (this.detached) {
                throw new IllegalStateException("handleIntent fail, WXMsgImpl has been detached");
            }
            String stringExtra = intent.getStringExtra(ConstantsAPI.CONTENT);
            int intExtra = intent.getIntExtra(ConstantsAPI.SDK_VERSION, 0);
            String stringExtra2 = intent.getStringExtra(ConstantsAPI.APP_PACKAGE);
            if (stringExtra2 != null && stringExtra2.length() != 0) {
                if (!checkSumConsistent(intent.getByteArrayExtra(ConstantsAPI.CHECK_SUM), C0606b.m2007a(stringExtra, intExtra, stringExtra2))) {
                    Log.m2021e(TAG, "checksum fail");
                    return false;
                }
                int intExtra2 = intent.getIntExtra("_wxapi_command_type", 0);
                Log.m2022i(TAG, "handleIntent, cmd = ".concat(String.valueOf(intExtra2)));
                switch (intExtra2) {
                    case 1:
                        iWXAPIEventHandler.onResp(new SendAuth.Resp(intent.getExtras()));
                        return true;
                    case 2:
                        iWXAPIEventHandler.onResp(new SendMessageToWX.Resp(intent.getExtras()));
                        return true;
                    case 3:
                        iWXAPIEventHandler.onReq(new GetMessageFromWX.Req(intent.getExtras()));
                        return true;
                    case 4:
                        ShowMessageFromWX.Req req = new ShowMessageFromWX.Req(intent.getExtras());
                        String str = req.message.messageExt;
                        if (str != null && str.contains("wx_internal_resptype")) {
                            boolean zHandleWxInternalRespType = handleWxInternalRespType(str, iWXAPIEventHandler);
                            Log.m2022i(TAG, "handleIntent, extInfo contains wx_internal_resptype, ret = ".concat(String.valueOf(zHandleWxInternalRespType)));
                            return zHandleWxInternalRespType;
                        }
                        if (str != null && str.contains("openbusinesswebview")) {
                            try {
                                Uri uri = Uri.parse(str);
                                if (uri != null && "openbusinesswebview".equals(uri.getHost())) {
                                    WXOpenBusinessWebview.Resp resp = new WXOpenBusinessWebview.Resp();
                                    String queryParameter = uri.getQueryParameter("ret");
                                    if (queryParameter != null && queryParameter.length() > 0) {
                                        resp.errCode = C0626d.m2034c(queryParameter);
                                    }
                                    resp.resultInfo = uri.getQueryParameter("resultInfo");
                                    resp.errStr = uri.getQueryParameter("errmsg");
                                    String queryParameter2 = uri.getQueryParameter("type");
                                    if (queryParameter2 != null && queryParameter2.length() > 0) {
                                        resp.businessType = C0626d.m2034c(queryParameter2);
                                    }
                                    iWXAPIEventHandler.onResp(resp);
                                    return true;
                                }
                                Log.m2020d(TAG, "not openbusinesswebview %".concat(str));
                            } catch (Exception e) {
                                Log.m2021e(TAG, "parse fail, ex = " + e.getMessage());
                            }
                        }
                        iWXAPIEventHandler.onReq(req);
                        return true;
                    case 5:
                        iWXAPIEventHandler.onResp(new PayResp(intent.getExtras()));
                        return true;
                    case 6:
                        iWXAPIEventHandler.onReq(new LaunchFromWX.Req(intent.getExtras()));
                        return true;
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 13:
                    case 18:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 40:
                    default:
                        Log.m2021e(TAG, "unknown cmd = ".concat(String.valueOf(intExtra2)));
                        return false;
                    case 9:
                        iWXAPIEventHandler.onResp(new AddCardToWXCardPackage.Resp(intent.getExtras()));
                        return true;
                    case 12:
                        iWXAPIEventHandler.onResp(new OpenWebview.Resp(intent.getExtras()));
                        return true;
                    case 14:
                        iWXAPIEventHandler.onResp(new CreateChatroom.Resp(intent.getExtras()));
                        return true;
                    case 15:
                        iWXAPIEventHandler.onResp(new JoinChatroom.Resp(intent.getExtras()));
                        return true;
                    case 16:
                        iWXAPIEventHandler.onResp(new ChooseCardFromWXCardPackage.Resp(intent.getExtras()));
                        return true;
                    case 17:
                        iWXAPIEventHandler.onResp(new HandleScanResult.Resp(intent.getExtras()));
                        return true;
                    case 19:
                        iWXAPIEventHandler.onResp(new WXLaunchMiniProgram.Resp(intent.getExtras()));
                        return true;
                    case 24:
                        iWXAPIEventHandler.onResp(new JumpToOfflinePay.Resp(intent.getExtras()));
                        return true;
                    case 25:
                        iWXAPIEventHandler.onResp(new WXOpenBusinessWebview.Resp(intent.getExtras()));
                        return true;
                    case 26:
                        iWXAPIEventHandler.onResp(new WXOpenBusinessView.Resp(intent.getExtras()));
                        return true;
                    case 27:
                        iWXAPIEventHandler.onResp(new WXJointPay.JointPayResp(intent.getExtras()));
                        return true;
                    case 28:
                        iWXAPIEventHandler.onResp(new WXPreloadMiniProgram.Resp(intent.getExtras()));
                        return true;
                    case 29:
                        iWXAPIEventHandler.onResp(new WXLaunchMiniProgramWithToken.Resp(intent.getExtras()));
                        return true;
                    case 30:
                        iWXAPIEventHandler.onResp(new WXLaunchWxaRedirectingPage.Resp(intent.getExtras()));
                        return true;
                    case 31:
                        iWXAPIEventHandler.onResp(new SendTdiAuth.Resp(intent.getExtras()));
                        return true;
                    case 32:
                        iWXAPIEventHandler.onResp(new WXPreloadMiniProgramEnvironment.Resp(intent.getExtras()));
                        return true;
                    case 33:
                        iWXAPIEventHandler.onResp(new WXChannelShareVideo.Resp(intent.getExtras()));
                        return true;
                    case 34:
                        iWXAPIEventHandler.onResp(new WXChannelOpenProfile.Resp(intent.getExtras()));
                        return true;
                    case 35:
                        iWXAPIEventHandler.onResp(new WXChannelOpenLive.Resp(intent.getExtras()));
                        return true;
                    case 36:
                        iWXAPIEventHandler.onResp(new WXChannelOpenFeed.Resp(intent.getExtras()));
                        return true;
                    case 37:
                        iWXAPIEventHandler.onResp(new WXOpenCustomerServiceChat.Resp(intent.getExtras()));
                        return true;
                    case 38:
                        iWXAPIEventHandler.onResp(new WXQRCodePay.Resp(intent.getExtras()));
                        return true;
                    case 39:
                        iWXAPIEventHandler.onResp(new WXChannelStartLive.Resp(intent.getExtras()));
                        return true;
                    case 41:
                        iWXAPIEventHandler.onResp(new WXChannelOpenEvent.Resp(intent.getExtras()));
                        return true;
                    case 42:
                        iWXAPIEventHandler.onResp(new WXChannelBind.Resp(intent.getExtras()));
                        return true;
                    case 43:
                        iWXAPIEventHandler.onResp(new WXGetA8Key.Resp(intent.getExtras()));
                        return true;
                }
            }
            Log.m2021e(TAG, "invalid argument");
            return false;
        } catch (Exception e2) {
            C10878.m25049(e2, new StringBuilder("handleIntent fail, ex = "), TAG);
        }
    }
}
