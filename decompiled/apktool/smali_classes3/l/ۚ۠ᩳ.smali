.class public final synthetic Ll/ۚ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/ᩴ᩵ᩳ;


# instance fields
.field public final synthetic ֫:Ll/ܰۘᩳ;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:Ll/ۜ֡ᩳ;

.field public final synthetic ܿ:Ll/ᩴᩴᩳ;

.field public final synthetic ᩳ:I


# direct methods
.method public synthetic constructor <init>(Ll/ܰۘᩳ;ILl/ۜ֡ᩳ;ILl/ᩴᩴᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ۠ᩳ;->֫:Ll/ܰۘᩳ;

    iput p2, p0, Ll/ۚ۠ᩳ;->ۧ:I

    iput-object p3, p0, Ll/ۚ۠ᩳ;->ܽ:Ll/ۜ֡ᩳ;

    iput p4, p0, Ll/ۚ۠ᩳ;->ᩳ:I

    iput-object p5, p0, Ll/ۚ۠ᩳ;->ܿ:Ll/ᩴᩴᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۖ᩷;)Ll/ۨ᩵ᩳ;
    .locals 14

    .line 2
    iget-object v0, p0, Ll/ۚ۠ᩳ;->ܿ:Ll/ᩴᩴᩳ;

    .line 2800
    iget-object v1, p0, Ll/ۚ۠ᩳ;->֫:Ll/ܰۘᩳ;

    iget-object v1, v1, Ll/ܰۘᩳ;->ۡ:Ll/᩷۠ᩴ;

    invoke-static {v1}, Ll/ܰۘᩳ;->ۧ(Ll/᩷۠ᩴ;)Ll/ܰۘᩳ;

    move-result-object v2

    const/4 v7, 0x1

    iget v3, p0, Ll/ۚ۠ᩳ;->ۧ:I

    iget-object v12, p0, Ll/ۚ۠ᩳ;->ܽ:Ll/ۜ֡ᩳ;

    iget v13, p0, Ll/ۚ۠ᩳ;->ᩳ:I

    move-object v4, v12

    move v5, v13

    move-object v6, p1

    invoke-virtual/range {v2 .. v7}, Ll/ܰۘᩳ;->֫(ILl/ۜ֡ᩳ;ILl/ܿۖ᩷;Z)Ll/ۨ᩵ᩳ;

    move-result-object p1

    .line 2802
    :try_start_0
    invoke-virtual {v0}, Ll/ᩴᩴᩳ;->ᩳ()Ll/ۗ֫ܿ;

    move-result-object v9

    invoke-virtual {v0}, Ll/ᩴᩴᩳ;->ܽ()[B

    move-result-object v10

    invoke-virtual {v0}, Ll/ᩴᩴᩳ;->֫()[B

    move-result-object v11

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Ll/ۨ᩵ᩳ;->֫(Ll/ۗ֫ܿ;[B[BLl/ۜ֡ᩳ;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    .line 2805
    :goto_0
    invoke-virtual {p1}, Ll/ۨ᩵ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;

    throw v0
.end method
