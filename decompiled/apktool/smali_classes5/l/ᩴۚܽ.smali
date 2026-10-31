.class public final Ll/ᩴۚܽ;
.super Ljava/lang/Object;
.source "Z6QT"

# interfaces
.implements Ll/ۧۚܽ;


# instance fields
.field public final ֫:[J

.field public final ۧ:Z

.field public final ܽ:[I


# direct methods
.method public constructor <init>([J[IZ)V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    iput-object p1, p0, Ll/ᩴۚܽ;->֫:[J

    .line 151
    iput-object p2, p0, Ll/ᩴۚܽ;->ܽ:[I

    .line 152
    iput-boolean p3, p0, Ll/ᩴۚܽ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final negate()Ll/۟᩵ܽ;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p0}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 9

    .line 157
    iget-object v0, p0, Ll/ᩴۚܽ;->֫:[J

    array-length v1, v0

    shl-int/lit8 v1, v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge p1, v1, :cond_0

    ushr-int/lit8 v1, p1, 0x6

    .line 158
    aget-wide v4, v0, v1

    const-wide/16 v0, 0x1

    shl-long/2addr v0, p1

    and-long/2addr v0, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_0
    const/high16 v0, 0x10000

    .line 160
    iget-boolean v1, p0, Ll/ᩴۚܽ;->ۧ:Z

    if-ge p1, v0, :cond_1

    return v1

    .line 167
    :cond_1
    iget-object v0, p0, Ll/ᩴۚܽ;->ܽ:[I

    array-length v4, v0

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v4, v3

    const/4 v5, 0x0

    :goto_0
    if-gt v5, v4, :cond_4

    add-int v6, v5, v4

    ushr-int/2addr v6, v3

    mul-int/lit8 v7, v6, 0x2

    .line 170
    aget v8, v0, v7

    add-int/2addr v7, v3

    .line 171
    aget v7, v0, v7

    if-ge p1, v8, :cond_2

    add-int/lit8 v4, v6, -0x1

    goto :goto_0

    :cond_2
    if-le p1, v7, :cond_3

    add-int/lit8 v5, v6, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-eq v1, p1, :cond_5

    :goto_2
    return v3

    :cond_5
    return v2
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
