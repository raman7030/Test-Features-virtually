.class public final Ll/ۖ᩺;
.super Ll/ܽ᩶᩵;
.source "E9O4"

# interfaces
.implements Ll/ܺ᩹᩵;


# static fields
.field public static final ᩹:Ll/ۖ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 2
    new-instance v0, Ll/ۖ᩺;

    const/4 v1, 0x1

    .line 0
    invoke-direct {v0, v1}, Ll/ܽ᩶᩵;-><init>(I)V

    sput-object v0, Ll/ۖ᩺;->᩹:Ll/ۖ᩺;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 127
    check-cast p1, Landroid/view/View;

    .line 128
    instance-of v0, p1, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 87
    new-instance v0, Ll/ۘ᩺;

    invoke-direct {v0, p1}, Ll/ۘ᩺;-><init>(Landroid/view/ViewGroup;)V

    return-object v0

    :cond_1
    return-object v1
.end method
