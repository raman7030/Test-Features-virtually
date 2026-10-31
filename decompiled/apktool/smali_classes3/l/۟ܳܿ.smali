.class public final Ll/۟ܳܿ;
.super Ll/ܰܳܿ;
.source "89CO"


# instance fields
.field public final ֫:Ll/ۖ᩻ܿ;

.field public final ۧ:Landroid/graphics/drawable/Drawable;

.field public final ܽ:Ll/ܺ᩻ܿ;


# direct methods
.method public constructor <init>(Ll/ۢ᩻ܿ;Ll/ۖ᩻ܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 466
    invoke-direct {p0, v0}, Ll/ܰܳܿ;-><init>(I)V

    .line 467
    iput-object p2, p0, Ll/۟ܳܿ;->֫:Ll/ۖ᩻ܿ;

    .line 468
    invoke-virtual {p2}, Ll/ۖ᩻ܿ;->ۧ()Ll/ܺ᩻ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܳܿ;->ܽ:Ll/ܺ᩻ܿ;

    .line 469
    invoke-virtual {p2, p1}, Ll/ۖ᩻ܿ;->֫(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܳܿ;->ۧ:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final ۧ()Ll/۟ܳܿ;
    .locals 0

    return-object p0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
