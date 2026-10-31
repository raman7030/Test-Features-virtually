.class public final Ll/ۖᩴܿ;
.super Ll/۟ܶۡ;
.source "N15M"


# instance fields
.field public final synthetic ۜ:Ll/֡ᩴܿ;

.field public final synthetic ܳ:Ljava/util/ArrayList;

.field public final synthetic ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/֡ᩴܿ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/ۖᩴܿ;->ۜ:Ll/֡ᩴܿ;

    .line 4
    iput-object p2, p0, Ll/ۖᩴܿ;->ܳ:Ljava/util/ArrayList;

    .line 6
    iput-object p3, p0, Ll/ۖᩴܿ;->᩻:Ljava/util/ArrayList;

    .line 328
    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 353
    iget-object v0, p0, Ll/ۖᩴܿ;->᩻:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۖᩴܿ;->ۜ:Ll/֡ᩴܿ;

    invoke-static {v1, v0}, Ll/֡ᩴܿ;->֫(Ll/֡ᩴܿ;Ljava/util/ArrayList;)V

    .line 354
    invoke-static {}, Ll/۬ܿ᩷;->ܽ()I

    move-result v0

    invoke-static {v1, v0}, Ll/֡ᩴܿ;->֫(Ll/֡ᩴܿ;I)V

    .line 355
    invoke-static {v1}, Ll/֡ᩴܿ;->ܿ(Ll/֡ᩴܿ;)Ljava/util/Set;

    move-result-object v0

    const-string v2, "access$getTranslatorBinders$p(...)"

    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1915
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗᩴܿ;

    if-eqz v2, :cond_0

    .line 356
    invoke-virtual {v2}, Ll/ۗᩴܿ;->ۧ()Ll/֫᩷ۡ;

    move-result-object v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 357
    invoke-virtual {v2}, Ll/֫᩷ۡ;->ۧ()V

    .line 358
    invoke-virtual {v2}, Ll/֫᩷ۡ;->֫()V

    .line 359
    invoke-static {v1}, Ll/֡ᩴܿ;->ۧ(Ll/֡ᩴܿ;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/֫᩷ۡ;->֫(Ljava/util/List;)V

    .line 360
    invoke-virtual {v2}, Ll/֫᩷ۡ;->notifyDataSetChanged()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 366
    iget-object v0, p0, Ll/ۖᩴܿ;->ۜ:Ll/֡ᩴܿ;

    invoke-static {v0}, Ll/֡ᩴܿ;->֫(Ll/֡ᩴܿ;)Ll/ۗܺ᩷;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 330
    iget-object v0, p0, Ll/ۖᩴܿ;->ۜ:Ll/֡ᩴܿ;

    invoke-static {v0}, Ll/֡ᩴܿ;->֫(Ll/֡ᩴܿ;)Ll/ۗܺ᩷;

    move-result-object v0

    const v1, 0x7f120528

    const/16 v2, 0xc8

    invoke-virtual {p0, v0, v1, v2}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;II)V

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 334
    invoke-static {}, Ll/۬ܿ᩷;->֫()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/ۖᩴܿ;->᩻:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܳ᩷;

    .line 335
    iget-object v3, p0, Ll/ۖᩴܿ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 336
    invoke-virtual {v1, v3}, Ll/ܽܳ᩷;->ᩳ(Ljava/util/ArrayList;)V

    .line 337
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    .line 340
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 341
    invoke-virtual {v1}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v5

    invoke-interface {v4, v5}, Lbin/mt/plugin/api/translation/TranslationEngine;->init(Lbin/mt/plugin/api/PluginContext;)V

    .line 342
    new-instance v5, Ll/֫ᩴܿ;

    invoke-direct {v5, v1, v4}, Ll/֫ᩴܿ;-><init>(Ll/ܽܳ᩷;Lbin/mt/plugin/api/translation/TranslationEngine;)V

    .line 343
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v4

    .line 345
    invoke-virtual {v1, v4}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 349
    :cond_1
    new-instance v0, Ll/ܰۘܿ;

    invoke-direct {v0}, Ll/ܰۘܿ;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 370
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 371
    iget-object v0, p0, Ll/ۖᩴܿ;->ۜ:Ll/֡ᩴܿ;

    invoke-static {v0}, Ll/֡ᩴܿ;->ܳ(Ll/֡ᩴܿ;)V

    .line 372
    invoke-static {v0}, Ll/֡ᩴܿ;->ܽ(Ll/֡ᩴܿ;)Ljava/lang/Runnable;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 373
    check-cast v1, Ll/᩵᩷ᩳ;

    invoke-virtual {v1}, Ll/᩵᩷ᩳ;->run()V

    .line 374
    invoke-static {v0}, Ll/֡ᩴܿ;->᩻(Ll/֡ᩴܿ;)V

    :cond_0
    return-void
.end method
