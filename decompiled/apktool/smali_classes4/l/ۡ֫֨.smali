.class public final Ll/ۡ֫֨;
.super Ll/ۢ֫֨;
.source "C5BI"


# instance fields
.field public ۜۧ:Ll/ۜ֫֨;


# direct methods
.method public constructor <init>(Ll/۟۫ۚ;Ll/ۨܽ֨;Ll/ۜ֫֨;)V
    .locals 0

    .line 393
    invoke-direct {p0, p1, p2}, Ll/ۢ֫֨;-><init>(Ll/۟۫ۚ;Ll/ۨܽ֨;)V

    .line 394
    iput-object p3, p0, Ll/ۡ֫֨;->ۜۧ:Ll/ۜ֫֨;

    const-string p1, "Annotation_AnnotationValue"

    .line 395
    iput-object p1, p0, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛܽ֨;)V
    .locals 1

    .line 405
    invoke-super {p0, p1}, Ll/ۨܽ֨;->֫(Ll/ۛܽ֨;)V

    .line 406
    iget-object v0, p0, Ll/ۡ֫֨;->ۜۧ:Ll/ۜ֫֨;

    invoke-virtual {v0, p1}, Ll/ۨܽ֨;->֫(Ll/ۛܽ֨;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 412
    iget-object v0, p0, Ll/ۡ֫֨;->ۜۧ:Ll/ۜ֫֨;

    if-eqz v0, :cond_0

    .line 394
    iget v1, p0, Ll/ۢܽ֨;->᩶:I

    .line 398
    iput v1, v0, Ll/ۢܽ֨;->᩶:I

    .line 415
    invoke-virtual {v0, p0}, Ll/ۢܽ֨;->֫(Ll/ۨܽ֨;)V

    .line 416
    invoke-virtual {v0}, Ll/ۜ֫֨;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ᩹()Ljava/lang/String;
    .locals 1

    .line 400
    iget-object v0, p0, Ll/ۡ֫֨;->ۜۧ:Ll/ۜ֫֨;

    invoke-virtual {v0}, Ll/ۜ֫֨;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
