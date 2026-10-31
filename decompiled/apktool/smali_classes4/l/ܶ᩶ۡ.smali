.class public final Ll/ܶ᩶ۡ;
.super Ll/᩸᩶ۡ;
.source "VBK3"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x27d6526f25451cbeL


# instance fields
.field public ᩸:F

.field public ᩹:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ll/᩸᩶ۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getX()D
    .locals 2

    .line 97
    iget v0, p0, Ll/ܶ᩶ۡ;->᩸:F

    float-to-double v0, v0

    return-wide v0
.end method

.method public final getY()D
    .locals 2

    .line 106
    iget v0, p0, Ll/ܶ᩶ۡ;->᩹:F

    float-to-double v0, v0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Point2D.Float["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܶ᩶ۡ;->᩸:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܶ᩶ۡ;->᩹:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(DD)V
    .locals 0

    double-to-float p1, p1

    .line 115
    iput p1, p0, Ll/ܶ᩶ۡ;->᩸:F

    double-to-float p1, p3

    .line 116
    iput p1, p0, Ll/ܶ᩶ۡ;->᩹:F

    return-void
.end method
