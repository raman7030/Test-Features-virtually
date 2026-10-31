.class public final Ll/ۛ᩷ۜ;
.super Ljava/lang/Object;
.source "A797"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܳ:B

.field public ܽ:B

.field public ܿ:Ljava/lang/String;

.field public ᩳ:[Ljava/lang/String;

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1265
    invoke-static {}, Ll/۟᩷ۜ;->֫()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ᩷ۜ;->ᩳ:[Ljava/lang/String;

    const/4 v0, 0x1

    .line 1270
    iput-boolean v0, p0, Ll/ۛ᩷ۜ;->᩻:Z

    return-void
.end method

.method public static ֫(Ll/۠ۛ֡;Ljava/lang/String;)Ll/ۛ᩷ۜ;
    .locals 6

    .line 1274
    new-instance v0, Ll/ۛ᩷ۜ;

    invoke-direct {v0}, Ll/ۛ᩷ۜ;-><init>()V

    .line 1275
    invoke-virtual {p0}, Ll/۠ۛ֡;->ۜܽ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/ۛ᩷ۜ;->ܿ:Ljava/lang/String;

    .line 1276
    invoke-virtual {p0}, Ll/۠ۛ֡;->ܳ֫()Ljava/util/List;

    move-result-object v1

    .line 1277
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1278
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Ll/ۛ᩷ۜ;->ᩳ:[Ljava/lang/String;

    .line 1280
    :cond_0
    sget-object v1, Ll/ܺۗ֡;->֫֫:Ll/ܺۗ֡;

    invoke-virtual {p0}, Ll/۠ۛ֡;->ܽ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ܺۗ֡;->֫(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 1281
    iput-byte v2, v0, Ll/ۛ᩷ۜ;->ܽ:B

    .line 350
    :cond_1
    invoke-virtual {p0, v2}, Ll/۠ۛ֡;->ܽ(Z)Ljava/lang/Iterable;

    move-result-object v1

    .line 1283
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ֫ۚ;

    .line 1284
    invoke-static {v3, p1}, Ll/ܶ᩷ۜ;->֫(Ll/ᩴ֫ۚ;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1285
    invoke-static {v3}, Ll/۟᩷ۜ;->֫(Ll/ᩴ֫ۚ;)Z

    move-result v4

    invoke-interface {v3}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v3

    const/4 v5, 0x0

    invoke-direct {v0, v3, v5, v4}, Ll/ۛ᩷ۜ;->֫(IZZ)V

    goto :goto_0

    .line 476
    :cond_3
    invoke-virtual {p0, v2}, Ll/۠ۛ֡;->ܳ(Z)Ljava/lang/Iterable;

    move-result-object p0

    .line 1288
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ֫ۚ;

    .line 1289
    invoke-static {v1, p1}, Ll/ܶ᩷ۜ;->֫(Ll/ᩴ֫ۚ;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 1291
    invoke-static {v1}, Ll/۟᩷ۜ;->֫(Ll/ᩴ֫ۚ;)Z

    move-result v3

    invoke-interface {v1}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v1

    invoke-direct {v0, v1, v2, v3}, Ll/ۛ᩷ۜ;->֫(IZZ)V

    goto :goto_1

    :cond_5
    return-object v0
.end method

.method public static ֫(Ll/ۧۢۜ;)Ll/ۛ᩷ۜ;
    .locals 3

    .line 1299
    new-instance v0, Ll/ۛ᩷ۜ;

    invoke-direct {v0}, Ll/ۛ᩷ۜ;-><init>()V

    .line 1300
    iget-object v1, p0, Ll/ۧۢۜ;->ܽ:Ljava/lang/String;

    iput-object v1, v0, Ll/ۛ᩷ۜ;->ܿ:Ljava/lang/String;

    .line 1301
    iget-object v1, p0, Ll/ۧۢۜ;->ۧ:[Ljava/lang/String;

    invoke-virtual {v1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 1319
    array-length v2, v1

    if-nez v2, :cond_0

    invoke-static {}, Ll/۟᩷ۜ;->֫()[Ljava/lang/String;

    move-result-object v1

    :cond_0
    iput-object v1, v0, Ll/ۛ᩷ۜ;->ᩳ:[Ljava/lang/String;

    .line 1302
    iget v1, p0, Ll/ۧۢۜ;->֫:I

    and-int/lit8 v2, v1, -0x2

    if-nez v2, :cond_2

    int-to-byte v1, v1

    .line 1314
    iput-byte v1, v0, Ll/ۛ᩷ۜ;->ܽ:B

    .line 1303
    iget v1, p0, Ll/ۧۢۜ;->ᩳ:I

    .line 1324
    invoke-static {v1}, Ll/ۛ᩷ۜ;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_1

    int-to-byte v1, v1

    .line 1327
    iput-byte v1, v0, Ll/ۛ᩷ۜ;->ܳ:B

    const/4 v1, 0x1

    .line 1304
    iput-boolean v1, v0, Ll/ۛ᩷ۜ;->ۧ:Z

    .line 1305
    iget-boolean p0, p0, Ll/ۧۢۜ;->ܿ:Z

    iput-boolean p0, v0, Ll/ۛ᩷ۜ;->᩻:Z

    return-object v0

    .line 1325
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid target method flags"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1312
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid class flags"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(IZZ)V
    .locals 0

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    const/4 p2, 0x2

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    const/4 p2, 0x4

    goto :goto_0

    :cond_2
    const/4 p2, 0x3

    .line 1338
    :goto_0
    sget-object p3, Ll/ܺۗ֡;->ܿ֫:Ll/ܺۗ֡;

    invoke-virtual {p3, p1}, Ll/ܺۗ֡;->֫(I)Z

    move-result p3

    if-eqz p3, :cond_3

    const/16 p1, 0x8

    goto :goto_1

    .line 1339
    :cond_3
    sget-object p3, Ll/ܺۗ֡;->ᩳ֫:Ll/ܺۗ֡;

    invoke-virtual {p3, p1}, Ll/ܺۗ֡;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 p1, 0x10

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    or-int/2addr p1, p2

    int-to-byte p1, p1

    .line 1340
    iput-byte p1, p0, Ll/ۛ᩷ۜ;->ܳ:B

    return-void
.end method

.method public static ֫(I)Z
    .locals 3

    and-int/lit8 v0, p0, -0x20

    const/4 v1, 0x0

    if-nez v0, :cond_2

    and-int/lit8 v0, p0, 0x8

    if-eqz v0, :cond_0

    and-int/lit8 v0, p0, 0x10

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    and-int/lit8 v0, p0, 0x7

    if-ltz v0, :cond_2

    const/4 v2, 0x4

    if-gt v0, v2, :cond_2

    if-nez v0, :cond_1

    and-int/lit8 p0, p0, -0x8

    if-nez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    return v1
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩷ۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩷ۜ;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۛ᩷ۜ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۛ᩷ۜ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 1366
    iget-byte v0, p0, Ll/ۛ᩷ۜ;->ܳ:B

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 1378
    iget-byte v0, p0, Ll/ۛ᩷ۜ;->ܳ:B

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Z
    .locals 3

    .line 1360
    iget-byte v0, p0, Ll/ۛ᩷ۜ;->ܳ:B

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final ܳ()Z
    .locals 2

    .line 1345
    iget-byte v0, p0, Ll/ۛ᩷ۜ;->ܽ:B

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 1372
    iget-byte v0, p0, Ll/ۛ᩷ۜ;->ܳ:B

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 1350
    iget-boolean v0, p0, Ll/ۛ᩷ۜ;->ۧ:Z

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 1355
    iget-boolean v0, p0, Ll/ۛ᩷ۜ;->ۧ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۛ᩷ۜ;->᩻:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 1383
    iget-byte v0, p0, Ll/ۛ᩷ۜ;->ܳ:B

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
