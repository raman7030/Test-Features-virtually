.class public final Ll/֫ۜܿ;
.super Ljava/lang/Object;
.source "T6ZX"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:[Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Z

.field public final ᩳ:[Ljava/lang/String;

.field public final ᩻:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IZ[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/֫ۜܿ;->ܽ:Ljava/lang/String;

    .line 45
    iput p2, p0, Ll/֫ۜܿ;->֫:I

    .line 46
    iput-boolean p3, p0, Ll/֫ۜܿ;->ܿ:Z

    .line 47
    iput-object p4, p0, Ll/֫ۜܿ;->ᩳ:[Ljava/lang/String;

    .line 48
    iput-object p5, p0, Ll/֫ۜܿ;->ܳ:[Ljava/lang/String;

    .line 49
    iput-object p6, p0, Ll/֫ۜܿ;->᩻:[Ljava/lang/String;

    .line 50
    iput-object p7, p0, Ll/֫ۜܿ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    .line 335
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 p1, 0x0

    .line 336
    :goto_0
    array-length v0, p0

    if-ge p1, v0, :cond_1

    .line 337
    aget-char v0, p0, p1

    .line 329
    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    .line 337
    aput-char v0, p0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 339
    :cond_1
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    return-object p1
.end method

.method public static ֫(IZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)Ll/֫ۜܿ;
    .locals 9

    if-ltz p0, :cond_6

    const v0, 0xffff

    if-gt p0, v0, :cond_6

    .line 85
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v1, v2, :cond_6

    .line 86
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz p5, :cond_6

    .line 87
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v0, :cond_6

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v0, :cond_6

    if-eqz p5, :cond_2

    .line 90
    invoke-virtual {p5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 91
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid childrenSyntax default target"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 93
    :cond_2
    :goto_0
    new-instance v0, Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 94
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 95
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    .line 98
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 99
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Duplicate childrenSyntax include: "

    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 96
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "childrenSyntax include name is empty"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 103
    :cond_5
    new-instance v8, Ll/֫ۜܿ;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 104
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, [Ljava/lang/String;

    new-array p2, v0, [Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Ljava/lang/String;

    new-array p2, v0, [Ljava/lang/String;

    .line 105
    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    move-object v6, p2

    check-cast v6, [Ljava/lang/String;

    const/4 v1, 0x0

    move-object v0, v8

    move v2, p0

    move v3, p1

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Ll/֫ۜܿ;-><init>(Ljava/lang/String;IZ[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-object v8

    .line 88
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid dynamic childrenSyntax"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/֫ۜܿ;
    .locals 9

    .line 55
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Ll/֫ۜܿ;

    const/4 v1, 0x0

    new-array v5, v1, [Ljava/lang/String;

    new-array v6, v1, [Ljava/lang/String;

    new-array v7, v1, [Ljava/lang/String;

    const/4 v8, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v8}, Ll/֫ۜܿ;-><init>(Ljava/lang/String;IZ[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 56
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid fixed childrenSyntax target"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/֫ۜܿ;
    .locals 14

    .line 111
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    .line 116
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/֫ۜܿ;->֫(Ljava/lang/String;)Ll/֫ۜܿ;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v3, 0x2

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x5

    if-eq v0, v3, :cond_3

    if-eq v0, v5, :cond_3

    if-eq v0, v4, :cond_3

    if-ne v0, v6, :cond_2

    goto :goto_0

    .line 172
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v1, "Unknown childrenSyntax mode: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 172
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 121
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v3

    const/4 v4, 0x4

    .line 122
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v7

    const/4 v8, 0x0

    if-eq v0, v4, :cond_5

    if-ne v0, v6, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v4, 0x1

    :goto_2
    if-eqz v4, :cond_a

    .line 127
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v9

    if-eqz v9, :cond_9

    .line 131
    new-array v10, v9, [Ljava/lang/String;

    .line 132
    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v9}, Ljava/util/HashSet;-><init>(I)V

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v9, :cond_8

    .line 134
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v10, v12

    .line 135
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_7

    .line 138
    aget-object v13, v10, v12

    invoke-virtual {v11, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 139
    :cond_6
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Duplicate childrenSyntax include: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v1, v10, v12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 136
    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string v0, "childrenSyntax include name is empty"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    move-object v9, v10

    goto :goto_4

    .line 129
    :cond_9
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Dynamic childrenSyntax includes are empty"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-array v9, v8, [Ljava/lang/String;

    .line 146
    :goto_4
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v10

    if-eq v0, v5, :cond_c

    if-ne v0, v6, :cond_b

    goto :goto_5

    :cond_b
    const/4 v2, 0x0

    :cond_c
    :goto_5
    if-nez v10, :cond_e

    if-nez v4, :cond_e

    if-eqz v2, :cond_d

    goto :goto_6

    .line 150
    :cond_d
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Dynamic childrenSyntax cases are empty"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 152
    :cond_e
    :goto_6
    new-array v6, v10, [Ljava/lang/String;

    .line 153
    new-array v0, v10, [Ljava/lang/String;

    .line 154
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v10}, Ljava/util/HashSet;-><init>(I)V

    :goto_7
    if-ge v8, v10, :cond_11

    .line 156
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v6, v8

    .line 157
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v8

    .line 158
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_10

    .line 161
    aget-object v5, v6, v8

    invoke-static {v5, v7}, Ll/֫ۜܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f

    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    .line 162
    :cond_f
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Duplicate childrenSyntax selector: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v1, v6, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 159
    :cond_10
    new-instance p0, Ljava/io/IOException;

    const-string v0, "childrenSyntax target is empty"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    if-eqz v2, :cond_12

    .line 165
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    :cond_12
    move-object v8, v1

    if-eqz v8, :cond_14

    .line 166
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_13

    goto :goto_8

    .line 167
    :cond_13
    new-instance p0, Ljava/io/IOException;

    const-string v0, "childrenSyntax default target is empty"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 169
    :cond_14
    :goto_8
    new-instance p0, Ll/֫ۜܿ;

    const/4 v2, 0x0

    move-object v1, p0

    move v4, v7

    move-object v5, v9

    move-object v7, v0

    invoke-direct/range {v1 .. v8}, Ll/֫ۜܿ;-><init>(Ljava/lang/String;IZ[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static ֫(Ll/ۤۜܽ;Ll/֫ۜܿ;)V
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 178
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeByte(I)V

    return-void

    .line 177
    :cond_0
    iget-object v1, p1, Ll/֫ۜܿ;->ܳ:[Ljava/lang/String;

    iget-object v2, p1, Ll/֫ۜܿ;->ۧ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫ۜܿ;->ᩳ:[Ljava/lang/String;

    .line 181
    invoke-virtual {p1}, Ll/֫ۜܿ;->ܿ()Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_1

    .line 182
    invoke-virtual {p0, v5}, Ll/ۤۜܽ;->writeByte(I)V

    .line 183
    iget-object p1, p1, Ll/֫ۜܿ;->ܽ:Ljava/lang/String;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    return-void

    .line 186
    :cond_1
    array-length v4, v3

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_4

    if-nez v2, :cond_3

    const/4 v4, 0x4

    goto :goto_1

    :cond_3
    const/4 v4, 0x5

    goto :goto_1

    :cond_4
    if-nez v2, :cond_5

    const/4 v4, 0x2

    goto :goto_1

    :cond_5
    const/4 v4, 0x3

    .line 187
    :goto_1
    invoke-virtual {p0, v4}, Ll/ۤۜܽ;->writeByte(I)V

    .line 191
    iget v4, p1, Ll/֫ۜܿ;->֫:I

    invoke-virtual {p0, v4}, Ll/ۤۜܽ;->ۡ(I)V

    .line 192
    iget-boolean v4, p1, Ll/֫ۜܿ;->ܿ:Z

    invoke-virtual {p0, v4}, Ll/ۤۜܽ;->֫(Z)V

    if-eqz v5, :cond_6

    .line 194
    array-length v4, v3

    invoke-virtual {p0, v4}, Ll/ۤۜܽ;->ۡ(I)V

    .line 195
    array-length v4, v3

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_6

    aget-object v6, v3, v5

    .line 196
    invoke-virtual {p0, v6}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 199
    :cond_6
    array-length v3, v1

    invoke-virtual {p0, v3}, Ll/ۤۜܽ;->ۡ(I)V

    .line 200
    :goto_3
    array-length v3, v1

    if-ge v0, v3, :cond_7

    .line 201
    aget-object v3, v1, v0

    invoke-virtual {p0, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 202
    iget-object v3, p1, Ll/֫ۜܿ;->᩻:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-virtual {p0, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    if-eqz v2, :cond_8

    .line 205
    invoke-virtual {p0, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    :cond_8
    return-void
.end method

.method public static ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x22

    .line 244
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 533
    sget-object v1, Ll/ۤۘ֡;->ۧ:Ll/ۛۘ֡;

    invoke-virtual {v1, p1}, Ll/ۨۘ֡;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 244
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 291
    iget v0, p0, Ll/֫ۜܿ;->֫:I

    return v0
.end method

.method public final ֫(I)Ljava/lang/String;
    .locals 1

    .line 311
    iget-object v0, p0, Ll/֫ۜܿ;->ܳ:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(Ll/ܶۜܿ;)Ll/֫ۜܿ;
    .locals 12

    .line 256
    invoke-virtual {p0}, Ll/֫ۜܿ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/֫ۜܿ;->ᩳ:[Ljava/lang/String;

    array-length v1, v0

    if-nez v1, :cond_0

    goto/16 :goto_3

    .line 259
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 260
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget-boolean v5, p0, Ll/֫ۜܿ;->ܿ:Z

    if-ge v4, v2, :cond_1

    aget-object v6, v0, v4

    .line 261
    invoke-virtual {p1, v6}, Ll/ܶۜܿ;->֫(Ljava/lang/String;)Ll/۟᩻ܿ;

    move-result-object v7

    .line 262
    invoke-virtual {v7, v1, v5, v6}, Ll/۟᩻ܿ;->֫(Ljava/util/LinkedHashMap;ZLjava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 264
    :cond_1
    new-instance p1, Ljava/util/HashSet;

    iget-object v0, p0, Ll/֫ۜܿ;->ܳ:[Ljava/lang/String;

    array-length v2, v0

    invoke-direct {p1, v2}, Ljava/util/HashSet;-><init>(I)V

    const/4 v2, 0x0

    .line 265
    :goto_1
    array-length v4, v0

    if-ge v2, v4, :cond_3

    .line 266
    aget-object v4, v0, v2

    invoke-static {v4, v5}, Ll/֫ۜܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    .line 267
    invoke-virtual {p1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 272
    new-instance v6, Ll/ܰ᩻ܿ;

    aget-object v7, v0, v2

    iget-object v8, p0, Ll/֫ۜܿ;->᩻:[Ljava/lang/String;

    aget-object v8, v8, v2

    invoke-direct {v6, v7, v8}, Ll/ܰ᩻ܿ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 268
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Duplicate childrenSyntax selector: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 274
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 275
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰ᩻ܿ;

    .line 277
    iget-object v4, v2, Ll/ܰ᩻ܿ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    iget-object v2, v2, Ll/ܰ᩻ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 280
    :cond_4
    new-instance v1, Ll/֫ۜܿ;

    new-array v8, v3, [Ljava/lang/String;

    new-array v2, v3, [Ljava/lang/String;

    .line 281
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, [Ljava/lang/String;

    new-array p1, v3, [Ljava/lang/String;

    .line 282
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, [Ljava/lang/String;

    iget-object v11, p0, Ll/֫ۜܿ;->ۧ:Ljava/lang/String;

    const/4 v5, 0x0

    iget v6, p0, Ll/֫ۜܿ;->֫:I

    iget-boolean v7, p0, Ll/֫ۜܿ;->ܿ:Z

    move-object v4, v1

    invoke-direct/range {v4 .. v11}, Ll/֫ۜܿ;-><init>(Ljava/lang/String;IZ[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_5
    :goto_3
    return-object p0
.end method

.method public final ֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 8

    .line 211
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "childrenSyntax: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    invoke-virtual {p0}, Ll/֫ۜܿ;->ܿ()Z

    move-result v0

    const/16 v1, 0xa

    if-nez v0, :cond_0

    .line 213
    iget-object p2, p0, Ll/֫ۜܿ;->ܽ:Ljava/lang/String;

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, p2}, Ll/֫ۜܿ;->ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 214
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const-string v0, "{\n"

    .line 217
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x9

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 219
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "capture: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֫ۜܿ;->֫:I

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 221
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ignoreCase: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Ll/֫ۜܿ;->ܿ:Z

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    iget-object v2, p0, Ll/֫ۜܿ;->ᩳ:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    .line 223
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "include: "

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    invoke-static {p1, v6}, Ll/֫ۜܿ;->ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 225
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 227
    :cond_1
    :goto_1
    iget-object v2, p0, Ll/֫ۜܿ;->ܳ:[Ljava/lang/String;

    array-length v3, v2

    if-ge v4, v3, :cond_2

    .line 228
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    aget-object v2, v2, v4

    invoke-static {p1, v2}, Ll/֫ۜܿ;->ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const-string v2, " => "

    .line 230
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    iget-object v2, p0, Ll/֫ۜܿ;->᩻:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-static {p1, v2}, Ll/֫ۜܿ;->ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 232
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 234
    :cond_2
    iget-object v2, p0, Ll/֫ۜܿ;->ۧ:Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 235
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "default => "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    invoke-static {p1, v2}, Ll/֫ۜܿ;->ۧ(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 237
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 239
    :cond_3
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 307
    iget-object v0, p0, Ll/֫ۜܿ;->ܳ:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 1

    .line 315
    iget-object v0, p0, Ll/֫ۜܿ;->᩻:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 295
    iget-boolean v0, p0, Ll/֫ۜܿ;->ܿ:Z

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 321
    iget-object v0, p0, Ll/֫ۜܿ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 248
    iget-object v0, p0, Ll/֫ۜܿ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 287
    iget-object v0, p0, Ll/֫ۜܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
