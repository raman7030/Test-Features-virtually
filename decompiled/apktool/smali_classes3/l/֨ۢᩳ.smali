.class public final Ll/֨ۢᩳ;
.super Ljava/lang/Object;
.source "81Y6"

# interfaces
.implements Ll/ۚۢᩳ;


# instance fields
.field public ᩶:I

.field public ᩸:I

.field public final ᩹:Ll/ۚۢᩳ;


# direct methods
.method public constructor <init>(Ll/ۚۢᩳ;)V
    .locals 1

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 191
    iput v0, p0, Ll/֨ۢᩳ;->᩶:I

    .line 195
    iput-object p1, p0, Ll/֨ۢᩳ;->᩹:Ll/ۚۢᩳ;

    return-void
.end method


# virtual methods
.method public final ۗ()V
    .locals 1

    .line 210
    iget-object v0, p0, Ll/֨ۢᩳ;->᩹:Ll/ۚۢᩳ;

    invoke-interface {v0}, Ll/ۚۢᩳ;->ۗ()V

    return-void
.end method

.method public final ۚ֫()V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/֨ۢᩳ;->᩹:Ll/ۚۢᩳ;

    invoke-interface {v0}, Ll/ۚۢᩳ;->ۚ֫()V

    return-void
.end method

.method public final ۠֫()V
    .locals 1

    .line 205
    iget-object v0, p0, Ll/֨ۢᩳ;->᩹:Ll/ۚۢᩳ;

    invoke-interface {v0}, Ll/ۚۢᩳ;->۠֫()V

    return-void
.end method

.method public final ۢ(I)V
    .locals 0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    .line 216
    :cond_0
    iput p1, p0, Ll/֨ۢᩳ;->᩶:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    .line 225
    iget v0, p0, Ll/֨ۢᩳ;->᩸:I

    iget v1, p0, Ll/֨ۢᩳ;->᩶:I

    div-int/2addr p1, v1

    add-int/2addr p1, v0

    iget-object v0, p0, Ll/֨ۢᩳ;->᩹:Ll/ۚۢᩳ;

    invoke-interface {v0, p1}, Ll/ۚۢᩳ;->ۧ(I)V

    return-void
.end method

.method public final ܿ(I)V
    .locals 1

    .line 220
    iget v0, p0, Ll/֨ۢᩳ;->᩸:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/֨ۢᩳ;->᩸:I

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 230
    iget-object v0, p0, Ll/֨ۢᩳ;->᩹:Ll/ۚۢᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    return v0
.end method
