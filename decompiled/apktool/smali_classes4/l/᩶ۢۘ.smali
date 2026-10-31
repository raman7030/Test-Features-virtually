.class public abstract Ll/᩶ۢۘ;
.super Ljava/lang/Object;
.source "54F8"


# instance fields
.field public ֫:Ll/᩵᩻ۘ;

.field public ۧ:Z

.field public ܽ:Ll/۟ۢۘ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Ll/᩶ۢۘ;->ۧ:Z

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Ll/᩶ۢۘ;->ܽ:Ll/۟ۢۘ;

    .line 32
    iput-object v0, p0, Ll/᩶ۢۘ;->֫:Ll/᩵᩻ۘ;

    return-void
.end method


# virtual methods
.method public ֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V
    .locals 0

    .line 35
    iput-object p1, p0, Ll/᩶ۢۘ;->ܽ:Ll/۟ۢۘ;

    .line 36
    iput-object p2, p0, Ll/᩶ۢۘ;->֫:Ll/᩵᩻ۘ;

    .line 37
    iget p1, p2, Ll/᩵᩻ۘ;->ۧ:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Ll/᩶ۢۘ;->ۧ:Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۠ۢۘ;)V
    .locals 8

    .line 51
    iget-boolean v0, p0, Ll/᩶ۢۘ;->ۧ:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Ll/᩶ۢۘ;->֫:Ll/᩵᩻ۘ;

    iput v1, v0, Ll/᩵᩻ۘ;->ۖ:I

    .line 54
    :cond_0
    iget-object v0, p0, Ll/᩶ۢۘ;->ܽ:Ll/۟ۢۘ;

    invoke-virtual {v0, p1}, Ll/۟ۢۘ;->ۧ(Ll/۠ۢۘ;)V

    .line 55
    iget-boolean p1, p0, Ll/᩶ۢۘ;->ۧ:Z

    if-eqz p1, :cond_5

    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 57
    iget-object p1, p0, Ll/᩶ۢۘ;->֫:Ll/᩵᩻ۘ;

    iget p1, p1, Ll/᩵᩻ۘ;->ۧ:I

    int-to-long v4, p1

    .line 58
    :cond_1
    :goto_0
    iget-object p1, p0, Ll/᩶ۢۘ;->֫:Ll/᩵᩻ۘ;

    invoke-virtual {p1}, Ll/᩵᩻ۘ;->ۢ()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Ll/᩶ۢۘ;->֫:Ll/᩵᩻ۘ;

    iget p1, p1, Ll/᩵᩻ۘ;->ۖ:I

    if-ne p1, v1, :cond_3

    const-wide/16 v6, 0xa

    .line 60
    :try_start_0
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :goto_1
    const-wide/16 v6, 0x0

    cmp-long p1, v4, v6

    if-lez p1, :cond_1

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v2

    cmp-long p1, v6, v4

    if-gtz p1, :cond_2

    goto :goto_0

    .line 64
    :cond_2
    iget-object p1, p0, Ll/᩶ۢۘ;->֫:Ll/᩵᩻ۘ;

    const/4 v0, 0x0

    iput v0, p1, Ll/᩵᩻ۘ;->ۖ:I

    .line 65
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "channel request: timeout"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    throw p1

    .line 69
    :cond_3
    iget-object p1, p0, Ll/᩶ۢۘ;->֫:Ll/᩵᩻ۘ;

    iget p1, p1, Ll/᩵᩻ۘ;->ۖ:I

    if-eqz p1, :cond_4

    goto :goto_2

    .line 70
    :cond_4
    new-instance p1, Ll/۫᩷ۘ;

    const-string v0, "failed to send channel request"

    .line 39
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 70
    throw p1

    :cond_5
    :goto_2
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 47
    iput-boolean p1, p0, Ll/᩶ۢۘ;->ۧ:Z

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Ll/᩶ۢۘ;->ۧ:Z

    return v0
.end method
