package com.tencent.p062mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import com.tencent.p062mm.opensdk.utils.C0626d;
import com.tencent.p062mm.opensdk.utils.Log;
import p067l.C10878;
import p067l.C5410;

/* JADX INFO: loaded from: classes.dex */
public class WXChannelShareVideo {

    public class Resp extends BaseResp {
        public String extMsg;

        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString(WXChannelBind.Resp.KEY_EXT_MSG);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 33;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(WXChannelBind.Resp.KEY_EXT_MSG, this.extMsg);
        }
    }

    public class Req extends BaseReq {
        public static final int LENGTH_LIMIT = 1024;
        public static final String TAG = "MicroMsg.SDK.WXChannelShareVideo.Req";
        public static final String WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER = "_wxapi_channel_share_video_jump_info_identifier";
        public String extData;
        public IWXChannelJumpInfo jumpInfo;
        public String videoPath;

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str;
            if (C0626d.m2033b(this.videoPath)) {
                str = "videoPath is null";
            } else {
                IWXChannelJumpInfo iWXChannelJumpInfo = this.jumpInfo;
                if (iWXChannelJumpInfo == null || iWXChannelJumpInfo.checkArgs()) {
                    return true;
                }
                str = "checkArgs fail, jumpInfo is invalid";
            }
            Log.m2021e(TAG, str);
            return false;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 33;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_share_video_path", this.videoPath);
            bundle.putString("_wxapi_finder_share_video_extData", this.extData);
            IWXChannelJumpInfo iWXChannelJumpInfo = this.jumpInfo;
            if (iWXChannelJumpInfo != null) {
                bundle.putString(WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER, iWXChannelJumpInfo.getClass().getName());
                this.jumpInfo.serialize(bundle);
            }
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.videoPath = bundle.getString("_wxapi_finder_share_video_path");
            this.extData = bundle.getString("_wxapi_finder_share_video_extData");
            String string = bundle.getString(WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER);
            if (string != null) {
                try {
                    IWXChannelJumpInfo iWXChannelJumpInfo = (IWXChannelJumpInfo) Class.forName(string).newInstance();
                    this.jumpInfo = iWXChannelJumpInfo;
                    iWXChannelJumpInfo.unserialize(bundle);
                } catch (Exception e) {
                    C10878.m25049(e, C5410.m11879("get WXChannelJumpInfo from bundle failed: unknown ident ", string, ", ex = "), TAG);
                }
            }
        }
    }
}
