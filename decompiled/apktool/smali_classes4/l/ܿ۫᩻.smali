.class public final synthetic Ll/ܿ۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۫᩻;->᩸:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 373
    sget p1, Ll/᩸ۛ᩻;->֫:I

    .line 194
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "amfbc"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 196
    invoke-static {p1}, Ll/᩸ۛ᩻;->֫(I)I

    move-result p1

    .line 373
    new-instance v0, Ll/֡۫᩻;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 372
    iget-object v1, p0, Ll/ܿ۫᩻;->᩸:Ll/ۗܺ᩷;

    invoke-static {v1, p1, v0}, Ll/۬ۤ᩻;->֫(Ll/ۗܺ᩷;ILl/֡۫᩻;)V

    return-void
.end method
