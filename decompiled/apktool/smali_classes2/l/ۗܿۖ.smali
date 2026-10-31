.class public Ll/ۗܿۖ;
.super Ljava/lang/Object;
.source "G851"

# interfaces
.implements Ll/ܶᩳۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY"

    return-object v0
.end method

.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 0

    .line 69
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/util/Date;

    if-ne p1, p2, :cond_0

    .line 70
    new-instance p1, Ll/ۤܿۖ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ۤܿۖ;-><init>(I)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
