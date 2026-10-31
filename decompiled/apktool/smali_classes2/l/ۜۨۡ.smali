.class public final Ll/ۜۨۡ;
.super Ljava/lang/Object;
.source "4BMC"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 17
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 18
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->setEncryptEnabled(Z)V

    :cond_0
    return-void
.end method

.method public static ֫()V
    .locals 1

    .line 68
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    invoke-static {}, Ll/᩺᩵ۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->onProfileSignIn(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
