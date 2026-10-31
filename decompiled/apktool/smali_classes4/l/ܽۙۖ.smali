.class public final Ll/ܽۙۖ;
.super Ljava/lang/Object;
.source "8691"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Comparator;


# instance fields
.field public ۙ:I

.field public ᩶:Ll/֫ۙۖ;

.field public ᩸:Ll/֫ۙۖ;

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 74
    iput v0, p0, Ll/ܽۙۖ;->᩹:I

    const/4 v0, 0x0

    .line 75
    iput v0, p0, Ll/ܽۙۖ;->ۙ:I

    return-void
.end method

.method private ᩳ(Ll/֫ۙۖ;)V
    .locals 1

    .line 117
    iget v0, p1, Ll/֫ۙۖ;->ܿ:I

    if-gtz v0, :cond_0

    .line 118
    iget v0, p0, Ll/ܽۙۖ;->᩹:I

    iput v0, p1, Ll/֫ۙۖ;->ܿ:I

    add-int/lit8 v0, v0, 0x1

    .line 119
    iput v0, p0, Ll/ܽۙۖ;->᩹:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 31
    check-cast p1, Ll/֫ۙۖ;

    check-cast p2, Ll/֫ۙۖ;

    .line 97
    iget p1, p1, Ll/֫ۙۖ;->ܿ:I

    iget p2, p2, Ll/֫ۙۖ;->ܿ:I

    sub-int/2addr p1, p2

    return p1
.end method

