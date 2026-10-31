.class public final synthetic Ll/᩷ۘᩳ;
.super Ljava/lang/Object;
.source "QB32"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:[Landroid/view/MenuItem;


# direct methods
.method public synthetic constructor <init>([Landroid/view/MenuItem;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۘᩳ;->᩸:[Landroid/view/MenuItem;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 5

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 116
    iget-object v0, p0, Ll/᩷ۘᩳ;->᩸:[Landroid/view/MenuItem;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 117
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
