.class public final Ll/ۗۨ᩻;
.super Ljava/lang/Object;
.source "M7AC"


# direct methods
.method public static ֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    .line 155
    :goto_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 156
    invoke-virtual {p0, v0}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 157
    sget p1, Ll/۫ۨ᩻;->֫:I

    .line 271
    new-instance p1, Ll/ۨۖܽ;

    invoke-direct {p1}, Ll/ۨۖܽ;-><init>()V

    .line 282
    invoke-virtual {p0, v0}, Ll/ۤۨۡ;->᩻(I)I

    move-result v2

    invoke-virtual {p0, v0}, Ll/ۤۨۡ;->ᩳ(I)I

    move-result v3

    .line 283
    invoke-virtual {p0, v0}, Ll/ۤۨۡ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v0}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v5

    .line 284
    invoke-virtual {p0, v0}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v6

    invoke-virtual {p0, v0}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v7

    move-object v1, p1

    move-object v8, p2

    .line 282
    invoke-static/range {v1 .. v8}, Ll/۫ۨ᩻;->֫(Ll/ۨۖܽ;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ll/۫ܽܽ;)V

    .line 273
    invoke-virtual {p1}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ᩳܰۡ;)Ll/᩶ۨ᩻;
    .locals 11

    const-string v0, "AndroidManifest.xml"

    .line 29
    invoke-virtual {p0, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 40
    new-instance p0, Ll/᩶ۨ᩻;

    invoke-direct {p0}, Ll/᩶ۨ᩻;-><init>()V

    .line 41
    iput-boolean v1, p0, Ll/᩶ۨ᩻;->ܽ:Z

    const-string v0, "AndroidManifest.xml not found"

    .line 42
    iput-object v0, p0, Ll/᩶ۨ᩻;->ᩳ:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 v2, 0x0

    .line 1757
    :try_start_0
    invoke-virtual {p0, v0, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v0

    .line 34
    invoke-static {v0}, Ll/ܶۨۡ;->ۧ([B)Ll/ܶۨۡ;

    move-result-object v0

    .line 35
    new-instance v3, Ll/᩶ۨ᩻;

    invoke-direct {v3}, Ll/᩶ۨ᩻;-><init>()V

    const-string v4, "resources.arsc"

    .line 36
    invoke-virtual {p0, v4}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v4

    if-nez v4, :cond_1

    new-instance p0, Ll/۫ܽܽ;

    invoke-direct {p0}, Ll/۫ܽܽ;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v4, Ll/۫ܽܽ;

    invoke-direct {v4, p0}, Ll/۫ܽܽ;-><init>(Ll/ᩳܰۡ;)V

    move-object p0, v4

    .line 37
    :goto_0
    invoke-virtual {v0, p0}, Ll/ܶۨۡ;->֫(Ll/۫ܽܽ;)[B

    .line 38
    invoke-virtual {v0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    move-object v4, v2

    .line 41
    :cond_3
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Ll/ۤۨۡ;->next()I

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v6, 0x1

    if-eq v5, v6, :cond_17

    const/4 v7, 0x2

    const-string v8, "intent-filter"

    const-string v9, "activity-alias"

    const-string v10, "activity"

    if-ne v5, v7, :cond_13

    .line 43
    :try_start_2
    invoke-virtual {v0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v7, "manifest"

    .line 44
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const-string v5, "package"

    .line 45
    invoke-static {v0, v5, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Ll/᩶ۨ᩻;->᩻:Ljava/lang/String;

    const-string v5, "versionName"

    .line 46
    invoke-static {v0, v5, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Ll/᩶ۨ᩻;->ۢ:Ljava/lang/String;

    const-string v5, "versionCode"

    .line 47
    invoke-static {v0, v5, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Ll/᩶ۨ᩻;->᩷:Ljava/lang/String;

    goto :goto_2

    :cond_4
    const-string v7, "uses-sdk"

    .line 48
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const-string v5, "minSdkVersion"

    .line 49
    invoke-static {v0, v5, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Ll/᩶ۨ᩻;->ܳ:Ljava/lang/String;

    const-string v5, "targetSdkVersion"

    .line 50
    invoke-static {v0, v5, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Ll/᩶ۨ᩻;->ۜ:Ljava/lang/String;

    goto :goto_2

    :cond_5
    const-string v7, "uses-permission"

    .line 51
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_2

    :cond_6
    const-string v7, "application"

    .line 53
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 54
    invoke-static {v3, v0, p0}, Ll/ۗۨ᩻;->֫(Ll/᩶ۨ᩻;Ll/ۤۨۡ;Ll/۫ܽܽ;)V

    goto :goto_2

    .line 55
    :cond_7
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v10, "name"

    if-nez v7, :cond_e

    :try_start_3
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    goto/16 :goto_3

    :cond_8
    if-eqz v4, :cond_9

    .line 59
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 225
    iput-boolean v6, v4, Ll/ۙۨ᩻;->ܽ:Z

    .line 226
    iput-boolean v1, v4, Ll/ۙۨ᩻;->ۧ:Z

    .line 227
    iput-boolean v1, v4, Ll/ۙۨ᩻;->֫:Z

    goto/16 :goto_2

    :cond_9
    const-string v6, "service"

    .line 61
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto/16 :goto_2

    :cond_a
    const-string v6, "receiver"

    .line 63
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    goto/16 :goto_2

    :cond_b
    const-string v6, "provider"

    .line 65
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    goto/16 :goto_2

    :cond_c
    if-eqz v4, :cond_d

    const-string v6, "action"

    .line 67
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 68
    invoke-static {v0, v10, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v5

    .line 234
    iget-boolean v6, v4, Ll/ۙۨ᩻;->ܽ:Z

    if-eqz v6, :cond_3

    .line 235
    iget-boolean v6, v4, Ll/ۙۨ᩻;->ۧ:Z

    const-string v7, "android.intent.action.MAIN"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v6

    iput-boolean v5, v4, Ll/ۙۨ᩻;->ۧ:Z

    goto/16 :goto_2

    :cond_d
    if-eqz v4, :cond_3

    const-string v6, "category"

    .line 69
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 70
    invoke-static {v0, v10, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v5

    .line 243
    iget-boolean v6, v4, Ll/ۙۨ᩻;->ܽ:Z

    if-eqz v6, :cond_3

    .line 244
    iget-boolean v6, v4, Ll/ۙۨ᩻;->֫:Z

    const-string v7, "android.intent.category.LAUNCHER"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v6

    iput-boolean v5, v4, Ll/ۙۨ᩻;->֫:Z

    goto/16 :goto_2

    .line 57
    :cond_e
    :goto_3
    new-instance v4, Ll/ۙۨ᩻;

    iget-object v6, v3, Ll/᩶ۨ᩻;->᩻:Ljava/lang/String;

    .line 58
    invoke-static {v0, v10, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "targetActivity"

    invoke-static {v0, v8, p0}, Ll/ۗۨ᩻;->֫(Ll/ۤۨۡ;Ljava/lang/String;Ll/۫ܽܽ;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "activity-alias"

    .line 186
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    if-eqz v8, :cond_f

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_f

    move-object v7, v8

    :cond_f
    if-eqz v7, :cond_12

    .line 168
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_12

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_4

    :cond_10
    const/4 v5, 0x0

    .line 171
    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v8, 0x2e

    if-ne v5, v8, :cond_11

    .line 172
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    .line 174
    :cond_11
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    if-gez v5, :cond_12

    const-string v5, "."

    .line 0
    invoke-static {v6, v5, v7}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 57
    :cond_12
    :goto_4
    invoke-direct {v4, v7}, Ll/ۙۨ᩻;-><init>(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_13
    const/4 v7, 0x3

    if-ne v5, v7, :cond_3

    .line 73
    invoke-virtual {v0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v5

    if-eqz v4, :cond_15

    .line 74
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_15

    .line 252
    iget-boolean v5, v4, Ll/ۙۨ᩻;->ܽ:Z

    if-eqz v5, :cond_14

    iget-boolean v5, v4, Ll/ۙۨ᩻;->ۧ:Z

    if-eqz v5, :cond_14

    iget-boolean v5, v4, Ll/ۙۨ᩻;->֫:Z

    if-eqz v5, :cond_14

    .line 253
    iput-boolean v6, v4, Ll/ۙۨ᩻;->ᩳ:Z

    .line 255
    :cond_14
    iput-boolean v1, v4, Ll/ۙۨ᩻;->ܽ:Z

    .line 256
    iput-boolean v1, v4, Ll/ۙۨ᩻;->ۧ:Z

    .line 257
    iput-boolean v1, v4, Ll/ۙۨ᩻;->֫:Z

    goto/16 :goto_2

    :cond_15
    if-eqz v4, :cond_3

    .line 76
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_16

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 77
    :cond_16
    iget-boolean v5, v4, Ll/ۙۨ᩻;->ᩳ:Z

    if-eqz v5, :cond_2

    iget-object v4, v4, Ll/ۙۨ᩻;->ܿ:Ljava/lang/String;

    if-eqz v4, :cond_2

    .line 78
    iget-object v5, v3, Ll/᩶ۨ᩻;->ܿ:Ljava/util/LinkedHashSet;

    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    .line 84
    :cond_17
    :try_start_4
    invoke-virtual {v0}, Ll/ۤۨۡ;->close()V

    .line 85
    iput-boolean v6, v3, Ll/᩶ۨ᩻;->ܽ:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object v3

    :catchall_0
    move-exception p0

    .line 38
    :try_start_5
    invoke-virtual {v0}, Ll/ۤۨۡ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p0

    .line 89
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_18

    const-string p0, "Failed to parse manifest"

    goto :goto_6

    :cond_18
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 40
    :goto_6
    new-instance v0, Ll/᩶ۨ᩻;

    invoke-direct {v0}, Ll/᩶ۨ᩻;-><init>()V

    .line 41
    iput-boolean v1, v0, Ll/᩶ۨ᩻;->ܽ:Z

    .line 42
    iput-object p0, v0, Ll/᩶ۨ᩻;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public static ֫(Ll/᩶ۨ᩻;Ll/ۤۨۡ;Ll/۫ܽܽ;)V
    .locals 10

    const/4 v0, 0x0

    .line 112
    :goto_0
    invoke-virtual {p1}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v1

    if-ge v0, v1, :cond_8

    const-string v1, "label"

    .line 113
    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 116
    :cond_0
    sget v1, Ll/۫ۨ᩻;->֫:I

    .line 271
    new-instance v1, Ll/ۨۖܽ;

    invoke-direct {v1}, Ll/ۨۖܽ;-><init>()V

    .line 282
    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->᩻(I)I

    move-result v3

    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->ᩳ(I)I

    move-result v4

    .line 283
    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v6

    .line 284
    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v7

    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v8

    move-object v2, v1

    move-object v9, p2

    .line 282
    invoke-static/range {v2 .. v9}, Ll/۫ۨ᩻;->֫(Ll/ۨۖܽ;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ll/۫ܽܽ;)V

    .line 273
    invoke-virtual {v1}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object v1

    .line 116
    iput-object v1, p0, Ll/᩶ۨ᩻;->ۧ:Ljava/lang/String;

    .line 117
    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->᩻(I)I

    move-result v1

    .line 118
    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->ᩳ(I)I

    move-result v2

    invoke-virtual {p1, v0}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v3, 0x3

    if-ne v1, v3, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    .line 200
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    :goto_1
    move-object p1, v0

    goto :goto_2

    :cond_2
    const/4 p1, 0x1

    if-ne v1, p1, :cond_7

    if-nez v2, :cond_3

    goto :goto_3

    .line 139
    :cond_3
    :try_start_0
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 140
    invoke-virtual {p2, v2, v1, p1}, Ll/۫ܽܽ;->֫(ILandroid/util/TypedValue;Z)V

    .line 141
    iget p1, v1, Landroid/util/TypedValue;->type:I

    if-ne p1, v3, :cond_7

    iget-object p1, v1, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-nez p1, :cond_4

    goto :goto_3

    .line 144
    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_3

    .line 200
    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    move-object v0, p1

    goto :goto_3

    :catch_0
    nop

    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    .line 120
    iput-object v0, p0, Ll/᩶ۨ᩻;->֫:Ljava/lang/String;

    :cond_8
    return-void
.end method
