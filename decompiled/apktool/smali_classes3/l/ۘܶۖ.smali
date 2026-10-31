.class public final Ll/ۘܶۖ;
.super Ll/ܶ᩶ۚ;
.source "44YS"


# instance fields
.field public final synthetic ܽ:Ll/ᩴܶۖ;


# direct methods
.method public constructor <init>(Ll/ᩴܶۖ;Ll/ܶ᩶ۚ;)V
    .locals 0

    .line 561
    iput-object p1, p0, Ll/ۘܶۖ;->ܽ:Ll/ᩴܶۖ;

    const/high16 p1, 0x90000

    invoke-direct {p0, p1, p2}, Ll/ܶ᩶ۚ;-><init>(ILl/ܶ᩶ۚ;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    const-string v0, "res/Hex"

    .line 565
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 566
    iget-object p2, p0, Ll/ۘܶۖ;->ܽ:Ll/ᩴܶۖ;

    iget-object v2, p2, Ll/ᩴܶۖ;->ܽ:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p2, Ll/ᩴܶۖ;->ᩳ:Ljava/lang/String;

    const-string v1, "$"

    .line 0
    invoke-static {v0, p2, v1, p3}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v0, p0

    move v1, p1

    move-object v4, p4

    move v5, p5

    .line 566
    invoke-super/range {v0 .. v5}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    .line 569
    :cond_0
    invoke-super/range {p0 .. p5}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
