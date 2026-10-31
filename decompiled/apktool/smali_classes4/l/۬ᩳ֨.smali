.class public final Ll/۬ᩳ֨;
.super Ll/ۨܽ֨;
.source "R7CK"


# static fields
.field public static final synthetic ᩷ۧ:I


# instance fields
.field public final ۜۧ:Z

.field public ᩻ۧ:Ll/ۗᩳ֨;


# direct methods
.method public constructor <init>(Ll/᩷ۧ֨;)V
    .locals 2

    .line 46
    invoke-direct {p0, p1}, Ll/ۨܽ֨;-><init>(Ll/ۨܽ֨;)V

    const/4 p1, 0x1

    new-array p1, p1, [Ll/֫ܿ֨;

    .line 42
    sget-object v0, Ll/֫ܿ֨;->۬:Ll/֫ܿ֨;

    const/4 v1, 0x0

    aput-object v0, p1, v1

    invoke-static {p1}, Ll/ۧܿ֨;->֫([Ll/֫ܿ֨;)Z

    move-result p1

    iput-boolean p1, p0, Ll/۬ᩳ֨;->ۜۧ:Z

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_0
    iget-object v0, v0, Ll/ۗᩳ֨;->ۗ֫:Ll/۠ᩳ֨;

    .line 149
    invoke-virtual {v0}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 2

    .line 240
    iget-object v0, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    if-eqz v0, :cond_0

    .line 241
    invoke-virtual {v0}, Ll/ۗᩳ֨;->toString()Ljava/lang/String;

    move-result-object v0

    .line 242
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 243
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/io/DataInputStream;)V
    .locals 14

    .line 98
    iget-boolean v0, p0, Ll/ۢܽ֨;->᩹:Z

    const/4 v1, 0x0

    .line 101
    :try_start_0
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    .line 102
    iget-object v3, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v3, v2}, Ll/ۤۧ֨;->᩸(I)Ljava/lang/String;

    move-result-object v3

    .line 105
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 108
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v5

    .line 109
    iget-object v6, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    new-instance v7, Ll/ܶᩴᩳ;

    const/4 v8, 0x7

    invoke-direct {v7, v8}, Ll/ܶᩴᩳ;-><init>(I)V

    invoke-virtual {v6, v5, v7}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v5

    .line 110
    new-instance v6, Ll/᩵ᩳ֨;

    invoke-direct {v6, v3, v2, v4, v5}, Ll/᩵ᩳ֨;-><init>(Ljava/lang/String;IILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5

    .line 122
    :try_start_1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 124
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 125
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v5

    .line 126
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v7

    .line 128
    iget-object v9, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v9, v4}, Ll/ۤۧ֨;->᩸(I)Ljava/lang/String;

    move-result-object v9

    .line 129
    iget-object v10, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    new-instance v11, Ll/ܶᩴᩳ;

    invoke-direct {v11, v8}, Ll/ܶᩴᩳ;-><init>(I)V

    invoke-virtual {v10, v7, v11}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v7

    .line 359
    new-instance v10, Ll/֡ᩳ֨;

    invoke-direct {v10, v9, v4, v5, v7}, Ll/֡ᩳ֨;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 363
    iget-object v4, v6, Ll/᩵ᩳ֨;->᩷:Ljava/util/HashSet;

    invoke-virtual {v4, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    nop

    const-string v2, "Invalid requires table"

    if-eqz v0, :cond_e

    .line 134
    iget-object v3, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v3}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v2, v4}, Ll/ܰۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :cond_0
    :try_start_2
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    if-lez v2, :cond_3

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    .line 144
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 145
    iget-object v5, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v5, v4}, Ll/ۤۧ֨;->᩹(I)Ljava/lang/String;

    move-result-object v5

    .line 146
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v7

    .line 147
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v8

    if-lez v8, :cond_2

    .line 149
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9, v8}, Ljava/util/HashSet;-><init>(I)V

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v8, :cond_1

    .line 151
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v11

    .line 152
    new-instance v12, Ll/᩹ᩳ֨;

    sget-object v13, Ll/۫ۧ֨;->ۜ֫:Ll/۫ۧ֨;

    iget-object v13, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v13, v11}, Ll/ۤۧ֨;->᩸(I)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v11, v13}, Ll/᩹ᩳ֨;-><init>(ILjava/lang/String;)V

    invoke-virtual {v9, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 154
    :cond_1
    invoke-virtual {v6, v4, v7, v5, v9}, Ll/᩵ᩳ֨;->֫(IILjava/lang/String;Ljava/util/HashSet;)V

    goto :goto_3

    .line 156
    :cond_2
    invoke-virtual {v6, v4, v7, v5}, Ll/᩵ᩳ֨;->֫(IILjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catch_1
    const-string v2, "Invalid exports table"

    if-eqz v0, :cond_d

    .line 162
    iget-object v3, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v3}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v2, v4}, Ll/ܰۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    :cond_3
    :try_start_3
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    if-lez v2, :cond_6

    const/4 v3, 0x0

    :goto_4
    if-ge v3, v2, :cond_6

    .line 172
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 173
    iget-object v5, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v5, v4}, Ll/ۤۧ֨;->᩹(I)Ljava/lang/String;

    move-result-object v5

    .line 174
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v7

    .line 175
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v8

    if-lez v8, :cond_5

    .line 177
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9, v8}, Ljava/util/HashSet;-><init>(I)V

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v8, :cond_4

    .line 179
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v11

    .line 180
    new-instance v12, Ll/᩹ᩳ֨;

    sget-object v13, Ll/۫ۧ֨;->ۜ֫:Ll/۫ۧ֨;

    iget-object v13, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v13, v11}, Ll/ۤۧ֨;->᩸(I)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v11, v13}, Ll/᩹ᩳ֨;-><init>(ILjava/lang/String;)V

    invoke-virtual {v9, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 182
    :cond_4
    invoke-virtual {v6, v4, v7, v5, v9}, Ll/᩵ᩳ֨;->ۧ(IILjava/lang/String;Ljava/util/HashSet;)V

    goto :goto_6

    .line 184
    :cond_5
    invoke-virtual {v6, v4, v7, v5}, Ll/᩵ᩳ֨;->ۧ(IILjava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :catch_2
    const-string v2, "Invalid opens table"

    if-eqz v0, :cond_c

    .line 190
    iget-object v3, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v3}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v2, v4}, Ll/ܰۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    :cond_6
    :try_start_4
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    if-lez v2, :cond_7

    const/4 v3, 0x0

    :goto_7
    if-ge v3, v2, :cond_7

    .line 200
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 201
    iget-object v5, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v5, v4}, Ll/ۤۧ֨;->ۚ(I)Ljava/lang/String;

    move-result-object v5

    .line 400
    new-instance v7, Ll/᩶ᩳ֨;

    invoke-direct {v7, v4, v5}, Ll/᩶ᩳ֨;-><init>(ILjava/lang/String;)V

    .line 404
    iget-object v4, v6, Ll/᩵ᩳ֨;->ۢ:Ljava/util/HashSet;

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :catch_3
    nop

    const-string v2, "Invalid uses table"

    if-eqz v0, :cond_b

    .line 207
    iget-object v3, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v3}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v2, v4}, Ll/ܰۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    :cond_7
    :try_start_5
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    if-lez v2, :cond_9

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v2, :cond_9

    .line 217
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    .line 218
    iget-object v5, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v5, v4}, Ll/ۤۧ֨;->ۚ(I)Ljava/lang/String;

    move-result-object v5

    .line 219
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v7

    .line 220
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v7}, Ljava/util/HashSet;-><init>(I)V

    const/4 v9, 0x0

    :goto_9
    if-ge v9, v7, :cond_8

    .line 222
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v10

    .line 223
    new-instance v11, Ll/᩹ᩳ֨;

    sget-object v12, Ll/۫ۧ֨;->ۜ֫:Ll/۫ۧ֨;

    iget-object v12, p0, Ll/ۨܽ֨;->ܽۧ:Ll/ۤۧ֨;

    invoke-virtual {v12, v10}, Ll/ۤۧ֨;->ۚ(I)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v10, v12}, Ll/᩹ᩳ֨;-><init>(ILjava/lang/String;)V

    invoke-virtual {v8, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    .line 225
    :cond_8
    invoke-virtual {v6, v4, v5, v8}, Ll/᩵ᩳ֨;->֫(ILjava/lang/String;Ljava/util/HashSet;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :catch_4
    const-string p1, "Invalid provides table"

    if-eqz v0, :cond_a

    .line 230
    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ll/ܰۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    :cond_9
    invoke-virtual {v6}, Ll/᩵ᩳ֨;->֫()Ll/ۗᩳ֨;

    move-result-object p1

    iput-object p1, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    return-void

    .line 232
    :cond_a
    new-instance v0, Ll/ۙۗۚ;

    iget-object v2, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v2}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, p1, v1}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0

    .line 209
    :cond_b
    new-instance p1, Ll/ۙۗۚ;

    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p1, v0, v2, v1}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1

    .line 192
    :cond_c
    new-instance p1, Ll/ۙۗۚ;

    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p1, v0, v2, v1}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1

    .line 164
    :cond_d
    new-instance p1, Ll/ۙۗۚ;

    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p1, v0, v2, v1}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1

    .line 136
    :cond_e
    new-instance p1, Ll/ۙۗۚ;

    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p1, v0, v2, v1}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1

    :catch_5
    nop

    const-string p1, "Invalid Module attributes table"

    if-eqz v0, :cond_f

    .line 113
    iget-object v0, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v0}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ll/ܰۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 118
    :cond_f
    new-instance v0, Ll/ۙۗۚ;

    iget-object v2, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    invoke-virtual {v2}, Ll/᩶ۗۚ;->ۧ()Ll/ܰۗۚ;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, p1, v1}, Ll/ۙۗۚ;-><init>(Ll/ܰۗۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method

.method public final ᩹()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    if-nez v0, :cond_0

    const-string v0, "N/A"

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ll/ۗᩳ֨;->֨()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 59
    iget-object v1, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    iget-boolean v2, p0, Ll/۬ᩳ֨;->ۜۧ:Z

    const-string v3, " */"

    const/16 v4, 0x20

    if-nez v1, :cond_1

    .line 60
    sget-object v1, Ll/ܶۨۚ;->֡ᩳ:Ll/ܶۨۚ;

    invoke-virtual {v1}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_0

    .line 63
    invoke-virtual {p0}, Ll/۬ᩳ֨;->᩹()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "#?? /* "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p0}, Ll/۬ᩳ֨;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    .line 68
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    .line 65
    :cond_1
    iget-object v1, v1, Ll/ۗᩳ֨;->ۗ֫:Ll/۠ᩳ֨;

    invoke-virtual {v1}, Ll/֨ᩳ֨;->᩻()I

    move-result v1

    sget-object v5, Ll/᩶۬ۚ;->᩺:Ll/᩶۬ۚ;

    invoke-static {v1, v5}, Ll/ۛ۬ۚ;->֫(ILl/᩶۬ۚ;)Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    sget-object v1, Ll/ܶۨۚ;->֡ᩳ:Ll/ܶۨۚ;

    invoke-virtual {v1}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_4

    .line 74
    iget-object v1, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    iget-object v1, v1, Ll/ۗᩳ֨;->ۗ֫:Ll/۠ᩳ֨;

    .line 285
    invoke-virtual {v1}, Ll/֨᩺ۚ;->֫()I

    move-result v1

    .line 75
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    .line 76
    invoke-virtual {v2}, Ll/ۗᩳ֨;->֨()Ljava/lang/String;

    move-result-object v2

    .line 77
    iget-object v4, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    .line 78
    iget-object v4, v4, Ll/ۗᩳ֨;->ۗ֫:Ll/۠ᩳ֨;

    .line 149
    invoke-virtual {v4}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "@"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    .line 78
    iget-object v5, v5, Ll/ۗᩳ֨;->ۗ֫:Ll/۠ᩳ֨;

    .line 149
    invoke-virtual {v5}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object v5

    .line 77
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 78
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_3

    const-string v4, " "

    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_3
    const-string p1, ""

    :goto_1
    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object v3, v4, v1

    const/4 v1, 0x3

    aput-object p1, v4, v1

    const-string p1, "#%d /* %s%s%s"

    .line 74
    invoke-static {p1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 80
    :cond_4
    iget-object v1, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    invoke-virtual {v1}, Ll/ۗᩳ֨;->֨()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    .line 82
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    :cond_5
    iget-object p1, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    .line 78
    iget-object p1, p1, Ll/ۗᩳ֨;->ۗ֫:Ll/۠ᩳ֨;

    .line 149
    invoke-virtual {p1}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6

    const-string p1, "// @"

    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/۬ᩳ֨;->᩻ۧ:Ll/ۗᩳ֨;

    .line 78
    iget-object p1, p1, Ll/ۗᩳ֨;->ۗ֫:Ll/۠ᩳ֨;

    .line 149
    invoke-virtual {p1}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 85
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    :cond_6
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
