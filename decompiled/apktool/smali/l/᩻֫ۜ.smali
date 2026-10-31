.class public final Ll/᩻֫ۜ;
.super Ll/ۙۛ᩻;
.source "A768"


# instance fields
.field public final ֫:Ll/᩹ۧۜ;

.field public ۧ:Lbin/mt/json/JSONObject;

.field public final ܽ:Ll/ܰ۟᩻;

.field public final ܿ:Ll/᩵᩻ۜ;

.field public ᩳ:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/᩵᩻ۜ;)V
    .locals 2

    .line 31
    new-instance v0, Ll/᩹ۧۜ;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v1, Ll/ܰ۟᩻;

    .line 22
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-direct {p0}, Ll/ۙۛ᩻;-><init>()V

    .line 46
    iput-object p1, p0, Ll/᩻֫ۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 47
    iput-object v0, p0, Ll/᩻֫ۜ;->֫:Ll/᩹ۧۜ;

    .line 48
    iput-object v1, p0, Ll/᩻֫ۜ;->ܽ:Ll/ܰ۟᩻;

    return-void
.end method

.method public static ֫(Ll/᩻֫ۜ;Ll/֡۟᩻;Ll/۟۟᩻;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 126
    iget-object p2, p2, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    .line 141
    :try_start_0
    iget-object p0, p0, Ll/᩻֫ۜ;->֫:Ll/᩹ۧۜ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-static {p2}, Ll/ܺܺۢ;->֫(Ljava/lang/String;)Ll/ۛܺۢ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    invoke-static {p1, p0}, Ll/۫֫ۜ;->֫(Ll/֡۟᩻;Ll/ۛܺۢ;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :catch_0
    const-string p0, "NATIVE_ANALYZER_FAILED"

    const-string p1, "Native ELF analysis failed."

    .line 143
    invoke-static {p0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0
.end method

.method public static synthetic ֫(Ll/᩻֫ۜ;Ll/֡۟᩻;Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;)Lbin/mt/json/JSONObject;
    .locals 4

    .line 123
    iget-object v0, p0, Ll/᩻֫ۜ;->ܽ:Ll/ܰ۟᩻;

    iget-object v1, p1, Ll/֡۟᩻;->֫:Ljava/lang/String;

    iget-object v2, p1, Ll/֡۟᩻;->ۧ:Ljava/lang/String;

    new-instance v3, Ll/ܳ֫ۜ;

    invoke-direct {v3, p0, p1}, Ll/ܳ֫ۜ;-><init>(Ll/᩻֫ۜ;Ll/֡۟᩻;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p3, v1, v2, v3}, Ll/ܰ۟᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܺ۟᩻;Ljava/lang/String;Ljava/lang/String;Ll/᩺۟᩻;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbin/mt/json/JSONObject;

    return-object p0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONObject;
    .locals 3

    .line 68
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛ᩻;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 480
    sget-object v0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {p1, v0, v1}, Ll/᩶ۛ᩻;->֫(Ll/ۗۛ᩻;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)Ll/۬ۛ᩻;
    .locals 5

    .line 110
    iget-object v0, p0, Ll/᩻֫ۜ;->ܿ:Ll/᩵᩻ۜ;

    .line 119
    :try_start_0
    invoke-static {p1}, Ll/ۙ۟᩻;->ܽ(Lbin/mt/json/JSONObject;)Ll/֡۟᩻;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v1, p1, Ll/֡۟᩻;->ᩳ:Ljava/lang/String;

    .line 121
    invoke-virtual {v0}, Ll/᩵᩻ۜ;->ۧ()Ll/᩵᩺᩻;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 122
    :try_start_2
    new-instance v3, Ll/ܿ֫ۜ;

    invoke-direct {v3, p0, p1}, Ll/ܿ֫ۜ;-><init>(Ll/᩻֫ۜ;Ll/֡۟᩻;)V

    invoke-virtual {v0, v1, v3}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;Ll/ܺ᩻ۜ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/json/JSONObject;

    .line 129
    new-instance v4, Ll/۬ۛ᩻;

    invoke-direct {v4, v3}, Ll/۬ۛ᩻;-><init>(Lbin/mt/json/JSONObject;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 130
    :try_start_3
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 133
    invoke-virtual {v0, v1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 135
    sget p1, Ll/ۡۨ᩻;->֫:I

    return-object v4

    :catchall_0
    move-exception v1

    .line 121
    :try_start_4
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_5
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    goto :goto_1

    :catchall_3
    move-exception v1

    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_0

    .line 133
    iget-object p1, p1, Ll/֡۟᩻;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/᩵᩻ۜ;->֫(Ljava/lang/String;)V

    .line 135
    :cond_0
    sget p1, Ll/ۡۨ᩻;->֫:I

    .line 136
    throw v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "Start here for an overview of a zip_entry ELF in the base APK or edited session view. Returns summary metadata and complete unfiltered item counts, not detail lists. Copy a nextActions call to mt_apk_native_list_items for details. Use mt_apk_native_map_address for address conversion, mt_apk_native_disassemble for instruction text, and mt_apk_read_bytes for raw entry bytes."

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Inspect Native ELF"

    return-object v0
.end method

.method public final ܽ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/᩻֫ۜ;->ۧ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session view; pass an empty string to inspect the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  }\n}\n"

    .line 76
    invoke-static {v0}, Ll/ۘܳ֨;->֫(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩻֫ۜ;->ۧ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܿ()Lbin/mt/json/JSONObject;
    .locals 21

    move-object/from16 v0, p0

    .line 97
    iget-object v1, v0, Ll/᩻֫ۜ;->ᩳ:Lbin/mt/json/JSONObject;

    if-eqz v1, :cond_0

    return-object v1

    .line 1706
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "Workspace id."

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "workspaceId"

    .line 1707
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "Edit session id, or empty string for base APK."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v6, "editSessionId"

    .line 1708
    invoke-virtual {v1, v6, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "zip_entry locator."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "locator"

    .line 1709
    invoke-virtual {v1, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "ELF binary type."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "type"

    .line 1710
    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "ELF architecture."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "arch"

    .line 1711
    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "ELF CPU name."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "cpu"

    .line 1712
    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "ELF machine name."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "machine"

    .line 1713
    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "ELF ABI."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "abi"

    .line 1714
    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "Target OS."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "os"

    .line 1715
    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "Subsystem."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "subsystem"

    .line 1716
    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "ELF interpreter path from metadata, or empty string."

    .line 96
    invoke-static {v2, v4}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v8, "interpreter"

    .line 1717
    invoke-virtual {v1, v8, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "integer"

    const-string v8, "ELF class/ABI bit width. ARM32 ELF reports 32 even when Thumb instructions use 16-bit mode."

    .line 110
    invoke-static {v4, v8}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v9, "archBits"

    .line 1718
    invoke-virtual {v1, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v8, "boolean"

    const-string v9, "Whether virtual addresses are present."

    .line 124
    invoke-static {v8, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "hasVirtualAddress"

    .line 1719
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "Whether the ELF is position independent."

    .line 124
    invoke-static {v8, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "positionIndependent"

    .line 1720
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "Whether NX is enabled."

    .line 124
    invoke-static {v8, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "nx"

    .line 1721
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "Whether a stack canary was detected."

    .line 124
    invoke-static {v8, v9}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "canary"

    .line 1722
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "ELF base address, or null."

    .line 103
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "baseAddress"

    .line 1723
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "Entry virtual address, or null."

    .line 103
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "entryVirtualAddress"

    .line 1724
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "Entry ELF file offset within the zip_entry bytes, or null."

    .line 103
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "entryFileOffset"

    .line 1725
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "Init virtual address, or null."

    .line 103
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "initVirtualAddress"

    .line 1726
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "Fini virtual address, or null."

    .line 103
    invoke-static {v2, v9}, Ll/֫ۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "finiVirtualAddress"

    .line 1727
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 2219
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v17, "finiArray"

    const-string v18, "relocations"

    const-string v10, "neededLibraries"

    const-string v11, "sections"

    const-string v12, "segments"

    const-string v13, "imports"

    const-string v14, "symbols"

    const-string v15, "entries"

    const-string v16, "initArray"

    .line 2220
    filled-new-array/range {v10 .. v18}, [Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_0
    const/16 v13, 0x9

    if-ge v12, v13, :cond_1

    aget-object v13, v10, v12

    .line 2222
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Complete "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, " count."

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 110
    invoke-static {v4, v14}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v14

    .line 2222
    invoke-virtual {v9, v13, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_1
    const-string v10, "Complete ELF detail counts. Use mt_apk_native_list_items to read exactly one itemKind list; entries counts all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present. initArray and finiArray separately count .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata."

    .line 2215
    invoke-static {v9, v10}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "counts"

    .line 1728
    invoke-virtual {v1, v10, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "ELF summary metadata for a ZIP entry. Detail lists are available only through mt_apk_native_list_items."

    .line 1706
    invoke-static {v1, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "No tool-specific diagnostics."

    .line 2393
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    invoke-static {v10, v9}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 76
    invoke-static {v9}, Ll/֫ۛ᩻;->ۧ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 118
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    .line 96
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 119
    invoke-virtual {v10, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session."

    .line 96
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 120
    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "ZIP entry locator for the native ELF."

    .line 96
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 121
    invoke-virtual {v3, v7, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v19, "finiArray"

    const-string v20, "relocations"

    const-string v12, "neededLibraries"

    const-string v13, "sections"

    const-string v14, "segments"

    const-string v15, "imports"

    const-string v16, "symbols"

    const-string v17, "entries"

    const-string v18, "initArray"

    filled-new-array/range {v12 .. v20}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "ELF list to read; copy unchanged."

    .line 122
    invoke-static {v6, v5}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "itemKind"

    invoke-virtual {v3, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "Case-sensitive prefix of the raw item name; empty means no filter."

    .line 96
    invoke-static {v2, v5}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "namePrefix"

    .line 123
    invoke-virtual {v3, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Whether to include readable C++ names; filtering still uses raw names."

    .line 124
    invoke-static {v8, v3}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "demangle"

    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "limit"

    const-string v5, "First page size; suggested value is 100 and maximum is 500."

    const-string v6, "Arguments for mt_apk_native_list_items."

    .line 0
    invoke-static {v2, v4, v5, v3, v6}, Ll/ᩴۨۡ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "mt_apk_native_list_items"

    const-string v4, "inspect"

    .line 78
    invoke-static {v2, v3, v4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lbin/mt/json/JSONObject;

    aput-object v2, v3, v11

    const-string v2, "First-page native detail reads. Copy one action\'s arguments to mt_apk_native_list_items; each action already selects an itemKind with count > 0."

    .line 77
    invoke-static {v2, v3}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Result for mt_apk_native_inspect. ELF summary metadata and unfiltered counts. Use nextActions for detail lists."

    .line 75
    invoke-static {v3, v1, v9, v2}, Ll/֫ۛ᩻;->֫(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 100
    iput-object v1, v0, Ll/᩻֫ۜ;->ᩳ:Lbin/mt/json/JSONObject;

    return-object v1
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_native_inspect"

    return-object v0
.end method