.method public final getFirst()Ll/֫ۙۖ;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ܽۙۖ;->᩸:Ll/֫ۙۖ;

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 187
    new-instance v0, Ll/ۧۙۖ;

    iget-object v1, p0, Ll/ܽۙۖ;->᩸:Ll/֫ۙۖ;

    invoke-direct {v0, p0, v1}, Ll/ۧۙۖ;-><init>(Ll/ܽۙۖ;Ll/֫ۙۖ;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 233
    iget v0, p0, Ll/ܽۙۖ;->ۙ:I

    if-nez v0, :cond_0

    const-string v0, "[Empty]"

    return-object v0

    .line 236
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 237
    invoke-virtual {p0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v2, v1

    check-cast v2, Ll/ۧۙۖ;

    invoke-virtual {v2}, Ll/ۧۙۖ;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ll/ۧۙۖ;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۙۖ;

    .line 238
    iget-object v3, v2, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v4, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    const-string v5, "\n"

    if-ne v3, v4, :cond_1

    .line 239
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 243
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/ܽۙۖ;
    .locals 4

    .line 88
    new-instance v0, Ll/ܽۙۖ;

    invoke-direct {v0}, Ll/ܽۙۖ;-><init>()V

    .line 89
    invoke-virtual {p0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v2, v1

    check-cast v2, Ll/ۧۙۖ;

    invoke-virtual {v2}, Ll/ۧۙۖ;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ll/ۧۙۖ;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫ۙۖ;

    .line 90
    invoke-virtual {v2, p1}, Ll/֫ۙۖ;->֫(Ll/֨᩹ۖ;)Ll/֫ۙۖ;

    move-result-object v2

    .line 78
    invoke-virtual {v0, v2}, Ll/ܽۙۖ;->ۧ(Ll/֫ۙۖ;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/֫ۙۖ;Ll/֫ۙۖ;)V
    .locals 1

    .line 124
    iget-object v0, p1, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    if-ne v0, p0, :cond_1

    .line 125
    invoke-direct {p0, p2}, Ll/ܽۙۖ;->ᩳ(Ll/֫ۙۖ;)V

    .line 126
    iput-object p0, p2, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    .line 127
    iget v0, p0, Ll/ܽۙۖ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽۙۖ;->ۙ:I

    .line 128
    iget-object v0, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    iput-object v0, p2, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    .line 129
    iput-object p1, p2, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    .line 130
    iget-object v0, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    if-nez v0, :cond_0

    .line 131
    iput-object p2, p0, Ll/ܽۙۖ;->᩶:Ll/֫ۙۖ;

    goto :goto_0

    .line 133
    :cond_0
    iput-object p2, v0, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    .line 135
    :goto_0
    iput-object p2, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    :cond_1
    return-void
.end method

.method public final ֫(Ll/֫ۙۖ;)Z
    .locals 0

    .line 101
    iget-object p1, p1, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 113
    iget v0, p0, Ll/ܽۙۖ;->ۙ:I

    return v0
.end method

.method public final ۧ(Ll/֫ۙۖ;)V
    .locals 2

    .line 171
    invoke-direct {p0, p1}, Ll/ܽۙۖ;->ᩳ(Ll/֫ۙۖ;)V

    .line 172
    iput-object p0, p1, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    .line 173
    iget v0, p0, Ll/ܽۙۖ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽۙۖ;->ۙ:I

    .line 174
    iget-object v0, p0, Ll/ܽۙۖ;->᩸:Ll/֫ۙۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 175
    iput-object p1, p0, Ll/ܽۙۖ;->᩶:Ll/֫ۙۖ;

    iput-object p1, p0, Ll/ܽۙۖ;->᩸:Ll/֫ۙۖ;

    .line 176
    iput-object v1, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    iput-object v1, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    return-void

    .line 178
    :cond_0
    iput-object v1, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    .line 179
    iget-object v0, p0, Ll/ܽۙۖ;->᩶:Ll/֫ۙۖ;

    iput-object v0, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    .line 180
    iput-object p1, v0, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    .line 181
    iput-object p1, p0, Ll/ܽۙۖ;->᩶:Ll/֫ۙۖ;

    return-void
.end method

.method public final ۧ(Ll/֫ۙۖ;Ll/֫ۙۖ;)V
    .locals 1

    .line 140
    iget-object v0, p1, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    if-ne v0, p0, :cond_1

    .line 141
    invoke-direct {p0, p2}, Ll/ܽۙۖ;->ᩳ(Ll/֫ۙۖ;)V

    .line 142
    iput-object p0, p2, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    .line 143
    iget v0, p0, Ll/ܽۙۖ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܽۙۖ;->ۙ:I

    .line 144
    iget-object v0, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    iput-object v0, p2, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    .line 145
    iput-object p1, p2, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    .line 146
    iget-object v0, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    if-nez v0, :cond_0

    .line 147
    iput-object p2, p0, Ll/ܽۙۖ;->᩸:Ll/֫ۙۖ;

    goto :goto_0

    .line 149
    :cond_0
    iput-object p2, v0, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    .line 151
    :goto_0
    iput-object p2, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    :cond_1
    return-void
.end method

.method public final ܽ(Ll/֫ۙۖ;)V
    .locals 3

    .line 191
    iget-object v0, p1, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    if-ne v0, p0, :cond_2

    .line 192
    iget v0, p0, Ll/ܽۙۖ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܽۙۖ;->ۙ:I

    const/4 v0, 0x0

    .line 193
    iput-object v0, p1, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    .line 194
    iget-object v1, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    if-nez v1, :cond_0

    .line 195
    iget-object v2, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    iput-object v2, p0, Ll/ܽۙۖ;->᩸:Ll/֫ۙۖ;

    goto :goto_0

    .line 197
    :cond_0
    iget-object v2, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    iput-object v2, v1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    .line 199
    :goto_0
    iget-object v2, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    if-nez v2, :cond_1

    .line 200
    iput-object v1, p0, Ll/ܽۙۖ;->᩶:Ll/֫ۙۖ;

    goto :goto_1

    .line 202
    :cond_1
    iput-object v1, v2, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    .line 204
    :goto_1
    iput-object v0, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    .line 205
    iput-object v0, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    :cond_2
    return-void
.end method

.method public final ܽ(Ll/֫ۙۖ;Ll/֫ۙۖ;)V
    .locals 1

    .line 210
    iget-object v0, p1, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    if-ne v0, p0, :cond_2

    .line 211
    invoke-direct {p0, p2}, Ll/ܽۙۖ;->ᩳ(Ll/֫ۙۖ;)V

    .line 212
    iput-object p0, p2, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    .line 213
    iget-object v0, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    iput-object v0, p2, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    .line 214
    iget-object v0, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    iput-object v0, p2, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    .line 215
    iget-object v0, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    if-eqz v0, :cond_0

    .line 216
    iput-object p2, v0, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    goto :goto_0

    .line 218
    :cond_0
    iput-object p2, p0, Ll/ܽۙۖ;->᩶:Ll/֫ۙۖ;

    .line 220
    :goto_0
    iget-object v0, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    if-eqz v0, :cond_1

    .line 221
    iput-object p2, v0, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    goto :goto_1

    .line 223
    :cond_1
    iput-object p2, p0, Ll/ܽۙۖ;->᩸:Ll/֫ۙۖ;

    :goto_1
    const/4 p2, 0x0

    .line 225
    iput-object p2, p1, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    .line 226
    iput-object p2, p1, Ll/֫ۙۖ;->ۜ:Ll/֫ۙۖ;

    .line 227
    iput-object p2, p1, Ll/֫ۙۖ;->ܳ:Ll/ܽۙۖ;

    :cond_2
    return-void
.end method
