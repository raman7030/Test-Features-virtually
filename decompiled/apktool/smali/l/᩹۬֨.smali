.class public final Ll/᩹۬֨;
.super Ljava/util/HashMap;
.source "Z7QW"


# static fields
.field public static final serialVersionUID:J = 0x192677b61e5ddcf1L

.field public static final ᩸:Ll/ۙ֨۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/᩹۬֨;->᩸:Ll/ۙ֨۠;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/᩹۬֨;
    .locals 2

    .line 46
    sget-object v0, Ll/᩹۬֨;->᩸:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹۬֨;

    if-nez v1, :cond_0

    .line 48
    new-instance v1, Ll/᩹۬֨;

    .line 83
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 85
    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/᩸۬֨;)Z
    .locals 0

    .line 89
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸۬֨;

    if-eqz p1, :cond_0

    .line 90
    invoke-virtual {p2, p1}, Ll/᩸۬֨;->֫(Ll/᩸۬֨;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
