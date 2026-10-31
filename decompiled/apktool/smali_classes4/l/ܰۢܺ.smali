.class public final Ll/ܰۢܺ;
.super Ll/ܿᩴܺ;
.source "9BJ3"


# static fields
.field public static final ᩶:Ll/ܰۢܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Ll/ܰۢܺ;

    const/4 v1, 0x0

    .line 67
    invoke-direct {v0, v1}, Ll/ܿᩴܺ;-><init>(I)V

    .line 29
    sput-object v0, Ll/ܰۢܺ;->᩶:Ll/ܰۢܺ;

    return-void
.end method

.method public static ֫(Ll/ܰۢܺ;Ll/ܰۢܺ;)Ll/ܰۢܺ;
    .locals 6

    .line 43
    invoke-virtual {p0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    .line 45
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 49
    new-instance v1, Ll/ܰۢܺ;

    .line 67
    invoke-direct {v1, v0}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 79
    invoke-virtual {p0, v2}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۢܺ;

    invoke-virtual {p1, v2}, Ll/ܿᩴܺ;->֫(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺ۢܺ;

    .line 57
    new-instance v5, Ll/᩺ۢܺ;

    invoke-direct {v5}, Ll/᩺ۢܺ;-><init>()V

    .line 59
    invoke-virtual {v5, v3}, Ll/᩺ۢܺ;->֫(Ll/᩺ۢܺ;)V

    .line 60
    invoke-virtual {v5, v4}, Ll/᩺ۢܺ;->֫(Ll/᩺ۢܺ;)V

    .line 61
    invoke-virtual {v5}, Ll/ᩴᩴܺ;->ܺ()V

    .line 90
    invoke-virtual {v5}, Ll/ᩴᩴܺ;->֡()V

    .line 91
    invoke-virtual {v1, v2, v5}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "list1.size() != list2.size()"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫(ILl/᩺ۢܺ;)V
    .locals 0

    .line 90
    invoke-virtual {p2}, Ll/ᩴᩴܺ;->֡()V

    .line 91
    invoke-virtual {p0, p1, p2}, Ll/ܿᩴܺ;->֫(ILjava/lang/Object;)V

    return-void
.end method
