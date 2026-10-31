.class public final Ll/᩺᩵ܺ;
.super Ljava/lang/Object;
.source "UB7S"


# instance fields
.field public ֫:Ll/֡᩵ܺ;

.field public ۧ:Z

.field public ܽ:Ll/ۨ᩵ܺ;


# direct methods
.method public constructor <init>(Ll/֡᩵ܺ;Ll/ۨ᩵ܺ;)V
    .locals 1

    .line 392
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Ll/᩺᩵ܺ;->ۧ:Z

    .line 393
    iput-object p1, p0, Ll/᩺᩵ܺ;->֫:Ll/֡᩵ܺ;

    .line 394
    iput-object p2, p0, Ll/᩺᩵ܺ;->ܽ:Ll/ۨ᩵ܺ;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;ILl/᩵ۚܺ;)I
    .locals 1

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return v0

    .line 1438
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p2, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    if-eq p0, p1, :cond_1

    goto :goto_1

    .line 1441
    :cond_1
    invoke-interface {p1}, Ll/ۘۚܺ;->getChildren()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚۚܺ;

    if-ne p1, p2, :cond_2

    return v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ll/ᩴ᩵ܺ;)Ljava/util/ArrayList;
    .locals 9

    .line 1112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1113
    :cond_0
    invoke-virtual {p0}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_9

    .line 2783
    iget-object v1, p0, Ll/᩶֨ܺ;->֫:Ljava/lang/String;

    invoke-virtual {p0}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_1

    .line 2785
    :cond_1
    iget v2, p0, Ll/᩶֨ܺ;->ܿ:I

    .line 2787
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x7a

    const/16 v6, 0x61

    const/16 v7, 0x5a

    const/16 v8, 0x41

    if-lt v4, v8, :cond_2

    if-le v4, v7, :cond_3

    :cond_2
    if-lt v4, v6, :cond_7

    if-gt v4, v5, :cond_7

    .line 2790
    :cond_3
    invoke-virtual {p0}, Ll/᩶֨ܺ;->֫()I

    move-result v3

    :goto_0
    if-lt v3, v8, :cond_4

    if-le v3, v7, :cond_5

    :cond_4
    if-lt v3, v6, :cond_6

    if-gt v3, v5, :cond_6

    .line 2792
    :cond_5
    invoke-virtual {p0}, Ll/᩶֨ܺ;->֫()I

    move-result v3

    goto :goto_0

    .line 2793
    :cond_6
    iget v3, p0, Ll/᩶֨ܺ;->ܿ:I

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 2795
    :cond_7
    iput v2, p0, Ll/᩶֨ܺ;->ܿ:I

    :goto_1
    if-nez v3, :cond_8

    goto :goto_3

    .line 1118
    :cond_8
    :try_start_0
    invoke-static {v3}, Ll/֡᩵ܺ;->valueOf(Ljava/lang/String;)Ll/֡᩵ܺ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    .line 1123
    :goto_2
    invoke-virtual {p0}, Ll/᩶֨ܺ;->᩷()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_9
    :goto_3
    return-object v0
.end method

