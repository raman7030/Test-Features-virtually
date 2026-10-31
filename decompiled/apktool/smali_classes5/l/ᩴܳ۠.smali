.class public final Ll/ᩴܳ۠;
.super Ll/ܰܿ۠;
.source "K7QT"


# instance fields
.field public ܳ:Ll/᩷۠ᩴ;

.field public ܿ:Ll/ۘܳ۠;

.field public ᩳ:Z

.field public final synthetic ᩻:Ll/᩹ܳ۠;


# direct methods
.method public varargs constructor <init>(Ll/᩹ܳ۠;Ll/֫᩶۠;[Ll/֡ۖ۠;)V
    .locals 0

    .line 585
    iput-object p1, p0, Ll/ᩴܳ۠;->᩻:Ll/᩹ܳ۠;

    .line 586
    invoke-direct {p0, p2, p3}, Ll/ܰܿ۠;-><init>(Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴܳ۠;)Ll/᩷۠ᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֫᩶۠;
    .locals 9

    .line 624
    iget-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    if-nez v0, :cond_0

    .line 625
    new-instance v0, Ll/ۘܳ۠;

    iget-object v1, p0, Ll/ᩴܳ۠;->᩻:Ll/᩹ܳ۠;

    invoke-direct {v0, v1}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    .line 627
    :cond_0
    iget-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object v0

    if-nez v0, :cond_1

    .line 629
    iget-object v0, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    invoke-interface {v0, p1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    .line 630
    new-instance v8, Ll/ܽܳ۠;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    invoke-interface {v2}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 631
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x1

    iget-object v2, p0, Ll/ᩴܳ۠;->᩻:Ll/᩹ܳ۠;

    move-object v1, v8

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 632
    iget-object p1, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {p1, v8}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V

    return-object v8

    :cond_1
    return-object v0
.end method

.method public final ֫(Ljava/lang/Iterable;)V
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 613
    iput-object v0, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 615
    iput-boolean v1, p0, Ll/ܰܿ۠;->֫:Z

    .line 616
    invoke-static {p1}, Ll/ܰܿ۠;->ۧ(Ljava/lang/Iterable;)Ll/᩷۠ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    .line 618
    :goto_0
    iput-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    const/4 p1, 0x0

    .line 619
    iput-boolean p1, p0, Ll/ᩴܳ۠;->ᩳ:Z

    return-void
.end method

.method public final ֫(Ljava/lang/Iterable;Ljava/lang/String;)V
    .locals 8

    .line 639
    invoke-static {p1}, Ll/ܰܿ۠;->ۧ(Ljava/lang/Iterable;)Ll/᩷۠ᩴ;

    move-result-object p1

    .line 640
    iget-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    if-nez v0, :cond_0

    .line 641
    new-instance v0, Ll/ۘܳ۠;

    iget-object v1, p0, Ll/ᩴܳ۠;->᩻:Ll/᩹ܳ۠;

    invoke-direct {v0, v1}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    .line 643
    :cond_0
    iget-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {v0, p2}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object v0

    if-nez v0, :cond_1

    .line 645
    new-instance v0, Ll/ܽܳ۠;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    invoke-interface {v2}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 646
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x1

    iget-object v2, p0, Ll/ᩴܳ۠;->᩻:Ll/᩹ܳ۠;

    move-object v1, v0

    move-object v3, p0

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 647
    iget-object p1, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {p1, v0}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V

    goto :goto_0

    .line 649
    :cond_1
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, v0, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    .line 650
    iget-object p1, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {p1, v0}, Ll/ۘܳ۠;->ۧ(Ll/ܽܳ۠;)V

    :goto_0
    const/4 p1, 0x1

    .line 652
    iput-boolean p1, p0, Ll/ܰܿ۠;->֫:Z

    return-void
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 2

    .line 591
    iget-object v0, p0, Ll/ܰܿ۠;->ܽ:Ljava/util/EnumSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x1

    .line 595
    iput-boolean p1, p0, Ll/ܰܿ۠;->֫:Z

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    .line 601
    :cond_1
    iget-object v1, p0, Ll/ᩴܳ۠;->᩻:Ll/᩹ܳ۠;

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, p2, v0}, Ll/᩹ܳ۠;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    return p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Z
    .locals 1

    .line 681
    iget-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    if-eqz v0, :cond_0

    .line 682
    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1

    .line 684
    :cond_0
    iget-object v0, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    if-eqz v0, :cond_1

    invoke-static {p1}, Ll/᩹ܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p1

    iget-object v0, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    invoke-static {v0}, Ll/᩹ܳ۠;->֫(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩷۠ᩴ;->startsWith(Ll/᩷۠ᩴ;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ll/᩷۠ᩴ;)Ll/֫᩶۠;
    .locals 1

    .line 657
    iget-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Ljava/lang/Iterable;
    .locals 3

    .line 664
    iget-boolean v0, p0, Ll/ᩴܳ۠;->ᩳ:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    if-eqz v0, :cond_2

    .line 665
    invoke-static {v0}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;)Ljava/nio/file/DirectoryStream;

    move-result-object v0

    .line 666
    :try_start_0
    invoke-interface {v0}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷۠ᩴ;

    .line 667
    invoke-interface {v2}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/ᩴܳ۠;->֫(Ljava/lang/String;)Ll/֫᩶۠;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 669
    :cond_0
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    const/4 v0, 0x1

    .line 670
    iput-boolean v0, p0, Ll/ᩴܳ۠;->ᩳ:Z

    goto :goto_2

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_1

    .line 665
    :try_start_1
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw v1

    .line 673
    :cond_2
    :goto_2
    iget-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ll/ۘܳ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    .line 676
    :cond_3
    iget-object v0, p0, Ll/ᩴܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {v0}, Ll/ۘܳ۠;->ᩳ()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 674
    :cond_4
    :goto_3
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0
.end method

.method public final ܽ()Ljava/util/Collection;
    .locals 1

    .line 607
    iget-object v0, p0, Ll/ᩴܳ۠;->ܳ:Ll/᩷۠ᩴ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
