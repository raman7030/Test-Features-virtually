.class public final Ll/ᩴ᩶ۚ;
.super Ll/ۘ᩶ۚ;
.source "U58K"


# instance fields
.field public final ۖ:Ll/ۛ᩶ۚ;

.field public ۜ:Ll/۟᩹ۚ;

.field public final ۡ:I

.field public ۢ:Ll/۟᩹ۚ;

.field public ܳ:Ll/ܽ᩶ۚ;

.field public ܺ:I

.field public final ܽ:I

.field public final ܿ:I

.field public ᩳ:I

.field public ᩷:Ll/۟᩹ۚ;

.field public ᩻:Ll/۟᩹ۚ;


# direct methods
.method public constructor <init>(Ll/ۛ᩶ۚ;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    const/high16 v0, 0x90000

    const/4 v1, 0x0

    .line 55
    invoke-direct {p0, v0, v1}, Ll/ۘ᩶ۚ;-><init>(ILl/ۘ᩶ۚ;)V

    .line 128
    iput-object p1, p0, Ll/ᩴ᩶ۚ;->ۖ:Ll/ۛ᩶ۚ;

    .line 129
    iput p2, p0, Ll/ᩴ᩶ۚ;->ܽ:I

    .line 130
    invoke-virtual {p1, p3}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/ᩴ᩶ۚ;->ۡ:I

    .line 131
    invoke-virtual {p1, p4}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/ᩴ᩶ۚ;->ܿ:I

    if-eqz p5, :cond_0

    .line 133
    invoke-virtual {p1, p5}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/ᩴ᩶ۚ;->ܺ:I

    :cond_0
    if-eqz p6, :cond_1

    .line 136
    invoke-virtual {p1, p6}, Ll/ۛ᩶ۚ;->֫(Ljava/lang/Object;)Ll/۫᩶ۚ;

    move-result-object p1

    iget p1, p1, Ll/۬᩶ۚ;->ۧ:I

    iput p1, p0, Ll/ᩴ᩶ۚ;->ᩳ:I

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 158
    iget-object v0, p0, Ll/ᩴ᩶ۚ;->ۖ:Ll/ۛ᩶ۚ;

    if-eqz p4, :cond_0

    .line 159
    iget-object p4, p0, Ll/ᩴ᩶ۚ;->ۢ:Ll/۟᩹ۚ;

    .line 160
    invoke-static {v0, p1, p2, p3, p4}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;ILl/᩺᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩶ۚ;->ۢ:Ll/۟᩹ۚ;

    return-object p1

    .line 163
    :cond_0
    iget-object p4, p0, Ll/ᩴ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    .line 164
    invoke-static {v0, p1, p2, p3, p4}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;ILl/᩺᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ᩴ᩶ۚ;->ۖ:Ll/ۛ᩶ۚ;

    if-eqz p2, :cond_0

    .line 147
    iget-object p2, p0, Ll/ᩴ᩶ۚ;->᩷:Ll/۟᩹ۚ;

    .line 148
    invoke-static {v0, p1, p2}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩶ۚ;->᩷:Ll/۟᩹ۚ;

    return-object p1

    .line 150
    :cond_0
    iget-object p2, p0, Ll/ᩴ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    .line 151
    invoke-static {v0, p1, p2}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    return-object p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۧ᩶ۚ;)V
    .locals 1

    .line 282
    iget-object v0, p0, Ll/ᩴ᩶ۚ;->ܳ:Ll/ܽ᩶ۚ;

    invoke-virtual {p1, v0}, Ll/ۧ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    return-void
.end method

.method public final ֫(Ll/ܽ᩶ۚ;)V
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ᩴ᩶ۚ;->ܳ:Ll/ܽ᩶ۚ;

    iput-object v0, p1, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    .line 173
    iput-object p1, p0, Ll/ᩴ᩶ۚ;->ܳ:Ll/ܽ᩶ۚ;

    return-void
.end method

