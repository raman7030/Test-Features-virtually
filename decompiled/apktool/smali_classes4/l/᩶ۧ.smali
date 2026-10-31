.class public final Ll/᩶ۧ;
.super Ljava/lang/Object;
.source "C9BS"


# instance fields
.field public final ֫:F

.field public final ۧ:I

.field public final ܽ:F

.field public final ᩳ:F


# direct methods
.method public constructor <init>(Landroid/window/BackEvent;)V
    .locals 4

    const-string v0, "backEvent"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    sget-object v0, Ll/᩹ۧ;->֫:Ll/᩹ۧ;

    invoke-virtual {v0, p1}, Ll/᩹ۧ;->ܽ(Landroid/window/BackEvent;)F

    move-result v1

    .line 56
    invoke-virtual {v0, p1}, Ll/᩹ۧ;->ᩳ(Landroid/window/BackEvent;)F

    move-result v2

    .line 57
    invoke-virtual {v0, p1}, Ll/᩹ۧ;->֫(Landroid/window/BackEvent;)F

    move-result v3

    .line 58
    invoke-virtual {v0, p1}, Ll/᩹ۧ;->ۧ(Landroid/window/BackEvent;)I

    move-result p1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput v1, p0, Ll/᩶ۧ;->ܽ:F

    .line 41
    iput v2, p0, Ll/᩶ۧ;->ᩳ:F

    .line 45
    iput v3, p0, Ll/᩶ۧ;->֫:F

    .line 50
    iput p1, p0, Ll/᩶ۧ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BackEventCompat{touchX="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩶ۧ;->ܽ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", touchY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩶ۧ;->ᩳ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩶ۧ;->֫:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", swipeEdge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    iget v1, p0, Ll/᩶ۧ;->ۧ:I

    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()F
    .locals 1

    .line 46
    iget v0, p0, Ll/᩶ۧ;->֫:F

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 50
    iget v0, p0, Ll/᩶ۧ;->ۧ:I

    return v0
.end method

.method public final ܽ()F
    .locals 1

    .line 41
    iget v0, p0, Ll/᩶ۧ;->ᩳ:F

    return v0
.end method
