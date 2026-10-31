.class public final Ll/ۗۤ֡;
.super Ll/۟۬֡;
.source "X4UE"

# interfaces
.implements Ll/᩷ܽۚ;
.implements Ll/֨֫ۚ;


# static fields
.field public static final ۫:Ll/ۘۗ֡;


# instance fields
.field public final ۗ:I

.field public ۙ:Ll/۠ܽۚ;

.field public final ۬:I

.field public ᩶:Ll/۠ܽۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 46
    sget-object v0, Ll/ۘۗ֡;->᩹֫:Ll/ۘۗ֡;

    sput-object v0, Ll/ۗۤ֡;->۫:Ll/ۘۗ֡;

    return-void
.end method

.method public constructor <init>(Ll/֨ۗ֡;IILl/۠ܽۚ;Ll/۠ܽۚ;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    .line 62
    invoke-static {p2}, Ll/ۧᩳܽ;->ܳ(I)V

    iput p2, p0, Ll/ۗۤ֡;->۬:I

    .line 63
    invoke-static {p3}, Ll/ۧᩳܽ;->ᩳ(I)V

    iput p3, p0, Ll/ۗۤ֡;->ۗ:I

    .line 64
    iput-object p4, p0, Ll/ۗۤ֡;->᩶:Ll/۠ܽۚ;

    .line 65
    iput-object p5, p0, Ll/ۗۤ֡;->ۙ:Ll/۠ܽۚ;

    return-void
.end method


# virtual methods
.method public final getReference()Ll/۠ܽۚ;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۗۤ֡;->᩶:Ll/۠ܽۚ;

    return-object v0
.end method

.method public final ֡()I
    .locals 1

    .line 86
    iget-object v0, p0, Ll/۟۬֡;->᩹:Ll/֨ۗ֡;

    iget v0, v0, Ll/֨ۗ֡;->۬:I

    return v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 3

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/۟᩸᩵;->֫(Ll/ܽۧۚ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۗۤ֡;->getReference()Ll/۠ܽۚ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۗۤ֡;->ۜ()Ll/۠ܽۚ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۗۤ֡;->᩶:Ll/۠ܽۚ;

    .line 107
    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;

    move-result-object v0

    iput-object v0, p0, Ll/ۗۤ֡;->᩶:Ll/۠ܽۚ;

    .line 92
    iget-object v0, p0, Ll/ۗۤ֡;->ۙ:Ll/۠ܽۚ;

    .line 108
    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۤ֡;->ۙ:Ll/۠ܽۚ;

    return-void
.end method

.method public final ۜ()Ll/۠ܽۚ;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۗۤ֡;->ۙ:Ll/۠ܽۚ;

    return-object v0
.end method

.method public final ۠()I
    .locals 1

    .line 97
    iget-object v0, p0, Ll/۟۬֡;->᩹:Ll/֨ۗ֡;

    iget v0, v0, Ll/֨ۗ֡;->۫:I

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 102
    sget-object v0, Ll/ۗۤ֡;->۫:Ll/ۘۗ֡;

    return-object v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 70
    iget v0, p0, Ll/ۗۤ֡;->۬:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 75
    iget v0, p0, Ll/ۗۤ֡;->ۗ:I

    return v0
.end method
