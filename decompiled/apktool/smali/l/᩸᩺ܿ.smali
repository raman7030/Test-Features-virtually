.class public final synthetic Ll/᩸᩺ܿ;
.super Ljava/lang/Object;
.source "P70J"


# instance fields
.field public final synthetic ֫:Ll/᩺ܰܿ;

.field public final synthetic ۧ:Ll/᩶᩺ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/᩺ܰܿ;Ll/᩶᩺ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩺ܿ;->֫:Ll/᩺ܰܿ;

    iput-object p2, p0, Ll/᩸᩺ܿ;->ۧ:Ll/᩶᩺ܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۜۧܳ;
    .locals 2

    .line 298
    new-instance v0, Ll/ܶ᩺ܿ;

    iget-object v1, p0, Ll/᩸᩺ܿ;->ۧ:Ll/᩶᩺ܿ;

    invoke-direct {v0, v1}, Ll/ܶ᩺ܿ;-><init>(Ll/᩶᩺ܿ;)V

    .line 297
    iget-object v1, p0, Ll/᩸᩺ܿ;->֫:Ll/᩺ܰܿ;

    invoke-virtual {v1, v0}, Ll/᩺ܰܿ;->֫(Ll/ܶ᩺ܿ;)Ll/ۜۧܳ;

    move-result-object v0

    return-object v0
.end method
