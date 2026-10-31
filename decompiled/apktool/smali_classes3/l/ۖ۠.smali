.class public final Ll/ۖ۠;
.super Ll/۬۠;
.source "U1KA"


# instance fields
.field public ֫ۧ:I

.field public ۟֫:Z

.field public ۧۧ:I

.field public ܽۧ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 42
    invoke-direct {p0}, Ll/۬۠;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput v0, p0, Ll/ۖ۠;->֫ۧ:I

    const/4 v1, 0x1

    .line 38
    iput-boolean v1, p0, Ll/ۖ۠;->۟֫:Z

    .line 39
    iput v0, p0, Ll/ۖ۠;->ۧۧ:I

    .line 40
    iput-boolean v0, p0, Ll/ۖ۠;->ܽۧ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[Barrier] "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܶ۠;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 82
    :goto_0
    iget v2, p0, Ll/۬۠;->ܰ֫:I

    if-ge v1, v2, :cond_1

    .line 83
    iget-object v2, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v2, v2, v1

    if-lez v1, :cond_0

    const-string v3, ", "

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 87
    invoke-virtual {v2}, Ll/ܶ۠;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "}"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֨(I)V
    .locals 0

    .line 55
    iput p1, p0, Ll/ۖ۠;->֫ۧ:I

    return-void
.end method

.method public final ֫(Ll/ܶ۠;Ljava/util/HashMap;)V
    .locals 0

    .line 72
    invoke-super {p0, p1, p2}, Ll/۬۠;->֫(Ll/ܶ۠;Ljava/util/HashMap;)V

    .line 73
    check-cast p1, Ll/ۖ۠;

    .line 74
    iget p2, p1, Ll/ۖ۠;->֫ۧ:I

    iput p2, p0, Ll/ۖ۠;->֫ۧ:I

    .line 75
    iget-boolean p2, p1, Ll/ۖ۠;->۟֫:Z

    iput-boolean p2, p0, Ll/ۖ۠;->۟֫:Z

    .line 76
    iget p1, p1, Ll/ۖ۠;->ۧۧ:I

    iput p1, p0, Ll/ۖ۠;->ۧۧ:I

    return-void
.end method

