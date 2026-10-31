.class public final Ll/ᩳۖܺ;
.super Ljava/lang/Object;
.source "2BGD"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 0

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۖܺ;->᩸:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 247
    check-cast p1, Ll/ܰۡܺ;

    check-cast p2, Ll/ܰۡܺ;

    .line 251
    iget-object v0, p0, Ll/ᩳۖܺ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sub-int/2addr v1, v0

    if-nez v1, :cond_0

    .line 258
    invoke-virtual {p1, p2}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
