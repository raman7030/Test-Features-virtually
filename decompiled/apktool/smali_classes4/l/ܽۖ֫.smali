.class public final Ll/ܽۖ֫;
.super Ll/۟ܺ֫;
.source "MANG"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    sget-object v0, Ll/᩺ܺ֫;->ۧ:Ll/᩺ܺ֫;

    invoke-direct {p0, v0}, Ll/ܽۖ֫;-><init>(Ll/۟ܺ֫;)V

    return-void
.end method

.method public constructor <init>(Ll/۟ܺ֫;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0}, Ll/۟ܺ֫;-><init>()V

    .line 55
    invoke-virtual {p0}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {p1}, Ll/۟ܺ֫;->֫()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
