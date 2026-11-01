package p067l;

import com.umeng.analytics.pro.C0719o;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܶۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4YN */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC16617 {
    TYPE_HEADER_ITEM(0, 17, 4, "header_item"),
    TYPE_STRING_ID_ITEM(1, 0, 4, "string_id_item"),
    TYPE_TYPE_ID_ITEM(2, 1, 4, "type_id_item"),
    TYPE_PROTO_ID_ITEM(3, 2, 4, "proto_id_item"),
    TYPE_FIELD_ID_ITEM(4, 3, 4, "field_id_item"),
    TYPE_METHOD_ID_ITEM(5, 4, 4, "method_id_item"),
    TYPE_CLASS_DEF_ITEM(6, 5, 4, "class_def_item"),
    TYPE_MAP_LIST(4096, 16, 4, "map_list"),
    TYPE_TYPE_LIST(C0719o.a.f2895a, 6, 4, "type_list"),
    TYPE_ANNOTATION_SET_REF_LIST(C0719o.a.f2896b, 7, 4, "annotation_set_ref_list"),
    TYPE_ANNOTATION_SET_ITEM(C0719o.a.f2897c, 8, 4, "annotation_set_item"),
    TYPE_CLASS_DATA_ITEM(8192, 9, 1, "class_data_item"),
    TYPE_CODE_ITEM(C0719o.a.f2911q, 10, 4, "code_item"),
    TYPE_STRING_DATA_ITEM(C0719o.a.f2912r, 11, 1, "string_data_item"),
    TYPE_DEBUG_INFO_ITEM(C0719o.a.f2913s, 12, 1, "debug_info_item"),
    TYPE_ANNOTATION_ITEM(C0719o.a.f2914t, 13, 1, "annotation_item"),
    TYPE_ENCODED_ARRAY_ITEM(C0719o.a.f2915u, 14, 1, "encoded_array_item"),
    TYPE_ANNOTATIONS_DIRECTORY_ITEM(8198, 15, 4, "annotations_directory_item");


    /* JADX INFO: renamed from: ۡ֫ */
    public static final TreeMap f48837 = new TreeMap();

    /* JADX INFO: renamed from: ۙ */
    public final String f48852;

    /* JADX INFO: renamed from: ᩶ */
    public final int f48853;

    /* JADX INFO: renamed from: ᩸ */
    public final int f48854;

    /* JADX INFO: renamed from: ᩹ */
    public final int f48855;

    static {
        for (EnumC16617 enumC16617 : values()) {
            f48837.put(Integer.valueOf(enumC16617.f48855), enumC16617);
        }
    }

    EnumC16617(int i, int i2, int i3, String str) {
        this.f48855 = i;
        this.f48853 = i2;
        this.f48854 = i3;
        this.f48852 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC16617 m37675(int i) {
        return (EnumC16617) f48837.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m37677() {
        return this.f48855 <= 4096;
    }
}
