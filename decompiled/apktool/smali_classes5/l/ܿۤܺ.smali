.class public final enum Ll/ܿۤܺ;
.super Ll/᩻ۤܺ;
.source "067E"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 95
    invoke-direct {p0, p1, p2, v0}, Ll/᩻ۤܺ;-><init>(Ljava/lang/String;ILl/֫ۤܺ;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 95
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, Ll/ܿۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/util/Map$Entry;)Ljava/lang/Object;
    .locals 0

    .line 98
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
