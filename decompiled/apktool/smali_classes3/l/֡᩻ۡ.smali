.class public final Ll/֡᩻ۡ;
.super Ll/ۜ᩶ۘ;
.source "A924"


# instance fields
.field public final synthetic ֫:Ll/᩶᩻ۡ;


# direct methods
.method public constructor <init>(Ll/᩶᩻ۡ;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    iput-object p1, p0, Ll/֡᩻ۡ;->֫:Ll/᩶᩻ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 3

    .line 171
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 172
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܿ()V

    .line 173
    iget-object v0, p0, Ll/֡᩻ۡ;->֫:Ll/᩶᩻ۡ;

    invoke-virtual {v0, p2}, Ll/᩶᩻ۡ;->֫(Ll/֡ۚ֡;)F

    move-result p2

    .line 174
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v0

    .line 175
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result p1

    .line 176
    new-instance v1, Landroid/text/style/RelativeSizeSpan;

    invoke-direct {v1, p2}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    add-int/lit8 p2, p1, -0x1

    const/16 v2, 0x21

    invoke-virtual {v0, v1, p2, p1, v2}, Ll/ᩳۙۘ;->setSpan(Ljava/lang/Object;III)V

    :cond_0
    return-void
.end method
