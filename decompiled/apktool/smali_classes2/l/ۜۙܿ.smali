.class public final Ll/ۜۙܿ;
.super Landroid/widget/ArrayAdapter;
.source "L9CC"


# instance fields
.field public final synthetic ᩸:Ll/ۗۙܿ;


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;)V
    .locals 0

    .line 1367
    iput-object p1, p0, Ll/ۜۙܿ;->᩸:Ll/ۗۙܿ;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1370
    iget-object p3, p0, Ll/ۜۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {p3}, Ll/ۗۙܿ;->ܺ(Ll/ۗۙܿ;)Ll/ۙۙܿ;

    move-result-object v0

    .line 1371
    invoke-virtual {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    invoke-static {p3}, Ll/ۗۙܿ;->ۡ(Ll/ۗۙܿ;)Landroid/util/Size;

    move-result-object p3

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result p3

    .line 1370
    invoke-virtual {v0, p1, p3, p2}, Ll/ۙۙܿ;->֫(Landroid/view/MenuItem;ILandroid/view/View;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
