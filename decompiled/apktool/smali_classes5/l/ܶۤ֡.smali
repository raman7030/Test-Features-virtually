.class public final Ll/ܶۤ֡;
.super Ll/۟۬֡;
.source "S5UP"

# interfaces
.implements Ll/ᩳܽۚ;


# static fields
.field public static final ۨ:Ll/ۘۗ֡;


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ۛ:I

.field public final ۤ:I

.field public final ۫:I

.field public final ۬:I

.field public final ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    sget-object v0, Ll/ۘۗ֡;->ۚ֫:Ll/ۘۗ֡;

    sput-object v0, Ll/ܶۤ֡;->ۨ:Ll/ۘۗ֡;

    return-void
.end method

.method public constructor <init>(Ll/֨ۗ֡;IIIIIII)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    .line 62
    invoke-static {p2}, Ll/ۧᩳܽ;->֫(I)V

    iput p2, p0, Ll/ܶۤ֡;->ۙ:I

    if-lez p2, :cond_0

    .line 63
    invoke-static {p3}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput p3, p0, Ll/ܶۤ֡;->᩶:I

    const/4 p1, 0x1

    if-le p2, p1, :cond_1

    .line 64
    invoke-static {p4}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    iput p4, p0, Ll/ܶۤ֡;->ۗ:I

    const/4 p1, 0x2

    if-le p2, p1, :cond_2

    .line 65
    invoke-static {p5}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_2

    :cond_2
    const/4 p5, 0x0

    :goto_2
    iput p5, p0, Ll/ܶۤ֡;->۬:I

    const/4 p1, 0x3

    if-le p2, p1, :cond_3

    .line 66
    invoke-static {p6}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_3

    :cond_3
    const/4 p6, 0x0

    :goto_3
    iput p6, p0, Ll/ܶۤ֡;->۫:I

    const/4 p1, 0x4

    if-le p2, p1, :cond_4

    .line 67
    invoke-static {p7}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_4

    :cond_4
    const/4 p7, 0x0

    :goto_4
    iput p7, p0, Ll/ܶۤ֡;->ۤ:I

    .line 68
    iput p8, p0, Ll/ܶۤ֡;->ۛ:I

    return-void
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/۟᩸᩵;->֫(Ll/ۤ֫ۚ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܶۤ֡;->᩹()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 98
    iget v0, p0, Ll/ܶۤ֡;->ۤ:I

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 108
    sget-object v0, Ll/ܶۤ֡;->ۨ:Ll/ۘۗ֡;

    return-object v0
.end method

.method public final ܳ()I
    .locals 1

    .line 88
    iget v0, p0, Ll/ܶۤ֡;->۬:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 83
    iget v0, p0, Ll/ܶۤ֡;->ۗ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 93
    iget v0, p0, Ll/ܶۤ֡;->۫:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 78
    iget v0, p0, Ll/ܶۤ֡;->᩶:I

    return v0
.end method

.method public final ᩹()I
    .locals 1

    .line 103
    iget v0, p0, Ll/ܶۤ֡;->ۛ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 73
    iget v0, p0, Ll/ܶۤ֡;->ۙ:I

    return v0
.end method
