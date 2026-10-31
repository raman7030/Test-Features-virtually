.class public final Ll/۬᩷ܽ;
.super Ljava/lang/Object;
.source "H5AJ"


# instance fields
.field public ֫:I

.field public final ۧ:[Ll/ۨ᩷ܽ;

.field public final synthetic ܳ:Ll/۫᩷ܽ;

.field public ܽ:I

.field public final ܿ:Ll/ܺܺܽ;

.field public final ᩳ:[Ll/ۨ᩷ܽ;

.field public ᩻:Ll/ۨ᩷ܽ;


# direct methods
.method public constructor <init>(Ll/۫᩷ܽ;Ll/᩶᩷ܽ;Z)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬᩷ܽ;->ܳ:Ll/۫᩷ܽ;

    .line 60
    invoke-static {p1}, Ll/۫᩷ܽ;->ۧ(Ll/۫᩷ܽ;)S

    move-result p1

    new-array p1, p1, [Ll/ۨ᩷ܽ;

    iput-object p1, p0, Ll/۬᩷ܽ;->ᩳ:[Ll/ۨ᩷ܽ;

    if-eqz p3, :cond_0

    .line 62
    iput-object p1, p0, Ll/۬᩷ܽ;->ۧ:[Ll/ۨ᩷ܽ;

    iput-object p1, p2, Ll/᩶᩷ܽ;->ܽ:[Ll/ۨ᩷ܽ;

    goto :goto_0

    .line 64
    :cond_0
    iget-object p1, p2, Ll/᩶᩷ܽ;->ܽ:[Ll/ۨ᩷ܽ;

    iput-object p1, p0, Ll/۬᩷ܽ;->ۧ:[Ll/ۨ᩷ܽ;

    .line 65
    :goto_0
    iget-object p1, p2, Ll/᩶᩷ܽ;->ᩳ:Ll/ܺܺܽ;

    iput-object p1, p0, Ll/۬᩷ܽ;->ܿ:Ll/ܺܺܽ;

    const/4 p1, 0x0

    .line 66
    iput p1, p0, Ll/۬᩷ܽ;->֫:I

    .line 67
    iput p1, p0, Ll/۬᩷ܽ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 4

    .line 1100
    iget-object v0, p0, Ll/۬᩷ܽ;->ܳ:Ll/۫᩷ܽ;

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v1

    iget v2, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v2, v2, 0x3

    aget-byte v1, v1, v2

    shl-int/lit8 v1, v1, 0x18

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v2

    iget v3, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v3, v3, 0x2

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v2

    iget v3, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v3, v3, 0x1

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v0

    iget v2, p0, Ll/۬᩷ܽ;->֫:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    add-int/lit8 v2, v2, 0x4

    .line 1102
    iput v2, p0, Ll/۬᩷ܽ;->֫:I

    return v0
.end method

.method public final ۧ()J
    .locals 10

    .line 1127
    iget-object v0, p0, Ll/۬᩷ܽ;->ܳ:Ll/۫᩷ܽ;

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v1

    iget v2, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v2, v2, 0x7

    aget-byte v1, v1, v2

    int-to-long v1, v1

    const/16 v3, 0x38

    shl-long/2addr v1, v3

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v3

    iget v4, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v4, v4, 0x6

    aget-byte v3, v3, v4

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v7, 0x30

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v3

    iget v4, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v4, v4, 0x5

    aget-byte v3, v3, v4

    int-to-long v3, v3

    and-long/2addr v3, v5

    const/16 v7, 0x28

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v3

    iget v4, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v4, v4, 0x4

    aget-byte v3, v3, v4

    int-to-long v3, v3

    and-long/2addr v3, v5

    const/16 v7, 0x20

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v3

    iget v4, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v4, v4, 0x3

    aget-byte v3, v3, v4

    int-to-long v3, v3

    and-long/2addr v3, v5

    const/16 v7, 0x18

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v3

    iget v4, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v4, v4, 0x2

    aget-byte v3, v3, v4

    int-to-long v3, v3

    and-long/2addr v3, v5

    const/16 v7, 0x10

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v3

    iget v4, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v4, v4, 0x1

    aget-byte v3, v3, v4

    int-to-long v3, v3

    and-long/2addr v3, v5

    const/16 v7, 0x8

    shl-long/2addr v3, v7

    or-long/2addr v1, v3

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v0

    iget v3, p0, Ll/۬᩷ܽ;->֫:I

    aget-byte v0, v0, v3

    int-to-long v8, v0

    and-long v4, v8, v5

    or-long v0, v1, v4

    add-int/2addr v3, v7

    .line 1130
    iput v3, p0, Ll/۬᩷ܽ;->֫:I

    return-wide v0
.end method

.method public final ܽ()S
    .locals 3

    .line 1107
    iget-object v0, p0, Ll/۬᩷ܽ;->ܳ:Ll/۫᩷ܽ;

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v1

    iget v2, p0, Ll/۬᩷ܽ;->֫:I

    add-int/lit8 v2, v2, 0x1

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    invoke-static {v0}, Ll/۫᩷ܽ;->֫(Ll/۫᩷ܽ;)[B

    move-result-object v0

    iget v2, p0, Ll/۬᩷ܽ;->֫:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    add-int/lit8 v2, v2, 0x2

    .line 1108
    iput v2, p0, Ll/۬᩷ܽ;->֫:I

    return v0
.end method
