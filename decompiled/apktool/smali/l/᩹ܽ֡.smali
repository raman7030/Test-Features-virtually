.class public final Ll/᩹ܽ֡;
.super Ljava/lang/Object;
.source "H4EU"

# interfaces
.implements Ll/֨ᩳ֡;


# instance fields
.field public final synthetic ᩸:Ll/ۙܽ֡;

.field public final synthetic ᩹:Ll/֨ᩳ֡;


# direct methods
.method public constructor <init>(Ll/ۙܽ֡;Ll/֨ᩳ֡;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ܽ֡;->᩸:Ll/ۙܽ֡;

    iput-object p2, p0, Ll/᩹ܽ֡;->᩹:Ll/֨ᩳ֡;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 248
    iget-object v0, p0, Ll/᩹ܽ֡;->᩸:Ll/ۙܽ֡;

    .line 250
    :try_start_0
    iget-object v1, p0, Ll/᩹ܽ֡;->᩹:Ll/֨ᩳ֡;

    check-cast v1, Ll/ᩳᩳ֡;

    invoke-virtual {v1}, Ll/ᩳᩳ֡;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    .line 255
    invoke-virtual {v0, v1}, Ll/ۙܽ֡;->֫(Z)V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 284
    :try_start_1
    invoke-virtual {v0}, Ll/ۙܽ֡;->ۜ()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 285
    :cond_0
    invoke-virtual {v0, v1}, Ll/ۙܽ֡;->֫(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    .line 253
    :goto_0
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    const/4 v2, 0x0

    .line 255
    invoke-virtual {v0, v2}, Ll/ۙܽ֡;->֫(Z)V

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AsyncTimeout.source("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩹ܽ֡;->᩹:Ll/֨ᩳ֡;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 260
    iget-object v0, p0, Ll/᩹ܽ֡;->᩸:Ll/ۙܽ֡;

    return-object v0
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 2

    .line 235
    iget-object p2, p0, Ll/᩹ܽ֡;->᩸:Ll/ۙܽ֡;

    invoke-virtual {p2}, Ll/ۙܽ֡;->᩻()V

    .line 237
    :try_start_0
    iget-object p3, p0, Ll/᩹ܽ֡;->᩹:Ll/֨ᩳ֡;

    check-cast p3, Ll/ᩳᩳ֡;

    const-wide/16 v0, 0x2000

    invoke-virtual {p3, p1, v0, v1}, Ll/ᩳᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 243
    invoke-virtual {p2, p1}, Ll/ۙܽ֡;->֫(Z)V

    return-wide v0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 284
    :try_start_1
    invoke-virtual {p2}, Ll/ۙܽ֡;->ۜ()Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    .line 285
    :cond_0
    invoke-virtual {p2, p1}, Ll/ۙܽ֡;->֫(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    .line 241
    :goto_0
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    const/4 p3, 0x0

    .line 243
    invoke-virtual {p2, p3}, Ll/ۙܽ֡;->֫(Z)V

    throw p1
.end method
