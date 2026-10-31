.class public final Ll/۬ۘܿ;
.super Ljava/lang/Object;
.source "76ZW"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܳ:[I

.field public ܽ:[I

.field public ܿ:I

.field public ᩳ:I

.field public final synthetic ᩻:Ll/۫ۘܿ;


# direct methods
.method public constructor <init>(Ll/۫ۘܿ;)V
    .locals 1

    .line 184
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۘܿ;->᩻:Ll/۫ۘܿ;

    .line 177
    invoke-static {p1}, Ll/۫ۘܿ;->ۧ(Ll/۫ۘܿ;)[Ll/᩶ۘܿ;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Ll/۬ۘܿ;->ܳ:[I

    .line 178
    invoke-static {p1}, Ll/۫ۘܿ;->ۧ(Ll/۫ۘܿ;)[Ll/᩶ۘܿ;

    move-result-object p1

    array-length p1, p1

    const/16 v0, 0x10

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Ll/۬ۘܿ;->ܽ:[I

    return-void
.end method

.method private ֫(I)V
    .locals 3

    .line 236
    iget-object v0, p0, Ll/۬ۘܿ;->ܳ:[I

    aget v1, v0, p1

    iget v2, p0, Ll/۬ۘܿ;->֫:I

    if-ne v1, v2, :cond_0

    return-void

    .line 237
    :cond_0
    aput v2, v0, p1

    .line 238
    iget v0, p0, Ll/۬ۘܿ;->ۧ:I

    iget-object v1, p0, Ll/۬ۘܿ;->ܽ:[I

    array-length v1, v1

    if-ne v0, v1, :cond_1

    .line 239
    iget-object v0, p0, Ll/۬ۘܿ;->᩻:Ll/۫ۘܿ;

    invoke-static {v0}, Ll/۫ۘܿ;->ۧ(Ll/۫ۘܿ;)[Ll/᩶ۘܿ;

    move-result-object v0

    array-length v0, v0

    iget v1, p0, Ll/۬ۘܿ;->ۧ:I

    ushr-int/lit8 v2, v1, 0x1

    add-int/2addr v1, v2

    const/16 v2, 0x10

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 240
    iget-object v1, p0, Ll/۬ۘܿ;->ܽ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/۬ۘܿ;->ܽ:[I

    .line 242
    :cond_1
    iget-object v0, p0, Ll/۬ۘܿ;->ܽ:[I

    iget v1, p0, Ll/۬ۘܿ;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۬ۘܿ;->ۧ:I

    aput p1, v0, v1

    return-void
.end method

.method private ֫(IIIIZ)V
    .locals 8

    if-ne p1, p2, :cond_0

    goto/16 :goto_0

    :cond_0
    add-int v0, p1, p2

    ushr-int/lit8 v0, v0, 0x1

    .line 222
    iget v1, p0, Ll/۬ۘܿ;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/۬ۘܿ;->ᩳ:I

    .line 223
    iget-object v7, p0, Ll/۬ۘܿ;->᩻:Ll/۫ۘܿ;

    invoke-static {v7}, Ll/۫ۘܿ;->ܿ(Ll/۫ۘܿ;)[I

    move-result-object v1

    aget v1, v1, v0

    if-lt v1, p3, :cond_4

    invoke-static {v7}, Ll/۫ۘܿ;->ۜ(Ll/۫ۘܿ;)[I

    move-result-object v1

    aget v1, v1, p1

    .line 224
    invoke-static {v7, v1}, Ll/۫ۘܿ;->ۧ(Ll/۫ۘܿ;I)I

    move-result v1

    if-le v1, p4, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, p0

    move v2, p1

    move v3, v0

    move v4, p3

    move v5, p4

    move v6, p5

    .line 225
    invoke-direct/range {v1 .. v6}, Ll/۬ۘܿ;->֫(IIIIZ)V

    .line 226
    invoke-static {v7}, Ll/۫ۘܿ;->ۜ(Ll/۫ۘܿ;)[I

    move-result-object p1

    aget p1, p1, v0

    .line 227
    invoke-static {v7}, Ll/۫ۘܿ;->ۧ(Ll/۫ۘܿ;)[Ll/᩶ۘܿ;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-virtual {v1, p3, p4}, Ll/᩶ۘܿ;->֫(II)Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz p5, :cond_3

    .line 228
    invoke-static {v7, p1}, Ll/۫ۘܿ;->ۧ(Ll/۫ۘܿ;I)I

    move-result v1

    if-gt v1, p4, :cond_3

    invoke-static {v7, p1}, Ll/۫ۘܿ;->֫(Ll/۫ۘܿ;I)I

    move-result v1

    if-gt p3, v1, :cond_3

    .line 247
    :cond_2
    iget v1, p0, Ll/۬ۘܿ;->ܿ:I

    invoke-static {v7}, Ll/۫ۘܿ;->ᩳ(Ll/۫ۘܿ;)[I

    move-result-object v2

    aget v2, v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Ll/۬ۘܿ;->ܿ:I

    .line 249
    invoke-direct {p0, p1}, Ll/۬ۘܿ;->֫(I)V

    :cond_3
    add-int/lit8 v3, v0, 0x1

    move-object v2, p0

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    .line 231
    invoke-direct/range {v2 .. v7}, Ll/۬ۘܿ;->֫(IIIIZ)V

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶۘܿ;)Ll/ۙۘܿ;
    .locals 11

    .line 189
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܿ()I

    move-result v0

    iget-object v1, p0, Ll/۬ۘܿ;->᩻:Ll/۫ۘܿ;

    invoke-static {v1}, Ll/۫ۘܿ;->ܳ(Ll/۫ۘܿ;)I

    move-result v2

    if-ne v0, v2, :cond_8

    const/4 v0, 0x0

    .line 193
    iput v0, p0, Ll/۬ۘܿ;->ᩳ:I

    iput v0, p0, Ll/۬ۘܿ;->ۧ:I

    const/4 v2, -0x1

    .line 194
    iput v2, p0, Ll/۬ۘܿ;->ܿ:I

    .line 195
    iget v2, p0, Ll/۬ۘܿ;->֫:I

    const v3, 0x7fffffff

    if-ne v2, v3, :cond_0

    .line 196
    iget-object v2, p0, Ll/۬ۘܿ;->ܳ:[I

    invoke-static {v2, v0}, Ljava/util/Arrays;->fill([II)V

    .line 197
    iput v0, p0, Ll/۬ۘܿ;->֫:I

    .line 199
    :cond_0
    iget v2, p0, Ll/۬ۘܿ;->֫:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, p0, Ll/۬ۘܿ;->֫:I

    .line 200
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Ll/ۙۘܿ;->ᩳ()Ll/ۙۘܿ;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v2, 0x0

    .line 202
    :goto_0
    invoke-virtual {p1}, Ll/ܶۘܿ;->ܳ()I

    move-result v4

    if-ge v2, v4, :cond_3

    .line 203
    invoke-virtual {p1, v2}, Ll/ܶۘܿ;->ܿ(I)I

    move-result v8

    .line 204
    invoke-virtual {p1, v2}, Ll/ܶۘܿ;->ᩳ(I)I

    move-result v9

    sub-int v4, v9, v8

    .line 205
    invoke-virtual {p1, v2}, Ll/ܶۘܿ;->ۧ(I)I

    move-result v5

    invoke-virtual {p1, v2}, Ll/ܶۘܿ;->ܽ(I)I

    move-result v6

    sub-int/2addr v5, v6

    if-eq v4, v5, :cond_2

    const/4 v4, 0x1

    const/4 v10, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    const/4 v10, 0x0

    .line 206
    :goto_1
    invoke-static {v1}, Ll/۫ۘܿ;->ۜ(Ll/۫ۘܿ;)[I

    move-result-object v4

    array-length v7, v4

    const/4 v6, 0x0

    move-object v5, p0

    invoke-direct/range {v5 .. v10}, Ll/۬ۘܿ;->֫(IIIIZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 208
    :cond_3
    invoke-virtual {p1}, Ll/ܶۘܿ;->֫()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 209
    invoke-static {v1}, Ll/۫ۘܿ;->ܽ(Ll/۫ۘܿ;)[I

    move-result-object p1

    array-length v2, p1

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v2, :cond_4

    aget v5, p1, v4

    invoke-direct {p0, v5}, Ll/۬ۘܿ;->֫(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 211
    :cond_4
    invoke-static {v1}, Ll/۫ۘܿ;->᩻(Ll/۫ۘܿ;)[I

    move-result-object p1

    array-length v2, p1

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_5

    aget v5, p1, v4

    invoke-direct {p0, v5}, Ll/۬ۘܿ;->֫(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 212
    :cond_5
    iget-object p1, p0, Ll/۬ۘܿ;->ܽ:[I

    iget v2, p0, Ll/۬ۘܿ;->ۧ:I

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->sort([III)V

    .line 213
    invoke-static {v1}, Ll/۫ۘܿ;->֫(Ll/۫ۘܿ;)Ll/᩸ۘܿ;

    move-result-object p1

    sget-object v2, Ll/᩸ۘܿ;->᩹:Ll/᩸ۘܿ;

    if-ne p1, v2, :cond_7

    invoke-static {v1}, Ll/۫ۘܿ;->᩻(Ll/۫ۘܿ;)[I

    move-result-object p1

    array-length p1, p1

    if-eqz p1, :cond_6

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    .line 214
    :cond_7
    :goto_4
    new-instance p1, Ll/ۙۘܿ;

    iget-object v1, p0, Ll/۬ۘܿ;->ܽ:[I

    iget v2, p0, Ll/۬ۘܿ;->ۧ:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iget v2, p0, Ll/۬ۘܿ;->ܿ:I

    invoke-direct {p1, v1, v3, v2, v0}, Ll/ۙۘܿ;-><init>([IZII)V

    return-object p1

    .line 191
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Index and change set lengths differ"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
