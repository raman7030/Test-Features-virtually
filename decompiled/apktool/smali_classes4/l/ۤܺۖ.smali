.class public final Ll/ۤܺۖ;
.super Ll/ۘᩴۖ;
.source "T9Q9"

# interfaces
.implements Ll/ۘ֡ۖ;


# static fields
.field public static final serialVersionUID:J

.field public static final ۙ:Ll/۫֡ۖ;

.field public static final ᩶:Ll/ۤܺۖ;


# instance fields
.field public ᩸:Ljava/util/List;

.field public ᩹:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 42736
    sget-object v0, Ll/ۜۚۖ;->᩶:Ll/ۜۚۖ;

    const-class v1, Ll/ۤܺۖ;

    .line 42742
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 42736
    invoke-static {v0, v1}, Ll/᩷ۚۖ;->֫(Ll/ۜۚۖ;Ljava/lang/String;)V

    .line 44709
    new-instance v0, Ll/ۤܺۖ;

    invoke-direct {v0}, Ll/ۤܺۖ;-><init>()V

    sput-object v0, Ll/ۤܺۖ;->᩶:Ll/ۤܺۖ;

    .line 44717
    new-instance v0, Ll/᩶ܺۖ;

    invoke-direct {v0}, Ll/ᩴۜۖ;-><init>()V

    sput-object v0, Ll/ۤܺۖ;->ۙ:Ll/۫֡ۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 42748
    invoke-direct {p0}, Ll/ۘᩴۖ;-><init>()V

    const/4 v0, -0x1

    .line 44121
    iput-byte v0, p0, Ll/ۤܺۖ;->᩹:B

    .line 42749
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ۙܺۖ;I)V
    .locals 0

    .line 42746
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;-><init>(Ll/᩶ۘۖ;)V

    const/4 p1, -0x1

    .line 44121
    iput-byte p1, p0, Ll/ۤܺۖ;->᩹:B

    return-void
.end method

.method public static getDefaultInstance()Ll/ۤܺۖ;
    .locals 1

    .line 44713
    sget-object v0, Ll/ۤܺۖ;->᩶:Ll/ۤܺۖ;

    return-object v0
.end method

.method public static newBuilder()Ll/ۙܺۖ;
    .locals 1

    .line 44263
    sget-object v0, Ll/ۤܺۖ;->᩶:Ll/ۤܺۖ;

    invoke-virtual {v0}, Ll/ۤܺۖ;->toBuilder()Ll/ۙܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ֫(Ll/ۤܺۖ;)Ljava/util/List;
    .locals 0

    .line 42730
    iget-object p0, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۤܺۖ;Ljava/util/List;)V
    .locals 0

    .line 42730
    iput-object p1, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 44161
    :cond_0
    instance-of v1, p1, Ll/ۤܺۖ;

    if-nez v1, :cond_1

    .line 44162
    invoke-super {p0, p1}, Ll/ۡۜۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 44164
    :cond_1
    check-cast p1, Ll/ۤܺۖ;

    .line 44088
    iget-object v1, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    iget-object v2, p1, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    .line 44167
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    .line 44168
    :cond_2
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۢ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDefaultInstanceForType()Ll/ۡ֡ۖ;
    .locals 1

    .line 44749
    sget-object v0, Ll/ۤܺۖ;->᩶:Ll/ۤܺۖ;

    return-object v0
.end method

.method public final getDefaultInstanceForType()Ll/᩻֡ۖ;
    .locals 1

    .line 44749
    sget-object v0, Ll/ۤܺۖ;->᩶:Ll/ۤܺۖ;

    return-object v0
.end method

.method public final getParserForType()Ll/۫֡ۖ;
    .locals 1

    .line 44744
    sget-object v0, Ll/ۤܺۖ;->ۙ:Ll/۫֡ۖ;

    return-object v0
.end method

