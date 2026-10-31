.class public final Ll/֫ᩳܽ;
.super Ljava/lang/Object;
.source "T19G"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:S


# direct methods
.method public constructor <init>(SIII)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-short p1, p0, Ll/֫ᩳܽ;->ᩳ:S

    .line 17
    iput p2, p0, Ll/֫ᩳܽ;->ۧ:I

    .line 18
    iput p3, p0, Ll/֫ᩳܽ;->֫:I

    .line 19
    iput p4, p0, Ll/֫ᩳܽ;->ܽ:I

    return-void
.end method

.method public static ֫(Ll/ۛۜܽ;)Ll/֫ᩳܽ;
    .locals 4

    .line 42
    invoke-virtual {p0}, Ll/ۛۜܽ;->ۧ()I

    move-result v0

    .line 43
    invoke-virtual {p0}, Ll/ۛۜܽ;->֫()I

    move-result v1

    const/16 v2, 0x8

    if-ge v1, v2, :cond_0

    .line 44
    new-instance p0, Ll/֫ᩳܽ;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v2, v0}, Ll/֫ᩳܽ;-><init>(SIII)V

    return-object p0

    .line 45
    :cond_0
    invoke-virtual {p0}, Ll/ۛۜܽ;->ܿ()S

    move-result v1

    .line 46
    invoke-virtual {p0}, Ll/ۛۜܽ;->᩻()I

    move-result v2

    .line 47
    invoke-virtual {p0}, Ll/ۛۜܽ;->ᩳ()I

    move-result p0

    .line 48
    new-instance v3, Ll/֫ᩳܽ;

    invoke-direct {v3, v1, v2, p0, v0}, Ll/֫ᩳܽ;-><init>(SIII)V

    return-object v3
.end method

.method public static ֫(Ll/᩻ۖܽ;)Ll/֫ᩳܽ;
    .locals 6

    .line 62
    invoke-virtual {p0}, Ll/᩻ۖܽ;->֫()I

    move-result v0

    .line 63
    invoke-virtual {p0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v1

    int-to-long v3, v0

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x8

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    .line 64
    new-instance p0, Ll/֫ᩳܽ;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v2, v0}, Ll/֫ᩳܽ;-><init>(SIII)V

    return-object p0

    .line 129
    :cond_0
    invoke-virtual {p0}, Ll/᩻ۖܽ;->ۛۧ()I

    move-result v1

    int-to-short v1, v1

    .line 66
    invoke-virtual {p0}, Ll/᩻ۖܽ;->ۛۧ()I

    move-result v2

    .line 67
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readInt()I

    move-result p0

    .line 68
    new-instance v3, Ll/֫ᩳܽ;

    invoke-direct {v3, v1, v2, p0, v0}, Ll/֫ᩳܽ;-><init>(SIII)V

    return-object v3
.end method

.method public static ۧ(Ll/۬ۜܽ;)Ll/֫ᩳܽ;
    .locals 6

    .line 52
    invoke-virtual {p0}, Ll/۬ۜܽ;->֫()I

    move-result v0

    .line 53
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0x8

    cmp-long v5, v1, v3

    if-gez v5, :cond_0

    .line 54
    new-instance p0, Ll/֫ᩳܽ;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v2, v0}, Ll/֫ᩳܽ;-><init>(SIII)V

    return-object p0

    .line 55
    :cond_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->readShort()S

    move-result v1

    .line 56
    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v2

    .line 57
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    .line 58
    new-instance v3, Ll/֫ᩳܽ;

    invoke-direct {v3, v1, v2, p0, v0}, Ll/֫ᩳܽ;-><init>(SIII)V

    return-object v3
.end method


# virtual methods
.method public final ֫(I)V
    .locals 5

    .line 31
    iget-short v0, p0, Ll/֫ᩳܽ;->ᩳ:S

    if-ne v0, p1, :cond_0

    return-void

    .line 32
    :cond_0
    new-instance v1, Ljava/io/IOException;

    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    iget v2, p0, Ll/֫ᩳܽ;->ܽ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object v0, v3, p1

    const/4 p1, 0x2

    aput-object v2, v3, p1

    const-string p1, "Invalid chunk type: expected=0x%04x, got=0x%04x, offset=0x%04x"

    .line 32
    invoke-static {p1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(Ll/۬ۜܽ;)V
    .locals 2

    .line 76
    iget v0, p0, Ll/֫ᩳܽ;->ܽ:I

    iget v1, p0, Ll/֫ᩳܽ;->֫:I

    add-int/2addr v0, v1

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    return-void
.end method
