.class public final Ll/ۨ֨ܽ;
.super Ljava/lang/Object;
.source "Z6QT"

# interfaces
.implements Ll/ۧۚܽ;


# instance fields
.field public final ֫:[J

.field public final ۧ:Z


# direct methods
.method public constructor <init>([JZ)V
    .locals 0

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    iput-object p1, p0, Ll/ۨ֨ܽ;->֫:[J

    .line 222
    iput-boolean p2, p0, Ll/ۨ֨ܽ;->ۧ:Z

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
    .locals 5

    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_1

    .line 228
    invoke-static {p1}, Ll/ۗᩳۘ;->ۧ(I)I

    move-result p1

    .line 230
    iget-object v0, p0, Ll/ۨ֨ܽ;->֫:[J

    array-length v1, v0

    shl-int/lit8 v1, v1, 0x6

    if-ge p1, v1, :cond_1

    ushr-int/lit8 v1, p1, 0x6

    .line 231
    aget-wide v1, v0, v1

    const-wide/16 v3, 0x1

    shl-long/2addr v3, p1

    and-long v0, v1, v3

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 230
    :cond_1
    iget-boolean p1, p0, Ll/ۨ֨ܽ;->ۧ:Z

    return p1
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
