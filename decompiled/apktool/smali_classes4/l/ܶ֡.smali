.class public final Ll/ܶ֡;
.super Ljava/lang/Object;
.source "T1A5"


# instance fields
.field public ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܶ֡;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View;Ljava/lang/String;)F
    .locals 2

    .line 56
    iget-object v0, p0, Ll/ܶ֡;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    .line 60
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    .line 64
    array-length p2, p1

    if-lez p2, :cond_2

    const/4 p2, 0x0

    .line 65
    aget p1, p1, p2

    return p1

    :cond_2
    :goto_0
    const/high16 p1, 0x7fc00000    # Float.NaN

    return p1
.end method
