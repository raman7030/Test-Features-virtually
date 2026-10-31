.class public final Ll/ܳۛܳ;
.super Ll/֫᩻ᩳ;
.source "HAIH"


# instance fields
.field public final synthetic ᩶:Ll/ۤܽ֡;

.field public final synthetic ᩹:Ll/ᩳۛܳ;


# direct methods
.method public constructor <init>(Ll/ۖۛܳ;Ll/ᩳۛܳ;Ll/ۤܽ֡;)V
    .locals 0

    .line 255
    iput-object p2, p0, Ll/ܳۛܳ;->᩹:Ll/ᩳۛܳ;

    iput-object p3, p0, Ll/ܳۛܳ;->᩶:Ll/ۤܽ֡;

    invoke-direct {p0, p1}, Ll/֫᩻ᩳ;-><init>(Ll/ۖۛܳ;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 0

    return-void
.end method

.method public final ܳ()Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 3

    .line 263
    new-instance v0, Ll/ܿۛܳ;

    iget-object v1, p0, Ll/ܳۛܳ;->᩹:Ll/ᩳۛܳ;

    iget-object v2, p0, Ll/ܳۛܳ;->᩶:Ll/ۤܽ֡;

    invoke-direct {v0, v1, v2}, Ll/ܿۛܳ;-><init>(Ll/ᩳۛܳ;Ll/ۤܽ֡;)V

    return-object v0
.end method

.method public final ܽ()V
    .locals 2

    .line 280
    iget-object v0, p0, Ll/ܳۛܳ;->᩹:Ll/ᩳۛܳ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ᩳۛܳ;->֫:Z

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

    .line 285
    iget-object v0, p0, Ll/ܳۛܳ;->᩹:Ll/ᩳۛܳ;

    iget-boolean v0, v0, Ll/ᩳۛܳ;->֫:Z

    return v0
.end method
