.class public final Ll/ܺ۠;
.super Ljava/lang/Object;
.source "31KV"


# instance fields
.field public ֫:F

.field public ۜ:I

.field public ۡ:[F

.field public ۢ:I

.field public ۧ:I

.field public ܳ:Z

.field public ܺ:I

.field public ܽ:[F

.field public ܿ:Z

.field public ᩳ:I

.field public ᩷:Ll/ۡ۠;

.field public ᩻:[Ll/ۧ۠;


# direct methods
.method public constructor <init>(Ll/ۡ۠;)V
    .locals 3

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 53
    iput v0, p0, Ll/ܺ۠;->ᩳ:I

    .line 54
    iput v0, p0, Ll/ܺ۠;->ۧ:I

    const/4 v0, 0x0

    .line 55
    iput v0, p0, Ll/ܺ۠;->ۢ:I

    .line 57
    iput-boolean v0, p0, Ll/ܺ۠;->ܳ:Z

    const/16 v1, 0x9

    new-array v2, v1, [F

    .line 60
    iput-object v2, p0, Ll/ܺ۠;->ۡ:[F

    new-array v1, v1, [F

    .line 61
    iput-object v1, p0, Ll/ܺ۠;->ܽ:[F

    const/16 v1, 0x10

    new-array v1, v1, [Ll/ۧ۠;

    .line 65
    iput-object v1, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    .line 66
    iput v0, p0, Ll/ܺ۠;->ۜ:I

    .line 67
    iput v0, p0, Ll/ܺ۠;->ܺ:I

    .line 130
    iput-object p1, p0, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 316
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܺ۠;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 6

    .line 258
    sget-object v0, Ll/ۡ۠;->ۗ:Ll/ۡ۠;

    iput-object v0, p0, Ll/ܺ۠;->᩷:Ll/ۡ۠;

    const/4 v0, 0x0

    .line 259
    iput v0, p0, Ll/ܺ۠;->ۢ:I

    const/4 v1, -0x1

    .line 260
    iput v1, p0, Ll/ܺ۠;->ᩳ:I

    .line 261
    iput v1, p0, Ll/ܺ۠;->ۧ:I

    const/4 v1, 0x0

    .line 262
    iput v1, p0, Ll/ܺ۠;->֫:F

    .line 263
    iput-boolean v0, p0, Ll/ܺ۠;->ܳ:Z

    .line 270
    iget v2, p0, Ll/ܺ۠;->ۜ:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 272
    iget-object v4, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    const/4 v5, 0x0

    aput-object v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 274
    :cond_0
    iput v0, p0, Ll/ܺ۠;->ۜ:I

    .line 276
    iput v0, p0, Ll/ܺ۠;->ܺ:I

    .line 277
    iput-boolean v0, p0, Ll/ܺ۠;->ܿ:Z

    .line 278
    iget-object v0, p0, Ll/ܺ۠;->ܽ:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    return-void
.end method

.method public final ֫(Ll/ۧ۠;)V
    .locals 3

    const/4 v0, 0x0

    .line 178
    :goto_0
    iget v1, p0, Ll/ܺ۠;->ۜ:I

    if-ge v0, v1, :cond_1

    .line 179
    iget-object v1, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 183
    :cond_1
    iget-object v0, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    array-length v2, v0

    if-lt v1, v2, :cond_2

    .line 184
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۧ۠;

    iput-object v0, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    .line 186
    :cond_2
    iget-object v0, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    iget v1, p0, Ll/ܺ۠;->ۜ:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 187
    iput v1, p0, Ll/ܺ۠;->ۜ:I

    return-void
.end method

.method public final ֫(Ll/ܿ۠;F)V
    .locals 3

    .line 227
    iput p2, p0, Ll/ܺ۠;->֫:F

    const/4 p2, 0x1

    .line 228
    iput-boolean p2, p0, Ll/ܺ۠;->ܳ:Z

    .line 232
    iget p2, p0, Ll/ܺ۠;->ۜ:I

    const/4 v0, -0x1

    .line 233
    iput v0, p0, Ll/ܺ۠;->ۧ:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 235
    iget-object v2, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, p0, v0}, Ll/ۧ۠;->֫(Ll/ܿ۠;Ll/ܺ۠;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 237
    :cond_0
    iput v0, p0, Ll/ܺ۠;->ۜ:I

    return-void
.end method

.method public final ֫(Ll/ܿ۠;Ll/ۧ۠;)V
    .locals 4

    .line 215
    iget v0, p0, Ll/ܺ۠;->ۜ:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 217
    iget-object v3, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, Ll/ۧ۠;->֫(Ll/ܿ۠;Ll/ۧ۠;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 219
    :cond_0
    iput v1, p0, Ll/ܺ۠;->ۜ:I

    return-void
.end method

.method public final ۧ(Ll/ۧ۠;)V
    .locals 4

    .line 195
    iget v0, p0, Ll/ܺ۠;->ۜ:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 197
    iget-object v2, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-ge v1, p1, :cond_0

    .line 199
    iget-object p1, p0, Ll/ܺ۠;->᩻:[Ll/ۧ۠;

    add-int/lit8 v2, v1, 0x1

    aget-object v3, p1, v2

    aput-object v3, p1, v1

    move v1, v2

    goto :goto_1

    .line 201
    :cond_0
    iget p1, p0, Ll/ܺ۠;->ۜ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܺ۠;->ۜ:I

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
