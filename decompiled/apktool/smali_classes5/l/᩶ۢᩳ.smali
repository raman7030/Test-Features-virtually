.class public final Ll/᩶ۢᩳ;
.super Ljava/lang/Object;
.source "G4YY"

# interfaces
.implements Ll/ۗۗ֡;


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public ܽ:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 354
    iput p1, p0, Ll/᩶ۢᩳ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 371
    iget v0, p0, Ll/᩶ۢᩳ;->ۧ:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    .line 372
    iput-boolean p1, p0, Ll/᩶ۢᩳ;->ܽ:Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۟۬֡;)V
    .locals 1

    const/4 v0, 0x0

    .line 358
    iput-boolean v0, p0, Ll/᩶ۢᩳ;->֫:Z

    iput-boolean v0, p0, Ll/᩶ۢᩳ;->ܽ:Z

    .line 16
    invoke-static {p1, v0, p0}, Ll/۬ۗ֡;->֫(Ll/᩺֫ۚ;ZLl/ۗۗ֡;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 381
    iget-boolean v0, p0, Ll/᩶ۢᩳ;->֫:Z

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 573
    invoke-virtual {p0, p1}, Ll/᩶ۢᩳ;->ܽ(I)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 377
    iget-boolean v0, p0, Ll/᩶ۢᩳ;->ܽ:Z

    return v0
.end method

.method public final ܽ(I)V
    .locals 1

    .line 364
    iget v0, p0, Ll/᩶ۢᩳ;->ۧ:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    .line 365
    iput-boolean p1, p0, Ll/᩶ۢᩳ;->֫:Z

    :cond_0
    return-void
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 579
    invoke-virtual {p0, p1}, Ll/᩶ۢᩳ;->֫(I)V

    return-void
.end method
