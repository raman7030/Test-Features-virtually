.class public final Ll/᩻ܳܳ;
.super Ljava/lang/Object;
.source "27BS"


# instance fields
.field public ֫:J

.field public final ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    invoke-static {}, Ll/ܽ᩷ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 344
    iput-object v0, p0, Ll/᩻ܳܳ;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 356
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩻ܳܳ;->ۧ:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܳܳ;

    .line 357
    invoke-virtual {v1}, Ll/ܽܳܳ;->֫()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ܽܳܳ;)V
    .locals 1

    .line 363
    iget-object v0, p0, Ll/᩻ܳܳ;->ۧ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ll/ܽܳܳ;)V
    .locals 4

    .line 368
    iget-wide v0, p0, Ll/᩻ܳܳ;->֫:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩻ܳܳ;->֫:J

    .line 369
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const/4 v1, 0x1

    .line 370
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 371
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NanoHttpd Request Processor (#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/᩻ܳܳ;->֫:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 372
    iget-object v1, p0, Ll/᩻ܳܳ;->ۧ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 373
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
