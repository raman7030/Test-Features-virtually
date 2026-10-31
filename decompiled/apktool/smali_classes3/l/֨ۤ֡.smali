.class public final Ll/֨ۤ֡;
.super Ll/۟۬֡;
.source "L4S0"

# interfaces
.implements Ll/ۧܽۚ;
.implements Ll/֨֫ۚ;


# static fields
.field public static final ۨ:Ll/ۘۗ֡;


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ۛ:I

.field public final ۤ:I

.field public final ۫:I

.field public final ۬:I

.field public ᩶:Ll/۠ܽۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    sget-object v0, Ll/ۘۗ֡;->᩵֫:Ll/ۘۗ֡;

    sput-object v0, Ll/֨ۤ֡;->ۨ:Ll/ۘۗ֡;

    return-void
.end method

.method public constructor <init>(Ll/֨ۗ֡;IIIIIILl/۠ܽۚ;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    .line 66
    invoke-static {p2}, Ll/ۧᩳܽ;->֫(I)V

    iput p2, p0, Ll/֨ۤ֡;->ۗ:I

    if-lez p2, :cond_0

    .line 67
    invoke-static {p3}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput p3, p0, Ll/֨ۤ֡;->ۙ:I

    const/4 p1, 0x1

    if-le p2, p1, :cond_1

    .line 68
    invoke-static {p4}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_1

    :cond_1
    const/4 p4, 0x0

    :goto_1
    iput p4, p0, Ll/֨ۤ֡;->۬:I

    const/4 p1, 0x2

    if-le p2, p1, :cond_2

    .line 69
    invoke-static {p5}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_2

    :cond_2
    const/4 p5, 0x0

    :goto_2
    iput p5, p0, Ll/֨ۤ֡;->۫:I

    const/4 p1, 0x3

    if-le p2, p1, :cond_3

    .line 70
    invoke-static {p6}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_3

    :cond_3
    const/4 p6, 0x0

    :goto_3
    iput p6, p0, Ll/֨ۤ֡;->ۤ:I

    const/4 p1, 0x4

    if-le p2, p1, :cond_4

    .line 71
    invoke-static {p7}, Ll/ۧᩳܽ;->ܽ(I)V

    goto :goto_4

    :cond_4
    const/4 p7, 0x0

    :goto_4
    iput p7, p0, Ll/֨ۤ֡;->ۛ:I

    .line 72
    iput-object p8, p0, Ll/֨ۤ֡;->᩶:Ll/۠ܽۚ;

    return-void
.end method


# virtual methods
.method public final getReference()Ll/۠ܽۚ;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/֨ۤ֡;->᩶:Ll/۠ܽۚ;

    return-object v0
.end method

.method public final ֡()I
    .locals 1

    .line 138
    iget-object v0, p0, Ll/۟۬֡;->᩹:Ll/֨ۗ֡;

    iget v0, v0, Ll/֨ۗ֡;->۬:I

    return v0
.end method

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

    invoke-virtual {p0}, Ll/֨ۤ֡;->getReference()Ll/۠ܽۚ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 133
    iget-object v0, p0, Ll/֨ۤ֡;->᩶:Ll/۠ܽۚ;

    .line 148
    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;

    move-result-object p1

    iput-object p1, p0, Ll/֨ۤ֡;->᩶:Ll/۠ܽۚ;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 127
    iget v0, p0, Ll/֨ۤ֡;->ۛ:I

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 143
    sget-object v0, Ll/֨ۤ֡;->ۨ:Ll/ۘۗ֡;

    return-object v0
.end method

.method public final ܳ()I
    .locals 1

    .line 117
    iget v0, p0, Ll/֨ۤ֡;->۫:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 112
    iget v0, p0, Ll/֨ۤ֡;->۬:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 122
    iget v0, p0, Ll/֨ۤ֡;->ۤ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 107
    iget v0, p0, Ll/֨ۤ֡;->ۙ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 102
    iget v0, p0, Ll/֨ۤ֡;->ۗ:I

    return v0
.end method
