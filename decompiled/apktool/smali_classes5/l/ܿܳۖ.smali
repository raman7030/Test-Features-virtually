.class public final Ll/ܿܳۖ;
.super Ljava/lang/Object;
.source "H87Q"

# interfaces
.implements Ll/ܶᩳۖ;


# instance fields
.field public final synthetic ᩸:Ll/᩻ܳۖ;


# direct methods
.method public constructor <init>(Ll/᩻ܳۖ;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܳۖ;->᩸:Ll/᩻ܳۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 0

    .line 49
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/lang/Number;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Ll/ܿܳۖ;->᩸:Ll/᩻ܳۖ;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
