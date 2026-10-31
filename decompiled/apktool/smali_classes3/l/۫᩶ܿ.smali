.class public final Ll/۫᩶ܿ;
.super Ljava/lang/Object;
.source "69BI"


# instance fields
.field public final ֫:Ll/ۛۜ;


# direct methods
.method public constructor <init>(Landroid/view/MenuItem;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    check-cast p1, Ll/ۛۜ;

    iput-object p1, p0, Ll/۫᩶ܿ;->֫:Ll/ۛۜ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 59
    iget-object v1, p0, Ll/۫᩶ܿ;->֫:Ll/ۛۜ;

    invoke-virtual {v1, v0}, Ll/ۛۜ;->setShowAsAction(I)V

    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 30
    iget-object v0, p0, Ll/۫᩶ܿ;->֫:Ll/ۛۜ;

    invoke-virtual {v0, p1}, Ll/ۛۜ;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-void
.end method
