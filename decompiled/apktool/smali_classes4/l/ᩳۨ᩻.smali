.class public final Ll/ᩳۨ᩻;
.super Ljava/lang/Object;
.source "077H"


# static fields
.field private static final ܶ۬ۢ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳۨ᩻;->ܶ۬ۢ:[S

    return-void

    :array_0
    .array-data 2
        0x978s
        -0x65cfs
        -0x65d7s
        -0x65fbs
        -0x65c8s
        -0x65c5s
        -0x65ccs
        -0x65fbs
        -0x65d6s
        -0x65cfs
        -0x65d7s
        -0x658as
        -0x65c4s
        -0x65c5s
        -0x65d2s
        -0x65c5s
        -0x65cas
        -0x65e5s
        -0x65f6s
        -0x65efs
        -0x65fbs
        -0x65ebs
        -0x65f6s
        -0x65e1s
        -0x65ecs
        -0x65fbs
        -0x65e8s
        -0x65eas
        -0x65ebs
        -0x65e7s
        -0x65efs
        -0x65e1s
        -0x65e2s
        -0x65f2s
        -0x65ces
        -0x65cds
        -0x65d7s
        -0x6586s
        -0x65e5s
        -0x65f6s
        -0x65efs
        -0x6586s
        -0x65d6s
        -0x65c5s
        -0x65c7s
        -0x65cfs
        -0x65c5s
        -0x65c3s
        -0x65c1s
        -0x6586s
        -0x65cds
        -0x65d7s
        -0x6586s
        -0x65ccs
        -0x65cbs
        -0x65d2s
        -0x6586s
        -0x65d7s
        -0x65d1s
        -0x65d6s
        -0x65d6s
        -0x65cbs
        -0x65d8s
        -0x65d2s
        -0x65c1s
        -0x65c2s
        -0x6586s
        -0x65c8s
        -0x65dds
        -0x6586s
        -0x65c9s
        -0x65d2s
        -0x65fbs
        -0x65c5s
        -0x65d6s
        -0x65cfs
        -0x65fbs
        -0x65d3s
        -0x65cbs
        -0x65d8s
        -0x65cfs
        -0x65d7s
        -0x65d6s
        -0x65c5s
        -0x65c7s
        -0x65c1s
        -0x65fbs
        -0x65cbs
        -0x65d6s
        -0x65c1s
        -0x65ccs
        -0x658cs
    .end array-data
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 6

    sget-object v0, Ll/ᩳۨ᩻;->ܶ۬ۢ:[S

    const/4 v1, 0x0

    .line 75
    sget v2, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    aget-short v0, v0, v1

    const v1, 0xf738

    sget-boolean v2, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :cond_1
    mul-int v1, v1, v0

    add-int/lit16 v0, v0, 0x3dce

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v2

    if-gtz v2, :cond_2

    goto/16 :goto_3

    :cond_2
    mul-int v0, v0, v0

    sub-int/2addr v0, v1

    if-gez v0, :cond_3

    const/16 v0, 0x6713

    goto :goto_0

    :cond_3
    const v0, 0x9a5a

    .line 26
    :goto_0
    invoke-static {}, Ll/ᩳ۬᩻;->֫()Ll/ᩳ۬᩻;

    move-result-object v1

    sget-object v2, Ll/ᩳۨ᩻;->ܶ۬ۢ:[S

    const/4 v3, 0x1

    .line 0
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const/16 v4, 0xa

    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v5, :cond_5

    goto :goto_2

    .line 26
    :cond_5
    invoke-static {v2, v3, v4, v0}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ᩳ۬᩻;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ᩳۨ᩻;->ܶ۬ۢ:[S

    .line 63
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_6

    goto :goto_1

    :cond_6
    const/16 v3, 0xb

    const/4 v4, 0x1

    .line 26
    invoke-static {v2, v3, v4, v0}, Ll/ۘ᩶;->᩻ۤܶ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 68
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_7

    goto :goto_5

    .line 26
    :cond_7
    invoke-static {v1, v2}, Ll/֫ܿ;->ܳۖ᩷(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    .line 27
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    return-void

    :cond_8
    sget-object p0, Ll/ᩳۨ᩻;->ܶ۬ۢ:[S

    const/16 v1, 0xc

    const/4 v2, 0x5

    invoke-static {p0, v1, v2, v0}, Ll/֫᩺;->ۤᩴܿ([SIII)Ljava/lang/String;

    move-result-object p0

    .line 35
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v1

    if-gtz v1, :cond_9

    goto :goto_5

    .line 98
    :cond_9
    invoke-static {}, Ll/֡ᩴ;->ܺܰ֡()Lbin/mt/json/JSONArray;

    move-result-object v1

    sget-object v2, Ll/ᩳۨ᩻;->ܶ۬ۢ:[S

    const/16 v3, 0x11

    .line 70
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v4

    if-ltz v4, :cond_a

    .line 5
    :goto_1
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result p0

    if-gez p0, :cond_b

    goto :goto_3

    :cond_a
    const/16 v4, 0x10

    .line 98
    invoke-static {v2, v3, v4, v0}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ᩳۨ᩻;->ܶ۬ۢ:[S

    const/16 v4, 0x21

    .line 90
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_e

    .line 19
    :cond_b
    :goto_2
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result p0

    if-nez p0, :cond_c

    goto :goto_4

    :cond_c
    :goto_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result p0

    if-lez p0, :cond_d

    goto :goto_5

    .line 53
    :cond_d
    :goto_4
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    .line 9
    :goto_5
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    return-void

    :cond_e
    const/16 v5, 0x3b

    .line 98
    invoke-static {v3, v4, v5, v0}, Ll/᩺;->֨ܶ۟([SIII)Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-static {v1, v2, v0, p0}, Ll/ۗۛ᩻;->ۧ(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 28
    throw p0
.end method