.method public final ֫(Ll/ܿ۠;Z)V
    .locals 13

    .line 119
    iget-object p2, p0, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ܶ۠;->۫:Ll/ۚ۠;

    aput-object v1, p2, v0

    const/4 v2, 0x2

    .line 120
    iget-object v3, p0, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    aput-object v3, p2, v2

    const/4 v4, 0x1

    .line 121
    iget-object v5, p0, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    aput-object v5, p2, v4

    const/4 v6, 0x3

    .line 122
    iget-object v7, p0, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    aput-object v7, p2, v6

    const/4 v8, 0x0

    .line 123
    :goto_0
    array-length v9, p2

    if-ge v8, v9, :cond_0

    .line 124
    aget-object v9, p2, v8

    invoke-virtual {p1, v9}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v10

    iput-object v10, v9, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 126
    :cond_0
    iget v8, p0, Ll/ۖ۠;->֫ۧ:I

    if-ltz v8, :cond_1e

    const/4 v9, 0x4

    if-ge v8, v9, :cond_1e

    .line 127
    aget-object p2, p2, v8

    .line 133
    iget-boolean v8, p0, Ll/ۖ۠;->ܽۧ:Z

    if-nez v8, :cond_1

    .line 134
    invoke-virtual {p0}, Ll/ۖ۠;->ۜ֫()Z

    .line 136
    :cond_1
    iget-boolean v8, p0, Ll/ۖ۠;->ܽۧ:Z

    if-eqz v8, :cond_5

    .line 137
    iput-boolean v0, p0, Ll/ۖ۠;->ܽۧ:Z

    .line 138
    iget p2, p0, Ll/ۖ۠;->֫ۧ:I

    if-eqz p2, :cond_4

    if-ne p2, v4, :cond_2

    goto :goto_1

    :cond_2
    if-eq p2, v2, :cond_3

    if-ne p2, v6, :cond_1e

    .line 142
    :cond_3
    iget-object p2, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget v0, p0, Ll/ܶ۠;->ۙ֫:I

    invoke-virtual {p1, p2, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    .line 143
    iget-object p2, v7, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget v0, p0, Ll/ܶ۠;->ۙ֫:I

    invoke-virtual {p1, p2, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    return-void

    .line 139
    :cond_4
    :goto_1
    iget-object p2, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget v0, p0, Ll/ܶ۠;->᩶֫:I

    invoke-virtual {p1, p2, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    .line 140
    iget-object p2, v5, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget v0, p0, Ll/ܶ۠;->᩶֫:I

    invoke-virtual {p1, p2, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;I)V

    return-void

    :cond_5
    const/4 v8, 0x0

    .line 152
    :goto_2
    iget v9, p0, Ll/۬۠;->ܰ֫:I

    if-ge v8, v9, :cond_b

    .line 153
    iget-object v9, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v9, v9, v8

    .line 154
    iget-boolean v10, p0, Ll/ۖ۠;->۟֫:Z

    if-nez v10, :cond_6

    invoke-virtual {v9}, Ll/ܶ۠;->֫()Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_4

    .line 157
    :cond_6
    iget v10, p0, Ll/ۖ۠;->֫ۧ:I

    if-eqz v10, :cond_7

    if-ne v10, v4, :cond_8

    .line 1966
    :cond_7
    iget-object v11, v9, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v11, v11, v0

    .line 158
    sget-object v12, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v11, v12, :cond_8

    iget-object v11, v9, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v11, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v11, :cond_8

    iget-object v11, v9, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v11, v11, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v11, :cond_8

    goto :goto_3

    :cond_8
    if-eq v10, v2, :cond_9

    if-ne v10, v6, :cond_a

    .line 1975
    :cond_9
    iget-object v10, v9, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v10, v10, v4

    .line 163
    sget-object v11, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v10, v11, :cond_a

    iget-object v10, v9, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v10, v10, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v10, :cond_a

    iget-object v9, v9, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget-object v9, v9, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v9, :cond_a

    :goto_3
    const/4 v8, 0x1

    goto :goto_5

    :cond_a
    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_b
    const/4 v8, 0x0

    .line 170
    :goto_5
    invoke-virtual {v1}, Ll/ۚ۠;->ܳ()Z

    move-result v9

    if-nez v9, :cond_d

    invoke-virtual {v5}, Ll/ۚ۠;->ܳ()Z

    move-result v9

    if-eqz v9, :cond_c

    goto :goto_6

    :cond_c
    const/4 v9, 0x0

    goto :goto_7

    :cond_d
    :goto_6
    const/4 v9, 0x1

    .line 171
    :goto_7
    invoke-virtual {v3}, Ll/ۚ۠;->ܳ()Z

    move-result v10

    if-nez v10, :cond_f

    invoke-virtual {v7}, Ll/ۚ۠;->ܳ()Z

    move-result v10

    if-eqz v10, :cond_e

    goto :goto_8

    :cond_e
    const/4 v10, 0x0

    goto :goto_9

    :cond_f
    :goto_8
    const/4 v10, 0x1

    :goto_9
    if-nez v8, :cond_14

    .line 172
    iget v8, p0, Ll/ۖ۠;->֫ۧ:I

    if-nez v8, :cond_10

    if-nez v9, :cond_13

    :cond_10
    if-ne v8, v2, :cond_11

    if-nez v10, :cond_13

    :cond_11
    if-ne v8, v4, :cond_12

    if-nez v9, :cond_13

    :cond_12
    if-ne v8, v6, :cond_14

    if-eqz v10, :cond_14

    :cond_13
    const/4 v4, 0x1

    goto :goto_a

    :cond_14
    const/4 v4, 0x0

    :goto_a
    if-nez v4, :cond_15

    const/4 v4, 0x4

    goto :goto_b

    :cond_15
    const/4 v4, 0x5

    :goto_b
    const/4 v6, 0x0

    .line 181
    :goto_c
    iget v8, p0, Ll/۬۠;->ܰ֫:I

    if-ge v6, v8, :cond_1a

    .line 182
    iget-object v8, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v8, v8, v6

    .line 183
    iget-boolean v9, p0, Ll/ۖ۠;->۟֫:Z

    if-nez v9, :cond_16

    invoke-virtual {v8}, Ll/ܶ۠;->֫()Z

    move-result v9

    if-nez v9, :cond_16

    goto :goto_10

    .line 186
    :cond_16
    iget-object v9, v8, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    iget v10, p0, Ll/ۖ۠;->֫ۧ:I

    aget-object v9, v9, v10

    invoke-virtual {p1, v9}, Ll/ܿ۠;->֫(Ljava/lang/Object;)Ll/ܺ۠;

    move-result-object v9

    .line 187
    iget-object v8, v8, Ll/ܶ۠;->ۤ:[Ll/ۚ۠;

    iget v10, p0, Ll/ۖ۠;->֫ۧ:I

    aget-object v8, v8, v10

    iput-object v9, v8, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    .line 189
    iget-object v11, v8, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-eqz v11, :cond_17

    iget-object v11, v11, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    if-ne v11, p0, :cond_17

    .line 191
    iget v8, v8, Ll/ۚ۠;->ܿ:I

    goto :goto_d

    :cond_17
    const/4 v8, 0x0

    :goto_d
    if-eqz v10, :cond_19

    if-ne v10, v2, :cond_18

    goto :goto_e

    .line 196
    :cond_18
    iget-object v2, p2, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget v10, p0, Ll/ۖ۠;->ۧۧ:I

    add-int/2addr v10, v8

    .line 1229
    invoke-virtual {p1}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v11

    .line 1230
    invoke-virtual {p1}, Ll/ܿ۠;->ۧ()Ll/ܺ۠;

    move-result-object v12

    .line 1231
    iput v0, v12, Ll/ܺ۠;->ۢ:I

    .line 1232
    invoke-virtual {v11, v2, v9, v12, v10}, Ll/ۧ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;Ll/ܺ۠;I)V

    .line 1233
    invoke-virtual {p1, v11}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    goto :goto_f

    .line 194
    :cond_19
    :goto_e
    iget-object v2, p2, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget v10, p0, Ll/ۖ۠;->ۧۧ:I

    sub-int/2addr v10, v8

    .line 1262
    invoke-virtual {p1}, Ll/ܿ۠;->֫()Ll/ۧ۠;

    move-result-object v11

    .line 1263
    invoke-virtual {p1}, Ll/ܿ۠;->ۧ()Ll/ܺ۠;

    move-result-object v12

    .line 1264
    iput v0, v12, Ll/ܺ۠;->ۢ:I

    .line 1265
    invoke-virtual {v11, v2, v9, v12, v10}, Ll/ۧ۠;->ۧ(Ll/ܺ۠;Ll/ܺ۠;Ll/ܺ۠;I)V

    .line 1266
    invoke-virtual {p1, v11}, Ll/ܿ۠;->֫(Ll/ۧ۠;)V

    .line 203
    :goto_f
    iget-object v2, p2, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget v10, p0, Ll/ۖ۠;->ۧۧ:I

    add-int/2addr v10, v8

    invoke-virtual {p1, v2, v9, v10, v4}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    :goto_10
    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x2

    goto :goto_c

    .line 210
    :cond_1a
    iget p2, p0, Ll/ۖ۠;->֫ۧ:I

    const/16 v2, 0x8

    if-nez p2, :cond_1b

    .line 211
    iget-object p2, v5, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v3, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, p2, v3, v0, v2}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 212
    iget-object p2, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v2, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v2, v2, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v2, v2, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    const/4 v3, 0x4

    invoke-virtual {p1, p2, v2, v0, v3}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 213
    iget-object p2, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v1, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v1, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, p2, v1, v0, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    return-void

    :cond_1b
    const/4 v4, 0x1

    if-ne p2, v4, :cond_1c

    .line 215
    iget-object p2, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v3, v5, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, p2, v3, v0, v2}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 216
    iget-object p2, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v2, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v2, v2, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v2, v2, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    const/4 v3, 0x4

    invoke-virtual {p1, p2, v2, v0, v3}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 217
    iget-object p2, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v1, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v1, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, p2, v1, v0, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    return-void

    :cond_1c
    const/4 v1, 0x2

    if-ne p2, v1, :cond_1d

    .line 219
    iget-object p2, v7, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v1, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, p2, v1, v0, v2}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 220
    iget-object p2, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v1, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget-object v1, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    const/4 v2, 0x4

    invoke-virtual {p1, p2, v1, v0, v2}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 221
    iget-object p2, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v1, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v1, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, p2, v1, v0, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    return-void

    :cond_1d
    const/4 v1, 0x3

    if-ne p2, v1, :cond_1e

    .line 223
    iget-object p2, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v1, v7, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, p2, v1, v0, v2}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 224
    iget-object p2, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v1, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v1, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    const/4 v2, 0x4

    invoke-virtual {p1, p2, v1, v0, v2}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    .line 225
    iget-object p2, v3, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    iget-object v1, p0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget-object v1, v1, Ll/ۚ۠;->᩻:Ll/ܺ۠;

    invoke-virtual {p1, p2, v1, v0, v0}, Ll/ܿ۠;->֫(Ll/ܺ۠;Ll/ܺ۠;II)V

    :cond_1e
    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۖ֫()V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 94
    :goto_0
    iget v2, p0, Ll/۬۠;->ܰ֫:I

    if-ge v1, v2, :cond_4

    .line 95
    iget-object v2, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v2, v2, v1

    .line 96
    iget v3, p0, Ll/ۖ۠;->֫ۧ:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x2

    if-eq v3, v5, :cond_1

    const/4 v5, 0x3

    if-ne v3, v5, :cond_3

    .line 99
    :cond_1
    invoke-virtual {v2, v4, v4}, Ll/ܶ۠;->֫(IZ)V

    goto :goto_2

    .line 97
    :cond_2
    :goto_1
    invoke-virtual {v2, v0, v4}, Ll/ܶ۠;->֫(IZ)V

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ۛ()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Ll/ۖ۠;->ܽۧ:Z

    return v0
