.class public final Ll/᩻֫ᩴ;
.super Ll/ܺ֫ᩴ;
.source "97L"

# interfaces
.implements Ll/ܺۧᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۫:Ll/᩵֫ᩴ;


# direct methods
.method public constructor <init>(Ll/᩵֫ᩴ;)V
    .locals 0

    .line 1067
    iput-object p1, p0, Ll/᩻֫ᩴ;->۫:Ll/᩵֫ᩴ;

    .line 1068
    invoke-direct {p0, p1}, Ll/ܺ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    return-void
.end method


# virtual methods
.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡۧᩴ;->֫(Ll/ܺۧᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/᩻֫ᩴ;->֡ۧ()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final ֡ۧ()C
    .locals 2

    .line 1081
    iget-object v0, p0, Ll/᩻֫ᩴ;->۫:Ll/᩵֫ᩴ;

    iget-object v0, v0, Ll/᩵֫ᩴ;->ۙ:[C

    invoke-virtual {p0}, Ll/ܺ֫ᩴ;->֫()I

    move-result v1

    aget-char v0, v0, v1

    return v0
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 1066
    check-cast p2, Ll/᩻ۧᩴ;

    .line 1076
    iget-object v0, p0, Ll/᩻֫ᩴ;->۫:Ll/᩵֫ᩴ;

    iget-object v0, v0, Ll/᩵֫ᩴ;->ۙ:[C

    aget-char p1, v0, p1

    invoke-interface {p2, p1}, Ll/᩻ۧᩴ;->ܽ(C)V

    return-void
.end method
