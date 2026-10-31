.class public Ll/ۤ᩹ۢ;
.super Ll/ۗܺ᩷;
.source "Q1R8"

# interfaces
.implements Ll/ۡ᩹ۢ;


# static fields
.field public static final synthetic ۢۧ:I


# instance fields
.field public ۜۧ:Ll/ܺ᩹ۢ;

.field public ܳۧ:Ll/۬۬ܿ;

.field public final ܿۧ:Ll/֡ܽ;

.field public ᩳۧ:Ll/ۚ᩹᩷;

.field public ᩷ۧ:Ll/۫᩹ۢ;

.field public ᩻ۧ:Ll/֡᩶ۢ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 481
    new-instance v0, Ll/۬᩹ۢ;

    invoke-direct {v0, p0}, Ll/۬᩹ۢ;-><init>(Ll/ۤ᩹ۢ;)V

    iput-object v0, p0, Ll/ۤ᩹ۢ;->ܿۧ:Ll/֡ܽ;

    return-void
.end method

.method public static synthetic ֫(Ll/ۤ᩹ۢ;)V
    .locals 3

    .line 297
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/۫᩹ۢ;->ۗ:Z

    .line 298
    new-instance v0, Landroid/content/Intent;

    const-class v2, Ll/ۘ᩹ۢ;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "scriptSettings"

    .line 299
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 300
    iget-object p0, p0, Ll/ۤ᩹ۢ;->ᩳۧ:Ll/ۚ᩹᩷;

    invoke-virtual {p0, v0}, Ll/ۚ᩹᩷;->֫(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۤ᩹ۢ;IZLl/ܶ᩵ܿ;Landroid/content/Intent;)V
    .locals 2

    .line 255
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget v1, v0, Ll/۫᩹ۢ;->۫:I

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 258
    iput-boolean p1, v0, Ll/۫᩹ۢ;->۬:Z

    .line 259
    iget-object p1, p0, Ll/ۤ᩹ۢ;->ܳۧ:Ll/۬۬ܿ;

    if-eqz p1, :cond_1

    .line 260
    invoke-virtual {p1}, Ll/۬۬ܿ;->֫()V

    const/4 p1, 0x0

    .line 261
    iput-object p1, p0, Ll/ۤ᩹ۢ;->ܳۧ:Ll/۬۬ܿ;

    .line 263
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    if-nez p2, :cond_3

    const p1, 0x7f12094e

    .line 267
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(I)V

    .line 268
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 271
    :cond_3
    invoke-direct {p0, p3, p4}, Ll/ۤ᩹ۢ;->֫(Ll/ܶ᩵ܿ;Landroid/content/Intent;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۤ᩹ۢ;Landroid/view/MenuItem;)V
    .locals 2

    .line 383
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x104000b

    if-ne p1, v0, :cond_0

    .line 385
    iget-object p0, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    invoke-virtual {p0}, Ll/֡᩶ۢ;->ܽ()V

    return-void

    :cond_0
    const v0, 0x7f120949

    if-ne p1, v0, :cond_1

    .line 387
    iget-object p1, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    const/4 v0, 0x0

    iput-boolean v0, p1, Ll/۫᩹ۢ;->ۗ:Z

    .line 388
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/ۘ᩹ۢ;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "scriptSettings"

    const/4 v1, 0x1

    .line 389
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 390
    iget-object p0, p0, Ll/ۤ᩹ۢ;->ᩳۧ:Ll/ۚ᩹᩷;

    invoke-virtual {p0, p1}, Ll/ۚ᩹᩷;->֫(Landroid/content/Intent;)V

    return-void

    :cond_1
    const v0, 0x7f120316

    if-ne p1, v0, :cond_2

    .line 392
    iget-object p1, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-object p1, p1, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->ܳ()V

    .line 393
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ۤ᩹ۢ;Ll/ܶ᩵ܿ;)V
    .locals 4

    .line 127
    invoke-direct {p0}, Ll/ۤ᩹ۢ;->ۨ()V

    .line 129
    invoke-virtual {p0}, Ll/֨ܿ;->ܺ()Ll/۬ܿ;

    move-result-object v0

    .line 86
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    if-eqz v1, :cond_0

    const-string v2, "term_keep_dark"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    goto :goto_0

    :cond_0
    const/16 v1, -0x64

    .line 129
    :goto_0
    invoke-virtual {v0, v1}, Ll/۬ܿ;->ᩳ(I)V

    .line 130
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-boolean v0, v0, Ll/۫᩹ۢ;->ۗ:Z

    if-eqz v0, :cond_1

    .line 131
    invoke-direct {p0, p1}, Ll/ۤ᩹ۢ;->֫(Ll/ܶ᩵ܿ;)V

    :cond_1
    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;)V
    .locals 8

    .line 220
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 221
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-object v0, v0, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    if-nez v0, :cond_2

    const-string v0, "bin.mt.plus.ACTION_SHORTCUT"

    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 222
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-boolean v1, v0, Ll/۫᩹ۢ;->۬:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 236
    iput-boolean v1, v0, Ll/۫᩹ۢ;->۬:Z

    .line 237
    iget v1, v0, Ll/۫᩹ۢ;->۫:I

    add-int/lit8 v4, v1, 0x1

    iput v4, v0, Ll/۫᩹ۢ;->۫:I

    .line 238
    iget-object v0, p0, Ll/ۤ᩹ۢ;->ܳۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_1

    .line 239
    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    .line 241
    :cond_1
    new-instance v0, Ll/۬۬ܿ;

    const v1, 0x7f120528

    invoke-direct {v0, p0, v1}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->ܽ(I)V

    iput-object v0, p0, Ll/ۤ᩹ۢ;->ܳۧ:Ll/۬۬ܿ;

    .line 242
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 243
    sget-object v6, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v7, Ll/ܶ᩹ۢ;

    move-object v0, v7

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ll/ܶ᩹ۢ;-><init>(Ll/ۤ᩹ۢ;Landroid/content/Context;Landroid/content/Intent;ILl/ܶ᩵ܿ;)V

    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 228
    :cond_2
    invoke-direct {p0, p1, v3}, Ll/ۤ᩹ۢ;->֫(Ll/ܶ᩵ܿ;Landroid/content/Intent;)V

    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;Landroid/content/Intent;)V
    .locals 10

    .line 281
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-object v0, v0, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    if-nez v0, :cond_6

    const-string v0, "bin.mt.plus.ACTION_SHORTCUT"

    .line 284
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "ewrp"

    const-string v2, "ewse"

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    .line 285
    invoke-virtual {p2, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 286
    invoke-virtual {p2, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    xor-int/2addr v1, v4

    .line 287
    iget-object v2, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    const-string v5, "eae"

    invoke-virtual {p2, v5, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, v2, Ll/۫᩹ۢ;->ۙ:Z

    goto :goto_0

    .line 478
    :cond_0
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p2, v1, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 290
    sget-object p2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p2, v2, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    xor-int/lit8 v1, p2, 0x1

    .line 291
    iget-object p2, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iput-boolean v3, p2, Ll/۫᩹ۢ;->ۙ:Z

    :goto_0
    if-eqz v1, :cond_1

    .line 293
    invoke-static {}, Ll/֫᩸ۢ;->ۧ()Ll/۟ܶۢ;

    move-result-object p2

    if-nez p2, :cond_1

    .line 294
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const p2, 0x7f120307

    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->ۧ(I)V

    const p2, 0x7f120959

    .line 295
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(I)V

    new-instance p2, Ll/ۜ۬᩻;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, Ll/ۜ۬᩻;-><init>(ILjava/lang/Object;)V

    const v0, 0x7f12070a

    .line 296
    invoke-virtual {p1, v0, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/᩺ۛ᩷;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p0}, Ll/᩺ۛ᩷;-><init>(ILjava/lang/Object;)V

    const v0, 0x7f12015e

    .line 302
    invoke-virtual {p1, v0, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 303
    invoke-virtual {p1, v3}, Ll/᩵ۚۢ;->֫(Z)V

    .line 304
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 309
    :cond_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۡ֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 355
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v5

    .line 357
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v6

    .line 358
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v7

    .line 359
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    or-int v9, v5, v6

    or-int/2addr v9, v7

    or-int/2addr v9, v8

    if-gez v9, :cond_2

    .line 368
    :try_start_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    goto :goto_3

    :cond_2
    and-int/lit16 v5, v5, 0xff

    and-int/lit16 v6, v6, 0xff

    and-int/lit16 v7, v7, 0xff

    and-int/lit16 v8, v8, 0xff

    const/16 v9, 0x7f

    if-ne v5, v9, :cond_3

    const/16 v5, 0x45

    if-ne v6, v5, :cond_3

    const/16 v5, 0x4c

    if-ne v7, v5, :cond_3

    const/16 v5, 0x46

    if-ne v8, v5, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move v3, v5

    goto :goto_3

    :catchall_0
    move-exception v5

    if-eqz p1, :cond_4

    .line 355
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v5, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw v5
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    nop

    .line 343
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v5, "cd "

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 344
    invoke-static {p2}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " || exit $?; trap \'\' INT; (trap - INT; exec "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_5

    .line 346
    invoke-static {v2}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_5
    const-string p2, "sh "

    .line 348
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/ۢ֨ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_4
    const-string p2, "); _mt_status=$?; exit $_mt_status\r"

    .line 350
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 311
    iget-object p2, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    const/4 v2, 0x0

    xor-int/2addr v1, v4

    invoke-static {v2, v0, v1}, Ll/֡᩸ۢ;->֫(Ljava/lang/String;ZZ)Ll/ܿ᩶ۢ;

    move-result-object v0

    iput-object v0, p2, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    .line 312
    iget-object p2, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-object v0, v0, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    invoke-virtual {p2, v0}, Ll/֡᩶ۢ;->֫(Ll/ܿ᩶ۢ;)V

    .line 313
    new-instance p2, Ll/ۙ᩹ۢ;

    invoke-direct {p2, p0, p1}, Ll/ۙ᩹ۢ;-><init>(Ll/ۤ᩹ۢ;Ljava/lang/String;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_5

    .line 327
    :cond_6
    iget-object p1, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    invoke-virtual {p1, v0}, Ll/֡᩶ۢ;->֫(Ll/ܿ᩶ۢ;)V

    .line 329
    :goto_5
    iget-object p1, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-boolean p2, p1, Ll/۫᩹ۢ;->ۙ:Z

    if-eqz p2, :cond_7

    .line 330
    iget-object p1, p1, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->ۜ()Ll/ۚۡ֫;

    move-result-object p1

    new-instance p2, Ll/۠᩹ۢ;

    invoke-direct {p2, p0}, Ll/۠᩹ۢ;-><init>(Ll/ۤ᩹ۢ;)V

    invoke-virtual {p1, p0, p2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 336
    :cond_7
    iget-object p1, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-object p1, p1, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->ۜ()Ll/ۚۡ֫;

    move-result-object p1

    iget-object p2, p0, Ll/ۤ᩹ۢ;->ܿۧ:Ll/֡ܽ;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ܺܺ᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2}, Ll/ܺܺ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۤ᩹ۢ;)Ll/֡᩶ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    return-object p0
.end method

.method private ۨ()V
    .locals 4

    .line 185
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    .line 194
    :try_start_0
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v2, "term_font_size"

    const-string v3, "12"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/16 v1, 0xc

    :goto_0
    int-to-float v1, v1

    .line 185
    invoke-virtual {v0, v1}, Ll/֡᩶ۢ;->֫(F)V

    .line 186
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    invoke-static {}, Ll/ܳ᩹ۢ;->֫()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֡᩶ۢ;->֫(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۤ᩹ۢ;)Ll/ܺ᩹ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤ᩹ۢ;->ۜۧ:Ll/ܺ᩹ۢ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۤ᩹ۢ;)Ll/۫᩹ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    const/4 v0, 0x0

    .line 94
    iput-boolean v0, p0, Ll/ۗܺ᩷;->ۗ֫:Z

    .line 95
    invoke-static {}, Ll/ᩳ۬᩷;->ۢ֫()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/֨ܿ;->setTheme(I)V

    .line 96
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d0052

    .line 97
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f1208ed

    .line 98
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    .line 100
    new-instance p1, Ll/ۙܺ֫;

    invoke-direct {p1, p0}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v1, Ll/۫᩹ۢ;

    invoke-virtual {p1, v1}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    check-cast p1, Ll/۫᩹ۢ;

    iput-object p1, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    .line 101
    invoke-static {p0}, Ll/᩸֡᩷;->֫(Landroid/content/Context;)Z

    move-result p1

    sput-boolean p1, Ll/ۧ᩹ۢ;->ܽ:Z

    .line 102
    invoke-static {p0, p1}, Ll/۟᩸ۢ;->֫(Ll/ۗܺ᩷;Z)V

    .line 103
    iget-object p1, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-object p1, p1, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->᩻()Ll/ܿ᩹ۢ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 104
    iget-object p1, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-object p1, p1, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    invoke-virtual {p1}, Ll/ܿ᩶ۢ;->᩻()Ll/ܿ᩹ۢ;

    move-result-object p1

    iget-object p1, p1, Ll/ܿ᩹ۢ;->᩻:Ll/ܽ᩹ۢ;

    invoke-virtual {p1}, Ll/ܽ᩹ۢ;->֫()V

    .line 107
    :cond_0
    new-instance p1, Ll/ܺ᩹ۢ;

    invoke-direct {p1, p0, p0}, Ll/ܺ᩹ۢ;-><init>(Ll/ۗܺ᩷;Ll/ۡ᩹ۢ;)V

    iput-object p1, p0, Ll/ۤ᩹ۢ;->ۜۧ:Ll/ܺ᩹ۢ;

    const p1, 0x7f0a00c2

    .line 108
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 109
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const-string v1, "Im"

    .line 110
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-static {p1}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 116
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "path"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    new-array v0, v0, [Ljava/lang/String;

    .line 118
    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 126
    :goto_0
    new-instance v0, Ll/᩵᩹ۢ;

    invoke-direct {v0, p0, p1}, Ll/᩵᩹ۢ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 824
    invoke-static {p0, v0}, Ll/۠᩹᩷;->֫(Ll/᩻ܽ;Ll/᩵᩹᩷;)Ll/ۚ᩹᩷;

    move-result-object v0

    .line 126
    iput-object v0, p0, Ll/ۤ᩹ۢ;->ᩳۧ:Ll/ۚ᩹᩷;

    const v0, 0x7f0a05bd

    .line 135
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/֡᩶ۢ;

    iput-object v0, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    .line 136
    invoke-direct {p0}, Ll/ۤ᩹ۢ;->ۨ()V

    .line 137
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    new-instance v1, Ll/᩶᩹ۢ;

    invoke-direct {v1, p0}, Ll/᩶᩹ۢ;-><init>(Ll/ۤ᩹ۢ;)V

    invoke-virtual {v0, v1}, Ll/֡᩶ۢ;->֫(Ll/ۚ᩶ۢ;)V

    .line 177
    invoke-direct {p0, p1}, Ll/ۤ᩹ۢ;->֫(Ll/ܶ᩵ܿ;)V

    .line 178
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object p1

    iget-object v0, p0, Ll/ۤ᩹ۢ;->ܿۧ:Ll/֡ܽ;

    invoke-virtual {p1, p0, v0}, Ll/ۨܽ;->֫(Ll/᩻ۡ֫;Ll/֡ܽ;)V

    return-void

    .line 120
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 203
    iget-object v0, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 204
    iput-boolean v1, v0, Ll/۫᩹ۢ;->۬:Z

    .line 205
    iget v1, v0, Ll/۫᩹ۢ;->۫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Ll/۫᩹ۢ;->۫:I

    .line 207
    :cond_0
    iget-object v0, p0, Ll/ۤ᩹ۢ;->ܳۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_1

    .line 208
    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    const/4 v0, 0x0

    .line 209
    iput-object v0, p0, Ll/ۤ᩹ۢ;->ܳۧ:Ll/۬۬ܿ;

    .line 211
    :cond_1
    invoke-super {p0}, Ll/ۗܺ᩷;->onDestroy()V

    .line 213
    new-instance v0, Ll/֨᩹ۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x1f4

    invoke-static {v1, v2, v0}, Ll/ۙ᩸᩷;->֫(JLjava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 5

    .line 376
    new-instance v0, Ll/᩸ۖ;

    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, p0, p1, v1}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 377
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v2, 0x7f120316

    .line 378
    invoke-virtual {p1, v1, v2, v1, v2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801f5

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f120949

    .line 379
    invoke-virtual {p1, v1, v2, v1, v2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f08023d

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x104000b

    .line 380
    invoke-virtual {p1, v1, v2, v1, v2}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f080225

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Ll/ۤ᩹ۢ;->᩷ۧ:Ll/۫᩹ۢ;

    iget-object v3, v3, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    .line 381
    invoke-virtual {v3}, Ll/ܿ᩶ۢ;->ܺ()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Ll/ۤ᩹ۢ;->᩻ۧ:Ll/֡᩶ۢ;

    invoke-virtual {v3}, Ll/֡᩶ۢ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 382
    new-instance v1, Ll/ۘ᩹ܽ;

    const/16 v2, 0xa

    invoke-direct {v1, v2, p0}, Ll/ۘ᩹ܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 397
    invoke-virtual {p1, v4}, Ll/ۗۜ;->setOptionalIconsVisible(Z)V

    .line 398
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public final ۘ()I
    .locals 3

    .line 86
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    const-string v1, "term_keep_dark"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/16 v0, -0x64

    return v0
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "ScriptExecutor"

    return-object v0
.end method

.method public final ܳ()V
    .locals 3

    const-string v0, "input_method"

    .line 403
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x2

    .line 405
    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    :cond_0
    return-void
.end method
