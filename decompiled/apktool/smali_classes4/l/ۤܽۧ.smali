.class public final Ll/ۤܽۧ;
.super Ll/ܰ֫ۧ;
.source "D8IH"


# instance fields
.field public final ܽ:Ll/ۧ᩵֫;


# direct methods
.method public constructor <init>(Ll/ۙ᩵֫;Ll/ۧ᩵֫;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Ll/ܰ֫ۧ;-><init>(Ll/ۙ᩵֫;)V

    .line 36
    iput-object p2, p0, Ll/ۤܽۧ;->ܽ:Ll/ۧ᩵֫;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;
    .locals 0

    .line 42
    invoke-super {p0, p1, p2, p3, p4}, Ll/ܰ֫ۧ;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    .line 43
    iget-object p1, p0, Ll/ۤܽۧ;->ܽ:Ll/ۧ᩵֫;

    iput-object p1, p2, Ll/᩶᩵֫;->ۡ:Ll/ۧ᩵֫;

    .line 45
    iget-object p1, p1, Ll/ۧ᩵֫;->ܽ:Ll/ۨᩴ֫;

    if-eqz p1, :cond_0

    .line 46
    iget-object p1, p1, Ll/ۨᩴ֫;->ܳ:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 47
    :goto_0
    iput-object p1, p2, Ll/᩶᩵֫;->ۘ:Ljava/lang/Object;

    return-object p2
.end method
