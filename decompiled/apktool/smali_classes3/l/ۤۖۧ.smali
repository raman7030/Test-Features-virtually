.class public final Ll/ۤۖۧ;
.super Ljava/lang/Object;
.source "78KJ"


# direct methods
.method public static ֫(Ll/᩻᩵֫;Ljava/lang/String;)Ll/֡֨֫;
    .locals 3

    const/4 v0, 0x0

    .line 260
    :goto_0
    invoke-virtual {p0}, Ll/᩻᩵֫;->֫()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 261
    invoke-virtual {p0, v0}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v1

    .line 262
    instance-of v2, v1, Ll/֡֨֫;

    if-eqz v2, :cond_0

    .line 263
    check-cast v1, Ll/֡֨֫;

    .line 264
    iget-object v2, v1, Ll/֡֨֫;->֫:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;
    .locals 4

    .line 345
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 346
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    const v2, 0x64617461

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    const/16 v1, 0x16

    if-lt v0, v1, :cond_1

    const/16 v0, 0xa

    .line 348
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 349
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result v0

    if-lez v0, :cond_1

    const-string p0, ""

    .line 0
    invoke-static {v0, p0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 352
    invoke-virtual {p1}, Ll/ᩳ֨֫;->ۗ()I

    move-result p1

    if-lez p1, :cond_0

    .line 354
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 356
    :cond_0
    new-instance p1, Ll/ۡܺۧ;

    .line 357
    invoke-static {p0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    invoke-direct {p1, p2, v3, p0}, Ll/ۡܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p1

    .line 360
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Failed to parse index/count attribute: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ܶ֨֫;->֫(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v3
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ll/ۨۡۧ;
    .locals 5

    .line 380
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 381
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    const v2, 0x64617461

    const/4 v3, 0x0

    if-ne v1, v2, :cond_3

    .line 383
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    .line 384
    sget v2, Ll/᩹ۖۧ;->֫:I

    const v2, 0xffffff

    and-int/2addr v1, v2

    const/16 v2, 0xd

    if-ne v1, v2, :cond_0

    const-string v2, "image/jpeg"

    goto :goto_0

    :cond_0
    const/16 v2, 0xe

    if-ne v1, v2, :cond_1

    const-string v2, "image/png"

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_2

    const-string p0, "Unrecognized cover art flags: "

    .line 0
    invoke-static {v1, p0}, Ll/۠ۢ֡;->֫(ILjava/lang/String;)V

    return-object v3

    :cond_2
    const/4 v1, 0x4

    .line 390
    invoke-virtual {p0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    add-int/lit8 v0, v0, -0x10

    .line 391
    new-array v1, v0, [B

    const/4 v4, 0x0

    .line 392
    invoke-virtual {p0, v4, v0, v1}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 393
    new-instance p0, Ll/ۨۡۧ;

    const/4 v0, 0x3

    invoke-direct {p0, v0, v2, v3, v1}, Ll/ۨۡۧ;-><init>(ILjava/lang/String;Ljava/lang/String;[B)V

    return-object p0

    :cond_3
    const-string p0, "Failed to parse cover art attribute"

    .line 399
    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v3
.end method

.method public static ֫(ILjava/lang/String;Ll/ᩳ֨֫;ZZ)Ll/ܳܺۧ;
    .locals 0

    .line 306
    invoke-static {p2}, Ll/ۤۖۧ;->ܽ(Ll/ᩳ֨֫;)I

    move-result p2

    if-eqz p4, :cond_0

    const/4 p4, 0x1

    .line 308
    invoke-static {p4, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_0
    const/4 p4, 0x0

    if-ltz p2, :cond_2

    if-eqz p3, :cond_1

    .line 312
    new-instance p0, Ll/ۡܺۧ;

    .line 313
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p2

    invoke-direct {p0, p1, p4, p2}, Ll/ۡܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p0

    .line 314
    :cond_1
    new-instance p0, Ll/֫ܺۧ;

    const-string p3, "und"

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p3, p1, p2}, Ll/֫ܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    .line 316
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Failed to parse uint8 attribute: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ܶ֨֫;->֫(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object p4
.end method

.method public static varargs ֫(ILl/᩻᩵֫;Ll/֨ᩴ֫;Ll/᩻᩵֫;[Ll/᩻᩵֫;)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    goto :goto_0

    .line 102
    :cond_0
    new-instance p3, Ll/᩻᩵֫;

    new-array v1, v0, [Ll/ܳ᩵֫;

    invoke-direct {p3, v1}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    :goto_0
    if-eqz p1, :cond_3

    const/4 v1, 0x0

    .line 105
    :goto_1
    invoke-virtual {p1}, Ll/᩻᩵֫;->֫()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 106
    invoke-virtual {p1, v1}, Ll/᩻᩵֫;->֫(I)Ll/ܳ᩵֫;

    move-result-object v2

    .line 107
    instance-of v3, v2, Ll/֡֨֫;

    if-eqz v3, :cond_2

    .line 108
    check-cast v2, Ll/֡֨֫;

    .line 110
    iget-object v3, v2, Ll/֡֨֫;->֫:Ljava/lang/String;

    const-string v4, "com.android.capture.fps"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    const/4 v3, 0x2

    if-ne p0, v3, :cond_2

    new-array v3, v4, [Ll/ܳ᩵֫;

    aput-object v2, v3, v0

    .line 112
    invoke-virtual {p3, v3}, Ll/᩻᩵֫;->֫([Ll/ܳ᩵֫;)Ll/᩻᩵֫;

    move-result-object p3

    goto :goto_2

    :cond_1
    new-array v3, v4, [Ll/ܳ᩵֫;

    aput-object v2, v3, v0

    .line 115
    invoke-virtual {p3, v3}, Ll/᩻᩵֫;->֫([Ll/ܳ᩵֫;)Ll/᩻᩵֫;

    move-result-object p3

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 121
    :cond_3
    array-length p0, p4

    :goto_3
    if-ge v0, p0, :cond_4

    aget-object p1, p4, v0

    .line 122
    invoke-virtual {p3, p1}, Ll/᩻᩵֫;->֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;

    move-result-object p3

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 125
    :cond_4
    invoke-virtual {p3}, Ll/᩻᩵֫;->֫()I

    move-result p0

    if-lez p0, :cond_5

    .line 126
    invoke-virtual {p2, p3}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    :cond_5
    return-void
.end method

.method public static ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;
    .locals 4

    .line 275
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 276
    invoke-virtual {p1}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    const v2, 0x64617461

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    const/16 p0, 0x8

    .line 278
    invoke-virtual {p1, p0}, Ll/ᩳ֨֫;->ܳ(I)V

    add-int/lit8 v0, v0, -0x10

    .line 279
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    .line 280
    new-instance p1, Ll/ۡܺۧ;

    invoke-static {p0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p0

    invoke-direct {p1, p2, v3, p0}, Ll/ۡܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p1

    .line 282
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Failed to parse text attribute: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/ܶ֨֫;->֫(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    return-object v3
.end method

.method public static ۧ(Ll/ᩳ֨֫;)Ll/ܳܺۧ;
    .locals 13

    const-string v0, "Skipped unknown metadata entry: "

    .line 153
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 154
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v2

    add-int/2addr v2, v1

    .line 155
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    shr-int/lit8 v3, v1, 0x18

    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0xa9

    const v5, 0x64617461

    const/16 v6, 0x10

    const-string v7, "TCON"

    const/4 v8, 0x0

    if-eq v3, v4, :cond_18

    const/16 v4, 0xfd

    if-ne v3, v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const v3, 0x676e7265

    const/4 v4, 0x1

    if-ne v1, v3, :cond_2

    .line 366
    :try_start_0
    invoke-static {p0}, Ll/ۤۖۧ;->ܽ(Ll/ᩳ֨֫;)I

    move-result v0

    sub-int/2addr v0, v4

    .line 369
    invoke-static {v0}, Ll/᩻ܺۧ;->֫(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 371
    new-instance v1, Ll/ۡܺۧ;

    .line 372
    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-direct {v1, v7, v8, v0}, Ll/ۡܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object v8, v1

    goto :goto_0

    :cond_1
    const-string v0, "Failed to parse standard genre code"

    .line 374
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    :goto_0
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v8

    :cond_2
    const v3, 0x6469736b

    if-ne v1, v3, :cond_3

    :try_start_1
    const-string v0, "TPOS"

    .line 184
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->֫(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_3
    const v3, 0x74726b6e

    if-ne v1, v3, :cond_4

    :try_start_2
    const-string v0, "TRCK"

    .line 186
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->֫(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_4
    const v3, 0x746d706f

    const/4 v7, 0x0

    if-ne v1, v3, :cond_5

    :try_start_3
    const-string v0, "TBPM"

    .line 188
    invoke-static {v1, v0, p0, v4, v7}, Ll/ۤۖۧ;->֫(ILjava/lang/String;Ll/ᩳ֨֫;ZZ)Ll/ܳܺۧ;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_5
    const v3, 0x6370696c

    if-ne v1, v3, :cond_6

    :try_start_4
    const-string v0, "TCMP"

    .line 190
    invoke-static {v1, v0, p0, v4, v4}, Ll/ۤۖۧ;->֫(ILjava/lang/String;Ll/ᩳ֨֫;ZZ)Ll/ܳܺۧ;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_6
    const v3, 0x636f7672

    if-ne v1, v3, :cond_7

    .line 192
    :try_start_5
    invoke-static {p0}, Ll/ۤۖۧ;->֫(Ll/ᩳ֨֫;)Ll/ۨۡۧ;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_7
    const v3, 0x61415254

    if-ne v1, v3, :cond_8

    :try_start_6
    const-string v0, "TPE2"

    .line 194
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_8
    const v3, 0x736f6e6d

    if-ne v1, v3, :cond_9

    :try_start_7
    const-string v0, "TSOT"

    .line 196
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_9
    const v3, 0x736f616c

    if-ne v1, v3, :cond_a

    :try_start_8
    const-string v0, "TSOA"

    .line 198
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_a
    const v3, 0x736f6172

    if-ne v1, v3, :cond_b

    :try_start_9
    const-string v0, "TSOP"

    .line 200
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_b
    const v3, 0x736f6161

    if-ne v1, v3, :cond_c

    :try_start_a
    const-string v0, "TSO2"

    .line 202
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_c
    const v3, 0x736f636f

    if-ne v1, v3, :cond_d

    :try_start_b
    const-string v0, "TSOC"

    .line 204
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_d
    const v3, 0x72746e67

    if-ne v1, v3, :cond_e

    :try_start_c
    const-string v0, "ITUNESADVISORY"

    .line 206
    invoke-static {v1, v0, p0, v7, v7}, Ll/ۤۖۧ;->֫(ILjava/lang/String;Ll/ᩳ֨֫;ZZ)Ll/ܳܺۧ;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_e
    const v3, 0x70676170

    if-ne v1, v3, :cond_f

    :try_start_d
    const-string v0, "ITUNESGAPLESS"

    .line 208
    invoke-static {v1, v0, p0, v7, v4}, Ll/ۤۖۧ;->֫(ILjava/lang/String;Ll/ᩳ֨֫;ZZ)Ll/ܳܺۧ;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_f
    const v3, 0x736f736e

    if-ne v1, v3, :cond_10

    :try_start_e
    const-string v0, "TVSHOWSORT"

    .line 210
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_10
    const v3, 0x74767368

    if-ne v1, v3, :cond_11

    :try_start_f
    const-string v0, "TVSHOW"

    .line 212
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_11
    const v3, 0x2d2d2d2d

    if-ne v1, v3, :cond_23

    const/4 v0, -0x1

    const/4 v1, -0x1

    const/4 v3, -0x1

    move-object v4, v8

    move-object v7, v4

    .line 409
    :goto_1
    :try_start_10
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v9

    if-ge v9, v2, :cond_15

    .line 410
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v9

    .line 411
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v10

    .line 412
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v11

    const/4 v12, 0x4

    .line 413
    invoke-virtual {p0, v12}, Ll/ᩳ֨֫;->ܳ(I)V

    const v12, 0x6d65616e

    if-ne v11, v12, :cond_12

    add-int/lit8 v10, v10, -0xc

    .line 415
    invoke-virtual {p0, v10}, Ll/ᩳ֨֫;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_12
    const v12, 0x6e616d65

    if-ne v11, v12, :cond_13

    add-int/lit8 v10, v10, -0xc

    .line 417
    invoke-virtual {p0, v10}, Ll/ᩳ֨֫;->ۧ(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_13
    if-ne v11, v5, :cond_14

    move v1, v9

    move v3, v10

    :cond_14
    add-int/lit8 v10, v10, -0xc

    .line 423
    invoke-virtual {p0, v10}, Ll/ᩳ֨֫;->ܳ(I)V

    goto :goto_1

    :cond_15
    if-eqz v4, :cond_17

    if-eqz v7, :cond_17

    if-ne v1, v0, :cond_16

    goto :goto_2

    .line 429
    :cond_16
    invoke-virtual {p0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 430
    invoke-virtual {p0, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    sub-int/2addr v3, v6

    .line 431
    invoke-virtual {p0, v3}, Ll/ᩳ֨֫;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 432
    new-instance v8, Ll/ۜܺۧ;

    invoke-direct {v8, v4, v7, v0}, Ll/ۜܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 219
    :cond_17
    :goto_2
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v8

    :cond_18
    :goto_3
    const v3, 0xffffff

    and-int/2addr v3, v1

    const v4, 0x636d74

    if-ne v3, v4, :cond_1a

    .line 288
    :try_start_11
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 289
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    if-ne v3, v5, :cond_19

    const/16 v1, 0x8

    .line 291
    invoke-virtual {p0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    sub-int/2addr v0, v6

    .line 292
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 293
    new-instance v8, Ll/֫ܺۧ;

    const-string v1, "und"

    invoke-direct {v8, v1, v0, v0}, Ll/֫ܺۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 295
    :cond_19
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Failed to parse comment attribute: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ܶ֨֫;->֫(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 219
    :goto_4
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v8

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_1a
    const v4, 0x6e616d

    if-eq v3, v4, :cond_25

    const v4, 0x74726b

    if-ne v3, v4, :cond_1b

    goto/16 :goto_6

    :cond_1b
    const v4, 0x636f6d

    if-eq v3, v4, :cond_24

    const v4, 0x777274

    if-ne v3, v4, :cond_1c

    goto/16 :goto_5

    :cond_1c
    const v4, 0x646179

    if-ne v3, v4, :cond_1d

    :try_start_12
    const-string v0, "TDRC"

    .line 167
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_1d
    const v4, 0x415254

    if-ne v3, v4, :cond_1e

    :try_start_13
    const-string v0, "TPE1"

    .line 169
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_1e
    const v4, 0x746f6f

    if-ne v3, v4, :cond_1f

    :try_start_14
    const-string v0, "TSSE"

    .line 171
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_1f
    const v4, 0x616c62

    if-ne v3, v4, :cond_20

    :try_start_15
    const-string v0, "TALB"

    .line 173
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_20
    const v4, 0x6c7972

    if-ne v3, v4, :cond_21

    :try_start_16
    const-string v0, "USLT"

    .line 175
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_21
    const v4, 0x67656e

    if-ne v3, v4, :cond_22

    .line 177
    :try_start_17
    invoke-static {v1, p0, v7}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_22
    const v4, 0x677270

    if-ne v3, v4, :cond_23

    :try_start_18
    const-string v0, "TIT1"

    .line 179
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    .line 216
    :cond_23
    :try_start_19
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ll/ܶ֨֫;->֫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v8

    :cond_24
    :goto_5
    :try_start_1a
    const-string v0, "TCOM"

    .line 165
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :cond_25
    :goto_6
    :try_start_1b
    const-string v0, "TIT2"

    .line 163
    invoke-static {v1, p0, v0}, Ll/ۤۖۧ;->ۧ(ILl/ᩳ֨֫;Ljava/lang/String;)Ll/ۡܺۧ;

    move-result-object v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    .line 219
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    return-object v0

    :goto_7
    invoke-virtual {p0, v2}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 220
    throw v0
.end method

.method public static ܽ(Ll/ᩳ֨֫;)I
    .locals 3

    .line 321
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    .line 322
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v1

    const v2, 0x64617461

    if-ne v1, v2, :cond_4

    const/16 v1, 0x8

    .line 324
    invoke-virtual {p0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    add-int/lit8 v0, v0, -0x10

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 333
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܳ()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    if-nez v0, :cond_4

    .line 334
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩹()I

    move-result p0

    return p0

    .line 331
    :cond_1
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩸()I

    move-result p0

    return p0

    .line 329
    :cond_2
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result p0

    return p0

    .line 327
    :cond_3
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    return p0

    :cond_4
    :goto_0
    const-string p0, "Failed to parse data atom to int"

    .line 338
    invoke-static {p0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 p0, -0x1

    return p0
.end method
