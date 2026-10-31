.class public Ll/᩸ܳܿ;
.super Ll/᩹ܳܿ;
.source "77JV"


# instance fields
.field public final ܳ:I

.field public final ܿ:I

.field public final ᩳ:Ll/۬ۤ;


# direct methods
.method public constructor <init>(IILl/۬ۤ;)V
    .locals 1

    const/16 v0, 0xe

    .line 13
    invoke-direct {p0, v0}, Ll/᩹ܳܿ;-><init>(I)V

    .line 14
    iput p1, p0, Ll/᩸ܳܿ;->ܳ:I

    .line 15
    iput p2, p0, Ll/᩸ܳܿ;->ܿ:I

    .line 16
    iput-object p3, p0, Ll/᩸ܳܿ;->ᩳ:Ll/۬ۤ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۨᩳ;)V
    .locals 1

    .line 36
    iget-object v0, p0, Ll/᩸ܳܿ;->ᩳ:Ll/۬ۤ;

    invoke-interface {v0, p1}, Ll/۬ۤ;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public ֫(Ll/۫ۨᩳ;ZZII)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ܳ()I
    .locals 1

    .line 21
    iget v0, p0, Ll/᩸ܳܿ;->ܳ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 26
    iget v0, p0, Ll/᩸ܳܿ;->ܿ:I

    return v0
.end method
