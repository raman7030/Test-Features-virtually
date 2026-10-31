package l;

import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ۘۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4YN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC3779 implements InterfaceC0601 {
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
    TYPE_TYPE_LIST(o.a.a, "type_list"),
    TYPE_ANNOTATION_SET_REF_LIST(o.a.b, "annotation_set_ref_list"),
    TYPE_ANNOTATION_SET_ITEM(o.a.c, "annotation_set_item"),
    TYPE_CLASS_DATA_ITEM(8192, "class_data_item"),
    TYPE_CODE_ITEM(o.a.q, "code_item"),
    TYPE_STRING_DATA_ITEM(o.a.r, "string_data_item"),
    TYPE_DEBUG_INFO_ITEM(o.a.s, "debug_info_item"),
    TYPE_ANNOTATION_ITEM(o.a.t, "annotation_item"),
    TYPE_ENCODED_ARRAY_ITEM(o.a.u, "encoded_array_item"),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8198, "annotations_directory_item"),
    TYPE_MAP_ITEM(-1, "map_item"),
    TYPE_TYPE_ITEM(-1, "type_item"),
    TYPE_EXCEPTION_HANDLER_ITEM(-1, "exception_handler_item"),
    TYPE_ANNOTATION_SET_REF_ITEM(-1, "annotation_set_ref_item");


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f11942;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f11943;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11944;

    EnumC3779(int i, String str) {
        this.f11944 = i;
        this.f11942 = str;
        this.f11943 = (str.endsWith("_item") ? C15472.m36561(5, 0, str) : str).replace('_', ' ');
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m11435() {
        return this.f11944;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String m11436() {
        return this.f11942;
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public String mo2463() {
        return this.f11943;
    }
}
