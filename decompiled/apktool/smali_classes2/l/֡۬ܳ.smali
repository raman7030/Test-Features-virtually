.class public final Ll/֡۬ܳ;
.super Ll/֨۬ܳ;
.source "D4TJ"


# instance fields
.field public final ֨:Ljava/util/ArrayList;

.field public ۠:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1290
    invoke-direct {p0, v0}, Ll/֨۬ܳ;-><init>(Z)V

    .line 1286
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡۬ܳ;->֨:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 1287
    iput-boolean v0, p0, Ll/֡۬ܳ;->۠:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡۬ܳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡۬ܳ;->֨:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/֡۬ܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/֡۬ܳ;->۠:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֡۬ܳ;
    .locals 0

    return-object p0
.end method

.method public final ֫(Ljava/util/concurrent/CountDownLatch;)V
    .locals 2

    .line 1514
    iput-object p1, p0, Ll/֨۬ܳ;->ܳ:Ljava/util/concurrent/CountDownLatch;

    .line 1300
    iget-object v0, p0, Ll/֡۬ܳ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 1301
    invoke-virtual {v1, p1}, Ll/֨۬ܳ;->֫(Ljava/util/concurrent/CountDownLatch;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۗ()V
    .locals 3

    .line 1306
    invoke-static {}, Ll/ܶ۬ܳ;->᩵()Ll/ᩴ۬ܳ;

    move-result-object v0

    iget-object v1, p0, Ll/֡۬ܳ;->֨:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1307
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 1308
    invoke-virtual {v1}, Ll/֨۬ܳ;->ۘ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1309
    invoke-virtual {v1}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡۬ܳ;->ۗ()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۙ()Z
    .locals 3

    .line 1325
    iget-boolean v0, p0, Ll/֡۬ܳ;->۠:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1328
    :cond_0
    iget-object v0, p0, Ll/֡۬ܳ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 1329
    invoke-virtual {v1}, Ll/֨۬ܳ;->ۘ()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡۬ܳ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ll/ۚ۬ܳ;
    .locals 1

    .line 1316
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩶()Ljava/util/ArrayList;
    .locals 1

    .line 1294
    iget-object v0, p0, Ll/֡۬ܳ;->֨:Ljava/util/ArrayList;

    return-object v0
.end method
