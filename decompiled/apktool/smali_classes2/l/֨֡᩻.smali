.class public final synthetic Ll/֨֡᩻;
.super Ljava/lang/Object;
.source "N9ZJ"


# instance fields
.field public final synthetic ֫:Ll/᩶֡᩻;


# direct methods
.method public synthetic constructor <init>(Ll/᩶֡᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨֡᩻;->֫:Ll/᩶֡᩻;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۜ֡᩻;
    .locals 7

    .line 2
    iget-object v0, p0, Ll/֨֡᩻;->֫:Ll/᩶֡᩻;

    .line 4
    sget v1, Ll/۬֡᩻;->֫֫:I

    .line 358
    iget-object v1, v0, Ll/᩶֡᩻;->ܽ:Ll/۫֡᩻;

    sget v2, Ll/֫֡᩻;->֫:I

    .line 493
    sget-object v2, Ll/ۨ᩵᩻;->᩶:Ll/ۨ᩵᩻;

    sget-object v3, Ll/ܺ֡᩻;->᩶:Ll/ܺ֡᩻;

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ll/ۨ᩵᩻;ZLl/ܺ֡᩻;)Ll/ۜ֡᩻;

    move-result-object v2

    .line 499
    invoke-virtual {v2}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object v4

    sget-object v5, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    const/4 v6, 0x0

    if-eq v4, v5, :cond_0

    .line 500
    invoke-virtual {v2}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object v4

    if-ne v4, v3, :cond_5

    .line 537
    iget-object v3, v1, Ll/۫֡᩻;->ܳ:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v1, Ll/۫֡᩻;->ᩳ:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 501
    sget-object v3, Ll/ۨ᩵᩻;->ۙ:Ll/ۨ᩵᩻;

    sget-object v4, Ll/ܺ֡᩻;->ۙ:Ll/ܺ֡᩻;

    invoke-static {v1, v3, v6, v4}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ll/ۨ᩵᩻;ZLl/ܺ֡᩻;)Ll/ۜ֡᩻;

    move-result-object v1

    .line 507
    invoke-virtual {v1}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object v3

    if-ne v3, v4, :cond_5

    move-object v2, v1

    goto :goto_1

    .line 513
    :cond_0
    invoke-virtual {v2}, Ll/ۜ֡᩻;->֫()Ljava/lang/Throwable;

    move-result-object v3

    .line 514
    invoke-static {v3}, Ll/᩷֡᩻;->֫(Ljava/lang/Throwable;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    .line 517
    :cond_1
    sget-object v2, Ll/ۨ᩵᩻;->ۙ:Ll/ۨ᩵᩻;

    sget-object v4, Ll/ܺ֡᩻;->ۙ:Ll/ܺ֡᩻;

    invoke-static {v1, v2, v6, v4}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;Ll/ۨ᩵᩻;ZLl/ܺ֡᩻;)Ll/ۜ֡᩻;

    move-result-object v2

    .line 523
    invoke-virtual {v2}, Ll/ۜ֡᩻;->ᩳ()Ll/ܺ֡᩻;

    move-result-object v1

    if-eq v1, v5, :cond_2

    goto :goto_1

    .line 526
    :cond_2
    invoke-virtual {v2}, Ll/ۜ֡᩻;->֫()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v3, :cond_3

    if-eqz v1, :cond_3

    .line 528
    invoke-static {v3, v1}, Ll/֫֡᩻;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_3
    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    move-object v3, v1

    .line 49
    :goto_0
    new-instance v2, Ll/ۜ֡᩻;

    invoke-direct {v2, v5, v3, v6}, Ll/ۜ֡᩻;-><init>(Ll/ܺ֡᩻;Ljava/lang/Throwable;Z)V

    .line 360
    :cond_5
    :goto_1
    invoke-virtual {v2}, Ll/ۜ֡᩻;->ܽ()Z

    move-result v1

    iput-boolean v1, v0, Ll/᩶֡᩻;->ᩳ:Z

    return-object v2
.end method
