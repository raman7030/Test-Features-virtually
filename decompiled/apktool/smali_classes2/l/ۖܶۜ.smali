.class public final Ll/ۖܶۜ;
.super Ll/۬ᩴܺ;
.source "V8FZ"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/util/List;

.field public final ܽ:Ll/ܰܺܳ;


# direct methods
.method public constructor <init>(Ll/ܰܺܳ;Ljava/util/List;I)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܶۜ;->ܽ:Ll/ܰܺܳ;

    iput-object p2, p0, Ll/ۖܶۜ;->ۧ:Ljava/util/List;

    iput p3, p0, Ll/ۖܶۜ;->֫:I

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/String;)Ll/ۖܶۜ;
    .locals 8

    .line 26
    :try_start_0
    sget v0, Ll/ܿ֡ܿ;->֫:I

    .line 153
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 28
    sget-object v1, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    .line 29
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/ܿ᩸ܿ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1, p0}, Ll/ܿ᩸ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1f4

    invoke-interface {v2, v5, v6, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 34
    :catchall_0
    :try_start_2
    invoke-interface {v2, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 35
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 37
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 39
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, -0x1

    const/4 v5, -0x1

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۜܳ;

    .line 40
    invoke-interface {v6}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 42
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 43
    :cond_1
    invoke-interface {v6}, Ll/ᩳۜܳ;->۠֫()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 44
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    if-ne v5, v4, :cond_3

    .line 49
    new-instance v0, Ll/ۢۧ᩻;

    invoke-direct {v0, p0}, Ll/ۢۧ᩻;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v2, p1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v5, 0x0

    .line 51
    :cond_3
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩳۜܳ;

    .line 52
    invoke-static {v2, p1, p1}, Ll/۟۬ܳ;->֫(Ljava/util/ArrayList;IZ)V

    .line 53
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p0

    .line 54
    new-instance p1, Ll/ۖܶۜ;

    invoke-direct {p1, v1, v2, p0}, Ll/ۖܶۜ;-><init>(Ll/ܰܺܳ;Ljava/util/List;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 21
    instance-of v0, p1, Ll/ۖܶۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۖܶۜ;

    iget v0, p0, Ll/ۖܶۜ;->֫:I

    iget v1, p1, Ll/ۖܶۜ;->֫:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۖܶۜ;->ܽ:Ll/ܰܺܳ;

    iget-object v1, p1, Ll/ۖܶۜ;->ܽ:Ll/ܰܺܳ;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖܶۜ;->ۧ:Ljava/util/List;

    iget-object p1, p1, Ll/ۖܶۜ;->ۧ:Ljava/util/List;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 21
    iget v0, p0, Ll/ۖܶۜ;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۖܶۜ;->ܽ:Ll/ܰܺܳ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ۖܶۜ;->ۧ:Ljava/util/List;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 21
    iget v0, p0, Ll/ۖܶۜ;->֫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۖܶۜ;->ܽ:Ll/ܰܺܳ;

    aput-object v3, v1, v2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ۖܶۜ;->ۧ:Ljava/util/List;

    aput-object v4, v1, v3

    const/4 v4, 0x2

    aput-object v0, v1, v4

    const-string v0, "visitor;fileItems;currentIndex"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v0, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MediaArguments["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v5, v0

    if-ge v2, v5, :cond_2

    aget-object v5, v0, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v0

    sub-int/2addr v5, v3

    if-eq v2, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 21
    iget v0, p0, Ll/ۖܶۜ;->֫:I

    return v0
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ۖܶۜ;->ۧ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩳ()Ll/ܰܺܳ;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ۖܶۜ;->ܽ:Ll/ܰܺܳ;

    return-object v0
.end method
