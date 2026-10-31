.class public final Ll/᩹۫ᩳ;
.super Ljava/lang/Object;
.source "28WH"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩶:Z

.field public ᩸:I

.field public final synthetic ᩹:Ll/۟۫ᩳ;


# direct methods
.method public constructor <init>(Ll/۟۫ᩳ;Z)V
    .locals 0

    .line 957
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    iput-boolean p2, p0, Ll/᩹۫ᩳ;->᩶:Z

    return-void
.end method

.method private ֫(IILjava/util/List;)V
    .locals 6

    add-int v0, p1, p2

    .line 1008
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1009
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳۘ;

    .line 1010
    iget-boolean v2, p0, Ll/᩹۫ᩳ;->᩶:Z

    invoke-interface {v1, v2}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v3

    .line 1011
    invoke-interface {v1, v2}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v4

    .line 1012
    invoke-interface {v1}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v5

    if-gt p1, v3, :cond_1

    if-lt v0, v4, :cond_1

    .line 1015
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_1
    if-gt v0, v3, :cond_2

    sub-int/2addr v3, p2

    .line 1018
    invoke-interface {v1, v3, v2}, Ll/ᩴܳۘ;->ۧ(IZ)V

    sub-int/2addr v4, p2

    .line 1019
    invoke-interface {v1, v4, v2}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_1

    :cond_2
    if-lt p1, v4, :cond_3

    goto :goto_1

    :cond_3
    if-le p1, v3, :cond_4

    if-ge v0, v4, :cond_4

    sub-int/2addr v4, p2

    .line 1024
    invoke-interface {v1, v4, v2}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    if-eqz v5, :cond_6

    sub-int v2, p1, v3

    .line 1026
    invoke-direct {p0, v2, p2, v5}, Ll/᩹۫ᩳ;->ܽ(IILjava/util/List;)V

    goto :goto_1

    :cond_4
    if-gt p1, v3, :cond_5

    .line 1030
    invoke-interface {v1, p1, v2}, Ll/ᩴܳۘ;->ۧ(IZ)V

    sub-int/2addr v4, p2

    .line 1031
    invoke-interface {v1, v4, v2}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    if-eqz v5, :cond_6

    sub-int/2addr v3, p1

    sub-int v2, p2, v3

    const/4 v3, 0x0

    .line 1033
    invoke-direct {p0, v3, v2, v5}, Ll/᩹۫ᩳ;->ܽ(IILjava/util/List;)V

    goto :goto_1

    .line 1037
    :cond_5
    invoke-interface {v1, p1, v2}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    if-eqz v5, :cond_6

    sub-int v2, p1, v3

    sub-int/2addr v4, p1

    .line 1039
    invoke-direct {p0, v2, v4, v5}, Ll/᩹۫ᩳ;->ܽ(IILjava/util/List;)V

    :cond_6
    :goto_1
    if-eqz v5, :cond_0

    .line 1042
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 1043
    invoke-interface {v1, v2}, Ll/֡ܳۘ;->֫(Ljava/util/List;)V

    goto :goto_0

    :cond_7
    return-void
.end method

.method private ۧ(IILjava/util/List;)V
    .locals 6

    .line 1125
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳۘ;

    .line 1126
    iget-boolean v1, p0, Ll/᩹۫ᩳ;->᩶:Z

    invoke-interface {v0, v1}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v2

    .line 1127
    invoke-interface {v0, v1}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v3

    if-gt p1, v2, :cond_1

    add-int/2addr v2, p2

    .line 1130
    invoke-interface {v0, v2, v1}, Ll/ᩴܳۘ;->ۧ(IZ)V

    add-int/2addr v3, p2

    .line 1131
    invoke-interface {v0, v3, v1}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_0

    :cond_1
    if-lt p1, v3, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v3, p2

    .line 1136
    invoke-interface {v0, v3, v1}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    .line 1137
    invoke-interface {v0}, Ll/֡ܳۘ;->ܳ()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    sub-int v2, p1, v2

    .line 1149
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴܳۘ;

    .line 1150
    invoke-interface {v3, v1}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v4

    .line 1151
    invoke-interface {v3, v1}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v5

    if-ltz v4, :cond_3

    if-gez v5, :cond_4

    goto :goto_1

    :cond_4
    if-gt v2, v4, :cond_5

    add-int/2addr v4, p2

    .line 1157
    invoke-interface {v3, v4, v1}, Ll/ᩴܳۘ;->ۧ(IZ)V

    add-int/2addr v5, p2

    .line 1158
    invoke-interface {v3, v5, v1}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_1

    :cond_5
    if-lt v2, v5, :cond_6

    goto :goto_1

    :cond_6
    add-int/2addr v5, p2

    .line 1163
    invoke-interface {v3, v5, v1}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_1

    :cond_7
    return-void
