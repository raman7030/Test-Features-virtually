.class public final Ll/֡ܶۡ;
.super Ljava/lang/Object;
.source "41XE"


# instance fields
.field public ֫:Ljava/util/List;

.field public ۧ:[Ljava/lang/String;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 735
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 736
    iput-object p1, p0, Ll/֡ܶۡ;->ܽ:Ljava/lang/String;

    .line 737
    iput-object p2, p0, Ll/֡ܶۡ;->ۧ:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/۬ۛ֡;)Z
    .locals 9

    .line 798
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 799
    invoke-virtual {p0}, Ll/۬ۛ֡;->ۧ()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ll/ᩴ۟֡;

    invoke-virtual {p0}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ۛ֡;

    .line 800
    invoke-virtual {v1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 803
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ۛ֡;

    .line 804
    invoke-static {v0, v1}, Ll/ۚܶۡ;->֫(Ljava/util/HashMap;Ll/۠ۛ֡;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    .line 476
    invoke-virtual {v1, v3}, Ll/۠ۛ֡;->ܳ(Z)Ljava/lang/Iterable;

    move-result-object v1

    .line 806
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۨ֡;

    .line 807
    invoke-virtual {v5}, Ll/ܽۨ֡;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "on"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 808
    sget-object v6, Ll/ܺۗ֡;->ۧ֫:Ll/ܺۗ֡;

    iget v7, v5, Ll/ܽۨ֡;->᩸:I

    invoke-virtual {v6, v7}, Ll/ܺۗ֡;->֫(I)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 809
    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Native: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    if-le v2, v4, :cond_1

    return v3

    :cond_5
    return v2
.end method

.method public static ۧ(Ll/۬ۛ֡;)Z
    .locals 10

    .line 761
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 762
    invoke-virtual {p0}, Ll/۬ۛ֡;->ۧ()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ll/ᩴ۟֡;

    invoke-virtual {p0}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ۛ֡;

    .line 763
    invoke-virtual {v1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 766
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ۛ֡;

    .line 767
    invoke-static {v0, v1}, Ll/ۚܶۡ;->֫(Ljava/util/HashMap;Ll/۠ۛ֡;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    .line 476
    invoke-virtual {v1, v2}, Ll/۠ۛ֡;->ܳ(Z)Ljava/lang/Iterable;

    move-result-object v1

    .line 769
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۨ֡;

    .line 770
    invoke-virtual {v5}, Ll/ܽۨ֡;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "on"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ll/ܽۨ֡;->᩷ۧ()Ll/᩷ۨ֡;

    move-result-object v6

    if-eqz v6, :cond_2

    .line 773
    :try_start_0
    invoke-virtual {v5}, Ll/ܽۨ֡;->᩷ۧ()Ll/᩷ۨ֡;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۨ֡;->᩷()Ljava/lang/Iterable;

    move-result-object v5

    check-cast v5, Ll/ܿۨ֡;

    invoke-virtual {v5}, Ll/ܿۨ֡;->iterator()Ljava/util/Iterator;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_2
    :try_start_1
    move-object v8, v5

    check-cast v8, Ll/֨᩶ܺ;

    invoke-virtual {v8}, Ll/֨᩶ܺ;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v8}, Ll/֨᩶ܺ;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩺֫ۚ;

    .line 774
    invoke-interface {v8}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v8

    sget-object v9, Ll/֨ۗ֡;->ۖܳ:Ll/֨ۗ֡;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v8, v9, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :catchall_0
    nop

    goto :goto_3

    :catchall_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    :cond_4
    :goto_3
    const/4 v5, 0x2

    if-gt v7, v5, :cond_5

    const/4 v5, 0x5

    if-le v6, v5, :cond_5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    if-le v3, v4, :cond_1

    :cond_7
    return v2
.end method


# virtual methods
.method public final varargs ֫([Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x0

    .line 749
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 750
    aget-object v1, p1, v0

    .line 751
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 752
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 753
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "L"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 754
    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 756
    :cond_1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/֡ܶۡ;->֫:Ljava/util/List;

    return-void
.end method
