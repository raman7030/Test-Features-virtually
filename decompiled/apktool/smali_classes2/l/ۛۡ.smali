.class public final Ll/ۛۡ;
.super Ljava/lang/Object;
.source "S566"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Landroid/graphics/Typeface;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 0

    .line 460
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۡ;->᩹:Landroid/widget/TextView;

    iput-object p2, p0, Ll/ۛۡ;->᩶:Landroid/graphics/Typeface;

    iput p3, p0, Ll/ۛۡ;->᩸:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 463
    iget-object v0, p0, Ll/ۛۡ;->᩶:Landroid/graphics/Typeface;

    iget v1, p0, Ll/ۛۡ;->᩸:I

    iget-object v2, p0, Ll/ۛۡ;->᩹:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void
.end method
