.class public final Ll/۠ܳۜ;
.super Ljava/lang/Object;
.source "S79P"


# static fields
.field public static final ֫:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "native_strings"

    const-string v1, "resource_table_file_paths"

    const-string v2, "smali"

    const-string v3, "native_symbols"

    .line 20
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۠ܳۜ;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 6

    const-string v0, "mt_apk_continue"

    const-string v1, "mt_apk_workspace_open"

    .line 703
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    .line 710
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    if-nez p0, :cond_0

    goto :goto_2

    .line 714
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/json/JSONValue;

    .line 715
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "tool"

    const/4 v4, 0x0

    .line 727
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x2

    if-ge v4, v5, :cond_1

    .line 728
    aget-object v5, v0, v4

    .line 729
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 717
    new-instance v3, Lbin/mt/json/JSONObject;

    invoke-direct {v3, v2}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    invoke-virtual {v1, v3}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-object v1
.end method

.method public static ֫()Lbin/mt/json/JSONObject;
    .locals 12

    .line 754
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this list result."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 755
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this list result; pass this value together with data.workspaceId to mt_apk_read_text, mt_apk_read_bytes, mt_apk_resource_read, or mt_apk_dex_read_class_outline."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 756
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "List view that produced this result."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "view"

    .line 757
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Actual prefix filter; empty string means no filter."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "prefix"

    .line 758
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "description"

    const-string v3, "Current page items. Use item locators with data.workspaceId and data.editSessionId for follow-up calls; for dex_class items, pass the full locator to mt_apk_dex_read_class_outline.locator. For resource items, mt_apk_resource_read needs reads[0].locator, reads[0].variant, and required budget fields; use previewValue.variant when it is non-null."

    const-string v4, "type"

    const-string v5, "array"

    .line 0
    invoke-static {v4, v5, v2, v3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 855
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 862
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "zip_entry locator. Pass data.workspaceId, data.editSessionId, and this locator to mt_apk_read_text or mt_apk_read_bytes."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "locator"

    .line 863
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "integer"

    const-string v9, "ZIP entry size in bytes, or null when an edited AXML overlay has not been encoded yet."

    .line 117
    invoke-static {v7, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "size"

    .line 864
    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 869
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "Resource locator."

    .line 96
    invoke-static {v1, v10}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "resourceLocator"

    .line 870
    invoke-virtual {v9, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "Resource name."

    .line 96
    invoke-static {v1, v10}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "resourceName"

    .line 871
    invoke-virtual {v9, v11, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "Resource table entry whose value points to this ZIP entry."

    .line 869
    invoke-static {v9, v10}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 865
    invoke-static {v9}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "referencedByResource"

    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "One ZIP entry item."

    .line 862
    invoke-static {v6, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 856
    invoke-virtual {v5, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 875
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "dex_class locator. To call mt_apk_dex_read_class_outline, pass data.workspaceId, data.editSessionId, and this full locator."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 876
    invoke-virtual {v6, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "Java-style class name."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "javaName"

    .line 877
    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "Field count for this class."

    .line 110
    invoke-static {v7, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "fieldCount"

    .line 878
    invoke-virtual {v6, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "methodCount"

    const-string v10, "Method count for this class."

    const-string v11, "One dex class item."

    .line 0
    invoke-static {v6, v7, v10, v9, v11}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 857
    invoke-virtual {v5, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 883
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "resource locator. To read a value, call mt_apk_resource_read with data.workspaceId, data.editSessionId, reads[0].locator set to this locator, reads[0].variant set to previewValue.variant when non-null, and all required budget fields."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 884
    invoke-virtual {v6, v8, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "Resource table type name."

    .line 96
    invoke-static {v1, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 885
    invoke-virtual {v6, v4, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Resource entry name."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "name"

    .line 886
    invoke-virtual {v4, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Number of real variants for this resource."

    .line 110
    invoke-static {v7, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "variantCount"

    .line 887
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "item_list"

    const-string v7, "mixed"

    const-string v8, "single_value"

    filled-new-array {v8, v6, v7}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "List-only value shape."

    .line 888
    invoke-static {v7, v6}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "valueShape"

    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 894
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Preview variant."

    .line 103
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "variant"

    .line 895
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Preview value kind, or null."

    .line 896
    invoke-static {v7}, Ll/۠ܳۜ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "valueKind"

    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Plain value snippet up to 300 chars, or null."

    .line 103
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "valueSnippet"

    .line 897
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "boolean"

    const-string v8, "Whether the preview value is styled."

    .line 124
    invoke-static {v7, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "styled"

    .line 898
    invoke-virtual {v6, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v8, "Whether the preview snippet was truncated."

    .line 124
    invoke-static {v7, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "truncated"

    .line 899
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "ZIP entry locator for file_path values, or null."

    .line 103
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "fileLocator"

    .line 900
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Resource locator for reference/attribute values, or null."

    .line 103
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v7, "targetLocator"

    .line 901
    invoke-virtual {v6, v7, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "Lightweight resource value preview."

    .line 894
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 890
    invoke-static {v1}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v6, "previewValue"

    invoke-virtual {v4, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "One resource table entry item."

    .line 883
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 858
    invoke-virtual {v5, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v1

    const-string v4, "anyOf"

    .line 855
    invoke-virtual {v3, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "items"

    invoke-virtual {v2, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 759
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value."

    const-string v2, "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."

    const-string v3, "Number of items returned on this page."

    .line 1200
    invoke-static {v3, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 760
    invoke-static {v1}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful mt_apk_list data."

    .line 754
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 55
    invoke-static {}, Ll/۫ܳۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "continue"

    .line 1222
    invoke-static {}, Ll/ۧᩳܽ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "mt_apk_continue"

    .line 1221
    invoke-static {v3, v4, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "retry"

    .line 1224
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "mt_apk_workspace_open"

    .line 1223
    invoke-static {v4, v5, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "verify_workspace"

    .line 1226
    invoke-static {}, Ll/ۧᩳܽ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_list"

    .line 1225
    invoke-static {v5, v6, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const/4 v5, 0x3

    new-array v5, v5, [Lbin/mt/json/JSONObject;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    const/4 v2, 0x2

    aput-object v4, v5, v2

    const-string v2, "Executable continue or recovery actions; copy arguments directly."

    .line 1220
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_list. data.items[] contains ZIP entries, dex classes, or resource table entries with locators. Pass data.workspaceId and data.editSessionId with follow-up calls; for resource items, mt_apk_resource_read needs reads[0].locator, reads[0].variant from previewValue.variant, and required budget fields; for dex_class items, pass the full locator to mt_apk_dex_read_class_outline.locator. nextActions carries continuation or recovery calls."

    .line 54
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 13

    .line 86
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    const/4 v2, 0x0

    .line 87
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "temporary"

    const/4 v3, 0x0

    .line 88
    invoke-virtual {p0, v1, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "apkFileName"

    .line 89
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "packageName"

    .line 90
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "versionName"

    .line 91
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "versionCode"

    .line 92
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-static {v4}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "minSdk"

    .line 93
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-static {v4}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "targetSdk"

    .line 94
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-static {v4}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "appLabel"

    .line 95
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "counts"

    .line 96
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_0

    .line 225
    sget-object v4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    .line 227
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "zipEntries"

    .line 228
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "dexEntries"

    .line 229
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "xmlEntries"

    .line 230
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "classes"

    .line 231
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 96
    :goto_0
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "capabilities"

    .line 97
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_1

    .line 239
    sget-object v4, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_1

    .line 241
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "canReadAxml"

    .line 242
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "canSearchDexNames"

    .line 243
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "canSearchDexStrings"

    .line 244
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "canReadResourceTable"

    .line 245
    invoke-virtual {v4, v6, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 97
    :goto_1
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "signature"

    .line 98
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "error"

    const-string v6, "certificates"

    const-string v7, "hasDifferentCertificates"

    const-string v8, "signaturePresent"

    const-string v9, "available"

    const-string v10, "schemes"

    if-nez v4, :cond_2

    .line 253
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 254
    invoke-virtual {v4, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 255
    invoke-virtual {v4, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 256
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    invoke-virtual {v4, v10, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 257
    invoke-virtual {v4, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 258
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    invoke-virtual {v3, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Signature summary is unavailable."

    .line 259
    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    goto :goto_4

    .line 261
    :cond_2
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 262
    invoke-virtual {v4, v9, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v12

    invoke-virtual {v11, v9, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 263
    invoke-virtual {v4, v8, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    invoke-virtual {v9, v8, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 264
    invoke-virtual {v4, v10}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v9

    invoke-static {v9}, Ll/۠ܳۜ;->ۧ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v9

    invoke-virtual {v8, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 265
    invoke-virtual {v4, v7, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v8, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 266
    invoke-virtual {v4, v6}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v7

    .line 274
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    if-nez v7, :cond_3

    goto :goto_3

    .line 278
    :cond_3
    invoke-virtual {v7}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lbin/mt/json/JSONValue;

    .line 279
    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 280
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 281
    invoke-virtual {v9, v10}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v12

    invoke-static {v12}, Ll/۠ܳۜ;->ۧ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v12

    invoke-virtual {v11, v10, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v12, "sha256"

    .line 282
    invoke-virtual {v9, v12, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v12, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 280
    invoke-virtual {v8, v9}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_2

    .line 266
    :cond_4
    :goto_3
    invoke-virtual {v3, v6, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 267
    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 98
    :goto_4
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resourceTableSummaryError"

    .line 99
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    .line 100
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {v0, p0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 13

    const-string v11, "null_value"

    const-string v12, "unparsed"

    const-string v0, "text"

    const-string v1, "styled_text"

    const-string v2, "number"

    const-string v3, "boolean"

    const-string v4, "color"

    const-string v5, "dimension"

    const-string v6, "fraction"

    const-string v7, "reference"

    const-string v8, "attribute"

    const-string v9, "file_path"

    const-string v10, "item_list"

    .line 1194
    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 210
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    iget-object v1, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {v1}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V
    .locals 5

    const-string v0, "matchOffsets"

    .line 571
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    .line 624
    sget-object p1, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    .line 626
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, ""

    const-string v3, "text"

    .line 627
    invoke-virtual {p1, v3, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "textStartOffset"

    const/4 v3, 0x0

    .line 628
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "textTruncated"

    .line 629
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "start"

    .line 630
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "end"

    .line 631
    invoke-virtual {p1, v2, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 571
    :goto_0
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 4

    const-string v0, "string"

    const-string v1, "SO-local virtual address as lowercase 0x hex, or null."

    .line 103
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "virtualAddress"

    .line 1077
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "SO-local file offset as lowercase 0x hex, or null."

    .line 103
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "fileOffset"

    .line 1078
    invoke-virtual {p0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "integer"

    const-string v2, "Decimal byteOffset safe to pass to mt_apk_read_bytes, or null when unavailable or outside the integer range."

    .line 117
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "readBytesByteOffset"

    .line 1079
    invoke-virtual {p0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v2, "Non-negative. "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 110
    invoke-static {v1, p1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "byteSize"

    .line 1080
    invoke-virtual {p0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "virtual"

    const-string v1, "file_offset"

    filled-new-array {p1, v1}, [Ljava/lang/String;

    move-result-object p1

    const-string v1, "addressKind to pass to mt_apk_native_xref, or null when xref is not directly available."

    .line 1081
    invoke-static {v1, p1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v1, "xrefAddressKind"

    invoke-virtual {p0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string p1, "Address string to pass to mt_apk_native_xref, or null when unavailable."

    .line 103
    invoke-static {v0, p1}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "xrefAddress"

    .line 1083
    invoke-virtual {p0, v0, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    return-void
.end method

.method public static varargs ֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V
    .locals 4

    if-eqz p0, :cond_2

    .line 581
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    .line 582
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 583
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Native search nativeLocation is missing "

    .line 0
    invoke-static {p1, v2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 583
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void

    .line 579
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Native search hit is missing nativeLocation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;
    .locals 3

    .line 291
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    if-nez p0, :cond_0

    goto :goto_1

    .line 295
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    if-eqz v1, :cond_1

    .line 296
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 297
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ۧ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 1088
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Continuous window of the actual searched candidate, including decoded text or normalized name aliases. Limited to 240 Unicode code points and the response preview budget; may be empty when that budget is exhausted. For native follow-up calls use hit.nativeLocation, not this preview."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "text"

    .line 1089
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "integer"

    const-string v2, "Start offset of text in the original candidate."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "textStartOffset"

    .line 1090
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Whether text omits any part of the original candidate, including response budget truncation."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "textTruncated"

    .line 1091
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Inclusive match start in the original candidate."

    .line 110
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "start"

    .line 1092
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "end"

    const-string v3, "Exclusive match end in the original candidate; may exceed textStartOffset plus text length when truncated."

    const-string v4, "Match offsets and a bounded candidate text window when includeMatchOffsets=true. All offsets are zero-based UTF-16 positions in the original searched candidate, not byte offsets or edit ranges. Subtract textStartOffset from start/end to locate the match within text; a truncated window may omit part or all of the match."

    .line 0
    invoke-static {v0, v1, v3, v2, v4}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 31

    move-object/from16 v0, p0

    .line 140
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    const/4 v3, 0x0

    .line 141
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "editSessionId"

    const-string v4, ""

    .line 142
    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "data"

    .line 143
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 419
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    const-string v6, "searchScope"

    if-nez v2, :cond_1

    :cond_0
    move-object/from16 v17, v1

    move-object v1, v5

    move-object/from16 v18, v6

    goto/16 :goto_9

    .line 423
    :cond_1
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbin/mt/json/JSONValue;

    .line 424
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 425
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "locator"

    .line 426
    invoke-virtual {v7, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-static {v10}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 427
    invoke-virtual {v7, v6, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "hit"

    .line 428
    invoke-virtual {v7, v9}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    if-nez v7, :cond_2

    .line 484
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    :cond_2
    const-string v10, "kind"

    .line 486
    invoke-virtual {v7, v10, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v11, "zip_entry_path"

    .line 551
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    const-string v13, "native_string"

    const-string v14, "native_symbol_name"

    const-string v15, "smali_text"

    move-object/from16 v16, v2

    const-string v2, "dex_string_matches"

    move-object/from16 v17, v11

    const-string v11, "resource_table_value"

    move-object/from16 v18, v6

    const-string v6, "resource_table_name"

    const-string v0, "axml_text"

    if-nez v12, :cond_4

    .line 552
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 553
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 554
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "dex_class_name"

    .line 555
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "dex_field_name"

    .line 556
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "dex_method_name"

    .line 557
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 558
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 559
    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 560
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    .line 561
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_1

    :cond_3
    move-object/from16 v3, v17

    :cond_4
    :goto_1
    const-string v12, "matchKind"

    move-object/from16 v17, v1

    const/4 v1, 0x0

    .line 487
    invoke-virtual {v7, v12, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v10, v3, v12, v1}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 491
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v12, "snippet"

    if-nez v0, :cond_10

    invoke-virtual {v15, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_7

    .line 496
    :cond_5
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v6, "type"

    const-string v15, "matchField"

    move-object/from16 v19, v5

    const-string v5, "name"

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    .line 497
    invoke-virtual {v7, v15, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    const-string v2, "id"

    .line 499
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v2, "resource_id"

    goto :goto_2

    :cond_6
    move-object v2, v5

    .line 501
    :cond_7
    :goto_2
    invoke-virtual {v7, v6, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 502
    invoke-virtual {v7, v5, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 503
    invoke-virtual {v0, v15, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 504
    invoke-static {v10, v7}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    goto/16 :goto_6

    :cond_8
    const/4 v0, 0x0

    .line 505
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 506
    invoke-virtual {v7, v6, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v6, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 507
    invoke-virtual {v7, v5, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "variant"

    .line 508
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "valueKind"

    .line 509
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "valueSnippet"

    .line 510
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "styled"

    const/4 v3, 0x0

    .line 511
    invoke-virtual {v7, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "truncated"

    .line 512
    invoke-virtual {v7, v2, v3}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 513
    invoke-virtual {v7, v15, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v15, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "fileLocator"

    .line 514
    invoke-virtual {v7, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "targetLocator"

    .line 515
    invoke-virtual {v7, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "itemKey"

    .line 516
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "itemValueKind"

    .line 517
    invoke-virtual {v7, v2, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "itemKeyLocator"

    .line 518
    invoke-virtual {v7, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-static {v2}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 519
    invoke-static {v10, v7}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    goto/16 :goto_6

    .line 520
    :cond_9
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 521
    invoke-virtual {v7, v12, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 522
    invoke-static {v10, v7}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    const-string v0, "matchCount"

    const/4 v1, 0x0

    .line 523
    invoke-virtual {v7, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v10, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "matchedStrings"

    .line 524
    invoke-virtual {v7, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 650
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v2, :cond_a

    goto :goto_5

    .line 654
    :cond_a
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONValue;

    .line 655
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 656
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "text"

    const/4 v12, 0x0

    .line 657
    invoke-virtual {v5, v11, v12}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "textStartOffset"

    const/4 v12, 0x0

    .line 658
    invoke-virtual {v5, v11, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v6, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "textTruncated"

    .line 659
    invoke-virtual {v5, v11, v12}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v13

    invoke-virtual {v6, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v11, "matchOffsets"

    .line 660
    invoke-virtual {v5, v11}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_b

    .line 639
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_4

    .line 641
    :cond_b
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "start"

    .line 642
    invoke-virtual {v5, v14, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v15

    invoke-virtual {v13, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v13

    const-string v14, "end"

    .line 643
    invoke-virtual {v5, v14, v12}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v13, v14, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 660
    :goto_4
    invoke-virtual {v6, v11, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 656
    invoke-virtual {v3, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_3

    :cond_c
    :goto_5
    const/4 v2, 0x0

    .line 524
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "matchedStringsTruncated"

    .line 525
    invoke-virtual {v7, v1, v2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    :goto_6
    move-object/from16 v20, v8

    goto/16 :goto_8

    .line 526
    :cond_d
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "xrefAddress"

    const-string v2, "xrefAddressKind"

    const-string v6, "byteSize"

    const-string v11, "readBytesByteOffset"

    const-string v14, "fileOffset"

    const-string v15, "virtualAddress"

    move-object/from16 v20, v8

    const-string v8, "nativeLocation"

    if-eqz v0, :cond_e

    const/4 v0, 0x0

    .line 527
    invoke-virtual {v7, v12, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 528
    invoke-static {v10, v7}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    .line 530
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v29, "xrefAddressKind"

    const-string v30, "xrefAddress"

    const-string v21, "itemKind"

    const-string v22, "name"

    const-string v23, "demangledName"

    const-string v24, "imported"

    const-string v25, "virtualAddress"

    const-string v26, "fileOffset"

    const-string v27, "readBytesByteOffset"

    const-string v28, "byteSize"

    filled-new-array/range {v21 .. v30}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 593
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "itemKind"

    .line 594
    invoke-virtual {v0, v7, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v7, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 595
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "demangledName"

    .line 596
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "imported"

    const/4 v7, 0x0

    .line 597
    invoke-virtual {v0, v5, v7}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v5, 0x0

    .line 598
    invoke-virtual {v0, v15, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v15, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 599
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v14, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 600
    invoke-virtual {v0, v11}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v7}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v3, v11, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-wide/16 v11, 0x0

    .line 601
    invoke-virtual {v0, v6, v11, v12}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    invoke-virtual {v3, v6, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 602
    invoke-virtual {v0, v2, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 603
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 529
    invoke-virtual {v10, v8, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto/16 :goto_8

    :cond_e
    const/4 v0, 0x0

    .line 534
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 535
    invoke-virtual {v7, v12, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 536
    invoke-static {v10, v7}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    .line 538
    invoke-virtual {v7, v8}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v25, "xrefAddressKind"

    const-string v26, "xrefAddress"

    const-string v21, "virtualAddress"

    const-string v22, "fileOffset"

    const-string v23, "readBytesByteOffset"

    const-string v24, "byteSize"

    filled-new-array/range {v21 .. v26}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;[Ljava/lang/String;)V

    .line 610
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v5, 0x0

    .line 611
    invoke-virtual {v0, v15, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v15, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 612
    invoke-virtual {v0, v14, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v14, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 613
    invoke-virtual {v0, v11}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v7}, Ll/֨ۙ᩵;->ᩳ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v3, v11, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-wide/16 v11, 0x0

    .line 614
    invoke-virtual {v0, v6, v11, v12}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v11

    invoke-virtual {v3, v6, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 615
    invoke-virtual {v0, v2, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v2, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 616
    invoke-virtual {v0, v1, v5}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 537
    invoke-virtual {v10, v8, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_8

    .line 542
    :cond_f
    invoke-static {v10, v7}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    goto :goto_8

    :cond_10
    :goto_7
    move-object/from16 v19, v5

    move-object/from16 v20, v8

    const/4 v0, 0x0

    .line 492
    invoke-virtual {v7, v12, v0}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v12, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "line"

    const/4 v2, 0x0

    .line 493
    invoke-virtual {v7, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "column"

    .line 494
    invoke-virtual {v7, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 495
    invoke-static {v10, v7}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V

    :goto_8
    move-object/from16 v0, v20

    .line 428
    invoke-virtual {v0, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, v19

    .line 425
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    const/4 v3, 0x0

    move-object/from16 v0, p0

    move-object v5, v1

    move-object/from16 v2, v16

    move-object/from16 v1, v17

    move-object/from16 v6, v18

    goto/16 :goto_0

    :goto_9
    const/4 v0, 0x0

    const-string v2, "hits"

    move-object/from16 v3, v17

    .line 143
    invoke-virtual {v3, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "filterHint"

    move-object/from16 v3, p0

    .line 144
    invoke-virtual {v3, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "code"

    const-string v7, "message"

    if-nez v5, :cond_11

    .line 0
    invoke-static {v6, v4, v7, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    goto :goto_a

    .line 453
    :cond_11
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 454
    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 455
    invoke-virtual {v5, v7, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 144
    :goto_a
    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "searchTarget"

    .line 145
    invoke-virtual {v3, v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 437
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    const-string v5, "overview"

    .line 438
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_c

    :cond_12
    :goto_b
    const/4 v2, 0x4

    if-ge v0, v2, :cond_13

    .line 441
    sget-object v2, Ll/۠ܳۜ;->֫:[Ljava/lang/String;

    aget-object v2, v2, v0

    .line 442
    invoke-virtual {v4, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_13
    :goto_c
    const-string v0, "notSearchedTargets"

    .line 145
    invoke-virtual {v1, v0, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "skippedScopeErrors"

    .line 146
    invoke-virtual {v3, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 669
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    if-nez v1, :cond_14

    goto :goto_e

    .line 673
    :cond_14
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONValue;

    .line 674
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 675
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const/4 v8, 0x0

    move-object/from16 v9, v18

    .line 676
    invoke-virtual {v4, v9, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v9, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v10, "errorCode"

    .line 677
    invoke-virtual {v4, v10, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v6, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 678
    invoke-virtual {v4, v7, v8}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 675
    invoke-virtual {v2, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_d

    :cond_15
    :goto_e
    const-string v1, "skippedScopes"

    .line 146
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pagination"

    .line 147
    invoke-virtual {v3, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    .line 148
    invoke-virtual {v3, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v1}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 217
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    iget-object v1, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    invoke-static {v1}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ()Lbin/mt/json/JSONObject;
    .locals 32

    .line 779
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this search result."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 780
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this search result; pass this value together with data.workspaceId for follow-up reads, native follow-up tools, mt_apk_dex_read_class_outline for dex_class locators, mt_apk_resource_xref for resource locators, or mt_apk_dex_xref for dex locators."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 781
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Current page search hits. Use mt_apk_read_text only for text-like locators with data.workspaceId and data.editSessionId. For resource value hits, mt_apk_resource_read needs reads[0].locator, reads[0].variant from hit.variant, and required budget fields. For dex_class hits, pass the full locator to mt_apk_dex_read_class_outline.locator. For native_symbol_name hits, use hit.nativeLocation with mt_apk_native_list_items or mt_apk_native_xref. For native_string hits, use mt_apk_native_xref data scan or mt_apk_read_bytes when hit.nativeLocation provides xref/read_bytes fields. snippet is readable context only; nativeLocation is the structured parameter source."

    const-string v3, "type"

    const-string v4, "array"

    const-string v5, "description"

    .line 0
    invoke-static {v3, v4, v5, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 951
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Locator for follow-up reads. Copy data.workspaceId, data.editSessionId, and the full locator string when calling mt_apk_read_text; dex method/field targets are full Smali references. For resource value hits, build mt_apk_resource_read reads[] with this locator and hit.variant, plus required budget fields. For dex_class hits, pass this full locator to mt_apk_dex_read_class_outline.locator if you need fields and methods. For resource hits, pass the locator to mt_apk_resource_xref when resource references are needed; for dex_class, dex_method, or dex_field hits, pass the locator to mt_apk_dex_xref when incoming dex references are needed. For native hits, the locator is the SO zip_entry locator."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "locator"

    .line 952
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Search scope that produced this hit."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v8, "searchScope"

    .line 953
    invoke-virtual {v6, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 958
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "Search hit details selected by hit.kind. Each branch contains only fields that apply to that hit kind."

    .line 959
    invoke-virtual {v7, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 960
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    .line 971
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "dex_field_name"

    const-string v12, "dex_method_name"

    const-string v13, "zip_entry_path"

    const-string v14, "dex_class_name"

    filled-new-array {v13, v14, v11, v12}, [Ljava/lang/String;

    move-result-object v11

    const-string v12, "Hit kind."

    .line 972
    invoke-static {v12, v11}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    const-string v13, "kind"

    invoke-virtual {v10, v13, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v11, "What part of the candidate matched, or null when unavailable."

    .line 103
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    const-string v15, "matchKind"

    .line 974
    invoke-virtual {v10, v15, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 975
    invoke-static {}, Ll/۠ܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v14

    invoke-static {v14}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 v16, v8

    const-string v8, "matchOffsets"

    invoke-virtual {v10, v8, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v14, "ZIP entry or dex name hit."

    .line 971
    invoke-static {v10, v14}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 961
    invoke-virtual {v9, v10}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v9

    .line 979
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    const-string v14, "axml_text"

    move-object/from16 v17, v0

    const-string v0, "smali_text"

    filled-new-array {v14, v0}, [Ljava/lang/String;

    move-result-object v0

    .line 980
    invoke-static {v12, v0}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v10, v13, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 103
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 981
    invoke-virtual {v0, v15, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v10, "Bounded readable preview, or null when disabled or omitted by the preview budget."

    .line 103
    invoke-static {v1, v10}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 v18, v2

    const-string v2, "snippet"

    .line 982
    invoke-virtual {v0, v2, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v14, "integer"

    move-object/from16 v19, v6

    const-string v6, "0-based line containing the match."

    .line 110
    invoke-static {v14, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    move-object/from16 v20, v7

    const-string v7, "line"

    .line 983
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "0-based column containing the match."

    .line 110
    invoke-static {v14, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "column"

    .line 984
    invoke-virtual {v0, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 985
    invoke-static {}, Ll/۠ܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-static {v6}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {v0, v8, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v6, "Decoded AXML or Smali text hit."

    .line 979
    invoke-static {v0, v6}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 962
    invoke-virtual {v9, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 989
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "resource_table_name"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    .line 990
    invoke-static {v12, v7}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    invoke-virtual {v6, v13, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 103
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 991
    invoke-virtual {v6, v15, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "Resource table type name."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 992
    invoke-virtual {v6, v3, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "Resource entry name."

    move-object/from16 v21, v4

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v22, v5

    const-string v5, "name"

    .line 993
    invoke-virtual {v6, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "resource_id"

    move-object/from16 v23, v14

    filled-new-array {v6, v5}, [Ljava/lang/String;

    move-result-object v14

    move-object/from16 v24, v2

    const-string v2, "Matched resource field."

    .line 994
    invoke-static {v2, v14}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v14, "matchField"

    invoke-virtual {v4, v14, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 996
    invoke-static {}, Ll/۠ܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Resource table id or name hit."

    .line 989
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 963
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 1000
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "resource_table_value"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    .line 1001
    invoke-static {v12, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 1002
    invoke-virtual {v2, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 1003
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 1004
    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Variant containing the matched value, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "variant"

    .line 1005
    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Top-level resource value kind, or null."

    .line 1006
    invoke-static {v4}, Ll/۠ܳۜ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "valueKind"

    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Matched resource value preview up to 300 chars, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "valueSnippet"

    .line 1007
    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "boolean"

    const-string v7, "Whether the matched resource value is styled text."

    .line 124
    invoke-static {v4, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "styled"

    .line 1008
    invoke-virtual {v2, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "Whether valueSnippet was truncated."

    .line 124
    invoke-static {v4, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "truncated"

    .line 1009
    invoke-virtual {v2, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "styledText"

    const-string v9, "file_path"

    move-object/from16 v25, v4

    const-string v4, "value"

    filled-new-array {v6, v5, v4, v7, v9}, [Ljava/lang/String;

    move-result-object v4

    const-string v6, "Matched resource field, or null."

    .line 1010
    invoke-static {v6, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v14, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Matched file locator, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "fileLocator"

    .line 1012
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Matched target resource locator, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "targetLocator"

    .line 1013
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Item key for item value hits, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "itemKey"

    .line 1014
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Item value kind for item value hits, or null."

    .line 1015
    invoke-static {v4}, Ll/۠ܳۜ;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "itemValueKind"

    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Item key resource locator, or null."

    .line 103
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "itemKeyLocator"

    .line 1016
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1017
    invoke-static {}, Ll/۠ܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Resource table value hit."

    .line 1000
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 964
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 1021
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "dex_string_matches"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    .line 1022
    invoke-static {v12, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v13, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v11}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 1023
    invoke-virtual {v2, v15, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v10}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v6, v24

    .line 1024
    invoke-virtual {v2, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1025
    invoke-static {}, Ll/۠ܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-static {v4}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v4

    invoke-virtual {v2, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Total dex string match count for this locator."

    move-object/from16 v7, v23

    .line 110
    invoke-static {v7, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v9, "matchCount"

    .line 1026
    invoke-virtual {v2, v9, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Bounded dex_string match previews."

    move-object/from16 v9, v21

    move-object/from16 v11, v22

    .line 0
    invoke-static {v3, v9, v11, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 1107
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v14

    move-object/from16 v21, v3

    const-string v3, "Continuous window of the original matched string, limited to 120 Unicode code points."

    .line 103
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v22, v9

    const-string v9, "text"

    .line 1108
    invoke-virtual {v14, v9, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "Zero-based UTF-16 start offset of text in the original string."

    .line 110
    invoke-static {v7, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v14, "textStartOffset"

    .line 1109
    invoke-virtual {v3, v14, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v9, "Whether text omits any part of the original string."

    move-object/from16 v14, v25

    .line 124
    invoke-static {v14, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    move-object/from16 v23, v11

    const-string v11, "textTruncated"

    .line 1110
    invoke-virtual {v3, v11, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1098
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v11, "Inclusive match start in the original string."

    .line 110
    invoke-static {v7, v11}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v24, v5

    const-string v5, "start"

    .line 1099
    invoke-virtual {v9, v5, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v9, "Exclusive match end in the original string; may extend beyond the text preview when truncated."

    .line 110
    invoke-static {v7, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v9, "end"

    .line 1100
    invoke-virtual {v5, v9, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v7, "Matched dex string offsets when includeMatchOffsets=true. Zero-based UTF-16 positions in the original string; subtract the containing item\'s textStartOffset to locate the match within its text preview."

    .line 1097
    invoke-static {v5, v7}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 1111
    invoke-static {v5}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v3, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "One matched dex string preview."

    .line 1107
    invoke-static {v3, v5}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "items"

    invoke-virtual {v4, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "matchedStrings"

    .line 1027
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "matchedStringsTruncated"

    const-string v4, "Whether matchedStrings was truncated."

    const-string v7, "Dex string matches grouped by one class, field, or method locator."

    .line 0
    invoke-static {v2, v14, v4, v3, v7}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 965
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 1032
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "native_symbol_name"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 1033
    invoke-static {v12, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v13, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v30, "relocations.name"

    const-string v31, "relocations.demangledName"

    const-string v25, "imports.name"

    const-string v26, "imports.demangledName"

    const-string v27, "symbols.name"

    const-string v28, "symbols.demangledName"

    const-string v29, "entries.name"

    filled-new-array/range {v25 .. v31}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Matched ELF name field. Its prefix equals nativeLocation.itemKind; entries only use the raw entries.name field."

    .line 1034
    invoke-static {v4, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v15, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v10}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1037
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1038
    invoke-static {}, Ll/۠ܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1060
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "entries"

    const-string v7, "relocations"

    const-string v9, "imports"

    const-string v11, "symbols"

    filled-new-array {v9, v11, v4, v7}, [Ljava/lang/String;

    move-result-object v4

    const-string v7, "ELF list containing this raw name. Copy it to mt_apk_native_list_items.itemKind."

    .line 1061
    invoke-static {v7, v4}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "itemKind"

    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Non-empty raw ELF name. Copy it to mt_apk_native_list_items.namePrefix; that tool has no name parameter."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    move-object/from16 v7, v24

    .line 1063
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Readable C++ name when available; entries always use an empty string."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "demangledName"

    .line 1064
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Whether the symbol is imported. imports always use true; relocations use false."

    .line 124
    invoke-static {v14, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "imported"

    .line 1065
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Symbol byte size when known; 0 for imports, relocations, or unknown. It is not a guaranteed function boundary."

    .line 1066
    invoke-static {v3, v4}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v4, "Structured native symbol follow-up values. xrefAddressKind and xrefAddress are either both non-null or both null."

    .line 1067
    invoke-static {v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "nativeLocation"

    .line 1039
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Native ELF symbol-like name hit with structured follow-up values."

    .line 1032
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 966
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 1043
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "native_string"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    .line 1044
    invoke-static {v12, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v13, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "strings.text"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    const-string v7, "Matched native string field."

    .line 1045
    invoke-static {v7, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v15, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 103
    invoke-static {v1, v10}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1046
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1047
    invoke-static {}, Ll/۠ܳۜ;->ۧ()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1071
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "ELF string byte length when known, otherwise 0."

    .line 1072
    invoke-static {v3, v6}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v6, "Structured native string follow-up values. xrefAddressKind and xrefAddress are either both non-null or both null."

    .line 1073
    invoke-static {v3, v6}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1048
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Native ELF printable string hit with structured follow-up values."

    .line 1043
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 967
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v2, "anyOf"

    move-object/from16 v3, v20

    .line 960
    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "hit"

    move-object/from16 v3, v19

    .line 954
    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "One search hit. locator is the follow-up read target; hit contains fields for the specific hit.kind."

    .line 950
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v2, v18

    .line 946
    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "hits"

    move-object/from16 v3, v17

    .line 782
    invoke-virtual {v3, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1132
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Stable hint code, or empty string when no hint applies."

    .line 96
    invoke-static {v1, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "code"

    .line 1133
    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Short hint message, or empty string when no hint applies."

    const-string v6, "message"

    const-string v7, "Non-blocking filter hint. code=native_prefix_no_so_candidates means target=native_symbols/native_strings used a non-empty SO ZIP entry prefix that matched no lib/**/*.so candidate. Empty code/message means no hint applies."

    .line 0
    invoke-static {v2, v1, v3, v6, v7}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "filterHint"

    .line 783
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Public mt_apk_search target values not searched by target=overview. Empty for non-overview searches. This is a coverage hint, not an error list."

    move-object/from16 v3, v21

    move-object/from16 v7, v22

    move-object/from16 v8, v23

    .line 0
    invoke-static {v3, v7, v8, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "A public mt_apk_search target value to call explicitly when needed."

    .line 96
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 1128
    invoke-virtual {v2, v5, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v9, "notSearchedTargets"

    .line 784
    invoke-virtual {v0, v9, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Scopes skipped because a partial search error did not fail the whole overview search."

    .line 0
    invoke-static {v3, v7, v8, v2}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1118
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "Skipped search scope."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    move-object/from16 v8, v16

    .line 1119
    invoke-virtual {v3, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "Business error code for this skipped scope."

    .line 96
    invoke-static {v1, v7}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 1120
    invoke-virtual {v3, v4, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Human-readable skipped scope message."

    const-string v7, "One skipped search scope error."

    .line 0
    invoke-static {v3, v1, v4, v6, v7}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1118
    invoke-virtual {v2, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "skippedScopes"

    .line 785
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value."

    const-string v2, "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."

    const-string v3, "Number of items returned on this page."

    .line 1200
    invoke-static {v3, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 786
    invoke-static {v1}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful mt_apk_search data."

    .line 779
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 71
    invoke-static {}, Ll/۫ܳۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Ll/۠ܳۜ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_search. data.hits[] contains search hits with locators for follow-up calls; copy data.workspaceId and data.editSessionId into follow-up calls. data.notSearchedTargets lists public targets not covered by target=overview. data.filterHint is a non-blocking hint for likely filter misuse. Search is streamed: data.pagination.totalAvailableCount may be null, meaning unknown rather than zero. Continue while data.pagination.hasMore=true or nextActions includes mt_apk_continue. For native hits, data.hits[i].locator identifies the SO entry and data.hits[i].hit.nativeLocation contains structured values for mt_apk_native_list_items, mt_apk_native_xref, or mt_apk_read_bytes; snippet is readable context only. nextActions carries continuation or retry calls."

    .line 70
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 8

    .line 155
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "workspaceId"

    const/4 v2, 0x0

    .line 156
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, ""

    const-string v3, "editSessionId"

    .line 157
    invoke-virtual {p0, v3, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "targetLocator"

    .line 158
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "referenceKind"

    .line 159
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "methodResolution"

    .line 160
    invoke-virtual {p0, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "data"

    .line 161
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 462
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    if-nez v1, :cond_0

    goto :goto_1

    .line 466
    :cond_0
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONValue;

    .line 467
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 468
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "sourceLocator"

    .line 469
    invoke-virtual {v4, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-static {v7}, Ll/֨ۙ᩵;->ܽ(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "referenceOperand"

    .line 470
    invoke-virtual {v4, v6, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "matchKind"

    .line 471
    invoke-virtual {v4, v6, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "dispatchCertainty"

    .line 472
    invoke-virtual {v4, v6, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "opcode"

    .line 473
    invoke-virtual {v4, v6, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const/4 v6, 0x0

    const-string v7, "instructionIndex"

    .line 474
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v5, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    .line 468
    invoke-virtual {v3, v4}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_1
    :goto_1
    const-string v1, "refs"

    .line 161
    invoke-virtual {v0, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pagination"

    .line 162
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/֨ۙ᩵;->֫(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nextActions"

    .line 163
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {p0}, Ll/۠ܳۜ;->֫(Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONArray;

    move-result-object p0

    invoke-static {v0, p0}, Ll/᩶ۛ᩻;->֫(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ()Lbin/mt/json/JSONObject;
    .locals 10

    .line 790
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "Workspace id used for this xref result."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "workspaceId"

    .line 791
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Edit session id used for this xref result; pass this value together with data.workspaceId when reading refs[i].sourceLocator."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "editSessionId"

    .line 792
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "Queried dex_method, dex_field, or dex_class locator."

    .line 103
    invoke-static {v1, v2}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "targetLocator"

    .line 793
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "field_access"

    const-string v3, "type_reference"

    const-string v4, "method_call"

    .line 1158
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "Reference kind for this result."

    invoke-static {v3, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "referenceKind"

    .line 794
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "exact"

    const-string v3, "slot"

    const-string v4, "dispatch"

    const-string v5, "not_applicable"

    .line 1167
    filled-new-array {v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Method resolution mode used for method scans; field and type scans return not_applicable."

    invoke-static {v4, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "methodResolution"

    .line 795
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "description"

    const-string v4, "Current page incoming instruction references. Pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_read_text.locator to inspect the containing method."

    const-string v6, "type"

    const-string v7, "array"

    .line 0
    invoke-static {v6, v7, v3, v4}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1145
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Containing dex_method locator. Pass data.workspaceId, data.editSessionId, and this string as mt_apk_read_text.locator to inspect the method body."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "sourceLocator"

    .line 1146
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "Raw bytecode reference operand at the instruction; method and field operands are smali references, type operands are descriptors. It may differ from the target part after the first colon in data.targetLocator for slot/dispatch method matches or array type references."

    .line 96
    invoke-static {v1, v6}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "referenceOperand"

    .line 1147
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "possible_virtual_dispatch"

    const-string v7, "super_call"

    const-string v8, "exact_reference"

    const-string v9, "same_virtual_slot"

    .line 1176
    filled-new-array {v8, v9, v6, v7}, [Ljava/lang/String;

    move-result-object v6

    const-string v7, "Match category: exact_reference means the instruction operand exactly matched the target reference or class component; same_virtual_slot means method operand shares the target virtual slot; possible_virtual_dispatch means runtime method dispatch may reach the target; super_call means invoke-super matched the target under the selected methodResolution while referenceOperand remains the raw bytecode owner."

    invoke-static {v7, v6}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "matchKind"

    .line 1148
    invoke-virtual {v4, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "possible"

    .line 1185
    filled-new-array {v2, v6, v5}, [Ljava/lang/String;

    move-result-object v2

    const-string v5, "Method dispatch certainty; field and type references return not_applicable."

    invoke-static {v5, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "dispatchCertainty"

    .line 1149
    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Instruction opcode name."

    .line 96
    invoke-static {v1, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "opcode"

    .line 1150
    invoke-virtual {v2, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "0-based instruction index within the caller method implementation."

    const-string v4, "integer"

    const-string v5, "instructionIndex"

    const-string v6, "One incoming instruction reference."

    .line 0
    invoke-static {v1, v4, v2, v5, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "items"

    .line 1141
    invoke-virtual {v3, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "refs"

    .line 796
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value."

    const-string v2, "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."

    const-string v3, "Number of items returned on this page."

    .line 1200
    invoke-static {v3, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 797
    invoke-static {v1}, Ll/֫ۛ᩻;->ܽ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Successful mt_apk_dex_xref data."

    .line 790
    invoke-static {v0, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 79
    invoke-static {}, Ll/۫ܳۜ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {}, Ll/۠ܳۜ;->ᩳ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_dex_xref. data.refs[] contains incoming instruction references; pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator to mt_apk_read_text to inspect containing methods; nextActions carries continuation or retry calls."

    .line 78
    invoke-static {v3, v0, v1, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ()Lbin/mt/json/JSONObject;
    .locals 4

    const-string v0, "continue"

    .line 1242
    invoke-static {}, Ll/ۧᩳܽ;->֫()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "mt_apk_continue"

    .line 1241
    invoke-static {v1, v2, v0}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "retry"

    .line 1244
    invoke-static {}, Ll/ۧᩳܽ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_workspace_open"

    .line 1243
    invoke-static {v2, v3, v1}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lbin/mt/json/JSONObject;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const-string v0, "Executable continue or retry actions; copy arguments directly."

    .line 1240
    invoke-static {v0, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method
