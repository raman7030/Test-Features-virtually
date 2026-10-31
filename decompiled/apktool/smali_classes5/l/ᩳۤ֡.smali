.class public final Ll/ᩳۤ֡;
.super Ll/۟۬֡;
.source "U5Q7"

# interfaces
.implements Ll/ܶۧۚ;


# static fields
.field public static final ۗ:Ll/ۘۗ֡;


# instance fields
.field public final ۙ:I

.field public final ᩶:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    sget-object v0, Ll/ۘۗ֡;->֫֫:Ll/ۘۗ֡;

    sput-object v0, Ll/ᩳۤ֡;->ۗ:Ll/ۘۗ֡;

    return-void
.end method

.method public constructor <init>(Ll/֨ۗ֡;IJ)V
    .locals 3

    .line 51
    invoke-direct {p0, p1}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    .line 52
    invoke-static {p2}, Ll/ۧᩳܽ;->ۧ(I)V

    iput p2, p0, Ll/ᩳۤ֡;->ۙ:I

    const-wide p1, 0xffffffffffffL

    and-long/2addr p1, p3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 53
    iput-wide p3, p0, Ll/ᩳۤ֡;->᩶:J

    return-void

    .line 117
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 118
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p2, p3, p4

    const-string p2, "Invalid literal value: %d. Low 48 bits must be zeroed out."

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 3

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩳۤ֡;->֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩳۤ֡;->᩸()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 58
    iget v0, p0, Ll/ᩳۤ֡;->ۙ:I

    return v0
.end method

.method public final ۗ()S
    .locals 3

    .line 68
    iget-wide v0, p0, Ll/ᩳۤ֡;->᩶:J

    const/16 v2, 0x30

    ushr-long/2addr v0, v2

    long-to-int v1, v0

    int-to-short v0, v1

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 73
    sget-object v0, Ll/ᩳۤ֡;->ۗ:Ll/ۘۗ֡;

    return-object v0
.end method

.method public final ᩸()J
    .locals 2

    .line 63
    iget-wide v0, p0, Ll/ᩳۤ֡;->᩶:J

    return-wide v0
.end method
