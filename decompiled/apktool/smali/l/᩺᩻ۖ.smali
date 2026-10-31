.class public Ll/᩺᩻ۖ;
.super Ljava/lang/Object;
.source "V82C"

# interfaces
.implements Ll/ܶᩳۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 1

    .line 36
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/sql/Timestamp;

    if-ne p2, v0, :cond_0

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 665
    const-class p2, Ljava/util/Date;

    invoke-static {p2}, Ll/ܽۜۖ;->֫(Ljava/lang/Class;)Ll/ܽۜۖ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object p1

    .line 38
    new-instance p2, Ll/ܰ᩻ۖ;

    invoke-direct {p2, p1}, Ll/ܰ᩻ۖ;-><init>(Ll/۠ᩳۖ;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
