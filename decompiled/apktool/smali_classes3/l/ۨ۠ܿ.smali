.class public final synthetic Ll/ۨ۠ܿ;
.super Ljava/lang/Object;
.source "TA2U"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Runnable;

.field public final synthetic ᩸:Ll/֡ۚۢ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;ZLjava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨ۠ܿ;->᩸:Ll/֡ۚۢ;

    iput-boolean p2, p0, Ll/ۨ۠ܿ;->᩹:Z

    iput-object p3, p0, Ll/ۨ۠ܿ;->᩶:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 185
    :goto_0
    iget-object v0, p0, Ll/ۨ۠ܿ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 186
    invoke-static {}, Ll/ۧܶܿ;->ۧ()Ll/ܰ۠ܿ;

    move-result-object v1

    iget-boolean v2, p0, Ll/ۨ۠ܿ;->᩹:Z

    invoke-virtual {v1, v2}, Ll/ܰ۠ܿ;->֫(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 187
    new-instance v1, Ll/ۜۛᩳ;

    const/4 v2, 0x3

    iget-object v3, p0, Ll/ۨ۠ܿ;->᩶:Ljava/lang/Runnable;

    invoke-direct {v1, v2, v0, v3}, Ll/ۜۛᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    const-wide/16 v0, 0x258

    .line 194
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    :cond_1
    return-void
.end method