.end method

.method public final ۜ֫()Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 254
    :goto_0
    iget v4, p0, Ll/۬۠;->ܰ֫:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-ge v2, v4, :cond_5

    .line 255
    iget-object v4, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v4, v4, v2

    .line 256
    iget-boolean v7, p0, Ll/ۖ۠;->۟֫:Z

    if-nez v7, :cond_0

    invoke-virtual {v4}, Ll/ܶ۠;->֫()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_2

    .line 259
    :cond_0
    iget v7, p0, Ll/ۖ۠;->֫ۧ:I

    if-eqz v7, :cond_1

    if-ne v7, v0, :cond_2

    :cond_1
    invoke-virtual {v4}, Ll/ܶ۠;->ۛ()Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_1

    .line 261
    :cond_2
    iget v7, p0, Ll/ۖ۠;->֫ۧ:I

    if-eq v7, v6, :cond_3

    if-ne v7, v5, :cond_4

    :cond_3
    invoke-virtual {v4}, Ll/ܶ۠;->ۨ()Z

    move-result v4

    if-nez v4, :cond_4

    :goto_1
    const/4 v3, 0x0

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    if-eqz v3, :cond_13

    if-lez v4, :cond_13

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 270
    :goto_3
    iget v4, p0, Ll/۬۠;->ܰ֫:I

    if-ge v1, v4, :cond_10

    .line 271
    iget-object v4, p0, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v4, v4, v1

    .line 272
    iget-boolean v7, p0, Ll/ۖ۠;->۟֫:Z

    if-nez v7, :cond_6

    invoke-virtual {v4}, Ll/ܶ۠;->֫()Z

    move-result v7

    if-nez v7, :cond_6

    goto/16 :goto_5

    :cond_6
    if-nez v3, :cond_b

    .line 276
    iget v3, p0, Ll/ۖ۠;->֫ۧ:I

    if-nez v3, :cond_7

    .line 277
    sget-object v2, Ll/֡۠;->۫:Ll/֡۠;

    invoke-virtual {v4, v2}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚ۠;->ۧ()I

    move-result v2

    goto :goto_4

    :cond_7
    if-ne v3, v0, :cond_8

    .line 279
    sget-object v2, Ll/֡۠;->ۛ:Ll/֡۠;

    invoke-virtual {v4, v2}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚ۠;->ۧ()I

    move-result v2

    goto :goto_4

    :cond_8
    if-ne v3, v6, :cond_9

    .line 281
    sget-object v2, Ll/֡۠;->ۨ:Ll/֡۠;

    invoke-virtual {v4, v2}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚ۠;->ۧ()I

    move-result v2

    goto :goto_4

    :cond_9
    if-ne v3, v5, :cond_a

    .line 283
    sget-object v2, Ll/֡۠;->᩶:Ll/֡۠;

    invoke-virtual {v4, v2}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۚ۠;->ۧ()I

    move-result v2

    :cond_a
    :goto_4
    const/4 v3, 0x1

    .line 287
    :cond_b
    iget v7, p0, Ll/ۖ۠;->֫ۧ:I

    if-nez v7, :cond_c

    .line 288
    sget-object v7, Ll/֡۠;->۫:Ll/֡۠;

    invoke-virtual {v4, v7}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۚ۠;->ۧ()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_5

    :cond_c
    if-ne v7, v0, :cond_d

    .line 290
    sget-object v7, Ll/֡۠;->ۛ:Ll/֡۠;

    invoke-virtual {v4, v7}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۚ۠;->ۧ()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_5

    :cond_d
    if-ne v7, v6, :cond_e

    .line 292
    sget-object v7, Ll/֡۠;->ۨ:Ll/֡۠;

    invoke-virtual {v4, v7}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۚ۠;->ۧ()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_5

    :cond_e
    if-ne v7, v5, :cond_f

    .line 294
    sget-object v7, Ll/֡۠;->᩶:Ll/֡۠;

    invoke-virtual {v4, v7}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۚ۠;->ۧ()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_f
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_3

    .line 297
    :cond_10
    iget v1, p0, Ll/ۖ۠;->ۧۧ:I

    add-int/2addr v2, v1

    .line 298
    iget v1, p0, Ll/ۖ۠;->֫ۧ:I

    if-eqz v1, :cond_12

    if-ne v1, v0, :cond_11

    goto :goto_6

    .line 301
    :cond_11
    invoke-virtual {p0, v2, v2}, Ll/ܶ۠;->ۧ(II)V

    goto :goto_7

    .line 299
    :cond_12
    :goto_6
    invoke-virtual {p0, v2, v2}, Ll/ܶ۠;->֫(II)V

    .line 306
    :goto_7
    iput-boolean v0, p0, Ll/ۖ۠;->ܽۧ:Z

    return v0

    :cond_13
    return v1
.end method

.method public final ۠(I)V
    .locals 0

    .line 230
    iput p1, p0, Ll/ۖ۠;->ۧۧ:I

    return-void
.end method

.method public final ۡ֫()I
    .locals 1

    .line 234
    iget v0, p0, Ll/ۖ۠;->ۧۧ:I

    return v0
.end method

.method public final ۢ֫()I
    .locals 1

    .line 52
    iget v0, p0, Ll/ۖ۠;->֫ۧ:I

    return v0
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 58
    iput-boolean p1, p0, Ll/ۖ۠;->۟֫:Z

    return-void
.end method

.method public final ۨ()Z
    .locals 1

    .line 67
    iget-boolean v0, p0, Ll/ۖ۠;->ܽۧ:Z

    return v0
.end method

.method public final ܺ֫()I
    .locals 3

    .line 238
    iget v0, p0, Ll/ۖ۠;->֫ۧ:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷֫()Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Ll/ۖ۠;->۟֫:Z

    return v0
.end method
