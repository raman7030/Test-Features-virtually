.class public final Ll/۬᩹ܽ;
.super Ll/۟ܶۡ;
.source "P676"


# instance fields
.field public final synthetic ۜ:Z

.field public ܳ:I

.field public final synthetic ᩻:Ll/᩷᩶ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;Z)V
    .locals 0

    .line 274
    iput-object p1, p0, Ll/۬᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    iput-boolean p2, p0, Ll/۬᩹ܽ;->ۜ:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/۬᩹ܽ;)V
    .locals 4

    .line 286
    iget v0, p0, Ll/۬᩹ܽ;->ܳ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 287
    iget-object p0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {p0}, Ll/۬۬ܿ;->ܿ()V

    return-void

    .line 289
    :cond_0
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/۬᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    const v3, 0x7f1208d2

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget p0, p0, Ll/۬᩹ܽ;->ܳ:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x25

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/۬۬ܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 326
    iget-boolean v0, p0, Ll/۬᩹ܽ;->ۜ:Z

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Ll/۬᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const v0, 0x7f1208d1

    .line 329
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 334
    iget-object v0, p0, Ll/۬᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 279
    iget-object v0, p0, Ll/۬᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    const v1, 0x7f1208d2

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    .line 280
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    const/4 v1, 0x0

    .line 43
    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 9

    .line 285
    iget-object v0, p0, Ll/۬᩹ܽ;->᩻:Ll/᩷᩶ܽ;

    new-instance v1, Ll/ۗ᩹ܽ;

    invoke-direct {v1, p0}, Ll/ۗ᩹ܽ;-><init>(Ll/۬᩹ܽ;)V

    const/4 v2, 0x0

    .line 291
    iput v2, p0, Ll/۬᩹ܽ;->ܳ:I

    .line 293
    :try_start_0
    new-instance v3, Ll/ۗ᩶֡;

    invoke-direct {v3}, Ll/ۗ᩶֡;-><init>()V

    .line 294
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->size()I

    move-result v4

    .line 296
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v5

    iget-object v5, v5, Ll/ᩳ᩶ܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۧ᩸֡;

    .line 297
    invoke-virtual {v7, v3}, Ll/ۧ᩸֡;->֫(Ll/ۗ᩶֡;)V

    add-int/lit8 v6, v6, 0x64

    .line 299
    div-int v7, v6, v4

    .line 300
    iget v8, p0, Ll/۬᩹ܽ;->ܳ:I

    if-eq v7, v8, :cond_1

    .line 301
    iput v7, p0, Ll/۬᩹ܽ;->ܳ:I

    .line 302
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 304
    :cond_1
    iget-object v7, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v7}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_0

    .line 320
    invoke-static {}, Ljava/lang/System;->gc()V

    return-void

    .line 308
    :cond_2
    :try_start_1
    invoke-virtual {v3}, Ll/ۗ᩶֡;->ܳ()V

    const/4 v4, -0x1

    .line 310
    iput v4, p0, Ll/۬᩹ܽ;->ܳ:I

    .line 311
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 312
    invoke-virtual {v3}, Ll/ۗ᩶֡;->ܽ()I

    move-result v1

    new-array v4, v1, [B

    .line 313
    new-instance v5, Ll/֫ۗ֡;

    invoke-direct {v5, v4}, Ll/֫ۗ֡;-><init>([B)V

    .line 314
    invoke-virtual {v3, v5}, Ll/ۗ᩶֡;->֫(Ll/֫ۗ֡;)V

    .line 315
    invoke-static {v4}, Ll/ۗ᩶֡;->֫([B)V

    .line 1076
    new-instance v3, Ljava/util/zip/Adler32;

    invoke-direct {v3}, Ljava/util/zip/Adler32;-><init>()V

    const/16 v5, 0xc

    sub-int/2addr v1, v5

    .line 1078
    invoke-virtual {v3, v4, v5, v1}, Ljava/util/zip/Adler32;->update([BII)V

    .line 1080
    invoke-virtual {v3}, Ljava/util/zip/Adler32;->getValue()J

    move-result-wide v5

    long-to-int v1, v5

    const/16 v3, 0x8

    int-to-byte v5, v1

    .line 1082
    aput-byte v5, v4, v3

    shr-int/lit8 v3, v1, 0x8

    int-to-byte v3, v3

    const/16 v5, 0x9

    .line 1083
    aput-byte v3, v4, v5

    shr-int/lit8 v3, v1, 0x10

    int-to-byte v3, v3

    const/16 v5, 0xa

    .line 1084
    aput-byte v3, v4, v5

    shr-int/lit8 v1, v1, 0x18

    int-to-byte v1, v1

    const/16 v3, 0xb

    .line 1085
    aput-byte v1, v4, v3

    .line 317
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۨ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    new-instance v1, Ll/ۖ᩵ܿ;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v4}, Ll/ۖ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫(Ll/۬֡ܿ;)V

    .line 318
    sput-boolean v2, Ll/᩷᩶ܽ;->ܺۧ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 320
    invoke-static {}, Ljava/lang/System;->gc()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {}, Ljava/lang/System;->gc()V

    .line 321
    throw v0
.end method

.method public final ᩳ()V
    .locals 0

    .line 339
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
