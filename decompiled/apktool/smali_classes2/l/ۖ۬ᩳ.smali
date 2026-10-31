.class public final Ll/ۖ۬ᩳ;
.super Ljava/lang/Object;
.source "M6PN"


# static fields
.field public static final ܿ:[C


# instance fields
.field public final ֫:[[C

.field public ۧ:J

.field public ܽ:I

.field public final ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [C

    .line 6
    sput-object v0, Ll/ۖ۬ᩳ;->ܿ:[C

    return-void
.end method

.method public constructor <init>(J)V
    .locals 2

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [[C

    .line 7
    iput-object v0, p0, Ll/ۖ۬ᩳ;->֫:[[C

    const-wide/32 v0, 0x10000

    .line 13
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۖ۬ᩳ;->ᩳ:J

    return-void
.end method

.method public static ۧ(I)J
    .locals 4

    const-wide/16 v0, 0x2

    int-to-long v2, p0

    mul-long v2, v2, v0

    const-wide/16 v0, 0x17

    add-long/2addr v2, v0

    const-wide/16 v0, -0x8

    and-long/2addr v0, v2

    return-wide v0
.end method

.method private ܽ(I)[C
    .locals 6

    .line 54
    iget-object v0, p0, Ll/ۖ۬ᩳ;->֫:[[C

    aget-object v1, v0, p1

    .line 55
    iget v2, p0, Ll/ۖ۬ᩳ;->ܽ:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۖ۬ᩳ;->ܽ:I

    aget-object v3, v0, v2

    aput-object v3, v0, p1

    const/4 p1, 0x0

    .line 56
    aput-object p1, v0, v2

    .line 57
    iget-wide v2, p0, Ll/ۖ۬ᩳ;->ۧ:J

    array-length p1, v1

    invoke-static {p1}, Ll/ۖ۬ᩳ;->ۧ(I)J

    move-result-wide v4

    sub-long/2addr v2, v4

    iput-wide v2, p0, Ll/ۖ۬ᩳ;->ۧ:J

    return-object v1
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 50
    iget v0, p0, Ll/ۖ۬ᩳ;->ܽ:I

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, Ll/ۖ۬ᩳ;->ܽ(I)[C

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ll/ۖ۬ᩳ;->ۧ(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫([C)Z
    .locals 9

    .line 39
    array-length v0, p1

    .line 40
    invoke-static {v0}, Ll/ۖ۬ᩳ;->ۧ(I)J

    move-result-wide v1

    const/16 v3, 0x10

    if-lt v0, v3, :cond_1

    const/16 v3, 0x2000

    if-gt v0, v3, :cond_1

    add-int/lit8 v3, v0, -0x1

    and-int/2addr v0, v3

    if-nez v0, :cond_1

    .line 41
    iget v0, p0, Ll/ۖ۬ᩳ;->ܽ:I

    iget-object v3, p0, Ll/ۖ۬ᩳ;->֫:[[C

    array-length v4, v3

    if-eq v0, v4, :cond_1

    iget-wide v4, p0, Ll/ۖ۬ᩳ;->ۧ:J

    iget-wide v6, p0, Ll/ۖ۬ᩳ;->ᩳ:J

    sub-long/2addr v6, v4

    cmp-long v8, v1, v6

    if-lez v8, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v6, v0, 0x1

    .line 43
    iput v6, p0, Ll/ۖ۬ᩳ;->ܽ:I

    aput-object p1, v3, v0

    add-long/2addr v4, v1

    .line 44
    iput-wide v4, p0, Ll/ۖ۬ᩳ;->ۧ:J

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(I)[C
    .locals 2

    .line 31
    iget v0, p0, Ll/ۖ۬ᩳ;->ܽ:I

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 32
    iget-object v1, p0, Ll/ۖ۬ᩳ;->֫:[[C

    aget-object v1, v1, v0

    array-length v1, v1

    if-ne v1, p1, :cond_0

    invoke-direct {p0, v0}, Ll/ۖ۬ᩳ;->ܽ(I)[C

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
