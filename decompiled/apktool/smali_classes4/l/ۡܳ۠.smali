.class public final Ll/ۡܳ۠;
.super Ll/ܰܿ۠;
.source "K7QT"


# instance fields
.field public ܳ:Ljava/util/List;

.field public ܿ:Ll/ۘܳ۠;

.field public final ᩳ:Ll/ۗۢۡ;

.field public final synthetic ᩻:Ll/᩹ܳ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܳ۠;)V
    .locals 3

    .line 1527
    iput-object p1, p0, Ll/ۡܳ۠;->᩻:Ll/᩹ܳ۠;

    .line 1528
    sget-object p1, Ll/᩷᩶۠;->۫:Ll/᩷᩶۠;

    const/4 v0, 0x1

    new-array v0, v0, [Ll/֡ۖ۠;

    sget-object v1, Ll/֡ۖ۠;->ܰ֫:Ll/֡ۖ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, Ll/ܰܿ۠;-><init>(Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    .line 1650
    new-instance p1, Ll/ۗۢۡ;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ll/ۗۢۡ;-><init>(I)V

    iput-object p1, p0, Ll/ۡܳ۠;->ᩳ:Ll/ۗۢۡ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 1691
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    const-string v7, "mismatched braces"

    if-ge v4, v6, :cond_a

    .line 1692
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v8, 0x2c

    const/4 v9, 0x1

    if-eq v6, v8, :cond_8

    const/16 v8, 0x7d

    const/16 v10, 0x7b

    if-eq v6, v10, :cond_3

    if-eq v6, v8, :cond_0

    goto :goto_3

    :cond_0
    if-eqz v5, :cond_2

    if-eq v5, v9, :cond_1

    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    .line 1716
    :cond_1
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 0
    invoke-static {v2, p0, v3}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1717
    invoke-static {p0, p1}, Ll/ۡܳ۠;->֫(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void

    .line 1713
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    add-int/lit8 v5, v5, 0x1

    if-ne v5, v9, :cond_9

    .line 1696
    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v4, 0x1

    move v3, v2

    .line 1733
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v3, v6, :cond_7

    .line 1734
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v6, v10, :cond_5

    if-eq v6, v8, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v9, v9, -0x1

    if-nez v9, :cond_6

    add-int/lit8 v3, v3, 0x1

    .line 1697
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    move v11, v2

    move-object v2, v1

    move v1, v11

    goto :goto_3

    :cond_5
    add-int/lit8 v9, v9, 0x1

    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1745
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    if-ne v5, v9, :cond_9

    .line 1704
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v2, v1, v3}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1705
    invoke-static {v1, p1}, Ll/ۡܳ۠;->֫(Ljava/lang/String;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v4, 0x1

    :cond_9
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_a
    if-gtz v5, :cond_b

    .line 1728
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 1727
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ֫(Ll/ۡܳ۠;Ljava/lang/String;Ljava/util/List;)V
    .locals 9

    .line 1640
    invoke-static {p2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    iget-object v1, p0, Ll/ۡܳ۠;->ᩳ:Ll/ۗۢۡ;

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1642
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    invoke-interface {v1}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1643
    new-instance v0, Ll/ܽܳ۠;

    iget-object v3, p0, Ll/ۡܳ۠;->᩻:Ll/᩹ܳ۠;

    const/4 v8, 0x0

    move-object v2, v0

    move-object v4, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v8}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 1645
    iget-object p0, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {p0, v0}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֫᩶۠;
    .locals 1

    .line 1810
    iget-object v0, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Iterable;)V
    .locals 4

    .line 1765
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1766
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1767
    check-cast p1, Ll/ۚܿ۠;

    invoke-virtual {p1}, Ll/ۚܿ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    move-object v2, p1

    check-cast v2, Ll/۠ܿ۠;

    .line 1296
    iget-object v3, v2, Ll/۠ܿ۠;->᩸:Ljava/util/Iterator;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1767
    invoke-virtual {v2}, Ll/۠ܿ۠;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷۠ᩴ;

    const/4 v3, 0x0

    .line 1768
    invoke-virtual {p0, v0, v2, v3}, Ll/ۡܳ۠;->֫(Ljava/util/LinkedHashMap;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V

    .line 1769
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1638
    :cond_0
    new-instance p1, Ll/ۘܳ۠;

    iget-object v2, p0, Ll/ۡܳ۠;->᩻:Ll/᩹ܳ۠;

    invoke-direct {p1, v2}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object p1, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    .line 1639
    new-instance p1, Ll/ۢܳ۠;

    invoke-direct {p1, p0}, Ll/ۢܳ۠;-><init>(Ll/ۡܳ۠;)V

    invoke-static {v0, p1}, Ll/ܰ۬ᩴ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    const/4 p1, 0x1

    .line 1773
    iput-boolean p1, p0, Ll/ܰܿ۠;->֫:Z

    .line 1774
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۡܳ۠;->ܳ:Ljava/util/List;

    return-void
.end method

.method public final ֫(Ljava/lang/Iterable;Ljava/lang/String;)V
    .locals 7

    .line 1800
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1801
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1802
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷۠ᩴ;

    .line 1803
    invoke-static {v0}, Ll/ܰܿ۠;->ܽ(Ll/᩷۠ᩴ;)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1781
    :cond_0
    iget-object p1, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    iget-object v1, p0, Ll/ۡܳ۠;->᩻:Ll/᩹ܳ۠;

    if-nez p1, :cond_1

    .line 1782
    new-instance p1, Ll/ۘܳ۠;

    invoke-direct {p1, v1}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object p1, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    .line 1784
    :cond_1
    iget-object p1, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {p1, p2}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object p1

    if-nez p1, :cond_2

    .line 1786
    new-instance p1, Ll/ܽܳ۠;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    .line 1787
    invoke-interface {v2}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x1

    move-object v0, p1

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 1791
    iget-object p2, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {p2, p1}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V

    goto :goto_1

    .line 1793
    :cond_2
    iput-object v5, p1, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    .line 1794
    iget-object p2, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    invoke-virtual {p2, p1}, Ll/ۘܳ۠;->ۧ(Ll/ܽܳ۠;)V

    :goto_1
    const/4 p1, 0x1

    .line 1796
    iput-boolean p1, p0, Ll/ܰܿ۠;->֫:Z

    return-void
.end method

.method public final ֫(Ljava/util/LinkedHashMap;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V
    .locals 5

    const/4 v0, 0x0

    new-array v1, v0, [Ll/ܳ۠ᩴ;

    .line 1660
    invoke-static {p2, v1}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 1661
    iget-object p1, p0, Ll/ۡܳ۠;->᩻:Ll/᩹ܳ۠;

    invoke-static {p1}, Ll/᩹ܳ۠;->ܿ(Ll/᩹ܳ۠;)Z

    move-result p3

    if-eqz p3, :cond_1

    new-array p3, v0, [Ll/ܳ۠ᩴ;

    .line 1662
    invoke-static {p2, p3}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p3

    const/4 v1, 0x1

    const-string v2, "compiler"

    if-eqz p3, :cond_0

    .line 1663
    sget-object p3, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4237
    new-instance p3, Ll/ۧܶ۠;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    const-string p2, "dir.path.element.not.directory"

    invoke-direct {p3, v2, p2, v1}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1664
    :cond_0
    sget-object p3, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4245
    new-instance p3, Ll/ۧܶ۠;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v0

    const-string p2, "dir.path.element.not.found"

    invoke-direct {p3, v2, p2, v1}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1665
    :goto_0
    invoke-static {p1}, Ll/᩹ܳ۠;->ܽ(Ll/᩹ܳ۠;)Ll/᩹ܶ۠;

    move-result-object p1

    sget-object p2, Ll/᩶ᩴ֨;->᩻֫:Ll/᩶ᩴ֨;

    invoke-virtual {p1, p2, p3}, Ll/ۖ֨۠;->֫(Ll/᩶ᩴ֨;Ll/ۧܶ۠;)V

    :cond_1
    return-void

    .line 1669
    :cond_2
    :try_start_0
    new-instance v1, Ll/᩷ܳ۠;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, v1}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1670
    :try_start_1
    invoke-interface {p2}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷۠ᩴ;

    if-nez p3, :cond_4

    move-object v3, v2

    goto :goto_2

    .line 1671
    :cond_4
    invoke-interface {v2, p3}, Ll/᩷۠ᩴ;->resolve(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v3

    :goto_2
    new-array v4, v0, [Ll/ܳ۠ᩴ;

    .line 1672
    invoke-static {v3, v4}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1673
    invoke-interface {v2}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1674
    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_5

    .line 1676
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1677
    :cond_5
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 1680
    :cond_6
    :try_start_2
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_7

    .line 1669
    :try_start_3
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_3
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 1682
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 13

    const/4 p1, 0x1

    .line 1534
    iput-boolean p1, p0, Ll/ܰܿ۠;->֫:Z

    const-string p1, "([\\p{Alnum}$_.]+)=(.*)"

    .line 1548
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    .line 1549
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "\u0000"

    .line 1551
    invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v2

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v6, p2, v4

    .line 1552
    invoke-virtual {p1, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 1553
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    move-object v5, v6

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-eqz v5, :cond_c

    .line 1595
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 1596
    sget-object p2, Ljava/io/File;->pathSeparator:Ljava/lang/String;

    invoke-virtual {v5, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    array-length v1, p2

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v1, :cond_2

    aget-object v5, p2, v4

    .line 1597
    invoke-static {v5, p1}, Ll/ۡܳ۠;->֫(Ljava/lang/String;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1600
    :cond_2
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1601
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1604
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v4, 0x0

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    iget-object v6, p0, Ll/ۡܳ۠;->᩻:Ll/᩹ܳ۠;

    if-eqz v5, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v7, "*"

    .line 1605
    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_3

    .line 1607
    new-array v7, v3, [Ljava/lang/String;

    invoke-virtual {v6, v5, v7}, Ll/᩹ܳ۠;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v5

    .line 1608
    invoke-virtual {p0, p2, v5, v2}, Ll/ۡܳ۠;->֫(Ljava/util/LinkedHashMap;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V

    .line 1609
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_3
    const-string v2, "illegal use of * in "

    if-eqz v8, :cond_9

    add-int/lit8 v9, v8, -0x1

    .line 1611
    invoke-virtual {v5, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 1656
    sget-char v11, Ljava/io/File;->separatorChar:C

    const/16 v12, 0x2f

    if-eq v10, v11, :cond_4

    if-ne v10, v12, :cond_9

    .line 1614
    :cond_4
    invoke-virtual {v5, v3, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {v6, v9, v3}, Ll/᩹ܳ۠;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    add-int/lit8 v9, v8, 0x1

    .line 1617
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v10

    if-ne v9, v10, :cond_5

    const/4 v2, 0x0

    const/4 v5, 0x0

    goto :goto_4

    .line 1619
    :cond_5
    invoke-virtual {v5, v9}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v4, v11, :cond_6

    if-ne v4, v12, :cond_8

    .line 1620
    :cond_6
    invoke-virtual {v5, v7, v9}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    const/4 v7, -0x1

    if-ne v4, v7, :cond_8

    add-int/lit8 v8, v8, 0x2

    .line 1623
    invoke-virtual {v5, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v4, v5, [Ljava/lang/String;

    invoke-virtual {v6, v2, v4}, Ll/᩹ܳ۠;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    const/4 v4, 0x1

    .line 1626
    :goto_4
    invoke-virtual {p0, p2, v3, v2}, Ll/ۡܳ۠;->֫(Ljava/util/LinkedHashMap;Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V

    if-nez v2, :cond_7

    .line 1628
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    move v3, v5

    :goto_5
    const/4 v2, 0x0

    goto :goto_3

    .line 1621
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1612
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    const/4 p1, 0x1

    .line 1638
    new-instance v2, Ll/ۘܳ۠;

    invoke-direct {v2, v6}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object v2, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    .line 1639
    new-instance v2, Ll/ۢܳ۠;

    invoke-direct {v2, p0}, Ll/ۢܳ۠;-><init>(Ll/ۡܳ۠;)V

    invoke-static {p2, v2}, Ll/ܰ۬ᩴ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    if-eqz v4, :cond_b

    const/4 v1, 0x0

    .line 1634
    :cond_b
    iput-object v1, p0, Ll/ۡܳ۠;->ܳ:Ljava/util/List;

    goto :goto_6

    :cond_c
    const/4 p1, 0x1

    .line 1562
    :goto_6
    new-instance p2, Ll/ۜܳ۠;

    invoke-direct {p2, p0}, Ll/ۜܳ۠;-><init>(Ll/ۡܳ۠;)V

    invoke-static {v0, p2}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Z
    .locals 1

    .line 1828
    iget-object v0, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩷۠ᩴ;)Ll/֫᩶۠;
    .locals 1

    .line 1815
    iget-object v0, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Ljava/lang/Iterable;
    .locals 1

    .line 1820
    iget-object v0, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    if-nez v0, :cond_0

    .line 1821
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0

    .line 1823
    :cond_0
    invoke-virtual {v0}, Ll/ۘܳ۠;->ᩳ()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/util/Collection;
    .locals 2

    .line 1755
    iget-object v0, p0, Ll/ۡܳ۠;->ܳ:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    .line 1758
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "paths not available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 1750
    iget-object v0, p0, Ll/ۡܳ۠;->ܿ:Ll/ۘܳ۠;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
