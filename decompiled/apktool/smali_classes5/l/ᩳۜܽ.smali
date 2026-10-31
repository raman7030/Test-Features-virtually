.class public final Ll/ᩳۜܽ;
.super Ll/۠ᩳܽ;
.source "R537"


# instance fields
.field public final ۗ:Ljava/util/ArrayList;

.field public final ۛ:Ljava/util/ArrayList;

.field public ۤ:Ljava/util/List;

.field public ۨ:Ljava/util/List;

.field public final ۫:Ll/ۢۜܽ;

.field public final ۬:Ljava/util/ArrayList;

.field public final ᩺:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩺᩻ܽ;Ll/ۛۜܽ;)V
    .locals 12

    .line 35
    invoke-direct {p0, p1}, Ll/۠ᩳܽ;-><init>(Ll/ۡᩳܽ;)V

    .line 28
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩳۜܽ;->ۗ:Ljava/util/ArrayList;

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩳۜܽ;->۬:Ljava/util/ArrayList;

    .line 30
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩳۜܽ;->ۛ:Ljava/util/ArrayList;

    .line 31
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩳۜܽ;->᩺:Ljava/util/ArrayList;

    .line 36
    invoke-virtual {p2}, Ll/ۛۜܽ;->ۧ()I

    move-result p1

    .line 38
    invoke-static {p2}, Ll/֫ᩳܽ;->֫(Ll/ۛۜܽ;)Ll/֫ᩳܽ;

    move-result-object v0

    const/16 v1, 0x200

    .line 39
    invoke-virtual {v0, v1}, Ll/֫ᩳܽ;->֫(I)V

    .line 41
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v2

    iput v2, p0, Ll/۠ᩳܽ;->᩶:I

    const/16 v2, 0x80

    .line 42
    invoke-virtual {p2, v2}, Ll/ۛۜܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/۠ᩳܽ;->ۙ:Ljava/lang/String;

    .line 43
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v2

    .line 44
    invoke-virtual {p2}, Ll/ۛۜܽ;->ۜ()V

    .line 45
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v3

    .line 46
    invoke-virtual {p2}, Ll/ۛۜܽ;->ۜ()V

    const/16 v4, 0x120

    .line 52
    iget v5, v0, Ll/֫ᩳܽ;->ۧ:I

    const/4 v6, 0x0

    if-lt v5, v4, :cond_0

    .line 53
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    add-int/2addr v2, p1

    .line 56
    invoke-virtual {p2, v2}, Ll/ۛۜܽ;->ܽ(I)V

    .line 57
    new-instance v2, Ll/ۢۜܽ;

    invoke-direct {v2, p2}, Ll/ۢۜܽ;-><init>(Ll/ۛۜܽ;)V

    add-int/2addr v3, p1

    .line 58
    invoke-virtual {p2, v3}, Ll/ۛۜܽ;->ܽ(I)V

    .line 59
    new-instance v3, Ll/ۢۜܽ;

    invoke-direct {v3, p2}, Ll/ۢۜܽ;-><init>(Ll/ۛۜܽ;)V

    .line 60
    iput-object v3, p0, Ll/ᩳۜܽ;->۫:Ll/ۢۜܽ;

    .line 62
    new-instance v5, Ll/ۧۜܽ;

    invoke-direct {v5, v2}, Ll/ۧۜܽ;-><init>(Ll/ۢۜܽ;)V

    iput-object v5, p0, Ll/ᩳۜܽ;->ۨ:Ljava/util/List;

    .line 77
    new-instance v2, Ll/ܽۜܽ;

    invoke-direct {v2, v3}, Ll/ܽۜܽ;-><init>(Ll/ۢۜܽ;)V

    iput-object v2, p0, Ll/ᩳۜܽ;->ۤ:Ljava/util/List;

    .line 89
    invoke-static {p2}, Ll/֫ᩳܽ;->֫(Ll/ۛۜܽ;)Ll/֫ᩳܽ;

    move-result-object v2

    .line 90
    iget v0, v0, Ll/֫ᩳܽ;->֫:I

    add-int/2addr p1, v0

    .line 91
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 94
    :goto_1
    iget-short v3, v2, Ll/֫ᩳܽ;->ᩳ:S

    const/16 v5, 0x203

    if-ne v3, v5, :cond_1

    .line 135
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v3

    .line 136
    iget-object v5, p0, Ll/ᩳۜܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v3, :cond_a

    .line 138
    new-instance v8, Ll/ܰ᩻ܽ;

    invoke-direct {v8, p2}, Ll/ܰ᩻ܽ;-><init>(Ll/ۛۜܽ;)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_1
    const/16 v5, 0x204

    if-ne v3, v5, :cond_4

    .line 143
    new-instance v3, Ll/۟᩻ܽ;

    invoke-direct {v3, p2}, Ll/۟᩻ܽ;-><init>(Ll/ۛۜܽ;)V

    .line 144
    iget-object v5, p0, Ll/ᩳۜܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    invoke-virtual {p2}, Ll/ۛۜܽ;->ۧ()I

    move-result v5

    .line 146
    invoke-static {p2}, Ll/֫ᩳܽ;->֫(Ll/ۛۜܽ;)Ll/֫ᩳܽ;

    move-result-object v7

    .line 147
    :goto_3
    iget-short v7, v7, Ll/֫ᩳܽ;->ᩳ:S

    const/16 v8, 0x205

    iget-object v9, v3, Ll/۟᩻ܽ;->᩶:Ljava/util/ArrayList;

    if-ne v7, v8, :cond_3

    .line 161
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v5

    .line 162
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v7

    .line 163
    new-instance v8, Ll/ܺۢᩴ;

    invoke-direct {v8, v7}, Ll/ܺۢᩴ;-><init>(I)V

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v7, :cond_2

    .line 165
    invoke-virtual {p2}, Ll/ۛۜܽ;->ᩳ()I

    move-result v11

    invoke-virtual {v8, v11}, Ll/ܺۢᩴ;->add(I)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 167
    :cond_2
    new-instance v7, Ll/֫ۜܽ;

    .line 9
    invoke-direct {v7, v5, v8}, Ll/ᩴᩳܽ;-><init>(ILl/ܺۢᩴ;)V

    .line 168
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    invoke-virtual {p2}, Ll/ۛۜܽ;->ۧ()I

    move-result v5

    .line 150
    invoke-static {p2}, Ll/֫ᩳܽ;->֫(Ll/ۛۜܽ;)Ll/֫ᩳܽ;

    move-result-object v7

    goto :goto_3

    .line 152
    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->trimToSize()V

    .line 153
    invoke-virtual {p2, v5}, Ll/ۛۜܽ;->ܽ(I)V

    goto :goto_5

    :cond_4
    const/16 v5, 0x206

    if-ne v3, v5, :cond_5

    .line 157
    iget-object v3, p0, Ll/ᩳۜܽ;->ۛ:Ljava/util/ArrayList;

    new-instance v5, Ll/ܿۜܽ;

    invoke-direct {v5, p2}, Ll/ܿۜܽ;-><init>(Ll/ۛۜܽ;)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    const/16 v5, 0x202

    if-ne v3, v5, :cond_6

    .line 129
    new-instance v3, Ll/᩻ۜܽ;

    invoke-direct {v3, p0, p2, v2}, Ll/᩻ۜܽ;-><init>(Ll/ᩳۜܽ;Ll/ۛۜܽ;Ll/֫ᩳܽ;)V

    .line 130
    iget-object v5, p0, Ll/ᩳۜܽ;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    invoke-virtual {v3}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v5

    invoke-virtual {v0, v5, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_5

    :cond_6
    const/16 v5, 0x201

    if-ne v3, v5, :cond_8

    .line 120
    invoke-virtual {p2}, Ll/ۛۜܽ;->ܳ()I

    move-result v3

    sub-int/2addr v3, v4

    .line 121
    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻ۜܽ;

    if-eqz v5, :cond_7

    .line 125
    new-instance v3, Ll/ۛ᩻ܽ;

    invoke-direct {v3, v5, p2, v2}, Ll/ۛ᩻ܽ;-><init>(Ll/᩻ۜܽ;Ll/ۛۜܽ;Ll/֫ᩳܽ;)V

    invoke-virtual {v5, v3}, Ll/᩻ۜܽ;->֫(Ll/ۛ᩻ܽ;)V

    goto :goto_5

    .line 123
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Can not find ArscType with id of "

    .line 0
    invoke-static {v3, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 123
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    const/4 v5, -0x1

    if-eq v3, v5, :cond_c

    if-ne v3, v1, :cond_9

    goto :goto_6

    .line 107
    :cond_9
    sget-object v5, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v3, v7, v6

    const-string v3, "Skip arsc chunk: %04x\n"

    invoke-virtual {v5, v3, v7}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 109
    :cond_a
    :goto_5
    iget v3, v2, Ll/֫ᩳܽ;->ܽ:I

    iget v2, v2, Ll/֫ᩳܽ;->֫:I

    add-int/2addr v3, v2

    if-lt v3, p1, :cond_b

    goto :goto_6

    .line 112
    :cond_b
    invoke-virtual {p2, v3}, Ll/ۛۜܽ;->ܽ(I)V

    .line 113
    invoke-static {p2}, Ll/֫ᩳܽ;->֫(Ll/ۛۜܽ;)Ll/֫ᩳܽ;

    move-result-object v2

    goto/16 :goto_1

    .line 116
    :cond_c
    :goto_6
    invoke-virtual {p2, p1}, Ll/ۛۜܽ;->ܽ(I)V

    return-void
.end method


# virtual methods
.method public final getType(I)Ll/֡᩻ܽ;
    .locals 1

    .line 178
    iget-object v0, p0, Ll/ᩳۜܽ;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۜܽ;

    return-object p1
.end method

.method public final getType(Ljava/lang/String;)Ll/֡᩻ܽ;
    .locals 0

    .line 183
    invoke-super {p0, p1}, Ll/۠ᩳܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object p1

    check-cast p1, Ll/᩻ۜܽ;

    return-object p1
.end method

.method public final ֡()I
    .locals 1

    .line 198
    iget-object v0, p0, Ll/ᩳۜܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֨֫()I
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ᩳۜܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 247
    invoke-super {p0}, Ll/۠ᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩺᩻ܽ;

    return-object v0
.end method

.method public final ֫()Ll/᩺᩻ܽ;
    .locals 1

    .line 247
    invoke-super {p0}, Ll/۠ᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩺᩻ܽ;

    return-object v0
.end method

.method public final ۖ(I)Ll/ۡ᩻ܽ;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ᩳۜܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰ᩻ܽ;

    return-object p1
.end method

.method public final ۗ()I
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ᩳۜܽ;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۜ()Ljava/util/List;
    .locals 1

    .line 242
    iget-object v0, p0, Ll/ᩳۜܽ;->ۤ:Ljava/util/List;

    return-object v0
.end method

.method public final ۜ(I)Ll/ᩴ᩻ܽ;
    .locals 1

    .line 213
    iget-object v0, p0, Ll/ᩳۜܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿۜܽ;

    return-object p1
.end method

.method public final ۜۧ()Ljava/util/List;
    .locals 1

    .line 218
    iget-object v0, p0, Ll/ᩳۜܽ;->ۨ:Ljava/util/List;

    return-object v0
.end method

.method public final ۠֫()I
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ᩳۜܽ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ᩴ(I)Ll/ܺ᩻ܽ;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ᩳۜܽ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟᩻ܽ;

    return-object p1
.end method
