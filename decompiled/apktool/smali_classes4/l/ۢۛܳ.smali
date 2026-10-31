.class public final Ll/ۢۛܳ;
.super Ll/֫᩻ᩳ;
.source "HAIH"


# instance fields
.field public final synthetic ᩶:Ll/ۗ᩻ܳ;

.field public final synthetic ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۖۛܳ;ZLl/ۗ᩻ܳ;)V
    .locals 0

    .line 460
    iput-boolean p2, p0, Ll/ۢۛܳ;->᩹:Z

    iput-object p3, p0, Ll/ۢۛܳ;->᩶:Ll/ۗ᩻ܳ;

    invoke-direct {p0, p1}, Ll/֫᩻ᩳ;-><init>(Ll/ۖۛܳ;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 499
    iget-object v0, p0, Ll/ۢۛܳ;->᩶:Ll/ۗ᩻ܳ;

    invoke-interface {v0, p1}, Ll/ۗ᩻ܳ;->֫(I)V

    return-void
.end method

.method public final ܳ()Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 3

    .line 471
    new-instance v0, Ll/ۖ֡ᩳ;

    const/4 v1, 0x4

    iget-object v2, p0, Ll/ۢۛܳ;->᩶:Ll/ۗ᩻ܳ;

    invoke-direct {v0, v1, v2}, Ll/ۖ֡ᩳ;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    .line 489
    iget-object v0, p0, Ll/ۢۛܳ;->᩶:Ll/ۗ᩻ܳ;

    invoke-interface {v0}, Ll/ۗ᩻ܳ;->ܳ֫()V

    return-void
.end method

.method public final ᩷(I)V
    .locals 0

    return-void
.end method

.method public final ᩹()V
    .locals 0

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 494
    iget-object v0, p0, Ll/ۢۛܳ;->᩶:Ll/ۗ᩻ܳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ᩻֫()Z
    .locals 1

    .line 462
    iget-boolean v0, p0, Ll/ۢۛܳ;->᩹:Z

    return v0
.end method
