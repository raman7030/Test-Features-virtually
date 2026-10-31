.class public final Ll/֨ۖ;
.super Ljava/lang/Object;
.source "95GJ"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic ᩸:Ll/᩸ۖ;


# direct methods
.method public constructor <init>(Ll/᩸ۖ;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۖ;->᩸:Ll/᩸ۖ;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    .line 128
    iget-object v0, p0, Ll/֨ۖ;->᩸:Ll/᩸ۖ;

    iget-object v1, v0, Ll/᩸ۖ;->ᩳ:Ll/۠ۖ;

    if-eqz v1, :cond_0

    .line 129
    invoke-interface {v1, v0}, Ll/۠ۖ;->֫(Ll/᩸ۖ;)V

    :cond_0
    return-void
.end method
