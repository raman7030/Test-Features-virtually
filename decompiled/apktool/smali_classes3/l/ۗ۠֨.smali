.class public final Ll/ۗ۠֨;
.super Ll/۫᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2755
    iput-object p1, p0, Ll/ۗ۠֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 2755
    check-cast p1, Ljava/lang/Void;

    return-object p2
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2755
    check-cast p2, Ljava/lang/Void;

    .line 2773
    iget-object p2, p0, Ll/ۗ۠֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {p2, p1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۛ᩸֨;->ᩳ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۫ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2755
    check-cast p2, Ljava/lang/Void;

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2755
    check-cast p2, Ljava/lang/Void;

    .line 2763
    iget-object p2, p0, Ll/ۗ۠֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {p1}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۛ᩸֨;->ᩳ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 2764
    invoke-virtual {p1}, Ll/᩶ۚ֨;->۫()Ll/ۙ֨֨;

    move-result-object v0

    if-eq p2, v0, :cond_0

    .line 2765
    new-instance v0, Ll/᩶ۚ֨;

    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v1

    iget-object v2, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 92
    iget-object p1, p1, Ll/ۙ֨֨;->᩸:Ll/᩷۠֨;

    .line 2766
    invoke-direct {v0, p2, v1, v2, p1}, Ll/᩶ۚ֨;-><init>(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;Ll/᩷۠֨;)V

    return-object v0

    :cond_0
    return-object p1
.end method
