.class public final Ll/֡ۗ֡;
.super Ljava/lang/Object;
.source "O60F"


# static fields
.field public static final ֫:Ll/ۖۙܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 52
    new-instance v0, Ll/۬ۗܺ;

    invoke-direct {v0}, Ll/۬ۗܺ;-><init>()V

    const/4 v1, 0x0

    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "static-put"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 54
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "static-get"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x2

    .line 55
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "instance-put"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x3

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "instance-get"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x4

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "invoke-static"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x5

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "invoke-instance"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x6

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "invoke-constructor"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/4 v1, 0x7

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "invoke-direct"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    const/16 v1, 0x8

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "invoke-interface"

    invoke-virtual {v0, v1, v2}, Ll/۬ۗܺ;->֫(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 461
    invoke-virtual {v0}, Ll/۬ۗܺ;->ۧ()Ll/ۤۗܺ;

    move-result-object v0

    .line 62
    sput-object v0, Ll/֡ۗ֡;->֫:Ll/ۖۙܺ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 3

    .line 74
    sget-object v0, Ll/֡ۗ֡;->֫:Ll/ۖۙܺ;

    invoke-interface {v0}, Ll/ۖۙܺ;->ᩳ()Ll/ۖۙܺ;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    .line 76
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    const-string v2, "Invalid method handle type: %s"

    .line 46
    invoke-direct {v0, p0, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    throw v0
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 3

    .line 66
    sget-object v0, Ll/֡ۗ֡;->֫:Ll/ۖۙܺ;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 68
    :cond_0
    new-instance v0, Ll/᩵ۗ֡;

    .line 85
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    const-string v2, "Invalid method handle type: %d"

    .line 46
    invoke-direct {v0, p0, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    throw v0
.end method
