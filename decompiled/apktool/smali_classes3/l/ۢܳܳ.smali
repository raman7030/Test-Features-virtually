.class public final Ll/ۢܳܳ;
.super Ljava/lang/Object;
.source "27BS"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/io/File;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 431
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 432
    new-instance v0, Ljava/io/File;

    const-string v1, "java.io.tmpdir"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۢܳܳ;->ۧ:Ljava/io/File;

    .line 433
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 434
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 436
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢܳܳ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 441
    iget-object v0, p0, Ll/ۢܳܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ܳܳ;

    .line 443
    :try_start_0
    invoke-interface {v2}, Ll/᩹ܳܳ;->delete()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 445
    invoke-static {}, Ll/ۙܳܳ;->ۢ()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v5, "could not delete file "

    invoke-virtual {v3, v4, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 448
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ۧ()Ll/᩷ܳܳ;
    .locals 2

    .line 453
    new-instance v0, Ll/᩷ܳܳ;

    iget-object v1, p0, Ll/ۢܳܳ;->ۧ:Ljava/io/File;

    invoke-direct {v0, v1}, Ll/᩷ܳܳ;-><init>(Ljava/io/File;)V

    .line 454
    iget-object v1, p0, Ll/ۢܳܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
