.class public final Ll/֡ۛܳ;
.super Ll/۟ܶۡ;
.source "6B6V"


# instance fields
.field public final synthetic ۖ:Ljava/util/List;

.field public final synthetic ۘ:Ll/ܽۢܳ;

.field public ۜ:Ljava/util/ArrayList;

.field public final synthetic ۡ:Ll/ۚۛܳ;

.field public ۢ:Z

.field public ܳ:Ll/᩺ۤܿ;

.field public final synthetic ܺ:Ljava/lang/Runnable;

.field public ᩷:Ljava/util/HashSet;

.field public ᩻:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/ۚۛܳ;Ll/ܽۢܳ;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    .line 271
    iput-object p1, p0, Ll/֡ۛܳ;->ۡ:Ll/ۚۛܳ;

    iput-object p2, p0, Ll/֡ۛܳ;->ۘ:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/֡ۛܳ;->ۖ:Ljava/util/List;

    iput-object p4, p0, Ll/֡ۛܳ;->ܺ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 272
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/֡ۛܳ;->ۜ:Ljava/util/ArrayList;

    .line 273
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, Ll/֡ۛܳ;->᩷:Ljava/util/HashSet;

    .line 274
    invoke-static {p1}, Ll/ۚۛܳ;->ۧ(Ll/ۚۛܳ;)Ll/ܶ᩵ܿ;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ֡᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 356
    iget-object v0, p0, Ll/֡ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Ll/֡ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 359
    iput-boolean v0, p0, Ll/֡ۛܳ;->ۢ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 365
    iget-object v0, p0, Ll/֡ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 366
    iget-object v0, p0, Ll/֡ۛܳ;->ۘ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 280
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/֡ۛܳ;->ۘ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    const v1, 0x7f12037a

    .line 282
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const-string v1, "..."

    .line 283
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    .line 284
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/֡ۛܳ;->ܳ:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 10

    .line 289
    iget-object v0, p0, Ll/֡ۛܳ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 290
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 292
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 293
    new-instance v0, Ll/ۙۜᩴ;

    iget-object v1, p0, Ll/֡ۛܳ;->ۖ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ll/ۙۜᩴ;-><init>(I)V

    .line 294
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, p0, Ll/֡ۛܳ;->ۡ:Ll/ۚۛܳ;

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۤۢܳ;

    .line 295
    invoke-virtual {v3}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v5

    .line 296
    invoke-virtual {v3}, Ll/ۤۢܳ;->ܿ()Ljava/lang/String;

    move-result-object v6

    .line 297
    invoke-virtual {v3}, Ll/ۤۢܳ;->ۜ()Z

    move-result v7

    .line 343
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v9, 0x1

    invoke-virtual {v6, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 344
    invoke-static {v4}, Ll/ۚۛܳ;->֫(Ll/ۚۛܳ;)Ll/ۖۛܳ;

    move-result-object v8

    invoke-virtual {v8, v6}, Ll/ۖۛܳ;->getEntry(Ljava/lang/String;)Ll/ۘܳᩳ;

    move-result-object v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v7, :cond_2

    .line 349
    invoke-static {v4}, Ll/ۚۛܳ;->֫(Ll/ۚۛܳ;)Ll/ۖۛܳ;

    move-result-object v4

    invoke-virtual {v4, v5}, Ll/ۖۛܳ;->getEntry(Ljava/lang/String;)Ll/ۘܳᩳ;

    move-result-object v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_3

    .line 299
    invoke-virtual {v3}, Ll/ۤۢܳ;->֫()V

    goto :goto_0

    .line 302
    :cond_3
    invoke-virtual {v6}, Ll/ۘܳᩳ;->ܽ()I

    move-result v4

    invoke-static {v3, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Ll/ۙۜᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 304
    :cond_4
    invoke-virtual {v0}, Ll/ۙۜᩴ;->keySet()Ll/ۨۡᩴ;

    move-result-object v2

    new-instance v3, Ll/᩵ۛܳ;

    iget-object v5, p0, Ll/֡ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-direct {v3, p0, v4, v5, v0}, Ll/᩵ۛܳ;-><init>(Ll/֡ۛܳ;Ll/ۚۛܳ;Ll/᩺ۤܿ;Ll/ۙۜᩴ;)V

    invoke-static {v2, v3}, Ll/ᩳ᩻ᩳ;->֫(Ll/ۨۡᩴ;Ll/ܰܳᩳ;)V

    .line 331
    iget-object v0, p0, Ll/֡ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    .line 334
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۢܳ;

    .line 335
    invoke-virtual {v1}, Ll/ۤۢܳ;->᩷()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    if-eqz v2, :cond_7

    goto :goto_2

    .line 336
    :cond_7
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Extract file failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_3
    return-void
.end method

.method public final ᩳ()V
    .locals 6

    .line 371
    iget-object v0, p0, Ll/֡ۛܳ;->ܳ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    .line 372
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 373
    iget-boolean v0, p0, Ll/֡ۛܳ;->ۢ:Z

    if-eqz v0, :cond_2

    .line 374
    iget-object v0, p0, Ll/֡ۛܳ;->ۡ:Ll/ۚۛܳ;

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->ۚ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    iget-object v3, p0, Ll/֡ۛܳ;->ۜ:Ljava/util/ArrayList;

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۢܳ;

    .line 375
    iget-object v4, p0, Ll/֡ۛܳ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v2}, Ll/ۛۢܳ;->ۧ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 376
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 379
    :cond_1
    invoke-virtual {v0, v3}, Ll/ܽ᩷ܳ;->֫(Ljava/util/List;)V

    .line 381
    :try_start_0
    iget-object v0, p0, Ll/֡ۛܳ;->ܺ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 383
    iget-object v1, p0, Ll/֡ۛܳ;->ۘ:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_2
    return-void
.end method
