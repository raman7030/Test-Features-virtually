.class public final synthetic Ll/ۤ᩻ۢ;
.super Ljava/lang/Object;
.source "51KR"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܽۜۢ;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۜۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ᩻ۢ;->᩸:Ll/ܽۜۢ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 319
    iget-object p1, p0, Ll/ۤ᩻ۢ;->᩸:Ll/ܽۜۢ;

    invoke-virtual {p1}, Ll/ܽۜۢ;->֨()Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܿۛ᩷;

    .line 320
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 321
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    .line 322
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    const/4 p1, 0x1

    return p1
.end method