.end method

.method private ܽ(IILjava/util/List;)V
    .locals 7

    add-int v0, p1, p2

    .line 1051
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    :cond_0
    :goto_0
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_8

    .line 1052
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴܳۘ;

    .line 1053
    iget-boolean v3, p0, Ll/᩹۫ᩳ;->᩶:Z

    invoke-interface {v2, v3}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v4

    .line 1054
    invoke-interface {v2, v3}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v5

    if-ltz v4, :cond_0

    if-gez v5, :cond_1

    goto :goto_0

    :cond_1
    if-gt v0, v4, :cond_2

    sub-int/2addr v4, p2

    .line 1060
    invoke-interface {v2, v4, v3}, Ll/ᩴܳۘ;->ۧ(IZ)V

    sub-int/2addr v5, p2

    .line 1061
    invoke-interface {v2, v5, v3}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_0

    :cond_2
    if-lt p1, v5, :cond_3

    goto :goto_0

    :cond_3
    if-gt p1, v4, :cond_5

    if-lt v0, v5, :cond_5

    xor-int/lit8 v4, v3, 0x1

    .line 1066
    invoke-interface {v2, v4}, Ll/ᩴܳۘ;->֫(Z)I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_4

    invoke-interface {v2, v4}, Ll/ᩴܳۘ;->ܽ(Z)I

    move-result v4

    if-ne v4, v6, :cond_4

    .line 1067
    invoke-interface {p3, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 1069
    :cond_4
    invoke-interface {v2, v6, v3}, Ll/ᩴܳۘ;->ۧ(IZ)V

    .line 1070
    invoke-interface {v2, v6, v3}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_0

    :cond_5
    if-le p1, v4, :cond_6

    if-ge v0, v5, :cond_6

    sub-int/2addr v5, p2

    .line 1074
    invoke-interface {v2, v5, v3}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_0

    :cond_6
    if-gt p1, v4, :cond_7

    .line 1077
    invoke-interface {v2, p1, v3}, Ll/ᩴܳۘ;->ۧ(IZ)V

    sub-int/2addr v5, p2

    .line 1078
    invoke-interface {v2, v5, v3}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_0

    .line 1081
    :cond_7
    invoke-interface {v2, p1, v3}, Ll/ᩴܳۘ;->ᩳ(IZ)V

    goto :goto_0

    :cond_8
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 1170
    iget-object p1, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    invoke-virtual {p1}, Ll/۟۫ᩳ;->invalidate()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 7

    .line 962
    iget-object p4, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    invoke-static {p4}, Ll/۟۫ᩳ;->ᩳ(Ll/۟۫ᩳ;)Ljava/util/List;

    move-result-object p4

    if-eqz p4, :cond_6

    .line 963
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    if-nez p3, :cond_1

    goto/16 :goto_2

    .line 969
    :cond_1
    check-cast p1, Ll/᩶᩸ᩳ;

    invoke-interface {p1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object p1

    const/4 v0, 0x1

    if-ne p3, v0, :cond_2

    add-int/lit8 v0, p2, 0x1

    .line 971
    :try_start_0
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, p2}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_2

    invoke-virtual {p1, v0}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_2

    move p2, v0

    .line 976
    :cond_2
    invoke-direct {p0, p2, p3, p4}, Ll/᩹۫ᩳ;->֫(IILjava/util/List;)V

    .line 978
    invoke-virtual {p1, p2}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v0

    iput v0, p0, Ll/᩹۫ᩳ;->᩸:I

    add-int v1, p2, p3

    .line 979
    invoke-virtual {p1, v1}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr v1, v0

    .line 980
    iget-boolean v2, p0, Ll/᩹۫ᩳ;->᩶:Z

    if-lez v1, :cond_5

    .line 981
    :try_start_1
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_5

    .line 982
    invoke-interface {p4, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳۘ;

    .line 983
    invoke-interface {v5, v2}, Ll/֡ܳۘ;->ۧ(Z)I

    move-result v6

    if-le v6, v0, :cond_3

    sub-int/2addr v6, v1

    .line 985
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-interface {v5, v6, v2}, Ll/֡ܳۘ;->ܽ(IZ)V

    .line 987
    :cond_3
    invoke-interface {v5, v2}, Ll/֡ܳۘ;->ᩳ(Z)I

    move-result v6

    if-le v6, v0, :cond_4

    sub-int/2addr v6, v1

    .line 989
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-interface {v5, v6, v2}, Ll/֡ܳۘ;->֫(IZ)V

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 994
    :cond_5
    new-instance v0, Ll/᩷۫ᩳ;

    invoke-direct {v0, p1, p2, p3}, Ll/᩷۫ᩳ;-><init>(Ll/۟᩸ᩳ;II)V

    invoke-static {v2, p4, v0}, Ll/᩵ۤᩳ;->֫(ZLjava/util/List;Ll/᩺۬ۡ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 995
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V

    .line 997
    new-instance p1, Ll/᩸۫ᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-static {p4, p1}, Ll/ۛ۫ۡ;->֫(Ljava/util/List;Ljava/util/function/Predicate;)V

    return-void

    :catchall_0
    move-exception p2

    .line 969
    :try_start_2
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p2

    :cond_6
    :goto_2
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 8

    .line 1088
    iget-object v0, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    invoke-static {v0}, Ll/۟۫ᩳ;->ᩳ(Ll/۟۫ᩳ;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-lez p4, :cond_5

    .line 1092
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 1093
    check-cast p1, Ll/᩶᩸ᩳ;

    invoke-interface {p1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object p1

    .line 1094
    :try_start_0
    invoke-direct {p0, p2, p4, v0}, Ll/᩹۫ᩳ;->ۧ(IILjava/util/List;)V

    if-lez p3, :cond_1

    .line 1095
    iget v1, p0, Ll/᩹۫ᩳ;->᩸:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v1

    :goto_0
    add-int v2, p2, p4

    .line 1096
    invoke-virtual {p1, v2}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v2

    invoke-virtual {p1, p2}, Ll/۟᩸ᩳ;->ۧ(I)I

    move-result v3

    sub-int/2addr v2, v3

    if-lez v2, :cond_4

    .line 1098
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_4

    .line 1099
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳۘ;

    .line 1100
    iget-boolean v6, p0, Ll/᩹۫ᩳ;->᩶:Z

    invoke-interface {v5, v6}, Ll/֡ܳۘ;->ۧ(Z)I

    move-result v6

    if-le v6, v1, :cond_2

    .line 1102
    iget-boolean v7, p0, Ll/᩹۫ᩳ;->᩶:Z

    add-int/2addr v6, v2

    invoke-interface {v5, v6, v7}, Ll/֡ܳۘ;->ܽ(IZ)V

    .line 1104
    :cond_2
    iget-boolean v6, p0, Ll/᩹۫ᩳ;->᩶:Z

    invoke-interface {v5, v6}, Ll/֡ܳۘ;->ᩳ(Z)I

    move-result v6

    if-le v6, v1, :cond_3

    .line 1106
    iget-boolean v7, p0, Ll/᩹۫ᩳ;->᩶:Z

    add-int/2addr v6, v2

    invoke-interface {v5, v6, v7}, Ll/֡ܳۘ;->֫(IZ)V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1110
    :cond_4
    iget-boolean v1, p0, Ll/᩹۫ᩳ;->᩶:Z

    invoke-static {v1, v0, p1}, Ll/᩵ۤᩳ;->֫(ZLjava/util/List;Ll/᩺۬ۡ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1111
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V

    goto :goto_3

    :catchall_0
    move-exception p2

    .line 1093
    :try_start_1
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2

    .line 1113
    :cond_5
    :goto_3
    iget-object p1, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    invoke-static {p1}, Ll/۟۫ᩳ;->᩷(Ll/۟۫ᩳ;)Ll/ۛ۫ᩳ;

    move-result-object p1

    iget-boolean v1, p0, Ll/᩹۫ᩳ;->᩶:Z

    move-object v0, p1

    .line 2240
    monitor-enter v0

    if-eqz v1, :cond_6

    .line 2243
    :try_start_2
    iget v2, p1, Ll/ۛ۫ᩳ;->ۧ:I

    .line 2244
    iget v3, p1, Ll/ۛ۫ᩳ;->֫:I

    goto :goto_4

    .line 2246
    :cond_6
    iget v2, p1, Ll/ۛ۫ᩳ;->ᩳ:I

    .line 2247
    iget v3, p1, Ll/ۛ۫ᩳ;->ܽ:I

    :goto_4
    const/4 v4, -0x1

    if-ne v2, v4, :cond_7

    if-ne v3, v4, :cond_7

    add-int/2addr p4, p2

    goto :goto_5

    :cond_7
    if-ge p2, v2, :cond_8

    move v2, p2

    :cond_8
    if-lez p3, :cond_9

    if-ge p2, v3, :cond_9

    sub-int/2addr v3, p3

    if-ge v3, p2, :cond_9

    move v3, p2

    :cond_9
    if-lez p4, :cond_a

    .line 2264
    invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr p4, p2

    move p2, v2

    goto :goto_5

    :cond_a
    move p2, v2

    move p4, v3

    :goto_5
    if-eqz v1, :cond_b

    .line 2268
    iput p2, p1, Ll/ۛ۫ᩳ;->ۧ:I

    .line 2269
    iput p4, p1, Ll/ۛ۫ᩳ;->֫:I

    goto :goto_6

    .line 2271
    :cond_b
    iput p2, p1, Ll/ۛ۫ᩳ;->ᩳ:I

    .line 2272
    iput p4, p1, Ll/ۛ۫ᩳ;->ܽ:I

    .line 2274
    :goto_6
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1114
    iget-object p1, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    invoke-static {p1}, Ll/۟۫ᩳ;->ۢ(Ll/۟۫ᩳ;)I

    move-result p1

    if-nez p1, :cond_c

    .line 1115
    iget-object p1, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ll/۟۫ᩳ;->ۧ(Z)V

    return-void

    .line 1117
    :cond_c
    iget-object p1, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    invoke-static {p1}, Ll/۟۫ᩳ;->᩷(Ll/۟۫ᩳ;)Ll/ۛ۫ᩳ;

    move-result-object p1

    iget-object p2, p0, Ll/᩹۫ᩳ;->᩹:Ll/۟۫ᩳ;

    invoke-static {p2}, Ll/۟۫ᩳ;->ۢ(Ll/۟۫ᩳ;)I

    move-result p2

    int-to-long p2, p2

    new-instance p4, Ll/ܶۛᩳ;

    const/4 v0, 0x1

    invoke-direct {p4, v0, p0}, Ll/ܶۛᩳ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, p2, p3, p4}, Ll/֫ۨۡ;->֫(Ljava/lang/Object;JLjava/lang/Runnable;)V

    return-void

    :catchall_2
    move-exception p1

    .line 2274
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1
.end method
