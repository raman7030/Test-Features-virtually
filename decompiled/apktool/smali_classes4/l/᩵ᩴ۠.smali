.class public final Ll/᩵ᩴ۠;
.super Ljava/lang/Object;
.source "640U"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/᩸᩸۠;

.field public ܽ:Ljava/util/LinkedHashSet;

.field public ܿ:Ljava/util/LinkedHashSet;

.field public ᩳ:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Ll/᩸᩸۠;Ll/᩹ܶ۠;Ll/ܽ֡֨;Ll/֫ᩴ֨;ZLl/ܶ᩸۠;Z)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move/from16 v4, p7

    .line 695
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 696
    iput-object v0, v1, Ll/᩵ᩴ۠;->ۧ:Ll/᩸᩸۠;

    const/4 v5, 0x0

    .line 697
    iput-boolean v5, v1, Ll/᩵ᩴ۠;->֫:Z

    .line 699
    iget-object v6, v3, Ll/֫ᩴ֨;->ܽ:Ll/۟ۘ֨;

    invoke-virtual {v3, v6}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    move-result-object v6

    move-object/from16 v7, p6

    .line 701
    :try_start_0
    invoke-interface {v0, v7}, Ll/᩸᩸۠;->֫(Ll/ܶ᩸۠;)V

    .line 763
    invoke-interface/range {p1 .. p1}, Ll/᩸᩸۠;->ܽ()Ll/ۗ᩸۠;

    move-result-object v7

    .line 764
    invoke-static/range {p3 .. p3}, Ll/ܽ֡֨;->֫(Ll/ܽ֡֨;)Ll/ۗ᩸۠;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v9, 0x2

    const/4 v10, 0x1

    const-string v11, "compiler"

    if-gez v8, :cond_0

    .line 766
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v12, p3

    iget-object v12, v12, Ll/ܽ֡֨;->᩸:Ljava/lang/String;

    .line 765
    sget-object v13, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4868
    new-instance v13, Ll/ۧܶ۠;

    const-string v14, "proc.processor.incompatible.source.version"

    const/4 v15, 0x3

    new-array v15, v15, [Ljava/lang/Object;

    aput-object v7, v15, v5

    aput-object v8, v15, v10

    aput-object v12, v15, v9

    invoke-direct {v13, v11, v14, v15}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 765
    invoke-virtual {v2, v13}, Ll/ۖ֨۠;->֫(Ll/ۧܶ۠;)V

    .line 710
    :cond_0
    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v5, v1, Ll/᩵ᩴ۠;->ᩳ:Ljava/util/LinkedHashSet;

    .line 711
    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v5, v1, Ll/᩵ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    .line 712
    invoke-interface/range {p1 .. p1}, Ll/᩸᩸۠;->ۧ()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 713
    iget-object v8, v1, Ll/᩵ᩴ۠;->ᩳ:Ljava/util/LinkedHashSet;

    invoke-interface {v8, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v8

    .line 715
    iget-object v12, v1, Ll/᩵ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    iget-object v13, v1, Ll/᩵ᩴ۠;->ۧ:Ll/᩸᩸۠;

    move/from16 v14, p5

    .line 716
    invoke-static {v14, v7, v13, v2, v4}, Ll/֨ᩴ۠;->֫(ZLjava/lang/String;Ll/᩸᩸۠;Ll/᩹ܶ۠;Z)Ljava/util/regex/Pattern;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-eqz v4, :cond_1

    if-nez v8, :cond_1

    .line 720
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    .line 719
    sget-object v12, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4806
    new-instance v12, Ll/ۧܶ۠;

    const-string v13, "proc.duplicate.supported.annotation"

    const/4 v15, 0x0

    new-array v10, v9, [Ljava/lang/Object;

    aput-object v7, v10, v15

    const/4 v7, 0x1

    aput-object v8, v10, v7

    invoke-direct {v12, v11, v13, v10}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    invoke-virtual {v2, v12}, Ll/ۖ֨۠;->֫(Ll/ۧܶ۠;)V

    :cond_1
    const/4 v10, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 730
    iget-object v7, v1, Ll/᩵ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    const-string v8, "*"

    .line 731
    invoke-static {v8}, Ll/ۗܶ۠;->֫(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, v1, Ll/᩵ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    .line 732
    invoke-interface {v7}, Ljava/util/Set;->size()I

    move-result v7

    const/4 v8, 0x1

    if-le v7, v8, :cond_3

    .line 733
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    sget-object v10, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4876
    new-instance v10, Ll/ۧܶ۠;

    const-string v12, "proc.redundant.types.with.wildcard"

    new-array v13, v8, [Ljava/lang/Object;

    aput-object v7, v13, v5

    invoke-direct {v10, v11, v12, v13}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    invoke-virtual {v2, v10}, Ll/ۖ֨۠;->֫(Ll/ۧܶ۠;)V

    .line 736
    :cond_3
    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v7, v1, Ll/᩵ᩴ۠;->ܿ:Ljava/util/LinkedHashSet;

    .line 737
    iget-object v7, v1, Ll/᩵ᩴ۠;->ۧ:Ll/᩸᩸۠;

    invoke-interface {v7}, Ll/᩸᩸۠;->֫()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 738
    invoke-direct {v1, v8, v2}, Ll/᩵ᩴ۠;->֫(Ljava/lang/String;Ll/᩹ܶ۠;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 739
    iget-object v10, v1, Ll/᩵ᩴ۠;->ܿ:Ljava/util/LinkedHashSet;

    invoke-interface {v10, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v4, :cond_4

    if-nez v10, :cond_4

    .line 742
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    .line 741
    sget-object v12, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4798
    new-instance v12, Ll/ۧܶ۠;

    const-string v13, "proc.duplicate.option.name"

    new-array v14, v9, [Ljava/lang/Object;

    aput-object v8, v14, v5

    const/4 v8, 0x1

    aput-object v10, v14, v8

    invoke-direct {v12, v11, v13, v14}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    invoke-virtual {v2, v12}, Ll/ۖ֨۠;->֫(Ll/ۧܶ۠;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 752
    :cond_5
    invoke-virtual {v3, v6}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    return-void

    :catchall_0
    move-exception v0

    .line 750
    :try_start_2
    new-instance v2, Ll/ۧᩴ۠;

    .line 40
    invoke-direct {v2, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    .line 750
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    .line 752
    invoke-virtual {v3, v6}, Ll/֫ᩴ֨;->֫(Ll/۟ۘ֨;)Ll/۟ۘ֨;

    .line 753
    throw v0
.end method

.method private ֫(Ljava/lang/String;Ll/᩹ܶ۠;)Z
    .locals 6

    .line 772
    sget-object v0, Ll/֨ᩴ۠;->᩸֫:Ljava/util/regex/Pattern;

    const-string v0, "\\."

    const/4 v1, -0x1

    .line 1811
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    aget-object v5, v0, v3

    .line 1812
    invoke-static {v5}, Ll/ۗ᩸۠;->֫(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    .line 774
    iget-object v1, p0, Ll/᩵ᩴ۠;->ۧ:Ll/᩸᩸۠;

    .line 775
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 774
    sget-object v3, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3296
    new-instance v3, Ll/۫۠۠;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v2

    aput-object v1, v5, v4

    const-string p1, "compiler"

    const-string v1, "proc.processor.bad.option.name"

    invoke-direct {v3, p1, v1, v5}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    invoke-virtual {p2, v3}, Ll/ۖ֨۠;->֫(Ll/۫۠۠;)V

    :cond_2
    return v0
.end method


# virtual methods
.method public final ֫(Ljava/util/HashSet;)V
    .locals 1

    .line 791
    iget-object v0, p0, Ll/᩵ᩴ۠;->ܿ:Ljava/util/LinkedHashSet;

    invoke-interface {p1, v0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 2

    .line 780
    iget-object v0, p0, Ll/᩵ᩴ۠;->ܽ:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/regex/Pattern;

    .line 781
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
