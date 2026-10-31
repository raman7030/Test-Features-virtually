.class public final Ll/ܽۖܿ;
.super Ljava/lang/Object;
.source "M701"


# instance fields
.field public ֫:I

.field public final ۧ:[Ll/ۜۖܿ;

.field public ܳ:I

.field public ܽ:I

.field public final ܿ:[Ll/᩸᩷ܿ;

.field public final ᩳ:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x80

    new-array v1, v0, [I

    .line 184
    iput-object v1, p0, Ll/ܽۖܿ;->ᩳ:[I

    new-array v0, v0, [Ll/᩸᩷ܿ;

    .line 185
    iput-object v0, p0, Ll/ܽۖܿ;->ܿ:[Ll/᩸᩷ܿ;

    const/16 v0, 0x20

    new-array v0, v0, [Ll/ۜۖܿ;

    .line 187
    iput-object v0, p0, Ll/ܽۖܿ;->ۧ:[Ll/ۜۖܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۢۖܿ;
    .locals 4

    .line 225
    iget v0, p0, Ll/ܽۖܿ;->֫:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 233
    :cond_0
    new-instance v1, Ll/᩻ۖܿ;

    iget-object v2, p0, Ll/ܽۖܿ;->ᩳ:[I

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iget-object v2, p0, Ll/ܽۖܿ;->ܿ:[Ll/᩸᩷ܿ;

    iget v3, p0, Ll/ܽۖܿ;->֫:I

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/᩸᩷ܿ;

    invoke-direct {v1, v0, v2}, Ll/᩻ۖܿ;-><init>([I[Ll/᩸᩷ܿ;)V

    move-object v0, v1

    .line 227
    :goto_0
    iget v1, p0, Ll/ܽۖܿ;->ܳ:I

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1

    iget-object v2, p0, Ll/ܽۖܿ;->ۧ:[Ll/ۜۖܿ;

    aget-object v2, v2, v1

    invoke-static {v2, v0}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;Ll/ۜۖܿ;)Ll/ۜۖܿ;

    move-result-object v0

    goto :goto_1

    .line 228
    :cond_1
    invoke-static {v0}, Ll/ۢۖܿ;->֫(Ll/ۜۖܿ;)Ll/ۢۖܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILl/᩸᩷ܿ;Z)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    if-lez v1, :cond_5

    const-string v3, "style"

    .line 199
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 200
    iget v3, v0, Ll/ܽۖܿ;->ܽ:I

    int-to-long v3, v3

    int-to-long v5, v1

    add-long/2addr v3, v5

    long-to-int v5, v3

    int-to-long v6, v5

    cmp-long v8, v3, v6

    if-nez v8, :cond_4

    .line 201
    iget v3, v0, Ll/ܽۖܿ;->֫:I

    const/high16 v4, -0x80000000

    iget-object v6, v0, Ll/ܽۖܿ;->ᩳ:[I

    iget-object v7, v0, Ll/ܽۖܿ;->ܿ:[Ll/᩸᩷ܿ;

    if-eqz v3, :cond_0

    if-nez p3, :cond_0

    add-int/lit8 v3, v3, -0x1

    aget-object v3, v7, v3

    invoke-virtual {v3, v2}, Ll/᩸᩷ܿ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 202
    iget v2, v0, Ll/ܽۖܿ;->֫:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v6, v2

    and-int/2addr v4, v3

    const v7, 0x7fffffff

    and-int/2addr v3, v7

    add-int/2addr v3, v1

    or-int v1, v4, v3

    .line 203
    aput v1, v6, v2

    goto :goto_2

    .line 205
    :cond_0
    iget v3, v0, Ll/ܽۖܿ;->֫:I

    const/16 v8, 0x80

    const/4 v9, 0x0

    if-ne v3, v8, :cond_2

    .line 233
    new-instance v8, Ll/᩻ۖܿ;

    invoke-static {v6, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iget v10, v0, Ll/ܽۖܿ;->֫:I

    invoke-static {v7, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ll/᩸᩷ܿ;

    invoke-direct {v8, v3, v10}, Ll/᩻ۖܿ;-><init>([I[Ll/᩸᩷ܿ;)V

    .line 207
    :goto_0
    iget v3, v0, Ll/ܽۖܿ;->ܳ:I

    const/4 v10, 0x0

    iget-object v11, v0, Ll/ܽۖܿ;->ۧ:[Ll/ۜۖܿ;

    if-eqz v3, :cond_1

    add-int/lit8 v12, v3, -0x1

    aget-object v13, v11, v12

    iget v14, v13, Ll/ۜۖܿ;->ۧ:I

    iget v15, v8, Ll/ۜۖܿ;->ۧ:I

    if-ne v14, v15, :cond_1

    .line 208
    new-instance v3, Ll/ۧۖܿ;

    iput v12, v0, Ll/ܽۖܿ;->ܳ:I

    invoke-direct {v3, v13, v8}, Ll/ۧۖܿ;-><init>(Ll/ۜۖܿ;Ll/ۜۖܿ;)V

    .line 209
    iget v8, v0, Ll/ܽۖܿ;->ܳ:I

    aput-object v10, v11, v8

    move-object v8, v3

    goto :goto_0

    :cond_1
    add-int/lit8 v12, v3, 0x1

    .line 211
    iput v12, v0, Ll/ܽۖܿ;->ܳ:I

    aput-object v8, v11, v3

    .line 213
    invoke-static {v7, v10}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 214
    iput v9, v0, Ll/ܽۖܿ;->֫:I

    .line 216
    :cond_2
    iget v3, v0, Ll/ܽۖܿ;->֫:I

    if-eqz p3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    or-int/2addr v1, v4

    aput v1, v6, v3

    add-int/lit8 v1, v3, 0x1

    .line 217
    iput v1, v0, Ll/ܽۖܿ;->֫:I

    aput-object v2, v7, v3

    .line 219
    :goto_2
    iput v5, v0, Ll/ܽۖܿ;->ܽ:I

    return-void

    .line 0
    :cond_4
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    .line 198
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Non-positive syntax run length"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
