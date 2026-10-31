.class public final Ll/֨᩵ۚ;
.super Ljava/lang/Object;
.source "85KM"


# static fields
.field public static final ֫:Ll/ܽܶܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    invoke-static {}, Ll/ܿܶܺ;->֫()Ll/ܽܶܺ;

    move-result-object v0

    sput-object v0, Ll/֨᩵ۚ;->֫:Ll/ܽܶܺ;

    return-void
.end method

.method public static ֫(Ljava/util/List;Ljava/util/List;)Z
    .locals 1

    .line 48
    sget-object v0, Ll/֨᩵ۚ;->֫:Ll/ܽܶܺ;

    invoke-static {p0, v0}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object p0

    .line 49
    invoke-static {p1, v0}, Ll/۟۫ܺ;->֫(Ljava/util/List;Ll/ܽܶܺ;)Ljava/util/AbstractList;

    move-result-object p1

    .line 48
    invoke-interface {p0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
