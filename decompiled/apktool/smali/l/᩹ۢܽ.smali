.class public final Ll/᩹ۢܽ;
.super Ljava/lang/Object;
.source "T5RH"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 7

    const/4 v0, 0x1

    .line 193
    sput-boolean v0, Ll/۬ۢܽ;->֫:Z

    .line 194
    new-instance v0, Ll/᩶ۢܽ;

    invoke-direct {v0, p1}, Ll/᩶ۢܽ;-><init>(Ll/ܺܺܽ;)V

    .line 195
    new-instance p1, Ll/᩸ۢܽ;

    invoke-direct {p1, v0}, Ll/᩸ۢܽ;-><init>(Ll/᩶ۢܽ;)V

    .line 239
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 240
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 241
    :cond_0
    iget-boolean p1, v0, Ll/᩶ۢܽ;->ۧ:Z

    if-eqz p1, :cond_2

    const-wide/16 v3, 0xc8

    .line 242
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 243
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-wide/16 v5, 0x3a98

    cmp-long p1, v3, v5

    if-gtz p1, :cond_1

    .line 246
    sget-boolean p1, Ll/۬ۢܽ;->֫:Z

    if-nez p1, :cond_0

    .line 247
    invoke-virtual {v0}, Ll/᩶ۢܽ;->֫()V

    return-void

    .line 244
    :cond_1
    invoke-virtual {v0}, Ll/᩶ۢܽ;->֫()V

    .line 245
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Connection timed out"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method