.method public final ֫(Ll/ᩳ᩶ۚ;)V
    .locals 12

    .line 220
    iget-object v0, p0, Ll/ᩴ᩶ۚ;->ۖ:Ll/ۛ᩶ۚ;

    invoke-virtual {v0}, Ll/ۛ᩶ۚ;->ܿ()I

    move-result v1

    const/16 v2, 0x31

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ge v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/16 v2, 0x1000

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    not-int v2, v2

    .line 223
    iget v5, p0, Ll/ᩴ᩶ۚ;->ܽ:I

    and-int/2addr v2, v5

    invoke-virtual {p1, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget v2, p0, Ll/ᩴ᩶ۚ;->ۡ:I

    invoke-virtual {p1, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget v2, p0, Ll/ᩴ᩶ۚ;->ܿ:I

    invoke-virtual {p1, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 227
    iget v2, p0, Ll/ᩴ᩶ۚ;->ᩳ:I

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    and-int/lit16 v6, v5, 0x1000

    if-eqz v6, :cond_3

    if-eqz v1, :cond_3

    add-int/lit8 v4, v4, 0x1

    .line 233
    :cond_3
    iget v1, p0, Ll/ᩴ᩶ۚ;->ܺ:I

    if-eqz v1, :cond_4

    add-int/lit8 v4, v4, 0x1

    :cond_4
    const/high16 v6, 0x20000

    and-int/2addr v6, v5

    if-eqz v6, :cond_5

    add-int/lit8 v4, v4, 0x1

    .line 239
    :cond_5
    iget-object v6, p0, Ll/ᩴ᩶ۚ;->᩷:Ll/۟᩹ۚ;

    if-eqz v6, :cond_6

    add-int/lit8 v4, v4, 0x1

    .line 242
    :cond_6
    iget-object v6, p0, Ll/ᩴ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    if-eqz v6, :cond_7

    add-int/lit8 v4, v4, 0x1

    .line 245
    :cond_7
    iget-object v6, p0, Ll/ᩴ᩶ۚ;->ۢ:Ll/۟᩹ۚ;

    if-eqz v6, :cond_8

    add-int/lit8 v4, v4, 0x1

    .line 248
    :cond_8
    iget-object v6, p0, Ll/ᩴ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    if-eqz v6, :cond_9

    add-int/lit8 v4, v4, 0x1

    .line 251
    :cond_9
    iget-object v6, p0, Ll/ᩴ᩶ۚ;->ܳ:Ll/ܽ᩶ۚ;

    if-eqz v6, :cond_b

    :goto_3
    if-eqz v6, :cond_a

    add-int/lit8 v3, v3, 0x1

    .line 292
    iget-object v6, v6, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    goto :goto_3

    :cond_a
    add-int/2addr v4, v3

    .line 254
    :cond_b
    invoke-virtual {p1, v4}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    if-eqz v2, :cond_c

    const-string v3, "ConstantValue"

    .line 259
    invoke-virtual {v0, v3}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p1, v3}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v3, 0x2

    .line 260
    invoke-virtual {p1, v3}, Ll/ᩳ᩶ۚ;->ۧ(I)V

    .line 261
    invoke-virtual {p1, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 263
    :cond_c
    invoke-static {v0, v5, v1, p1}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;IILl/ᩳ᩶ۚ;)V

    .line 264
    iget-object v7, p0, Ll/ᩴ᩶ۚ;->᩷:Ll/۟᩹ۚ;

    iget-object v8, p0, Ll/ᩴ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    iget-object v9, p0, Ll/ᩴ᩶ۚ;->ۢ:Ll/۟᩹ۚ;

    iget-object v10, p0, Ll/ᩴ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    iget-object v6, p0, Ll/ᩴ᩶ۚ;->ۖ:Ll/ۛ᩶ۚ;

    move-object v11, p1

    invoke-static/range {v6 .. v11}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/ᩳ᩶ۚ;)V

    .line 271
    iget-object v1, p0, Ll/ᩴ᩶ۚ;->ܳ:Ll/ܽ᩶ۚ;

    if-eqz v1, :cond_d

    .line 272
    invoke-virtual {v1, v0, p1}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;Ll/ᩳ᩶ۚ;)V

    :cond_d
    return-void
.end method

.method public final ۧ()I
    .locals 6

    .line 195
    iget v0, p0, Ll/ᩴ᩶ۚ;->ᩳ:I

    iget-object v1, p0, Ll/ᩴ᩶ۚ;->ۖ:Ll/ۛ᩶ۚ;

    if-eqz v0, :cond_0

    const-string v0, "ConstantValue"

    .line 197
    invoke-virtual {v1, v0}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 200
    :goto_0
    iget v2, p0, Ll/ᩴ᩶ۚ;->ܽ:I

    iget v3, p0, Ll/ᩴ᩶ۚ;->ܺ:I

    invoke-static {v1, v2, v3}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;II)I

    move-result v2

    add-int/2addr v0, v2

    .line 201
    iget-object v2, p0, Ll/ᩴ᩶ۚ;->᩷:Ll/۟᩹ۚ;

    iget-object v3, p0, Ll/ᩴ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    iget-object v4, p0, Ll/ᩴ᩶ۚ;->ۢ:Ll/۟᩹ۚ;

    iget-object v5, p0, Ll/ᩴ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    .line 202
    invoke-static {v2, v3, v4, v5}, Ll/۟᩹ۚ;->֫(Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;)I

    move-result v2

    add-int/2addr v0, v2

    .line 207
    iget-object v2, p0, Ll/ᩴ᩶ۚ;->ܳ:Ll/ܽ᩶ۚ;

    if-eqz v2, :cond_1

    .line 208
    invoke-virtual {v2, v1}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method
