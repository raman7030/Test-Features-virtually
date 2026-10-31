.class public final Ll/ۡ᩸ۢ;
.super Ll/۟ܶۡ;
.source "Y9AZ"


# instance fields
.field public final synthetic ۜ:Ljava/lang/Runnable;

.field public final synthetic ۢ:Ll/ۖ᩸ۢ;

.field public ܳ:Ll/᩺ۤܿ;

.field public final synthetic ᩷:Ll/ܶ᩵ܿ;

.field public final synthetic ᩻:Ll/ۗܺ᩷;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ll/ۖ᩸ۢ;Ljava/lang/Runnable;)V
    .locals 0

    .line 235
    iput-object p1, p0, Ll/ۡ᩸ۢ;->᩻:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۡ᩸ۢ;->᩷:Ll/ܶ᩵ܿ;

    iput-object p3, p0, Ll/ۡ᩸ۢ;->ۢ:Ll/ۖ᩸ۢ;

    iput-object p4, p0, Ll/ۡ᩸ۢ;->ۜ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 288
    invoke-static {}, Ll/᩺᩹ۢ;->֫()V

    .line 289
    invoke-static {}, Ll/֫᩸ۢ;->ܽ()V

    .line 290
    iget-object v0, p0, Ll/ۡ᩸ۢ;->ۜ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 295
    iget-object v0, p0, Ll/ۡ᩸ۢ;->᩻:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 296
    iget-object p1, p0, Ll/ۡ᩸ۢ;->ۜ:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 241
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/ۡ᩸ۢ;->᩻:Ll/ۗܺ᩷;

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f120a36

    .line 242
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const v1, 0x7f1204bd

    .line 243
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(I)V

    .line 244
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/ۡ᩸ۢ;->ܳ:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 11

    .line 249
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "term/bin"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 250
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 251
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 253
    new-instance v1, Ll/ᩳܰۡ;

    iget-object v2, p0, Ll/ۡ᩸ۢ;->᩷:Ll/ܶ᩵ܿ;

    invoke-direct {v1, v2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 254
    :try_start_0
    invoke-static {v1}, Ll/ۘ᩸ۢ;->ۧ(Ll/ᩳܰۡ;)Ljava/lang/String;

    move-result-object v2

    .line 255
    new-instance v3, Ll/᩵ۛۡ;

    invoke-virtual {v1}, Ll/ᩳܰۡ;->ᩴ()I

    move-result v4

    int-to-long v4, v4

    invoke-direct {v3, v4, v5}, Ll/᩵ۛۡ;-><init>(J)V

    iget-object v4, p0, Ll/ۡ᩸ۢ;->ܳ:Ll/᩺ۤܿ;

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Ll/᩻ۡܳ;

    invoke-direct {v5, v4}, Ll/᩻ۡܳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v5}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 256
    invoke-virtual {v1}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩺ۡ;

    const/4 v6, 0x1

    .line 41
    invoke-virtual {v3, v6}, Ll/᩵ۛۡ;->֫(I)Z

    .line 258
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    .line 261
    :cond_1
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v7

    .line 262
    invoke-virtual {v7, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_0

    .line 265
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "/"

    .line 266
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 267
    sget-object v8, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Extract: bin/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 268
    invoke-virtual {v0, v7}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 269
    invoke-virtual {v1, v5}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v7, v5}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V

    .line 270
    new-instance v5, Ljava/io/File;

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v8, 0x0

    invoke-virtual {v5, v6, v8}, Ljava/io/File;->setExecutable(ZZ)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    .line 271
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Set Executable Failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 275
    :cond_4
    invoke-static {v1}, Ll/ۘ᩸ۢ;->֫(Ll/ᩳܰۡ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V

    .line 278
    sget-object v0, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    const-string v1, "term/version"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 279
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 280
    iget-object v2, p0, Ll/ۡ᩸ۢ;->ۢ:Ll/ۖ᩸ۢ;

    iget v3, v2, Ll/ۖ᩸ۢ;->ᩳ:I

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 281
    iget-object v2, v2, Ll/ۖ᩸ۢ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 282
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 283
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    return-void

    :catchall_0
    move-exception v0

    .line 253
    :try_start_1
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 301
    iget-object v0, p0, Ll/ۡ᩸ۢ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method
