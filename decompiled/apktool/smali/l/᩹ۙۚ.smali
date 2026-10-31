.class public final Ll/᩹ۙۚ;
.super Ll/ۡۙۚ;
.source "75B4"


# instance fields
.field public ᩻:Ll/֨᩶ۚ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, -0x1

    .line 40
    invoke-direct {p0, v0}, Ll/ۡۙۚ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֨᩶ۚ;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/᩹ۙۚ;->᩻:Ll/֨᩶ۚ;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Ll/֨᩶ۚ;

    invoke-direct {v0}, Ll/֨᩶ۚ;-><init>()V

    iput-object v0, p0, Ll/᩹ۙۚ;->᩻:Ll/֨᩶ۚ;

    .line 63
    :cond_0
    iget-object v0, p0, Ll/᩹ۙۚ;->᩻:Ll/֨᩶ۚ;

    return-object v0
.end method

.method public final ֫(Ll/ܶ᩶ۚ;)V
    .locals 1

    .line 68
    invoke-virtual {p0}, Ll/᩹ۙۚ;->֫()Ll/֨᩶ۚ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 77
    iput-object v0, p0, Ll/᩹ۙۚ;->᩻:Ll/֨᩶ۚ;

    return-void
.end method
