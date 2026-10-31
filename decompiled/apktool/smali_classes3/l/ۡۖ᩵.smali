.class public final Ll/ۡۖ᩵;
.super Ljava/lang/Object;
.source "09WV"

# interfaces
.implements Ll/ܺۖ᩵;


# static fields
.field public static final ۘ:Ll/֫᩻֨;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۖ:J

.field public ۜ:Ljava/lang/String;

.field public ۡ:Ljava/lang/String;

.field public ۢ:I

.field public ۧ:J

.field public ܳ:Ljava/util/Map;

.field public ܺ:Ljava/lang/String;

.field public ܽ:Z

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;

.field public ᩷:I

.field public ᩻:Ll/ۡۖ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Ll/ۡۖ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۡۖ᩵;->ۘ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p0, p0, Ll/ۡۖ᩵;->᩻:Ll/ۡۖ᩵;

    return-void
.end method

.method public static ֫(Ll/ۘۖ᩵;Ljava/lang/String;JI)Ll/ۡۖ᩵;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    .line 331
    new-instance v3, Ll/ۡۖ᩵;

    invoke-direct {v3}, Ll/ۡۖ᩵;-><init>()V

    const/4 v4, 0x4

    new-array v5, v4, [Ljava/lang/String;

    .line 102
    iget v6, v0, Ll/ۘۖ᩵;->ۨ:I

    int-to-long v6, v6

    .line 333
    iput-wide v6, v3, Ll/ۡۖ᩵;->ۖ:J

    .line 78
    iget v6, v0, Ll/ۘۖ᩵;->ۗ:I

    .line 334
    iput v6, v3, Ll/ۡۖ᩵;->ۢ:I

    move-wide/from16 v7, p2

    .line 335
    iput-wide v7, v3, Ll/ۡۖ᩵;->ۧ:J

    const/4 v7, 0x2

    and-int/2addr v6, v7

    const-string v8, " path consumed "

    const-string v9, " remain "

    const-string v10, " path "

    const/4 v11, 0x0

    .line 336
    sget-object v12, Ll/ۡۖ᩵;->ۘ:Ll/֫᩻֨;

    const/4 v13, 0x1

    if-ne v6, v7, :cond_2

    .line 134
    iget-object v4, v0, Ll/ۘۖ᩵;->᩹:[Ljava/lang/String;

    .line 338
    array-length v5, v4

    if-lez v5, :cond_0

    .line 339
    aget-object v0, v4, v11

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    goto :goto_0

    .line 126
    :cond_0
    iget-object v0, v0, Ll/ۘۖ᩵;->ۛ:Ljava/lang/String;

    .line 341
    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    .line 343
    :goto_0
    invoke-interface {v12}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Server "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v3, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v4, v10, v1, v9}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v12, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 346
    :cond_1
    iput v2, v3, Ll/ۡۖ᩵;->᩷:I

    return-object v3

    .line 348
    :cond_2
    invoke-interface {v12}, Ll/֫᩻֨;->֫()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 349
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Node "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    iget-object v7, v0, Ll/ۘۖ᩵;->᩶:Ljava/lang/String;

    .line 0
    invoke-static {v6, v7, v10, v1, v9}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v12, v6}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 118
    :cond_3
    iget-object v0, v0, Ll/ۘۖ᩵;->᩶:Ljava/lang/String;

    .line 409
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    const/16 v10, 0x5c

    const/4 v14, 0x3

    if-ne v7, v14, :cond_5

    .line 414
    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v14

    .line 415
    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v14

    :cond_4
    const/4 v0, 0x2

    goto :goto_3

    :cond_5
    if-eq v8, v6, :cond_6

    .line 418
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-ne v15, v10, :cond_7

    :cond_6
    add-int/lit8 v15, v7, 0x1

    .line 419
    invoke-virtual {v0, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v5, v7

    add-int/lit8 v7, v8, 0x1

    move v9, v7

    move v7, v15

    :cond_7
    add-int/lit8 v15, v8, 0x1

    if-lt v8, v6, :cond_b

    :goto_2
    if-ge v7, v4, :cond_4

    add-int/lit8 v0, v7, 0x1

    const-string v6, ""

    .line 427
    aput-object v6, v5, v7

    move v7, v0

    goto :goto_2

    .line 352
    :goto_3
    aget-object v4, v5, v13

    iput-object v4, v3, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    .line 353
    aget-object v0, v5, v0

    iput-object v0, v3, Ll/ۡۖ᩵;->ܺ:Ljava/lang/String;

    .line 354
    aget-object v0, v5, v14

    iput-object v0, v3, Ll/ۡۖ᩵;->ۜ:Ljava/lang/String;

    .line 355
    iput v2, v3, Ll/ۡۖ᩵;->᩷:I

    add-int/lit8 v0, v2, -0x1

    .line 361
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v10, :cond_9

    .line 362
    invoke-interface {v12}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "Server consumed trailing slash of request path, adjusting"

    .line 363
    invoke-interface {v12, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 365
    :cond_8
    iget v0, v3, Ll/ۡۖ᩵;->᩷:I

    sub-int/2addr v0, v13

    iput v0, v3, Ll/ۡۖ᩵;->᩷:I

    .line 368
    :cond_9
    invoke-interface {v12}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 369
    invoke-virtual {v1, v11, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Request "

    const-string v4, " ref path "

    .line 0
    invoke-static {v2, v1, v4}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 370
    iget-object v2, v3, Ll/ۡۖ᩵;->ۜ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " consumed "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v3, Ll/ۡۖ᩵;->᩷:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v12, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_a
    return-object v3

    :cond_b
    move v8, v15

    goto/16 :goto_1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 313
    instance-of v0, p1, Ll/ܺۖ᩵;

    if-nez v0, :cond_0

    goto :goto_0

    .line 316
    :cond_0
    check-cast p1, Ll/ܺۖ᩵;

    .line 145
    iget-object v0, p0, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    .line 318
    invoke-interface {p1}, Ll/ܺۖ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    iget-object v0, p0, Ll/ۡۖ᩵;->ܺ:Ljava/lang/String;

    .line 318
    invoke-interface {p1}, Ll/ܺۖ᩵;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    iget-object v0, p0, Ll/ۡۖ᩵;->ۜ:Ljava/lang/String;

    .line 319
    invoke-interface {p1}, Ll/ܺۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    iget v0, p0, Ll/ۡۖ᩵;->᩷:I

    .line 319
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1}, Ll/ܺۖ᩵;->ۡ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ۡۖ᩵;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 6

    .line 302
    iget-object v0, p0, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۡۖ᩵;->ܺ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۡۖ᩵;->ۜ:Ljava/lang/String;

    iget v3, p0, Ll/ۡۖ᩵;->᩷:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final next()Ll/ۡۖ᩵;
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ۡۖ᩵;->᩻:Ll/ۡۖ᩵;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 281
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DfsReferralData[pathConsumed="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۡۖ᩵;->᩷:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",server="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",share="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡۖ᩵;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",link="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡۖ᩵;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",path="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡۖ᩵;->ۜ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",ttl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۡۖ᩵;->ۖ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۡۖ᩵;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",remain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۡۖ᩵;->ۧ:J

    .line 283
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 217
    iget v0, p0, Ll/ۡۖ᩵;->᩷:I

    if-gt p1, v0, :cond_0

    sub-int/2addr v0, p1

    .line 220
    iput v0, p0, Ll/ۡۖ᩵;->᩷:I

    return-void

    .line 218
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stripping more than consumed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Ll/ۡۖ᩵;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/Map;)V
    .locals 0

    .line 176
    iput-object p1, p0, Ll/ۡۖ᩵;->ܳ:Ljava/util/Map;

    return-void
.end method

.method public final ֫(Ll/ܺۖ᩵;)V
    .locals 1

    .line 204
    check-cast p1, Ll/ۡۖ᩵;

    .line 205
    iget-object v0, p0, Ll/ۡۖ᩵;->᩻:Ll/ۡۖ᩵;

    iput-object v0, p1, Ll/ۡۖ᩵;->᩻:Ll/ۡۖ᩵;

    .line 206
    iput-object p1, p0, Ll/ۡۖ᩵;->᩻:Ll/ۡۖ᩵;

    return-void
.end method

.method public final ۖ()V
    .locals 1

    const/4 v0, 0x1

    .line 266
    iput-boolean v0, p0, Ll/ۡۖ᩵;->ܽ:Z

    return-void
.end method

.method public final ۜ()V
    .locals 1

    const-string v0, "\\"

    .line 139
    iput-object v0, p0, Ll/ۡۖ᩵;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public final ۡ()I
    .locals 1

    .line 90
    iget v0, p0, Ll/ۡۖ᩵;->᩷:I

    return v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ۡۖ᩵;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ll/ۡۖ᩵;
    .locals 2

    .line 2
    const-class v0, Ll/ܺۖ᩵;

    .line 75
    const-class v1, Ll/ۡۖ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 78
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method

.method public final ۧ(Ll/ܺۖ᩵;)Ll/ۡۖ᩵;
    .locals 3

    .line 385
    new-instance v0, Ll/ۡۖ᩵;

    invoke-direct {v0}, Ll/ۡۖ᩵;-><init>()V

    .line 386
    invoke-interface {p1}, Ll/ܺۖ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۡۖ᩵;->ۡ:Ljava/lang/String;

    .line 387
    invoke-interface {p1}, Ll/ܺۖ᩵;->ܳ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۡۖ᩵;->ܺ:Ljava/lang/String;

    .line 388
    invoke-interface {p1}, Ll/ܺۖ᩵;->ᩳ()J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۡۖ᩵;->ۧ:J

    .line 389
    invoke-interface {p1}, Ll/ܺۖ᩵;->getPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۡۖ᩵;->ۜ:Ljava/lang/String;

    .line 390
    iget v1, p0, Ll/ۡۖ᩵;->᩷:I

    invoke-interface {p1}, Ll/ܺۖ᩵;->ۡ()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, v0, Ll/ۡۖ᩵;->᩷:I

    .line 391
    iget-object v1, p0, Ll/ۡۖ᩵;->ۜ:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 392
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    sub-int/2addr v2, v1

    iput v2, v0, Ll/ۡۖ᩵;->᩷:I

    .line 394
    :cond_0
    invoke-interface {p1}, Ll/ܺۖ᩵;->ܽ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Ll/ۡۖ᩵;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Ll/ۡۖ᩵;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۡۖ᩵;->ܺ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܺ()I
    .locals 1

    .line 165
    iget v0, p0, Ll/ۡۖ᩵;->ۢ:I

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۡۖ᩵;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 275
    iget-boolean v0, p0, Ll/ۡۖ᩵;->ܽ:Z

    return v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 84
    iget-wide v0, p0, Ll/ۡۖ᩵;->ۧ:J

    return-wide v0
.end method

.method public final ᩷()V
    .locals 2

    .line 187
    iget-object v0, p0, Ll/ۡۖ᩵;->ܳ:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ۡۖ᩵;->ᩳ:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 188
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ᩻()Ll/ۡۖ᩵;
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ۡۖ᩵;->᩻:Ll/ۡۖ᩵;

    return-object v0
.end method
