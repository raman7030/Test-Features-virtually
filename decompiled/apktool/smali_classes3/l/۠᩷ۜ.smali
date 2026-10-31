.class public final Ll/۠᩷ۜ;
.super Ljava/lang/Object;
.source "N7AJ"


# static fields
.field public static final synthetic ۧ:I

.field public static final ܽ:[C

.field public static final ᩳ:Ljava/security/SecureRandom;


# instance fields
.field public final ֫:Ll/ܶ᩵ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789abcdefghijklmnopqrstuvwxyz"

    .line 51
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/۠᩷ۜ;->ܽ:[C

    .line 52
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Ll/۠᩷ۜ;->ᩳ:Ljava/security/SecureRandom;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 60
    sget-object v0, Ll/ܽ֡ܿ;->ᩳ:Ll/ܶ᩵ܿ;

    const-string v1, "mcp"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object v0, p0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 10

    .line 196
    :try_start_0
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 197
    invoke-virtual {p0}, Ll/ᩳܰۡ;->᩻()Ll/۠ۖܽ;

    move-result-object p0

    const-wide/16 v1, 0x0

    .line 198
    invoke-interface {p0, v1, v2}, Ll/۠ۖܽ;->seek(J)V

    .line 199
    invoke-interface {p0}, Ll/۠ۖܽ;->length()J

    move-result-wide v3

    const/16 v5, 0x2000

    new-array v6, v5, [B

    const/4 v7, 0x0

    .line 446
    invoke-virtual {p1, v7}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    cmp-long v8, v3, v1

    if-lez v8, :cond_2

    int-to-long v8, v5

    .line 204
    :try_start_1
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    long-to-int v9, v8

    invoke-interface {p0, v6, v7, v9}, Ll/۠ۖܽ;->read([BII)I

    move-result v8

    if-ltz v8, :cond_0

    .line 208
    invoke-virtual {v0, v6, v7, v8}, Ljava/security/MessageDigest;->update([BII)V

    .line 209
    invoke-virtual {p1, v6, v7, v8}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v8, v8

    sub-long/2addr v3, v8

    goto :goto_0

    .line 206
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unexpected EOF while copying archive"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    if-eqz p1, :cond_1

    .line 201
    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw p0

    :cond_2
    if-eqz p1, :cond_3

    .line 212
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    .line 213
    :cond_3
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 217
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 215
    throw p0
.end method

.method public static ֫(Ll/֡᩷ۜ;)V
    .locals 9

    .line 605
    iget-object v0, p0, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    iget-object v1, p0, Ll/֡᩷ۜ;->ܽ:Ll/ܶ᩵ܿ;

    const-string v2, "absent"

    .line 634
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "parse_error"

    const-string v4, "available"

    if-nez v2, :cond_1

    .line 635
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "extract_error"

    .line 636
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 637
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 606
    :cond_0
    iget-object v0, p0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p0, p0, Ll/֡᩷ۜ;->ۘ:Z

    .line 443
    invoke-static {v0, p0}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p0

    .line 606
    throw p0

    :cond_1
    :goto_0
    const-string v0, "original.apk"

    .line 393
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 609
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 612
    iget-object v0, p0, Ll/֡᩷ۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v5, "entries"

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵᩷ۜ;

    .line 613
    iget-object v6, v2, Ll/᩵᩷ۜ;->ᩳ:Ljava/lang/String;

    iget-object v7, v2, Ll/᩵᩷ۜ;->֫:Ljava/lang/String;

    .line 644
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "error"

    .line 645
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "skipped"

    .line 646
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_2

    .line 614
    :cond_3
    iget-object v0, p0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p0, p0, Ll/֡᩷ۜ;->ۘ:Z

    .line 443
    invoke-static {v0, p0}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p0

    .line 614
    throw p0

    .line 616
    :cond_4
    :goto_2
    iget-object v2, v2, Ll/᩵᩷ۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v7, :cond_5

    .line 401
    invoke-virtual {v1, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 417
    invoke-virtual {v2, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 618
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 619
    invoke-static {v1, v7}, Ll/۠᩷ۜ;->ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    .line 620
    :cond_5
    iget-object v0, p0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p0, p0, Ll/֡᩷ۜ;->ۘ:Z

    .line 443
    invoke-static {v0, p0}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p0

    .line 620
    throw p0

    .line 624
    :cond_6
    iget-object v0, p0, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 401
    :cond_7
    invoke-virtual {v1, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, "resources.arsc"

    .line 413
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 625
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    return-void

    .line 626
    :cond_9
    iget-object v0, p0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p0, p0, Ll/֡᩷ۜ;->ۘ:Z

    .line 443
    invoke-static {v0, p0}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p0

    .line 626
    throw p0

    .line 610
    :cond_a
    iget-object v0, p0, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p0, p0, Ll/֡᩷ۜ;->ۘ:Z

    .line 443
    invoke-static {v0, p0}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p0

    .line 610
    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;J)V
    .locals 4

    const-string v0, "metadata.json"

    .line 397
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 367
    :try_start_0
    new-instance v1, Lbin/mt/json/JSONObject;

    new-instance v2, Ljava/lang/String;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v0

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const-string v0, "lastAccessedAt"

    .line 372
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 373
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONObject;->remove(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    goto :goto_0

    .line 375
    :cond_0
    invoke-virtual {v1, v0, p1, p2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    .line 376
    invoke-static {p0, v1}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;Lbin/mt/json/JSONObject;)V

    return-void

    :catch_0
    move-exception p0

    .line 369
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unable to read metadata"

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Lbin/mt/json/JSONObject;)V
    .locals 2

    const-string v0, "metadata.json"

    .line 397
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 382
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۨ()V

    const-string v0, ".metadata"

    .line 383
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 385
    :try_start_0
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->֫([B)V

    .line 386
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩹()Ll/ۤ᩵ܿ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/ۤ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 388
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 389
    throw p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/֡᩷ۜ;)V
    .locals 7

    .line 685
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 686
    iget-object v1, p1, Ll/֡᩷ۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵᩷ۜ;

    .line 687
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "entryName"

    iget-object v5, v2, Ll/᩵᩷ۜ;->֫:Ljava/lang/String;

    .line 688
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "status"

    iget-object v5, v2, Ll/᩵᩷ۜ;->ᩳ:Ljava/lang/String;

    .line 689
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "error"

    iget-object v5, v2, Ll/᩵᩷ۜ;->ۧ:Ljava/lang/String;

    .line 690
    invoke-virtual {v3, v4, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "indexCachePath"

    iget-object v2, v2, Ll/᩵᩷ۜ;->ܽ:Ljava/lang/String;

    .line 691
    invoke-virtual {v3, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 692
    invoke-virtual {v0, v2}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    .line 694
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "schemaVersion"

    const/4 v3, 0x1

    .line 695
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    iget-object v3, p1, Ll/֡᩷ۜ;->ᩴ:Ljava/lang/String;

    .line 696
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "temporary"

    iget-boolean v3, p1, Ll/֡᩷ۜ;->ۘ:Z

    .line 697
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "sourcePath"

    iget-object v3, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    .line 698
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "sourceSize"

    iget-wide v3, p1, Ll/֡᩷ۜ;->ۖ:J

    .line 699
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "sourceLastModified"

    iget-wide v3, p1, Ll/֡᩷ۜ;->ۡ:J

    .line 700
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "originalSha256"

    iget-object v3, p1, Ll/֡᩷ۜ;->ܿ:Ljava/lang/String;

    .line 701
    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "createdAt"

    iget-wide v3, p1, Ll/֡᩷ۜ;->֫:J

    .line 702
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "lastAccessedAt"

    iget-wide v3, p1, Ll/֡᩷ۜ;->ᩳ:J

    .line 703
    invoke-virtual {v1, v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "dexFiles"

    .line 704
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resourceStatus"

    iget-object v2, p1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    .line 705
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "resourceError"

    iget-object v2, p1, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    .line 706
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "available"

    .line 707
    iget-object v2, p1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-wide v2, p1, Ll/֡᩷ۜ;->᩻:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    const-string v2, "resourceSha256"

    .line 708
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "resourceLength"

    .line 709
    iget-wide v2, p1, Ll/֡᩷ۜ;->᩻:J

    invoke-virtual {v0, v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    .line 357
    :cond_1
    invoke-static {p0, v0}, Ll/۠᩷ۜ;->֫(Ll/ܶ᩵ܿ;Lbin/mt/json/JSONObject;)V

    return-void
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    const-string v0, "cache"

    .line 405
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    const-string v0, "dex"

    .line 409
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 421
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".type_index"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 180
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 183
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 413
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 184
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 185
    invoke-static {v1}, Ll/۠᩷ۜ;->ۧ(Ll/ܶ᩵ܿ;)V

    goto :goto_0

    .line 188
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public static ܳ(Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 1

    .line 1329
    :try_start_0
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 1316
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/io/InputStream;)V

    .line 1317
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 230
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p0

    .line 228
    throw p0
.end method

.method public static ܽ(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/֡᩷ۜ;
    .locals 12

    .line 483
    invoke-static {p0}, Ll/۠᩷ۜ;->ܿ(Ll/ܶ᩵ܿ;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "schemaVersion"

    const/4 v2, -0x1

    .line 484
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_10

    const-string v1, "workspaceId"

    const/4 v4, 0x0

    .line 487
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 488
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 491
    new-instance p1, Ll/֡᩷ۜ;

    invoke-direct {p1, p0, v1}, Ll/֡᩷ۜ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    const-string p0, "temporary"

    const/4 v1, 0x0

    .line 492
    invoke-virtual {v0, p0, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    iput-boolean p0, p1, Ll/֡᩷ۜ;->ۘ:Z

    const-string p0, "sourcePath"

    .line 493
    invoke-virtual {v0, p0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_0

    .line 553
    :cond_0
    :try_start_0
    invoke-static {v5, p0}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :goto_0
    move-object p0, v4

    .line 493
    :goto_1
    iput-object p0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    const-string p0, "sourceSize"

    const-wide/16 v5, -0x1

    .line 494
    invoke-virtual {v0, p0, v5, v6}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v7

    iput-wide v7, p1, Ll/֡᩷ۜ;->ۖ:J

    const-string p0, "sourceLastModified"

    .line 495
    invoke-virtual {v0, p0, v5, v6}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v7

    iput-wide v7, p1, Ll/֡᩷ۜ;->ۡ:J

    const-string p0, "originalSha256"

    .line 496
    invoke-virtual {v0, p0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, Ll/֡᩷ۜ;->ܿ:Ljava/lang/String;

    const-string p0, "createdAt"

    .line 497
    invoke-virtual {v0, p0, v5, v6}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v7

    iput-wide v7, p1, Ll/֡᩷ۜ;->֫:J

    const-string p0, "lastAccessedAt"

    .line 498
    invoke-virtual {v0, p0, v5, v6}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v7

    iput-wide v7, p1, Ll/֡᩷ۜ;->ᩳ:J

    .line 499
    iget-object p0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    if-eqz p0, :cond_e

    iget-wide v7, p1, Ll/֡᩷ۜ;->ۖ:J

    const-wide/16 v9, 0x0

    cmp-long p0, v7, v9

    if-ltz p0, :cond_e

    iget-wide v7, p1, Ll/֡᩷ۜ;->ۡ:J

    cmp-long p0, v7, v9

    if-ltz p0, :cond_e

    iget-object p0, p1, Ll/֡᩷ۜ;->ܿ:Ljava/lang/String;

    if-eqz p0, :cond_e

    iget-wide v7, p1, Ll/֡᩷ۜ;->֫:J

    cmp-long p0, v7, v9

    if-ltz p0, :cond_e

    const-string p0, "resourceStatus"

    .line 504
    invoke-virtual {v0, p0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_d

    .line 505
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v7

    if-nez v7, :cond_d

    .line 510
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 511
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    const-string p0, "resourceError"

    .line 515
    invoke-virtual {v0, p0, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, Ll/֡᩷ۜ;->ܳ:Ljava/lang/String;

    const-string p0, "resourceSha256"

    .line 563
    invoke-virtual {v0, p0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string v7, "resourceLength"

    .line 564
    invoke-virtual {v0, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    const-string v8, "available"

    .line 565
    iget-object v11, p1, Ll/֡᩷ۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    if-nez p0, :cond_2

    if-eqz v7, :cond_1

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    .line 566
    :cond_2
    :goto_2
    iput-boolean v3, p1, Ll/֡᩷ۜ;->ۜ:Z

    .line 567
    iput-object v4, p1, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    .line 568
    iput-wide v5, p1, Ll/֡᩷ۜ;->᩻:J

    goto :goto_4

    :cond_3
    if-nez p0, :cond_4

    if-nez v7, :cond_4

    .line 572
    iput-boolean v3, p1, Ll/֡᩷ۜ;->ۜ:Z

    goto :goto_4

    :cond_4
    if-eqz p0, :cond_b

    if-eqz v7, :cond_b

    .line 575
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 579
    :try_start_1
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    .line 580
    invoke-virtual {v7}, Lbin/mt/json/JSONValue;->asLong()J

    move-result-wide v5

    iput-wide v5, p1, Ll/֡᩷ۜ;->᩻:J
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 584
    iget-object p0, p1, Ll/֡᩷ۜ;->᩷:Ljava/lang/String;

    if-eqz p0, :cond_a

    .line 593
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v5, 0x40

    if-ne v3, v5, :cond_a

    .line 596
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_5

    .line 597
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x10

    invoke-static {v3, v5}, Ljava/lang/Character;->digit(CI)I

    move-result v3

    if-eq v3, v2, :cond_a

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 584
    :cond_5
    iget-wide v1, p1, Ll/֡᩷ۜ;->᩻:J

    cmp-long p0, v1, v9

    if-ltz p0, :cond_a

    :goto_4
    const-string p0, "dexFiles"

    .line 517
    invoke-virtual {v0, p0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_9

    .line 518
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_9

    .line 522
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 523
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 524
    invoke-virtual {p0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbin/mt/json/JSONValue;

    .line 525
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 531
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 532
    new-instance v1, Ll/᩵᩷ۜ;

    const-string v2, "entryName"

    .line 533
    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "status"

    .line 534
    invoke-virtual {v0, v3, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "error"

    .line 535
    invoke-virtual {v0, v5, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "indexCachePath"

    .line 536
    invoke-virtual {v0, v6, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v5, v0}, Ll/᩵᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    iget-object v0, p1, Ll/֡᩷ۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 527
    :cond_6
    new-instance p0, Ll/ۚ᩷ۜ;

    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    invoke-direct {p0, v0, p1}, Ll/ۚ᩷ۜ;-><init>(Ljava/lang/String;Z)V

    throw p0

    :cond_7
    return-object p1

    .line 539
    :cond_8
    new-instance p0, Ll/ۚ᩷ۜ;

    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    invoke-direct {p0, v0, p1}, Ll/ۚ᩷ۜ;-><init>(Ljava/lang/String;Z)V

    throw p0

    .line 520
    :cond_9
    new-instance p0, Ll/ۚ᩷ۜ;

    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    invoke-direct {p0, v0, p1}, Ll/ۚ᩷ۜ;-><init>(Ljava/lang/String;Z)V

    throw p0

    .line 585
    :cond_a
    new-instance p0, Ll/ۚ᩷ۜ;

    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    invoke-direct {p0, v0, p1}, Ll/ۚ᩷ۜ;-><init>(Ljava/lang/String;Z)V

    throw p0

    .line 582
    :catch_1
    new-instance p0, Ll/ۚ᩷ۜ;

    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    invoke-direct {p0, v0, p1}, Ll/ۚ᩷ۜ;-><init>(Ljava/lang/String;Z)V

    throw p0

    .line 576
    :cond_b
    new-instance p0, Ll/ۚ᩷ۜ;

    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    invoke-direct {p0, v0, p1}, Ll/ۚ᩷ۜ;-><init>(Ljava/lang/String;Z)V

    throw p0

    .line 513
    :cond_c
    new-instance p0, Ll/ۚ᩷ۜ;

    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    invoke-direct {p0, v0, p1}, Ll/ۚ᩷ۜ;-><init>(Ljava/lang/String;Z)V

    throw p0

    .line 507
    :cond_d
    new-instance p0, Ll/ۚ᩷ۜ;

    iget-object v0, p1, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    iget-boolean p1, p1, Ll/֡᩷ۜ;->ۘ:Z

    invoke-direct {p0, v0, p1}, Ll/ۚ᩷ۜ;-><init>(Ljava/lang/String;Z)V

    throw p0

    .line 502
    :cond_e
    new-instance p0, Ll/֨᩷ۜ;

    .line 740
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 502
    throw p0

    .line 489
    :cond_f
    new-instance p0, Ll/֨᩷ۜ;

    .line 740
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 489
    throw p0

    .line 485
    :cond_10
    new-instance p0, Ll/֨᩷ۜ;

    .line 740
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 485
    throw p0
.end method

.method public static ܽ(Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 156
    invoke-static {p0}, Ll/۠᩷ۜ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 157
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 158
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to delete "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 158
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܿ(Ll/ܶ᩵ܿ;)Lbin/mt/json/JSONObject;
    .locals 3

    const-string v0, "metadata.json"

    .line 397
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 471
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 475
    :try_start_0
    new-instance v0, Lbin/mt/json/JSONObject;

    new-instance v1, Ljava/lang/String;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object p0

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 477
    :catch_0
    new-instance p0, Ll/֨᩷ۜ;

    .line 740
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 477
    throw p0

    .line 472
    :cond_0
    new-instance p0, Ll/֨᩷ۜ;

    .line 740
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 472
    throw p0
.end method

.method public static ᩳ(Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 163
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 166
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 413
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 167
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 168
    invoke-static {v1}, Ll/۠᩷ۜ;->ᩳ(Ll/ܶ᩵ܿ;)V

    goto :goto_0

    .line 171
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 172
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to delete "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 172
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    return-void
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 454
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 457
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 458
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x61

    if-lt v2, v3, :cond_4

    const/16 v3, 0x7a

    if-le v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_1
    return v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֡᩷ۜ;
    .locals 8

    .line 332
    invoke-static {p1}, Ll/۠᩷ۜ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "fatal"

    const-string v2, "Workspace not found."

    const-string v3, "WORKSPACE_NOT_FOUND"

    const/4 v4, 0x0

    if-eqz v0, :cond_2

    .line 81
    iget-object v0, p0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 337
    :try_start_0
    invoke-static {v0}, Ll/۠᩷ۜ;->ܿ(Ll/ܶ᩵ܿ;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "schemaVersion"

    const/4 v7, -0x1

    .line 338
    invoke-virtual {v5, v6, v7}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    const-string v6, "workspaceId"

    .line 341
    invoke-virtual {v5, v6, v4}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 342
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 345
    new-instance v6, Ll/֡᩷ۜ;

    invoke-direct {v6, v0, p1}, Ll/֡᩷ۜ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    const-string p1, "temporary"

    const/4 v0, 0x0

    .line 346
    invoke-virtual {v5, p1, v0}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v6, Ll/֡᩷ۜ;->ۘ:Z

    return-object v6

    .line 343
    :cond_0
    new-instance p1, Ll/֨᩷ۜ;

    .line 740
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 343
    throw p1

    .line 339
    :cond_1
    new-instance p1, Ll/֨᩷ۜ;

    .line 740
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 339
    throw p1
    :try_end_0
    .catch Ll/֨᩷ۜ; {:try_start_0 .. :try_end_0} :catch_0

    .line 428
    :catch_0
    invoke-static {v4, v3, v2, v1}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 349
    throw p1

    .line 428
    :cond_2
    invoke-static {v4, v3, v2, v1}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 333
    throw p1
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)Ll/֡᩷ۜ;
    .locals 16

    move-object/from16 v0, p0

    .line 239
    iget-object v1, v0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_d

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_7

    .line 242
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 243
    invoke-virtual/range {p1 .. p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v4

    const-string v5, "sourcePath"

    if-nez v4, :cond_1

    goto :goto_0

    .line 553
    :cond_1
    :try_start_0
    invoke-static {v4, v5}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :goto_0
    move-object v4, v3

    :goto_1
    if-nez v4, :cond_2

    goto/16 :goto_7

    .line 247
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v6

    .line 248
    invoke-virtual/range {p1 .. p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v8

    const/4 v10, 0x1

    .line 413
    invoke-virtual {v1, v10}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v1

    .line 249
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܶ᩵ܿ;

    .line 250
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_2

    .line 279
    :cond_3
    :try_start_1
    invoke-static {v11}, Ll/۠᩷ۜ;->ܿ(Ll/ܶ᩵ܿ;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "schemaVersion"

    const/4 v14, -0x1

    .line 280
    invoke-virtual {v12, v13, v14}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v13

    if-eq v13, v10, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v10, "workspaceId"

    .line 283
    invoke-virtual {v12, v10, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 284
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-static {v10}, Ll/۠᩷ۜ;->ᩳ(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_4

    .line 287
    :cond_5
    new-instance v13, Ll/֡᩷ۜ;

    invoke-direct {v13, v11, v10}, Ll/֡᩷ۜ;-><init>(Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    const-string v10, "temporary"

    const/4 v11, 0x0

    .line 288
    invoke-virtual {v12, v10, v11}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    iput-boolean v10, v13, Ll/֡᩷ۜ;->ۘ:Z

    .line 289
    invoke-virtual {v12, v5, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-nez v10, :cond_6

    goto :goto_3

    .line 553
    :cond_6
    :try_start_2
    invoke-static {v10, v5}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_2
    .catch Ll/ۗۛ᩻; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 289
    :catch_1
    :goto_3
    :try_start_3
    iput-object v3, v13, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    const-string v3, "sourceSize"

    const-wide/16 v10, -0x1

    .line 290
    invoke-virtual {v12, v3, v10, v11}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v14

    iput-wide v14, v13, Ll/֡᩷ۜ;->ۖ:J

    const-string v3, "sourceLastModified"

    .line 291
    invoke-virtual {v12, v3, v10, v11}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v14

    iput-wide v14, v13, Ll/֡᩷ۜ;->ۡ:J

    const-string v3, "originalSha256"

    const/4 v14, 0x0

    .line 292
    invoke-virtual {v12, v3, v14}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v13, Ll/֡᩷ۜ;->ܿ:Ljava/lang/String;

    const-string v3, "createdAt"

    .line 293
    invoke-virtual {v12, v3, v10, v11}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v14

    iput-wide v14, v13, Ll/֡᩷ۜ;->֫:J

    const-string v3, "lastAccessedAt"

    .line 294
    invoke-virtual {v12, v3, v10, v11}, Lbin/mt/json/JSONObject;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    iput-wide v10, v13, Ll/֡᩷ۜ;->ᩳ:J

    .line 295
    iget-boolean v3, v13, Ll/֡᩷ۜ;->ۘ:Z

    if-nez v3, :cond_8

    iget-object v3, v13, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    if-eqz v3, :cond_8

    iget-wide v10, v13, Ll/֡᩷ۜ;->ۖ:J

    const-wide/16 v14, 0x0

    cmp-long v3, v10, v14

    if-ltz v3, :cond_8

    iget-wide v10, v13, Ll/֡᩷ۜ;->ۡ:J

    cmp-long v3, v10, v14

    if-ltz v3, :cond_8

    iget-object v3, v13, Ll/֡᩷ۜ;->ܿ:Ljava/lang/String;

    if-eqz v3, :cond_8

    iget-wide v10, v13, Ll/֡᩷ۜ;->֫:J
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    cmp-long v3, v10, v14

    if-gez v3, :cond_7

    goto :goto_4

    :cond_7
    move-object v3, v13

    goto :goto_5

    :catch_2
    :cond_8
    :goto_4
    const/4 v3, 0x0

    :goto_5
    if-nez v3, :cond_9

    goto :goto_6

    .line 257
    :cond_9
    iget-object v10, v3, Ll/֡᩷ۜ;->ܺ:Ljava/lang/String;

    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    iget-wide v10, v3, Ll/֡᩷ۜ;->ۖ:J

    cmp-long v12, v6, v10

    if-nez v12, :cond_a

    iget-wide v10, v3, Ll/֡᩷ۜ;->ۡ:J

    cmp-long v12, v8, v10

    if-nez v12, :cond_a

    .line 260
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_6
    const/4 v3, 0x0

    const/4 v10, 0x1

    goto/16 :goto_2

    .line 263
    :cond_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v3, 0x0

    goto :goto_7

    .line 266
    :cond_c
    invoke-static/range {p1 .. p1}, Ll/۠᩷ۜ;->ܳ(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v1

    .line 267
    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/ۘ᩷ۜ;

    invoke-direct {v3, v1}, Ll/ۘ᩷ۜ;-><init>(Ljava/lang/String;)V

    .line 268
    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ᩴ᩷ۜ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 269
    invoke-static {v2}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->max(Ljava/util/Comparator;)Ll/ܽ۫ᩴ;

    move-result-object v1

    const/4 v2, 0x0

    .line 270
    invoke-virtual {v1, v2}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩷ۜ;

    return-object v1

    :cond_d
    :goto_7
    return-object v3
.end method

.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 9

    .line 88
    iget-object v0, p0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 92
    :try_start_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    if-nez v1, :cond_0

    .line 93
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_6

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0x64

    if-ge v4, v6, :cond_2

    .line 95
    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, ".tmp-"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4

    .line 96
    :try_start_2
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v7

    if-nez v7, :cond_1

    .line 97
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۛ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    const-string v3, "entries"

    .line 401
    invoke-virtual {v6, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ()V

    const-string v3, "cache"

    .line 405
    invoke-virtual {v6, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    const-string v4, "dex"

    .line 409
    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 100
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    return-object v6

    :catch_0
    move-exception v3

    goto :goto_1

    :catch_1
    move-exception v3

    :goto_1
    const/4 v4, 0x1

    goto :goto_3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_2
    move-exception v3

    goto :goto_2

    :catch_3
    move-exception v3

    :goto_2
    move v4, v5

    :goto_3
    move-object v5, v3

    move-object v3, v6

    goto :goto_5

    .line 105
    :cond_2
    :try_start_4
    new-instance v4, Ljava/io/IOException;

    const-string v6, "Unable to create temporary workspace"

    invoke-direct {v4, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    move-exception v4

    goto :goto_4

    :catch_5
    move-exception v4

    :goto_4
    move v8, v5

    move-object v5, v4

    move v4, v8

    goto :goto_5

    :catch_6
    move-exception v5

    goto :goto_5

    :catch_7
    move-exception v5

    :goto_5
    if-eqz v3, :cond_3

    .line 108
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 109
    invoke-static {v3}, Ll/۠᩷ۜ;->ۧ(Ll/ܶ᩵ܿ;)V

    const/4 v4, 0x1

    :cond_3
    if-nez v1, :cond_4

    .line 112
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_6

    :cond_4
    move v2, v4

    :goto_6
    if-eqz v2, :cond_5

    .line 116
    invoke-static {}, Ll/ܺܰۡ;->ۢ()V

    .line 118
    :cond_5
    throw v5
.end method

.method public final ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Z
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 151
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x64

    if-ge v0, v1, :cond_2

    const/16 v1, 0x8

    new-array v2, v1, [C

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_0

    .line 141
    sget-object v4, Ll/۠᩷ۜ;->ᩳ:Ljava/security/SecureRandom;

    sget-object v5, Ll/۠᩷ۜ;->ܽ:[C

    array-length v6, v5

    invoke-virtual {v4, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    aget-char v4, v5, v4

    aput-char v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 143
    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    .line 81
    iget-object v2, p0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v2, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 132
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unable to allocate workspace id"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ljava/lang/String;)Ll/֡᩷ۜ;
    .locals 5

    .line 309
    invoke-static {p1}, Ll/۠᩷ۜ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Workspace not found."

    const-string v2, "WORKSPACE_NOT_FOUND"

    const/4 v3, 0x0

    const-string v4, "fatal"

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 314
    :try_start_0
    invoke-static {v0, p1}, Ll/۠᩷ۜ;->ܽ(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/֡᩷ۜ;

    move-result-object p1

    .line 315
    invoke-static {p1}, Ll/۠᩷ۜ;->֫(Ll/֡᩷ۜ;)V
    :try_end_0
    .catch Ll/֨᩷ۜ; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/ۚ᩷ۜ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, "Workspace is corrupt."

    const-string v0, "WORKSPACE_CORRUPT"

    .line 70
    invoke-static {v3, v0, p1, v4}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 324
    throw p1

    :catch_1
    move-exception p1

    .line 322
    iget-object v0, p1, Ll/ۚ᩷ۜ;->᩸:Ljava/lang/String;

    iget-boolean p1, p1, Ll/ۚ᩷ۜ;->᩹:Z

    .line 443
    invoke-static {v0, p1}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;Z)Ll/ۗۛ᩻;

    move-result-object p1

    .line 322
    throw p1

    :catch_2
    move-exception p1

    .line 320
    throw p1

    .line 428
    :catch_3
    invoke-static {v3, v2, v1, v4}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 318
    throw p1

    .line 428
    :cond_0
    invoke-static {v3, v2, v1, v4}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p1

    .line 310
    throw p1
.end method

.method public final ܽ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۠᩷ۜ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1
.end method
