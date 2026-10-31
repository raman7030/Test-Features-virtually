.class public final Ll/ܿ֡ܺ;
.super Ljava/lang/Object;
.source "SB7W"


# instance fields
.field public ֫:F

.field public ۧ:F

.field public ܽ:F

.field public ᩳ:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 1043
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1044
    iput p1, p0, Ll/ܿ֡ܺ;->ۧ:F

    .line 1045
    iput p2, p0, Ll/ܿ֡ܺ;->ܽ:F

    .line 1046
    iput p3, p0, Ll/ܿ֡ܺ;->ᩳ:F

    .line 1047
    iput p4, p0, Ll/ܿ֡ܺ;->֫:F

    return-void
.end method

.method public constructor <init>(Ll/ܿ֡ܺ;)V
    .locals 1

    .line 1051
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1052
    iget v0, p1, Ll/ܿ֡ܺ;->ۧ:F

    iput v0, p0, Ll/ܿ֡ܺ;->ۧ:F

    .line 1053
    iget v0, p1, Ll/ܿ֡ܺ;->ܽ:F

    iput v0, p0, Ll/ܿ֡ܺ;->ܽ:F

    .line 1054
    iget v0, p1, Ll/ܿ֡ܺ;->ᩳ:F

    iput v0, p0, Ll/ܿ֡ܺ;->ᩳ:F

    .line 1055
    iget p1, p1, Ll/ܿ֡ܺ;->֫:F

    iput p1, p0, Ll/ܿ֡ܺ;->֫:F

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1084
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܿ֡ܺ;->ۧ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܿ֡ܺ;->ܽ:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܿ֡ܺ;->ᩳ:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܿ֡ܺ;->֫:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()F
    .locals 2

    .line 1073
    iget v0, p0, Ll/ܿ֡ܺ;->ۧ:F

    iget v1, p0, Ll/ܿ֡ܺ;->ᩳ:F

    add-float/2addr v0, v1

    return v0
.end method

.method public final ۧ()F
    .locals 2

    .line 1074
    iget v0, p0, Ll/ܿ֡ܺ;->ܽ:F

    iget v1, p0, Ll/ܿ֡ܺ;->֫:F

    add-float/2addr v0, v1

    return v0
.end method
