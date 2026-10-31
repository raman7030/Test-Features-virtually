.class public final Ll/۬ۖۜ;
.super Ljava/lang/Object;
.source "D6X3"


# static fields
.field public static final ܿ:Ljava/security/SecureRandom;

.field public static final ᩳ:Ljava/lang/String;


# instance fields
.field public final ֫:Ll/᩻ᩳᩴ;

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public final ܽ:Ll/ᩳۖۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 43
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Ll/۬ۖۜ;->ܿ:Ljava/security/SecureRandom;

    const/16 v1, 0xc

    new-array v1, v1, [B

    .line 1071
    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 1072
    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    .line 44
    sput-object v0, Ll/۬ۖۜ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ᩳۖۜ;)V
    .locals 5

    .line 54
    new-instance v0, Ll/᩻ᩳᩴ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v1, Ljava/util/LinkedHashMap;

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    const/16 v4, 0x10

    invoke-direct {v1, v4, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v1, p0, Ll/۬ۖۜ;->ۧ:Ljava/util/LinkedHashMap;

    .line 59
    iput-object p1, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    .line 60
    iput-object v0, p0, Ll/۬ۖۜ;->֫:Ll/᩻ᩳᩴ;

    return-void
.end method

.method public static ֫(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)J
    .locals 9

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    const-wide/16 v1, 0x0

    .line 1655
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "Copied size exceeds the supported JSON integer range"

    const-wide v5, 0x1fffffffffffffL

    if-nez v3, :cond_3

    .line 1660
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v3

    if-gez v3, :cond_1

    :goto_1
    return-wide v1

    .line 1664
    :cond_1
    invoke-virtual {p1, v3}, Ljava/io/OutputStream;->write(I)V

    const/4 v3, 0x1

    int-to-long v7, v3

    sub-long/2addr v5, v7

    cmp-long v3, v1, v5

    if-gtz v3, :cond_2

    goto :goto_2

    .line 1676
    :cond_2
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/4 v7, 0x0

    .line 1667
    invoke-virtual {p1, v0, v7, v3}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v7, v3

    sub-long/2addr v5, v7

    cmp-long v3, v1, v5

    if-gtz v3, :cond_4

    :goto_2
    add-long/2addr v1, v7

    goto :goto_0

    .line 1676
    :cond_4
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)J
    .locals 3

    .line 1107
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0

    const/high16 v1, 0x10000

    invoke-direct {v0, p0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 1108
    :try_start_0
    new-instance p0, Ljava/io/BufferedOutputStream;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p1

    invoke-direct {p0, p1, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 1110
    :try_start_1
    invoke-static {v0, p0}, Ll/۬ۖۜ;->֫(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)J

    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1111
    :try_start_2
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-wide v1

    :catchall_0
    move-exception p1

    .line 1107
    :try_start_3
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۤ᩵ܿ;Z)Ll/֨ۖۜ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۬ۖۜ;->ۧ(Ll/ۤ᩵ܿ;Z)Ll/֨ۖۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Z)Ll/֨ۖۜ;
    .locals 4

    if-eqz p1, :cond_0

    .line 1144
    sget-object p1, Ll/۬᩵ܿ;->ۤ:Ll/۬᩵ܿ;

    goto :goto_0

    .line 1145
    :cond_0
    sget-object p1, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    .line 1146
    :goto_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object p0

    .line 1147
    sget-object v0, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_1

    .line 1148
    new-instance p0, Ll/֨ۖۜ;

    const-string v0, "atomic"

    invoke-direct {p0, p1, v0, v1, v1}, Ll/֨ۖۜ;-><init>(Ll/۬᩵ܿ;Ljava/lang/String;ZZ)V

    return-object p0

    .line 1150
    :cond_1
    sget-object v0, Ll/ۙ᩵ܿ;->᩶:Ll/ۙ᩵ܿ;

    const-string v2, "best_effort"

    const/4 v3, 0x0

    if-eq p0, v0, :cond_3

    sget-object v0, Ll/ۙ᩵ܿ;->ۙ:Ll/ۙ᩵ܿ;

    if-ne p0, v0, :cond_2

    goto :goto_1

    .line 1154
    :cond_2
    new-instance p0, Ll/֨ۖۜ;

    invoke-direct {p0, p1, v2, v3, v3}, Ll/֨ۖۜ;-><init>(Ll/۬᩵ܿ;Ljava/lang/String;ZZ)V

    return-object p0

    .line 1152
    :cond_3
    :goto_1
    new-instance p0, Ll/֨ۖۜ;

    invoke-direct {p0, p1, v2, v3, v1}, Ll/֨ۖۜ;-><init>(Ll/۬᩵ܿ;Ljava/lang/String;ZZ)V

    return-object p0
.end method

