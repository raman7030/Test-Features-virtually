.class public final Ll/ܺۙܿ;
.super Ljava/lang/Object;
.source "L9CC"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗۙܿ;


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۙܿ;->᩸:Ll/ۗۙܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 173
    iget-object v0, p0, Ll/ܺۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {v0}, Ll/ۗۙܿ;->ܳ(Ll/ۗۙܿ;)Landroid/view/MenuItem$OnMenuItemClickListener;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 176
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    .line 177
    instance-of v1, p1, Ll/᩹ۙܿ;

    if-nez v1, :cond_1

    goto :goto_0

    .line 180
    :cond_1
    invoke-static {v0}, Ll/ۗۙܿ;->ܿ(Ll/ۗۙܿ;)Ljava/util/LinkedHashMap;

    move-result-object v1

    check-cast p1, Ll/᩹ۙܿ;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    if-nez p1, :cond_2

    :goto_0
    return-void

    .line 184
    :cond_2
    invoke-static {v0}, Ll/ۗۙܿ;->ܳ(Ll/ۗۙܿ;)Landroid/view/MenuItem$OnMenuItemClickListener;

    move-result-object v0

    check-cast v0, Ll/ۤ᩶ܿ;

    invoke-virtual {v0, p1}, Ll/ۤ᩶ܿ;->onMenuItemClick(Landroid/view/MenuItem;)Z

    return-void
.end method
