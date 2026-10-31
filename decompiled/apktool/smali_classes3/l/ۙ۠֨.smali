.class public final Ll/ۙ۠֨;
.super Ll/۫᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2645
    iput-object p1, p0, Ll/ۙ۠֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 2

    .line 2645
    check-cast p1, Ljava/lang/Void;

    .line 2648
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p1, p2, Ll/ۛۚ֨;

    if-nez p1, :cond_2

    .line 2649
    iget-object p1, p0, Ll/ۙ۠֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {p1, p2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    .line 2650
    sget-object v1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    if-eq v0, v1, :cond_1

    if-eq v0, p2, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 2652
    :cond_0
    invoke-virtual {p1, p2}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    .line 2651
    :cond_1
    :goto_0
    invoke-virtual {p1, p2}, Ll/ۛ᩸֨;->ۖ(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    .line 2654
    :cond_2
    check-cast p2, Ll/ۛۚ֨;

    invoke-virtual {p2}, Ll/ۛۚ֨;->۫֫()Ll/ۖܶ۠;

    move-result-object p1

    return-object p1
.end method
