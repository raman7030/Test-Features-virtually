.class public final Ll/ܽۢۧ;
.super Ljava/lang/Object;
.source "M8UL"


# instance fields
.field public final ֫:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ܽۢۧ;->֫:Ll/ᩳ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/ܽܺۧ;)Ll/᩻᩵֫;
    .locals 8

    .line 53
    iget-object v0, p0, Ll/ܽۢۧ;->֫:Ll/ᩳ֨֫;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 57
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    const/16 v5, 0xa

    invoke-interface {p1, v1, v5, v4}, Ll/۠᩷ۧ;->֫(II[B)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 63
    invoke-virtual {v0}, Ll/ᩳ֨֫;->᩸()I

    move-result v4

    const v6, 0x494433

    if-eq v4, v6, :cond_0

    goto :goto_2

    :cond_0
    const/4 v4, 0x3

    .line 67
    invoke-virtual {v0, v4}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 68
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۚ()I

    move-result v4

    add-int/lit8 v6, v4, 0xa

    if-nez v2, :cond_1

    .line 72
    new-array v2, v6, [B

    .line 73
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v7

    invoke-static {v7, v1, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    invoke-interface {p1, v5, v4, v2}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 76
    new-instance v4, Ll/ܿܺۧ;

    invoke-direct {v4, p2}, Ll/ܿܺۧ;-><init>(Ll/ܽܺۧ;)V

    invoke-virtual {v4, v6, v2}, Ll/ܿܺۧ;->֫(I[B)Ll/᩻᩵֫;

    move-result-object v2

    goto :goto_1

    .line 78
    :cond_1
    invoke-interface {p1, v4}, Ll/۠᩷ۧ;->֫(I)V

    :goto_1
    add-int/2addr v3, v6

    goto :goto_0

    .line 84
    :catch_0
    :goto_2
    invoke-interface {p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 85
    invoke-interface {p1, v3}, Ll/۠᩷ۧ;->֫(I)V

    return-object v2
.end method
