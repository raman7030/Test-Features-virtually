.class public final synthetic Ll/ۢᩳ۠;
.super Ljava/lang/Object;
.source "B7KX"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۛ֡֨;

.field public final synthetic ᩹:J


# direct methods
.method public synthetic constructor <init>(Ll/ۛ֡֨;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢᩳ۠;->᩸:Ll/ۛ֡֨;

    iput-wide p2, p0, Ll/ۢᩳ۠;->᩹:J

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Ll/᩷᩵۠;

    .line 1509
    iget-object p1, p1, Ll/᩷᩵۠;->۬:Ll/۫᩵۠;

    invoke-static {p1}, Ll/۟ۚ۠;->ۧ(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object p1

    .line 1510
    sget-object v0, Ll/ᩴۚ۠;->᩺֫:Ll/ᩴۚ۠;

    invoke-virtual {p1, v0}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast p1, Ll/᩻֡۠;

    .line 1511
    invoke-virtual {p1}, Ll/᩻֡۠;->᩷֫()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1512
    iget-object p1, p0, Ll/ۢᩳ۠;->᩸:Ll/ۛ֡֨;

    iget-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    iget-wide v2, p0, Ll/ۢᩳ۠;->᩹:J

    or-long/2addr v0, v2

    iput-wide v0, p1, Ll/ۛ֡֨;->᩶:J

    :cond_0
    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
