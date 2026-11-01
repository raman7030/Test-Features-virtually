package com.tencent.p062mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import com.tencent.p062mm.opensdk.utils.C0626d;
import com.tencent.p062mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes.dex */
public class WXChannelStartLive {

    public class Req extends BaseReq {
        public static final String TAG = "MicroMsg.SDK.WXChannelStartLive.Req";
        public String liveJsonInfo;

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            if (!C0626d.m2033b(this.liveJsonInfo)) {
                return true;
            }
            Log.m2021e(TAG, "liveInfoData is null");
            return false;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.liveJsonInfo = bundle.getString("_wxapi_finder_start_live_info_data");
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 39;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_start_live_info_data", this.liveJsonInfo);
        }
    }

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
            return 39;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(WXChannelBind.Resp.KEY_EXT_MSG, this.extMsg);
        }
    }
}
