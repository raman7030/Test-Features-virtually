package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.commonsdk.config.d */
/* JADX INFO: compiled from: NBLH */
/* JADX INFO: loaded from: classes.dex */
public class C0759d {

    /* JADX INFO: renamed from: a */
    public static final long f3060a = 1000;

    /* JADX INFO: renamed from: b */
    public static final String f3061b = "_LAST_FIELD";

    /* JADX INFO: renamed from: c */
    public static final String f3062c = "3749699455";

    /* JADX INFO: renamed from: d */
    public static final String f3063d = "2130669566";

    /* JADX INFO: renamed from: e */
    public static final String f3064e = "262139";

    /* JADX INFO: renamed from: f */
    public static final String f3065f = "1983";

    /* JADX INFO: renamed from: g */
    public static final int f3066g = 64;

    /* JADX INFO: renamed from: l */
    public static Map f3071l = new HashMap();

    /* JADX INFO: renamed from: h */
    public static String[] f3067h = new String[a.values().length];

    /* JADX INFO: renamed from: i */
    public static String[] f3068i = new String[b.values().length];

    /* JADX INFO: renamed from: j */
    public static String[] f3069j = new String[c.values().length];

    /* JADX INFO: renamed from: k */
    public static String[] f3070k = new String[d.values().length];

    /* JADX INFO: renamed from: com.umeng.commonsdk.config.d$a */
    /* JADX INFO: compiled from: NBLH */
    public enum a {
        header_utoken,
        header_cpu,
        header_mccmnc,
        header_sub_os_name,
        header_sub_os_version,
        header_device_type,
        header_device_id_imei,
        header_device_id_mac,
        header_device_id_android_id,
        header_device_id_serialNo,
        header_bulid,
        header_os_version,
        header_resolution,
        header_mc,
        header_timezone,
        header_local_info,
        header_carrier,
        header_access,
        header_tracking_imei,
        header_tracking_android_id,
        header_tracking_utdid,
        header_tracking_idmd5,
        header_tracking_idfa,
        header_tracking_mac,
        header_tracking_serial,
        header_tracking_uuid,
        header_tracking_uop,
        header_tracking_oldumid,
        header_tracking_newumid,
        header_ekv_send_on_exit,
        header_device_oaid,
        header_local_ip,
        header_foreground_count,
        header_first_resume,
        header_sub_os_info,
        _LAST_FIELD
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.config.d$b */
    /* JADX INFO: compiled from: NBLH */
    public enum b {
        inner_rs,
        inner_by,
        inner_gp,
        inner_to,
        inner_mo,
        inner_ca,
        inner_fl,
        inner_gdf_r,
        inner_thm_z,
        inner_dsk_s,
        inner_sd,
        inner_build,
        inner_sr,
        inner_scr,
        inner_sinfo,
        inner_winfo,
        inner_input,
        inner_bt,
        inner_mem,
        inner_cpu,
        inner_rom,
        inner_bstn,
        inner_cam,
        inner_appls,
        inner_lbs,
        internal_run_server,
        internal_imsi,
        internal_meid,
        tp_tp,
        inner_imei2,
        inner_iccid,
        inner_batt2,
        inner_build2,
        inner_cpu2,
        _LAST_FIELD
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.config.d$c */
    /* JADX INFO: compiled from: NBLH */
    public enum c {
        push_cpu,
        push_imei,
        push_mac,
        push_android_id,
        push_serialNo,
        push_settings_android_id,
        push_network_access_mode,
        push_on_line,
        push_time_zone,
        push_locale_info,
        push_resolution,
        push_operator,
        push_utdid,
        push_service_work,
        push_service_name,
        push_intent_exist,
        push_data_data,
        push_notification_enabled,
        _LAST_FIELD
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.config.d$d */
    /* JADX INFO: compiled from: NBLH */
    public enum d {
        share_device_id,
        share_imsi,
        share_iccid,
        share_sn,
        share_net_accmode,
        share_android_id,
        share_wifi_mac,
        share_sd_size,
        share_ssid,
        share_resolution,
        share_conn_type,
        _LAST_FIELD
    }

    static {
        String[] strArr = f3067h;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < a.values().length; i++) {
                f3067h[i] = a.values()[i].toString();
            }
            Map map = f3071l;
            if (map != null) {
                map.put(a.class.getName(), f3067h);
            }
        }
        String[] strArr2 = f3068i;
        if (strArr2 != null && strArr2.length > 0) {
            for (int i2 = 0; i2 < b.values().length; i2++) {
                f3068i[i2] = b.values()[i2].toString();
            }
            Map map2 = f3071l;
            if (map2 != null) {
                map2.put(b.class.getName(), f3068i);
            }
        }
        String[] strArr3 = f3069j;
        if (strArr3 != null && strArr3.length > 0) {
            for (int i3 = 0; i3 < c.values().length; i3++) {
                f3069j[i3] = c.values()[i3].toString();
            }
            Map map3 = f3071l;
            if (map3 != null) {
                map3.put(c.class.getName(), f3069j);
            }
        }
        String[] strArr4 = f3070k;
        if (strArr4 == null || strArr4.length <= 0) {
            return;
        }
        for (int i4 = 0; i4 < d.values().length; i4++) {
            f3070k[i4] = d.values()[i4].toString();
        }
        Map map4 = f3071l;
        if (map4 != null) {
            map4.put(d.class.getName(), f3070k);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2747a(String str) {
        return (str == null || str.length() <= 0 || f3061b.equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String[] m2748b(String str) {
        if (str == null || str.length() <= 0 || !f3071l.containsKey(str)) {
            return null;
        }
        return (String[]) f3071l.get(str);
    }
}
