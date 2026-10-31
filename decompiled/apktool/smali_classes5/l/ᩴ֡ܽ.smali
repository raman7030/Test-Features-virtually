.class public final Ll/ᩴ֡ܽ;
.super Ljava/lang/Object;
.source "Z6QT"

# interfaces
.implements Ll/᩹֡ܽ;


# instance fields
.field public final ֫:[J


# direct methods
.method public constructor <init>([J)V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Ll/ᩴ֡ܽ;->֫:[J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴ֡ܽ;)[J
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ֡ܽ;->֫:[J

    return-object p0
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
    invoke-static {p0, p1}, Ll/᩸֡ܽ;->֫(Ll/᩹֡ܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 6

    const/high16 v0, 0x10000

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    return v1

    .line 133
    :cond_0
    invoke-static {p1}, Ll/᩹۠ܽ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ll/᩹۠ܽ;->ᩳ(I)I

    move-result p1

    .line 134
    :cond_1
    iget-object v0, p0, Ll/ᩴ֡ܽ;->֫:[J

    array-length v2, v0

    shl-int/lit8 v2, v2, 0x6

    if-ge p1, v2, :cond_2

    ushr-int/lit8 v2, p1, 0x6

    aget-wide v2, v0, v2

    const-wide/16 v4, 0x1

    shl-long/2addr v4, p1

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩸֡ܽ;->ۧ(Ll/᩹֡ܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
