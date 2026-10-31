.class public final Ll/ᩴ۠ܳ;
.super Ljava/lang/Object;
.source "052E"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩵۠ܳ;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public constructor <init>(Ll/᩵۠ܳ;Ll/֡ۚۢ;)V
    .locals 0

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ۠ܳ;->᩸:Ll/᩵۠ܳ;

    iput-object p2, p0, Ll/ᩴ۠ܳ;->᩹:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 266
    iget-object v0, p0, Ll/ᩴ۠ܳ;->᩹:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 267
    iget-object v0, p0, Ll/ᩴ۠ܳ;->᩸:Ll/᩵۠ܳ;

    iget-object v1, v0, Ll/᩵۠ܳ;->۟:Ljava/text/SimpleDateFormat;

    if-eqz v1, :cond_0

    .line 268
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    :cond_0
    const-wide/16 v0, 0x3e8

    .line 270
    invoke-static {v0, v1, p0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    :cond_1
    return-void
.end method
