.class public final synthetic Ll/ܿۘ᩻;
.super Ljava/lang/Object;
.source "27JL"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ܿۘ᩻;->᩸:Ll/ۗܺ᩷;

    iput-object p1, p0, Ll/ܿۘ᩻;->᩹:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 246
    new-instance v0, Ll/ۢۘ᩻;

    iget-object v1, p0, Ll/ܿۘ᩻;->᩸:Ll/ۗܺ᩷;

    iget-object v2, p0, Ll/ܿۘ᩻;->᩹:Landroid/widget/EditText;

    invoke-direct {v0, v1, p1, v2}, Ll/ۢۘ᩻;-><init>(Ll/ۗܺ᩷;Ljava/lang/String;Landroid/widget/EditText;)V

    .line 276
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    :cond_0
    return-void
.end method
