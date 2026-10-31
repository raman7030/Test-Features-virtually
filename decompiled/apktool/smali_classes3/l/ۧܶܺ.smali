.class public abstract Ll/ۧܶܺ;
.super Ljava/lang/Object;
.source "A4S0"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫()Ll/ۧܶܺ;
    .locals 1

    .line 349
    sget-object v0, Ll/۟۠ܺ;->᩸:Ll/۟۠ܺ;

    return-object v0
.end method

.method public static ۧ()Ll/ۧܶܺ;
    .locals 1

    .line 361
    sget-object v0, Ll/֫ܶܺ;->᩸:Ll/֫ܶܺ;

    return-object v0
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/Object;)I
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 124
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۧܶܺ;->֫(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {p0, p1, p2}, Ll/ۧܶܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
