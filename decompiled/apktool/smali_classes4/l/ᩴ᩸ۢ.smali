.class public final synthetic Ll/ᩴ᩸ۢ;
.super Ljava/lang/Object;
.source "W1SD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܿ᩶ۢ;

.field public final synthetic ᩹:J


# direct methods
.method public synthetic constructor <init>(Ll/ܿ᩶ۢ;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩸ۢ;->᩸:Ll/ܿ᩶ۢ;

    iput-wide p2, p0, Ll/ᩴ᩸ۢ;->᩹:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 143
    :goto_0
    iget-object v0, p0, Ll/ᩴ᩸ۢ;->᩸:Ll/ܿ᩶ۢ;

    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 144
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Ll/ᩴ᩸ۢ;->᩹:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x1f4

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 145
    invoke-virtual {v0}, Ll/ܿ᩶ۢ;->ܳ()V

    return-void

    :cond_0
    const-wide/16 v0, 0x5

    .line 148
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    :cond_1
    return-void
.end method
