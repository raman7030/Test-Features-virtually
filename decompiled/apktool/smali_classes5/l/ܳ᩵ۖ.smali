.class public final Ll/ܳ᩵ۖ;
.super Ll/ۘᩴۖ;
.source "U940"

# interfaces
.implements Ll/ۘ֡ۖ;


# static fields
.field public static final serialVersionUID:J

.field public static final synthetic ۗ:I

.field public static final ۫:Ll/۫֡ۖ;

.field public static final ۬:Ll/ܳ᩵ۖ;


# instance fields
.field public ۙ:I

.field public ᩶:B

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 64
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ܳ᩵ۖ;

    .line 70
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 64
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 670
    new-instance v0, Ll/ܳ᩵ۖ;

    invoke-direct {v0}, Ll/ܳ᩵ۖ;-><init>()V

    sput-object v0, Ll/ܳ᩵ۖ;->۬:Ll/ܳ᩵ۖ;

    .line 678
    new-instance v0, Ll/ۧ᩵ۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/ܳ᩵ۖ;->۫:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 76
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, 0x0

    .line 209
    iput-boolean v0, p0, Ll/ܳ᩵ۖ;->᩹:Z

    const/4 v1, -0x1

    .line 245
    iput-byte v1, p0, Ll/ܳ᩵ۖ;->᩶:B

    .line 77
    iput v0, p0, Ll/ܳ᩵ۖ;->ۙ:I

    return-void
.end method

.method public constructor <init>(Ll/ܽ᩵ۖ;I)V
    .locals 0

    .line 74
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, 0x0

    .line 209
    iput-boolean p1, p0, Ll/ܳ᩵ۖ;->᩹:Z

    .line 228
    iput p1, p0, Ll/ܳ᩵ۖ;->ۙ:I

    const/4 p1, -0x1

    .line 245
    iput-byte p1, p0, Ll/ܳ᩵ۖ;->᩶:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ܳ᩵ۖ;
    .locals 1

    .line 674
    sget-object v0, Ll/ܳ᩵ۖ;->۬:Ll/ܳ᩵ۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/ܽ᩵ۖ;
    .locals 1

    .line 406
    sget-object v0, Ll/ܳ᩵ۖ;->۬:Ll/ܳ᩵ۖ;

    invoke-virtual {v0}, Ll/ܳ᩵ۖ;->toBuilder()Ll/ܽ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ֫(Ll/ܳ᩵ۖ;I)V
    .locals 0

    .line 58
    iput p1, p0, Ll/ܳ᩵ۖ;->ۙ:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܳ᩵ۖ;Z)V
    .locals 0

    .line 58
    iput-boolean p1, p0, Ll/ܳ᩵ۖ;->᩹:Z

    return-void
.end method

