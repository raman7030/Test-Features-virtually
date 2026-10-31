.class public Ll/ܺܰܳ;
.super Ll/᩹ܶۢ;
.source "A1YB"


# static fields
.field public static final synthetic ᩶֫:I


# instance fields
.field public ֡֫:Ljava/util/HashSet;

.field public ֨֫:Ll/ܿ᩵ܿ;

.field public ۘ֫:Ll/ۙۤܳ;

.field public ۚ֫:Ljava/util/HashSet;

.field public final ۠֫:Ljava/util/HashSet;

.field public ܶ֫:Z

.field public ᩴ֫:Z

.field public ᩵֫:Ljava/lang/String;

.field public ᩸֫:Z

.field public ᩹֫:Ll/ܽ֫᩻;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 150
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    .line 151
    new-instance v0, Ll/ܿ᩵ܿ;

    invoke-direct {v0}, Ll/ܿ᩵ܿ;-><init>()V

    iput-object v0, p0, Ll/ܺܰܳ;->֨֫:Ll/ܿ᩵ܿ;

    .line 152
    new-instance v0, Ll/ۙۤܳ;

    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Ll/ۙۤܳ;-><init>(Z)V

    .line 152
    iput-object v0, p0, Ll/ܺܰܳ;->ۘ֫:Ll/ۙۤܳ;

    .line 153
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܺܰܳ;->ۚ֫:Ljava/util/HashSet;

    .line 47
    new-instance v0, Ll/ܽ֫᩻;

    invoke-direct {v0}, Ll/ܽ֫᩻;-><init>()V

    .line 158
    iput-object v0, p0, Ll/ܺܰܳ;->᩹֫:Ll/ܽ֫᩻;

    .line 996
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܺܰܳ;->֡֫:Ljava/util/HashSet;

    .line 997
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܺܰܳ;->۠֫:Ljava/util/HashSet;

    return-void
.end method

.method private ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)I
    .locals 7

    .line 882
    iget-object v0, p0, Ll/ܺܰܳ;->᩹֫:Ll/ܽ֫᩻;

    invoke-virtual {v0, p1}, Ll/ܽ֫᩻;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v6

    .line 884
    iget-object v0, p0, Ll/ܺܰܳ;->ۘ֫:Ll/ۙۤܳ;

    invoke-virtual {v0, v6}, Ll/ۙۤܳ;->֫(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 886
    invoke-static {p3, p4, p5, p6}, Ll/᩹۬ܳ;->֫(JJ)Ll/᩹۬ܳ;

    move-result-object v3

    .line 887
    invoke-static {p1}, Ll/᩹۬ܳ;->֫(Ll/ܶ᩵ܿ;)Ll/᩹۬ܳ;

    move-result-object v4

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v5

    move-object v1, v0

    move-object v2, p2

    .line 885
    invoke-virtual/range {v1 .. v6}, Ll/ۙۤܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I

    move-result p1

    goto :goto_0

    .line 890
    :cond_0
    sget-object v4, Ll/᩹۬ܳ;->ܽ:Ll/᩹۬ܳ;

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p2

    move-object v3, v4

    invoke-virtual/range {v1 .. v6}, Ll/ۙۤܳ;->֫(Ljava/lang/String;Ll/᩹۬ܳ;Ll/᩹۬ܳ;ZZ)I

    move-result p1

    .line 893
    :goto_0
    invoke-virtual {v0}, Ll/ۙۤܳ;->᩻()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 894
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->cancel()V

    :cond_1
    return p1
.end method

.method public static bridge synthetic ֫(Ll/ܺܰܳ;Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)I
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p6}, Ll/ܺܰܳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)I

    move-result p0

    return p0
.end method

