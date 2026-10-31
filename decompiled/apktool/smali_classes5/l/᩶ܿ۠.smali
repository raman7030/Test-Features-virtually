.class public final Ll/᩶ܿ۠;
.super Ljava/lang/Object;
.source "X44P"

# interfaces
.implements Ll/ۙܿ۠;


# instance fields
.field public final ֫:Ll/᩷۠ᩴ;

.field public final ۧ:Ll/۟֨ᩴ;

.field public final ܽ:Ljava/util/HashMap;

.field public final synthetic ᩳ:Ll/ۨܿ۠;


# direct methods
.method public constructor <init>(Ll/ۨܿ۠;Ll/᩷۠ᩴ;)V
    .locals 3

    .line 556
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܿ۠;->ᩳ:Ll/ۨܿ۠;

    .line 557
    iput-object p2, p0, Ll/᩶ܿ۠;->֫:Ll/᩷۠ᩴ;

    .line 558
    iget-object v0, p1, Ll/᩷ܿ۠;->᩺:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, ".jar"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "multi-release"

    .line 559
    iget-object v2, p1, Ll/᩷ܿ۠;->᩺:Ljava/lang/String;

    invoke-static {v0, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    .line 560
    invoke-static {p1}, Ll/ۨܿ۠;->ۧ(Ll/ۨܿ۠;)Ll/ۖܿ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܿ۠;->֫()Ll/֨᩶۠;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 563
    :try_start_0
    invoke-virtual {p1, p2, v0}, Ll/֨᩶۠;->newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܿ۠;->ۧ:Ll/۟֨ᩴ;
    :try_end_0
    .catch Ljava/util/zip/ZipException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 565
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ZipException opening \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\": "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    const-string p1, "should have been caught before!"

    .line 137
    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    throw v1

    .line 568
    :cond_1
    invoke-static {p1}, Ll/ۨܿ۠;->ۧ(Ll/ۨܿ۠;)Ll/ۖܿ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܿ۠;->֫()Ll/֨᩶۠;

    move-result-object p1

    invoke-virtual {p1, p2, v1}, Ll/֨᩶۠;->newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܿ۠;->ۧ:Ll/۟֨ᩴ;

    .line 570
    :goto_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/᩶ܿ۠;->ܽ:Ljava/util/HashMap;

    .line 571
    iget-object p1, p0, Ll/᩶ܿ۠;->ۧ:Ll/۟֨ᩴ;

    invoke-virtual {p1}, Ll/۟֨ᩴ;->getRootDirectories()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩷۠ᩴ;

    .line 572
    invoke-static {}, Ll/ۨܿ۠;->ۜ()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ll/᩸ܿ۠;

    invoke-direct {v1, p0, p2}, Ll/᩸ܿ۠;-><init>(Ll/᩶ܿ۠;Ll/᩷۠ᩴ;)V

    const v2, 0x7fffffff

    invoke-static {p2, v0, v2, v1}, Ll/ܿ۠ᩴ;->walkFileTree(Ll/᩷۠ᩴ;Ljava/util/Set;ILl/ᩳ۠ᩴ;)Ll/᩷۠ᩴ;

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶ܿ۠;)Ll/᩷۠ᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܿ۠;->֫:Ll/᩷۠ᩴ;

    return-object p0
.end method

.method public static ֫(Ll/᩶ܿ۠;Ll/᩷۠ᩴ;)Z
    .locals 1

    const/4 p0, 0x1

    if-nez p1, :cond_0

    return p0

    .line 631
    :cond_0
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "/"

    .line 632
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 0
    invoke-static {p0, v0, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 635
    :cond_1
    invoke-static {p1}, Ll/ۗ᩸۠;->֫(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩶ܿ۠;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܿ۠;->ܽ:Ljava/util/HashMap;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 654
    iget-object v0, p0, Ll/᩶ܿ۠;->ۧ:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->close()V

    return-void
.end method

.method public final ֫()Ljava/lang/Iterable;
    .locals 1

    .line 664
    iget-object v0, p0, Ll/᩶ܿ۠;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/ۛܳ۠;)Ll/ᩳ᩶۠;
    .locals 3

    .line 641
    invoke-virtual {p2}, Ll/ۛܳ۠;->֫()Ll/ۤܳ۠;

    move-result-object v0

    .line 642
    iget-object v1, p0, Ll/᩶ܿ۠;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷۠ᩴ;

    if-eqz v0, :cond_0

    .line 188
    iget-object p2, p2, Ll/ۨܳ۠;->᩸:Ljava/lang/String;

    const/16 v1, 0x2f

    invoke-virtual {p2, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 189
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    .line 644
    invoke-interface {v0, p2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p2

    const/4 v0, 0x0

    new-array v1, v0, [Ll/ܳ۠ᩴ;

    .line 645
    invoke-static {p2, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 646
    sget v1, Ll/۫ܳ۠;->ᩳ:I

    .line 157
    new-instance v1, Ll/ۗܳ۠;

    iget-object v2, p0, Ll/᩶ܿ۠;->ᩳ:Ll/ۨܿ۠;

    invoke-direct {v1, v2, p2, p1, v0}, Ll/ۗܳ۠;-><init>(Ll/᩷ܿ۠;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;I)V

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/ۤܳ۠;Ljava/util/Set;ZLl/ᩴܶ۠;)V
    .locals 1

    .line 597
    iget-object p1, p0, Ll/᩶ܿ۠;->ܽ:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷۠ᩴ;

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p4, :cond_1

    const p2, 0x7fffffff

    goto :goto_0

    :cond_1
    const/4 p2, 0x1

    .line 603
    :goto_0
    invoke-static {}, Ll/ۨܿ۠;->᩻()Ljava/util/Set;

    move-result-object p4

    new-instance v0, Ll/᩹ܿ۠;

    invoke-direct {v0, p0, p3, p5}, Ll/᩹ܿ۠;-><init>(Ll/᩶ܿ۠;Ljava/util/Set;Ll/ᩴܶ۠;)V

    invoke-static {p1, p4, p2, v0}, Ll/ܿ۠ᩴ;->walkFileTree(Ll/᩷۠ᩴ;Ljava/util/Set;ILl/ᩳ۠ᩴ;)Ll/᩷۠ᩴ;

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
