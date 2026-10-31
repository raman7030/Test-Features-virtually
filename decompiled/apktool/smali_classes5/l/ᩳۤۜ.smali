.class public final Ll/ᩳۤۜ;
.super Ll/֫ۛܿ;
.source "D8GL"


# instance fields
.field public final synthetic ۙ:Ll/ۤۤۜ;


# direct methods
.method public constructor <init>(Ll/ۤۤۜ;Ll/ۤۤۜ;)V
    .locals 0

    .line 3418
    iput-object p1, p0, Ll/ᩳۤۜ;->ۙ:Ll/ۤۤۜ;

    invoke-direct {p0, p2}, Ll/֫ۛܿ;-><init>(Ll/ۗܺ᩷;)V

    return-void
.end method


# virtual methods
.method public final ܽ()V
    .locals 3

    .line 3424
    invoke-virtual {p0}, Ll/֫ۛܿ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1206a7

    .line 3427
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 3430
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    if-lt v0, v2, :cond_1

    const/16 v2, 0x3e7

    if-le v0, v2, :cond_0

    goto :goto_0

    .line 3439
    :cond_0
    iget-object v1, p0, Ll/ᩳۤۜ;->ۙ:Ll/ۤۤۜ;

    invoke-static {v1}, Ll/ۤۤۜ;->ᩳ֫(Ll/ۤۤۜ;)Ll/ۤ᩶ۜ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۤ᩶ۜ;->֫(I)V

    .line 3440
    invoke-virtual {p0}, Ll/֫ۛܿ;->֫()V

    return-void

    .line 3436
    :cond_1
    :goto_0
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 3428
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0}, Ljava/lang/NumberFormatException;-><init>()V

    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 3432
    :catch_0
    invoke-static {v1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method