.method public final getSerializedSize()I
    .locals 4

    .line 44143
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 44147
    :goto_0
    iget-object v2, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 44148
    iget-object v2, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    .line 44149
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ֡ۖ;

    const/4 v3, 0x1

    invoke-static {v3, v2}, Ll/ܳ᩷ۖ;->ᩳ(ILl/ۡ֡ۖ;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 44151
    :cond_1
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ֨ۖ;->getSerializedSize()I

    move-result v0

    add-int/2addr v0, v1

    .line 44152
    iput v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 44174
    iget v0, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    .line 42754
    :cond_0
    invoke-static {}, Ll/ۧۖۖ;->ۡ֫()Ll/ᩳۖۖ;

    move-result-object v0

    .line 44178
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x30b

    .line 44103
    iget-object v1, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x1

    const/16 v2, 0x35

    const/16 v3, 0x25

    .line 44181
    invoke-static {v0, v3, v1, v2}, Ll/ۘ᩵ܿ;->֫(IIII)I

    move-result v0

    .line 44088
    iget-object v1, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    .line 44181
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    mul-int/lit8 v0, v0, 0x1d

    .line 44183
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢ֨ۖ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    .line 44184
    iput v1, p0, Ll/ۘۜۖ;->memoizedHashCode:I

    return v1
.end method

.method public final internalGetFieldAccessorTable()Ll/ۢᩴۖ;
    .locals 3

    .line 42760
    invoke-static {}, Ll/ۧۖۖ;->ܺ֫()Ll/ۢᩴۖ;

    move-result-object v0

    const-class v1, Ll/ۤܺۖ;

    const-class v2, Ll/ۙܺۖ;

    .line 42761
    invoke-virtual {v0, v1, v2}, Ll/ۢᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 44124
    iget-byte v0, p0, Ll/ۤܺۖ;->᩹:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 44128
    :cond_1
    iput-byte v1, p0, Ll/ۤܺۖ;->᩹:B

    return v1
.end method

.method public final newBuilderForType()Ll/ۢ֡ۖ;
    .locals 1

    .line 44263
    sget-object v0, Ll/ۤܺۖ;->᩶:Ll/ۤܺۖ;

    invoke-virtual {v0}, Ll/ۤܺۖ;->toBuilder()Ll/ۙܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType()Ll/ܳ֡ۖ;
    .locals 1

    .line 44263
    sget-object v0, Ll/ۤܺۖ;->᩶:Ll/ۤܺۖ;

    invoke-virtual {v0}, Ll/ۤܺۖ;->toBuilder()Ll/ۙܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final newBuilderForType(Ll/ۢۜۖ;)Ll/ܳ֡ۖ;
    .locals 2

    .line 44277
    new-instance v0, Ll/ۙܺۖ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ll/ۙܺۖ;-><init>(Ll/ۢۜۖ;I)V

    return-object v0
.end method

.method public final toBuilder()Ll/ۙܺۖ;
    .locals 2

    .line 44270
    sget-object v0, Ll/ۤܺۖ;->᩶:Ll/ۤܺۖ;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 44271
    new-instance v0, Ll/ۙܺۖ;

    invoke-direct {v0, v1}, Ll/ۙܺۖ;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ll/ۙܺۖ;

    invoke-direct {v0, v1}, Ll/ۙܺۖ;-><init>(I)V

    invoke-virtual {v0, p0}, Ll/ۙܺۖ;->֫(Ll/ۤܺۖ;)V

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ۢ֡ۖ;
    .locals 1

    .line 42730
    invoke-virtual {p0}, Ll/ۤܺۖ;->toBuilder()Ll/ۙܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toBuilder()Ll/ܳ֡ۖ;
    .locals 1

    .line 42730
    invoke-virtual {p0}, Ll/ۤܺۖ;->toBuilder()Ll/ۙܺۖ;

    move-result-object v0

    return-object v0
.end method

.method public final writeTo(Ll/ܳ᩷ۖ;)V
    .locals 3

    const/4 v0, 0x0

    .line 44135
    :goto_0
    iget-object v1, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 44136
    iget-object v1, p0, Ll/ۤܺۖ;->᩸:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ֡ۖ;

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, Ll/ܳ᩷ۖ;->ۧ(ILl/ۡ֡ۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 44138
    :cond_0
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢ֨ۖ;->writeTo(Ll/ܳ᩷ۖ;)V

    return-void
.end method
