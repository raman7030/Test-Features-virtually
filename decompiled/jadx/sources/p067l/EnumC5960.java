package p067l;

import com.umeng.analytics.pro.C0719o;

/* JADX INFO: renamed from: l.ۘۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4YN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5960 implements InterfaceC2940 {
    TYPE_HEADER_ITEM(0, "header_item"),
    TYPE_STRING_ID_ITEM(1, "string_id_item"),
    TYPE_TYPE_ID_ITEM(2, "type_id_item"),
    TYPE_PROTO_ID_ITEM(3, "proto_id_item"),
    TYPE_FIELD_ID_ITEM(4, "field_id_item"),
    TYPE_METHOD_ID_ITEM(5, "method_id_item"),
    TYPE_CLASS_DEF_ITEM(6, "class_def_item"),
    TYPE_CALL_SITE_ID_ITEM(7, "call_site_id_item"),
    TYPE_METHOD_HANDLE_ITEM(8, "method_handle_item"),
    TYPE_MAP_LIST(4096, "map_list"),
    TYPE_TYPE_LIST(C0719o.a.f2895a, "type_list"),
    TYPE_ANNOTATION_SET_REF_LIST(C0719o.a.f2896b, "annotation_set_ref_list"),
    TYPE_ANNOTATION_SET_ITEM(C0719o.a.f2897c, "annotation_set_item"),
    TYPE_CLASS_DATA_ITEM(8192, "class_data_item"),
    TYPE_CODE_ITEM(C0719o.a.f2911q, "code_item"),
    TYPE_STRING_DATA_ITEM(C0719o.a.f2912r, "string_data_item"),
    TYPE_DEBUG_INFO_ITEM(C0719o.a.f2913s, "debug_info_item"),
    TYPE_ANNOTATION_ITEM(C0719o.a.f2914t, "annotation_item"),
    TYPE_ENCODED_ARRAY_ITEM(C0719o.a.f2915u, "encoded_array_item"),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8198, "annotations_directory_item"),
    TYPE_MAP_ITEM(-1, "map_item"),
    TYPE_TYPE_ITEM(-1, "type_item"),
    TYPE_EXCEPTION_HANDLER_ITEM(-1, "exception_handler_item"),
    TYPE_ANNOTATION_SET_REF_ITEM(-1, "annotation_set_ref_item");


    /* JADX INFO: renamed from: ᩶ */
    public final String f14748;

    /* JADX INFO: renamed from: ᩸ */
    public final String f14749;

    /* JADX INFO: renamed from: ᩹ */
    public final int f14750;

    EnumC5960(int i, String str) {
        this.f14750 = i;
        this.f14748 = str;
        this.f14749 = (str.endsWith("_item") ? C17073.m38720(5, 0, str) : str).replace('_', ' ');
    }

    /* JADX INFO: renamed from: ۧ */
    public int m13371() {
        return this.f14750;
    }

    /* JADX INFO: renamed from: ᩻ */
    public String m13372() {
        return this.f14748;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public String mo4819() {
        return this.f14749;
    }
}
