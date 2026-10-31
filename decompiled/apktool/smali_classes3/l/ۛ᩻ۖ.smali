.class public Ll/ۛ᩻ۖ;
.super Ljava/lang/Object;
.source "V898"

# interfaces
.implements Ll/ܶᩳۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 0

    .line 47
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/sql/Time;

    if-ne p1, p2, :cond_0

    .line 48
    new-instance p1, Ll/ۨ᩻ۖ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ۨ᩻ۖ;-><init>(I)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
