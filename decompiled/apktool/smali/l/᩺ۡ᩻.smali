.class public final synthetic Ll/᩺ۡ᩻;
.super Ljava/lang/Object;
.source "3AGE"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۛۡ᩻;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۡ᩻;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۡ᩻;->᩸:Ll/ۛۡ᩻;

    iput-object p2, p0, Ll/᩺ۡ᩻;->᩹:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 276
    iget-object p1, p0, Ll/᩺ۡ᩻;->᩸:Ll/ۛۡ᩻;

    invoke-virtual {p1}, Ll/ۛۡ᩻;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܺ᩻;

    if-nez p1, :cond_0

    goto :goto_0

    .line 280
    :cond_0
    iget-object v0, p0, Ll/᩺ۡ᩻;->᩹:Ll/ۗܺ᩷;

    invoke-static {v0, p1}, Ll/ۛ᩸ۡ;->֫(Ll/ۗܺ᩷;Ll/ۗ᩻᩻;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    return-void

    .line 283
    :cond_1
    new-instance v1, Ll/ܰۡ᩻;

    invoke-direct {v1, v0, p1}, Ll/ܰۡ᩻;-><init>(Ll/ۗܺ᩷;Ll/֫ܺ᩻;)V

    .line 377
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