.method public static synthetic ۧ(Ll/ܳ᩵ۖ;I)V
    .locals 1

    .line 58
    iget v0, p0, Ll/ܳ᩵ۖ;->᩸:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/ܳ᩵ۖ;->᩸:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 292
    :cond_0
    instance-of v1, p1, Ll/ܳ᩵ۖ;

    if-nez v1, :cond_1

    .line 293
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 295
    :cond_1
    check-cast p1, Ll/ܳ᩵ۖ;

    .line 297
    invoke-virtual {p0}, Ll/ܳ᩵ۖ;->ۢ()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܳ᩵ۖ;->ۢ()Z

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    .line 298
    :cond_2
    invoke-virtual {p0}, Ll/ܳ᩵ۖ;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 224
    iget-boolean v1, p0, Ll/ܳ᩵ۖ;->᩹:Z

    iget-boolean v2, p1, Ll/ܳ᩵ۖ;->᩹:Z

    if-eq v1, v2, :cond_3

    return v3

    .line 302
    :cond_3
    invoke-virtual {p0}, Ll/ܳ᩵ۖ;->ۡ()Z

    move-result v1

    invoke-virtual {p1}, Ll/ܳ᩵ۖ;->ۡ()Z

    move-result v2

    if-eq v1, v2, :cond_4

    return v3

    .line 303
    :cond_4
    invoke-virtual {p0}, Ll/ܳ᩵ۖ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 304
    iget v1, p0, Ll/ܳ᩵ۖ;->ۙ:I

    iget v2, p1, Ll/ܳ᩵ۖ;->ۙ:I

    if-eq v1, v2, :cond_5

    return v3

    .line 306
    :cond_5
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v3

    :cond_6
    return v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 710
    sget-object v0, Ll/ܳ᩵ۖ;->۬:Ll/ܳ᩵ۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 710
    sget-object v0, Ll/ܳ᩵ۖ;->۬:Ll/ܳ᩵ۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 705
    sget-object v0, Ll/ܳ᩵ۖ;->۫:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 3

    .line 270
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 274
    :cond_0
    iget v0, p0, Ll/ܳ᩵ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 276
    invoke-static {v1}, Ll/ܳ᩷ۖ;->ᩳ(I)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 278
    :goto_0
    iget v1, p0, Ll/ܳ᩵ۖ;->᩸:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 279
    iget v1, p0, Ll/ܳ᩵ۖ;->ۙ:I

    .line 280
    invoke-static {v2, v1}, Ll/ܳ᩷ۖ;->ܿ(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 282
    :cond_2
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v1

    add-int/2addr v1, v0

    .line 283
    iput v1, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 312
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 82
    :cond_0
    invoke-static {}, Ll/᩻᩵ۖ;->֫()Ll/ᩳۖۖ;

    move-result-object v0

    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 317
    invoke-virtual {p0}, Ll/ܳ᩵ۖ;->ۢ()Z

    move-result v1

    const/16 v2, 0x35

    const/16 v3, 0x25

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 318
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 224
    iget-boolean v1, p0, Ll/ܳ᩵ۖ;->᩹:Z

    .line 319
    invoke-static {v1}, Ll/ܰᩴۖ;->֫(Z)I

    move-result v1

    add-int/2addr v0, v1

    .line 322
    :cond_1
    invoke-virtual {p0}, Ll/ܳ᩵ۖ;->ۡ()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    .line 323
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 324
    iget v1, p0, Ll/ܳ᩵ۖ;->ۙ:I

    add-int/2addr v0, v1

    :cond_2
    mul-int/lit8 v0, v0, 0x1d

    .line 326
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 327
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 88
    invoke-static {}, Ll/᩻᩵ۖ;->ۧ()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ܳ᩵ۖ;

    const-class v2, Ll/ܽ᩵ۖ;

    .line 89
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 248
    iget-byte v0, p0, Ll/ܳ᩵ۖ;->᩶:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 252
    :cond_1
    iput-byte v1, p0, Ll/ܳ᩵ۖ;->᩶:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 406
    sget-object v0, Ll/ܳ᩵ۖ;->۬:Ll/ܳ᩵ۖ;

    invoke-virtual {v0}, Ll/ܳ᩵ۖ;->toBuilder()Ll/ܽ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 406
    sget-object v0, Ll/ܳ᩵ۖ;->۬:Ll/ܳ᩵ۖ;

    invoke-virtual {v0}, Ll/ܳ᩵ۖ;->toBuilder()Ll/ܽ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 420
    new-instance v0, Ll/ܽ᩵ۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ܽ᩵ۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 58
    invoke-virtual {p0}, Ll/ܳ᩵ۖ;->toBuilder()Ll/ܽ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 58
    invoke-virtual {p0}, Ll/ܳ᩵ۖ;->toBuilder()Ll/ܽ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final toBuilder()Ll/ܽ᩵ۖ;
    .locals 2

    .line 413
    sget-object v0, Ll/ܳ᩵ۖ;->۬:Ll/ܳ᩵ۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 414
    new-instance v0, Ll/ܽ᩵ۖ;

    invoke-direct {v0, v1}, Ll/ܽ᩵ۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ܽ᩵ۖ;

    invoke-direct {v0, v1}, Ll/ܽ᩵ۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ܽ᩵ۖ;->֫(Ll/ܳ᩵ۖ;)V

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 2

    .line 259
    iget v0, p0, Ll/ܳ᩵ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 260
    iget-boolean v0, p0, Ll/ܳ᩵ۖ;->᩹:Z

    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->֫(IZ)V

    .line 262
    :cond_0
    iget v0, p0, Ll/ܳ᩵ۖ;->᩸:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 263
    iget v0, p0, Ll/ܳ᩵ۖ;->ۙ:I

    .line 275
    invoke-virtual {p1, v1, v0}, Ll/ܳ᩷ۖ;->ۧ(II)V

    .line 265
    :cond_1
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 224
    iget-boolean v0, p0, Ll/ܳ᩵ۖ;->᩹:Z

    return v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 234
    iget v0, p0, Ll/ܳ᩵ۖ;->᩸:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Z
    .locals 2

    .line 216
    iget v0, p0, Ll/ܳ᩵ۖ;->᩸:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ll/ܿ᩵ۖ;
    .locals 1

    .line 241
    iget v0, p0, Ll/ܳ᩵ۖ;->ۙ:I

    invoke-static {v0}, Ll/ܿ᩵ۖ;->֫(I)Ll/ܿ᩵ۖ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 242
    sget-object v0, Ll/ܿ᩵ۖ;->ۗ:Ll/ܿ᩵ۖ;

    :cond_0
    return-object v0
.end method
