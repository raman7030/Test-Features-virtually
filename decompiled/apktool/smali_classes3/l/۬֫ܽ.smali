.class public final Ll/۬֫ܽ;
.super Ljava/lang/Object;
.source "M45G"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ۫:Ll/۬֫ܽ;

.field public static final synthetic ۬:I


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public final ᩶:I

.field public final ᩸:Ll/ܿ۠᩵;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 78
    new-instance v0, Ll/۬֫ܽ;

    const/4 v1, 0x0

    const-string v2, ""

    invoke-direct {v0, v1, v1, v1, v2}, Ll/۬֫ܽ;-><init>(IIILjava/lang/String;)V

    .line 79
    new-instance v0, Ll/۬֫ܽ;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v1, v2}, Ll/۬֫ܽ;-><init>(IIILjava/lang/String;)V

    sput-object v0, Ll/۬֫ܽ;->۫:Ll/۬֫ܽ;

    .line 80
    new-instance v0, Ll/۬֫ܽ;

    invoke-direct {v0, v3, v1, v1, v2}, Ll/۬֫ܽ;-><init>(IIILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput p1, p0, Ll/۬֫ܽ;->᩶:I

    .line 26
    iput p2, p0, Ll/۬֫ܽ;->ۙ:I

    .line 27
    iput p3, p0, Ll/۬֫ܽ;->ۗ:I

    .line 28
    iput-object p4, p0, Ll/۬֫ܽ;->᩹:Ljava/lang/String;

    .line 32
    new-instance p1, Ll/ۗ֫ܽ;

    invoke-direct {p1, p0}, Ll/ۗ֫ܽ;-><init>(Ll/۬֫ܽ;)V

    invoke-static {p1}, Ll/ܳ۠᩵;->֫(Ll/֫᩹᩵;)Ll/ܿ۠᩵;

    move-result-object p1

    iput-object p1, p0, Ll/۬֫ܽ;->᩸:Ll/ܿ۠᩵;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIII)V
    .locals 0

    .line 0
    invoke-direct {p0, p2, p3, p4, p1}, Ll/۬֫ܽ;-><init>(IIILjava/lang/String;)V

    return-void
.end method

.method public static final synthetic ᩻()Ll/۬֫ܽ;
    .locals 1

    .line 24
    sget-object v0, Ll/۬֫ܽ;->۫:Ll/۬֫ܽ;

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 24
    check-cast p1, Ll/۬֫ܽ;

    invoke-virtual {p0, p1}, Ll/۬֫ܽ;->֫(Ll/۬֫ܽ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 60
    instance-of v0, p1, Ll/۬֫ܽ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 65
    :cond_0
    check-cast p1, Ll/۬֫ܽ;

    iget v0, p1, Ll/۬֫ܽ;->᩶:I

    iget v2, p0, Ll/۬֫ܽ;->᩶:I

    if-ne v2, v0, :cond_1

    iget v0, p0, Ll/۬֫ܽ;->ۙ:I

    iget v2, p1, Ll/۬֫ܽ;->ۙ:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/۬֫ܽ;->ۗ:I

    iget p1, p1, Ll/۬֫ܽ;->ۗ:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 71
    iget v0, p0, Ll/۬֫ܽ;->᩶:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 72
    iget v1, p0, Ll/۬֫ܽ;->ۙ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 73
    iget v1, p0, Ll/۬֫ܽ;->ۗ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 40
    iget-object v0, p0, Ll/۬֫ܽ;->᩹:Ljava/lang/String;

    invoke-static {v0}, Ll/ۗۙ᩵;->ۧ(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "-"

    .line 41
    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 45
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Ll/۬֫ܽ;->᩶:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v3, p0, Ll/۬֫ܽ;->ۙ:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/۬֫ܽ;->ۗ:I

    .line 0
    invoke-static {v2, v0, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 25
    iget v0, p0, Ll/۬֫ܽ;->᩶:I

    return v0
.end method

.method public final ֫(Ll/۬֫ܽ;)I
    .locals 2

    const-string v0, "other"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Ll/۬֫ܽ;->᩸:Ll/ܿ۠᩵;

    invoke-interface {v0}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-bigInteger>(...)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/math/BigInteger;

    iget-object p1, p1, Ll/۬֫ܽ;->᩸:Ll/ܿ۠᩵;

    invoke-interface {p1}, Ll/ܿ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/math/BigInteger;

    .line 56
    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 26
    iget v0, p0, Ll/۬֫ܽ;->ۙ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 27
    iget v0, p0, Ll/۬֫ܽ;->ۗ:I

    return v0
.end method
