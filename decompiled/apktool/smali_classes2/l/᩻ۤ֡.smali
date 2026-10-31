.class public final Ll/᩻ۤ֡;
.super Ll/۟۬֡;
.source "45MR"

# interfaces
.implements Ll/᩶ۧۚ;


# static fields
.field public static final ۬:Ll/ۘۗ֡;


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    sget-object v0, Ll/ۘۗ֡;->ᩳ֫:Ll/ۘۗ֡;

    sput-object v0, Ll/᩻ۤ֡;->۬:Ll/ۘۗ֡;

    return-void
.end method

.method public constructor <init>(IIILl/֨ۗ֡;)V
    .locals 0

    .line 53
    invoke-direct {p0, p4}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    .line 54
    invoke-static {p1}, Ll/ۧᩳܽ;->ۧ(I)V

    iput p1, p0, Ll/᩻ۤ֡;->ۙ:I

    .line 55
    invoke-static {p2}, Ll/ۧᩳܽ;->ۧ(I)V

    iput p2, p0, Ll/᩻ۤ֡;->ۗ:I

    const/16 p1, -0x80

    if-lt p3, p1, :cond_0

    const/16 p1, 0x7f

    if-gt p3, p1, :cond_0

    .line 56
    iput p3, p0, Ll/᩻ۤ֡;->᩶:I

    return-void

    .line 93
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 94
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p2, p3, p4

    const-string p2, "Invalid literal value: %d. Must be between -128 and 127, inclusive."

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

    invoke-virtual {p0}, Ll/᩻ۤ֡;->֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩻ۤ֡;->ܶ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩻ۤ֡;->᩸()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 61
    iget v0, p0, Ll/᩻ۤ֡;->ۙ:I

    return v0
.end method

.method public final ۡ()I
    .locals 1

    .line 71
    iget v0, p0, Ll/᩻ۤ֡;->᩶:I

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 81
    sget-object v0, Ll/᩻ۤ֡;->۬:Ll/ۘۗ֡;

    return-object v0
.end method

.method public final ܶ()I
    .locals 1

    .line 66
    iget v0, p0, Ll/᩻ۤ֡;->ۗ:I

    return v0
.end method

.method public final ᩸()J
    .locals 2

    .line 76
    iget v0, p0, Ll/᩻ۤ֡;->᩶:I

    int-to-long v0, v0

    return-wide v0
.end method
