.class public final synthetic Ll/ۛۗ᩻;
.super Ljava/lang/Object;
.source "D7B1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ۧ۬᩻;

.field public final synthetic ᩹:Ll/᩷ۨ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/ۧ۬᩻;Ll/᩷ۨ᩻;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۗ᩻;->᩸:Ll/ۧ۬᩻;

    iput-object p2, p0, Ll/ۛۗ᩻;->᩹:Ll/᩷ۨ᩻;

    iput-object p3, p0, Ll/ۛۗ᩻;->᩶:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 248
    new-instance p1, Ll/᩺ۗ᩻;

    iget-object p2, p0, Ll/ۛۗ᩻;->᩸:Ll/ۧ۬᩻;

    iget-object v0, p0, Ll/ۛۗ᩻;->᩹:Ll/᩷ۨ᩻;

    iget-object v1, p0, Ll/ۛۗ᩻;->᩶:Ll/֡ۚۢ;

    invoke-direct {p1, p2, v0, v1}, Ll/᩺ۗ᩻;-><init>(Ll/ۧ۬᩻;Ll/᩷ۨ᩻;Ll/֡ۚۢ;)V

    .line 274
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