.method public static ֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 12

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v5, "size_out_of_range"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object v9, p0

    .line 1589
    invoke-static/range {v0 .. v11}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 12

    .line 929
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v4, "check_parent_links"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v0, p2

    move-object v1, p3

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v5, p4

    .line 1589
    invoke-static/range {v0 .. v11}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "path"

    const-string v1, "targetPath"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "policyRevision"

    .line 1564
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "operation"

    .line 1565
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "backendReason"

    .line 1566
    invoke-virtual {p2, p3, p6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "changed"

    .line 1567
    invoke-virtual {p2, p3, p7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-nez p8, :cond_0

    .line 1569
    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p8}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    :goto_0
    const-string p4, "operationMode"

    .line 1568
    invoke-virtual {p2, p4, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "stateKnown"

    .line 1570
    invoke-virtual {p2, p3, p9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    new-instance p3, Lbin/mt/json/JSONArray;

    invoke-direct {p3, p10}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string p4, "warnings"

    .line 1571
    invoke-virtual {p2, p4, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "FILE_ALREADY_EXISTS"

    .line 1572
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x0

    if-nez p3, :cond_2

    const-string p3, "FILE_STORAGE_ERROR"

    .line 1573
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    const-string p3, "FILE_CHANGED_DURING_READ"

    .line 1574
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    const-string p3, "FILE_OPERATION_STATE_UNKNOWN"

    .line 1575
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    const-string p3, "fatal"

    .line 1579
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    const-string p3, "warning"

    .line 1577
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 2

    const-string v0, "path"

    const-string v1, "policyRevision"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/۟ۤ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "operation"

    .line 1603
    invoke-virtual {p2, p3, p4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "backendReason"

    .line 1604
    invoke-virtual {p2, p3, p5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "changed"

    .line 1605
    invoke-virtual {p2, p3, p6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-nez p7, :cond_0

    .line 1606
    sget-object p3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_0

    :cond_0
    invoke-static {p7}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p3

    :goto_0
    const-string p6, "operationMode"

    invoke-virtual {p2, p6, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    const-string p3, "stateKnown"

    .line 1607
    invoke-virtual {p2, p3, p8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p2

    new-instance p3, Lbin/mt/json/JSONArray;

    invoke-direct {p3, p9}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string p6, "warnings"

    .line 1608
    invoke-virtual {p2, p6, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p2

    if-eqz p10, :cond_1

    const-string p3, "expectedTargetVersion"

    .line 1610
    invoke-virtual {p2, p3, p10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string p6, "actualTargetVersion"

    .line 1611
    invoke-virtual {p3, p6, p11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_1
    const-string p3, "parent_stat"

    .line 1614
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_3

    const-string p3, "FILE_PARENT_NOT_FOUND"

    .line 1615
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    const-string p3, "parent_missing"

    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    :cond_2
    const-string p3, "FILE_NOT_DIRECTORY"

    .line 1616
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    const-string p3, "regular"

    invoke-virtual {p3, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    :cond_3
    const-string p3, "FILE_ALREADY_EXISTS"

    .line 1617
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    const-string p3, "FILE_STORAGE_ERROR"

    .line 1618
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    const-string p3, "FILE_CHANGED_DURING_READ"

    .line 1619
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    const-string p3, "FILE_TARGET_VERSION_MISMATCH"

    .line 1620
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_5

    const-string p3, "FILE_OPERATION_STATE_UNKNOWN"

    .line 1621
    invoke-virtual {p3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_1

    :cond_4
    const-string p3, "fatal"

    .line 1625
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_1
    const-string p3, "warning"

    .line 1623
    invoke-static {p0, p1, p3, p4, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 7

    .line 1441
    iget-boolean v0, p0, Ll/ۗۛ᩻;->ۙ:Z

    iget-object v1, p0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    iget-object v2, p0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    iget-object v3, p0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object p0

    .line 1444
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 1445
    iget-object v4, p0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    invoke-virtual {v4}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONObject$Member;

    .line 1446
    invoke-virtual {v5}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v0, v6, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_1
    const-string v4, "localPath"

    .line 1448
    invoke-virtual {v0, v4, p1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string p1, "policyRevision"

    .line 1449
    invoke-virtual {v0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 1450
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v4

    if-nez v4, :cond_3

    .line 1451
    :cond_2
    invoke-virtual {v0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 1453
    :cond_3
    iget-boolean p1, p0, Ll/ۗۛ᩻;->۫:Z

    if-eqz p1, :cond_4

    .line 1454
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0, v2, v1, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0

    .line 1456
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0, v2, v1, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/lang/String;ZLl/ۗۖۜ;Ll/۟ۢۜ;)Ll/ۙۖۜ;
    .locals 30

    move-object/from16 v11, p0

    move-object/from16 v10, p1

    move-object/from16 v0, p3

    .line 386
    iget-object v12, v11, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    const/4 v3, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p2

    move-object/from16 v5, p4

    move-object v6, v8

    .line 387
    invoke-direct/range {v1 .. v6}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;ZLl/۟ۢۜ;Lbin/mt/json/JSONArray;)Ll/ۡۖۜ;

    move-result-object v1

    .line 390
    iget-object v2, v1, Ll/ۡۖۜ;->ۧ:Ll/ۤ᩵ܿ;

    .line 391
    iget-object v3, v1, Ll/ۡۖۜ;->ܽ:Ljava/lang/String;

    .line 392
    iget-object v4, v1, Ll/ۡۖۜ;->ܳ:Ll/ܶ᩵ܿ;

    .line 393
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v24

    .line 395
    iget-object v5, v1, Ll/ۡۖۜ;->ܿ:Ll/֨ۖۜ;

    .line 396
    iget-object v6, v5, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;

    move-object/from16 v7, p4

    .line 397
    iget-object v7, v7, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v9, "produce_temp"

    const-wide/16 v13, 0x0

    .line 408
    :try_start_0
    invoke-static {v10, v2, v5, v7, v8}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_45
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_44
    .catch Ll/᩶ۖۜ; {:try_start_0 .. :try_end_0} :catch_43
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_42

    .line 410
    :try_start_1
    invoke-interface {v0, v4}, Ll/ۗۖۜ;->֫(Ll/ܶ᩵ܿ;)Ll/ۚۖۜ;

    move-result-object v2

    .line 411
    iget-object v5, v2, Ll/ۚۖۜ;->֫:Ljava/lang/Object;
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_41
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_40
    .catch Ll/᩶ۖۜ; {:try_start_1 .. :try_end_1} :catch_3f
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_42

    .line 412
    :try_start_2
    iget-wide v14, v2, Ll/ۚۖۜ;->ۧ:J
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_3e
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3d
    .catch Ll/᩶ۖۜ; {:try_start_2 .. :try_end_2} :catch_3c
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3b

    .line 419
    :goto_0
    :try_start_3
    invoke-virtual {v12}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v2

    .line 420
    iget-object v7, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_3a
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_39
    .catch Ll/᩶ۖۜ; {:try_start_3 .. :try_end_3} :catch_38
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_37

    :try_start_4
    const-string v9, "pre_publish_validation"
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_33
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_36
    .catch Ll/᩶ۖۜ; {:try_start_4 .. :try_end_4} :catch_35
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_34

    .line 422
    :try_start_5
    invoke-virtual {v2, v10}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 423
    invoke-virtual {v2, v3}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 424
    invoke-virtual {v2, v10}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 426
    iget-object v4, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ll/ۡۖۜ;->֫(Ljava/lang/String;)V

    .line 427
    iget-object v13, v1, Ll/ۡۖۜ;->֫:Ll/ܶ᩵ܿ;

    .line 428
    iget-object v4, v1, Ll/ۡۖۜ;->ۧ:Ll/ۤ᩵ܿ;

    move-object/from16 v16, v3

    .line 429
    iget-object v3, v1, Ll/ۡۖۜ;->ܳ:Ll/ܶ᩵ܿ;
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_33
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_32
    .catch Ll/᩶ۖۜ; {:try_start_5 .. :try_end_5} :catch_31
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_30

    move-object/from16 p4, v5

    .line 430
    :try_start_6
    iget-object v5, v1, Ll/ۡۖۜ;->᩻:Ll/ۤ᩵ܿ;

    move-object/from16 v17, v1

    .line 431
    invoke-direct {v11, v4}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v1

    .line 432
    invoke-direct {v11, v1, v10}, Ll/۬ۖۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_2f
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2e
    .catch Ll/᩶ۖۜ; {:try_start_6 .. :try_end_6} :catch_2d
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_2c

    if-nez p2, :cond_1

    move-object/from16 v25, v7

    .line 434
    :try_start_7
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v7
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ll/᩶ۖۜ; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_6

    move-object/from16 v26, v9

    :try_start_8
    sget-object v9, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v7, v9, :cond_0

    goto/16 :goto_8

    :cond_0
    const-string v12, "FILE_ALREADY_EXISTS"

    const-string v13, "The local destination appeared before publication and overwrite is false."

    .line 435
    iget-object v0, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v16, "pre_publish_destination"

    const-string v17, "already_exists"
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ll/᩶ۖۜ; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_3

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x1

    move-wide/from16 v27, v14

    move-object/from16 v14, p1

    move-object v15, v0

    move-object/from16 v19, v6

    move-object/from16 v21, v8

    .line 1589
    :try_start_9
    invoke-static/range {v12 .. v23}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 435
    throw v0
    :try_end_9
    .catch Ll/ۗۛ᩻; {:try_start_9 .. :try_end_9} :catch_2b
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ll/᩶ۖۜ; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_0

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_7

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    goto :goto_4

    :catch_5
    move-exception v0

    goto :goto_6

    :catch_6
    move-exception v0

    move-object/from16 v26, v9

    :goto_1
    move-wide/from16 v27, v14

    :goto_2
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v5, p4

    move-object v11, v8

    move-object v15, v10

    :goto_3
    move-object/from16 v7, v25

    move-object/from16 v16, v26

    goto/16 :goto_39

    :catch_7
    move-exception v0

    move-object/from16 v26, v9

    :goto_4
    move-wide/from16 v27, v14

    :goto_5
    const/4 v1, 0x0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object v15, v10

    move-object/from16 v7, v25

    move-object/from16 v9, v26

    move-wide/from16 v13, v27

    goto/16 :goto_36

    :catch_8
    move-exception v0

    move-object/from16 v26, v9

    :goto_6
    move-wide/from16 v27, v14

    :goto_7
    const/4 v1, 0x0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object v15, v10

    move-object/from16 v7, v25

    move-object/from16 v9, v26

    move-wide/from16 v13, v27

    goto/16 :goto_38

    :catch_9
    move-exception v0

    move-wide/from16 v27, v14

    goto/16 :goto_1e

    :cond_1
    move-object/from16 v25, v7

    move-object/from16 v26, v9

    :goto_8
    move-wide/from16 v27, v14

    .line 441
    :try_start_a
    invoke-direct {v11, v5}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v7

    iget-object v9, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v10, v7, v9, v8}, Ll/۬ۖۜ;->ۧ(Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V

    .line 443
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v7, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v1, v7, :cond_2

    const/4 v1, 0x1

    const/4 v14, 0x1

    goto :goto_9

    :cond_2
    const/4 v1, 0x0

    const/4 v14, 0x0

    .line 445
    :goto_9
    invoke-static {v5, v14}, Ll/۬ۖۜ;->ۧ(Ll/ۤ᩵ܿ;Z)Ll/֨ۖۜ;

    move-result-object v7

    .line 446
    iget-object v15, v7, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;
    :try_end_a
    .catch Ll/ۗۛ᩻; {:try_start_a .. :try_end_a} :catch_2b
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2a
    .catch Ll/᩶ۖۜ; {:try_start_a .. :try_end_a} :catch_29
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_28

    .line 447
    :try_start_b
    iget-object v1, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v10, v4, v7, v1, v8}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V
    :try_end_b
    .catch Ll/ۗۛ᩻; {:try_start_b .. :try_end_b} :catch_27
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_26
    .catch Ll/᩶ۖۜ; {:try_start_b .. :try_end_b} :catch_25
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_23

    if-eqz v14, :cond_3

    .line 452
    :try_start_c
    new-instance v1, Ll/ܿ᩵ܿ;

    invoke-direct {v1}, Ll/ܿ᩵ܿ;-><init>()V
    :try_end_c
    .catch Ll/ۗۛ᩻; {:try_start_c .. :try_end_c} :catch_e
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_a
    .catch Ll/᩶ۖۜ; {:try_start_c .. :try_end_c} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_c

    .line 455
    :try_start_d
    invoke-virtual {v1, v13}, Ll/ܿ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Ll/ܽ᩵ܿ;

    move-result-object v6
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_b
    .catch Ll/ۗۛ᩻; {:try_start_d .. :try_end_d} :catch_e
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_a

    goto :goto_a

    :catch_a
    move-exception v0

    goto :goto_b

    .line 457
    :catch_b
    :try_start_e
    sget-object v6, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    .line 459
    :goto_a
    sget-object v9, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    if-eq v6, v9, :cond_4

    const-string v1, "Existing destination mode, owner, or group metadata could not be fully captured."

    .line 460
    invoke-static {v8, v1}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    :try_end_e
    .catch Ll/ۗۛ᩻; {:try_start_e .. :try_end_e} :catch_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_a
    .catch Ll/᩶ۖۜ; {:try_start_e .. :try_end_e} :catch_d
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_c

    goto :goto_d

    :catch_c
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v5, p4

    move-object v11, v8

    move-object v6, v15

    move-object/from16 v7, v25

    move-object/from16 v16, v26

    move-object v15, v10

    goto/16 :goto_39

    :catch_d
    move-exception v0

    const/4 v1, 0x0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object v6, v15

    move-object/from16 v7, v25

    move-object/from16 v9, v26

    move-wide/from16 v13, v27

    move-object v15, v10

    goto/16 :goto_36

    :goto_b
    const/4 v1, 0x0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object v6, v15

    move-object/from16 v7, v25

    move-object/from16 v9, v26

    move-wide/from16 v13, v27

    move-object v15, v10

    goto/16 :goto_38

    :catch_e
    move-exception v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v5, p4

    move-object v11, v8

    move-object v8, v10

    move-object/from16 v19, v15

    :goto_c
    move-object/from16 v7, v25

    move-wide/from16 v14, v27

    goto/16 :goto_47

    :cond_3
    :goto_d
    const/4 v1, 0x0

    :cond_4
    move-object v9, v1

    .line 468
    :try_start_f
    invoke-interface {v0, v2}, Ll/ۗۖۜ;->֫(Ll/۟ۢۜ;)V
    :try_end_f
    .catch Ll/ۗۛ᩻; {:try_start_f .. :try_end_f} :catch_27
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_26
    .catch Ll/᩶ۖۜ; {:try_start_f .. :try_end_f} :catch_25
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_24

    .line 471
    :try_start_10
    invoke-virtual {v12}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    .line 472
    iget-object v6, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-object v1, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_10
    .catch Ll/ۗۛ᩻; {:try_start_10 .. :try_end_10} :catch_27
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_26
    .catch Ll/᩶ۖۜ; {:try_start_10 .. :try_end_10} :catch_25
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_23

    if-eqz v1, :cond_7

    :try_start_11
    const-string v16, "publish"
    :try_end_11
    .catch Ll/ۗۛ᩻; {:try_start_11 .. :try_end_11} :catch_22
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_21
    .catch Ll/᩶ۖۜ; {:try_start_11 .. :try_end_11} :catch_20
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_1f

    .line 479
    :try_start_12
    iget-object v0, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;
    :try_end_12
    .catch Ll/ۗۛ᩻; {:try_start_12 .. :try_end_12} :catch_22
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_1e
    .catch Ll/᩶ۖۜ; {:try_start_12 .. :try_end_12} :catch_1d
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_1c

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v6, v4

    move-object v4, v5

    move-object/from16 v18, p4

    move-object v5, v13

    move-object/from16 v13, v25

    move-object v11, v8

    move-object v13, v9

    move-wide/from16 v8, v27

    move-object/from16 v19, v15

    move-object v15, v10

    move-object v10, v0

    :try_start_13
    invoke-direct/range {v1 .. v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;JLjava/lang/String;)V
    :try_end_13
    .catch Ll/ۗۛ᩻; {:try_start_13 .. :try_end_13} :catch_1b
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1a
    .catch Ll/᩶ۖۜ; {:try_start_13 .. :try_end_13} :catch_19
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_18

    :try_start_14
    const-string v1, "restore_metadata"
    :try_end_14
    .catch Ll/ۗۛ᩻; {:try_start_14 .. :try_end_14} :catch_17
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_16
    .catch Ll/᩶ۖۜ; {:try_start_14 .. :try_end_14} :catch_15
    .catch Ljava/lang/RuntimeException; {:try_start_14 .. :try_end_14} :catch_14

    .line 483
    :try_start_15
    invoke-virtual {v12, v15}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0
    :try_end_15
    .catch Ll/ۗۛ᩻; {:try_start_15 .. :try_end_15} :catch_17
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_13
    .catch Ll/᩶ۖۜ; {:try_start_15 .. :try_end_15} :catch_12
    .catch Ljava/lang/RuntimeException; {:try_start_15 .. :try_end_15} :catch_11

    if-eqz v13, :cond_5

    .line 488
    :try_start_16
    invoke-virtual {v13, v0}, Ll/ܿ᩵ܿ;->ܽ(Ll/ܶ᩵ܿ;)Ll/ܽ᩵ܿ;

    move-result-object v2
    :try_end_16
    .catch Ljava/lang/RuntimeException; {:try_start_16 .. :try_end_16} :catch_f
    .catch Ll/ۗۛ᩻; {:try_start_16 .. :try_end_16} :catch_17
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_13

    goto :goto_e

    .line 490
    :catch_f
    :try_start_17
    sget-object v2, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    .line 492
    :goto_e
    sget-object v3, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    if-eq v2, v3, :cond_5

    const-string v2, "Existing destination mode, owner, or group metadata could not be fully restored."

    .line 493
    invoke-static {v11, v2}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    :try_end_17
    .catch Ll/ۗۛ᩻; {:try_start_17 .. :try_end_17} :catch_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_13
    .catch Ll/᩶ۖۜ; {:try_start_17 .. :try_end_17} :catch_12
    .catch Ljava/lang/RuntimeException; {:try_start_17 .. :try_end_17} :catch_11

    :cond_5
    if-nez v14, :cond_6

    .line 500
    :try_start_18
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_18
    .catch Ljava/lang/RuntimeException; {:try_start_18 .. :try_end_18} :catch_10
    .catch Ll/ۗۛ᩻; {:try_start_18 .. :try_end_18} :catch_17
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_13

    goto :goto_f

    :catch_10
    :try_start_19
    const-string v0, "SELinux context restoration could not be completed."

    .line 502
    invoke-static {v11, v0}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    :try_end_19
    .catch Ll/ۗۛ᩻; {:try_start_19 .. :try_end_19} :catch_17
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_13
    .catch Ll/᩶ۖۜ; {:try_start_19 .. :try_end_19} :catch_12
    .catch Ljava/lang/RuntimeException; {:try_start_19 .. :try_end_19} :catch_11

    :cond_6
    :goto_f
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v9, v2

    move-object v8, v15

    move-object/from16 v12, v19

    move-object/from16 v13, v25

    const/4 v7, 0x1

    const/4 v10, 0x1

    goto/16 :goto_4a

    :catch_11
    move-exception v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object/from16 v16, v1

    move-object/from16 v5, v18

    move-object/from16 v6, v19

    move-object/from16 v7, v25

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    goto/16 :goto_39

    :catch_12
    move-exception v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object/from16 v16, v1

    move-object v8, v15

    move-object/from16 v5, v18

    move-object/from16 v6, v19

    goto/16 :goto_2a

    :catch_13
    move-exception v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object/from16 v16, v1

    move-object v8, v15

    move-object/from16 v5, v18

    move-object/from16 v6, v19

    goto/16 :goto_2e

    :catch_14
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v6, v19

    const/4 v2, 0x1

    const/4 v3, 0x1

    goto/16 :goto_26

    :catch_15
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v6, v19

    const/4 v2, 0x1

    const/4 v3, 0x1

    goto/16 :goto_29

    :catch_16
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v6, v19

    const/4 v2, 0x1

    const/4 v3, 0x1

    goto/16 :goto_2d

    :catch_17
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object v8, v15

    move-object/from16 v5, v18

    goto/16 :goto_c

    :catch_18
    move-exception v0

    :goto_10
    move-object/from16 v9, v16

    goto :goto_13

    :catch_19
    move-exception v0

    :goto_11
    move-object/from16 v9, v16

    goto :goto_14

    :catch_1a
    move-exception v0

    :goto_12
    move-object/from16 v9, v16

    goto :goto_15

    :catch_1b
    move-exception v0

    goto :goto_16

    :catch_1c
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    goto :goto_10

    :catch_1d
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    goto :goto_11

    :catch_1e
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    goto :goto_12

    :catch_1f
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    move-object/from16 v9, v26

    :goto_13
    const/4 v1, 0x1

    goto/16 :goto_25

    :catch_20
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    move-object/from16 v9, v26

    :goto_14
    const/4 v1, 0x1

    goto/16 :goto_28

    :catch_21
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    move-object/from16 v9, v26

    :goto_15
    const/4 v1, 0x1

    goto/16 :goto_2c

    :catch_22
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    :goto_16
    const/4 v1, 0x1

    move-object v8, v15

    move-object/from16 v5, v18

    move-object/from16 v7, v25

    move-wide/from16 v14, v27

    goto/16 :goto_46

    :cond_7
    move-object/from16 v19, v15

    move-object/from16 v11, p0

    move-object/from16 v5, p4

    move-object/from16 v3, v16

    move-object/from16 v1, v17

    move-object/from16 v6, v19

    move-object/from16 v7, v25

    move-object/from16 v9, v26

    move-wide/from16 v14, v27

    goto/16 :goto_0

    :catch_23
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    goto :goto_17

    :catch_24
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x0

    move-object/from16 v5, v18

    move-object/from16 v6, v19

    goto/16 :goto_3

    :catch_25
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    goto :goto_18

    :catch_26
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    goto :goto_19

    :catch_27
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    move-object/from16 v19, v15

    move-object v15, v10

    goto :goto_1a

    :goto_17
    move-object/from16 v6, v19

    goto/16 :goto_24

    :goto_18
    move-object/from16 v6, v19

    goto/16 :goto_27

    :goto_19
    move-object/from16 v6, v19

    goto/16 :goto_2b

    :goto_1a
    move-object/from16 v6, v19

    goto/16 :goto_2f

    :catch_28
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    :goto_1b
    move-object v15, v10

    goto/16 :goto_24

    :catch_29
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    :goto_1c
    move-object v15, v10

    goto/16 :goto_27

    :catch_2a
    move-exception v0

    move-object/from16 v18, p4

    move-object v11, v8

    :goto_1d
    move-object v15, v10

    goto/16 :goto_2b

    :catch_2b
    move-exception v0

    :goto_1e
    move-object/from16 v18, p4

    move-object v11, v8

    :goto_1f
    move-object v15, v10

    goto/16 :goto_2f

    :catch_2c
    move-exception v0

    move-object/from16 v18, p4

    goto :goto_20

    :catch_2d
    move-exception v0

    move-object/from16 v18, p4

    goto :goto_21

    :catch_2e
    move-exception v0

    move-object/from16 v18, p4

    goto :goto_22

    :catch_2f
    move-exception v0

    move-object/from16 v18, p4

    goto :goto_23

    :catch_30
    move-exception v0

    move-object/from16 v18, v5

    :goto_20
    move-object/from16 v25, v7

    move-object v11, v8

    move-object/from16 v26, v9

    move-wide/from16 v27, v14

    goto :goto_1b

    :catch_31
    move-exception v0

    move-object/from16 v18, v5

    :goto_21
    move-object/from16 v25, v7

    move-object v11, v8

    move-object/from16 v26, v9

    move-wide/from16 v27, v14

    goto :goto_1c

    :catch_32
    move-exception v0

    move-object/from16 v18, v5

    :goto_22
    move-object/from16 v25, v7

    move-object v11, v8

    move-object/from16 v26, v9

    move-wide/from16 v27, v14

    goto :goto_1d

    :catch_33
    move-exception v0

    move-object/from16 v18, v5

    :goto_23
    move-object/from16 v25, v7

    move-object v11, v8

    move-wide/from16 v27, v14

    goto :goto_1f

    :goto_24
    const/4 v1, 0x0

    move-object/from16 v19, v6

    move-object/from16 v9, v26

    :goto_25
    const/4 v2, 0x0

    move v2, v1

    move-object/from16 v16, v9

    move-object/from16 v6, v19

    const/4 v3, 0x0

    :goto_26
    const/4 v1, 0x1

    move-object/from16 v5, v18

    move-object/from16 v7, v25

    goto/16 :goto_39

    :goto_27
    const/4 v1, 0x0

    move-object/from16 v19, v6

    move-object/from16 v9, v26

    :goto_28
    const/4 v2, 0x0

    move v2, v1

    move-object/from16 v16, v9

    move-object/from16 v6, v19

    const/4 v3, 0x0

    :goto_29
    move-object v8, v15

    move-object/from16 v5, v18

    :goto_2a
    move-object/from16 v7, v25

    goto/16 :goto_3c

    :goto_2b
    const/4 v1, 0x0

    move-object/from16 v19, v6

    move-object/from16 v9, v26

    :goto_2c
    const/4 v2, 0x0

    move v2, v1

    move-object/from16 v16, v9

    move-object/from16 v6, v19

    const/4 v3, 0x0

    :goto_2d
    move-object v8, v15

    move-object/from16 v5, v18

    :goto_2e
    move-object/from16 v7, v25

    goto/16 :goto_42

    :catch_34
    move-exception v0

    move-object/from16 v18, v5

    move-object/from16 v25, v7

    move-object v11, v8

    move-wide/from16 v27, v14

    move-object v15, v10

    move-object/from16 v7, v25

    goto :goto_30

    :catch_35
    move-exception v0

    move-object/from16 v18, v5

    move-object/from16 v25, v7

    move-object v11, v8

    move-wide/from16 v27, v14

    move-object v15, v10

    move-object/from16 v7, v25

    goto :goto_31

    :catch_36
    move-exception v0

    move-object/from16 v18, v5

    move-object/from16 v25, v7

    move-object v11, v8

    move-wide/from16 v27, v14

    move-object v15, v10

    move-object/from16 v7, v25

    goto :goto_32

    :goto_2f
    move-object v8, v15

    move-object/from16 v5, v18

    move-object/from16 v7, v25

    goto :goto_33

    :catch_37
    move-exception v0

    move-object/from16 v18, v5

    move-object v11, v8

    move-wide/from16 v27, v14

    move-object v15, v10

    :goto_30
    const/4 v1, 0x1

    move-wide/from16 v13, v27

    goto :goto_34

    :catch_38
    move-exception v0

    move-object/from16 v18, v5

    move-object v11, v8

    move-wide/from16 v27, v14

    move-object v15, v10

    :goto_31
    move-wide/from16 v13, v27

    goto :goto_35

    :catch_39
    move-exception v0

    move-object/from16 v18, v5

    move-object v11, v8

    move-wide/from16 v27, v14

    move-object v15, v10

    :goto_32
    move-wide/from16 v13, v27

    goto :goto_37

    :catch_3a
    move-exception v0

    move-object/from16 v18, v5

    move-object v11, v8

    move-wide/from16 v27, v14

    move-object v15, v10

    move-object v8, v15

    move-object/from16 v5, v18

    :goto_33
    move-wide/from16 v13, v27

    goto/16 :goto_45

    :catch_3b
    move-exception v0

    move-object/from16 v18, v5

    move-object v11, v8

    move-object v15, v10

    const/4 v1, 0x0

    :goto_34
    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v16, v9

    move-wide/from16 v27, v13

    move-object/from16 v5, v18

    goto/16 :goto_39

    :catch_3c
    move-exception v0

    move-object/from16 v18, v5

    move-object v11, v8

    move-object v15, v10

    :goto_35
    const/4 v1, 0x0

    :goto_36
    const/4 v3, 0x0

    move v2, v1

    move-object/from16 v16, v9

    move-wide/from16 v27, v13

    move-object v8, v15

    move-object/from16 v5, v18

    goto/16 :goto_3c

    :catch_3d
    move-exception v0

    move-object/from16 v18, v5

    move-object v11, v8

    move-object v15, v10

    :goto_37
    const/4 v1, 0x0

    :goto_38
    const/4 v3, 0x0

    move v2, v1

    move-object/from16 v16, v9

    move-wide/from16 v27, v13

    move-object v8, v15

    move-object/from16 v5, v18

    goto/16 :goto_42

    :catch_3e
    move-exception v0

    move-object/from16 v18, v5

    move-object v11, v8

    move-object v15, v10

    move-object v8, v15

    move-object/from16 v5, v18

    goto/16 :goto_45

    :catch_3f
    move-exception v0

    move-object v11, v8

    move-object v15, v10

    move-object v8, v15

    goto/16 :goto_3b

    :catch_40
    move-exception v0

    move-object v11, v8

    move-object v15, v10

    move-object v8, v15

    goto/16 :goto_41

    :catch_41
    move-exception v0

    move-object v11, v8

    move-object v15, v10

    move-object v8, v15

    goto/16 :goto_44

    :catch_42
    move-exception v0

    move-object v11, v8

    move-object v15, v10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v16, v9

    move-wide/from16 v27, v13

    :goto_39
    if-eqz v1, :cond_a

    .line 532
    invoke-static {v0}, Ll/۬ۖۜ;->ܽ(Ljava/lang/RuntimeException;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_3a

    :cond_8
    if-eqz v2, :cond_9

    .line 536
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 535
    invoke-static {v11, v15, v7, v6, v0}, Ll/۬ۖۜ;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    const/4 v1, 0x0

    move-object v9, v1

    move v10, v3

    move-object/from16 v18, v5

    move-object v12, v6

    move-object v13, v7

    move-object v8, v15

    move v7, v2

    goto/16 :goto_4a

    .line 541
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v17

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v12, "FILE_STORAGE_ERROR"

    const-string v13, "The storage backend failed while preparing local file content."

    const/16 v18, 0x0

    const/16 v20, 0x1

    move-object/from16 v14, p1

    move-object v8, v15

    goto :goto_3d

    :cond_a
    :goto_3a
    move-object v8, v15

    const/4 v1, 0x0

    goto :goto_3f

    :catch_43
    move-exception v0

    move-object v11, v8

    move-object v8, v10

    :goto_3b
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v16, v9

    move-wide/from16 v27, v13

    .line 520
    :goto_3c
    iget-object v0, v0, Ll/᩶ۖۜ;->᩸:Ljava/lang/RuntimeException;

    if-eqz v2, :cond_b

    .line 522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 521
    invoke-static {v11, v8, v7, v6, v0}, Ll/۬ۖۜ;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_3e

    .line 527
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v17

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v12, "FILE_STORAGE_ERROR"

    const-string v13, "The storage backend failed while preparing local file content."

    const/16 v18, 0x0

    const/16 v20, 0x1

    move-object/from16 v14, p1

    :goto_3d
    move-object v15, v7

    move-object/from16 v19, v6

    move-object/from16 v21, v11

    .line 1589
    invoke-static/range {v12 .. v23}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    :goto_3e
    const/4 v1, 0x0

    move-object/from16 v29, v1

    move-object v1, v0

    move-object/from16 v0, v29

    :goto_3f
    move/from16 v29, v2

    move-object v2, v0

    move-object v0, v1

    :goto_40
    move/from16 v1, v29

    goto :goto_49

    :catch_44
    move-exception v0

    move-object v11, v8

    move-object v8, v10

    :goto_41
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v16, v9

    move-wide/from16 v27, v13

    :goto_42
    if-eqz v2, :cond_c

    .line 511
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 510
    invoke-static {v11, v8, v7, v6, v0}, Ll/۬ۖۜ;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_43

    .line 516
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v17

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v12, "FILE_STORAGE_ERROR"

    const-string v13, "Failed to prepare local file content for publication."

    const/16 v18, 0x0

    const/16 v20, 0x1

    move-object/from16 v14, p1

    move-object v15, v7

    move-object/from16 v19, v6

    move-object/from16 v21, v11

    .line 1589
    invoke-static/range {v12 .. v23}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    :goto_43
    const/4 v1, 0x0

    goto :goto_48

    :catch_45
    move-exception v0

    move-object v11, v8

    move-object v8, v10

    :goto_44
    const/4 v5, 0x0

    :goto_45
    const/4 v1, 0x0

    move-object/from16 v19, v6

    move-wide v14, v13

    :goto_46
    const/4 v2, 0x0

    :goto_47
    const/4 v3, 0x0

    move-wide/from16 v27, v14

    move-object/from16 v6, v19

    move/from16 v29, v2

    move v2, v1

    move-object v1, v3

    move/from16 v3, v29

    :goto_48
    move/from16 v29, v2

    move-object v2, v1

    goto :goto_40

    :goto_49
    move-object v9, v2

    move v10, v3

    move-object/from16 v18, v5

    move-object v12, v6

    move-object v13, v7

    move v7, v1

    :goto_4a
    move-object/from16 v1, p0

    move-object/from16 v2, v24

    move-object/from16 v3, p1

    move v4, v7

    move-object v5, v11

    move-object v6, v9

    .line 545
    invoke-direct/range {v1 .. v6}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/RuntimeException;)V

    if-nez v9, :cond_12

    if-eqz v0, :cond_11

    .line 549
    iget-object v1, v0, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    const-string v2, "FILE_OPERATION_STATE_UNKNOWN"

    .line 550
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    if-eqz v7, :cond_d

    if-nez v10, :cond_e

    const-string v2, "atomic"

    .line 552
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    :cond_d
    const/4 v2, 0x1

    goto :goto_4b

    :cond_e
    const/4 v2, 0x0

    .line 1513
    :goto_4b
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 1514
    iget-object v4, v0, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v5, v0, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    iget-object v6, v0, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    invoke-virtual {v4}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbin/mt/json/JSONObject$Member;

    .line 1515
    invoke-virtual {v7}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v7

    invoke-virtual {v3, v9, v7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_4c

    :cond_f
    const-string v4, "localPath"

    .line 1517
    invoke-virtual {v3, v4, v8}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "policyRevision"

    .line 1518
    invoke-virtual {v4, v7, v13}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    xor-int/lit8 v7, v2, 0x1

    const-string v8, "changed"

    .line 1519
    invoke-virtual {v4, v8, v7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "operationMode"

    .line 1520
    invoke-virtual {v4, v7, v12}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v7, "stateKnown"

    .line 1521
    invoke-virtual {v4, v7, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    new-instance v4, Lbin/mt/json/JSONArray;

    invoke-direct {v4, v11}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string v7, "warnings"

    .line 1522
    invoke-virtual {v2, v7, v4}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "bytesCopied"

    sget-object v7, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    .line 1524
    invoke-virtual {v2, v4, v7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 1525
    iget-boolean v2, v0, Ll/ۗۛ᩻;->۫:Z

    if-eqz v2, :cond_10

    .line 1526
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v6, v5, v3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_4d

    .line 1528
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v6, v5, v3}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 553
    :goto_4d
    throw v0

    .line 556
    :cond_11
    new-instance v0, Ll/ۙۖۜ;

    new-instance v5, Lbin/mt/json/JSONArray;

    invoke-direct {v5, v11}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    move-object v1, v0

    move-object/from16 v2, v18

    move-object/from16 v3, p1

    move-object v4, v12

    move-wide/from16 v6, v27

    invoke-direct/range {v1 .. v7}, Ll/ۙۖۜ;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;J)V

    return-object v0

    .line 547
    :cond_12
    throw v9
.end method

.method public static ֫(Ll/᩸ۢۜ;Ll/ܶ᩵ܿ;)Ll/ۚۖۜ;
    .locals 3

    const/4 v0, 0x0

    .line 1120
    :try_start_0
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1124
    new-instance v0, Ll/ۘۖۜ;

    new-instance v1, Ll/᩹ۖۜ;

    invoke-direct {v1, p1}, Ll/᩹ۖۜ;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v1}, Ll/ۘۖۜ;-><init>(Ljava/io/OutputStream;)V

    .line 1127
    new-instance p1, Ljava/io/BufferedOutputStream;

    const/high16 v1, 0x10000

    invoke-direct {p1, v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 1128
    :try_start_1
    iget-object v1, p0, Ll/᩸ۢۜ;->֫:Ll/۫ۢۜ;

    iget-object v2, p0, Ll/᩸ۢۜ;->ۧ:Ll/ۙۢۜ;

    iget-object p0, p0, Ll/᩸ۢۜ;->ܽ:Ll/ۜۜۜ;

    invoke-static {v1, v2, p0, p1}, Ll/۫ۢۜ;->֫(Ll/۫ۢۜ;Ll/ۙۢۜ;Ll/ۜۜۜ;Ljava/io/BufferedOutputStream;)Ll/ۡ᩷ۜ;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1129
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 1130
    new-instance p1, Ll/ۚۖۜ;

    invoke-static {v0}, Ll/ۘۖۜ;->֫(Ll/ۘۖۜ;)J

    move-result-wide v0

    invoke-direct {p1, v0, v1, p0}, Ll/ۚۖۜ;-><init>(JLjava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p0

    .line 1127
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0

    :catch_0
    move-exception p0

    .line 1134
    instance-of p1, p0, Ll/᩶ۖۜ;

    if-nez p1, :cond_1

    .line 1135
    invoke-static {p0}, Ll/۬ۖۜ;->ܽ(Ljava/lang/RuntimeException;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    .line 1138
    :cond_0
    new-instance p1, Ll/᩶ۖۜ;

    invoke-direct {p1, p0}, Ll/᩶ۖۜ;-><init>(Ljava/lang/RuntimeException;)V

    move-object p0, p1

    .line 1122
    :cond_1
    :goto_1
    throw p0
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;Ll/۟ۢۜ;)Ll/۠ۖۜ;
    .locals 27

    move-object/from16 v11, p0

    move-object/from16 v15, p1

    move-object/from16 v0, p2

    move-object/from16 v14, p4

    .line 664
    iget-object v12, v11, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v12, v15}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 1417
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v1

    invoke-direct {v11, v1}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v1

    .line 666
    invoke-direct {v11, v1, v15}, Ll/۬ۖۜ;->ܽ(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 667
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_12

    .line 673
    invoke-virtual {v12, v8}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 674
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v2, v3, :cond_0

    .line 676
    invoke-virtual {v14, v8}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 678
    :cond_0
    iget-object v13, v14, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-direct {v11, v7, v15, v13}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 902
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v2

    invoke-direct {v11, v15, v2, v13}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ۤ᩵ܿ;Ljava/lang/String;)V

    const-string v2, "read_source"

    .line 681
    invoke-direct {v11, v15, v1, v13, v2}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩷ۖۜ;

    move-result-object v10

    iget-boolean v6, v10, Ll/᩷ۖۜ;->֫:Z

    .line 1349
    iget-object v1, v10, Ll/᩷ۖۜ;->ܽ:Ljava/lang/String;

    .line 1350
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 685
    new-instance v5, Ll/ܶۖۜ;

    iget-boolean v4, v10, Ll/᩷ۖۜ;->֫:Z

    iget-wide v2, v10, Ll/᩷ۖۜ;->ۧ:J

    iget-object v1, v10, Ll/᩷ۖۜ;->ܽ:Ljava/lang/String;

    move-object/from16 v16, v1

    move-object v1, v5

    move/from16 v17, v4

    move-object v4, v7

    move-object/from16 v18, v12

    move-object v12, v5

    move-object/from16 v5, v16

    move-object/from16 v16, v10

    move v10, v6

    move/from16 v6, v17

    invoke-direct/range {v1 .. v6}, Ll/ܶۖۜ;-><init>(JLl/ܶ᩵ܿ;Ljava/lang/String;Z)V

    .line 688
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v6

    .line 690
    invoke-direct {v11, v9, v14, v6}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Lbin/mt/json/JSONArray;)V

    .line 691
    invoke-direct {v11, v6, v15, v8, v13}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 693
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v9

    .line 1212
    invoke-static {v3, v10}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Z)Ll/֨ۖۜ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;

    const/16 v24, 0x0

    .line 702
    :try_start_0
    iget-object v2, v14, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    move-object/from16 v4, p3

    invoke-static {v15, v3, v12, v4, v2}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ܶۖۜ;Ll/ۢۖۜ;Ljava/lang/String;)Ll/᩷ۖۜ;

    move-result-object v12
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_20
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1f
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1e

    :try_start_1
    const-string v2, "pre_publish_version"

    .line 1417
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v5

    invoke-direct {v11, v5}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v5

    .line 1313
    invoke-direct {v11, v5, v15}, Ll/۬ۖۜ;->ܽ(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 1314
    invoke-direct {v11, v15, v5, v13, v2}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩷ۖۜ;

    move-result-object v2

    .line 1349
    iget-object v5, v2, Ll/᩷ۖۜ;->ܽ:Ljava/lang/String;

    .line 1350
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_1c
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1b
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1d

    if-eqz v17, :cond_6

    move-object/from16 v0, v16

    .line 709
    :try_start_2
    invoke-static {v0, v12}, Ll/۬ۖۜ;->֫(Ll/᩷ۖۜ;Ll/᩷ۖۜ;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 710
    invoke-direct {v11, v7, v15, v13}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 712
    invoke-static {v3, v10}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Z)Ll/֨ۖۜ;

    move-result-object v0

    .line 713
    iget-object v5, v0, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_14
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_13
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_12

    if-eqz v10, :cond_2

    .line 718
    :try_start_3
    new-instance v1, Ll/ܿ᩵ܿ;

    invoke-direct {v1}, Ll/ܿ᩵ܿ;-><init>()V

    .line 720
    invoke-virtual {v1, v7}, Ll/ܿ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Ll/ܽ᩵ܿ;

    move-result-object v2

    move-object/from16 p2, v1

    .line 721
    sget-object v1, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    if-eq v2, v1, :cond_1

    const-string v1, "Existing mode, owner, or group metadata could not be fully captured."

    .line 722
    invoke-virtual {v6, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p2

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_0
    move-object/from16 v2, v24

    .line 729
    :goto_1
    :try_start_4
    invoke-virtual/range {v18 .. v18}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    .line 730
    invoke-virtual {v1, v15}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 731
    invoke-virtual {v1, v15}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_f
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_d

    if-nez v10, :cond_3

    .line 733
    :try_start_5
    invoke-virtual {v1, v8}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_5

    :goto_2
    const/4 v1, 0x0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v6, v14

    move-object v7, v15

    goto/16 :goto_15

    :goto_3
    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v3, v12

    move-object v4, v13

    move-object v6, v14

    move-object v7, v15

    goto/16 :goto_19

    :goto_4
    const/4 v1, 0x0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v6, v14

    move-object v7, v15

    goto/16 :goto_1c

    .line 736
    :cond_3
    :goto_5
    :try_start_6
    iget-object v8, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-direct {v11, v7, v15, v8}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 738
    invoke-interface/range {p3 .. p3}, Ll/ۢۖۜ;->֫()V
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_f
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_d

    move-object v10, v9

    .line 740
    :try_start_7
    iget-wide v8, v12, Ll/᩷ۖۜ;->ۧ:J

    iget-object v4, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 1219
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v16

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v17
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_c
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_a

    move-object/from16 v1, p0

    move-object/from16 v19, v12

    move-object v12, v2

    move-object/from16 v2, p1

    move-object/from16 v20, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v5

    move-object v5, v7

    move-object v7, v6

    move-object/from16 v6, v17

    move-object v11, v7

    move-object v7, v0

    move-object/from16 v25, v10

    move-object/from16 v10, v20

    :try_start_8
    invoke-direct/range {v1 .. v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;JLjava/lang/String;)V
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_9
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_7

    move-object/from16 v0, v18

    .line 744
    :try_start_9
    invoke-virtual {v0, v15}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    if-eqz v12, :cond_4

    .line 747
    invoke-virtual {v12, v0}, Ll/ܿ᩵ܿ;->ܽ(Ll/ܶ᩵ܿ;)Ll/ܽ᩵ܿ;

    move-result-object v1

    .line 748
    sget-object v2, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    if-eq v1, v2, :cond_4

    const-string v1, "Existing mode, owner, or group metadata could not be fully restored."

    .line 749
    invoke-virtual {v11, v1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;
    :try_end_9
    .catch Ll/ۗۛ᩻; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_4

    .line 753
    :cond_4
    :try_start_a
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ll/ۗۛ᩻; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    goto :goto_6

    :catch_3
    :try_start_b
    const-string v0, "SELinux context restoration could not be completed."

    .line 755
    invoke-virtual {v11, v0}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;
    :try_end_b
    .catch Ll/ۗۛ᩻; {:try_start_b .. :try_end_b} :catch_6
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_4

    :goto_6
    const/4 v0, 0x1

    const/4 v1, 0x1

    move-object/from16 v12, v19

    goto/16 :goto_c

    :catch_4
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    goto/16 :goto_b

    :catch_5
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object v4, v13

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v5, v16

    move-object/from16 v3, v19

    goto/16 :goto_19

    :catch_6
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v5, v16

    move-object/from16 v12, v19

    goto/16 :goto_1d

    :catch_7
    move-exception v0

    goto :goto_7

    :catch_8
    move-exception v0

    goto :goto_8

    :catch_9
    move-exception v0

    goto :goto_9

    :catch_a
    move-exception v0

    move-object/from16 v16, v5

    move-object v11, v6

    move-object/from16 v25, v10

    move-object/from16 v19, v12

    goto :goto_7

    :catch_b
    move-exception v0

    move-object/from16 v16, v5

    move-object v11, v6

    move-object/from16 v25, v10

    move-object/from16 v19, v12

    goto :goto_8

    :catch_c
    move-exception v0

    move-object/from16 v16, v5

    move-object v11, v6

    move-object/from16 v25, v10

    move-object/from16 v19, v12

    goto :goto_9

    :goto_7
    const/4 v1, 0x1

    goto :goto_a

    :goto_8
    const/4 v1, 0x1

    move-object/from16 v1, v16

    const/4 v2, 0x1

    goto/16 :goto_f

    :goto_9
    const/4 v1, 0x1

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v5, v16

    move-object/from16 v12, v19

    goto/16 :goto_1c

    :catch_d
    move-exception v0

    move-object/from16 v16, v5

    move-object v11, v6

    move-object/from16 v25, v9

    move-object/from16 v19, v12

    const/4 v1, 0x0

    :goto_a
    const/4 v2, 0x0

    :goto_b
    move-object v6, v14

    move-object v7, v15

    move-object/from16 v12, v19

    goto/16 :goto_16

    :catch_e
    move-exception v0

    move-object/from16 v16, v5

    move-object v11, v6

    move-object/from16 v25, v9

    move-object/from16 v19, v12

    move-object/from16 v1, v16

    goto :goto_e

    :catch_f
    move-exception v0

    move-object/from16 v16, v5

    move-object v11, v6

    move-object/from16 v25, v9

    move-object/from16 v19, v12

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v1, v16

    move-object/from16 v12, v19

    goto/16 :goto_1b

    :cond_5
    move-object v11, v6

    move-object/from16 v25, v9

    move-object/from16 v19, v12

    .line 760
    :try_start_c
    invoke-interface/range {p3 .. p3}, Ll/ۢۖۜ;->֫()V
    :try_end_c
    .catch Ll/ۗۛ᩻; {:try_start_c .. :try_end_c} :catch_1a
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_11
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_10

    const/4 v0, 0x0

    const/4 v3, 0x0

    move-object/from16 v16, v1

    move-object v12, v2

    const/4 v1, 0x0

    :goto_c
    move-object/from16 v8, p0

    move v3, v1

    move-object v9, v11

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v5, v16

    move-object/from16 v2, v24

    move-object v4, v2

    goto/16 :goto_1f

    :catch_10
    move-exception v0

    goto :goto_d

    :catch_11
    move-exception v0

    goto :goto_e

    :catch_12
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object/from16 v19, v12

    :goto_d
    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v16, v1

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v12, v19

    const/4 v1, 0x0

    const/4 v2, 0x0

    goto/16 :goto_16

    :catch_13
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object/from16 v19, v12

    :goto_e
    const/4 v2, 0x0

    :goto_f
    move-object v4, v13

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v12, v19

    goto/16 :goto_18

    :catch_14
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object/from16 v19, v12

    goto :goto_10

    :cond_6
    move-object v11, v6

    move-object/from16 v25, v9

    move-object/from16 v19, v12

    :try_start_d
    const-string v12, "FILE_TARGET_VERSION_MISMATCH"

    const-string v0, "The file targetVersion no longer matches the current content."

    const-string v16, "target_version"

    const-string v17, "target_version_mismatch"

    .line 1354
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v21
    :try_end_d
    .catch Ll/ۗۛ᩻; {:try_start_d .. :try_end_d} :catch_1a
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_19
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_18

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/16 v20, 0x1

    move-object/from16 v3, v19

    move-object v4, v13

    move-object v13, v0

    move-object v6, v14

    move-object/from16 v14, p1

    move-object v7, v15

    move-object v15, v4

    move-object/from16 v19, v2

    move-object/from16 v22, p2

    move-object/from16 v23, v5

    .line 1351
    :try_start_e
    invoke-static/range {v12 .. v23}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_e
    .catch Ll/ۗۛ᩻; {:try_start_e .. :try_end_e} :catch_17
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_15
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_16

    :catch_15
    move-exception v0

    goto :goto_12

    :catch_16
    move-exception v0

    goto :goto_11

    :catch_17
    move-exception v0

    goto :goto_13

    :catch_18
    move-exception v0

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v3, v19

    goto :goto_11

    :catch_19
    move-exception v0

    move-object v4, v13

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v3, v19

    goto :goto_12

    :catch_1a
    move-exception v0

    :goto_10
    move-object v6, v14

    move-object v7, v15

    move-object/from16 v3, v19

    goto :goto_13

    :catch_1b
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v3, v12

    move-object v4, v13

    move-object v6, v14

    move-object v7, v15

    goto :goto_12

    :catch_1c
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v3, v12

    move-object v6, v14

    move-object v7, v15

    goto :goto_13

    :catch_1d
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v3, v12

    move-object v6, v14

    move-object v7, v15

    :goto_11
    move-object v12, v3

    goto :goto_14

    :goto_12
    move-object v12, v3

    goto :goto_17

    :goto_13
    move-object v12, v3

    goto/16 :goto_1b

    :catch_1e
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v12, v24

    :goto_14
    const/4 v2, 0x0

    move-object v5, v1

    const/4 v1, 0x0

    :goto_15
    const/4 v2, 0x0

    move-object/from16 v16, v5

    :goto_16
    move-object/from16 v26, v24

    move-object/from16 v24, v0

    move v0, v1

    move-object/from16 v1, v26

    goto/16 :goto_1e

    :catch_1f
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v4, v13

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v12, v24

    :goto_17
    const/4 v2, 0x0

    :goto_18
    const/4 v3, 0x0

    move-object v5, v1

    move v1, v2

    move-object v3, v12

    const/4 v2, 0x0

    :goto_19
    if-eqz v1, :cond_7

    .line 768
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 767
    invoke-static {v11, v7, v4, v5, v0}, Ll/۬ۖۜ;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_1a

    .line 770
    :cond_7
    iget-object v15, v6, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 773
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v17

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v12, "FILE_STORAGE_ERROR"

    const-string v13, "Failed to prepare local file content for publication."

    const-string v16, "write_temp"

    const/16 v18, 0x0

    const/16 v20, 0x1

    move-object/from16 v14, p1

    move-object/from16 v19, v5

    move-object/from16 v21, v11

    .line 1589
    invoke-static/range {v12 .. v23}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    :goto_1a
    move-object/from16 v8, p0

    move-object v4, v0

    move-object v12, v3

    move-object v9, v11

    move-object/from16 v10, v25

    move v3, v2

    move-object/from16 v2, v24

    goto :goto_20

    :catch_20
    move-exception v0

    move-object v11, v6

    move-object/from16 v25, v9

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v12, v24

    :goto_1b
    const/4 v2, 0x0

    move-object v5, v1

    const/4 v1, 0x0

    :goto_1c
    const/4 v2, 0x0

    :goto_1d
    move-object/from16 v16, v5

    move/from16 v26, v1

    move-object v1, v0

    move/from16 v0, v26

    :goto_1e
    move-object/from16 v8, p0

    move-object v4, v1

    move v3, v2

    move-object v9, v11

    move-object/from16 v5, v16

    move-object/from16 v2, v24

    :goto_1f
    move-object/from16 v10, v25

    move v1, v0

    .line 780
    :goto_20
    invoke-direct {v8, v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "A temporary MCP file could not be removed."

    .line 782
    invoke-virtual {v9, v0}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    if-eqz v2, :cond_8

    .line 784
    new-instance v0, Ljava/io/IOException;

    const-string v10, "A temporary MCP file could not be removed"

    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    if-eqz v1, :cond_9

    .line 791
    :try_start_f
    iget-object v0, v8, Ll/۬ۖۜ;->֫:Ll/᩻ᩳᩴ;

    invoke-virtual {v0, v7}, Ll/᩻ᩳᩴ;->֫(Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_21

    goto :goto_21

    :catch_21
    move-exception v0

    const-string v10, "File change notification could not be completed."

    .line 793
    invoke-virtual {v9, v10}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    if-eqz v2, :cond_9

    if-eq v0, v2, :cond_9

    .line 795
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    :goto_21
    if-nez v2, :cond_10

    if-eqz v4, :cond_e

    if-eqz v1, :cond_b

    if-nez v3, :cond_a

    const-string v0, "atomic"

    .line 807
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_22

    :cond_a
    const/4 v0, 0x0

    goto :goto_23

    :cond_b
    :goto_22
    const/4 v0, 0x1

    .line 1465
    :goto_23
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 1467
    iget-object v2, v4, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v3, v4, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    iget-object v6, v4, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    iget-object v10, v4, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    invoke-virtual {v2}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lbin/mt/json/JSONObject$Member;

    .line 1468
    invoke-virtual {v11}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v11

    invoke-virtual {v1, v12, v11}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_24

    :cond_c
    const-string v2, "path"

    .line 1470
    invoke-virtual {v1, v2, v7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    xor-int/lit8 v7, v0, 0x1

    const-string v11, "changed"

    .line 1471
    invoke-virtual {v2, v11, v7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "operationMode"

    .line 1472
    invoke-virtual {v2, v7, v5}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "stateKnown"

    .line 1473
    invoke-virtual {v2, v5, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    new-instance v2, Lbin/mt/json/JSONArray;

    invoke-direct {v2, v9}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string v5, "warnings"

    .line 1474
    invoke-virtual {v0, v5, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 1475
    iget-boolean v0, v4, Ll/ۗۛ᩻;->۫:Z

    if-eqz v0, :cond_d

    .line 1476
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0, v6, v3, v1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_25

    .line 1478
    :cond_d
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0, v6, v3, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 808
    :goto_25
    throw v0

    :cond_e
    if-eqz v12, :cond_f

    .line 815
    new-instance v0, Ll/۠ۖۜ;

    new-instance v4, Lbin/mt/json/JSONArray;

    invoke-direct {v4, v9}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    iget-wide v5, v12, Ll/᩷ۖۜ;->ۧ:J

    iget-object v9, v12, Ll/᩷ۖۜ;->ܽ:Ljava/lang/String;

    move-object v1, v0

    move-object/from16 v2, p1

    move-object v7, v9

    invoke-direct/range {v1 .. v7}, Ll/۠ۖۜ;-><init>(Ljava/lang/String;ZLbin/mt/json/JSONArray;JLjava/lang/String;)V

    return-object v0

    .line 811
    :cond_f
    iget-object v15, v6, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v12, "FILE_STORAGE_ERROR"

    const-string v13, "No output content was produced."

    const-string v16, "write_temp"

    const-string v17, "missing_output"

    const/16 v18, 0x0

    const/16 v20, 0x1

    move-object/from16 v14, p1

    move-object/from16 v19, v5

    move-object/from16 v21, v9

    .line 1589
    invoke-static/range {v12 .. v23}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 811
    throw v0

    .line 801
    :cond_10
    throw v2

    :cond_11
    move-object v8, v11

    move-object v4, v13

    move-object v7, v15

    const/16 v20, 0x1

    .line 1354
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v21

    const-string v12, "FILE_TARGET_VERSION_MISMATCH"

    const-string v13, "The file targetVersion no longer matches the current content."

    const-string v16, "target_version"

    const-string v17, "target_version_mismatch"

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v14, p1

    move-object v15, v4

    move-object/from16 v22, p2

    move-object/from16 v23, v1

    .line 1351
    invoke-static/range {v12 .. v23}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_12
    move-object v8, v11

    move-object v6, v14

    move-object v7, v15

    .line 669
    iget-object v15, v6, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 671
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v12, "FILE_PARENT_NOT_FOUND"

    const-string v13, "The target has no writable parent directory."

    const-string v16, "prepare"

    const-string v17, "parent_missing"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object/from16 v14, p1

    .line 1589
    invoke-static/range {v12 .. v23}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 669
    throw v0
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;ZLl/۟ۢۜ;Lbin/mt/json/JSONArray;)Ll/ۡۖۜ;
    .locals 21

    move-object/from16 v8, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    .line 564
    iget-object v3, v8, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v3, v2}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 565
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v5

    .line 566
    invoke-direct {v8, v5}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v6

    .line 567
    invoke-direct {v8, v6, v2}, Ll/۬ۖۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const-string v7, "The local destination"

    goto :goto_0

    :cond_0
    const-string v7, "The destination"

    :goto_0
    if-nez p3, :cond_3

    .line 569
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v9

    sget-object v10, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v9, v10, :cond_1

    goto :goto_2

    .line 570
    :cond_1
    iget-object v13, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v0, " already exists and overwrite is false."

    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v9, "FILE_ALREADY_EXISTS"

    const-string v14, "destination_stat"

    const-string v15, "already_exists"

    if-nez p2, :cond_2

    .line 597
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/4 v0, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object/from16 v11, p1

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move v15, v0

    .line 1589
    invoke-static/range {v9 .. v20}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/16 v18, 0x1

    .line 599
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v19

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v11, p2

    move-object/from16 v12, p1

    .line 598
    invoke-static/range {v9 .. v19}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 570
    :goto_1
    throw v0

    .line 574
    :cond_3
    :goto_2
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 581
    invoke-virtual {v0, v9}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    iget-object v7, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    .line 582
    invoke-virtual {v3, v9}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 583
    invoke-direct {v8, v4, v2, v7}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    .line 902
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v10

    invoke-direct {v8, v2, v10, v7}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ۤ᩵ܿ;Ljava/lang/String;)V

    .line 585
    invoke-direct {v8, v3, v0, v1}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Lbin/mt/json/JSONArray;)V

    .line 586
    invoke-direct {v8, v1, v2, v9, v7}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 587
    new-instance v10, Ll/ۡۖۜ;

    .line 588
    invoke-virtual {v6}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    const/4 v11, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_3
    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move-object v6, v7

    move v7, v11

    invoke-direct/range {v0 .. v7}, Ll/ۡۖۜ;-><init>(Ll/۬ۖۜ;Ljava/lang/String;Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/ܶ᩵ܿ;Z)V

    return-object v10

    .line 576
    :cond_5
    iget-object v13, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v0, " has no writable parent directory."

    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v9, "FILE_PARENT_NOT_FOUND"

    const-string v14, "prepare"

    const-string v15, "parent_missing"

    if-nez p2, :cond_6

    .line 597
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/4 v0, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object/from16 v11, p1

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move v15, v0

    .line 1589
    invoke-static/range {v9 .. v20}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_4

    :cond_6
    const/16 v18, 0x1

    .line 599
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v19

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v11, p2

    move-object/from16 v12, p1

    .line 598
    invoke-static/range {v9 .. v19}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 576
    :goto_4
    throw v0
.end method

.method private ֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;
    .locals 1

    .line 1423
    :try_start_0
    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object p1
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 1425
    iget-object v0, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ᩳۖۜ;->֫(Ll/᩹᩵ܿ;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/۬ۖۜ;Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 19

    move-object/from16 v1, p3

    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v3, v0, :cond_4

    .line 937
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, ".mt-mcp-"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Ll/۬ۖۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x12

    new-array v4, v4, [B

    .line 1071
    sget-object v5, Ll/۬ۖۜ;->ܿ:Ljava/security/SecureRandom;

    invoke-virtual {v5, v4}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 1072
    invoke-static {v4}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v4

    .line 938
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".tmp"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "/"

    .line 1683
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 0
    invoke-static {v4, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-static {v1, v4, v0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object/from16 v4, p0

    .line 939
    iget-object v5, v4, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v5, v0}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 940
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v5

    .line 941
    sget-object v6, Ll/۬᩵ܿ;->᩶:Ll/۬᩵ܿ;

    invoke-virtual {v5, v6}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v6

    sget-object v7, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq v6, v7, :cond_3

    .line 949
    :try_start_0
    invoke-virtual {v5}, Ll/ۤ᩵ܿ;->ܽ()V
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v6, v0

    .line 952
    invoke-virtual {v6}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v0

    sget-object v7, Ll/᩸᩵ܿ;->᩹:Ll/᩸᩵ܿ;

    if-ne v0, v7, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1386
    :cond_1
    :try_start_1
    invoke-virtual {v5}, Ll/ۤ᩵ܿ;->֫()Z

    move-result v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    nop

    :goto_2
    if-nez v2, :cond_2

    const-string v0, "A temporary MCP file could not be removed after creation failed."

    move-object/from16 v1, p1

    .line 957
    invoke-static {v1, v0}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    move-object/from16 v1, p1

    .line 962
    :goto_3
    invoke-virtual {v6}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v7, "FILE_STORAGE_ERROR"

    const-string v8, "Failed to create an MCP temporary file."

    const-string v11, "create_temp"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object/from16 v9, p2

    move-object/from16 v10, p4

    move-object/from16 v16, p1

    .line 1589
    invoke-static/range {v7 .. v18}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 960
    throw v0

    :cond_3
    move-object/from16 v1, p1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v7, "FILE_BACKEND_UNSUPPORTED"

    const-string v8, "The storage backend cannot safely create an MCP temporary file."

    const-string v11, "create_temp"

    const-string v12, "exclusive_create_unsupported"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object/from16 v9, p2

    move-object/from16 v10, p4

    move-object/from16 v16, p1

    .line 1589
    invoke-static/range {v7 .. v18}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 943
    throw v0

    :cond_4
    move-object/from16 v4, p0

    move-object/from16 v1, p1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v7, "FILE_STORAGE_ERROR"

    const-string v8, "Unable to allocate a unique MCP temporary file name."

    const-string v11, "create_temp"

    const-string v12, "name_collision"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object/from16 v9, p2

    move-object/from16 v10, p4

    move-object/from16 v16, p1

    .line 1589
    invoke-static/range {v7 .. v18}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 966
    throw v0
.end method

.method private ֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ll/ܺۖۜ;
    .locals 30

    move-object/from16 v11, p0

    move-object/from16 v0, p1

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    .line 203
    iget-object v14, v11, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v14, v12}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 204
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v1

    .line 205
    invoke-direct {v11, v1}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v15

    .line 206
    invoke-direct {v11, v15, v12}, Ll/۬ۖۜ;->ۧ(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 207
    invoke-virtual {v15}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v1

    const-wide v3, 0x1fffffffffffffL

    cmp-long v5, v1, v3

    if-gtz v5, :cond_13

    .line 214
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v5, p1

    move-object v6, v10

    .line 215
    invoke-direct/range {v1 .. v6}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;ZLl/۟ۢۜ;Lbin/mt/json/JSONArray;)Ll/ۡۖۜ;

    move-result-object v6

    .line 218
    iget-object v2, v6, Ll/ۡۖۜ;->ۧ:Ll/ۤ᩵ܿ;

    .line 219
    iget-object v8, v6, Ll/ۡۖۜ;->ܽ:Ljava/lang/String;

    .line 220
    iget-object v9, v6, Ll/ۡۖۜ;->ܳ:Ll/ܶ᩵ܿ;

    .line 221
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v16

    .line 223
    iget-object v3, v6, Ll/ۡۖۜ;->ܿ:Ll/֨ۖۜ;

    .line 224
    iget-object v5, v3, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;

    .line 225
    iget-object v4, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v17, "copy_to_temp"

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move-object v5, v10

    .line 234
    :try_start_0
    invoke-static/range {v0 .. v5}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V

    .line 236
    invoke-static {v7, v9}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)J

    move-result-wide v19
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_24
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_23
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_22

    move-object/from16 v4, v21

    .line 241
    :goto_0
    :try_start_1
    invoke-virtual {v14}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v7

    .line 242
    iget-object v9, v7, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;
    :try_end_1
    .catch Ll/ۗۛ᩻; {:try_start_1 .. :try_end_1} :catch_24
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_21
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_20

    :try_start_2
    const-string v17, "pre_publish_validation"

    .line 244
    invoke-virtual {v7, v12}, Ll/۟ۢۜ;->ܽ(Ljava/lang/String;)V

    .line 245
    invoke-virtual {v7, v13}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 246
    invoke-virtual {v7, v8}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V

    .line 247
    invoke-virtual {v7, v13}, Ll/۟ۢۜ;->ۧ(Ljava/lang/String;)V

    .line 250
    invoke-virtual {v14, v12}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v21

    .line 251
    invoke-virtual/range {v21 .. v21}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v0

    .line 252
    iget-object v1, v7, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v6, v1}, Ll/ۡۖۜ;->֫(Ljava/lang/String;)V

    .line 253
    iget-object v5, v6, Ll/ۡۖۜ;->֫:Ll/ܶ᩵ܿ;

    .line 254
    iget-object v4, v6, Ll/ۡۖۜ;->ۧ:Ll/ۤ᩵ܿ;

    .line 255
    iget-object v3, v6, Ll/ۡۖۜ;->ܳ:Ll/ܶ᩵ܿ;

    .line 256
    iget-object v2, v6, Ll/ۡۖۜ;->᩻:Ll/ۤ᩵ܿ;

    .line 258
    invoke-direct {v11, v0}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v0

    invoke-direct {v11, v0, v12}, Ll/۬ۖۜ;->ۧ(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 259
    invoke-direct {v11, v4}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v0

    .line 260
    invoke-direct {v11, v0, v13}, Ll/۬ۖۜ;->֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_24
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1f
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1e

    if-nez p4, :cond_1

    .line 262
    :try_start_3
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1e

    move-object/from16 p1, v3

    :try_start_4
    sget-object v3, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v1, v3, :cond_0

    goto :goto_6

    :cond_0
    const-string v0, "FILE_ALREADY_EXISTS"

    const-string v1, "The destination appeared before publication and overwrite is false."

    .line 263
    iget-object v4, v7, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v5, "pre_publish_destination"

    const-string v6, "already_exists"
    :try_end_4
    .catch Ll/ۗۛ᩻; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_5

    const/4 v7, 0x0

    const/4 v14, 0x1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v8, v22

    move-object/from16 v23, v9

    move v9, v14

    move-object v14, v10

    :try_start_5
    invoke-static/range {v0 .. v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0
    :try_end_5
    .catch Ll/ۗۛ᩻; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2

    :try_start_6
    throw v0
    :try_end_6
    .catch Ll/ۗۛ᩻; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v11, v14

    :goto_1
    move-object/from16 v9, v23

    goto/16 :goto_1c

    :catch_3
    move-exception v0

    :goto_2
    move-object v11, v14

    :goto_3
    move-object/from16 v9, v23

    goto/16 :goto_21

    :catch_4
    move-exception v0

    goto :goto_5

    :catch_5
    move-exception v0

    move-object/from16 v23, v9

    move-object v14, v10

    :goto_4
    move-object v11, v14

    goto/16 :goto_17

    :catch_6
    move-exception v0

    move-object v14, v10

    goto :goto_5

    :catch_7
    move-exception v0

    move-object/from16 v23, v9

    move-object v14, v10

    goto :goto_2

    :goto_5
    move-object v11, v14

    goto/16 :goto_26

    :cond_1
    move-object/from16 p1, v3

    :goto_6
    move-object/from16 v23, v9

    .line 269
    :try_start_7
    invoke-direct {v11, v2}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v1

    iget-object v3, v7, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v12, v13, v1, v3, v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V

    .line 271
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    const/4 v9, 0x1

    goto :goto_7

    :cond_2
    const/4 v0, 0x0

    const/4 v9, 0x0

    .line 273
    :goto_7
    invoke-static {v2, v9}, Ll/۬ۖۜ;->ۧ(Ll/ۤ᩵ܿ;Z)Ll/֨ۖۜ;

    move-result-object v3

    .line 274
    iget-object v1, v3, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;
    :try_end_7
    .catch Ll/ۗۛ᩻; {:try_start_7 .. :try_end_7} :catch_24
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1d
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_1c

    .line 275
    :try_start_8
    iget-object v0, v7, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;
    :try_end_8
    .catch Ll/ۗۛ᩻; {:try_start_8 .. :try_end_8} :catch_1b
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1a
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_19

    move-object/from16 v22, v0

    move-object/from16 v0, p2

    move-object/from16 v24, v1

    move-object/from16 v1, p3

    move-object/from16 v25, v2

    move-object v2, v4

    move-object/from16 v26, p1

    move-object/from16 v27, v3

    move-object/from16 v28, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v5

    move-object v5, v10

    :try_start_9
    invoke-static/range {v0 .. v5}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V

    .line 278
    new-instance v0, Ll/ܿ᩵ܿ;

    invoke-direct {v0}, Ll/ܿ᩵ܿ;-><init>()V
    :try_end_9
    .catch Ll/ۗۛ᩻; {:try_start_9 .. :try_end_9} :catch_17
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_16
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_18

    if-eqz v9, :cond_3

    move-object/from16 v1, v22

    goto :goto_8

    :cond_3
    move-object/from16 v1, v21

    .line 282
    :goto_8
    :try_start_a
    invoke-virtual {v0, v1}, Ll/ܿ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)Ll/ܽ᩵ܿ;

    move-result-object v1
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_a
    .catch Ll/ۗۛ᩻; {:try_start_a .. :try_end_a} :catch_9
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    goto :goto_9

    :catch_8
    move-exception v0

    goto :goto_b

    :catch_9
    move-exception v0

    goto :goto_c

    .line 284
    :catch_a
    :try_start_b
    sget-object v1, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    .line 288
    :goto_9
    invoke-virtual {v14}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v2

    .line 289
    iget-object v3, v7, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-object v2, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 290
    sget-object v2, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;
    :try_end_b
    .catch Ll/ۗۛ᩻; {:try_start_b .. :try_end_b} :catch_17
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_16
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_18

    if-eq v1, v2, :cond_5

    if-eqz v9, :cond_4

    :try_start_c
    const-string v0, "Existing destination mode, owner, or group metadata could not be fully captured."

    goto :goto_a

    :cond_4
    const-string v0, "Source mode, owner, or group metadata could not be fully captured."

    .line 291
    :goto_a
    invoke-static {v10, v0}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    :try_end_c
    .catch Ll/ۗۛ᩻; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_18

    move-object/from16 v0, v18

    goto :goto_d

    :goto_b
    move-object v11, v10

    goto/16 :goto_14

    :goto_c
    move-object v11, v10

    goto/16 :goto_15

    :cond_5
    :goto_d
    :try_start_d
    const-string v17, "publish"

    .line 302
    iget-object v8, v7, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;
    :try_end_d
    .catch Ll/ۗۛ᩻; {:try_start_d .. :try_end_d} :catch_15
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_14
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_13

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, v26

    move-object/from16 v4, v25

    move-object/from16 v5, v22

    move-object/from16 v6, v28

    move-object/from16 v7, v27

    move-object/from16 v22, v8

    move/from16 v21, v9

    move-wide/from16 v8, v19

    move-object v11, v10

    move-object/from16 v10, v22

    :try_start_e
    invoke-direct/range {v1 .. v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;JLjava/lang/String;)V
    :try_end_e
    .catch Ll/ۗۛ᩻; {:try_start_e .. :try_end_e} :catch_12
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_11
    .catch Ljava/lang/RuntimeException; {:try_start_e .. :try_end_e} :catch_10

    :try_start_f
    const-string v17, "restore_metadata"

    .line 307
    invoke-virtual {v14, v13}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1
    :try_end_f
    .catch Ll/ۗۛ᩻; {:try_start_f .. :try_end_f} :catch_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_d

    if-eqz v0, :cond_7

    .line 311
    :try_start_10
    invoke-virtual {v0, v1}, Ll/ܿ᩵ܿ;->ܽ(Ll/ܶ᩵ܿ;)Ll/ܽ᩵ܿ;

    move-result-object v0
    :try_end_10
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_b
    .catch Ll/ۗۛ᩻; {:try_start_10 .. :try_end_10} :catch_f
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_e

    goto :goto_e

    .line 313
    :catch_b
    :try_start_11
    sget-object v0, Ll/ܽ᩵ܿ;->᩹:Ll/ܽ᩵ܿ;

    .line 315
    :goto_e
    sget-object v2, Ll/ܽ᩵ܿ;->ۙ:Ll/ܽ᩵ܿ;

    if-eq v0, v2, :cond_7

    if-eqz v21, :cond_6

    const-string v0, "Existing destination mode, owner, or group metadata could not be fully restored."

    goto :goto_f

    :cond_6
    const-string v0, "Source mode, owner, or group metadata could not be fully applied to the destination."

    .line 316
    :goto_f
    invoke-static {v11, v0}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    :try_end_11
    .catch Ll/ۗۛ᩻; {:try_start_11 .. :try_end_11} :catch_f
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_11 .. :try_end_11} :catch_d

    :cond_7
    if-nez v21, :cond_8

    .line 323
    :try_start_12
    invoke-static {v1}, Ll/ܿ֡ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_12
    .catch Ljava/lang/RuntimeException; {:try_start_12 .. :try_end_12} :catch_c
    .catch Ll/ۗۛ᩻; {:try_start_12 .. :try_end_12} :catch_f
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_e

    goto :goto_10

    :catch_c
    :try_start_13
    const-string v0, "SELinux context restoration could not be completed."

    .line 325
    invoke-static {v11, v0}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    .line 330
    :cond_8
    :goto_10
    invoke-virtual {v15}, Ll/۫᩵ܿ;->ۧ()J

    move-result-wide v2

    invoke-static {v1, v2, v3, v11}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;JLbin/mt/json/JSONArray;)V
    :try_end_13
    .catch Ll/ۗۛ᩻; {:try_start_13 .. :try_end_13} :catch_f
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_e
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_d

    const/4 v0, 0x1

    const/4 v1, 0x1

    move-object/from16 v8, v18

    move-object/from16 v7, v24

    const/4 v15, 0x1

    goto/16 :goto_2b

    :catch_d
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v5, v17

    move-object/from16 v4, v23

    const/4 v14, 0x1

    const/4 v15, 0x1

    goto/16 :goto_1e

    :catch_e
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v5, v17

    move-object/from16 v4, v23

    const/4 v14, 0x1

    const/4 v15, 0x1

    goto/16 :goto_23

    :catch_f
    move-exception v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-object/from16 v5, v24

    goto/16 :goto_29

    :catch_10
    move-exception v0

    goto :goto_11

    :catch_11
    move-exception v0

    goto :goto_12

    :catch_12
    move-exception v0

    goto :goto_13

    :catch_13
    move-exception v0

    move-object v11, v10

    :goto_11
    const/4 v1, 0x1

    move-object/from16 v9, v23

    move-object/from16 v1, v24

    const/4 v2, 0x1

    goto/16 :goto_1d

    :catch_14
    move-exception v0

    move-object v11, v10

    :goto_12
    const/4 v1, 0x1

    move-object/from16 v9, v23

    move-object/from16 v1, v24

    const/4 v2, 0x1

    goto/16 :goto_22

    :catch_15
    move-exception v0

    move-object v11, v10

    :goto_13
    const/4 v1, 0x1

    move-object/from16 v5, v24

    goto/16 :goto_28

    :cond_9
    move-object/from16 v11, p0

    move-object/from16 v4, v23

    move-object/from16 v22, v24

    goto/16 :goto_0

    :catch_16
    move-exception v0

    goto/16 :goto_b

    :catch_17
    move-exception v0

    goto/16 :goto_c

    :catch_18
    move-exception v0

    move-object v11, v10

    move-object/from16 v1, v24

    goto :goto_18

    :goto_14
    move-object/from16 v22, v24

    goto/16 :goto_3

    :goto_15
    move-object/from16 v5, v24

    goto/16 :goto_27

    :catch_19
    move-exception v0

    move-object/from16 v24, v1

    move-object v11, v10

    move-object/from16 v22, v24

    goto :goto_17

    :catch_1a
    move-exception v0

    move-object/from16 v24, v1

    goto/16 :goto_b

    :catch_1b
    move-exception v0

    move-object/from16 v24, v1

    goto/16 :goto_c

    :catch_1c
    move-exception v0

    goto :goto_16

    :catch_1d
    move-exception v0

    goto :goto_19

    :catch_1e
    move-exception v0

    move-object/from16 v23, v9

    :goto_16
    move-object v11, v10

    :goto_17
    move-object/from16 v1, v22

    :goto_18
    move-object/from16 v22, v1

    goto/16 :goto_1

    :catch_1f
    move-exception v0

    move-object/from16 v23, v9

    :goto_19
    move-object v11, v10

    goto/16 :goto_3

    :catch_20
    move-exception v0

    move-object v11, v10

    goto :goto_1b

    :catch_21
    move-exception v0

    move-object v11, v10

    goto :goto_20

    :catch_22
    move-exception v0

    move-object v11, v10

    goto :goto_1a

    :catch_23
    move-exception v0

    move-object v11, v10

    goto :goto_1f

    :catch_24
    move-exception v0

    move-object v11, v10

    goto/16 :goto_26

    :goto_1a
    move-object/from16 v4, v21

    :goto_1b
    move-object/from16 v5, v22

    move-object v9, v4

    move-object/from16 v22, v5

    :goto_1c
    const/4 v1, 0x0

    move-object/from16 v1, v22

    const/4 v2, 0x0

    :goto_1d
    const/4 v3, 0x0

    move-object/from16 v24, v1

    move v14, v2

    move-object v4, v9

    move-object/from16 v5, v17

    const/4 v15, 0x0

    .line 345
    :goto_1e
    invoke-static {v0}, Ll/۬ۖۜ;->ܽ(Ljava/lang/RuntimeException;)Z

    move-result v1

    if-nez v1, :cond_a

    move-object/from16 v8, v18

    move-object/from16 v7, v24

    move-object/from16 v18, v0

    move v0, v14

    goto/16 :goto_2b

    :cond_a
    if-eqz v14, :cond_b

    .line 350
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    goto :goto_24

    .line 355
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v9, 0x1

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v1, "The storage backend failed while preparing the copied file."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v8, v24

    move-object v10, v11

    .line 352
    invoke-static/range {v0 .. v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_25

    :goto_1f
    move-object/from16 v4, v21

    :goto_20
    move-object/from16 v5, v22

    move-object v9, v4

    move-object/from16 v22, v5

    :goto_21
    const/4 v1, 0x0

    move-object/from16 v1, v22

    const/4 v2, 0x0

    :goto_22
    const/4 v3, 0x0

    move-object/from16 v24, v1

    move v14, v2

    move-object v4, v9

    move-object/from16 v5, v17

    const/4 v15, 0x0

    :goto_23
    if-eqz v14, :cond_c

    .line 337
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    :goto_24
    const/4 v7, 0x1

    const/4 v9, 0x0

    const-string v0, "FILE_OPERATION_STATE_UNKNOWN"

    const-string v1, "The copy may have changed the destination, but its final state is unknown."

    const-string v5, "publish"

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v8, v24

    move-object v10, v11

    .line 1549
    invoke-static/range {v0 .. v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_25

    .line 342
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v9, 0x1

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v1, "Failed to prepare the copied file for publication."

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v8, v24

    move-object v10, v11

    .line 339
    invoke-static/range {v0 .. v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    :goto_25
    move-object v1, v0

    move v0, v14

    move-object/from16 v5, v24

    goto :goto_2a

    :goto_26
    move-object/from16 v5, v22

    :goto_27
    const/4 v1, 0x0

    :goto_28
    const/4 v2, 0x0

    :goto_29
    move v15, v2

    move/from16 v29, v1

    move-object v1, v0

    move/from16 v0, v29

    :goto_2a
    move-object v8, v1

    move-object v7, v5

    :goto_2b
    move-object/from16 v1, p0

    move-object/from16 v2, v16

    move-object/from16 v3, p3

    move v4, v0

    move-object v5, v11

    move-object/from16 v6, v18

    .line 359
    invoke-direct/range {v1 .. v6}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/RuntimeException;)V

    if-nez v18, :cond_12

    if-eqz v8, :cond_11

    .line 363
    iget-object v1, v8, Ll/ۗۛ᩻;->᩸:Ljava/lang/String;

    const-string v2, "FILE_OPERATION_STATE_UNKNOWN"

    .line 364
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    if-eqz v0, :cond_d

    if-nez v15, :cond_e

    const-string v0, "atomic"

    .line 366
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_d
    const/4 v0, 0x1

    goto :goto_2c

    :cond_e
    const/4 v0, 0x0

    .line 1489
    :goto_2c
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 1490
    iget-object v3, v8, Ll/ۗۛ᩻;->᩶:Lbin/mt/json/JSONObject;

    iget-object v4, v8, Ll/ۗۛ᩻;->ۗ:Lbin/mt/json/JSONArray;

    iget-object v5, v8, Ll/ۗۛ᩻;->᩹:Ljava/lang/String;

    invoke-virtual {v3}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbin/mt/json/JSONObject$Member;

    .line 1491
    invoke-virtual {v6}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v6

    invoke-virtual {v2, v9, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_2d

    :cond_f
    const-string v3, "path"

    .line 1493
    invoke-virtual {v2, v3, v12}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "targetPath"

    .line 1494
    invoke-virtual {v3, v6, v13}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    xor-int/lit8 v6, v0, 0x1

    const-string v9, "changed"

    .line 1495
    invoke-virtual {v3, v9, v6}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "operationMode"

    .line 1496
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "stateKnown"

    .line 1497
    invoke-virtual {v3, v6, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    new-instance v3, Lbin/mt/json/JSONArray;

    invoke-direct {v3, v11}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    const-string v6, "warnings"

    .line 1498
    invoke-virtual {v0, v6, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 1499
    iget-boolean v0, v8, Ll/ۗۛ᩻;->۫:Z

    if-eqz v0, :cond_10

    .line 1500
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v5, v4, v2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    goto :goto_2e

    .line 1502
    :cond_10
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v5, v4, v2}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 367
    :goto_2e
    throw v0

    .line 370
    :cond_11
    new-instance v6, Ll/ܺۖۜ;

    new-instance v3, Lbin/mt/json/JSONArray;

    invoke-direct {v3, v11}, Lbin/mt/json/JSONArray;-><init>(Lbin/mt/json/JSONArray;)V

    move-object v0, v6

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-wide/from16 v4, v19

    invoke-direct/range {v0 .. v5}, Ll/ܺۖۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;J)V

    return-object v6

    .line 361
    :cond_12
    throw v18

    .line 208
    :cond_13
    iget-object v4, v0, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const/4 v9, 0x1

    .line 211
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    const-string v0, "FILE_STORAGE_ERROR"

    const-string v1, "The source size exceeds the supported JSON integer range."

    const-string v5, "source_stat"

    const-string v6, "size_out_of_range"

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 208
    invoke-static/range {v0 .. v10}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static bridge synthetic ֫(Ll/۬ۖۜ;)Ll/ᩳۖۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    return-object p0
.end method

.method private ֫(Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩷ۖۜ;
    .locals 19

    .line 1321
    invoke-virtual/range {p2 .. p2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-ne v0, v1, :cond_0

    .line 1322
    invoke-static {}, Ll/᩷ۖۜ;->֫()Ll/᩷ۖۜ;

    move-result-object v0

    return-object v0

    .line 1326
    :cond_0
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3, v1}, Ll/ᩳۡۜ;->֫(Ll/ܶ᩵ܿ;JI)Ll/ܽۡۜ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-wide v4, v0, Ll/ܽۡۜ;->ܿ:J

    .line 1332
    invoke-virtual/range {p2 .. p2}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 1417
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v1

    move-object/from16 v6, p0

    invoke-direct {v6, v1}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v1

    .line 1334
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v7

    sget-object v8, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v7, v8, :cond_3

    .line 1335
    invoke-virtual/range {p2 .. p2}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v7

    cmp-long v9, v7, v2

    if-ltz v9, :cond_1

    invoke-virtual/range {p2 .. p2}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v7

    cmp-long v9, v7, v4

    if-nez v9, :cond_3

    .line 1336
    :cond_1
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v7

    cmp-long v9, v7, v2

    if-ltz v9, :cond_2

    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v1

    cmp-long v3, v1, v4

    if-nez v3, :cond_3

    .line 1342
    :cond_2
    iget-object v0, v0, Ll/ܽۡۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v4, v5, v0}, Ll/᩷ۖۜ;->֫(JLjava/lang/String;)Ll/᩷ۖۜ;

    move-result-object v0

    return-object v0

    .line 1340
    :cond_3
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v7, "FILE_CHANGED_DURING_READ"

    const-string v8, "The file changed while its targetVersion was being calculated."

    const-string v12, "metadata_changed"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object/from16 v9, p1

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    .line 1589
    invoke-static/range {v7 .. v18}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 1337
    throw v0

    :catch_0
    move-exception v0

    move-object/from16 v6, p0

    .line 1329
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    .line 1330
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-string v7, "FILE_STORAGE_ERROR"

    const-string v8, "Failed to read current local file content."

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object/from16 v9, p1

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    .line 1589
    invoke-static/range {v7 .. v18}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 1328
    throw v0
.end method

.method public static ֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ܶۖۜ;Ll/ۢۖۜ;Ljava/lang/String;)Ll/᩷ۖۜ;
    .locals 13

    .line 1089
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 1090
    new-instance v1, Ll/ۖۖۜ;

    const/4 v2, 0x0

    move-object v3, p1

    .line 1091
    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v3

    invoke-direct {v1, v3, v0}, Ll/ۖۖۜ;-><init>(Ljava/io/OutputStream;Ljava/security/MessageDigest;)V

    .line 1092
    new-instance v3, Ljava/io/BufferedOutputStream;

    const/high16 v4, 0x10000

    invoke-direct {v3, v1, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    move-object v4, p2

    move-object/from16 v5, p3

    .line 1093
    :try_start_0
    invoke-interface {v5, p2, v3}, Ll/ۢۖۜ;->֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1094
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    .line 1095
    invoke-static {v1}, Ll/ۖۖۜ;->֫(Ll/ۖۖۜ;)J

    move-result-wide v3

    const-wide v5, 0x1fffffffffffffL

    cmp-long v7, v3, v5

    if-gtz v7, :cond_0

    .line 1101
    invoke-static {v1}, Ll/ۖۖۜ;->֫(Ll/ۖۖۜ;)J

    move-result-wide v3

    .line 1102
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1101
    invoke-static {v3, v4, v0}, Ll/᩷ۖۜ;->֫(JLjava/lang/String;)Ll/᩷ۖۜ;

    move-result-object v0

    return-object v0

    .line 1099
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v1, "FILE_STORAGE_ERROR"

    const-string v2, "The output size exceeds the supported JSON integer range."

    const-string v5, "write_temp"

    const-string v6, "size_out_of_range"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, p0

    move-object/from16 v4, p4

    .line 1589
    invoke-static/range {v1 .. v12}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 1096
    throw v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 1092
    :try_start_1
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method public static ֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    .locals 3

    .line 1077
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 1078
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 1082
    :cond_1
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V
    .locals 14

    move-object/from16 v0, p3

    .line 1179
    iget-object v1, v0, Ll/֨ۖۜ;->ܽ:Ll/۬᩵ܿ;

    sget-object v2, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    if-ne v1, v2, :cond_1

    iget-boolean v1, v0, Ll/֨ۖۜ;->ۧ:Z

    if-nez v1, :cond_1

    sget-object v1, Ll/۬᩵ܿ;->᩶:Ll/۬᩵ܿ;

    move-object/from16 v2, p2

    .line 1181
    invoke-virtual {v2, v1}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 1184
    :cond_0
    iget-object v11, v0, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;

    const/4 v12, 0x1

    const-string v3, "FILE_BACKEND_UNSUPPORTED"

    const-string v4, "The storage backend cannot publish without replacing an existing destination."

    const-string v8, "publish_capability"

    const-string v9, "no_replace_unsupported"

    const/4 v10, 0x0

    move-object v5, p0

    move-object v6, p1

    move-object/from16 v7, p4

    move-object/from16 v13, p5

    invoke-static/range {v3 .. v13}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V
    .locals 13

    .line 877
    invoke-virtual {p2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v0, v1, :cond_0

    return-void

    .line 878
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "temp_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 881
    invoke-virtual {p2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-string v2, "FILE_STORAGE_ERROR"

    const-string v3, "The copied temporary file is no longer available for publication."

    const-string v7, "pre_publish_temp"

    const/4 v9, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object/from16 v6, p3

    move-object/from16 v12, p4

    .line 878
    invoke-static/range {v2 .. v12}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/RuntimeException;)V
    .locals 1

    .line 640
    invoke-direct {p0, p1}, Ll/۬ۖۜ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "A temporary MCP file could not be removed."

    .line 641
    invoke-static {p4, p1}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    if-eqz p5, :cond_0

    .line 643
    new-instance p1, Ljava/io/IOException;

    const-string v0, "A temporary MCP file could not be removed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_0
    if-eqz p3, :cond_1

    .line 649
    :try_start_0
    iget-object p1, p0, Ll/۬ۖۜ;->֫:Ll/᩻ᩳᩴ;

    invoke-virtual {p1, p2}, Ll/᩻ᩳᩴ;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "File change notification could not be completed."

    .line 651
    invoke-static {p4, p2}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    if-eqz p5, :cond_1

    if-eq p1, p5, :cond_1

    .line 653
    invoke-virtual {p5, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method private ֫(Ljava/lang/String;Ll/ۤ᩵ܿ;Ljava/lang/String;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p2

    .line 908
    invoke-direct {p0, v1}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v1

    .line 909
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v2, v3, :cond_1

    .line 914
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v2

    sget-object v3, Ll/ۗ᩵ܿ;->᩹:Ll/ۗ᩵ܿ;

    if-ne v2, v3, :cond_0

    return-void

    .line 917
    :cond_0
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    .line 918
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-string v3, "FILE_NOT_DIRECTORY"

    const-string v4, "The target parent is not a directory."

    const-string v7, "parent_stat"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v5, p1

    move-object/from16 v6, p3

    .line 1589
    invoke-static/range {v3 .. v14}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    .line 915
    throw v1

    .line 912
    :cond_1
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v2, "FILE_PARENT_NOT_FOUND"

    const-string v3, "The target parent directory does not exist."

    const-string v6, "parent_stat"

    const-string v7, "parent_missing"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object/from16 v4, p1

    move-object/from16 v5, p3

    .line 1589
    invoke-static/range {v2 .. v13}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v1

    .line 910
    throw v1
.end method

.method public static ֫(Ljava/lang/String;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V
    .locals 15

    move-object/from16 v0, p2

    .line 1198
    iget-object v1, v0, Ll/֨ۖۜ;->ܽ:Ll/۬᩵ܿ;

    sget-object v2, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    if-ne v1, v2, :cond_1

    iget-boolean v1, v0, Ll/֨ۖۜ;->ۧ:Z

    if-nez v1, :cond_1

    sget-object v1, Ll/۬᩵ܿ;->᩶:Ll/۬᩵ܿ;

    move-object/from16 v2, p1

    .line 1200
    invoke-virtual {v2, v1}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 1203
    :cond_0
    iget-object v10, v0, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-string v3, "FILE_BACKEND_UNSUPPORTED"

    const-string v4, "The storage backend cannot publish without replacing an existing destination."

    const-string v7, "publish_capability"

    const-string v8, "no_replace_unsupported"

    const/4 v9, 0x0

    const/4 v11, 0x1

    move-object v5, p0

    move-object/from16 v6, p3

    move-object/from16 v12, p4

    .line 1589
    invoke-static/range {v3 .. v14}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 1203
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/۬ۖۜ;->ۧ(Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V

    return-void
.end method

.method private ֫(Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;Ll/֨ۖۜ;JLjava/lang/String;)V
    .locals 16

    move-object/from16 v1, p6

    .line 1228
    iget-object v8, v1, Ll/֨ۖۜ;->ᩳ:Ljava/lang/String;

    iget-boolean v0, v1, Ll/֨ۖۜ;->ۧ:Z

    iget-boolean v2, v1, Ll/֨ۖۜ;->֫:Z

    iget-object v3, v1, Ll/֨ۖۜ;->ܽ:Ll/۬᩵ܿ;

    if-eqz v0, :cond_7

    .line 1230
    :try_start_0
    sget-object v0, Ll/۬᩵ܿ;->ۤ:Ll/۬᩵ܿ;

    if-ne v3, v0, :cond_0

    .line 1231
    invoke-virtual/range {p3 .. p4}, Ll/ۤ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    return-void

    .line 1233
    :cond_0
    invoke-virtual/range {p3 .. p4}, Ll/ۤ᩵ܿ;->֫(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ll/᩹᩵ܿ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object/from16 v13, p0

    .line 1286
    iget-object v4, v13, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    sget-object v5, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    const/4 v6, 0x0

    if-ne v3, v5, :cond_4

    if-nez v2, :cond_4

    .line 1288
    invoke-virtual/range {p2 .. p2}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p4 .. p4}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    .line 1292
    :cond_1
    :try_start_1
    invoke-virtual/range {p2 .. p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 1293
    invoke-virtual/range {p4 .. p4}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 1294
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v7

    .line 1295
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v9

    .line 1296
    invoke-virtual {v7}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v7

    .line 1297
    invoke-virtual {v7}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v10

    sget-object v11, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v10, v11, :cond_4

    .line 1298
    invoke-virtual {v7}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v10

    const-wide/16 v14, 0x0

    cmp-long v12, v10, v14

    if-ltz v12, :cond_2

    .line 1299
    invoke-virtual {v7}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v10

    cmp-long v7, v10, p7

    if-nez v7, :cond_4

    .line 1300
    :cond_2
    invoke-virtual {v9}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v7

    invoke-virtual {v7}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v7

    sget-object v10, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    if-eq v7, v10, :cond_3

    goto :goto_0

    .line 1303
    :cond_3
    new-instance v7, Ll/ᩴۖۜ;

    invoke-direct {v7, v5, v4, v9}, Ll/ᩴۖۜ;-><init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۤ᩵ܿ;)V
    :try_end_1
    .catch Ll/᩹᩵ܿ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v6, v7

    goto :goto_0

    :catch_1
    nop

    :cond_4
    :goto_0
    if-nez v6, :cond_6

    if-eqz v2, :cond_5

    const-string v2, "FILE_STORAGE_ERROR"

    goto :goto_1

    :cond_5
    const-string v2, "FILE_OPERATION_STATE_UNKNOWN"

    .line 1243
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    .line 1244
    invoke-virtual {v0}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    iget-boolean v9, v1, Ll/֨ۖۜ;->֫:Z

    xor-int/lit8 v7, v9, 0x1

    .line 1246
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v0, "Failed to publish local file content."

    move-object v1, v2

    move-object v2, v0

    move-object/from16 v3, p1

    move-object/from16 v4, p9

    .line 1589
    invoke-static/range {v1 .. v12}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 1240
    throw v0

    .line 1249
    :cond_6
    iget-object v0, v6, Ll/ᩴۖۜ;->ܽ:Ll/ܶ᩵ܿ;

    .line 1250
    iget-object v1, v6, Ll/ᩴۖۜ;->֫:Ll/ܶ᩵ܿ;

    .line 1251
    iget-object v2, v6, Ll/ᩴۖۜ;->ۧ:Ll/ۤ᩵ܿ;

    goto :goto_2

    :cond_7
    move-object/from16 v13, p0

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    .line 1254
    :goto_2
    sget-object v4, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    if-ne v3, v4, :cond_9

    .line 1255
    sget-object v3, Ll/۬᩵ܿ;->᩶:Ll/۬᩵ܿ;

    invoke-virtual {v2, v3}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v3

    sget-object v4, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-eq v3, v4, :cond_8

    .line 1264
    :try_start_2
    invoke-virtual {v2}, Ll/ۤ᩵ܿ;->ܽ()V
    :try_end_2
    .catch Ll/᩹᩵ܿ; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    move-object v1, v0

    .line 1269
    invoke-virtual {v1}, Ll/᩹᩵ܿ;->ܽ()Ll/᩸᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 1270
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v1, "FILE_OPERATION_STATE_UNKNOWN"

    const-string v2, "Failed to create the final local file before publishing content."

    const-string v5, "create_target"

    const/4 v7, 0x1

    const/4 v9, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p9

    .line 1589
    invoke-static/range {v1 .. v12}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 1266
    throw v0

    .line 1260
    :cond_8
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v1, "FILE_BACKEND_UNSUPPORTED"

    const-string v2, "The storage backend cannot publish without replacing an existing destination."

    const-string v5, "publish_capability"

    const-string v6, "no_replace_unsupported"

    const/4 v7, 0x0

    const/4 v9, 0x1

    move-object/from16 v3, p1

    move-object/from16 v4, p9

    .line 1589
    invoke-static/range {v1 .. v12}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 1257
    throw v0

    .line 1273
    :cond_9
    :goto_3
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v0

    const/high16 v3, 0x10000

    invoke-direct {v2, v0, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 1274
    :try_start_3
    new-instance v4, Ljava/io/BufferedOutputStream;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1276
    :try_start_4
    invoke-static {v2, v4}, Ll/۬ۖۜ;->֫(Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1277
    :try_start_5
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 1273
    :try_start_6
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_7
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v1
.end method

.method private ֫(Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 857
    sget-object v0, Ll/ۜۖۜ;->֫:[I

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "The destination node type cannot be replaced by generic file tools."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 866
    throw p1

    :cond_1
    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "A symbolic link cannot be used as the file copy destination."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 863
    throw p1

    :cond_2
    const-string v0, "FILE_NOT_REGULAR"

    const-string v1, "A directory cannot be used as the file copy destination."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 860
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/۬ۖۜ;Ljava/lang/String;Ll/ۤ᩵ܿ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ll/ۤ᩵ܿ;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ۖۜ;Ljava/lang/String;Ll/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p2, p1, p3}, Ll/۬ۖۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;JLbin/mt/json/JSONArray;)V
    .locals 4

    const-string v0, "Source modified time could not be applied to the destination."

    .line 1395
    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-gez v3, :cond_1

    const-string p0, "Source modified time was unavailable and could not be preserved."

    .line 1399
    invoke-static {p3, p0}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-void

    .line 1404
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1405
    invoke-virtual {p0, p1, p2}, Ll/ܶ᩵ܿ;->֫(J)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    .line 1406
    :cond_3
    :goto_1
    invoke-static {p3, v0}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 1410
    :catch_0
    invoke-static {p3, v0}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 927
    new-instance v0, Ll/ܿۖۜ;

    invoke-direct {v0, p2, p3}, Ll/ܿۖۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {p2, p1, v0}, Ll/ᩳۖۜ;->֫(Ll/ܶ᩵ܿ;Ll/ܽۖۜ;)V

    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ll/۟ۢۜ;Lbin/mt/json/JSONArray;)V
    .locals 5

    .line 978
    iget-object v0, p0, Ll/۬ۖۜ;->ۧ:Ljava/util/LinkedHashMap;

    monitor-enter v0

    .line 979
    :try_start_0
    iget-object v1, p2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    iget-object v2, p0, Ll/۬ۖۜ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 980
    monitor-exit v0

    return-void

    .line 982
    :cond_0
    iget-object v1, p0, Ll/۬ۖۜ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 983
    iget-object v1, p0, Ll/۬ۖۜ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    const/16 v2, 0x40

    if-le v1, v2, :cond_1

    .line 984
    iget-object v1, p0, Ll/۬ۖۜ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 986
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 987
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    .line 988
    sget-object v0, Ll/۬᩵ܿ;->۬:Ll/۬᩵ܿ;

    invoke-virtual {p1, v0}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-ne v0, v1, :cond_2

    goto :goto_2

    .line 994
    :cond_2
    :try_start_1
    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ܳ()Ljava/util/List;

    move-result-object p1
    :try_end_1
    .catch Ll/᩹᩵ܿ; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1001
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩵ܿ;

    .line 1002
    invoke-virtual {v1}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 1003
    invoke-virtual {v1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v3, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v1, v3, :cond_3

    .line 1004
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۬ۖۜ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    .line 1009
    :cond_4
    :try_start_2
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ll/۟ۢۜ;->ᩳ(Ljava/lang/String;)V
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_0

    .line 1014
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v1

    .line 1015
    sget-object v2, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    invoke-virtual {v1, v2}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v2

    sget-object v4, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-ne v2, v4, :cond_5

    goto :goto_1

    .line 1022
    :cond_5
    :try_start_3
    invoke-virtual {v1}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v2

    .line 1023
    invoke-virtual {v2}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v4

    if-ne v4, v3, :cond_3

    .line 1024
    invoke-virtual {v2}, Ll/۫᩵ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/۬ۖۜ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    .line 1027
    :cond_6
    invoke-virtual {v1}, Ll/ۤ᩵ܿ;->ܿ()V
    :try_end_3
    .catch Ll/᩹᩵ܿ; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_7
    if-eqz v0, :cond_8

    const-string p1, "One or more stale MCP temporary files could not be removed."

    .line 1034
    invoke-static {p3, p1}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    :cond_8
    :goto_2
    return-void

    :catch_1
    const-string p1, "Stale MCP temporary files could not be checked on this storage backend."

    .line 996
    invoke-static {p3, p1}, Ll/۬ۖۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    .line 986
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public static ֫(IILjava/lang/String;)Z
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_3

    .line 1059
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-lt v0, v1, :cond_0

    const/16 v1, 0x39

    if-le v0, v1, :cond_1

    :cond_0
    const/16 v1, 0x61

    if-lt v0, v1, :cond_2

    const/16 v1, 0x66

    if-le v0, v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return p0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/RuntimeException;)Z
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۬ۖۜ;->ܽ(Ljava/lang/RuntimeException;)Z

    move-result p0

    return p0
.end method

.method private ֫(Ljava/lang/String;)Z
    .locals 4

    .line 1361
    :try_start_0
    iget-object v0, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 1362
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    .line 1363
    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ۜ()Ll/۫᩵ܿ;

    move-result-object v0

    .line 1364
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    return v3

    .line 1367
    :cond_0
    invoke-virtual {v0}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 1370
    :cond_1
    sget-object v0, Ll/۬᩵ܿ;->ۗ:Ll/۬᩵ܿ;

    invoke-virtual {p1, v0}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۙ᩵ܿ;->ۗ:Ll/ۙ᩵ܿ;

    if-ne v0, v1, :cond_2

    goto :goto_0

    .line 1375
    :cond_2
    invoke-virtual {p1}, Ll/ۤ᩵ܿ;->ܿ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ֫(Ll/᩷ۖۜ;Ll/᩷ۖۜ;)Z
    .locals 5

    .line 1687
    iget-boolean v0, p0, Ll/᩷ۖۜ;->֫:Z

    iget-boolean v1, p1, Ll/᩷ۖۜ;->֫:Z

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/᩷ۖۜ;->ۧ:J

    iget-wide v2, p1, Ll/᩷ۖۜ;->ۧ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object p0, p0, Ll/᩷ۖۜ;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/᩷ۖۜ;->ܽ:Ljava/lang/String;

    .line 1688
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    .locals 1

    .line 1134
    instance-of v0, p0, Ll/᩶ۖۜ;

    if-nez v0, :cond_1

    .line 1135
    invoke-static {p0}, Ll/۬ۖۜ;->ܽ(Ljava/lang/RuntimeException;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 1138
    :cond_0
    new-instance v0, Ll/᩶ۖۜ;

    invoke-direct {v0, p0}, Ll/᩶ۖۜ;-><init>(Ljava/lang/RuntimeException;)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static ۧ(Ll/ۤ᩵ܿ;Z)Ll/֨ۖۜ;
    .locals 4

    if-eqz p1, :cond_0

    .line 1160
    sget-object p1, Ll/۬᩵ܿ;->ۤ:Ll/۬᩵ܿ;

    goto :goto_0

    .line 1161
    :cond_0
    sget-object p1, Ll/۬᩵ܿ;->۫:Ll/۬᩵ܿ;

    .line 1162
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۤ᩵ܿ;->֫(Ll/۬᩵ܿ;)Ll/ۙ᩵ܿ;

    move-result-object p0

    .line 1163
    sget-object v0, Ll/ۙ᩵ܿ;->᩹:Ll/ۙ᩵ܿ;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_1

    .line 1164
    new-instance p0, Ll/֨ۖۜ;

    const-string v0, "atomic"

    invoke-direct {p0, p1, v0, v1, v1}, Ll/֨ۖۜ;-><init>(Ll/۬᩵ܿ;Ljava/lang/String;ZZ)V

    return-object p0

    .line 1166
    :cond_1
    sget-object v0, Ll/ۙ᩵ܿ;->᩶:Ll/ۙ᩵ܿ;

    const-string v2, "best_effort"

    const/4 v3, 0x0

    if-eq p0, v0, :cond_3

    sget-object v0, Ll/ۙ᩵ܿ;->ۙ:Ll/ۙ᩵ܿ;

    if-ne p0, v0, :cond_2

    goto :goto_1

    .line 1170
    :cond_2
    new-instance p0, Ll/֨ۖۜ;

    invoke-direct {p0, p1, v2, v3, v3}, Ll/֨ۖۜ;-><init>(Ll/۬᩵ܿ;Ljava/lang/String;ZZ)V

    return-object p0

    .line 1168
    :cond_3
    :goto_1
    new-instance p0, Ll/֨ۖۜ;

    invoke-direct {p0, p1, v2, v3, v1}, Ll/֨ۖۜ;-><init>(Ll/۬᩵ܿ;Ljava/lang/String;ZZ)V

    return-object p0
.end method

.method public static ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;
    .locals 12

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v0, "FILE_OPERATION_STATE_UNKNOWN"

    const-string v1, "The file operation may have changed the target, but its final state is unknown."

    const-string v4, "publish"

    const/4 v6, 0x1

    const/4 v8, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v5, p4

    move-object v7, p3

    move-object v9, p0

    .line 1589
    invoke-static/range {v0 .. v11}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;Ll/۫᩵ܿ;Ljava/lang/String;Lbin/mt/json/JSONArray;)V
    .locals 14

    .line 890
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v0

    sget-object v1, Ll/ۗ᩵ܿ;->۬:Ll/ۗ᩵ܿ;

    if-ne v0, v1, :cond_0

    return-void

    .line 891
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "temp_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 894
    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v2, "FILE_STORAGE_ERROR"

    const-string v3, "The streamed temporary file is no longer available for publication."

    const-string v6, "pre_publish_temp"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, p0

    move-object/from16 v5, p2

    move-object/from16 v11, p3

    .line 1589
    invoke-static/range {v2 .. v13}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 891
    throw v0
.end method

.method private ۧ(Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 839
    sget-object v0, Ll/ۜۖۜ;->֫:[I

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "The source node type cannot be copied by generic file tools."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 848
    throw p1

    :cond_1
    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links cannot be copied by generic file tools."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 845
    throw p1

    :cond_2
    const-string v0, "FILE_NOT_REGULAR"

    const-string v1, "Directories cannot be copied by mt_file_copy."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 843
    throw p1

    .line 842
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ᩳۖۜ;->ܿ(Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 4

    .line 1045
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x49

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    const-string v0, ".mt-mcp-"

    .line 1046
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    .line 1047
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x2d

    if-ne v1, v3, :cond_1

    const-string v1, ".tmp"

    .line 1048
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x8

    .line 1049
    invoke-static {v1, v0, p0}, Ll/۬ۖۜ;->֫(IILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x21

    const/16 v3, 0x45

    .line 1050
    invoke-static {v0, v3, p0}, Ll/۬ۖۜ;->֫(IILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1054
    :cond_0
    sget-object v0, Ll/۬ۖۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    .line 1053
    invoke-virtual {p0, v1, v0, v2, v3}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    :goto_0
    return v2
.end method

.method private ܽ(Ll/۫᩵ܿ;Ljava/lang/String;)V
    .locals 3

    .line 822
    sget-object v0, Ll/ۜۖۜ;->֫:[I

    invoke-virtual {p1}, Ll/۫᩵ܿ;->ܿ()Ll/ۗ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "FILE_UNSUPPORTED_TYPE"

    const-string v1, "The requested node type cannot be modified as file content."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 830
    throw p1

    :cond_1
    const-string v0, "FILE_IS_SYMLINK"

    const-string v1, "Symbolic links cannot be modified by generic file content tools."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 827
    throw p1

    :cond_2
    const-string v0, "FILE_NOT_REGULAR"

    const-string v1, "Directories cannot be modified as file content."

    .line 0
    invoke-static {p1, v2, v0, v1, p2}, Ll/᩶᩵ᩳ;->֫(Ll/۫᩵ܿ;Ll/ᩳۖۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 825
    throw p1
.end method

.method public static ܽ(Ljava/lang/RuntimeException;)Z
    .locals 1

    .line 1431
    instance-of v0, p0, Ljava/lang/SecurityException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/IllegalArgumentException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/lang/IllegalStateException;

    if-nez v0, :cond_1

    instance-of p0, p0, Ljava/lang/UnsupportedOperationException;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;ZLl/۟ۢۜ;Ll/᩵ۖۜ;)Ll/֡ۖۜ;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "path"

    invoke-static {p1, p3, v0}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 129
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 133
    :try_start_0
    new-instance p1, Ll/᩻ۖۜ;

    invoke-direct {p1, p0, p4, v0, p3}, Ll/᩻ۖۜ;-><init>(Ll/۬ۖۜ;Ll/᩵ۖۜ;Ljava/lang/String;Ll/۟ۢۜ;)V

    invoke-direct {p0, v0, p2, p1, p3}, Ll/۬ۖۜ;->֫(Ljava/lang/String;ZLl/ۗۖۜ;Ll/۟ۢۜ;)Ll/ۙۖۜ;

    move-result-object p1

    .line 156
    new-instance p2, Ll/֡ۖۜ;

    invoke-direct {p2, p1}, Ll/֡ۖۜ;-><init>(Ll/ۙۖۜ;)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 158
    iget-object p2, p3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {p1, v0, p2}, Ll/۬ۖۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    :cond_0
    const-string p1, "The claimed file path must be normalized and absolute."

    const/4 p2, 0x0

    .line 48
    invoke-static {p1, p2, p2, p2, p2}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 130
    throw p1
.end method

.method public final ֫(Ljava/lang/String;ZLl/᩸ۢۜ;)Ll/ۙۖۜ;
    .locals 3

    .line 107
    iget-object v0, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    const-string v2, "localPath"

    .line 108
    invoke-static {p1, v1, v2}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 110
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v0

    .line 378
    :try_start_0
    new-instance v2, Ll/ܳۖۜ;

    invoke-direct {v2, p3}, Ll/ܳۖۜ;-><init>(Ll/᩸ۢۜ;)V

    invoke-direct {p0, p1, p2, v2, v1}, Ll/۬ۖۜ;->֫(Ljava/lang/String;ZLl/ۗۖۜ;Ll/۟ۢۜ;)Ll/ۙۖۜ;

    move-result-object p1
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p2

    .line 114
    :try_start_1
    iget-object p3, v1, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {p2, p1, p3}, Ll/۬ۖۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    :goto_0
    :try_start_2
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;)Ll/۠ۖۜ;
    .locals 5

    const-string v0, "missing"

    .line 1631
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz p2, :cond_3

    .line 1632
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x10

    if-ne v2, v3, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1634
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 1635
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_0

    const/16 v4, 0x39

    if-le v3, v4, :cond_1

    :cond_0
    const/16 v4, 0x61

    if-lt v3, v4, :cond_3

    const/16 v4, 0x66

    if-le v3, v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    :cond_3
    :goto_1
    if-nez v1, :cond_5

    if-nez p2, :cond_4

    const/4 p1, 0x0

    goto :goto_2

    .line 1644
    :cond_4
    invoke-static {p2}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    .line 1645
    :goto_2
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p2

    invoke-virtual {p2, v0}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p2

    const-string p3, "<16 lowercase hex digits copied from the latest read>"

    invoke-virtual {p2, p3}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p2

    .line 1646
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v1, "targetVersion"

    invoke-virtual {p3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "Invalid targetVersion"

    .line 1643
    invoke-static {v0, v1, p1, p2, p3}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object p1

    throw p1

    .line 70
    :cond_5
    iget-object v0, p0, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v1

    const-string v2, "path"

    .line 71
    invoke-static {p1, v1, v2}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 72
    invoke-virtual {v0, p1}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v0

    .line 73
    :try_start_0
    invoke-direct {p0, p1, p2, p3, v1}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢۖۜ;Ll/۟ۢۜ;)Ll/۠ۖۜ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 72
    :try_start_1
    invoke-virtual {v0}, Ll/ۤۖۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ll/᩹ۢۜ;)Ll/ۡ᩷ۜ;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 168
    iget-object v2, v1, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v2}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v3

    const-string v4, "localPath"

    move-object/from16 v5, p1

    .line 169
    invoke-static {v5, v3, v4}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 171
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;)Ll/ۤۖۜ;

    move-result-object v17

    .line 173
    :try_start_0
    invoke-virtual {v2, v4}, Ll/ᩳۖۜ;->ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object v5

    invoke-direct {v1, v5}, Ll/۬ۖۜ;->֫(Ll/ۤ᩵ܿ;)Ll/۫᩵ܿ;

    move-result-object v5

    .line 175
    invoke-direct {v1, v5, v4}, Ll/۬ۖۜ;->ۧ(Ll/۫᩵ܿ;Ljava/lang/String;)V

    .line 176
    invoke-virtual {v5}, Ll/۫᩵ܿ;->ܽ()J

    move-result-wide v6

    const-wide v8, 0x1fffffffffffffL

    cmp-long v10, v6, v8

    if-gtz v10, :cond_0

    .line 182
    new-instance v6, Ll/᩸ۖۜ;

    invoke-direct {v6, v1, v4, v2, v5}, Ll/᩸ۖۜ;-><init>(Ll/۬ۖۜ;Ljava/lang/String;Ll/ܶ᩵ܿ;Ll/۫᩵ܿ;)V

    const/4 v2, 0x1

    .line 183
    invoke-static {v6, v2}, Ll/᩸ۖۜ;->֫(Ll/᩸ۖۜ;Z)V
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    .line 185
    :try_start_1
    iget-object v5, v0, Ll/᩹ۢۜ;->֫:Ll/۫ۢۜ;

    iget-object v7, v0, Ll/᩹ۢۜ;->ۧ:Ll/ۙۢۜ;

    iget-object v0, v0, Ll/᩹ۢۜ;->ܽ:Ll/᩷ۜۜ;

    invoke-static {v5, v7, v0, v6}, Ll/۫ۢۜ;->֫(Ll/۫ۢۜ;Ll/ۙۢۜ;Ll/᩷ۜۜ;Ll/᩸ۖۜ;)Ll/ۡ᩷ۜ;

    move-result-object v0

    .line 186
    invoke-static {v6}, Ll/᩸ۖۜ;->֫(Ll/᩸ۖۜ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    :try_start_2
    invoke-static {v6, v2}, Ll/᩸ۖۜ;->֫(Ll/᩸ۖۜ;Z)V
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 195
    invoke-virtual/range {v17 .. v17}, Ll/ۤۖۜ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    .line 189
    :try_start_3
    invoke-static {v6, v2}, Ll/᩸ۖۜ;->֫(Ll/᩸ۖۜ;Z)V

    .line 190
    throw v0

    :cond_0
    const-string v5, "FILE_STORAGE_ERROR"

    const-string v6, "The local source size exceeds the supported JSON integer range."

    .line 177
    iget-object v8, v3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const-string v9, "source_stat"

    const-string v10, "size_out_of_range"

    .line 180
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v7, v4

    .line 1589
    invoke-static/range {v5 .. v16}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 177
    throw v0
    :try_end_3
    .catch Ll/ۗۛ᩻; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 192
    :try_start_4
    iget-object v2, v3, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v0, v4, v2}, Ll/۬ۖۜ;->֫(Ll/ۗۛ᩻;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 171
    :goto_0
    :try_start_5
    invoke-virtual/range {v17 .. v17}, Ll/ۤۖۜ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Z)Ll/ܺۖۜ;
    .locals 15

    move-object v1, p0

    .line 82
    iget-object v0, v1, Ll/۬ۖۜ;->ܽ:Ll/ᩳۖۜ;

    invoke-virtual {v0}, Ll/ᩳۖۜ;->֫()Ll/۟ۢۜ;

    move-result-object v2

    const-string v3, "sourcePath"

    move-object/from16 v4, p1

    .line 83
    invoke-static {v4, v2, v3}, Ll/ᩳۖۜ;->֫(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v3, "destinationPath"

    move-object/from16 v4, p2

    .line 85
    invoke-static {v4, v2, v3}, Ll/ᩳۖۜ;->ۧ(Ljava/lang/String;Ll/۟ۢۜ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 87
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 93
    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v3

    .line 94
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 93
    invoke-virtual {v0, v3}, Ll/ᩳۖۜ;->֫(Ljava/util/List;)Ll/ۤۖۜ;

    move-result-object v3

    move/from16 v0, p3

    .line 95
    :try_start_0
    invoke-direct {p0, v2, v6, v7, v0}, Ll/۬ۖۜ;->֫(Ll/۟ۢۜ;Ljava/lang/String;Ljava/lang/String;Z)Ll/ܺۖۜ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    invoke-virtual {v3}, Ll/ۤۖۜ;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 93
    :try_start_1
    invoke-virtual {v3}, Ll/ۤۖۜ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2

    .line 88
    :cond_0
    iget-object v8, v2, Ll/۟ۢۜ;->ᩳ:Ljava/lang/String;

    const/4 v13, 0x1

    .line 91
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v14

    const-string v4, "FILE_INVALID_PATH"

    const-string v5, "Source and destination must have different normalized absolute paths."

    const-string v9, "prepare"

    const-string v10, "same_path"

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 88
    invoke-static/range {v4 .. v14}, Ll/۬ۖۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLbin/mt/json/JSONArray;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method