.method private ֫(Ll/۫᩵ܺ;Ll/ᩴ᩵ܺ;)V
    .locals 6

    .line 1132
    invoke-virtual {p2}, Ll/ᩴ᩵ܺ;->ܺ()Ljava/lang/String;

    move-result-object v0

    .line 1133
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    if-eqz v0, :cond_d

    .line 1136
    iget-boolean v1, p0, Ll/᩺᩵ܺ;->ۧ:Z

    const-string v2, "Invalid @media rule: expected \'}\' at end of rule set"

    const/16 v3, 0x7d

    const/4 v4, 0x0

    const/16 v5, 0x7b

    if-nez v1, :cond_5

    const-string v1, "media"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1138
    invoke-static {p2}, Ll/᩺᩵ܺ;->֫(Ll/ᩴ᩵ܺ;)Ljava/util/ArrayList;

    move-result-object v0

    .line 1139
    invoke-virtual {p2, v5}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1142
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    .line 1102
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩵ܺ;

    .line 1103
    sget-object v5, Ll/֡᩵ܺ;->᩹:Ll/֡᩵ܺ;

    if-eq v1, v5, :cond_1

    iget-object v5, p0, Ll/᩺᩵ܺ;->֫:Ll/֡᩵ܺ;

    if-ne v1, v5, :cond_0

    :cond_1
    const/4 v0, 0x1

    .line 1144
    iput-boolean v0, p0, Ll/᩺᩵ܺ;->ۧ:Z

    .line 1145
    invoke-direct {p0, p2}, Ll/᩺᩵ܺ;->ۧ(Ll/ᩴ᩵ܺ;)Ll/۫᩵ܺ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۫᩵ܺ;->֫(Ll/۫᩵ܺ;)V

    .line 1146
    iput-boolean v4, p0, Ll/᩺᩵ܺ;->ۧ:Z

    goto :goto_0

    .line 1148
    :cond_2
    invoke-direct {p0, p2}, Ll/᩺᩵ܺ;->ۧ(Ll/ᩴ᩵ܺ;)Ll/۫᩵ܺ;

    .line 1151
    :goto_0
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_c

    invoke-virtual {p2, v3}, Ll/᩶֨ܺ;->֫(C)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    .line 1152
    :cond_3
    new-instance p1, Ll/ۡ᩵ܺ;

    .line 27
    invoke-direct {p1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1152
    throw p1

    .line 1140
    :cond_4
    new-instance p1, Ll/ۡ᩵ܺ;

    const-string p2, "Invalid @media rule: missing rule set"

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1140
    throw p1

    .line 1155
    :cond_5
    iget-boolean p1, p0, Ll/᩺᩵ܺ;->ۧ:Z

    const/16 v1, 0x3b

    if-nez p1, :cond_9

    const-string p1, "import"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 1157
    invoke-virtual {p2}, Ll/ᩴ᩵ܺ;->ۖ()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_6

    .line 1159
    invoke-virtual {p2}, Ll/ᩴ᩵ܺ;->ۡ()Ljava/lang/String;

    move-result-object p1

    :cond_6
    if-eqz p1, :cond_8

    .line 1163
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    .line 1164
    invoke-static {p2}, Ll/᩺᩵ܺ;->֫(Ll/ᩴ᩵ܺ;)Ljava/util/ArrayList;

    .line 1166
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_c

    invoke-virtual {p2, v1}, Ll/᩶֨ܺ;->֫(C)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_2

    .line 1167
    :cond_7
    new-instance p1, Ll/ۡ᩵ܺ;

    .line 27
    invoke-direct {p1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1167
    throw p1

    .line 1161
    :cond_8
    new-instance p1, Ll/ۡ᩵ܺ;

    const-string p2, "Invalid @import rule: expected string or url()"

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1161
    throw p1

    .line 1191
    :cond_9
    :goto_1
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_c

    .line 1193
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ܽ()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v1, :cond_a

    if-nez v4, :cond_a

    goto :goto_2

    :cond_a
    if-ne p1, v5, :cond_b

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_b
    if-ne p1, v3, :cond_9

    if-lez v4, :cond_9

    add-int/lit8 v4, v4, -0x1

    if-nez v4, :cond_9

    .line 1183
    :cond_c
    :goto_2
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    return-void

    .line 1135
    :cond_d
    new-instance p1, Ll/ۡ᩵ܺ;

    const-string p2, "Invalid \'@\' rule"

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1135
    throw p1
.end method

.method public static ֫(Ljava/lang/String;Ll/֡᩵ܺ;)Z
    .locals 2

    .line 409
    new-instance v0, Ll/ᩴ᩵ܺ;

    invoke-direct {v0, p0}, Ll/ᩴ᩵ܺ;-><init>(Ljava/lang/String;)V

    .line 410
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    .line 411
    invoke-static {v0}, Ll/᩺᩵ܺ;->֫(Ll/ᩴ᩵ܺ;)Ljava/util/ArrayList;

    move-result-object p0

    .line 1102
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩵ܺ;

    .line 1103
    sget-object v1, Ll/֡᩵ܺ;->᩹:Ll/֡᩵ܺ;

    if-eq v0, v1, :cond_1

    if-ne v0, p1, :cond_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/ۛ᩵ܺ;Ll/᩵ۚܺ;)Z
    .locals 4

    .line 1454
    iget-object v0, p0, Ll/ۛ᩵ܺ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ۚۚܺ;->᩻()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1460
    :cond_0
    iget-object v0, p0, Ll/ۛ᩵ܺ;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 1462
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ᩵ܺ;

    .line 1464
    iget-object v2, v1, Ll/ܺ᩵ܺ;->֫:Ljava/lang/String;

    iget-object v1, v1, Ll/ܺ᩵ܺ;->ܽ:Ljava/lang/String;

    const-string v3, "id"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "class"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 1470
    :cond_2
    iget-object v2, p1, Ll/᩵ۚܺ;->ᩳ:Ljava/util/ArrayList;

    if-nez v2, :cond_3

    goto :goto_0

    .line 1472
    :cond_3
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 1466
    :cond_4
    iget-object v2, p1, Ll/᩵ۚܺ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 1483
    :cond_5
    iget-object p0, p0, Ll/ۛ᩵ܺ;->ܽ:Ljava/util/ArrayList;

    if-eqz p0, :cond_7

    .line 1484
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ᩵ܺ;

    .line 1485
    invoke-interface {v0, p1}, Ll/ۚ᩵ܺ;->֫(Ll/᩵ۚܺ;)Z

    move-result v0

    if-nez v0, :cond_6

    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_7
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;I)Z
    .locals 4

    .line 337
    iget-object v0, p0, Ll/ۤ᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩵ܺ;

    .line 1402
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۚܺ;

    .line 1404
    invoke-static {v0, v1}, Ll/᩺᩵ܺ;->֫(Ll/ۛ᩵ܺ;Ll/᩵ۚܺ;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    .line 1408
    :cond_0
    iget-object v0, v0, Ll/ۛ᩵ܺ;->ۧ:Ll/᩵᩵ܺ;

    sget-object v2, Ll/᩵᩵ܺ;->᩶:Ll/᩵᩵ܺ;

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    if-lez p3, :cond_4

    add-int/lit8 v0, p1, -0x1

    add-int/lit8 p3, p3, -0x1

    .line 1414
    invoke-static {p0, v0, p2, p3}, Ll/᩺᩵ܺ;->֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;I)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return v3

    .line 1419
    :cond_2
    sget-object v2, Ll/᩵᩵ܺ;->᩹:Ll/᩵᩵ܺ;

    if-ne v0, v2, :cond_3

    sub-int/2addr p1, v3

    sub-int/2addr p3, v3

    .line 1421
    invoke-static {p0, p1, p2, p3}, Ll/᩺᩵ܺ;->֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;I)Z

    move-result p0

    return p0

    .line 1425
    :cond_3
    invoke-static {p2, p3, v1}, Ll/᩺᩵ܺ;->֫(Ljava/util/ArrayList;ILl/᩵ۚܺ;)I

    move-result v0

    if-gtz v0, :cond_5

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0

    .line 1428
    :cond_5
    iget-object v1, v1, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    invoke-interface {v1}, Ll/ۘۚܺ;->getChildren()Ljava/util/List;

    move-result-object v1

    sub-int/2addr v0, v3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۚܺ;

    sub-int/2addr p1, v3

    .line 1429
    invoke-static {p0, p1, p2, p3, v0}, Ll/᩺᩵ܺ;->֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;ILl/᩵ۚܺ;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;ILl/᩵ۚܺ;)Z
    .locals 3

    .line 337
    iget-object v0, p0, Ll/ۤ᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩵ܺ;

    .line 1368
    invoke-static {v0, p4}, Ll/᩺᩵ܺ;->֫(Ll/ۛ᩵ܺ;Ll/᩵ۚܺ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 1372
    :cond_0
    iget-object v0, v0, Ll/ۛ᩵ܺ;->ۧ:Ll/᩵᩵ܺ;

    sget-object v1, Ll/᩵᩵ܺ;->᩶:Ll/᩵᩵ܺ;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_3

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    if-ltz p3, :cond_5

    add-int/lit8 p4, p1, -0x1

    .line 1378
    invoke-static {p0, p4, p2, p3}, Ll/᩺᩵ܺ;->֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;I)Z

    move-result p4

    if-eqz p4, :cond_2

    :goto_1
    return v2

    :cond_2
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    .line 1384
    :cond_3
    sget-object v1, Ll/᩵᩵ܺ;->᩹:Ll/᩵᩵ܺ;

    if-ne v0, v1, :cond_4

    sub-int/2addr p1, v2

    .line 1386
    invoke-static {p0, p1, p2, p3}, Ll/᩺᩵ܺ;->֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;I)Z

    move-result p0

    return p0

    .line 1390
    :cond_4
    invoke-static {p2, p3, p4}, Ll/᩺᩵ܺ;->֫(Ljava/util/ArrayList;ILl/᩵ۚܺ;)I

    move-result v0

    if-gtz v0, :cond_6

    :cond_5
    :goto_2
    const/4 p0, 0x0

    return p0

    .line 1393
    :cond_6
    iget-object p4, p4, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    invoke-interface {p4}, Ll/ۘۚܺ;->getChildren()Ljava/util/List;

    move-result-object p4

    sub-int/2addr v0, v2

    invoke-interface {p4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/᩵ۚܺ;

    sub-int/2addr p1, v2

    .line 1394
    invoke-static {p0, p1, p2, p3, p4}, Ll/᩺᩵ܺ;->֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;ILl/᩵ۚܺ;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ۤ᩵ܺ;Ll/᩵ۚܺ;)Z
    .locals 5

    .line 1344
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1345
    iget-object v1, p1, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    :goto_0
    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1347
    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1348
    check-cast v1, Ll/ۚۚܺ;

    iget-object v1, v1, Ll/ۚۚܺ;->ۧ:Ll/ۘۚܺ;

    goto :goto_0

    .line 1351
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    .line 332
    iget-object v4, p0, Ll/ۤ᩵ܺ;->֫:Ljava/util/ArrayList;

    if-nez v4, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    :goto_1
    if-ne v4, v3, :cond_2

    .line 337
    iget-object p0, p0, Ll/ۤ᩵ܺ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۛ᩵ܺ;

    .line 1355
    invoke-static {p0, p1}, Ll/᩺᩵ܺ;->֫(Ll/ۛ᩵ܺ;Ll/᩵ۚܺ;)Z

    move-result p0

    return p0

    .line 332
    :cond_2
    iget-object v4, p0, Ll/ۤ᩵ܺ;->֫:Ljava/util/ArrayList;

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_2
    sub-int/2addr v2, v3

    .line 1359
    invoke-static {p0, v2, v0, v1, p1}, Ll/᩺᩵ܺ;->֫(Ll/ۤ᩵ܺ;ILjava/util/ArrayList;ILl/᩵ۚܺ;)Z

    move-result p0

    return p0
