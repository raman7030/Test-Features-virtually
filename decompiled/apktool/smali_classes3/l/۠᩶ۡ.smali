.class public final Ll/۠᩶ۡ;
.super Ll/᩸᩶ۡ;
.source "VBK3"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x555bf8ca09a31d5fL


# instance fields
.field public ᩸:D

.field public ᩹:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0

    .line 191
    invoke-direct {p0}, Ll/᩸᩶ۡ;-><init>()V

    .line 192
    iput-wide p1, p0, Ll/۠᩶ۡ;->᩸:D

    .line 193
    iput-wide p3, p0, Ll/۠᩶ۡ;->᩹:D

    return-void
.end method


# virtual methods
.method public final getX()D
    .locals 2

    .line 202
    iget-wide v0, p0, Ll/۠᩶ۡ;->᩸:D

    return-wide v0
.end method

.method public final getY()D
    .locals 2

    .line 211
    iget-wide v0, p0, Ll/۠᩶ۡ;->᩹:D

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Point2D.Double["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/۠᩶ۡ;->᩸:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/۠᩶ۡ;->᩹:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(DD)V
    .locals 0

    .line 220
    iput-wide p1, p0, Ll/۠᩶ۡ;->᩸:D

    .line 221
    iput-wide p3, p0, Ll/۠᩶ۡ;->᩹:D

    return-void
.end method
