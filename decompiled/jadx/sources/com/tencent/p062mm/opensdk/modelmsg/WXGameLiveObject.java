package com.tencent.p062mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.utils.C0626d;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class WXGameLiveObject implements WXMediaMessage.IMediaObject {
    public static final String TAG = "MicroMsg.SDK.WXGameObject";
    public HashMap extraInfoMap = new HashMap();

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public boolean checkArgs() {
        return true;
    }

    public String getExtra(String str, String str2) {
        HashMap map = this.extraInfoMap;
        if (map == null) {
            return null;
        }
        String str3 = (String) map.get(str);
        return str3 != null ? str3 : str2;
    }

    public void putExtra(String str, String str2) {
        if (this.extraInfoMap == null) {
            this.extraInfoMap = new HashMap();
        }
        if (C0626d.m2033b(str)) {
            return;
        }
        this.extraInfoMap.put(str, str2);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        HashMap map = this.extraInfoMap;
        if (map != null) {
            bundle.putSerializable("_wxgame_extrainfo", map);
        }
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public int type() {
        return 70;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        this.extraInfoMap = (HashMap) bundle.getSerializable("_wxgame_extrainfo");
    }
}
