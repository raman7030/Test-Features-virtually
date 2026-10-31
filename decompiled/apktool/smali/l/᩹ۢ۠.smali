.class public final Ll/᩹ۢ۠;
.super Ljava/lang/Object;
.source "F7KC"


# instance fields
.field public final ֫:[I

.field public final ۧ:Ll/ܶ֨۠;

.field public final synthetic ܽ:Ll/᩶ۢ۠;

.field public final ᩳ:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/᩶ۢ۠;Ll/ܶ֨۠;[I)V
    .locals 0

    .line 316
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۢ۠;->ܽ:Ll/᩶ۢ۠;

    .line 317
    iput-object p3, p0, Ll/᩹ۢ۠;->֫:[I

    .line 318
    array-length p1, p3

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/᩹ۢ۠;->ᩳ:[Ljava/lang/Object;

    .line 319
    iput-object p2, p0, Ll/᩹ۢ۠;->ۧ:Ll/ܶ֨۠;

    return-void
.end method

.method private ܽ(I)V
    .locals 5

    .line 323
    iget-object v0, p0, Ll/᩹ۢ۠;->֫:[I

    if-lez p1, :cond_0

    array-length v1, v0

    if-ge p1, v1, :cond_0

    return-void

    .line 325
    :cond_0
    iget-object v1, p0, Ll/᩹ۢ۠;->ܽ:Ll/᩶ۢ۠;

    invoke-static {v1}, Ll/᩶ۢ۠;->֫(Ll/᩶ۢ۠;)Ll/᩶ۜ۠;

    move-result-object v2

    invoke-static {v1}, Ll/᩶ۢ۠;->֫(Ll/᩶ۢ۠;)Ll/᩶ۜ۠;

    move-result-object v1

    iget-object v1, v1, Ll/᩶ۜ۠;->ۜ:Ll/ᩳ᩶۠;

    .line 326
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object p1, v3, v1

    const/4 p1, 0x2

    aput-object v0, v3, p1

    const-string p1, "bad.const.pool.index"

    .line 325
    invoke-virtual {v2, p1, v3}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 333
    invoke-direct {p0, p1}, Ll/᩹ۢ۠;->ܽ(I)V

    iget-object v0, p0, Ll/᩹ۢ۠;->֫:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(Ljava/util/BitSet;I)Ljava/lang/Object;
    .locals 4

    .line 338
    invoke-direct {p0, p2}, Ll/᩹ۢ۠;->ܽ(I)V

    iget-object v0, p0, Ll/᩹ۢ۠;->ᩳ:[Ljava/lang/Object;

    aget-object v1, v0, p2

    if-eqz v1, :cond_0

    return-object v1

    .line 342
    :cond_0
    invoke-virtual {p0, p2}, Ll/᩹ۢ۠;->ۧ(I)I

    move-result v1

    .line 343
    invoke-virtual {p1, v1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    iget-object v1, p0, Ll/᩹ۢ۠;->ܽ:Ll/᩶ۢ۠;

    if-eqz p1, :cond_1

    .line 346
    invoke-virtual {p0, p2}, Ll/᩹ۢ۠;->ۧ(I)I

    move-result p1

    invoke-virtual {p0, p2}, Ll/᩹ۢ۠;->֫(I)I

    move-result v2

    iget-object v3, p0, Ll/᩹ۢ۠;->ۧ:Ll/ܶ֨۠;

    invoke-static {v1, v3, p1, v2}, Ll/᩶ۢ۠;->֫(Ll/᩶ۢ۠;Ll/ܶ֨۠;II)Ljava/lang/Object;

    move-result-object p1

    .line 347
    aput-object p1, v0, p2

    return-object p1

    .line 344
    :cond_1
    invoke-static {v1}, Ll/᩶ۢ۠;->֫(Ll/᩶ۢ۠;)Ll/᩶ۜ۠;

    move-result-object p1

    invoke-virtual {p0, p2}, Ll/᩹ۢ۠;->ۧ(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p2}, Ll/᩹ۢ۠;->֫(I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p2, v1, v0

    const-string p2, "unexpected.const.pool.tag.at"

    invoke-virtual {p1, p2, v1}, Ll/᩶ۜ۠;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ll/᩸ۘ֨;

    move-result-object p1

    throw p1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 353
    iget-object v0, p0, Ll/᩹ۢ۠;->ۧ:Ll/ܶ֨۠;

    iget-object v0, v0, Ll/ܶ֨۠;->֫:[B

    invoke-virtual {p0, p1}, Ll/᩹ۢ۠;->֫(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    aget-byte p1, v0, p1

    return p1
.end method
