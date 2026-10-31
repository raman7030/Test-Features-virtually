.class public Ll/۫ܺۡ;
.super Ljava/lang/Object;
.source "34K8"


# instance fields
.field public ֫:F

.field public ۧ:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput p1, p0, Ll/۫ܺۡ;->ۧ:F

    const p1, 0x3dcccccd    # 0.1f

    .line 132
    iput p1, p0, Ll/۫ܺۡ;->֫:F

    return-void
.end method

.method public constructor <init>(Ll/۫ܺۡ;)V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iget v0, p1, Ll/۫ܺۡ;->ۧ:F

    iput v0, p0, Ll/۫ܺۡ;->ۧ:F

    .line 137
    iget p1, p1, Ll/۫ܺۡ;->֫:F

    iput p1, p0, Ll/۫ܺۡ;->֫:F

    return-void
.end method


# virtual methods
.method public setScaleX(F)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 149
    iput p1, p0, Ll/۫ܺۡ;->֫:F

    return-void
.end method

.method public setTranslateX(F)V
    .locals 0
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 143
    iput p1, p0, Ll/۫ܺۡ;->ۧ:F

    return-void
.end method
