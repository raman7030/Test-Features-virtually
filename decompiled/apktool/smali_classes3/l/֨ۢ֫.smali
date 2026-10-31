.class public final Ll/֨ۢ֫;
.super Ljava/lang/Object;
.source "O5GS"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final ᩸:[Ll/᩶ۢ֫;


# direct methods
.method public constructor <init>([Ll/᩶ۢ֫;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/֨ۢ֫;->᩸:[Ll/᩶ۢ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 3

    .line 25
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 24
    iget-object p1, p0, Ll/֨ۢ֫;->᩸:[Ll/᩶ۢ֫;

    array-length p2, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-object v2, p1, v1

    .line 25
    invoke-interface {v2}, Ll/᩶ۢ֫;->֫()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 27
    :cond_0
    array-length p2, p1

    :goto_1
    if-ge v0, p2, :cond_1

    aget-object v1, p1, v0

    .line 28
    invoke-interface {v1}, Ll/᩶ۢ֫;->֫()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