.end method

.method private ۧ(Ll/ᩴ᩵ܺ;)Ll/۫᩵ܺ;
    .locals 2

    .line 1208
    new-instance v0, Ll/۫᩵ܺ;

    invoke-direct {v0}, Ll/۫᩵ܺ;-><init>()V

    .line 1211
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "<!--"

    .line 1213
    invoke-virtual {p1, v1}, Ll/᩶֨ܺ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "-->"

    .line 1215
    invoke-virtual {p1, v1}, Ll/᩶֨ܺ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x40

    .line 1218
    invoke-virtual {p1, v1}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1219
    invoke-direct {p0, v0, p1}, Ll/᩺᩵ܺ;->֫(Ll/۫᩵ܺ;Ll/ᩴ᩵ܺ;)V

    goto :goto_0

    .line 1222
    :cond_2
    invoke-direct {p0, v0, p1}, Ll/᩺᩵ܺ;->ۧ(Ll/۫᩵ܺ;Ll/ᩴ᩵ܺ;)Z

    move-result v1
    :try_end_0
    .catch Ll/ۡ᩵ܺ; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :catch_0
    move-exception p1

    .line 1231
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-object v0
.end method

.method private ۧ(Ll/۫᩵ܺ;Ll/ᩴ᩵ܺ;)Z
    .locals 13

    .line 1241
    invoke-static {p2}, Ll/ᩴ᩵ܺ;->֫(Ll/ᩴ᩵ܺ;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 1242
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    const/16 v1, 0x7b

    .line 1244
    invoke-virtual {p2, v1}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1246
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    .line 1264
    new-instance v1, Ll/᩷ۚܺ;

    invoke-direct {v1}, Ll/᩷ۚܺ;-><init>()V

    .line 1267
    :cond_0
    invoke-virtual {p2}, Ll/ᩴ᩵ܺ;->ܺ()Ljava/lang/String;

    move-result-object v2

    .line 1268
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    const/16 v3, 0x3a

    .line 1269
    invoke-virtual {p2, v3}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 1271
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    .line 933
    iget-object v3, p2, Ll/᩶֨ܺ;->֫:Ljava/lang/String;

    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v4

    const/4 v5, 0x1

    const/16 v6, 0x21

    const/16 v7, 0x7d

    const/16 v8, 0x3b

    const/4 v9, 0x0

    if-eqz v4, :cond_1

    goto :goto_2

    .line 935
    :cond_1
    iget v4, p2, Ll/᩶֨ܺ;->ܿ:I

    .line 938
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v10

    move v11, v4

    :goto_0
    const/4 v12, -0x1

    if-eq v10, v12, :cond_4

    if-eq v10, v8, :cond_4

    if-eq v10, v7, :cond_4

    if-eq v10, v6, :cond_4

    const/16 v12, 0xa

    if-eq v10, v12, :cond_4

    const/16 v12, 0xd

    if-ne v10, v12, :cond_2

    goto :goto_1

    .line 940
    :cond_2
    invoke-static {v10}, Ll/᩶֨ܺ;->֫(I)Z

    move-result v10

    if-nez v10, :cond_3

    .line 941
    iget v10, p2, Ll/᩶֨ܺ;->ܿ:I

    add-int/lit8 v11, v10, 0x1

    .line 942
    :cond_3
    invoke-virtual {p2}, Ll/᩶֨ܺ;->֫()I

    move-result v10

    goto :goto_0

    .line 944
    :cond_4
    :goto_1
    iget v10, p2, Ll/᩶֨ܺ;->ܿ:I

    if-le v10, v4, :cond_5

    .line 945
    invoke-virtual {v3, v4, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    .line 946
    :cond_5
    iput v4, p2, Ll/᩶֨ܺ;->ܿ:I

    :goto_2
    if-eqz v9, :cond_a

    .line 1276
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    .line 1277
    invoke-virtual {p2, v6}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 1278
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    const-string v3, "important"

    .line 1279
    invoke-virtual {p2, v3}, Ll/᩶֨ܺ;->֫(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 1283
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    goto :goto_3

    .line 1280
    :cond_6
    new-instance p1, Ll/ۡ᩵ܺ;

    const-string p2, "Malformed rule set: found unexpected \'!\'"

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1280
    throw p1

    .line 1285
    :cond_7
    :goto_3
    invoke-virtual {p2, v8}, Ll/᩶֨ܺ;->֫(C)Z

    .line 1287
    invoke-static {v1, v2, v9}, Ll/ۗ֨ܺ;->֫(Ll/᩷ۚܺ;Ljava/lang/String;Ljava/lang/String;)V

    .line 1288
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    .line 1289
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۧ()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {p2, v7}, Ll/᩶֨ܺ;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1248
    :cond_8
    invoke-virtual {p2}, Ll/᩶֨ܺ;->ۢ()V

    .line 1249
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤ᩵ܺ;

    .line 1250
    new-instance v2, Ll/۬᩵ܺ;

    .line 304
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 305
    iput-object v0, v2, Ll/۬᩵ܺ;->֫:Ll/ۤ᩵ܺ;

    .line 306
    iput-object v1, v2, Ll/۬᩵ܺ;->ܽ:Ll/᩷ۚܺ;

    .line 307
    iget-object v0, p0, Ll/᩺᩵ܺ;->ܽ:Ll/ۨ᩵ܺ;

    iput-object v0, v2, Ll/۬᩵ܺ;->ۧ:Ll/ۨ᩵ܺ;

    .line 1250
    invoke-virtual {p1, v2}, Ll/۫᩵ܺ;->֫(Ll/۬᩵ܺ;)V

    goto :goto_4

    :cond_9
    return v5

    .line 1274
    :cond_a
    new-instance p1, Ll/ۡ᩵ܺ;

    const-string p2, "Expected property value"

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1274
    throw p1

    .line 1270
    :cond_b
    new-instance p1, Ll/ۡ᩵ܺ;

    const-string p2, "Expected \':\'"

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1270
    throw p1

    .line 1245
    :cond_c
    new-instance p1, Ll/ۡ᩵ܺ;

    const-string p2, "Malformed rule block: expected \'{\'"

    .line 27
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1245
    throw p1

    :cond_d
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/۫᩵ܺ;
    .locals 1

    .line 400
    new-instance v0, Ll/ᩴ᩵ܺ;

    invoke-direct {v0, p1}, Ll/ᩴ᩵ܺ;-><init>(Ljava/lang/String;)V

    .line 401
    invoke-virtual {v0}, Ll/᩶֨ܺ;->ۢ()V

    .line 403
    invoke-direct {p0, v0}, Ll/᩺᩵ܺ;->ۧ(Ll/ᩴ᩵ܺ;)Ll/۫᩵ܺ;

    move-result-object p1

    return-object p1
.end method
