.class public final synthetic Ll/᩻᩹ۜ;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/᩸᩷ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸᩷ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻᩹ۜ;->᩸:Ll/᩸᩷ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 273
    iget-object v0, p0, Ll/᩻᩹ۜ;->᩸:Ll/᩸᩷ۡ;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 274
    invoke-virtual {v0, p1}, Ll/᩸᩷ۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 276
    :cond_0
    invoke-virtual {v0}, Ll/᩸᩷ۡ;->ܽ()V

    return-void
.end method
