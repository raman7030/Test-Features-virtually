.class public final synthetic Ll/֡֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡֨ᩳ;->᩸:Ll/᩹ܶᩳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 402
    iget-object p1, p0, Ll/֡֨ᩳ;->᩸:Ll/᩹ܶᩳ;

    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p2

    check-cast p2, Ll/ܽ֨ᩳ;

    .line 2977
    invoke-virtual {p2, p1}, Ll/ܽ֨ᩳ;->֫(Ll/᩹ܶᩳ;)V

    return-void
.end method
