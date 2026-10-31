.class public final Ll/ܿۢܿ;
.super Ljava/lang/Object;
.source "T6ZS"


# instance fields
.field public final ֫:I

.field public ۜ:I

.field public ۡ:I

.field public final synthetic ۢ:Ll/ܳۢܿ;

.field public ۧ:I

.field public final ܳ:[I

.field public ܽ:Z

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ܳۢܿ;IIII)V
    .locals 1

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۢܿ;->ۢ:Ll/ܳۢܿ;

    const/4 v0, -0x1

    .line 161
    iput v0, p0, Ll/ܿۢܿ;->ۧ:I

    .line 165
    iput p2, p0, Ll/ܿۢܿ;->ܿ:I

    .line 166
    iput p3, p0, Ll/ܿۢܿ;->֫:I

    .line 167
    iput p4, p0, Ll/ܿۢܿ;->᩷:I

    .line 168
    iput p5, p0, Ll/ܿۢܿ;->ᩳ:I

    .line 169
    invoke-static {p1}, Ll/ܳۢܿ;->ۜ(Ll/ܳۢܿ;)I

    move-result p1

    iput p1, p0, Ll/ܿۢܿ;->᩻:I

    sub-int/2addr p1, p2

    .line 170
    new-array p1, p1, [I

    iput-object p1, p0, Ll/ܿۢܿ;->ܳ:[I

    .line 171
    iput p2, p0, Ll/ܿۢܿ;->ۡ:I

    iput p2, p0, Ll/ܿۢܿ;->ۜ:I

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 10

    .line 176
    iget-boolean v0, p0, Ll/ܿۢܿ;->ܽ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 177
    :cond_0
    iget-object v0, p0, Ll/ܿۢܿ;->ۢ:Ll/ܳۢܿ;

    invoke-static {v0}, Ll/ܳۢܿ;->ᩳ(Ll/ܳۢܿ;)Z

    move-result v2

    if-nez v2, :cond_9

    invoke-static {v0}, Ll/ܳۢܿ;->᩻(Ll/ܳۢܿ;)Ll/ܿۢܿ;

    move-result-object v2

    if-ne v2, p0, :cond_9

    .line 180
    iget v2, p0, Ll/ܿۢܿ;->ۜ:I

    const/4 v3, 0x0

    iget v4, p0, Ll/ܿۢܿ;->᩻:I

    if-ge v2, v4, :cond_6

    add-int/lit8 v1, v2, 0x1

    .line 181
    iput v1, p0, Ll/ܿۢܿ;->ۜ:I

    .line 182
    invoke-static {v0}, Ll/ܳۢܿ;->ܳ(Ll/ܳۢܿ;)[I

    move-result-object v1

    aget v1, v1, v2

    .line 183
    iget-object v4, p0, Ll/ܿۢܿ;->ܳ:[I

    iget v5, p0, Ll/ܿۢܿ;->ܿ:I

    if-ge v1, v5, :cond_1

    goto :goto_0

    :cond_1
    sub-int/2addr v1, v5

    aget v1, v4, v1

    .line 184
    :goto_0
    iget v6, p0, Ll/ܿۢܿ;->֫:I

    invoke-static {v0}, Ll/ܳۢܿ;->᩷(Ll/ܳۢܿ;)[I

    move-result-object v7

    if-ge v2, v6, :cond_2

    aget v7, v7, v2

    iget v8, p0, Ll/ܿۢܿ;->᩷:I

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    goto :goto_1

    :cond_2
    aget v7, v7, v2

    :goto_1
    if-ge v2, v6, :cond_3

    .line 185
    invoke-static {v0}, Ll/ܳۢܿ;->ܽ(Ll/ܳۢܿ;)[I

    move-result-object v6

    aget v6, v6, v2

    iget v8, p0, Ll/ܿۢܿ;->ᩳ:I

    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    move-result v6

    goto :goto_2

    :cond_3
    invoke-static {v0}, Ll/ܳۢܿ;->ܽ(Ll/ܳۢܿ;)[I

    move-result-object v6

    aget v6, v6, v2

    :goto_2
    if-ge v7, v6, :cond_5

    .line 186
    invoke-static {v0}, Ll/ܳۢܿ;->ۧ(Ll/ܳۢܿ;)I

    move-result v8

    invoke-static {v0}, Ll/ܳۢܿ;->֫(Ll/ܳۢܿ;)I

    move-result v9

    if-eq v8, v9, :cond_5

    invoke-static {v0}, Ll/ܳۢܿ;->ۧ(Ll/ܳۢܿ;)I

    move-result v8

    if-le v6, v8, :cond_5

    invoke-static {v0}, Ll/ܳۢܿ;->֫(Ll/ܳۢܿ;)I

    move-result v8

    if-lt v7, v8, :cond_4

    goto :goto_3

    .line 191
    :cond_4
    iget v8, p0, Ll/ܿۢܿ;->ۡ:I

    add-int/lit8 v9, v8, 0x1

    iput v9, p0, Ll/ܿۢܿ;->ۡ:I

    .line 192
    invoke-static {v0}, Ll/ܳۢܿ;->᩷(Ll/ܳۢܿ;)[I

    move-result-object v9

    aput v7, v9, v8

    .line 193
    invoke-static {v0}, Ll/ܳۢܿ;->ܽ(Ll/ܳۢܿ;)[I

    move-result-object v7

    aput v6, v7, v8

    .line 194
    invoke-static {v0}, Ll/ܳۢܿ;->ܳ(Ll/ܳۢܿ;)[I

    move-result-object v6

    aput v1, v6, v8

    .line 195
    invoke-static {v0}, Ll/ܳۢܿ;->ܿ(Ll/ܳۢܿ;)[Ll/ܶۜܿ;

    move-result-object v1

    invoke-static {v0}, Ll/ܳۢܿ;->ܿ(Ll/ܳۢܿ;)[Ll/ܶۜܿ;

    move-result-object v0

    aget-object v0, v0, v2

    aput-object v0, v1, v8

    sub-int/2addr v2, v5

    .line 196
    aput v8, v4, v2

    return v3

    :cond_5
    :goto_3
    sub-int/2addr v2, v5

    .line 189
    aput v1, v4, v2

    return v3

    .line 200
    :cond_6
    iget v2, p0, Ll/ܿۢܿ;->ۧ:I

    if-gez v2, :cond_7

    iget v2, p0, Ll/ܿۢܿ;->ۡ:I

    iput v2, p0, Ll/ܿۢܿ;->ۧ:I

    .line 201
    :cond_7
    iget v2, p0, Ll/ܿۢܿ;->ۧ:I

    if-ge v2, v4, :cond_8

    .line 202
    invoke-static {v0}, Ll/ܳۢܿ;->ܿ(Ll/ܳۢܿ;)[Ll/ܶۜܿ;

    move-result-object v2

    iget v5, p0, Ll/ܿۢܿ;->ۧ:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Ll/ܿۢܿ;->ۧ:I

    const/4 v7, 0x0

    aput-object v7, v2, v5

    if-ge v6, v4, :cond_8

    return v3

    .line 205
    :cond_8
    iget v2, p0, Ll/ܿۢܿ;->ۡ:I

    invoke-static {v0, v2}, Ll/ܳۢܿ;->֫(Ll/ܳۢܿ;I)V

    .line 206
    invoke-static {v0}, Ll/ܳۢܿ;->ۢ(Ll/ܳۢܿ;)V

    .line 207
    iput-boolean v1, p0, Ll/ܿۢܿ;->ܽ:Z

    .line 208
    invoke-static {v0}, Ll/ܳۢܿ;->ۡ(Ll/ܳۢܿ;)V

    return v1

    .line 178
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Syntax context clip is not active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