.method private ֫(Ll/ܶ᩵ܿ;ILjava/util/ArrayList;Ll/֡ۨܳ;)V
    .locals 6

    .line 921
    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const v0, 0x7f12037a

    .line 924
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 925
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢܰܳ;

    .line 301
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-nez v2, :cond_1

    .line 946
    iget-object v2, v1, Ll/ۢܰܳ;->ۧ:Ljava/lang/String;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 947
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۢܰܳ;

    if-eq v5, v1, :cond_2

    .line 948
    iget-object v5, v5, Ll/ۢܰܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    .line 929
    :cond_3
    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 930
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    .line 933
    :cond_4
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 934
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-direct {p0, v4}, Ll/ܺܰܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 935
    iget-object v4, v1, Ll/ۢܰܳ;->ܽ:Ljava/lang/String;

    .line 936
    invoke-virtual {p4, v2, v4}, Ll/֡ۨܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 935
    invoke-virtual {v3, v2}, Ll/ܶ᩵ܿ;->ܽ(Ljava/lang/String;)V

    .line 937
    iget-boolean v1, v1, Ll/ۢܰܳ;->֫:Z

    if-nez v1, :cond_5

    .line 938
    sget v1, Ll/ܳۤܳ;->֫:I

    .line 213
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 217
    invoke-static {v1, v2}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 940
    :cond_5
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/ܺܰܳ;->᩸(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    :goto_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺܰܳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺܰܳ;->᩸(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺܰܳ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺܰܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public static ֫(Ll/ܺܰܳ;Ll/ܶ᩵ܿ;ILnet/sf/sevenzipjbinding/IInArchive;Ll/ܶ᩵ܿ;[Ljava/lang/String;[Ll/ۢܰܳ;)V
    .locals 18

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move-object/from16 v14, p6

    .line 727
    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v15

    .line 728
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    .line 729
    new-instance v11, Ll/֡ۨܳ;

    invoke-direct {v11}, Ll/֡ۨܳ;-><init>()V

    .line 730
    new-instance v10, Ll/᩷ܰܳ;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, v16

    move-object/from16 v6, p6

    move-object/from16 v7, p5

    move-object/from16 v8, p1

    move v9, v15

    move-object v14, v10

    move-object v10, v11

    move-object/from16 v17, v11

    move/from16 v11, p2

    invoke-direct/range {v0 .. v11}, Ll/᩷ܰܳ;-><init>(Ll/ܺܰܳ;Ll/ܺܰܳ;Lnet/sf/sevenzipjbinding/IInArchive;Ll/ܶ᩵ܿ;Ljava/util/ArrayList;[Ll/ۢܰܳ;[Ljava/lang/String;Ll/ܶ᩵ܿ;ZLl/֡ۨܳ;I)V

    const/4 v0, 0x0

    invoke-static {v0, v0, v14}, Ll/ᩳ᩻ᩳ;->֫(Ll/ۗܺ᩷;[ILl/ܰܳᩳ;)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const v0, 0x7f12037a

    .line 860
    invoke-virtual {v12, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 861
    new-instance v0, Ll/᩵ۛۡ;

    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v1, v1

    invoke-direct {v0, v1, v2}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance v1, Ll/᩵֫᩻;

    invoke-direct {v1, v12}, Ll/᩵֫᩻;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 862
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘܳᩳ;

    const/4 v3, 0x1

    .line 41
    invoke-virtual {v0, v3}, Ll/᩵ۛۡ;->֫(I)Z

    .line 864
    invoke-virtual {v2}, Ll/ۘܳᩳ;->ܽ()I

    move-result v3

    aget-object v3, p5, v3

    .line 865
    invoke-virtual {v12, v3}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 866
    invoke-virtual {v13, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 867
    invoke-direct {v12, v4}, Ll/ܺܰܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 868
    invoke-virtual {v2}, Ll/ۘܳᩳ;->᩷()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-ltz v9, :cond_1

    if-eqz v15, :cond_1

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 869
    invoke-virtual {v2}, Ll/ۘܳᩳ;->᩷()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ll/ܶ᩵ܿ;->֫(J)Z

    .line 871
    :cond_1
    invoke-direct {v12, v3}, Ll/ܺܰܳ;->᩸(Ljava/lang/String;)V

    goto :goto_0

    .line 905
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p6

    .line 906
    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    if-eqz v4, :cond_3

    .line 908
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    move/from16 v3, p2

    move-object/from16 v4, v17

    .line 911
    invoke-direct {v12, v13, v3, v0, v4}, Ll/ܺܰܳ;->֫(Ll/ܶ᩵ܿ;ILjava/util/ArrayList;Ll/֡ۨܳ;)V

    return-void
.end method

.method private ۧ(Ll/ܶ᩵ܿ;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 1019
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܺܰܳ;->֡֫:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1021
    :cond_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1022
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۙ()Z

    .line 1023
    :cond_2
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1024
    :cond_3
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 1025
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_4
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܺܰܳ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺܰܳ;->ܽ(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method private ܽ(Ll/ܶ᩵ܿ;)V
    .locals 3

    .line 1003
    iget-object v0, p0, Ll/ܺܰܳ;->۠֫:Ljava/util/HashSet;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1007
    :cond_0
    :try_start_0
    sget-object v0, Ll/ܽ֨ۢ;->ۙ:Ll/ܽ֨ۢ;

    invoke-static {p1, v0}, Ll/ᩳ֨ۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1011
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 1012
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot create extract directory: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/ۘ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 1012
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 1009
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private ᩸(Ljava/lang/String;)V
    .locals 3

    const/16 v0, 0x2f

    .line 964
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    .line 965
    iget-object v2, p0, Ll/ܺܰܳ;->ۚ֫:Ljava/util/HashSet;

    if-ne v0, v1, :cond_0

    .line 966
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 968
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 974
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 975
    iget-boolean p1, p0, Ll/ܺܰܳ;->ᩴ֫:Z

    iget-object p4, p0, Ll/ܺܰܳ;->ۚ֫:Ljava/util/HashSet;

    if-eqz p1, :cond_0

    .line 976
    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 977
    invoke-virtual {p3}, Ll/ܽۢܳ;->ܳ()V

    .line 978
    invoke-virtual {p3, p4}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 979
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    return-void

    .line 982
    :cond_0
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 983
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 984
    invoke-virtual {p2, p4}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 985
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 3

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 168
    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 169
    aget-object v0, v0, v1

    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2b

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "extractDir"

    .line 171
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۚ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2a

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 162
    sget-object v0, Ll/᩻ܶۢ;->֡:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 47

    move-object/from16 v10, p0

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {v10, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 47
    new-instance v1, Ll/ܽ֫᩻;

    invoke-direct {v1}, Ll/ܽ֫᩻;-><init>()V

    .line 48
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    new-array v6, v3, [Ljava/lang/String;

    .line 49
    invoke-static {v5, v6}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 186
    :cond_0
    iput-object v1, v10, Ll/ܺܰܳ;->᩹֫:Ll/ܽ֫᩻;

    .line 267
    array-length v1, v0

    new-array v11, v1, [Ll/ۘܺܳ;

    const/4 v1, 0x0

    .line 269
    :goto_1
    array-length v2, v0

    if-ge v1, v2, :cond_3

    .line 270
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    .line 273
    :cond_1
    aget-object v2, v0, v1

    new-array v4, v3, [Ljava/lang/String;

    invoke-static {v2, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 274
    invoke-static {v2}, Ll/᩵ܺܳ;->֫(Ll/ܶ᩵ܿ;)Ll/ۘܺܳ;

    move-result-object v4

    .line 275
    aput-object v4, v11, v1

    .line 276
    sget-object v5, Ll/ۘܺܳ;->ۤ:Ll/ۘܺܳ;

    if-ne v4, v5, :cond_2

    .line 277
    iget-object v4, v10, Ll/ܺܰܳ;->᩹֫:Ll/ܽ֫᩻;

    invoke-static {v2}, Ll/ᩳܰۡ;->֫(Ll/ܶ᩵ܿ;)[B

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;[B)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 188
    :cond_3
    :goto_2
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 189
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_4
    const-string v1, "extractDir"

    .line 191
    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v12

    const-string v1, "separateFolder"

    .line 192
    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v13

    const-string v1, "relativeNameSubStart"

    .line 193
    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ܺ(Ljava/lang/String;)I

    move-result v14

    const-string v1, "extractToAnother"

    .line 194
    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v10, Ll/ܺܰܳ;->ᩴ֫:Z

    const-string v1, "deleteSources"

    .line 195
    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v15

    .line 197
    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    iput-boolean v1, v10, Ll/ܺܰܳ;->᩸֫:Z

    .line 198
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 200
    array-length v8, v0

    const/4 v1, 0x0

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v8, :cond_53

    const-string v6, ")"

    const-string v4, "/"

    const-string v5, "("

    const v1, 0x7f12037a

    if-le v8, v2, :cond_6

    .line 202
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v7, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    .line 204
    :cond_6
    aget-object v1, v0, v7

    .line 205
    new-array v2, v3, [Ljava/lang/String;

    invoke-static {v1, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 206
    aget-object v1, v11, v7

    if-eqz v13, :cond_7

    .line 209
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v12, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    goto :goto_5

    :cond_7
    move-object v2, v12

    .line 213
    :goto_5
    sget-object v16, Ll/֫ܰܳ;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v16, v1

    move-object/from16 v16, v0

    iget-object v0, v10, Ll/ܺܰܳ;->ۘ֫:Ll/ۙۤܳ;

    move-object/from16 v17, v11

    iget-object v11, v10, Ll/ܺܰܳ;->֨֫:Ll/ܿ᩵ܿ;

    move/from16 v18, v8

    const/4 v8, 0x2

    move-object/from16 v19, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_31

    if-eq v1, v8, :cond_18

    const/4 v2, 0x3

    if-eq v1, v2, :cond_9

    .line 233
    invoke-virtual/range {p0 .. p0}, Ll/᩹ܶۢ;->۫֫()V

    if-eqz v15, :cond_8

    move-object v0, v9

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    .line 677
    :goto_6
    new-instance v8, Ll/ۜܰܳ;

    move-object v1, v8

    move-object/from16 v6, v19

    move-object/from16 v2, p0

    move-object v11, v3

    move-object v3, v0

    move-object v4, v6

    move v5, v14

    move-object v6, v11

    invoke-direct/range {v1 .. v6}, Ll/ۜܰܳ;-><init>(Ll/ܺܰܳ;Ljava/util/ArrayList;Ll/ܶ᩵ܿ;ILl/ܶ᩵ܿ;)V

    const/4 v0, 0x0

    invoke-static {v0, v11, v8}, Ll/ۢ᩻ᩳ;->֫(Lbin/mt/plus/Main;Ll/ܶ᩵ܿ;Ll/᩷᩻ᩳ;)V

    goto :goto_7

    :cond_9
    move-object/from16 v6, v19

    if-eqz v15, :cond_a

    .line 227
    new-instance v1, Ll/ۡܰܳ;

    invoke-direct {v1, v3}, Ll/ۡܰܳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    :cond_a
    invoke-virtual/range {p0 .. p0}, Ll/᩹ܶۢ;->۫֫()V

    .line 608
    invoke-direct {v10, v6}, Ll/ܺܰܳ;->ܽ(Ll/ܶ᩵ܿ;)V

    .line 609
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_b

    .line 610
    new-instance v1, Ll/۠۠ܿ;

    invoke-direct {v1}, Ll/۠۠ܿ;-><init>()V

    .line 611
    invoke-virtual {v1, v6}, Ll/۠۠ܿ;->֫(Ll/ܶ᩵ܿ;)V

    .line 612
    invoke-virtual {v1}, Ll/۠۠ܿ;->֫()Z

    move-result v1

    if-nez v1, :cond_b

    .line 613
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->cancel()V

    :goto_7
    move/from16 v19, v7

    goto/16 :goto_a

    .line 617
    :cond_b
    new-instance v4, Ll/ۨۛܳ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Ll/ۨۛܳ;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 618
    invoke-virtual {v4, v1}, Ll/ۨۛܳ;->֫(Z)V

    .line 619
    invoke-virtual {v4}, Ll/ۨۛܳ;->ۘ()Ll/۫ۛܳ;

    move-result-object v5

    .line 620
    invoke-virtual {v5}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 621
    invoke-virtual {v6, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 622
    iget-boolean v3, v10, Ll/ܺܰܳ;->᩸֫:Z

    if-eqz v3, :cond_c

    const v3, 0x7f12037a

    .line 623
    invoke-virtual {v10, v3}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 625
    :cond_c
    invoke-virtual {v10, v2}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 626
    invoke-virtual {v10, v1}, Ll/᩹ܶۢ;->ܺ(I)V

    .line 628
    iput-boolean v1, v10, Ll/ܺܰܳ;->ܶ֫:Z

    .line 630
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_10

    .line 632
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 633
    invoke-virtual {v5}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v19

    invoke-virtual {v5}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v21

    move-object/from16 v1, p0

    move-object v2, v6

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-wide/from16 v4, v19

    move-object/from16 v25, v6

    move/from16 v19, v7

    move-wide/from16 v6, v21

    .line 631
    invoke-direct/range {v1 .. v7}, Ll/ܺܰܳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)I

    move-result v1

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_d

    goto/16 :goto_a

    :cond_d
    if-eqz v1, :cond_f

    const/4 v0, 0x1

    if-eq v1, v0, :cond_16

    if-eq v1, v8, :cond_e

    move-object/from16 v1, v25

    goto :goto_8

    :cond_e
    move-object/from16 v1, v25

    .line 1147
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v6

    goto :goto_9

    :cond_f
    move-object/from16 v1, v25

    const/4 v2, 0x1

    .line 639
    invoke-virtual {v11, v1}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 640
    iput-boolean v2, v10, Ll/ܺܰܳ;->ܶ֫:Z

    .line 641
    invoke-virtual {v0}, Ll/ۙۤܳ;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 642
    invoke-virtual {v1, v10}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܿۖ᩷;)Z

    goto :goto_8

    :cond_10
    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object v1, v6

    move/from16 v19, v7

    :cond_11
    :goto_8
    move-object v6, v1

    .line 652
    :goto_9
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-direct {v10, v0}, Ll/ܺܰܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    move-object/from16 v0, v23

    move-object/from16 v1, v24

    .line 185
    invoke-virtual {v0, v1}, Ll/ۨۛܳ;->֫(Ll/ᩳۜܳ;)Ll/᩵ۤܳ;

    move-result-object v1

    const/4 v0, 0x0

    .line 446
    :try_start_0
    invoke-virtual {v6, v0}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 658
    :try_start_1
    invoke-virtual {v1}, Ll/᩵ۤܳ;->֫()Ll/᩵ۛۡ;

    move-result-object v0

    new-instance v3, Ll/᩵֫᩻;

    invoke-direct {v3, v10}, Ll/᩵֫᩻;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    const/16 v0, 0x400

    new-array v0, v0, [B

    .line 661
    :cond_12
    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_13

    const/4 v4, 0x0

    .line 662
    invoke-virtual {v2, v0, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_12

    .line 667
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    goto :goto_a

    :cond_13
    if-eqz v2, :cond_14

    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_14
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 668
    iget-boolean v0, v10, Ll/ܺܰܳ;->ܶ֫:Z

    if-eqz v0, :cond_15

    .line 669
    invoke-virtual {v11, v6}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 671
    :cond_15
    sget v0, Ll/ܳۤܳ;->֫:I

    .line 213
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    .line 217
    invoke-static {v0, v1}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 672
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ll/ܺܰܳ;->᩸(Ljava/lang/String;)V

    :cond_16
    :goto_a
    move-object/from16 v22, v9

    move-object/from16 v25, v12

    move/from16 v24, v13

    move/from16 v26, v15

    goto/16 :goto_2b

    :catchall_0
    move-exception v0

    move-object v3, v0

    if-eqz v2, :cond_17

    .line 655
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_5
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_17
    :goto_b
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_c

    :catchall_3
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v2

    :cond_18
    move-object/from16 v6, v19

    move/from16 v19, v7

    if-eqz v15, :cond_19

    .line 220
    new-instance v1, Ll/ۡܰܳ;

    invoke-direct {v1, v3}, Ll/ۡܰܳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    :cond_19
    invoke-virtual/range {p0 .. p0}, Ll/᩹ܶۢ;->ۤ֫()V

    .line 487
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v8

    .line 488
    :try_start_7
    new-instance v1, Ll/ܳܰܳ;

    invoke-direct {v1, v10, v8, v3}, Ll/ܳܰܳ;-><init>(Ll/ܺܰܳ;Ljava/io/BufferedInputStream;Ll/ܶ᩵ܿ;)V

    .line 505
    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v20

    .line 506
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 507
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 959
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 960
    invoke-static {v2}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1a

    invoke-static {v2}, Ll/ܿ֡ܿ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1a

    const/4 v2, 0x1

    const/16 v21, 0x1

    goto :goto_d

    :cond_1a
    const/4 v2, 0x0

    const/16 v21, 0x0

    .line 509
    :goto_d
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 510
    new-instance v3, Ll/֡ۨܳ;

    invoke-direct {v3}, Ll/֡ۨܳ;-><init>()V

    .line 511
    new-instance v2, Ll/ܽܰܳ;

    invoke-direct {v2, v1}, Ll/ܽܰܳ;-><init>(Ljava/io/InputStream;)V

    invoke-static {v8, v2}, Ll/۫ܶ᩻;->֫(Ljava/io/BufferedInputStream;Ll/֫ۛ;)Ljava/io/InputStream;

    move-result-object v2

    move-object/from16 v22, v9

    .line 512
    new-instance v9, Ll/۠᩷֡;

    if-nez v2, :cond_1b

    goto :goto_e

    :cond_1b
    move-object v1, v2

    :goto_e
    const/16 v2, 0x2800

    move-object/from16 v23, v3

    const/4 v3, 0x0

    .line 184
    invoke-direct {v9, v1, v2, v3}, Ll/۠᩷֡;-><init>(Ljava/io/InputStream;ILjava/lang/String;)V

    .line 422
    :goto_f
    invoke-virtual {v9}, Ll/۠᩷֡;->ܳ()Ll/֨᩷֡;

    move-result-object v3

    if-eqz v3, :cond_2e

    if-eqz v21, :cond_1c

    .line 515
    invoke-virtual {v3}, Ll/֨᩷֡;->᩺()Z

    move-result v1

    if-eqz v1, :cond_1c

    const/4 v1, 0x1

    goto :goto_10

    :cond_1c
    const/4 v1, 0x0

    .line 516
    :goto_10
    invoke-virtual {v3}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_1d

    const/16 v24, 0x0

    move-object/from16 v25, v12

    const/4 v12, 0x0

    goto :goto_11

    .line 517
    :cond_1d
    invoke-virtual {v3}, Ll/֨᩷֡;->᩸()Z

    move-result v24

    move-object/from16 v25, v12

    move/from16 v12, v24

    .line 516
    :goto_11
    invoke-static {v2, v12}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v12

    if-eqz v1, :cond_1e

    .line 518
    new-instance v2, Ll/ۢܰܳ;

    move/from16 v24, v13

    .line 519
    invoke-virtual {v3}, Ll/֨᩷֡;->᩷()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Ll/ܿ֡ܿ;->ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move/from16 v26, v15

    .line 520
    invoke-virtual {v3}, Ll/֨᩷֡;->᩸()Z

    move-result v15

    invoke-direct {v2, v12, v13, v15}, Ll/ۢܰܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_12

    :cond_1e
    move/from16 v24, v13

    move/from16 v26, v15

    const/4 v2, 0x0

    .line 521
    :goto_12
    invoke-direct {v10, v6}, Ll/ܺܰܳ;->ܽ(Ll/ܶ᩵ܿ;)V

    .line 522
    invoke-virtual {v6, v12}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v13

    .line 523
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    move-object/from16 v27, v6

    const/16 v6, 0x1e

    if-lt v15, v6, :cond_21

    if-eqz v1, :cond_1f

    .line 524
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v6

    goto :goto_13

    .line 525
    :cond_1f
    invoke-virtual {v3}, Ll/֨᩷֡;->᩸()Z

    move-result v6

    if-eqz v6, :cond_20

    move-object v6, v13

    goto :goto_13

    :cond_20
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 526
    :goto_13
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_21

    .line 527
    new-instance v15, Ll/۠۠ܿ;

    invoke-direct {v15}, Ll/۠۠ܿ;-><init>()V

    .line 528
    invoke-virtual {v15, v6}, Ll/۠۠ܿ;->֫(Ll/ܶ᩵ܿ;)V

    .line 529
    invoke-virtual {v15}, Ll/۠۠ܿ;->֫()Z

    move-result v6

    if-nez v6, :cond_21

    .line 530
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->cancel()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 604
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    goto/16 :goto_2b

    .line 535
    :cond_21
    :try_start_8
    iget-boolean v6, v10, Ll/ܺܰܳ;->᩸֫:Z

    if-eqz v6, :cond_22

    const v6, 0x7f12037a

    .line 536
    invoke-virtual {v10, v6}, Ll/ۘ۠ۢ;->ۡ(I)V

    .line 538
    :cond_22
    invoke-virtual {v10, v12}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    const/4 v6, 0x0

    .line 539
    invoke-virtual {v10, v6}, Ll/᩹ܶۢ;->ܺ(I)V

    if-eqz v1, :cond_23

    .line 541
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    .line 544
    :cond_23
    invoke-virtual {v3}, Ll/֨᩷֡;->᩸()Z

    move-result v1

    if-eqz v1, :cond_25

    .line 545
    invoke-direct {v10, v13}, Ll/ܺܰܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    if-eqz v20, :cond_24

    .line 547
    new-instance v1, Ll/ۧܰܳ;

    invoke-virtual {v3}, Ll/֨᩷֡;->ܺ()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-direct {v1, v13, v2, v3}, Ll/ۧܰܳ;-><init>(Ll/ܶ᩵ܿ;J)V

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 549
    :cond_24
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/ܺܰܳ;->᩸(Ljava/lang/String;)V

    :goto_14
    move-object/from16 v32, v4

    move-object/from16 v34, v5

    move-object/from16 v15, v23

    move-object/from16 v33, v27

    move-object/from16 v27, v7

    move-object/from16 v23, v8

    goto/16 :goto_16

    :cond_25
    const/4 v1, 0x0

    .line 552
    iput-boolean v1, v10, Ll/ܺܰܳ;->ܶ֫:Z

    .line 554
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_29

    .line 556
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 557
    invoke-virtual {v3}, Ll/֨᩷֡;->֡()J

    move-result-wide v28

    invoke-virtual {v3}, Ll/֨᩷֡;->ܺ()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v30
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-object/from16 v1, p0

    move-object v2, v13

    move-object/from16 v15, v23

    move-object/from16 v23, v8

    move-object v8, v3

    move-object v3, v6

    move-object/from16 v32, v4

    move-object v6, v5

    move-wide/from16 v4, v28

    move-object/from16 v34, v6

    move-object/from16 v33, v27

    move-object/from16 v27, v7

    move-wide/from16 v6, v30

    .line 555
    :try_start_9
    invoke-direct/range {v1 .. v7}, Ll/ܺܰܳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)I

    move-result v1

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_26

    goto/16 :goto_18

    :cond_26
    if-eqz v1, :cond_28

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2d

    const/4 v3, 0x2

    if-eq v1, v3, :cond_27

    goto :goto_15

    .line 1147
    :cond_27
    invoke-virtual {v13, v2}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v13

    goto :goto_15

    :cond_28
    const/4 v1, 0x1

    .line 563
    invoke-virtual {v11, v13}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 564
    iput-boolean v1, v10, Ll/ܺܰܳ;->ܶ֫:Z

    .line 565
    invoke-virtual {v0}, Ll/ۙۤܳ;->ܶ()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v1

    if-eqz v1, :cond_2a

    .line 566
    invoke-virtual {v13, v10}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܿۖ᩷;)Z

    goto :goto_15

    :cond_29
    move-object/from16 v32, v4

    move-object/from16 v34, v5

    move-object/from16 v15, v23

    move-object/from16 v33, v27

    move-object/from16 v27, v7

    move-object/from16 v23, v8

    move-object v8, v3

    .line 576
    :cond_2a
    :goto_15
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/ܺܰܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    .line 577
    new-instance v1, Ll/᩻ܰܳ;

    invoke-direct {v1, v10}, Ll/᩻ܰܳ;-><init>(Ll/ܺܰܳ;)V

    invoke-static {v9, v8, v13, v1}, Ll/۫ܶ᩻;->֫(Ll/۠᩷֡;Ll/֨᩷֡;Ll/ܶ᩵ܿ;Ll/۬ܶ᩻;)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_2b

    goto/16 :goto_18

    .line 590
    :cond_2b
    iget-boolean v1, v10, Ll/ܺܰܳ;->ܶ֫:Z

    if-eqz v1, :cond_2c

    .line 591
    invoke-virtual {v11, v13}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    .line 593
    :cond_2c
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v12, v1}, Ll/֡ۨܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    sget v1, Ll/ܳۤܳ;->֫:I

    .line 213
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 217
    invoke-static {v1, v2}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 595
    invoke-virtual {v13}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/ܺܰܳ;->᩸(Ljava/lang/String;)V

    :cond_2d
    :goto_16
    move-object/from16 v8, v23

    move/from16 v13, v24

    move-object/from16 v12, v25

    move-object/from16 v7, v27

    move-object/from16 v4, v32

    move-object/from16 v6, v33

    move-object/from16 v5, v34

    move-object/from16 v23, v15

    move/from16 v15, v26

    goto/16 :goto_f

    :cond_2e
    move-object/from16 v34, v5

    move-object/from16 v27, v7

    move-object/from16 v25, v12

    move/from16 v24, v13

    move/from16 v26, v15

    move-object/from16 v15, v23

    move-object v12, v6

    move-object/from16 v23, v8

    .line 598
    invoke-direct {v10, v12}, Ll/ܺܰܳ;->ܽ(Ll/ܶ᩵ܿ;)V

    .line 599
    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2f
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_30

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧܰܳ;

    .line 1057
    iget-object v2, v1, Ll/ۧܰܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v3

    if-eqz v3, :cond_2f

    .line 1058
    iget-wide v3, v1, Ll/ۧܰܳ;->ۧ:J

    invoke-virtual {v2, v3, v4}, Ll/ܶ᩵ܿ;->֫(J)Z

    goto :goto_17

    :cond_30
    move-object/from16 v0, v34

    .line 602
    invoke-direct {v10, v12, v14, v0, v15}, Ll/ܺܰܳ;->֫(Ll/ܶ᩵ܿ;ILjava/util/ArrayList;Ll/֡ۨܳ;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 604
    :goto_18
    invoke-virtual/range {v23 .. v23}, Ljava/io/InputStream;->close()V

    goto/16 :goto_2b

    :catchall_4
    move-exception v0

    goto :goto_19

    :catchall_5
    move-exception v0

    move-object/from16 v23, v8

    :goto_19
    move-object v1, v0

    .line 487
    :try_start_a
    invoke-virtual/range {v23 .. v23}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    goto :goto_1a

    :catchall_6
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1a
    throw v1

    :cond_31
    move-object/from16 v22, v9

    move-object/from16 v25, v12

    move/from16 v24, v13

    move/from16 v26, v15

    move-object/from16 v12, v19

    move/from16 v19, v7

    .line 215
    invoke-virtual/range {p0 .. p0}, Ll/᩹ܶۢ;->ۤ֫()V

    if-eqz v26, :cond_32

    move-object/from16 v1, v22

    goto :goto_1b

    :cond_32
    const/4 v1, 0x0

    .line 299
    :goto_1b
    new-instance v15, Ll/ᩳܰۡ;

    invoke-direct {v15, v3}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 301
    :try_start_b
    invoke-virtual {v15}, Ll/ᩳܰۡ;->֡()[B

    move-result-object v2

    .line 302
    iget-object v7, v10, Ll/ܺܰܳ;->᩹֫:Ll/ܽ֫᩻;

    invoke-virtual {v7, v3, v2}, Ll/ܽ֫᩻;->֫(Ll/ܶ᩵ܿ;[B)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    if-eqz v1, :cond_34

    if-nez v2, :cond_33

    .line 305
    :try_start_c
    new-instance v2, Ll/ۡܰܳ;

    invoke-direct {v2, v3}, Ll/ۡܰܳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    .line 307
    :cond_33
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 308
    new-instance v8, Ll/۬ۜܽ;

    invoke-direct {v8, v2}, Ll/۬ۜܽ;-><init>([B)V

    .line 309
    invoke-virtual {v8}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    const/4 v9, 0x0

    :goto_1c
    if-ge v9, v2, :cond_34

    .line 311
    invoke-virtual {v8}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v13}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v13

    move/from16 v21, v2

    .line 312
    new-instance v2, Ll/ۡܰܳ;

    invoke-direct {v2, v13}, Ll/ۡܰܳ;-><init>(Ll/ܶ᩵ܿ;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 v2, 0x8

    .line 313
    invoke-virtual {v8, v2}, Ll/۬ۜܽ;->skipBytes(I)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    add-int/lit8 v9, v9, 0x1

    move/from16 v2, v21

    goto :goto_1c

    :catchall_7
    move-exception v0

    goto/16 :goto_22

    .line 317
    :cond_34
    :goto_1d
    :try_start_d
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܺܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 318
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    if-nez v2, :cond_35

    .line 319
    :try_start_e
    invoke-virtual {v15, v1}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    goto :goto_1e

    .line 320
    :cond_35
    :try_start_f
    iget-object v1, v10, Ll/ܺܰܳ;->᩵֫:Ljava/lang/String;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    if-eqz v1, :cond_36

    .line 321
    :try_start_10
    invoke-virtual {v15, v1}, Ll/ᩳܰۡ;->֫(Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 323
    :cond_36
    :goto_1e
    :try_start_11
    invoke-virtual {v15}, Ll/ᩳܰۡ;->ۖ()Ljava/util/ArrayList;

    move-result-object v1

    .line 324
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    if-eqz v7, :cond_37

    :try_start_12
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩺ۡ;

    .line 325
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v7

    invoke-static {v8, v7}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    goto :goto_1f

    .line 327
    :cond_37
    :try_start_13
    invoke-direct {v10, v12}, Ll/ܺܰܳ;->ܽ(Ll/ܶ᩵ܿ;)V

    .line 328
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    const/16 v7, 0x1e

    if-lt v2, v7, :cond_3a

    .line 329
    :try_start_14
    new-instance v2, Ll/۠۠ܿ;

    invoke-direct {v2}, Ll/۠۠ܿ;-><init>()V

    .line 330
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_39

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۗ᩺ۡ;

    .line 331
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v13

    invoke-static {v9, v13}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 332
    invoke-virtual {v12, v9}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 333
    invoke-virtual {v8}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_38

    .line 334
    invoke-virtual {v2, v9}, Ll/۠۠ܿ;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_20

    .line 336
    :cond_38
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v8

    invoke-virtual {v2, v8}, Ll/۠۠ܿ;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_20

    .line 339
    :cond_39
    invoke-virtual {v2}, Ll/۠۠ܿ;->֫()Z

    move-result v2

    if-nez v2, :cond_3a

    .line 340
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->cancel()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 483
    invoke-virtual {v15}, Ll/ᩳܰۡ;->close()V

    goto/16 :goto_2b

    .line 346
    :cond_3a
    :try_start_15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide/16 v8, 0x0

    :cond_3b
    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    if-eqz v7, :cond_3c

    :try_start_16
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩺ۡ;

    .line 347
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v13

    if-nez v13, :cond_3b

    .line 348
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v29
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    add-long v8, v8, v29

    goto :goto_21

    :goto_22
    move-object v1, v0

    move-object/from16 v34, v15

    goto/16 :goto_2f

    .line 354
    :cond_3c
    :try_start_17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v13

    .line 355
    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v21

    .line 356
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 357
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v23

    const/4 v1, 0x0

    move-object/from16 v27, v3

    const-wide/16 v2, 0x0

    :goto_23
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    if-eqz v28, :cond_49

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v28

    move-object/from16 v33, v28

    check-cast v33, Ll/ۗ᩺ۡ;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    move-object/from16 v34, v15

    .line 358
    :try_start_18
    invoke-virtual/range {v33 .. v33}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v35, v0

    invoke-virtual/range {v33 .. v33}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v0

    invoke-static {v15, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v15, v1, 0x1

    .line 362
    iget-boolean v1, v10, Ll/ܺܰܳ;->᩸֫:Z

    if-eqz v1, :cond_3d

    .line 363
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v36, v11

    const v20, 0x7f12037a

    invoke-static/range {v20 .. v20}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ܶ(Ljava/lang/String;)V

    goto :goto_24

    :cond_3d
    move-object/from16 v36, v11

    const v20, 0x7f12037a

    .line 365
    :goto_24
    invoke-virtual {v10, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 366
    invoke-virtual {v10, v1}, Ll/᩹ܶۢ;->ܺ(I)V

    .line 367
    invoke-static {v2, v3, v8, v9}, Ll/᩵ۛۡ;->֫(JJ)I

    move-result v1

    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 368
    invoke-virtual {v12, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 369
    invoke-virtual/range {v33 .. v33}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_3f

    .line 370
    invoke-direct {v10, v0}, Ll/ܺܰܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    if-eqz v21, :cond_3e

    .line 372
    new-instance v1, Ll/ۧܰܳ;

    move-wide/from16 v28, v2

    invoke-virtual/range {v33 .. v33}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v2

    invoke-direct {v1, v0, v2, v3}, Ll/ۧܰܳ;-><init>(Ll/ܶ᩵ܿ;J)V

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_3e
    move-wide/from16 v28, v2

    .line 374
    :goto_25
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ll/ܺܰܳ;->᩸(Ljava/lang/String;)V

    move-object/from16 v41, v4

    move-object/from16 v42, v5

    move-object/from16 v43, v6

    move-object/from16 v44, v7

    move-object/from16 v11, v27

    move-wide/from16 v2, v28

    goto :goto_26

    :cond_3f
    move-wide/from16 v28, v2

    const/4 v1, 0x0

    .line 377
    iput-boolean v1, v10, Ll/ܺܰܳ;->ܶ֫:Z

    .line 380
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_44

    .line 382
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 383
    invoke-virtual/range {v33 .. v33}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v30

    invoke-virtual/range {v33 .. v33}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v37

    move-object/from16 v1, p0

    move-wide/from16 v39, v28

    move-object v2, v0

    move-object/from16 v11, v27

    move-object/from16 v41, v4

    move-object/from16 v42, v5

    move-wide/from16 v4, v30

    move-object/from16 v43, v6

    move-object/from16 v44, v7

    move-wide/from16 v6, v37

    .line 381
    invoke-direct/range {v1 .. v7}, Ll/ܺܰܳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;JJ)I

    move-result v1

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_40

    goto/16 :goto_2a

    :cond_40
    if-eqz v1, :cond_43

    const/4 v2, 0x1

    if-eq v1, v2, :cond_42

    const/4 v3, 0x2

    if-eq v1, v3, :cond_41

    goto :goto_27

    .line 1147
    :cond_41
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->֫(Z)Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_27

    .line 396
    :cond_42
    invoke-virtual/range {v33 .. v33}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    add-long v2, v39, v0

    :goto_26
    move-object/from16 v27, v11

    move v1, v15

    move-object/from16 v15, v34

    move-object/from16 v0, v35

    move-object/from16 v11, v36

    move-object/from16 v4, v41

    move-object/from16 v5, v42

    move-object/from16 v6, v43

    move-object/from16 v7, v44

    goto/16 :goto_23

    :cond_43
    move-object/from16 v7, v36

    .line 389
    invoke-virtual {v7, v0}, Ll/ܿ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)V

    const/4 v1, 0x1

    .line 390
    iput-boolean v1, v10, Ll/ܺܰܳ;->ܶ֫:Z

    .line 391
    invoke-virtual/range {v35 .. v35}, Ll/ۙۤܳ;->ܶ()Z

    move-result v1

    if-eqz v1, :cond_45

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۚۧ()Z

    move-result v1

    if-eqz v1, :cond_45

    .line 392
    invoke-virtual {v0, v10}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܿۖ᩷;)Z

    goto :goto_28

    :cond_44
    move-object/from16 v41, v4

    move-object/from16 v42, v5

    move-object/from16 v43, v6

    move-object/from16 v44, v7

    move-object/from16 v11, v27

    move-wide/from16 v39, v28

    :goto_27
    move-object/from16 v7, v36

    .line 403
    :cond_45
    :goto_28
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-direct {v10, v1}, Ll/ܺܰܳ;->ۧ(Ll/ܶ᩵ܿ;)V

    const/4 v1, 0x1

    new-array v5, v1, [Z

    const/4 v1, 0x0

    aput-boolean v1, v5, v1

    .line 405
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v27

    new-instance v32, Ll/ܿܰܳ;

    move-object/from16 v1, v32

    move-object/from16 v2, p0

    move-wide/from16 v3, v39

    move-object/from16 v36, v5

    move-wide v5, v8

    move-object/from16 v37, v12

    move-object v12, v7

    move-object/from16 v7, v34

    move-wide/from16 v45, v8

    move-object/from16 v8, v36

    move-object/from16 v9, v33

    invoke-direct/range {v1 .. v9}, Ll/ܿܰܳ;-><init>(Ll/ܺܰܳ;JJLl/ᩳܰۡ;[ZLl/ۗ᩺ۡ;)V

    const/16 v31, 0x0

    move-object/from16 v28, v34

    move-object/from16 v29, v33

    move-object/from16 v30, v0

    .line 100
    invoke-static/range {v27 .. v32}, Ll/᩹᩶᩻;->֫(Ljava/lang/String;Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/ܶ᩵ܿ;ZLl/ܶ᩶᩻;)V

    .line 301
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_46

    goto/16 :goto_2a

    .line 469
    :cond_46
    iget-boolean v1, v10, Ll/ܺܰܳ;->ܶ֫:Z

    if-eqz v1, :cond_47

    .line 470
    invoke-virtual {v12, v0}, Ll/ܿ᩵ܿ;->ᩳ(Ll/ܶ᩵ܿ;)V

    :cond_47
    const/4 v1, 0x0

    .line 472
    aget-boolean v1, v36, v1

    if-eqz v1, :cond_48

    .line 473
    invoke-virtual {v11}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v34 .. v34}, Ll/ᩳܰۡ;->᩵()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/ۤܺܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    invoke-virtual/range {v34 .. v34}, Ll/ᩳܰۡ;->᩵()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Ll/ܺܰܳ;->᩵֫:Ljava/lang/String;

    .line 476
    :cond_48
    invoke-virtual/range {v33 .. v33}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    add-long v2, v1, v39

    .line 477
    sget v1, Ll/ܳۤܳ;->֫:I

    .line 213
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    .line 217
    invoke-static {v1, v4}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 478
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ll/ܺܰܳ;->᩸(Ljava/lang/String;)V

    move-object/from16 v27, v11

    move-object v11, v12

    move v1, v15

    move-object/from16 v15, v34

    move-object/from16 v0, v35

    move-object/from16 v12, v37

    move-object/from16 v4, v41

    move-object/from16 v5, v42

    move-object/from16 v6, v43

    move-object/from16 v7, v44

    move-wide/from16 v8, v45

    goto/16 :goto_23

    :catchall_8
    move-exception v0

    goto/16 :goto_2e

    :cond_49
    move-object/from16 v44, v7

    move-object/from16 v34, v15

    .line 480
    invoke-virtual/range {v44 .. v44}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4a
    :goto_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧܰܳ;

    .line 1057
    iget-object v2, v1, Ll/ۧܰܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨ۧ()Z

    move-result v3

    if-eqz v3, :cond_4a

    .line 1058
    iget-wide v3, v1, Ll/ۧܰܳ;->ۧ:J

    invoke-virtual {v2, v3, v4}, Ll/ܶ᩵ܿ;->֫(J)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_8

    goto :goto_29

    .line 483
    :cond_4b
    :goto_2a
    invoke-virtual/range {v34 .. v34}, Ll/ᩳܰۡ;->close()V

    .line 237
    :goto_2b
    invoke-virtual/range {p0 .. p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_4c

    .line 238
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_4c
    if-eqz v26, :cond_52

    .line 240
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_52

    .line 241
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_4d

    const/4 v0, 0x1

    goto :goto_2c

    :cond_4d
    const/4 v0, 0x0

    :goto_2c
    if-eqz v0, :cond_4e

    const v1, 0x7f12087d

    .line 244
    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ۡ(I)V

    const/4 v1, 0x0

    .line 245
    invoke-virtual {v10, v1}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 246
    invoke-virtual {v10, v1}, Ll/᩹ܶۢ;->ܺ(I)V

    .line 248
    :cond_4e
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4f
    :goto_2d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_51

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡܰܳ;

    if-eqz v0, :cond_50

    .line 250
    iget-object v3, v2, Ll/ۡܰܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 293
    :cond_50
    iget-object v3, v2, Ll/ۡܰܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v4

    if-eqz v4, :cond_4f

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v4

    iget-wide v6, v2, Ll/ۡܰܳ;->ۧ:J

    cmp-long v8, v4, v6

    if-nez v8, :cond_4f

    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->۬()Z

    move-result v3

    if-eqz v3, :cond_4f

    .line 253
    iget-object v3, v10, Ll/ܺܰܳ;->᩹֫:Ll/ܽ֫᩻;

    iget-object v2, v2, Ll/ۡܰܳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v3, v2}, Ll/ܽ֫᩻;->ܽ(Ll/ܶ᩵ܿ;)V

    goto :goto_2d

    .line 256
    :cond_51
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->clear()V

    :cond_52
    add-int/lit8 v7, v19, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x1

    move-object/from16 v0, v16

    move-object/from16 v11, v17

    move/from16 v8, v18

    move-object/from16 v9, v22

    move/from16 v13, v24

    move-object/from16 v12, v25

    move/from16 v15, v26

    goto/16 :goto_4

    :catchall_9
    move-exception v0

    move-object/from16 v34, v15

    :goto_2e
    move-object v1, v0

    .line 299
    :goto_2f
    :try_start_19
    invoke-virtual/range {v34 .. v34}, Ll/ᩳܰۡ;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_a

    goto :goto_30

    :catchall_a
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_30
    throw v1

    .line 259
    :cond_53
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 993
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 177
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 178
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
