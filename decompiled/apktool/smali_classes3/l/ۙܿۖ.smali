.class public final Ll/ۙܿۖ;
.super Ljava/lang/Object;
.source "O878"

# interfaces
.implements Ll/ܶᩳۖ;


# instance fields
.field public final ᩸:Ll/᩶ᩳۖ;


# direct methods
.method public constructor <init>(Ll/᩶ᩳۖ;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۙܿۖ;->᩸:Ll/᩶ᩳۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 3

    .line 43
    invoke-virtual {p2}, Ll/ܽۜۖ;->ۧ()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 45
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v1

    .line 46
    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 50
    :cond_0
    invoke-static {v1, v0}, Ll/ۛᩳۖ;->֫(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 51
    invoke-static {v0}, Ll/ܽۜۖ;->֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v1

    .line 52
    new-instance v2, Ll/᩸ܳۖ;

    invoke-direct {v2, p1, v1, v0}, Ll/᩸ܳۖ;-><init>(Ll/۫ܽۖ;Ll/۠ᩳۖ;Ljava/lang/reflect/Type;)V

    const/4 p1, 0x0

    .line 57
    iget-object v0, p0, Ll/ۙܿۖ;->᩸:Ll/᩶ᩳۖ;

    invoke-virtual {v0, p2, p1}, Ll/᩶ᩳۖ;->֫(Ll/ܽۜۖ;Z)Ll/᩷ܿۖ;

    move-result-object p1

    .line 60
    new-instance p2, Ll/᩶ܿۖ;

    invoke-direct {p2, v2, p1}, Ll/᩶ܿۖ;-><init>(Ll/۠ᩳۖ;Ll/᩷ܿۖ;)V

    return-object p2
.end method
