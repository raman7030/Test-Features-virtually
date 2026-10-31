.class public final enum Ll/ܿ᩸֨;
.super Ll/᩻᩸֨;
.source "X43L"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "BASIC"

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ܿ᩸֨;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2842
    invoke-direct {p0, p1, p2, v0}, Ll/᩻᩸֨;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/ۛ᩸֨;)Z
    .locals 2

    .line 2845
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 2846
    invoke-virtual {p2}, Ll/ۙ֨֨;->ܽ֫()Ll/ۖܶ۠;

    move-result-object v1

    .line 2847
    invoke-virtual {p1}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object p1

    .line 2848
    invoke-virtual {p2}, Ll/ۙ֨֨;->۟()Ll/ۙ֨֨;

    move-result-object p2

    invoke-virtual {p3, p2, v1, v0}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p2

    .line 2849
    invoke-virtual {p3, p1, p2}, Ll/ۛ᩸֨;->ܿ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 2850
    invoke-virtual {p1}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2851
    invoke-virtual {p2}, Ll/ۙ֨֨;->᩵֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1071
    invoke-virtual {p3, p1, p2, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v1
.end method
